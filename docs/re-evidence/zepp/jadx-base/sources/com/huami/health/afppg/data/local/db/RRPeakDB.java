package com.huami.health.afppg.data.local.db;

import com.huami.health.afppg.data.local.IRRPeakDB;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.huami.health.afppg.data.local.dao.RRPeakDao;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J*\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u001e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J \u0010\u0018\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\u001a\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J(\u0010\u001d\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/health/afppg/data/local/db/RRPeakDB;", "Lcom/huami/health/afppg/data/local/IRRPeakDB;", "Lcom/huami/health/afppg/data/local/bean/RRPeak;", "existedRR", "currentRR", "", "a", "", "userId", "", "generatedTime", "", "dataType", "deviceSource", "c", "timestamp", "source", "", "b", "data", "insertNewData", "getServerPath", "", "clearData", "deleteData", "getUnsyncedData", "updateSyncedState", "hasUnsyncedData", "serverPath", "updateRawPath", "Lcom/huami/health/afppg/data/local/dao/RRPeakDao;", "Lcom/huami/health/afppg/data/local/dao/RRPeakDao;", "rrPeakDao", "<init>", "(Lcom/huami/health/afppg/data/local/dao/RRPeakDao;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class RRPeakDB implements IRRPeakDB {
    private static final int b = -1;

    @NotNull
    private static final String c = "af_ppg_RRPeakDB";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final RRPeakDao rrPeakDao;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "rrpeak data delete old data ,inserted";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "rrpeak data existed, not insert";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("rrpeak data inserted failed: ", this.a.getMessage());
        }
    }

    public RRPeakDB(@NotNull RRPeakDao rRPeakDao) {
        this.rrPeakDao = rRPeakDao;
    }

    private final boolean a(RRPeak existedRR, RRPeak currentRR) {
        return (existedRR.getRrRecordSize() == -1 || currentRR.getRrRecordSize() == -1 || existedRR.getRrRecordSize() >= currentRR.getRrRecordSize()) ? false : true;
    }

    private final List<RRPeak> b(String userId, long timestamp, int source) {
        return source > 0 ? this.rrPeakDao.queryRRData(userId, timestamp, source) : this.rrPeakDao.queryRRData(userId, timestamp);
    }

    private final RRPeak c(String userId, long generatedTime, int dataType, int deviceSource) {
        return (RRPeak) CollectionsKt.firstOrNull((List) this.rrPeakDao.queryRRData(userId, generatedTime, dataType, deviceSource));
    }

    @Override // com.huami.health.afppg.data.local.IRRPeakDB
    public void clearData(@NotNull String userId) {
        this.rrPeakDao.clear(userId);
    }

    @Override // com.huami.health.afppg.data.local.IRRPeakDB
    public void deleteData(@NotNull String userId, int source, long timestamp) {
        if (source > 0) {
            this.rrPeakDao.delete(userId, source, timestamp);
        } else {
            this.rrPeakDao.delete(userId, timestamp);
        }
    }

    @Override // com.huami.health.afppg.data.local.IRRPeakDB
    @Nullable
    public String getServerPath(@NotNull String userId, long timestamp) {
        RRPeak rRPeak = (RRPeak) CollectionsKt.firstOrNull((List) this.rrPeakDao.queryLocalPath(userId, timestamp));
        if (rRPeak == null) {
            return null;
        }
        return rRPeak.getRawDataURI();
    }

    @Override // com.huami.health.afppg.data.local.IRRPeakDB
    @Nullable
    public List<RRPeak> getUnsyncedData(@NotNull String userId) {
        return this.rrPeakDao.getUnsyncedData(userId);
    }

    @Override // com.huami.health.afppg.data.local.IRRPeakDB
    public boolean hasUnsyncedData(@NotNull String userId) {
        List<RRPeak> unsyncedData = this.rrPeakDao.getUnsyncedData(userId);
        return !(unsyncedData == null || unsyncedData.isEmpty());
    }

    @Override // com.huami.health.afppg.data.local.IRRPeakDB
    public boolean insertNewData(@NotNull String userId, @NotNull List<RRPeak> data) {
        try {
            Result.Companion companion = Result.Companion;
            for (RRPeak rRPeak : data) {
                RRPeak rRPeakC = c(userId, rRPeak.getGeneratedTime(), rRPeak.getDataType(), rRPeak.getDeviceSource());
                if (rRPeakC == null) {
                    this.rrPeakDao.insert(rRPeak);
                } else if (a(rRPeakC, rRPeak)) {
                    this.rrPeakDao.delete(userId, rRPeakC.getGeneratedTime());
                    HMLog.info(c, a.a);
                    this.rrPeakDao.insert(rRPeak);
                } else {
                    HMLog.info(c, b.a);
                }
            }
            return true;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(Result.m3845constructorimpl(ResultKt.createFailure(th)));
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default(c, null, null, new c(thM3848exceptionOrNullimpl), 6, null);
            }
            return false;
        }
    }

    @Override // com.huami.health.afppg.data.local.IRRPeakDB
    public void updateRawPath(@NotNull String userId, int source, long timestamp, @NotNull String serverPath) {
        RRPeak rRPeak = (RRPeak) CollectionsKt.firstOrNull((List) b(userId, timestamp, source));
        if (rRPeak == null) {
            return;
        }
        rRPeak.setRawDataURI(serverPath);
        this.rrPeakDao.update(rRPeak);
    }

    @Override // com.huami.health.afppg.data.local.IRRPeakDB
    public void updateSyncedState(@NotNull String userId, int source, long timestamp) {
        for (RRPeak rRPeak : b(userId, timestamp, source)) {
            rRPeak.setSynced(true);
            this.rrPeakDao.update(rRPeak);
        }
    }

    @Override // com.huami.health.afppg.data.local.IRRPeakDB
    public void clearData(@NotNull String userId, int source) {
        this.rrPeakDao.deleteBySource(userId, source);
    }
}
