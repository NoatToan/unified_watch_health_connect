package defpackage;

import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes20.dex */
public class xew {
    GregorianCalendar e;

    public xew() {
        this(TimeZone.getDefault());
    }

    private int b() {
        return this.e.get(11);
    }

    public static long d() {
        return new GregorianCalendar().getTimeInMillis();
    }

    private int f() {
        return this.e.get(12);
    }

    private int g() {
        return this.e.get(13);
    }

    public int a() {
        return this.e.get(5);
    }

    public int c() {
        if (this.e.get(0) == 0) {
            return 0;
        }
        return this.e.get(1);
    }

    public void c(long j) {
        if (j == -1) {
            return;
        }
        this.e.setTimeInMillis(j);
    }

    public int e() {
        return this.e.get(2);
    }

    public String toString() {
        return " year:" + c() + " month:" + e() + " monthDay:" + a() + " hour:" + b() + " minute:" + f() + " second:" + g();
    }

    public xew(TimeZone timeZone) {
        this.e = null;
        this.e = new GregorianCalendar(timeZone);
    }
}
