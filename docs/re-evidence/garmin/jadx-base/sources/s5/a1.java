package s5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls5/a1;", "Ls5/c$a;", "", "url", "<init>", "(Ljava/lang/String;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a1 implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157127a;

    public a1(String str) {
        this.f157127a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a1) {
            return p005kotlin.jvm.internal.s.g(this.f157127a, ((a1) obj).f157127a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f157127a.hashCode();
    }

    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("UrlAnnotation(url="), this.f157127a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
