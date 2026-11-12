package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class ap5 implements Comparable<ap5> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f3317b = Pattern.compile("^([+-]?\\d+(\\.\\d+)?)([a-zA-Z]{0,2})$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3318a;

    public ap5(long j) {
        this.f3318a = j;
    }

    public static ap5 b(long j) {
        return new ap5(j);
    }

    public static ap5 c(long j) {
        return new ap5(Math.multiplyExact(j, 1073741824L));
    }

    public static ap5 d(long j) {
        return new ap5(Math.multiplyExact(j, 1024L));
    }

    public static ap5 e(long j) {
        return new ap5(Math.multiplyExact(j, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
    }

    public static ap5 h(long j) {
        return new ap5(Math.multiplyExact(j, 1099511627776L));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ap5 ap5Var) {
        return Long.compare(this.f3318a, ap5Var.f3318a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ap5.class == obj.getClass() && this.f3318a == ((ap5) obj).f3318a;
    }

    public int hashCode() {
        return Long.hashCode(this.f3318a);
    }

    public String toString() {
        return String.format("%dB", Long.valueOf(this.f3318a));
    }
}
