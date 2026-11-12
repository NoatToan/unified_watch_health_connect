package com.huami.bloodoxygen.core.repository.delegate.interfaces.database;

import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0005H&J \u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H&J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H&J\b\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0014\u001a\u00020\u0012H&¨\u0006\u0015"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IClickSpo2Delegate;", "", "", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "getLocalClickSpo2ShouldUpload", "Lkotlinx/coroutines/flow/Flow;", "getLocalClickSpo2ShouldUploadFlow", "", "from", "to", "getLocalLatestClickSpo2Flow", "getLocalLatestClickSpo2", "getLocalClickSpo2sFlow", "getLocalClickSpo2s", "clickSpo2List", "", "addLocalClickSpo2s", "getIfLocalClickSpo2ExistsFlow", "", "clearLocalClickSpo2", "clearInvalidClickSpo2", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IClickSpo2Delegate {
    boolean addLocalClickSpo2s(@NotNull List<ClickMeasuredSpo2> clickSpo2List);

    void clearInvalidClickSpo2();

    void clearLocalClickSpo2();

    @NotNull
    Flow<Boolean> getIfLocalClickSpo2ExistsFlow();

    @NotNull
    List<ClickMeasuredSpo2> getLocalClickSpo2ShouldUpload();

    @NotNull
    Flow<List<ClickMeasuredSpo2>> getLocalClickSpo2ShouldUploadFlow();

    @NotNull
    List<ClickMeasuredSpo2> getLocalClickSpo2s(long from, long to);

    @NotNull
    Flow<List<ClickMeasuredSpo2>> getLocalClickSpo2sFlow(long from, long to);

    @Nullable
    ClickMeasuredSpo2 getLocalLatestClickSpo2();

    @NotNull
    Flow<ClickMeasuredSpo2> getLocalLatestClickSpo2Flow();

    @NotNull
    Flow<ClickMeasuredSpo2> getLocalLatestClickSpo2Flow(long from, long to);
}
