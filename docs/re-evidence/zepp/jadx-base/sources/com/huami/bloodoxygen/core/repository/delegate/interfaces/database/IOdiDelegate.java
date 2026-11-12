package com.huami.bloodoxygen.core.repository.delegate.interfaces.database;

import com.huami.bloodoxygen.core.local.database.entity.Odi;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H&J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H&J$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H&J\b\u0010\u0018\u001a\u00020\u0017H&¨\u0006\u0019"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOdiDelegate;", "", "", "timestamp", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "getLocalValidOdiFlow", "getLocalOdiFlow", "", "getLocalOdiShouldUpload", "odi", "", "addLocalOdi", "odis", "addLocalOdis", "getLocalOdi", "from", "to", "getLocalOdis", "getLocalOdisFlow", "getLocalLatestOdi", "getLocalLatestOdiFlow", "getIfLocalOdiExistsFlow", "", "clearLocalOdi", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IOdiDelegate {
    boolean addLocalOdi(@NotNull Odi odi);

    boolean addLocalOdis(@NotNull List<Odi> odis);

    void clearLocalOdi();

    @NotNull
    Flow<Boolean> getIfLocalOdiExistsFlow();

    @Nullable
    Odi getLocalLatestOdi();

    @NotNull
    Flow<Odi> getLocalLatestOdiFlow();

    @Nullable
    Odi getLocalOdi(long timestamp);

    @NotNull
    Flow<Odi> getLocalOdiFlow(long timestamp);

    @NotNull
    List<Odi> getLocalOdiShouldUpload();

    @NotNull
    List<Odi> getLocalOdis(long from, long to);

    @NotNull
    Flow<List<Odi>> getLocalOdisFlow(long from, long to);

    @NotNull
    Flow<Odi> getLocalValidOdiFlow(long timestamp);
}
