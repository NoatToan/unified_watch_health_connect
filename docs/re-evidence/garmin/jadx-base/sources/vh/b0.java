package vh;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvh/b0;", "", "", "path", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Object> f178264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178265b;

    public b0(List<? extends Object> list, String str) {
        list.getClass();
        this.f178264a = list;
        this.f178265b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f178264a.equals(b0Var.f178264a) && p005kotlin.jvm.internal.s.g(this.f178265b, b0Var.f178265b);
    }

    public final int hashCode() {
        int iHashCode = this.f178264a.hashCode() * 31;
        String str = this.f178265b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeferredFragmentIdentifier(path=");
        sb3.append(this.f178264a);
        sb3.append(", label=");
        return androidx.room.a0.m(sb3, this.f178265b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
