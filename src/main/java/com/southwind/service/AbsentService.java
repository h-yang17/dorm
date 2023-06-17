package com.southwind.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.southwind.entity.Absent;
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
public interface AbsentService extends IService<Absent> {
    public PageVO list(Integer page, Integer size);
    public PageVO search(SearchForm searchForm);

}
