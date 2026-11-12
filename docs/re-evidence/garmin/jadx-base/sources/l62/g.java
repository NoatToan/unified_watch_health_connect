package l62;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll62/g;", "", "Lorg/joda/time/DateTime;", "originalWorkoutDate", "Li53/c;", "", "selectableDateTimestamps", "planId", "workoutScheduleId", "<init>", "(Lorg/joda/time/DateTime;Li53/c;JJ)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f110553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<Long> f110554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f110555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f110556d;

    public g(DateTime dateTime, i53.c<Long> cVar, long j8, long j14) {
        dateTime.getClass();
        cVar.getClass();
        this.f110553a = dateTime;
        this.f110554b = cVar;
        this.f110555c = j8;
        this.f110556d = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f110553a.equals(gVar.f110553a) && this.f110554b.equals(gVar.f110554b) && this.f110555c == gVar.f110555c && this.f110556d == gVar.f110556d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f110556d) + q6.f.e(l2.a(this.f110554b, this.f110553a.hashCode() * 31, 31), 31, this.f110555c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RescheduleWorkoutUiState(originalWorkoutDate=");
        sb3.append(this.f110553a);
        sb3.append(", selectableDateTimestamps=");
        sb3.append(this.f110554b);
        sb3.append(", planId=");
        sb3.append(this.f110555c);
        return com.nimbusds.jose.shaded.gson.internal.a.g(this.f110556d, ", workoutScheduleId=", ")", sb3);
    }
}
