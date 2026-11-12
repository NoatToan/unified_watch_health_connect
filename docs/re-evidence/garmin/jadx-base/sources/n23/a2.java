package n23;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Ln23/a2;", "", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "d", "c", "b", "a", "Ln23/a2$a;", "Ln23/a2$b;", "Ln23/a2$c;", "Ln23/a2$d;", "Ln23/a2$e;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a2 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln23/a2$a;", "Ln23/a2;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends a2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Method> f122386a;

        /* JADX INFO: renamed from: n23.a2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2312a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(((Method) t7).getName(), ((Method) t14).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class<?> cls) {
            super(null);
            cls.getClass();
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            this.f122386a = p13.u.Y(declaredMethods, new C2312a());
        }

        @Override // n23.a2
        /* JADX INFO: renamed from: a */
        public final String getF122392b() {
            return p13.h0.k0(this.f122386a, "", "<init>(", ")V", z1.f122671a, 24);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln23/a2$b;", "Ln23/a2;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Constructor<?> f122387a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor<?> constructor) {
            super(null);
            constructor.getClass();
            this.f122387a = constructor;
        }

        @Override // n23.a2
        /* JADX INFO: renamed from: a */
        public final String getF122392b() {
            Class<?>[] parameterTypes = this.f122387a.getParameterTypes();
            parameterTypes.getClass();
            return p13.u.P(parameterTypes, "", "<init>(", ")V", b2.f122400a, 24);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln23/a2$c;", "Ln23/a2;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends a2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f122388a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            method.getClass();
            this.f122388a = method;
        }

        @Override // n23.a2
        /* JADX INFO: renamed from: a */
        public final String getF122392b() {
            return gl.b.f(this.f122388a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln23/a2$d;", "Ln23/a2;", "Lw33/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends a2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w33.d.b f122389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f122390b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w33.d.b bVar) {
            super(null);
            bVar.getClass();
            this.f122389a = bVar;
            this.f122390b = bVar.a();
        }

        @Override // n23.a2
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF122392b() {
            return this.f122390b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln23/a2$e;", "Ln23/a2;", "Lw33/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends a2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w33.d.b f122391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f122392b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w33.d.b bVar) {
            super(null);
            bVar.getClass();
            this.f122391a = bVar;
            this.f122392b = bVar.a();
        }

        @Override // n23.a2
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF122392b() {
            return this.f122392b;
        }
    }

    public /* synthetic */ a2(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF122392b();

    private a2() {
    }
}
