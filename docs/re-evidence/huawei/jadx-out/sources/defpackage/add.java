package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class add {
    public static String[] a(Class<?> cls) {
        return c.d().c(cls);
    }

    public static ach c(DeserializationContext deserializationContext, BeanDescription beanDescription, List<String> list) {
        return new a(deserializationContext, beanDescription).b(list);
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f290a;
        private static final RuntimeException e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f292c;
        private final Method d;

        static {
            c cVar = null;
            try {
                e = null;
                cVar = new c();
            } catch (RuntimeException e2) {
                e = e2;
            }
            f290a = cVar;
            e = e;
        }

        private c() throws RuntimeException {
            try {
                this.f291b = Class.class.getMethod("getRecordComponents", new Class[0]);
                Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
                this.f292c = cls.getMethod("getName", new Class[0]);
                this.d = cls.getMethod("getType", new Class[0]);
            } catch (Exception e2) {
                throw new RuntimeException(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", e2.getClass().getName(), e2.getMessage()), e2);
            }
        }

        public static c d() {
            RuntimeException runtimeException = e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            return f290a;
        }

        public String[] c(Class<?> cls) throws IllegalArgumentException {
            Object[] objArrB = b(cls);
            String[] strArr = new String[objArrB.length];
            for (int i = 0; i < objArrB.length; i++) {
                try {
                    strArr[i] = (String) this.f292c.invoke(objArrB[i], new Object[0]);
                } catch (Exception e2) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(objArrB.length), ahw.u(cls)), e2);
                }
            }
            return strArr;
        }

        public e[] a(Class<?> cls) throws IllegalArgumentException {
            Object[] objArrB = b(cls);
            e[] eVarArr = new e[objArrB.length];
            for (int i = 0; i < objArrB.length; i++) {
                try {
                    try {
                        eVarArr[i] = new e((Class) this.d.invoke(objArrB[i], new Object[0]), (String) this.f292c.invoke(objArrB[i], new Object[0]));
                    } catch (Exception e2) {
                        throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(objArrB.length), ahw.u(cls)), e2);
                    }
                } catch (Exception e3) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(objArrB.length), ahw.u(cls)), e3);
                }
            }
            return eVarArr;
        }

        protected Object[] b(Class<?> cls) throws IllegalArgumentException {
            try {
                return (Object[]) this.f291b.invoke(cls, new Object[0]);
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to access RecordComponents of type " + ahw.u(cls));
            }
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f293a;
        public final String e;

        public e(Class<?> cls, String str) {
            this.f293a = cls;
            this.e = str;
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final AnnotationIntrospector f287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final List<ach> f288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final BeanDescription f289c;
        protected final yi d;
        protected final ach e;
        protected final e[] i;

        a(DeserializationContext deserializationContext, BeanDescription beanDescription) {
            ach achVarFindDefaultConstructor;
            this.f289c = beanDescription;
            this.f287a = deserializationContext.getAnnotationIntrospector();
            this.d = deserializationContext.getConfig();
            e[] eVarArrA = c.d().a(beanDescription.getBeanClass());
            this.i = eVarArrA;
            int length = eVarArrA.length;
            if (length == 0) {
                achVarFindDefaultConstructor = beanDescription.findDefaultConstructor();
                this.f288b = Collections.singletonList(achVarFindDefaultConstructor);
            } else {
                List<ach> constructors = beanDescription.getConstructors();
                this.f288b = constructors;
                Iterator<ach> it = constructors.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        achVarFindDefaultConstructor = null;
                        break;
                    }
                    ach next = it.next();
                    if (next.getParameterCount() == length) {
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                achVarFindDefaultConstructor = next;
                                break loop0;
                            } else if (!next.getRawParameterType(i).equals(this.i[i].f293a)) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            if (achVarFindDefaultConstructor == null) {
                throw new IllegalArgumentException("Failed to find the canonical Record constructor of type " + ahw.a(this.f289c.getType()));
            }
            this.e = achVarFindDefaultConstructor;
        }

        public ach b(List<String> list) {
            for (ach achVar : this.f288b) {
                JsonCreator.Mode modeFindCreatorAnnotation = this.f287a.findCreatorAnnotation(this.d, achVar);
                if (modeFindCreatorAnnotation != null && JsonCreator.Mode.DISABLED != modeFindCreatorAnnotation && (JsonCreator.Mode.DELEGATING == modeFindCreatorAnnotation || achVar != this.e)) {
                    return null;
                }
            }
            for (e eVar : this.i) {
                list.add(eVar.e);
            }
            return this.e;
        }
    }
}
