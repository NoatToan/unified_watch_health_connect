package uq;

import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Luq/e;", "", "", "columnWeight", "", "isEditable", "", "metricLabel", "metricLabelContentDescription", "metricUnitLabel", "metricUnitLabelContentDescription", "<init>", "(FZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f172189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f172190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f172191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f172192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f172193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f172194f;

    public /* synthetic */ e(float f14, boolean z14, String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(f14, (i14 & 2) != 0 ? false : z14, str, (i14 & 8) != 0 ? str : str2, str3, (i14 & 32) != 0 ? str3 : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f172189a, eVar.f172189a) == 0 && this.f172190b == eVar.f172190b && s.g(this.f172191c, eVar.f172191c) && s.g(this.f172192d, eVar.f172192d) && s.g(this.f172193e, eVar.f172193e) && s.g(this.f172194f, eVar.f172194f);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(q6.f.g(Float.hashCode(this.f172189a) * 31, 31, this.f172190b), 31, this.f172191c), 31, this.f172192d);
        String str = this.f172193e;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f172194f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ColumnHeader(columnWeight=");
        sb3.append(this.f172189a);
        sb3.append(", isEditable=");
        sb3.append(this.f172190b);
        sb3.append(", metricLabel=");
        sn.a.t(sb3, this.f172191c, ", metricLabelContentDescription=", this.f172192d, ", metricUnitLabel=");
        return e5.h(sb3, this.f172193e, ", metricUnitLabelContentDescription=", this.f172194f, ")");
    }

    public e(float f14, boolean z14, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f172189a = f14;
        this.f172190b = z14;
        this.f172191c = str;
        this.f172192d = str2;
        this.f172193e = str3;
        this.f172194f = str4;
    }
}
