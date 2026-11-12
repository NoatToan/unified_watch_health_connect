package nr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnr/i0;", "", "", "title", "subtitle", "thirdLine", "subtitleContentDescription", "Lu4/d;", "startIconResId", "Lnr/g0;", "startImageData", "startImageContentDescription", "", "endIconTintColorResId", "endIconContentDescription", "Lkotlin/Function0;", "", "onItemSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu4/d;Lnr/g0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f127198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u4.d f127199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f127200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f127201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f127202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f127203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e23.a<Unit> f127204j;

    public /* synthetic */ i0(String str, String str2, String str3, String str4, u4.d dVar, g0 g0Var, String str5, Integer num, String str6, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? "" : str4, (i14 & 16) != 0 ? null : dVar, (i14 & 32) != 0 ? null : g0Var, (i14 & 64) != 0 ? "" : str5, (i14 & 128) != 0 ? null : num, (i14 & 256) != 0 ? "" : str6, (i14 & 512) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127195a, i0Var.f127195a) && p005kotlin.jvm.internal.s.g(this.f127196b, i0Var.f127196b) && p005kotlin.jvm.internal.s.g(this.f127197c, i0Var.f127197c) && p005kotlin.jvm.internal.s.g(this.f127198d, i0Var.f127198d) && p005kotlin.jvm.internal.s.g(this.f127199e, i0Var.f127199e) && p005kotlin.jvm.internal.s.g(this.f127200f, i0Var.f127200f) && p005kotlin.jvm.internal.s.g(this.f127201g, i0Var.f127201g) && p005kotlin.jvm.internal.s.g(this.f127202h, i0Var.f127202h) && p005kotlin.jvm.internal.s.g(this.f127203i, i0Var.f127203i) && p005kotlin.jvm.internal.s.g(this.f127204j, i0Var.f127204j);
    }

    public final int hashCode() {
        int iHashCode = this.f127195a.hashCode() * 31;
        String str = this.f127196b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f127197c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f127198d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        u4.d dVar = this.f127199e;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        g0 g0Var = this.f127200f;
        int iHashCode6 = (iHashCode5 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        String str4 = this.f127201g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f127202h;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f127203i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        e23.a<Unit> aVar = this.f127204j;
        return iHashCode9 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ListRowData(title=", this.f127195a, ", subtitle=", this.f127196b, ", thirdLine=");
        sn.a.t(sbI, this.f127197c, ", subtitleContentDescription=", this.f127198d, ", startIconResId=");
        sbI.append(this.f127199e);
        sbI.append(", startImageData=");
        sbI.append(this.f127200f);
        sbI.append(", startImageContentDescription=");
        fb1.c.u(this.f127202h, this.f127201g, ", endIconTintColorResId=", ", endIconContentDescription=", sbI);
        sbI.append(this.f127203i);
        sbI.append(", onItemSelected=");
        sbI.append(this.f127204j);
        sbI.append(")");
        return sbI.toString();
    }

    public i0(String str, String str2, String str3, String str4, u4.d dVar, g0 g0Var, String str5, Integer num, String str6, e23.a<Unit> aVar) {
        str.getClass();
        this.f127195a = str;
        this.f127196b = str2;
        this.f127197c = str3;
        this.f127198d = str4;
        this.f127199e = dVar;
        this.f127200f = g0Var;
        this.f127201g = str5;
        this.f127202h = num;
        this.f127203i = str6;
        this.f127204j = aVar;
    }

    public i0() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
