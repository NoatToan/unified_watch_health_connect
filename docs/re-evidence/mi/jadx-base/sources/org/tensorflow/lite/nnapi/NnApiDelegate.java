package org.tensorflow.lite.nnapi;

import defpackage.py5;
import org.tensorflow.lite.TensorFlowLite;

/* JADX INFO: loaded from: classes3.dex */
public class NnApiDelegate implements py5, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f29587a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29588a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f29589b = null;
        public String c = null;
        public String d = null;
        public Integer e = null;
        public Boolean f = null;
        public Boolean g = null;
    }

    public NnApiDelegate(a aVar) {
        TensorFlowLite.a();
        int i = aVar.f29588a;
        String str = aVar.f29589b;
        String str2 = aVar.c;
        String str3 = aVar.d;
        int iIntValue = aVar.e != null ? aVar.e.intValue() : -1;
        boolean z = true;
        boolean z2 = aVar.f != null;
        if (aVar.f != null && aVar.f.booleanValue()) {
            z = false;
        }
        this.f29587a = createDelegate(i, str, str2, str3, iIntValue, z2, z, aVar.g != null ? aVar.g.booleanValue() : false);
    }

    private static native long createDelegate(int i, String str, String str2, String str3, int i2, boolean z, boolean z2, boolean z3);

    private static native void deleteDelegate(long j);

    private static native int getNnapiErrno(long j);

    @Override // defpackage.py5
    public long a() {
        return this.f29587a;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        long j = this.f29587a;
        if (j != 0) {
            deleteDelegate(j);
            this.f29587a = 0L;
        }
    }

    public NnApiDelegate() {
        this(new a());
    }
}
