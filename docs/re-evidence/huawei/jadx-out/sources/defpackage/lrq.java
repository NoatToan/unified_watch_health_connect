package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class lrq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40733c;
    private byte[] d;
    private int e;

    public void c(int i) {
        this.f40733c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void d(int i) {
        this.f40732b = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void b(int i) {
        this.f40731a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void e(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void d(byte[] bArr) {
        if (bArr != null) {
            this.d = (byte[]) lst.d(Arrays.copyOf(bArr, bArr.length));
        }
    }
}
