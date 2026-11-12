package com.huami.third.googlefit;

import com.huami.thirdparty.support.Cache;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/third/googlefit/UserCache;", "Lcom/huami/thirdparty/support/Cache;", "", "userName", "", "saveUserName", "getUserName", "removeUserName", "<init>", "()V", "Key", "googlefit_release"}, k = 1, mv = {1, 4, 1})
public final class UserCache implements Cache {

    @NotNull
    public static final UserCache INSTANCE = new UserCache();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/third/googlefit/UserCache$Key;", "", "", "userName", "Ljava/lang/String;", "<init>", "()V", "googlefit_release"}, k = 1, mv = {1, 4, 1})
    public static final class Key {

        @NotNull
        public static final Key INSTANCE = new Key();

        @NotNull
        public static final String userName = "userName";

        private Key() {
        }
    }

    private UserCache() {
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

    @NotNull
    public final String getUserName() {
        return getCache("userName");
    }

    @Override // com.huami.thirdparty.support.Cache
    public void removeCache(@NotNull String str) {
        Cache.DefaultImpls.removeCache(this, str);
    }

    public final void removeUserName() {
        removeCache("userName");
    }

    public final void saveUserName(@NotNull String userName) {
        cache("userName", userName);
    }
}
