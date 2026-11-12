package com.xiaomi.fitness.habit.ui;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.habit.bean.HabitTodayResult;
import com.xiaomi.fitness.habit.bean.Share;
import com.xiaomi.fitness.habit.model.HabitModel;
import com.xiaomi.fitness.habit.request.HabitRequest;
import com.xiaomi.fitness.habit.ui.HabitTodayViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J.\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0013JL\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0004\u0012\u00020\u00110\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0013R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitTodayViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/habit/model/HabitModel;", "<init>", "()V", "habitRequest", "Lcom/xiaomi/fitness/habit/request/HabitRequest;", "getHabitRequest", "()Lcom/xiaomi/fitness/habit/request/HabitRequest;", "setHabitRequest", "(Lcom/xiaomi/fitness/habit/request/HabitRequest;)V", "connectionStatusLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getConnectionStatusLiveData", "()Landroidx/lifecycle/MutableLiveData;", "list", "", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/habit/bean/HabitTodayResult;", "fail", "", "doPunch", "typeId", "", "hour", "", "minute", "", "Lcom/xiaomi/fitness/habit/bean/Share;", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitTodayViewModel extends BaseViewModel<HabitModel> {

    @NotNull
    private final MutableLiveData<Boolean> connectionStatusLiveData = new MutableLiveData<>(Boolean.FALSE);
    public HabitRequest habitRequest;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doPunch$lambda$2(Function1 success, List it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doPunch$lambda$3(Function1 fail, String it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit list$lambda$0(Function1 success, HabitTodayResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit list$lambda$1(Function1 fail, String it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke(it);
        return Unit.INSTANCE;
    }

    public final void doPunch(long typeId, int hour, int minute, @NotNull final Function1<? super List<Share>, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        getHabitRequest().habitPunch(typeId, hour, minute, new Function1() { // from class: pjb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HabitTodayViewModel.doPunch$lambda$2(success, (List) obj);
            }
        }, new Function1() { // from class: qjb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HabitTodayViewModel.doPunch$lambda$3(fail, (String) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Boolean> getConnectionStatusLiveData() {
        return this.connectionStatusLiveData;
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

    public final void list(@NotNull final Function1<? super HabitTodayResult, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        getHabitRequest().todayPunch(new Function1() { // from class: njb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HabitTodayViewModel.list$lambda$0(success, (HabitTodayResult) obj);
            }
        }, new Function1() { // from class: ojb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HabitTodayViewModel.list$lambda$1(fail, (String) obj);
            }
        });
    }

    public final void setHabitRequest(@NotNull HabitRequest habitRequest) {
        Intrinsics.checkNotNullParameter(habitRequest, "<set-?>");
        this.habitRequest = habitRequest;
    }
}
