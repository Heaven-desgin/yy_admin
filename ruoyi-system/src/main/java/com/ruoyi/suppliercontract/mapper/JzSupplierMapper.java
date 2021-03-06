package com.ruoyi.suppliercontract.mapper;

import com.ruoyi.suppliercontract.domain.JzSupplier;
import java.util.List;

/**
 * 供应商Mapper接口
 * 
 * @author ruoyi
 * @date 2019-12-17
 */
public interface JzSupplierMapper 
{
    /**
     * 查询供应商
     * 
     * @param supplierId 供应商ID
     * @return 供应商
     */
    public JzSupplier selectJzSupplierById(Long supplierId);

    /**
     * 查询供应商列表
     * 
     * @param jzSupplier 供应商
     * @return 供应商集合
     */
    public List<JzSupplier> selectJzSupplierList(JzSupplier jzSupplier);

    /**
     * 新增供应商
     * 
     * @param jzSupplier 供应商
     * @return 结果
     */
    public int insertJzSupplier(JzSupplier jzSupplier);

    /**
     * 修改供应商
     * 
     * @param jzSupplier 供应商
     * @return 结果
     */
    public int updateJzSupplier(JzSupplier jzSupplier);

    /**
     * 删除供应商
     * 
     * @param supplierId 供应商ID
     * @return 结果
     */
    public int deleteJzSupplierById(Long supplierId);

    /**
     * 批量删除供应商
     * 
     * @param supplierIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteJzSupplierByIds(String[] supplierIds);
    /**
     *
     */
    public List<JzSupplier> supList();
}
