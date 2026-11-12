package e2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le2/g;", "Lg2/r;", "Le2/i0;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "beyondBoundsItemCount", "<init>", "(Le2/i0;I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements g2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f62420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62421b;

    public g(i0 i0Var, int i14) {
        this.f62420a = i0Var;
        this.f62421b = i14;
    }

    @Override // g2.r
    public final boolean a() {
        return !this.f62420a.j().e().isEmpty();
    }

    @Override // g2.r
    public final int b() {
        return Math.max(0, this.f62420a.h() - this.f62421b);
    }

    @Override // g2.r
    public final int c() {
        int i14;
        i0 i0Var = this.f62420a;
        if (i0Var.j().e().isEmpty()) {
            return 0;
        }
        int iB = z1.g.b(i0Var.j());
        int iP = xy2.b.P(i0Var.j());
        if (iP != 0 && (i14 = iB / iP) >= 1) {
            return i14;
        }
        return 1;
    }

    @Override // g2.r
    public final int d() {
        return Math.min(getItemCount() - 1, ((n) p13.h0.m0(this.f62420a.j().e())).getF62559a() + this.f62421b);
    }

    @Override // g2.r
    public final int getItemCount() {
        return this.f62420a.j().getF62554n();
    }
}
