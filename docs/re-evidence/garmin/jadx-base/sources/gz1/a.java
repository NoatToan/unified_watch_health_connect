package gz1;

import b71.i;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lgz1/a;", "", "", "isEventTimeBased", "", "eventDistanceOrTime", "eventDistanceUnit", "goalTime", "goalDistance", "goalSpeed", "goalPace", "", "timeInSeconds", "", "paceInSeconds", "distanceInMeters", "", "defaultDurationTime", "speedInMps", "time", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;JLjava/lang/Double;Ljava/lang/Integer;DJ)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f80408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f80411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f80412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f80413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f80414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f80415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f80416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f80417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f80418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final double f80419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f80420m;

    public /* synthetic */ a(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, Double d14, long j8, Double d15, Integer num, double d16, long j14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : d14, (i14 & 256) != 0 ? 600L : j8, (i14 & 512) == 0 ? d15 : null, (i14 & 1024) != 0 ? 1740 : num, (i14 & 2048) != 0 ? 0.0d : d16, (i14 & 4096) != 0 ? 10000L : j14);
    }

    public static a a(a aVar, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, Double d14, long j8, Double d15, Integer num, double d16, long j14, int i14) {
        Boolean bool2 = (i14 & 1) != 0 ? aVar.f80408a : bool;
        String str7 = (i14 & 2) != 0 ? aVar.f80409b : str;
        String str8 = (i14 & 4) != 0 ? aVar.f80410c : str2;
        String str9 = (i14 & 8) != 0 ? aVar.f80411d : str3;
        String str10 = (i14 & 16) != 0 ? aVar.f80412e : str4;
        String str11 = (i14 & 32) != 0 ? aVar.f80413f : str5;
        String str12 = (i14 & 64) != 0 ? aVar.f80414g : str6;
        Double d17 = (i14 & 128) != 0 ? aVar.f80415h : d14;
        long j15 = (i14 & 256) != 0 ? aVar.f80416i : j8;
        Double d18 = (i14 & 512) != 0 ? aVar.f80417j : d15;
        Integer num2 = (i14 & 1024) != 0 ? aVar.f80418k : num;
        double d19 = (i14 & 2048) != 0 ? aVar.f80419l : d16;
        Boolean bool3 = bool2;
        long j16 = (i14 & 4096) != 0 ? aVar.f80420m : j14;
        aVar.getClass();
        return new a(bool3, str7, str8, str9, str10, str11, str12, d17, j15, d18, num2, d19, j16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f80408a, aVar.f80408a) && s.g(this.f80409b, aVar.f80409b) && s.g(this.f80410c, aVar.f80410c) && s.g(this.f80411d, aVar.f80411d) && s.g(this.f80412e, aVar.f80412e) && s.g(this.f80413f, aVar.f80413f) && s.g(this.f80414g, aVar.f80414g) && s.g(this.f80415h, aVar.f80415h) && this.f80416i == aVar.f80416i && s.g(this.f80417j, aVar.f80417j) && s.g(this.f80418k, aVar.f80418k) && Double.compare(this.f80419l, aVar.f80419l) == 0 && this.f80420m == aVar.f80420m;
    }

    public final int hashCode() {
        Boolean bool = this.f80408a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f80409b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f80410c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f80411d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f80412e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f80413f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f80414g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d14 = this.f80415h;
        int iE = f.e((iHashCode7 + (d14 == null ? 0 : d14.hashCode())) * 31, 31, this.f80416i);
        Double d15 = this.f80417j;
        int iHashCode8 = (iE + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num = this.f80418k;
        return Long.hashCode(this.f80420m) + e.b((iHashCode8 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f80419l);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EventGoalDetailsUIModel(isEventTimeBased=");
        sb3.append(this.f80408a);
        sb3.append(", eventDistanceOrTime=");
        sb3.append(this.f80409b);
        sb3.append(", eventDistanceUnit=");
        sn.a.t(sb3, this.f80410c, ", goalTime=", this.f80411d, ", goalDistance=");
        sn.a.t(sb3, this.f80412e, ", goalSpeed=", this.f80413f, ", goalPace=");
        i.x(sb3, this.f80414g, ", timeInSeconds=", this.f80415h, ", paceInSeconds=");
        sb3.append(this.f80416i);
        sb3.append(", distanceInMeters=");
        sb3.append(this.f80417j);
        sb3.append(", defaultDurationTime=");
        sb3.append(this.f80418k);
        sb3.append(", speedInMps=");
        sb3.append(this.f80419l);
        return com.nimbusds.jose.shaded.gson.internal.a.g(this.f80420m, ", time=", ")", sb3);
    }

    public a(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, Double d14, long j8, Double d15, Integer num, double d16, long j14) {
        this.f80408a = bool;
        this.f80409b = str;
        this.f80410c = str2;
        this.f80411d = str3;
        this.f80412e = str4;
        this.f80413f = str5;
        this.f80414g = str6;
        this.f80415h = d14;
        this.f80416i = j8;
        this.f80417j = d15;
        this.f80418k = num;
        this.f80419l = d16;
        this.f80420m = j14;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, 0L, null, null, 0.0d, 0L, 8191, null);
    }
}
