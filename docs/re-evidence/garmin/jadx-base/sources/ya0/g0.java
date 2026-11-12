package ya0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q90.c f195435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f195436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f195437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f195438e;

    public /* synthetic */ g0(q90.c cVar, String str, e23.l lVar, e23.l lVar2, int i14, int i15) {
        this.f195434a = i15;
        this.f195435b = cVar;
        this.f195436c = str;
        this.f195437d = lVar;
        this.f195438e = lVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f195434a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                h0.b(this.f195435b, this.f195436c, this.f195437d, this.f195438e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                h0.c(this.f195435b, this.f195436c, this.f195437d, this.f195438e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
