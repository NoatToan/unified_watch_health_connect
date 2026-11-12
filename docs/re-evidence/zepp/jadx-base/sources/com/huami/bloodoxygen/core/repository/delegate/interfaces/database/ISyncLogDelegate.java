package com.huami.bloodoxygen.core.repository.delegate.interfaces.database;

import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.database.entity.SyncLog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\fH&¨\u0006\u000e"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/ISyncLogDelegate;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/SyncLog;", "syncLog", "", "addSyncLog", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "type", "", "date", "getSyncLog", "ifSyncLogExists", "", "clearSyncLog", "core_release"}, k = 1, mv = {1, 5, 1})
public interface ISyncLogDelegate {
    boolean addSyncLog(@NotNull SyncLog syncLog);

    void clearSyncLog();

    @Nullable
    SyncLog getSyncLog(@NotNull BloodOxygen.SubType type, @NotNull String date);

    boolean ifSyncLogExists(@NotNull BloodOxygen.SubType type);
}
