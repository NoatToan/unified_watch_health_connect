package com.huami.bloodoxygen.core.repository.delegate.interfaces.database;

import com.huami.bloodoxygen.core.local.database.entity.OsaProcess;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010H&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H&J\b\u0010\u0016\u001a\u00020\u0015H&J\u0016\u0010\u0017\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0018"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOsaProcessDelegate;", "", "", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaProcess;", "getLocalOsaProcessShouldUpload", "getLocalOsaProcessShouldDelete", "", "sleepDate", "getLocalOsaProcessBySleepDate", "osaProcesses", "", "addLocalOsaProcesses", "", "from", "to", "getLocalOsaProcesses", "Lkotlinx/coroutines/flow/Flow;", "getLocalOsaProcessesFlow", "getLocalLatestOsaProcess", "getLocalLatestOsaProcessFlow", "getIfLocalOsaProcessExistsFlow", "", "clearLocalOsaProcess", "removeLocalOsaProcess", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IOsaProcessDelegate {
    boolean addLocalOsaProcesses(@NotNull List<OsaProcess> osaProcesses);

    void clearLocalOsaProcess();

    @NotNull
    Flow<Boolean> getIfLocalOsaProcessExistsFlow();

    @Nullable
    OsaProcess getLocalLatestOsaProcess();

    @NotNull
    Flow<OsaProcess> getLocalLatestOsaProcessFlow();

    @NotNull
    List<OsaProcess> getLocalOsaProcessBySleepDate(@NotNull String sleepDate);

    @NotNull
    List<OsaProcess> getLocalOsaProcessShouldDelete();

    @NotNull
    List<OsaProcess> getLocalOsaProcessShouldUpload();

    @NotNull
    List<OsaProcess> getLocalOsaProcesses(long from, long to);

    @NotNull
    Flow<List<OsaProcess>> getLocalOsaProcessesFlow(long from, long to);

    void removeLocalOsaProcess(@NotNull List<OsaProcess> osaProcesses);
}
