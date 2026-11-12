package j70;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001a"}, d2 = {"Lj70/f;", "", "Lj70/y;", "userFocus", "Lj70/c;", "dailyStatsConfig", "", "Lj70/v;", "sections", "Lj70/b;", "yesterdayStats", "lastSevenDayStats", "<init>", "(Lj70/y;Lj70/c;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Lj70/y;", JWKParameterNames.RSA_EXPONENT, "()Lj70/y;", "b", "Lj70/c;", "()Lj70/c;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "f", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userFocus")
    private final y userFocus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyStatsConfig")
    private final c dailyStatsConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sections")
    private final List<v> sections;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("yesterdayStats")
    private final List<b> yesterdayStats;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastSevenDayStats")
    private final List<b> lastSevenDayStats;

    public f(y yVar, c cVar, List<v> list, List<b> list2, List<b> list3) {
        this.userFocus = yVar;
        this.dailyStatsConfig = cVar;
        this.sections = list;
        this.yesterdayStats = list2;
        this.lastSevenDayStats = list3;
    }

    public static f a(f fVar, c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i14) {
        c cVar2 = cVar;
        y yVar = fVar.userFocus;
        if ((i14 & 2) != 0) {
            cVar2 = fVar.dailyStatsConfig;
        }
        List<v> list = arrayList;
        if ((i14 & 4) != 0) {
            list = fVar.sections;
        }
        List<b> list2 = arrayList2;
        if ((i14 & 8) != 0) {
            list2 = fVar.yesterdayStats;
        }
        List<b> list3 = arrayList3;
        if ((i14 & 16) != 0) {
            list3 = fVar.lastSevenDayStats;
        }
        List<b> list4 = list3;
        fVar.getClass();
        List<b> list5 = list2;
        return new f(yVar, cVar2, list, list5, list4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getDailyStatsConfig() {
        return this.dailyStatsConfig;
    }

    public final List<b> c() {
        return this.lastSevenDayStats;
    }

    public final List<v> d() {
        return this.sections;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final y getUserFocus() {
        return this.userFocus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.userFocus, fVar.userFocus) && p005kotlin.jvm.internal.s.g(this.dailyStatsConfig, fVar.dailyStatsConfig) && p005kotlin.jvm.internal.s.g(this.sections, fVar.sections) && p005kotlin.jvm.internal.s.g(this.yesterdayStats, fVar.yesterdayStats) && p005kotlin.jvm.internal.s.g(this.lastSevenDayStats, fVar.lastSevenDayStats);
    }

    public final List<b> f() {
        return this.yesterdayStats;
    }

    public final int hashCode() {
        y yVar = this.userFocus;
        int iHashCode = (yVar == null ? 0 : yVar.hashCode()) * 31;
        c cVar = this.dailyStatsConfig;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List<v> list = this.sections;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<b> list2 = this.yesterdayStats;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<b> list3 = this.lastSevenDayStats;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        y yVar = this.userFocus;
        c cVar = this.dailyStatsConfig;
        List<v> list = this.sections;
        List<b> list2 = this.yesterdayStats;
        List<b> list3 = this.lastSevenDayStats;
        StringBuilder sb3 = new StringBuilder("DashboardConfig(userFocus=");
        sb3.append(yVar);
        sb3.append(", dailyStatsConfig=");
        sb3.append(cVar);
        sb3.append(", sections=");
        n23.j.z(sb3, list, ", yesterdayStats=", list2, ", lastSevenDayStats=");
        return u62.z.c(sb3, list3, ")");
    }
}
