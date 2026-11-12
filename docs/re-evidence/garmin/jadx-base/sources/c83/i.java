package c83;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f25786a;

    public class a implements e<Object, d<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f25787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f25788b;

        public a(i iVar, Type type, Executor executor) {
            this.f25787a = type;
            this.f25788b = executor;
        }

        @Override // c83.e
        /* JADX INFO: renamed from: a */
        public final Type getF122006a() {
            return this.f25787a;
        }

        @Override // c83.e
        public final Object b(r rVar) {
            Executor executor = this.f25788b;
            return executor == null ? rVar : new b(executor, rVar);
        }
    }

    public static final class b<T> implements d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f25789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d<T> f25790b;

        public class a implements f<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f25791a;

            public a(f fVar) {
                this.f25791a = fVar;
            }

            @Override // c83.f
            public final void a(d<T> dVar, Throwable th3) {
                b.this.f25789a.execute(new a8.d(this, 13, this.f25791a, th3));
            }

            @Override // c83.f
            public final void c(d<T> dVar, a0<T> a0Var) {
                b.this.f25789a.execute(new a8.d(this, 12, this.f25791a, a0Var));
            }
        }

        public b(Executor executor, d<T> dVar) {
            this.f25789a = executor;
            this.f25790b = dVar;
        }

        @Override // c83.d
        public final void cancel() {
            this.f25790b.cancel();
        }

        @Override // c83.d
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public final d<T> m7clone() {
            return new b(this.f25789a, this.f25790b.m7clone());
        }

        @Override // c83.d
        public final a0<T> execute() {
            return this.f25790b.execute();
        }

        @Override // c83.d
        public final boolean isCanceled() {
            return this.f25790b.isCanceled();
        }

        @Override // c83.d
        public final void q0(f<T> fVar) {
            this.f25790b.q0(new a(fVar));
        }

        @Override // c83.d
        public final Request request() {
            return this.f25790b.request();
        }
    }

    public i(Executor executor) {
        this.f25786a = executor;
    }

    @Override // c83.e.a
    public final e<?, ?> a(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (f0.e(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(this, f0.d(0, (ParameterizedType) type), f0.h(annotationArr, d0.class) ? null : this.f25786a);
        }
        vb.h.s("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
