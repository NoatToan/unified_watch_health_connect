package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b10<T> extends uaq<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f3666a = b.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f3667b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3668a;

        static {
            int[] iArr = new int[b.values().length];
            f3668a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3668a[b.READY.ordinal()] = 2;
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
        this.f3666a = b.DONE;
        return null;
    }

    public final boolean c() {
        this.f3666a = b.FAILED;
        this.f3667b = a();
        if (this.f3666a == b.DONE) {
            return false;
        }
        this.f3666a = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        c6i.t(this.f3666a != b.FAILED);
        int i = a.f3668a[this.f3666a.ordinal()];
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
        this.f3666a = b.NOT_READY;
        T t = (T) d2h.a(this.f3667b);
        this.f3667b = null;
        return t;
    }
}
