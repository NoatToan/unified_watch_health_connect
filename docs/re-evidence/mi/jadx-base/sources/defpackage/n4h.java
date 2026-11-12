package defpackage;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes5.dex */
public class n4h<Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b<Result> f27534a;

    public static class b<Result> extends AsyncTask<Void, Void, s88<Result>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w9h<Result> f27535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b6h<Result> f27536b;

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public s88<Result> doInBackground(Void... voidArr) {
            s88<Result> s88Var = new s88<>();
            this.f27535a.call(s88Var);
            return s88Var;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(s88<Result> s88Var) {
            if (this.f27536b == null) {
                return;
            }
            if (s88Var.c()) {
                this.f27536b.onSuccess(s88Var.a());
            } else {
                this.f27536b.onError(s88Var.b());
            }
        }

        public final void e(b6h<Result> b6hVar) {
            this.f27536b = b6hVar;
        }

        public final void f(w9h<Result> w9hVar) {
            this.f27535a = w9hVar;
        }

        public b() {
        }
    }

    public n4h(w9h<Result> w9hVar) {
        b<Result> bVar = new b<>();
        this.f27534a = bVar;
        bVar.f(w9hVar);
    }

    public static <Result> n4h<Result> a(w9h<Result> w9hVar) {
        return new n4h<>(w9hVar);
    }

    public final void b() {
        this.f27534a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void c(b6h<Result> b6hVar) {
        this.f27534a.e(b6hVar);
        this.f27534a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
