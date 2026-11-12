package org.eclipse.californium.scandium.dtls.cipher;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto;

/* JADX INFO: loaded from: classes20.dex */
public class ThreadLocalCryptoMap<TL extends ThreadLocalCrypto<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<String, TL> f44578b = new ConcurrentHashMap();
    private final Factory<TL> e;

    public interface Factory<T> {
        T getInstance(String str);
    }

    public ThreadLocalCryptoMap(Factory<TL> factory) {
        this.e = factory;
    }

    public TL c(String str) {
        TL tl = this.f44578b.get(str);
        if (tl != null) {
            return tl;
        }
        TL factory = this.e.getInstance(str);
        TL tlPutIfAbsent = this.f44578b.putIfAbsent(str, factory);
        return tlPutIfAbsent == null ? factory : tlPutIfAbsent;
    }
}
