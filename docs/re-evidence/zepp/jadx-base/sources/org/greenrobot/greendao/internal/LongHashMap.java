package org.greenrobot.greendao.internal;

import java.util.Arrays;
import org.greenrobot.greendao.DaoLog;

/* JADX INFO: loaded from: classes23.dex */
public final class LongHashMap<T> {
    private a<T>[] a;
    private int b;
    private int c;
    private int d;

    public static final class a<T> {
        public final long a;
        public T b;
        public a<T> c;

        public a(long j, T t, a<T> aVar) {
            this.a = j;
            this.b = t;
            this.c = aVar;
        }
    }

    public LongHashMap() {
        this(16);
    }

    public void clear() {
        this.d = 0;
        Arrays.fill(this.a, (Object) null);
    }

    public boolean containsKey(long j) {
        for (a<T> aVar = this.a[((((int) j) ^ ((int) (j >>> 32))) & Integer.MAX_VALUE) % this.b]; aVar != null; aVar = aVar.c) {
            if (aVar.a == j) {
                return true;
            }
        }
        return false;
    }

    public T get(long j) {
        for (a<T> aVar = this.a[((((int) j) ^ ((int) (j >>> 32))) & Integer.MAX_VALUE) % this.b]; aVar != null; aVar = aVar.c) {
            if (aVar.a == j) {
                return aVar.b;
            }
        }
        return null;
    }

    public void logStats() {
        int i = 0;
        for (a<T> aVar : this.a) {
            while (aVar != null) {
                aVar = aVar.c;
                if (aVar == null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        DaoLog.d("load: " + (this.d / this.b) + ", size: " + this.d + ", capa: " + this.b + ", collisions: " + i + ", collision ratio: " + (i / this.d));
    }

    public T put(long j, T t) {
        int i = ((((int) j) ^ ((int) (j >>> 32))) & Integer.MAX_VALUE) % this.b;
        a<T> aVar = this.a[i];
        for (a<T> aVar2 = aVar; aVar2 != null; aVar2 = aVar2.c) {
            if (aVar2.a == j) {
                T t2 = aVar2.b;
                aVar2.b = t;
                return t2;
            }
        }
        this.a[i] = new a<>(j, t, aVar);
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 <= this.c) {
            return null;
        }
        setCapacity(this.b * 2);
        return null;
    }

    public T remove(long j) {
        int i = ((((int) j) ^ ((int) (j >>> 32))) & Integer.MAX_VALUE) % this.b;
        a<T> aVar = this.a[i];
        a<T> aVar2 = null;
        while (aVar != null) {
            a<T> aVar3 = aVar.c;
            if (aVar.a == j) {
                if (aVar2 == null) {
                    this.a[i] = aVar3;
                } else {
                    aVar2.c = aVar3;
                }
                this.d--;
                return aVar.b;
            }
            aVar2 = aVar;
            aVar = aVar3;
        }
        return null;
    }

    public void reserveRoom(int i) {
        setCapacity((i * 5) / 3);
    }

    public void setCapacity(int i) {
        a<T>[] aVarArr = new a[i];
        int length = this.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            a<T> aVar = this.a[i2];
            while (aVar != null) {
                long j = aVar.a;
                int i3 = ((((int) (j >>> 32)) ^ ((int) j)) & Integer.MAX_VALUE) % i;
                a<T> aVar2 = aVar.c;
                aVar.c = aVarArr[i3];
                aVarArr[i3] = aVar;
                aVar = aVar2;
            }
        }
        this.a = aVarArr;
        this.b = i;
        this.c = (i * 4) / 3;
    }

    public int size() {
        return this.d;
    }

    public LongHashMap(int i) {
        this.b = i;
        this.c = (i * 4) / 3;
        this.a = new a[i];
    }
}
