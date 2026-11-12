package defpackage;

import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class g7g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<y9g> f18684a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayMap<y9g, List<Class<?>>> f18685b = new ArrayMap<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        y9g andSet = this.f18684a.getAndSet(null);
        if (andSet == null) {
            andSet = new y9g(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f18685b) {
            list = this.f18685b.get(andSet);
        }
        this.f18684a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f18685b) {
            this.f18685b.put(new y9g(cls, cls2, cls3), list);
        }
    }
}
