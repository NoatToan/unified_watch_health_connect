package com.xiaomi.fitness.habit.ui;

import com.example.habit.export.Habit;
import com.example.habit.export.HabitBean;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.habit.bean.AddHabitDayBean;
import com.xiaomi.fitness.habit.bean.AddHabitResp;
import com.xiaomi.fitness.habit.manager.HabitHelper;
import com.xiaomi.fitness.habit.model.HabitModel;
import com.xiaomi.fitness.habit.request.HabitRequest;
import com.xiaomi.fitness.habit.ui.AddHabitViewModel;
import defpackage.b0j;
import defpackage.h4b;
import defpackage.hfb;
import defpackage.ns0;
import defpackage.p63;
import defpackage.t64;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J6\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0010J`\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00180\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0010J\u0018\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/habit/ui/AddHabitViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/habit/model/HabitModel;", "<init>", "()V", "habitRequest", "Lcom/xiaomi/fitness/habit/request/HabitRequest;", "getHabitRequest", "()Lcom/xiaomi/fitness/habit/request/HabitRequest;", "setHabitRequest", "(Lcom/xiaomi/fitness/habit/request/HabitRequest;)V", "habitDetail", "", "habitBean", "Lcom/example/habit/export/HabitBean;", "success", "Lkotlin/Function1;", "fail", "", "addHabit", "dayList", "", "Lcom/xiaomi/fitness/habit/bean/AddHabitDayBean;", "timeList", "Lkotlin/Pair;", "", "isSaveCalendar", "", "Lkotlin/Function0;", "isWeekdaysTrue", "weekdays", "index", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddHabitViewModel extends BaseViewModel<HabitModel> {
    public HabitRequest habitRequest;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addHabit$lambda$3(boolean z, final HabitBean habitBean, final Function0 success, AddHabitResp resp) {
        Intrinsics.checkNotNullParameter(habitBean, "$habitBean");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(resp, "resp");
        if (z) {
            try {
                HabitHelper.INSTANCE.saveCalendar(habitBean);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        habitBean.updateTime = resp.newly.updateTime;
        HabitHelper habitHelper = HabitHelper.INSTANCE;
        Habit habitConvert2DB = habitBean.convert2DB(false);
        Intrinsics.checkNotNullExpressionValue(habitConvert2DB, "convert2DB(...)");
        habitHelper.insterOrUpdate(habitConvert2DB, new Function0() { // from class: rs0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddHabitViewModel.addHabit$lambda$3$lambda$2(habitBean, success);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addHabit$lambda$3$lambda$2(HabitBean habitBean, Function0 success) {
        Intrinsics.checkNotNullParameter(habitBean, "$habitBean");
        Intrinsics.checkNotNullParameter(success, "$success");
        p63.b(new ns0(habitBean.typeId));
        success.invoke();
        hfb.d("AddHabitViewModel  insterOrUpdate  success");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addHabit$lambda$4(Function1 fail, String it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit habitDetail$lambda$0(Function1 success, HabitBean habitBean, HabitBean habitBean2) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(habitBean, "$habitBean");
        if (habitBean2 != null) {
            habitBean = habitBean2;
        }
        success.invoke(habitBean);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit habitDetail$lambda$1(Function1 fail, String it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke(it);
        return Unit.INSTANCE;
    }

    private final boolean isWeekdaysTrue(int weekdays, int index) {
        return ((weekdays >> index) & 1) == 1;
    }

    public final void addHabit(@NotNull final HabitBean habitBean, @NotNull List<AddHabitDayBean> dayList, @NotNull List<Pair<Integer, Integer>> timeList, final boolean isSaveCalendar, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(habitBean, "habitBean");
        Intrinsics.checkNotNullParameter(dayList, "dayList");
        Intrinsics.checkNotNullParameter(timeList, "timeList");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            if (dayList.get(i2).getIsSelected()) {
                i |= 1 << i2;
            }
        }
        if (i != 0) {
            if (i != 127) {
                habitBean.clockMode = 5;
                habitBean.weekDays = i;
                habitBean.repeat.setSun(isWeekdaysTrue(i, 6));
                habitBean.repeat.setMon(isWeekdaysTrue(i, 0));
                habitBean.repeat.setTue(isWeekdaysTrue(i, 1));
                habitBean.repeat.setWeb(isWeekdaysTrue(i, 2));
                habitBean.repeat.setThu(isWeekdaysTrue(i, 3));
                habitBean.repeat.setFri(isWeekdaysTrue(i, 4));
                habitBean.repeat.setSat(isWeekdaysTrue(i, 5));
                habitBean.repeat.setRest(false);
                habitBean.repeat.setWork(false);
            } else {
                habitBean.clockMode = 1;
                habitBean.repeat.setSun(true);
                habitBean.repeat.setMon(true);
                habitBean.repeat.setTue(true);
                habitBean.repeat.setWeb(true);
                habitBean.repeat.setThu(true);
                habitBean.repeat.setFri(true);
                habitBean.repeat.setSat(true);
                habitBean.repeat.setRest(false);
                habitBean.repeat.setWork(false);
            }
        } else if (dayList.get(CollectionsKt__CollectionsKt.getLastIndex(dayList)).getIsSelected()) {
            habitBean.repeat.setSun(false);
            habitBean.repeat.setMon(false);
            habitBean.repeat.setTue(false);
            habitBean.repeat.setWeb(false);
            habitBean.repeat.setThu(false);
            habitBean.repeat.setFri(false);
            habitBean.repeat.setSat(false);
            habitBean.clockMode = 3;
            habitBean.repeat.setRest(true);
            habitBean.repeat.setWork(false);
        } else {
            if (!dayList.get(CollectionsKt__CollectionsKt.getLastIndex(dayList) - 1).getIsSelected()) {
                String string = ApplicationExtKt.getApplication().getString(b0j.d);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                fail.invoke(string);
                return;
            }
            AddHabitDayBean addHabitDayBean = dayList.get(CollectionsKt__CollectionsKt.getLastIndex(dayList) - 1);
            habitBean.repeat.setSun(false);
            habitBean.repeat.setMon(false);
            habitBean.repeat.setTue(false);
            habitBean.repeat.setWeb(false);
            habitBean.repeat.setThu(false);
            habitBean.repeat.setFri(false);
            habitBean.repeat.setSat(false);
            if (addHabitDayBean.getIsSelected()) {
                habitBean.clockMode = 2;
                habitBean.repeat.setRest(false);
                habitBean.repeat.setWork(true);
            }
        }
        Pair<Integer, Integer> pair = timeList.get(timeList.size() - 1);
        int size = (pair.getFirst().intValue() == -1 && pair.getSecond().intValue() == -1) ? timeList.size() - 1 : timeList.size();
        t64[] t64VarArr = new t64[size];
        for (int i3 = 0; i3 < size; i3++) {
            t64VarArr[i3] = new t64();
        }
        for (int i4 = 0; i4 < size; i4++) {
            Pair<Integer, Integer> pair2 = timeList.get(i4);
            t64 t64Var = t64VarArr[i4];
            t64Var.c = pair2.getFirst().intValue();
            t64Var.d = pair2.getSecond().intValue();
        }
        habitBean.setTimes(t64VarArr);
        String strC = h4b.c(habitBean);
        hfb.d("addhabit:" + strC);
        HabitRequest habitRequest = getHabitRequest();
        Intrinsics.checkNotNull(strC);
        habitRequest.addHabit(strC, new Function1() { // from class: ss0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddHabitViewModel.addHabit$lambda$3(isSaveCalendar, habitBean, success, (AddHabitResp) obj);
            }
        }, new Function1() { // from class: ts0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddHabitViewModel.addHabit$lambda$4(fail, (String) obj);
            }
        });
    }

    @NotNull
    public final HabitRequest getHabitRequest() {
        HabitRequest habitRequest = this.habitRequest;
        if (habitRequest != null) {
            return habitRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("habitRequest");
        return null;
    }

    public final void habitDetail(@NotNull final HabitBean habitBean, @NotNull final Function1<? super HabitBean, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(habitBean, "habitBean");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        getHabitRequest().habitDetail(habitBean.typeId, new Function1() { // from class: us0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddHabitViewModel.habitDetail$lambda$0(success, habitBean, (HabitBean) obj);
            }
        }, new Function1() { // from class: vs0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddHabitViewModel.habitDetail$lambda$1(fail, (String) obj);
            }
        });
    }

    public final void setHabitRequest(@NotNull HabitRequest habitRequest) {
        Intrinsics.checkNotNullParameter(habitRequest, "<set-?>");
        this.habitRequest = habitRequest;
    }
}
