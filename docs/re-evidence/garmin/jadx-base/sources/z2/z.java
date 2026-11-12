package z2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lz2/z;", "", "", "selectableId", "", "slot", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Ls5/q0;", "textLayoutResult", "<init>", "(JIIIILs5/q0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f201848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f201849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f201850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f201851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f201852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s5.q0 f201853f;

    public z(long j8, int i14, int i15, int i16, int i17, s5.q0 q0Var) {
        this.f201848a = j8;
        this.f201849b = i14;
        this.f201850c = i15;
        this.f201851d = i16;
        this.f201852e = i17;
        this.f201853f = q0Var;
    }

    public final b0.a a(int i14) {
        return new b0.a(w3.x.n(this.f201853f, i14), i14, this.f201848a);
    }

    public final g b() {
        int i14 = this.f201850c;
        int i15 = this.f201851d;
        if (i14 < i15) {
            return g.NOT_CROSSED;
        }
        return i14 > i15 ? g.CROSSED : g.COLLAPSED;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SelectionInfo(id=");
        sb3.append(this.f201848a);
        sb3.append(", range=(");
        int i14 = this.f201850c;
        sb3.append(i14);
        sb3.append('-');
        s5.q0 q0Var = this.f201853f;
        sb3.append(w3.x.n(q0Var, i14));
        sb3.append(CoreConstants.COMMA_CHAR);
        int i15 = this.f201851d;
        sb3.append(i15);
        sb3.append('-');
        sb3.append(w3.x.n(q0Var, i15));
        sb3.append("), prevOffset=");
        return ds.e0.j(sb3, this.f201852e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
