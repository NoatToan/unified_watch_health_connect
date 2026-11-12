package j9;

import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import androidx.media3.exoplayer.n;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import ds.e0;
import k9.g;
import p9.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<S extends IInterface> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9.b f97762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9.c f97763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<S> f97764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f<S, Integer> f97765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f97766e = -1;

    /* JADX INFO: renamed from: j9.a$a, reason: collision with other inner class name */
    public class C1866a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f97767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f97768b;

        public C1866a(f fVar, b bVar) {
            this.f97767a = fVar;
            this.f97768b = bVar;
        }

        @Override // k9.g
        public final k9.b a() {
            return a.this.f97762a;
        }

        @Override // k9.g
        public final void b(IBinder iBinder) {
            l c2587a;
            a aVar = a.this;
            f fVar = this.f97767a;
            ((e0) this.f97768b).getClass();
            int i14 = l.a.f136445a;
            if (iBinder == null) {
                c2587a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IHealthDataService");
                c2587a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l)) ? new l.a.C2587a(iBinder) : (l) iInterfaceQueryLocalInterface;
            }
            ((e0) fVar).getClass();
            aVar.f97766e = Integer.valueOf(c2587a.G()).intValue();
        }

        @Override // k9.g
        public final void c(Exception exc) {
        }

        @Override // k9.g
        public final g d(k9.e eVar) {
            return this;
        }
    }

    public interface b<S> {
    }

    public a(d dVar, k9.c cVar, b<S> bVar, f<S, Integer> fVar) {
        this.f97762a = new k9.b(dVar.f97777a, dVar.f97779c, dVar.f97778b, new C1866a(fVar, bVar));
        this.f97763b = cVar;
        this.f97764c = bVar;
        this.f97765d = fVar;
    }

    public final SettableFuture e(int i14, e eVar) {
        ListenableFuture listenableFutureTransform;
        SettableFuture settableFutureCreate = SettableFuture.create();
        if (this.f97766e != -1) {
            listenableFutureTransform = Futures.immediateFuture(Integer.valueOf(this.f97766e));
        } else {
            hy.d dVar = new hy.d(this.f97765d, 7);
            SettableFuture settableFutureCreate2 = SettableFuture.create();
            k9.c cVar = this.f97763b;
            c cVar2 = new c(this, this.f97762a, dVar, settableFutureCreate2);
            Handler handler = cVar.f103412b;
            handler.sendMessage(handler.obtainMessage(3, cVar2));
            listenableFutureTransform = Futures.transform(settableFutureCreate2, new n((f9.e) this, 3), MoreExecutors.directExecutor());
        }
        Futures.addCallback(listenableFutureTransform, new j9.b(this, i14, settableFutureCreate, eVar), MoreExecutors.directExecutor());
        return settableFutureCreate;
    }
}
