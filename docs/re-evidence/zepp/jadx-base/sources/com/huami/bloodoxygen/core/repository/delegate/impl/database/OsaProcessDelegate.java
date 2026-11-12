package com.huami.bloodoxygen.core.repository.delegate.impl.database;

import com.huami.bloodoxygen.core.local.database.dao.OsaProcessDao;
import com.huami.bloodoxygen.core.local.database.entity.OsaProcess;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0016\u0010\u0017\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OsaProcessDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOsaProcessDelegate;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaProcess;", "getLocalOsaProcessShouldUpload", "getLocalOsaProcessShouldDelete", "", "sleepDate", "getLocalOsaProcessBySleepDate", "osaProcesses", "", "addLocalOsaProcesses", "", "from", "to", "getLocalOsaProcesses", "Lkotlinx/coroutines/flow/Flow;", "getLocalOsaProcessesFlow", "getLocalLatestOsaProcess", "getLocalLatestOsaProcessFlow", "getIfLocalOsaProcessExistsFlow", "", "clearLocalOsaProcess", "removeLocalOsaProcess", "a", "Ljava/lang/String;", "userId", "Lcom/huami/bloodoxygen/core/local/database/dao/OsaProcessDao;", "b", "Lcom/huami/bloodoxygen/core/local/database/dao/OsaProcessDao;", "osaProcessDao", "<init>", "(Ljava/lang/String;Lcom/huami/bloodoxygen/core/local/database/dao/OsaProcessDao;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class OsaProcessDelegate implements IOsaProcessDelegate {

    @NotNull
    private static final String c = "OsaProcessRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final OsaProcessDao osaProcessDao;

    public OsaProcessDelegate(@NotNull String str, @NotNull OsaProcessDao osaProcessDao) {
        this.userId = str;
        this.osaProcessDao = osaProcessDao;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    public boolean addLocalOsaProcesses(@NotNull List<OsaProcess> osaProcesses) {
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    public void clearLocalOsaProcess() {
        this.osaProcessDao.clear(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public Flow<Boolean> getIfLocalOsaProcessExistsFlow() {
        return FlowKt.distinctUntilChanged(this.osaProcessDao.getIfRawExistsFlow(this.userId));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @Nullable
    public OsaProcess getLocalLatestOsaProcess() {
        return this.osaProcessDao.getLatest(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public Flow<OsaProcess> getLocalLatestOsaProcessFlow() {
        return this.osaProcessDao.getLatestFlow(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public List<OsaProcess> getLocalOsaProcessBySleepDate(@NotNull String sleepDate) {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public List<OsaProcess> getLocalOsaProcessShouldDelete() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public List<OsaProcess> getLocalOsaProcessShouldUpload() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public List<OsaProcess> getLocalOsaProcesses(long from, long to) {
        return this.osaProcessDao.queryOsaProcesses(this.userId, ExtensionKt.toYMDHMS$default(from, null, 1, null), ExtensionKt.toYMDHMS$default(to, null, 1, null));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    @NotNull
    public Flow<List<OsaProcess>> getLocalOsaProcessesFlow(long from, long to) {
        return FlowKt.distinctUntilChanged(this.osaProcessDao.getFlow(this.userId, ExtensionKt.toYMDHMS$default(from, null, 1, null), ExtensionKt.toYMDHMS$default(to, null, 1, null)));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOsaProcessDelegate
    public void removeLocalOsaProcess(@NotNull List<OsaProcess> osaProcesses) {
        OsaProcessDao osaProcessDao = this.osaProcessDao;
        Object[] array = osaProcesses.toArray(new OsaProcess[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        OsaProcess[] osaProcessArr = (OsaProcess[]) array;
        osaProcessDao.remove((OsaProcess[]) Arrays.copyOf(osaProcessArr, osaProcessArr.length));
    }
}
