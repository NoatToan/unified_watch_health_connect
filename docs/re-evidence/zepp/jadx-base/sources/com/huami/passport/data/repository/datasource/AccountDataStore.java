package com.huami.passport.data.repository.datasource;

import com.huami.passport.data.entity.TokenEntity;

/* JADX INFO: loaded from: classes12.dex */
public interface AccountDataStore {
    String getLoginToken();

    TokenEntity getTokenEntity();

    boolean putTokenEntity(TokenEntity tokenEntity);
}
