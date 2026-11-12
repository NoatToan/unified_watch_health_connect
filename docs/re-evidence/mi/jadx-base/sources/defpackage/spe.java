package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class spe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yoe f33858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b9i f33859b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f33861b;
        public boolean c;
        public boolean d;
        public boolean e;
        public String f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public lsd f33862k;
        public jsr l;
        public tdp m;
        public qcp n;
        public o8o o;
        public v43 p;
        public Map<Class<?>, Object> q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List<fdd> f33863r;
        public b9i s;

        public a() {
            prr.a();
        }

        public spe t() {
            return new spe(this);
        }

        public a u(b9i... b9iVarArr) {
            if (b9iVarArr.length == 0) {
                this.s = null;
            } else if (b9iVarArr.length == 1) {
                this.s = b9iVarArr[0];
            } else {
                this.s = new d9i(b9iVarArr);
            }
            return this;
        }

        public a v(String str) {
            this.f33861b = str;
            return this;
        }
    }

    public spe(yoe yoeVar, b9i b9iVar) {
        this.f33858a = yoeVar;
        this.f33859b = b9iVar;
    }

    public void a(String str) {
        i(3, str);
    }

    public void b(String str, Object... objArr) {
        k(3, str, objArr);
    }

    public void c(String str) {
        i(6, str);
    }

    public void d(String str, Throwable th) {
        j(6, str, th);
    }

    public void e(String str, Object... objArr) {
        k(6, str, objArr);
    }

    public final String f(String str, Object... objArr) {
        if (str != null) {
            return String.format(str, objArr);
        }
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(objArr[i]);
        }
        return sb.toString();
    }

    public void g(String str) {
        i(4, str);
    }

    public void h(String str, Object... objArr) {
        k(4, str, objArr);
    }

    public void i(int i, String str) {
        if (i < this.f33858a.f40370a) {
            return;
        }
        if (str == null) {
            str = "";
        }
        l(i, str);
    }

    public final void j(int i, String str, Throwable th) {
        String str2;
        if (i < this.f33858a.f40370a) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str == null || str.length() == 0) {
            str2 = "";
        } else {
            str2 = str + xvo.f39517a;
        }
        sb.append(str2);
        sb.append(this.f33858a.j.a(th));
        l(i, sb.toString());
    }

    public final void k(int i, String str, Object... objArr) {
        if (i < this.f33858a.f40370a) {
            return;
        }
        l(i, f(str, objArr));
    }

    public final void l(int i, String str) {
        String strA;
        String string;
        yoe yoeVar = this.f33858a;
        String str2 = yoeVar.f40371b;
        String strA2 = yoeVar.c ? yoeVar.f40372k.a(Thread.currentThread()) : null;
        yoe yoeVar2 = this.f33858a;
        if (yoeVar2.d) {
            o8o o8oVar = yoeVar2.l;
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            yoe yoeVar3 = this.f33858a;
            strA = o8oVar.a(q8o.b(stackTrace, yoeVar3.e, yoeVar3.f));
        } else {
            strA = null;
        }
        if (this.f33858a.o != null) {
            zoe zoeVar = new zoe(i, str2, strA2, strA, str);
            for (fdd fddVar : this.f33858a.o) {
                zoeVar = fddVar.a(zoeVar);
                if (zoeVar == null) {
                    return;
                }
                if (zoeVar.f41522b == null || zoeVar.c == null) {
                    b0i.d().b("Interceptor " + fddVar + " should not remove the tag or message of a log, if you don't want to print this log, just return a null when intercept.");
                    return;
                }
            }
            i = zoeVar.f41521a;
            str2 = zoeVar.f41522b;
            strA2 = zoeVar.d;
            strA = zoeVar.e;
            str = zoeVar.c;
        }
        b9i b9iVar = this.f33859b;
        yoe yoeVar4 = this.f33858a;
        if (yoeVar4.g) {
            string = yoeVar4.m.a(new String[]{strA2, strA, str});
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(strA2 != null ? strA2 + xvo.f39517a : "");
            sb.append(strA != null ? strA + xvo.f39517a : "");
            sb.append(str);
            string = sb.toString();
        }
        b9iVar.println(i, str2, string);
    }

    public void m(String str, Object... objArr) {
        k(2, str, objArr);
    }

    public void n(String str) {
        i(5, str);
    }

    public void o(String str, Throwable th) {
        j(5, str, th);
    }

    public void p(String str, Object... objArr) {
        k(5, str, objArr);
    }

    public spe(a aVar) {
        yoe.a aVar2 = new yoe.a(prr.f30690b);
        if (aVar.f33860a != 0) {
            aVar2.B(aVar.f33860a);
        }
        if (aVar.f33861b != null) {
            aVar2.E(aVar.f33861b);
        }
        if (aVar.d) {
            if (aVar.c) {
                aVar2.x();
            } else {
                aVar2.u();
            }
        }
        if (aVar.h) {
            if (aVar.e) {
                aVar2.w(aVar.f, aVar.g);
            } else {
                aVar2.t();
            }
        }
        if (aVar.j) {
            if (aVar.i) {
                aVar2.v();
            } else {
                aVar2.s();
            }
        }
        if (aVar.f33862k != null) {
            aVar2.A(aVar.f33862k);
        }
        if (aVar.l != null) {
            aVar2.H(aVar.l);
        }
        if (aVar.m != null) {
            aVar2.G(aVar.m);
        }
        if (aVar.n != null) {
            aVar2.F(aVar.n);
        }
        if (aVar.o != null) {
            aVar2.D(aVar.o);
        }
        if (aVar.p != null) {
            aVar2.q(aVar.p);
        }
        if (aVar.q != null) {
            aVar2.C(aVar.q);
        }
        if (aVar.f33863r != null) {
            aVar2.z(aVar.f33863r);
        }
        this.f33858a = aVar2.r();
        if (aVar.s != null) {
            this.f33859b = aVar.s;
        } else {
            this.f33859b = prr.c;
        }
    }
}
