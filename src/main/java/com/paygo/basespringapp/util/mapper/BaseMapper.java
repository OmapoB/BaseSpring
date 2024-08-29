package com.paygo.basespringapp.util.mapper;

import com.paygo.basespringapp.dto.BaseDto;
import com.paygo.basespringapp.entity.Base;
import org.springframework.stereotype.Component;

@Component
public class BaseMapper {

    public Base toEntity(BaseDto dto) {
        Base entity = new Base();
        if (dto.id() != null) {
            entity.setId(dto.id());
        }
        return entity;
    }

    public BaseDto toDto(Base entity) {
        return new BaseDto(entity.getId());
    }
}
