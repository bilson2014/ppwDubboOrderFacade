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
	
	private long indentId = 0l; // 订单编号
	
	private String service_name = null; 
	
	private double service_price = 0.0d;
	
	private double service_discount = 0.0d;
	
	private double service_realPrice = 0.0d;

	private String product_name = null;
	
	private String team_name = null;
	
	private String user_name = null;
	
	private String telephone = null;
	
	private String user_email = null;
	
	private long[] ids;//订单数组
	
	private String token = null;
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

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

	public long getIndentId() {
		return indentId;
	}

	public void setIndentId(long indentId) {
		this.indentId = indentId;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public double getService_price() {
		return service_price;
	}

	public void setService_price(double service_price) {
		this.service_price = service_price;
	}

	public double getService_discount() {
		return service_discount;
	}

	public void setService_discount(double service_discount) {
		this.service_discount = service_discount;
	}

	public double getService_realPrice() {
		return service_realPrice;
	}

	public void setService_realPrice(double service_realPrice) {
		this.service_realPrice = service_realPrice;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public long[] getIds() {
		return ids;
	}

	public void setIds(long[] ids) {
		this.ids = ids;
	}
}
