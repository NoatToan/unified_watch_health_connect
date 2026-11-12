package com.amap.api.col.p0003sl;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes4.dex */
public class ct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2325c;
    private boolean d;

    public final void a() {
        int i = this.f2323a;
        if (i >= 0) {
            GLES20.glDeleteProgram(i);
        }
        int i2 = this.f2324b;
        if (i2 >= 0) {
            GLES20.glDeleteShader(i2);
        }
        int i3 = this.f2325c;
        if (i3 >= 0) {
            GLES20.glDeleteShader(i3);
        }
        this.d = true;
    }
}
