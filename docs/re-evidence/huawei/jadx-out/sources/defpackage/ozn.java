package defpackage;

import com.huawei.pluginachievement.ui.model.BestAchievementBasic;

/* JADX INFO: loaded from: classes13.dex */
public class ozn extends BestAchievementBasic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f45027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f45029c;
    private long d;
    private long e;

    public double e() {
        return this.f45027a;
    }

    public void c(double d) {
        this.f45027a = d;
    }

    public long c() {
        return this.d;
    }

    public void a(long j) {
        this.d = j;
    }

    public long d() {
        return this.e;
    }

    public void c(long j) {
        this.e = j;
    }

    public int a() {
        return this.f45028b;
    }

    public void c(int i) {
        this.f45028b = i;
    }

    public long b() {
        return this.f45029c;
    }

    public void e(long j) {
        this.f45029c = j;
    }

    public String toString() {
        return "BestMotionPace{value=" + this.f45027a + ", startTime=" + this.d + ", source=" + this.f45028b + ", deviceCode=" + this.e + '}';
    }
}
