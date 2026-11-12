package af1;

import h4.r;
import o4.z0;
import p005kotlin.Unit;
import p3.p0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3104a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f3105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f3106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3109f;

    public /* synthetic */ m(float f14, z0 z0Var, float f15, z3.e eVar, int i14) {
        this.f3105b = f14;
        this.f3108e = z0Var;
        this.f3106c = f15;
        this.f3109f = eVar;
        this.f3107d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3104a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(3457);
                n.a(this.f3107d, (Float) this.f3108e, this.f3105b, this.f3106c, (x0) this.f3109f, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                bj0.f.a((gj0.e) this.f3108e, (r) this.f3109f, this.f3105b, this.f3106c, (p3.m) obj, p0.t(this.f3107d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                bn1.e.a(this.f3105b, (z0) this.f3108e, this.f3106c, (z3.e) this.f3109f, (p3.m) obj, p0.t(this.f3107d | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(int i14, Float f14, float f15, float f16, x0 x0Var, int i15) {
        this.f3107d = i14;
        this.f3108e = f14;
        this.f3105b = f15;
        this.f3106c = f16;
        this.f3109f = x0Var;
    }

    public /* synthetic */ m(gj0.e eVar, r rVar, float f14, float f15, int i14) {
        this.f3108e = eVar;
        this.f3109f = rVar;
        this.f3105b = f14;
        this.f3106c = f15;
        this.f3107d = i14;
    }
}
