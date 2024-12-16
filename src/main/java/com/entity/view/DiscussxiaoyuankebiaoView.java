package com.entity.view;

import com.entity.DiscussxiaoyuankebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园课表评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-10 14:58:40
 */
@TableName("discussxiaoyuankebiao")
public class DiscussxiaoyuankebiaoView  extends DiscussxiaoyuankebiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxiaoyuankebiaoView(){
	}
 
 	public DiscussxiaoyuankebiaoView(DiscussxiaoyuankebiaoEntity discussxiaoyuankebiaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussxiaoyuankebiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
