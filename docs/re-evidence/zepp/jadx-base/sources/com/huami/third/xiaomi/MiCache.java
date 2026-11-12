package com.huami.third.xiaomi;

import com.huami.ecg.core.db.entity.EcgData;
import com.huami.thirdparty.support.Cache;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0007J\b\u0010\u0013\u001a\u00020\fH\u0007J\b\u0010\u0014\u001a\u00020\u0004H\u0007J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\b\u0010\u0018\u001a\u00020\u0015H\u0007J\b\u0010\u0019\u001a\u00020\u0004H\u0007¨\u0006\u001d"}, d2 = {"Lcom/huami/third/xiaomi/MiCache;", "Lcom/huami/thirdparty/support/Cache;", "", "accessToken", "", "saveAccessToken", "getAccessToken", "removeAccessToken", "refreshToken", "saveRefreshToken", "getRefreshToken", "removeRefreshToken", "", "expires", "saveExpires", "getExpires", "removeExpires", EcgData.TIMESTAMP_SERVER_UPDATED, "saveUpdateTime", "getUpdateTime", "removeUpdateTime", "", "authSuccess", "saveAuthSuccess", "getAuthSuccess", "removeAuthSuccess", "<init>", "()V", "Key", "xiaomi_release"}, k = 1, mv = {1, 4, 1})
public final class MiCache implements Cache {

    @NotNull
    public static final MiCache INSTANCE = new MiCache();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/third/xiaomi/MiCache$Key;", "", "", "MI_ACCESS_TOKEN", "Ljava/lang/String;", "MI_REFRESH_TOKEN", "MI_TOKEN_EXPIRES_IN", "MI_TOKEN_UPDATE_TIME", "KEY_MI_AUTH_SUCCESS", "<init>", "()V", "xiaomi_release"}, k = 1, mv = {1, 4, 1})
    public static final class Key {

        @NotNull
        public static final Key INSTANCE = new Key();

        @NotNull
        public static final String KEY_MI_AUTH_SUCCESS = "MiAuthSuccess";

        @NotNull
        public static final String MI_ACCESS_TOKEN = "MiAccessToken";

        @NotNull
        public static final String MI_REFRESH_TOKEN = "MiRefreshToken";

        @NotNull
        public static final String MI_TOKEN_EXPIRES_IN = "MiTokenExpiresIn";

        @NotNull
        public static final String MI_TOKEN_UPDATE_TIME = "MiTokenUpdateTime";

        private Key() {
        }
    }

    private MiCache() {
    }

    @JvmStatic
    @NotNull
    public static final String getAccessToken() {
        return INSTANCE.getCache("MiAccessToken");
    }

    @JvmStatic
    public static final boolean getAuthSuccess() {
        return Boolean.parseBoolean(INSTANCE.getCache("MiAuthSuccess"));
    }

    @JvmStatic
    public static final long getExpires() {
        String cache = INSTANCE.getCache("MiTokenExpiresIn");
        if (cache.length() > 0) {
            return Long.parseLong(cache);
        }
        return 0L;
    }

    @JvmStatic
    @NotNull
    public static final String getRefreshToken() {
        return INSTANCE.getCache("MiRefreshToken");
    }

    @JvmStatic
    public static final long getUpdateTime() {
        String cache = INSTANCE.getCache(Key.MI_TOKEN_UPDATE_TIME);
        if (cache.length() > 0) {
            return Long.parseLong(cache);
        }
        return 0L;
    }

    @JvmStatic
    public static final void removeAccessToken() {
        INSTANCE.removeCache("MiAccessToken");
    }

    @JvmStatic
    public static final void removeAuthSuccess() {
        INSTANCE.removeCache("MiAuthSuccess");
    }

    @JvmStatic
    public static final void removeExpires() {
        INSTANCE.removeCache("MiTokenExpiresIn");
    }

    @JvmStatic
    public static final void removeRefreshToken() {
        INSTANCE.removeCache("MiRefreshToken");
    }

    @JvmStatic
    public static final void removeUpdateTime() {
        INSTANCE.removeCache(Key.MI_TOKEN_UPDATE_TIME);
    }

    @JvmStatic
    public static final void saveAccessToken(@NotNull String accessToken) {
        INSTANCE.cache("MiAccessToken", accessToken);
    }

    @JvmStatic
    public static final void saveAuthSuccess(boolean authSuccess) {
        INSTANCE.cache("MiAuthSuccess", String.valueOf(authSuccess));
    }

    @JvmStatic
    public static final void saveExpires(long expires) {
        INSTANCE.cache("MiTokenExpiresIn", String.valueOf(expires));
    }

    @JvmStatic
    public static final void saveRefreshToken(@NotNull String refreshToken) {
        INSTANCE.cache("MiRefreshToken", refreshToken);
    }

    @JvmStatic
    public static final void saveUpdateTime(long updateTime) {
        INSTANCE.cache(Key.MI_TOKEN_UPDATE_TIME, String.valueOf(updateTime));
    }

    @Override // com.huami.thirdparty.support.Cache
    public void cache(@NotNull String str, @NotNull String str2) {
        Cache.DefaultImpls.cache(this, str, str2);
    }

    @Override // com.huami.thirdparty.support.Cache
    @NotNull
    public String getCache(@NotNull String str) {
        return Cache.DefaultImpls.getCache(this, str);
    }

    @Override // com.huami.thirdparty.support.Cache
    public void removeCache(@NotNull String str) {
        Cache.DefaultImpls.removeCache(this, str);
    }
}
