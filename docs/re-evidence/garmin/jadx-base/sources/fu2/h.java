package fu2;

import android.location.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import j20.x;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfu2/h;", "", "", "isFromMobileCache", "areCurrentConditionsFromMobileCache", "", "timestamp", "currentConditionsTimestamp", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "Lgu2/b;", "conditions", "", "Lgu2/c;", "dayForecasts", "Lgu2/d;", "hourForecasts", "Lgu2/a;", "alerts", "<init>", "(ZZJJLandroid/location/Location;Lgu2/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f73595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f73596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f73597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f73598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Location f73599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gu2.b f73600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<gu2.c> f73601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<gu2.d> f73602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<gu2.a> f73603i;

    public /* synthetic */ h(boolean z14, boolean z15, long j8, long j14, Location location, gu2.b bVar, List list, List list2, List list3, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, j8, j14, location, (i14 & 32) != 0 ? null : bVar, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : list2, (i14 & 256) != 0 ? null : list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f73595a == hVar.f73595a && this.f73596b == hVar.f73596b && this.f73597c == hVar.f73597c && this.f73598d == hVar.f73598d && s.g(this.f73599e, hVar.f73599e) && s.g(this.f73600f, hVar.f73600f) && s.g(this.f73601g, hVar.f73601g) && s.g(this.f73602h, hVar.f73602h) && s.g(this.f73603i, hVar.f73603i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    public final int hashCode() {
        boolean z14 = this.f73595a;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = r14 * 31;
        boolean z15 = this.f73596b;
        int iHashCode = (this.f73599e.hashCode() + q6.f.e(q6.f.e((i14 + (z15 ? 1 : z15)) * 31, 31, this.f73597c), 31, this.f73598d)) * 31;
        gu2.b bVar = this.f73600f;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List<gu2.c> list = this.f73601g;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<gu2.d> list2 = this.f73602h;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<gu2.a> list3 = this.f73603i;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        boolean z14 = this.f73595a;
        boolean z15 = this.f73596b;
        long j8 = this.f73598d;
        gu2.b bVar = this.f73600f;
        List<gu2.a> list = this.f73603i;
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("WeatherResponse(isFromMobileCache=", ", areCurrentConditionsFromMobileCache=", ", timestamp=", z14, z15);
        sbM.append(this.f73597c);
        x.j(j8, ", currentConditionsTimestamp=", ", conditions=", sbM);
        sbM.append(bVar);
        sbM.append(" dayForecasts=");
        sbM.append(this.f73601g);
        sbM.append(", hourForecasts=");
        return n23.j.j(sbM, this.f73602h, ", alerts=", list, ")");
    }

    public h(boolean z14, boolean z15, long j8, long j14, Location location, gu2.b bVar, List<gu2.c> list, List<gu2.d> list2, List<gu2.a> list3) {
        location.getClass();
        this.f73595a = z14;
        this.f73596b = z15;
        this.f73597c = j8;
        this.f73598d = j14;
        this.f73599e = location;
        this.f73600f = bVar;
        this.f73601g = list;
        this.f73602h = list2;
        this.f73603i = list3;
    }
}
