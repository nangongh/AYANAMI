package com.whoiszxl.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.whoiszxl.product.mapper.MallPrefMapper;
import com.whoiszxl.product.entity.MallPref;
import com.whoiszxl.product.service.MallPrefService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2020-03-20
 */
@Slf4j
@Service
@Transactional
public class MallPrefServiceImpl extends ServiceImpl<MallPrefMapper, MallPref> implements MallPrefService {

}
