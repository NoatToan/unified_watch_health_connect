package gu2;

import android.location.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgu2/e;", "", "", "timestamp", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "", "epochSeconds", "Lfu2/e;", "speed", "", "direction", "directionDegrees", "<init>", "(JLandroid/location/Location;Ljava/lang/Integer;Lfu2/e;Ljava/lang/String;Ljava/lang/Integer;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f79138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Location f79139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f79140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fu2.e f79141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f79142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f79143f;

    public /* synthetic */ e(long j8, Location location, Integer num, fu2.e eVar, String str, Integer num2, int i14, j jVar) {
        this(j8, location, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : eVar, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? null : num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f79138a == eVar.f79138a && s.g(this.f79139b, eVar.f79139b) && s.g(this.f79140c, eVar.f79140c) && s.g(this.f79141d, eVar.f79141d) && s.g(this.f79142e, eVar.f79142e) && s.g(this.f79143f, eVar.f79143f);
    }

    public final int hashCode() {
        int iHashCode = (this.f79139b.hashCode() + (Long.hashCode(this.f79138a) * 31)) * 31;
        Integer num = this.f79140c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        fu2.e eVar = this.f79141d;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.f79142e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f79143f;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "WindDTO(timestamp=" + this.f79138a + ", location=" + this.f79139b + ", epochSeconds=" + this.f79140c + ", speed=" + this.f79141d + ", direction=" + this.f79142e + ", directionDegrees=" + this.f79143f + ")";
    }

    public e(long j8, Location location, Integer num, fu2.e eVar, String str, Integer num2) {
        location.getClass();
        this.f79138a = j8;
        this.f79139b = location;
        this.f79140c = num;
        this.f79141d = eVar;
        this.f79142e = str;
        this.f79143f = num2;
    }
}
