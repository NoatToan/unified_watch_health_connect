package com.huami.bloodoxygen.core.repository.delegate.interfaces.database;

import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H&J\u0016\u0010\u0014\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\b\u0010\u0015\u001a\u00020\u0013H&¨\u0006\u0016"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/database/IOsaEventDelegate;", "", "", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "getLocalOsaEventShouldUpload", "", "sleepDate", "getLocalOsaEventBySleepDate", "getLocalOsaEventShouldDelete", "osaEvents", "", "addLocalOsaEvents", "", "from", "to", "getLocalOsaEvents", "Lkotlinx/coroutines/flow/Flow;", "getLocalOsaEventsFlow", "getIfLocalOsaEventExistsFlow", "", "removeLocalOsaEvent", "clearLocalOsaEvent", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IOsaEventDelegate {
    boolean addLocalOsaEvents(@NotNull List<OsaEvent> osaEvents);

    void clearLocalOsaEvent();

    @NotNull
    Flow<Boolean> getIfLocalOsaEventExistsFlow();

    @NotNull
    List<OsaEvent> getLocalOsaEventBySleepDate(@NotNull String sleepDate);

    @NotNull
    List<OsaEvent> getLocalOsaEventShouldDelete();

    @NotNull
    List<OsaEvent> getLocalOsaEventShouldUpload();

    @NotNull
    List<OsaEvent> getLocalOsaEvents(long from, long to);

    @NotNull
    Flow<List<OsaEvent>> getLocalOsaEventsFlow(long from, long to);

    void removeLocalOsaEvent(@NotNull List<OsaEvent> osaEvents);
}
