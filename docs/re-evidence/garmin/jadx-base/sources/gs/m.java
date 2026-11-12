package gs;

import c2.t2;
import p005kotlin.Unit;
import p3.p0;
import zd0.q0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78628a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f78629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f78630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.r f78631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f78632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f78633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f78634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f78635h;

    public /* synthetic */ m(long j8, gf2.a aVar, jf2.a aVar2, h4.r rVar, ff2.c cVar, q0 q0Var, int i14) {
        this.f78632e = j8;
        this.f78629b = aVar;
        this.f78630c = aVar2;
        this.f78631d = rVar;
        this.f78634g = cVar;
        this.f78635h = q0Var;
        this.f78633f = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f78628a) {
            case 0:
                ((Integer) obj2).getClass();
                n.b((t2) this.f78629b, (String) this.f78630c, (String) this.f78634g, (String) this.f78635h, this.f78631d, this.f78632e, (p3.m) obj, p0.t(this.f78633f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                n.a((t2) this.f78629b, (z3.e) this.f78634g, (String) this.f78630c, this.f78631d, this.f78632e, (b92.a) this.f78635h, (p3.m) obj, p0.t(this.f78633f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                if2.d.a(this.f78632e, (gf2.a) this.f78629b, (jf2.a) this.f78630c, this.f78631d, (ff2.c) this.f78634g, (q0) this.f78635h, (p3.m) obj, p0.t(this.f78633f | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(t2 t2Var, String str, String str2, String str3, h4.r rVar, long j8, int i14) {
        this.f78629b = t2Var;
        this.f78630c = str;
        this.f78634g = str2;
        this.f78635h = str3;
        this.f78631d = rVar;
        this.f78632e = j8;
        this.f78633f = i14;
    }

    public /* synthetic */ m(t2 t2Var, z3.e eVar, String str, h4.r rVar, long j8, b92.a aVar, int i14) {
        this.f78629b = t2Var;
        this.f78634g = eVar;
        this.f78630c = str;
        this.f78631d = rVar;
        this.f78632e = j8;
        this.f78635h = aVar;
        this.f78633f = i14;
    }
}
