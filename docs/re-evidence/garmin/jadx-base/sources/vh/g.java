package vh;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvh/g;", "Lvh/i;", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178321a;

    public g(String str) {
        super(null);
        this.f178321a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && p005kotlin.jvm.internal.s.g(this.f178321a, ((g) obj).f178321a);
    }

    public final int hashCode() {
        String str = this.f178321a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.room.a0.m(new StringBuilder("BLabel(label="), this.f178321a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
