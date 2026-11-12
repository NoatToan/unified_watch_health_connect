package z31;

import i41.c;
import java.util.List;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;
import u62.z;
import v.e0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lz31/a;", "", "", "xMaximum", "xMinimum", "yMaximum", "yMinimum", "Lorg/joda/time/LocalDateTime;", "startTime", "endTime", "", "Li41/c;", "hrvReadings", "<init>", "(FFFFLorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/util/List;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f202132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f202133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f202134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f202135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LocalDateTime f202136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocalDateTime f202137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<c> f202138g;

    public a(float f14, float f15, float f16, float f17, LocalDateTime localDateTime, LocalDateTime localDateTime2, List<c> list) {
        localDateTime.getClass();
        localDateTime2.getClass();
        this.f202132a = f14;
        this.f202133b = f15;
        this.f202134c = f16;
        this.f202135d = f17;
        this.f202136e = localDateTime;
        this.f202137f = localDateTime2;
        this.f202138g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f202132a, aVar.f202132a) == 0 && Float.compare(this.f202133b, aVar.f202133b) == 0 && Float.compare(this.f202134c, aVar.f202134c) == 0 && Float.compare(this.f202135d, aVar.f202135d) == 0 && this.f202136e.equals(aVar.f202136e) && this.f202137f.equals(aVar.f202137f) && s.g(this.f202138g, aVar.f202138g);
    }

    public final int hashCode() {
        int iHashCode = (this.f202137f.hashCode() + ((this.f202136e.hashCode() + f.d(this.f202135d, f.d(this.f202134c, f.d(this.f202133b, Float.hashCode(this.f202132a) * 31, 31), 31), 31)) * 31)) * 31;
        List<c> list = this.f202138g;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbI = e0.i("OhrvLineChartDTO(xMaximum=", this.f202132a, ", xMinimum=", this.f202133b, ", yMaximum=");
        l2.n(sbI, this.f202134c, ", yMinimum=", this.f202135d, ", startTime=");
        sbI.append(this.f202136e);
        sbI.append(", endTime=");
        sbI.append(this.f202137f);
        sbI.append(", hrvReadings=");
        return z.c(sbI, this.f202138g, ")");
    }
}
