package d42;

import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ld42/a;", "", "", "vo2MaxValue", "", "chartIndicatorValue", "Lq71/a;", "vo2MaxRange", "fitnessAge", "fitnessAgePercentile", "formattedDate", "<init>", "(Ljava/lang/String;FLq71/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q71.a f57473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f57475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f57476f;

    public /* synthetic */ a(String str, float f14, q71.a aVar, String str2, String str3, String str4, int i14, j jVar) {
        this(str, f14, aVar, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f57471a, aVar.f57471a) && Float.compare(this.f57472b, aVar.f57472b) == 0 && this.f57473c == aVar.f57473c && s.g(this.f57474d, aVar.f57474d) && s.g(this.f57475e, aVar.f57475e) && s.g(this.f57476f, aVar.f57476f);
    }

    public final int hashCode() {
        int iHashCode = (this.f57473c.hashCode() + f.d(this.f57472b, this.f57471a.hashCode() * 31, 31)) * 31;
        String str = this.f57474d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57475e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57476f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VO2MaxCurrentRecordState(vo2MaxValue=");
        sb3.append(this.f57471a);
        sb3.append(", chartIndicatorValue=");
        sb3.append(this.f57472b);
        sb3.append(", vo2MaxRange=");
        sb3.append(this.f57473c);
        sb3.append(", fitnessAge=");
        sb3.append(this.f57474d);
        sb3.append(", fitnessAgePercentile=");
        return e5.h(sb3, this.f57475e, ", formattedDate=", this.f57476f, ")");
    }

    public a(String str, float f14, q71.a aVar, String str2, String str3, String str4) {
        str.getClass();
        aVar.getClass();
        this.f57471a = str;
        this.f57472b = f14;
        this.f57473c = aVar;
        this.f57474d = str2;
        this.f57475e = str3;
        this.f57476f = str4;
    }
}
