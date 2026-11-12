package wn1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwn1/d;", "", "", "shortName", "gender", "", "height", "", "weight", "Lorg/joda/time/LocalDate;", "birthDate", "", "activityClass", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Double;Lorg/joda/time/LocalDate;Ljava/lang/Integer;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f186201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f186202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LocalDate f186203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f186204f;

    public /* synthetic */ d(String str, String str2, Float f14, Double d14, LocalDate localDate, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : f14, (i14 & 8) != 0 ? null : d14, (i14 & 16) != 0 ? null : localDate, (i14 & 32) != 0 ? null : num);
    }

    public static d a(d dVar, String str, String str2, Float f14, Double d14, LocalDate localDate, Integer num, int i14) {
        if ((i14 & 1) != 0) {
            str = dVar.f186199a;
        }
        String str3 = str;
        if ((i14 & 2) != 0) {
            str2 = dVar.f186200b;
        }
        String str4 = str2;
        if ((i14 & 4) != 0) {
            f14 = dVar.f186201c;
        }
        Float f15 = f14;
        if ((i14 & 8) != 0) {
            d14 = dVar.f186202d;
        }
        Double d15 = d14;
        if ((i14 & 16) != 0) {
            localDate = dVar.f186203e;
        }
        LocalDate localDate2 = localDate;
        if ((i14 & 32) != 0) {
            num = dVar.f186204f;
        }
        dVar.getClass();
        return new d(str3, str4, f15, d15, localDate2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f186199a, dVar.f186199a) && p005kotlin.jvm.internal.s.g(this.f186200b, dVar.f186200b) && p005kotlin.jvm.internal.s.g(this.f186201c, dVar.f186201c) && p005kotlin.jvm.internal.s.g(this.f186202d, dVar.f186202d) && p005kotlin.jvm.internal.s.g(this.f186203e, dVar.f186203e) && p005kotlin.jvm.internal.s.g(this.f186204f, dVar.f186204f);
    }

    public final int hashCode() {
        String str = this.f186199a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f186200b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f14 = this.f186201c;
        int iHashCode3 = (iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Double d14 = this.f186202d;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        LocalDate localDate = this.f186203e;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Integer num = this.f186204f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("IndexInviteUserData(shortName=", this.f186199a, ", gender=", this.f186200b, ", height=");
        sbI.append(this.f186201c);
        sbI.append(", weight=");
        sbI.append(this.f186202d);
        sbI.append(", birthDate=");
        sbI.append(this.f186203e);
        sbI.append(", activityClass=");
        sbI.append(this.f186204f);
        sbI.append(")");
        return sbI.toString();
    }

    public d(String str, String str2, Float f14, Double d14, LocalDate localDate, Integer num) {
        this.f186199a = str;
        this.f186200b = str2;
        this.f186201c = f14;
        this.f186202d = d14;
        this.f186203e = localDate;
        this.f186204f = num;
    }

    public d() {
        this(null, null, null, null, null, null, 63, null);
    }
}
