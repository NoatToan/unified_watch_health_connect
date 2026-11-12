package com.google.android.gms.common.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzu {

    @Nullable
    private final String a;
    private final String b;
    private final int c;
    private final boolean d;

    public zzu(String str, @Nullable String str2, boolean z, int i, boolean z2) {
        this.b = str;
        this.a = str2;
        this.c = i;
        this.d = z2;
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }
}
