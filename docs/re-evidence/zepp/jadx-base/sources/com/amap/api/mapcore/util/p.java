package com.amap.api.mapcore.util;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public List<Float> a;
    public List<Float> b;
    private FloatBuffer c;
    private FloatBuffer d;
    private int e = 0;
    private float f;
    private float g;
    private float h;

    public p(List<Float> list, List<Float> list2) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        float fMax = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.a = list;
        this.b = list2;
        if (this.c == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(list.size() * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            this.c = byteBufferAllocateDirect.asFloatBuffer();
        }
        this.c.clear();
        float fMax2 = 0.0f;
        float fMax3 = 0.0f;
        float fMin = 1000000.0f;
        float fMin2 = 1000000.0f;
        int i = 1;
        for (int i2 = 1; i2 < list.size() + 1; i2++) {
            Float f = list.get(i2 - 1);
            this.c.put(f.floatValue());
            if (i == 1) {
                fMax = Math.max(f.floatValue(), fMax);
                fMin = Math.min(f.floatValue(), fMin);
            }
            if (i == 2) {
                fMax2 = Math.max(f.floatValue(), fMax2);
                fMin2 = Math.min(f.floatValue(), fMin2);
            }
            if (i == 3) {
                fMax3 = Math.max(fMax3, f.floatValue());
                i = 0;
            }
            i++;
        }
        float fAbs = Math.abs(fMax - fMin);
        float fAbs2 = Math.abs(fMax2 - fMin2);
        this.g = fAbs > fAbs2 ? fAbs : fAbs2;
        this.h = fAbs > fAbs2 ? fAbs2 : fAbs;
        this.c.position(0);
        if (this.d == null) {
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(list2.size() * 4);
            byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
            this.d = byteBufferAllocateDirect2.asFloatBuffer();
        }
        this.d.clear();
        Iterator<Float> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.d.put(it2.next().floatValue());
        }
        this.d.position(0);
    }

    public final float a() {
        return this.g;
    }

    public final float b() {
        return this.h;
    }

    public final void c() {
        this.a.clear();
        this.d.clear();
    }

    public final void a(int i) {
        this.e = i;
    }

    public final void a(float f) {
        this.f = -f;
    }

    public final void a(df.b bVar, float[] fArr) {
        Matrix.rotateM(fArr, 0, this.f, 0.0f, 0.0f, 1.0f);
        GLES20.glUseProgram(bVar.d);
        GLES20.glClear(256);
        GLES20.glEnable(2929);
        GLES20.glDepthMask(true);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glBlendColor(1.0f, 1.0f, 1.0f, 1.0f);
        GLES20.glBindTexture(3553, this.e);
        GLES20.glEnableVertexAttribArray(bVar.h);
        GLES20.glVertexAttribPointer(bVar.h, 2, 5126, false, 8, (Buffer) this.d);
        GLES20.glEnableVertexAttribArray(bVar.c);
        GLES20.glVertexAttribPointer(bVar.c, 3, 5126, false, 12, (Buffer) this.c);
        GLES20.glUniformMatrix4fv(bVar.g, 1, false, fArr, 0);
        GLES20.glDrawArrays(4, 0, this.a.size() / 3);
        GLES20.glBindTexture(3553, 0);
        GLES20.glDisable(2929);
        GLES20.glDisableVertexAttribArray(bVar.c);
        GLES20.glDisableVertexAttribArray(bVar.h);
        GLES20.glUseProgram(0);
    }
}
