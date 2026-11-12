package q71;

import am.j;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq71/b;", "", "", "x", "", "formattedValue", "formattedDate", "<init>", "(FLjava/lang/String;Ljava/lang/String;)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f143230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143232c;

    public b(float f14, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f143230a = f14;
        this.f143231b = str;
        this.f143232c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f143230a, bVar.f143230a) == 0 && this.f143231b.equals(bVar.f143231b) && this.f143232c.equals(bVar.f143232c);
    }

    public final int hashCode() {
        return this.f143232c.hashCode() + g.j(Float.hashCode(this.f143230a) * 31, 31, this.f143231b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VO2MaxReportChartHoverEntry(x=");
        sb3.append(this.f143230a);
        sb3.append(", formattedValue=");
        sb3.append(this.f143231b);
        sb3.append(", formattedDate=");
        return j.o(this.f143232c, ")", sb3);
    }
}
