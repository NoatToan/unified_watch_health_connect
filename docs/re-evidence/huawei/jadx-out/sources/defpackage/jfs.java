package defpackage;

import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jfs {
    private double h = 1080.0d;
    private double i = 1920.0d;
    private double n = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLong f38553c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLong f38551a = null;
    private double j = 1.0d;
    private int f = 10;
    private double d = 0.0d;
    private int k = 0;
    private int e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f38552b = 0.0d;
    private double g = 1.0d;

    private int d(double d) {
        if (d < 800.0d) {
            return -50;
        }
        if (d < 4000.0d) {
            return 50;
        }
        if (d < 10000.0d) {
            return 100;
        }
        if (d < 20000.0d) {
            return 150;
        }
        if (d < 50000.0d) {
            return 200;
        }
        return d < 100000.0d ? 250 : 300;
    }

    private double e(double d, double d2) {
        if (d2 < 1.0E-6d) {
            return 1.0d;
        }
        return d / d2;
    }

    public jfs c(double d) {
        this.n = d;
        return this;
    }

    public jfs b(LatLong latLong) {
        this.f38553c = latLong;
        return this;
    }

    public jfs d(LatLong latLong) {
        this.f38551a = latLong;
        return this;
    }

    private void i() {
        this.f = jer.d(2.5f);
    }

    private void h() {
        this.h = jer.a();
        double dE = jer.e();
        this.i = dE;
        LatLong latLong = this.f38551a;
        if (latLong == null || this.f38553c == null) {
            double d = this.n;
            this.d = d;
            this.g = d / (dE + this.h);
            return;
        }
        double dB = jfa.b(new LatLong(latLong.getLatLng().d, this.f38551a.getLatLng().f38787a), new LatLong(this.f38551a.getLatLng().d, this.f38553c.getLatLng().f38787a));
        double dB2 = jfa.b(new LatLong(this.f38551a.getLatLng().d, this.f38551a.getLatLng().f38787a), new LatLong(this.f38553c.getLatLng().d, this.f38551a.getLatLng().f38787a));
        this.d = (dB2 + dB) * 2.0d;
        double d2 = dB / this.h;
        double d3 = dB2 / this.i;
        if (d3 > d2) {
            d2 = d3;
        }
        this.g = d2;
    }

    private void g() {
        i();
        h();
    }

    public double d() {
        LatLong latLong;
        LatLong latLong2 = this.f38551a;
        if (latLong2 == null || (latLong = this.f38553c) == null) {
            return this.n;
        }
        return jfa.b(latLong2, latLong);
    }

    public double f() {
        a();
        double d = this.n;
        int i = this.f;
        if (((double) i) * d < 1.0E-6d) {
            this.j = 1.0d;
        } else {
            this.j = d / ((double) (this.k * i));
        }
        return this.j;
    }

    public int a() {
        LogUtil.a("Track_TrackSegmentManager", "Go into obtainTotalSamples");
        g();
        this.e = a(this.n);
        this.f38552b = e(this.n, this.d);
        int iD = this.e + d(this.n);
        this.k = iD;
        if (iD > 900) {
            iD = 900;
        }
        this.k = iD;
        LogUtil.a("Track_TrackSegmentManager", "Go out obtainTotalSamples");
        return this.k;
    }

    public int e() {
        LogUtil.a("Track_TrackSegmentManager", "Go into obtainSpinSamples");
        int i = (this.k * 2) / 10;
        LogUtil.a("Track_TrackSegmentManager", "Go out obtainSpinSamples");
        return i;
    }

    public int b() {
        LogUtil.a("Track_TrackSegmentManager", "Go into obtainSegmentSamples");
        int i = this.k / 10;
        LogUtil.a("Track_TrackSegmentManager", "Go out obtainSegmentSamples");
        return i;
    }

    public double c() {
        return this.f38552b;
    }

    private int a(double d) {
        double d2 = d / this.g;
        double dMax = Math.max(this.i, this.h);
        double d3 = this.i;
        double d4 = this.h;
        double dSqrt = Math.sqrt((d3 * d3) + (d4 * d4));
        double d5 = (this.i + this.h) * 2.0d;
        double d6 = d5 * 2.0d;
        if (d2 < dMax) {
            return 300;
        }
        if (d2 < dSqrt) {
            return 350;
        }
        if (d2 < d5) {
            return 400;
        }
        if (d2 < d6) {
            return 500;
        }
        return d2 < d6 * 2.0d ? 600 : 650;
    }
}
