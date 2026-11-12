package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool.Poolable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectPool<T extends Poolable> {
    private static int g;
    private int a;
    private int b;
    private Object[] c;
    private int d;
    private T e;
    private float f;

    public static abstract class Poolable {
        public static int NO_OWNER = -1;
        public int a = NO_OWNER;

        public abstract Poolable instantiate();
    }

    private ObjectPool(int i, T t) {
        if (i <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        this.b = i;
        this.c = new Object[i];
        this.d = 0;
        this.e = t;
        this.f = 1.0f;
        a();
    }

    private void a() {
        b(this.f);
    }

    private void b(float f) {
        int i = this.b;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.c[i3] = this.e.instantiate();
        }
        this.d = i - 1;
    }

    private void c() {
        int i = this.b;
        int i2 = i * 2;
        this.b = i2;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = this.c[i3];
        }
        this.c = objArr;
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (wrap java.lang.Class:0x0000: CONST_CLASS  A[WRAPPED] com.github.mikephil.charting.utils.ObjectPool.class) */
    public static synchronized ObjectPool create(int i, Poolable poolable) {
        ObjectPool objectPool;
        synchronized (ObjectPool.class) {
            objectPool = new ObjectPool(i, poolable);
            int i2 = g;
            objectPool.a = i2;
            g = i2 + 1;
        }
        return objectPool;
    }

    public synchronized T get() {
        T t;
        if (this.d == -1 && this.f > 0.0f) {
            a();
        }
        Object[] objArr = this.c;
        int i = this.d;
        t = (T) objArr[i];
        t.a = Poolable.NO_OWNER;
        this.d = i - 1;
        return t;
    }

    public int getPoolCapacity() {
        return this.c.length;
    }

    public int getPoolCount() {
        return this.d + 1;
    }

    public int getPoolId() {
        return this.a;
    }

    public float getReplenishPercentage() {
        return this.f;
    }

    public synchronized void recycle(T t) {
        int i = t.a;
        if (i != Poolable.NO_OWNER) {
            if (i == this.a) {
                throw new IllegalArgumentException("The object passed is already stored in this pool!");
            }
            throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.a + ".  Object cannot belong to two different pool instances simultaneously!");
        }
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 >= this.c.length) {
            c();
        }
        t.a = this.a;
        this.c[this.d] = t;
    }

    public void setReplenishPercentage(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.f = f;
    }

    public synchronized void recycle(List<T> list) {
        while (list.size() + this.d + 1 > this.b) {
            c();
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            int i2 = t.a;
            if (i2 != Poolable.NO_OWNER) {
                if (i2 == this.a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            t.a = this.a;
            this.c[this.d + 1 + i] = t;
        }
        this.d += size;
    }
}
