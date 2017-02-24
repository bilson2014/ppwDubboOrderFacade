package com.paipianwang.pat.facade.indent.entity;

import com.paipianwang.pat.common.entity.BaseEntity;

/**
 * 订单业务实体类
 * @author Jack
 * @version 1.0
 *
 */
public class PmsIndent extends BaseEntity {
	private static final long serialVersionUID = -3318289705685043573L;
	
	/** 订单名称 **/
	private String indentName = null; 
	
	/** 订单编号 **/
	private String indentNum = null; 
	
	/** 0:新订单 1:处理中 2:完成 3:停滞 **/
	private int indentType;
	
	private Long serviceId = null;
	
	private String orderDate = null;
	
	private Long userId = null;
	
	/** 订单金额 **/
	private double indentPrice = 0.0;
	
	/** 产品ID **/
	private long productId = 0l;
	
	/** 所属团队ID **/
	private long teamId = 0l;
	
	/** 视频分钟数 **/
	private long second = 0l;
	
	/** 订单-联系电话 **/
	private String indent_tele = null;
	
	/** 订单备注**/
	private String indent_recomment = null;
	
	/** CRM备注**/
	private String indent_description = null;
	
	/** 分销人唯一编号 **/
	private String salesmanUniqueId = null; 
	
	/** 订单给业务人员发短信 **/
	private Boolean sendToStaff = true;
	
	/** 订单给客户发短信 **/
	private Boolean sendToUser = true;
	
	/** 分销人名字**/
	private String salesmanName = null;
	
	public String getSalesmanName() {
		return salesmanName;
	}

	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
	}

	public String getIndentName() {
		return indentName;
	}

	public void setIndentName(String indentName) {
		this.indentName = indentName;
	}

	public String getIndentNum() {
		return indentNum;
	}

	public void setIndentNum(String indentNum) {
		this.indentNum = indentNum;
	}

	public int getIndentType() {
		return indentType;
	}

	public void setIndentType(int indentType) {
		this.indentType = indentType;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public double getIndentPrice() {
		return indentPrice;
	}

	public void setIndentPrice(double indentPrice) {
		this.indentPrice = indentPrice;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}

	public String getIndent_tele() {
		return indent_tele;
	}

	public void setIndent_tele(String indent_tele) {
		this.indent_tele = indent_tele;
	}

	public String getIndent_recomment() {
		return indent_recomment;
	}

	public void setIndent_recomment(String indent_recomment) {
		this.indent_recomment = indent_recomment;
	}

	public String getIndent_description() {
		return indent_description;
	}

	public void setIndent_description(String indent_description) {
		this.indent_description = indent_description;
	}

	public String getSalesmanUniqueId() {
		return salesmanUniqueId;
	}

	public void setSalesmanUniqueId(String salesmanUniqueId) {
		this.salesmanUniqueId = salesmanUniqueId;
	}

	public Boolean getSendToStaff() {
		return sendToStaff;
	}

	public void setSendToStaff(Boolean sendToStaff) {
		this.sendToStaff = sendToStaff;
	}

	public Boolean getSendToUser() {
		return sendToUser;
	}

	public void setSendToUser(Boolean sendToUser) {
		this.sendToUser = sendToUser;
	}
}
