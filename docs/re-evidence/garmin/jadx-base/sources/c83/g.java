package c83;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(24)
@IgnoreJRERequirement
public final class g extends e.a {

    @IgnoreJRERequirement
    public static final class a<R> implements e<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f25781a;

        /* JADX INFO: renamed from: c83.g$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C0380a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<R> f25782a;

            public C0380a(a aVar, CompletableFuture<R> completableFuture) {
                this.f25782a = completableFuture;
            }

            @Override // c83.f
            public final void a(d<R> dVar, Throwable th3) {
                this.f25782a.completeExceptionally(th3);
            }

            @Override // c83.f
            public final void c(d<R> dVar, a0<R> a0Var) {
                boolean zIsSuccessful = a0Var.f25745a.isSuccessful();
                CompletableFuture<R> completableFuture = this.f25782a;
                if (zIsSuccessful) {
                    completableFuture.complete(a0Var.f25746b);
                } else {
                    completableFuture.completeExceptionally(new HttpException(a0Var));
                }
            }
        }

        public a(Type type) {
            this.f25781a = type;
        }

        @Override // c83.e
        /* JADX INFO: renamed from: a */
        public final Type getF122006a() {
            return this.f25781a;
        }

        @Override // c83.e
        public final Object b(r rVar) {
            b bVar = new b(rVar);
            rVar.q0(new C0380a(this, bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<?> f25783a;

        public b(d<?> dVar) {
            this.f25783a = dVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z14) {
            if (z14) {
                this.f25783a.cancel();
            }
            return super.cancel(z14);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements e<R, CompletableFuture<a0<R>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f25784a;

        @IgnoreJRERequirement
        public class a implements f<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<a0<R>> f25785a;

            public a(c cVar, CompletableFuture<a0<R>> completableFuture) {
                this.f25785a = completableFuture;
            }

            @Override // c83.f
            public final void a(d<R> dVar, Throwable th3) {
                this.f25785a.completeExceptionally(th3);
            }

            @Override // c83.f
            public final void c(d<R> dVar, a0<R> a0Var) {
                this.f25785a.complete(a0Var);
            }
        }

        public c(Type type) {
            this.f25784a = type;
        }

        @Override // c83.e
        /* JADX INFO: renamed from: a */
        public final Type getF122006a() {
            return this.f25784a;
        }

        @Override // c83.e
        public final Object b(r rVar) {
            b bVar = new b(rVar);
            rVar.q0(new a(this, bVar));
            return bVar;
        }
    }

    @Override // c83.e.a
    public final e<?, ?> a(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (f0.e(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            vb.h.z("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type typeD = f0.d(0, (ParameterizedType) type);
        if (f0.e(typeD) != a0.class) {
            return new a(typeD);
        }
        if (typeD instanceof ParameterizedType) {
            return new c(f0.d(0, (ParameterizedType) typeD));
        }
        vb.h.z("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
