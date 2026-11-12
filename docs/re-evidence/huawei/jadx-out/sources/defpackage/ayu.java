package defpackage;

import android.util.Log;
import com.huawei.algorithm.bodycomposition.HWAlgorithm;

/* JADX INFO: loaded from: classes4.dex */
public class ayu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f809c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;
    private float l;
    private float m;
    private float n;
    private float o;
    private int p;
    private int q;
    private float r;
    private int s;
    private int t;
    private float v;
    private float x;
    private float y;

    public ayu() {
    }

    public ayu(float f, float f2, int i, int i2, int i3, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.d = f;
        this.f807a = f2;
        this.k = i2;
        this.p = i;
        this.q = i3;
        this.t = 8;
        this.s = 1;
        this.i = f3;
        this.f808b = f4;
        this.j = f5;
        this.o = f6;
        this.n = f7;
        this.f809c = f8;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.m = 0.0f;
        this.l = 0.0f;
        this.e = 0.0f;
        this.r = f9;
        if (i2 >= 6 && i2 <= 17) {
            this.p = i + 3;
            this.k = (i2 * 10) + ((int) (((((double) i3) / 12.0d) + 0.05d) * 10.0d));
        }
        if (f9 == 0.0f) {
            this.v = 0.0f;
            this.x = 0.0f;
            this.y = 0.0f;
        }
    }

    public ayu(float f, float f2, int i, int i2, int i3, int i4, int i5, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.d = f;
        this.f807a = f2;
        this.k = i2;
        this.p = i;
        this.q = i3;
        this.t = i4;
        this.s = i5;
        this.i = f3;
        this.f808b = f4;
        this.j = f5;
        this.o = f6;
        this.n = f7;
        this.f809c = f8;
        this.f = f9;
        this.g = f10;
        this.h = f11;
        this.m = f12;
        this.l = f13;
        this.e = f14;
        this.r = f15;
        if (i2 >= 6 && i2 <= 17) {
            this.p = i + 3;
            this.k = (i2 * 10) + ((int) (((((double) i3) / 12.0d) + 0.05d) * 10.0d));
        }
        if (f15 == 0.0f) {
            this.v = 0.0f;
            this.x = 0.0f;
            this.y = 0.0f;
        }
    }

    public ayu(float f, float f2, int i, int i2, int i3, float f3, float f4) {
        this.d = f;
        this.f807a = f2;
        this.k = i2;
        this.p = i;
        this.q = i3;
        this.t = 4;
        this.s = 1;
        this.i = 0.0f;
        this.f808b = 0.0f;
        this.j = 0.0f;
        this.o = 0.0f;
        this.n = 0.0f;
        this.f809c = f3;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.m = 0.0f;
        this.l = 0.0f;
        this.e = 0.0f;
        this.r = f4;
        if (i2 >= 6 && i2 <= 17) {
            this.p = i + 3;
            this.k = (i2 * 10) + ((int) (((((double) i3) / 12.0d) + 0.05d) * 10.0d));
        }
        if (f4 == 0.0f) {
            this.v = 0.0f;
            this.x = 0.0f;
            this.y = 0.0f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00a3, code lost:
    
        if (r6 <= 1500.0f) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c() {
        int i;
        int i2;
        float f = this.f807a;
        if (f != 0.0f) {
            float f2 = this.f809c;
            if (f2 != 0.0f) {
                int i3 = this.p;
                if (i3 > 1 && (f < 10.0f || f > 200.0f)) {
                    return -2;
                }
                if (i3 <= 1 && (f < 20.0f || f > 200.0f)) {
                    return -2;
                }
                float f3 = this.d;
                if (f3 < 50.0f || f3 > 250.0f) {
                    return -3;
                }
                if (i3 > 4) {
                    return -5;
                }
                if (i3 == 3 || i3 == 4) {
                    int i4 = this.k;
                    if (i4 < 60 || i4 > 179 || (i = this.q) < 0 || i > 11) {
                        return -4;
                    }
                } else if ((i3 == 0 || i3 == 1) && ((i2 = this.k) < 18 || i2 > 80)) {
                    return -4;
                }
                int i5 = this.t;
                if (i5 != 4 && i5 != 8) {
                    return -6;
                }
                int i6 = this.s;
                if (i6 != 1 && i6 != 2) {
                    return -6;
                }
                if (i5 == 4 && i6 == 1) {
                    if (f2 >= 200.0f && f2 <= 1500.0f) {
                        if (i6 == 2) {
                            if (f2 >= 200.0f) {
                                float f4 = this.e;
                                if (f4 >= 200.0f) {
                                    if (f2 <= 1500.0f) {
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                if (i5 == 8 && i6 == 1) {
                    float f5 = this.i;
                    if (f5 >= 200.0f) {
                        float f6 = this.f808b;
                        if (f6 >= 200.0f) {
                            float f7 = this.j;
                            if (f7 >= 200.0f) {
                                float f8 = this.o;
                                if (f8 >= 200.0f) {
                                    float f9 = this.n;
                                    if (f9 >= 200.0f && f2 >= 200.0f) {
                                        if (f5 > 1500.0f || f6 > 1500.0f || f7 > 1500.0f || f8 > 1500.0f || f9 > 1500.0f || f2 > 1500.0f) {
                                            return -1;
                                        }
                                        if (i6 == 2) {
                                            if (f5 >= 200.0f && f6 >= 200.0f && f7 >= 200.0f && f8 >= 200.0f && f9 >= 200.0f && f2 >= 200.0f) {
                                                float f10 = this.f;
                                                if (f10 >= 200.0f) {
                                                    float f11 = this.g;
                                                    if (f11 >= 200.0f) {
                                                        float f12 = this.h;
                                                        if (f12 >= 200.0f) {
                                                            float f13 = this.m;
                                                            if (f13 >= 200.0f) {
                                                                float f14 = this.l;
                                                                if (f14 >= 200.0f) {
                                                                    float f15 = this.e;
                                                                    if (f15 < 200.0f || f5 > 1500.0f || f6 > 1500.0f || f7 > 1500.0f || f8 > 1500.0f || f9 > 1500.0f || f2 > 1500.0f || f10 > 1500.0f || f11 > 1500.0f || f12 > 1500.0f || f13 > 1500.0f || f14 > 1500.0f || f15 > 1500.0f) {
                                                                        return -1;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            return -1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                float f16 = this.r;
                if (f16 != 0.0f) {
                    if (f16 > 0.6001d || f16 < 0.0299f) {
                        return -8;
                    }
                    this.v = f;
                    this.x = f16;
                    this.y = 2313.0f;
                }
                return new HWAlgorithm().getCheckResult(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
            }
        }
        return -1;
    }

    public float am() {
        return new HWAlgorithm().getTW(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float aq() {
        return new HWAlgorithm().getTWR(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float u() {
        return new HWAlgorithm().getMW(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float l() {
        return new HWAlgorithm().getIS(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float y() {
        return new HWAlgorithm().getOR(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float g() {
        return new HWAlgorithm().getFAP(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float a() {
        return new HWAlgorithm().getBMI(this.d, this.f807a);
    }

    public float ab() {
        return new HWAlgorithm().getRFMM(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float s() {
        return new HWAlgorithm().getLFMM(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float ae() {
        return new HWAlgorithm().getRHMM(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float q() {
        return new HWAlgorithm().getLHMM(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float an() {
        return new HWAlgorithm().getTMM(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float aa() {
        return new HWAlgorithm().getRFFM(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float p() {
        return new HWAlgorithm().getLFFM(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float ag() {
        return new HWAlgorithm().getRHFM(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float t() {
        return new HWAlgorithm().getLHFM(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float aj() {
        return new HWAlgorithm().getTFM(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float z() {
        return new HWAlgorithm().getRFFAP(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float n() {
        return new HWAlgorithm().getLFFAP(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float ad() {
        return new HWAlgorithm().getRHFAP(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float r() {
        return new HWAlgorithm().getLHFAP(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float ak() {
        return new HWAlgorithm().getTFAP(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float h() {
        return new HWAlgorithm().getCAL(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float ao() {
        return new HWAlgorithm().getWHR(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float af() {
        return new HWAlgorithm().getSMM(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float ac() {
        return new HWAlgorithm().getRASM(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public int ap() {
        return new HWAlgorithm().getVFL(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public int ah() {
        return new HWAlgorithm().getSCORE(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public int e() {
        return new HWAlgorithm().getBODYAGE(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public int f() {
        return new HWAlgorithm().getBODYTYPE(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public int b() {
        return new HWAlgorithm().getBODYSHAPE(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public int w() {
        return new HWAlgorithm().getMB(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public int o() {
        return new HWAlgorithm().getFB(this.d, this.f807a, this.p, this.k, this.t, this.s, this.i, this.f808b, this.j, this.o, this.n, this.f809c, this.f, this.g, this.h, this.m, this.l, this.e, this.v, this.x, this.y);
    }

    public float x() {
        return new HWAlgorithm().getMWHalf(this.d, this.f807a, this.p, this.k, this.f809c, this.v, this.x, this.y);
    }

    public float as() {
        return new HWAlgorithm().getTWRHalf(this.d, this.f807a, this.p, this.k, this.f809c, this.v, this.x, this.y);
    }

    public float k() {
        return new HWAlgorithm().getISHalf(this.d, this.f807a, this.p, this.k, this.f809c, this.v, this.x, this.y);
    }

    public float v() {
        return new HWAlgorithm().getORHalf(this.d, this.f807a, this.p, this.k, this.f809c, this.v, this.x, this.y);
    }

    public float m() {
        return new HWAlgorithm().getFAPHalf(this.d, this.f807a, this.p, this.k, this.f809c, this.v, this.x, this.y);
    }

    public float j() {
        return new HWAlgorithm().getCALHalf(this.d, this.f807a, this.p, this.k, this.f809c, this.v, this.x, this.y);
    }

    public int ar() {
        return new HWAlgorithm().getVFLHalf(this.d, this.f807a, this.p, this.k, this.f809c, this.v, this.x, this.y);
    }

    public int ai() {
        return new HWAlgorithm().getSCOREHalf(this.d, this.f807a, this.p, this.k, this.f809c, this.v, this.x, this.y);
    }

    public int d() {
        return new HWAlgorithm().getBODYAGEHalf(this.d, this.f807a, this.p, this.k, this.f809c, this.v, this.x, this.y);
    }

    public float al() {
        return new HWAlgorithm().getSMMHalf(this.d, this.f807a, this.p, this.k, this.f809c, this.v, this.x, this.y);
    }

    public int i() {
        return new HWAlgorithm().getBODYTYPEHalf(this.d, this.f807a, this.p, this.k, this.f809c, this.v, this.x, this.y);
    }

    static {
        System.loadLibrary("bodycomposition");
        Log.d("HWAlorithmUtil", "load lib success");
    }
}
