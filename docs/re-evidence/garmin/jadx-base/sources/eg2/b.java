package eg2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import zf2.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Leg2/b;", "", "Leg2/c;", "notificationType", "", "deviceUnitId", "Lzf2/d;", "activityType", "durationInMillis", "", "heartRate", "<init>", "(Leg2/c;JLzf2/d;JLjava/lang/Integer;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f64007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f64009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f64010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f64011e;

    public b(c cVar, long j8, d dVar, long j14, Integer num) {
        cVar.getClass();
        dVar.getClass();
        this.f64007a = cVar;
        this.f64008b = j8;
        this.f64009c = dVar;
        this.f64010d = j14;
        this.f64011e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f64007a == bVar.f64007a && this.f64008b == bVar.f64008b && this.f64009c == bVar.f64009c && this.f64010d == bVar.f64010d && s.g(this.f64011e, bVar.f64011e);
    }

    public final int hashCode() {
        int iE = f.e((this.f64009c.hashCode() + f.e(this.f64007a.hashCode() * 31, 31, this.f64008b)) * 31, 31, this.f64010d);
        Integer num = this.f64011e;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "LiveActivitySessionNotificationData(notificationType=" + this.f64007a + ", deviceUnitId=" + this.f64008b + ", activityType=" + this.f64009c + ", durationInMillis=" + this.f64010d + ", heartRate=" + this.f64011e + ")";
    }

    public /* synthetic */ b(c cVar, long j8, d dVar, long j14, Integer num, int i14, j jVar) {
        this(cVar, j8, dVar, j14, (i14 & 16) != 0 ? null : num);
    }
}
