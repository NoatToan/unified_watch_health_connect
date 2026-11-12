package com.xiaomi.fitness.health.todayhealth.model;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import com.mi.fitness.persist.server.data.GetProjectByTimeParams;
import com.mi.fitness.persist.server.data.GetProjectByTimeResponse;
import com.mi.fitness.persist.server.data.ProjectDataModel;
import com.miui.tsmclient.entity.CardInfo;
import com.tencent.mmkv.MMKV;
import com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.api.repository.ISpo2Repository;
import com.xiaomi.fit.fitness.export.api.repository.IStressRepository;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.AmbulatoryBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.data.item.PpgMedicalItemReport;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.service.HealthCheckRequest;
import com.xiaomi.fitness.health.todayhealth.ui.holder.LongSleepHolder;
import com.xiaomi.fitness.health.todayhealth.ui.setting.HealthCheckSettingConfig;
import com.xiaomi.fitness.health.todayhealth.utils.HeartReportUtils;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.util.StressDataUtil;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.h4b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0080\u00012\u00020\u0001:\u0004\u0080\u0001\u0081\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0016J\u000e\u0010\\\u001a\u00020Y2\u0006\u0010]\u001a\u00020%J\u0014\u0010^\u001a\u00020Y2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010%H\u0002J\u0012\u0010_\u001a\u00020Y2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010%J\u0016\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:022\u0006\u0010]\u001a\u00020%J \u0010a\u001a\u00020Y2\u0006\u0010]\u001a\u00020%2\u000e\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0$H\u0002J\u0018\u0010c\u001a\u00020Y2\u0006\u0010d\u001a\u00020:2\u0006\u0010]\u001a\u00020%H\u0002J\u0018\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=022\b\b\u0002\u0010]\u001a\u00020%J \u0010f\u001a\u00020Y2\u0006\u0010]\u001a\u00020%2\u000e\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0$H\u0002J\u0018\u0010g\u001a\u00020Y2\u0006\u0010d\u001a\u00020=2\u0006\u0010]\u001a\u00020%H\u0002J\u0018\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@022\b\b\u0002\u0010]\u001a\u00020%J \u0010i\u001a\u00020Y2\u0006\u0010]\u001a\u00020%2\u000e\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0$H\u0002J\u0018\u0010j\u001a\u00020Y2\u0006\u0010d\u001a\u00020@2\u0006\u0010]\u001a\u00020%H\u0002J\u0018\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C022\b\b\u0002\u0010]\u001a\u00020%J \u0010l\u001a\u00020Y2\u0006\u0010]\u001a\u00020%2\u000e\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0$H\u0002J\u0010\u0010m\u001a\u00020Y2\u0006\u0010]\u001a\u00020%H\u0002J(\u0010n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0o2\u0006\u0010]\u001a\u00020%H\u0002J\u0016\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103022\u0006\u0010]\u001a\u00020%J\u0010\u0010q\u001a\u00020Y2\b\u0010r\u001a\u0004\u0018\u000103J\u0012\u0010s\u001a\u00020Y2\b\u0010t\u001a\u0004\u0018\u000107H\u0002J\u0016\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107022\u0006\u0010]\u001a\u00020%J\f\u0010v\u001a\b\u0012\u0004\u0012\u00020x0wJV\u0010y\u001aH\u0012D\u0012B\u0012\u0004\u0012\u00020G\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020G\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0H0Kj \u0012\u0004\u0012\u00020G\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020G\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0H`F0$2\b\b\u0002\u0010]\u001a\u00020%J2\u0010z\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00150Kj\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u0015`F0$2\b\b\u0002\u0010]\u001a\u00020%J\b\u0010{\u001a\u0004\u0018\u00010xJ\u000e\u0010|\u001a\u00020Y2\u0006\u0010}\u001a\u00020xJ\f\u0010~\u001a\b\u0012\u0004\u0012\u00020x0\u007fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\n !*\u0004\u0018\u00010 0 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\"\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-R%\u00100\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001030201¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R%\u00106\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001070201¢\u0006\b\n\u0000\u001a\u0004\b8\u00105R%\u00109\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010:0201¢\u0006\b\n\u0000\u001a\u0004\b;\u00105R%\u0010<\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0201¢\u0006\b\n\u0000\u001a\u0004\b>\u00105R%\u0010?\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010@0201¢\u0006\b\n\u0000\u001a\u0004\bA\u00105R%\u0010B\u001a\u0016\u0012\u0004\u0012\u00020%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010C0201¢\u0006\b\n\u0000\u001a\u0004\bD\u00105Re\u0010E\u001aV\u0012\u0004\u0012\u00020%\u0012L\u0012J\u0012D\u0012B\u0012\u0004\u0012\u00020G\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020G\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0H0Kj \u0012\u0004\u0012\u00020G\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020G\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0H`F\u0018\u00010$01¢\u0006\b\n\u0000\u001a\u0004\bL\u00105R?\u0010M\u001a0\u0012\u0004\u0012\u00020%\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00150Kj\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u0015`F0$01¢\u0006\b\n\u0000\u001a\u0004\bN\u00105R\u001c\u0010O\u001a\u0004\u0018\u00010PX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010U\u001a\u0004\u0018\u00010PX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010R\"\u0004\bW\u0010T¨\u0006\u0082\u0001²\u0006\u0013\u0010\u0083\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030$X\u008a\u0084\u0002²\u0006\u0013\u0010\u0083\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070$X\u008a\u0084\u0002"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "hrRepository", "Lcom/xiaomi/fit/fitness/export/api/repository/IHeartRateRepository;", "getHrRepository", "()Lcom/xiaomi/fit/fitness/export/api/repository/IHeartRateRepository;", "spo2Repository", "Lcom/xiaomi/fit/fitness/export/api/repository/ISpo2Repository;", "getSpo2Repository", "()Lcom/xiaomi/fit/fitness/export/api/repository/ISpo2Repository;", "sleepRepository", "Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "getSleepRepository", "()Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "stressRepository", "Lcom/xiaomi/fit/fitness/export/api/repository/IStressRepository;", "getStressRepository", "()Lcom/xiaomi/fit/fitness/export/api/repository/IStressRepository;", "forceRefreshAll", "", "getForceRefreshAll", "()Z", "setForceRefreshAll", "(Z)V", "isRedraw", "()Ljava/lang/Boolean;", "setRedraw", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "mmkv", "Lcom/tencent/mmkv/MMKV;", "kotlin.jvm.PlatformType", "Lcom/tencent/mmkv/MMKV;", "localSelectDay", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/joda/time/LocalDate;", "getLocalSelectDay", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setLocalSelectDay", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "healthCheckRequest", "Lcom/xiaomi/fitness/health/todayhealth/service/HealthCheckRequest;", "getHealthCheckRequest", "()Lcom/xiaomi/fitness/health/todayhealth/service/HealthCheckRequest;", "healthCheckRequest$delegate", "Lkotlin/Lazy;", "cacheHeartDateMap", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel$CachedMap;", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/xiaomi/fitness/health/todayhealth/model/DailyHrHealthReport;", "getCacheHeartDateMap", "()Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel$CachedMap;", "cacheBloodPressureDateMap", "Lcom/xiaomi/fit/fitness/export/data/item/AmbulatoryBloodPressureReport;", "getCacheBloodPressureDateMap", "cacheHeartRateDateMap", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "getCacheHeartRateDateMap", "cacheSpo2DateMap", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "getCacheSpo2DateMap", "cacheSleepDateMap", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "getCacheSleepDateMap", "cacheStressDateMap", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "getCacheStressDateMap", "cacheRiskDateMap", "Lkotlin/collections/HashMap;", "", "", "", "", "Ljava/util/HashMap;", "getCacheRiskDateMap", "cacheCheckedDateMap", "getCacheCheckedDateMap", "summaryCollectJob", "Lkotlinx/coroutines/Job;", "getSummaryCollectJob", "()Lkotlinx/coroutines/Job;", "setSummaryCollectJob", "(Lkotlinx/coroutines/Job;)V", "healthObservationJob", "getHealthObservationJob", "setHealthObservationJob", LifecycleConstantKt.ON_DESTROY, "", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "refreshData", DialWidgetType.DATE, "fetchData", "cleanCache", "getHeartRateData", "fetchHeartRateData", "flow", "processHeartRateRiskData", "report", "getSpo2Data", "fetchSpo2Data", "processSpo2RiskData", "getSleepData", "fetchSleepData", "processSleepRiskData", "getStressData", "fetchStressData", "processStressRiskData", "detectStressAbnormalRecords", "Lkotlin/Pair;", "getDailyHrHealthReportByDate", "updateHeartHealthRiskItem", "dailyHeartReport", "setBloodPressureRiskData", "ambulatoryBloodPressureReport", "getAmbulatoryBloodPressureReportByDate", "getMeasureReminderDataFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckMeasureReminderSettingData;", "getRiskDateMapStateFlowByDate", "getCheckedItemMapStateFlowByDate", "getMeasureReminderData", "updateMeasureRemindData", "reminderData", "getMeasureRemindDataLiveData", "Landroidx/lifecycle/LiveData;", "Companion", "CachedMap", "health_chinaProductRelease", "reportStateFlow"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthCheckViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCheckViewModel.kt\ncom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,960:1\n230#2,5:961\n230#2,5:966\n230#2,5:972\n230#2,5:977\n230#2,5:982\n230#2,5:987\n230#2,5:992\n230#2,5:997\n230#2,5:1002\n230#2,5:1007\n230#2,5:1046\n230#2,5:1054\n1#3:971\n216#4:1012\n217#4:1041\n808#5,11:1013\n1863#5,2:1024\n808#5,11:1026\n1863#5:1037\n1863#5,2:1038\n1864#5:1040\n1010#5,2:1042\n1010#5,2:1044\n774#5:1051\n865#5,2:1052\n*S KotlinDebug\n*F\n+ 1 HealthCheckViewModel.kt\ncom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel\n*L\n298#1:961,5\n305#1:966,5\n365#1:972,5\n439#1:977,5\n446#1:982,5\n460#1:987,5\n471#1:992,5\n485#1:997,5\n494#1:1002,5\n576#1:1007,5\n786#1:1046,5\n818#1:1054,5\n596#1:1012\n596#1:1041\n600#1:1013,11\n600#1:1024,2\n610#1:1026,11\n610#1:1037\n611#1:1038,2\n610#1:1040\n633#1:1042,2\n634#1:1044,2\n790#1:1051\n790#1:1052,2\n*E\n"})
public final class HealthCheckViewModel extends BasicDataViewModel {

