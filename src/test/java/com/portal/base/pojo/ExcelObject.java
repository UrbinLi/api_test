package com.portal.base.pojo;

/**
 * 描述任意表单任意一行的抽象类
 * 
 * @author v_wbxingli
 *
 */
public class ExcelObject {
	
	// 行号
	private int rowNo;

	public int getRowNo() {
		return rowNo;
	}

	public void setRowNo(int rowNo) {
		this.rowNo = rowNo;
	}

	@Override
	public String toString() {
		return "ExcelObject [rowNo=" + rowNo + "]";
	}

}
