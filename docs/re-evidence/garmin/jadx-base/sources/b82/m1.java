package b82;

import java.util.Map;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16682a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f16684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f16685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h4.r f16686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f16690i;

    public /* synthetic */ m1(q1 q1Var, float f14, Object obj, h4.r rVar, float f15, long j8, int i14, int i15) {
        this.f16689h = q1Var;
        this.f16684c = f14;
        this.f16690i = obj;
        this.f16686e = rVar;
        this.f16685d = f15;
        this.f16683b = j8;
        this.f16687f = i14;
        this.f16688g = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16682a;
        int i15 = this.f16687f;
        Object obj3 = this.f16689h;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                q1 q1Var = q1.f16749a;
                ((q1) obj3).e(this.f16684c, this.f16690i, this.f16686e, this.f16685d, this.f16683b, mVar, p3.p0.t(i15 | 1), this.f16688g);
                break;
            default:
                ((Integer) obj2).getClass();
                m92.y.c((Map) obj3, this.f16683b, this.f16684c, this.f16685d, (e23.q) this.f16690i, this.f16686e, (p3.m) obj, p3.p0.t(i15 | 1), this.f16688g);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m1(Map map, long j8, float f14, float f15, e23.q qVar, h4.r rVar, int i14, int i15) {
        this.f16689h = map;
        this.f16683b = j8;
        this.f16684c = f14;
        this.f16685d = f15;
        this.f16690i = qVar;
        this.f16686e = rVar;
        this.f16687f = i14;
        this.f16688g = i15;
    }
}
