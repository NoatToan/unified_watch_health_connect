package gu2;

import am.j;
import android.location.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lgu2/c;", "", "", "timestamp", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "", "dayOfWeek", "icon", "Lfu2/e;", "tempHigh", "tempLow", "precipProbability", "", "description", "summary", "<init>", "(JLandroid/location/Location;Ljava/lang/Integer;Ljava/lang/Integer;Lfu2/e;Lfu2/e;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f79117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Location f79118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f79119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f79120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fu2.e f79121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fu2.e f79122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f79123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f79124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f79125i;

    public c(long j8, Location location, Integer num, Integer num2, fu2.e eVar, fu2.e eVar2, Integer num3, String str, String str2) {
        location.getClass();
        this.f79117a = j8;
        this.f79118b = location;
        this.f79119c = num;
        this.f79120d = num2;
        this.f79121e = eVar;
        this.f79122f = eVar2;
        this.f79123g = num3;
        this.f79124h = str;
        this.f79125i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f79117a == cVar.f79117a && this.f79118b.equals(cVar.f79118b) && s.g(this.f79119c, cVar.f79119c) && s.g(this.f79120d, cVar.f79120d) && s.g(this.f79121e, cVar.f79121e) && s.g(this.f79122f, cVar.f79122f) && s.g(this.f79123g, cVar.f79123g) && s.g(this.f79124h, cVar.f79124h) && s.g(this.f79125i, cVar.f79125i);
    }

    public final int hashCode() {
        int iHashCode = (this.f79118b.hashCode() + (Long.hashCode(this.f79117a) * 31)) * 31;
        Integer num = this.f79119c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f79120d;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        fu2.e eVar = this.f79121e;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        fu2.e eVar2 = this.f79122f;
        int iHashCode5 = (iHashCode4 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        Integer num3 = this.f79123g;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f79124h;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f79125i;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(this.f79119c, "DayForecastDTO(dayOfWeek=", ", icon=", ", tempHigh=", this.f79120d);
        sbL.append(this.f79121e);
        sbL.append(", tempLow=");
        sbL.append(this.f79122f);
        sbL.append(", precipProbability=");
        p6.b.l(this.f79123g, ", description=", this.f79124h, ", summary=", sbL);
        return j.o(this.f79125i, ")", sbL);
    }
}
