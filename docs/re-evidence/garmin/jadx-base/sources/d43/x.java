package d43;

import ch.qos.logback.core.CoreConstants;
import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(str);
        str.getClass();
    }

    @Override // d43.g
    public final n0 a(t23.c0 c0Var) {
        return c0Var.e().v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d43.g
    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("\""), (String) this.f57481a, CoreConstants.DOUBLE_QUOTE_CHAR);
    }
}
