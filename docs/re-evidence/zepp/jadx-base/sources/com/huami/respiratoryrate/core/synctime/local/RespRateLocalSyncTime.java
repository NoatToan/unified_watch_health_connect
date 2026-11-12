package com.huami.respiratoryrate.core.synctime.local;

import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated(message = "使用UserProperty")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/respiratoryrate/core/synctime/local/RespRateLocalSyncTime;", "", "", "getSyncTime", "timeInMillis", "", "saveSyncTime", "", "clear", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "a", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kv", "", "b", "Ljava/lang/String;", "userId", "<init>", "(Lcom/huami/utils/persistence/kvkit/KvPersistence;Ljava/lang/String;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class RespRateLocalSyncTime {

    @NotNull
    public static final String BLE_SYNCTIME = "ble_synctime_";

    @NotNull
    public static final String KV_NAME = "respiratory_rate";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence kv;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    public RespRateLocalSyncTime(@NotNull KvPersistence kvPersistence, @NotNull String str) {
        this.kv = kvPersistence;
        this.userId = str;
    }

    public final void clear() {
        this.kv.clear();
    }

    public final long getSyncTime() {
        return ((Number) this.kv.getValue(Intrinsics.stringPlus(BLE_SYNCTIME, this.userId), 0L)).longValue();
    }

    public final boolean saveSyncTime(long timeInMillis) {
        return this.kv.setValue(Intrinsics.stringPlus(BLE_SYNCTIME, this.userId), Long.valueOf(timeInMillis));
    }
}
