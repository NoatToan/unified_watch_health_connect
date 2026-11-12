package defpackage;

import android.os.Bundle;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class iwp {
    private float j = 0.0f;
    private float e = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38140a = 0;
    private boolean d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38141b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38142c = 0;

    public void c(Bundle bundle) {
        int i = bundle.getInt("fitDistance", 0);
        this.f38140a = i != 0 ? i / 100 : 0;
        float f = bundle.getFloat("fitPace", 0.0f) * 3.6f;
        this.j = f;
        this.e = f != 0.0f ? 3600.0f / f : 0.0f;
        this.f38142c = bundle.getLong("fitTimestamp") * 1000;
        LogUtil.d("HiGeoManager", "new distance:" + this.f38140a + ",speed:" + this.j + ",pace:" + this.e);
    }

    public boolean b() {
        LogUtil.d("HiGeoManager", "mHiGeoTime:" + this.f38142c);
        if (this.f38142c == 0) {
            return false;
        }
        long jAbs = Math.abs(System.currentTimeMillis() - this.f38142c);
        LogUtil.d("HiGeoManager", "diffTime:" + jAbs);
        return jAbs > 5000;
    }

    public float a() {
        return this.j;
    }

    public boolean h() {
        return this.d;
    }

    public void c(boolean z) {
        this.d = z;
    }

    public boolean c() {
        return this.f38141b && this.d;
    }

    public int e() {
        return this.f38140a;
    }

    public float d() {
        return this.e;
    }

    public void b(long j) {
        this.f38142c = j;
    }
}
