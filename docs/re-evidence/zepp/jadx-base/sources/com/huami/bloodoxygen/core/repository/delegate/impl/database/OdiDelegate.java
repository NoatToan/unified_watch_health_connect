package com.huami.bloodoxygen.core.repository.delegate.impl.database;

import com.huami.bloodoxygen.core.local.database.dao.OdiDao;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/OdiDelegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOdiDelegate;", "", "timestamp", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "getLocalValidOdiFlow", "getLocalOdiFlow", "", "getLocalOdiShouldUpload", "odi", "", "addLocalOdi", "odis", "addLocalOdis", "getLocalOdi", "from", "to", "getLocalOdis", "getLocalOdisFlow", "getLocalLatestOdi", "getLocalLatestOdiFlow", "getIfLocalOdiExistsFlow", "", "clearLocalOdi", "", "a", "Ljava/lang/String;", "userId", "Lcom/huami/bloodoxygen/core/local/database/dao/OdiDao;", "b", "Lcom/huami/bloodoxygen/core/local/database/dao/OdiDao;", "odiDao", "<init>", "(Ljava/lang/String;Lcom/huami/bloodoxygen/core/local/database/dao/OdiDao;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class OdiDelegate implements IOdiDelegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final OdiDao odiDao;

    public OdiDelegate(@NotNull String str, @NotNull OdiDao odiDao) {
        this.userId = str;
        this.odiDao = odiDao;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    public boolean addLocalOdi(@NotNull Odi odi) {
        return this.odiDao.insert(odi) > 0;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    public boolean addLocalOdis(@NotNull List<Odi> odis) {
        if (!odis.isEmpty()) {
            if (this.odiDao.insert(odis).length == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    public void clearLocalOdi() {
        this.odiDao.clear(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<Boolean> getIfLocalOdiExistsFlow() {
        return FlowKt.distinctUntilChanged(this.odiDao.getIfRawExistsFlow(this.userId));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @Nullable
    public Odi getLocalLatestOdi() {
        return this.odiDao.queryLatest(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<Odi> getLocalLatestOdiFlow() {
        return FlowKt.distinctUntilChanged(this.odiDao.getLatestFlow(this.userId));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @Nullable
    public Odi getLocalOdi(long timestamp) {
        return this.odiDao.query(this.userId, ExtensionKt.toYMDHMS$default(timestamp, null, 1, null));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<Odi> getLocalOdiFlow(long timestamp) {
        return FlowKt.distinctUntilChanged(this.odiDao.getFlow(this.userId, ExtensionKt.toYMDHMS$default(timestamp, null, 1, null)));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public List<Odi> getLocalOdiShouldUpload() {
        return this.odiDao.getShouldUpload(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public List<Odi> getLocalOdis(long from, long to) {
        return this.odiDao.query(this.userId, ExtensionKt.toYMDHMS$default(from, null, 1, null), ExtensionKt.toYMDHMS$default(to, null, 1, null));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<List<Odi>> getLocalOdisFlow(long from, long to) {
        return FlowKt.distinctUntilChanged(this.odiDao.getListFow(this.userId, ExtensionKt.toYMDHMS$default(from, null, 1, null), ExtensionKt.toYMDHMS$default(to, null, 1, null)));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IOdiDelegate
    @NotNull
    public Flow<Odi> getLocalValidOdiFlow(long timestamp) {
        return FlowKt.distinctUntilChanged(this.odiDao.getValidFlow(this.userId, ExtensionKt.toYMDHMS$default(timestamp, null, 1, null)));
    }
}
