package p82;

import e23.p;
import o4.r1;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import ub0.r;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f136422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f136423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f136424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f136425e;

    public /* synthetic */ d(float f14, long j8, Integer num, float f15, int i14) {
        this.f136421a = 2;
        this.f136422b = f14;
        this.f136424d = j8;
        this.f136425e = num;
        this.f136423c = f15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f136421a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                e.b(this.f136422b, this.f136423c, this.f136424d, (r1) this.f136425e, (m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                r.a(this.f136422b, this.f136423c, this.f136424d, (r1) this.f136425e, (m) obj, iT2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(1);
                b12.a.a(this.f136422b, this.f136424d, (Integer) this.f136425e, this.f136423c, (m) obj, iT3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(float f14, float f15, long j8, r1 r1Var, int i14, int i15) {
        this.f136421a = i15;
        this.f136422b = f14;
        this.f136423c = f15;
        this.f136424d = j8;
        this.f136425e = r1Var;
    }
}
