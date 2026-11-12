package x61;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx61/r;", "", "Lcom/garmin/android/apps/connectmobile/performance/model/c$c;", "sportType", "Lorg/joda/time/DateTime;", "vo2Date", "", "vo2Max", "preciseVo2Max", "<init>", "(Lcom/garmin/android/apps/connectmobile/performance/model/c$c;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/Double;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c f189276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f189277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f189278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f189279d;

    public r(com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c, DateTime dateTime, Double d14, Double d15) {
        this.f189276a = enumC0736c;
        this.f189277b = dateTime;
        this.f189278c = d14;
        this.f189279d = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f189276a == rVar.f189276a && p005kotlin.jvm.internal.s.g(this.f189277b, rVar.f189277b) && p005kotlin.jvm.internal.s.g(this.f189278c, rVar.f189278c) && p005kotlin.jvm.internal.s.g(this.f189279d, rVar.f189279d);
    }

    public final int hashCode() {
        com.garmin.android.apps.connectmobile.performance.model.c.EnumC0736c enumC0736c = this.f189276a;
        int iHashCode = (enumC0736c == null ? 0 : enumC0736c.hashCode()) * 31;
        DateTime dateTime = this.f189277b;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Double d14 = this.f189278c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f189279d;
        return iHashCode3 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingStatusVO2Max(sportType=");
        sb3.append(this.f189276a);
        sb3.append(", vo2Date=");
        sb3.append(this.f189277b);
        sb3.append(", vo2Max=");
        return sn.a.f(this.f189278c, this.f189279d, ", preciseVo2Max=", ")", sb3);
    }
}
