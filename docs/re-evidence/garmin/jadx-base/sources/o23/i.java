package o23;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w0;
import p13.s;
import p13.u;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B5\b\u0004\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lo23/i;", "Ljava/lang/reflect/Member;", "M", "Lo23/h;", "member", "Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "instanceClass", "", "valueParameterTypes", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", JWKParameterNames.RSA_EXPONENT, "c", "b", "a", "h", "f", "g", "d", "Lo23/i$a;", "Lo23/i$b;", "Lo23/i$c;", "Lo23/i$e;", "Lo23/i$f;", "Lo23/i$g;", "Lo23/i$h;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i<M extends Member> implements o23.h<M> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f128708e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f128709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f128710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f128711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Type> f128712d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo23/i$a;", "Lo23/i;", "Ljava/lang/reflect/Constructor;", "Lo23/g;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends i<Constructor<?>> implements o23.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f128713f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor<?> constructor, Object obj) {
            constructor.getClass();
            Class<?> declaringClass = constructor.getDeclaringClass();
            declaringClass.getClass();
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            genericParameterTypes.getClass();
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : s.l(1, genericParameterTypes.length - 1, genericParameterTypes)), null);
            this.f128713f = obj;
        }

        @Override // o23.h
        public final Object call(Object[] objArr) {
            objArr.getClass();
            d(objArr);
            Constructor constructor = (Constructor) this.f128709a;
            w0 w0Var = new w0(3);
            w0Var.a(this.f128713f);
            w0Var.b(objArr);
            w0Var.a(null);
            ArrayList<Object> arrayList = w0Var.f105816a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo23/i$b;", "Lo23/i;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor<?> constructor) {
            constructor.getClass();
            Class<?> declaringClass = constructor.getDeclaringClass();
            declaringClass.getClass();
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            genericParameterTypes.getClass();
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : s.l(0, genericParameterTypes.length - 1, genericParameterTypes)), null);
        }

        @Override // o23.h
        public final Object call(Object[] objArr) {
            objArr.getClass();
            d(objArr);
            Constructor constructor = (Constructor) this.f128709a;
            w0 w0Var = new w0(2);
            w0Var.b(objArr);
            w0Var.a(null);
            ArrayList<Object> arrayList = w0Var.f105816a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo23/i$c;", "Lo23/g;", "Lo23/i;", "Ljava/lang/reflect/Constructor;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends i<Constructor<?>> implements o23.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f128714f;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor<?> constructor, Object obj) {
            constructor.getClass();
            Class<?> declaringClass = constructor.getDeclaringClass();
            declaringClass.getClass();
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            genericParameterTypes.getClass();
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f128714f = obj;
        }

        @Override // o23.h
        public final Object call(Object[] objArr) {
            objArr.getClass();
            d(objArr);
            Constructor constructor = (Constructor) this.f128709a;
            w0 w0Var = new w0(2);
            w0Var.a(this.f128714f);
            w0Var.b(objArr);
            ArrayList<Object> arrayList = w0Var.f105816a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo23/i$e;", "Lo23/i;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends i<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Constructor<?> constructor) {
            constructor.getClass();
            Class<?> declaringClass = constructor.getDeclaringClass();
            declaringClass.getClass();
            Class<?> declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            genericParameterTypes.getClass();
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // o23.h
        public final Object call(Object[] objArr) {
            objArr.getClass();
            d(objArr);
            return ((Constructor) this.f128709a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    static {
        new d(null);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0029  */
    private i(M m14, Type type, Class<?> cls, Type[] typeArr) {
        List<Type> listI0;
        this.f128709a = m14;
        this.f128710b = type;
        this.f128711c = cls;
        if (cls != null) {
            w0 w0Var = new w0(2);
            w0Var.a(cls);
            w0Var.b(typeArr);
            ArrayList<Object> arrayList = w0Var.f105816a;
            listI0 = x.k(arrayList.toArray(new Type[arrayList.size()]));
            listI0 = listI0 == null ? u.i0(typeArr) : listI0;
        }
        this.f128712d = listI0;
    }

    @Override // o23.h
    public final /* bridge */ boolean a() {
        return false;
    }

    @Override // o23.h
    public final List<Type> b() {
        return this.f128712d;
    }

    @Override // o23.h
    public final M c() {
        return this.f128709a;
    }

    public void d(Object[] objArr) {
        objArr.getClass();
        List<Type> list = this.f128712d;
        if (list.size() == objArr.length) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("Callable expects ");
        sb3.append(list.size());
        sb3.append(" arguments, but ");
        vb.h.s(am.j.q(sb3, objArr.length, " were provided."));
    }

    public final void e(Object obj) {
        if (obj == null || !this.f128709a.getDeclaringClass().isInstance(obj)) {
            vb.h.s("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // o23.h
    /* JADX INFO: renamed from: getReturnType, reason: from getter */
    public final Type getF128710b() {
        return this.f128710b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lo23/i$d;", "", "<init>", "()V", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropLast", "dropFirstAndLast", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\b\t\n\u000b\fB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lo23/i$f;", "Lo23/i;", "Ljava/lang/reflect/Field;", "field", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;Z)V", JWKParameterNames.RSA_EXPONENT, "c", "d", "a", "b", "Lo23/i$f$a;", "Lo23/i$f$b;", "Lo23/i$f$c;", "Lo23/i$f$d;", "Lo23/i$f$e;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class f extends i<Field> {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo23/i$f$a;", "Lo23/g;", "Lo23/i$f;", "Ljava/lang/reflect/Field;", "field", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends f implements o23.g {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final Object f128715f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                field.getClass();
                this.f128715f = obj;
            }

            @Override // o23.i.f, o23.h
            public final Object call(Object[] objArr) {
                objArr.getClass();
                d(objArr);
                return ((Field) this.f128709a).get(this.f128715f);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo23/i$f$b;", "Lo23/g;", "Lo23/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends f implements o23.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                field.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo23/i$f$c;", "Lo23/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                field.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo23/i$f$d;", "Lo23/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                field.getClass();
            }

            @Override // o23.i
            public final void d(Object[] objArr) {
                objArr.getClass();
                super.d(objArr);
                e(u.H(objArr));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo23/i$f$e;", "Lo23/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                field.getClass();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private f(Field field, boolean z14) {
            Type genericType = field.getGenericType();
            genericType.getClass();
            super(field, genericType, z14 ? field.getDeclaringClass() : null, new Type[0], null);
        }

        @Override // o23.h
        public Object call(Object[] objArr) {
            objArr.getClass();
            d(objArr);
            return ((Field) this.f128709a).get(this.f128711c != null ? u.E(objArr) : null);
        }

        public /* synthetic */ f(Field field, boolean z14, p005kotlin.jvm.internal.j jVar) {
            this(field, z14);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u000b\f\r\u000e\u000f\u0010\u0011B+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lo23/i$h;", "Lo23/i;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "", "requiresInstance", "", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "g", JWKParameterNames.RSA_EXPONENT, "f", "c", "d", "a", "b", "Lo23/i$h$a;", "Lo23/i$h$b;", "Lo23/i$h$c;", "Lo23/i$h$d;", "Lo23/i$h$e;", "Lo23/i$h$f;", "Lo23/i$h$g;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class h extends i<Method> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f128718f;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo23/i$h$a;", "Lo23/g;", "Lo23/i$h;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends h implements o23.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Object f128719g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                method.getClass();
                this.f128719g = obj;
            }

            @Override // o23.h
            public final Object call(Object[] objArr) {
                objArr.getClass();
                d(objArr);
                return f(this.f128719g, objArr);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo23/i$h$b;", "Lo23/g;", "Lo23/i$h;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends h implements o23.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                method.getClass();
            }

            @Override // o23.h
            public final Object call(Object[] objArr) {
                objArr.getClass();
                d(objArr);
                return f(null, objArr);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo23/i$h$c;", "Lo23/g;", "Lo23/i$h;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "", "isCallByToValueClassMangledMethod", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;ZLjava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends h implements o23.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f128720g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final Object f128721h;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, boolean z14, Object obj) {
                method.getClass();
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : s.l(1, genericParameterTypes.length, genericParameterTypes)), null);
                this.f128720g = z14;
                this.f128721h = obj;
            }

            @Override // o23.h
            public final Object call(Object[] objArr) {
                objArr.getClass();
                d(objArr);
                w0 w0Var = new w0(2);
                w0Var.a(this.f128721h);
                w0Var.b(objArr);
                ArrayList<Object> arrayList = w0Var.f105816a;
                return f(null, arrayList.toArray(new Object[arrayList.size()]));
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo23/i$h$d;", "Lo23/g;", "Lo23/i$h;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "", "", "boundReceiverComponents", "<init>", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends h implements o23.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Object[] f128722g;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(Method method, Object[] objArr) {
                method.getClass();
                objArr.getClass();
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(method, false, (Type[]) u.A(objArr.length, genericParameterTypes).toArray(new Type[0]), null);
                this.f128722g = objArr;
            }

            @Override // o23.h
            public final Object call(Object[] objArr) {
                objArr.getClass();
                d(objArr);
                w0 w0Var = new w0(2);
                w0Var.b(this.f128722g);
                w0Var.b(objArr);
                ArrayList<Object> arrayList = w0Var.f105816a;
                return f(null, arrayList.toArray(new Object[arrayList.size()]));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo23/i$h$e;", "Lo23/i$h;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, false, null, 6, null);
                method.getClass();
            }

            @Override // o23.h
            public final Object call(Object[] objArr) {
                objArr.getClass();
                d(objArr);
                return f(objArr[0], objArr.length <= 1 ? new Object[0] : s.l(1, objArr.length, objArr));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo23/i$h$f;", "Lo23/i$h;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, true, null, 4, null);
                method.getClass();
            }

            @Override // o23.h
            public final Object call(Object[] objArr) {
                objArr.getClass();
                d(objArr);
                e(u.H(objArr));
                return f(null, objArr.length <= 1 ? new Object[0] : s.l(1, objArr.length, objArr));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo23/i$h$g;", "Lo23/i$h;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class g extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Method method) {
                super(method, false, null, 6, null);
                method.getClass();
            }

            @Override // o23.h
            public final Object call(Object[] objArr) {
                objArr.getClass();
                d(objArr);
                return f(null, objArr);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private h(Method method, boolean z14, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            genericReturnType.getClass();
            super(method, genericReturnType, z14 ? method.getDeclaringClass() : null, typeArr, null);
            this.f128718f = p005kotlin.jvm.internal.s.g(this.f128710b, Void.TYPE);
        }

        public final Object f(Object obj, Object[] objArr) {
            objArr.getClass();
            return this.f128718f ? Unit.INSTANCE : ((Method) this.f128709a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ h(Method method, boolean z14, Type[] typeArr, int i14, p005kotlin.jvm.internal.j jVar) {
            z14 = (i14 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z14;
            if ((i14 & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                typeArr.getClass();
            }
            this(method, z14, typeArr, null);
        }

        public /* synthetic */ h(Method method, boolean z14, Type[] typeArr, p005kotlin.jvm.internal.j jVar) {
            this(method, z14, typeArr);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\t\n\u000b\f\rB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lo23/i$g;", "Lo23/i;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", JWKParameterNames.RSA_EXPONENT, "c", "d", "a", "b", "Lo23/i$g$a;", "Lo23/i$g$b;", "Lo23/i$g$c;", "Lo23/i$g$d;", "Lo23/i$g$e;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class g extends i<Field> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f128716f;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo23/i$g$a;", "Lo23/g;", "Lo23/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends g implements o23.g {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Object f128717g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z14, Object obj) {
                super(field, z14, false, null);
                field.getClass();
                this.f128717g = obj;
            }

            @Override // o23.i.g, o23.h
            public final Object call(Object[] objArr) throws IllegalAccessException {
                objArr.getClass();
                d(objArr);
                ((Field) this.f128709a).set(this.f128717g, u.E(objArr));
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo23/i$g$b;", "Lo23/g;", "Lo23/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends g implements o23.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z14) {
                super(field, z14, false, null);
                field.getClass();
            }

            @Override // o23.i.g, o23.h
            public final Object call(Object[] objArr) throws IllegalAccessException {
                objArr.getClass();
                d(objArr);
                ((Field) this.f128709a).set(null, u.Q(objArr));
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo23/i$g$c;", "Lo23/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z14) {
                super(field, z14, true, null);
                field.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo23/i$g$d;", "Lo23/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z14) {
                super(field, z14, true, null);
                field.getClass();
            }

            @Override // o23.i.g, o23.i
            public final void d(Object[] objArr) {
                objArr.getClass();
                super.d(objArr);
                e(u.H(objArr));
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo23/i$g$e;", "Lo23/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z14) {
                super(field, z14, false, null);
                field.getClass();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private g(Field field, boolean z14, boolean z15) {
            Class cls = Void.TYPE;
            cls.getClass();
            Class<?> declaringClass = z15 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            genericType.getClass();
            super(field, cls, declaringClass, new Type[]{genericType}, null);
            this.f128716f = z14;
        }

        @Override // o23.h
        public Object call(Object[] objArr) throws IllegalAccessException {
            objArr.getClass();
            d(objArr);
            ((Field) this.f128709a).set(this.f128711c != null ? u.E(objArr) : null, u.Q(objArr));
            return Unit.INSTANCE;
        }

        @Override // o23.i
        public void d(Object[] objArr) {
            objArr.getClass();
            super.d(objArr);
            if (this.f128716f && u.Q(objArr) == null) {
                vb.h.s("null is not allowed as a value for this property.");
            }
        }

        public /* synthetic */ g(Field field, boolean z14, boolean z15, p005kotlin.jvm.internal.j jVar) {
            this(field, z14, z15);
        }
    }

    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, p005kotlin.jvm.internal.j jVar) {
        this(member, type, cls, typeArr);
    }
}
