package gu2;

import android.location.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgu2/b;", "", "", "timestamp", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "", "epochSeconds", "Lfu2/e;", "temperature", "", "description", "icon", "feelsLikeTemp", "dewPoint", "windChill", "", "relativeHumidity", "Lgu2/e;", "wind", "locationName", "realFeel", "realFeelShade", "<init>", "(JLandroid/location/Location;Ljava/lang/Integer;Lfu2/e;Ljava/lang/String;Ljava/lang/Integer;Lfu2/e;Lfu2/e;Lfu2/e;Ljava/lang/Double;Lgu2/e;Ljava/lang/String;Lfu2/e;Lfu2/e;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f79103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Location f79104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f79105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fu2.e f79106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f79107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f79108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fu2.e f79109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fu2.e f79110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fu2.e f79111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f79112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f79113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f79114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fu2.e f79115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fu2.e f79116n;

    public /* synthetic */ b(long j8, Location location, Integer num, fu2.e eVar, String str, Integer num2, fu2.e eVar2, fu2.e eVar3, fu2.e eVar4, Double d14, e eVar5, String str2, fu2.e eVar6, fu2.e eVar7, int i14, j jVar) {
        this(j8, location, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : eVar, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? null : num2, (i14 & 64) != 0 ? null : eVar2, (i14 & 128) != 0 ? null : eVar3, (i14 & 256) != 0 ? null : eVar4, (i14 & 512) != 0 ? null : d14, (i14 & 1024) != 0 ? null : eVar5, (i14 & 2048) != 0 ? null : str2, (i14 & 4096) != 0 ? null : eVar6, (i14 & 8192) != 0 ? null : eVar7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f79103a == bVar.f79103a && s.g(this.f79104b, bVar.f79104b) && s.g(this.f79105c, bVar.f79105c) && s.g(this.f79106d, bVar.f79106d) && s.g(this.f79107e, bVar.f79107e) && s.g(this.f79108f, bVar.f79108f) && s.g(this.f79109g, bVar.f79109g) && s.g(this.f79110h, bVar.f79110h) && s.g(this.f79111i, bVar.f79111i) && s.g(this.f79112j, bVar.f79112j) && s.g(this.f79113k, bVar.f79113k) && s.g(this.f79114l, bVar.f79114l) && s.g(this.f79115m, bVar.f79115m) && s.g(this.f79116n, bVar.f79116n);
    }

    public final int hashCode() {
        int iHashCode = (this.f79104b.hashCode() + (Long.hashCode(this.f79103a) * 31)) * 31;
        Integer num = this.f79105c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        fu2.e eVar = this.f79106d;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.f79107e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f79108f;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        fu2.e eVar2 = this.f79109g;
        int iHashCode6 = (iHashCode5 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        fu2.e eVar3 = this.f79110h;
        int iHashCode7 = (iHashCode6 + (eVar3 == null ? 0 : eVar3.hashCode())) * 31;
        fu2.e eVar4 = this.f79111i;
        int iHashCode8 = (iHashCode7 + (eVar4 == null ? 0 : eVar4.hashCode())) * 31;
        Double d14 = this.f79112j;
        int iHashCode9 = (iHashCode8 + (d14 == null ? 0 : d14.hashCode())) * 31;
        e eVar5 = this.f79113k;
        int iHashCode10 = (iHashCode9 + (eVar5 == null ? 0 : eVar5.hashCode())) * 31;
        String str2 = this.f79114l;
        int iHashCode11 = (iHashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        fu2.e eVar6 = this.f79115m;
        int iHashCode12 = (iHashCode11 + (eVar6 == null ? 0 : eVar6.hashCode())) * 31;
        fu2.e eVar7 = this.f79116n;
        return iHashCode12 + (eVar7 != null ? eVar7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConditionsDTO(epochSeconds=");
        sb3.append(this.f79105c);
        sb3.append(", temperature=");
        sb3.append(this.f79106d);
        sb3.append(", description=");
        fb1.c.u(this.f79108f, this.f79107e, ", icon=", ", feelsLikeTemp=", sb3);
        sb3.append(this.f79109g);
        sb3.append(", dewPoint=");
        sb3.append(this.f79110h);
        sb3.append(", windChill=");
        sb3.append(this.f79111i);
        sb3.append(", relativeHumidity=");
        sb3.append(this.f79112j);
        sb3.append(", wind=");
        sb3.append(this.f79113k);
        sb3.append(", realFeel=");
        sb3.append(this.f79115m);
        sb3.append(", realFeelShade=");
        sb3.append(this.f79116n);
        sb3.append(")");
        return sb3.toString();
    }

    public b(long j8, Location location, Integer num, fu2.e eVar, String str, Integer num2, fu2.e eVar2, fu2.e eVar3, fu2.e eVar4, Double d14, e eVar5, String str2, fu2.e eVar6, fu2.e eVar7) {
        location.getClass();
        this.f79103a = j8;
        this.f79104b = location;
        this.f79105c = num;
        this.f79106d = eVar;
        this.f79107e = str;
        this.f79108f = num2;
        this.f79109g = eVar2;
        this.f79110h = eVar3;
        this.f79111i = eVar4;
        this.f79112j = d14;
        this.f79113k = eVar5;
        this.f79114l = str2;
        this.f79115m = eVar6;
        this.f79116n = eVar7;
    }
}
