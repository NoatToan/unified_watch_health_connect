package c2;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc2/g;", "Lc2/k3;", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "name", "<init>", "(ILjava/lang/String;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.c2 f22655d = p3.p0.n(c7.e.f25189e);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.c2 f22656e = p3.p0.n(Boolean.TRUE);

    public g(int i14, String str) {
        this.f22653b = i14;
        this.f22654c = str;
    }

    @Override // c2.k3
    public final int a(g6.c cVar) {
        return e().f25191b;
    }

    @Override // c2.k3
    public final int b(g6.c cVar, g6.o oVar) {
        return e().f25190a;
    }

    @Override // c2.k3
    public final int c(g6.c cVar) {
        return e().f25193d;
    }

    @Override // c2.k3
    public final int d(g6.c cVar, g6.o oVar) {
        return e().f25192c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c7.e e() {
        return (c7.e) this.f22655d.getF182175a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f22653b == ((g) obj).f22653b;
        }
        return false;
    }

    public final void f(boolean z14) {
        this.f22656e.setValue(Boolean.valueOf(z14));
    }

    public final void g(androidx.core.view.m1 m1Var, int i14) {
        int i15 = this.f22653b;
        if (i14 == 0 || (i14 & i15) != 0) {
            this.f22655d.setValue(m1Var.f6508a.i(i15));
            f(m1Var.f6508a.u(i15));
        }
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF22653b() {
        return this.f22653b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f22654c);
        sb3.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb3.append(e().f25190a);
        sb3.append(", ");
        sb3.append(e().f25191b);
        sb3.append(", ");
        sb3.append(e().f25192c);
        sb3.append(", ");
        return ds.e0.j(sb3, e().f25193d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
