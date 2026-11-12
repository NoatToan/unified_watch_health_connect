package hy;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhy/o;", "Lhy/g;", "", "phase", "Lorg/joda/time/DateTime;", "date", "<init>", "(ILorg/joda/time/DateTime;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f86348b;

    public o(int i14, DateTime dateTime) {
        super(null);
        this.f86347a = i14;
        this.f86348b = dateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f86347a == oVar.f86347a && p005kotlin.jvm.internal.s.g(this.f86348b, oVar.f86348b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f86347a) * 31;
        DateTime dateTime = this.f86348b;
        return iHashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public final String toString() {
        return "MenstrualCycleDestination(phase=" + this.f86347a + ", date=" + this.f86348b + ")";
    }
}
