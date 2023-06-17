package com.southwind.mapper;

import com.southwind.entity.Dormitory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2023-05-04
 */
@Repository
public interface DormitoryMapper extends BaseMapper<Dormitory> {
    public void subAvailable(Integer id);
    public void addAvailable(Integer id);
    public Integer findAvailableDormitoryId();
}
