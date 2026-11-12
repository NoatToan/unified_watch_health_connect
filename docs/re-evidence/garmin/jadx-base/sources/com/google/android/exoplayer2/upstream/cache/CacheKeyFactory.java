package com.google.android.exoplayer2.upstream.cache;

import com.garmin.proto.generated.a;
import com.google.android.exoplayer2.upstream.DataSpec;

/* JADX INFO: loaded from: classes14.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new a(23);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$static$0(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }

    String buildCacheKey(DataSpec dataSpec);
}
