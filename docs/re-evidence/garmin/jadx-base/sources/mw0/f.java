package mw0;

import b63.t;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f121260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kw0.f f121261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv0.r f121262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f121263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f121264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f121265g;

    public /* synthetic */ f(t tVar, kw0.f fVar, pv0.r rVar, String str, boolean z14, int i14, int i15) {
        this.f121259a = i15;
        this.f121260b = tVar;
        this.f121261c = fVar;
        this.f121262d = rVar;
        this.f121263e = str;
        this.f121264f = z14;
        this.f121265g = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f121259a) {
            case 0:
                ((Integer) obj2).getClass();
                g.a(p0.t(this.f121265g | 1), this.f121260b, this.f121263e, this.f121261c, (p3.m) obj, this.f121262d, this.f121264f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                j.b(p0.t(this.f121265g | 1), this.f121260b, this.f121263e, this.f121261c, (p3.m) obj, this.f121262d, this.f121264f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                p.b(p0.t(this.f121265g | 1), this.f121260b, this.f121263e, this.f121261c, (p3.m) obj, this.f121262d, this.f121264f);
                break;
            default:
                ((Integer) obj2).getClass();
                p.a(p0.t(this.f121265g | 1), this.f121260b, this.f121263e, this.f121261c, (p3.m) obj, this.f121262d, this.f121264f);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(String str, t tVar, kw0.f fVar, pv0.r rVar, boolean z14, int i14, int i15) {
        this.f121259a = i15;
        this.f121263e = str;
        this.f121260b = tVar;
        this.f121261c = fVar;
        this.f121262d = rVar;
        this.f121264f = z14;
        this.f121265g = i14;
    }
}
