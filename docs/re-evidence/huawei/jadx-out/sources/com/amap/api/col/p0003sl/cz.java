package com.amap.api.col.p0003sl;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class cz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f2340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f2341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2342c;
    int d;
    String e;
    String f;
    String g;

    public cz(int i, int[] iArr, String str, String str2, String str3) {
        this.f2340a = i;
        this.f2341b = iArr;
        this.e = str;
        this.f = str2;
        this.g = str3;
        str = TextUtils.isEmpty(str) ? str2 : str;
        this.f2342c = -1000;
        if ("regions".equals(str)) {
            this.f2342c = 1001;
        } else if ("water".equals(str)) {
            this.f2342c = 1002;
        } else if ("buildings".equals(str)) {
            this.f2342c = 1003;
        } else if ("roads".equals(str)) {
            this.f2342c = 1004;
        } else if ("labels".equals(str)) {
            this.f2342c = 1005;
        } else if ("borders".equals(str)) {
            this.f2342c = 1006;
        }
        this.d = (i * 1000) + iArr.hashCode();
    }
}
