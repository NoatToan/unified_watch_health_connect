package l3;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll3/q0;", "T", "Lh5/x0;", "Ll3/s0;", "Ll3/m;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function2;", "Lg6/m;", "Lg6/a;", "Lo13/p;", "Ll3/o0;", "anchors", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "<init>", "(Ll3/m;Le23/p;Ly1/b2;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class q0<T> extends h5.x0<s0<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m<T> f109386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<g6.m, g6.a, o13.p<o0<T>, T>> f109387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p008y1.b2 f109388c;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(m<T> mVar, e23.p<? super g6.m, ? super g6.a, ? extends o13.p<? extends o0<T>, ? extends T>> pVar, p008y1.b2 b2Var) {
        this.f109386a = mVar;
        this.f109387b = pVar;
        this.f109388c = b2Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new s0(this.f109386a, this.f109387b, this.f109388c);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return p005kotlin.jvm.internal.s.g(this.f109386a, q0Var.f109386a) && this.f109387b == q0Var.f109387b && this.f109388c == q0Var.f109388c;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f109388c.hashCode() + ((this.f109387b.hashCode() + (this.f109386a.hashCode() * 31)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        i5.k2.a aVar = kotlin.k2.f91249a;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        s0 s0Var = (s0) cVar;
        s0Var.f109415a = this.f109386a;
        s0Var.f109416b = this.f109387b;
        s0Var.f109417c = this.f109388c;
    }
}
