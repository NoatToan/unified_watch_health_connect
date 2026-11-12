package com.huami.bloodoxygen.core.repository.delegate.interfaces.database;

import com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0005H&J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¨\u0006\u000e"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOriginOsaProcessDelegate;", "", "", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaProcess;", "getLocalOriginOsaProcessShouldUpload", "Lkotlinx/coroutines/flow/Flow;", "getLocalOriginOsaProcessShouldUploadFlow", "osaProcesses", "", "addLocalOriginOsaProcesses", "", "from", "to", "getLocalOriginOsaProcesses", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IOriginOsaProcessDelegate {
    boolean addLocalOriginOsaProcesses(@NotNull List<OriginOsaProcess> osaProcesses);

    @NotNull
    List<OriginOsaProcess> getLocalOriginOsaProcessShouldUpload();

    @NotNull
    Flow<List<OriginOsaProcess>> getLocalOriginOsaProcessShouldUploadFlow();

    @NotNull
    List<OriginOsaProcess> getLocalOriginOsaProcesses(long from, long to);
}
