package p008y1;

import a2.j;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import h4.r;
import h5.x0;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;
import u1.r1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly1/s2;", "Lh5/x0;", "Ly1/a3;", "Ly1/e3;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "Lu1/r1;", "overscrollEffect", "", "enabled", "reverseDirection", "Ly1/e1;", "flingBehavior", "La2/j;", "interactionSource", "Ly1/x;", "bringIntoViewSpec", "<init>", "(Ly1/e3;Ly1/b2;Lu1/r1;ZZLy1/e1;La2/j;Ly1/x;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class s2 extends x0<a3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f193631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f193632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f193633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f193634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f193635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1 f193636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f193637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f193638h;

    public s2(e3 e3Var, b2 b2Var, r1 r1Var, boolean z14, boolean z15, e1 e1Var, j jVar, x xVar) {
        this.f193631a = e3Var;
        this.f193632b = b2Var;
        this.f193633c = r1Var;
        this.f193634d = z14;
        this.f193635e = z15;
        this.f193636f = e1Var;
        this.f193637g = jVar;
        this.f193638h = xVar;
    }

    @Override // h5.x0
    public final r.c create() {
        return new a3(this.f193631a, this.f193633c, this.f193636f, this.f193632b, this.f193634d, this.f193635e, this.f193637g, this.f193638h);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return s.g(this.f193631a, s2Var.f193631a) && this.f193632b == s2Var.f193632b && s.g(this.f193633c, s2Var.f193633c) && this.f193634d == s2Var.f193634d && this.f193635e == s2Var.f193635e && s.g(this.f193636f, s2Var.f193636f) && s.g(this.f193637g, s2Var.f193637g) && s.g(this.f193638h, s2Var.f193638h);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = (this.f193632b.hashCode() + (this.f193631a.hashCode() * 31)) * 31;
        r1 r1Var = this.f193633c;
        int iG = f.g(f.g((iHashCode + (r1Var != null ? r1Var.hashCode() : 0)) * 31, 31, this.f193634d), 31, this.f193635e);
        e1 e1Var = this.f193636f;
        int iHashCode2 = (iG + (e1Var != null ? e1Var.hashCode() : 0)) * 31;
        j jVar = this.f193637g;
        int iHashCode3 = (iHashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        x xVar = this.f193638h;
        return iHashCode3 + (xVar != null ? xVar.hashCode() : 0);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "scrollable";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f193632b, ModelSourceWrapper.ORIENTATION);
        v3Var.c(this.f193631a, RemoteConfigConstants.ResponseFieldKey.STATE);
        v3Var.c(this.f193633c, "overscrollEffect");
        v3Var.c(Boolean.valueOf(this.f193634d), "enabled");
        v3Var.c(Boolean.valueOf(this.f193635e), "reverseDirection");
        v3Var.c(this.f193636f, "flingBehavior");
        v3Var.c(this.f193637g, "interactionSource");
        v3Var.c(this.f193638h, "bringIntoViewSpec");
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        ((a3) cVar).p2(this.f193631a, this.f193632b, this.f193633c, this.f193634d, this.f193635e, this.f193636f, this.f193637g, this.f193638h);
    }
}
