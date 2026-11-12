package com.xiaomi.fitness.health.todayhealth.service;

import com.mi.fitness.persist.server.data.GetProjectByTimeResponse;
import com.mi.fitness.persist.server.data.GetProjectByWMResponse;
import com.mi.fitness.persist.server.data.GetProjectMaxWMResponse;
import com.mi.fitness.persist.server.data.UpProjectResponse;
import com.xiaomi.fitness.net.response.BaseResult;
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

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://hlth.research.xiaomiwear.com/", path = "app/v1/")
@Secret(pathPrefix = "", sid = "miothealth")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H§@¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/service/HealthCheckService;", "", "upProjectData", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/fitness/persist/server/data/UpProjectResponse;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProjectDataByTime", "Lcom/mi/fitness/persist/server/data/GetProjectByTimeResponse;", "getProjectDataByWM", "Lcom/mi/fitness/persist/server/data/GetProjectByWMResponse;", "getProjectMaxWaterMark", "Lcom/mi/fitness/persist/server/data/GetProjectMaxWMResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HealthCheckService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HEALTH_RESEARCH_HTTP_PATH = "app/v1/";

    @NotNull
    public static final String HTTP_RESEARCH_HOST = "https://hlth.research.xiaomiwear.com/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/service/HealthCheckService$Companion;", "", "<init>", "()V", "HEALTH_RESEARCH_HTTP_PATH", "", "HTTP_RESEARCH_HOST", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HEALTH_RESEARCH_HTTP_PATH = "app/v1/";

        @NotNull
        public static final String HTTP_RESEARCH_HOST = "https://hlth.research.xiaomiwear.com/";

        private Companion() {
        }
    }

    @Nullable
    @uua("data/get_project_data_by_time")
    Object getProjectDataByTime(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetProjectByTimeResponse>> continuation);

    @Nullable
    @uua("data/get_project_data_by_watermark")
    Object getProjectDataByWM(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetProjectByWMResponse>> continuation);

    @Nullable
    @uua("data/get_max_project_data_watermark")
    Object getProjectMaxWaterMark(@NotNull Continuation<? super BaseResult<GetProjectMaxWMResponse>> continuation);

    @u0a
    @ngh("data/up_project_data")
    @Nullable
    Object upProjectData(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<UpProjectResponse>> continuation);
}
