package com.huami.bloodoxygen.core.repository.delegate.interfaces;

import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OsaProcess;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JJ\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H&JP\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H&JP\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H&JP\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H&JP\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H&J\u001a\u0010\u0018\u001a\u00020\u00072\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eH&J\u001a\u0010\u001a\u001a\u00020\u00072\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000eH&¨\u0006\u001b"}, d2 = {"Lcom/huami/bloodoxygen/core/repository/delegate/interfaces/IDataCacheDelegate;", "", "", "from", "to", "", "limit", "", "reverse", "syncNext", "direct", "saveSyncLogEvenWhenDirect", "", "fetchAllTypeData", "", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "fetchOdi", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "fetchClickSpo2", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaProcess;", "fetchOsaProcess", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "fetchOsaEvent", "osaProcesses", "deleteOsaProcesses", "osaEvents", "deleteOsaEvents", "core_release"}, k = 1, mv = {1, 5, 1})
public interface IDataCacheDelegate {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean deleteOsaEvents$default(IDataCacheDelegate iDataCacheDelegate, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteOsaEvents");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return iDataCacheDelegate.deleteOsaEvents(list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean deleteOsaProcesses$default(IDataCacheDelegate iDataCacheDelegate, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteOsaProcesses");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return iDataCacheDelegate.deleteOsaProcesses(list);
        }

        public static /* synthetic */ void fetchAllTypeData$default(IDataCacheDelegate iDataCacheDelegate, long j, long j2, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchAllTypeData");
            }
            iDataCacheDelegate.fetchAllTypeData(j, j2, (i2 & 4) != 0 ? 999 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? false : z4);
        }

        public static /* synthetic */ List fetchClickSpo2$default(IDataCacheDelegate iDataCacheDelegate, long j, long j2, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
            if (obj == null) {
                return iDataCacheDelegate.fetchClickSpo2(j, j2, (i2 & 4) != 0 ? 999 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? false : z4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchClickSpo2");
        }

        public static /* synthetic */ List fetchOdi$default(IDataCacheDelegate iDataCacheDelegate, long j, long j2, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
            if (obj == null) {
                return iDataCacheDelegate.fetchOdi(j, j2, (i2 & 4) != 0 ? 999 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? false : z4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchOdi");
        }

        public static /* synthetic */ List fetchOsaEvent$default(IDataCacheDelegate iDataCacheDelegate, long j, long j2, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
            if (obj == null) {
                return iDataCacheDelegate.fetchOsaEvent(j, j2, (i2 & 4) != 0 ? 999 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? false : z4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchOsaEvent");
        }

        public static /* synthetic */ List fetchOsaProcess$default(IDataCacheDelegate iDataCacheDelegate, long j, long j2, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
            if (obj == null) {
                return iDataCacheDelegate.fetchOsaProcess(j, j2, (i2 & 4) != 0 ? 999 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? false : z4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchOsaProcess");
        }
    }

    boolean deleteOsaEvents(@Nullable List<OsaEvent> osaEvents);

    boolean deleteOsaProcesses(@Nullable List<OsaProcess> osaProcesses);

    void fetchAllTypeData(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect);

    @NotNull
    List<ClickMeasuredSpo2> fetchClickSpo2(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect);

    @NotNull
    List<Odi> fetchOdi(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect);

    @NotNull
    List<OsaEvent> fetchOsaEvent(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect);

    @NotNull
    List<OsaProcess> fetchOsaProcess(long from, long to, int limit, boolean reverse, boolean syncNext, boolean direct, boolean saveSyncLogEvenWhenDirect);
}
