package defpackage;

import androidx.annotation.FloatRange;

/* JADX INFO: loaded from: classes.dex */
public final class f0p {
    public static final f0p e;
    public static final f0p f;
    public static final f0p g;
    public static final f0p h;
    public static final f0p i;
    public static final f0p j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f17270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f17271b;
    public final float[] c = new float[3];
    public boolean d = true;

    static {
        f0p f0pVar = new f0p();
        e = f0pVar;
        m(f0pVar);
        p(f0pVar);
        f0p f0pVar2 = new f0p();
        f = f0pVar2;
        o(f0pVar2);
        p(f0pVar2);
        f0p f0pVar3 = new f0p();
        g = f0pVar3;
        l(f0pVar3);
        p(f0pVar3);
        f0p f0pVar4 = new f0p();
        h = f0pVar4;
        m(f0pVar4);
        n(f0pVar4);
        f0p f0pVar5 = new f0p();
        i = f0pVar5;
        o(f0pVar5);
        n(f0pVar5);
        f0p f0pVar6 = new f0p();
        j = f0pVar6;
        l(f0pVar6);
        n(f0pVar6);
    }

    public f0p() {
        float[] fArr = new float[3];
        this.f17270a = fArr;
        float[] fArr2 = new float[3];
        this.f17271b = fArr2;
        r(fArr);
        r(fArr2);
        q();
    }

    public static void l(f0p f0pVar) {
        float[] fArr = f0pVar.f17271b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    public static void m(f0p f0pVar) {
        float[] fArr = f0pVar.f17271b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    public static void n(f0p f0pVar) {
        float[] fArr = f0pVar.f17270a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    public static void o(f0p f0pVar) {
        float[] fArr = f0pVar.f17271b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    public static void p(f0p f0pVar) {
        float[] fArr = f0pVar.f17270a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    public static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.c[1];
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float b() {
        return this.f17271b[2];
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float c() {
        return this.f17270a[2];
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float d() {
        return this.f17271b[0];
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float e() {
        return this.f17270a[0];
    }

    public float f() {
        return this.c[2];
    }

    public float g() {
        return this.c[0];
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float h() {
        return this.f17271b[1];
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float i() {
        return this.f17270a[1];
    }

    public boolean j() {
        return this.d;
    }

    public void k() {
        int length = this.c.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = this.c[i2];
            if (f3 > 0.0f) {
                f2 += f3;
            }
        }
        if (f2 != 0.0f) {
            int length2 = this.c.length;
            for (int i3 = 0; i3 < length2; i3++) {
                float[] fArr = this.c;
                float f4 = fArr[i3];
                if (f4 > 0.0f) {
                    fArr[i3] = f4 / f2;
                }
            }
        }
    }

    public final void q() {
        float[] fArr = this.c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }
}
