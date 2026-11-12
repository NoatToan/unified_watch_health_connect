package u1;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;
import p008y1.e3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lu1/e2;", "Lh5/x0;", "Lu1/f2;", "Ly1/e3;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "", "enabled", "reverseScrolling", "Ly1/e1;", "flingBehavior", "La2/j;", "interactionSource", "Ly1/x;", "bringIntoViewSpec", "useLocalOverscrollFactory", "Lu1/r1;", "overscrollEffect", "<init>", "(Ly1/e3;Ly1/b2;ZZLy1/e1;La2/j;Ly1/x;ZLu1/r1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class e2 extends h5.x0<f2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f167460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p008y1.b2 f167461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f167463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p008y1.e1 f167464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2.j f167465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p008y1.x f167466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f167467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r1 f167468i;

    public e2(e3 e3Var, p008y1.b2 b2Var, boolean z14, boolean z15, p008y1.e1 e1Var, a2.j jVar, p008y1.x xVar, boolean z16, r1 r1Var) {
        this.f167460a = e3Var;
        this.f167461b = b2Var;
        this.f167462c = z14;
        this.f167463d = z15;
        this.f167464e = e1Var;
        this.f167465f = jVar;
        this.f167466g = xVar;
        this.f167467h = z16;
        this.f167468i = r1Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new f2(this.f167460a, this.f167461b, this.f167462c, this.f167463d, this.f167464e, this.f167465f, this.f167466g, this.f167467h, this.f167468i);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e2.class != obj.getClass()) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return p005kotlin.jvm.internal.s.g(this.f167460a, e2Var.f167460a) && this.f167461b == e2Var.f167461b && this.f167462c == e2Var.f167462c && this.f167463d == e2Var.f167463d && p005kotlin.jvm.internal.s.g(this.f167464e, e2Var.f167464e) && p005kotlin.jvm.internal.s.g(this.f167465f, e2Var.f167465f) && p005kotlin.jvm.internal.s.g(this.f167466g, e2Var.f167466g) && this.f167467h == e2Var.f167467h && p005kotlin.jvm.internal.s.g(this.f167468i, e2Var.f167468i);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iG = q6.f.g(q6.f.g((this.f167461b.hashCode() + (this.f167460a.hashCode() * 31)) * 31, 31, this.f167462c), 31, this.f167463d);
        p008y1.e1 e1Var = this.f167464e;
        int iHashCode = (iG + (e1Var != null ? e1Var.hashCode() : 0)) * 31;
        a2.j jVar = this.f167465f;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        p008y1.x xVar = this.f167466g;
        int iG2 = q6.f.g((iHashCode2 + (xVar != null ? xVar.hashCode() : 0)) * 31, 31, this.f167467h);
        r1 r1Var = this.f167468i;
        return iG2 + (r1Var != null ? r1Var.hashCode() : 0);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "scrollableArea";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f167460a, RemoteConfigConstants.ResponseFieldKey.STATE);
        v3Var.c(this.f167461b, ModelSourceWrapper.ORIENTATION);
        if (!this.f167467h) {
            v3Var.c(this.f167468i, "overscrollEffect");
        }
        v3Var.c(Boolean.valueOf(this.f167462c), "enabled");
        v3Var.c(Boolean.valueOf(this.f167463d), "reverseScrolling");
        v3Var.c(this.f167464e, "flingBehavior");
        v3Var.c(this.f167465f, "interactionSource");
        v3Var.c(this.f167466g, "bringIntoViewSpec");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((f2) cVar).Z1(this.f167460a, this.f167461b, this.f167467h, this.f167462c, this.f167464e, this.f167465f, this.f167466g, this.f167463d, this.f167468i);
    }
}
