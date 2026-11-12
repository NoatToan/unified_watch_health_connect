package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class rre {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f32826b;

    public rre() {
        this(32);
    }

    public void a(long j) {
        int i = this.f32825a;
        long[] jArr = this.f32826b;
        if (i == jArr.length) {
            this.f32826b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f32826b;
        int i2 = this.f32825a;
        this.f32825a = i2 + 1;
        jArr2[i2] = j;
    }

    public long b(int i) {
        if (i >= 0 && i < this.f32825a) {
            return this.f32826b[i];
        }
        int i2 = this.f32825a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int c() {
        return this.f32825a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f32826b, this.f32825a);
    }

    public rre(int i) {
        this.f32826b = new long[i];
    }
}
