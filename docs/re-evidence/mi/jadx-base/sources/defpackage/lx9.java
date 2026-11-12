package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lx9 extends a77<lx9> {
    public final a B;
    public b C;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f25517b;
        public double d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f25516a = -4.2f;
        public final a77.p c = new a77.p();
        public final double e = 1.0E9d;

        public boolean c(float f, float f2) {
            return Math.abs(f2) < this.f25517b;
        }

        public void d(float f) {
            float f2 = f * (-4.2f);
            this.f25516a = f2;
            this.d = 1.0d - Math.pow(2.718281828459045d, f2);
        }

        public void e(float f) {
            this.f25517b = f * 62.5f;
        }

        public a77.p f(float f, float f2, long j) {
            double d = j / 1.0E9d;
            double dPow = Math.pow(1.0d - this.d, d);
            a77.p pVar = this.c;
            float f3 = (float) (((double) f2) * dPow);
            pVar.f710b = f3;
            float f4 = (float) (((double) f) + (((double) f3) * d));
            pVar.f709a = f4;
            if (c(f4, f3)) {
                this.c.f710b = 0.0f;
            }
            return this.c;
        }
    }

    public interface b {
        void a(int i);
    }

    public lx9(fy9 fy9Var, b bVar) {
        super(fy9Var);
        a aVar = new a();
        this.B = aVar;
        aVar.e(f());
        this.C = bVar;
    }

    @Override // defpackage.a77
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public lx9 k(float f) {
        super.k(f);
        return this;
    }

    @Override // defpackage.a77
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public lx9 o(float f) {
        super.o(f);
        return this;
    }

    @Override // defpackage.a77
    public void p(float f) {
        this.B.e(f);
    }

    @Override // defpackage.a77
    public boolean s(long j) {
        a77.p pVarF = this.B.f(this.f706b, this.f705a, j);
        float f = pVarF.f709a;
        this.f706b = f;
        float f2 = pVarF.f710b;
        this.f705a = f2;
        float f3 = this.h;
        if (f < f3) {
            this.f706b = f3;
            return true;
        }
        float f4 = this.g;
        if (f > f4) {
            this.f706b = f4;
            return true;
        }
        if (!t(f, f2)) {
            return false;
        }
        this.C.a((int) this.f706b);
        return true;
    }

    public boolean t(float f, float f2) {
        return f >= this.g || f <= this.h || this.B.c(f, f2);
    }

    public float u() {
        return x(Math.signum(this.f705a) * this.B.f25517b);
    }

    public float v() {
        return (this.f706b - (this.f705a / this.B.f25516a)) + ((Math.signum(this.f705a) * this.B.f25517b) / this.B.f25516a);
    }

    public float w(float f) {
        return x(((f - this.f706b) + (this.f705a / this.B.f25516a)) * this.B.f25516a);
    }

    public final float x(float f) {
        return (float) ((Math.log(f / this.f705a) * 1000.0d) / ((double) this.B.f25516a));
    }

    public lx9 y(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.B.d(f);
        return this;
    }

    @Override // defpackage.a77
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public lx9 j(float f) {
        super.j(f);
        return this;
    }
}
