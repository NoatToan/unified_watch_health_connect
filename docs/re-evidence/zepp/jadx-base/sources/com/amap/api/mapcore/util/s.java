package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes2.dex */
public final class s {
    private int a = -1;
    private int b = -1;
    private int c = -1;
    private int d = 0;
    private Bitmap e = null;
    private Bitmap f = null;
    private Bitmap g = null;

    public final void a(Context context) {
        Bitmap bitmap = this.e;
        if (bitmap == null || bitmap.isRecycled()) {
            this.e = er.a(context, "amap_sdk_lineTexture.png");
        }
        Bitmap bitmap2 = this.f;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            this.f = er.a(context, "amap_sdk_lineDashTexture_square.png");
        }
        Bitmap bitmap3 = this.g;
        if (bitmap3 == null || bitmap3.isRecycled()) {
            this.g = er.a(context, "amap_sdk_lineDashTexture_circle.png");
        }
        this.a = er.a(this.e);
        this.b = er.b(this.f);
        this.c = er.b(this.g);
        this.d = er.a();
    }

    public final int b() {
        return this.d;
    }

    public final void c() {
        GLES20.glDeleteTextures(4, new int[]{this.a, this.b, this.c, this.d}, 0);
    }

    public final void d() {
        Bitmap bitmap = this.f;
        if (bitmap != null && !bitmap.isRecycled()) {
            er.c(this.f);
            this.f = null;
        }
        Bitmap bitmap2 = this.g;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            er.c(this.g);
            this.g = null;
        }
        Bitmap bitmap3 = this.e;
        if (bitmap3 == null || bitmap3.isRecycled()) {
            return;
        }
        er.c(this.e);
        this.e = null;
    }

    public final int a() {
        return this.a;
    }

    public final int a(int i) {
        if (i == 0) {
            return this.b;
        }
        if (i == 1) {
            return this.c;
        }
        return -1;
    }
}
