package com.xiaomi.eco;

import com.xiaomi.eco.api.bean.EcoConnectDeviceInfo;
import com.xiaomi.fitness.connect.export.EcoExternalRetryStrategy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/eco/EcoApiCallConfig;", "", "getDeviceInfoById", "Lcom/xiaomi/eco/api/bean/EcoConnectDeviceInfo;", "did", "", "registerRetryCondition", "", "externalRetryStrategy", "Lcom/xiaomi/fitness/connect/export/EcoExternalRetryStrategy;", "unregisterRetryCondition", "getExternalRetryCondition", "isConnectActive", "", "getPhoneId", "Companion", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EcoApiCallConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/eco/EcoApiCallConfig$Companion;", "", "<init>", "()V", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Nullable
    EcoConnectDeviceInfo getDeviceInfoById(@NotNull String did);

    @Nullable
    EcoExternalRetryStrategy getExternalRetryCondition(@NotNull String did);

    @NotNull
    String getPhoneId();

    boolean isConnectActive(@NotNull String did);

    void registerRetryCondition(@NotNull String did, @NotNull EcoExternalRetryStrategy externalRetryStrategy);

    void unregisterRetryCondition(@NotNull String did);
}
