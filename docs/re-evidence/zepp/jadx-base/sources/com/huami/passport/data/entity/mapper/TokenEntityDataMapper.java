package com.huami.passport.data.entity.mapper;

import com.huami.passport.data.entity.TokenEntity;
import com.huami.passport.domain.model.TokenInfo;

/* JADX INFO: loaded from: classes12.dex */
public class TokenEntityDataMapper {
    public static TokenInfo transform(TokenEntity tokenEntity) {
        if (tokenEntity == null) {
            return null;
        }
        TokenInfo tokenInfo = new TokenInfo();
        tokenInfo.setUserId(tokenEntity.getUserId());
        tokenInfo.setLoginToken(tokenEntity.getLoginToken());
        tokenInfo.setAppToken(tokenEntity.getAppToken());
        tokenInfo.setTtl(tokenEntity.getTtl());
        tokenInfo.setAppTtl(tokenEntity.getAppTtl());
        tokenInfo.setRegion(tokenEntity.getRegion());
        return tokenInfo;
    }
}
