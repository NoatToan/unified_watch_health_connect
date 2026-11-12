package com.huami.stress.domain.repository;

import com.huami.stress.domain.model.AllDayStress;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H&J\u001d\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010Ju\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u001c\b\u0002\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bH¦@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b&\u0010#J\u001b\u0010'\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b'\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/huami/stress/domain/repository/AllDayStressRepository;", "", "Lcom/huami/stress/domain/model/AllDayStress;", "getTodayAllDayStressFromLocal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestAllDayStressFromLocal", "Lkotlinx/coroutines/flow/Flow;", "getLatestAllDayStressFromLocalFlow", "", "timestamp", "getAllDayStressFromLocalByTimestamp", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "end", "", "getAllDayStressFromLocalBetweenStamp", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "userId", "", "deviceType", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "Ljava/util/Calendar;", "calendar", "Lkotlin/Function2;", "", "", "saveSyncTime", "Lkotlin/Pair;", "saveAllDayStressFromDevice", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLatestAllDayStressFromServer", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAllDayStressFromServerByTime", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAllDayStressFromServer", "syncAllDayStressToServer", "domain_release"}, k = 1, mv = {1, 5, 1})
public interface AllDayStressRepository {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object saveAllDayStressFromDevice$default(AllDayStressRepository allDayStressRepository, String str, int i, int i2, String str2, String str3, String str4, Calendar calendar, Function2 function2, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return allDayStressRepository.saveAllDayStressFromDevice(str, i, i2, str2, str3, str4, calendar, (i3 & 128) != 0 ? null : function2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveAllDayStressFromDevice");
        }
    }

    @Nullable
    Object getAllDayStressFromLocalBetweenStamp(long j, long j2, @NotNull Continuation<? super List<AllDayStress>> continuation);

    @Nullable
    Object getAllDayStressFromLocalByTimestamp(long j, @NotNull Continuation<? super AllDayStress> continuation);

    @Nullable
    Object getLatestAllDayStressFromLocal(@NotNull Continuation<? super AllDayStress> continuation);

    @NotNull
    Flow<AllDayStress> getLatestAllDayStressFromLocalFlow();

    @Nullable
    Object getTodayAllDayStressFromLocal(@NotNull Continuation<? super AllDayStress> continuation);

    @Nullable
    Object saveAllDayStressFromDevice(@NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Calendar calendar, @Nullable Function2<? super Long, ? super Boolean, Unit> function2, @NotNull Continuation<? super Pair<Boolean, Long>> continuation);

    @Nullable
    Object saveAllDayStressFromServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object saveAllDayStressFromServerByTime(@NotNull String str, long j, @NotNull Continuation<? super AllDayStress> continuation);

    @Nullable
    Object saveLatestAllDayStressFromServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object syncAllDayStressToServer(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);
}
