package com.huami.bloodoxygen.core.repository.delegate.impl.database;

import com.huami.bloodoxygen.core.local.database.dao.ClickMeasureSpo2Dao;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0005H\u0016J \u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u0016J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/impl/database/ClickSpo2Delegate;", "Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IClickSpo2Delegate;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "getLocalClickSpo2ShouldUpload", "Lkotlinx/coroutines/flow/Flow;", "getLocalClickSpo2ShouldUploadFlow", "", "from", "to", "getLocalLatestClickSpo2Flow", "getLocalLatestClickSpo2", "getLocalClickSpo2sFlow", "getLocalClickSpo2s", "clickSpo2List", "", "addLocalClickSpo2s", "getIfLocalClickSpo2ExistsFlow", "", "clearLocalClickSpo2", "clearInvalidClickSpo2", "", "a", "Ljava/lang/String;", "userId", "Lcom/huami/bloodoxygen/core/local/database/dao/ClickMeasureSpo2Dao;", "b", "Lcom/huami/bloodoxygen/core/local/database/dao/ClickMeasureSpo2Dao;", "clickSpo2Dao", "<init>", "(Ljava/lang/String;Lcom/huami/bloodoxygen/core/local/database/dao/ClickMeasureSpo2Dao;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class ClickSpo2Delegate implements IClickSpo2Delegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ClickMeasureSpo2Dao clickSpo2Dao;

    public ClickSpo2Delegate(@NotNull String str, @NotNull ClickMeasureSpo2Dao clickMeasureSpo2Dao) {
        this.userId = str;
        this.clickSpo2Dao = clickMeasureSpo2Dao;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    public boolean addLocalClickSpo2s(@NotNull List<ClickMeasuredSpo2> clickSpo2List) {
        if (!clickSpo2List.isEmpty()) {
            if (this.clickSpo2Dao.insert(clickSpo2List).length == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    public void clearInvalidClickSpo2() {
        this.clickSpo2Dao.clearInvalid(this.userId, 80, 100);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    public void clearLocalClickSpo2() {
        this.clickSpo2Dao.clear(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<Boolean> getIfLocalClickSpo2ExistsFlow() {
        return FlowKt.distinctUntilChanged(this.clickSpo2Dao.getIfRawExistsFlow(this.userId));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public List<ClickMeasuredSpo2> getLocalClickSpo2ShouldUpload() {
        return this.clickSpo2Dao.getShouldUpload(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<List<ClickMeasuredSpo2>> getLocalClickSpo2ShouldUploadFlow() {
        return FlowKt.distinctUntilChanged(this.clickSpo2Dao.getShouldUploadFlow(this.userId));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public List<ClickMeasuredSpo2> getLocalClickSpo2s(long from, long to) {
        return this.clickSpo2Dao.query(this.userId, ExtensionKt.toYMDHMS$default(from, null, 1, null), ExtensionKt.toYMDHMS$default(to, null, 1, null));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<List<ClickMeasuredSpo2>> getLocalClickSpo2sFlow(long from, long to) {
        return FlowKt.distinctUntilChanged(this.clickSpo2Dao.getFlow(this.userId, ExtensionKt.toYMDHMS$default(from, null, 1, null), ExtensionKt.toYMDHMS$default(to, null, 1, null)));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @Nullable
    public ClickMeasuredSpo2 getLocalLatestClickSpo2() {
        return this.clickSpo2Dao.getLatest(this.userId);
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<ClickMeasuredSpo2> getLocalLatestClickSpo2Flow(long from, long to) {
        return FlowKt.distinctUntilChanged(this.clickSpo2Dao.getRangeLatestFlow(this.userId, ExtensionKt.toYMDHMS$default(from, null, 1, null), ExtensionKt.toYMDHMS$default(to, null, 1, null)));
    }

    @Override // com.huami.bloodoxygen.core.repository.delegate.interfaces.database.IClickSpo2Delegate
    @NotNull
    public Flow<ClickMeasuredSpo2> getLocalLatestClickSpo2Flow() {
        return FlowKt.distinctUntilChanged(this.clickSpo2Dao.getLatestFlow(this.userId));
    }
}
