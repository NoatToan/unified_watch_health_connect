package com.huami.snore.core.repo;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import com.huami.android.vo.Resource;
import com.huami.snore.core.vo.VoiceListingModel;
import com.huami.snore.core.vo.VoiceShowInfo;
import com.huami.tools.analytics.DbUtils;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\u001d\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H&J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H&J#\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0017H¦@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00130\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/huami/snore/core/repo/IVoiceRecorderRepo;", "", "Ljava/util/Date;", "startTime", "endTime", "Lcom/huami/snore/core/vo/VoiceListingModel;", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "loadRecorderData", "Landroidx/lifecycle/LiveData;", "", "getRecorderCount", "info", "", "deleteSnoreInfo", "(Lcom/huami/snore/core/vo/VoiceShowInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "deleteLocalWithinTimeData", "(Landroid/content/Context;Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/android/vo/Resource;", "", "uploadSnoreInfo", "downLoadFile", "", "syncSnoreData", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startDate", "endDate", "Lkotlinx/coroutines/flow/Flow;", "", "deleteWithinTimeData", "snore_release"}, k = 1, mv = {1, 5, 1})
public interface IVoiceRecorderRepo {
    @Nullable
    Object deleteLocalWithinTimeData(@NotNull Context context, @NotNull Date date, @NotNull Date date2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object deleteSnoreInfo(@Nullable VoiceShowInfo voiceShowInfo, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    Flow<Resource<Boolean>> deleteWithinTimeData(@NotNull Context context, @NotNull Date startDate, @NotNull Date endDate);

    @NotNull
    LiveData<Resource<String>> downLoadFile(@Nullable VoiceShowInfo info);

    @Nullable
    LiveData<Integer> getRecorderCount(@Nullable Date startTime, @Nullable Date endTime);

    @Nullable
    VoiceListingModel<VoiceShowInfo> loadRecorderData(@Nullable Date startTime, @Nullable Date endTime);

    @Nullable
    Object syncSnoreData(long j, long j2, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    LiveData<Resource<String>> uploadSnoreInfo(@NotNull Context context, @Nullable VoiceShowInfo info);
}
