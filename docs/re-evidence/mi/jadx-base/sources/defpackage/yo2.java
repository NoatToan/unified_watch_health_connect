package defpackage;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class yo2 {
    public static yo2 c = new yo2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f40363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Calendar f40364b;

    public yo2() {
        this.f40363a = Long.MIN_VALUE;
        this.f40364b = Calendar.getInstance();
    }

    public int a() {
        if (this.f40364b.before(Long.valueOf(this.f40363a))) {
            return 0;
        }
        this.f40364b.setTime(new Date());
        int i = this.f40364b.get(1);
        int i2 = this.f40364b.get(2);
        int i3 = this.f40364b.get(5);
        this.f40364b.setTime(new Date(this.f40363a));
        int i4 = this.f40364b.get(1);
        int i5 = this.f40364b.get(2);
        int i6 = i - i4;
        return (i2 >= i5 && (i2 != i5 || i3 >= this.f40364b.get(5))) ? i6 : i6 - 1;
    }

    public long b() {
        return this.f40363a;
    }

    public boolean c() {
        return this.f40363a != Long.MIN_VALUE;
    }

    public void d(long j) {
        this.f40363a = j;
    }

    public String toString() {
        return super.toString() + "{birthday=" + this.f40363a + "}";
    }

    public yo2(long j) {
        this.f40363a = Long.MIN_VALUE;
        this.f40364b = Calendar.getInstance();
        this.f40363a = j;
    }
}
