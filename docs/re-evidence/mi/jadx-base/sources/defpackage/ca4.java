package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
@IgnoreJRERequirement
public final class ca4 extends la3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final la3.a f5104a = new ca4();

    @IgnoreJRERequirement
    public static final class a<R> implements la3<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f5105a;

        /* JADX INFO: renamed from: ca4$a$a, reason: collision with other inner class name */
        @IgnoreJRERequirement
        public class C0111a implements xa3<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<R> f5106a;

            public C0111a(CompletableFuture<R> completableFuture) {
                this.f5106a = completableFuture;
            }

            @Override // defpackage.xa3
            public void onFailure(ka3<R> ka3Var, Throwable th) {
                this.f5106a.completeExceptionally(th);
            }

            @Override // defpackage.xa3
            public void onResponse(ka3<R> ka3Var, prk<R> prkVar) {
                if (prkVar.e()) {
                    this.f5106a.complete(prkVar.a());
                } else {
                    this.f5106a.completeExceptionally(new HttpException(prkVar));
                }
            }
        }

        public a(Type type) {
            this.f5105a = type;
        }

        @Override // defpackage.la3
        public Type a() {
            return this.f5105a;
        }

        @Override // defpackage.la3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> b(ka3<R> ka3Var) {
            b bVar = new b(ka3Var);
            ka3Var.E(new C0111a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ka3<?> f5108a;

        public b(ka3<?> ka3Var) {
            this.f5108a = ka3Var;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.f5108a.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements la3<R, CompletableFuture<prk<R>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f5109a;

        @IgnoreJRERequirement
        public class a implements xa3<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CompletableFuture<prk<R>> f5110a;

            public a(CompletableFuture<prk<R>> completableFuture) {
                this.f5110a = completableFuture;
            }

            @Override // defpackage.xa3
            public void onFailure(ka3<R> ka3Var, Throwable th) {
                this.f5110a.completeExceptionally(th);
            }

            @Override // defpackage.xa3
            public void onResponse(ka3<R> ka3Var, prk<R> prkVar) {
                this.f5110a.complete(prkVar);
            }
        }

        public c(Type type) {
            this.f5109a = type;
        }

        @Override // defpackage.la3
        public Type a() {
            return this.f5109a;
        }

        @Override // defpackage.la3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<prk<R>> b(ka3<R> ka3Var) {
            b bVar = new b(ka3Var);
            ka3Var.E(new a(bVar));
            return bVar;
        }
    }

    @Override // la3.a
    public la3<?, ?> a(Type type, Annotation[] annotationArr, etk etkVar) {
        if (la3.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeB = la3.a.b(0, (ParameterizedType) type);
        if (la3.a.c(typeB) != prk.class) {
            return new a(typeB);
        }
        if (typeB instanceof ParameterizedType) {
            return new c(la3.a.b(0, (ParameterizedType) typeB));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
