package z2;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lz2/w0;", "", "Ll2/l1;", "handle", "Ln4/c;", ModelSourceWrapper.POSITION, "Lz2/v0;", "anchor", "", "visible", "<init>", "(Ll2/l1;JLz2/v0;ZLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p006l2.l1 f201832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f201833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f201834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f201835d;

    private w0(p006l2.l1 l1Var, long j8, v0 v0Var, boolean z14) {
        this.f201832a = l1Var;
        this.f201833b = j8;
        this.f201834c = v0Var;
        this.f201835d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f201832a == w0Var.f201832a && n4.c.d(this.f201833b, w0Var.f201833b) && this.f201834c == w0Var.f201834c && this.f201835d == w0Var.f201835d;
    }

    public final int hashCode() {
        int iHashCode = this.f201832a.hashCode() * 31;
        n4.c.a aVar = n4.c.f123541b;
        return Boolean.hashCode(this.f201835d) + ((this.f201834c.hashCode() + q6.f.e(iHashCode, 31, this.f201833b)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SelectionHandleInfo(handle=");
        sb3.append(this.f201832a);
        sb3.append(", position=");
        sb3.append((Object) n4.c.l(this.f201833b));
        sb3.append(", anchor=");
        sb3.append(this.f201834c);
        sb3.append(", visible=");
        return am.j.t(sb3, this.f201835d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ w0(p006l2.l1 l1Var, long j8, v0 v0Var, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(l1Var, j8, v0Var, z14);
    }
}
