package gu2;

import android.location.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgu2/d;", "", "", "timestamp", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "", "epochSeconds", "", "description", "icon", "Lfu2/e;", "temperature", "precipProbability", "Lgu2/e;", "wind", "dewPoint", "airQuality", "", "uvIndex", "relativeHumidity", "<init>", "(JLandroid/location/Location;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lfu2/e;Ljava/lang/Integer;Lgu2/e;Lfu2/e;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f79126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Location f79127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f79128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f79129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f79130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fu2.e f79131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f79132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f79133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fu2.e f79134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f79135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f79136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f79137l;

    public /* synthetic */ d(long j8, Location location, Integer num, String str, Integer num2, fu2.e eVar, Integer num3, e eVar2, fu2.e eVar3, Integer num4, Double d14, Double d15, int i14, j jVar) {
        this(j8, location, num, str, num2, eVar, num3, eVar2, (i14 & 256) != 0 ? null : eVar3, (i14 & 512) != 0 ? null : num4, (i14 & 1024) != 0 ? null : d14, (i14 & 2048) != 0 ? null : d15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f79126a == dVar.f79126a && s.g(this.f79127b, dVar.f79127b) && s.g(this.f79128c, dVar.f79128c) && s.g(this.f79129d, dVar.f79129d) && s.g(this.f79130e, dVar.f79130e) && s.g(this.f79131f, dVar.f79131f) && s.g(this.f79132g, dVar.f79132g) && s.g(this.f79133h, dVar.f79133h) && s.g(this.f79134i, dVar.f79134i) && s.g(this.f79135j, dVar.f79135j) && s.g(this.f79136k, dVar.f79136k) && s.g(this.f79137l, dVar.f79137l);
    }

    public final int hashCode() {
        int iHashCode = (this.f79127b.hashCode() + (Long.hashCode(this.f79126a) * 31)) * 31;
        Integer num = this.f79128c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f79129d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f79130e;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        fu2.e eVar = this.f79131f;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Integer num3 = this.f79132g;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        e eVar2 = this.f79133h;
        int iHashCode7 = (iHashCode6 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        fu2.e eVar3 = this.f79134i;
        int iHashCode8 = (iHashCode7 + (eVar3 == null ? 0 : eVar3.hashCode())) * 31;
        Integer num4 = this.f79135j;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d14 = this.f79136k;
        int iHashCode10 = (iHashCode9 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f79137l;
        return iHashCode10 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = l2.f("HourForecastDTO(epochSeconds=", this.f79128c, ", description=", this.f79129d, ", icon=");
        sbF.append(this.f79130e);
        sbF.append(", temperature=");
        sbF.append(this.f79131f);
        sbF.append(", precipProbability=");
        sbF.append(this.f79132g);
        sbF.append(", wind=");
        sbF.append(this.f79133h);
        sbF.append(", dewPoint=");
        sbF.append(this.f79134i);
        sbF.append(", airQuality=");
        sbF.append(this.f79135j);
        sbF.append(", uvIndex=");
        return sn.a.f(this.f79136k, this.f79137l, ", relativeHumidity=", ")", sbF);
    }

    public d(long j8, Location location, Integer num, String str, Integer num2, fu2.e eVar, Integer num3, e eVar2, fu2.e eVar3, Integer num4, Double d14, Double d15) {
        location.getClass();
        this.f79126a = j8;
        this.f79127b = location;
        this.f79128c = num;
        this.f79129d = str;
        this.f79130e = num2;
        this.f79131f = eVar;
        this.f79132g = num3;
        this.f79133h = eVar2;
        this.f79134i = eVar3;
        this.f79135j = num4;
        this.f79136k = d14;
        this.f79137l = d15;
    }
}
