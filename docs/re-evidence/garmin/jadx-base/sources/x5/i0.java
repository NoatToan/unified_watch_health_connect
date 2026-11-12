package x5;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx5/i0;", "Lx5/k;", "", TtmlNode.START, TtmlNode.END, "<init>", "(II)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188867b;

    public i0(int i14, int i15) {
        this.f188866a = i14;
        this.f188867b = i15;
    }

    @Override // x5.k
    public final void a(m mVar) {
        boolean zE = mVar.e();
        d0 d0Var = mVar.f188881a;
        if (zE) {
            mVar.f188884d = -1;
            mVar.f188885e = -1;
        }
        int iE = j23.t.e(this.f188866a, 0, d0Var.a());
        int iE2 = j23.t.e(this.f188867b, 0, d0Var.a());
        if (iE != iE2) {
            if (iE < iE2) {
                mVar.g(iE, iE2);
            } else {
                mVar.g(iE2, iE);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f188866a == i0Var.f188866a && this.f188867b == i0Var.f188867b;
    }

    public final int hashCode() {
        return (this.f188866a * 31) + this.f188867b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SetComposingRegionCommand(start=");
        sb3.append(this.f188866a);
        sb3.append(", end=");
        return ds.e0.j(sb3, this.f188867b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
