package com.jianyi.user.remote;

import com.jianyi.user.api.model.UserInfo;
import com.jianyi.user.api.remote.UserInfoApiRemote;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoApiRemoteImpl implements UserInfoApiRemote {

    public UserInfo getByUserId(String userId) {
        return new UserInfo().setUserId(userId).setPhone("188888888");
    }
}
