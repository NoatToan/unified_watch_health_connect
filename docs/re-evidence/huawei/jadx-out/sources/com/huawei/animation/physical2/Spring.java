package com.huawei.animation.physical2;

/* JADX INFO: loaded from: classes23.dex */
public class Spring {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f5147a = 0.0f;
    private float g = 0.0f;
    private float e = 1.0f;
    private float h = 0.001f;
    private float f = 228.0f;
    private float d = 30.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f5148b = 1.0f;
    private float j = 0.001f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CalcSpring f5149c = new e();
    private float i = this.h * 62.5f;

    interface CalcSpring {
        float getValue(float f);

        float getVelocity(float f);
    }

    public boolean d(float f, float f2) {
        return ((double) Math.abs(f2)) < ((double) this.i) && ((double) Math.abs(f - this.e)) < ((double) this.h);
    }

    public Spring e() {
        this.f5149c = b();
        return this;
    }

    public float b(long j) {
        return this.f5149c.getValue(j / 1000.0f) + this.e;
    }

    public float c(long j) {
        return this.f5149c.getVelocity(j / 1000.0f);
    }

    private CalcSpring b() {
        float f = this.f5148b;
        if (f == 0.0f) {
            return this.f5149c;
        }
        float f2 = this.f5147a - this.e;
        float f3 = this.d;
        float f4 = (f3 * f3) - ((4.0f * f) * this.f);
        if (f4 == 0.0f) {
            float f5 = (-f3) / (f * 2.0f);
            return new a(f2, this.g - (f5 * f2), f5);
        }
        if (f4 > 0.0f) {
            double d2 = -f3;
            double d3 = f4;
            float fSqrt = (float) ((d2 - Math.sqrt(d3)) / ((double) (this.f5148b * 2.0f)));
            float fSqrt2 = (float) ((((double) (-this.d)) + Math.sqrt(d3)) / ((double) (this.f5148b * 2.0f)));
            float f6 = fSqrt2 - fSqrt;
            if (Math.abs(f6) < 1.0E-6f) {
                return this.f5149c;
            }
            float f7 = (this.g - (fSqrt * f2)) / f6;
            return new d(f2 - f7, f7, fSqrt, fSqrt2);
        }
        double dSqrt = Math.sqrt(-f4);
        float f8 = this.f5148b * 2.0f;
        float f9 = (float) (dSqrt / ((double) f8));
        float f10 = (-this.d) / f8;
        return new c(f2, (this.g - (f10 * f2)) / f9, f9, f10);
    }

    public Spring e(float f) {
        this.f5147a = f;
        return this;
    }

    public Spring d(float f) {
        this.g = f;
        return this;
    }

    public float a() {
        return this.e;
    }

    public Spring a(float f) {
        this.e = f;
        return this;
    }

    public Spring f(float f) {
        this.h = f;
        this.i = f * 62.5f;
        return this;
    }

    public Spring b(float f) {
        this.f = f;
        return this;
    }

    public Spring c(float f) {
        this.d = f;
        return this;
    }

    static class a implements CalcSpring {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f5150a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f5151c;
        float d;

        a(float f, float f2, float f3) {
            this.f5150a = f;
            this.f5151c = f2;
            this.d = f3;
        }

        @Override // com.huawei.animation.physical2.Spring.CalcSpring
        public float getValue(float f) {
            return (float) (((double) (this.f5150a + (this.f5151c * f))) * Math.pow(2.718281828459045d, this.d * f));
        }

        @Override // com.huawei.animation.physical2.Spring.CalcSpring
        public float getVelocity(float f) {
            float fPow = (float) Math.pow(2.718281828459045d, this.d * f);
            float f2 = this.d;
            float f3 = this.f5150a;
            float f4 = this.f5151c;
            return (f2 * (f3 + (f * f4)) * fPow) + (f4 * fPow);
        }
    }

    static class d implements CalcSpring {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f5154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f5155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f5156c;
        float d;

        d(float f, float f2, float f3, float f4) {
            this.f5154a = f;
            this.f5156c = f2;
            this.d = f3;
            this.f5155b = f4;
        }

        @Override // com.huawei.animation.physical2.Spring.CalcSpring
        public float getValue(float f) {
            return (this.f5154a * ((float) Math.pow(2.718281828459045d, this.d * f))) + (this.f5156c * ((float) Math.pow(2.718281828459045d, this.f5155b * f)));
        }

        @Override // com.huawei.animation.physical2.Spring.CalcSpring
        public float getVelocity(float f) {
            float f2 = this.f5154a;
            float f3 = this.d;
            float fPow = (float) Math.pow(2.718281828459045d, f3 * f);
            float f4 = this.f5156c;
            float f5 = this.f5155b;
            return (f2 * f3 * fPow) + (f4 * f5 * ((float) Math.pow(2.718281828459045d, f * f5)));
        }
    }

    static class c implements CalcSpring {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f5152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f5153b;
        float d;
        float e;

        c(float f, float f2, float f3, float f4) {
            this.f5152a = f;
            this.f5153b = f2;
            this.e = f3;
            this.d = f4;
        }

        @Override // com.huawei.animation.physical2.Spring.CalcSpring
        public float getValue(float f) {
            return ((float) Math.pow(2.718281828459045d, this.d * f)) * ((this.f5152a * ((float) Math.cos(this.e * f))) + (this.f5153b * ((float) Math.sin(this.e * f))));
        }

        @Override // com.huawei.animation.physical2.Spring.CalcSpring
        public float getVelocity(float f) {
            float fPow = (float) Math.pow(2.718281828459045d, this.d * f);
            float fCos = (float) Math.cos(this.e * f);
            float fSin = (float) Math.sin(this.e * f);
            float f2 = this.f5153b;
            float f3 = this.e;
            float f4 = this.f5152a;
            return ((((f2 * f3) * fCos) - ((f3 * f4) * fSin)) * fPow) + (this.d * fPow * ((f2 * fSin) + (f4 * fCos)));
        }
    }

    static class e implements CalcSpring {
        @Override // com.huawei.animation.physical2.Spring.CalcSpring
        public float getValue(float f) {
            return 0.0f;
        }

        @Override // com.huawei.animation.physical2.Spring.CalcSpring
        public float getVelocity(float f) {
            return 0.0f;
        }

        e() {
        }
    }

    public String toString() {
        return "Spring{startValue=" + this.f5147a + ", startVelocity=" + this.g + ", endValue=" + this.e + ", valueAccuracy=" + this.h + ", stiffness=" + this.f + ", damping=" + this.d + ", mass=" + this.f5148b + ", timeEstimateSpan=" + this.j + ", calcSpring=" + this.f5149c + ", velocityAccuracy=" + this.i + '}';
    }
}
