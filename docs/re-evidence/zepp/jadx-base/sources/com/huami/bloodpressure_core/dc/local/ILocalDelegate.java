package com.huami.bloodpressure_core.dc.local;

import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.bodymeasurements.common.remote.friend.FriendConstants;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&J#\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH&J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH&J3\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH&J#\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0015J!\u0010\u001e\u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0007J\u001b\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\tJ\u001b\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 H¦@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J+\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J3\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020 H¦@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J+\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H¦@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J+\u0010/\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010.\u001a\u00020-H¦@ø\u0001\u0000¢\u0006\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/huami/bloodpressure_core/dc/local/ILocalDelegate;", "", "", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "list", "", Constant.METHOD_INSERT, "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", WorkoutExercises.CLEAN, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "userId", "Lkotlinx/coroutines/flow/Flow;", "getDataByUserId", "", "timeStamp", "delDataByUserId", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dateString", "getDateFlowByUserId", "getMaxTimeByUserId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTime", "endTime", "getBetweenDataFlowByUserId", "getBetweenDataByUserId", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMaxDataByUserId", "getUnuploadDataByUserId", "localList", "setListUploaded", "getAllDataByUserId", "", ParamKey.dataSource, "getDataCountByDataSource", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", FriendConstants.Param.FROM_DATE, "endDate", "getDataByDateStr", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "limit", "getUnuploadDataByDataSource", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllDataByUserIdAndSource", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isUpload", "getDataCountByUserIdAndSource", "(Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public interface ILocalDelegate {
    @Nullable
    Object clean(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object delDataByUserId(@NotNull String str, long j, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getAllDataByUserId(@NotNull Continuation<? super List<BloodPressureDbVo>> continuation);

    @Nullable
    Object getAllDataByUserIdAndSource(@NotNull String str, int i, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation);

    @Nullable
    Object getBetweenDataByUserId(@NotNull String str, long j, long j2, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation);

    @NotNull
    Flow<List<BloodPressureDbVo>> getBetweenDataFlowByUserId(@NotNull String userId, long startTime, long endTime);

    @Nullable
    Object getDataByDateStr(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation);

    @NotNull
    Flow<List<BloodPressureDbVo>> getDataByUserId(@NotNull String userId);

    @Nullable
    Object getDataCountByDataSource(int i, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getDataCountByUserIdAndSource(@NotNull String str, int i, boolean z, @NotNull Continuation<? super Long> continuation);

    @NotNull
    Flow<List<BloodPressureDbVo>> getDateFlowByUserId(@NotNull String userId, @NotNull String dateString);

    @NotNull
    Flow<BloodPressureDbVo> getMaxDataByUserId(@NotNull String userId);

    @Nullable
    Object getMaxTimeByUserId(@NotNull String str, @NotNull Continuation<? super Long> continuation);

    @Nullable
    Object getUnuploadDataByDataSource(@NotNull String str, int i, int i2, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation);

    @Deprecated(message = "需增加数据类型区分 @see getUnuploadDataByDataSource() ")
    @Nullable
    Object getUnuploadDataByUserId(@NotNull String str, @NotNull Continuation<? super List<BloodPressureDbVo>> continuation);

    @Nullable
    Object insert(@NotNull List<BloodPressureDbVo> list, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setListUploaded(@NotNull List<BloodPressureDbVo> list, @NotNull Continuation<? super Unit> continuation);
}
