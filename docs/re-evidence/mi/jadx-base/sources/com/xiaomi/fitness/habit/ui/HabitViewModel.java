package com.xiaomi.fitness.habit.ui;

import androidx.lifecycle.LifecycleOwner;
import com.example.habit.export.HabitBean;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.habit.model.HabitModel;
import com.xiaomi.fitness.habit.request.HabitRequest;
import com.xiaomi.fitness.habit.ui.HabitViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J>\u0010\u000b\u001a\u00020\f2\"\u0010\r\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u0011j\b\u0012\u0004\u0012\u00020\u0010`\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000eJ\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/habit/model/HabitModel;", "<init>", "()V", "habitRequest", "Lcom/xiaomi/fitness/habit/request/HabitRequest;", "getHabitRequest", "()Lcom/xiaomi/fitness/habit/request/HabitRequest;", "setHabitRequest", "(Lcom/xiaomi/fitness/habit/request/HabitRequest;)V", "loadHabitList", "", "success", "Lkotlin/Function1;", "Lkotlin/collections/ArrayList;", "Lcom/example/habit/export/HabitBean;", "Ljava/util/ArrayList;", "fail", "", LifecycleConstantKt.ON_DESTROY, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitViewModel extends BaseViewModel<HabitModel> {
    public HabitRequest habitRequest;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadHabitList$lambda$0(Function1 success, ArrayList it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadHabitList$lambda$1(Function1 fail, String it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke(it);
        return Unit.INSTANCE;
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

    public final void loadHabitList(@NotNull final Function1<? super ArrayList<HabitBean>, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        getHabitRequest().list(new Function1() { // from class: xjb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HabitViewModel.loadHabitList$lambda$0(success, (ArrayList) obj);
            }
        }, new Function1() { // from class: yjb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HabitViewModel.loadHabitList$lambda$1(fail, (String) obj);
            }
        });
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
    }

    public final void setHabitRequest(@NotNull HabitRequest habitRequest) {
        Intrinsics.checkNotNullParameter(habitRequest, "<set-?>");
        this.habitRequest = habitRequest;
    }
}
