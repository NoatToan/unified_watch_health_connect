package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.ObjectPool.Poolable;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public class ObjectPool<T extends Poolable> {
    private static int ids;
    private int desiredCapacity;
    private T modelObject;
    private Object[] objects;
    private int objectsPointer;
    private int poolId;
    private float replenishPercentage;

    public static abstract class Poolable {
        public static int NO_OWNER = -1;
        int currentOwnerId = NO_OWNER;

        public abstract Poolable instantiate();
    }

    private ObjectPool(int i14, T t7) {
        if (i14 <= 0) {
            h.s("Object Pool must be instantiated with a capacity greater than 0!");
            throw null;
        }
        this.desiredCapacity = i14;
        this.objects = new Object[i14];
        this.objectsPointer = 0;
        this.modelObject = t7;
        this.replenishPercentage = 1.0f;
        refillPool();
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (wrap java.lang.Class:0x0000: CONST_CLASS  A[WRAPPED] com.github.mikephil.charting.utils.ObjectPool.class) */
    public static synchronized ObjectPool create(int i14, Poolable poolable) {
        ObjectPool objectPool;
        synchronized (ObjectPool.class) {
            objectPool = new ObjectPool(i14, poolable);
            int i15 = ids;
            objectPool.poolId = i15;
            ids = i15 + 1;
        }
        return objectPool;
    }

    private void refillPool(float f14) {
        int i14 = this.desiredCapacity;
        int i15 = (int) (i14 * f14);
        if (i15 < 1) {
            i14 = 1;
        } else if (i15 <= i14) {
            i14 = i15;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            this.objects[i16] = this.modelObject.instantiate();
        }
        this.objectsPointer = i14 - 1;
    }

    private void resizePool() {
        int i14 = this.desiredCapacity;
        int i15 = i14 * 2;
        this.desiredCapacity = i15;
        Object[] objArr = new Object[i15];
        for (int i16 = 0; i16 < i14; i16++) {
            objArr[i16] = this.objects[i16];
        }
        this.objects = objArr;
    }

    public synchronized T get() {
        T t7;
        try {
            if (this.objectsPointer == -1 && this.replenishPercentage > 0.0f) {
                refillPool();
            }
            Object[] objArr = this.objects;
            int i14 = this.objectsPointer;
            t7 = (T) objArr[i14];
            t7.currentOwnerId = Poolable.NO_OWNER;
            this.objectsPointer = i14 - 1;
        } catch (Throwable th3) {
            throw th3;
        }
        return t7;
    }

    public int getPoolCapacity() {
        return this.objects.length;
    }

    public int getPoolCount() {
        return this.objectsPointer + 1;
    }

    public int getPoolId() {
        return this.poolId;
    }

    public float getReplenishPercentage() {
        return this.replenishPercentage;
    }

    public synchronized void recycle(List<T> list) {
        while (list.size() + this.objectsPointer + 1 > this.desiredCapacity) {
            try {
                resizePool();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            T t7 = list.get(i14);
            int i15 = t7.currentOwnerId;
            if (i15 != Poolable.NO_OWNER) {
                if (i15 == this.poolId) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t7.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            t7.currentOwnerId = this.poolId;
            this.objects[this.objectsPointer + 1 + i14] = t7;
        }
        this.objectsPointer += size;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public void setReplenishPercentage(float f14) {
        float f15 = 1.0f;
        if (f14 > 1.0f) {
            f14 = f15;
        } else {
            f15 = 0.0f;
            if (f14 < 0.0f) {
                f14 = f15;
            }
        }
        this.replenishPercentage = f14;
    }

    private void refillPool() {
        refillPool(this.replenishPercentage);
    }

    public synchronized void recycle(T t7) {
        try {
            int i14 = t7.currentOwnerId;
            if (i14 != Poolable.NO_OWNER) {
                if (i14 == this.poolId) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t7.currentOwnerId + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i15 = this.objectsPointer + 1;
            this.objectsPointer = i15;
            if (i15 >= this.objects.length) {
                resizePool();
            }
            t7.currentOwnerId = this.poolId;
            this.objects[this.objectsPointer] = t7;
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
