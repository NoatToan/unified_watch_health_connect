package xp1;

import b71.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxp1/a;", "", "", "activityId", "", "activityName", "startTimeGMT", "startTimeLocal", "activityTypeKey", "", "activityParentTypeId", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f191847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f191848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f191849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f191850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f191851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f191852f;

    public /* synthetic */ a(Long l14, String str, String str2, String str3, String str4, Integer num, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? 0 : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f191847a, aVar.f191847a) && s.g(this.f191848b, aVar.f191848b) && s.g(this.f191849c, aVar.f191849c) && s.g(this.f191850d, aVar.f191850d) && s.g(this.f191851e, aVar.f191851e) && s.g(this.f191852f, aVar.f191852f);
    }

    public final int hashCode() {
        Long l14 = this.f191847a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f191848b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f191849c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f191850d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f191851e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f191852f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = i.j("ActivityState(activityId=", ", activityName=", this.f191848b, this.f191847a, ", startTimeGMT=");
        sn.a.t(sbJ, this.f191849c, ", startTimeLocal=", this.f191850d, ", activityTypeKey=");
        sbJ.append(this.f191851e);
        sbJ.append(", activityParentTypeId=");
        sbJ.append(this.f191852f);
        sbJ.append(")");
        return sbJ.toString();
    }

    public a(Long l14, String str, String str2, String str3, String str4, Integer num) {
        this.f191847a = l14;
        this.f191848b = str;
        this.f191849c = str2;
        this.f191850d = str3;
        this.f191851e = str4;
        this.f191852f = num;
    }

    public a() {
        this(null, null, null, null, null, null, 63, null);
    }
}
