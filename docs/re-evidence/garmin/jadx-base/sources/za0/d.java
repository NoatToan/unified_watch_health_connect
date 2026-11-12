package za0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f203237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f203238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a4.a f203239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f203240e;

    public /* synthetic */ d(boolean z14, e23.l lVar, a4.a aVar, e23.a aVar2, int i14, int i15) {
        this.f203236a = i15;
        this.f203237b = z14;
        this.f203238c = lVar;
        this.f203239d = aVar;
        this.f203240e = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f203236a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(49);
                e.a(this.f203237b, this.f203238c, this.f203239d, this.f203240e, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(49);
                f.a(this.f203237b, this.f203238c, this.f203239d, this.f203240e, (p3.m) obj, iT2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(49);
                v.a(this.f203237b, this.f203238c, this.f203239d, this.f203240e, (p3.m) obj, iT3);
                break;
        }
        return Unit.INSTANCE;
    }
}
