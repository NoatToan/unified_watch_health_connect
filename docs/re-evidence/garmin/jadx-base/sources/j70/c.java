package j70;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u000f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0012\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lj70/c;", "", "", "Lj70/b;", "primaryStats", "secondaryStatsFavorites", "secondaryStatOthers", "secondaryStats", "essentialsStats", "", "defaultPrimaryStats", "defaultEssentialsStats", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "g", "c", JWKParameterNames.RSA_EXPONENT, "f", "getSecondaryStats$annotations", "()V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getDefaultEssentialsStats", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryStats")
    private final List<b> primaryStats;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("secondaryStatFavorites")
    private final List<b> secondaryStatsFavorites;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("secondaryStatOthers")
    private final List<b> secondaryStatOthers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("secondaryStats")
    private final List<b> secondaryStats;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("essentialsStats")
    private final List<b> essentialsStats;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultPrimaryStats")
    private final Boolean defaultPrimaryStats;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultEssentialsStats")
    private final Boolean defaultEssentialsStats;

    public c(List<b> list, List<b> list2, List<b> list3, List<b> list4, List<b> list5, Boolean bool, Boolean bool2) {
        this.primaryStats = list;
        this.secondaryStatsFavorites = list2;
        this.secondaryStatOthers = list3;
        this.secondaryStats = list4;
        this.essentialsStats = list5;
        this.defaultPrimaryStats = bool;
        this.defaultEssentialsStats = bool2;
    }

    public static c a(c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        return new c(arrayList, arrayList2, arrayList3, arrayList4, cVar.essentialsStats, cVar.defaultPrimaryStats, cVar.defaultEssentialsStats);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getDefaultPrimaryStats() {
        return this.defaultPrimaryStats;
    }

    public final List<b> c() {
        return this.essentialsStats;
    }

    public final List<b> d() {
        return this.primaryStats;
    }

    public final List<b> e() {
        return this.secondaryStatOthers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.primaryStats, cVar.primaryStats) && p005kotlin.jvm.internal.s.g(this.secondaryStatsFavorites, cVar.secondaryStatsFavorites) && p005kotlin.jvm.internal.s.g(this.secondaryStatOthers, cVar.secondaryStatOthers) && p005kotlin.jvm.internal.s.g(this.secondaryStats, cVar.secondaryStats) && p005kotlin.jvm.internal.s.g(this.essentialsStats, cVar.essentialsStats) && p005kotlin.jvm.internal.s.g(this.defaultPrimaryStats, cVar.defaultPrimaryStats) && p005kotlin.jvm.internal.s.g(this.defaultEssentialsStats, cVar.defaultEssentialsStats);
    }

    public final List<b> f() {
        return this.secondaryStats;
    }

    public final List<b> g() {
        return this.secondaryStatsFavorites;
    }

    public final int hashCode() {
        List<b> list = this.primaryStats;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<b> list2 = this.secondaryStatsFavorites;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<b> list3 = this.secondaryStatOthers;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<b> list4 = this.secondaryStats;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<b> list5 = this.essentialsStats;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool = this.defaultPrimaryStats;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.defaultEssentialsStats;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        List<b> list = this.primaryStats;
        List<b> list2 = this.secondaryStatsFavorites;
        List<b> list3 = this.secondaryStatOthers;
        List<b> list4 = this.secondaryStats;
        List<b> list5 = this.essentialsStats;
        Boolean bool = this.defaultPrimaryStats;
        Boolean bool2 = this.defaultEssentialsStats;
        StringBuilder sbK = f3.k("DailyStatsConfig(primaryStats=", ", secondaryStatsFavorites=", ", secondaryStatOthers=", list, list2);
        n23.j.z(sbK, list3, ", secondaryStats=", list4, ", essentialsStats=");
        sbK.append(list5);
        sbK.append(", defaultPrimaryStats=");
        sbK.append(bool);
        sbK.append(", defaultEssentialsStats=");
        return p6.b.f(sbK, bool2, ")");
    }
}
