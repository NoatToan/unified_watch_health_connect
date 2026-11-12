package b;

import androidx.lifecycle.n0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb/t;", "Lwc/g;", "Lb/s;", "callback", "Landroidx/lifecycle/n0;", "owner", "<init>", "(Lb/s;Landroidx/lifecycle/n0;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class t extends wc.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f13822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f13823b;

    public t(s sVar, n0 n0Var) {
        sVar.getClass();
        this.f13822a = sVar;
        this.f13823b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f13822a, tVar.f13822a) && p005kotlin.jvm.internal.s.g(this.f13823b, tVar.f13823b);
    }

    public final int hashCode() {
        int iHashCode = this.f13822a.hashCode() * 31;
        n0 n0Var = this.f13823b;
        return iHashCode + (n0Var == null ? 0 : n0Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f13822a + ", owner=" + this.f13823b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ t(s sVar, n0 n0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(sVar, (i14 & 2) != 0 ? null : n0Var);
    }
}
