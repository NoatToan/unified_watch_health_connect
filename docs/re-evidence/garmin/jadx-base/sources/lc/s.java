package lc;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Llc/s;", "", "", "destinationId", "Llc/o0;", "navOptions", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "defaultArguments", "<init>", "(ILlc/o0;Landroid/os/Bundle;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f111864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f111865c;

    public /* synthetic */ s(int i14, o0 o0Var, Bundle bundle, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? null : o0Var, (i15 & 4) != 0 ? null : bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f111863a != sVar.f111863a || !p005kotlin.jvm.internal.s.g(this.f111864b, sVar.f111864b)) {
            return false;
        }
        Bundle bundle = this.f111865c;
        Bundle bundle2 = sVar.f111865c;
        if (p005kotlin.jvm.internal.s.g(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !gl.b.j(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f111863a) * 31;
        o0 o0Var = this.f111864b;
        int iHashCode2 = iHashCode + (o0Var != null ? o0Var.hashCode() : 0);
        Bundle bundle = this.f111865c;
        if (bundle != null) {
            return gl.b.k(bundle) + (iHashCode2 * 31);
        }
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(s.class.getSimpleName());
        sb3.append("(0x");
        sb3.append(Integer.toHexString(this.f111863a));
        sb3.append(")");
        if (this.f111864b != null) {
            sb3.append(" navOptions=");
            sb3.append(this.f111864b);
        }
        return sb3.toString();
    }

    public s(int i14, o0 o0Var) {
        this(i14, o0Var, null, 4, null);
    }

    public s(int i14, o0 o0Var, Bundle bundle) {
        this.f111863a = i14;
        this.f111864b = o0Var;
        this.f111865c = bundle;
    }

    public s(int i14) {
        this(i14, null, null, 6, null);
    }
}
