package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    private c1() {
    }

    public static void a(List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public static void b(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i14 = 0;
        do {
            try {
                list.get(i14).d();
                i14++;
            } catch (DeferrableSurface.SurfaceClosedException e4) {
                for (int i15 = i14 - 1; i15 >= 0; i15--) {
                    list.get(i15).b();
                }
                throw e4;
            }
        } while (i14 < list.size());
    }

    public static androidx.concurrent.futures.b.d c(List list, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l0.j.f(((DeferrableSurface) it.next()).c()));
        }
        return androidx.concurrent.futures.b.a(new a73.f(androidx.concurrent.futures.b.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(l0.j.i(arrayList), scheduledExecutorService, 5000L, 7)), 3, executor, list));
    }
}
