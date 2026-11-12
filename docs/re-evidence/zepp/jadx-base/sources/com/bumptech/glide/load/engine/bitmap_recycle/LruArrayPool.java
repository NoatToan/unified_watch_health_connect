package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class LruArrayPool implements ArrayPool {
    private static final int g = 4194304;

    @VisibleForTesting
    public static final int h = 8;
    private static final int i = 2;
    private final d<a, Object> a;
    private final b b;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> c;
    private final Map<Class<?>, com.bumptech.glide.load.engine.bitmap_recycle.a<?>> d;
    private final int e;
    private int f;

    public static final class a implements f {
        private final b a;
        public int b;
        private Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.f
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Class<?> cls) {
            this.b = i;
            this.c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    public static final class b extends c<a> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i, Class<?> cls) {
            a aVarB = b();
            aVarB.b(i, cls);
            return aVarB;
        }
    }

    @VisibleForTesting
    public LruArrayPool() {
        this.a = new d<>();
        this.b = new b();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    private void a(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapI = i(cls);
        Integer num = (Integer) navigableMapI.get(Integer.valueOf(i2));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapI.remove(Integer.valueOf(i2));
                return;
            } else {
                navigableMapI.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
    }

    private void b() {
        c(this.e);
    }

    private void c(int i2) {
        while (this.f > i2) {
            Object objF = this.a.f();
            Preconditions.checkNotNull(objF);
            com.bumptech.glide.load.engine.bitmap_recycle.a aVarD = d(objF);
            this.f -= aVarD.getArrayLength(objF) * aVarD.getElementSizeInBytes();
            a(aVarD.getArrayLength(objF), objF.getClass());
            if (Log.isLoggable(aVarD.getTag(), 2)) {
                Log.v(aVarD.getTag(), "evicted: " + aVarD.getArrayLength(objF));
            }
        }
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> d(T t) {
        return e(t.getClass());
    }

    private <T> com.bumptech.glide.load.engine.bitmap_recycle.a<T> e(Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> byteArrayAdapter = (com.bumptech.glide.load.engine.bitmap_recycle.a) this.d.get(cls);
        if (byteArrayAdapter == null) {
            if (cls.equals(int[].class)) {
                byteArrayAdapter = new IntegerArrayAdapter();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                byteArrayAdapter = new ByteArrayAdapter();
            }
            this.d.put(cls, byteArrayAdapter);
        }
        return byteArrayAdapter;
    }

    @Nullable
    private <T> T f(a aVar) {
        return (T) this.a.a(aVar);
    }

    private <T> T h(a aVar, Class<T> cls) {
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVarE = e(cls);
        T t = (T) f(aVar);
        if (t != null) {
            this.f -= aVarE.getArrayLength(t) * aVarE.getElementSizeInBytes();
            a(aVarE.getArrayLength(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(aVarE.getTag(), 2)) {
            Log.v(aVarE.getTag(), "Allocated " + aVar.b + " bytes");
        }
        return aVarE.newArray(aVar.b);
    }

    private NavigableMap<Integer, Integer> i(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    private boolean j() {
        int i2 = this.f;
        return i2 == 0 || this.e / i2 >= 2;
    }

    private boolean k(int i2) {
        return i2 <= this.e / 2;
    }

    private boolean l(int i2, Integer num) {
        return num != null && (j() || num.intValue() <= i2 * 8);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized void clearMemory() {
        c(0);
    }

    public int g() {
        int iIntValue = 0;
        for (Class<?> cls : this.c.keySet()) {
            for (Integer num : this.c.get(cls).keySet()) {
                iIntValue += num.intValue() * ((Integer) this.c.get(cls).get(num)).intValue() * e(cls).getElementSizeInBytes();
            }
        }
        return iIntValue;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> T get(int i2, Class<T> cls) {
        Integer numCeilingKey;
        numCeilingKey = i(cls).ceilingKey(Integer.valueOf(i2));
        return (T) h(l(i2, numCeilingKey) ? this.b.e(numCeilingKey.intValue(), cls) : this.b.e(i2, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> T getExact(int i2, Class<T> cls) {
        return (T) h(this.b.e(i2, cls), cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    @Deprecated
    public <T> void put(T t, Class<T> cls) {
        put(t);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized void trimMemory(int i2) {
        try {
            if (i2 >= 40) {
                clearMemory();
            } else if (i2 >= 20 || i2 == 15) {
                c(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        com.bumptech.glide.load.engine.bitmap_recycle.a<T> aVarE = e(cls);
        int arrayLength = aVarE.getArrayLength(t);
        int elementSizeInBytes = aVarE.getElementSizeInBytes() * arrayLength;
        if (k(elementSizeInBytes)) {
            a aVarE2 = this.b.e(arrayLength, cls);
            this.a.d(aVarE2, t);
            NavigableMap<Integer, Integer> navigableMapI = i(cls);
            Integer num = (Integer) navigableMapI.get(Integer.valueOf(aVarE2.b));
            Integer numValueOf = Integer.valueOf(aVarE2.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapI.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += elementSizeInBytes;
            b();
        }
    }

    public LruArrayPool(int i2) {
        this.a = new d<>();
        this.b = new b();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i2;
    }
}
