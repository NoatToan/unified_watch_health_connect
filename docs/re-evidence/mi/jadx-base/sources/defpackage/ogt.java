package defpackage;

import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class ogt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29161b;
    public int c;
    public int d;
    public int e;

    public ogt(int i, int i2, int i3, int i4) {
        this.f29160a = i;
        this.f29161b = i2;
        this.c = i3;
        this.d = i4;
        this.e = ProfileUtils.getTimezoneKey(i4);
    }

    public int a() {
        return this.c;
    }

    public String b() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(this.f29160a, this.f29161b, this.c);
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(calendar.getTime());
    }

    public int c() {
        return this.f29161b;
    }

    public int d() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTimeZone(ProfileUtils.getTimezone((byte) this.e));
        calendar.set(this.f29160a, this.f29161b, this.c);
        return (int) (calendar.getTimeInMillis() / 1000);
    }

    public int e() {
        return this.f29160a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ogt ogtVar = (ogt) obj;
        return this.f29160a == ogtVar.f29160a && this.f29161b == ogtVar.f29161b && this.c == ogtVar.c;
    }

    public int hashCode() {
        return (((this.f29160a * 31) + this.f29161b) * 31) + this.c;
    }

    public String toString() {
        return "DeviceDay{year=" + this.f29160a + ", month=" + this.f29161b + ", day=" + this.c + ", tz=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }
}
