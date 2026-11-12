package com.xiaomi.fit.fitness.persist.server;

import android.annotation.SuppressLint;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.HMDataParams;
import com.xiaomi.fit.fitness.export.data.item.ThirdPartyDataParam;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessData;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessDataByTime;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessDataByTimeParam;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessDataByWaterMark;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateFitnessDataByWaterMarkParam;
import com.xiaomi.fit.fitness.persist.dailyreport.bean.AggregateRequestBody;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fit.fitness.persist.server.data.DataBooleanResult;
import com.xiaomi.fit.fitness.persist.server.data.DataUploadResult;
import com.xiaomi.fit.fitness.persist.server.data.DeleteFitnessData;
import com.xiaomi.fit.fitness.persist.server.data.DeleteProjectParams;
import com.xiaomi.fit.fitness.persist.server.data.DeleteStatParams;
import com.xiaomi.fit.fitness.persist.server.data.DeleteStatResponse;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataKey;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataModel;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataResultByTime;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataResultByWM;
import com.xiaomi.fit.fitness.persist.server.data.GetDetailDataParam;
import com.xiaomi.fit.fitness.persist.server.data.GetFitnessDataByTime;
import com.xiaomi.fit.fitness.persist.server.data.GetFitnessDataByWM;
import com.xiaomi.fit.fitness.persist.server.data.GetLatestDataParam;
import com.xiaomi.fit.fitness.persist.server.data.GetMaxWMResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectByTimeParams;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectByTimeResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectByWMParams;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectByWMResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectMaxWMResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetRelativeDataResult;
import com.xiaomi.fit.fitness.persist.server.data.GetSportReportByTime;
import com.xiaomi.fit.fitness.persist.server.data.GetSportReportByWM;
import com.xiaomi.fit.fitness.persist.server.data.GetStatByTimeParams;
import com.xiaomi.fit.fitness.persist.server.data.GetStatByTimeResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetStatByWMParams;
import com.xiaomi.fit.fitness.persist.server.data.GetStatByWMResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetStatMaxWMParams;
import com.xiaomi.fit.fitness.persist.server.data.GetSwitchSongItem;
import com.xiaomi.fit.fitness.persist.server.data.GetSwitchSongResult;
import com.xiaomi.fit.fitness.persist.server.data.GetWaterMarkResult;
import com.xiaomi.fit.fitness.persist.server.data.LatestFitnessData;
import com.xiaomi.fit.fitness.persist.server.data.LatestFitnessDataModel;
import com.xiaomi.fit.fitness.persist.server.data.LatestFitnessDataParam;
import com.xiaomi.fit.fitness.persist.server.data.LatestSportReport;
import com.xiaomi.fit.fitness.persist.server.data.LatestSportReportParam;
import com.xiaomi.fit.fitness.persist.server.data.MarkMigrate;
import com.xiaomi.fit.fitness.persist.server.data.ProjectDataKey;
import com.xiaomi.fit.fitness.persist.server.data.ProjectDataModel;
import com.xiaomi.fit.fitness.persist.server.data.SportReportModel;
import com.xiaomi.fit.fitness.persist.server.data.SportReportResultByTime;
import com.xiaomi.fit.fitness.persist.server.data.SportReportResultByWM;
import com.xiaomi.fit.fitness.persist.server.data.SportSyncInfo;
import com.xiaomi.fit.fitness.persist.server.data.StatDataKey;
import com.xiaomi.fit.fitness.persist.server.data.TriggerStatParams;
import com.xiaomi.fit.fitness.persist.server.data.TriggerStatResponse;
import com.xiaomi.fit.fitness.persist.server.data.UpProjectParams;
import com.xiaomi.fit.fitness.persist.server.data.UpProjectResponse;
import com.xiaomi.fit.fitness.persist.server.data.UpSportSyncInfo;
import com.xiaomi.fit.fitness.persist.server.data.UploadFitnessDataParam;
import com.xiaomi.fit.fitness.persist.server.data.UploadSportReportParam;
import com.xiaomi.fit.fitness.persist.server.data.UploadSwitchSongResult;
import com.xiaomi.fit.fitness.persist.server.service.FitnessApiService;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.training_plan_export.model.CurrentWeekPlan;
import dagger.hilt.android.EntryPointAccessors;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0089\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u001c\u0010\u0019\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001e\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001f\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u000e\u0010 \u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u0016\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0082@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010(J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0086@¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020/2\u0006\u0010'\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010(J\u0016\u00100\u001a\u0002012\u0006\u0010+\u001a\u000202H\u0086@¢\u0006\u0002\u00103J\u0016\u00104\u001a\u00020/2\u0006\u0010'\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010(J\u0016\u00105\u001a\u0002012\u0006\u0010+\u001a\u000202H\u0086@¢\u0006\u0002\u00103J\u001c\u00106\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002070\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u001c\u00108\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002070\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u001c\u00109\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002070\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u0016\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<H\u0086@¢\u0006\u0002\u0010=J\u001c\u0010>\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020?0\u0013H\u0086@¢\u0006\u0002\u0010\u0015J(\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u001b2\b\b\u0002\u0010C\u001a\u00020#H\u0086@¢\u0006\u0002\u0010DJ\u0016\u0010E\u001a\u00020F2\u0006\u0010;\u001a\u00020GH\u0086@¢\u0006\u0002\u0010HJ\u001c\u0010I\u001a\u00020J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u001c\u0010M\u001a\u00020J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u0018\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0002\u0010QJ\u001c\u0010R\u001a\u00020\u00112\f\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u0016\u0010U\u001a\u00020\u00112\u0006\u0010V\u001a\u00020WH\u0086@¢\u0006\u0002\u0010XJ\u0016\u0010Y\u001a\u00020\u00112\u0006\u0010V\u001a\u00020ZH\u0086@¢\u0006\u0002\u0010[J\u0016\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010(J\u0016\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020aH\u0086@¢\u0006\u0002\u0010bJ\u0016\u0010c\u001a\u00020]2\u0006\u0010`\u001a\u00020aH\u0086@¢\u0006\u0002\u0010bJ\u0016\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gH\u0086@¢\u0006\u0002\u0010hJ\u0016\u0010i\u001a\u00020j2\u0006\u0010f\u001a\u00020kH\u0086@¢\u0006\u0002\u0010lJ\u0016\u0010m\u001a\u00020n2\u0006\u0010f\u001a\u00020oH\u0086@¢\u0006\u0002\u0010pJ\u001c\u0010q\u001a\u00020\u00112\f\u0010r\u001a\b\u0012\u0004\u0012\u00020s0\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u001e\u0010t\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\f2\u0006\u0010u\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010vJ\u0018\u0010w\u001a\u00020x2\b\u0010'\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0002\u0010QJ\u0016\u0010y\u001a\u00020z2\u0006\u0010f\u001a\u00020{H\u0086@¢\u0006\u0002\u0010|J\u001c\u0010}\u001a\u00020\u00112\f\u0010r\u001a\b\u0012\u0004\u0012\u00020~0\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u001d\u0010\u007f\u001a\u00020\u00112\r\u0010r\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u0013H\u0086@¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0081\u0001\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u0082\u0001\u001a\u00020\u00112\u0006\u0010V\u001a\u00020\fH\u0086@¢\u0006\u0003\u0010\u0083\u0001J!\u0010\u0084\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0085\u0001\u0018\u00010\u00132\u0007\u0010\u0086\u0001\u001a\u00020#H\u0086@¢\u0006\u0002\u0010$J\u0010\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0086@¢\u0006\u0002\u0010\u001cR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u008a\u0001"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fit/fitness/persist/server/service/FitnessApiService;", "<init>", "()V", "mFitnessGson", "Lcom/google/gson/Gson;", "getMFitnessGson", "()Lcom/google/gson/Gson;", "mFitnessGson$delegate", "Lkotlin/Lazy;", "phoneId", "", "getPhoneId", "()Ljava/lang/String;", "phoneId$delegate", "uploadSportReports", "", "sportList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/SportReportModel;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadFitnessData", "dataList", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataModel;", "uploadMedicalData", "getFitnessDataMaxWM", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSportMaxWatermark", "getRedPointMaxWM", "getRainbowMaxWM", "getMedicalDataMaxWM", "getMaxWaterMark", "type", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSportReportsByWM", "Lcom/xiaomi/fit/fitness/persist/server/data/SportReportResultByWM;", "watermark", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSportReportsByTime", "Lcom/xiaomi/fit/fitness/persist/server/data/SportReportResultByTime;", "requestParam", "Lcom/xiaomi/fit/fitness/persist/server/data/GetSportReportByTime;", "(Lcom/xiaomi/fit/fitness/persist/server/data/GetSportReportByTime;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFitnessDataByWM", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataResultByWM;", "getFitnessDataByTime", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataResultByTime;", "Lcom/xiaomi/fit/fitness/persist/server/data/GetFitnessDataByTime;", "(Lcom/xiaomi/fit/fitness/persist/server/data/GetFitnessDataByTime;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMedicalDataByWM", "getMedicalDataByTime", "deleteSportReports", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataKey;", "deleteFitnessData", "deleteMedicalData", "markMigrate", "item", "Lcom/xiaomi/fit/fitness/persist/server/data/MarkMigrate;", "(Lcom/xiaomi/fit/fitness/persist/server/data/MarkMigrate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upAggregatedData", "Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessData;", "getAggregatedDataByWM", "Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessDataByWaterMark;", "tag", "limit", "(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAggregatedDataByTime", "Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessDataByTime;", "Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessDataByTimeParam;", "(Lcom/xiaomi/fit/fitness/persist/dailyreport/bean/AggregateFitnessDataByTimeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestFitnessData", "Lcom/xiaomi/fit/fitness/persist/server/data/LatestFitnessData;", "requestDataList", "Lcom/xiaomi/fit/fitness/persist/server/data/LatestFitnessDataModel;", "getLatestMedicalData", "getLatestSportReport", "Lcom/xiaomi/fit/fitness/persist/server/data/LatestSportReport;", "time", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportSportSyncInfo", "sportInfoList", "Lcom/xiaomi/fit/fitness/persist/server/data/SportSyncInfo;", "syncHmDataToServer", "data", "Lcom/xiaomi/fit/fitness/export/data/item/HMDataParams;", "(Lcom/xiaomi/fit/fitness/export/data/item/HMDataParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncThirdPartyDataToServer", "Lcom/xiaomi/fit/fitness/export/data/item/ThirdPartyDataParam;", "(Lcom/xiaomi/fit/fitness/export/data/item/ThirdPartyDataParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRelativeLatestData", "Lcom/xiaomi/fit/fitness/persist/server/data/GetRelativeDataResult;", "relativeId", "getRelativeFitnessData", "requestParams", "Lcom/xiaomi/fit/fitness/persist/server/data/GetDetailDataParam;", "(Lcom/xiaomi/fit/fitness/persist/server/data/GetDetailDataParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRelativeAggregatedData", "triggerStat", "Lcom/xiaomi/fit/fitness/persist/server/data/TriggerStatResponse;", "params", "Lcom/xiaomi/fit/fitness/persist/server/data/TriggerStatParams;", "(Lcom/xiaomi/fit/fitness/persist/server/data/TriggerStatParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatDataByWM", "Lcom/xiaomi/fit/fitness/persist/server/data/GetStatByWMResponse;", "Lcom/xiaomi/fit/fitness/persist/server/data/GetStatByWMParams;", "(Lcom/xiaomi/fit/fitness/persist/server/data/GetStatByWMParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatDataByTime", "Lcom/xiaomi/fit/fitness/persist/server/data/GetStatByTimeResponse;", "Lcom/xiaomi/fit/fitness/persist/server/data/GetStatByTimeParams;", "(Lcom/xiaomi/fit/fitness/persist/server/data/GetStatByTimeParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteStatData", "list", "Lcom/xiaomi/fit/fitness/persist/server/data/StatDataKey;", "getStatMaxWaterMark", "key", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProjectDataByWM", "Lcom/xiaomi/fit/fitness/persist/server/data/GetProjectByWMResponse;", "getProjectDataByTime", "Lcom/xiaomi/fit/fitness/persist/server/data/GetProjectByTimeResponse;", "Lcom/xiaomi/fit/fitness/persist/server/data/GetProjectByTimeParams;", "(Lcom/xiaomi/fit/fitness/persist/server/data/GetProjectByTimeParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upProjectData", "Lcom/xiaomi/fit/fitness/persist/server/data/ProjectDataModel;", "deleteProjectData", "Lcom/xiaomi/fit/fitness/persist/server/data/ProjectDataKey;", "getProjectMaxWaterMark", "uploadSwitchSongData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSwitchSongData", "Lcom/xiaomi/fit/fitness/persist/server/data/GetSwitchSongItem;", SportConstants.KEY_TIMESTAMP, "getWeekTrainingPlan", "Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekPlan;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"HardwareIds"})
@SourceDebugExtension({"SMAP\nFitnessDataRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDataRequest.kt\ncom/xiaomi/fit/fitness/persist/server/FitnessDataRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,271:1\n141#2:272\n141#2:276\n141#2:280\n141#2:284\n141#2:288\n141#2:292\n141#2:296\n141#2:300\n141#2:304\n141#2:308\n141#2:312\n141#2:316\n141#2:320\n141#2:324\n141#2:328\n141#2:332\n141#2:336\n141#2:340\n141#2:344\n141#2:348\n141#2:352\n141#2:356\n141#2:360\n141#2:364\n141#2:368\n141#2:372\n141#2:376\n141#2:380\n141#2:384\n141#2:388\n141#2:392\n141#2:396\n141#2:400\n141#2:404\n141#2:408\n141#2:412\n141#2:416\n141#2:420\n141#2:424\n31#3:273\n28#3,2:274\n31#3:277\n28#3,2:278\n31#3:281\n28#3,2:282\n31#3:285\n28#3,2:286\n31#3:289\n28#3,2:290\n31#3:293\n28#3,2:294\n31#3:297\n28#3,2:298\n31#3:301\n28#3,2:302\n31#3:305\n28#3,2:306\n31#3:309\n28#3,2:310\n31#3:313\n28#3,2:314\n31#3:317\n28#3,2:318\n31#3:321\n28#3,2:322\n31#3:325\n28#3,2:326\n31#3:329\n28#3,2:330\n31#3:333\n28#3,2:334\n31#3:337\n28#3,2:338\n31#3:341\n28#3,2:342\n31#3:345\n28#3,2:346\n31#3:349\n28#3,2:350\n31#3:353\n28#3,2:354\n31#3:357\n28#3,2:358\n31#3:361\n28#3,2:362\n31#3:365\n28#3,2:366\n31#3:369\n28#3,2:370\n31#3:373\n28#3,2:374\n31#3:377\n28#3,2:378\n31#3:381\n28#3,2:382\n31#3:385\n28#3,2:386\n31#3:389\n28#3,2:390\n31#3:393\n28#3,2:394\n31#3:397\n28#3,2:398\n31#3:401\n28#3,2:402\n31#3:405\n28#3,2:406\n31#3:409\n28#3,2:410\n31#3:413\n28#3,2:414\n31#3:417\n28#3,2:418\n31#3:421\n28#3,2:422\n31#3:425\n28#3,2:426\n*S KotlinDebug\n*F\n+ 1 FitnessDataRequest.kt\ncom/xiaomi/fit/fitness/persist/server/FitnessDataRequest\n*L\n35#1:272\n41#1:276\n47#1:280\n64#1:284\n70#1:288\n75#1:292\n81#1:296\n86#1:300\n92#1:304\n97#1:308\n103#1:312\n109#1:316\n115#1:320\n120#1:324\n130#1:328\n140#1:332\n145#1:336\n150#1:340\n155#1:344\n162#1:348\n167#1:352\n173#1:356\n178#1:360\n184#1:364\n189#1:368\n194#1:372\n199#1:376\n204#1:380\n209#1:384\n215#1:388\n221#1:392\n228#1:396\n233#1:400\n239#1:404\n245#1:408\n249#1:412\n253#1:416\n265#1:420\n269#1:424\n35#1:273\n35#1:274,2\n41#1:277\n41#1:278,2\n47#1:281\n47#1:282,2\n64#1:285\n64#1:286,2\n70#1:289\n70#1:290,2\n75#1:293\n75#1:294,2\n81#1:297\n81#1:298,2\n86#1:301\n86#1:302,2\n92#1:305\n92#1:306,2\n97#1:309\n97#1:310,2\n103#1:313\n103#1:314,2\n109#1:317\n109#1:318,2\n115#1:321\n115#1:322,2\n120#1:325\n120#1:326,2\n130#1:329\n130#1:330,2\n140#1:333\n140#1:334,2\n145#1:337\n145#1:338,2\n150#1:341\n150#1:342,2\n155#1:345\n155#1:346,2\n162#1:349\n162#1:350,2\n167#1:353\n167#1:354,2\n173#1:357\n173#1:358,2\n178#1:361\n178#1:362,2\n184#1:365\n184#1:366,2\n189#1:369\n189#1:370,2\n194#1:373\n194#1:374,2\n199#1:377\n199#1:378,2\n204#1:381\n204#1:382,2\n209#1:385\n209#1:386,2\n215#1:389\n215#1:390,2\n221#1:393\n221#1:394,2\n228#1:397\n228#1:398,2\n233#1:401\n233#1:402,2\n239#1:405\n239#1:406,2\n245#1:409\n245#1:410,2\n249#1:413\n249#1:414,2\n253#1:417\n253#1:418,2\n265#1:421\n265#1:422,2\n269#1:425\n269#1:426,2\n*E\n"})
public final class FitnessDataRequest extends BaseRequest<FitnessApiService> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "FitnessDataRequest";

    @NotNull
    private static final FitnessDataRequest instance = new FitnessDataRequest();

    /* JADX INFO: renamed from: mFitnessGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFitnessGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataRequest.mFitnessGson_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: phoneId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy phoneId = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataRequest.phoneId_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "getInstance", "()Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessDataRequest getInstance() {
            return FitnessDataRequest.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$deleteFitnessData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {109}, m = "deleteFitnessData", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.deleteFitnessData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$deleteMedicalData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {115}, m = "deleteMedicalData", n = {}, s = {})
    public static final class C16571 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16571(Continuation<? super C16571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.deleteMedicalData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$deleteProjectData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {245}, m = "deleteProjectData", n = {}, s = {})
    public static final class C16581 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16581(Continuation<? super C16581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.deleteProjectData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$deleteSportReports$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {103}, m = "deleteSportReports", n = {}, s = {})
    public static final class C16591 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16591(Continuation<? super C16591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.deleteSportReports(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$deleteStatData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {215}, m = "deleteStatData", n = {}, s = {})
    public static final class C16601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16601(Continuation<? super C16601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.deleteStatData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getAggregatedDataByTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {145}, m = "getAggregatedDataByTime", n = {}, s = {})
    public static final class C16611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16611(Continuation<? super C16611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getAggregatedDataByTime(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getAggregatedDataByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {140}, m = "getAggregatedDataByWM", n = {}, s = {})
    public static final class C16621 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16621(Continuation<? super C16621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getAggregatedDataByWM(null, 0L, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getFitnessDataByTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {86}, m = "getFitnessDataByTime", n = {}, s = {})
    public static final class C16631 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16631(Continuation<? super C16631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getFitnessDataByTime(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getFitnessDataByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {81}, m = "getFitnessDataByWM", n = {}, s = {})
    public static final class C16641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16641(Continuation<? super C16641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getFitnessDataByWM(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getLatestFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {150}, m = "getLatestFitnessData", n = {}, s = {})
    public static final class C16651 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16651(Continuation<? super C16651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getLatestFitnessData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getLatestMedicalData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {155}, m = "getLatestMedicalData", n = {}, s = {})
    public static final class C16661 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16661(Continuation<? super C16661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getLatestMedicalData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getLatestSportReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {162}, m = "getLatestSportReport", n = {}, s = {})
    public static final class C16671 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16671(Continuation<? super C16671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getLatestSportReport(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getMaxWaterMark$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {63}, m = "getMaxWaterMark", n = {}, s = {})
    public static final class C16681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16681(Continuation<? super C16681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getMaxWaterMark(0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getMedicalDataByTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {97}, m = "getMedicalDataByTime", n = {}, s = {})
    public static final class C16691 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16691(Continuation<? super C16691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getMedicalDataByTime(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getMedicalDataByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {92}, m = "getMedicalDataByWM", n = {}, s = {})
    public static final class C16701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16701(Continuation<? super C16701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getMedicalDataByWM(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getProjectDataByTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {233}, m = "getProjectDataByTime", n = {}, s = {})
    public static final class C16711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16711(Continuation<? super C16711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getProjectDataByTime(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getProjectDataByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {228}, m = "getProjectDataByWM", n = {}, s = {})
    public static final class C16721 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16721(Continuation<? super C16721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getProjectDataByWM(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getProjectMaxWaterMark$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {249}, m = "getProjectMaxWaterMark", n = {}, s = {})
    public static final class C16731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16731(Continuation<? super C16731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getProjectMaxWaterMark(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getRelativeAggregatedData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {SportReportBaseParser.ReportType.divingCNS}, m = "getRelativeAggregatedData", n = {}, s = {})
    public static final class C16741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16741(Continuation<? super C16741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getRelativeAggregatedData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getRelativeFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {SportReportBaseParser.ReportType.descentCount}, m = "getRelativeFitnessData", n = {}, s = {})
    public static final class C16751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16751(Continuation<? super C16751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getRelativeFitnessData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getRelativeLatestData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {SportReportBaseParser.ReportType.exitTime}, m = "getRelativeLatestData", n = {}, s = {})
    public static final class C16761 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16761(Continuation<? super C16761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getRelativeLatestData(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getSportReportsByTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {75}, m = "getSportReportsByTime", n = {}, s = {})
    public static final class C16771 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16771(Continuation<? super C16771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getSportReportsByTime(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getSportReportsByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {70}, m = "getSportReportsByWM", n = {}, s = {})
    public static final class C16781 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16781(Continuation<? super C16781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getSportReportsByWM(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getStatDataByTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {209}, m = "getStatDataByTime", n = {}, s = {})
    public static final class C16791 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16791(Continuation<? super C16791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getStatDataByTime(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getStatDataByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {204}, m = "getStatDataByWM", n = {}, s = {})
    public static final class C16801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16801(Continuation<? super C16801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getStatDataByWM(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getStatMaxWaterMark$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {221}, m = "getStatMaxWaterMark", n = {}, s = {})
    public static final class C16811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16811(Continuation<? super C16811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getStatMaxWaterMark(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getSwitchSongData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {265}, m = "getSwitchSongData", n = {}, s = {})
    public static final class C16821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16821(Continuation<? super C16821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getSwitchSongData(0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$getWeekTrainingPlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {269}, m = "getWeekTrainingPlan", n = {}, s = {})
    public static final class C16831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16831(Continuation<? super C16831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.getWeekTrainingPlan(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$markMigrate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {120}, m = "markMigrate", n = {}, s = {})
    public static final class C16841 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16841(Continuation<? super C16841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.markMigrate(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$reportSportSyncInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {167}, m = "reportSportSyncInfo", n = {}, s = {})
    public static final class C16851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16851(Continuation<? super C16851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.reportSportSyncInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$syncHmDataToServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {173}, m = "syncHmDataToServer", n = {}, s = {})
    public static final class C16861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16861(Continuation<? super C16861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.syncHmDataToServer(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$syncThirdPartyDataToServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {178}, m = "syncThirdPartyDataToServer", n = {}, s = {})
    public static final class C16871 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16871(Continuation<? super C16871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.syncThirdPartyDataToServer(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$triggerStat$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {199}, m = "triggerStat", n = {}, s = {})
    public static final class C16881 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16881(Continuation<? super C16881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.triggerStat(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$upAggregatedData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {130}, m = "upAggregatedData", n = {}, s = {})
    public static final class C16891 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16891(Continuation<? super C16891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.upAggregatedData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$upProjectData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {239}, m = "upProjectData", n = {}, s = {})
    public static final class C16901 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16901(Continuation<? super C16901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.upProjectData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$uploadFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {41}, m = "uploadFitnessData", n = {}, s = {})
    public static final class C16911 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16911(Continuation<? super C16911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.uploadFitnessData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$uploadMedicalData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {47}, m = "uploadMedicalData", n = {}, s = {})
    public static final class C16921 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16921(Continuation<? super C16921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.uploadMedicalData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$uploadSportReports$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {35}, m = "uploadSportReports", n = {}, s = {})
    public static final class C16931 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16931(Continuation<? super C16931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.uploadSportReports(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.server.FitnessDataRequest$uploadSwitchSongData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.server.FitnessDataRequest", f = "FitnessDataRequest.kt", i = {}, l = {253}, m = "uploadSwitchSongData", n = {}, s = {})
    public static final class C16941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16941(Continuation<? super C16941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FitnessDataRequest.this.uploadSwitchSongData(null, this);
        }
    }

    public static /* synthetic */ Object getAggregatedDataByWM$default(FitnessDataRequest fitnessDataRequest, String str, long j, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 50;
        }
        return fitnessDataRequest.getAggregatedDataByWM(str, j, i, continuation);
    }

    private final Gson getMFitnessGson() {
        return (Gson) this.mFitnessGson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getMaxWaterMark(int i, Continuation<? super Long> continuation) {
        C16681 c16681;
        if (continuation instanceof C16681) {
            c16681 = (C16681) continuation;
            int i2 = c16681.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16681.label = i2 - Integer.MIN_VALUE;
            } else {
                c16681 = new C16681(continuation);
            }
        } else {
            c16681 = new C16681(continuation);
        }
        Object maxWaterMark = c16681.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c16681.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(maxWaterMark);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("type", Boxing.boxInt(i));
            FitnessApiService mService = getMService();
            String string = jsonObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            c16681.label = 1;
            maxWaterMark = mService.getMaxWaterMark(string, c16681);
            if (maxWaterMark == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(maxWaterMark);
        }
        return Boxing.boxLong(((GetWaterMarkResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(maxWaterMark)).getWaterMark());
    }

    private final String getPhoneId() {
        return (String) this.phoneId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mFitnessGson_delegate$lambda$0() {
        return new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String phoneId_delegate$lambda$1() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getUniqueIdentify();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteFitnessData(@NotNull List<FitnessDataKey> list, @NotNull Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objDeleteFitnessData = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeleteFitnessData);
            String json = getMFitnessGson().toJson(new DeleteFitnessData(getPhoneId(), list));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            anonymousClass1.label = 1;
            objDeleteFitnessData = mService.deleteFitnessData(json, anonymousClass1);
            if (objDeleteFitnessData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeleteFitnessData);
        }
        return Boxing.boxBoolean(((DataBooleanResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objDeleteFitnessData)).getResult());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteMedicalData(@NotNull List<FitnessDataKey> list, @NotNull Continuation<? super Boolean> continuation) {
        C16571 c16571;
        if (continuation instanceof C16571) {
            c16571 = (C16571) continuation;
            int i = c16571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16571.label = i - Integer.MIN_VALUE;
            } else {
                c16571 = new C16571(continuation);
            }
        } else {
            c16571 = new C16571(continuation);
        }
        Object objDeleteMedicalData = c16571.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeleteMedicalData);
            String json = getMFitnessGson().toJson(new DeleteFitnessData(getPhoneId(), list));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16571.label = 1;
            objDeleteMedicalData = mService.deleteMedicalData(json, c16571);
            if (objDeleteMedicalData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeleteMedicalData);
        }
        return Boxing.boxBoolean(((DataBooleanResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objDeleteMedicalData)).getResult());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteProjectData(@NotNull List<ProjectDataKey> list, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        C16581 c16581;
        if (continuation instanceof C16581) {
            c16581 = (C16581) continuation;
            int i = c16581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16581.label = i - Integer.MIN_VALUE;
            } else {
                c16581 = new C16581(continuation);
            }
        } else {
            c16581 = new C16581(continuation);
        }
        Object objDeleteProjectData = c16581.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16581.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeleteProjectData);
            String json = getMFitnessGson().toJson(new DeleteProjectParams(getPhoneId(), list));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16581.label = 1;
            objDeleteProjectData = mService.deleteProjectData(json, c16581);
            if (objDeleteProjectData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeleteProjectData);
        }
        Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objDeleteProjectData);
        Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fit.fitness.persist.server.data.UpProjectResponse");
        return Boxing.boxBoolean(((UpProjectResponse) objHandleResponse).getSuccess());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteSportReports(@NotNull List<FitnessDataKey> list, @NotNull Continuation<? super Boolean> continuation) {
        C16591 c16591;
        if (continuation instanceof C16591) {
            c16591 = (C16591) continuation;
            int i = c16591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16591.label = i - Integer.MIN_VALUE;
            } else {
                c16591 = new C16591(continuation);
            }
        } else {
            c16591 = new C16591(continuation);
        }
        Object objDeleteSportRecords = c16591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeleteSportRecords);
            String json = getMFitnessGson().toJson(new DeleteFitnessData(getPhoneId(), list));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16591.label = 1;
            objDeleteSportRecords = mService.deleteSportRecords(json, c16591);
            if (objDeleteSportRecords == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeleteSportRecords);
        }
        return Boxing.boxBoolean(((DataBooleanResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objDeleteSportRecords)).getResult());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteStatData(@NotNull List<StatDataKey> list, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        C16601 c16601;
        if (continuation instanceof C16601) {
            c16601 = (C16601) continuation;
            int i = c16601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16601.label = i - Integer.MIN_VALUE;
            } else {
                c16601 = new C16601(continuation);
            }
        } else {
            c16601 = new C16601(continuation);
        }
        Object objDeleteStatData = c16601.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16601.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeleteStatData);
            String json = getMFitnessGson().toJson(new DeleteStatParams(list));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16601.label = 1;
            objDeleteStatData = mService.deleteStatData(json, c16601);
            if (objDeleteStatData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objDeleteStatData);
        }
        Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objDeleteStatData);
        Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fit.fitness.persist.server.data.DeleteStatResponse");
        return Boxing.boxBoolean(((DeleteStatResponse) objHandleResponse).getSuccess());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAggregatedDataByTime(@NotNull AggregateFitnessDataByTimeParam aggregateFitnessDataByTimeParam, @NotNull Continuation<? super AggregateFitnessDataByTime> continuation) {
        C16611 c16611;
        if (continuation instanceof C16611) {
            c16611 = (C16611) continuation;
            int i = c16611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16611.label = i - Integer.MIN_VALUE;
            } else {
                c16611 = new C16611(continuation);
            }
        } else {
            c16611 = new C16611(continuation);
        }
        Object aggregatedDataByTime = c16611.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16611.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(aggregatedDataByTime);
            String json = getMFitnessGson().toJson(aggregateFitnessDataByTimeParam);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16611.label = 1;
            aggregatedDataByTime = mService.getAggregatedDataByTime(json, c16611);
            if (aggregatedDataByTime == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(aggregatedDataByTime);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(aggregatedDataByTime);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAggregatedDataByWM(@NotNull String str, long j, int i, @NotNull Continuation<? super AggregateFitnessDataByWaterMark> continuation) {
        C16621 c16621;
        if (continuation instanceof C16621) {
            c16621 = (C16621) continuation;
            int i2 = c16621.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16621.label = i2 - Integer.MIN_VALUE;
            } else {
                c16621 = new C16621(continuation);
            }
        } else {
            c16621 = new C16621(continuation);
        }
        Object aggregatedDataByWM = c16621.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c16621.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(aggregatedDataByWM);
            String json = getMFitnessGson().toJson(new AggregateFitnessDataByWaterMarkParam(str, j, getPhoneId(), Boxing.boxInt(i)));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16621.label = 1;
            aggregatedDataByWM = mService.getAggregatedDataByWM(json, c16621);
            if (aggregatedDataByWM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(aggregatedDataByWM);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(aggregatedDataByWM);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getFitnessDataByTime(@NotNull GetFitnessDataByTime getFitnessDataByTime, @NotNull Continuation<? super FitnessDataResultByTime> continuation) {
        C16631 c16631;
        if (continuation instanceof C16631) {
            c16631 = (C16631) continuation;
            int i = c16631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16631.label = i - Integer.MIN_VALUE;
            } else {
                c16631 = new C16631(continuation);
            }
        } else {
            c16631 = new C16631(continuation);
        }
        Object fitnessDataByTime = c16631.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16631.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(fitnessDataByTime);
            String json = getMFitnessGson().toJson(getFitnessDataByTime);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16631.label = 1;
            fitnessDataByTime = mService.getFitnessDataByTime(json, c16631);
            if (fitnessDataByTime == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(fitnessDataByTime);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(fitnessDataByTime);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getFitnessDataByWM(long j, @NotNull Continuation<? super FitnessDataResultByWM> continuation) {
        C16641 c16641;
        if (continuation instanceof C16641) {
            c16641 = (C16641) continuation;
            int i = c16641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16641.label = i - Integer.MIN_VALUE;
            } else {
                c16641 = new C16641(continuation);
            }
        } else {
            c16641 = new C16641(continuation);
        }
        Object fitnessDataByWM = c16641.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(fitnessDataByWM);
            String json = getMFitnessGson().toJson(new GetFitnessDataByWM(getPhoneId(), j));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16641.label = 1;
            fitnessDataByWM = mService.getFitnessDataByWM(json, c16641);
            if (fitnessDataByWM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(fitnessDataByWM);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(fitnessDataByWM);
    }

    @Nullable
    public final Object getFitnessDataMaxWM(@NotNull Continuation<? super Long> continuation) {
        return getMaxWaterMark(0, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getLatestFitnessData(@NotNull List<LatestFitnessDataModel> list, @NotNull Continuation<? super LatestFitnessData> continuation) {
        C16651 c16651;
        if (continuation instanceof C16651) {
            c16651 = (C16651) continuation;
            int i = c16651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16651.label = i - Integer.MIN_VALUE;
            } else {
                c16651 = new C16651(continuation);
            }
        } else {
            c16651 = new C16651(continuation);
        }
        Object latestFitnessData = c16651.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16651.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(latestFitnessData);
            String json = getMFitnessGson().toJson(new LatestFitnessDataParam(list));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16651.label = 1;
            latestFitnessData = mService.getLatestFitnessData(json, c16651);
            if (latestFitnessData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(latestFitnessData);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(latestFitnessData);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getLatestMedicalData(@NotNull List<LatestFitnessDataModel> list, @NotNull Continuation<? super LatestFitnessData> continuation) {
        C16661 c16661;
        if (continuation instanceof C16661) {
            c16661 = (C16661) continuation;
            int i = c16661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16661.label = i - Integer.MIN_VALUE;
            } else {
                c16661 = new C16661(continuation);
            }
        } else {
            c16661 = new C16661(continuation);
        }
        Object latestMedicalData = c16661.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16661.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(latestMedicalData);
            String json = getMFitnessGson().toJson(new LatestFitnessDataParam(list));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16661.label = 1;
            latestMedicalData = mService.getLatestMedicalData(json, c16661);
            if (latestMedicalData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(latestMedicalData);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(latestMedicalData);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getLatestSportReport(@Nullable Long l, @NotNull Continuation<? super LatestSportReport> continuation) {
        C16671 c16671;
        if (continuation instanceof C16671) {
            c16671 = (C16671) continuation;
            int i = c16671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16671.label = i - Integer.MIN_VALUE;
            } else {
                c16671 = new C16671(continuation);
            }
        } else {
            c16671 = new C16671(continuation);
        }
        Object latestSportReport = c16671.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16671.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(latestSportReport);
            String json = getMFitnessGson().toJson(new LatestSportReportParam(l));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16671.label = 1;
            latestSportReport = mService.getLatestSportReport(json, c16671);
            if (latestSportReport == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(latestSportReport);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(latestSportReport);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getMedicalDataByTime(@NotNull GetFitnessDataByTime getFitnessDataByTime, @NotNull Continuation<? super FitnessDataResultByTime> continuation) {
        C16691 c16691;
        if (continuation instanceof C16691) {
            c16691 = (C16691) continuation;
            int i = c16691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16691.label = i - Integer.MIN_VALUE;
            } else {
                c16691 = new C16691(continuation);
            }
        } else {
            c16691 = new C16691(continuation);
        }
        Object medicalDataByTime = c16691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16691.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(medicalDataByTime);
            String json = getMFitnessGson().toJson(getFitnessDataByTime);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16691.label = 1;
            medicalDataByTime = mService.getMedicalDataByTime(json, c16691);
            if (medicalDataByTime == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(medicalDataByTime);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(medicalDataByTime);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getMedicalDataByWM(long j, @NotNull Continuation<? super FitnessDataResultByWM> continuation) {
        C16701 c16701;
        if (continuation instanceof C16701) {
            c16701 = (C16701) continuation;
            int i = c16701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16701.label = i - Integer.MIN_VALUE;
            } else {
                c16701 = new C16701(continuation);
            }
        } else {
            c16701 = new C16701(continuation);
        }
        Object medicalDataByWM = c16701.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16701.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(medicalDataByWM);
            String json = getMFitnessGson().toJson(new GetFitnessDataByWM(getPhoneId(), j));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16701.label = 1;
            medicalDataByWM = mService.getMedicalDataByWM(json, c16701);
            if (medicalDataByWM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(medicalDataByWM);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(medicalDataByWM);
    }

    @Nullable
    public final Object getMedicalDataMaxWM(@NotNull Continuation<? super Long> continuation) {
        return getMaxWaterMark(5, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProjectDataByTime(@NotNull GetProjectByTimeParams getProjectByTimeParams, @NotNull Continuation<? super GetProjectByTimeResponse> continuation) {
        C16711 c16711;
        if (continuation instanceof C16711) {
            c16711 = (C16711) continuation;
            int i = c16711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16711.label = i - Integer.MIN_VALUE;
            } else {
                c16711 = new C16711(continuation);
            }
        } else {
            c16711 = new C16711(continuation);
        }
        Object projectDataByTime = c16711.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(projectDataByTime);
            String json = getMFitnessGson().toJson(getProjectByTimeParams);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16711.label = 1;
            projectDataByTime = mService.getProjectDataByTime(json, c16711);
            if (projectDataByTime == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(projectDataByTime);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(projectDataByTime);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProjectDataByWM(@Nullable Long l, @NotNull Continuation<? super GetProjectByWMResponse> continuation) {
        C16721 c16721;
        if (continuation instanceof C16721) {
            c16721 = (C16721) continuation;
            int i = c16721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16721.label = i - Integer.MIN_VALUE;
            } else {
                c16721 = new C16721(continuation);
            }
        } else {
            c16721 = new C16721(continuation);
        }
        Object projectDataByWM = c16721.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16721.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(projectDataByWM);
            String json = getMFitnessGson().toJson(new GetProjectByWMParams(getPhoneId(), l, 0, 4, null));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16721.label = 1;
            projectDataByWM = mService.getProjectDataByWM(json, c16721);
            if (projectDataByWM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(projectDataByWM);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(projectDataByWM);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getProjectMaxWaterMark(@NotNull Continuation<? super Long> continuation) throws IOException {
        C16731 c16731;
        if (continuation instanceof C16731) {
            c16731 = (C16731) continuation;
            int i = c16731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16731.label = i - Integer.MIN_VALUE;
            } else {
                c16731 = new C16731(continuation);
            }
        } else {
            c16731 = new C16731(continuation);
        }
        Object projectMaxWaterMark = c16731.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(projectMaxWaterMark);
            FitnessApiService mService = getMService();
            c16731.label = 1;
            projectMaxWaterMark = mService.getProjectMaxWaterMark(c16731);
            if (projectMaxWaterMark == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(projectMaxWaterMark);
        }
        Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(projectMaxWaterMark);
        Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fit.fitness.persist.server.data.GetProjectMaxWMResponse");
        return Boxing.boxLong(((GetProjectMaxWMResponse) objHandleResponse).getWatermark());
    }

    @Nullable
    public final Object getRainbowMaxWM(@NotNull Continuation<? super Long> continuation) {
        return getMaxWaterMark(3, continuation);
    }

    @Nullable
    public final Object getRedPointMaxWM(@NotNull Continuation<? super Long> continuation) {
        return getMaxWaterMark(2, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRelativeAggregatedData(@NotNull GetDetailDataParam getDetailDataParam, @NotNull Continuation<? super GetRelativeDataResult> continuation) {
        C16741 c16741;
        if (continuation instanceof C16741) {
            c16741 = (C16741) continuation;
            int i = c16741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16741.label = i - Integer.MIN_VALUE;
            } else {
                c16741 = new C16741(continuation);
            }
        } else {
            c16741 = new C16741(continuation);
        }
        Object relativeAggregatedData = c16741.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16741.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(relativeAggregatedData);
            String json = getMFitnessGson().toJson(getDetailDataParam);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16741.label = 1;
            relativeAggregatedData = mService.getRelativeAggregatedData(json, c16741);
            if (relativeAggregatedData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(relativeAggregatedData);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(relativeAggregatedData);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRelativeFitnessData(@NotNull GetDetailDataParam getDetailDataParam, @NotNull Continuation<? super GetRelativeDataResult> continuation) {
        C16751 c16751;
        if (continuation instanceof C16751) {
            c16751 = (C16751) continuation;
            int i = c16751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16751.label = i - Integer.MIN_VALUE;
            } else {
                c16751 = new C16751(continuation);
            }
        } else {
            c16751 = new C16751(continuation);
        }
        Object relativeFitnessData = c16751.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(relativeFitnessData);
            String json = getMFitnessGson().toJson(getDetailDataParam);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16751.label = 1;
            relativeFitnessData = mService.getRelativeFitnessData(json, c16751);
            if (relativeFitnessData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(relativeFitnessData);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(relativeFitnessData);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getRelativeLatestData(long j, @NotNull Continuation<? super GetRelativeDataResult> continuation) {
        C16761 c16761;
        if (continuation instanceof C16761) {
            c16761 = (C16761) continuation;
            int i = c16761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16761.label = i - Integer.MIN_VALUE;
            } else {
                c16761 = new C16761(continuation);
            }
        } else {
            c16761 = new C16761(continuation);
        }
        Object relativeLatestData = c16761.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16761.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(relativeLatestData);
            String json = getMFitnessGson().toJson(new GetLatestDataParam(j));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16761.label = 1;
            relativeLatestData = mService.getRelativeLatestData(json, c16761);
            if (relativeLatestData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(relativeLatestData);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(relativeLatestData);
    }

    @Nullable
    public final Object getSportMaxWatermark(@NotNull Continuation<? super Long> continuation) {
        return getMaxWaterMark(1, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSportReportsByTime(@NotNull GetSportReportByTime getSportReportByTime, @NotNull Continuation<? super SportReportResultByTime> continuation) {
        C16771 c16771;
        if (continuation instanceof C16771) {
            c16771 = (C16771) continuation;
            int i = c16771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16771.label = i - Integer.MIN_VALUE;
            } else {
                c16771 = new C16771(continuation);
            }
        } else {
            c16771 = new C16771(continuation);
        }
        Object sportRecordsByTime = c16771.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(sportRecordsByTime);
            String json = getMFitnessGson().toJson(getSportReportByTime);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16771.label = 1;
            sportRecordsByTime = mService.getSportRecordsByTime(json, c16771);
            if (sportRecordsByTime == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(sportRecordsByTime);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(sportRecordsByTime);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSportReportsByWM(long j, @NotNull Continuation<? super SportReportResultByWM> continuation) {
        C16781 c16781;
        if (continuation instanceof C16781) {
            c16781 = (C16781) continuation;
            int i = c16781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16781.label = i - Integer.MIN_VALUE;
            } else {
                c16781 = new C16781(continuation);
            }
        } else {
            c16781 = new C16781(continuation);
        }
        Object sportRecordsByWM = c16781.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16781.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(sportRecordsByWM);
            String json = getMFitnessGson().toJson(new GetSportReportByWM(getPhoneId(), j, null));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16781.label = 1;
            sportRecordsByWM = mService.getSportRecordsByWM(json, c16781);
            if (sportRecordsByWM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(sportRecordsByWM);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(sportRecordsByWM);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getStatDataByTime(@NotNull GetStatByTimeParams getStatByTimeParams, @NotNull Continuation<? super GetStatByTimeResponse> continuation) {
        C16791 c16791;
        if (continuation instanceof C16791) {
            c16791 = (C16791) continuation;
            int i = c16791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16791.label = i - Integer.MIN_VALUE;
            } else {
                c16791 = new C16791(continuation);
            }
        } else {
            c16791 = new C16791(continuation);
        }
        Object statDataByTime = c16791.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16791.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(statDataByTime);
            String json = getMFitnessGson().toJson(getStatByTimeParams);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16791.label = 1;
            statDataByTime = mService.getStatDataByTime(json, c16791);
            if (statDataByTime == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(statDataByTime);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(statDataByTime);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getStatDataByWM(@NotNull GetStatByWMParams getStatByWMParams, @NotNull Continuation<? super GetStatByWMResponse> continuation) {
        C16801 c16801;
        if (continuation instanceof C16801) {
            c16801 = (C16801) continuation;
            int i = c16801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16801.label = i - Integer.MIN_VALUE;
            } else {
                c16801 = new C16801(continuation);
            }
        } else {
            c16801 = new C16801(continuation);
        }
        Object statDataByWM = c16801.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16801.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(statDataByWM);
            String json = getMFitnessGson().toJson(getStatByWMParams);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16801.label = 1;
            statDataByWM = mService.getStatDataByWM(json, c16801);
            if (statDataByWM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(statDataByWM);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(statDataByWM);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getStatMaxWaterMark(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Long> continuation) throws IOException {
        C16811 c16811;
        if (continuation instanceof C16811) {
            c16811 = (C16811) continuation;
            int i = c16811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16811.label = i - Integer.MIN_VALUE;
            } else {
                c16811 = new C16811(continuation);
            }
        } else {
            c16811 = new C16811(continuation);
        }
        Object statMaxWaterMark = c16811.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(statMaxWaterMark);
            String json = getMFitnessGson().toJson(new GetStatMaxWMParams(str, str2));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16811.label = 1;
            statMaxWaterMark = mService.getStatMaxWaterMark(json, c16811);
            if (statMaxWaterMark == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(statMaxWaterMark);
        }
        Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(statMaxWaterMark);
        Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fit.fitness.persist.server.data.GetMaxWMResponse");
        return Boxing.boxLong(((GetMaxWMResponse) objHandleResponse).getWatermark());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSwitchSongData(int i, @NotNull Continuation<? super List<GetSwitchSongItem>> continuation) throws JSONException, IOException {
        C16821 c16821;
        if (continuation instanceof C16821) {
            c16821 = (C16821) continuation;
            int i2 = c16821.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16821.label = i2 - Integer.MIN_VALUE;
            } else {
                c16821 = new C16821(continuation);
            }
        } else {
            c16821 = new C16821(continuation);
        }
        Object switchDanceData = c16821.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c16821.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(switchDanceData);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", String.valueOf(i));
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Logger.d(TAG, "getSwitchSongData params:" + string);
            FitnessApiService mService = getMService();
            c16821.label = 1;
            switchDanceData = mService.getSwitchDanceData(string, c16821);
            if (switchDanceData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(switchDanceData);
        }
        Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(switchDanceData);
        Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fit.fitness.persist.server.data.GetSwitchSongResult");
        return ((GetSwitchSongResult) objHandleResponse).getResultList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getWeekTrainingPlan(@NotNull Continuation<? super CurrentWeekPlan> continuation) throws IOException {
        C16831 c16831;
        if (continuation instanceof C16831) {
            c16831 = (C16831) continuation;
            int i = c16831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16831.label = i - Integer.MIN_VALUE;
            } else {
                c16831 = new C16831(continuation);
            }
        } else {
            c16831 = new C16831(continuation);
        }
        Object curWeekTrainingPlan = c16831.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(curWeekTrainingPlan);
            FitnessApiService mService = getMService();
            c16831.label = 1;
            curWeekTrainingPlan = mService.getCurWeekTrainingPlan(c16831);
            if (curWeekTrainingPlan == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(curWeekTrainingPlan);
        }
        Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(curWeekTrainingPlan);
        Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan_export.model.CurrentWeekPlan");
        return (CurrentWeekPlan) objHandleResponse;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object markMigrate(@NotNull MarkMigrate markMigrate, @NotNull Continuation<? super Boolean> continuation) {
        C16841 c16841;
        if (continuation instanceof C16841) {
            c16841 = (C16841) continuation;
            int i = c16841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16841.label = i - Integer.MIN_VALUE;
            } else {
                c16841 = new C16841(continuation);
            }
        } else {
            c16841 = new C16841(continuation);
        }
        Object objMigrateNotify = c16841.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16841.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMigrateNotify);
            String json = getMFitnessGson().toJson(markMigrate);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16841.label = 1;
            objMigrateNotify = mService.migrateNotify(json, c16841);
            if (objMigrateNotify == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMigrateNotify);
        }
        return Boxing.boxBoolean(((DataBooleanResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objMigrateNotify)).getResult());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object reportSportSyncInfo(@NotNull List<SportSyncInfo> list, @NotNull Continuation<? super Boolean> continuation) {
        C16851 c16851;
        if (continuation instanceof C16851) {
            c16851 = (C16851) continuation;
            int i = c16851.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16851.label = i - Integer.MIN_VALUE;
            } else {
                c16851 = new C16851(continuation);
            }
        } else {
            c16851 = new C16851(continuation);
        }
        Object objReportSportSyncInfo = c16851.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16851.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objReportSportSyncInfo);
            String json = getMFitnessGson().toJson(new UpSportSyncInfo(list));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16851.label = 1;
            objReportSportSyncInfo = mService.reportSportSyncInfo(json, c16851);
            if (objReportSportSyncInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objReportSportSyncInfo);
        }
        return Boxing.boxBoolean(((DataBooleanResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objReportSportSyncInfo)).getResult());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object syncHmDataToServer(@NotNull HMDataParams hMDataParams, @NotNull Continuation<? super Boolean> continuation) {
        C16861 c16861;
        if (continuation instanceof C16861) {
            c16861 = (C16861) continuation;
            int i = c16861.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16861.label = i - Integer.MIN_VALUE;
            } else {
                c16861 = new C16861(continuation);
            }
        } else {
            c16861 = new C16861(continuation);
        }
        Object objSyncHMDataToServer = c16861.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16861.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSyncHMDataToServer);
            String json = getMFitnessGson().toJson(hMDataParams);
            FitnessLogUtils.d(TAG, "syncHmDataToServer params=" + json);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16861.label = 1;
            objSyncHMDataToServer = mService.syncHMDataToServer(json, c16861);
            if (objSyncHMDataToServer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSyncHMDataToServer);
        }
        return Boxing.boxBoolean(((DataBooleanResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objSyncHMDataToServer)).getResult());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object syncThirdPartyDataToServer(@NotNull ThirdPartyDataParam thirdPartyDataParam, @NotNull Continuation<? super Boolean> continuation) {
        C16871 c16871;
        if (continuation instanceof C16871) {
            c16871 = (C16871) continuation;
            int i = c16871.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16871.label = i - Integer.MIN_VALUE;
            } else {
                c16871 = new C16871(continuation);
            }
        } else {
            c16871 = new C16871(continuation);
        }
        Object objSyncThirdPartyDataToServer = c16871.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16871.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSyncThirdPartyDataToServer);
            String json = getMFitnessGson().toJson(thirdPartyDataParam);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16871.label = 1;
            objSyncThirdPartyDataToServer = mService.syncThirdPartyDataToServer(json, c16871);
            if (objSyncThirdPartyDataToServer == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSyncThirdPartyDataToServer);
        }
        return Boxing.boxBoolean(((DataUploadResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objSyncThirdPartyDataToServer)).getResult());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object triggerStat(@NotNull TriggerStatParams triggerStatParams, @NotNull Continuation<? super TriggerStatResponse> continuation) {
        C16881 c16881;
        if (continuation instanceof C16881) {
            c16881 = (C16881) continuation;
            int i = c16881.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16881.label = i - Integer.MIN_VALUE;
            } else {
                c16881 = new C16881(continuation);
            }
        } else {
            c16881 = new C16881(continuation);
        }
        Object objTriggerStat = c16881.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16881.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTriggerStat);
            String json = getMFitnessGson().toJson(triggerStatParams);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16881.label = 1;
            objTriggerStat = mService.triggerStat(json, c16881);
            if (objTriggerStat == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTriggerStat);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objTriggerStat);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object upAggregatedData(@NotNull List<AggregateFitnessData> list, @NotNull Continuation<? super Boolean> continuation) {
        C16891 c16891;
        if (continuation instanceof C16891) {
            c16891 = (C16891) continuation;
            int i = c16891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16891.label = i - Integer.MIN_VALUE;
            } else {
                c16891 = new C16891(continuation);
            }
        } else {
            c16891 = new C16891(continuation);
        }
        Object objUpAggregatedData = c16891.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16891.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpAggregatedData);
            String json = getMFitnessGson().toJson(new AggregateRequestBody(getPhoneId(), list));
            FitnessLogUtils.d(TAG, "upAggregatedData params=" + json);
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16891.label = 1;
            objUpAggregatedData = mService.upAggregatedData(json, c16891);
            if (objUpAggregatedData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpAggregatedData);
        }
        return Boxing.boxBoolean(((DataBooleanResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpAggregatedData)).getResult());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object upProjectData(@NotNull List<ProjectDataModel> list, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        C16901 c16901;
        if (continuation instanceof C16901) {
            c16901 = (C16901) continuation;
            int i = c16901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16901.label = i - Integer.MIN_VALUE;
            } else {
                c16901 = new C16901(continuation);
            }
        } else {
            c16901 = new C16901(continuation);
        }
        Object objUpProjectData = c16901.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16901.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpProjectData);
            String json = getMFitnessGson().toJson(new UpProjectParams(getPhoneId(), list));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16901.label = 1;
            objUpProjectData = mService.upProjectData(json, c16901);
            if (objUpProjectData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUpProjectData);
        }
        Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpProjectData);
        Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fit.fitness.persist.server.data.UpProjectResponse");
        return Boxing.boxBoolean(((UpProjectResponse) objHandleResponse).getSuccess());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object uploadFitnessData(@NotNull List<FitnessDataModel> list, @NotNull Continuation<? super Boolean> continuation) {
        C16911 c16911;
        if (continuation instanceof C16911) {
            c16911 = (C16911) continuation;
            int i = c16911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16911.label = i - Integer.MIN_VALUE;
            } else {
                c16911 = new C16911(continuation);
            }
        } else {
            c16911 = new C16911(continuation);
        }
        Object objUploadFitnessData = c16911.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16911.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadFitnessData);
            String json = getMFitnessGson().toJson(new UploadFitnessDataParam(getPhoneId(), list));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16911.label = 1;
            objUploadFitnessData = mService.uploadFitnessData(json, c16911);
            if (objUploadFitnessData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUploadFitnessData);
        }
        return Boxing.boxBoolean(((DataBooleanResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUploadFitnessData)).getResult());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object uploadMedicalData(@NotNull List<FitnessDataModel> list, @NotNull Continuation<? super Boolean> continuation) {
        C16921 c16921;
        if (continuation instanceof C16921) {
            c16921 = (C16921) continuation;
            int i = c16921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16921.label = i - Integer.MIN_VALUE;
            } else {
                c16921 = new C16921(continuation);
            }
        } else {
            c16921 = new C16921(continuation);
        }
        Object objUploadMedicalData = c16921.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadMedicalData);
            String json = getMFitnessGson().toJson(new UploadFitnessDataParam(getPhoneId(), list));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16921.label = 1;
            objUploadMedicalData = mService.uploadMedicalData(json, c16921);
            if (objUploadMedicalData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUploadMedicalData);
        }
        return Boxing.boxBoolean(((DataBooleanResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUploadMedicalData)).getResult());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object uploadSportReports(@NotNull List<SportReportModel> list, @NotNull Continuation<? super Boolean> continuation) {
        C16931 c16931;
        if (continuation instanceof C16931) {
            c16931 = (C16931) continuation;
            int i = c16931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16931.label = i - Integer.MIN_VALUE;
            } else {
                c16931 = new C16931(continuation);
            }
        } else {
            c16931 = new C16931(continuation);
        }
        Object objUploadSportRecord = c16931.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadSportRecord);
            String json = getMFitnessGson().toJson(new UploadSportReportParam(getPhoneId(), list));
            FitnessApiService mService = getMService();
            Intrinsics.checkNotNull(json);
            c16931.label = 1;
            objUploadSportRecord = mService.uploadSportRecord(json, c16931);
            if (objUploadSportRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUploadSportRecord);
        }
        return Boxing.boxBoolean(((DataBooleanResult) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUploadSportRecord)).getResult());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object uploadSwitchSongData(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        C16941 c16941;
        if (continuation instanceof C16941) {
            c16941 = (C16941) continuation;
            int i = c16941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16941.label = i - Integer.MIN_VALUE;
            } else {
                c16941 = new C16941(continuation);
            }
        } else {
            c16941 = new C16941(continuation);
        }
        Object objUploadSwitchDanceData = c16941.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadSwitchDanceData);
            FitnessApiService mService = getMService();
            c16941.label = 1;
            objUploadSwitchDanceData = mService.uploadSwitchDanceData(str, c16941);
            if (objUploadSwitchDanceData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUploadSwitchDanceData);
        }
        Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUploadSwitchDanceData);
        Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fit.fitness.persist.server.data.UploadSwitchSongResult");
        return Boxing.boxBoolean(((UploadSwitchSongResult) objHandleResponse).getResult());
    }
}
