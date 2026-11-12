package w51;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw51/a;", "", "", Action.KEY_ATTRIBUTE, Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182215b;

    public a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f182214a = str;
        this.f182215b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f182214a.equals(aVar.f182214a) && this.f182215b.equals(aVar.f182215b);
    }

    public final int hashCode() {
        return this.f182215b.hashCode() + (this.f182214a.hashCode() * 31);
    }

    public final String toString() {
        return v.e0.g("ActivityTypeDropdownItem(key=", this.f182214a, ", label=", this.f182215b, ")");
    }
}
