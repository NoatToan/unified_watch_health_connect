package com.google.android.datatransport.runtime.dagger.internal;

import androidx.core.view.j;
import com.google.android.datatransport.runtime.dagger.Lazy;
import n13.a;

/* JADX INFO: loaded from: classes13.dex */
public final class DoubleCheck<T> implements a<T>, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile a<T> provider;

    private DoubleCheck(a<T> aVar) {
        this.provider = aVar;
    }

    public static <P extends a<T>, T> Lazy<T> lazy(P p14) {
        return p14 instanceof Lazy ? (Lazy) p14 : new DoubleCheck((a) Preconditions.checkNotNull(p14));
    }

    public static <P extends a<T>, T> a<T> provider(P p14) {
        Preconditions.checkNotNull(p14);
        return p14 instanceof DoubleCheck ? p14 : new DoubleCheck(p14);
    }

    private static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == UNINITIALIZED || obj == obj2) {
            return obj2;
        }
        j.w(obj, " & ", obj2, ". This is likely due to a circular dependency.", "Scoped provider was invoked recursively returning different results: ");
        return null;
    }

    @Override // n13.a
    public T get() {
        T t7;
        T t14 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t14 != obj) {
            return t14;
        }
        synchronized (this) {
            try {
                t7 = (T) this.instance;
                if (t7 == obj) {
                    t7 = this.provider.get();
                    this.instance = reentrantCheck(this.instance, t7);
                    this.provider = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return t7;
    }
}
