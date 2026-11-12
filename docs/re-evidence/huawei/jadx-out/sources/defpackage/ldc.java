package defpackage;

import android.os.SystemClock;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ldc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39939c;
    private List<String> d;
    private long e;

    public String a() {
        return this.f39938b;
    }

    public long b() {
        return this.e;
    }

    public String d() {
        return this.f39937a;
    }

    public List<String> c() {
        return this.d;
    }

    public void b(String str) {
        this.f39938b = str;
    }

    public void e(long j) {
        this.e = j;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LogUtil.d("AtAuthInfo", "Current time = ", Long.valueOf(jElapsedRealtime), "in AuthInfo");
        this.f39939c = (j * 1000) + jElapsedRealtime;
    }

    public void b(List<String> list) {
        this.d = list;
    }

    public void c(String str) {
        this.f39937a = str;
    }

    public boolean e() {
        long jElapsedRealtime = this.f39939c - SystemClock.elapsedRealtime();
        ReleaseLogUtil.d("HiH_AtAuthInfo", "isExpiredTime left: ", Long.valueOf(jElapsedRealtime), "ms, mExpiredTimeStamp= ", Long.valueOf(this.f39939c));
        return jElapsedRealtime < 0;
    }
}
