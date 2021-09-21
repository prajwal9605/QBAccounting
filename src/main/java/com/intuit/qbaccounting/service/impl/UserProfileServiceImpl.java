package com.intuit.qbaccounting.service.impl;

import com.intuit.qbaccounting.dto.ProfileRequestDto;
import com.intuit.qbaccounting.service.UserProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author prajwal.kulkarni on 20/09/21
 */

@Slf4j
@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public boolean validateUpdate(ProfileRequestDto profileRequestDto) {
        log.info("Update request received!");
        return true;
    }
}
