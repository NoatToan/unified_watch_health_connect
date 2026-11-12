package f70;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o82.g f69417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u82.f f69418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f69419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f69420e;

    public /* synthetic */ d(o82.g gVar, u82.f fVar, e23.a aVar, int i14, int i15) {
        this.f69416a = i15;
        this.f69417b = gVar;
        this.f69418c = fVar;
        this.f69419d = aVar;
        this.f69420e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f69416a;
        m mVar = (m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                f.b(this.f69417b, this.f69418c, this.f69419d, mVar, p0.t(this.f69420e | 1));
                break;
            case 1:
                g.b(this.f69417b, this.f69418c, this.f69419d, mVar, p0.t(this.f69420e | 1));
                break;
            default:
                h.b(this.f69417b, this.f69418c, this.f69419d, mVar, p0.t(this.f69420e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
