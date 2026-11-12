package com.nimbusds.jose.util.cache;

import com.nimbusds.jose.shaded.jcip.Immutable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public final class CachedObject<V> {
    private final long expirationTime;
    private final V object;
    private final long timestamp;

    public CachedObject(V v14, long j8, long j14) {
        Objects.requireNonNull(v14);
        this.object = v14;
        this.timestamp = j8;
        this.expirationTime = j14;
    }

    public static long computeExpirationTime(long j8, long j14) {
        long j15 = j8 + j14;
        if (j15 < 0) {
            return Long.MAX_VALUE;
        }
        return j15;
    }

    public V get() {
        return this.object;
    }

    public long getExpirationTime() {
        return this.expirationTime;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public boolean isExpired(long j8) {
        return !isValid(j8);
    }

    public boolean isValid(long j8) {
        return j8 < this.expirationTime;
    }
}
