package tuan7crud.demo.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ChuyenBay implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String maCB;

	private String gaDi;

	private String gaDen;

	private int doDai;

	private Date gioDi;

	private Date gioDen;

	private int chiPhi;

	@Override
	public String toString() {
		return "ChuyenBay [maCB=" + maCB + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi="
				+ gioDi + ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}

}
