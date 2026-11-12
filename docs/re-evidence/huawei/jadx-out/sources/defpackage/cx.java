package defpackage;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.PerformanceTracker;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class cx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f31458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f31459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SparseArrayCompat<fq> f31460c;
    private Map<String, fs> d;
    private Rect e;
    private Map<String, ed> f;
    private float g;
    private LongSparseArray<Layer> h;
    private boolean i;
    private List<Layer> j;
    private Map<String, List<Layer>> k;
    private float l;
    private List<fw> o;
    private final PerformanceTracker n = new PerformanceTracker();
    private final HashSet<String> s = new HashSet<>();
    private int m = 0;

    public void b(Rect rect, float f, float f2, float f3, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, ed> map2, float f4, SparseArrayCompat<fq> sparseArrayCompat, Map<String, fs> map3, List<fw> list2) {
        this.e = rect;
        this.l = f;
        this.f31458a = f2;
        this.f31459b = f3;
        this.j = list;
        this.h = longSparseArray;
        this.k = map;
        this.f = map2;
        this.g = f4;
        this.f31460c = sparseArrayCompat;
        this.d = map3;
        this.o = list2;
    }

    public void d(String str) {
        iy.d(str);
        this.s.add(str);
    }

    public void b(boolean z) {
        this.i = z;
    }

    public void e(int i) {
        this.m += i;
    }

    public boolean n() {
        return this.i;
    }

    public int h() {
        return this.m;
    }

    public void a(boolean z) {
        this.n.e(z);
    }

    public PerformanceTracker o() {
        return this.n;
    }

    public Layer a(long j) {
        return this.h.get(j);
    }

    public Rect c() {
        return this.e;
    }

    public float e() {
        return (long) ((d() / this.f31459b) * 1000.0f);
    }

    public float l() {
        return this.l;
    }

    public float b() {
        return this.f31458a;
    }

    public float b(float f) {
        return jc.a(this.l, this.f31458a, f);
    }

    public float f() {
        return this.f31459b;
    }

    public List<Layer> j() {
        return this.j;
    }

    public List<Layer> a(String str) {
        return this.k.get(str);
    }

    public SparseArrayCompat<fq> a() {
        return this.f31460c;
    }

    public Map<String, fs> i() {
        return this.d;
    }

    public fw b(String str) {
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            fw fwVar = this.o.get(i);
            if (fwVar.d(str)) {
                return fwVar;
            }
        }
        return null;
    }

    public Map<String, ed> g() {
        float fE = je.e();
        if (fE != this.g) {
            for (Map.Entry<String, ed> entry : this.f.entrySet()) {
                this.f.put(entry.getKey(), entry.getValue().d(this.g / fE));
            }
        }
        this.g = fE;
        return this.f;
    }

    public float d() {
        return this.f31458a - this.l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b("\t"));
        }
        return sb.toString();
    }
}
