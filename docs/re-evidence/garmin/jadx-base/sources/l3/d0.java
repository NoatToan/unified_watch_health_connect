package l3;

import ch.qos.logback.core.CoreConstants;
import com.roomorama.caldroid.CaldroidFragment;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll3/d0;", "", "", CaldroidFragment.YEAR, CaldroidFragment.MONTH, "dayOfMonth", "", "utcTimeMillis", "<init>", "(IIIJ)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class d0 implements Comparable<d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f109211d;

    public d0(int i14, int i15, int i16, long j8) {
        this.f109208a = i14;
        this.f109209b = i15;
        this.f109210c = i16;
        this.f109211d = j8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d0 d0Var) {
        return p005kotlin.jvm.internal.s.i(this.f109211d, d0Var.f109211d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f109208a == d0Var.f109208a && this.f109209b == d0Var.f109209b && this.f109210c == d0Var.f109210c && this.f109211d == d0Var.f109211d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f109211d) + q2.d(this.f109210c, q2.d(this.f109209b, Integer.hashCode(this.f109208a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CalendarDate(year=");
        sb3.append(this.f109208a);
        sb3.append(", month=");
        sb3.append(this.f109209b);
        sb3.append(", dayOfMonth=");
        sb3.append(this.f109210c);
        sb3.append(", utcTimeMillis=");
        return androidx.room.a0.l(sb3, this.f109211d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
