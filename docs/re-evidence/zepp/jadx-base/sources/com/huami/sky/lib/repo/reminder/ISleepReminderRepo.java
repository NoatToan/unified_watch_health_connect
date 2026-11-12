package com.huami.sky.lib.repo.reminder;

import com.huami.sky.lib.entity.SleepReminderInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/huami/sky/lib/repo/reminder/ISleepReminderRepo;", "", "Lcom/huami/sky/lib/entity/SleepReminderInfo;", "sleepReminderInfo", "", "saveSleepReminderToServer", "(Lcom/huami/sky/lib/entity/SleepReminderInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSleepReminderInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface ISleepReminderRepo {
    @Nullable
    Object getSleepReminderInfo(@NotNull Continuation<? super SleepReminderInfo> continuation);

    @Nullable
    Object saveSleepReminderToServer(@NotNull SleepReminderInfo sleepReminderInfo, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object sleepReminderInfo(@NotNull Continuation<? super Flow<SleepReminderInfo>> continuation);
}
