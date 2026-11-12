package a3;

import l72.y2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f888e;

    public /* synthetic */ y0(long j8, int i14, float f14, long j14, int i15) {
        this.f884a = i15;
        this.f885b = j8;
        this.f886c = i14;
        this.f887d = f14;
        this.f888e = j14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f884a) {
            case 0:
                q4.f fVar = (q4.f) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & fVar.b()));
                long j8 = this.f885b;
                int i14 = this.f886c;
                b1.e(fVar, 1.0f, j8, fIntBitsToFloat, i14);
                b1.e(fVar, this.f887d, this.f888e, fIntBitsToFloat, i14);
                break;
            default:
                q4.f fVar2 = (q4.f) obj;
                y2 y2Var = y2.f111386a;
                fVar2.getClass();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar2.b() & 4294967295L));
                y2.f111386a.getClass();
                long j14 = this.f885b;
                int i15 = this.f886c;
                y2.h(fVar2, 1.0f, j14, fIntBitsToFloat2, i15);
                float f14 = this.f887d;
                if (f14 > 0.0f) {
                    y2.h(fVar2, f14, this.f888e, fIntBitsToFloat2, i15);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
