package l3;

import ch.qos.logback.core.CoreConstants;
import com.roomorama.caldroid.CaldroidFragment;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll3/h0;", "", "", CaldroidFragment.YEAR, CaldroidFragment.MONTH, "numberOfDays", "daysFromStartOfWeekToFirstOfMonth", "", "startUtcTimeMillis", "<init>", "(IIIIJ)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f109264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f109265f;

    public h0(int i14, int i15, int i16, int i17, long j8) {
        this.f109260a = i14;
        this.f109261b = i15;
        this.f109262c = i16;
        this.f109263d = i17;
        this.f109264e = j8;
        this.f109265f = ((((long) i16) * 86400000) + j8) - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f109260a == h0Var.f109260a && this.f109261b == h0Var.f109261b && this.f109262c == h0Var.f109262c && this.f109263d == h0Var.f109263d && this.f109264e == h0Var.f109264e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f109264e) + q2.d(this.f109263d, q2.d(this.f109262c, q2.d(this.f109261b, Integer.hashCode(this.f109260a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CalendarMonth(year=");
        sb3.append(this.f109260a);
        sb3.append(", month=");
        sb3.append(this.f109261b);
        sb3.append(", numberOfDays=");
        sb3.append(this.f109262c);
        sb3.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb3.append(this.f109263d);
        sb3.append(", startUtcTimeMillis=");
        return androidx.room.a0.l(sb3, this.f109264e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
