package f40;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf40/g;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "contentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68857b;

    public g(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f68856a = str;
        this.f68857b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f68856a.equals(gVar.f68856a) && this.f68857b.equals(gVar.f68857b);
    }

    public final int hashCode() {
        return this.f68857b.hashCode() + (this.f68856a.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("SpeedPaceLabel(label=", this.f68856a, ", contentDescription=", this.f68857b, ")");
    }
}
