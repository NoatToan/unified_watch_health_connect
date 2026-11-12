package v2;

import ch.qos.logback.core.CoreConstants;
import kotlin.m2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lv2/w0;", "Lh5/x0;", "Lv2/y0;", "Lv2/b1;", "serviceAdapter", "Ll2/b2;", "legacyTextFieldState", "Lz2/h2;", "textFieldSelectionManager", "<init>", "(Lv2/b1;Ll2/b2;Lz2/h2;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class w0 extends h5.x0<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f175189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p006l2.b2 f175190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z2.h2 f175191c;

    public w0(b1 b1Var, p006l2.b2 b2Var, z2.h2 h2Var) {
        this.f175189a = b1Var;
        this.f175190b = b2Var;
        this.f175191c = h2Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new y0(this.f175189a, this.f175190b, this.f175191c);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return p005kotlin.jvm.internal.s.g(this.f175189a, w0Var.f175189a) && p005kotlin.jvm.internal.s.g(this.f175190b, w0Var.f175190b) && p005kotlin.jvm.internal.s.g(this.f175191c, w0Var.f175191c);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f175191c.hashCode() + ((this.f175190b.hashCode() + (this.f175189a.hashCode() * 31)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f175189a + ", legacyTextFieldState=" + this.f175190b + ", textFieldSelectionManager=" + this.f175191c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        y0 y0Var = (y0) cVar;
        if (y0Var.getIsAttached()) {
            ((b) y0Var.f175264a).b();
            y0Var.f175264a.j(y0Var);
        }
        y0Var.f175264a = this.f175189a;
        if (y0Var.getIsAttached()) {
            b1 b1Var = y0Var.f175264a;
            if (b1Var.f174890a != null) {
                b2.e.c("Expected textInputModifierNode to be null");
            }
            b1Var.f174890a = y0Var;
        }
        y0Var.f175265b = this.f175190b;
        y0Var.f175266c = this.f175191c;
    }
}
