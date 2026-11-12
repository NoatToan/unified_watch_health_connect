package defpackage;

import android.util.LongSparseArray;
import com.mi.health.map.data.GpsValues;
import com.mi.health.map.data.SportFloatValues;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class o5o {
    public static volatile o5o n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28774a = "SportValueHolder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LongSparseArray<WeakReference<GpsValues>> f28775b = new LongSparseArray<>();
    public LongSparseArray<WeakReference<SportFloatValues>> c = new LongSparseArray<>();
    public WeakReference<List<SportRecordItem>> d;
    public WeakReference<List<SportRecordItem>> e;
    public WeakReference<List<SportRecordItem>> f;
    public WeakReference<List<SportRecordItem>> g;
    public WeakReference<List<Location>> h;
    public WeakReference<List<Location>> i;
    public WeakReference<List<Location>> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<Location> f28776k;
    public List<SportRecordItem> l;
    public List<SportRecordItem> m;

    public static o5o e() {
        if (n == null) {
            synchronized (o5o.class) {
                try {
                    if (n == null) {
                        n = new o5o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return n;
    }

    public void a() {
        LongSparseArray<WeakReference<SportFloatValues>> longSparseArray = this.c;
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
        WeakReference<List<SportRecordItem>> weakReference = this.d;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference<List<SportRecordItem>> weakReference2 = this.e;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        WeakReference<List<SportRecordItem>> weakReference3 = this.f;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        WeakReference<List<SportRecordItem>> weakReference4 = this.g;
        if (weakReference4 != null) {
            weakReference4.clear();
        }
        WeakReference<List<Location>> weakReference5 = this.h;
        if (weakReference5 != null) {
            weakReference5.clear();
        }
        WeakReference<List<Location>> weakReference6 = this.i;
        if (weakReference6 != null) {
            weakReference6.clear();
        }
        WeakReference<List<Location>> weakReference7 = this.j;
        if (weakReference7 != null) {
            weakReference7.clear();
        }
        List<SportRecordItem> list = this.l;
        if (list != null) {
            list.clear();
        }
        List<Location> list2 = this.f28776k;
        if (list2 != null) {
            list2.clear();
        }
        List<SportRecordItem> list3 = this.m;
        if (list3 != null) {
            list3.clear();
        }
    }

    public List<Location> b() {
        List<Location> list = this.f28776k;
        if (list == null) {
            return null;
        }
        return list;
    }

    public GpsValues c(long j) {
        WeakReference<GpsValues> weakReference = this.f28775b.get(j);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public List<SportRecordItem> d() {
        WeakReference<List<SportRecordItem>> weakReference = this.d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public List<SportRecordItem> f() {
        WeakReference<List<SportRecordItem>> weakReference = this.e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public List<SportRecordItem> g() {
        return this.l;
    }

    public List<SportRecordItem> h() {
        WeakReference<List<SportRecordItem>> weakReference = this.g;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public List<SportRecordItem> i() {
        WeakReference<List<SportRecordItem>> weakReference = this.f;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void j(List<Location> list) {
        this.f28776k = list;
    }

    public void k(long j, GpsValues gpsValues) {
        this.f28775b.put(j, new WeakReference<>(gpsValues));
    }

    public void l(List<SportRecordItem> list) {
        this.d = new WeakReference<>(list);
    }

    public void m(List<SportRecordItem> list) {
        this.e = new WeakReference<>(list);
    }

    public void n(List<SportRecordItem> list) {
        this.l = list;
    }

    public void o(List<SportRecordItem> list) {
        this.g = new WeakReference<>(list);
    }

    public void p(List<SportRecordItem> list) {
        this.f = new WeakReference<>(list);
    }

    public void q(List<Location> list, List<Location> list2, List<Location> list3) {
        this.h = new WeakReference<>(list3);
        this.i = new WeakReference<>(list2);
        this.j = new WeakReference<>(list);
    }

    public final void r(List<SportRecordItem> list) {
        this.m = list;
    }

    public void s(@NotNull List<Map<SportRecordKey, List<Object>>> list) {
        if (list.size() == 3) {
            Map<SportRecordKey, List<Object>> map = list.get(1);
            Map<SportRecordKey, List<Object>> map2 = list.get(2);
            SportRecordKey sportRecordKey = SportRecordKey.Hr;
            List<Object> list2 = map.get(sportRecordKey);
            List<Object> list3 = map2.get(sportRecordKey);
            ArrayList arrayList = new ArrayList();
            if (list2 != null) {
                Iterator<Object> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((SportRecordItem) it.next());
                }
            }
            if (list3 != null) {
                Iterator<Object> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add((SportRecordItem) it2.next());
                }
            }
            r(arrayList);
        }
    }
}
