package com.southwind.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.southwind.entity.DormitoryAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.form.RuleForm;
import com.southwind.form.SearchForm;
import com.southwind.vo.PageVO;
import com.southwind.vo.ResultVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2023-05-04
 */
public interface DormitoryAdminService extends IService<DormitoryAdmin> {
    public ResultVO login(RuleForm ruleForm);
    public PageVO list(Integer page, Integer size);
    public PageVO search(SearchForm searchForm);
}
