package com.twelvet.system.api.domain;

import com.twelvet.framework.core.application.domain.BaseEntity;
import com.twelvet.framework.utils.annotation.excel.Excel;
import com.twelvet.framework.utils.annotation.excel.Excel.ColumnType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.io.Serial;

@Schema(description = "字典表")
public class SysDictType extends BaseEntity {

	@Serial
	private static final long serialVersionUID = 1L;

	/**
	 * 字典主键
	 */
	@Schema(description = "字典主键")
	@Excel(name = "字典主键", cellType = ColumnType.NUMERIC)
	private Long dictId;

	/**
	 * 字典名称
	 */
	@Schema(description = "字典名称")
	@Excel(name = "字典名称")
	private String dictName;

	/**
	 * 字典类型
	 */
	@Schema(description = "字典类型")
	@Excel(name = "字典类型")
	private String dictType;

	/**
	 * 状态（0正常 1停用）
	 */
	@Schema(description = "状态")
	@Excel(name = "状态", readConverterExp = "1=正常,0=停用")
	private String status;

	public Long getDictId() {
		return dictId;
	}

	public void setDictId(Long dictId) {
		this.dictId = dictId;
	}

	@NotBlank(message = "字典名称不能为空")
	@Size(max = 100, message = "字典类型名称长度不能超过100个字符")
	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}

	@NotBlank(message = "字典类型不能为空")
	@Size(max = 100, message = "字典类型类型长度不能超过100个字符")
	public String getDictType() {
		return dictType;
	}

	public void setDictType(String dictType) {
		this.dictType = dictType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dictId", getDictId())
				.append("dictName", getDictName()).append("dictType", getDictType()).append("status", getStatus())
				.append("createBy", getCreateBy()).append("createTime", getCreateTime())
				.append("updateBy", getUpdateBy()).append("updateTime", getUpdateTime()).append("remark", getRemark())
				.toString();
	}

}