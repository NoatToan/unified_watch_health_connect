package defpackage;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import defpackage.erc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fu3<T extends erc<? extends Entry>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18243b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public List<T> i;

    public fu3() {
        this.f18242a = -3.4028235E38f;
        this.f18243b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        this.i = new ArrayList();
    }

    public void a(T t) {
        if (t == null) {
            return;
        }
        e(t);
        this.i.add(t);
    }

    public void b(Entry entry, int i) {
        if (this.i.size() <= i || i < 0) {
            return;
        }
        T t = this.i.get(i);
        if (t.g0(entry)) {
            f(entry, t.m0());
        }
    }

    public final List<T> c(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public void d() {
        List<T> list = this.i;
        if (list == null) {
            return;
        }
        this.f18242a = -3.4028235E38f;
        this.f18243b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e(it.next());
        }
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        erc ercVarO = o(this.i);
        if (ercVarO != null) {
            this.e = ercVarO.V();
            this.f = ercVarO.Z();
            for (T t : this.i) {
                if (t.m0() == YAxis.AxisDependency.LEFT) {
                    if (t.Z() < this.f) {
                        this.f = t.Z();
                    }
                    if (t.V() > this.e) {
                        this.e = t.V();
                    }
                }
            }
        }
        erc ercVarP = p(this.i);
        if (ercVarP != null) {
            this.g = ercVarP.V();
            this.h = ercVarP.Z();
            for (T t2 : this.i) {
                if (t2.m0() == YAxis.AxisDependency.RIGHT) {
                    if (t2.Z() < this.h) {
                        this.h = t2.Z();
                    }
                    if (t2.V() > this.g) {
                        this.g = t2.V();
                    }
                }
            }
        }
    }

    public void e(T t) {
        if (this.f18242a < t.V()) {
            this.f18242a = t.V();
        }
        if (this.f18243b > t.Z()) {
            this.f18243b = t.Z();
        }
        if (this.c < t.L()) {
            this.c = t.L();
        }
        if (this.d > t.A()) {
            this.d = t.A();
        }
        if (t.m0() == YAxis.AxisDependency.LEFT) {
            if (this.e < t.V()) {
                this.e = t.V();
            }
            if (this.f > t.Z()) {
                this.f = t.Z();
                return;
            }
            return;
        }
        if (this.g < t.V()) {
            this.g = t.V();
        }
        if (this.h > t.Z()) {
            this.h = t.Z();
        }
    }

    public void f(Entry entry, YAxis.AxisDependency axisDependency) {
        if (this.f18242a < entry.getY()) {
            this.f18242a = entry.getY();
        }
        if (this.f18243b > entry.getY()) {
            this.f18243b = entry.getY();
        }
        if (this.c < entry.getX()) {
            this.c = entry.getX();
        }
        if (this.d > entry.getX()) {
            this.d = entry.getX();
        }
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            if (this.e < entry.getY()) {
                this.e = entry.getY();
            }
            if (this.f > entry.getY()) {
                this.f = entry.getY();
                return;
            }
            return;
        }
        if (this.g < entry.getY()) {
            this.g = entry.getY();
        }
        if (this.h > entry.getY()) {
            this.h = entry.getY();
        }
    }

    public void g(float f, float f2) {
        Iterator<T> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().q(f, f2);
        }
        d();
    }

    public void h() {
        List<T> list = this.i;
        if (list != null) {
            list.clear();
        }
        x();
    }

    public T i(int i) {
        List<T> list = this.i;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.i.get(i);
    }

    public int j() {
        List<T> list = this.i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T k(Entry entry) {
        if (entry == null) {
            return null;
        }
        for (int i = 0; i < this.i.size(); i++) {
            T t = this.i.get(i);
            for (int i2 = 0; i2 < t.O0(); i2++) {
                if (entry.equalTo(t.v0(entry.getX(), entry.getY()))) {
                    return t;
                }
            }
        }
        return null;
    }

    public List<T> l() {
        return this.i;
    }

    public int m() {
        Iterator<T> it = this.i.iterator();
        int iO0 = 0;
        while (it.hasNext()) {
            iO0 += it.next().O0();
        }
        return iO0;
    }

    public Entry n(r7c r7cVar) {
        if (r7cVar.d() >= this.i.size()) {
            return null;
        }
        return this.i.get(r7cVar.d()).v0(r7cVar.h(), r7cVar.j());
    }

    public T o(List<T> list) {
        for (T t : list) {
            if (t.m0() == YAxis.AxisDependency.LEFT) {
                return t;
            }
        }
        return null;
    }

    public T p(List<T> list) {
        for (T t : list) {
            if (t.m0() == YAxis.AxisDependency.RIGHT) {
                return t;
            }
        }
        return null;
    }

    public T q() {
        List<T> list = this.i;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T t = this.i.get(0);
        for (T t2 : this.i) {
            if (t2.O0() > t.O0()) {
                t = t2;
            }
        }
        return t;
    }

    public float r() {
        return this.c;
    }

    public float s() {
        return this.d;
    }

    public float t() {
        return this.f18242a;
    }

    public float u(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f = this.e;
            return f == -3.4028235E38f ? this.g : f;
        }
        float f2 = this.g;
        return f2 == -3.4028235E38f ? this.e : f2;
    }

    public float v() {
        return this.f18243b;
    }

    public float w(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f = this.f;
            return f == Float.MAX_VALUE ? this.h : f;
        }
        float f2 = this.h;
        return f2 == Float.MAX_VALUE ? this.f : f2;
    }

    public void x() {
        d();
    }

    public fu3(T... tArr) {
        this.f18242a = -3.4028235E38f;
        this.f18243b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        this.i = c(tArr);
        x();
    }

    public fu3(List<T> list) {
        this.f18242a = -3.4028235E38f;
        this.f18243b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        this.i = list;
        x();
    }
}
