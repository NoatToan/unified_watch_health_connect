package com.huami.bloodoxygen.core.repository.delegate.impl.database;

import com.huami.bloodoxygen.core.local.database.dao.OriginOsaEventDao;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0005H\u0016J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OriginOsaEventDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOriginOsaEventDelegate;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaEvent;", "getLocalOriginOsaEventShouldUpload", "Lkotlinx/coroutines/flow/Flow;", "getLocalOriginOsaEventShouldUploadFlow", "osaEvents", "", "addLocalOriginOsaEvents", "", "from", "to", "getLocalOriginOsaEvents", "", "a", "Ljava/lang/String;", "userId", "Lcom/huami/bloodoxygen/core/local/database/dao/OriginOsaEventDao;", "b", "Lcom/huami/bloodoxygen/core/local/database/dao/OriginOsaEventDao;", "osaEventDao", "<init>", "(Ljava/lang/String;Lcom/huami/bloodoxygen/core/local/database/dao/OriginOsaEventDao;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class OriginOsaEventDelegate implements IOriginOsaEventDelegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final OriginOsaEventDao osaEventDao;

    public OriginOsaEventDelegate(@NotNull String str, @NotNull OriginOsaEventDao originOsaEventDao) {
        this.userId = str;
        this.osaEventDao = originOsaEventDao;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate
    public boolean addLocalOriginOsaEvents(@NotNull List<OriginOsaEvent> osaEvents) {
        if (!osaEvents.isEmpty()) {
            if (this.osaEventDao.insert(osaEvents).length == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate
    @NotNull
    public List<OriginOsaEvent> getLocalOriginOsaEventShouldUpload() {
        return this.osaEventDao.getShouldUpload(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate
    @NotNull
    public Flow<List<OriginOsaEvent>> getLocalOriginOsaEventShouldUploadFlow() {
        return FlowKt.distinctUntilChanged(this.osaEventDao.getShouldUploadFlow(this.userId));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaEventDelegate
    @NotNull
    public List<OriginOsaEvent> getLocalOriginOsaEvents(long from, long to) {
        return this.osaEventDao.queryOriginOsaEvents(this.userId, ExtensionKt.toYMDHMS$default(from, null, 1, null), ExtensionKt.toYMDHMS$default(to, null, 1, null));
    }
}
