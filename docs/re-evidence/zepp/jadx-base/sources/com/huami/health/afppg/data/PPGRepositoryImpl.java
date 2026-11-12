package com.huami.health.afppg.data;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.local.bean.HREventData;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.huami.health.afppg.data.local.dao.AFibDao;
import com.huami.health.afppg.data.local.dao.HREventDao;
import com.huami.health.afppg.data.local.dao.RRPeakDao;
import com.huami.health.afppg.data.local.db.AFibDB;
import com.huami.health.afppg.data.local.db.HREventDB;
import com.huami.health.afppg.data.local.db.RRPeakDB;
import com.huami.health.afppg.data.remote.AfPpgWebApi;
import com.huami.health.afppg.data.remote.dto.HealthEvents;
import com.huami.health.afppg.data.remote.dto.RawUrlResponse;
import com.huami.health.afppg.data.remote.dto.UserEvents;
import com.huami.health.afppg.repository.PPGRepository;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 _2\u00020\u0001:\u0001_B/\u0012\u0006\u0010E\u001a\u00020\u000b\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010Z\u001a\u00020Y\u0012\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0018\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J \u0010\u001f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0010\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0018\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0016J\u0018\u0010(\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0013H\u0016J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010+\u001a\u00020\u0013H\u0016J\u0016\u0010-\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\u0016\u0010.\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H\u0016J\u0016\u0010*\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H\u0016J\u0016\u00101\u001a\u00020\t2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0002H\u0016J\b\u00102\u001a\u00020\tH\u0016J\u0010\u00104\u001a\u00020\t2\u0006\u00103\u001a\u00020/H\u0016J\u0016\u00104\u001a\u00020\t2\f\u00105\u001a\b\u0012\u0004\u0012\u00020/0\u0002H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020/0\u0002H\u0016J\u0018\u0010:\u001a\u0002092\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bH\u0016J!\u0010=\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u00010\u00132\u0006\u0010<\u001a\u00020\u0011H\u0016¢\u0006\u0004\b=\u0010>J&\u0010B\u001a\b\u0012\u0004\u0012\u00020/0\u00022\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000bH\u0016R\u0016\u0010E\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001d\u0010N\u001a\u00020J8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bK\u0010MR\u001d\u0010R\u001a\u00020O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bC\u0010QR\u001d\u0010V\u001a\u00020S8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010L\u001a\u0004\bG\u0010U¨\u0006`"}, d2 = {"Lcom/huami/health/afppg/data/PPGRepositoryImpl;", "Lcom/huami/health/afppg/repository/PPGRepository;", "", "Lcom/huami/health/afppg/data/local/bean/RRPeak;", "rrPeak", "", "insertNewRRData", "Lcom/huami/health/afppg/data/local/bean/AFibData;", "aFibList", "", "insertNewAFibData", "", "fromTimestamp", "toTimestamp", "getAFibDataData", "Lkotlinx/coroutines/flow/Flow;", "getAFibDataDataFlow", "", "source", "", "timestamp", "deleteRR", "Lcom/huami/health/afppg/data/remote/dto/HealthEvents$EventItem;", "list", "postEvents", "getRRServerPath", "data", "filePath", "uploadRRPeak", "updateRRSyncedState", "serverPath", "updateRRRawPath", "getUnsyncedRRData", "fileName", "type", "Lcom/huami/health/afppg/data/remote/dto/RawUrlResponse;", "fetchRRRawUrl", "url", "Ljava/io/File;", "file", "uploadRRRawFile", "currentTime", "deleteAFData", "time", "getUnsyncedAFData", "postAFResult", "updateAFibSyncedState", "Lcom/huami/health/afppg/data/local/bean/HREventData;", "events", "updateHrSyncState", "clearRRPeakData", "hrEvent", "insertHrEventData", "hrEvents", "getUnsyncedHrData", "timeFrom", "timeTo", "Lcom/huami/health/afppg/data/remote/dto/UserEvents;", "getAfibFromServer", "timeNext", "limit", "getHREventFromServer", "(Ljava/lang/Long;I)Lcom/huami/health/afppg/data/remote/dto/UserEvents;", "fromTime", "toTime", "subType", "queryHrEventsData", "a", "Ljava/lang/String;", "userId", "Lcom/huami/health/afppg/data/remote/AfPpgWebApi;", "b", "Lcom/huami/health/afppg/data/remote/AfPpgWebApi;", "ppgApi", "Lcom/huami/health/afppg/data/local/db/RRPeakDB;", "c", "Lkotlin/Lazy;", "()Lcom/huami/health/afppg/data/local/db/RRPeakDB;", "rrPeakDB", "Lcom/huami/health/afppg/data/local/db/AFibDB;", GoogleApiAvailabilityLight.a, "()Lcom/huami/health/afppg/data/local/db/AFibDB;", "aFibDB", "Lcom/huami/health/afppg/data/local/db/HREventDB;", "e", "()Lcom/huami/health/afppg/data/local/db/HREventDB;", "hrEventDB", "Lcom/huami/health/afppg/data/local/dao/RRPeakDao;", "rrPeakDao", "Lcom/huami/health/afppg/data/local/dao/AFibDao;", "aFibDao", "Lcom/huami/health/afppg/data/local/dao/HREventDao;", "hrEventDao", "<init>", "(Ljava/lang/String;Lcom/huami/health/afppg/data/remote/AfPpgWebApi;Lcom/huami/health/afppg/data/local/dao/RRPeakDao;Lcom/huami/health/afppg/data/local/dao/AFibDao;Lcom/huami/health/afppg/data/local/dao/HREventDao;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class PPGRepositoryImpl implements PPGRepository {

    @NotNull
    private static final String f = "af_ppg_PPGRepository";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AfPpgWebApi ppgApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy rrPeakDB;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy aFibDB;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrEventDB;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/health/afppg/data/local/db/AFibDB;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AFibDB> {
        public final /* synthetic */ AFibDao a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AFibDao aFibDao) {
            super(0);
            this.a = aFibDao;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AFibDB invoke() {
            return new AFibDB(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Long> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Long> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("deleteAFData: ", Integer.valueOf(this.a.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/health/afppg/data/local/db/HREventDB;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<HREventDB> {
        public final /* synthetic */ HREventDao a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HREventDao hREventDao) {
            super(0);
            this.a = hREventDao;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HREventDB invoke() {
            return new HREventDB(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/health/afppg/data/local/db/RRPeakDB;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<RRPeakDB> {
        public final /* synthetic */ RRPeakDao a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RRPeakDao rRPeakDao) {
            super(0);
            this.a = rRPeakDao;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RRPeakDB invoke() {
            return new RRPeakDB(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Long> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<Long> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("updateAFibSyncedState: ", Integer.valueOf(this.a.size()));
        }
    }

    public PPGRepositoryImpl(@NotNull String str, @NotNull AfPpgWebApi afPpgWebApi, @NotNull RRPeakDao rRPeakDao, @NotNull AFibDao aFibDao, @NotNull HREventDao hREventDao) {
        this.userId = str;
        this.ppgApi = afPpgWebApi;
        this.rrPeakDB = LazyKt__LazyJVMKt.lazy(new d(rRPeakDao));
        this.aFibDB = LazyKt__LazyJVMKt.lazy(new a(aFibDao));
        this.hrEventDB = LazyKt__LazyJVMKt.lazy(new c(hREventDao));
    }

    private final AFibDB a() {
        return (AFibDB) this.aFibDB.getValue();
    }

    private final HREventDB b() {
        return (HREventDB) this.hrEventDB.getValue();
    }

    private final RRPeakDB c() {
        return (RRPeakDB) this.rrPeakDB.getValue();
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public void clearRRPeakData() {
        c().clearData(this.userId);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public void deleteAFData(long currentTime) {
        a().deleteData(this.userId, currentTime);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public void deleteRR(int source, long timestamp) {
        c().deleteData(this.userId, source, timestamp);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    @NotNull
    public RawUrlResponse fetchRRRawUrl(@NotNull String fileName, @NotNull String type) {
        return this.ppgApi.fetchRawUrl(fileName, type);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    @NotNull
    public List<AFibData> getAFibDataData(@NotNull String fromTimestamp, @NotNull String toTimestamp) {
        return a().getAFData(this.userId, fromTimestamp, toTimestamp);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    @NotNull
    public Flow<List<AFibData>> getAFibDataDataFlow(@NotNull String fromTimestamp, @NotNull String toTimestamp) {
        return a().getAFDataFLow(this.userId, fromTimestamp, toTimestamp);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    @NotNull
    public UserEvents getAfibFromServer(@NotNull String timeFrom, @NotNull String timeTo) {
        return this.ppgApi.getAFibEventFromServer(timeFrom, timeTo);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    @NotNull
    public UserEvents getHREventFromServer(@Nullable Long timeNext, int limit) {
        return this.ppgApi.getHREventFromServer(timeNext, limit);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    @Nullable
    public String getRRServerPath(long timestamp) {
        return c().getServerPath(this.userId, timestamp);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    @NotNull
    public List<AFibData> getUnsyncedAFData(long time) {
        return a().getUnsyncedData(this.userId, time);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    @NotNull
    public List<HREventData> getUnsyncedHrData() {
        return b().getUnsyncedData();
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    @Nullable
    public List<RRPeak> getUnsyncedRRData() {
        return c().getUnsyncedData(this.userId);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public void insertHrEventData(@NotNull HREventData hrEvent) {
        b().insert(hrEvent);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public void insertNewAFibData(@NotNull List<AFibData> aFibList) {
        a().insertNewData(this.userId, aFibList);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public boolean insertNewRRData(@NotNull List<RRPeak> rrPeak) {
        return c().insertNewData(this.userId, rrPeak);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public boolean postAFResult(@NotNull List<AFibData> list) {
        return this.ppgApi.postAFResult(list);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public boolean postEvents(@NotNull List<HealthEvents.EventItem> list) {
        return this.ppgApi.postEvents(list);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    @NotNull
    public List<HREventData> queryHrEventsData(@NotNull String fromTime, @NotNull String toTime, @NotNull String subType) {
        return b().queryDatas(fromTime, toTime, subType);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public void updateAFibSyncedState(@NotNull List<Long> timestamp) {
        HMLog.info(f, new e(timestamp));
        a().updateSyncedState(this.userId, timestamp);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public void updateHrSyncState(@NotNull List<HREventData> events) {
        b().updateSyncState(events);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public void updateRRRawPath(int source, long timestamp, @NotNull String serverPath) {
        c().updateRawPath(this.userId, source, timestamp, serverPath);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public void updateRRSyncedState(int source, long timestamp) {
        c().updateSyncedState(this.userId, source, timestamp);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public boolean uploadRRPeak(@NotNull RRPeak data, @NotNull String filePath) {
        return this.ppgApi.uploadRRPeak(data, filePath);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public boolean uploadRRRawFile(@NotNull String url, @NotNull File file) {
        return this.ppgApi.uploadRRRawFile(url, file);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public void deleteAFData(@NotNull List<Long> timestamp) {
        HMLog.info(f, new b(timestamp));
        a().deleteData(this.userId, timestamp);
    }

    @Override // com.huami.health.afppg.repository.PPGRepository
    public void insertHrEventData(@NotNull List<HREventData> hrEvents) {
        b().insert(hrEvents);
    }
}
