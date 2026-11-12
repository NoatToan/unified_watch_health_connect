package com.huami.sync;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/huami/sync/RealTimeCache;", "Lcom/huami/sync/Cache;", "", "toggle", "", "saveToggle", "", "time", "saveLastSendTime", "isOpen", "getLastSendTime", "removeToggle", "removeLastOpenTime", "", "a", "Ljava/lang/String;", "TOGGLE_OPEN", "b", "TOGGLE_CLOSE", "<init>", "()V", "Key", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class RealTimeCache implements Cache {

    @NotNull
    public static final RealTimeCache INSTANCE = new RealTimeCache();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TOGGLE_OPEN = "1";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TOGGLE_CLOSE = "0";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/sync/RealTimeCache$Key;", "", "", "TOGGLE", "Ljava/lang/String;", "NOTIFICATION_LAST_OPEN_TIME", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
    public static final class Key {

        @NotNull
        public static final Key INSTANCE = new Key();

        @NotNull
        public static final String NOTIFICATION_LAST_OPEN_TIME = "realtime_transmission_notification_last_send_time";

        @NotNull
        public static final String TOGGLE = "realtime_transmission_toggle";

        private Key() {
        }
    }

    private RealTimeCache() {
    }

    @Override // com.huami.sync.Cache
    public void cache(@NotNull String str, @NotNull String str2) {
        Cache.DefaultImpls.cache(this, str, str2);
    }

    @Override // com.huami.sync.Cache
    @NotNull
    public String getCache(@NotNull String str) {
        return Cache.DefaultImpls.getCache(this, str);
    }

    public final long getLastSendTime() {
        String cache = getCache(Key.NOTIFICATION_LAST_OPEN_TIME);
        if (cache.length() > 0) {
            return Long.parseLong(cache);
        }
        return -1L;
    }

    public final boolean isOpen() {
        String cache = getCache(Key.TOGGLE);
        return !Intrinsics.areEqual(cache, "0") && Intrinsics.areEqual(cache, "1");
    }

    @Override // com.huami.sync.Cache
    public void removeCache(@NotNull String str) {
        Cache.DefaultImpls.removeCache(this, str);
    }

    public final void removeLastOpenTime() {
        removeCache(Key.NOTIFICATION_LAST_OPEN_TIME);
    }

    public final void removeToggle() {
        removeCache(Key.TOGGLE);
    }

    public final void saveLastSendTime(long time) {
        cache(Key.NOTIFICATION_LAST_OPEN_TIME, String.valueOf(time));
    }

    public final void saveToggle(boolean toggle) {
        cache(Key.TOGGLE, toggle ? "1" : "0");
    }
}
