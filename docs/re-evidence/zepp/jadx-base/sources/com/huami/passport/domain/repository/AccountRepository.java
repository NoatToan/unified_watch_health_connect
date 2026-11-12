package com.huami.passport.domain.repository;

import com.huami.passport.domain.AccountCallback;
import com.huami.passport.domain.model.Resource;
import com.huami.passport.domain.model.TokenInfo;

/* JADX INFO: loaded from: classes12.dex */
public interface AccountRepository {
    void authorize(String str, String str2, AccountCallback<Resource<TokenInfo, String>> accountCallback);

    void authorize(String str, String str2, boolean z, String str3, String str4, AccountCallback<Resource<TokenInfo, String>> accountCallback);
}
