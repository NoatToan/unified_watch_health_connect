package x5;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx5/k0;", "Lx5/k;", "", TtmlNode.START, TtmlNode.END, "<init>", "(II)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188873b;

    public k0(int i14, int i15) {
        this.f188872a = i14;
        this.f188873b = i15;
    }

    @Override // x5.k
    public final void a(m mVar) {
        int iE = j23.t.e(this.f188872a, 0, mVar.f188881a.a());
        int iE2 = j23.t.e(this.f188873b, 0, mVar.f188881a.a());
        if (iE < iE2) {
            mVar.h(iE, iE2);
        } else {
            mVar.h(iE2, iE);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f188872a == k0Var.f188872a && this.f188873b == k0Var.f188873b;
    }

    public final int hashCode() {
        return (this.f188872a * 31) + this.f188873b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SetSelectionCommand(start=");
        sb3.append(this.f188872a);
        sb3.append(", end=");
        return ds.e0.j(sb3, this.f188873b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
