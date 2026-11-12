package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;

/* JADX INFO: loaded from: classes23.dex */
final class c extends CallAdapter.Factory {
    public final Executor a;

    public class a implements CallAdapter<Object, Call<?>> {
        public final /* synthetic */ Type a;

        public a(Type type) {
            this.a = type;
        }

        @Override // retrofit2.CallAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Call<Object> adapt(Call<Object> call) {
            return new b(c.this.a, call);
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.a;
        }
    }

    public static final class b<T> implements Call<T> {
        public final Executor a;
        public final Call<T> b;

        public class a implements Callback<T> {
            public final /* synthetic */ Callback a;

            /* JADX INFO: renamed from: retrofit2.c$b$a$a, reason: collision with other inner class name */
            public class RunnableC1213a implements Runnable {
                public final /* synthetic */ Response a;

                public RunnableC1213a(Response response) {
                    this.a = response;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.b.isCanceled()) {
                        a aVar = a.this;
                        aVar.a.onFailure(b.this, new IOException("Canceled"));
                    } else {
                        a aVar2 = a.this;
                        aVar2.a.onResponse(b.this, this.a);
                    }
                }
            }

            /* JADX INFO: renamed from: retrofit2.c$b$a$b, reason: collision with other inner class name */
            public class RunnableC1214b implements Runnable {
                public final /* synthetic */ Throwable a;

                public RunnableC1214b(Throwable th) {
                    this.a = th;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    aVar.a.onFailure(b.this, this.a);
                }
            }

            public a(Callback callback) {
                this.a = callback;
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<T> call, Throwable th) {
                b.this.a.execute(new RunnableC1214b(th));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call, Response<T> response) {
                b.this.a.execute(new RunnableC1213a(response));
            }
        }

        public b(Executor executor, Call<T> call) {
            this.a = executor;
            this.b = call;
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.b.cancel();
        }

        @Override // retrofit2.Call
        public void enqueue(Callback<T> callback) {
            i.b(callback, "callback == null");
            this.b.enqueue(new a(callback));
        }

        @Override // retrofit2.Call
        public Response<T> execute() throws IOException {
            return this.b.execute();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.b.isCanceled();
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.b.isExecuted();
        }

        @Override // retrofit2.Call
        public Request request() {
            return this.b.request();
        }

        @Override // retrofit2.Call
        public Call<T> clone() {
            return new b(this.a, this.b.clone());
        }
    }

    public c(Executor executor) {
        this.a = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != Call.class) {
            return null;
        }
        return new a(i.f(type));
    }
}
