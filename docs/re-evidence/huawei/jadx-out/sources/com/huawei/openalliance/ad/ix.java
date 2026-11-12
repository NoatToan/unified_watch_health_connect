package com.huawei.openalliance.ad;

import android.content.Context;

/* JADX INFO: loaded from: classes41.dex */
public class ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f19289a = "ix";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19291c;
    private ii d;
    private Context e;

    public boolean a(String str, String str2) {
        if (1 == this.f19291c || com.huawei.openalliance.ad.utils.dg.b(this.f19290b) || com.huawei.openalliance.ad.utils.du.a(this.e, str2, this.f19290b)) {
            return true;
        }
        hw.b(f19289a, "check sha256 failed! file path is : " + str2);
        this.d.b(str);
        return false;
    }

    public ix(Context context, String str, ii iiVar, int i) {
        this.f19290b = str;
        this.f19291c = i;
        this.d = iiVar;
        this.e = context.getApplicationContext();
    }
}
