package x5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lx5/j0;", "Lx5/k;", "Ls5/c;", "annotatedString", "", "newCursorPosition", "<init>", "(Ls5/c;I)V", "", "text", "(Ljava/lang/String;I)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.c f188870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188871b;

    public j0(String str, int i14) {
        this(new s5.c(str, null, 2, null), i14);
    }

    @Override // x5.k
    public final void a(m mVar) {
        boolean zE = mVar.e();
        s5.c cVar = this.f188870a;
        if (zE) {
            int i14 = mVar.f188884d;
            mVar.f(i14, mVar.f188885e, cVar.f157138b);
            if (cVar.f157138b.length() > 0) {
                mVar.g(i14, cVar.f157138b.length() + i14);
            }
        } else {
            int i15 = mVar.f188882b;
            mVar.f(i15, mVar.f188883c, cVar.f157138b);
            if (cVar.f157138b.length() > 0) {
                mVar.g(i15, cVar.f157138b.length() + i15);
            }
        }
        int iD = mVar.d();
        int i16 = this.f188871b;
        int iE = j23.t.e(i16 > 0 ? (iD + i16) - 1 : (iD + i16) - cVar.f157138b.length(), 0, mVar.f188881a.a());
        mVar.h(iE, iE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return p005kotlin.jvm.internal.s.g(this.f188870a.f157138b, j0Var.f188870a.f157138b) && this.f188871b == j0Var.f188871b;
    }

    public final int hashCode() {
        return (this.f188870a.f157138b.hashCode() * 31) + this.f188871b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text='");
        sb3.append(this.f188870a.f157138b);
        sb3.append("', newCursorPosition=");
        return ds.e0.j(sb3, this.f188871b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public j0(s5.c cVar, int i14) {
        this.f188870a = cVar;
        this.f188871b = i14;
    }
}
