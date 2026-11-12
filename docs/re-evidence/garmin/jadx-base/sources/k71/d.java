package k71;

import e23.p;
import h4.r;
import me1.n;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103282a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f103283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f103284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f103285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f103286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f103287f;

    public /* synthetic */ d(a10.a aVar, x0 x0Var, float f14, long j8, long j14, int i14) {
        this.f103286e = aVar;
        this.f103287f = x0Var;
        this.f103283b = f14;
        this.f103284c = j8;
        this.f103285d = j14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f103282a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                e.a((r) this.f103286e, this.f103284c, this.f103285d, (o61.d) this.f103287f, this.f103283b, (m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(393);
                n.c((a10.a) this.f103286e, (x0) this.f103287f, this.f103283b, this.f103284c, this.f103285d, (m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(r rVar, long j8, long j14, o61.d dVar, float f14, int i14) {
        this.f103286e = rVar;
        this.f103284c = j8;
        this.f103285d = j14;
        this.f103287f = dVar;
        this.f103283b = f14;
    }
}
