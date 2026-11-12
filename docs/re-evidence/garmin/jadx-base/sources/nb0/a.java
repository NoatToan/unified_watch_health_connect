package nb0;

import e23.l;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import s90.f;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f125248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f125249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f125250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f125251e;

    public /* synthetic */ a(f fVar, l lVar, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f125247a = i15;
        this.f125248b = fVar;
        this.f125249c = lVar;
        this.f125250d = aVar;
        this.f125251e = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f125247a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                c.b(this.f125248b, this.f125249c, this.f125250d, this.f125251e, (m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                c.a(this.f125248b, this.f125249c, this.f125250d, this.f125251e, (m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
