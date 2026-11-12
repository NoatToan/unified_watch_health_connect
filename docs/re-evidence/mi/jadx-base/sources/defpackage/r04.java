package defpackage;

import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes4.dex */
public class r04<T> implements Pools.Pool<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f32044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32045b = 0;

    public r04(int i) {
        this.f32044a = new Object[i];
    }

    public synchronized void a() {
        for (int i = 0; i < this.f32045b; i++) {
            try {
                this.f32044a[i] = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f32045b = 0;
    }

    @Override // androidx.core.util.Pools.Pool
    public synchronized T acquire() {
        int i = this.f32045b;
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        this.f32045b = i2;
        Object[] objArr = this.f32044a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        return t;
    }

    @Override // androidx.core.util.Pools.Pool
    public synchronized boolean release(T t) {
        int i = this.f32045b;
        Object[] objArr = this.f32044a;
        if (i == objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f32045b = i + 1;
        return true;
    }
}
