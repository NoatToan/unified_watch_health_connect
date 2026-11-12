package defpackage;

import androidx.collection.ArrayMap;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class qie {
    public static final pie<?, ?, ?> c = new pie<>(Object.class, Object.class, Object.class, Collections.singletonList(new cs5(Object.class, Object.class, Object.class, Collections.emptyList(), new gaq(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayMap<y9g, pie<?, ?, ?>> f31544a = new ArrayMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<y9g> f31545b = new AtomicReference<>();

    public <Data, TResource, Transcode> pie<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        pie<Data, TResource, Transcode> pieVar;
        y9g y9gVarB = b(cls, cls2, cls3);
        synchronized (this.f31544a) {
            pieVar = (pie) this.f31544a.get(y9gVarB);
        }
        this.f31545b.set(y9gVarB);
        return pieVar;
    }

    public final y9g b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        y9g andSet = this.f31545b.getAndSet(null);
        if (andSet == null) {
            andSet = new y9g();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public boolean c(pie<?, ?, ?> pieVar) {
        return c.equals(pieVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, pie<?, ?, ?> pieVar) {
        synchronized (this.f31544a) {
            ArrayMap<y9g, pie<?, ?, ?>> arrayMap = this.f31544a;
            y9g y9gVar = new y9g(cls, cls2, cls3);
            if (pieVar == null) {
                pieVar = c;
            }
            arrayMap.put(y9gVar, pieVar);
        }
    }
}
