package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 通知记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-03-27 15:44:15
 */
@TableName("tongzhijilu")
public class TongzhijiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TongzhijiluEntity() {
		
	}
	
	public TongzhijiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 关联就诊通知id
	 */
					
	private Long tongzhiid;
	
	/**
	 * 通知编号
	 */
					
	private String tongzhibianhao;
	
	/**
	 * 发送时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date sendtime;
	
	/**
	 * 发送状态：0-失败，1-成功
	 */
					
	private Integer sendstatus;
	
	/**
	 * 失败原因
	 */
					
	private String failreason;
	
	/**
	 * 操作人
	 */
					
	private String operator;
	

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：关联就诊通知id
	 */
	public void setTongzhiid(Long tongzhiid) {
		this.tongzhiid = tongzhiid;
	}
	/**
	 * 获取：关联就诊通知id
	 */
	public Long getTongzhiid() {
		return tongzhiid;
	}
	/**
	 * 设置：通知编号
	 */
	public void setTongzhibianhao(String tongzhibianhao) {
		this.tongzhibianhao = tongzhibianhao;
	}
	/**
	 * 获取：通知编号
	 */
	public String getTongzhibianhao() {
		return tongzhibianhao;
	}
	/**
	 * 设置：发送时间
	 */
	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}
	/**
	 * 获取：发送时间
	 */
	public Date getSendtime() {
		return sendtime;
	}
	/**
	 * 设置：发送状态：0-失败，1-成功
	 */
	public void setSendstatus(Integer sendstatus) {
		this.sendstatus = sendstatus;
	}
	/**
	 * 获取：发送状态：0-失败，1-成功
	 */
	public Integer getSendstatus() {
		return sendstatus;
	}
	/**
	 * 设置：失败原因
	 */
	public void setFailreason(String failreason) {
		this.failreason = failreason;
	}
	/**
	 * 获取：失败原因
	 */
	public String getFailreason() {
		return failreason;
	}
	/**
	 * 设置：操作人
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}
	/**
	 * 获取：操作人
	 */
	public String getOperator() {
		return operator;
	}

}
