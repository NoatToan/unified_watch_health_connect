package defpackage;

import com.huawei.dynamicanimation.util.Pound;

/* JADX INFO: loaded from: classes23.dex */
public class crc<T> implements Pound<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f31277b;
    private int e;

    public crc(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pound capacity must > 0");
        }
        this.f31277b = new Object[i];
    }

    @Override // com.huawei.dynamicanimation.util.Pound
    public T getInstance() {
        int i = this.e;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f31277b;
            if (objArr != null && i2 < objArr.length) {
                T t = (T) objArr[i2];
                objArr[i2] = null;
                this.e = i2;
                return t;
            }
        }
        return null;
    }

    @Override // com.huawei.dynamicanimation.util.Pound
    public boolean restoreInstance(T t) {
        if (d(t)) {
            throw new IllegalStateException("The instance is already in the pounds!");
        }
        int i = this.e;
        Object[] objArr = this.f31277b;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.e = i + 1;
        return true;
    }

    private boolean d(T t) {
        for (int i = 0; i < this.e; i++) {
            if (this.f31277b[i] == t) {
                return true;
            }
        }
        return false;
    }
}
