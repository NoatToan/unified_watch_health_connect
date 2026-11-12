package com.huami.sleep.sleepedit.repo;

import com.facebook.appevents.UserDataStore;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/sleep/sleepedit/repo/ISleepEditRepo;", "", "", "userId", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "slpInfo", "", UserDataStore.STATE, "sp", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "dat", "", "saveEditSleep", "(Ljava/lang/String;Lcom/xiaomi/hm/health/dataprocess/SleepInfo;JJLcom/xiaomi/hm/health/dataprocess/SportDay;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sleep_release"}, k = 1, mv = {1, 5, 1})
public interface ISleepEditRepo {
    @Nullable
    Object saveEditSleep(@NotNull String str, @NotNull SleepInfo sleepInfo, long j, long j2, @NotNull SportDay sportDay, @NotNull Continuation<? super Unit> continuation);
}
