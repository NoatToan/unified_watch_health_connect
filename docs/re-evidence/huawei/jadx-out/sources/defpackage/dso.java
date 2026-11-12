package defpackage;

import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.open.data.model.IWeightAndFatRateData;

/* JADX INFO: loaded from: classes7.dex */
public class dso extends HealthData implements IWeightAndFatRateData {
    private static final long serialVersionUID = 191744998741984175L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f32331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f32332c;
    private double d;
    private double e;
    private double f;
    private double g;
    private boolean k;
    private double n;
    private boolean o;
    private double p;
    private double r;
    private double s;
    private float t;
    private double[] l = new double[6];
    private int i = 1;
    private double[] h = new double[6];
    private String q = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32330a = "";
    private boolean m = false;
    private boolean j = false;

    public double i() {
        return this.g;
    }

    public void h(double d) {
        this.g = d;
    }

    public boolean t() {
        return ((Boolean) dym.d(Boolean.valueOf(this.m))).booleanValue();
    }

    public void a(boolean z) {
        this.m = ((Boolean) dym.d(Boolean.valueOf(z))).booleanValue();
    }

    public boolean s() {
        return ((Boolean) dym.d(Boolean.valueOf(this.k))).booleanValue();
    }

    public void e(boolean z) {
        this.k = ((Boolean) dym.d(Boolean.valueOf(z))).booleanValue();
    }

    @Override // com.huawei.health.device.open.data.model.IWeightAndFatRateData
    public float getWeight() {
        return ((Float) dym.d(Float.valueOf(this.t))).floatValue();
    }

    @Override // com.huawei.health.device.open.data.model.IWeightAndFatRateData
    public void setWeight(float f) {
        this.t = ((Float) dym.d(Float.valueOf(f))).floatValue();
    }

    @Override // com.huawei.health.device.open.data.model.IWeightAndFatRateData
    public float getBodyFatRat() {
        return ((Float) dym.d(Float.valueOf(this.f32332c))).floatValue();
    }

    public double l() {
        return ((Double) dym.d(Double.valueOf(this.p))).doubleValue();
    }

    public void g(double d) {
        this.p = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    @Override // com.huawei.health.device.open.data.model.IWeightAndFatRateData
    public void setBodyFatRat(float f) {
        this.f32332c = ((Float) dym.d(Float.valueOf(f))).floatValue();
    }

    public double[] m() {
        return (double[]) dym.d(this.l);
    }

    public int h() {
        return this.i;
    }

    public void c(int i) {
        this.i = i;
    }

    public double[] f() {
        return (double[]) dym.d(this.h);
    }

    public double d(int i) {
        double[] dArr = this.l;
        if (dArr.length <= 0 || i >= dArr.length) {
            return 0.0d;
        }
        return ((Double) dym.d(Double.valueOf(dArr[i]))).doubleValue();
    }

    public void e(int i, double d) {
        if (i >= 0) {
            double[] dArr = this.l;
            if (dArr.length > i) {
                dArr[i] = ((Double) dym.d(Double.valueOf(d))).doubleValue();
            }
        }
    }

    public double b(int i) {
        double[] dArr = this.h;
        if (dArr.length <= 0 || i >= dArr.length) {
            return 0.0d;
        }
        return ((Double) dym.d(Double.valueOf(dArr[i]))).doubleValue();
    }

    public void b(int i, double d) {
        if (i >= 0) {
            double[] dArr = this.h;
            if (dArr.length > i) {
                dArr[i] = ((Double) dym.d(Double.valueOf(d))).doubleValue();
            }
        }
    }

    public boolean p() {
        return ((Boolean) dym.d(Boolean.valueOf(this.o))).booleanValue();
    }

    public void d(boolean z) {
        this.o = ((Boolean) dym.d(Boolean.valueOf(z))).booleanValue();
    }

    public String o() {
        return this.q;
    }

    public void a(String str) {
        this.q = str;
    }

    public String g() {
        return this.f32330a;
    }

    public void b(String str) {
        this.f32330a = str;
    }

    public double c() {
        return ((Double) dym.d(Double.valueOf(this.d))).doubleValue();
    }

    public void d(double d) {
        this.d = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double j() {
        return ((Double) dym.d(Double.valueOf(this.r))).doubleValue();
    }

    public void a(double d) {
        this.r = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double e() {
        return ((Double) dym.d(Double.valueOf(this.f32331b))).doubleValue();
    }

    public void b(double d) {
        this.f32331b = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double n() {
        return this.s;
    }

    public void i(double d) {
        this.s = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double a() {
        return ((Double) dym.d(Double.valueOf(this.f))).doubleValue();
    }

    public void c(double d) {
        this.f = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double k() {
        return ((Double) dym.d(Double.valueOf(this.n))).doubleValue();
    }

    public void f(double d) {
        this.n = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public double b() {
        return ((Double) dym.d(Double.valueOf(this.e))).doubleValue();
    }

    public void e(double d) {
        this.e = ((Double) dym.d(Double.valueOf(d))).doubleValue();
    }

    public void c(boolean z) {
        this.j = ((Boolean) dym.d(Boolean.valueOf(z))).booleanValue();
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public String toString() {
        return "WeightAndFatRateData [ weight=" + this.t + "body_fat_rate=" + this.f32332c + "]";
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public dso mo828clone() {
        if (super.mo828clone() instanceof dso) {
            return (dso) super.mo828clone();
        }
        return new dso();
    }
}
