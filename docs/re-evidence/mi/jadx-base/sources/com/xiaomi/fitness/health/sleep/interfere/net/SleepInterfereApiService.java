package com.xiaomi.fitness.health.sleep.interfere.net;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereApiService;", "", "createInterferePlan", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateInterferePlan", "getPlanList", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlanListResult;", "getInterfereTaskList", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlanTaskResult;", "updateTaskList", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereDayTask;", "getInterventionPlanById", "stopPlan", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SleepInterfereApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HTTP_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String HTTP_PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereApiService$Companion;", "", "<init>", "()V", "HTTP_PATH", "", "HTTP_HOST", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HTTP_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String HTTP_PATH = "app/v1/";

        private Companion() {
        }
    }

    @u0a
    @ngh("sleepInterventionPlans/create")
    @Nullable
    Object createInterferePlan(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SleepInterferePlan>> continuation);

    @u0a
    @ngh("sleepInterventionPlans/tasks/list")
    @Nullable
    Object getInterfereTaskList(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SleepInterferePlanTaskResult>> continuation);

    @u0a
    @ngh("sleepInterventionPlans/get")
    @Nullable
    Object getInterventionPlanById(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SleepInterferePlan>> continuation);

    @u0a
    @ngh("sleepInterventionPlans/list")
    @Nullable
    Object getPlanList(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SleepInterferePlanListResult>> continuation);

    @u0a
    @ngh("")
    @Nullable
    Object stopPlan(@NotNull Continuation<? super Unit> continuation);

    @u0a
    @ngh("sleepInterventionPlans/update")
    @Nullable
    Object updateInterferePlan(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SleepInterferePlan>> continuation);

    @u0a
    @ngh("sleepInterventionPlans/tasks/update")
    @Nullable
    Object updateTaskList(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SleepInterfereDayTask>> continuation);
}
