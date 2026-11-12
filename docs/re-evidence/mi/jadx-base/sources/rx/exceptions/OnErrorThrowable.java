package rx.exceptions;

import defpackage.pf8;
import defpackage.s5l;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class OnErrorThrowable extends RuntimeException {
    private static final long serialVersionUID = -569558213262703934L;
    private final boolean hasValue;
    private final Object value;

    public static class OnNextValue extends RuntimeException {
        private static final long serialVersionUID = -3454462756050397899L;
        private final Object value;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Set<Class<?>> f32998a = a();

            public static Set<Class<?>> a() {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                return hashSet;
            }
        }

        public OnNextValue(Object obj) {
            super("OnError while emitting onNext value: " + renderValue(obj));
            if (!(obj instanceof Serializable)) {
                try {
                    obj = String.valueOf(obj);
                } catch (Throwable th) {
                    obj = th.getMessage();
                }
            }
            this.value = obj;
        }

        public static String renderValue(Object obj) {
            if (obj == null) {
                return AbstractJsonLexerKt.NULL;
            }
            if (a.f32998a.contains(obj.getClass())) {
                return obj.toString();
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            String strB = s5l.c().b().b(obj);
            if (strB != null) {
                return strB;
            }
            return obj.getClass().getName() + ".class";
        }

        public Object getValue() {
            return this.value;
        }
    }

    private OnErrorThrowable(Throwable th) {
        super(th);
        this.hasValue = false;
        this.value = null;
    }

    public static Throwable addValueAsLastCause(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable thB = pf8.b(th);
        if ((thB instanceof OnNextValue) && ((OnNextValue) thB).getValue() == obj) {
            return th;
        }
        pf8.a(th, new OnNextValue(obj));
        return th;
    }

    public static OnErrorThrowable from(Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        Throwable thB = pf8.b(th);
        return thB instanceof OnNextValue ? new OnErrorThrowable(th, ((OnNextValue) thB).getValue()) : new OnErrorThrowable(th);
    }

    public Object getValue() {
        return this.value;
    }

    public boolean isValueNull() {
        return this.hasValue;
    }

    private OnErrorThrowable(Throwable th, Object obj) {
        super(th);
        this.hasValue = true;
        if (!(obj instanceof Serializable)) {
            try {
                obj = String.valueOf(obj);
            } catch (Throwable th2) {
                obj = th2.getMessage();
            }
        }
        this.value = obj;
    }
}
