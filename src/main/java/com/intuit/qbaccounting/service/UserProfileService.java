package com.intuit.qbaccounting.service;

import com.intuit.qbaccounting.dto.ProfileRequestDto;

/**
 * @author prajwal.kulkarni on 20/09/21
 */
public interface UserProfileService {

    boolean validateUpdate(ProfileRequestDto profileRequestDto);
}
