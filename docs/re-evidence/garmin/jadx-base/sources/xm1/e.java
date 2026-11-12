package xm1;

import j20.x;
import km1.r;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxm1/e;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "bedtimeSecondsSinceMidnight", "wakeTimeSecondsSinceMidnight", "Lkm1/r;", "sleepAlignmentStatus", "<init>", "(Lorg/joda/time/LocalDate;JJLkm1/r;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f191504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f191505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f191506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f191507d;

    public /* synthetic */ e(LocalDate localDate, long j8, long j14, r rVar, int i14, j jVar) {
        this(localDate, j8, j14, (i14 & 8) != 0 ? null : rVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f191504a, eVar.f191504a) && this.f191505b == eVar.f191505b && this.f191506c == eVar.f191506c && this.f191507d == eVar.f191507d;
    }

    public final int hashCode() {
        LocalDate localDate = this.f191504a;
        int iE = q6.f.e(q6.f.e((localDate == null ? 0 : localDate.hashCode()) * 31, 31, this.f191505b), 31, this.f191506c);
        r rVar = this.f191507d;
        return iE + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SleepConsistencyValue(calendarDate=");
        sb3.append(this.f191504a);
        sb3.append(", bedtimeSecondsSinceMidnight=");
        sb3.append(this.f191505b);
        x.j(this.f191506c, ", wakeTimeSecondsSinceMidnight=", ", sleepAlignmentStatus=", sb3);
        sb3.append(this.f191507d);
        sb3.append(")");
        return sb3.toString();
    }

    public e(LocalDate localDate, long j8, long j14, r rVar) {
        this.f191504a = localDate;
        this.f191505b = j8;
        this.f191506c = j14;
        this.f191507d = rVar;
    }
}
