package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes4.dex */
public class wjp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f38040a = new SparseIntArray();

    public void a(long j) {
        this.f38040a.put((int) j, 0);
    }

    public short b(long j) {
        int i = this.f38040a.get((int) j, -1);
        if (i != -1) {
            return (short) (i & 65535);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public boolean c(long j) {
        return this.f38040a.get((int) j, -1) != -1;
    }

    public void d(long j) {
        int i = (int) j;
        int i2 = this.f38040a.get(i, -1);
        if (i2 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.f38040a.put(i, i2 + 1);
    }

    public void e(long j) {
        this.f38040a.delete((int) j);
    }
}
