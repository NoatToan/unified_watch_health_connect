package a71;

import android.view.View;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"La71/e;", "", "", "La71/d;", "summaryItems", "", "sevenDayLoadLabel", "sevenDayLoadRatioLabel", "formattedSevenDayLoadRatioLabel", "loadRatioInfoMessage", "infoMessage", "formattedLatestAcuteLoad", "formattedLatestChronicLoad", "", "isWorkloadRatioDeviceSelected", "isWorkloadRatioTabSelected", "isChronicChipVisibleOnAcuteTab", "isChronicChipSelected", "La71/c;", "loadRatioTabUiState", "Lkotlin/Function1;", "Landroid/view/View;", "", "chronicChipOnClickListener", "isNoDataStateVisibleOnAcuteTab", "Lorg/joda/time/DateTime;", "trainingStatusPauseDate", "shouldShowDeviceSelector", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLa71/c;Le23/l;ZLorg/joda/time/DateTime;Z)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f1751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f1763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e23.l<? super View, Unit> f1764n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1765o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DateTime f1766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f1767q;

    public e(List<d> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z14, boolean z15, boolean z16, boolean z17, c cVar, e23.l<? super View, Unit> lVar, boolean z18, DateTime dateTime, boolean z19) {
        list.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        lVar.getClass();
        this.f1751a = list;
        this.f1752b = str;
        this.f1753c = str2;
        this.f1754d = str3;
        this.f1755e = str4;
        this.f1756f = str5;
        this.f1757g = str6;
        this.f1758h = str7;
        this.f1759i = z14;
        this.f1760j = z15;
        this.f1761k = z16;
        this.f1762l = z17;
        this.f1763m = cVar;
        this.f1764n = lVar;
        this.f1765o = z18;
        this.f1766p = dateTime;
        this.f1767q = z19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f1751a, eVar.f1751a) && s.g(this.f1752b, eVar.f1752b) && s.g(this.f1753c, eVar.f1753c) && s.g(this.f1754d, eVar.f1754d) && s.g(this.f1755e, eVar.f1755e) && s.g(this.f1756f, eVar.f1756f) && s.g(this.f1757g, eVar.f1757g) && s.g(this.f1758h, eVar.f1758h) && this.f1759i == eVar.f1759i && this.f1760j == eVar.f1760j && this.f1761k == eVar.f1761k && this.f1762l == eVar.f1762l && s.g(this.f1763m, eVar.f1763m) && s.g(this.f1764n, eVar.f1764n) && this.f1765o == eVar.f1765o && s.g(this.f1766p, eVar.f1766p) && this.f1767q == eVar.f1767q;
    }

    public final int hashCode() {
        int iHashCode = this.f1751a.hashCode() * 31;
        String str = this.f1752b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1753c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1754d;
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(wr.g.j(wr.g.j(wr.g.j(wr.g.j((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f1755e), 31, this.f1756f), 31, this.f1757g), 31, this.f1758h), 31, this.f1759i), 31, this.f1760j), 31, this.f1761k), 31, this.f1762l);
        c cVar = this.f1763m;
        int iG2 = q6.f.g(q6.f.h((iG + (cVar == null ? 0 : cVar.hashCode())) * 31, this.f1764n, 31), 31, this.f1765o);
        DateTime dateTime = this.f1766p;
        return Boolean.hashCode(this.f1767q) + ((iG2 + (dateTime != null ? dateTime.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SevenDayLoadUiModel(summaryItems=");
        sb3.append(this.f1751a);
        sb3.append(", sevenDayLoadLabel=");
        sb3.append(this.f1752b);
        sb3.append(", sevenDayLoadRatioLabel=");
        sn.a.t(sb3, this.f1753c, ", formattedSevenDayLoadRatioLabel=", this.f1754d, ", loadRatioInfoMessage=");
        sn.a.t(sb3, this.f1755e, ", infoMessage=", this.f1756f, ", formattedLatestAcuteLoad=");
        sn.a.t(sb3, this.f1757g, ", formattedLatestChronicLoad=", this.f1758h, ", isWorkloadRatioDeviceSelected=");
        kg.f.q(", isWorkloadRatioTabSelected=", ", isChronicChipVisibleOnAcuteTab=", sb3, this.f1759i, this.f1760j);
        kg.f.q(", isChronicChipSelected=", ", loadRatioTabUiState=", sb3, this.f1761k, this.f1762l);
        sb3.append(this.f1763m);
        sb3.append(", chronicChipOnClickListener=");
        sb3.append(this.f1764n);
        sb3.append(", isNoDataStateVisibleOnAcuteTab=");
        sb3.append(this.f1765o);
        sb3.append(", trainingStatusPauseDate=");
        sb3.append(this.f1766p);
        sb3.append(", shouldShowDeviceSelector=");
        return hb.a.k(sb3, this.f1767q, ")");
    }

    public /* synthetic */ e(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z14, boolean z15, boolean z16, boolean z17, c cVar, e23.l lVar, boolean z18, DateTime dateTime, boolean z19, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, str, str2, str3, str4, str5, str6, str7, z14, z15, z16, z17, cVar, lVar, z18, dateTime, (i14 & 65536) != 0 ? false : z19);
    }
}
