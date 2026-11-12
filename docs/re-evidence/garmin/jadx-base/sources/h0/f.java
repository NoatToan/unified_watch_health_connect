package h0;

import android.util.Size;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f80466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80467b;

    public f(Size size, int i14) {
        if (size == null) {
            j20.x.l("Null resolution");
            throw null;
        }
        this.f80466a = size;
        this.f80467b = i14;
    }

    @Override // h0.e0
    public final int a() {
        return this.f80467b;
    }

    @Override // h0.e0
    public final Size b() {
        return this.f80466a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f80466a.equals(e0Var.b()) && this.f80467b == e0Var.a();
    }

    public final int hashCode() {
        return ((this.f80466a.hashCode() ^ 1000003) * 1000003) ^ this.f80467b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PostviewSettings{resolution=");
        sb3.append(this.f80466a);
        sb3.append(", inputFormat=");
        return am.j.q(sb3, this.f80467b, StringSubstitutor.DEFAULT_VAR_END);
    }
}
