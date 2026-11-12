package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class yoe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40371b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final int f;
    public final boolean g;
    public final lsd h;
    public final jsr i;
    public final tdp j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qcp f40372k;
    public final o8o l;
    public final v43 m;
    public final Map<Class<?>, Object> n;
    public final List<fdd> o;

    public yoe(a aVar) {
        this.f40370a = aVar.f40373a;
        this.f40371b = aVar.f40374b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.f40372k = aVar.f40375k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
        this.o = aVar.o;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f40374b;
        public boolean c;
        public boolean d;
        public String e;
        public int f;
        public boolean g;
        public lsd h;
        public jsr i;
        public tdp j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public qcp f40375k;
        public o8o l;
        public v43 m;
        public Map<Class<?>, Object> n;
        public List<fdd> o;

        public a() {
            this.f40373a = Integer.MIN_VALUE;
            this.f40374b = "X-LOG";
        }

        public a A(lsd lsdVar) {
            this.h = lsdVar;
            return this;
        }

        public a B(int i) {
            this.f40373a = i;
            return this;
        }

        public a C(Map<Class<?>, Object> map) {
            this.n = map;
            return this;
        }

        public a D(o8o o8oVar) {
            this.l = o8oVar;
            return this;
        }

        public a E(String str) {
            this.f40374b = str;
            return this;
        }

        public a F(qcp qcpVar) {
            this.f40375k = qcpVar;
            return this;
        }

        public a G(tdp tdpVar) {
            this.j = tdpVar;
            return this;
        }

        public a H(jsr jsrVar) {
            this.i = jsrVar;
            return this;
        }

        public a p(fdd fddVar) {
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(fddVar);
            return this;
        }

        public a q(v43 v43Var) {
            this.m = v43Var;
            return this;
        }

        public yoe r() {
            y();
            return new yoe(this);
        }

        public a s() {
            this.g = false;
            return this;
        }

        public a t() {
            this.d = false;
            this.e = null;
            this.f = 0;
            return this;
        }

        public a u() {
            this.c = false;
            return this;
        }

        public a v() {
            this.g = true;
            return this;
        }

        public a w(String str, int i) {
            this.d = true;
            this.e = str;
            this.f = i;
            return this;
        }

        public a x() {
            this.c = true;
            return this;
        }

        public final void y() {
            if (this.h == null) {
                this.h = cy5.g();
            }
            if (this.i == null) {
                this.i = cy5.k();
            }
            if (this.j == null) {
                this.j = cy5.j();
            }
            if (this.f40375k == null) {
                this.f40375k = cy5.i();
            }
            if (this.l == null) {
                this.l = cy5.h();
            }
            if (this.m == null) {
                this.m = cy5.c();
            }
            if (this.n == null) {
                this.n = new HashMap(cy5.a());
            }
        }

        public a z(List<fdd> list) {
            this.o = list;
            return this;
        }

        public a(yoe yoeVar) {
            this.f40373a = Integer.MIN_VALUE;
            this.f40374b = "X-LOG";
            this.f40373a = yoeVar.f40370a;
            this.f40374b = yoeVar.f40371b;
            this.c = yoeVar.c;
            this.d = yoeVar.d;
            this.e = yoeVar.e;
            this.f = yoeVar.f;
            this.g = yoeVar.g;
            this.h = yoeVar.h;
            this.i = yoeVar.i;
            this.j = yoeVar.j;
            this.f40375k = yoeVar.f40372k;
            this.l = yoeVar.l;
            this.m = yoeVar.m;
            if (yoeVar.n != null) {
                this.n = new HashMap(yoeVar.n);
            }
            if (yoeVar.o != null) {
                this.o = new ArrayList(yoeVar.o);
            }
        }
    }
}
