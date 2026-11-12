package defpackage;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class lse {
    public Map<String, List<Layer>> c;
    public Map<String, mte> d;
    public Map<String, sz9> e;
    public List<g5f> f;
    public SparseArrayCompat<vz9> g;
    public LongSparseArray<Layer> h;
    public List<Layer> i;
    public Rect j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f25399k;
    public float l;
    public float m;
    public boolean n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tqh f25397a = new tqh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet<String> f25398b = new HashSet<>();
    public int o = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(String str) {
        rpe.c(str);
        this.f25398b.add(str);
    }

    public Rect b() {
        return this.j;
    }

    public SparseArrayCompat<vz9> c() {
        return this.g;
    }

    public float d() {
        return (long) ((e() / this.m) * 1000.0f);
    }

    public float e() {
        return this.l - this.f25399k;
    }

    public float f() {
        return this.l;
    }

    public Map<String, sz9> g() {
        return this.e;
    }

    public float h(float f) {
        return d5g.i(this.f25399k, this.l, f);
    }

    public float i() {
        return this.m;
    }

    public Map<String, mte> j() {
        return this.d;
    }

    public List<Layer> k() {
        return this.i;
    }

    public g5f l(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            g5f g5fVar = this.f.get(i);
            if (g5fVar.a(str)) {
                return g5fVar;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int m() {
        return this.o;
    }

    public tqh n() {
        return this.f25397a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<Layer> o(String str) {
        return this.c.get(str);
    }

    public float p() {
        return this.f25399k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean q() {
        return this.n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void r(int i) {
        this.o += i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void s(Rect rect, float f, float f2, float f3, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, mte> map2, SparseArrayCompat<vz9> sparseArrayCompat, Map<String, sz9> map3, List<g5f> list2) {
        this.j = rect;
        this.f25399k = f;
        this.l = f2;
        this.m = f3;
        this.i = list;
        this.h = longSparseArray;
        this.c = map;
        this.d = map2;
        this.g = sparseArrayCompat;
        this.e = map3;
        this.f = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer t(long j) {
        return this.h.get(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().y("\t"));
        }
        return sb.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void u(boolean z) {
        this.n = z;
    }

    public void v(boolean z) {
        this.f25397a.b(z);
    }
}
