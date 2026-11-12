package p5;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import o13.h;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp5/a;", "Lo13/h;", "", "T", "", "", Constants.ScionAnalytics.PARAM_LABEL, "action", "<init>", "(Ljava/lang/String;Lo13/h;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a<T extends o13.h<? extends Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f135946b;

    public a(String str, T t7) {
        this.f135945a = str;
        this.f135946b = t7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f135945a, aVar.f135945a) && p005kotlin.jvm.internal.s.g(this.f135946b, aVar.f135946b);
    }

    public final int hashCode() {
        String str = this.f135945a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t7 = this.f135946b;
        return iHashCode + (t7 != null ? t7.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f135945a + ", action=" + this.f135946b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
