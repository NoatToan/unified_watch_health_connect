package sc0;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsc0/b;", "", "", "imageUrl", "name", "batteryLevelStatus", "lastCheckedDateFormatted", "", "batteryLevelIconResId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f158468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f158469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f158470e;

    public /* synthetic */ b(String str, String str2, String str3, String str4, Integer num, int i14, j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f158466a, bVar.f158466a) && s.g(this.f158467b, bVar.f158467b) && s.g(this.f158468c, bVar.f158468c) && s.g(this.f158469d, bVar.f158469d) && s.g(this.f158470e, bVar.f158470e);
    }

    public final int hashCode() {
        int iJ = g.j(this.f158466a.hashCode() * 31, 31, this.f158467b);
        String str = this.f158468c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f158469d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f158470e;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("SensorData(imageUrl=", this.f158466a, ", name=", this.f158467b, ", batteryLevelStatus=");
        sn.a.t(sbI, this.f158468c, ", lastCheckedDateFormatted=", this.f158469d, ", batteryLevelIconResId=");
        return f3.i(sbI, this.f158470e, ")");
    }

    public b(String str, String str2, String str3, String str4, Integer num) {
        str.getClass();
        str2.getClass();
        this.f158466a = str;
        this.f158467b = str2;
        this.f158468c = str3;
        this.f158469d = str4;
        this.f158470e = num;
    }
}
