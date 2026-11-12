package fu2;

import android.location.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfu2/g;", "", "Lfu2/f;", "environment", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "Lfu2/i;", "xGarminData", "Lfu2/d;", "tempUnit", "Lfu2/c;", "speedUnit", "", "dailyForecastNbrDays", "hourlyForecastNbrHours", "", "includeAlerts", "<init>", "(Lfu2/f;Landroid/location/Location;Lfu2/i;Lfu2/d;Lfu2/c;IIZ)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f73587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Location f73588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f73589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f73590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f73591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f73592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f73593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f73594h;

    public /* synthetic */ g(f fVar, Location location, i iVar, d dVar, c cVar, int i14, int i15, boolean z14, int i16, j jVar) {
        this(fVar, location, iVar, dVar, cVar, (i16 & 32) != 0 ? 7 : i14, (i16 & 64) != 0 ? 12 : i15, (i16 & 128) != 0 ? true : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f73587a == gVar.f73587a && s.g(this.f73588b, gVar.f73588b) && s.g(this.f73589c, gVar.f73589c) && this.f73590d == gVar.f73590d && this.f73591e == gVar.f73591e && this.f73592f == gVar.f73592f && this.f73593g == gVar.f73593g && this.f73594h == gVar.f73594h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iD = q2.d(this.f73593g, q2.d(this.f73592f, (this.f73591e.hashCode() + ((this.f73590d.hashCode() + ((this.f73589c.hashCode() + ((this.f73588b.hashCode() + (this.f73587a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
        boolean z14 = this.f73594h;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        return iD + r14;
    }

    public final String toString() {
        return "WeatherRequest(environment=" + this.f73587a + ", location=" + this.f73588b + ", xGarminData=" + this.f73589c + ", tempUnit=" + this.f73590d + ", speedUnit=" + this.f73591e + ", dailyForecastNbrDays=" + this.f73592f + ", hourlyForecastNbrHours=" + this.f73593g + ", includeAlerts=" + this.f73594h + ")";
    }

    public g(f fVar, Location location, i iVar, d dVar, c cVar, int i14, int i15, boolean z14) {
        fVar.getClass();
        location.getClass();
        iVar.getClass();
        dVar.getClass();
        cVar.getClass();
        this.f73587a = fVar;
        this.f73588b = location;
        this.f73589c = iVar;
        this.f73590d = dVar;
        this.f73591e = cVar;
        this.f73592f = i14;
        this.f73593g = i15;
        this.f73594h = z14;
    }
}
