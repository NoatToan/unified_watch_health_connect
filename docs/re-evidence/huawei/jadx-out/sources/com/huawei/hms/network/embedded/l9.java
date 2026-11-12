package com.huawei.hms.network.embedded;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class l9 extends w7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f15063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15064c;
    public final db d;

    @Override // com.huawei.hms.network.embedded.w7
    public db x() {
        return this.d;
    }

    @Override // com.huawei.hms.network.embedded.w7
    public o7 w() {
        String str = this.f15063b;
        if (str != null) {
            return o7.b(str);
        }
        return null;
    }

    @Override // com.huawei.hms.network.embedded.w7
    public long v() {
        return this.f15064c;
    }

    public l9(@Nullable String str, long j, db dbVar) {
        this.f15063b = str;
        this.f15064c = j;
        this.d = dbVar;
    }
}
