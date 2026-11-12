package rx.exceptions;

import com.google.maps.android.BuildConfig;
import java.io.Serializable;
import java.util.HashSet;
import v83.v;

/* JADX INFO: loaded from: classes11.dex */
public final class OnErrorThrowable extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean hasValue;
    private final Object value;

    public static class OnNextValue extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        private final Object value;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final HashSet f154914a;

            static {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                f154914a = hashSet;
            }
        }

        public OnNextValue(Object obj) {
            super("OnError while emitting onNext value: " + renderValue(obj));
            if (!(obj instanceof Serializable)) {
                try {
                    obj = String.valueOf(obj);
                } catch (Throwable th3) {
                    obj = th3.getMessage();
                }
            }
            this.value = obj;
        }

        public static String renderValue(Object obj) {
            if (obj == null) {
                return BuildConfig.TRAVIS;
            }
            if (a.f154914a.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            v.f176271f.b().getClass();
            return obj.getClass().getName().concat(".class");
        }

        public Object getValue() {
            return this.value;
        }
    }

    private OnErrorThrowable(Throwable th3, Object obj) {
        super(th3);
        this.hasValue = true;
        if (!(obj instanceof Serializable)) {
            try {
                obj = String.valueOf(obj);
            } catch (Throwable th4) {
                obj = th4.getMessage();
            }
        }
        this.value = obj;
    }

    public static Throwable addValueAsLastCause(Throwable th3, Object obj) {
        if (th3 == null) {
            th3 = new NullPointerException();
        }
        int i14 = 0;
        Throwable runtimeException = th3;
        int i15 = 0;
        while (runtimeException.getCause() != null) {
            int i16 = i15 + 1;
            if (i15 >= 25) {
                runtimeException = new RuntimeException("Stack too deep to get final cause");
                break;
            }
            runtimeException = runtimeException.getCause();
            i15 = i16;
        }
        if (!(runtimeException instanceof OnNextValue) || ((OnNextValue) runtimeException).getValue() != obj) {
            OnNextValue onNextValue = new OnNextValue(obj);
            HashSet hashSet = new HashSet();
            Throwable cause = th3;
            while (cause.getCause() != null) {
                int i17 = i14 + 1;
                if (i14 < 25) {
                    cause = cause.getCause();
                    if (hashSet.contains(cause.getCause())) {
                        break;
                    }
                    hashSet.add(cause.getCause());
                    i14 = i17;
                }
            }
            try {
                cause.initCause(onNextValue);
            } catch (Throwable unused) {
            }
            return th3;
        }
        return th3;
    }

    public static OnErrorThrowable from(Throwable th3) {
        if (th3 == null) {
            th3 = new NullPointerException();
        }
        int i14 = 0;
        Throwable runtimeException = th3;
        while (runtimeException.getCause() != null) {
            int i15 = i14 + 1;
            if (i14 >= 25) {
                runtimeException = new RuntimeException("Stack too deep to get final cause");
                break;
            }
            runtimeException = runtimeException.getCause();
            i14 = i15;
        }
        return runtimeException instanceof OnNextValue ? new OnErrorThrowable(th3, ((OnNextValue) runtimeException).getValue()) : new OnErrorThrowable(th3);
    }

    public Object getValue() {
        return this.value;
    }

    public boolean isValueNull() {
        return this.hasValue;
    }

    private OnErrorThrowable(Throwable th3) {
        super(th3);
        this.hasValue = false;
        this.value = null;
    }
}
