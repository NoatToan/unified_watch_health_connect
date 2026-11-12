package d70;

import e23.p;
import h4.r;
import l72.f0;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58128a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f58130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f58131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f58132e;

    public /* synthetic */ m(int i14, int i15, long j8, String str, String str2) {
        this.f58129b = i14;
        this.f58131d = str;
        this.f58132e = str2;
        this.f58130c = j8;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58128a;
        int i15 = this.f58129b;
        Object obj3 = this.f58131d;
        Object obj4 = this.f58132e;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                o.a(this.f58129b, (String) obj3, (String) obj4, this.f58130c, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(3073);
                da0.f.c((o90.a) obj3, this.f58129b, this.f58130c, (r) obj4, (p3.m) obj, iT2);
                break;
            case 2:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                f0 f0Var = f0.f110999a;
                ((f0) obj3).g(p0.t(1), this.f58129b, this.f58130c, (r) obj4, mVar);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(i15 | 1);
                lu1.c.b((i53.c) obj3, (Float) obj4, this.f58130c, (p3.m) obj, iT3);
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                ((Integer) obj2).getClass();
                pk1.k.a aVar = pk1.k.f138297g;
                ((pk1.k) obj4).i(p0.t(i15 | 1), this.f58130c, (String) obj3, mVar2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(i53.c cVar, Float f14, long j8, int i14) {
        this.f58131d = cVar;
        this.f58132e = f14;
        this.f58130c = j8;
        this.f58129b = i14;
    }

    public /* synthetic */ m(f0 f0Var, r rVar, long j8, int i14, int i15) {
        this.f58131d = f0Var;
        this.f58132e = rVar;
        this.f58130c = j8;
        this.f58129b = i15;
    }

    public /* synthetic */ m(o90.a aVar, int i14, long j8, r rVar, int i15) {
        this.f58131d = aVar;
        this.f58129b = i14;
        this.f58130c = j8;
        this.f58132e = rVar;
    }

    public /* synthetic */ m(pk1.k kVar, String str, long j8, int i14) {
        this.f58132e = kVar;
        this.f58131d = str;
        this.f58130c = j8;
        this.f58129b = i14;
    }
}