    @NotNull
    public static final String TAG = "HealthCheckViewModel";

    @NotNull
    private final CachedMap<LocalDate, StateFlow<AmbulatoryBloodPressureReport>> cacheBloodPressureDateMap;

    @NotNull
    private final CachedMap<LocalDate, MutableStateFlow<HashMap<Integer, Boolean>>> cacheCheckedDateMap;

    @NotNull
    private final CachedMap<LocalDate, StateFlow<DailyHrHealthReport>> cacheHeartDateMap;

    @NotNull
    private final CachedMap<LocalDate, StateFlow<DailyHrReport>> cacheHeartRateDateMap;

    @NotNull
    private final CachedMap<LocalDate, MutableStateFlow<HashMap<Integer, Map<Integer, List<Object>>>>> cacheRiskDateMap;

    @NotNull
    private final CachedMap<LocalDate, StateFlow<SleepSegmentReport>> cacheSleepDateMap;

    @NotNull
    private final CachedMap<LocalDate, StateFlow<DailySpo2Report>> cacheSpo2DateMap;

    @NotNull
    private final CachedMap<LocalDate, StateFlow<DailyStressReport>> cacheStressDateMap;
    private boolean forceRefreshAll;

    /* JADX INFO: renamed from: healthCheckRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthCheckRequest;

    @Nullable
    private Job healthObservationJob;

    @NotNull
    private final IHeartRateRepository hrRepository;

    @Nullable
    private Boolean isRedraw;

    @NotNull
    private MutableStateFlow<LocalDate> localSelectDay;
    private final MMKV mmkv;

    @NotNull
    private final ISleepRepository sleepRepository;

    @NotNull
    private final ISpo2Repository spo2Repository;

    @NotNull
    private final IStressRepository stressRepository;

    @Nullable
    private Job summaryCollectJob;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$1", f = "HealthCheckViewModel.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HealthCheckViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<LocalDate> localSelectDay = HealthCheckViewModel.this.getLocalSelectDay();
                final HealthCheckViewModel healthCheckViewModel = HealthCheckViewModel.this;
                FlowCollector<? super LocalDate> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((LocalDate) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(LocalDate localDate, Continuation<? super Unit> continuation) {
                        healthCheckViewModel.fetchData(localDate);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (localSelectDay.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u001e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004j\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002`\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\fH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel$CachedMap;", "K", "V", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "maxSize", "", "<init>", "(I)V", "removeEldestEntry", "", "eldest", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CachedMap<K, V> extends LinkedHashMap<K, V> {
        private final int maxSize;

        public CachedMap() {
            this(0, 1, null);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
            return (Set<Map.Entry<K, V>>) getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, Object>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<Object> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<K> keySet() {
            return (Set<K>) getKeys();
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(@Nullable Map.Entry<K, V> eldest) {
            return size() > this.maxSize;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<V> values() {
            return (Collection<V>) getValues();
        }

        public /* synthetic */ CachedMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 7 : i);
        }

        public CachedMap(int i) {
            super(i, 0.75f, true);
            this.maxSize = i;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$fetchData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$fetchData$1", f = "HealthCheckViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalDate $date;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25591(LocalDate localDate, Continuation<? super C25591> continuation) {
            super(2, continuation);
            this.$date = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HealthCheckViewModel.this.new C25591(this.$date, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
                HealthCheckViewModel.this.getDailyHrHealthReportByDate(this.$date);
                HealthCheckViewModel.this.getAmbulatoryBloodPressureReportByDate(this.$date);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$fetchHeartRateData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$fetchHeartRateData$1", f = "HealthCheckViewModel.kt", i = {}, l = {SportSummary.VERSION_102}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalDate $date;
        final /* synthetic */ MutableStateFlow<DailyHrReport> $flow;
        int label;
        final /* synthetic */ HealthCheckViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25601(LocalDate localDate, HealthCheckViewModel healthCheckViewModel, MutableStateFlow<DailyHrReport> mutableStateFlow, Continuation<? super C25601> continuation) {
            super(2, continuation);
            this.$date = localDate;
            this.this$0 = healthCheckViewModel;
            this.$flow = mutableStateFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25601(this.$date, this.this$0, this.$flow, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowAsFlow = FlowLiveDataConversions.asFlow(IRepository.DefaultImpls.getReportList$default(this.this$0.getHrRepository(), null, "days", TimeDateUtil.changZeroOfTheDay(this.$date), 0, 0, false, 32, null));
                    final HealthCheckViewModel healthCheckViewModel = this.this$0;
                    final LocalDate localDate = this.$date;
                    final MutableStateFlow<DailyHrReport> mutableStateFlow = this.$flow;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel.fetchHeartRateData.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((List<DailyHrReport>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(List<DailyHrReport> list, Continuation<? super Unit> continuation) {
                            if (list.isEmpty()) {
                                return Unit.INSTANCE;
                            }
                            DailyHrReport dailyHrReport = (DailyHrReport) CollectionsKt___CollectionsKt.firstOrNull((List) list);
                            if (dailyHrReport == null) {
                                return Unit.INSTANCE;
                            }
                            healthCheckViewModel.processHeartRateRiskData(dailyHrReport, localDate);
                            mutableStateFlow.setValue(dailyHrReport);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowAsFlow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                Logger.i(HealthCheckViewModel.TAG, "Fetch heart rate failed", e);
                this.$flow.setValue(null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$fetchSleepData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$fetchSleepData$1", f = "HealthCheckViewModel.kt", i = {}, l = {399}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalDate $date;
        final /* synthetic */ MutableStateFlow<SleepSegmentReport> $flow;
        int label;
        final /* synthetic */ HealthCheckViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25611(LocalDate localDate, HealthCheckViewModel healthCheckViewModel, MutableStateFlow<SleepSegmentReport> mutableStateFlow, Continuation<? super C25611> continuation) {
            super(2, continuation);
            this.$date = localDate;
            this.this$0 = healthCheckViewModel;
            this.$flow = mutableStateFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25611(this.$date, this.this$0, this.$flow, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowAsFlow = FlowLiveDataConversions.asFlow(IRepository.DefaultImpls.getReportList$default(this.this$0.getSleepRepository(), null, "days", TimeDateUtil.changZeroOfTheDay(this.$date), 0, 0, false, 32, null));
                    final HealthCheckViewModel healthCheckViewModel = this.this$0;
                    final LocalDate localDate = this.$date;
                    final MutableStateFlow<SleepSegmentReport> mutableStateFlow = this.$flow;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel.fetchSleepData.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((List<AllDaySleepReport>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(List<AllDaySleepReport> list, Continuation<? super Unit> continuation) {
                            Object next;
                            T next2;
                            List<AllDaySleepReport> list2 = list;
                            if (list2 == null || list2.isEmpty()) {
                                return Unit.INSTANCE;
                            }
                            Iterator<T> it = list.iterator();
                            loop0: while (true) {
                                next = null;
                                if (!it.hasNext()) {
                                    next2 = (T) null;
                                    break;
                                }
                                next2 = it.next();
                                List<SleepSegmentReport> sleepSegments = ((AllDaySleepReport) next2).getSleepSegments();
                                if (sleepSegments != null) {
                                    List<SleepSegmentReport> list3 = sleepSegments;
                                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                        Iterator<T> it2 = list3.iterator();
                                        while (it2.hasNext()) {
                                            if (((SleepSegmentReport) it2.next()).getSleepDuration() >= 180) {
                                                break loop0;
                                            }
                                        }
                                    }
                                }
                            }
                            AllDaySleepReport allDaySleepReport = next2;
                            if (allDaySleepReport == null) {
                                return Unit.INSTANCE;
                            }
                            List<SleepSegmentReport> sleepSegments2 = allDaySleepReport.getSleepSegments();
                            if (sleepSegments2 != null) {
                                Iterator<T> it3 = sleepSegments2.iterator();
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (it3.hasNext()) {
                                        long wakeupTime = ((SleepSegmentReport) next).getWakeupTime();
                                        do {
                                            Object next3 = it3.next();
                                            long wakeupTime2 = ((SleepSegmentReport) next3).getWakeupTime();
                                            if (wakeupTime > wakeupTime2) {
                                                next = next3;
                                                wakeupTime = wakeupTime2;
                                            }
                                        } while (it3.hasNext());
                                    }
                                }
                                SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) next;
                                if (sleepSegmentReport != null) {
                                    healthCheckViewModel.processSleepRiskData(sleepSegmentReport, localDate);
                                    mutableStateFlow.setValue(sleepSegmentReport);
                                    return Unit.INSTANCE;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowAsFlow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                Logger.i(HealthCheckViewModel.TAG, "Fetch sleep data failed", e);
                this.$flow.setValue(null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$fetchSpo2Data$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$fetchSpo2Data$1", f = "HealthCheckViewModel.kt", i = {}, l = {338}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalDate $date;
        final /* synthetic */ MutableStateFlow<DailySpo2Report> $flow;
        int label;
        final /* synthetic */ HealthCheckViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25621(LocalDate localDate, HealthCheckViewModel healthCheckViewModel, MutableStateFlow<DailySpo2Report> mutableStateFlow, Continuation<? super C25621> continuation) {
            super(2, continuation);
            this.$date = localDate;
            this.this$0 = healthCheckViewModel;
            this.$flow = mutableStateFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25621(this.$date, this.this$0, this.$flow, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowAsFlow = FlowLiveDataConversions.asFlow(IRepository.DefaultImpls.getReportList$default(this.this$0.getSpo2Repository(), null, "days", TimeDateUtil.changZeroOfTheDay(this.$date), 0, 0, false, 32, null));
                    final HealthCheckViewModel healthCheckViewModel = this.this$0;
                    final LocalDate localDate = this.$date;
                    final MutableStateFlow<DailySpo2Report> mutableStateFlow = this.$flow;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel.fetchSpo2Data.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((List<DailySpo2Report>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(List<DailySpo2Report> list, Continuation<? super Unit> continuation) {
                            HashMap<Integer, Boolean> value;
                            HashMap<Integer, Boolean> map;
                            if (list.isEmpty()) {
                                return Unit.INSTANCE;
                            }
                            DailySpo2Report dailySpo2Report = (DailySpo2Report) CollectionsKt___CollectionsKt.firstOrNull((List) list);
                            if (dailySpo2Report == null) {
                                return Unit.INSTANCE;
                            }
                            MutableStateFlow<HashMap<Integer, Boolean>> checkedItemMapStateFlowByDate = healthCheckViewModel.getCheckedItemMapStateFlowByDate(localDate);
                            do {
                                value = checkedItemMapStateFlowByDate.getValue();
                                map = new HashMap<>(value);
                                map.put(Boxing.boxInt(13), Boxing.boxBoolean(true));
                            } while (!checkedItemMapStateFlowByDate.compareAndSet(value, map));
                            healthCheckViewModel.processSpo2RiskData(dailySpo2Report, localDate);
                            mutableStateFlow.setValue(dailySpo2Report);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowAsFlow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                Logger.i(HealthCheckViewModel.TAG, "Fetch SpO2 failed", e);
                this.$flow.setValue(null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$fetchStressData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$fetchStressData$1", f = "HealthCheckViewModel.kt", i = {}, l = {544}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalDate $date;
        final /* synthetic */ MutableStateFlow<DailyStressReport> $flow;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HealthCheckViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25631(LocalDate localDate, HealthCheckViewModel healthCheckViewModel, MutableStateFlow<DailyStressReport> mutableStateFlow, Continuation<? super C25631> continuation) {
            super(2, continuation);
            this.$date = localDate;
            this.this$0 = healthCheckViewModel;
            this.$flow = mutableStateFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25631 c25631 = new C25631(this.$date, this.this$0, this.$flow, continuation);
            c25631.L$0 = obj;
            return c25631;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Object obj2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                    if (obj2 == null) {
                        CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                        obj2 = Unit.INSTANCE;
                    }
                    Flow flowAsFlow = FlowLiveDataConversions.asFlow(IRepository.DefaultImpls.getReportList$default(this.this$0.getStressRepository(), ((WearableDeviceModel) obj2).getDid(), "days", TimeDateUtil.changZeroOfTheDay(this.$date), 0, 0, false, 32, null));
                    final HealthCheckViewModel healthCheckViewModel = this.this$0;
                    final LocalDate localDate = this.$date;
                    final MutableStateFlow<DailyStressReport> mutableStateFlow = this.$flow;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel.fetchStressData.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit((List<DailyStressReport>) obj3, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(List<DailyStressReport> list, Continuation<? super Unit> continuation) {
                            HashMap<Integer, Boolean> value;
                            HashMap<Integer, Boolean> map;
                            if (list.isEmpty()) {
                                return Unit.INSTANCE;
                            }
                            DailyStressReport dailyStressReport = (DailyStressReport) CollectionsKt___CollectionsKt.firstOrNull((List) list);
                            if (dailyStressReport == null) {
                                return Unit.INSTANCE;
                            }
                            MutableStateFlow<HashMap<Integer, Boolean>> checkedItemMapStateFlowByDate = healthCheckViewModel.getCheckedItemMapStateFlowByDate(localDate);
                            do {
                                value = checkedItemMapStateFlowByDate.getValue();
                                map = new HashMap<>(value);
                                map.put(Boxing.boxInt(7), Boxing.boxBoolean(true));
                            } while (!checkedItemMapStateFlowByDate.compareAndSet(value, map));
                            healthCheckViewModel.processStressRiskData(localDate);
                            mutableStateFlow.setValue(dailyStressReport);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowAsFlow.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                Logger.i(HealthCheckViewModel.TAG, "Fetch stress data failed", e);
                this.$flow.setValue(null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$getAmbulatoryBloodPressureReportByDate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$getAmbulatoryBloodPressureReportByDate$2", f = "HealthCheckViewModel.kt", i = {0}, l = {856}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nHealthCheckViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCheckViewModel.kt\ncom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel$getAmbulatoryBloodPressureReportByDate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,960:1\n1863#2:961\n1864#2:969\n381#3,7:962\n230#4,5:970\n*S KotlinDebug\n*F\n+ 1 HealthCheckViewModel.kt\ncom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel$getAmbulatoryBloodPressureReportByDate$2\n*L\n867#1:961\n867#1:969\n869#1:962,7\n886#1:970,5\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalDate $date;
        final /* synthetic */ Lazy<MutableStateFlow<AmbulatoryBloodPressureReport>> $reportStateFlow$delegate;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HealthCheckViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(LocalDate localDate, HealthCheckViewModel healthCheckViewModel, Lazy<? extends MutableStateFlow<AmbulatoryBloodPressureReport>> lazy, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$date = localDate;
            this.this$0 = healthCheckViewModel;
            this.$reportStateFlow$delegate = lazy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$date, this.this$0, this.$reportStateFlow$delegate, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.CoroutineScope] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.CoroutineScope] */
        /* JADX WARN: Type inference failed for: r2v6 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ?? r2;
            Object projectDataByTime;
            Object value;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r3 = this.label;
            try {
                if (r3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    long j = 1000;
                    long millis = (this.$date.toDateTimeAtStartOfDay(DateTimeZone.getDefault()).getMillis() / j) - 1;
                    long millis2 = (this.$date.plusDays(1).toDateTimeAtStartOfDay(DateTimeZone.getDefault()).getMillis() / j) - 1;
                    HealthCheckRequest healthCheckRequest = this.this$0.getHealthCheckRequest();
                    GetProjectByTimeParams getProjectByTimeParams = new GetProjectByTimeParams(ProjectPersistKey.AmbulatoryBloodPressureReport, Boxing.boxLong(millis), Boxing.boxLong(millis2), 0, true, null, 40, null);
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    projectDataByTime = healthCheckRequest.getProjectDataByTime(getProjectByTimeParams, this);
                    r3 = coroutineScope;
                    if (projectDataByTime == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (r3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    projectDataByTime = obj;
                    r3 = coroutineScope2;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<ProjectDataModel> dataList = ((GetProjectByTimeResponse) projectDataByTime).getDataList();
                if (dataList != null) {
                    for (ProjectDataModel projectDataModel : dataList) {
                        Object arrayList = linkedHashMap.get(ProjectPersistKey.AmbulatoryBloodPressureReport);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(ProjectPersistKey.AmbulatoryBloodPressureReport, arrayList);
                        }
                        AmbulatoryBloodPressureReport ambulatoryBloodPressureReport = (AmbulatoryBloodPressureReport) h4b.d(projectDataModel.getValue(), AmbulatoryBloodPressureReport.class);
                        List listAsMutableList = TypeIntrinsics.asMutableList((List) arrayList);
                        Intrinsics.checkNotNull(ambulatoryBloodPressureReport);
                        listAsMutableList.add(ambulatoryBloodPressureReport);
                    }
                }
                List list = (List) linkedHashMap.get(ProjectPersistKey.AmbulatoryBloodPressureReport);
                AmbulatoryBloodPressureReport ambulatoryBloodPressureReport2 = list != null ? (AmbulatoryBloodPressureReport) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
                Logger.i(HealthCheckViewModel.TAG, "date: " + this.$date + " , getAmbulatoryBloodPressureReportByDate: " + ambulatoryBloodPressureReport2);
                this.this$0.setBloodPressureRiskData(ambulatoryBloodPressureReport2);
                MutableStateFlow ambulatoryBloodPressureReportByDate$lambda$53 = HealthCheckViewModel.getAmbulatoryBloodPressureReportByDate$lambda$53(this.$reportStateFlow$delegate);
                do {
                    value = ambulatoryBloodPressureReportByDate$lambda$53.getValue();
                } while (!ambulatoryBloodPressureReportByDate$lambda$53.compareAndSet(value, ambulatoryBloodPressureReport2));
                this.this$0.getCacheBloodPressureDateMap().put(this.$date, FlowKt.asStateFlow(HealthCheckViewModel.getAmbulatoryBloodPressureReportByDate$lambda$53(this.$reportStateFlow$delegate)));
                r2 = r3;
            } catch (Exception e) {
                Logger.i(HealthCheckViewModel.TAG, "Failed to fetch daily report", e);
                r2 = r3;
            } finally {
                CoroutineScopeKt.cancel$default(r3, null, 1, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$getDailyHrHealthReportByDate$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$getDailyHrHealthReportByDate$2", f = "HealthCheckViewModel.kt", i = {0, 0}, l = {723}, m = "invokeSuspend", n = {"$this$launch", "startMillis"}, s = {"L$0", "J$0"})
    @SourceDebugExtension({"SMAP\nHealthCheckViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCheckViewModel.kt\ncom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel$getDailyHrHealthReportByDate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,960:1\n1863#2:961\n1863#2:962\n1864#2:977\n1864#2:978\n381#3,7:963\n381#3,7:970\n230#4,5:979\n*S KotlinDebug\n*F\n+ 1 HealthCheckViewModel.kt\ncom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel$getDailyHrHealthReportByDate$2\n*L\n727#1:961\n728#1:962\n728#1:977\n727#1:978\n732#1:963,7\n742#1:970,7\n766#1:979,5\n*E\n"})
    public static final class C25642 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalDate $date;
        final /* synthetic */ Lazy<MutableStateFlow<DailyHrHealthReport>> $reportStateFlow$delegate;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HealthCheckViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25642(LocalDate localDate, HealthCheckViewModel healthCheckViewModel, Lazy<? extends MutableStateFlow<DailyHrHealthReport>> lazy, Continuation<? super C25642> continuation) {
            super(2, continuation);
            this.$date = localDate;
            this.this$0 = healthCheckViewModel;
            this.$reportStateFlow$delegate = lazy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25642 c25642 = new C25642(this.$date, this.this$0, this.$reportStateFlow$delegate, continuation);
            c25642.L$0 = obj;
            return c25642;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00bd A[Catch: all -> 0x00f4, Exception -> 0x00f8, TryCatch #5 {Exception -> 0x00f8, all -> 0x00f4, blocks: (B:19:0x00aa, B:20:0x00b7, B:22:0x00bd, B:24:0x00c9, B:25:0x00cf, B:27:0x00d5, B:29:0x00e5, B:31:0x00eb, B:36:0x00fc, B:37:0x0115, B:39:0x011b, B:41:0x0121, B:42:0x0129, B:45:0x0146, B:46:0x0175, B:48:0x0182), top: B:65:0x00aa }] */
        /* JADX WARN: Code duplicated, block: B:24:0x00c9 A[Catch: all -> 0x00f4, Exception -> 0x00f8, TryCatch #5 {Exception -> 0x00f8, all -> 0x00f4, blocks: (B:19:0x00aa, B:20:0x00b7, B:22:0x00bd, B:24:0x00c9, B:25:0x00cf, B:27:0x00d5, B:29:0x00e5, B:31:0x00eb, B:36:0x00fc, B:37:0x0115, B:39:0x011b, B:41:0x0121, B:42:0x0129, B:45:0x0146, B:46:0x0175, B:48:0x0182), top: B:65:0x00aa }] */
        /* JADX WARN: Code duplicated, block: B:27:0x00d5 A[Catch: all -> 0x00f4, Exception -> 0x00f8, TryCatch #5 {Exception -> 0x00f8, all -> 0x00f4, blocks: (B:19:0x00aa, B:20:0x00b7, B:22:0x00bd, B:24:0x00c9, B:25:0x00cf, B:27:0x00d5, B:29:0x00e5, B:31:0x00eb, B:36:0x00fc, B:37:0x0115, B:39:0x011b, B:41:0x0121, B:42:0x0129, B:45:0x0146, B:46:0x0175, B:48:0x0182), top: B:65:0x00aa }] */
        /* JADX WARN: Code duplicated, block: B:29:0x00e5 A[Catch: all -> 0x00f4, Exception -> 0x00f8, TryCatch #5 {Exception -> 0x00f8, all -> 0x00f4, blocks: (B:19:0x00aa, B:20:0x00b7, B:22:0x00bd, B:24:0x00c9, B:25:0x00cf, B:27:0x00d5, B:29:0x00e5, B:31:0x00eb, B:36:0x00fc, B:37:0x0115, B:39:0x011b, B:41:0x0121, B:42:0x0129, B:45:0x0146, B:46:0x0175, B:48:0x0182), top: B:65:0x00aa }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00eb A[Catch: all -> 0x00f4, Exception -> 0x00f8, TryCatch #5 {Exception -> 0x00f8, all -> 0x00f4, blocks: (B:19:0x00aa, B:20:0x00b7, B:22:0x00bd, B:24:0x00c9, B:25:0x00cf, B:27:0x00d5, B:29:0x00e5, B:31:0x00eb, B:36:0x00fc, B:37:0x0115, B:39:0x011b, B:41:0x0121, B:42:0x0129, B:45:0x0146, B:46:0x0175, B:48:0x0182), top: B:65:0x00aa }] */
        /* JADX WARN: Code duplicated, block: B:37:0x0115 A[Catch: all -> 0x00f4, Exception -> 0x00f8, TryCatch #5 {Exception -> 0x00f8, all -> 0x00f4, blocks: (B:19:0x00aa, B:20:0x00b7, B:22:0x00bd, B:24:0x00c9, B:25:0x00cf, B:27:0x00d5, B:29:0x00e5, B:31:0x00eb, B:36:0x00fc, B:37:0x0115, B:39:0x011b, B:41:0x0121, B:42:0x0129, B:45:0x0146, B:46:0x0175, B:48:0x0182), top: B:65:0x00aa }] */
        /* JADX WARN: Code duplicated, block: B:39:0x011b A[Catch: all -> 0x00f4, Exception -> 0x00f8, TryCatch #5 {Exception -> 0x00f8, all -> 0x00f4, blocks: (B:19:0x00aa, B:20:0x00b7, B:22:0x00bd, B:24:0x00c9, B:25:0x00cf, B:27:0x00d5, B:29:0x00e5, B:31:0x00eb, B:36:0x00fc, B:37:0x0115, B:39:0x011b, B:41:0x0121, B:42:0x0129, B:45:0x0146, B:46:0x0175, B:48:0x0182), top: B:65:0x00aa }] */
        /* JADX WARN: Code duplicated, block: B:41:0x0121 A[Catch: all -> 0x00f4, Exception -> 0x00f8, TryCatch #5 {Exception -> 0x00f8, all -> 0x00f4, blocks: (B:19:0x00aa, B:20:0x00b7, B:22:0x00bd, B:24:0x00c9, B:25:0x00cf, B:27:0x00d5, B:29:0x00e5, B:31:0x00eb, B:36:0x00fc, B:37:0x0115, B:39:0x011b, B:41:0x0121, B:42:0x0129, B:45:0x0146, B:46:0x0175, B:48:0x0182), top: B:65:0x00aa }] */
        /* JADX WARN: Code duplicated, block: B:68:0x0143 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:72:0x0141 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            Object objAwaitAll;
            CoroutineScope coroutineScope3;
            long j;
            LinkedHashMap linkedHashMap;
            Iterator it;
            DailyHrHealthReport dailyHrHealthReportSplitHrDailyReport;
            MutableStateFlow dailyHrHealthReportByDate$lambda$45;
            Object value;
            List<ProjectDataModel> dataList;
            String key;
            Object arrayList;
            Object arrayList2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                    long j2 = 1000;
                    long millis = this.$date.toDateTimeAtStartOfDay(DateTimeZone.getDefault()).getMillis() / j2;
                    long millis2 = this.$date.plusDays(1).toDateTimeAtStartOfDay(DateTimeZone.getDefault()).getMillis() / j2;
                    try {
                        Deferred[] deferredArr = {BuildersKt__Builders_commonKt.async$default(coroutineScope4, null, null, new HealthCheckViewModel$getDailyHrHealthReportByDate$2$ppgDeferred$1(this.this$0, millis, millis2, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope4, null, null, new HealthCheckViewModel$getDailyHrHealthReportByDate$2$ecgDeferred$1(this.this$0, millis, millis2, null), 3, null)};
                        this.L$0 = coroutineScope4;
                        this.J$0 = millis;
                        this.label = 1;
                        objAwaitAll = AwaitKt.awaitAll(deferredArr, this);
                        if (objAwaitAll == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope3 = coroutineScope4;
                        j = millis;
                        linkedHashMap = new LinkedHashMap();
                        it = ((List) objAwaitAll).iterator();
                        while (it.hasNext()) {
                            dataList = ((GetProjectByTimeResponse) it.next()).getDataList();
                            if (dataList != null) {
                                for (ProjectDataModel projectDataModel : dataList) {
                                    key = projectDataModel.getKey();
                                    if (Intrinsics.areEqual(key, "ppg")) {
                                        arrayList2 = linkedHashMap.get("ppg");
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                            linkedHashMap.put("ppg", arrayList2);
                                        }
                                        PpgMedicalItemReport ppgMedicalItemReport = (PpgMedicalItemReport) h4b.d(projectDataModel.getValue(), PpgMedicalItemReport.class);
                                        List listAsMutableList = TypeIntrinsics.asMutableList((List) arrayList2);
                                        Intrinsics.checkNotNull(ppgMedicalItemReport);
                                        listAsMutableList.add(ppgMedicalItemReport);
                                    } else if (!Intrinsics.areEqual(key, "ecg")) {
                                        arrayList = linkedHashMap.get("ecg");
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            linkedHashMap.put("ecg", arrayList);
                                        }
                                        EcgMedicalItemReport ecgMedicalItemReport = (EcgMedicalItemReport) h4b.d(projectDataModel.getValue(), EcgMedicalItemReport.class);
                                        List listAsMutableList2 = TypeIntrinsics.asMutableList((List) arrayList);
                                        Intrinsics.checkNotNull(ecgMedicalItemReport);
                                        listAsMutableList2.add(ecgMedicalItemReport);
                                    }
                                }
                            }
                        }
                        dailyHrHealthReportSplitHrDailyReport = HeartReportUtils.INSTANCE.splitHrDailyReport(null, j, linkedHashMap);
                        Logger.i(HealthCheckViewModel.TAG, "date: " + this.$date + " , getDailyHrHealthReportByDate: " + dailyHrHealthReportSplitHrDailyReport);
                        this.this$0.updateHeartHealthRiskItem(dailyHrHealthReportSplitHrDailyReport);
                        dailyHrHealthReportByDate$lambda$45 = HealthCheckViewModel.getDailyHrHealthReportByDate$lambda$45(this.$reportStateFlow$delegate);
                        do {
                            value = dailyHrHealthReportByDate$lambda$45.getValue();
                        } while (!dailyHrHealthReportByDate$lambda$45.compareAndSet(value, dailyHrHealthReportSplitHrDailyReport));
                        this.this$0.getCacheHeartDateMap().put(this.$date, FlowKt.asStateFlow(HealthCheckViewModel.getDailyHrHealthReportByDate$lambda$45(this.$reportStateFlow$delegate)));
                        CoroutineScopeKt.cancel$default(coroutineScope3, null, 1, null);
                    } catch (Exception e) {
                        e = e;
                        coroutineScope2 = coroutineScope4;
                        Logger.i(HealthCheckViewModel.TAG, "Failed to fetch daily report", e);
                        CoroutineScopeKt.cancel$default(coroutineScope2, null, 1, null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        coroutineScope = coroutineScope4;
                        CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.J$0;
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        coroutineScope3 = coroutineScope2;
                        objAwaitAll = obj;
                        try {
                            linkedHashMap = new LinkedHashMap();
                            it = ((List) objAwaitAll).iterator();
                            while (it.hasNext()) {
                                dataList = ((GetProjectByTimeResponse) it.next()).getDataList();
                                if (dataList != null) {
                                    while (r13.hasNext()) {
                                        key = projectDataModel.getKey();
                                        if (Intrinsics.areEqual(key, "ppg")) {
                                            arrayList2 = linkedHashMap.get("ppg");
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                                linkedHashMap.put("ppg", arrayList2);
                                            }
                                            PpgMedicalItemReport ppgMedicalItemReport2 = (PpgMedicalItemReport) h4b.d(projectDataModel.getValue(), PpgMedicalItemReport.class);
                                            List listAsMutableList3 = TypeIntrinsics.asMutableList((List) arrayList2);
                                            Intrinsics.checkNotNull(ppgMedicalItemReport2);
                                            listAsMutableList3.add(ppgMedicalItemReport2);
                                        } else if (!Intrinsics.areEqual(key, "ecg")) {
                                            arrayList = linkedHashMap.get("ecg");
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                linkedHashMap.put("ecg", arrayList);
                                            }
                                            EcgMedicalItemReport ecgMedicalItemReport2 = (EcgMedicalItemReport) h4b.d(projectDataModel.getValue(), EcgMedicalItemReport.class);
                                            List listAsMutableList4 = TypeIntrinsics.asMutableList((List) arrayList);
                                            Intrinsics.checkNotNull(ecgMedicalItemReport2);
                                            listAsMutableList4.add(ecgMedicalItemReport2);
                                        }
                                    }
                                }
                            }
                            dailyHrHealthReportSplitHrDailyReport = HeartReportUtils.INSTANCE.splitHrDailyReport(null, j, linkedHashMap);
                            Logger.i(HealthCheckViewModel.TAG, "date: " + this.$date + " , getDailyHrHealthReportByDate: " + dailyHrHealthReportSplitHrDailyReport);
                            this.this$0.updateHeartHealthRiskItem(dailyHrHealthReportSplitHrDailyReport);
                            dailyHrHealthReportByDate$lambda$45 = HealthCheckViewModel.getDailyHrHealthReportByDate$lambda$45(this.$reportStateFlow$delegate);
                            do {
                                value = dailyHrHealthReportByDate$lambda$45.getValue();
                            } while (!dailyHrHealthReportByDate$lambda$45.compareAndSet(value, dailyHrHealthReportSplitHrDailyReport));
                            this.this$0.getCacheHeartDateMap().put(this.$date, FlowKt.asStateFlow(HealthCheckViewModel.getDailyHrHealthReportByDate$lambda$45(this.$reportStateFlow$delegate)));
                            CoroutineScopeKt.cancel$default(coroutineScope3, null, 1, null);
                        } catch (Exception e2) {
                            e = e2;
                            coroutineScope2 = coroutineScope3;
                            Logger.i(HealthCheckViewModel.TAG, "Failed to fetch daily report", e);
                            CoroutineScopeKt.cancel$default(coroutineScope2, null, 1, null);
                        } catch (Throwable th2) {
                            th = th2;
                            coroutineScope = coroutineScope3;
                            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        Logger.i(HealthCheckViewModel.TAG, "Failed to fetch daily report", e);
                        CoroutineScopeKt.cancel$default(coroutineScope2, null, 1, null);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25642) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$getMeasureReminderDataFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckMeasureReminderSettingData;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$getMeasureReminderDataFlow$1", f = "HealthCheckViewModel.kt", i = {}, l = {905}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25651 extends SuspendLambda implements Function2<FlowCollector<? super HealthCheckMeasureReminderSettingData>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C25651(Continuation<? super C25651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25651 c25651 = HealthCheckViewModel.this.new C25651(continuation);
            c25651.L$0 = obj;
            return c25651;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                HealthCheckMeasureReminderSettingData defaultRemindMeasureData = (HealthCheckMeasureReminderSettingData) HealthCheckViewModel.this.mmkv.h(HealthCheckSettingConfig.KEY_REMINDER, HealthCheckMeasureReminderSettingData.class);
                if (defaultRemindMeasureData == null) {
                    defaultRemindMeasureData = HealthCheckSettingUtils.INSTANCE.getDefaultRemindMeasureData();
                }
                this.label = 1;
                if (flowCollector.emit(defaultRemindMeasureData, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super HealthCheckMeasureReminderSettingData> flowCollector, Continuation<? super Unit> continuation) {
            return ((C25651) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$setBloodPressureRiskData$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$setBloodPressureRiskData$2", f = "HealthCheckViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHealthCheckViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCheckViewModel.kt\ncom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel$setBloodPressureRiskData$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,960:1\n230#2,3:961\n233#2,2:965\n1#3:964\n*S KotlinDebug\n*F\n+ 1 HealthCheckViewModel.kt\ncom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel$setBloodPressureRiskData$2\n*L\n829#1:961,3\n829#1:965,2\n*E\n"})
    public static final class C25662 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AmbulatoryBloodPressureReport $ambulatoryBloodPressureReport;
        int label;
        final /* synthetic */ HealthCheckViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25662(AmbulatoryBloodPressureReport ambulatoryBloodPressureReport, HealthCheckViewModel healthCheckViewModel, Continuation<? super C25662> continuation) {
            super(2, continuation);
            this.$ambulatoryBloodPressureReport = ambulatoryBloodPressureReport;
            this.this$0 = healthCheckViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25662(this.$ambulatoryBloodPressureReport, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            HashMap map;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Boxing.boxInt(13), CollectionsKt__CollectionsJVMKt.listOf(this.$ambulatoryBloodPressureReport));
            MutableStateFlow riskDateMapStateFlowByDate$default = HealthCheckViewModel.getRiskDateMapStateFlowByDate$default(this.this$0, null, 1, null);
            do {
                value = riskDateMapStateFlowByDate$default.getValue();
                map = new HashMap((HashMap) value);
                map.put(Boxing.boxInt(26), linkedHashMap);
            } while (!riskDateMapStateFlowByDate$default.compareAndSet(value, map));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25662) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$updateHeartHealthRiskItem$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$updateHeartHealthRiskItem$2", f = "HealthCheckViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHealthCheckViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCheckViewModel.kt\ncom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel$updateHeartHealthRiskItem$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,960:1\n230#2,3:961\n233#2,2:965\n1#3:964\n*S KotlinDebug\n*F\n+ 1 HealthCheckViewModel.kt\ncom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel$updateHeartHealthRiskItem$2\n*L\n804#1:961,3\n804#1:965,2\n*E\n"})
    public static final class C25672 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<HeartHealthValueItem> $abnormalList;
        int label;
        final /* synthetic */ HealthCheckViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25672(List<HeartHealthValueItem> list, HealthCheckViewModel healthCheckViewModel, Continuation<? super C25672> continuation) {
            super(2, continuation);
            this.$abnormalList = list;
            this.this$0 = healthCheckViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25672(this.$abnormalList, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            HashMap map;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Boxing.boxInt(12), this.$abnormalList);
            MutableStateFlow riskDateMapStateFlowByDate$default = HealthCheckViewModel.getRiskDateMapStateFlowByDate$default(this.this$0, null, 1, null);
            do {
                value = riskDateMapStateFlowByDate$default.getValue();
                map = new HashMap((HashMap) value);
                map.put(Boxing.boxInt(25), linkedHashMap);
            } while (!riskDateMapStateFlowByDate$default.compareAndSet(value, map));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25672) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HealthCheckViewModel() {
        IRepositoryProvider.Companion companion = IRepositoryProvider.INSTANCE;
        this.hrRepository = (IHeartRateRepository) FitnessDataExtKt.getInstance(companion).getRepository(IHeartRateRepository.class);
        this.spo2Repository = (ISpo2Repository) FitnessDataExtKt.getInstance(companion).getRepository(ISpo2Repository.class);
        this.sleepRepository = (ISleepRepository) FitnessDataExtKt.getInstance(companion).getRepository(ISleepRepository.class);
        this.stressRepository = (IStressRepository) FitnessDataExtKt.getInstance(companion).getRepository(IStressRepository.class);
        this.isRedraw = Boolean.TRUE;
        this.mmkv = MMKV.G(HealthCheckSettingConfig.PREFERENCE_NAME, 2);
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.localSelectDay = StateFlowKt.MutableStateFlow(null);
        this.healthCheckRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hpb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HealthCheckViewModel.healthCheckRequest_delegate$lambda$0();
            }
        });
        int i = 0;
        int i2 = 1;
        this.cacheHeartDateMap = new CachedMap<>(i, i2, defaultConstructorMarker);
        this.cacheBloodPressureDateMap = new CachedMap<>(i, i2, defaultConstructorMarker);
        this.cacheHeartRateDateMap = new CachedMap<>(i, i2, defaultConstructorMarker);
        this.cacheSpo2DateMap = new CachedMap<>(i, i2, defaultConstructorMarker);
        this.cacheSleepDateMap = new CachedMap<>(i, i2, defaultConstructorMarker);
        this.cacheStressDateMap = new CachedMap<>(i, i2, defaultConstructorMarker);
        this.cacheRiskDateMap = new CachedMap<>(i, i2, defaultConstructorMarker);
        this.cacheCheckedDateMap = new CachedMap<>(i, i2, defaultConstructorMarker);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static /* synthetic */ void cleanCache$default(HealthCheckViewModel healthCheckViewModel, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = healthCheckViewModel.localSelectDay.getValue();
        }
        healthCheckViewModel.cleanCache(localDate);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0100 A[SYNTHETIC] */
    private final Pair<List<Object>, List<Object>> detectStressAbnormalRecords(LocalDate date) {
        ArrayList<StressItem> arrayList;
        int stressStageIndexByValue;
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(date);
        Map<String, List<DailyRecordItem>> allDataByTime = this.stressRepository.getAllDataByTime(jChangZeroOfTheDay, 86400 + jChangZeroOfTheDay, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<String, List<DailyRecordItem>> entry : allDataByTime.entrySet()) {
            String key = entry.getKey();
            List<DailyRecordItem> value = entry.getValue();
            int iHashCode = key.hashCode();
            if (iHashCode != -2054887029) {
                if (iHashCode != -891989580) {
                    if (iHashCode == -162515215 && key.equals(FitnessPersistKey.AbnormalStress)) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : value) {
                            if (obj instanceof SegmentItem) {
                                arrayList4.add(obj);
                            }
                        }
                        Iterator it = arrayList4.iterator();
                        while (it.hasNext()) {
                            List<AbnormalItem> items = ((SegmentItem) it.next()).getItems();
                            if (items != null) {
                                for (AbnormalItem abnormalItem : items) {
                                    int stressStageIndexByValue2 = StressDataUtil.INSTANCE.getStressStageIndexByValue(abnormalItem.getValue());
                                    if (stressStageIndexByValue2 == 0) {
                                        arrayList3.add(new StressItem(abnormalItem.getTime(), abnormalItem.getValue()));
                                    } else if (stressStageIndexByValue2 == 1) {
                                        arrayList2.add(new StressItem(abnormalItem.getTime(), abnormalItem.getValue()));
                                    }
                                }
                            }
                        }
                    }
                } else if (key.equals("stress")) {
                    arrayList = new ArrayList();
                    for (Object obj2 : value) {
                        if (obj2 instanceof StressItem) {
                            arrayList.add(obj2);
                        }
                    }
                    for (StressItem stressItem : arrayList) {
                        stressStageIndexByValue = StressDataUtil.INSTANCE.getStressStageIndexByValue(stressItem.getStress());
                        if (stressStageIndexByValue != 0) {
                            arrayList3.add(stressItem);
                        } else if (stressStageIndexByValue != 1) {
                            arrayList2.add(stressItem);
                        }
                    }
                }
            } else if (key.equals(FitnessPersistKey.ManualStress)) {
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                    if (obj2 instanceof StressItem) {
                        arrayList.add(obj2);
                    }
                }
                while (r2.hasNext()) {
                    stressStageIndexByValue = StressDataUtil.INSTANCE.getStressStageIndexByValue(stressItem.getStress());
                    if (stressStageIndexByValue != 0) {
                        arrayList3.add(stressItem);
                    } else if (stressStageIndexByValue != 1) {
                        arrayList2.add(stressItem);
                    }
                }
            }
        }
        if (arrayList2.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList2, new Comparator() { // from class: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$detectStressAbnormalRecords$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((StressItem) t).getTime()), Long.valueOf(((StressItem) t2).getTime()));
                }
            });
        }
        if (arrayList3.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList3, new Comparator() { // from class: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$detectStressAbnormalRecords$$inlined$sortBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((StressItem) t).getTime()), Long.valueOf(((StressItem) t2).getTime()));
                }
            });
        }
        return new Pair<>(arrayList2, arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void fetchData(LocalDate date) {
        if (date == null) {
            return;
        }
        try {
            if (this.forceRefreshAll) {
                cleanCache(date);
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C25591(date, null), 3, null);
            getHeartRateData(date);
            getSpo2Data(date);
            getSleepData(date);
            getStressData(date);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void fetchData$default(HealthCheckViewModel healthCheckViewModel, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = healthCheckViewModel.localSelectDay.getValue();
        }
        healthCheckViewModel.fetchData(localDate);
    }

    private final void fetchHeartRateData(LocalDate date, MutableStateFlow<DailyHrReport> flow) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25601(date, this, flow, null), 2, null);
    }

    private final void fetchSleepData(LocalDate date, MutableStateFlow<SleepSegmentReport> flow) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25611(date, this, flow, null), 2, null);
    }

    private final void fetchSpo2Data(LocalDate date, MutableStateFlow<DailySpo2Report> flow) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25621(date, this, flow, null), 2, null);
    }

    private final void fetchStressData(LocalDate date, MutableStateFlow<DailyStressReport> flow) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25631(date, this, flow, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableStateFlow getAmbulatoryBloodPressureReportByDate$lambda$52() {
        return StateFlowKt.MutableStateFlow(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableStateFlow<AmbulatoryBloodPressureReport> getAmbulatoryBloodPressureReportByDate$lambda$53(Lazy<? extends MutableStateFlow<AmbulatoryBloodPressureReport>> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ MutableStateFlow getCheckedItemMapStateFlowByDate$default(HealthCheckViewModel healthCheckViewModel, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0 && (localDate = healthCheckViewModel.localSelectDay.getValue()) == null) {
            localDate = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDate, "now(...)");
        }
        return healthCheckViewModel.getCheckedItemMapStateFlowByDate(localDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableStateFlow getDailyHrHealthReportByDate$lambda$44() {
        return StateFlowKt.MutableStateFlow(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableStateFlow<DailyHrHealthReport> getDailyHrHealthReportByDate$lambda$45(Lazy<? extends MutableStateFlow<DailyHrHealthReport>> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HealthCheckRequest getHealthCheckRequest() {
        return (HealthCheckRequest) this.healthCheckRequest.getValue();
    }

    public static /* synthetic */ MutableStateFlow getRiskDateMapStateFlowByDate$default(HealthCheckViewModel healthCheckViewModel, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0 && (localDate = healthCheckViewModel.localSelectDay.getValue()) == null) {
            localDate = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDate, "now(...)");
        }
        return healthCheckViewModel.getRiskDateMapStateFlowByDate(localDate);
    }

    public static /* synthetic */ StateFlow getSleepData$default(HealthCheckViewModel healthCheckViewModel, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0 && (localDate = healthCheckViewModel.localSelectDay.getValue()) == null) {
            localDate = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDate, "now(...)");
        }
        return healthCheckViewModel.getSleepData(localDate);
    }

    public static /* synthetic */ StateFlow getSpo2Data$default(HealthCheckViewModel healthCheckViewModel, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0 && (localDate = healthCheckViewModel.localSelectDay.getValue()) == null) {
            localDate = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDate, "now(...)");
        }
        return healthCheckViewModel.getSpo2Data(localDate);
    }

    public static /* synthetic */ StateFlow getStressData$default(HealthCheckViewModel healthCheckViewModel, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0 && (localDate = healthCheckViewModel.localSelectDay.getValue()) == null) {
            localDate = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDate, "now(...)");
        }
        return healthCheckViewModel.getStressData(localDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HealthCheckRequest healthCheckRequest_delegate$lambda$0() {
        return new HealthCheckRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processHeartRateRiskData(DailyHrReport report, LocalDate date) {
        HashMap<Integer, Boolean> value;
        HashMap<Integer, Boolean> map;
        HashMap<Integer, Map<Integer, List<Object>>> value2;
        HashMap<Integer, Map<Integer, List<Object>>> map2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<AbnormalFibItem> abnormalFibRecords = report.getAbnormalFibRecords();
        if (abnormalFibRecords != null && (!abnormalFibRecords.isEmpty())) {
            linkedHashMap.put(0, abnormalFibRecords);
        }
        List<SegmentItem> abnormalHrHighRecords = report.getAbnormalHrHighRecords();
        if (abnormalHrHighRecords != null && (!abnormalHrHighRecords.isEmpty())) {
            linkedHashMap.put(1, abnormalHrHighRecords);
        }
        List<SegmentItem> abnormalHrLowRecords = report.getAbnormalHrLowRecords();
        if (abnormalHrLowRecords != null && (!abnormalHrLowRecords.isEmpty())) {
            linkedHashMap.put(2, abnormalHrLowRecords);
        }
        if (!linkedHashMap.isEmpty()) {
            MutableStateFlow<HashMap<Integer, Map<Integer, List<Object>>>> riskDateMapStateFlowByDate = getRiskDateMapStateFlowByDate(date);
            do {
                value2 = riskDateMapStateFlowByDate.getValue();
                map2 = new HashMap<>(value2);
                map2.put(4, linkedHashMap);
            } while (!riskDateMapStateFlowByDate.compareAndSet(value2, map2));
        }
        MutableStateFlow<HashMap<Integer, Boolean>> checkedItemMapStateFlowByDate = getCheckedItemMapStateFlowByDate(date);
        do {
            value = checkedItemMapStateFlowByDate.getValue();
            map = new HashMap<>(value);
            map.put(4, Boolean.TRUE);
        } while (!checkedItemMapStateFlowByDate.compareAndSet(value, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processSleepRiskData(SleepSegmentReport report, LocalDate date) {
        HashMap<Integer, Boolean> value;
        HashMap<Integer, Boolean> map;
        HashMap<Integer, Boolean> value2;
        HashMap<Integer, Boolean> map2;
        HashMap<Integer, Map<Integer, List<Object>>> value3;
        HashMap<Integer, Map<Integer, List<Object>>> map3;
        HashMap<Integer, Boolean> value4;
        HashMap<Integer, Boolean> map4;
        HashMap<Integer, Map<Integer, List<Object>>> value5;
        HashMap<Integer, Map<Integer, List<Object>>> map5;
        HashMap<Integer, Map<Integer, List<Object>>> value6;
        HashMap<Integer, Map<Integer, List<Object>>> map6;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (report.getSleepDuration() < 360) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(report);
            linkedHashMap.put(7, arrayList);
            Logger.i(LongSleepHolder.TAG, "riskMap ABNORMAL_TYPE_LONG_SLEEP_DURATION_SHORT added");
        }
        MutableStateFlow<HashMap<Integer, Boolean>> checkedItemMapStateFlowByDate = getCheckedItemMapStateFlowByDate(date);
        do {
            value = checkedItemMapStateFlowByDate.getValue();
            map = new HashMap<>(value);
            map.put(6, Boolean.TRUE);
        } while (!checkedItemMapStateFlowByDate.compareAndSet(value, map));
        if (!linkedHashMap.isEmpty()) {
            MutableStateFlow<HashMap<Integer, Map<Integer, List<Object>>>> riskDateMapStateFlowByDate = getRiskDateMapStateFlowByDate(date);
            do {
                value6 = riskDateMapStateFlowByDate.getValue();
                map6 = new HashMap<>(value6);
                map6.put(6, linkedHashMap);
            } while (!riskDateMapStateFlowByDate.compareAndSet(value6, map6));
        }
        if (report.hasStageData()) {
            Integer avgHr = report.getAvgHr();
            if (avgHr != null) {
                int iIntValue = avgHr.intValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                List<TimesDataRecordInt> hrRecords = report.getHrRecords();
                if (hrRecords != null && !hrRecords.isEmpty()) {
                    MutableStateFlow<HashMap<Integer, Boolean>> checkedItemMapStateFlowByDate2 = getCheckedItemMapStateFlowByDate(date);
                    do {
                        value4 = checkedItemMapStateFlowByDate2.getValue();
                        map4 = new HashMap<>(value4);
                        map4.put(-1, Boolean.TRUE);
                    } while (!checkedItemMapStateFlowByDate2.compareAndSet(value4, map4));
                    if (iIntValue < 40 || iIntValue > 90) {
                        linkedHashMap2.put(Integer.valueOf(iIntValue < 40 ? 9 : 10), CollectionsKt__CollectionsJVMKt.listOf(report));
                    }
                    if (!linkedHashMap2.isEmpty()) {
                        MutableStateFlow<HashMap<Integer, Map<Integer, List<Object>>>> riskDateMapStateFlowByDate2 = getRiskDateMapStateFlowByDate(date);
                        do {
                            value5 = riskDateMapStateFlowByDate2.getValue();
                            map5 = new HashMap<>(value5);
                            map5.put(-1, linkedHashMap2);
                        } while (!riskDateMapStateFlowByDate2.compareAndSet(value5, map5));
                    }
                }
            }
            Integer avgSpo2 = report.getAvgSpo2();
            if (avgSpo2 != null) {
                int iIntValue2 = avgSpo2.intValue();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                List<TimesDataRecordInt> spo2Records = report.getSpo2Records();
                if (spo2Records == null || spo2Records.isEmpty()) {
                    return;
                }
                MutableStateFlow<HashMap<Integer, Boolean>> checkedItemMapStateFlowByDate3 = getCheckedItemMapStateFlowByDate(date);
                do {
                    value2 = checkedItemMapStateFlowByDate3.getValue();
                    map2 = new HashMap<>(value2);
                    map2.put(-2, Boolean.TRUE);
                } while (!checkedItemMapStateFlowByDate3.compareAndSet(value2, map2));
                if (iIntValue2 < 90) {
                    linkedHashMap3.put(11, CollectionsKt__CollectionsJVMKt.listOf(report));
                }
                if (!linkedHashMap3.isEmpty()) {
                    MutableStateFlow<HashMap<Integer, Map<Integer, List<Object>>>> riskDateMapStateFlowByDate3 = getRiskDateMapStateFlowByDate(date);
                    do {
                        value3 = riskDateMapStateFlowByDate3.getValue();
                        map3 = new HashMap<>(value3);
                        map3.put(-2, linkedHashMap3);
                    } while (!riskDateMapStateFlowByDate3.compareAndSet(value3, map3));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processSpo2RiskData(DailySpo2Report report, LocalDate date) {
        HashMap<Integer, Map<Integer, List<Object>>> value;
        HashMap<Integer, Map<Integer, List<Object>>> map;
        List<SegmentItem> abnormalSpo2Records = report.getAbnormalSpo2Records();
        if (abnormalSpo2Records != null) {
            if (!(!abnormalSpo2Records.isEmpty())) {
                abnormalSpo2Records = null;
            }
            if (abnormalSpo2Records != null) {
                MutableStateFlow<HashMap<Integer, Map<Integer, List<Object>>>> riskDateMapStateFlowByDate = getRiskDateMapStateFlowByDate(date);
                do {
                    value = riskDateMapStateFlowByDate.getValue();
                    map = new HashMap<>(value);
                    map.put(13, MapsKt__MapsJVMKt.mapOf(TuplesKt.to(3, abnormalSpo2Records)));
                } while (!riskDateMapStateFlowByDate.compareAndSet(value, map));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processStressRiskData(LocalDate date) {
        HashMap<Integer, Map<Integer, List<Object>>> value;
        HashMap<Integer, Map<Integer, List<Object>>> map;
        Pair<List<Object>, List<Object>> pairDetectStressAbnormalRecords = detectStressAbnormalRecords(date);
        List<Object> listComponent1 = pairDetectStressAbnormalRecords.component1();
        List<Object> listComponent2 = pairDetectStressAbnormalRecords.component2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!listComponent1.isEmpty()) {
            linkedHashMap.put(5, listComponent1);
        }
        if (!listComponent2.isEmpty()) {
            linkedHashMap.put(6, listComponent2);
        }
        if (!linkedHashMap.isEmpty()) {
            MutableStateFlow<HashMap<Integer, Map<Integer, List<Object>>>> riskDateMapStateFlowByDate = getRiskDateMapStateFlowByDate(date);
            do {
                value = riskDateMapStateFlowByDate.getValue();
                map = new HashMap<>(value);
                map.put(7, linkedHashMap);
            } while (!riskDateMapStateFlowByDate.compareAndSet(value, map));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBloodPressureRiskData(AmbulatoryBloodPressureReport ambulatoryBloodPressureReport) {
        Integer bpRhythmStatus;
        Object value;
        HashMap map;
        if (ambulatoryBloodPressureReport == null) {
            return;
        }
        Integer bpRhythmStatus2 = ambulatoryBloodPressureReport.getBpRhythmStatus();
        if ((bpRhythmStatus2 != null && bpRhythmStatus2.intValue() == 1) || ((bpRhythmStatus = ambulatoryBloodPressureReport.getBpRhythmStatus()) != null && bpRhythmStatus.intValue() == 2)) {
            MutableStateFlow checkedItemMapStateFlowByDate$default = getCheckedItemMapStateFlowByDate$default(this, null, 1, null);
            do {
                value = checkedItemMapStateFlowByDate$default.getValue();
                map = new HashMap((HashMap) value);
                map.put(26, Boolean.TRUE);
            } while (!checkedItemMapStateFlowByDate$default.compareAndSet(value, map));
        }
        Integer bpRhythmStatus3 = ambulatoryBloodPressureReport.getBpRhythmStatus();
        if (bpRhythmStatus3 != null && bpRhythmStatus3.intValue() == 2) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C25662(ambulatoryBloodPressureReport, this, null), 3, null);
        }
    }

    public final synchronized void cleanCache(@Nullable LocalDate date) {
        try {
            Job job = this.healthObservationJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            if (date == null) {
                this.cacheCheckedDateMap.clear();
                this.cacheRiskDateMap.clear();
                this.cacheHeartDateMap.clear();
                this.cacheSpo2DateMap.clear();
                this.cacheHeartRateDateMap.clear();
                this.cacheBloodPressureDateMap.clear();
                this.cacheSleepDateMap.clear();
                this.cacheStressDateMap.clear();
            } else {
                this.cacheCheckedDateMap.remove(date);
                this.cacheRiskDateMap.remove(date);
                this.cacheHeartDateMap.remove(date);
                this.cacheSpo2DateMap.remove(date);
                this.cacheHeartRateDateMap.remove(date);
                this.cacheBloodPressureDateMap.remove(date);
                this.cacheSleepDateMap.remove(date);
                this.cacheStressDateMap.remove(date);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final StateFlow<AmbulatoryBloodPressureReport> getAmbulatoryBloodPressureReportByDate(@NotNull LocalDate date) {
        AmbulatoryBloodPressureReport value;
        Intrinsics.checkNotNullParameter(date, "date");
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fpb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HealthCheckViewModel.getAmbulatoryBloodPressureReportByDate$lambda$52();
            }
        });
        StateFlow<AmbulatoryBloodPressureReport> stateFlow = this.cacheBloodPressureDateMap.get(date);
        if (((stateFlow == null || (value = stateFlow.getValue()) == null) ? null : value.getBpRhythmStatus()) != null) {
            StateFlow<AmbulatoryBloodPressureReport> stateFlow2 = this.cacheBloodPressureDateMap.get(date);
            return stateFlow2 == null ? FlowKt.asStateFlow(getAmbulatoryBloodPressureReportByDate$lambda$53(lazy)) : stateFlow2;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass2(date, this, lazy, null), 2, null);
        return FlowKt.asStateFlow(getAmbulatoryBloodPressureReportByDate$lambda$53(lazy));
    }

    @NotNull
    public final CachedMap<LocalDate, StateFlow<AmbulatoryBloodPressureReport>> getCacheBloodPressureDateMap() {
        return this.cacheBloodPressureDateMap;
    }

    @NotNull
    public final CachedMap<LocalDate, MutableStateFlow<HashMap<Integer, Boolean>>> getCacheCheckedDateMap() {
        return this.cacheCheckedDateMap;
    }

    @NotNull
    public final CachedMap<LocalDate, StateFlow<DailyHrHealthReport>> getCacheHeartDateMap() {
        return this.cacheHeartDateMap;
    }

    @NotNull
    public final CachedMap<LocalDate, StateFlow<DailyHrReport>> getCacheHeartRateDateMap() {
        return this.cacheHeartRateDateMap;
    }

    @NotNull
    public final CachedMap<LocalDate, MutableStateFlow<HashMap<Integer, Map<Integer, List<Object>>>>> getCacheRiskDateMap() {
        return this.cacheRiskDateMap;
    }

    @NotNull
    public final CachedMap<LocalDate, StateFlow<SleepSegmentReport>> getCacheSleepDateMap() {
        return this.cacheSleepDateMap;
    }

    @NotNull
    public final CachedMap<LocalDate, StateFlow<DailySpo2Report>> getCacheSpo2DateMap() {
        return this.cacheSpo2DateMap;
    }

    @NotNull
    public final CachedMap<LocalDate, StateFlow<DailyStressReport>> getCacheStressDateMap() {
        return this.cacheStressDateMap;
    }

    @NotNull
    public final synchronized MutableStateFlow<HashMap<Integer, Boolean>> getCheckedItemMapStateFlowByDate(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        MutableStateFlow<HashMap<Integer, Boolean>> mutableStateFlow = this.cacheCheckedDateMap.get(date);
        if (mutableStateFlow != null) {
            Logger.i(TAG, "getCheckedItemMapStateFlowByDate: " + mutableStateFlow.getValue());
            return mutableStateFlow;
        }
        MutableStateFlow<HashMap<Integer, Boolean>> MutableStateFlow = StateFlowKt.MutableStateFlow(new HashMap());
        this.cacheCheckedDateMap.put(date, MutableStateFlow);
        Logger.i(TAG, "getNewCheckedItemStateFlow: " + MutableStateFlow.getValue());
        return MutableStateFlow;
    }

    @NotNull
    public final StateFlow<DailyHrHealthReport> getDailyHrHealthReportByDate(@NotNull LocalDate date) {
        DailyHrHealthReport value;
        Intrinsics.checkNotNullParameter(date, "date");
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gpb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HealthCheckViewModel.getDailyHrHealthReportByDate$lambda$44();
            }
        });
        StateFlow<DailyHrHealthReport> stateFlow = this.cacheHeartDateMap.get(date);
        if (stateFlow == null || (value = stateFlow.getValue()) == null || value.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25642(date, this, lazy, null), 2, null);
            return FlowKt.asStateFlow(getDailyHrHealthReportByDate$lambda$45(lazy));
        }
        updateHeartHealthRiskItem(stateFlow.getValue());
        StateFlow<DailyHrHealthReport> stateFlow2 = this.cacheHeartDateMap.get(date);
        return stateFlow2 == null ? FlowKt.asStateFlow(getDailyHrHealthReportByDate$lambda$45(lazy)) : stateFlow2;
    }

    public final boolean getForceRefreshAll() {
        return this.forceRefreshAll;
    }

    @Nullable
    public final Job getHealthObservationJob() {
        return this.healthObservationJob;
    }

    @NotNull
    public final StateFlow<DailyHrReport> getHeartRateData(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        StateFlow<DailyHrReport> stateFlow = this.cacheHeartRateDateMap.get(date);
        if (stateFlow != null) {
            return stateFlow;
        }
        MutableStateFlow<DailyHrReport> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.cacheHeartRateDateMap.put(date, FlowKt.asStateFlow(MutableStateFlow));
        fetchHeartRateData(date, MutableStateFlow);
        return FlowKt.asStateFlow(MutableStateFlow);
    }

    @NotNull
    public final IHeartRateRepository getHrRepository() {
        return this.hrRepository;
    }

    @NotNull
    public final MutableStateFlow<LocalDate> getLocalSelectDay() {
        return this.localSelectDay;
    }

    @NotNull
    public final LiveData<HealthCheckMeasureReminderSettingData> getMeasureRemindDataLiveData() {
        return FlowLiveDataConversions.asLiveData$default(getMeasureReminderDataFlow(), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @Nullable
    public final HealthCheckMeasureReminderSettingData getMeasureReminderData() {
        return (HealthCheckMeasureReminderSettingData) this.mmkv.h(HealthCheckSettingConfig.KEY_REMINDER, HealthCheckMeasureReminderSettingData.class);
    }

    @NotNull
    public final Flow<HealthCheckMeasureReminderSettingData> getMeasureReminderDataFlow() {
        return FlowKt.flowOn(FlowKt.flow(new C25651(null)), Dispatchers.getIO());
    }

    @NotNull
    public final synchronized MutableStateFlow<HashMap<Integer, Map<Integer, List<Object>>>> getRiskDateMapStateFlowByDate(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        MutableStateFlow<HashMap<Integer, Map<Integer, List<Object>>>> mutableStateFlow = this.cacheRiskDateMap.get(date);
        if (mutableStateFlow != null) {
            Logger.i(TAG, "getRiskDateMapStateFlowByDate: " + mutableStateFlow.getValue());
            return mutableStateFlow;
        }
        MutableStateFlow<HashMap<Integer, Map<Integer, List<Object>>>> MutableStateFlow = StateFlowKt.MutableStateFlow(new HashMap());
        this.cacheRiskDateMap.put(date, MutableStateFlow);
        Logger.i(TAG, "getNewRiskDateStateFlow: " + MutableStateFlow.getValue());
        return MutableStateFlow;
    }

    @NotNull
    public final StateFlow<SleepSegmentReport> getSleepData(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        StateFlow<SleepSegmentReport> stateFlow = this.cacheSleepDateMap.get(date);
        if (stateFlow != null) {
            return stateFlow;
        }
        MutableStateFlow<SleepSegmentReport> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.cacheSleepDateMap.put(date, FlowKt.asStateFlow(MutableStateFlow));
        fetchSleepData(date, MutableStateFlow);
        return FlowKt.asStateFlow(MutableStateFlow);
    }

    @NotNull
    public final ISleepRepository getSleepRepository() {
        return this.sleepRepository;
    }

    @NotNull
    public final StateFlow<DailySpo2Report> getSpo2Data(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        StateFlow<DailySpo2Report> stateFlow = this.cacheSpo2DateMap.get(date);
        if (stateFlow != null) {
            return stateFlow;
        }
        MutableStateFlow<DailySpo2Report> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.cacheSpo2DateMap.put(date, FlowKt.asStateFlow(MutableStateFlow));
        fetchSpo2Data(date, MutableStateFlow);
        return FlowKt.asStateFlow(MutableStateFlow);
    }

    @NotNull
    public final ISpo2Repository getSpo2Repository() {
        return this.spo2Repository;
    }

    @NotNull
    public final StateFlow<DailyStressReport> getStressData(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        StateFlow<DailyStressReport> stateFlow = this.cacheStressDateMap.get(date);
        if (stateFlow == null) {
            MutableStateFlow<DailyStressReport> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
            this.cacheStressDateMap.put(date, MutableStateFlow);
            fetchStressData(date, MutableStateFlow);
            return FlowKt.asStateFlow(MutableStateFlow);
        }
        if (stateFlow.getValue() != null) {
            return stateFlow;
        }
        MutableStateFlow<DailyStressReport> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        fetchStressData(date, MutableStateFlow2);
        this.cacheStressDateMap.put(date, MutableStateFlow2);
        return FlowKt.asStateFlow(MutableStateFlow2);
    }

    @NotNull
    public final IStressRepository getStressRepository() {
        return this.stressRepository;
    }

    @Nullable
    public final Job getSummaryCollectJob() {
        return this.summaryCollectJob;
    }

    @Nullable
    /* JADX INFO: renamed from: isRedraw, reason: from getter */
    public final Boolean getIsRedraw() {
        return this.isRedraw;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Job job = this.summaryCollectJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.healthObservationJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        super.onDestroy(owner);
    }

    public final synchronized void refreshData(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.localSelectDay.setValue(null);
        this.localSelectDay.setValue(date);
    }

    public final void setForceRefreshAll(boolean z) {
        this.forceRefreshAll = z;
    }

    public final void setHealthObservationJob(@Nullable Job job) {
        this.healthObservationJob = job;
    }

    public final void setLocalSelectDay(@NotNull MutableStateFlow<LocalDate> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.localSelectDay = mutableStateFlow;
    }

    public final void setRedraw(@Nullable Boolean bool) {
        this.isRedraw = bool;
    }

    public final void setSummaryCollectJob(@Nullable Job job) {
        this.summaryCollectJob = job;
    }

    public final void updateHeartHealthRiskItem(@Nullable DailyHrHealthReport dailyHeartReport) {
        Object value;
        HashMap map;
        ArrayList arrayList;
        if (dailyHeartReport == null || dailyHeartReport.getHrStatusRecords() == null) {
            return;
        }
        MutableStateFlow checkedItemMapStateFlowByDate$default = getCheckedItemMapStateFlowByDate$default(this, null, 1, null);
        do {
            value = checkedItemMapStateFlowByDate$default.getValue();
            map = new HashMap((HashMap) value);
            map.put(25, Boolean.TRUE);
        } while (!checkedItemMapStateFlowByDate$default.compareAndSet(value, map));
        List<HeartHealthValueItem> hrStatusRecords = dailyHeartReport.getHrStatusRecords();
        if (hrStatusRecords != null) {
            arrayList = new ArrayList();
            for (Object obj : hrStatusRecords) {
                HeartHealthValueItem heartHealthValueItem = (HeartHealthValueItem) obj;
                Integer statue = heartHealthValueItem.getStatue();
                if (statue == null || statue.intValue() != 1) {
                    Integer statue2 = heartHealthValueItem.getStatue();
                    if (statue2 == null || statue2.intValue() != 0) {
                        arrayList.add(obj);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C25672(arrayList, this, null), 3, null);
    }

    public final void updateMeasureRemindData(@NotNull HealthCheckMeasureReminderSettingData reminderData) {
        Intrinsics.checkNotNullParameter(reminderData, "reminderData");
        this.mmkv.t(HealthCheckSettingConfig.KEY_REMINDER, reminderData);
    }
}
