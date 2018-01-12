package com.paipianwang.pat.facade.indent.entity;

/**
 * 订单来源
 */
public enum IndentSource {	
	direct_selling(5,"线下-直销"),
	offline_activity(6,"线下-活动"),
	offline_channel(7,"线下-渠道"),
	repeat(8,"复购"),
	telemarketing(4,"线上-电销"),
	website(1,"线上-网站"),
	activity(2,"线上-活动"),
	new_media(3,"线上-新媒体"),	
	_400(9,"线上-400"),
	bridge(10,"线上-商桥"),
	
	pc_banner(11,"线上-PC-首页banner"),
	pc_direct(12,"线上-PC-直接下单"),
	pc_cost(13,"线上-PC-成本计算器"),
	pc_team(14,"线上-PC-供应商首页"),
	pc_product(15,"线上-PC-作品"),
	
	phone_banner(16,"线上-移动-首页banner"),
	phone_cost(17,"线上-移动-成本计算器"),
	phone_product(18,"线上-移动-作品"),
	
	wechat_cost(19,"线上-公众号-成本计算器 "),
	wechat_direct(20,"线上-公众号-直接下单"),		
	wechat_product(21,"线上-公众号-作品"),
	
	sem_mg(22,"线上-SEM"),
	dingding(23,"线上-钉钉");
	
	private int value;//存储值
	private String name;//显示名称
	
	private IndentSource(int value,String name){
		this.value=value;
		this.name=name;
	}
	
	public static IndentSource enumOf(Integer value) {
        for (IndentSource source : IndentSource.values()) {
            if (value == source.getValue()) {
                return source;
            }
        }
        return null;
    }

    public static IndentSource enumOf(String name) {
        for (IndentSource source : IndentSource.values()) {
            if (name == source.name()) {
                return source;
            }
        }
        return null;
    }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
