package com.huawei.openalliance.ad.views.gif;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes12.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f21234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Bitmap f21235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f21236c;

    public String toString() {
        return "GifFrame{frameIndex=" + this.f21234a + ", delay=" + this.f21236c + '}';
    }

    c a() {
        c cVar = new c();
        cVar.f21234a = this.f21234a;
        cVar.f21236c = this.f21236c;
        return cVar;
    }

    c(int i, Bitmap bitmap, int i2) {
        this.f21234a = i;
        this.f21235b = bitmap;
        this.f21236c = i2;
    }

    c() {
    }
}
