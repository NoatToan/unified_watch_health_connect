package com.huawei.agconnect.credential.internal;

import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.agconnect.datastore.annotation.SharedPreference;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;

/* JADX INFO: loaded from: classes22.dex */
public class CredentialInfo implements Token {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f4977a = 120000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4978b = "com.huawei.agconnect";

    @SharedPreference(crypto = AgcCrypto.class, fileName = f4978b, isDynamic = true, key = "expires")
    long expires;

    @SharedPreference(crypto = AgcCrypto.class, fileName = f4978b, isDynamic = true, key = "tokenString")
    String tokenString;

    @SharedPreference(crypto = AgcCrypto.class, fileName = f4978b, isDynamic = true, key = HwPayConstant.KEY_VALIDTIME)
    long validTime;

    @Override // com.huawei.agconnect.core.service.auth.Token
    public long getIssuedAt() {
        return 0L;
    }

    @Override // com.huawei.agconnect.core.service.auth.Token
    public long getNotBefore() {
        return 0L;
    }

    @Override // com.huawei.agconnect.core.service.auth.Token
    public String getTokenString() {
        return this.tokenString;
    }

    @Override // com.huawei.agconnect.core.service.auth.Token
    public long getExpiration() {
        return this.expires;
    }

    public boolean a() {
        return this.tokenString != null && System.currentTimeMillis() <= this.validTime;
    }

    private void a(String str, long j) {
        this.tokenString = str;
        this.expires = j;
        this.validTime = (System.currentTimeMillis() + (j * 1000)) - 120000;
    }

    public CredentialInfo(String str, long j) {
        this.validTime = 0L;
        a(str, j);
    }

    public CredentialInfo(Token token) {
        this(token.getTokenString(), token.getExpiration());
    }

    public CredentialInfo() {
        this.validTime = 0L;
    }
}
