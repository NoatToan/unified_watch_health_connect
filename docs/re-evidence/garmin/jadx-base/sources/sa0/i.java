package sa0;

import java.util.List;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f158191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f158192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f158193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f158194e;

    public /* synthetic */ i(List list, e23.a aVar, e23.l lVar, e23.a aVar2, int i14, int i15) {
        this.f158190a = i15;
        this.f158191b = list;
        this.f158192c = aVar;
        this.f158193d = lVar;
        this.f158194e = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f158190a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                j.c(this.f158191b, this.f158192c, this.f158193d, this.f158194e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                j.b(this.f158191b, this.f158192c, this.f158193d, this.f158194e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
