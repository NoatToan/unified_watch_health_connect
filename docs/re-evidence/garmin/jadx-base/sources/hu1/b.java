package hu1;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhu1/b;", "", "Lorg/joda/time/DateTime;", "startDate", "endDate", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f85711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f85712b;

    public b(DateTime dateTime, DateTime dateTime2) {
        dateTime.getClass();
        dateTime2.getClass();
        this.f85711a = dateTime;
        this.f85712b = dateTime2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f85711a.equals(bVar.f85711a) && this.f85712b.equals(bVar.f85712b);
    }

    public final int hashCode() {
        return this.f85712b.hashCode() + (this.f85711a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkoutInterval(startDate=" + this.f85711a + ", endDate=" + this.f85712b + ")";
    }
}
