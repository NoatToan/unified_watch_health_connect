package am0;

import ds.e0;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lam0/a;", "Lhm0/a;", "Lorg/joda/time/DateTime;", "startDate", "endDate", "Lorg/joda/time/LocalDateTime;", "activityStartTimeLocal", "activityEndTimeLocal", "", "includeMovement", "includeWeight", "includeActivity", "includeSleep", "includeHeartRate", "includeCalories", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;ZZZZZZ)V", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements hm0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f4396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f4397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f4398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime f4399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4405j;

    public /* synthetic */ a(DateTime dateTime, DateTime dateTime2, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, j jVar) {
        this(dateTime, dateTime2, localDateTime, localDateTime2, (i14 & 16) != 0 ? true : z14, (i14 & 32) != 0 ? true : z15, (i14 & 64) != 0 ? true : z16, (i14 & 128) != 0 ? true : z17, (i14 & 256) != 0 ? true : z18, (i14 & 512) != 0 ? true : z19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f4396a, aVar.f4396a) && s.g(this.f4397b, aVar.f4397b) && s.g(this.f4398c, aVar.f4398c) && s.g(this.f4399d, aVar.f4399d) && this.f4400e == aVar.f4400e && this.f4401f == aVar.f4401f && this.f4402g == aVar.f4402g && this.f4403h == aVar.f4403h && this.f4404i == aVar.f4404i && this.f4405j == aVar.f4405j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4405j) + f.g(f.g(f.g(f.g(f.g((this.f4399d.hashCode() + ((this.f4398c.hashCode() + e0.a(this.f4396a.hashCode() * 31, this.f4397b, 31)) * 31)) * 31, 31, this.f4400e), 31, this.f4401f), 31, this.f4402g), 31, this.f4403h), 31, this.f4404i);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HealthExportDataQuery(startDate=");
        sb3.append(this.f4396a);
        sb3.append(", endDate=");
        sb3.append(this.f4397b);
        sb3.append(", activityStartTimeLocal=");
        sb3.append(this.f4398c);
        sb3.append(", activityEndTimeLocal=");
        sb3.append(this.f4399d);
        sb3.append(", includeMovement=");
        kg.f.q(", includeWeight=", ", includeActivity=", sb3, this.f4400e, this.f4401f);
        kg.f.q(", includeSleep=", ", includeHeartRate=", sb3, this.f4402g, this.f4403h);
        return com.airbnb.lottie.animation.keyframe.a.f(", includeCalories=", ")", sb3, this.f4404i, this.f4405j);
    }

    public a(DateTime dateTime, DateTime dateTime2, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        dateTime.getClass();
        dateTime2.getClass();
        localDateTime.getClass();
        localDateTime2.getClass();
        this.f4396a = dateTime;
        this.f4397b = dateTime2;
        this.f4398c = localDateTime;
        this.f4399d = localDateTime2;
        this.f4400e = z14;
        this.f4401f = z15;
        this.f4402g = z16;
        this.f4403h = z17;
        this.f4404i = z18;
        this.f4405j = z19;
    }
}
