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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B[\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly1/c;", "T", "Lh5/x0;", "Ly1/p;", "Ly1/r;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "", "enabled", "reverseDirection", "La2/j;", "interactionSource", "startDragImmediately", "Lu1/r1;", "overscrollEffect", "Ly1/e1;", "flingBehavior", "<init>", "(Ly1/r;Ly1/b2;ZLjava/lang/Boolean;La2/j;Ljava/lang/Boolean;Lu1/r1;Ly1/e1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class c<T> extends x0<p<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r<T> f193111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f193112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f193113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f193114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f193115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f193116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r1 f193117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1 f193118h;

    public /* synthetic */ c(r rVar, b2 b2Var, boolean z14, Boolean bool, j jVar, Boolean bool2, r1 r1Var, e1 e1Var, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(rVar, b2Var, z14, bool, jVar, (i14 & 32) != 0 ? null : bool2, r1Var, (i14 & 128) != 0 ? null : e1Var);
    }

    @Override // h5.x0
    public final r.c create() {
        return new p(this.f193111a, this.f193112b, this.f193113c, this.f193114d, this.f193115e, this.f193117g, this.f193116f, this.f193118h);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f193111a, cVar.f193111a) && this.f193112b == cVar.f193112b && this.f193113c == cVar.f193113c && s.g(this.f193114d, cVar.f193114d) && s.g(this.f193115e, cVar.f193115e) && s.g(this.f193116f, cVar.f193116f) && s.g(this.f193117g, cVar.f193117g) && s.g(this.f193118h, cVar.f193118h);
    }

    @Override // h5.x0
    public final int hashCode() {
        int iG = f.g((this.f193112b.hashCode() + (this.f193111a.hashCode() * 31)) * 31, 31, this.f193113c);
        Boolean bool = this.f193114d;
        int iHashCode = (iG + (bool != null ? bool.hashCode() : 0)) * 31;
        j jVar = this.f193115e;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        Boolean bool2 = this.f193116f;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        r1 r1Var = this.f193117g;
        int iHashCode4 = (iHashCode3 + (r1Var != null ? r1Var.hashCode() : 0)) * 31;
        e1 e1Var = this.f193118h;
        return iHashCode4 + (e1Var != null ? e1Var.hashCode() : 0);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "anchoredDraggable";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f193111a, RemoteConfigConstants.ResponseFieldKey.STATE);
        v3Var.c(this.f193112b, ModelSourceWrapper.ORIENTATION);
        v3Var.c(Boolean.valueOf(this.f193113c), "enabled");
        v3Var.c(this.f193114d, "reverseDirection");
        v3Var.c(this.f193115e, "interactionSource");
        v3Var.c(this.f193116f, "startDragImmediately");
        v3Var.c(this.f193117g, "overscrollEffect");
        v3Var.c(this.f193118h, "flingBehavior");
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        boolean z14;
        boolean z15;
        p pVar = (p) cVar;
        e1 e1Var = this.f193118h;
        pVar.C = e1Var;
        r<T> rVar = pVar.f193507x;
        r<T> rVar2 = this.f193111a;
        if (s.g(rVar, rVar2)) {
            z14 = false;
        } else {
            pVar.f193507x = rVar2;
            pVar.s2(e1Var);
            z14 = true;
        }
        b2 b2Var = pVar.f193508y;
        b2 b2Var2 = this.f193112b;
        if (b2Var != b2Var2) {
            pVar.f193508y = b2Var2;
            z14 = true;
        }
        Boolean bool = pVar.f193509z;
        Boolean bool2 = this.f193114d;
        if (s.g(bool, bool2)) {
            z15 = z14;
        } else {
            pVar.f193509z = bool2;
            z15 = true;
        }
        pVar.B = this.f193116f;
        pVar.A = this.f193117g;
        pVar.o2(pVar.f193517d, this.f193113c, this.f193115e, b2Var2, z15);
    }

    public c(r<T> rVar, b2 b2Var, boolean z14, Boolean bool, j jVar, Boolean bool2, r1 r1Var, e1 e1Var) {
        this.f193111a = rVar;
        this.f193112b = b2Var;
        this.f193113c = z14;
        this.f193114d = bool;
        this.f193115e = jVar;
        this.f193116f = bool2;
        this.f193117g = r1Var;
        this.f193118h = e1Var;
    }
}
