package x5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx5/f0;", "", "", "privateImeOptions", "<init>", "(Ljava/lang/String;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188836a;

    public /* synthetic */ f0(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return p005kotlin.jvm.internal.s.g(this.f188836a, ((f0) obj).f188836a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f188836a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("PlatformImeOptions(privateImeOptions="), this.f188836a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public f0(String str) {
        this.f188836a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
