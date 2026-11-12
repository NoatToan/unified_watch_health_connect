package com.huami.bloodoxygen.core.repository.delegate.impl.database;

import com.huami.bloodoxygen.core.local.database.dao.OriginOsaProcessDao;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0005H\u0016J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OriginOsaProcessDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOriginOsaProcessDelegate;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaProcess;", "getLocalOriginOsaProcessShouldUpload", "Lkotlinx/coroutines/flow/Flow;", "getLocalOriginOsaProcessShouldUploadFlow", "osaProcesses", "", "addLocalOriginOsaProcesses", "", "from", "to", "getLocalOriginOsaProcesses", "", "a", "Ljava/lang/String;", "userId", "Lcom/huami/bloodoxygen/core/local/database/dao/OriginOsaProcessDao;", "b", "Lcom/huami/bloodoxygen/core/local/database/dao/OriginOsaProcessDao;", "originOsaProcessDao", "<init>", "(Ljava/lang/String;Lcom/huami/bloodoxygen/core/local/database/dao/OriginOsaProcessDao;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class OriginOsaProcessDelegate implements IOriginOsaProcessDelegate {

    @NotNull
    private static final String c = "OsaProcessRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final OriginOsaProcessDao originOsaProcessDao;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "addOsaProcess list is empty";
        }
    }

    public OriginOsaProcessDelegate(@NotNull String str, @NotNull OriginOsaProcessDao originOsaProcessDao) {
        this.userId = str;
        this.originOsaProcessDao = originOsaProcessDao;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate
    public boolean addLocalOriginOsaProcesses(@NotNull List<OriginOsaProcess> osaProcesses) {
        if (!osaProcesses.isEmpty()) {
            return !(this.originOsaProcessDao.insert(osaProcesses).length == 0);
        }
        HMLog.info(c, a.a);
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate
    @NotNull
    public List<OriginOsaProcess> getLocalOriginOsaProcessShouldUpload() {
        return this.originOsaProcessDao.getShouldUpload(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate
    @NotNull
    public Flow<List<OriginOsaProcess>> getLocalOriginOsaProcessShouldUploadFlow() {
        return FlowKt.distinctUntilChanged(this.originOsaProcessDao.getShouldUploadFlow(this.userId));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOriginOsaProcessDelegate
    @NotNull
    public List<OriginOsaProcess> getLocalOriginOsaProcesses(long from, long to) {
        return this.originOsaProcessDao.queryOriginOsaProcesses(this.userId, ExtensionKt.toYMDHMS$default(from, null, 1, null), ExtensionKt.toYMDHMS$default(to, null, 1, null));
    }
}
