package m4;

import ch.qos.logback.core.CoreConstants;
import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm4/c0;", "Lh5/x0;", "Lm4/f0;", "Lm4/b0;", "focusRequester", "<init>", "(Lm4/b0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class c0 extends x0<f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f116461a;

    public c0(b0 b0Var) {
        this.f116461a = b0Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new f0(this.f116461a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && p005kotlin.jvm.internal.s.g(this.f116461a, ((c0) obj).f116461a);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f116461a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "focusRequester";
        m2Var.f91343c.c(this.f116461a, "focusRequester");
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f116461a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        f0 f0Var = (f0) cVar;
        f0Var.f116465a.f116455a.j(f0Var);
        b0 b0Var = this.f116461a;
        f0Var.f116465a = b0Var;
        b0Var.f116455a.b(f0Var);
    }
}
