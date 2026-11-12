package h82;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82493a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f82494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f82496d;

    public /* synthetic */ q(r rVar, float f14, int i14) {
        this.f82496d = rVar;
        this.f82494b = f14;
        this.f82495c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82493a;
        int i15 = this.f82495c;
        float f14 = this.f82494b;
        Object obj3 = this.f82496d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                r rVar = r.f82497a;
                ((r) obj3).b(f14, (p3.m) obj, p0.t(i15 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                j82.e.n((j82.g) obj3, f14, (p3.m) obj, p0.t(1), i15);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q(j82.g gVar, float f14, int i14, int i15) {
        this.f82496d = gVar;
        this.f82494b = f14;
        this.f82495c = i15;
    }
}
