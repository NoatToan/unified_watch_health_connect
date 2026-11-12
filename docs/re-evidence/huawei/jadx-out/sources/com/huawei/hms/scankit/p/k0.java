package com.huawei.hms.scankit.p;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes34.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f16175b;

    public k0(int i, Rect rect) {
        this.f16174a = i;
        this.f16175b = new Rect(rect);
    }

    public int a() {
        return this.f16174a;
    }

    public Rect b() {
        return this.f16175b;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f16176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16177b;

        public a(Rect rect, int i) {
            this.f16176a = rect;
            this.f16177b = i;
        }
    }
}
