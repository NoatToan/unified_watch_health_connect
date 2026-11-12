package com.xiaomi.fitness.repo;

import android.content.Context;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.Gson;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedSource;
import com.xiaomi.fit.data.common.constant.FitnessDataChangedUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.ISummarySyncManager;
import com.xiaomi.fit.fitness.export.api.repository.IBloodPressureRepository;
import com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository;
import com.xiaomi.fit.fitness.export.api.repository.ICalorieRepository;
import com.xiaomi.fit.fitness.export.api.repository.IEnergyRepository;
import com.xiaomi.fit.fitness.export.api.repository.IHearingRepository;
import com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository;
import com.xiaomi.fit.fitness.export.api.repository.IPaiRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRedDotRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRunningIndicatorRepository;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.api.repository.ISpo2Repository;
import com.xiaomi.fit.fitness.export.api.repository.IStandRepository;
import com.xiaomi.fit.fitness.export.api.repository.IStepRepository;
import com.xiaomi.fit.fitness.export.api.repository.IStrengthRepository;
import com.xiaomi.fit.fitness.export.api.repository.IStressRepository;
import com.xiaomi.fit.fitness.export.api.repository.ITemperatureRepository;
import com.xiaomi.fit.fitness.export.api.repository.ITrainingLoadRepository;
import com.xiaomi.fit.fitness.export.api.repository.IVO2MaxRepository;
import com.xiaomi.fit.fitness.export.api.repository.IVitalityRepository;
import com.xiaomi.fit.fitness.export.api.repository.IWeightRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHearingReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPaiReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyRunningIndicatorReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTrainingLoadReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVitalityReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.CaloriesItem;
import com.xiaomi.fit.fitness.export.data.item.EnergyItem;
import com.xiaomi.fit.fitness.export.data.item.HeadsetItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fit.fitness.export.data.item.LightValueItem;
import com.xiaomi.fit.fitness.export.data.item.MHStrengthItem;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fit.fitness.export.data.item.OneDayPaiReport;
import com.xiaomi.fit.fitness.export.data.item.PhysicalStatusItem;
import com.xiaomi.fit.fitness.export.data.item.RestHrItem;
import com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fit.fitness.export.data.item.TrainingLoadItem;
import com.xiaomi.fit.fitness.export.data.item.ValidStandItem;
import com.xiaomi.fit.fitness.export.data.item.VitalityItem;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.data.item.body;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fit.fitness.export.utils.SleepAudioFileUtils;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fitness.aggregation.summary.SummarySyncManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.electronic.scale.widget.banner.EcoBanner;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.repo.TestRepos;
import com.xiaomi.fitness.repo.sleep.net.SleepStatDataRequest;
import com.xiaomi.fitness.sleep.behavior.analyze.snore.AudioAttributes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010.\u001a\u00020/2\u0006\u0010(\u001a\u00020)J\u0006\u00100\u001a\u00020/J\u0006\u00101\u001a\u00020/J\u0006\u00102\u001a\u00020/J\u0006\u00103\u001a\u00020/J\u0006\u00104\u001a\u00020/J\u0006\u00105\u001a\u00020/J\u0016\u00106\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\u0006\u0010:\u001a\u00020/J\u0006\u0010;\u001a\u00020/J\u0006\u0010<\u001a\u00020/J\u0006\u0010=\u001a\u00020/J\u0016\u0010>\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020?08H\u0002J\u0006\u0010@\u001a\u00020/J\u0006\u0010A\u001a\u00020/J\u0016\u0010B\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020C08H\u0002J\u0006\u0010D\u001a\u00020/J\u0006\u0010E\u001a\u00020/J\u0016\u0010F\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020G08H\u0002J\u0006\u0010H\u001a\u00020/J\u0006\u0010I\u001a\u00020/J\u0016\u0010J\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020K08H\u0002J\u0006\u0010L\u001a\u00020/J\u0006\u0010M\u001a\u00020/J\u0016\u0010N\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020O08H\u0002J\u0006\u0010P\u001a\u00020/J\u0006\u0010Q\u001a\u00020/J\u0016\u0010R\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020S08H\u0002J\u0006\u0010T\u001a\u00020/J\u0006\u0010U\u001a\u00020/J\u0016\u0010V\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020W08H\u0002J\u0006\u0010X\u001a\u00020/J\u0006\u0010Y\u001a\u00020/J\u0016\u0010Z\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020[08H\u0002J\u0006\u0010\\\u001a\u00020/J\u0006\u0010]\u001a\u00020/J\u0016\u0010^\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020_08H\u0002J\u0006\u0010`\u001a\u00020/J\u0016\u0010a\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020b08H\u0002J\u0006\u0010n\u001a\u00020/J\u0006\u0010o\u001a\u00020/J\u0006\u0010p\u001a\u00020/J\u0006\u0010q\u001a\u00020/J\u0006\u0010r\u001a\u00020/J\u0006\u0010s\u001a\u00020/J\u0006\u0010t\u001a\u00020/J\u0016\u0010u\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020v08H\u0002J\u0006\u0010w\u001a\u00020/J\u0006\u0010x\u001a\u00020/J\u0016\u0010y\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020z08H\u0002J\u0006\u0010{\u001a\u00020/J\u0006\u0010|\u001a\u00020/J\u0014\u0010}\u001a\u00020/2\f\u00107\u001a\b\u0012\u0004\u0012\u00020~08J\u0006\u0010\u007f\u001a\u00020/J\u0007\u0010\u0080\u0001\u001a\u00020/J\u0018\u0010\u0081\u0001\u001a\u00020/2\r\u00107\u001a\t\u0012\u0005\u0012\u00030\u0082\u000108H\u0002J\u0007\u0010\u0083\u0001\u001a\u00020/J\u0007\u0010\u0084\u0001\u001a\u00020/J\u0007\u0010\u0085\u0001\u001a\u00020/J\u0018\u0010\u0086\u0001\u001a\u00020/2\r\u00107\u001a\t\u0012\u0005\u0012\u00030\u0087\u000108H\u0002J\u0007\u0010\u0088\u0001\u001a\u00020/J\u0007\u0010\u0089\u0001\u001a\u00020/J\u0018\u0010\u008a\u0001\u001a\u00020/2\r\u00107\u001a\t\u0012\u0005\u0012\u00030\u008b\u000108H\u0002J\u0007\u0010\u008c\u0001\u001a\u00020/J\u0007\u0010\u008d\u0001\u001a\u00020/J\u0007\u0010\u008e\u0001\u001a\u00020/J\u0018\u0010\u008f\u0001\u001a\u00020/2\r\u00107\u001a\t\u0012\u0005\u0012\u00030\u0090\u000108H\u0002J\u0007\u0010\u0091\u0001\u001a\u00020/J\u0007\u0010\u0092\u0001\u001a\u00020/J\u0007\u0010\u0093\u0001\u001a\u00020/J\u0007\u0010\u0094\u0001\u001a\u00020/J\u0007\u0010\u0095\u0001\u001a\u00020/J\u0018\u0010\u0096\u0001\u001a\u00020/2\r\u00107\u001a\t\u0012\u0005\u0012\u00030\u0097\u000108H\u0002J\u0015\u0010\u0098\u0001\u001a\u00020/2\f\b\u0002\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u009a\u0001J\t\u0010\u009b\u0001\u001a\u00020/H\u0002J\u0015\u0010\u009c\u0001\u001a\u00020/2\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009e\u0001H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u0014X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\u001a\u0010(\u001a\u00020)X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010c\u001a\b\u0012\u0004\u0012\u00020e0dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010f\u001a\u00020g¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0011\u0010j\u001a\u00020k¢\u0006\b\n\u0000\u001a\u0004\bl\u0010m¨\u0006\u009f\u0001"}, d2 = {"Lcom/xiaomi/fitness/repo/TestRepos;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "TAG", "", "calendar", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "calendar$delegate", "Lkotlin/Lazy;", "random", "Lkotlin/random/Random;", "getRandom", "()Lkotlin/random/Random;", "random$delegate", "tzOffset", "", "getTzOffset", "()I", "tzOffset$delegate", "tzName", "getTzName", "()Ljava/lang/String;", "tzName$delegate", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "itemNum", "getItemNum", CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "getOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "setLifeCycleOwner", "", "mergeRainbowReport", "testAbnormalRecord", "getDbInstance", "readRedDot", "insertHearingRecord", "getHearingReport", "showHearingReport", "list", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHearingReport;", "deleteServerRequest", "startSummarySync", "insertPAIRecord", "getPAIReport", "showPAIReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;", "insertTLRecord", "getTLReport", "showTLReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTrainingLoadReport;", "insertVo2MaxRecord", "getVo2MaxReport", "showVo2MaxReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;", "insertRunningIndicator", "getRunningIndicator", "showRunIndicator", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyRunningIndicatorReport;", "insertVitality", "getVitality", "showVitality", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVitalityReport;", "insertEnergyRecord", "getEnergyReport", "showEnergyReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;", "insertStressRecord", "getStressReport", "showStressReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "insertWeight", "getWeightReport", "showWeightReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyWeightReport;", "insertSpo2Record", "getSpo2Report", "showSpo2Report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "getSleepReport", "showSleepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "audioAttrList", "", "Lcom/xiaomi/fitness/sleep/behavior/analyze/snore/AudioAttributes;", "audioTime", "", "getAudioTime", "()J", "segmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "getSegmentReport", "()Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "insertSnoreDreamTalkAudioInOldDir", "migrateOldSnoreDreamTalkAudio", "insertSnoreDreamTalkAudioInNewDir", "autoDeleteSleepAudio", "dumpSleepRecord", "insertStrengthRecord", "getStrengthReport", "showStrengthReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyMHStrengthReport;", "insertStandRecord", "getStandReport", "showStandReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStandReport;", "insertCalorieRecord", "getCaloriesReport", "showCalorieReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;", "insertStepRecord", "getStepReport", "showStepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "dumpStepRecord", "insertHeartRate", "getHeartRateReport", "showHeartRateReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "insertBloodPressure", "getBloodPressureReport", "showBloodPressureReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "dumpBloodPressure", "insertBloodSugar", "getBloodSugarReport", "showBloodSugarReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "insertPhysicalStatusReport", "insertExtraDataRecord", "insertBodyTemperature", "insertSkinTemperature", "getTemperature", "showTemperature", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "getHomeData", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "triggerSleepAnimal", "getSleepSegmentInsightReport", "animalReport", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTestRepos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestRepos.kt\ncom/xiaomi/fitness/repo/TestRepos\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1816:1\n37#2:1817\n36#2,3:1818\n37#2:1821\n36#2,3:1822\n37#2:1825\n36#2,3:1826\n37#2:1829\n36#2,3:1830\n37#2:1833\n36#2,3:1834\n37#2:1837\n36#2,3:1838\n37#2:1843\n36#2,3:1844\n37#2:1849\n36#2,3:1850\n37#2:1855\n36#2,3:1856\n37#2:1861\n36#2,3:1862\n37#2:1867\n36#2,3:1868\n37#2:1873\n36#2,3:1874\n37#2:1879\n36#2,3:1880\n37#2:1883\n36#2,3:1884\n37#2:1891\n36#2,3:1892\n37#2:1913\n36#2,3:1914\n37#2:1917\n36#2,3:1918\n37#2:1921\n36#2,3:1922\n37#2:1925\n36#2,3:1926\n37#2:1929\n36#2,3:1930\n1863#3,2:1841\n1863#3,2:1847\n1863#3,2:1853\n1863#3,2:1859\n1863#3,2:1865\n1863#3,2:1871\n1863#3,2:1877\n1863#3,2:1887\n1863#3,2:1889\n1863#3,2:1895\n1863#3,2:1897\n1863#3,2:1899\n1863#3,2:1901\n1863#3,2:1903\n1863#3,2:1905\n1863#3,2:1907\n1863#3,2:1909\n1863#3,2:1911\n1863#3,2:1933\n216#4,2:1935\n*S KotlinDebug\n*F\n+ 1 TestRepos.kt\ncom/xiaomi/fitness/repo/TestRepos\n*L\n113#1:1817\n113#1:1818,3\n143#1:1821\n143#1:1822,3\n173#1:1825\n173#1:1826,3\n204#1:1829\n204#1:1830,3\n289#1:1833\n289#1:1834,3\n309#1:1837\n309#1:1838,3\n396#1:1843\n396#1:1844,3\n452#1:1849\n452#1:1850,3\n506#1:1855\n506#1:1856,3\n571#1:1861\n571#1:1862,3\n623#1:1867\n623#1:1868,3\n680#1:1873\n680#1:1874,3\n744#1:1879\n744#1:1880,3\n764#1:1883\n764#1:1884,3\n931#1:1891\n931#1:1892,3\n1637#1:1913\n1637#1:1914,3\n1660#1:1917\n1660#1:1918,3\n1661#1:1921\n1661#1:1922,3\n1685#1:1925\n1685#1:1926,3\n1706#1:1929\n1706#1:1930,3\n351#1:1841,2\n422#1:1847,2\n478#1:1853,2\n546#1:1859,2\n594#1:1865,2\n646#1:1871,2\n720#1:1877,2\n805#1:1887,2\n906#1:1889,2\n968#1:1895,2\n998#1:1897,2\n1132#1:1899,2\n1197#1:1901,2\n1259#1:1903,2\n1346#1:1905,2\n1481#1:1907,2\n1543#1:1909,2\n1610#1:1911,2\n1741#1:1933,2\n1807#1:1935,2\n*E\n"})
public final class TestRepos {

    @NotNull
    private final String TAG;

    @NotNull
    private final List<AudioAttributes> audioAttrList;
    private final long audioTime;

    /* JADX INFO: renamed from: calendar$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy calendar;
    public Gson gson;
    private final int itemNum;
    public LifecycleOwner owner;

    /* JADX INFO: renamed from: random$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy random;

    @NotNull
    private final SleepSegmentReport segmentReport;

    @NotNull
    private String sid;

    /* JADX INFO: renamed from: tzName$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tzName;

    /* JADX INFO: renamed from: tzOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tzOffset;

    public TestRepos(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = "TestRepos";
        this.calendar = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: w6p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Calendar.getInstance();
            }
        });
        this.random = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: x6p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TestRepos.random_delegate$lambda$1();
            }
        });
        this.tzOffset = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: y6p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(FitnessDateUtils.getCurrentTZOffsetInSec());
            }
        });
        this.tzName = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: a7p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FitnessDateUtils.getCurrentTimeZoneID();
            }
        });
        this.sid = "android-mock-data";
        this.itemNum = 10;
        this.audioAttrList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.audioTime = jCurrentTimeMillis;
        this.segmentReport = new SleepSegmentReport.Builder().wakeupTime(jCurrentTimeMillis / ((long) 1000)).tzOffsetIn15Min(32).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBloodPressureReport$lambda$57(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.d(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showBloodPressureReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBloodPressureReport$lambda$58(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showBloodPressureReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBloodPressureReport$lambda$59(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "monthList = ");
        Intrinsics.checkNotNull(list);
        this$0.showBloodPressureReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBloodSugarReport$lambda$61(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.d(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showBloodSugarReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBloodSugarReport$lambda$62(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showBloodSugarReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBloodSugarReport$lambda$63(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "monthList = ");
        Intrinsics.checkNotNull(list);
        this$0.showBloodSugarReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCaloriesReport$lambda$45(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showCalorieReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCaloriesReport$lambda$46(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showCalorieReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCaloriesReport$lambda$47(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "monthList = ");
        Intrinsics.checkNotNull(list);
        this$0.showCalorieReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getEnergyReport$lambda$22(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showEnergyReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getEnergyReport$lambda$23(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showEnergyReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getEnergyReport$lambda$24(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "monthList = ");
        Intrinsics.checkNotNull(list);
        this$0.showEnergyReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getHearingReport$lambda$6(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showHearingReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getHearingReport$lambda$7(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showHearingReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getHearingReport$lambda$8(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "monthList = ");
        Intrinsics.checkNotNull(list);
        this$0.showHearingReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getHeartRateReport$lambda$53(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.d(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showHeartRateReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getHeartRateReport$lambda$54(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showHeartRateReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getHeartRateReport$lambda$55(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "monthList = ");
        Intrinsics.checkNotNull(list);
        this$0.showHeartRateReport(list);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getHomeData$default(TestRepos testRepos, HomeDataType homeDataType, int i, Object obj) {
        if ((i & 1) != 0) {
            homeDataType = null;
        }
        testRepos.getHomeData(homeDataType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPAIReport$lambda$10(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showPAIReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getRunningIndicator$lambda$18(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.showRunIndicator(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSleepReport$lambda$37(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "dayList size = " + list.size());
        Intrinsics.checkNotNull(list);
        this$0.showSleepReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getSleepSegmentInsightReport(SleepAnimalReport animalReport) {
        if ((animalReport != null ? animalReport.getAnimal() : null) != null) {
            IRepository<? extends DailyBasicReport> repositoryByType = RepositoryManager.INSTANCE.getInstance().getRepositoryByType(HomeDataType.SLEEP);
            Intrinsics.checkNotNull(repositoryByType, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.api.repository.ISleepRepository");
            ((ISleepRepository) repositoryByType).getSleepAnimalInsightReport(animalReport).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: c6p
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TestRepos.getSleepSegmentInsightReport$lambda$71(this.f4996a, (Map) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSleepSegmentInsightReport$lambda$71(TestRepos this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        for (Map.Entry entry : map.entrySet()) {
            FitnessLogUtils.i(this$0.TAG, "getSleepAnimalInsightReport,key(" + entry.getKey() + "-" + entry.getValue() + ")");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSpo2Report$lambda$33(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showSpo2Report(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSpo2Report$lambda$34(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showSpo2Report(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSpo2Report$lambda$35(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "monthList = ");
        Intrinsics.checkNotNull(list);
        this$0.showSpo2Report(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStandReport$lambda$43(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showStandReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStepReport$lambda$49(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showStepReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStepReport$lambda$50(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showStepReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStepReport$lambda$51(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "monthList = ");
        Intrinsics.checkNotNull(list);
        this$0.showStepReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStrengthReport$lambda$39(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showStrengthReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStrengthReport$lambda$40(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showStrengthReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStrengthReport$lambda$41(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "monthList = ");
        Intrinsics.checkNotNull(list);
        this$0.showStrengthReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStressReport$lambda$26(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showStressReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStressReport$lambda$27(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showStressReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getStressReport$lambda$28(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "monthList = ");
        Intrinsics.checkNotNull(list);
        this$0.showStressReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTLReport$lambda$12(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.showTLReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTemperature$lambda$65(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showTemperature(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTemperature$lambda$66(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showTemperature(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTemperature$lambda$67(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "monthList = ");
        Intrinsics.checkNotNull(list);
        this$0.showTemperature(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVitality$lambda$20(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.showVitality(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVo2MaxReport$lambda$14(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "dayList = ");
        Intrinsics.checkNotNull(list);
        this$0.showVo2MaxReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVo2MaxReport$lambda$15(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "weekList = ");
        Intrinsics.checkNotNull(list);
        this$0.showVo2MaxReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVo2MaxReport$lambda$16(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.w(this$0.TAG, "monthList = ");
        Intrinsics.checkNotNull(list);
        this$0.showVo2MaxReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeightReport$lambda$30(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, "weightList = ");
        Intrinsics.checkNotNull(list);
        this$0.showWeightReport(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeightReport$lambda$31(TestRepos this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, ">>> body composition ---- ");
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this$0.TAG, "weightCompositionList is empty");
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FitnessLogUtils.i(this$0.TAG, ((WeightItem) it.next()).toString());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Random random_delegate$lambda$1() {
        return RandomKt.Random(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readRedDot$lambda$4(TestRepos this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, "day -> readRedDot: " + map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readRedDot$lambda$5(TestRepos this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(this$0.TAG, "month -> readRedDot: " + map);
        return Unit.INSTANCE;
    }

    private final void showBloodPressureReport(List<DailyBloodPressureReport> list) {
        List<DailyBloodPressureReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyBloodPressureReport dailyBloodPressureReport : list) {
            if (!dailyBloodPressureReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyBloodPressureReport);
            }
        }
    }

    private final void showBloodSugarReport(List<DailyBloodSugarReport> list) {
        List<DailyBloodSugarReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyBloodSugarReport dailyBloodSugarReport : list) {
            if (!dailyBloodSugarReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyBloodSugarReport);
            }
        }
    }

    private final void showEnergyReport(List<DailyEnergyReport> list) {
        List<DailyEnergyReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyEnergyReport dailyEnergyReport : list) {
            if (!dailyEnergyReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyEnergyReport);
            }
        }
    }

    private final void showHearingReport(List<DailyHearingReport> list) {
        List<DailyHearingReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyHearingReport dailyHearingReport : list) {
            if (!dailyHearingReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyHearingReport);
            }
        }
    }

    private final void showHeartRateReport(List<DailyHrReport> list) {
        List<DailyHrReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyHrReport dailyHrReport : list) {
            if (!dailyHrReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyHrReport);
            }
        }
    }

    private final void showPAIReport(List<DailyPaiReport> list) {
        List<DailyPaiReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyPaiReport dailyPaiReport : list) {
            if (!dailyPaiReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyPaiReport);
            }
        }
    }

    private final void showRunIndicator(List<DailyRunningIndicatorReport> list) {
        List<DailyRunningIndicatorReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "DailyRunningIndicatorReport list is empty");
            return;
        }
        for (DailyRunningIndicatorReport dailyRunningIndicatorReport : list) {
            if (!dailyRunningIndicatorReport.isEmpty()) {
                FitnessLogUtils.i(this.TAG, "DailyRunningIndicatorReport = " + dailyRunningIndicatorReport);
            }
        }
    }

    private final void showSleepReport(List<AllDaySleepReport> list) {
        List<AllDaySleepReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (AllDaySleepReport allDaySleepReport : list) {
            FitnessLogUtils.d(this.TAG, "report = " + allDaySleepReport);
        }
    }

    private final void showSpo2Report(List<DailySpo2Report> list) {
        List<DailySpo2Report> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailySpo2Report dailySpo2Report : list) {
            if (!dailySpo2Report.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailySpo2Report);
            }
        }
    }

    private final void showStandReport(List<DailyStandReport> list) {
        List<DailyStandReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyStandReport dailyStandReport : list) {
            if (!dailyStandReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyStandReport);
            }
        }
    }

    private final void showStepReport(List<DailyStepReport> list) {
        List<DailyStepReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyStepReport dailyStepReport : list) {
            if (!dailyStepReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyStepReport);
            }
        }
    }

    private final void showStrengthReport(List<DailyMHStrengthReport> list) {
        List<DailyMHStrengthReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyMHStrengthReport dailyMHStrengthReport : list) {
            if (!dailyMHStrengthReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyMHStrengthReport);
            }
        }
    }

    private final void showStressReport(List<DailyStressReport> list) {
        List<DailyStressReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyStressReport dailyStressReport : list) {
            if (!dailyStressReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyStressReport);
            }
        }
    }

    private final void showTLReport(List<DailyTrainingLoadReport> list) {
        List<DailyTrainingLoadReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyTrainingLoadReport dailyTrainingLoadReport : list) {
            if (!dailyTrainingLoadReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyTrainingLoadReport);
            }
        }
    }

    private final void showTemperature(List<DailyTempReport> list) {
        List<DailyTempReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "temperature report list is empty");
            return;
        }
        for (DailyTempReport dailyTempReport : list) {
            if (!dailyTempReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "temperature report = " + dailyTempReport);
            }
        }
    }

    private final void showVitality(List<DailyVitalityReport> list) {
        List<DailyVitalityReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "DailyVitalityReport list is empty");
            return;
        }
        for (DailyVitalityReport dailyVitalityReport : list) {
            if (!dailyVitalityReport.isEmpty()) {
                FitnessLogUtils.i(this.TAG, "DailyVitalityReport = " + dailyVitalityReport);
            }
        }
    }

    private final void showVo2MaxReport(List<DailyVo2MaxReport> list) {
        List<DailyVo2MaxReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyVo2MaxReport dailyVo2MaxReport : list) {
            if (!dailyVo2MaxReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyVo2MaxReport);
            }
        }
    }

    private final void showWeightReport(List<DailyWeightReport> list) {
        List<DailyWeightReport> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyWeightReport dailyWeightReport : list) {
            if (!dailyWeightReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyWeightReport);
            }
        }
    }

    private final void triggerSleepAnimal() {
        SleepStatDataRequest.INSTANCE.getInstance().getLatestSleepAnimal().observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.triggerSleepAnimal$lambda$69(this.f28800a, (SleepAnimalReport) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit triggerSleepAnimal$lambda$69(TestRepos this$0, SleepAnimalReport sleepAnimalReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "getLatestSleepAnimal report = " + sleepAnimalReport);
        if (sleepAnimalReport == null || !Intrinsics.areEqual(LocalDate.now(), new LocalDate(sleepAnimalReport.getTime() * ((long) 1000)))) {
            ScopeExtKt.scopeNet(Dispatchers.getIO(), new TestRepos$triggerSleepAnimal$1$1(this$0, null));
        } else {
            Logger.i(this$0.TAG, "triggerSleepAnimal today has generate");
            this$0.getSleepSegmentInsightReport(sleepAnimalReport);
        }
        return Unit.INSTANCE;
    }

    public final void autoDeleteSleepAudio() {
        boolean zDeleteAudioFileIfOver = SleepAudioFileUtils.INSTANCE.deleteAudioFileIfOver(50);
        FitnessLogUtils.e(this.TAG, "autoDeleteSleepAudio:(" + zDeleteAudioFileIfOver + ")");
    }

    public final void deleteServerRequest() {
        FitnessDatabase.INSTANCE.getInstance().serverRequestDao().clear();
        FitnessLogUtils.e(this.TAG, "deleteServerRequest: clear serverRequest");
    }

    public final void dumpBloodPressure() {
        FitnessLogUtils.i(this.TAG, "dumpBloodPressure: <<<<<<< in");
        ((IBloodPressureRepository) new RepositoryManager().getRepository(IBloodPressureRepository.class)).dumpRecords();
        FitnessLogUtils.i(this.TAG, "dumpBloodPressure: >>>>>> out");
    }

    public final void dumpSleepRecord() {
        ISleepRepository iSleepRepository = (ISleepRepository) new RepositoryManager().getRepository(ISleepRepository.class);
        FitnessLogUtils.i(this.TAG, ">>>> dump sleep record");
        iSleepRepository.dumpSleepRecord();
        FitnessLogUtils.i(this.TAG, "<<<< dump sleep record");
    }

    public final void dumpStepRecord() {
        FitnessLogUtils.i(this.TAG, ">>>> dump step Record");
        ((IStepRepository) new RepositoryManager().getRepository(IStepRepository.class)).dumpStepRecord();
        FitnessLogUtils.i(this.TAG, ">>>> dump step Record");
    }

    public final long getAudioTime() {
        return this.audioTime;
    }

    public final void getBloodPressureReport() {
        IBloodPressureRepository iBloodPressureRepository = (IBloodPressureRepository) new RepositoryManager().getRepository(IBloodPressureRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().add(5, -20);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        IRepository.DefaultImpls.getReportList$default(iBloodPressureRepository, "sid", "days", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: e7p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getBloodPressureReport$lambda$57(this.f16356a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iBloodPressureRepository, "sid", "weeks", timeInMillis, 10, 10, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: f7p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getBloodPressureReport$lambda$58(this.f17508a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iBloodPressureRepository, "sid", "months", timeInMillis, 10, 10, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: g7p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getBloodPressureReport$lambda$59(this.f18694a, (List) obj);
            }
        }));
    }

    public final void getBloodSugarReport() {
        IBloodSugarRepository iBloodSugarRepository = (IBloodSugarRepository) new RepositoryManager().getRepository(IBloodSugarRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long timeInMillis = getCalendar().getTimeInMillis() / ((long) 1000);
        IRepository.DefaultImpls.getReportList$default(iBloodSugarRepository, null, "days", timeInMillis, 10, 5, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getBloodSugarReport$lambda$61(this.f22469a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iBloodSugarRepository, null, "weeks", timeInMillis, 1, 1, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: k6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getBloodSugarReport$lambda$62(this.f23532a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iBloodSugarRepository, null, "months", timeInMillis, 1, 1, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: l6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getBloodSugarReport$lambda$63(this.f24725a, (List) obj);
            }
        }));
        getHomeData(HomeDataType.BLOOD_SUGAR);
    }

    @NotNull
    public final Calendar getCalendar() {
        Object value = this.calendar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Calendar) value;
    }

    public final void getCaloriesReport() {
        ICalorieRepository iCalorieRepository = (ICalorieRepository) new RepositoryManager().getRepository(ICalorieRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().add(5, -20);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        IRepository.DefaultImpls.getReportList$default(iCalorieRepository, this.sid, "days", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: l5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getCaloriesReport$lambda$45(this.f24699a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iCalorieRepository, this.sid, "weeks", timeInMillis, 3, 0, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: m5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getCaloriesReport$lambda$46(this.f25785a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iCalorieRepository, this.sid, "months", timeInMillis, 10, 10, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: n5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getCaloriesReport$lambda$47(this.f27578a, (List) obj);
            }
        }));
    }

    public final void getDbInstance() {
        new ConcurrentHashMap();
    }

    public final void getEnergyReport() {
        IEnergyRepository iEnergyRepository = (IEnergyRepository) new RepositoryManager().getRepository(IEnergyRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().add(5, -20);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        IRepository.DefaultImpls.getReportList$default(iEnergyRepository, this.sid, "days", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: q6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getEnergyReport$lambda$22(this.f31182a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iEnergyRepository, this.sid, "weeks", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: r6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getEnergyReport$lambda$23(this.f32251a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iEnergyRepository, this.sid, "months", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: s6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getEnergyReport$lambda$24(this.f33354a, (List) obj);
            }
        }));
    }

    @NotNull
    public final Gson getGson() {
        Gson gson = this.gson;
        if (gson != null) {
            return gson;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gson");
        return null;
    }

    public final void getHearingReport() {
        IHearingRepository iHearingRepository = (IHearingRepository) new RepositoryManager().getRepository(IHearingRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().add(5, -20);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        IRepository.DefaultImpls.getReportList$default(iHearingRepository, this.sid, "days", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: v5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getHearingReport$lambda$6(this.f36510a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iHearingRepository, this.sid, "weeks", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: w5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getHearingReport$lambda$7(this.f37640a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iHearingRepository, this.sid, "months", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: x5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getHearingReport$lambda$8(this.f38733a, (List) obj);
            }
        }));
        for (NoiseItem noiseItem : iHearingRepository.getNoiseItemList(timeInMillis)) {
            FitnessLogUtils.i(this.TAG, "getHearingReport: noise = " + noiseItem);
        }
    }

    public final void getHeartRateReport() {
        IHeartRateRepository iHeartRateRepository = (IHeartRateRepository) new RepositoryManager().getRepository(IHeartRateRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().add(5, -20);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        IRepository.DefaultImpls.getReportList$default(iHeartRateRepository, this.sid, "days", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: r5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getHeartRateReport$lambda$53(this.f32217a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iHeartRateRepository, this.sid, "weeks", timeInMillis, 10, 10, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: t5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getHeartRateReport$lambda$54(this.f34350a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iHeartRateRepository, this.sid, "months", timeInMillis, 10, 10, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: u5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getHeartRateReport$lambda$55(this.f35436a, (List) obj);
            }
        }));
    }

    public final void getHomeData(@Nullable HomeDataType dataType) {
        triggerSleepAnimal();
    }

    public final int getItemNum() {
        return this.itemNum;
    }

    @NotNull
    public final LifecycleOwner getOwner() {
        LifecycleOwner lifecycleOwner = this.owner;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        Intrinsics.throwUninitializedPropertyAccessException(CardInfo.KEY_OWNER);
        return null;
    }

    public final void getPAIReport() {
        IPaiRepository iPaiRepository = (IPaiRepository) new RepositoryManager().getRepository(IPaiRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        for (int i = 1; i < 4; i++) {
            IRepository.DefaultImpls.getReportList$default(iPaiRepository, this.sid, "weeks", timeInMillis, 0, 0, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: b7p
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TestRepos.getPAIReport$lambda$10(this.f3899a, (List) obj);
                }
            }));
            getCalendar().add(5, -7);
            timeInMillis = getCalendar().getTimeInMillis() / j;
        }
    }

    @NotNull
    public final Random getRandom() {
        return (Random) this.random.getValue();
    }

    public final void getRunningIndicator() {
        IRunningIndicatorRepository iRunningIndicatorRepository = (IRunningIndicatorRepository) new RepositoryManager().getRepository(IRunningIndicatorRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long timeInMillis = getCalendar().getTimeInMillis() / ((long) 1000);
        getCalendar().add(5, 30);
        IRepository.DefaultImpls.getReportList$default(iRunningIndicatorRepository, null, "days", timeInMillis, 30, 0, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: f6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getRunningIndicator$lambda$18(this.f17470a, (List) obj);
            }
        }));
    }

    @NotNull
    public final SleepSegmentReport getSegmentReport() {
        return this.segmentReport;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public final void getSleepReport() {
        ISleepRepository iSleepRepository = (ISleepRepository) new RepositoryManager().getRepository(ISleepRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        getCalendar().set(2021, 10, 1);
        long timeInMillis = getCalendar().getTimeInMillis() / ((long) 1000);
        getCalendar().add(5, -20);
        IRepository.DefaultImpls.getReportList$default(iSleepRepository, this.sid, "days", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: d7p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getSleepReport$lambda$37(this.f15198a, (List) obj);
            }
        }));
    }

    public final void getSpo2Report() {
        ISpo2Repository iSpo2Repository = (ISpo2Repository) new RepositoryManager().getRepository(ISpo2Repository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().add(5, -20);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        IRepository.DefaultImpls.getReportList$default(iSpo2Repository, this.sid, "days", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: m6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getSpo2Report$lambda$33(this.f25815a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iSpo2Repository, this.sid, "weeks", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: n6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getSpo2Report$lambda$34(this.f27608a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iSpo2Repository, this.sid, "months", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: p6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getSpo2Report$lambda$35(this.f30070a, (List) obj);
            }
        }));
    }

    public final void getStandReport() {
        IStandRepository iStandRepository = (IStandRepository) new RepositoryManager().getRepository(IStandRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().add(5, -20);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        IRepository.DefaultImpls.getReportList$default(iStandRepository, this.sid, "days", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getStandReport$lambda$43(this.f28777a, (List) obj);
            }
        }));
    }

    public final void getStepReport() {
        IStepRepository iStepRepository = (IStepRepository) new RepositoryManager().getRepository(IStepRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().add(5, -20);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        IRepository.DefaultImpls.getReportList$default(iStepRepository, this.sid, "days", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: t6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getStepReport$lambda$49(this.f34380a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iStepRepository, this.sid, "weeks", timeInMillis, 3, 0, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: u6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getStepReport$lambda$50(this.f35475a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iStepRepository, this.sid, "months", timeInMillis, 10, 10, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: v6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getStepReport$lambda$51(this.f36568a, (List) obj);
            }
        }));
    }

    public final void getStrengthReport() {
        IStrengthRepository iStrengthRepository = (IStrengthRepository) new RepositoryManager().getRepository(IStrengthRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().add(5, -20);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        IRepository.DefaultImpls.getReportList$default(iStrengthRepository, this.sid, "days", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: z5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getStrengthReport$lambda$39(this.f40925a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iStrengthRepository, this.sid, "weeks", timeInMillis, 3, 0, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: a6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getStrengthReport$lambda$40(this.f692a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iStrengthRepository, this.sid, "months", timeInMillis, 10, 10, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: b6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getStrengthReport$lambda$41(this.f3869a, (List) obj);
            }
        }));
    }

    public final void getStressReport() {
        IStressRepository iStressRepository = (IStressRepository) new RepositoryManager().getRepository(IStressRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().add(5, -20);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        this.sid = "320200782";
        IRepository.DefaultImpls.getReportList$default(iStressRepository, "320200782", "days", timeInMillis, 200, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getStressReport$lambda$26(this.f19725a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iStressRepository, this.sid, "weeks", timeInMillis, 200, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: s5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getStressReport$lambda$27(this.f33330a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iStressRepository, this.sid, "months", timeInMillis, 200, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: d6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getStressReport$lambda$28(this.f15151a, (List) obj);
            }
        }));
    }

    public final void getTLReport() {
        ITrainingLoadRepository iTrainingLoadRepository = (ITrainingLoadRepository) new RepositoryManager().getRepository(ITrainingLoadRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        IRepository.DefaultImpls.getReportList$default(iTrainingLoadRepository, this.sid, "days", getCalendar().getTimeInMillis() / ((long) 1000), 28, 0, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: e6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getTLReport$lambda$12(this.f16329a, (List) obj);
            }
        }));
    }

    public final void getTemperature() {
        ITemperatureRepository iTemperatureRepository = (ITemperatureRepository) new RepositoryManager().getRepository(ITemperatureRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long timeInMillis = getCalendar().getTimeInMillis() / ((long) 1000);
        IRepository.DefaultImpls.getReportList$default(iTemperatureRepository, this.sid, "weeks", timeInMillis, 28, 0, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getTemperature$lambda$65(this.f20818a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iTemperatureRepository, this.sid, "weeks", timeInMillis, 10, 10, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getTemperature$lambda$66(this.f22447a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iTemperatureRepository, this.sid, "months", timeInMillis, 10, 10, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: k5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getTemperature$lambda$67(this.f23493a, (List) obj);
            }
        }));
    }

    @NotNull
    public final String getTzName() {
        return (String) this.tzName.getValue();
    }

    public final int getTzOffset() {
        return ((Number) this.tzOffset.getValue()).intValue();
    }

    public final void getVitality() {
        IVitalityRepository iVitalityRepository = (IVitalityRepository) new RepositoryManager().getRepository(IVitalityRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        getCalendar().add(5, 1);
        IRepository.DefaultImpls.getReportList$default(iVitalityRepository, this.sid, "days", getCalendar().getTimeInMillis() / ((long) 1000), 7, 0, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: y5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getVitality$lambda$20(this.f39820a, (List) obj);
            }
        }));
    }

    public final void getVo2MaxReport() {
        IVO2MaxRepository iVO2MaxRepository = (IVO2MaxRepository) new RepositoryManager().getRepository(IVO2MaxRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().add(5, -20);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        IRepository.DefaultImpls.getReportList$default(iVO2MaxRepository, this.sid, "days", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: g6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getVo2MaxReport$lambda$14(this.f18658a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iVO2MaxRepository, this.sid, "weeks", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getVo2MaxReport$lambda$15(this.f19754a, (List) obj);
            }
        }));
        IRepository.DefaultImpls.getReportList$default(iVO2MaxRepository, this.sid, "months", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getVo2MaxReport$lambda$16(this.f20840a, (List) obj);
            }
        }));
    }

    public final void getWeightReport() {
        IWeightRepository iWeightRepository = (IWeightRepository) new RepositoryManager().getRepository(IWeightRepository.class);
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().add(5, -20);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        IRepository.DefaultImpls.getReportList$default(iWeightRepository, null, "days", timeInMillis, 100, 100, false, 32, null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: p5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getWeightReport$lambda$30(this.f30039a, (List) obj);
            }
        }));
        iWeightRepository.getBodyCompositionList(BodyComposition.WEIGHT, timeInMillis, getTzOffset(), 100, 100).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: q5p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.getWeightReport$lambda$31(this.f31145a, (List) obj);
            }
        }));
    }

    public final void insertBloodPressure() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                arrayList.add(new BloodPressureItem(getCalendar().getTimeInMillis() / ((long) 1000), getRandom().nextInt(100, 300), getRandom().nextInt(10, 100)));
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordBloodPressure(this.sid, getTzOffset(), arrayList);
        FitnessLogUtils.e(this.TAG, "insertBloodPressure finished, size = " + arrayList.size());
    }

    public final void insertBloodSugar() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int iNextInt = getRandom().nextInt(40, 50);
        for (int i = 1; i < 289; i++) {
            arrayList.add(new BloodSugarItem(getCalendar().getTimeInMillis() / ((long) 1000), (getRandom().nextInt(-10, 10) + iNextInt) / 10.0f, null, 4, null));
            getCalendar().add(12, -5);
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordBloodSugar(this.sid, getTzOffset(), arrayList);
        FitnessLogUtils.e(this.TAG, "insertBloodSugar finished, size = " + arrayList.size());
    }

    public final void insertBodyTemperature() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                float fNextInt = 34.5f + getRandom().nextInt(-10, 10);
                arrayList.add(new TemperatureItem(timeInMillis / ((long) 1000), Float.valueOf(fNextInt - 1.0f), Float.valueOf(fNextInt)));
                getCalendar().add(12, -getRandom().nextInt(1000));
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(5, getRandom().nextInt(0, 7) * (-1));
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        int tzOffset = getTzOffset();
        TemperatureItem[] temperatureItemArr = (TemperatureItem[]) arrayList.toArray(new TemperatureItem[0]);
        companion.recordTemperatureItem("xiaomiwear_app_manually", tzOffset, (TemperatureItem[]) Arrays.copyOf(temperatureItemArr, temperatureItemArr.length));
        FitnessLogUtils.e(this.TAG, "insertBodyTemperature: finished size = " + arrayList.size());
    }

    public final void insertCalorieRecord() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                arrayList.add(new CaloriesItem(getCalendar().getTimeInMillis() / ((long) 1000), getRandom().nextInt(10, 100)));
                getCalendar().add(12, -getRandom().nextInt(100));
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordCalorie(this.sid, getTzOffset(), arrayList);
        FitnessLogUtils.e(this.TAG, "insertCalorieRecord: finished, size = " + arrayList.size());
    }

    public final void insertEnergyRecord() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 0;
        int i3 = 1;
        if (1 <= i) {
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                getCalendar().set(12, i2);
                getCalendar().set(13, i2);
                getCalendar().set(14, i2);
                int i4 = 40;
                do {
                    int iNextInt = getRandom().nextInt(60, 100);
                    int iNextInt2 = getRandom().nextInt(1000) % 4;
                    arrayList.add(new EnergyItem(timeInMillis / ((long) 1000), iNextInt, Integer.valueOf(iNextInt2 + ((((iNextInt2 ^ 4) & ((-iNextInt2) | iNextInt2)) >> 31) & 4)), Integer.valueOf(getRandom().nextInt(-100, 100))));
                    timeInMillis += (long) 60000;
                    i4--;
                } while (i4 > 0);
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i3 == i) {
                    break;
                }
                i3++;
                i2 = 0;
            }
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str = this.sid;
        int tzOffset = getTzOffset();
        EnergyItem[] energyItemArr = (EnergyItem[]) arrayList.toArray(new EnergyItem[0]);
        companion.recordDailyEnergy(str, tzOffset, (EnergyItem[]) Arrays.copyOf(energyItemArr, energyItemArr.length));
        FitnessLogUtils.e(this.TAG, "insertStressRecord: finished Daily Energy, size = " + arrayList.size());
    }

    public final void insertExtraDataRecord() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        getRandom().nextInt(40, 50);
        for (int i = 1; i < 43; i++) {
            int iNextInt = getRandom().nextInt(0, 25);
            long j = 1000;
            LightValueItem lightValueItem = new LightValueItem(getCalendar().getTimeInMillis() / j, iNextInt);
            body bodyVar = new body(getCalendar().getTimeInMillis() / j, iNextInt);
            arrayList.add(lightValueItem);
            arrayList2.add(bodyVar);
            getCalendar().add(5, -1);
        }
        FitnessDataRecorderImpl.Companion companion = FitnessDataRecorderImpl.INSTANCE;
        FitnessDataRecorderImpl companion2 = companion.getInstance();
        String str = this.sid;
        int tzOffset = getTzOffset();
        LightValueItem[] lightValueItemArr = (LightValueItem[]) arrayList.toArray(new LightValueItem[0]);
        companion2.recordDailyLightValue(str, tzOffset, (LightValueItem[]) Arrays.copyOf(lightValueItemArr, lightValueItemArr.length));
        FitnessDataRecorderImpl companion3 = companion.getInstance();
        String str2 = this.sid;
        int tzOffset2 = getTzOffset();
        body[] bodyVarArr = (body[]) arrayList2.toArray(new body[0]);
        companion3.recordDailyBodyMomentum(str2, tzOffset2, (body[]) Arrays.copyOf(bodyVarArr, bodyVarArr.length));
        FitnessLogUtils.e(this.TAG, "insertBloodSugar finished, size = " + arrayList.size());
    }

    public final void insertHearingRecord() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 14;
        int i3 = 13;
        int i4 = 1;
        if (1 <= i) {
            int i5 = 1;
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                getCalendar().set(12, 0);
                getCalendar().set(i3, 0);
                getCalendar().set(i2, 0);
                long j = 1000;
                arrayList.add(new HeadsetItem(timeInMillis / j, (TimeUnit.MINUTES.toMillis(getRandom().nextLong(10L, 200L)) + timeInMillis) / j, getRandom().nextBoolean()));
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i5 == i) {
                    break;
                }
                i5++;
                i2 = 14;
                i3 = 13;
            }
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str = this.sid;
        int tzOffset = getTzOffset();
        HeadsetItem[] headsetItemArr = (HeadsetItem[]) arrayList.toArray(new HeadsetItem[0]);
        companion.recordHeadset(str, tzOffset, (HeadsetItem[]) Arrays.copyOf(headsetItemArr, headsetItemArr.length));
        FitnessLogUtils.e(this.TAG, "insertHearingRecord: finished HeadSet, size = " + arrayList.size());
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList2 = new ArrayList();
        int i6 = this.itemNum;
        if (1 <= i6) {
            while (true) {
                long timeInMillis2 = getCalendar().getTimeInMillis();
                getCalendar().set(12, 0);
                getCalendar().set(13, 0);
                getCalendar().set(14, 0);
                arrayList2.add(new NoiseItem(timeInMillis2 / ((long) 1000), getRandom().nextInt(10, 200)));
                getCalendar().setTimeInMillis(timeInMillis2);
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i4 == i6) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        FitnessDataRecorderImpl companion2 = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str2 = this.sid;
        int tzOffset2 = getTzOffset();
        NoiseItem[] noiseItemArr = (NoiseItem[]) arrayList2.toArray(new NoiseItem[0]);
        companion2.recordHeadsetNoise(str2, tzOffset2, (NoiseItem[]) Arrays.copyOf(noiseItemArr, noiseItemArr.length));
        FitnessLogUtils.e(this.TAG, "insertHearingRecord: finished NoiseItem, size = " + arrayList2.size());
    }

    public final void insertHeartRate() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 12;
        int i3 = 1;
        if (1 <= i) {
            int i4 = 1;
            while (true) {
                HrItem hrItem = new HrItem(getCalendar().getTimeInMillis() / ((long) 1000), getRandom().nextInt(10, 300));
                hrItem.setHrType(1);
                arrayList.add(hrItem);
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i4 == i) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        arrayList.add(new HrItem(0L, 80));
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordManualHr(this.sid, getTzOffset(), arrayList);
        FitnessLogUtils.e(this.TAG, "insertHeartRate: 手动心率 finished, size = " + arrayList.size());
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList2 = new ArrayList();
        int i5 = this.itemNum;
        if (1 <= i5) {
            int i6 = 1;
            while (true) {
                long j = 1000;
                RestHrItem restHrItem = new RestHrItem(getCalendar().getTimeInMillis() / j, getRandom().nextInt(10, 300));
                restHrItem.setSid(this.sid);
                arrayList2.add(restHrItem);
                getCalendar().add(i2, -getRandom().nextInt(1000));
                FitnessDataRecorderImpl.Companion companion = FitnessDataRecorderImpl.INSTANCE;
                companion.getInstance().recordRestHr(this.sid, getTzOffset(), restHrItem);
                companion.getInstance().recordLactateThreshold(this.sid, getTzOffset(), new LactateThresholdItem(getCalendar().getTimeInMillis() / j, getTzOffset(), Integer.valueOf(getRandom().nextInt(100, 300)), Integer.valueOf(getRandom().nextInt(10, 255))));
                if (i6 == i5) {
                    break;
                }
                i6++;
                i2 = 12;
            }
        }
        FitnessLogUtils.e(this.TAG, "insertHeartRate: 静息心率 finished, size = " + arrayList.size());
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList3 = new ArrayList();
        int i7 = this.itemNum;
        if (1 <= i7) {
            int i8 = 1;
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis() / ((long) 1000);
                AbnormalFibItem abnormalFibItem = new AbnormalFibItem(timeInMillis, getRandom().nextLong(5000L, 100000L) + timeInMillis);
                abnormalFibItem.setSid(this.sid);
                arrayList3.add(abnormalFibItem);
                getCalendar().add(12, -getRandom().nextInt(1000));
                FitnessDataRecorderImpl.INSTANCE.getInstance().recordAbnormalFib(this.sid, getTzOffset(), abnormalFibItem);
                if (i8 == i7) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        FitnessLogUtils.e(this.TAG, "insertHeartRate: 异常心博 finished, size = " + arrayList3.size());
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList4 = new ArrayList();
        int i9 = this.itemNum;
        if (1 <= i9) {
            while (true) {
                AbnormalHrItem abnormalHrItem = new AbnormalHrItem(getCalendar().getTimeInMillis() / ((long) 1000), getRandom().nextInt(150, 250), Integer.valueOf(getRandom().nextInt(50, 180)));
                abnormalHrItem.setSid(this.sid);
                arrayList4.add(abnormalHrItem);
                getCalendar().add(12, -getRandom().nextInt(1000));
                FitnessDataRecorderImpl.INSTANCE.getInstance().recordAbnormalHr(this.sid, getTzOffset(), abnormalHrItem);
                if (i3 == i9) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        FitnessLogUtils.e(this.TAG, "insertHeartRate: 异常心率升高 finished, size = " + arrayList4.size());
    }

    public final void insertPAIRecord() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 0;
        if (1 <= i) {
            int i3 = 1;
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                getCalendar().set(12, i2);
                getCalendar().set(13, i2);
                getCalendar().set(14, i2);
                arrayList.add(new OneDayPaiReport(timeInMillis / ((long) 1000), getRandom().nextInt(1, 100), getRandom().nextInt(50, 100), getRandom().nextInt(1, 100), getRandom().nextInt(1, 100), getRandom().nextInt(1, 100)));
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i3 == i) {
                    break;
                }
                i3++;
                i2 = 0;
            }
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str = this.sid;
        int tzOffset = getTzOffset();
        OneDayPaiReport[] oneDayPaiReportArr = (OneDayPaiReport[]) arrayList.toArray(new OneDayPaiReport[0]);
        companion.recordPai(str, tzOffset, (OneDayPaiReport[]) Arrays.copyOf(oneDayPaiReportArr, oneDayPaiReportArr.length));
        FitnessLogUtils.e(this.TAG, "insertStressRecord: finished PAI, size = " + arrayList.size());
    }

    public final void insertPhysicalStatusReport() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        getRandom().nextInt(40, 50);
        for (int i = 1; i < 43; i++) {
            arrayList.add(new PhysicalStatusItem(getCalendar().getTimeInMillis() / ((long) 1000), Integer.valueOf(getRandom().nextInt(0, 25)), Integer.valueOf(getRandom().nextInt(50, 500)), Integer.valueOf(getRandom().nextInt(10, 400)), Integer.valueOf(getRandom().nextInt(-35, 25))));
            getCalendar().add(5, -1);
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str = this.sid;
        int tzOffset = getTzOffset();
        PhysicalStatusItem[] physicalStatusItemArr = (PhysicalStatusItem[]) arrayList.toArray(new PhysicalStatusItem[0]);
        companion.recordPhysicalStatus(str, tzOffset, (PhysicalStatusItem[]) Arrays.copyOf(physicalStatusItemArr, physicalStatusItemArr.length));
        FitnessLogUtils.e(this.TAG, "insertBloodSugar finished, size = " + arrayList.size());
    }

    public final void insertRunningIndicator() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                arrayList.add(new RunningIndicatorItem(timeInMillis / ((long) 1000), getRandom().nextInt(10, 1000) / 10.0f, Integer.valueOf(getRandom().nextInt(1, 5))));
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str = this.sid;
        int tzOffset = getTzOffset();
        RunningIndicatorItem[] runningIndicatorItemArr = (RunningIndicatorItem[]) arrayList.toArray(new RunningIndicatorItem[0]);
        companion.recordRunningIndicator(str, tzOffset, (RunningIndicatorItem[]) Arrays.copyOf(runningIndicatorItemArr, runningIndicatorItemArr.length));
        FitnessLogUtils.e(this.TAG, "insertRunningIndicator: finished run ability index, size = " + arrayList.size());
    }

    public final void insertSkinTemperature() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                arrayList.add(new TemperatureItem(timeInMillis / ((long) 1000), Float.valueOf(34.5f + getRandom().nextInt(-10, 10)), null, 4, null));
                getCalendar().add(12, -getRandom().nextInt(1000));
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(5, getRandom().nextInt(0, 7) * (-1));
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        int tzOffset = getTzOffset();
        TemperatureItem[] temperatureItemArr = (TemperatureItem[]) arrayList.toArray(new TemperatureItem[0]);
        companion.recordTemperatureItem("xiaomiwear_app_manually", tzOffset, (TemperatureItem[]) Arrays.copyOf(temperatureItemArr, temperatureItemArr.length));
        FitnessLogUtils.e(this.TAG, "insertSkinTemperature: finished size = " + arrayList.size());
    }

    public final void insertSnoreDreamTalkAudioInNewDir() throws IOException {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        for (int i = 1; i < 21; i++) {
            long timeInMillis = getCalendar().getTimeInMillis() / ((long) 1000);
            SleepAudioFileUtils sleepAudioFileUtils = SleepAudioFileUtils.INSTANCE;
            File theAudioFilePath = sleepAudioFileUtils.getTheAudioFilePath(timeInMillis, 32);
            theAudioFilePath.mkdirs();
            File file = new File(theAudioFilePath, sleepAudioFileUtils.getAudioFileName(timeInMillis, 120, 0));
            file.createNewFile();
            new FileOutputStream(file).write(new byte[1000000]);
            getCalendar().add(12, -getRandom().nextInt(1000));
        }
        FitnessLogUtils.e(this.TAG, "insertSnoreDreamTalkAudioInNewDir: finished");
    }

    public final void insertSnoreDreamTalkAudioInOldDir() {
    }

    public final void insertSpo2Record() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                getCalendar().set(12, 0);
                getCalendar().set(13, 0);
                getCalendar().set(14, 0);
                arrayList.add(new Spo2Item(timeInMillis / ((long) 1000), getRandom().nextInt(60, 100)));
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str = this.sid;
        int tzOffset = getTzOffset();
        Spo2Item[] spo2ItemArr = (Spo2Item[]) arrayList.toArray(new Spo2Item[0]);
        companion.recordManualSpo2(str, tzOffset, (Spo2Item[]) Arrays.copyOf(spo2ItemArr, spo2ItemArr.length));
        FitnessLogUtils.e(this.TAG, "insertSpo2Record: finished, size = " + arrayList.size());
    }

    public final void insertStandRecord() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                getCalendar().set(12, 0);
                getCalendar().set(13, 0);
                getCalendar().set(14, 0);
                long timeInMillis2 = getCalendar().getTimeInMillis() / ((long) 1000);
                arrayList.add(new ValidStandItem(timeInMillis2, ((long) 3600) + timeInMillis2));
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(12, -getRandom().nextInt(100));
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordValidStand(this.sid, getTzOffset(), arrayList);
        FitnessLogUtils.e(this.TAG, "insertStandRecord: finished, size = " + arrayList.size());
    }

    public final void insertStepRecord() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 10;
        if (1 <= i) {
            int i3 = 1;
            while (true) {
                arrayList.add(new StepItem(getCalendar().getTimeInMillis() / ((long) 1000), getRandom().nextInt(400), getRandom().nextInt(1000), getRandom().nextInt(i2, 100)));
                getCalendar().add(12, -getRandom().nextInt(100));
                if (i3 == i) {
                    break;
                }
                i3++;
                i2 = 10;
            }
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordStep(this.sid, getTzOffset(), arrayList);
        FitnessLogUtils.e(this.TAG, "insertStepRecord: finished, size = " + arrayList.size());
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList2 = new ArrayList();
        int i4 = this.itemNum;
        if (1 <= i4) {
            int i5 = 1;
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis() / ((long) 1000);
                arrayList2.add(new ActiveStageItem(timeInMillis, timeInMillis + TimeUnit.MINUTES.toSeconds(getRandom().nextLong(300L)), getRandom().nextInt(1, 7), Integer.valueOf(getRandom().nextInt(400)), getRandom().nextInt(1000), getRandom().nextInt(10, 100), Float.valueOf(getRandom().nextFloat() * 300.0f)));
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i5 == i4) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordActiveStage(this.sid, getTzOffset(), arrayList2);
        FitnessLogUtils.e(this.TAG, "insertStepRecord 插入自动识别记录: finished, size = " + arrayList2.size());
    }

    public final void insertStrengthRecord() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                getCalendar().set(12, 0);
                getCalendar().set(13, 0);
                getCalendar().set(14, 0);
                arrayList.add(new MHStrengthItem(getCalendar().getTimeInMillis() / ((long) 1000)));
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(12, -getRandom().nextInt(100));
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordMHStrength(this.sid, getTzOffset(), arrayList);
        FitnessLogUtils.e(this.TAG, "insertStrengthRecord: finished, size = " + arrayList.size());
    }

    public final void insertStressRecord() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 14;
        int i3 = 13;
        int i4 = 1000;
        if (1 <= i) {
            int i5 = 1;
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                getCalendar().set(12, 0);
                getCalendar().set(i3, 0);
                getCalendar().set(i2, 0);
                arrayList.add(new StressItem(timeInMillis / ((long) 1000), getRandom().nextInt(60, 100)));
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i5 == i) {
                    break;
                }
                i5++;
                i2 = 14;
                i3 = 13;
            }
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str = this.sid;
        int tzOffset = getTzOffset();
        StressItem[] stressItemArr = (StressItem[]) arrayList.toArray(new StressItem[0]);
        companion.recordDailyStress(str, tzOffset, (StressItem[]) Arrays.copyOf(stressItemArr, stressItemArr.length));
        FitnessLogUtils.e(this.TAG, "insertStressRecord: finished Daily Stress, size = " + arrayList.size());
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList2 = new ArrayList();
        int i6 = this.itemNum;
        if (1 <= i6) {
            int i7 = 1;
            while (true) {
                long timeInMillis2 = getCalendar().getTimeInMillis();
                getCalendar().set(12, 0);
                getCalendar().set(13, 0);
                getCalendar().set(14, 0);
                arrayList2.add(new StressItem(timeInMillis2 / ((long) i4), getRandom().nextInt(1, 100)));
                getCalendar().setTimeInMillis(timeInMillis2);
                getCalendar().add(12, -getRandom().nextInt(500));
                if (i7 == i6) {
                    break;
                }
                i7++;
                i4 = 1000;
            }
        }
        FitnessDataRecorderImpl companion2 = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str2 = this.sid;
        int tzOffset2 = getTzOffset();
        StressItem[] stressItemArr2 = (StressItem[]) arrayList2.toArray(new StressItem[0]);
        companion2.recordManualStress(str2, tzOffset2, (StressItem[]) Arrays.copyOf(stressItemArr2, stressItemArr2.length));
        FitnessLogUtils.e(this.TAG, "insertStressRecord: finished Manual Stress, size = " + arrayList2.size());
    }

    public final void insertTLRecord() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                getCalendar().set(12, 0);
                getCalendar().set(13, 0);
                getCalendar().set(14, 0);
                TrainingLoadItem trainingLoadItem = new TrainingLoadItem(timeInMillis / ((long) 1000), getRandom().nextInt(1, 400));
                trainingLoadItem.setCurrentDayTL(Integer.valueOf(getRandom().nextInt(1, 400)));
                trainingLoadItem.setTlLevel(Integer.valueOf(getRandom().nextInt(0, 4)));
                arrayList.add(trainingLoadItem);
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(5, i2 * (-1));
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str = this.sid;
        int tzOffset = getTzOffset();
        TrainingLoadItem[] trainingLoadItemArr = (TrainingLoadItem[]) arrayList.toArray(new TrainingLoadItem[0]);
        companion.recordTrainingLoad(str, tzOffset, (TrainingLoadItem[]) Arrays.copyOf(trainingLoadItemArr, trainingLoadItemArr.length));
        FitnessLogUtils.e(this.TAG, "insertTLRecord: finished tl size = " + arrayList.size());
    }

    public final void insertVitality() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 0;
        int i3 = 1;
        if (1 <= i) {
            int i4 = 1;
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                arrayList.add(new VitalityItem(timeInMillis / ((long) 1000), getRandom().nextInt(i2, 10), getRandom().nextInt(i3, 5), getRandom().nextInt(i2, 3), getRandom().nextInt(5, 120), Integer.valueOf(getRandom().nextInt(i2, 2)), Integer.valueOf(getRandom().nextInt(i2, 30))));
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(5, -1);
                if (i4 == i) {
                    break;
                }
                i4++;
                i2 = 0;
                i3 = 1;
            }
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str = this.sid;
        int tzOffset = getTzOffset();
        VitalityItem[] vitalityItemArr = (VitalityItem[]) arrayList.toArray(new VitalityItem[0]);
        companion.recordVitalityItem(str, tzOffset, (VitalityItem[]) Arrays.copyOf(vitalityItemArr, vitalityItemArr.length));
        FitnessLogUtils.e(this.TAG, "insertVitality: finished, size = " + arrayList.size());
    }

    public final void insertVo2MaxRecord() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        int i2 = 1;
        if (1 <= i) {
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                getCalendar().set(12, 0);
                getCalendar().set(13, 0);
                getCalendar().set(14, 0);
                arrayList.add(new Vo2MaxItem(timeInMillis / ((long) 1000), getRandom().nextInt(60, 100)));
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str = this.sid;
        int tzOffset = getTzOffset();
        Vo2MaxItem[] vo2MaxItemArr = (Vo2MaxItem[]) arrayList.toArray(new Vo2MaxItem[0]);
        companion.recordV02max(str, tzOffset, (Vo2MaxItem[]) Arrays.copyOf(vo2MaxItemArr, vo2MaxItemArr.length));
        FitnessLogUtils.e(this.TAG, "insertStressRecord: finished Daily Vo2Max, size = " + arrayList.size());
    }

    public final void insertWeight() {
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i = this.itemNum;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                float fNextFloat = getRandom().nextFloat() * 100;
                float f = 170;
                WeightItem weightItem = new WeightItem(getCalendar().getTimeInMillis() / ((long) 1000), fNextFloat, Float.valueOf(fNextFloat / (((f / 100.0f) * f) / 100.0f)));
                int i3 = i2 % 4;
                int i4 = i3 + ((((i3 ^ 4) & ((-i3) | i3)) >> 31) & 4);
                if (i4 == 0) {
                    weightItem.setMoistureRate(Float.valueOf(getRandom().nextInt(35, 75)));
                    weightItem.setBodyFatRate(Float.valueOf(getRandom().nextInt(3, 55)));
                    weightItem.setProteinRate(Float.valueOf(getRandom().nextInt(2, 30)));
                } else if (i4 == 1) {
                    weightItem.setMuscleMass(Float.valueOf(getRandom().nextFloat()));
                    weightItem.setBodyMoistureMass(Float.valueOf(getRandom().nextFloat()));
                    weightItem.setFatMass(Float.valueOf(getRandom().nextFloat()));
                    weightItem.setBoneSaltMass(Float.valueOf(getRandom().nextFloat()));
                    weightItem.setProteinMass(Float.valueOf(getRandom().nextFloat()));
                } else if (i4 == 2) {
                    weightItem.setLeftLowerLimbFatMass(Float.valueOf(getRandom().nextInt(20, 350) / 10.0f));
                    weightItem.setLeftLowerLimbMuscleMass(Float.valueOf(getRandom().nextInt(20, 350) / 10.0f));
                    weightItem.setLeftUpperLimbFatMass(Float.valueOf(getRandom().nextInt(5, 250) / 10.0f));
                    weightItem.setLeftUpperLimbMuscleMass(Float.valueOf(getRandom().nextInt(5, 250) / 10.0f));
                    weightItem.setRightLowerLimbFatMass(Float.valueOf(getRandom().nextInt(20, 350) / 10.0f));
                    weightItem.setRightLowerLimbMuscleMass(Float.valueOf(getRandom().nextInt(20, 350) / 10.0f));
                    weightItem.setRightUpperLimbFatMass(Float.valueOf(getRandom().nextInt(5, 250) / 10.0f));
                    weightItem.setRightUpperLimbMuscleMass(Float.valueOf(getRandom().nextInt(5, 250) / 10.0f));
                    weightItem.setUpperLimbFatBalance(Integer.valueOf(getRandom().nextInt(1, 3)));
                    weightItem.setUpperLimbMuscleBalance(Integer.valueOf(getRandom().nextInt(1, 3)));
                    weightItem.setLowerLimbFatBalance(Integer.valueOf(getRandom().nextInt(1, 3)));
                    weightItem.setLowerLimbMuscleBalance(Integer.valueOf(getRandom().nextInt(1, 3)));
                } else if (i4 == 3) {
                    weightItem.setSomatotype(Integer.valueOf(getRandom().nextInt(1, 10)));
                    weightItem.setBodyShape(Integer.valueOf(getRandom().nextInt(1, 5)));
                    weightItem.setWhr(Float.valueOf(getRandom().nextInt(6, 15) / 10.0f));
                    weightItem.setBodyScore(Integer.valueOf(getRandom().nextInt(45, 100)));
                    weightItem.setBodyAge(Integer.valueOf(getRandom().nextInt(15, 99)));
                    weightItem.setStandardWeight(Integer.valueOf(getRandom().nextInt(16, 106)));
                    weightItem.setRecommendedCaloriesIntake(Integer.valueOf(getRandom().nextInt()));
                }
                arrayList.add(weightItem);
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        FitnessDataRecorderImpl.INSTANCE.getInstance().recordWeight("xiaomiwear_app_manually", getTzOffset(), arrayList);
        FitnessLogUtils.e(this.TAG, "insertWeight: finished, size = " + arrayList.size());
    }

    public final void mergeRainbowReport() {
        ISummarySyncManager.DefaultImpls.doSummarySync$default(SummarySyncManager.INSTANCE.getInstance(), null, null, 3, null);
        FitnessDataChangedUtils.sendRecentDataChangedBroadcast$default(FitnessDataChangedUtils.INSTANCE, FitnessDataChangedSource.CloudSync, true, null, null, false, 28, null);
    }

    public final void migrateOldSnoreDreamTalkAudio() {
    }

    public final void readRedDot() {
        IRedDotRepository redDotRepository = RepositoryManager.INSTANCE.getInstance().getRedDotRepository();
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        getCalendar().set(5, 1);
        TimeUtils.setToZeroOClock(getCalendar());
        long j = 1000;
        long timeInMillis = getCalendar().getTimeInMillis() / j;
        getCalendar().set(5, getCalendar().getActualMaximum(5));
        getCalendar().add(5, 1);
        long timeInMillis2 = getCalendar().getTimeInMillis() / j;
        HomeDataType homeDataType = HomeDataType.STEP;
        FlowLiveDataConversions.asLiveData$default(IRedDotRepository.DefaultImpls.getRedDotMap$default(redDotRepository, homeDataType, timeInMillis, timeInMillis2, null, 8, null), (CoroutineContext) null, 0L, 3, (Object) null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: z6p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.readRedDot$lambda$4(this.f40957a, (Map) obj);
            }
        }));
        getCalendar().add(2, -6);
        getCalendar().set(5, 1);
        TimeUtils.setToZeroOClock(getCalendar());
        long timeInMillis3 = getCalendar().getTimeInMillis() / j;
        getCalendar().add(2, 6);
        getCalendar().set(5, getCalendar().getActualMaximum(5));
        getCalendar().add(5, 1);
        FlowLiveDataConversions.asLiveData$default(redDotRepository.getRedDotMap(homeDataType, timeInMillis3, getCalendar().getTimeInMillis() / j, "months"), (CoroutineContext) null, 0L, 3, (Object) null).observe(getOwner(), new TestReposKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: c7p
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TestRepos.readRedDot$lambda$5(this.f5025a, (Map) obj);
            }
        }));
    }

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }

    public final void setLifeCycleOwner(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setOwner(owner);
    }

    public final void setOwner(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<set-?>");
        this.owner = lifecycleOwner;
    }

    public final void setSid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sid = str;
    }

    public final void showCalorieReport(@NotNull List<DailyCalorieReport> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            FitnessLogUtils.i(this.TAG, "report list is empty");
            return;
        }
        for (DailyCalorieReport dailyCalorieReport : list) {
            if (!dailyCalorieReport.isEmpty()) {
                FitnessLogUtils.d(this.TAG, "report = " + dailyCalorieReport);
            }
        }
    }

    public final void startSummarySync() {
        mergeRainbowReport();
    }

    public final void testAbnormalRecord() {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        long j;
        long j2;
        String str5;
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        int i2 = this.itemNum;
        int i3 = 14;
        String str6 = "Step must be positive, was: ";
        long j3 = 200;
        String str7 = ".";
        long j4 = 10;
        int i4 = 13;
        int i5 = 12;
        int i6 = 0;
        int i7 = 1;
        if (1 <= i2) {
            while (true) {
                long timeInMillis = getCalendar().getTimeInMillis();
                getCalendar().set(i5, i6);
                getCalendar().set(i4, i6);
                getCalendar().set(i3, i6);
                long millis = TimeUnit.MINUTES.toMillis(getRandom().nextLong(j4, j3)) + timeInMillis;
                ArrayList arrayList2 = new ArrayList();
                long j5 = 1000;
                long j6 = timeInMillis / j5;
                long j7 = millis / j5;
                int i8 = i7;
                long jNextLong = getRandom().nextLong(1000L, EcoBanner.BANNER_CHANGE_TIME);
                if (jNextLong <= 0) {
                    throw new IllegalArgumentException(str6 + jNextLong + str7);
                }
                long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(j6, j7, jNextLong);
                if (j6 <= progressionLastElement) {
                    long j8 = j6;
                    while (true) {
                        str5 = str6;
                        arrayList2.add(new AbnormalItem(j8, getRandom().nextInt(300)));
                        if (j8 == progressionLastElement) {
                            break;
                        }
                        j8 += jNextLong;
                        str6 = str5;
                    }
                } else {
                    str5 = str6;
                }
                arrayList.add(new SegmentItem(j6, j7, arrayList2, getRandom().nextInt(255)));
                getCalendar().setTimeInMillis(timeInMillis);
                getCalendar().add(12, -getRandom().nextInt(1000));
                if (i8 == i2) {
                    str = str5;
                    break;
                }
                i7 = i8 + 1;
                str6 = str5;
                i4 = 13;
                i3 = 14;
                j4 = 10;
                i5 = 12;
                i6 = 0;
                j3 = 200;
            }
        } else {
            str = "Step must be positive, was: ";
        }
        FitnessDataRecorderImpl companion = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str8 = this.sid;
        int tzOffset = getTzOffset();
        SegmentItem[] segmentItemArr = (SegmentItem[]) arrayList.toArray(new SegmentItem[0]);
        companion.recordAbnormalHrHigh(str8, tzOffset, (SegmentItem[]) Arrays.copyOf(segmentItemArr, segmentItemArr.length));
        String str9 = this.TAG;
        int size = arrayList.size();
        StringBuilder sb = new StringBuilder();
        String str10 = "insert abnormal Hr low Record: finished, size = ";
        sb.append("insert abnormal Hr low Record: finished, size = ");
        sb.append(size);
        FitnessLogUtils.e(str9, sb.toString());
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList3 = new ArrayList();
        int i9 = this.itemNum;
        if (1 <= i9) {
            int i10 = 1;
            while (true) {
                long timeInMillis2 = getCalendar().getTimeInMillis();
                getCalendar().set(12, 0);
                getCalendar().set(13, 0);
                getCalendar().set(14, 0);
                String str11 = str7;
                long millis2 = TimeUnit.MINUTES.toMillis(getRandom().nextLong(10L, 200L)) + timeInMillis2;
                ArrayList arrayList4 = new ArrayList();
                long j9 = 1000;
                long j10 = timeInMillis2 / j9;
                long j11 = millis2 / j9;
                int i11 = i9;
                String str12 = str;
                int i12 = i10;
                str2 = str10;
                long jNextLong2 = getRandom().nextLong(1000L, EcoBanner.BANNER_CHANGE_TIME);
                if (jNextLong2 <= 0) {
                    throw new IllegalArgumentException(str12 + jNextLong2 + str11);
                }
                long progressionLastElement2 = ProgressionUtilKt.getProgressionLastElement(j10, j11, jNextLong2);
                if (j10 <= progressionLastElement2) {
                    long j12 = j10;
                    while (true) {
                        j2 = timeInMillis2;
                        arrayList4.add(new AbnormalItem(j12, getRandom().nextInt(300)));
                        if (j12 == progressionLastElement2) {
                            break;
                        }
                        j12 += jNextLong2;
                        timeInMillis2 = j2;
                    }
                } else {
                    j2 = timeInMillis2;
                }
                arrayList3.add(new SegmentItem(j10, j11, arrayList4, getRandom().nextInt(255)));
                getCalendar().setTimeInMillis(j2);
                getCalendar().add(12, -getRandom().nextInt(1000));
                i9 = i11;
                if (i12 == i9) {
                    str7 = str11;
                    str = str12;
                    break;
                } else {
                    i10 = i12 + 1;
                    str7 = str11;
                    str10 = str2;
                    str = str12;
                }
            }
        } else {
            str2 = "insert abnormal Hr low Record: finished, size = ";
        }
        FitnessDataRecorderImpl companion2 = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str13 = this.sid;
        int tzOffset2 = getTzOffset();
        SegmentItem[] segmentItemArr2 = (SegmentItem[]) arrayList3.toArray(new SegmentItem[0]);
        companion2.recordAbnormalHrLow(str13, tzOffset2, (SegmentItem[]) Arrays.copyOf(segmentItemArr2, segmentItemArr2.length));
        FitnessLogUtils.e(this.TAG, str2 + arrayList3.size());
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList5 = new ArrayList();
        int i13 = this.itemNum;
        if (1 <= i13) {
            int i14 = 1;
            while (true) {
                long timeInMillis3 = getCalendar().getTimeInMillis();
                getCalendar().set(12, 0);
                getCalendar().set(13, 0);
                int i15 = i14;
                long millis3 = TimeUnit.MINUTES.toMillis(getRandom().nextLong(10L, 200L)) + timeInMillis3;
                ArrayList arrayList6 = new ArrayList();
                long j13 = 1000;
                long j14 = timeInMillis3 / j13;
                long j15 = millis3 / j13;
                int i16 = i13;
                String str14 = str;
                String str15 = str7;
                long jNextLong3 = getRandom().nextLong(1000L, EcoBanner.BANNER_CHANGE_TIME);
                if (jNextLong3 <= 0) {
                    throw new IllegalArgumentException(str14 + jNextLong3 + str15);
                }
                long progressionLastElement3 = ProgressionUtilKt.getProgressionLastElement(j14, j15, jNextLong3);
                if (j14 <= progressionLastElement3) {
                    long j16 = j14;
                    while (true) {
                        j = timeInMillis3;
                        arrayList6.add(new AbnormalItem(j16, getRandom().nextInt(50, 100)));
                        if (j16 == progressionLastElement3) {
                            break;
                        }
                        j16 += jNextLong3;
                        timeInMillis3 = j;
                    }
                } else {
                    j = timeInMillis3;
                }
                arrayList5.add(new SegmentItem(j14, j15, arrayList6, getRandom().nextInt(255)));
                getCalendar().setTimeInMillis(j);
                getCalendar().add(12, -getRandom().nextInt(1000));
                i13 = i16;
                if (i15 == i13) {
                    str4 = str15;
                    str3 = str14;
                    break;
                } else {
                    i14 = i15 + 1;
                    str7 = str15;
                    str = str14;
                }
            }
        } else {
            str3 = str;
            str4 = str7;
        }
        FitnessDataRecorderImpl companion3 = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str16 = this.sid;
        int tzOffset3 = getTzOffset();
        SegmentItem[] segmentItemArr3 = (SegmentItem[]) arrayList5.toArray(new SegmentItem[0]);
        companion3.recordAbnormalSpo2(str16, tzOffset3, (SegmentItem[]) Arrays.copyOf(segmentItemArr3, segmentItemArr3.length));
        FitnessLogUtils.e(this.TAG, "insert abnormal SPO2 Record: finished, size = " + arrayList5.size());
        getCalendar().setTimeInMillis(System.currentTimeMillis());
        ArrayList arrayList7 = new ArrayList();
        int i17 = this.itemNum;
        if (1 <= i17) {
            int i18 = 1;
            while (true) {
                long timeInMillis4 = getCalendar().getTimeInMillis();
                getCalendar().set(12, 0);
                getCalendar().set(13, 0);
                getCalendar().set(14, 0);
                int i19 = i18;
                long millis4 = TimeUnit.MINUTES.toMillis(getRandom().nextLong(10L, 200L)) + timeInMillis4;
                ArrayList arrayList8 = new ArrayList();
                long j17 = 1000;
                long j18 = timeInMillis4 / j17;
                long j19 = millis4 / j17;
                String str17 = str4;
                int i20 = i17;
                String str18 = str3;
                long jNextLong4 = getRandom().nextLong(1000L, EcoBanner.BANNER_CHANGE_TIME);
                if (jNextLong4 <= 0) {
                    throw new IllegalArgumentException(str18 + jNextLong4 + str17);
                }
                long progressionLastElement4 = ProgressionUtilKt.getProgressionLastElement(j18, j19, jNextLong4);
                if (j18 <= progressionLastElement4) {
                    long j20 = j18;
                    while (true) {
                        i = i19;
                        arrayList8.add(new AbnormalItem(j20, getRandom().nextInt(10, 100)));
                        if (j20 == progressionLastElement4) {
                            break;
                        }
                        j20 += jNextLong4;
                        i19 = i;
                    }
                } else {
                    i = i19;
                }
                arrayList7.add(new SegmentItem(j18, j19, arrayList8, getRandom().nextInt(255)));
                getCalendar().setTimeInMillis(timeInMillis4);
                getCalendar().add(12, -getRandom().nextInt(1000));
                int i21 = i;
                if (i21 == i20) {
                    break;
                }
                i18 = i21 + 1;
                i17 = i20;
                str4 = str17;
                str3 = str18;
            }
        }
        FitnessDataRecorderImpl companion4 = FitnessDataRecorderImpl.INSTANCE.getInstance();
        String str19 = this.sid;
        int tzOffset4 = getTzOffset();
        SegmentItem[] segmentItemArr4 = (SegmentItem[]) arrayList7.toArray(new SegmentItem[0]);
        companion4.recordAbnormalStress(str19, tzOffset4, (SegmentItem[]) Arrays.copyOf(segmentItemArr4, segmentItemArr4.length));
        FitnessLogUtils.e(this.TAG, "insert abnormal Stress Record: finished, size = " + arrayList7.size());
    }
}
