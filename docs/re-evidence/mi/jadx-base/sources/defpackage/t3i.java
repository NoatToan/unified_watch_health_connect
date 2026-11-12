package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class t3i<T> implements s3i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f34264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34265b;

    public t3i(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f34264a = new Object[i];
    }

    @Override // defpackage.s3i
    public void a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f34265b;
            Object[] objArr = this.f34264a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f34265b = i3 + 1;
            }
        }
    }

    @Override // defpackage.s3i
    public T acquire() {
        int i = this.f34265b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f34264a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f34265b = i - 1;
        return t;
    }

    @Override // defpackage.s3i
    public boolean release(T t) {
        int i = this.f34265b;
        Object[] objArr = this.f34264a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f34265b = i + 1;
        return true;
    }
}
