package yr0;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyr0/c;", "Lyr0/b;", "Lorg/joda/time/LocalDate;", "date", "<init>", "(Lorg/joda/time/LocalDate;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f198936a;

    public c(LocalDate localDate) {
        super(null);
        this.f198936a = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f198936a, ((c) obj).f198936a);
    }

    public final int hashCode() {
        LocalDate localDate = this.f198936a;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }

    public final String toString() {
        return "FromGivenDay(date=" + this.f198936a + ")";
    }
}
