package com.huami.sleep.repo;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.huami.sleep.model.BreathQualityOdInfo;
import com.huami.sleep.model.BreathQualityScoreInfo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.vo.BreathQualityDayOdVo;
import com.huami.sleep.vo.BreathQualityDayScoreVo;
import com.huami.sleep.vo.BreathQualityWMScoreVo;
import com.huami.sleep.vo.BreathQualityYearScoreVo;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011Js\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u001e\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u00132\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018H¦@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00140\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#JA\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J9\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0011J#\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/huami/sleep/repo/IBreathQualityRepo;", "", "", "userId", "", "timestamp", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "", "getDayOdiScore", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "timeStamp", "interval", "Lcom/huami/sleep/vo/BreathQualityDayOdVo;", "getOdiShowInfo", "(Landroid/content/Context;Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "", "Lcom/huami/sleep/model/BreathQualityOdInfo;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "convert", "Lkotlin/Function1;", "empty", "getOdiInfo", "(Ljava/lang/String;JJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/vo/BreathQualityDayScoreVo;", "getDayScoreShowInfo", "(Landroid/content/Context;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "from", "to", "Lcom/huami/sleep/model/BreathQualityScoreInfo;", "getBreathQualityScoreInfoList", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Lcom/huami/sleep/vo/BreathQualityWMScoreVo;", "getMWScoreShowInfo", "(Landroid/content/Context;Ljava/lang/String;Lcom/huami/sleep/statistic/dto/TimeMode;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/vo/BreathQualityYearScoreVo;", "getYearScoreShowInfo", "getLatestScoreInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface IBreathQualityRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Object getOdiInfo$default(IBreathQualityRepo iBreathQualityRepo, String str, long j, long j2, Function2 function2, Function1 function1, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return iBreathQualityRepo.getOdiInfo(str, j, j2, function2, (i & 16) != 0 ? null : function1, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOdiInfo");
        }
    }

    @Nullable
    Object getBreathQualityScoreInfoList(@NotNull String str, long j, long j2, @NotNull Continuation<? super Flow<? extends List<BreathQualityScoreInfo>>> continuation);

    @Nullable
    Object getDayOdiScore(@NotNull String str, long j, @NotNull Continuation<? super Flow<Pair<Integer, Integer>>> continuation);

    @Nullable
    Object getDayScoreShowInfo(@NotNull Context context, @NotNull String str, long j, @NotNull Continuation<? super Flow<BreathQualityDayScoreVo>> continuation);

    @Nullable
    Object getLatestScoreInfo(@NotNull String str, @NotNull Continuation<? super Flow<BreathQualityScoreInfo>> continuation);

    @Nullable
    Object getMWScoreShowInfo(@NotNull Context context, @NotNull String str, @NotNull TimeMode timeMode, long j, long j2, @NotNull Continuation<? super Flow<BreathQualityWMScoreVo>> continuation);

    @Nullable
    <T> Object getOdiInfo(@NotNull String str, long j, long j2, @NotNull Function2<? super List<BreathQualityOdInfo>, ? super SleepInfo, ? extends T> function2, @Nullable Function1<? super SleepInfo, ? extends T> function1, @NotNull Continuation<? super Flow<? extends T>> continuation);

    @Nullable
    Object getOdiShowInfo(@NotNull Context context, @NotNull String str, long j, long j2, @NotNull Continuation<? super Flow<BreathQualityDayOdVo>> continuation);

    @Nullable
    Object getYearScoreShowInfo(@NotNull Context context, @NotNull String str, long j, long j2, @NotNull Continuation<? super Flow<BreathQualityYearScoreVo>> continuation);
}
