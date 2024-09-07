package com.entity.view;

import com.entity.ShequguanliyuanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 社区管理员
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shequguanliyuan")
public class ShequguanliyuanView extends ShequguanliyuanEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 职位的值
		*/
		private String zhiweiValue;
		/**
		* 所属社区的值
		*/
		private String shequValue;



	public ShequguanliyuanView() {

	}

	public ShequguanliyuanView(ShequguanliyuanEntity shequguanliyuanEntity) {
		try {
			BeanUtils.copyProperties(this, shequguanliyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getSexValue() {
				return sexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
			}
			/**
			* 获取： 职位的值
			*/
			public String getZhiweiValue() {
				return zhiweiValue;
			}
			/**
			* 设置： 职位的值
			*/
			public void setZhiweiValue(String zhiweiValue) {
				this.zhiweiValue = zhiweiValue;
			}
			/**
			* 获取： 所属社区的值
			*/
			public String getShequValue() {
				return shequValue;
			}
			/**
			* 设置： 所属社区的值
			*/
			public void setShequValue(String shequValue) {
				this.shequValue = shequValue;
			}














}
