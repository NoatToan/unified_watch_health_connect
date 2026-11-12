package com.xiaomi.hm.health.locweather.encrypt;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/locweather/encrypt/EncryptApi;", "", "", "str", "encrypt", "privateKey", "decrypt", "locweather_release"}, k = 1, mv = {1, 5, 1})
public interface EncryptApi {
    @Nullable
    String decrypt(@Nullable String str, @NotNull String privateKey);

    @Nullable
    String encrypt(@NotNull String str);
}
