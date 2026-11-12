package com.mi.health.exercise.widget;

import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.account.user.DallyGoalItem;
import com.xiaomi.fitness.account.user.UserInfoManager;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¨\u0006\n"}, d2 = {"Lcom/mi/health/exercise/widget/GoalHelper;", "", "<init>", "()V", "getGoalValue", "", "type", FitnessPersistKey.Rainbow, "", "Lcom/xiaomi/fitness/account/user/DallyGoalItem;", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GoalHelper {

    @NotNull
    public static final GoalHelper INSTANCE = new GoalHelper();

    private GoalHelper() {
    }

    public final int getGoalValue(int type, @Nullable List<DallyGoalItem> goal) {
        if (goal != null) {
            int size = goal.size();
            for (int i = 0; i < size; i++) {
                if (goal.get(i).getField() == type) {
                    return goal.get(i).getTarget();
                }
            }
        }
        return UserInfoManager.getUserProfile$default(new UserInfoManager(), false, 1, null).getDEFAULT_TARGET()[type - 1];
    }
}
