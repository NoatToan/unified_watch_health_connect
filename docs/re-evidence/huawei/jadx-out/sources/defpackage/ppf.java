package defpackage;

/* JADX INFO: loaded from: classes42.dex */
public class ppf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f45758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f45759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f45760c;
    private boolean d;
    private int e;
    private long f;
    private float g;
    private float h;
    private boolean i;
    private float j;
    private boolean l;
    private boolean m;
    private int n;
    private float o;
    private float p;
    private float q;
    private float[] r = new float[20];
    private float[] t = new float[20];
    private float[] s = new float[20];
    private int[] k = new int[20];

    private int c(int i) {
        int i2 = 0;
        int i3 = 32768;
        int i4 = 15;
        while (true) {
            int i5 = ((i2 << 1) + i3) << i4;
            if (i >= i5) {
                i2 += i3;
                i -= i5;
            }
            i3 >>= 1;
            if (i3 <= 0) {
                return i2;
            }
            i4--;
        }
    }

    protected void d(int i, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i2, boolean z, long j) {
        this.f = j;
        this.e = i2;
        this.n = i;
        for (int i3 = 0; i3 < i; i3++) {
            this.t[i3] = fArr2[i3];
            this.r[i3] = fArr[i3];
            this.k[i3] = iArr[i3];
            this.s[i3] = fArr3[i3];
        }
        this.l = z;
        boolean z2 = i >= 2;
        this.m = z2;
        if (z2) {
            float f = fArr[0];
            float f2 = fArr[1];
            this.q = (f + f2) * 0.5f;
            this.p = (fArr2[0] + fArr2[1]) * 0.5f;
            this.o = (fArr3[0] + fArr3[1]) * 0.5f;
            this.g = Math.abs(f2 - f);
            this.j = Math.abs(fArr2[1] - fArr2[0]);
        } else {
            this.q = fArr[0];
            this.p = fArr2[0];
            this.o = fArr3[0];
            this.j = 0.0f;
            this.g = 0.0f;
        }
        this.f45758a = false;
        this.d = false;
        this.i = false;
    }

    public void a(ppf ppfVar) {
        this.n = ppfVar.n;
        for (int i = 0; i < this.n; i++) {
            this.t[i] = ppfVar.t[i];
            this.r[i] = ppfVar.r[i];
            this.k[i] = ppfVar.k[i];
            this.s[i] = ppfVar.s[i];
        }
        this.g = ppfVar.g;
        this.j = ppfVar.j;
        this.q = ppfVar.q;
        this.p = ppfVar.p;
        this.o = ppfVar.o;
        this.f45760c = ppfVar.f45760c;
        this.h = ppfVar.h;
        this.m = ppfVar.m;
        this.f45759b = ppfVar.f45759b;
        this.l = ppfVar.l;
        this.e = ppfVar.e;
        this.d = ppfVar.d;
        this.i = ppfVar.i;
        this.f45758a = ppfVar.f45758a;
        this.f = ppfVar.f;
    }

    public boolean l() {
        return this.m;
    }

    public float i() {
        if (this.m) {
            return this.g;
        }
        return 0.0f;
    }

    public float e() {
        if (this.m) {
            return this.j;
        }
        return 0.0f;
    }

    public float b() {
        float f;
        if (!this.i) {
            this.i = true;
            if (this.m) {
                float f2 = this.g;
                float f3 = this.j;
                f = (f2 * f2) + (f3 * f3);
            } else {
                f = 0.0f;
            }
            this.h = f;
        }
        return this.h;
    }

    public float a() {
        if (!this.d) {
            if (!this.m) {
                this.f45760c = 0.0f;
            } else {
                float fB = b();
                float fC = fB != 0.0f ? c((int) (fB * 256.0f)) / 16.0f : 0.0f;
                this.f45760c = fC;
                float f = this.j;
                if (fC < f) {
                    this.f45760c = f;
                }
                float f2 = this.f45760c;
                float f3 = this.g;
                if (f2 < f3) {
                    this.f45760c = f3;
                }
            }
            this.d = true;
        }
        return this.f45760c;
    }

    public float d() {
        if (!this.f45758a) {
            if (!this.m) {
                this.f45759b = 0.0f;
            } else {
                this.f45758a = true;
                float[] fArr = this.t;
                double d = fArr[1] - fArr[0];
                float[] fArr2 = this.r;
                this.f45759b = (float) Math.atan2(d, fArr2[1] - fArr2[0]);
            }
        }
        return this.f45759b;
    }

    public int h() {
        return this.n;
    }

    public boolean f() {
        return this.l;
    }

    public float g() {
        return this.q;
    }

    public float j() {
        return this.p;
    }

    public long c() {
        return this.f;
    }
}
