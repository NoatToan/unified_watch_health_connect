package com.xiaomi.fitness.util;

import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"mainHelper", "Lcom/xiaomi/fitness/main/export/MainHelper;", "getMainHelper", "()Lcom/xiaomi/fitness/main/export/MainHelper;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HealthHelperKt {

    @NotNull
    private static final MainHelper mainHelper = MainExtKt.getInstance(MainHelper.INSTANCE);

    @NotNull
    public static final MainHelper getMainHelper() {
        return mainHelper;
    }
}
