package p005kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: loaded from: classes3.dex */
public final class WrappedValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f105963a = new a();

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th3) {
            super("Rethrow stored exception", th3);
        }
    }

    public static class a {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    public static /* synthetic */ void a(int i14) {
        String str = (i14 == 1 || i14 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 1 || i14 == 2) ? 2 : 3];
        if (i14 == 1 || i14 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i14 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i14 == 1 || i14 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i14 != 1 && i14 != 2) {
            if (i14 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i14 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i14 != 1 && i14 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static void b(Object obj) throws Throwable {
        if (obj instanceof b) {
            Throwable th3 = ((b) obj).f105964a;
            if (th3 != null) {
                throw th3;
            }
            b.a(1);
            throw null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f105964a;

        private b(Throwable th3) {
            if (th3 != null) {
                this.f105964a = th3;
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i14) {
            String str = i14 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i14 != 1 ? 3 : 2];
            if (i14 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i14 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i14 != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i14 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        public final String toString() {
            return this.f105964a.toString();
        }

        public /* synthetic */ b(Throwable th3, a aVar) {
            this(th3);
        }
    }
}
