package com.whoiszxl.controller.backend;

import java.util.List;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.whoiszxl.common.Const;
import com.whoiszxl.common.ServerResponse;
import com.whoiszxl.entity.Banner;
import com.whoiszxl.service.ArticleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 管理员公共文章模块
 * @author whoiszxl
 *
 */
@Api(value="管理员公共文章模块",description="管理员公共文章模块")
@RestController
@RequestMapping("/manage/article")
public class ArticleManageController {
	
	@Autowired
	private ArticleService articleService;
	
	@PostMapping("list")
	@ApiOperation(value = "后台订单列表")
	@RequiresRoles(value={ Const.ShiroRole.ROLE_ADMIN }, logical=Logical.OR)
	public ServerResponse<List<Banner>> orderList() {
		return ServerResponse.createBySuccess(articleService.getBannerManageList(Const.Article.BANNER_LIST_COUNT));
	}
}