package com.xiaomi.hm.health.bt.profile.gdsp.common;

import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0000¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/common/DataTransferSniffApiManager;", "", "", "intent", "Lcom/xiaomi/hm/health/bt/profile/gdsp/common/DataTransferSniffApi;", "sniffApi", "", "register", MiPushClient.COMMAND_UNREGISTER, "", "getAll$bluetooth_release", "()Ljava/util/List;", "getAll", "", "a", "Ljava/util/Map;", "sniffApiMap", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DataTransferSniffApiManager {

    @NotNull
    public static final DataTransferSniffApiManager INSTANCE = new DataTransferSniffApiManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Map<String, DataTransferSniffApi> sniffApiMap = new LinkedHashMap();

    private DataTransferSniffApiManager() {
    }

    @NotNull
    public final List<DataTransferSniffApi> getAll$bluetooth_release() {
        return CollectionsKt___CollectionsKt.toList(sniffApiMap.values());
    }

    public final void register(@NotNull String intent, @NotNull DataTransferSniffApi sniffApi) {
        sniffApiMap.put(intent, sniffApi);
    }

    public final void unregister(@NotNull String intent) {
        sniffApiMap.remove(intent);
    }
}
