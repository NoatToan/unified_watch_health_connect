package com.huami.assistant.ui.v2.datasource;

import androidx.annotation.WorkerThread;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.huami.assistant.ui.v2.model.ScheduleModel;
import com.huami.message.utils.MessageRecorderEventHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H'J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0017J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\nH'J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\u0010\u001a\u00020\u0002H\u0017¨\u0006\u0011"}, d2 = {"Lcom/huami/assistant/ui/v2/datasource/ScheduleRemoteDataSource;", "", "", "from", "to", "Lcom/huami/assistant/ui/v2/datasource/RemoteResult;", "", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", RemoteConfigComponent.FETCH_FILE_NAME, "scheduleModel", "", "deviceSource", "", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "scheduleList", "delete", "scheduleId", "assistant_release"}, k = 1, mv = {1, 5, 1})
public interface ScheduleRemoteDataSource {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @WorkerThread
        @NotNull
        public static RemoteResult<Boolean> delete(@NotNull ScheduleRemoteDataSource scheduleRemoteDataSource, long j) {
            return scheduleRemoteDataSource.delete(CollectionsKt__CollectionsKt.arrayListOf(Long.valueOf(j)));
        }

        @WorkerThread
        @NotNull
        public static RemoteResult<Boolean> push(@NotNull ScheduleRemoteDataSource scheduleRemoteDataSource, @NotNull ScheduleModel scheduleModel, int i) {
            return scheduleRemoteDataSource.push(CollectionsKt__CollectionsKt.arrayListOf(scheduleModel), i);
        }
    }

    @WorkerThread
    @NotNull
    RemoteResult<Boolean> delete(long scheduleId);

    @WorkerThread
    @NotNull
    RemoteResult<Boolean> delete(@NotNull List<Long> scheduleList);

    @WorkerThread
    @NotNull
    RemoteResult<List<ScheduleModel>> fetch(long from, long to);

    @WorkerThread
    @NotNull
    RemoteResult<Boolean> push(@NotNull ScheduleModel scheduleModel, int deviceSource);

    @WorkerThread
    @NotNull
    RemoteResult<Boolean> push(@NotNull List<ScheduleModel> scheduleList, int deviceSource);
}
