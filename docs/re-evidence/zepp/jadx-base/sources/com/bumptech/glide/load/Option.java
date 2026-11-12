package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class Option<T> {
    private static final CacheKeyUpdater<Object> e = new a();
    private final T a;
    private final CacheKeyUpdater<T> b;
    private final String c;
    private volatile byte[] d;

    public interface CacheKeyUpdater<T> {
        void update(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public class a implements CacheKeyUpdater<Object> {
        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public void update(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    private Option(@NonNull String str, @Nullable T t, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        this.c = Preconditions.checkNotEmpty(str);
        this.a = t;
        this.b = (CacheKeyUpdater) Preconditions.checkNotNull(cacheKeyUpdater);
    }

    @NonNull
    private static <T> CacheKeyUpdater<T> a() {
        return (CacheKeyUpdater<T>) e;
    }

    @NonNull
    private byte[] b() {
        if (this.d == null) {
            this.d = this.c.getBytes(Key.CHARSET);
        }
        return this.d;
    }

    @NonNull
    public static <T> Option<T> disk(@NonNull String str, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, null, cacheKeyUpdater);
    }

    @NonNull
    public static <T> Option<T> memory(@NonNull String str) {
        return new Option<>(str, null, a());
    }

    public boolean equals(Object obj) {
        if (obj instanceof Option) {
            return this.c.equals(((Option) obj).c);
        }
        return false;
    }

    @Nullable
    public T getDefaultValue() {
        return this.a;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.c + "'}";
    }

    public void update(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.b.update(b(), t, messageDigest);
    }

    @NonNull
    public static <T> Option<T> disk(@NonNull String str, @Nullable T t, @NonNull CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, t, cacheKeyUpdater);
    }

    @NonNull
    public static <T> Option<T> memory(@NonNull String str, @NonNull T t) {
        return new Option<>(str, t, a());
    }
}
