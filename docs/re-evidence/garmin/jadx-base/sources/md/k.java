package md;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmd/k;", "Lud/c;", "delegate", "", "", "columnNames", "", "mapping", "<init>", "(Lud/c;[Ljava/lang/String;[I)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements ud.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.c f117865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f117866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q13.c f117867c;

    public k(ud.c cVar, String[] strArr, int[] iArr) {
        cVar.getClass();
        strArr.getClass();
        iArr.getClass();
        this.f117865a = cVar;
        this.f117866b = iArr;
        if (strArr.length != iArr.length) {
            vb.h.s("Expected columnNames.size == mapping.size");
            throw null;
        }
        q13.c cVar2 = new q13.c();
        int length = strArr.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            cVar2.put(strArr[i14], Integer.valueOf(this.f117866b[i15]));
            i14++;
            i15++;
        }
        int columnCount = this.f117865a.getColumnCount();
        for (int i16 = 0; i16 < columnCount; i16++) {
            if (!cVar2.containsKey(this.f117865a.getColumnName(i16))) {
                cVar2.put(this.f117865a.getColumnName(i16), Integer.valueOf(i16));
            }
        }
        this.f117867c = cVar2.b();
    }

    @Override // ud.c
    public final boolean J0() {
        return this.f117865a.J0();
    }

    @Override // ud.c
    public final String M1(int i14) {
        return this.f117865a.M1(i14);
    }

    @Override // ud.c
    public final boolean P3() {
        return this.f117865a.P3();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f117865a.close();
    }

    @Override // ud.c
    public final byte[] getBlob(int i14) {
        return this.f117865a.getBlob(i14);
    }

    @Override // ud.c
    public final int getColumnCount() {
        return this.f117865a.getColumnCount();
    }

    @Override // ud.c
    public final String getColumnName(int i14) {
        return this.f117865a.getColumnName(i14);
    }

    @Override // ud.c
    public final double getDouble(int i14) {
        return this.f117865a.getDouble(i14);
    }

    @Override // ud.c
    public final long getLong(int i14) {
        return this.f117865a.getLong(i14);
    }

    @Override // ud.c
    public final void h(int i14, long j8) {
        this.f117865a.h(i14, j8);
    }

    @Override // ud.c
    public final boolean isNull(int i14) {
        return this.f117865a.isNull(i14);
    }

    @Override // ud.c
    public final void m(double d14, int i14) {
        this.f117865a.m(d14, i14);
    }

    @Override // ud.c
    public final void o() {
        this.f117865a.o();
    }

    @Override // ud.c
    public final void q3(int i14, String str) {
        str.getClass();
        this.f117865a.q3(i14, str);
    }

    @Override // ud.c
    public final void reset() {
        this.f117865a.reset();
    }

    @Override // ud.c
    public final void t(int i14, byte[] bArr) {
        this.f117865a.t(i14, bArr);
    }

    @Override // ud.c
    public final void u(int i14) {
        this.f117865a.u(i14);
    }
}
