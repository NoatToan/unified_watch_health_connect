package com.huawei.openalliance.ad;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes41.dex */
public class ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f18686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f18687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FloatBuffer f18688c;
    private static final FloatBuffer d;
    private final FloatBuffer e = f18688c;
    private final FloatBuffer f = d;
    private final int g = 2;
    private final int h = f18686a.length / 2;

    int d() {
        return 8;
    }

    int e() {
        return 8;
    }

    int f() {
        return 2;
    }

    int c() {
        return this.h;
    }

    FloatBuffer b() {
        return this.f;
    }

    FloatBuffer a() {
        return this.e;
    }

    private static FloatBuffer a(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    static {
        float[] fArr = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        f18686a = fArr;
        float[] fArr2 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        f18687b = fArr2;
        f18688c = a(fArr);
        d = a(fArr2);
    }
}
