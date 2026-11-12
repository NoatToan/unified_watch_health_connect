package com.huami.health.afppg.data.remote;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"$\u0010\n\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/huami/health/afppg/data/remote/WebUrlConfig;", "urlConfig", "", "initPpgWebConfig", "a", "Lcom/huami/health/afppg/data/remote/WebUrlConfig;", "getWebUrlConfig", "()Lcom/huami/health/afppg/data/remote/WebUrlConfig;", "setWebUrlConfig", "(Lcom/huami/health/afppg/data/remote/WebUrlConfig;)V", "webUrlConfig", "afppg-core_release"}, k = 2, mv = {1, 5, 1})
public final class WebUrlConfigKt {

    @Nullable
    private static WebUrlConfig a;

    @Nullable
    public static final WebUrlConfig getWebUrlConfig() {
        return a;
    }

    public static final void initPpgWebConfig(@NotNull WebUrlConfig webUrlConfig) {
        a = webUrlConfig;
    }

    public static final void setWebUrlConfig(@Nullable WebUrlConfig webUrlConfig) {
        a = webUrlConfig;
    }
}
