package p5;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp5/g;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "", "action", "<init>", "(Ljava/lang/String;Le23/a;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Boolean> f136014b;

    public g(String str, e23.a<Boolean> aVar) {
        this.f136013a = str;
        this.f136014b = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF136013a() {
        return this.f136013a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.f136013a, gVar.f136013a) && this.f136014b == gVar.f136014b;
    }

    public final int hashCode() {
        return this.f136014b.hashCode() + (this.f136013a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f136013a + ", action=" + this.f136014b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
