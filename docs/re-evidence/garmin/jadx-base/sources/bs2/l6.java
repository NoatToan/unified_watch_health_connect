package bs2;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class l6 implements Comparable<l6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f20276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f20277b;

    static {
        sd.f20489i.getClass();
        new HashMap().put(268435456L, "MIN");
    }

    public l6(Date date) {
        this.f20276a = (date.getTime() - 631065600000L) / 1000;
        this.f20277b = ((date.getTime() - 631065600000L) % 1000) / 1000.0d;
    }

    public final Long a() {
        return new Long(this.f20276a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(l6 l6Var) {
        l6 l6Var2 = l6Var;
        if (this.f20276a == l6Var2.a().longValue()) {
            return Double.compare(this.f20277b, new Double(l6Var2.f20277b).doubleValue());
        }
        return this.f20276a > l6Var2.a().longValue() ? 1 : -1;
    }

    public final String toString() {
        return new Date((this.f20276a * 1000) + Math.round(this.f20277b * 1000.0d) + 631065600000L).toString();
    }

    public l6(long j8) {
        this.f20276a = j8;
        this.f20277b = 0.0d;
    }

    public l6(l6 l6Var) {
        this(l6Var.a().longValue(), new Double(l6Var.f20277b).doubleValue());
    }

    public l6(long j8, double d14) {
        this.f20276a = j8 + ((long) Math.floor(d14));
        this.f20277b = d14 - Math.floor(d14);
    }
}
