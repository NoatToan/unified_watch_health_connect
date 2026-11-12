package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.config.AesDecrypt;
import com.huawei.agconnect.config.IDecrypt;

/* JADX INFO: loaded from: classes3.dex */
public class FixedDecrypt implements AesDecrypt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IDecrypt f4944c;

    @Override // com.huawei.agconnect.config.AesDecrypt
    public IDecrypt decryptComponent() {
        return new DecryptLocalResource(new AesParam(ResourcesUtils.a(this.f4942a, this.f4943b, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), ResourcesUtils.a(this.f4942a, this.f4943b, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), ResourcesUtils.a(this.f4942a, this.f4943b, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), ResourcesUtils.a(this.f4942a, this.f4943b, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1", 5000));
    }

    @Override // com.huawei.agconnect.config.AesDecrypt
    public String decrypt(String str, String str2) {
        if (this.f4944c == null) {
            this.f4944c = decryptComponent();
        }
        return this.f4944c.decrypt(ResourcesUtils.a(this.f4942a, this.f4943b, "agc_", str), str2);
    }

    public FixedDecrypt(Context context, String str) {
        Log.d("AGC_FixedDecrypt", "init");
        this.f4942a = context;
        this.f4943b = str;
    }
}
