package yn0;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.d f198159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.d f198160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j23.g f198161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ un0.a f198162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f198163f;

    public /* synthetic */ h(i53.d dVar, i53.d dVar2, j23.g gVar, un0.a aVar, int i14, int i15) {
        this.f198158a = i15;
        this.f198159b = dVar;
        this.f198160c = dVar2;
        this.f198161d = gVar;
        this.f198162e = aVar;
        this.f198163f = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f198158a) {
            case 0:
                ((Integer) obj2).getClass();
                i.a(this.f198159b, this.f198160c, this.f198161d, this.f198162e, (p3.m) obj, p0.t(this.f198163f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                k.a(this.f198159b, this.f198160c, this.f198161d, this.f198162e, (p3.m) obj, p0.t(this.f198163f | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                l.a(this.f198159b, this.f198160c, this.f198161d, this.f198162e, (p3.m) obj, p0.t(this.f198163f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                m.a(this.f198159b, this.f198160c, this.f198161d, this.f198162e, (p3.m) obj, p0.t(this.f198163f | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
