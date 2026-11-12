package com.huami.ecg.sync.health;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0007"}, d2 = {"Lcom/huami/ecg/sync/health/HealthConfig;", "", "", "", "getAppList", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class HealthConfig {
    public static final HealthConfig INSTANCE = new HealthConfig();

    private HealthConfig() {
    }

    @NotNull
    public final List<String> getAppList() {
        return CollectionsKt__CollectionsKt.mutableListOf("com.huami.shushan", "com.huami.watch", "com.huami.midong");
    }
}
