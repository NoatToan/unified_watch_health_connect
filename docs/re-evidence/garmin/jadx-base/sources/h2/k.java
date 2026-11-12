package h2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh2/k;", "Lg2/r;", "Lh2/j0;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "beyondViewportPageCount", "<init>", "(Lh2/j0;I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements g2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f80959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80960b;

    public k(j0 j0Var, int i14) {
        this.f80959a = j0Var;
        this.f80960b = i14;
    }

    @Override // g2.r
    public final boolean a() {
        return !this.f80959a.n().g().isEmpty();
    }

    @Override // g2.r
    public final int b() {
        return Math.max(0, this.f80959a.f80929e - this.f80960b);
    }

    @Override // g2.r
    public final int c() {
        int i14;
        j0 j0Var = this.f80959a;
        if (j0Var.n().g().size() == 0) {
            return 0;
        }
        int iZ = gg.b.z(j0Var.n());
        int f80846c = j0Var.n().getF80846c() + j0Var.n().getF80845b();
        if (f80846c != 0 && (i14 = iZ / f80846c) >= 1) {
            return i14;
        }
        return 1;
    }

    @Override // g2.r
    public final int d() {
        j0 j0Var = this.f80959a;
        return Math.min(j0Var.o() - 1, ((i) p13.h0.m0(j0Var.n().g())).getF80906a() + this.f80960b);
    }

    @Override // g2.r
    public final int getItemCount() {
        return this.f80959a.o();
    }
}
