package b;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lb/s;", "", "", "enabled", "<init>", "(Z)V", "a", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13818b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13817a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<AutoCloseable> f13819c = new CopyOnWriteArrayList<>();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb/s$a;", "Lwc/e;", "Lwc/g;", "Lb/s;", "onBackPressedCallback", "info", "<init>", "(Lb/s;Lwc/g;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends wc.e<wc.g> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final s f13820h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f13821i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, wc.g gVar) {
            super(gVar, sVar.f13818b);
            sVar.getClass();
            gVar.getClass();
            this.f13820h = sVar;
            this.f13821i = true;
        }

        @Override // wc.e
        public final void c() {
            this.f13820h.a();
        }

        @Override // wc.e
        public final void d() {
            this.f13820h.b();
        }

        @Override // wc.e
        public final void e(wc.b bVar) {
            this.f13820h.c(new c(bVar));
        }

        @Override // wc.e
        public final void f(wc.b bVar) {
            bVar.getClass();
            this.f13820h.d(new c(bVar));
        }

        public final void j(boolean z14) {
            this.f13821i = z14;
            i(z14 && this.f13820h.f13818b);
        }
    }

    public s(boolean z14) {
        this.f13818b = z14;
    }

    public void a() {
    }

    public abstract void b();

    public void c(c cVar) {
    }

    public void d(c cVar) {
    }

    public final void e() throws Exception {
        boolean zIsTerminated;
        CopyOnWriteArrayList<AutoCloseable> copyOnWriteArrayList = this.f13819c;
        Iterator<AutoCloseable> it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable next = it.next();
            if (next instanceof AutoCloseable) {
                next.close();
            } else if (next instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) next;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z14 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z14) {
                                executorService.shutdownNow();
                                z14 = true;
                            }
                        }
                    }
                    if (z14) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (next instanceof TypedArray) {
                ((TypedArray) next).recycle();
            } else {
                if (!(next instanceof MediaMetadataRetriever)) {
                    vb.h.w();
                    return;
                }
                ((MediaMetadataRetriever) next).release();
            }
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.f13817a;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((a) it3.next()).h();
        }
        arrayList.clear();
    }

    public final void f(boolean z14) {
        this.f13818b = z14;
        for (a aVar : this.f13817a) {
            aVar.i(aVar.f13821i && z14);
        }
    }
}
