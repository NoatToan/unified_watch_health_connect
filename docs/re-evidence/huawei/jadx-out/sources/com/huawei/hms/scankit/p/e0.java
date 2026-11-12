package com.huawei.hms.scankit.p;

import android.graphics.Point;

/* JADX INFO: loaded from: classes34.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16060c;
    private Point d;
    private int e;
    private boolean f;
    private boolean g;

    private e0(int i, int i2, int i3, String str, Point point, boolean z) {
        this.f16058a = i;
        this.f16059b = i2;
        this.e = i3;
        this.f16060c = str;
        this.d = point;
        this.f = z;
    }

    public int b() {
        return this.f16058a;
    }

    public int c() {
        return this.f16059b;
    }

    public String f() {
        return this.f16060c;
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public Point a() {
        return this.d;
    }

    public static class b {
        private Point e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16061a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16062b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16063c = 0;
        private String d = "off";
        private boolean f = true;
        private boolean g = false;

        public b b(int i) {
            this.f16063c = i;
            return this;
        }

        public b a(Point point) {
            this.e = point;
            return this;
        }

        public b b(boolean z) {
            this.f = z;
            return this;
        }

        public b a(boolean z) {
            this.g = z;
            return this;
        }

        public b a(int i) {
            this.f16062b = i;
            return this;
        }

        public e0 a() {
            return new e0(this.f16061a, this.f16062b, this.f16063c, this.d, this.e, this.f).a(this.g);
        }
    }

    public void a(Point point) {
        this.d = point;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e0 a(boolean z) {
        this.g = z;
        return this;
    }

    public void a(int i) {
        this.e = i;
    }
}
