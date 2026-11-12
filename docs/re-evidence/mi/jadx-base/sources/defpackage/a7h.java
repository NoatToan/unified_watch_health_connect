package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a7h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7h f716a = new b7h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f717b = new okh(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            b7h b7hVar = this.f716a;
            if (i5 >= b7hVar.g) {
                break;
            }
            int[] iArr = b7hVar.j;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public b7h b() {
        return this.f716a;
    }

    public okh c() {
        return this.f717b;
    }

    public boolean d(jl8 jl8Var) throws IOException {
        int i;
        rk1.g(jl8Var != null);
        if (this.e) {
            this.e = false;
            this.f717b.L(0);
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.f716a.d(jl8Var) || !this.f716a.b(jl8Var, true)) {
                    return false;
                }
                b7h b7hVar = this.f716a;
                int iA = b7hVar.h;
                if ((b7hVar.f3885b & 1) == 1 && this.f717b.f() == 0) {
                    iA += a(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                jl8Var.p(iA);
                this.c = i;
            }
            int iA2 = a(this.c);
            int i2 = this.c + this.d;
            if (iA2 > 0) {
                okh okhVar = this.f717b;
                okhVar.c(okhVar.f() + iA2);
                jl8Var.readFully(this.f717b.d(), this.f717b.f(), iA2);
                okh okhVar2 = this.f717b;
                okhVar2.O(okhVar2.f() + iA2);
                this.e = this.f716a.j[i2 + (-1)] != 255;
            }
            if (i2 == this.f716a.g) {
                i2 = -1;
            }
            this.c = i2;
        }
        return true;
    }

    public void e() {
        this.f716a.c();
        this.f717b.L(0);
        this.c = -1;
        this.e = false;
    }

    public void f() {
        if (this.f717b.d().length == 65025) {
            return;
        }
        okh okhVar = this.f717b;
        okhVar.N(Arrays.copyOf(okhVar.d(), Math.max(65025, this.f717b.f())), this.f717b.f());
    }
}
