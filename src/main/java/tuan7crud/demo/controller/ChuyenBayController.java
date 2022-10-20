package tuan7crud.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import tuan7crud.demo.entity.ChuyenBay;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
	String url = "http://localhost:6868/chuyenbay";

	@GetMapping("/{maCB}")
	public ChuyenBay getCB(@PathVariable String maCB) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ChuyenBay> response = restTemplate.getForEntity(url + "/" + maCB, ChuyenBay.class);
		return response.getBody();
	}

	@GetMapping("/")
	public ChuyenBay[] getAllCB() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ChuyenBay[]> response = restTemplate.getForEntity(url, ChuyenBay[].class);
		ChuyenBay[] chuyenbays = response.getBody();
		return chuyenbays;
	}

	@DeleteMapping("/{ChuyenBayId}")
	public String deleteChuyenBay(@PathVariable String ChuyenBayId) {
		RestTemplate restTemplate = new RestTemplate();
		Map<String, String> params = new HashMap<String, String>();
		params.put("maCB", ChuyenBayId);
		restTemplate.delete(url + "/" + ChuyenBayId, params);
		return "Xóa Thành Công";
	}

	

	@PostMapping("")
	public String createChuyenBay(@RequestBody ChuyenBay chuyenBay) {
//		ChuyenBay chuyenBay2 = new ChuyenBay(chuyenBay.getMaCB(), , url, 0, null, null, 0)
		RestTemplate restTemplate = new RestTemplate();
		ChuyenBay response = restTemplate.postForObject(url, chuyenBay, ChuyenBay.class);
		return "theem thafnh cong";

	}

}
