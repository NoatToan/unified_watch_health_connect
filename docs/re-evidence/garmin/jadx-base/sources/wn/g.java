package wn;

import am.j;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwn/g;", "", "", "value", "uom", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f186102c;

    public g(String str, String str2, String str3) {
        str3.getClass();
        this.f186100a = str;
        this.f186101b = str2;
        this.f186102c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f186100a, gVar.f186100a) && s.g(this.f186101b, gVar.f186101b) && s.g(this.f186102c, gVar.f186102c);
    }

    public final int hashCode() {
        String str = this.f186100a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f186101b;
        return this.f186102c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return j.o(this.f186102c, ")", p6.b.i("StatsCell(value=", this.f186100a, ", uom=", this.f186101b, ", label="));
    }

    public /* synthetic */ g(String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, str3);
    }
}
