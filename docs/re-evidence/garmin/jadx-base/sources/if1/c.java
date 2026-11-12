package if1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lif1/c;", "", "", "startOfWeek", "endOfWeek", "", "weekIndex", "", "impactLoad", "distance", "tolerance", "", "isAtOrAboveTolerance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Z)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f93212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f93213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Float f93214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f93215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f93216g;

    public /* synthetic */ c(String str, String str2, Integer num, Float f14, Float f15, Integer num2, boolean z14, int i14, j jVar) {
        this(str, str2, num, f14, f15, num2, (i14 & 64) != 0 ? false : z14);
    }

    public static c a(c cVar, String str) {
        String str2 = cVar.f93210a;
        Integer num = cVar.f93212c;
        Float f14 = cVar.f93213d;
        Float f15 = cVar.f93214e;
        Integer num2 = cVar.f93215f;
        boolean z14 = cVar.f93216g;
        cVar.getClass();
        return new c(str2, str, num, f14, f15, num2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f93210a, cVar.f93210a) && s.g(this.f93211b, cVar.f93211b) && s.g(this.f93212c, cVar.f93212c) && s.g(this.f93213d, cVar.f93213d) && s.g(this.f93214e, cVar.f93214e) && s.g(this.f93215f, cVar.f93215f) && this.f93216g == cVar.f93216g;
    }

    public final int hashCode() {
        String str = this.f93210a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f93211b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f93212c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Float f14 = this.f93213d;
        int iHashCode4 = (iHashCode3 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.f93214e;
        int iHashCode5 = (iHashCode4 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Integer num2 = this.f93215f;
        return Boolean.hashCode(this.f93216g) + ((iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("RunningToleranceWeeklyMetrics(startOfWeek=", this.f93210a, ", endOfWeek=", this.f93211b, ", weekIndex=");
        sbI.append(this.f93212c);
        sbI.append(", impactLoad=");
        sbI.append(this.f93213d);
        sbI.append(", distance=");
        sbI.append(this.f93214e);
        sbI.append(", tolerance=");
        sbI.append(this.f93215f);
        sbI.append(", isAtOrAboveTolerance=");
        return hb.a.k(sbI, this.f93216g, ")");
    }

    public c(String str, String str2, Integer num, Float f14, Float f15, Integer num2, boolean z14) {
        this.f93210a = str;
        this.f93211b = str2;
        this.f93212c = num;
        this.f93213d = f14;
        this.f93214e = f15;
        this.f93215f = num2;
        this.f93216g = z14;
    }
}
