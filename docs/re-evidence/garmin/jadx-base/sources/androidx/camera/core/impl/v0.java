package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f5810i = x0.a.a(Integer.TYPE, "camerax.core.captureConfig.rotation");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f5811j = x0.a.a(Integer.class, "camerax.core.captureConfig.jpegQuality");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f5812k = x0.a.a(Range.class, "camerax.core.captureConfig.resolvedFrameRate");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DeferrableSurface> f5813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f5814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<s> f5817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w2 f5819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f5820h;

    public interface b {
        void a(b3<?> b3Var, a aVar);
    }

    public v0(List<DeferrableSurface> list, x0 x0Var, int i14, boolean z14, List<s> list2, boolean z15, w2 w2Var, c0 c0Var) {
        this.f5813a = list;
        this.f5814b = x0Var;
        this.f5815c = i14;
        this.f5817e = Collections.unmodifiableList(list2);
        this.f5818f = z15;
        this.f5819g = w2Var;
        this.f5820h = c0Var;
        this.f5816d = z14;
    }

    public final Range<Integer> a() {
        Range<Integer> range = (Range) this.f5814b.f(f5812k, q2.f5715a);
        Objects.requireNonNull(range);
        return range;
    }

    public final int b() {
        Object obj = this.f5819g.f5841a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int c() {
        Integer num = (Integer) this.f5814b.f(b3.F, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int d() {
        Integer num = (Integer) this.f5814b.f(b3.G, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashSet f5821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public w1 f5822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f5825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f5826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final y1 f5827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c0 f5828h;

        private a(v0 v0Var) {
            HashSet hashSet = new HashSet();
            this.f5821a = hashSet;
            this.f5822b = w1.U();
            this.f5823c = -1;
            this.f5824d = false;
            ArrayList arrayList = new ArrayList();
            this.f5825e = arrayList;
            this.f5826f = false;
            this.f5827g = y1.a();
            hashSet.addAll(v0Var.f5813a);
            this.f5822b = w1.V(v0Var.f5814b);
            this.f5823c = v0Var.f5815c;
            arrayList.addAll(v0Var.f5817e);
            this.f5826f = v0Var.f5818f;
            this.f5827g = y1.b(v0Var.f5819g);
            this.f5824d = v0Var.f5816d;
        }

        public static a f(v0 v0Var) {
            return new a(v0Var);
        }

        public final void a(Collection<s> collection) {
            Iterator<s> it = collection.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }

        public final void b(s sVar) {
            ArrayList arrayList = this.f5825e;
            if (arrayList.contains(sVar)) {
                return;
            }
            arrayList.add(sVar);
        }

        public final void c(x0 x0Var) {
            for (x0.a<?> aVar : x0Var.d()) {
                Object objF = this.f5822b.f(aVar, null);
                Object objE = x0Var.e(aVar);
                if (objF instanceof u1) {
                    u1 u1Var = (u1) objE;
                    u1Var.getClass();
                    ((u1) objF).f5798a.addAll(Collections.unmodifiableList(new ArrayList(u1Var.f5798a)));
                } else {
                    if (objE instanceof u1) {
                        objE = ((u1) objE).clone();
                    }
                    this.f5822b.W(aVar, x0Var.h(aVar), objE);
                }
            }
        }

        public final void d(DeferrableSurface deferrableSurface) {
            this.f5821a.add(deferrableSurface);
        }

        public final v0 e() {
            ArrayList arrayList = new ArrayList(this.f5821a);
            a2 a2VarT = a2.T(this.f5822b);
            int i14 = this.f5823c;
            boolean z14 = this.f5824d;
            ArrayList arrayList2 = new ArrayList(this.f5825e);
            boolean z15 = this.f5826f;
            w2 w2Var = w2.f5840b;
            ArrayMap arrayMap = new ArrayMap();
            y1 y1Var = this.f5827g;
            for (String str : y1Var.f5841a.keySet()) {
                arrayMap.put(str, y1Var.f5841a.get(str));
            }
            return new v0(arrayList, a2VarT, i14, z14, arrayList2, z15, new w2(arrayMap), this.f5828h);
        }

        public final Range<Integer> g() {
            return (Range) this.f5822b.f(v0.f5812k, q2.f5715a);
        }

        public a() {
            this.f5821a = new HashSet();
            this.f5822b = w1.U();
            this.f5823c = -1;
            this.f5824d = false;
            this.f5825e = new ArrayList();
            this.f5826f = false;
            this.f5827g = y1.a();
        }
    }
}
