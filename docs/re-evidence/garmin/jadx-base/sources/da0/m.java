package da0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58801a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f58802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q f58803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f58804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f58805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f58806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f58807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f58808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f58810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f58811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f58812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f58813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f58814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f58815o;

    public /* synthetic */ m(h4.r rVar, ag2.e eVar, yg2.j0 j0Var, e23.a aVar, e23.l lVar, lg2.r rVar2, e23.q qVar, boolean z14, boolean z15, boolean z16, e23.a aVar2, int i14, int i15, int i16) {
        this.f58811k = rVar;
        this.f58812l = eVar;
        this.f58813m = j0Var;
        this.f58802b = aVar;
        this.f58814n = lVar;
        this.f58815o = rVar2;
        this.f58803c = qVar;
        this.f58804d = z14;
        this.f58805e = z15;
        this.f58806f = z16;
        this.f58807g = aVar2;
        this.f58808h = i14;
        this.f58809i = i15;
        this.f58810j = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58801a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(this.f58808h | 1);
                int iT2 = p0.t(this.f58809i);
                p.a((String) this.f58811k, (String) this.f58812l, this.f58802b, this.f58804d, (String) this.f58813m, this.f58807g, this.f58805e, this.f58806f, (c2.j.l) this.f58814n, (h4.d.b) this.f58815o, this.f58803c, (p3.m) obj, iT, iT2, this.f58810j);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(this.f58808h | 1);
                int iT4 = p0.t(this.f58809i);
                lg2.q.a((h4.r) this.f58811k, (ag2.e) this.f58812l, (yg2.j0) this.f58813m, this.f58802b, (e23.l) this.f58814n, (lg2.r) this.f58815o, this.f58803c, this.f58804d, this.f58805e, this.f58806f, this.f58807g, (p3.m) obj, iT3, iT4, this.f58810j);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(String str, String str2, e23.a aVar, boolean z14, String str3, e23.a aVar2, boolean z15, boolean z16, c2.j.l lVar, h4.d.b bVar, e23.q qVar, int i14, int i15, int i16) {
        this.f58811k = str;
        this.f58812l = str2;
        this.f58802b = aVar;
        this.f58804d = z14;
        this.f58813m = str3;
        this.f58807g = aVar2;
        this.f58805e = z15;
        this.f58806f = z16;
        this.f58814n = lVar;
        this.f58815o = bVar;
        this.f58803c = qVar;
        this.f58808h = i14;
        this.f58809i = i15;
        this.f58810j = i16;
    }
}
