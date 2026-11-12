package com.huami.passport.data.net;

import com.huami.passport.data.entity.ErrorEntity;
import com.huami.passport.data.entity.TokenEntity;

/* JADX INFO: loaded from: classes12.dex */
public interface AccountRestApi {
    public static final String API_AUTHORIZATION_URL = "v1/client/authorization/{appName}/token";

    ApiResponse<TokenEntity, ErrorEntity> authorize(String str, String str2, boolean z, String str3, String str4);
}
