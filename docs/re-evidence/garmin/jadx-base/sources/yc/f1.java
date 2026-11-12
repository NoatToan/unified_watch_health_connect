package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lyc/m1$b;", "invoke", "()Lyc/m1$b;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class f1 extends p005kotlin.jvm.internal.w implements e23.a<m1.b<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1<Object> f195948a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1<Object> g1Var) {
        super(0);
        this.f195948a = g1Var;
    }

    @Override // e23.a
    public final m1.b<Object> invoke() {
        m1 m1Var = (m1) p13.h0.d0(this.f195948a.f195985c.f196024a.f195823a.b());
        if (m1Var == null || !(m1Var instanceof m1.b)) {
            return null;
        }
        m1.b<Object> bVar = (m1.b) m1Var;
        if (bVar.f196162a == c1.REFRESH) {
            return bVar;
        }
        return null;
    }
}
