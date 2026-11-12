package defpackage;

import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class aib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aic<Object[]> f447b;
    private aic<Object[]> d;
    private Object[] e;

    public Object[] d() {
        b();
        Object[] objArr = this.e;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.e = objArr2;
        return objArr2;
    }

    public Object[] d(Object[] objArr, int i) {
        b();
        Object[] objArr2 = this.e;
        if (objArr2 == null || objArr2.length < i) {
            this.e = new Object[Math.max(12, i)];
        }
        System.arraycopy(objArr, 0, this.e, 0, i);
        return this.e;
    }

    public Object[] d(Object[] objArr) {
        aic<Object[]> aicVar = new aic<>(objArr, null);
        if (this.d == null) {
            this.f447b = aicVar;
            this.d = aicVar;
        } else {
            this.f447b.a(aicVar);
            this.f447b = aicVar;
        }
        int length = objArr.length;
        this.f446a += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public Object[] c(Object[] objArr, int i) {
        int i2 = this.f446a + i;
        Object[] objArr2 = new Object[i2];
        d(objArr2, i2, objArr, i);
        b();
        return objArr2;
    }

    public <T> T[] a(Object[] objArr, int i, Class<T> cls) {
        int i2 = this.f446a + i;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i2));
        d(tArr, i2, objArr, i);
        b();
        return tArr;
    }

    public void d(Object[] objArr, int i, List<Object> list) {
        int i2;
        aic<Object[]> aicVarE = this.d;
        while (true) {
            i2 = 0;
            if (aicVarE == null) {
                break;
            }
            Object[] objArrC = aicVarE.c();
            int length = objArrC.length;
            while (i2 < length) {
                list.add(objArrC[i2]);
                i2++;
            }
            aicVarE = aicVarE.e();
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
        b();
    }

    public int a() {
        Object[] objArr = this.e;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public int c() {
        return this.f446a;
    }

    protected void b() {
        aic<Object[]> aicVar = this.f447b;
        if (aicVar != null) {
            this.e = aicVar.c();
        }
        this.f447b = null;
        this.d = null;
        this.f446a = 0;
    }

    protected final void d(Object obj, int i, Object[] objArr, int i2) {
        int i3 = 0;
        for (aic<Object[]> aicVarE = this.d; aicVarE != null; aicVarE = aicVarE.e()) {
            Object[] objArrC = aicVarE.c();
            int length = objArrC.length;
            System.arraycopy(objArrC, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 == i) {
            return;
        }
        throw new IllegalStateException("Should have gotten " + i + " entries, got " + i4);
    }
}
