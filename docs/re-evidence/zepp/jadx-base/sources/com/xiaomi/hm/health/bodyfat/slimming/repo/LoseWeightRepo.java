package com.xiaomi.hm.health.bodyfat.slimming.repo;

import com.xiaomi.hm.health.databases.model.WeightInfos;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0015\u0010\r\u001a\u0004\u0018\u00010\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepo;", "", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "searchCurrentUserWeightInfos", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightPlan;", "loseWeightPlan", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/PostResponseCallback;", "postResponseCallback", "", "saveLoseWeightPlan", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "loseWeightWeightInfo", "saveLoseWeightWeightInfo", "getLoseWeightPlanObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoseWeightWeightInfoObject", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public interface LoseWeightRepo {
    @Nullable
    Object getLoseWeightPlanObject(@NotNull Continuation<? super LoseWeightPlan> continuation);

    @Nullable
    Object getLoseWeightWeightInfoObject(@NotNull Continuation<? super LoseWeightWeightInfo> continuation);

    void saveLoseWeightPlan(@NotNull LoseWeightPlan loseWeightPlan, @NotNull PostResponseCallback postResponseCallback);

    void saveLoseWeightWeightInfo(@NotNull LoseWeightWeightInfo loseWeightWeightInfo, @NotNull PostResponseCallback postResponseCallback);

    @Nullable
    WeightInfos searchCurrentUserWeightInfos();
}
