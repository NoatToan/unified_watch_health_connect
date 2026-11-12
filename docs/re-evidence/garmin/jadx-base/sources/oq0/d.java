package oq0;

import c22.t;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loq0/d;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "", "formColor", "<init>", "(Ljava/lang/String;I)V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f133284b;

    public d(String str, int i14) {
        str.getClass();
        this.f133283a = str;
        this.f133284b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f133283a.equals(dVar.f133283a) && this.f133284b == dVar.f133284b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f133284b) + (this.f133283a.hashCode() * 31);
    }

    public final String toString() {
        return t.e(this.f133284b, "LegendItem(label=", this.f133283a, ", formColor=", ")");
    }
}
