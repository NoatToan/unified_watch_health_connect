package u1;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu1/g2;", "Lh5/x0;", "Lu1/c2;", "Lu1/d2;", "scrollState", "", "reverseScrolling", "isVertical", "<init>", "(Lu1/d2;ZZ)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g2 extends h5.x0<c2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f167513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167515c;

    public g2(d2 d2Var, boolean z14, boolean z15) {
        this.f167513a = d2Var;
        this.f167514b = z14;
        this.f167515c = z15;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new c2(this.f167513a, this.f167514b, this.f167515c);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return p005kotlin.jvm.internal.s.g(this.f167513a, g2Var.f167513a) && this.f167514b == g2Var.f167514b && this.f167515c == g2Var.f167515c;
    }

    @Override // h5.x0
    public final int hashCode() {
        return Boolean.hashCode(this.f167515c) + q6.f.g(this.f167513a.hashCode() * 31, 31, this.f167514b);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "scroll";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f167513a, RemoteConfigConstants.ResponseFieldKey.STATE);
        v3Var.c(Boolean.valueOf(this.f167514b), "reverseScrolling");
        v3Var.c(Boolean.valueOf(this.f167515c), "isVertical");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        c2 c2Var = (c2) cVar;
        c2Var.f167421a = this.f167513a;
        c2Var.f167422b = this.f167514b;
        c2Var.f167423c = this.f167515c;
    }
}
