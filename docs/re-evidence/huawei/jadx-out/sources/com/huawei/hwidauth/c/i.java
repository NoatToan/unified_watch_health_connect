package com.huawei.hwidauth.c;

import android.content.Context;
import defpackage.nom;
import java.io.IOException;

/* JADX INFO: loaded from: classes38.dex */
public class i extends k {
    private Context e;

    public i(Context context) {
        this.e = context;
    }

    @Override // com.huawei.hwidauth.c.k
    public String a() throws IllegalStateException, IOException, IllegalArgumentException {
        return "";
    }

    @Override // com.huawei.hwidauth.c.k
    public String a_() {
        return "";
    }

    @Override // com.huawei.hwidauth.c.k
    public String b() {
        return "/oauth2/v3/x509?client_id=104589299&hms_version=" + nom.c(this.e) + "&sdkVersion=6.13.0.301";
    }

    @Override // com.huawei.hwidauth.c.k
    public String c() {
        return "";
    }
}
