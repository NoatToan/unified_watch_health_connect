package s5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls5/b1;", "Ls5/z0;", "", "verbatim", "<init>", "(Ljava/lang/String;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b1 extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157136a;

    public b1(String str) {
        super(null);
        this.f157136a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            return p005kotlin.jvm.internal.s.g(this.f157136a, ((b1) obj).f157136a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f157136a.hashCode();
    }

    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f157136a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
