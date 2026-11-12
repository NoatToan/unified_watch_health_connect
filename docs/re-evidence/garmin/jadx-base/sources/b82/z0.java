package b82;

import c2.h2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16912a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f16915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f16916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f16919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f16920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f16921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f16922k;

    public /* synthetic */ z0(String str, h4.r rVar, boolean z14, s5.x0 x0Var, long j8, e23.p pVar, h2 h2Var, e23.a aVar, int i14, int i15) {
        this.f16913b = str;
        this.f16919h = rVar;
        this.f16914c = z14;
        this.f16920i = x0Var;
        this.f16915d = j8;
        this.f16921j = pVar;
        this.f16922k = h2Var;
        this.f16916e = aVar;
        this.f16917f = i14;
        this.f16918g = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16912a) {
            case 0:
                ((Integer) obj2).getClass();
                a1.a(this.f16913b, (l72.w1) this.f16919h, (l72.x1) this.f16920i, (Integer) this.f16921j, this.f16915d, this.f16914c, this.f16916e, (e23.q) this.f16922k, (p3.m) obj, p3.p0.t(this.f16917f | 1), this.f16918g);
                break;
            default:
                ((Integer) obj2).getClass();
                l72.i0.d(this.f16913b, (h4.r) this.f16919h, this.f16914c, (s5.x0) this.f16920i, this.f16915d, (e23.p) this.f16921j, (h2) this.f16922k, this.f16916e, (p3.m) obj, p3.p0.t(this.f16917f | 1), this.f16918g);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ z0(String str, l72.w1 w1Var, l72.x1 x1Var, Integer num, long j8, boolean z14, e23.a aVar, e23.q qVar, int i14, int i15) {
        this.f16913b = str;
        this.f16919h = w1Var;
        this.f16920i = x1Var;
        this.f16921j = num;
        this.f16915d = j8;
        this.f16914c = z14;
        this.f16916e = aVar;
        this.f16922k = qVar;
        this.f16917f = i14;
        this.f16918g = i15;
    }
}
