package org.tensorflow.lite;

import defpackage.py5;
import defpackage.rfd;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NativeInterpreterWrapper f29585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f29586b;

    /* JADX INFO: renamed from: org.tensorflow.lite.a$a, reason: collision with other inner class name */
    public static class C1067a extends rfd {
        public Boolean d;
        public Boolean e;
        public Boolean f;
        public final List<py5> g = new ArrayList();

        public C1067a b(int i) {
            super.a(i);
            return this;
        }
    }

    public a(ByteBuffer byteBuffer) {
        this(byteBuffer, null);
    }

    public final void a() {
        if (this.f29585a == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    public String[] b() {
        a();
        return this.f29585a.d();
    }

    public void c(Object obj, Object obj2) {
        HashMap map = new HashMap();
        map.put(0, obj2);
        d(new Object[]{obj}, map);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f29585a;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.f29585a = null;
        }
    }

    public void d(Object[] objArr, Map<Integer, Object> map) {
        a();
        this.f29585a.p(objArr, map);
    }

    public void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public a(ByteBuffer byteBuffer, C1067a c1067a) {
        this.f29585a = new NativeInterpreterWrapper(byteBuffer, c1067a);
        this.f29586b = b();
    }
}
