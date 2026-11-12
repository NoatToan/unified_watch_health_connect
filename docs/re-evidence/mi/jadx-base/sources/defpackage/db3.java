package defpackage;

import android.graphics.Typeface;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class db3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0a.c f15328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f15329b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j0a.c f15330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f15331b;

        public a(j0a.c cVar, Typeface typeface) {
            this.f15330a = cVar;
            this.f15331b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15330a.b(this.f15331b);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j0a.c f15332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f15333b;

        public b(j0a.c cVar, int i) {
            this.f15332a = cVar;
            this.f15333b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15332a.a(this.f15333b);
        }
    }

    public db3(j0a.c cVar, Handler handler) {
        this.f15328a = cVar;
        this.f15329b = handler;
    }

    public final void a(int i) {
        this.f15329b.post(new b(this.f15328a, i));
    }

    public void b(g0a.e eVar) {
        if (eVar.a()) {
            c(eVar.f18425a);
        } else {
            a(eVar.f18426b);
        }
    }

    public final void c(Typeface typeface) {
        this.f15329b.post(new a(this.f15328a, typeface));
    }
}
