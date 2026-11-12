package s5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Ls5/c0;", "", "Ls5/b0;", "spanStyle", "Ls5/a0;", "paragraphStyle", "<init>", "(Ls5/b0;Ls5/a0;)V", "", "includeFontPadding", "(Z)V", "Ls5/l;", "emojiSupportMatch", "(ILkotlin/jvm/internal/j;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f157153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f157154b;

    public c0(boolean z14) {
        this((b0) null, new a0(z14));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.f157154b, c0Var.f157154b) && p005kotlin.jvm.internal.s.g(this.f157153a, c0Var.f157153a);
    }

    public final int hashCode() {
        b0 b0Var = this.f157153a;
        int iHashCode = (b0Var != null ? b0Var.hashCode() : 0) * 31;
        a0 a0Var = this.f157154b;
        return iHashCode + (a0Var != null ? a0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f157153a + ", paragraphSyle=" + this.f157154b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public c0(b0 b0Var, a0 a0Var) {
        this.f157153a = b0Var;
        this.f157154b = a0Var;
    }

    public /* synthetic */ c0(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }

    public /* synthetic */ c0(int i14, p005kotlin.jvm.internal.j jVar) {
        this(i14);
    }

    private c0(int i14) {
        this((b0) null, new a0(i14, (p005kotlin.jvm.internal.j) null));
    }
}
