package o81;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo81/e;", "Lo81/d;", "Lorg/joda/time/LocalDate;", "date", "<init>", "(Lorg/joda/time/LocalDate;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f130835a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LocalDate localDate) {
        super(null);
        localDate.getClass();
        this.f130835a = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && s.g(this.f130835a, ((e) obj).f130835a);
    }

    public final int hashCode() {
        return this.f130835a.hashCode();
    }

    public final String toString() {
        return "HillScoreOneMonthDestination(date=" + this.f130835a + ")";
    }
}
