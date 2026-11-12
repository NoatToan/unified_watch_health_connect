package com.xiaomi.fitness.request;

import com.xiaomi.fitness.data.bean.GoalMonthlyStatisticsData;
import com.xiaomi.fitness.data.bean.ThreeTargetMedalInfo;
import com.xiaomi.fitness.health.sleep.rhythm.data.ResearchPresignedUrlResponse;
import com.xiaomi.fitness.health.sleep.rhythm.data.SleepRhythmProjectUserInfo;
import com.xiaomi.fitness.health.sleep.rhythm.data.SleepRhythmProjectUserInfoSetResult;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H§@¢\u0006\u0002\u0010\u000eJ$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/request/HealthHttpService;", "", "shareMonthStatisticsData", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/data/bean/GoalMonthlyStatisticsData;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getThreeTargetMedalData", "Lcom/xiaomi/fitness/data/bean/ThreeTargetMedalInfo;", "setProjectUserInfo", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmProjectUserInfoSetResult;", "getProjectUserInfo", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/SleepRhythmProjectUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSleepRhythmReportUploadUrl", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/ResearchPresignedUrlResponse;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HealthHttpService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/request/HealthHttpService$Companion;", "", "<init>", "()V", "HOST", "", "PATH", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String PATH = "app/v1/";

        private Companion() {
        }
    }

    @Nullable
    @uua("user/get_project_user_info")
    Object getProjectUserInfo(@NotNull Continuation<? super BaseResult<SleepRhythmProjectUserInfo>> continuation);

    @Nullable
    @uua("service/gen_research_upload_url")
    Object getSleepRhythmReportUploadUrl(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<List<ResearchPresignedUrlResponse>>> continuation);

    @Nullable
    @uua("vitality/get_achievement_data")
    Object getThreeTargetMedalData(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<ThreeTargetMedalInfo>> continuation);

    @u0a
    @ngh("user/set_project_user_info")
    @Nullable
    Object setProjectUserInfo(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SleepRhythmProjectUserInfoSetResult>> continuation);

    @Nullable
    @uua("statistics/get_goal_monthly_statistics_data")
    Object shareMonthStatisticsData(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GoalMonthlyStatisticsData>> continuation);
}
