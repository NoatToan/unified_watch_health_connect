package n83;

import rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f124984a = 0;

    public static final class a<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements n83.a, n83.b<T0> {
        @Override // n83.b
        public final void call(T0 t7) {
        }

        @Override // n83.a
        public final void d() {
        }
    }

    public enum b implements n83.b<Throwable> {
        INSTANCE;

        @Override // n83.b
        public final void call(Throwable th3) {
            throw new OnErrorNotImplementedException(th3);
        }
    }

    static {
        new a();
    }

    private c() {
        throw new IllegalStateException("No instances!");
    }
}
