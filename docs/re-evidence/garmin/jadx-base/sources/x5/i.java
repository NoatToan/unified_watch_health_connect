package x5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx5/i;", "Lx5/k;", "", "lengthBeforeCursor", "lengthAfterCursor", "<init>", "(II)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188865b;

    public i(int i14, int i15) {
        this.f188864a = i14;
        this.f188865b = i15;
        if (i14 >= 0 && i15 >= 0) {
            return;
        }
        y5.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i14 + " and " + i15 + " respectively.");
    }

    @Override // x5.k
    public final void a(m mVar) {
        int i14 = mVar.f188883c;
        d0 d0Var = mVar.f188881a;
        int i15 = this.f188865b;
        int iA = i14 + i15;
        if (((i14 ^ iA) & (i15 ^ iA)) < 0) {
            iA = d0Var.a();
        }
        mVar.a(mVar.f188883c, Math.min(iA, d0Var.a()));
        int i16 = mVar.f188882b;
        int i17 = this.f188864a;
        int i18 = i16 - i17;
        if (((i16 ^ i18) & (i17 ^ i16)) < 0) {
            i18 = 0;
        }
        mVar.a(Math.max(0, i18), mVar.f188882b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f188864a == iVar.f188864a && this.f188865b == iVar.f188865b;
    }

    public final int hashCode() {
        return (this.f188864a * 31) + this.f188865b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb3.append(this.f188864a);
        sb3.append(", lengthAfterCursor=");
        return ds.e0.j(sb3, this.f188865b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
