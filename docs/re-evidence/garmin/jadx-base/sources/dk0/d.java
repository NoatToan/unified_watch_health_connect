package dk0;

import c80.q;
import e23.p;
import lc.y;
import p005kotlin.Unit;
import p3.p0;
import yg2.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60169a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f60170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f60171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f60172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f60173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f60174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f60175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f60176h;

    public /* synthetic */ d(yg2.h hVar, yg2.g gVar, vf2.e eVar, boolean z14, boolean z15, boolean z16, y yVar, int i14) {
        this.f60173e = hVar;
        this.f60174f = gVar;
        this.f60175g = eVar;
        this.f60170b = z14;
        this.f60171c = z15;
        this.f60172d = z16;
        this.f60176h = yVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f60169a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                e.a(this.f60170b, this.f60171c, this.f60172d, (e23.a) this.f60173e, (ak0.a) this.f60175g, (q) this.f60176h, (e23.a) this.f60174f, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                f0.g((yg2.h) this.f60173e, (yg2.g) this.f60174f, (vf2.e) this.f60175g, this.f60170b, this.f60171c, this.f60172d, (y) this.f60176h, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(boolean z14, boolean z15, boolean z16, e23.a aVar, ak0.a aVar2, q qVar, e23.a aVar3, int i14) {
        this.f60170b = z14;
        this.f60171c = z15;
        this.f60172d = z16;
        this.f60173e = aVar;
        this.f60175g = aVar2;
        this.f60176h = qVar;
        this.f60174f = aVar3;
    }
}
