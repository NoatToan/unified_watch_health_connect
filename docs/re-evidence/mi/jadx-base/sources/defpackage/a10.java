package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a10<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f505a = b.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f506b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f507a;

        static {
            int[] iArr = new int[b.values().length];
            f507a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f507a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T a();

    public final T b() {
        this.f505a = b.DONE;
        return null;
    }

    public final boolean c() {
        this.f505a = b.FAILED;
        this.f506b = a();
        if (this.f505a == b.DONE) {
            return false;
        }
        this.f505a = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        c6i.t(this.f505a != b.FAILED);
        int i = a.f507a[this.f505a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f505a = b.NOT_READY;
        T t = (T) f2h.a(this.f506b);
        this.f506b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
