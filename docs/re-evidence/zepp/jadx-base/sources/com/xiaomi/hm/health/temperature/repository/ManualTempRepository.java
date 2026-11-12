package com.xiaomi.hm.health.temperature.repository;

import com.xiaomi.hm.health.temperature.model.Temperature;
import com.xiaomi.hm.health.temperature.remote.bean.ManualTempBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/temperature/repository/ManualTempRepository;", "", "", "userId", "", "fetchManualTempFromServer", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "start", "end", "", "Lcom/xiaomi/hm/health/temperature/model/Temperature;", "getManualTempBetweenTime", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/temperature/remote/bean/ManualTempBean;", "data", "", "uploadManualTemp", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanManualTempDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface ManualTempRepository {
    @Nullable
    Object cleanManualTempDb(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object fetchManualTempFromServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getManualTempBetweenTime(long j, long j2, @NotNull Continuation<? super List<Temperature>> continuation);

    @Nullable
    Object uploadManualTemp(@NotNull List<ManualTempBean> list, @NotNull Continuation<? super Boolean> continuation);
}
