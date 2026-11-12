package bn1;

import e23.p;
import h4.r;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19054a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f19055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f19056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f19058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f19060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f19061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f19062i;

    public /* synthetic */ g(h hVar, float f14, float f15, float f16, String str, x0 x0Var, h4.d.b bVar, int i14) {
        this.f19059f = hVar;
        this.f19055b = f14;
        this.f19056c = f15;
        this.f19058e = f16;
        this.f19060g = str;
        this.f19061h = x0Var;
        this.f19062i = bVar;
        this.f19057d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19054a) {
            case 0:
                ((Integer) obj2).getClass();
                ((h) this.f19059f).c(this.f19055b, this.f19056c, this.f19058e, (String) this.f19060g, (x0) this.f19061h, (h4.d.b) this.f19062i, (m) obj, p0.t(this.f19057d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                z32.e.a((r) this.f19059f, (i53.d) this.f19060g, (DateTime) this.f19061h, (DateTime) this.f19062i, this.f19055b, this.f19056c, this.f19057d, this.f19058e, (m) obj, iT);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(r rVar, i53.d dVar, DateTime dateTime, DateTime dateTime2, float f14, float f15, int i14, float f16, int i15) {
        this.f19059f = rVar;
        this.f19060g = dVar;
        this.f19061h = dateTime;
        this.f19062i = dateTime2;
        this.f19055b = f14;
        this.f19056c = f15;
        this.f19057d = i14;
        this.f19058e = f16;
    }
}
