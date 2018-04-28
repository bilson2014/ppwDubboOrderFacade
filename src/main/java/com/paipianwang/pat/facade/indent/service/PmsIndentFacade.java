package com.paipianwang.pat.facade.indent.service;

import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.indent.entity.PmsIndent;

/**
 * 订单Dubbo服务接口
 * 
 * @author Jack
 * @version 1.0
 *
 */
public interface PmsIndentFacade {

	/**
	 * DataGride 查询订单列表(含条件)
	 */
	public DataGrid<PmsIndent> listWithPagination(PageParam pageParam, Map<String, Object> paramMap);

	/**
	 * 添加一条订单
	 */
	public long save(PmsIndent pmsIndent);

	/**
	 * 更新一条订单
	 */
	public long update(PmsIndent pmsIndent);

	/**
	 * 根据ids数组删除订单
	 */
	public long delIndentByIds(long[] ids);

	/**
	 * 批量修改订单状态
	 * 
	 * @param ids
	 *            ID数组
	 * @param indentType
	 *            订单状态值 0:新订单 1:处理中 2:完成 3:停滞
	 * @return
	 */
	public boolean changeIndentsType(long[] ids, int indentType);

	/**
	 * 条件查询list
	 * 
	 * @param paramMap
	 *            条件
	 */
	public List<PmsIndent> listWithCondition(Map<String, Object> paramMap);

	/**
	 * 前端下单
	 */
	public boolean saveOrder(final PmsIndent indent);

	/**
	 * 检测新订单个数
	 */
	public long checkStatus(final int status);

	/**
	 * 更新成本计算器订单
	 */
	public long updateForCalculate(PmsIndent indent);

	/**
	 * 查询某人订单总数
	 * 
	 * @param salesmanUniqueId
	 * @param indentType
	 *            某人唯一标识
	 */
	public long countBySalesmanUniqueId(String salesmanUniqueId,List<Integer> indentType);

	/**
	 * 查询某人订单总金额
	 * 
	 * @param salesmanUniqueId
	 * @param indentType
	 *            某人唯一标识
	 */
	public Double sumPriceBySalesmanUniqueId(String salesmanUniqueId,List<Integer> indentType);

	/**
	 * 更新订单客服
	 * 
	 * @param indent
	 * @return
	 */
	public long updateCustomerService(PmsIndent indent);

	/**
	 * 查询指定ID订单记录
	 * 
	 * @param id
	 * @return
	 */
	public PmsIndent findIndentById(long id);

	/**
	 * 根基需求文档查找订单
	 * 
	 * @param id
	 * @return
	 */
	public PmsIndent findIndentByRequireId(long id);

	/**
	 * 管家驳回订单
	 * 
	 * @param indentId
	 * @return
	 */
	public long rejected(PmsIndent indent);

}
