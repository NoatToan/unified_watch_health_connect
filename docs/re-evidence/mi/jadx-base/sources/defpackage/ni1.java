package defpackage;

import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes2.dex */
public class ni1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f27953b;
    public Object[] c;
    public int d;

    public interface a<T> extends i6i<T> {
        @Override // defpackage.i6i
        boolean test(T t);
    }

    public ni1(int i) {
        this.f27952a = i;
        Object[] objArr = new Object[i + 1];
        this.f27953b = objArr;
        this.c = objArr;
    }

    public <U> boolean a(z5h<? super U> z5hVar) {
        Object[] objArr = this.f27953b;
        int i = this.f27952a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, z5hVar)) {
                    return true;
                }
            }
            objArr = objArr[i];
        }
    }

    public void b(T t) {
        int i = this.f27952a;
        int i2 = this.d;
        if (i2 == i) {
            Object[] objArr = new Object[i + 1];
            this.c[i] = objArr;
            this.c = objArr;
            i2 = 0;
        }
        this.c[i2] = t;
        this.d = i2 + 1;
    }

    public void c(a<? super T> aVar) {
        int i = this.f27952a;
        for (Object[] objArr = this.f27953b; objArr != null; objArr = (Object[]) objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    break;
                } else {
                    if (aVar.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    public void d(T t) {
        this.f27953b[0] = t;
    }
}
