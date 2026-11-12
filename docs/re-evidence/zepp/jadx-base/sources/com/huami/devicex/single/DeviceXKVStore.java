package com.huami.devicex.single;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u001e\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\tH&J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/huami/devicex/single/DeviceXKVStore;", "", "", "key", "value", "", "putString", "defaultValue", "fetchString", "", "putBoolean", "getBoolean", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DeviceXKVStore {
    @Nullable
    String fetchString(@Nullable String key, @Nullable String defaultValue);

    boolean getBoolean(@NotNull String key, boolean defaultValue);

    void putBoolean(@NotNull String key, boolean value);

    void putString(@Nullable String key, @Nullable String value);
}
