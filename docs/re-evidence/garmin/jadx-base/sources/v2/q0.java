package v2;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175139a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f175140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f175141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f175142d;

    public /* synthetic */ q0(int i14, int i15, p0 p0Var) {
        this.f175140b = i14;
        this.f175141c = i15;
        this.f175142d = p0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f175139a;
        p0 p0Var = this.f175142d;
        int i15 = this.f175141c;
        int i16 = this.f175140b;
        u2.d dVar = (u2.d) obj;
        switch (i14) {
            case 0:
                long jC = p0Var.c(og.a.l(0, dVar.f167831b.length()));
                int iH = s5.w0.h(jC);
                int iG = s5.w0.g(jC);
                if (i16 < iH) {
                    i16 = iH;
                }
                if (i16 <= iG) {
                    iG = i16;
                }
                int iH2 = s5.w0.h(jC);
                int iG2 = s5.w0.g(jC);
                if (i15 < iH2) {
                    i15 = iH2;
                }
                if (i15 <= iG2) {
                    iG2 = i15;
                }
                dVar.f(p0Var.d(og.a.l(iG, iG2)));
                break;
            default:
                if (i16 < 0 || i15 < 0) {
                    b2.e.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i16 + " and " + i15 + " respectively.");
                }
                long j8 = dVar.f167833d;
                h1 h1Var = dVar.f167831b;
                long jC2 = p0Var.c(j8);
                s5.w0.a aVar = s5.w0.f157315b;
                int i17 = (int) (4294967295L & jC2);
                int length = i17 + i15;
                if (((i15 ^ length) & (i17 ^ length)) < 0) {
                    length = h1Var.length();
                }
                long jD = p0Var.d(og.a.l(i17, Math.min(length, h1Var.length())));
                r0.a(dVar, s5.w0.h(jD), s5.w0.g(jD));
                int i18 = (int) (jC2 >> 32);
                int i19 = i18 - i16;
                if (((i16 ^ i18) & (i18 ^ i19)) < 0) {
                    i19 = 0;
                }
                long jD2 = p0Var.d(og.a.l(Math.max(0, i19), i18));
                r0.a(dVar, s5.w0.h(jD2), s5.w0.g(jD2));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q0(p0 p0Var, int i14, int i15) {
        this.f175142d = p0Var;
        this.f175140b = i14;
        this.f175141c = i15;
    }
}
