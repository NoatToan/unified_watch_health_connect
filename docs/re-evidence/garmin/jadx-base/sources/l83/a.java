package l83;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference<a> f111500b = new AtomicReference<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f111501a;

    private a() {
        AtomicReference<k83.b> atomicReference = k83.a.f103403b.f103404a;
        if (atomicReference.get() == null) {
            k83.b bVar = k83.b.f103405a;
            while (!atomicReference.compareAndSet(null, bVar) && atomicReference.get() == null) {
            }
        }
        atomicReference.get().getClass();
        this.f111501a = new b(Looper.getMainLooper());
    }

    public static b a() {
        a aVar;
        loop0: while (true) {
            AtomicReference<a> atomicReference = f111500b;
            aVar = atomicReference.get();
            if (aVar != null) {
                break;
            }
            aVar = new a();
            do {
                if (atomicReference.compareAndSet(null, aVar)) {
                    break loop0;
                }
            } while (atomicReference.get() == null);
        }
        return aVar.f111501a;
    }
}
