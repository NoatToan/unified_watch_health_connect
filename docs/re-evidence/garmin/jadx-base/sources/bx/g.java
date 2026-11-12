package bx;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lbx/g;", "", "", "timestamp", "", "bodyBatteryStatus", "", "bodyBatteryLevel", "", "bodyBatteryVersion", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f21637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f21639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f21640d;

    public /* synthetic */ g(Long l14, String str, Integer num, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : d14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f21637a, gVar.f21637a) && s.g(this.f21638b, gVar.f21638b) && s.g(this.f21639c, gVar.f21639c) && s.g(this.f21640d, gVar.f21640d);
    }

    public final int hashCode() {
        Long l14 = this.f21637a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f21638b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f21639c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f21640d;
        return iHashCode3 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("BodyBatteryValue(timestamp=", ", bodyBatteryStatus=", this.f21638b, this.f21637a, ", bodyBatteryLevel=");
        sbJ.append(this.f21639c);
        sbJ.append(", bodyBatteryVersion=");
        sbJ.append(this.f21640d);
        sbJ.append(")");
        return sbJ.toString();
    }

    public g(Long l14, String str, Integer num, Double d14) {
        this.f21637a = l14;
        this.f21638b = str;
        this.f21639c = num;
        this.f21640d = d14;
    }

    public g() {
        this(null, null, null, null, 15, null);
    }
}
