package health.compact.a;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class StepsRecord {
    public int f = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36649c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36647a = -1;
    public int e = -1;
    public int h = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36648b = -1;
    public int g = -1;
    public int d = -1;
    public int j = -1;
    private long i = System.currentTimeMillis();

    public boolean d(StepsRecord stepsRecord) {
        return stepsRecord != null && this.f == stepsRecord.f && this.f36649c == stepsRecord.f36649c && this.f36647a == stepsRecord.f36647a && this.e == stepsRecord.e;
    }

    public void b() {
        this.f = -1;
        this.f36648b = -1;
        this.f36649c = -1;
        this.f36647a = -1;
        this.e = -1;
        this.h = -1;
        this.g = -1;
        this.d = -1;
        this.j = -1;
        this.i = System.currentTimeMillis();
    }

    public boolean d() {
        int i = this.f;
        if (i < 0 || this.f36649c < 0 || this.f36647a < 0 || this.e < 0 || this.h < 0) {
            com.huawei.hwlogsmodel.LogUtil.j("steps_StepsRecord", "error data: ", toString());
            return false;
        }
        if (i <= 1000000) {
            return true;
        }
        com.huawei.hwlogsmodel.LogUtil.j("steps_StepsRecord", " the day step is to large,the step :", LogAnonymous.d(i));
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StepsRecord stepsRecord = (StepsRecord) obj;
            if (this.f == stepsRecord.f && this.f36649c == stepsRecord.f36649c && this.f36647a == stepsRecord.f36647a && this.e == stepsRecord.e && this.g == stepsRecord.g && this.d == stepsRecord.d && this.j == stepsRecord.j && this.h == stepsRecord.h) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f;
        int i2 = this.f36649c;
        int i3 = this.f36647a;
        int i4 = this.e;
        int i5 = this.h;
        return (((((((((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + this.g) * 31) + this.d) * 31) + this.j;
    }

    public void a(StepsRecord stepsRecord) {
        if (stepsRecord != null) {
            this.f = stepsRecord.f;
            this.f36648b = stepsRecord.f36648b;
            this.f36649c = stepsRecord.f36649c;
            this.f36647a = stepsRecord.f36647a;
            this.e = stepsRecord.e;
            this.h = stepsRecord.h;
            this.g = stepsRecord.g;
            this.d = stepsRecord.d;
            this.j = stepsRecord.j;
            this.i = System.currentTimeMillis();
        }
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("step", this.f);
        bundle.putInt("devicestep", this.f36648b);
        bundle.putInt("distance", this.f36647a);
        bundle.putInt("carior", this.f36649c);
        bundle.putInt("floor", this.e);
        bundle.putInt("target", this.h);
        bundle.putInt("stepTarget", this.h);
        bundle.putInt("intensityTime", this.g);
        bundle.putInt("activeCount", this.d);
        bundle.putInt("wheelChair", this.j);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("step ");
        sb.append(this.f);
        sb.append(" devicestep ");
        sb.append(this.f36648b);
        sb.append(" calorie ");
        sb.append(this.f36649c);
        sb.append(" floor ");
        sb.append(this.e);
        sb.append(" distance ");
        sb.append(this.f36647a);
        sb.append(" target ");
        sb.append(this.h);
        sb.append(" intensity ");
        sb.append(this.g);
        sb.append(" activeCount ");
        sb.append(this.d);
        sb.append(" wheelChair ");
        sb.append(this.j);
        sb.append(" updateTime ");
        sb.append(this.i);
        return sb.toString();
    }

    public long e() {
        return this.i;
    }
}
