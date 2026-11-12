package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls1/q;", "vector", "Lo4/d0;", "invoke-vNxB06k", "(Ls1/q;)J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
public final class j0 extends p005kotlin.jvm.internal.w implements e23.l<s1.q, o4.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p4.c f149126a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p4.c cVar) {
        super(1);
        this.f149126a = cVar;
    }

    @Override // e23.l
    public final o4.d0 invoke(s1.q qVar) {
        s1.q qVar2 = qVar;
        float f14 = qVar2.f155696b;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        float f15 = qVar2.f155697c;
        if (f15 < -0.5f) {
            f15 = -0.5f;
        }
        if (f15 > 0.5f) {
            f15 = 0.5f;
        }
        float f16 = qVar2.f155698d;
        float f17 = f16 >= -0.5f ? f16 : -0.5f;
        float f18 = f17 <= 0.5f ? f17 : 0.5f;
        float f19 = qVar2.f155695a;
        float f22 = f19 >= 0.0f ? f19 : 0.0f;
        float f24 = f22 <= 1.0f ? f22 : 1.0f;
        p4.e.f135544a.getClass();
        return o4.d0.a(o4.d0.b(o4.f0.a(f14, f15, f18, f24, p4.e.f135568y), this.f149126a));
    }
}
