package com.huawei.openalliance.ad;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* JADX INFO: loaded from: classes41.dex */
public class eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg f18684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EGLSurface f18685b;

    public void e() {
        this.f18684a.a(this.f18685b);
        this.f18685b = EGL14.EGL_NO_SURFACE;
    }

    public void d() {
        this.f18684a.c(this.f18685b);
    }

    public void c() {
        this.f18684a.b(this.f18685b);
    }

    public int b() {
        return this.f18684a.a(this.f18685b, 12374);
    }

    public int a() {
        return this.f18684a.a(this.f18685b, 12375);
    }

    public eh(eg egVar, Surface surface) {
        this.f18684a = egVar;
        this.f18685b = egVar.a(surface);
    }
}
