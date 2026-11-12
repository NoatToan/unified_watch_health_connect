package x5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx5/j;", "Lx5/k;", "", "lengthBeforeCursor", "lengthAfterCursor", "<init>", "(II)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188869b;

    public j(int i14, int i15) {
        this.f188868a = i14;
        this.f188869b = i15;
        if (i14 >= 0 && i15 >= 0) {
            return;
        }
        y5.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i14 + " and " + i15 + " respectively.");
    }

    @Override // x5.k
    public final void a(m mVar) {
        int i14 = 0;
        for (int i15 = 0; i15 < this.f188868a; i15++) {
            int i16 = i14 + 1;
            int i17 = mVar.f188882b;
            if (i17 <= i16) {
                i14 = i17;
                break;
            }
            i14 = (Character.isHighSurrogate(mVar.b((i17 - i16) + (-1))) && Character.isLowSurrogate(mVar.b(mVar.f188882b - i16))) ? i14 + 2 : i16;
        }
        int iA = 0;
        for (int i18 = 0; i18 < this.f188869b; i18++) {
            int i19 = iA + 1;
            int i24 = mVar.f188883c;
            d0 d0Var = mVar.f188881a;
            if (i24 + i19 >= d0Var.a()) {
                iA = d0Var.a() - mVar.f188883c;
                break;
            }
            iA = (Character.isHighSurrogate(mVar.b((mVar.f188883c + i19) + (-1))) && Character.isLowSurrogate(mVar.b(mVar.f188883c + i19))) ? iA + 2 : i19;
        }
        int i25 = mVar.f188883c;
        mVar.a(i25, iA + i25);
        int i26 = mVar.f188882b;
        mVar.a(i26 - i14, i26);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f188868a == jVar.f188868a && this.f188869b == jVar.f188869b;
    }

    public final int hashCode() {
        return (this.f188868a * 31) + this.f188869b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb3.append(this.f188868a);
        sb3.append(", lengthAfterCursor=");
        return ds.e0.j(sb3, this.f188869b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
