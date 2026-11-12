package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaType f17777a;

    public fh2(JavaType javaType) {
        this.f17777a = javaType;
    }

    public abstract boolean A();

    public abstract Object B(boolean z);

    public boolean C() {
        return u().n();
    }

    public abstract AnnotatedMember a();

    public abstract AnnotatedMember b();

    public abstract List<ih2> c();

    public abstract AnnotatedConstructor d();

    public abstract Class<?>[] e();

    public abstract ak4<Object, Object> f();

    public abstract JsonFormat.Value g(JsonFormat.Value value);

    public abstract Method h(Class<?>... clsArr);

    public abstract Map<Object, AnnotatedMember> i();

    public abstract AnnotatedMember j();

    @Deprecated
    public abstract AnnotatedMethod k();

    public abstract AnnotatedMethod l(String str, Class<?>[] clsArr);

    public abstract Class<?> m();

    public abstract mtd.a n();

    public abstract List<ih2> o();

    public abstract JsonInclude.Value p(JsonInclude.Value value);

    public abstract ak4<Object, Object> q();

    public abstract Constructor<?> r(Class<?>... clsArr);

    public Class<?> s() {
        return this.f17777a.getRawClass();
    }

    public abstract ld1 t();

    public abstract a u();

    public abstract List<AnnotatedConstructor> v();

    public abstract List<AnnotatedMethod> w();

    public abstract Set<String> x();

    public abstract z3h y();

    public JavaType z() {
        return this.f17777a;
    }
}
