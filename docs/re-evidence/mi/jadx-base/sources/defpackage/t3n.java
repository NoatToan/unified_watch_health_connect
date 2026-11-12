package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class t3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okh f34272a = new okh(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34273b;

    public final long a(jl8 jl8Var) throws IOException {
        int i = 0;
        jl8Var.i(this.f34272a.d(), 0, 1);
        int i2 = this.f34272a.d()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        jl8Var.i(this.f34272a.d(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f34272a.d()[i] & 255) + (i5 << 8);
        }
        this.f34273b += i4 + 1;
        return i5;
    }

    public boolean b(jl8 jl8Var) throws IOException {
        long length = jl8Var.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        jl8Var.i(this.f34272a.d(), 0, 4);
        long jF = this.f34272a.F();
        this.f34273b = 4;
        while (jF != 440786851) {
            int i2 = this.f34273b + 1;
            this.f34273b = i2;
            if (i2 == i) {
                return false;
            }
            jl8Var.i(this.f34272a.d(), 0, 1);
            jF = ((jF << 8) & (-256)) | ((long) (this.f34272a.d()[0] & 255));
        }
        long jA = a(jl8Var);
        long j2 = this.f34273b;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j2 + jA >= length) {
            return false;
        }
        while (true) {
            int i3 = this.f34273b;
            long j3 = j2 + jA;
            if (i3 >= j3) {
                return ((long) i3) == j3;
            }
            if (a(jl8Var) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = a(jl8Var);
            if (jA2 < 0 || jA2 > 2147483647L) {
                return false;
            }
            if (jA2 != 0) {
                int i4 = (int) jA2;
                jl8Var.o(i4);
                this.f34273b += i4;
            }
        }
    }
}
