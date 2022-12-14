package com.example.managespending.data.remotes.service;

import com.example.managespending.data.models.dto.base.BaseDTO;
import com.example.managespending.data.models.dto.base.ResponseDTO;

public interface AccountService {


    ResponseDTO<BaseDTO> create(BaseDTO baseDTO);

    ResponseDTO<BaseDTO> signIn(BaseDTO baseDTO);

    ResponseDTO<BaseDTO> changePassword(BaseDTO baseDTO);
}
