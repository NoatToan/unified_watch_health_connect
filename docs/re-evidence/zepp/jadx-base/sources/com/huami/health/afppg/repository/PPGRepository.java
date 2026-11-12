package com.huami.health.afppg.repository;

import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.local.bean.HREventData;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.huami.health.afppg.data.remote.dto.HealthEvents;
import com.huami.health.afppg.data.remote.dto.RawUrlResponse;
import com.huami.health.afppg.data.remote.dto.UserEvents;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H&J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H&J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\rH&J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0013H&J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&J \u0010\u001a\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0013H&J\u0010\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013H&J\u0018\u0010#\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H&J\u0010\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\rH&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010&\u001a\u00020\rH&J\u0016\u0010(\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H&J\u0016\u0010)\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H&J\u0016\u0010%\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H&J\b\u0010*\u001a\u00020\tH&J\u0010\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H&J\u0016\u0010-\u001a\u00020\t2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020+0\u0002H&J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u0002H&J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0013H&J$\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0002032\u0006\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0013H&J\u0016\u00106\u001a\u00020\t2\f\u00105\u001a\b\u0012\u0004\u0012\u00020+0\u0002H&J\u0018\u0010:\u001a\u0002092\u0006\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u0013H&J&\u0010>\u001a\b\u0012\u0004\u0012\u00020+0\u00022\u0006\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u0013H&J!\u0010A\u001a\u0002092\b\u0010?\u001a\u0004\u0018\u00010\r2\u0006\u0010@\u001a\u00020\u000bH&¢\u0006\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lcom/huami/health/afppg/repository/PPGRepository;", "", "", "Lcom/huami/health/afppg/data/local/bean/RRPeak;", "rrPeak", "", "insertNewRRData", "Lcom/huami/health/afppg/data/local/bean/AFibData;", "aFibList", "", "insertNewAFibData", "", "source", "", "timestamp", "deleteRR", "Lcom/huami/health/afppg/data/remote/dto/HealthEvents$EventItem;", "list", "postEvents", "", "getRRServerPath", "data", "filePath", "uploadRRPeak", "updateRRSyncedState", "serverPath", "updateRRRawPath", "getUnsyncedRRData", "fileName", "type", "Lcom/huami/health/afppg/data/remote/dto/RawUrlResponse;", "fetchRRRawUrl", "url", "Ljava/io/File;", "file", "uploadRRRawFile", "currentTime", "deleteAFData", "time", "getUnsyncedAFData", "postAFResult", "updateAFibSyncedState", "clearRRPeakData", "Lcom/huami/health/afppg/data/local/bean/HREventData;", "hrEvent", "insertHrEventData", "hrEvents", "getUnsyncedHrData", "fromTimestamp", "toTimestamp", "getAFibDataData", "Lkotlinx/coroutines/flow/Flow;", "getAFibDataDataFlow", "events", "updateHrSyncState", "timeFrom", "timeTo", "Lcom/huami/health/afppg/data/remote/dto/UserEvents;", "getAfibFromServer", "fromTime", "toTime", "subType", "queryHrEventsData", "timeNext", "limit", "getHREventFromServer", "(Ljava/lang/Long;I)Lcom/huami/health/afppg/data/remote/dto/UserEvents;", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public interface PPGRepository {
    void clearRRPeakData();

    void deleteAFData(long currentTime);

    void deleteAFData(@NotNull List<Long> timestamp);

    void deleteRR(int source, long timestamp);

    @NotNull
    RawUrlResponse fetchRRRawUrl(@NotNull String fileName, @NotNull String type);

    @NotNull
    List<AFibData> getAFibDataData(@NotNull String fromTimestamp, @NotNull String toTimestamp);

    @NotNull
    Flow<List<AFibData>> getAFibDataDataFlow(@NotNull String fromTimestamp, @NotNull String toTimestamp);

    @NotNull
    UserEvents getAfibFromServer(@NotNull String timeFrom, @NotNull String timeTo);

    @NotNull
    UserEvents getHREventFromServer(@Nullable Long timeNext, int limit);

    @Nullable
    String getRRServerPath(long timestamp);

    @NotNull
    List<AFibData> getUnsyncedAFData(long time);

    @NotNull
    List<HREventData> getUnsyncedHrData();

    @Nullable
    List<RRPeak> getUnsyncedRRData();

    void insertHrEventData(@NotNull HREventData hrEvent);

    void insertHrEventData(@NotNull List<HREventData> hrEvents);

    void insertNewAFibData(@NotNull List<AFibData> aFibList);

    boolean insertNewRRData(@NotNull List<RRPeak> rrPeak);

    boolean postAFResult(@NotNull List<AFibData> list);

    boolean postEvents(@NotNull List<HealthEvents.EventItem> list);

    @NotNull
    List<HREventData> queryHrEventsData(@NotNull String fromTime, @NotNull String toTime, @NotNull String subType);

    void updateAFibSyncedState(@NotNull List<Long> timestamp);

    void updateHrSyncState(@NotNull List<HREventData> events);

    void updateRRRawPath(int source, long timestamp, @NotNull String serverPath);

    void updateRRSyncedState(int source, long timestamp);

    boolean uploadRRPeak(@NotNull RRPeak data, @NotNull String filePath);

    boolean uploadRRRawFile(@NotNull String url, @NotNull File file);
}
