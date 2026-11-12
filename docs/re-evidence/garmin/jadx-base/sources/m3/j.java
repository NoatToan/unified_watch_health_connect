package m3;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import h5.x0;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm3/j;", "Lh5/x0;", "Lm3/o;", "", "isRefreshing", "Lkotlin/Function0;", "", "onRefresh", "enabled", "Lm3/r;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lg6/f;", "threshold", "<init>", "(ZLe23/a;ZLm3/r;FLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends x0<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f116258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f116259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f116260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f116261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f116262e;

    private j(boolean z14, e23.a<Unit> aVar, boolean z15, r rVar, float f14) {
        this.f116258a = z14;
        this.f116259b = aVar;
        this.f116260c = z15;
        this.f116261d = rVar;
        this.f116262e = f14;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new o(this.f116258a, this.f116259b, this.f116260c, this.f116261d, this.f116262e, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f116258a == jVar.f116258a && this.f116260c == jVar.f116260c && this.f116259b == jVar.f116259b && p005kotlin.jvm.internal.s.g(this.f116261d, jVar.f116261d) && g6.f.c(this.f116262e, jVar.f116262e);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = (this.f116261d.hashCode() + q6.f.f(q6.f.g(Boolean.hashCode(this.f116258a) * 31, 31, this.f116260c), 31, this.f116259b)) * 31;
        g6.f.a aVar = g6.f.f75994b;
        return Float.hashCode(this.f116262e) + iHashCode;
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "PullToRefreshModifierNode";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(Boolean.valueOf(this.f116258a), "isRefreshing");
        v3Var.c(this.f116259b, "onRefresh");
        v3Var.c(Boolean.valueOf(this.f116260c), "enabled");
        v3Var.c(this.f116261d, RemoteConfigConstants.ResponseFieldKey.STATE);
        v3Var.c(g6.f.a(this.f116262e), "threshold");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        o oVar = (o) cVar;
        oVar.f116278d = this.f116259b;
        oVar.f116279e = this.f116260c;
        oVar.f116280f = this.f116261d;
        oVar.f116281g = this.f116262e;
        boolean z14 = oVar.f116277c;
        boolean z15 = this.f116258a;
        if (z14 != z15) {
            oVar.f116277c = z15;
            ge1.b.T(oVar.getCoroutineScope(), null, null, new q(oVar, null), 3);
        }
    }

    public /* synthetic */ j(boolean z14, e23.a aVar, boolean z15, r rVar, float f14, p005kotlin.jvm.internal.j jVar) {
        this(z14, aVar, z15, rVar, f14);
    }
}
