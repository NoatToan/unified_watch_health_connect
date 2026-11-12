package com.huami.bloodoxygen.core.repository.delegate.impl.database;

import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.database.dao.SyncLogDao;
import com.huami.bloodoxygen.core.local.database.entity.SyncLog;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/SyncLogDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/ISyncLogDelegate;", "Lcom/huami/bloodoxygen/core/local/database/entity/SyncLog;", "syncLog", "", "addSyncLog", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "type", "", "date", "getSyncLog", "ifSyncLogExists", "", "clearSyncLog", "a", "Ljava/lang/String;", "userId", "Lcom/huami/bloodoxygen/core/local/database/dao/SyncLogDao;", "b", "Lcom/huami/bloodoxygen/core/local/database/dao/SyncLogDao;", "syncLogDao", "<init>", "(Ljava/lang/String;Lcom/huami/bloodoxygen/core/local/database/dao/SyncLogDao;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class SyncLogDelegate implements ISyncLogDelegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SyncLogDao syncLogDao;

    public SyncLogDelegate(@NotNull String str, @NotNull SyncLogDao syncLogDao) {
        this.userId = str;
        this.syncLogDao = syncLogDao;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate
    public boolean addSyncLog(@NotNull SyncLog syncLog) {
        return this.syncLogDao.insert(syncLog) > 0;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate
    public void clearSyncLog() {
        this.syncLogDao.clear(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate
    @Nullable
    public SyncLog getSyncLog(@NotNull BloodOxygen.SubType type, @NotNull String date) {
        return this.syncLogDao.query(this.userId, type, date);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.ISyncLogDelegate
    public boolean ifSyncLogExists(@NotNull BloodOxygen.SubType type) {
        return this.syncLogDao.ifRowExists(this.userId, type);
    }
}
