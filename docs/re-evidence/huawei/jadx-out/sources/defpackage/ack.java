package defpackage;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class ack extends Annotated implements TypeResolutionContext {
    private static final e k = new e(null, Collections.EMPTY_LIST, Collections.EMPTY_LIST);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AnnotationIntrospector f249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Class<?> f250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ahn f251c;
    protected final boolean d;
    protected final Annotations e;
    protected final ClassIntrospector.MixInResolver f;
    protected List<acj> g;
    protected e h;
    protected acl i;
    protected transient Boolean j;
    protected final ahp l;
    protected final List<JavaType> m;
    protected final JavaType n;
    protected final Class<?> o;

    ack(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, Annotations annotations, ahn ahnVar, AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, ahp ahpVar, boolean z) {
        this.n = javaType;
        this.f250b = cls;
        this.m = list;
        this.o = cls2;
        this.e = annotations;
        this.f251c = ahnVar;
        this.f249a = annotationIntrospector;
        this.f = mixInResolver;
        this.l = ahpVar;
        this.d = z;
    }

    ack(Class<?> cls) {
        this.n = null;
        this.f250b = cls;
        this.m = Collections.EMPTY_LIST;
        this.o = null;
        this.e = AnnotationCollector.emptyAnnotations();
        this.f251c = ahn.e();
        this.f249a = null;
        this.f = null;
        this.l = null;
        this.d = false;
    }

    @Override // com.fasterxml.jackson.databind.introspect.TypeResolutionContext
    public JavaType resolveType(Type type) {
        return this.l.a(type, this.f251c);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Class<?> getAnnotated() {
        return this.f250b;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int getModifiers() {
        return this.f250b.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this.f250b.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.e.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean hasAnnotation(Class<?> cls) {
        return this.e.has(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return this.e.hasOneOf(clsArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this.f250b;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    @Deprecated
    public Iterable<Annotation> annotations() {
        Annotations annotations = this.e;
        if (annotations instanceof act) {
            return ((act) annotations).b();
        }
        if ((annotations instanceof AnnotationCollector.b) || (annotations instanceof AnnotationCollector.j)) {
            throw new UnsupportedOperationException("please use getAnnotations/ hasAnnotation to check for Annotations");
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this.n;
    }

    public Annotations d() {
        return this.e;
    }

    public boolean j() {
        return this.e.size() > 0;
    }

    public ach e() {
        return h().f253b;
    }

    public List<ach> a() {
        return h().f252a;
    }

    public List<aco> f() {
        return h().d;
    }

    public Iterable<aco> i() {
        return k();
    }

    public aco d(String str, Class<?>[] clsArr) {
        return k().c(str, clsArr);
    }

    public Iterable<acj> c() {
        return l();
    }

    public boolean g() {
        Boolean boolValueOf = this.j;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ahw.q(this.f250b));
            this.j = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    private final List<acj> l() {
        List<acj> listD = this.g;
        if (listD == null) {
            JavaType javaType = this.n;
            if (javaType == null) {
                listD = Collections.EMPTY_LIST;
            } else {
                listD = acn.d(this.f249a, this, this.f, this.l, javaType, this.d);
            }
            this.g = listD;
        }
        return listD;
    }

    private final acl k() {
        acl aclVarC = this.i;
        if (aclVarC == null) {
            JavaType javaType = this.n;
            if (javaType == null) {
                aclVarC = new acl();
            } else {
                aclVarC = acm.c(this.f249a, this, this.f, this.l, javaType, this.m, this.o, this.d);
            }
            this.i = aclVarC;
        }
        return aclVarC;
    }

    private final e h() {
        e eVarE = this.h;
        if (eVarE == null) {
            JavaType javaType = this.n;
            if (javaType == null) {
                eVarE = k;
            } else {
                eVarE = aci.e(this.f249a, this.l, this, javaType, this.o, this.d);
            }
            this.h = eVarE;
        }
        return eVarE;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return "[AnnotedClass " + this.f250b.getName() + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this.f250b.getName().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ahw.e(obj, getClass()) && ((ack) obj).f250b == this.f250b;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ach> f252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ach f253b;
        public final List<aco> d;

        public e(ach achVar, List<ach> list, List<aco> list2) {
            this.f253b = achVar;
            this.f252a = list;
            this.d = list2;
        }
    }
}
