package rm1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lrm1/e;", "", "", "userProfilePk", "Lrm1/g;", "skinTempSummary", "", "skinTempReadings", "", "startTimestampGMT", "endTimestamp", "startTimestampLocal", "endTimestampLocal", "sleepStartTimestampGMT", "sleepEndTimestampGMT", "sleepStartTimestampLocal", "sleepEndTimestampLocal", "<init>", "(Ljava/lang/Long;Lrm1/g;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f153544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f153545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Object> f153546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f153547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f153548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f153549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f153550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f153551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f153552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f153553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f153554k;

    public /* synthetic */ e(Long l14, g gVar, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : gVar, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : str5, (i14 & 256) != 0 ? null : str6, (i14 & 512) != 0 ? null : str7, (i14 & 1024) != 0 ? null : str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f153544a, eVar.f153544a) && s.g(this.f153545b, eVar.f153545b) && s.g(this.f153546c, eVar.f153546c) && s.g(this.f153547d, eVar.f153547d) && s.g(this.f153548e, eVar.f153548e) && s.g(this.f153549f, eVar.f153549f) && s.g(this.f153550g, eVar.f153550g) && s.g(this.f153551h, eVar.f153551h) && s.g(this.f153552i, eVar.f153552i) && s.g(this.f153553j, eVar.f153553j) && s.g(this.f153554k, eVar.f153554k);
    }

    public final int hashCode() {
        Long l14 = this.f153544a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        g gVar = this.f153545b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List<Object> list = this.f153546c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f153547d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f153548e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f153549f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f153550g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f153551h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f153552i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f153553j;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f153554k;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SkinTemp(userProfilePk=");
        sb3.append(this.f153544a);
        sb3.append(", skinTempSummary=");
        sb3.append(this.f153545b);
        sb3.append(", skinTempReadings=");
        o2.c.n(", startTimestampGMT=", this.f153547d, ", endTimestamp=", sb3, this.f153546c);
        sn.a.t(sb3, this.f153548e, ", startTimestampLocal=", this.f153549f, ", endTimestampLocal=");
        sn.a.t(sb3, this.f153550g, ", sleepStartTimestampGMT=", this.f153551h, ", sleepEndTimestampGMT=");
        sn.a.t(sb3, this.f153552i, ", sleepStartTimestampLocal=", this.f153553j, ", sleepEndTimestampLocal=");
        return am.j.o(this.f153554k, ")", sb3);
    }

    public e(Long l14, g gVar, List<Object> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f153544a = l14;
        this.f153545b = gVar;
        this.f153546c = list;
        this.f153547d = str;
        this.f153548e = str2;
        this.f153549f = str3;
        this.f153550g = str4;
        this.f153551h = str5;
        this.f153552i = str6;
        this.f153553j = str7;
        this.f153554k = str8;
    }

    public e() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
