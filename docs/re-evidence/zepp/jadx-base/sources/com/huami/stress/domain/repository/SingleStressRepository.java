package com.huami.stress.domain.repository;

import com.huami.stress.domain.model.SingleStress;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005J\u0010\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\fH&J#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013Ju\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u001c\b\u0002\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH¦@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010\"\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b$\u0010#J!\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001b\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u001d2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/huami/stress/domain/repository/SingleStressRepository;", "", "", "Lcom/huami/stress/domain/model/SingleStress;", "getSingleStressListFromLocal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "start", "end", "getSingleStressListFromLocalBetweenStamp", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestSingleStressFromLocal", "Lkotlinx/coroutines/flow/Flow;", "getLatestSingleStressFromLocalFlow", "", "userId", "timestamp", "", "deleteSingleStress", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deviceType", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "Ljava/util/Calendar;", "calendar", "Lkotlin/Function2;", "", "saveSyncTime", "Lkotlin/Pair;", "saveSingleStressFromDevice", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSingleStressFromServer", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncSingleStressToServer", "getSingleStressListByDay", "(Ljava/util/Calendar;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "list", "saveSingleStressToLocal", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 5, 1})
public interface SingleStressRepository {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object saveSingleStressFromDevice$default(SingleStressRepository singleStressRepository, String str, int i, int i2, String str2, String str3, String str4, Calendar calendar, Function2 function2, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return singleStressRepository.saveSingleStressFromDevice(str, i, i2, str2, str3, str4, calendar, (i3 & 128) != 0 ? null : function2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveSingleStressFromDevice");
        }
    }

    @Nullable
    Object deleteSingleStress(@NotNull String str, long j, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object getLatestSingleStressFromLocal(@NotNull Continuation<? super SingleStress> continuation);

    @NotNull
    Flow<SingleStress> getLatestSingleStressFromLocalFlow();

    @Nullable
    Object getSingleStressListByDay(@NotNull Calendar calendar, @NotNull Continuation<? super List<SingleStress>> continuation);

    @Nullable
    Object getSingleStressListFromLocal(@NotNull Continuation<? super List<SingleStress>> continuation);

    @Nullable
    Object getSingleStressListFromLocalBetweenStamp(long j, long j2, @NotNull Continuation<? super List<SingleStress>> continuation);

    @Nullable
    Object saveSingleStressFromDevice(@NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Calendar calendar, @Nullable Function2<? super Long, ? super Boolean, Unit> function2, @NotNull Continuation<? super Pair<Boolean, Long>> continuation);

    @Nullable
    Object saveSingleStressFromServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object saveSingleStressToLocal(@NotNull List<SingleStress> list, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object syncSingleStressToServer(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);
}
