package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "()V", "FAST_SERVICE_LOADER_ENABLED", "", "dispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "loadMainDispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zlt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MainCoroutineDispatcher f54282b;
    private static final boolean d;
    public static final zlt e;

    private zlt() {
    }

    static {
        zlt zltVar = new zlt();
        e = zltVar;
        d = zme.a("kotlinx.coroutines.fast.service.loader", true);
        f54282b = zltVar.a();
    }

    private final MainCoroutineDispatcher a() {
        Object next;
        MainCoroutineDispatcher mainCoroutineDispatcherE;
        try {
            List<MainDispatcherFactory> listD = d ? zlj.f54265b.d() : zdz.c(zdz.a(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator<T> it = listD.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            if (mainDispatcherFactory != null && (mainCoroutineDispatcherE = FAST_SERVICE_LOADER_PROPERTY_NAME.e(mainDispatcherFactory, listD)) != null) {
                return mainCoroutineDispatcherE;
            }
            return FAST_SERVICE_LOADER_PROPERTY_NAME.e(null, null, 3, null);
        } catch (Throwable th) {
            return FAST_SERVICE_LOADER_PROPERTY_NAME.e(th, null, 2, null);
        }
    }
}
