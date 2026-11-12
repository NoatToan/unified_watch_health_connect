package com.xiaomi.fitness.cache;

import com.google.android.gms.common.Scopes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B1\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/cache/MemoryCache;", "K", "V", "", Scopes.PROFILE, "Lcom/xiaomi/fitness/cache/ICacheProfile;", "secondCache", "", "<init>", "(Lcom/xiaomi/fitness/cache/ICacheProfile;Ljava/util/Map;)V", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MemoryCache<K, V> {

    @NotNull
    private final ICacheProfile<K, V> profile;

    public MemoryCache(@NotNull ICacheProfile<K, V> profile, @Nullable Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.profile = profile;
    }
}
