package w5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw5/j0;", "Lw5/q;", "Lw5/r0;", "typeface", "<init>", "(Lw5/r0;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0 extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0 f182132g;

    public j0(r0 r0Var) {
        super(true, null);
        this.f182132g = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return p005kotlin.jvm.internal.s.g(this.f182132g, ((j0) obj).f182132g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f182132g.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f182132g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
