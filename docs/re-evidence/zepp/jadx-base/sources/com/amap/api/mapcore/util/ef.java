package com.amap.api.mapcore.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ef extends fc<a> {
    private a b;

    public static final class a extends fd<a> {
        public ByteBuffer a;
        public ShortBuffer b;
        public FloatBuffer c;
        public IntBuffer d;
        public int e;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T extends com.amap.api.mapcore.util.fd<?>, T extends com.amap.api.mapcore.util.fd<T>] */
    private a b(int i) {
        a aVar = (a) this.a;
        if (aVar == null) {
            aVar = new a();
        } else {
            this.a = aVar.f;
            aVar.f = null;
        }
        if (aVar.e < i) {
            if (i < 32768) {
                i = 32768;
            }
            aVar.a = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            aVar.e = i;
            aVar.b = null;
            aVar.d = null;
            aVar.c = null;
        }
        a aVar2 = this.b;
        if (aVar.f != 0) {
            throw new IllegalArgumentException("'item' is a list");
        }
        aVar.f = aVar2;
        this.b = aVar;
        return aVar;
    }

    public final void a() {
        a(this.b);
        this.b = null;
    }

    public final FloatBuffer a(int i) {
        a aVarB = b(i * 4);
        FloatBuffer floatBuffer = aVarB.c;
        if (floatBuffer == null) {
            aVarB.a.clear();
            aVarB.c = aVarB.a.asFloatBuffer();
        } else {
            floatBuffer.clear();
        }
        aVarB.c.clear();
        return aVarB.c;
    }

    public final ShortBuffer b() {
        a aVarB = b(60000);
        ShortBuffer shortBuffer = aVarB.b;
        if (shortBuffer == null) {
            aVarB.a.clear();
            aVarB.b = aVarB.a.asShortBuffer();
        } else {
            shortBuffer.clear();
        }
        return aVarB.b;
    }
}
