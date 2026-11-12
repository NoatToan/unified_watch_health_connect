package com.xiaomi.fitness.habit.export;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.example.habit.export.HabitBean;
import com.example.habit.export.HabitManager;
import com.example.habit.export.Today;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.habit.bean.HabitTodayResult;
import com.xiaomi.fitness.habit.export.HabitManagerImpl;
import com.xiaomi.fitness.habit.request.HabitRequest;
import com.xiaomi.fitness.habit.ui.HabitListActivity;
import com.xiaomi.fitness.habit.ui.HabitTodayActivity;
import defpackage.b0j;
import defpackage.dbm;
import defpackage.nni;
import defpackage.wam;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J0\u0010\u0010\u001a\u00020\u000b2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u000b0\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\u0016J@\u0010\u0017\u001a\u00020\u000b2\"\u0010\u0011\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00190\u001aj\b\u0012\u0004\u0012\u00020\u0019`\u0018\u0012\u0004\u0012\u00020\u000b0\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016J:\u0010\u001c\u001a\u00020\u000b2\"\u0010\u0011\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00190\u001aj\b\u0012\u0004\u0012\u00020\u0019`\u0018\u0012\u0004\u0012\u00020\u000b0\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/habit/export/HabitManagerImpl;", "Lcom/example/habit/export/HabitManager;", "<init>", "()V", "habitRequest", "Lcom/xiaomi/fitness/habit/request/HabitRequest;", "getHabitRequest", "()Lcom/xiaomi/fitness/habit/request/HabitRequest;", "setHabitRequest", "(Lcom/xiaomi/fitness/habit/request/HabitRequest;)V", "gotoHabitPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "habitNum", "", "loadTodayHabitList", "success", "Lkotlin/Function1;", "", "Lcom/example/habit/export/Today;", "fail", "Lkotlin/Function0;", "loadHabitList", "Lkotlin/collections/ArrayList;", "Lcom/example/habit/export/HabitBean;", "Ljava/util/ArrayList;", "", "loadMyHabitList", "addHabitPunchInShortcut", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitManagerImpl implements HabitManager {
    public HabitRequest habitRequest;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadHabitList$lambda$2(Function1 success, ArrayList it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadHabitList$lambda$3(Function1 fail, String it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMyHabitList$lambda$4(Function1 success, ArrayList it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMyHabitList$lambda$5(Function0 fail, String it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadTodayHabitList$lambda$0(Function1 success, HabitTodayResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke(it.getToday());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadTodayHabitList$lambda$1(Function0 fail, String it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke();
        return Unit.INSTANCE;
    }

    @Override // com.example.habit.export.HabitManager
    public void addHabitPunchInShortcut() {
        if (AppUtil.INSTANCE.isPlayChannel()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mihealth://intent?pageType=habitPunch"));
        intent.setFlags(268468224);
        wam wamVarA = new wam.b(ApplicationExtKt.getApplication(), "habitPunchIn").f(ResourceExtKt.getString(b0j.L)).e(1).b(IconCompat.j(ApplicationExtKt.getApplication(), nni.s)).c(intent).a();
        Intrinsics.checkNotNullExpressionValue(wamVarA, "build(...)");
        dbm.f(ApplicationExtKt.getApplication(), wamVarA);
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

    @Override // com.example.habit.export.HabitManager
    public void gotoHabitPage(@NotNull Activity activity, int habitNum) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(habitNum > 0 ? new Intent(activity, (Class<?>) HabitTodayActivity.class) : new Intent(activity, (Class<?>) HabitListActivity.class));
    }

    @Override // com.example.habit.export.HabitManager
    public void loadHabitList(@NotNull final Function1<? super ArrayList<HabitBean>, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        getHabitRequest().list(new Function1() { // from class: kfb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HabitManagerImpl.loadHabitList$lambda$2(success, (ArrayList) obj);
            }
        }, new Function1() { // from class: lfb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HabitManagerImpl.loadHabitList$lambda$3(fail, (String) obj);
            }
        });
    }

    @Override // com.example.habit.export.HabitManager
    public void loadMyHabitList(@NotNull final Function1<? super ArrayList<HabitBean>, Unit> success, @NotNull final Function0<Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        getHabitRequest().myHabitList(new Function1() { // from class: mfb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HabitManagerImpl.loadMyHabitList$lambda$4(success, (ArrayList) obj);
            }
        }, new Function1() { // from class: nfb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HabitManagerImpl.loadMyHabitList$lambda$5(fail, (String) obj);
            }
        });
    }

    @Override // com.example.habit.export.HabitManager
    public void loadTodayHabitList(@NotNull final Function1<? super List<Today>, Unit> success, @NotNull final Function0<Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        getHabitRequest().todayPunch(new Function1() { // from class: ifb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HabitManagerImpl.loadTodayHabitList$lambda$0(success, (HabitTodayResult) obj);
            }
        }, new Function1() { // from class: jfb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HabitManagerImpl.loadTodayHabitList$lambda$1(fail, (String) obj);
            }
        });
    }

    public final void setHabitRequest(@NotNull HabitRequest habitRequest) {
        Intrinsics.checkNotNullParameter(habitRequest, "<set-?>");
        this.habitRequest = habitRequest;
    }
}
