package defpackage;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class sdp<T> implements dbi<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbi<T> f33538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33539b;
    public final Executor e;
    public final ConcurrentLinkedQueue<Pair<cg4<T>, ebi>> d = new ConcurrentLinkedQueue<>();
    public int c = 0;

    public class b extends sy5<T, T> {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Pair f33540a;

            public a(Pair pair) {
                this.f33540a = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                sdp sdpVar = sdp.this;
                Pair pair = this.f33540a;
                sdpVar.f((cg4) pair.first, (ebi) pair.second);
            }
        }

        @Override // defpackage.sy5, defpackage.e52
        public void f() {
            o().a();
            p();
        }

        @Override // defpackage.sy5, defpackage.e52
        public void g(Throwable th) {
            o().onFailure(th);
            p();
        }

        @Override // defpackage.e52
        public void h(T t, int i) {
            o().b(t, i);
            if (e52.d(i)) {
                p();
            }
        }

        public final void p() {
            Pair pair;
            synchronized (sdp.this) {
                try {
                    pair = (Pair) sdp.this.d.poll();
                    if (pair == null) {
                        sdp.d(sdp.this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair != null) {
                sdp.this.e.execute(new a(pair));
            }
        }

        public b(cg4<T> cg4Var) {
            super(cg4Var);
        }
    }

    public sdp(int i, Executor executor, dbi<T> dbiVar) {
        this.f33539b = i;
        this.e = (Executor) b6i.g(executor);
        this.f33538a = (dbi) b6i.g(dbiVar);
    }

    public static /* synthetic */ int d(sdp sdpVar) {
        int i = sdpVar.c;
        sdpVar.c = i - 1;
        return i;
    }

    @Override // defpackage.dbi
    public void a(cg4<T> cg4Var, ebi ebiVar) {
        boolean z;
        ebiVar.f().a(ebiVar.getId(), "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.c;
                z = true;
                if (i >= this.f33539b) {
                    this.d.add(Pair.create(cg4Var, ebiVar));
                } else {
                    this.c = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        f(cg4Var, ebiVar);
    }

    public void f(cg4<T> cg4Var, ebi ebiVar) {
        ebiVar.f().g(ebiVar.getId(), "ThrottlingProducer", null);
        this.f33538a.a(new b(cg4Var), ebiVar);
    }
}
