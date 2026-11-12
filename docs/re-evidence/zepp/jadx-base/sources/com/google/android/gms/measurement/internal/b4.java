package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class b4 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Object e;

    public b4(String str, String str2, String str3, long j, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(obj);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = obj;
    }
}
