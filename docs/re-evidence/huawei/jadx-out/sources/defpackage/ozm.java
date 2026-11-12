package defpackage;

import com.huawei.pluginachievement.ui.model.BestAchievementBasic;

/* JADX INFO: loaded from: classes13.dex */
public class ozm extends BestAchievementBasic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f45024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f45025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f45026c;
    private long d;
    private int e;

    public long c() {
        return this.f45025b;
    }

    public void c(long j) {
        this.f45025b = j;
    }

    public long d() {
        return this.d;
    }

    public void d(long j) {
        this.d = j;
    }

    public int e() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public long b() {
        return this.f45024a;
    }

    public void a(long j) {
        this.f45024a = j;
    }

    public long a() {
        return this.f45026c;
    }

    public void e(long j) {
        this.f45026c = j;
    }

    public String toString() {
        return "BestMotion{value=" + this.f45025b + ", startTime=" + this.d + ", source=" + this.e + ", deviceCode=" + this.f45024a + '}';
    }
}
