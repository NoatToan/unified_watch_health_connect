package defpackage;

import com.huawei.hihealth.data.model.TrackSwimSegment;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class awr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f720b;
    private List<njj> d;
    private Map<Integer, Float> f;
    private List<TrackSwimSegment> h;
    private Map<Double, Double> j;
    private long n = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f721c = 0.0f;
    private float g = 0.0f;
    private int m = 0;
    private int o = 0;
    private boolean e = false;
    private int i = 0;
    private int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f719a = 0;

    public Map<Double, Double> f() {
        return this.j;
    }

    public void b(Map<Double, Double> map) {
        this.j = map;
    }

    public float b() {
        return ((Float) lst.d(Float.valueOf(this.f721c))).floatValue();
    }

    public float o() {
        return this.g;
    }

    public void d(float f) {
        this.g = f;
    }

    public void c(float f) {
        this.f721c = ((Float) lst.d(Float.valueOf(f))).floatValue();
    }

    public void d(Map<Integer, Float> map) {
        this.f = (Map) lst.d(map);
    }

    public void a(List<njj> list) {
        this.d = (List) lst.d(list);
    }

    public List<njj> d() {
        if (njy.b(this.d)) {
            return (List) lst.d(this.d);
        }
        return (List) lst.d(njv.c(this.f));
    }

    public int j() {
        return ((Integer) lst.d(Integer.valueOf(this.m))).intValue();
    }

    public void c(Map<String, String> map) {
        this.f720b = map;
    }

    public void c(int i) {
        this.m = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int i() {
        return ((Integer) lst.d(Integer.valueOf(this.o))).intValue();
    }

    public void b(int i) {
        this.o = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public boolean a() {
        return ((Boolean) lst.d(Boolean.valueOf(this.e))).booleanValue();
    }

    public void a(boolean z) {
        this.e = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public void e(int i) {
        this.i = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public long g() {
        return ((Long) lst.d(Long.valueOf(this.n))).longValue();
    }

    public void b(long j) {
        this.n = ((Long) lst.d(Long.valueOf(j))).longValue();
    }

    public int e() {
        return ((Integer) lst.d(Integer.valueOf(this.i))).intValue();
    }

    public void a(int i) {
        this.k = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public List<TrackSwimSegment> c() {
        return (List) lst.d(this.h);
    }

    public void d(List<TrackSwimSegment> list) {
        this.h = list;
    }

    public int h() {
        return this.f719a;
    }

    public void d(int i) {
        this.f719a = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("mSportType ");
        stringBuffer.append(this.i).append(" mTrackType ").append(this.k).append(System.lineSeparator());
        stringBuffer.append("mTotalDistance ").append(this.m).append("mTotalSteps").append(this.o).append(System.lineSeparator());
        stringBuffer.append("mIsSupportStep ").append(this.e).append("mAvgPace").append(this.f721c).append(System.lineSeparator());
        stringBuffer.append("mPaceMap ").append(this.f.toString());
        return stringBuffer.toString();
    }
}
