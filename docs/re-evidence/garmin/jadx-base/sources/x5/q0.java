package x5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx5/q0;", "", "Ls5/c;", "text", "Lx5/c0;", "offsetMapping", "<init>", "(Ls5/c;Lx5/c0;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.c f188939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f188940b;

    public q0(s5.c cVar, c0 c0Var) {
        this.f188939a = cVar;
        this.f188940b = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return p005kotlin.jvm.internal.s.g(this.f188939a, q0Var.f188939a) && p005kotlin.jvm.internal.s.g(this.f188940b, q0Var.f188940b);
    }

    public final int hashCode() {
        return this.f188940b.hashCode() + (this.f188939a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f188939a) + ", offsetMapping=" + this.f188940b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
