package com.huami.bloodoxygen.core.repository.delegate.impl.database;

import com.huami.bloodoxygen.core.local.database.dao.OsaEventDao;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0016J\u0016\u0010\u0014\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OsaEventDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOsaEventDelegate;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "getLocalOsaEventShouldUpload", "", "sleepDate", "getLocalOsaEventBySleepDate", "getLocalOsaEventShouldDelete", "osaEvents", "", "addLocalOsaEvents", "", "from", "to", "getLocalOsaEvents", "Lkotlinx/coroutines/flow/Flow;", "getLocalOsaEventsFlow", "getIfLocalOsaEventExistsFlow", "", "removeLocalOsaEvent", "clearLocalOsaEvent", "a", "Ljava/lang/String;", "userId", "Lcom/huami/bloodoxygen/core/local/database/dao/OsaEventDao;", "b", "Lcom/huami/bloodoxygen/core/local/database/dao/OsaEventDao;", "osaEventDao", "<init>", "(Ljava/lang/String;Lcom/huami/bloodoxygen/core/local/database/dao/OsaEventDao;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class OsaEventDelegate implements IOsaEventDelegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final OsaEventDao osaEventDao;

    public OsaEventDelegate(@NotNull String str, @NotNull OsaEventDao osaEventDao) {
        this.userId = str;
        this.osaEventDao = osaEventDao;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    public boolean addLocalOsaEvents(@NotNull List<OsaEvent> osaEvents) {
        if (!osaEvents.isEmpty()) {
            if (this.osaEventDao.insert(osaEvents).length == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    public void clearLocalOsaEvent() {
        this.osaEventDao.clear(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public Flow<Boolean> getIfLocalOsaEventExistsFlow() {
        return FlowKt.distinctUntilChanged(this.osaEventDao.getIfRawExistsFlow(this.userId));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public List<OsaEvent> getLocalOsaEventBySleepDate(@NotNull String sleepDate) {
        return this.osaEventDao.queryOsaEventsBySleepDate(this.userId, sleepDate);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public List<OsaEvent> getLocalOsaEventShouldDelete() {
        return this.osaEventDao.getShouldDelete(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public List<OsaEvent> getLocalOsaEventShouldUpload() {
        return this.osaEventDao.getShouldUpload(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public List<OsaEvent> getLocalOsaEvents(long from, long to) {
        return this.osaEventDao.queryOsaEvents(this.userId, ExtensionKt.toYMDHMS$default(from, null, 1, null), ExtensionKt.toYMDHMS$default(to, null, 1, null));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    @NotNull
    public Flow<List<OsaEvent>> getLocalOsaEventsFlow(long from, long to) {
        return this.osaEventDao.getOsaEventsFlow(this.userId, ExtensionKt.toYMDHMS$default(from, null, 1, null), ExtensionKt.toYMDHMS$default(to, null, 1, null));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaEventDelegate
    public void removeLocalOsaEvent(@NotNull List<OsaEvent> osaEvents) {
        OsaEventDao osaEventDao = this.osaEventDao;
        Object[] array = osaEvents.toArray(new OsaEvent[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        OsaEvent[] osaEventArr = (OsaEvent[]) array;
        osaEventDao.remove((OsaEvent[]) Arrays.copyOf(osaEventArr, osaEventArr.length));
    }
}
