package com.huami.sky.lib.repo.weekplan;

import com.huami.sky.lib.cache.SkyPlayCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/sky/lib/repo/weekplan/WeekPlanHintRepoImpl;", "Lcom/huami/sky/lib/repo/weekplan/IWeekPlanHintRepo;", "", "dateString", "Lcom/huami/sky/lib/repo/weekplan/WeekPlanHint;", "weekPlanHint", "", "saveLastRes", "Lcom/huami/sky/lib/repo/weekplan/WeekPlanHintDO;", "getLastRes", "<init>", "()V", "Companion", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class WeekPlanHintRepoImpl implements IWeekPlanHintRepo {

    @NotNull
    private static final String a = "WEEKPLAN_HINT_EMPTY_TAG";
    private static final int b = -1;

    @Override // com.huami.sky.lib.repo.weekplan.IWeekPlanHintRepo
    @Nullable
    public WeekPlanHintDO getLastRes(@NotNull String dateString) {
        WeekPlanHintPO weekPlanHintPO;
        SkyPlayCache.Companion companion = SkyPlayCache.INSTANCE;
        String stringWithUserId = companion.getInstance().getStringWithUserId(IWeekPlanHintRepoKt.WEEK_PLAN_HINT_LAST_DATE, a);
        if (Intrinsics.areEqual(stringWithUserId, a) || (weekPlanHintPO = (WeekPlanHintPO) companion.getInstance().getParcelabelWithUserId(IWeekPlanHintRepoKt.WEEK_PLAN_HINT_LAST_RES, WeekPlanHintPO.class)) == null) {
            return null;
        }
        return new WeekPlanHintDO(weekPlanHintPO, Intrinsics.areEqual(dateString, stringWithUserId));
    }

    @Override // com.huami.sky.lib.repo.weekplan.IWeekPlanHintRepo
    public void saveLastRes(@NotNull String dateString, @NotNull WeekPlanHint weekPlanHint) {
        SkyPlayCache.Companion companion = SkyPlayCache.INSTANCE;
        companion.getInstance().saveStringWithUserId(IWeekPlanHintRepoKt.WEEK_PLAN_HINT_LAST_DATE, dateString);
        if (weekPlanHint instanceof WeekPlanStr) {
            companion.getInstance().saveParcelableWithUserId(IWeekPlanHintRepoKt.WEEK_PLAN_HINT_LAST_RES, new WeekPlanHintPO(1, ((WeekPlanStr) weekPlanHint).getStrId(), -1));
            return;
        }
        if (weekPlanHint instanceof WeekPlanIntHint) {
            WeekPlanIntHint weekPlanIntHint = (WeekPlanIntHint) weekPlanHint;
            companion.getInstance().saveParcelableWithUserId(IWeekPlanHintRepoKt.WEEK_PLAN_HINT_LAST_RES, new WeekPlanHintPO(2, weekPlanIntHint.getStrId(), weekPlanIntHint.getValue()));
        } else if (weekPlanHint instanceof WeekPlanStrHint) {
            WeekPlanStrHint weekPlanStrHint = (WeekPlanStrHint) weekPlanHint;
            companion.getInstance().saveParcelableWithUserId(IWeekPlanHintRepoKt.WEEK_PLAN_HINT_LAST_RES, new WeekPlanHintPO(3, weekPlanStrHint.getStrId(), weekPlanStrHint.getValue()));
        }
    }
}
