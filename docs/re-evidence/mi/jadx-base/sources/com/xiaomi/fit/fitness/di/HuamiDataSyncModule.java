package com.xiaomi.fit.fitness.di;

import com.xiaomi.fit.fitness.export.api.ThirdPartyDataServerSyncer;
import com.xiaomi.fit.fitness.persist.server.ThirdPartyDataSyncImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/fitness/di/HuamiDataSyncModule;", "", "<init>", "()V", "getHmSyncImpl", "Lcom/xiaomi/fit/fitness/export/api/ThirdPartyDataServerSyncer;", "syncServer", "Lcom/xiaomi/fit/fitness/persist/server/ThirdPartyDataSyncImpl;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HuamiDataSyncModule {
    @NotNull
    public abstract ThirdPartyDataServerSyncer getHmSyncImpl(@NotNull ThirdPartyDataSyncImpl syncServer);
}
