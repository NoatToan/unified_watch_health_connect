package com.huami.snore.core.repo;

import androidx.p008lifecycle.LiveData;
import com.huami.snore.core.db.entity.VoiceRecorderEntity;
import com.huami.snore.core.vo.VoiceListingModel;
import com.huami.snore.core.vo.VoiceShowInfo;
import com.tekartik.sqflite.Constant;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J$\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u001d\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\tH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/huami/snore/core/repo/LocalVoiceDataApi;", "", "Ljava/util/Date;", "startTime", "endTime", "Lcom/huami/snore/core/vo/VoiceListingModel;", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "loadRecorderData", "", "Lcom/huami/snore/core/db/entity/VoiceRecorderEntity;", "loadWithinTimeDataList", "Landroidx/lifecycle/LiveData;", "", "getRecorderCount", "", "filePath", "deleteByFilePath", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findByStartTime", "", "deleteWithinTimeData", "(Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entity", Constant.METHOD_INSERT, "update", "snore_release"}, k = 1, mv = {1, 5, 1})
public interface LocalVoiceDataApi {
    @Nullable
    Object deleteByFilePath(@Nullable String str, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object deleteWithinTimeData(@NotNull Date date, @NotNull Date date2, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    List<VoiceRecorderEntity> findByStartTime(@Nullable Date startTime);

    @Nullable
    LiveData<Integer> getRecorderCount(@Nullable Date startTime, @Nullable Date endTime);

    void insert(@NotNull List<VoiceRecorderEntity> entity);

    @Nullable
    VoiceListingModel<VoiceShowInfo> loadRecorderData(@Nullable Date startTime, @Nullable Date endTime);

    @NotNull
    List<VoiceRecorderEntity> loadWithinTimeDataList(@NotNull Date startTime, @NotNull Date endTime);

    void update(@NotNull VoiceRecorderEntity entity);
}
