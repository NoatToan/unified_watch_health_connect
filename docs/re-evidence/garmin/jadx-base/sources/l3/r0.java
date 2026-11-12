package l3;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll3/r0;", "T", "Lh5/x0;", "Ll3/t0;", "Ly1/r;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function2;", "Lg6/m;", "Lg6/a;", "Lo13/p;", "Ly1/w0;", "anchors", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "<init>", "(Ly1/r;Le23/p;Ly1/b2;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class r0<T> extends h5.x0<t0<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p008y1.r<T> f109410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<g6.m, g6.a, o13.p<p008y1.w0<T>, T>> f109411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p008y1.b2 f109412c;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(p008y1.r<T> rVar, e23.p<? super g6.m, ? super g6.a, ? extends o13.p<? extends p008y1.w0<T>, ? extends T>> pVar, p008y1.b2 b2Var) {
        this.f109410a = rVar;
        this.f109411b = pVar;
        this.f109412c = b2Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new t0(this.f109410a, this.f109411b, this.f109412c);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return p005kotlin.jvm.internal.s.g(this.f109410a, r0Var.f109410a) && this.f109411b == r0Var.f109411b && this.f109412c == r0Var.f109412c;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f109412c.hashCode() + ((this.f109411b.hashCode() + (this.f109410a.hashCode() * 31)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        i5.k2.a aVar = kotlin.k2.f91249a;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        t0 t0Var = (t0) cVar;
        t0Var.f109420a = this.f109410a;
        t0Var.f109421b = this.f109411b;
        t0Var.f109422c = this.f109412c;
    }
}
