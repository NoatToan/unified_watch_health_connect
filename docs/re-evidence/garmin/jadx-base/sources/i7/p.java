package i7;

import android.os.Handler;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class p<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<T> f91947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7.b<T> f91948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f91949c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k7.b f91950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f91951b;

        public a(p pVar, k7.b bVar, Object obj) {
            this.f91950a = bVar;
            this.f91951b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f91950a.accept(this.f91951b);
        }
    }

    public p(Handler handler, Callable<T> callable, k7.b<T> bVar) {
        this.f91947a = callable;
        this.f91948b = bVar;
        this.f91949c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T tCall;
        try {
            tCall = this.f91947a.call();
        } catch (Exception unused) {
            tCall = null;
        }
        this.f91949c.post(new a(this, this.f91948b, tCall));
    }
}
