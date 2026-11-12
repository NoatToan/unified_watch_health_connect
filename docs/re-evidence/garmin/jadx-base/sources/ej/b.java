package ej;

import qj.l;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public class b implements u<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f64396a;

    public b(byte[] bArr) {
        l.c(bArr, "Argument must not be null");
        this.f64396a = bArr;
    }

    @Override // wi.u
    public final Class<byte[]> a() {
        return byte[].class;
    }

    @Override // wi.u
    public final void b() {
    }

    @Override // wi.u
    public final byte[] get() {
        return this.f64396a;
    }

    @Override // wi.u
    public final int getSize() {
        return this.f64396a.length;
    }
}
