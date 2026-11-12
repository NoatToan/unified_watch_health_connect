package com.xiaomi.fit.fitness.persist.server.service;

import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessDataByTime;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessDataByWaterMark;
import com.xiaomi.fit.fitness.persist.server.data.DataBooleanResult;
import com.xiaomi.fit.fitness.persist.server.data.DataUploadResult;
import com.xiaomi.fit.fitness.persist.server.data.DeleteStatResponse;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataResultByTime;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataResultByWM;
import com.xiaomi.fit.fitness.persist.server.data.GetMaxWMResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectByTimeResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectByWMResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectMaxWMResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetRelativeDataResult;
import com.xiaomi.fit.fitness.persist.server.data.GetStatByTimeResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetStatByWMResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetSwitchSongResult;
import com.xiaomi.fit.fitness.persist.server.data.GetWaterMarkResult;
import com.xiaomi.fit.fitness.persist.server.data.LatestFitnessData;
import com.xiaomi.fit.fitness.persist.server.data.LatestSportReport;
import com.xiaomi.fit.fitness.persist.server.data.SportCategoryRes;
import com.xiaomi.fit.fitness.persist.server.data.SportReportResultByTime;
import com.xiaomi.fit.fitness.persist.server.data.SportReportResultByWM;
import com.xiaomi.fit.fitness.persist.server.data.SportSummaryRes;
import com.xiaomi.fit.fitness.persist.server.data.TriggerStatResponse;
import com.xiaomi.fit.fitness.persist.server.data.UpProjectResponse;
import com.xiaomi.fit.fitness.persist.server.data.UploadSwitchSongResult;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.training_plan_export.model.CurrentWeekPlan;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 K2\u00020\u0001:\u0001KJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0003H§@¢\u0006\u0002\u0010DJ\u001e\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u0003H§@¢\u0006\u0002\u0010D¨\u0006L"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/service/FitnessApiService;", "", "getMaxWaterMark", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fit/fitness/persist/server/data/GetWaterMarkResult;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadSportRecord", "Lcom/xiaomi/fit/fitness/persist/server/data/DataBooleanResult;", "getSportRecordsByWM", "Lcom/xiaomi/fit/fitness/persist/server/data/SportReportResultByWM;", "getSportRecordsByTime", "Lcom/xiaomi/fit/fitness/persist/server/data/SportReportResultByTime;", "getLatestSportReport", "Lcom/xiaomi/fit/fitness/persist/server/data/LatestSportReport;", "deleteSportRecords", "uploadFitnessData", "getFitnessDataByWM", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataResultByWM;", "getFitnessDataByTime", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataResultByTime;", "getLatestFitnessData", "Lcom/xiaomi/fit/fitness/persist/server/data/LatestFitnessData;", "deleteFitnessData", "uploadMedicalData", "getMedicalDataByWM", "getMedicalDataByTime", "getLatestMedicalData", "deleteMedicalData", "getSportSummary", "Lcom/xiaomi/fit/fitness/persist/server/data/SportSummaryRes;", "getBatchSportSummary", "getSportCategories", "Lcom/xiaomi/fit/fitness/persist/server/data/SportCategoryRes;", "migrateNotify", "upAggregatedData", "getAggregatedDataByWM", "Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessDataByWaterMark;", "getAggregatedDataByTime", "Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessDataByTime;", "reportSportSyncInfo", "syncHMDataToServer", "syncThirdPartyDataToServer", "Lcom/xiaomi/fit/fitness/persist/server/data/DataUploadResult;", "getRelativeLatestData", "Lcom/xiaomi/fit/fitness/persist/server/data/GetRelativeDataResult;", "getRelativeFitnessData", "getRelativeAggregatedData", "triggerStat", "Lcom/xiaomi/fit/fitness/persist/server/data/TriggerStatResponse;", "getStatDataByWM", "Lcom/xiaomi/fit/fitness/persist/server/data/GetStatByWMResponse;", "getStatDataByTime", "Lcom/xiaomi/fit/fitness/persist/server/data/GetStatByTimeResponse;", "deleteStatData", "Lcom/xiaomi/fit/fitness/persist/server/data/DeleteStatResponse;", "getStatMaxWaterMark", "Lcom/xiaomi/fit/fitness/persist/server/data/GetMaxWMResponse;", "upProjectData", "Lcom/xiaomi/fit/fitness/persist/server/data/UpProjectResponse;", "deleteProjectData", "getProjectDataByTime", "Lcom/xiaomi/fit/fitness/persist/server/data/GetProjectByTimeResponse;", "getProjectDataByWM", "Lcom/xiaomi/fit/fitness/persist/server/data/GetProjectByWMResponse;", "getProjectMaxWaterMark", "Lcom/xiaomi/fit/fitness/persist/server/data/GetProjectMaxWMResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadSwitchDanceData", "Lcom/xiaomi/fit/fitness/persist/server/data/UploadSwitchSongResult;", "getSwitchDanceData", "Lcom/xiaomi/fit/fitness/persist/server/data/GetSwitchSongResult;", "getCurWeekTrainingPlan", "Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekPlan;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FitnessApiService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HTTP_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String HTTP_PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/service/FitnessApiService$Companion;", "", "<init>", "()V", "HTTP_PATH", "", "HTTP_HOST", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    @ngh("data/delete_fitness_data")
    @Nullable
    Object deleteFitnessData(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DataBooleanResult>> continuation);

    @u0a
    @ngh("data/delete_medical_data")
    @Nullable
    Object deleteMedicalData(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DataBooleanResult>> continuation);

    @u0a
    @ngh("data/delete_project_data")
    @Nullable
    Object deleteProjectData(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<UpProjectResponse>> continuation);

    @u0a
    @ngh("data/delete_sport_records")
    @Nullable
    Object deleteSportRecords(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DataBooleanResult>> continuation);

    @u0a
    @ngh("statistics/delete_stat_data")
    @Nullable
    Object deleteStatData(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DeleteStatResponse>> continuation);

    @Nullable
    @uua("data/get_aggregated_fitness_data_by_time")
    Object getAggregatedDataByTime(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<AggregateFitnessDataByTime>> continuation);

    @Nullable
    @uua("data/get_aggregated_fitness_data_by_watermark")
    Object getAggregatedDataByWM(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<AggregateFitnessDataByWaterMark>> continuation);

    @Nullable
    @uua("statistics/batch_get_sport_summary")
    Object getBatchSportSummary(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<SportSummaryRes>> continuation);

    @Nullable
    @uua("smart_running/week_plan")
    Object getCurWeekTrainingPlan(@NotNull Continuation<? super BaseResult<CurrentWeekPlan>> continuation);

    @Nullable
    @uua("data/get_fitness_data_by_time")
    Object getFitnessDataByTime(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FitnessDataResultByTime>> continuation);

    @Nullable
    @uua("data/get_fitness_data_by_watermark")
    Object getFitnessDataByWM(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FitnessDataResultByWM>> continuation);

    @Nullable
    @uua("data/get_latest_fitness_data")
    Object getLatestFitnessData(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<LatestFitnessData>> continuation);

    @Nullable
    @uua("data/get_latest_medical_data")
    Object getLatestMedicalData(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<LatestFitnessData>> continuation);

    @Nullable
    @uua("data/get_latest_sport_record")
    Object getLatestSportReport(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<LatestSportReport>> continuation);

    @Nullable
    @uua("data/get_max_watermark")
    Object getMaxWaterMark(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetWaterMarkResult>> continuation);

    @Nullable
    @uua("data/get_medical_data_by_time")
    Object getMedicalDataByTime(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FitnessDataResultByTime>> continuation);

    @Nullable
    @uua("data/get_medical_data_by_watermark")
    Object getMedicalDataByWM(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<FitnessDataResultByWM>> continuation);

    @Nullable
    @uua("data/get_project_data_by_time")
    Object getProjectDataByTime(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetProjectByTimeResponse>> continuation);

    @Nullable
    @uua("data/get_project_data_by_watermark")
    Object getProjectDataByWM(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetProjectByWMResponse>> continuation);

    @Nullable
    @uua("data/get_max_project_data_watermark")
    Object getProjectMaxWaterMark(@NotNull Continuation<? super BaseResult<GetProjectMaxWMResponse>> continuation);

    @Nullable
    @uua("relatives/get_aggregated_data")
    Object getRelativeAggregatedData(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetRelativeDataResult>> continuation);

    @Nullable
    @uua("relatives/get_fitness_data")
    Object getRelativeFitnessData(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetRelativeDataResult>> continuation);

    @Nullable
    @uua("relatives/get_latest_data")
    Object getRelativeLatestData(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetRelativeDataResult>> continuation);

    @Nullable
    @uua("data/get_sport_category_list")
    Object getSportCategories(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<SportCategoryRes>> continuation);

    @Nullable
    @uua("data/get_sport_records_by_time")
    Object getSportRecordsByTime(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<SportReportResultByTime>> continuation);

    @Nullable
    @uua("data/get_sport_records_by_watermark")
    Object getSportRecordsByWM(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<SportReportResultByWM>> continuation);

    @Nullable
    @uua("statistics/scan_sport_summary")
    Object getSportSummary(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<SportSummaryRes>> continuation);

    @Nullable
    @uua("statistics/get_stat_data_by_time")
    Object getStatDataByTime(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetStatByTimeResponse>> continuation);

    @Nullable
    @uua("statistics/get_stat_data_by_watermark")
    Object getStatDataByWM(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetStatByWMResponse>> continuation);

    @Nullable
    @uua("statistics/get_max_watermark")
    Object getStatMaxWaterMark(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetMaxWMResponse>> continuation);

    @u0a
    @ngh("just_dance/static_data_list")
    @Nullable
    Object getSwitchDanceData(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<GetSwitchSongResult>> continuation);

    @Nullable
    @uua("statistics/mark_migrate_hlthcenter")
    Object migrateNotify(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<DataBooleanResult>> continuation);

    @u0a
    @ngh("statistics/report_sports_sync_info")
    @Nullable
    Object reportSportSyncInfo(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DataBooleanResult>> continuation);

    @u0a
    @ngh("data/up_huami_raw_data")
    @Nullable
    Object syncHMDataToServer(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DataBooleanResult>> continuation);

    @u0a
    @ngh("data/up_third_raw_data")
    @Nullable
    Object syncThirdPartyDataToServer(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DataUploadResult>> continuation);

    @u0a
    @ngh("statistics/trigger_stat")
    @Nullable
    Object triggerStat(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<TriggerStatResponse>> continuation);

    @u0a
    @ngh("data/up_aggregated_fitness_data")
    @Nullable
    Object upAggregatedData(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DataBooleanResult>> continuation);

    @u0a
    @ngh("data/up_project_data")
    @Nullable
    Object upProjectData(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<UpProjectResponse>> continuation);

    @u0a
    @ngh("data/up_fitness_data")
    @Nullable
    Object uploadFitnessData(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DataBooleanResult>> continuation);

    @u0a
    @ngh("data/up_medical_data")
    @Nullable
    Object uploadMedicalData(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DataBooleanResult>> continuation);

    @u0a
    @ngh("data/up_sport_records")
    @Nullable
    Object uploadSportRecord(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<DataBooleanResult>> continuation);

    @u0a
    @ngh("just_dance/static_data")
    @Nullable
    Object uploadSwitchDanceData(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<UploadSwitchSongResult>> continuation);
}
