package defpackage;

import android.util.Pair;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class vhi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("eatingWindow")
    private long f51098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("baseTime")
    private long f51099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("settingEndTime")
    private int f51100c;

    @SerializedName("repeat")
    private int d;

    @SerializedName("periodTime")
    private long e;

    @SerializedName("version")
    private int g = 0;

    @SerializedName("settingInfo")
    private String h;

    @SerializedName("validWeekDays")
    private String j;

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vhi vhiVar = (vhi) obj;
        return this.f51099b == vhiVar.f51099b && this.f51098a == vhiVar.f51098a && this.e == vhiVar.e && this.d == vhiVar.d && this.g == vhiVar.g && this.f51100c == vhiVar.f51100c && Objects.equals(this.j, vhiVar.j) && Objects.equals(this.h, vhiVar.h);
    }

    public int hashCode() {
        long j = this.f51099b;
        long j2 = this.f51098a;
        long j3 = this.e;
        int i = this.d;
        int i2 = this.g;
        int i3 = this.f51100c;
        return Objects.hash(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), this.j, this.h);
    }

    public vhi(long j, long j2, int i) {
        this.f51098a = j2;
        this.e = j;
        this.d = i;
    }

    public long a() {
        return this.f51099b;
    }

    public void e(long j) {
        this.f51099b = j;
    }

    public long b() {
        return this.f51098a;
    }

    public long c() {
        return this.e;
    }

    public int g() {
        return this.d;
    }

    public void e(int i) {
        this.d = i;
    }

    public int i() {
        return this.g;
    }

    public int j() {
        return this.f51100c;
    }

    public void c(int i) {
        this.f51100c = i;
    }

    public String f() {
        return this.j;
    }

    public void b(String str) {
        this.j = str;
    }

    public void d(long j) {
        this.f51098a = j;
    }

    public void b(long j) {
        this.e = j;
    }

    public Pair<Integer, Integer> e() {
        int i = (int) (this.f51099b / 60);
        int i2 = i / 60;
        if (i2 >= 24) {
            i2 %= 24;
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i % 60));
    }

    public Pair<Integer, Integer> d() {
        int i = (int) ((this.f51099b + this.f51098a) / 60);
        int i2 = i / 60;
        if (i2 >= 24) {
            i2 %= 24;
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i % 60));
    }

    public String toString() {
        return "FastingLiteSetting{mBaseTime=" + this.f51099b + ", mEatingWindow=" + this.f51098a + ", mPeriodTime=" + this.e + ", mRepeat=" + this.d + ", mSettingEndTime=" + this.f51100c + ", mValidWeekDays=" + this.j + "}";
    }
}
