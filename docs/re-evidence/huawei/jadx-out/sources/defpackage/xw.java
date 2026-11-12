package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes21.dex */
public class xw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f53302a = {8000, 8000, 2000, 2000};
    private static final int[] d = {4000, 4000, 200, 200};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AtomicReferenceArray<byte[]> f53303c;
    protected final AtomicReferenceArray<char[]> e;

    public xw() {
        this(4, 4);
    }

    protected xw(int i, int i2) {
        this.f53303c = new AtomicReferenceArray<>(i);
        this.e = new AtomicReferenceArray<>(i2);
    }

    public final byte[] b(int i) {
        return a(i, 0);
    }

    public byte[] a(int i, int i2) {
        int iE = e(i);
        if (i2 < iE) {
            i2 = iE;
        }
        byte[] andSet = this.f53303c.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? d(i2) : andSet;
    }

    public void a(int i, byte[] bArr) {
        this.f53303c.set(i, bArr);
    }

    public final char[] a(int i) {
        return e(i, 0);
    }

    public char[] e(int i, int i2) {
        int iJ = j(i);
        if (i2 < iJ) {
            i2 = iJ;
        }
        char[] andSet = this.e.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? c(i2) : andSet;
    }

    public void e(int i, char[] cArr) {
        this.e.set(i, cArr);
    }

    protected int e(int i) {
        return f53302a[i];
    }

    protected int j(int i) {
        return d[i];
    }

    protected byte[] d(int i) {
        return new byte[i];
    }

    protected char[] c(int i) {
        return new char[i];
    }
}
