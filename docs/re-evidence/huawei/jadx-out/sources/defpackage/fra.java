package defpackage;

import com.huawei.hihealth.ResultUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class fra implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f34428a;
    public long d;
    public long f;
    private long l;
    private long m;
    public int g = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34430c = -1;
    public int j = -1;
    public int i = -1;
    public int h = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34429b = -1;
    public int e = -1;

    public void e(int i) {
        this.g = ((Integer) ResultUtils.c(Integer.valueOf(i))).intValue();
    }

    public int b() {
        return ((Integer) ResultUtils.c(Integer.valueOf(this.g))).intValue();
    }

    public void b(int i) {
        this.f34430c = ((Integer) ResultUtils.c(Integer.valueOf(i))).intValue();
    }

    public int d() {
        return ((Integer) ResultUtils.c(Integer.valueOf(this.f34430c))).intValue();
    }

    public void a(int i) {
        this.j = ((Integer) ResultUtils.c(Integer.valueOf(i))).intValue();
    }

    public int a() {
        return ((Integer) ResultUtils.c(Integer.valueOf(this.j))).intValue();
    }

    public long e() {
        return ((Long) ResultUtils.c(Long.valueOf(this.l))).longValue();
    }

    public void b(long j) {
        this.l = ((Long) ResultUtils.c(Long.valueOf(j))).longValue();
    }

    public long c() {
        return ((Long) ResultUtils.c(Long.valueOf(this.m))).longValue();
    }

    public void a(long j) {
        this.m = ((Long) ResultUtils.c(Long.valueOf(j))).longValue();
    }

    public String toString() {
        return " FitnessHistogramData mHistogramHeight = " + this.j + "  mStartPoint = " + this.g + "  mEndPoint = " + this.f34430c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fra fraVar = (fra) obj;
        return this.g == fraVar.g && this.f34430c == fraVar.f34430c && this.j == fraVar.j && this.i == fraVar.i && this.h == fraVar.h && this.f34429b == fraVar.f34429b && this.e == fraVar.e && this.f == fraVar.f && this.f34428a == fraVar.f34428a && this.d == fraVar.d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.g), Integer.valueOf(this.f34430c), Integer.valueOf(this.j), Integer.valueOf(this.i), Integer.valueOf(this.h), Integer.valueOf(this.f34429b), Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.f34428a), Long.valueOf(this.d));
    }
}
