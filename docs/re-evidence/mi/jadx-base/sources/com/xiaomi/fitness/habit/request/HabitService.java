package com.xiaomi.fitness.habit.request;

import com.example.habit.export.HabitBean;
import com.xiaomi.fitness.habit.bean.AddHabitResp;
import com.xiaomi.fitness.habit.bean.CommonBoolResult;
import com.xiaomi.fitness.habit.bean.HabitListBean;
import com.xiaomi.fitness.habit.bean.HabitPunchResult;
import com.xiaomi.fitness.habit.bean.HabitResult;
import com.xiaomi.fitness.habit.bean.HabitShopBean;
import com.xiaomi.fitness.habit.bean.HabitTodayResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://watch.iot.mi.com/", path = "cgi-op/api/v1/miwear/")
@Secret(pathPrefix = "cgi-op/api/v1/miwear/", sid = "miothealth")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H§@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/habit/request/HabitService;", "", "habitShopList", "Lcom/xiaomi/fitness/habit/bean/HabitResult;", "Lcom/xiaomi/fitness/habit/bean/HabitShopBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "habitDetail", "Lcom/example/habit/export/HabitBean;", "typeId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addHabit", "Lcom/xiaomi/fitness/habit/bean/AddHabitResp;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "todayList", "Lcom/xiaomi/fitness/habit/bean/HabitTodayResult;", "myHabitList", "Lcom/xiaomi/fitness/habit/bean/HabitListBean;", "deleteHabits", "Lcom/xiaomi/fitness/habit/bean/CommonBoolResult;", "habitPunch", "Lcom/xiaomi/fitness/habit/bean/HabitPunchResult;", "Companion", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HabitService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HEALTH_TOAPP_HOST = "https://watch.iot.mi.com/";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/habit/request/HabitService$Companion;", "", "<init>", "()V", "HEALTH_TOAPP_HOST", "", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HEALTH_TOAPP_HOST = "https://watch.iot.mi.com/";

        private Companion() {
        }
    }

    @u0a
    @ngh("habit/update")
    @Nullable
    Object addHabit(@NotNull @zk9("data") String str, @NotNull Continuation<? super HabitResult<AddHabitResp>> continuation);

    @u0a
    @ngh("habit/delete")
    @Nullable
    Object deleteHabits(@NotNull @zk9("data") String str, @NotNull Continuation<? super HabitResult<CommonBoolResult>> continuation);

    @Nullable
    @uua("habit/detail")
    Object habitDetail(@xfi("typeId") long j, @NotNull Continuation<? super HabitResult<HabitBean>> continuation);

    @u0a
    @ngh("habit/punch")
    @Nullable
    Object habitPunch(@NotNull @zk9("data") String str, @NotNull Continuation<? super HabitResult<HabitPunchResult>> continuation);

    @Nullable
    @uua("habit/all")
    Object habitShopList(@NotNull Continuation<? super HabitResult<HabitShopBean>> continuation);

    @Nullable
    @uua("habit/my")
    Object myHabitList(@NotNull Continuation<? super HabitResult<HabitListBean>> continuation);

    @Nullable
    @uua("habit/today")
    Object todayList(@NotNull Continuation<? super HabitResult<HabitTodayResult>> continuation);
}
