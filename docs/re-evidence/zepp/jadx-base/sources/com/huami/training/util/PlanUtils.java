package com.huami.training.util;

import com.huami.training.db.po.PlanTraining;
import com.huami.training.db.po.TrainingPlan;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\f"}, d2 = {"Lcom/huami/training/util/PlanUtils;", "", "Lcom/huami/training/db/po/TrainingPlan;", "plan", "", "Lcom/huami/training/db/po/PlanTraining;", "trainings", "Lkotlin/Pair;", "", "findTodayTraining", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PlanUtils {

    @NotNull
    public static final PlanUtils INSTANCE = new PlanUtils();

    private PlanUtils() {
    }

    @NotNull
    public final Pair<Integer, PlanTraining> findTodayTraining(@NotNull TrainingPlan plan, @NotNull List<PlanTraining> trainings) {
        Date time = Calendar.getInstance().getTime();
        Date date = new Date(plan.getStartDay());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, plan.getTotalDays() - 1);
        Date time2 = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        if (DateUtilsKt.isBeforeDay(time, date)) {
            calendar2.setTime(time);
        } else {
            calendar2.setTime(date);
        }
        calendar2.set(5, (calendar2.get(5) + 1) - calendar2.get(7));
        Date time3 = calendar2.getTime();
        calendar2.clear();
        calendar2.setTime(time2);
        calendar2.set(5, (calendar2.get(5) + 7) - calendar2.get(7));
        Date time4 = calendar2.getTime();
        calendar2.clear();
        calendar2.setTime(time3);
        int i = 0;
        while (!DateUtilsKt.isAfterDay(calendar2.getTime(), time4)) {
            Date time5 = calendar2.getTime();
            calendar2.add(5, 1);
            if (!DateUtilsKt.isBeforeDay(time5, time.getTime() < date.getTime() ? time : date) && !DateUtilsKt.isAfterDay(time5, time2)) {
                int iDiffDays = DateUtilsKt.diffDays(time5, date);
                if (iDiffDays > 0) {
                    return new Pair<>(Integer.valueOf(iDiffDays), null);
                }
                if (i < trainings.size()) {
                    if (DateUtilsKt.isSameDay(time5, time)) {
                        return new Pair<>(0, trainings.get(i));
                    }
                    i++;
                }
            }
        }
        return new Pair<>(0, null);
    }
}
