package a03;

import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f241f;

    public /* synthetic */ z(boolean z14, float f14, float f15, m mVar, p pVar, float f16) {
        this.f236a = z14;
        this.f237b = f14;
        this.f238c = f15;
        this.f239d = mVar;
        this.f240e = pVar;
        this.f241f = f16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        float f14;
        y yVar = (y) obj;
        g6.m mVar = (g6.m) obj2;
        m mVar2 = this.f239d;
        mVar2.getClass();
        float f15 = mVar2.f127a;
        float f16 = mVar2.f128b;
        float f17 = mVar2.f129c;
        p pVar = this.f240e;
        pVar.getClass();
        boolean z14 = pVar.f151b;
        boolean z15 = pVar.f152c;
        yVar.getClass();
        boolean z16 = this.f236a;
        float f18 = this.f238c;
        if (z16) {
            int i14 = b0.f69a[yVar.ordinal()];
            if (i14 == 1) {
                return Float.valueOf(this.f237b - 0.0f);
            }
            if (i14 == 2) {
                if (((int) (mVar.f76013a & 4294967295L)) != 0) {
                    return Float.valueOf(Math.max(0.0f, f18 - (f15 * f18)));
                }
                return null;
            }
            if (i14 == 3) {
                float f19 = f16 * f18;
                if (((int) (mVar.f76013a & 4294967295L)) >= f19 && !z14) {
                    return Float.valueOf(f18 - f19);
                }
                return null;
            }
            if (i14 != 4) {
                lc.u0.r();
                return null;
            }
            float f22 = f17 * f18;
            if (((int) (mVar.f76013a & 4294967295L)) >= f22 && !z15) {
                return Float.valueOf(f18 - f22);
            }
            return null;
        }
        int[] iArr = b0.f69a;
        int i15 = iArr[yVar.ordinal()];
        if (i15 == 1) {
            f14 = 0.0f;
        } else if (i15 == 2) {
            f14 = f18 * f15;
        } else if (i15 == 3) {
            f14 = f18 * f16;
        } else {
            if (i15 != 4) {
                lc.u0.r();
                return null;
            }
            f14 = f18 * f17;
        }
        int iC = MathKt.c(f14);
        int i16 = iArr[yVar.ordinal()];
        float f24 = this.f241f;
        if (i16 == 1) {
            return Float.valueOf(f24);
        }
        if (i16 == 2) {
            int i17 = (int) (mVar.f76013a & 4294967295L);
            if (i17 != 0) {
                return Float.valueOf(Math.max(0.0f, f24 - i17));
            }
            return null;
        }
        if (i16 == 3) {
            if (((int) (mVar.f76013a & 4294967295L)) >= iC && !z14) {
                return Float.valueOf(f24 - iC);
            }
            return null;
        }
        if (i16 != 4) {
            lc.u0.r();
            return null;
        }
        if (((int) (mVar.f76013a & 4294967295L)) >= iC && !z15) {
            return Float.valueOf(f24 - iC);
        }
        return null;
    }
}
