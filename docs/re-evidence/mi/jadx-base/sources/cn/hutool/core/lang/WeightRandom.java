package cn.hutool.core.lang;

import cn.hutool.core.collection.CollUtil;
import defpackage.nbj;
import defpackage.v4f;
import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class WeightRandom<T> implements Serializable {
    private static final long serialVersionUID = -8244697995702786499L;
    private final TreeMap<Double, T> weightMap;

    public static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f5551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f5552b;

        public a(T t, double d) {
            this.f5551a = t;
            this.f5552b = d;
        }

        public T a() {
            return this.f5551a;
        }

        public double b() {
            return this.f5552b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            T t = this.f5551a;
            if (t == null) {
                if (aVar.f5551a != null) {
                    return false;
                }
            } else if (!t.equals(aVar.f5551a)) {
                return false;
            }
            return Double.doubleToLongBits(this.f5552b) == Double.doubleToLongBits(aVar.f5552b);
        }

        public int hashCode() {
            T t = this.f5551a;
            int iHashCode = t == null ? 0 : t.hashCode();
            long jDoubleToLongBits = Double.doubleToLongBits(this.f5552b);
            return ((iHashCode + 31) * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
    }

    public WeightRandom() {
        this.weightMap = new TreeMap<>();
    }

    public static <T> WeightRandom<T> create() {
        return new WeightRandom<>();
    }

    public WeightRandom<T> add(T t, double d) {
        return add(new a<>(t, d));
    }

    public WeightRandom<T> clear() {
        TreeMap<Double, T> treeMap = this.weightMap;
        if (treeMap != null) {
            treeMap.clear();
        }
        return this;
    }

    public T next() {
        if (v4f.o(this.weightMap)) {
            return null;
        }
        return this.weightMap.get(this.weightMap.tailMap(Double.valueOf(this.weightMap.lastKey().doubleValue() * nbj.b().nextDouble()), false).firstKey());
    }

    public WeightRandom<T> add(a<T> aVar) {
        if (aVar != null) {
            double dB = aVar.b();
            if (aVar.b() > 0.0d) {
                this.weightMap.put(Double.valueOf(dB + (this.weightMap.size() != 0 ? this.weightMap.lastKey().doubleValue() : 0.0d)), aVar.a());
            }
        }
        return this;
    }

    public WeightRandom(a<T> aVar) {
        this();
        if (aVar != null) {
            add(aVar);
        }
    }

    public WeightRandom(Iterable<a<T>> iterable) {
        this();
        if (CollUtil.i(iterable)) {
            Iterator<a<T>> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }

    public WeightRandom(a<T>[] aVarArr) {
        this();
        for (a<T> aVar : aVarArr) {
            add(aVar);
        }
    }
}
