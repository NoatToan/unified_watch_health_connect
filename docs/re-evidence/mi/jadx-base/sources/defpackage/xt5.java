package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final class xt5 extends la3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f39440a;

    public class a implements la3<Object, ka3<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f39441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f39442b;

        public a(Type type, Executor executor) {
            this.f39441a = type;
            this.f39442b = executor;
        }

        @Override // defpackage.la3
        public Type a() {
            return this.f39441a;
        }

        @Override // defpackage.la3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ka3<Object> b(ka3<Object> ka3Var) {
            Executor executor = this.f39442b;
            return executor == null ? ka3Var : new b(executor, ka3Var);
        }
    }

    public static final class b<T> implements ka3<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f39443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ka3<T> f39444b;

        public class a implements xa3<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ xa3 f39445a;

            public a(xa3 xa3Var) {
                this.f39445a = xa3Var;
            }

            public final /* synthetic */ void c(xa3 xa3Var, Throwable th) {
                xa3Var.onFailure(b.this, th);
            }

            public final /* synthetic */ void d(xa3 xa3Var, prk prkVar) {
                if (b.this.f39444b.isCanceled()) {
                    xa3Var.onFailure(b.this, new IOException("Canceled"));
                } else {
                    xa3Var.onResponse(b.this, prkVar);
                }
            }

            @Override // defpackage.xa3
            public void onFailure(ka3<T> ka3Var, final Throwable th) {
                Executor executor = b.this.f39443a;
                final xa3 xa3Var = this.f39445a;
                executor.execute(new Runnable() { // from class: zt5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41655a.c(xa3Var, th);
                    }
                });
            }

            @Override // defpackage.xa3
            public void onResponse(ka3<T> ka3Var, final prk<T> prkVar) {
                Executor executor = b.this.f39443a;
                final xa3 xa3Var = this.f39445a;
                executor.execute(new Runnable() { // from class: yt5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40512a.d(xa3Var, prkVar);
                    }
                });
            }
        }

        public b(Executor executor, ka3<T> ka3Var) {
            this.f39443a = executor;
            this.f39444b = ka3Var;
        }

        @Override // defpackage.ka3
        public void E(xa3<T> xa3Var) {
            Objects.requireNonNull(xa3Var, "callback == null");
            this.f39444b.E(new a(xa3Var));
        }

        @Override // defpackage.ka3
        public void cancel() {
            this.f39444b.cancel();
        }

        @Override // defpackage.ka3
        public prk<T> execute() throws IOException {
            return this.f39444b.execute();
        }

        @Override // defpackage.ka3
        public boolean isCanceled() {
            return this.f39444b.isCanceled();
        }

        @Override // defpackage.ka3
        public Request request() {
            return this.f39444b.request();
        }

        @Override // defpackage.ka3
        public ka3<T> clone() {
            return new b(this.f39443a, this.f39444b.clone());
        }
    }

    public xt5(Executor executor) {
        this.f39440a = executor;
    }

    @Override // la3.a
    public la3<?, ?> a(Type type, Annotation[] annotationArr, etk etkVar) {
        if (la3.a.c(type) != ka3.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(kmq.g(0, (ParameterizedType) type), kmq.l(annotationArr, cfm.class) ? null : this.f39440a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
