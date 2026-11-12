package pr0;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpr0/h;", "", "", "date", "time", "value", "", "valueIndicatorColorResId", "valueIndicatorDrawableResId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f139622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f139623e;

    public /* synthetic */ h(String str, String str2, String str3, Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, str3, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f139619a, hVar.f139619a) && s.g(this.f139620b, hVar.f139620b) && s.g(this.f139621c, hVar.f139621c) && s.g(this.f139622d, hVar.f139622d) && s.g(this.f139623e, hVar.f139623e);
    }

    public final int hashCode() {
        String str = this.f139619a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f139620b;
        int iJ = wr.g.j((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f139621c);
        Integer num = this.f139622d;
        int iHashCode2 = (iJ + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f139623e;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("IntensityMinutesMarkerData(date=", this.f139619a, ", time=", this.f139620b, ", value=");
        fb1.c.u(this.f139622d, this.f139621c, ", valueIndicatorColorResId=", ", valueIndicatorDrawableResId=", sbI);
        return f3.i(sbI, this.f139623e, ")");
    }

    public h(String str, String str2, String str3, Integer num, Integer num2) {
        str3.getClass();
        this.f139619a = str;
        this.f139620b = str2;
        this.f139621c = str3;
        this.f139622d = num;
        this.f139623e = num2;
    }
}
