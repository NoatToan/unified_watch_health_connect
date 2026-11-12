package mz2;

import c83.a0;
import c83.b0;
import c83.f0;
import c83.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import o53.i0;
import o53.s;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lmz2/c;", "Lc83/e$a;", "<init>", "()V", "a", "b", "c", "retrofit2-kotlin-coroutine-adapter"}, k = 1, mv = {1, 4, 0})
public final class c extends c83.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f122004a = new b(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmz2/c$a;", "T", "Lc83/e;", "Lo53/i0;", "Ljava/lang/reflect/Type;", "responseType", "<init>", "(Ljava/lang/reflect/Type;)V", "retrofit2-kotlin-coroutine-adapter"}, k = 1, mv = {1, 4, 0})
    public static final class a<T> implements c83.e<T, i0<? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f122005a;

        public a(Type type) {
            type.getClass();
            this.f122005a = type;
        }

        @Override // c83.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Type getF122006a() {
            return this.f122005a;
        }

        @Override // c83.e
        public final Object b(r rVar) {
            s sVarB = gl.b.b();
            sVarB.J(new mz2.a(sVarB, rVar));
            rVar.q0(new mz2.b(sVarB));
            return sVarB;
        }
    }

    /* JADX INFO: renamed from: mz2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmz2/c$c;", "T", "Lc83/e;", "Lo53/i0;", "Lc83/a0;", "Ljava/lang/reflect/Type;", "responseType", "<init>", "(Ljava/lang/reflect/Type;)V", "retrofit2-kotlin-coroutine-adapter"}, k = 1, mv = {1, 4, 0})
    public static final class C2306c<T> implements c83.e<T, i0<? extends a0<T>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f122006a;

        public C2306c(Type type) {
            type.getClass();
            this.f122006a = type;
        }

        @Override // c83.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Type getF122006a() {
            return this.f122006a;
        }

        @Override // c83.e
        public final Object b(r rVar) {
            s sVarB = gl.b.b();
            sVarB.J(new d(sVarB, rVar));
            rVar.q0(new e(sVarB));
            return sVarB;
        }
    }

    private c() {
    }

    @Override // c83.e.a
    public final c83.e<?, ?> a(Type type, Annotation[] annotationArr, b0 b0Var) {
        type.getClass();
        annotationArr.getClass();
        if (!i0.class.equals(f0.e(type))) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            h.z("Deferred return type must be parameterized as Deferred<Foo> or Deferred<out Foo>");
            return null;
        }
        Type typeD = f0.d(0, (ParameterizedType) type);
        if (!p005kotlin.jvm.internal.s.g(f0.e(typeD), a0.class)) {
            return new a(typeD);
        }
        if (!(typeD instanceof ParameterizedType)) {
            h.z("Response must be parameterized as Response<Foo> or Response<out Foo>");
            return null;
        }
        Type typeD2 = f0.d(0, (ParameterizedType) typeD);
        typeD2.getClass();
        return new C2306c(typeD2);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmz2/c$b;", "", "<init>", "()V", "retrofit2-kotlin-coroutine-adapter"}, k = 1, mv = {1, 4, 0})
    public static final class b {
        private b() {
        }

        public static c a() {
            return new c(null);
        }

        public /* synthetic */ b(j jVar) {
            this();
        }
    }

    public /* synthetic */ c(j jVar) {
        this();
    }
}
