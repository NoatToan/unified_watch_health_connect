package po2;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpo2/h0;", "", "Lpo2/i0;", "transactionType", "", "amount", "Lorg/joda/time/LocalDate;", "localDate", "Lorg/joda/time/LocalTime;", "localTime", "<init>", "(Lpo2/i0;DLorg/joda/time/LocalDate;Lorg/joda/time/LocalTime;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f139207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f139208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f139209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalTime f139210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f139211e;

    public h0(i0 i0Var, double d14, LocalDate localDate, LocalTime localTime) {
        i0Var.getClass();
        localDate.getClass();
        localTime.getClass();
        this.f139207a = i0Var;
        this.f139208b = d14;
        this.f139209c = localDate;
        this.f139210d = localTime;
        this.f139211e = o13.m.b(new ov1.u(this, 16));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f139207a == h0Var.f139207a && Double.compare(this.f139208b, h0Var.f139208b) == 0 && this.f139209c.equals(h0Var.f139209c) && this.f139210d.equals(h0Var.f139210d);
    }

    public final int hashCode() {
        return this.f139210d.hashCode() + ((this.f139209c.hashCode() + org.apache.commons.lang3.e.b(this.f139207a.hashCode() * 31, 31, this.f139208b)) * 31);
    }

    public final String toString() {
        return "SnowballTransactionItem(transactionType=" + this.f139207a + ", amount=" + this.f139208b + ", localDate=" + this.f139209c + ", localTime=" + this.f139210d + ")";
    }
}
