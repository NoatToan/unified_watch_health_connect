package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.g;
import defpackage.cb3;
import defpackage.jua;
import defpackage.lhe;
import defpackage.oua;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class g {

    public class a implements jua<List<Surface>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f1735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ cb3.a f1736b;
        public final /* synthetic */ ScheduledFuture c;

        public a(boolean z, cb3.a aVar, ScheduledFuture scheduledFuture) {
            this.f1735a = z;
            this.f1736b = aVar;
            this.c = scheduledFuture;
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Surface> list) {
            ArrayList arrayList = new ArrayList(list);
            if (this.f1735a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f1736b.c(arrayList);
            this.c.cancel(true);
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            this.f1736b.c(Collections.unmodifiableList(Collections.emptyList()));
            this.c.cancel(true);
        }
    }

    public static void e(List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public static void f(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                list.get(i).j();
                i++;
            } catch (DeferrableSurface.SurfaceClosedException e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    list.get(i2).d();
                }
                throw e;
            }
        } while (i < list.size());
    }

    public static /* synthetic */ void g(lhe lheVar, cb3.a aVar, long j) {
        if (lheVar.isDone()) {
            return;
        }
        aVar.f(new TimeoutException("Cannot complete surfaceList within " + j));
        lheVar.cancel(true);
    }

    public static /* synthetic */ void h(Executor executor, final lhe lheVar, final cb3.a aVar, final long j) {
        executor.execute(new Runnable() { // from class: fy5
            @Override // java.lang.Runnable
            public final void run() {
                g.g(lheVar, aVar, j);
            }
        });
    }

    public static /* synthetic */ Object j(List list, ScheduledExecutorService scheduledExecutorService, final Executor executor, final long j, boolean z, final cb3.a aVar) throws Exception {
        final lhe lheVarN = oua.n(list);
        ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: hy5
            @Override // java.lang.Runnable
            public final void run() {
                g.h(executor, lheVarN, aVar, j);
            }
        }, j, TimeUnit.MILLISECONDS);
        aVar.a(new Runnable() { // from class: iy5
            @Override // java.lang.Runnable
            public final void run() {
                lheVarN.cancel(true);
            }
        }, executor);
        oua.b(lheVarN, new a(z, aVar, scheduledFutureSchedule), executor);
        return "surfaceList";
    }

    public static lhe<List<Surface>> k(Collection<DeferrableSurface> collection, final boolean z, final long j, final Executor executor, final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(oua.j(it.next().h()));
        }
        return cb3.a(new cb3.c() { // from class: gy5
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return g.j(arrayList, scheduledExecutorService, executor, j, z, aVar);
            }
        });
    }
}
