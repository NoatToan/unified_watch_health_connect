package sy;

import b63.o;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n82.f f161172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.f f161173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f161174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f161175e;

    public /* synthetic */ h(n82.f fVar, i53.f fVar2, o oVar, o oVar2, int i14) {
        this.f161171a = i14;
        this.f161172b = fVar;
        this.f161173c = fVar2;
        this.f161174d = oVar;
        this.f161175e = oVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f161171a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                o82.g gVar = (o82.g) this.f161173c.get(iIntValue);
                n82.f fVar = this.f161172b;
                fVar.d(gVar);
                fVar.f(new o82.a(this.f161174d, this.f161175e));
                break;
            default:
                o82.g gVar2 = (o82.g) this.f161173c.get(iIntValue);
                n82.f fVar2 = this.f161172b;
                fVar2.d(gVar2);
                fVar2.f(new o82.a(this.f161174d, this.f161175e));
                break;
        }
        return Unit.INSTANCE;
    }
}
