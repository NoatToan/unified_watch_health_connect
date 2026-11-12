package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import com.huami.identity.auth.alexa.ConstantsKt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class SafeKeyGenerator {
    private final LruCache<Key, String> a = new LruCache<>(1000);
    private final Pools.Pool<b> b = FactoryPools.threadSafe(10, new a());

    public class a implements FactoryPools.Factory<b> {
        public a() {
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance(ConstantsKt.ALGORITHM_SHA_256));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class b implements FactoryPools.Poolable {
        public final MessageDigest a;
        private final StateVerifier b = StateVerifier.newInstance();

        public b(MessageDigest messageDigest) {
            this.a = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
        @NonNull
        public StateVerifier getVerifier() {
            return this.b;
        }
    }

    private String a(Key key) {
        b bVar = (b) Preconditions.checkNotNull(this.b.acquire());
        try {
            key.updateDiskCacheKey(bVar.a);
            return Util.sha256BytesToHex(bVar.a.digest());
        } finally {
            this.b.release(bVar);
        }
    }

    public String getSafeKey(Key key) {
        String strA;
        synchronized (this.a) {
            strA = this.a.get(key);
        }
        if (strA == null) {
            strA = a(key);
        }
        synchronized (this.a) {
            this.a.put(key, strA);
        }
        return strA;
    }
}
