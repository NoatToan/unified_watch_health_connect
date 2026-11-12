package k7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk7/f;", "", "T", "Lk7/e;", "", "maxPoolSize", "<init>", "(I)V", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f103264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f103265b;

    public f(int i14) {
        if (i14 > 0) {
            this.f103264a = new Object[i14];
        } else {
            vb.h.s("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // k7.e
    public boolean a(T t7) {
        t7.getClass();
        int i14 = this.f103265b;
        int i15 = 0;
        while (true) {
            Object[] objArr = this.f103264a;
            if (i15 >= i14) {
                int i16 = this.f103265b;
                if (i16 >= objArr.length) {
                    return false;
                }
                objArr[i16] = t7;
                this.f103265b = i16 + 1;
                return true;
            }
            if (objArr[i15] == t7) {
                vb.h.z("Already in the pool!");
                return false;
            }
            i15++;
        }
    }

    @Override // k7.e
    public T acquire() {
        int i14 = this.f103265b;
        if (i14 <= 0) {
            return null;
        }
        int i15 = i14 - 1;
        Object[] objArr = this.f103264a;
        T t7 = (T) objArr[i15];
        t7.getClass();
        objArr[i15] = null;
        this.f103265b--;
        return t7;
    }
}
