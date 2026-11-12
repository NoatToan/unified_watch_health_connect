package j70;

import java.util.List;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj70/b0;", "", "", "hasRequiredSectionsForHistoricalDataTurnedOff", "", "enabledSectionsCount", "", "", "configJson", "Lj70/a;", "activities", "userDailySummaryJson", "weightJson", "hrvJson", "bloodPressureJson", "sleepJson", "Lpb2/e$c;", "nutrition", "<init>", "(ZILjava/util/List;Lj70/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpb2/e$c;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f97503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f97505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f97506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f97507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f97508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f97509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f97510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f97511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pb2.e.c f97512j;

    public /* synthetic */ b0(boolean z14, int i14, List list, a aVar, String str, String str2, String str3, String str4, String str5, pb2.e.c cVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(z14, i14, (i15 & 4) != 0 ? null : list, aVar, (i15 & 16) != 0 ? null : str, (i15 & 32) != 0 ? null : str2, (i15 & 64) != 0 ? null : str3, (i15 & 128) != 0 ? null : str4, (i15 & 256) != 0 ? null : str5, (i15 & 512) != 0 ? null : cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f97503a == b0Var.f97503a && this.f97504b == b0Var.f97504b && p005kotlin.jvm.internal.s.g(this.f97505c, b0Var.f97505c) && p005kotlin.jvm.internal.s.g(this.f97506d, b0Var.f97506d) && p005kotlin.jvm.internal.s.g(this.f97507e, b0Var.f97507e) && p005kotlin.jvm.internal.s.g(this.f97508f, b0Var.f97508f) && p005kotlin.jvm.internal.s.g(this.f97509g, b0Var.f97509g) && p005kotlin.jvm.internal.s.g(this.f97510h, b0Var.f97510h) && p005kotlin.jvm.internal.s.g(this.f97511i, b0Var.f97511i) && p005kotlin.jvm.internal.s.g(this.f97512j, b0Var.f97512j);
    }

    public final int hashCode() {
        int iD = q2.d(this.f97504b, Boolean.hashCode(this.f97503a) * 31, 31);
        List<String> list = this.f97505c;
        int iHashCode = (this.f97506d.hashCode() + ((iD + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str = this.f97507e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97508f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97509g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f97510h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f97511i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        pb2.e.c cVar = this.f97512j;
        return iHashCode6 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("YesterdayData(hasRequiredSectionsForHistoricalDataTurnedOff=");
        sb3.append(this.f97503a);
        sb3.append(", enabledSectionsCount=");
        sb3.append(this.f97504b);
        sb3.append(", configJson=");
        sb3.append(this.f97505c);
        sb3.append(", activities=");
        sb3.append(this.f97506d);
        sb3.append(", userDailySummaryJson=");
        sn.a.t(sb3, this.f97507e, ", weightJson=", this.f97508f, ", hrvJson=");
        sn.a.t(sb3, this.f97509g, ", bloodPressureJson=", this.f97510h, ", sleepJson=");
        sb3.append(this.f97511i);
        sb3.append(", nutrition=");
        sb3.append(this.f97512j);
        sb3.append(")");
        return sb3.toString();
    }

    public b0(boolean z14, int i14, List<String> list, a aVar, String str, String str2, String str3, String str4, String str5, pb2.e.c cVar) {
        aVar.getClass();
        this.f97503a = z14;
        this.f97504b = i14;
        this.f97505c = list;
        this.f97506d = aVar;
        this.f97507e = str;
        this.f97508f = str2;
        this.f97509g = str3;
        this.f97510h = str4;
        this.f97511i = str5;
        this.f97512j = cVar;
    }
}
