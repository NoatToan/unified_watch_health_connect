package com.xiaomi.fitness.habit.utils;

import com.example.habit.export.Habit;
import com.example.habit.export.HabitBean;
import com.xiaomi.fitness.habit.manager.HabitHelper;
import com.xiaomi.fitness.habit.utils.HabitUtils;
import defpackage.hfb;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/habit/utils/HabitUtils;", "", "<init>", "()V", "judgeSync", "", "habits", "Ljava/util/ArrayList;", "Lcom/example/habit/export/HabitBean;", "oldList", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitUtils {

    @NotNull
    public static final HabitUtils INSTANCE = new HabitUtils();

    private HabitUtils() {
    }

    @JvmStatic
    public static final void judgeSync(@NotNull ArrayList<HabitBean> habits, @NotNull ArrayList<HabitBean> oldList) {
        Intrinsics.checkNotNullParameter(habits, "habits");
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        if (habits.size() == oldList.size()) {
            if ((!habits.isEmpty()) && (!oldList.isEmpty())) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(habits, new Comparator() { // from class: wjb
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return HabitUtils.judgeSync$lambda$0((HabitBean) obj, (HabitBean) obj2);
                    }
                });
                int size = habits.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        HabitBean habitBean = habits.get(i);
                        Intrinsics.checkNotNullExpressionValue(habitBean, "get(...)");
                        HabitBean habitBean2 = habitBean;
                        HabitBean habitBean3 = oldList.get(i);
                        Intrinsics.checkNotNullExpressionValue(habitBean3, "get(...)");
                        HabitBean habitBean4 = habitBean3;
                        if (habitBean4.typeId != habitBean2.typeId || habitBean4.updateTime != habitBean2.updateTime) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                hfb.d("habit的本地类型和服务端类型不一致， 或者更新时间不一致，需要做更新同步");
            } else {
                HabitHelper.INSTANCE.clearCalendars();
                hfb.d("服务为空");
            }
            hfb.d("habit服务和本地比较数据一致");
            return;
        }
        hfb.d("habit服务器和本地size不一致需要同步");
        HabitHelper.INSTANCE.saveOrUpdateCalendars(habits);
        hfb.d("habit服务和本地比较数据不一致，更新同步");
        ArrayList<Habit> arrayList = new ArrayList<>();
        int size2 = habits.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(habits.get(i2).convert2DB(false));
        }
        HabitHelper.INSTANCE.clearAndAddAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int judgeSync$lambda$0(HabitBean habitBean, HabitBean habitBean2) {
        Intrinsics.checkNotNull(habitBean);
        int i = habitBean.type;
        Intrinsics.checkNotNull(habitBean2);
        return i - habitBean2.type;
    }
}
