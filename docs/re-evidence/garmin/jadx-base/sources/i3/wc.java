package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wc implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc f90122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f90123c;

    public /* synthetic */ wc(uc ucVar, boolean z14, int i14) {
        this.f90121a = i14;
        this.f90122b = ucVar;
        this.f90123c = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f90121a) {
            case 0:
                q4.f fVar = (q4.f) obj;
                dd ddVar = dd.f87874a;
                long jB = this.f90122b.b(this.f90123c, true);
                float f14 = dd.f87875b;
                long j8 = ((n4.c) obj2).f123544a;
                ddVar.getClass();
                dd.h(fVar, j8, f14, jB);
                break;
            default:
                q4.f fVar2 = (q4.f) obj;
                dd ddVar2 = dd.f87874a;
                long jB2 = this.f90122b.b(this.f90123c, true);
                float f15 = dd.f87875b;
                long j14 = ((n4.c) obj2).f123544a;
                ddVar2.getClass();
                dd.h(fVar2, j14, f15, jB2);
                break;
        }
        return Unit.INSTANCE;
    }
}
