package com.xiaomi.fitness.habit.ui;

import android.text.TextUtils;
import com.example.habit.export.HabitBean;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.habit.bean.DeleteHabitsReq;
import com.xiaomi.fitness.habit.manager.HabitHelper;
import com.xiaomi.fitness.habit.model.HabitModel;
import com.xiaomi.fitness.habit.request.HabitRequest;
import com.xiaomi.fitness.habit.ui.MyHabitListViewModel;
import com.xiaomi.fitness.habit.utils.HabitUtils;
import defpackage.ba3;
import defpackage.h4b;
import defpackage.p63;
import defpackage.wy5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J>\u0010\u000b\u001a\u00020\f2\"\u0010\r\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u0011j\b\u0012\u0004\u0012\u00020\u0010`\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000eJ[\u0010\u0014\u001a\u00020\f2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0011j\b\u0012\u0004\u0012\u00020\u0010`\u000f2\"\u0010\r\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u0011j\b\u0012\u0004\u0012\u00020\u0010`\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\u0010\u0016J>\u0010\u0017\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000eJ\u0016\u0010\u001d\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/MyHabitListViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/habit/model/HabitModel;", "<init>", "()V", "habitRequest", "Lcom/xiaomi/fitness/habit/request/HabitRequest;", "getHabitRequest", "()Lcom/xiaomi/fitness/habit/request/HabitRequest;", "setHabitRequest", "(Lcom/xiaomi/fitness/habit/request/HabitRequest;)V", "myHabitList", "", "success", "Lkotlin/Function1;", "Lkotlin/collections/ArrayList;", "Lcom/example/habit/export/HabitBean;", "Ljava/util/ArrayList;", "fail", "", "loadDataFromNetAndCompare", "list", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "delete", "selectList", "", "isDeleteCalendar", "", "Lkotlin/Function0;", "deleteCalendars", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMyHabitListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyHabitListViewModel.kt\ncom/xiaomi/fitness/habit/ui/MyHabitListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1557#2:77\n1628#2,3:78\n*S KotlinDebug\n*F\n+ 1 MyHabitListViewModel.kt\ncom/xiaomi/fitness/habit/ui/MyHabitListViewModel\n*L\n54#1:77\n54#1:78,3\n*E\n"})
public final class MyHabitListViewModel extends BaseViewModel<HabitModel> {
    public HabitRequest habitRequest;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit delete$lambda$4(boolean z, MyHabitListViewModel this$0, List selectList, List typeIdList, Function0 success) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectList, "$selectList");
        Intrinsics.checkNotNullParameter(typeIdList, "$typeIdList");
        Intrinsics.checkNotNullParameter(success, "$success");
        if (z) {
            this$0.deleteCalendars(selectList);
        }
        p63.b(new wy5());
        HabitHelper.INSTANCE.deleteHabitsByIds(typeIdList);
        success.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit delete$lambda$5(Function1 fail, String msg) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(msg, "msg");
        fail.invoke(msg);
        return Unit.INSTANCE;
    }

    private final void deleteCalendars(List<? extends HabitBean> selectList) {
        for (HabitBean habitBean : selectList) {
            if (!TextUtils.isEmpty(habitBean.name)) {
                ba3.i(AppUtil.getApp(), habitBean.name);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDataFromNetAndCompare$lambda$1(ArrayList list, Function1 success, ArrayList habits) {
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(habits, "habits");
        HabitUtils.judgeSync(habits, list);
        success.invoke(habits);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDataFromNetAndCompare$lambda$2(Function1 fail, String it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit myHabitList$lambda$0(MyHabitListViewModel this$0, Function1 success, Function1 fail, ArrayList list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(list, "list");
        this$0.loadDataFromNetAndCompare(new ArrayList<>(), success, fail);
        return Unit.INSTANCE;
    }

    public final void delete(@NotNull final List<? extends HabitBean> selectList, final boolean isDeleteCalendar, @NotNull final Function0<Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(selectList, "selectList");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        List<? extends HabitBean> list = selectList;
        final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((HabitBean) it.next()).typeId));
        }
        String strC = h4b.c(new DeleteHabitsReq(arrayList));
        HabitRequest habitRequest = getHabitRequest();
        Intrinsics.checkNotNull(strC);
        habitRequest.deleteHabits(strC, new Function0() { // from class: leg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MyHabitListViewModel.delete$lambda$4(isDeleteCalendar, this, selectList, arrayList, success);
            }
        }, new Function1() { // from class: meg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyHabitListViewModel.delete$lambda$5(fail, (String) obj);
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

    public final void loadDataFromNetAndCompare(@NotNull final ArrayList<HabitBean> list, @NotNull final Function1<? super ArrayList<HabitBean>, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        getHabitRequest().myHabitList(new Function1() { // from class: neg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyHabitListViewModel.loadDataFromNetAndCompare$lambda$1(list, success, (ArrayList) obj);
            }
        }, new Function1() { // from class: oeg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyHabitListViewModel.loadDataFromNetAndCompare$lambda$2(fail, (String) obj);
            }
        });
    }

    public final void myHabitList(@NotNull final Function1<? super ArrayList<HabitBean>, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        HabitHelper.INSTANCE.list(new Function1() { // from class: peg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MyHabitListViewModel.myHabitList$lambda$0(this.f30318a, success, fail, (ArrayList) obj);
            }
        });
    }

    public final void setHabitRequest(@NotNull HabitRequest habitRequest) {
        Intrinsics.checkNotNullParameter(habitRequest, "<set-?>");
        this.habitRequest = habitRequest;
    }
}
