package g2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import kotlin.m2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg2/o;", "Lh5/x0;", "Lg2/q;", "Lg2/r;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lg2/n;", "beyondBoundsInfo", "", "reverseLayout", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "<init>", "(Lg2/r;Lg2/n;ZLy1/b2;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class o extends h5.x0<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f75190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f75191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p008y1.b2 f75193d;

    public o(r rVar, n nVar, boolean z14, p008y1.b2 b2Var) {
        this.f75190a = rVar;
        this.f75191b = nVar;
        this.f75192c = z14;
        this.f75193d = b2Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new q(this.f75190a, this.f75191b, this.f75192c, this.f75193d);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.f75190a, oVar.f75190a) && p005kotlin.jvm.internal.s.g(this.f75191b, oVar.f75191b) && this.f75192c == oVar.f75192c && this.f75193d == oVar.f75193d;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f75193d.hashCode() + q6.f.g((this.f75191b.hashCode() + (this.f75190a.hashCode() * 31)) * 31, 31, this.f75192c);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        q qVar = (q) cVar;
        qVar.f75201a = this.f75190a;
        qVar.f75202b = this.f75191b;
        qVar.f75203c = this.f75192c;
        qVar.f75204d = this.f75193d;
    }
}
