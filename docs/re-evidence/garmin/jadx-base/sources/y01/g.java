package y01;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f192999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f193000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f193001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f193002e;

    public /* synthetic */ g(Object obj, float f14, float f15, int i14, int i15) {
        this.f192998a = i15;
        this.f193002e = obj;
        this.f192999b = f14;
        this.f193000c = f15;
        this.f193001d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f192998a) {
            case 0:
                ((Integer) obj2).intValue();
                int iT = p0.t(this.f193001d | 1);
                h.a((String) this.f193002e, this.f192999b, this.f193000c, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(this.f193001d | 1);
                z32.b.a((d42.a) this.f193002e, this.f192999b, this.f193000c, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
