package defpackage;

import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u3h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sge<Object[]> f35336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sge<Object[]> f35337b;
    public int c;
    public Object[] d;

    public final void a(Object obj, int i, Object[] objArr, int i2) {
        int i3 = 0;
        for (sge<Object[]> sgeVarC = this.f35336a; sgeVarC != null; sgeVarC = sgeVarC.c()) {
            Object[] objArrD = sgeVarC.d();
            int length = objArrD.length;
            System.arraycopy(objArrD, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 == i) {
            return;
        }
        throw new IllegalStateException("Should have gotten " + i + " entries, got " + i4);
    }

    public void b() {
        sge<Object[]> sgeVar = this.f35337b;
        if (sgeVar != null) {
            this.d = sgeVar.d();
        }
        this.f35337b = null;
        this.f35336a = null;
        this.c = 0;
    }

    public Object[] c(Object[] objArr) {
        sge<Object[]> sgeVar = new sge<>(objArr, null);
        if (this.f35336a == null) {
            this.f35337b = sgeVar;
            this.f35336a = sgeVar;
        } else {
            this.f35337b.b(sgeVar);
            this.f35337b = sgeVar;
        }
        int length = objArr.length;
        this.c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public int d() {
        return this.c;
    }

    public void e(Object[] objArr, int i, List<Object> list) {
        int i2;
        sge<Object[]> sgeVarC = this.f35336a;
        while (true) {
            i2 = 0;
            if (sgeVarC == null) {
                break;
            }
            Object[] objArrD = sgeVarC.d();
            int length = objArrD.length;
            while (i2 < length) {
                list.add(objArrD[i2]);
                i2++;
            }
            sgeVarC = sgeVarC.c();
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
        b();
    }

    public Object[] f(Object[] objArr, int i) {
        int i2 = this.c + i;
        Object[] objArr2 = new Object[i2];
        a(objArr2, i2, objArr, i);
        b();
        return objArr2;
    }

    public <T> T[] g(Object[] objArr, int i, Class<T> cls) {
        int i2 = this.c + i;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i2));
        a(tArr, i2, objArr, i);
        b();
        return tArr;
    }

    public int h() {
        Object[] objArr = this.d;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public Object[] i() {
        b();
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.d = objArr2;
        return objArr2;
    }

    public Object[] j(Object[] objArr, int i) {
        b();
        Object[] objArr2 = this.d;
        if (objArr2 == null || objArr2.length < i) {
            this.d = new Object[Math.max(12, i)];
        }
        System.arraycopy(objArr, 0, this.d, 0, i);
        return this.d;
    }
}
