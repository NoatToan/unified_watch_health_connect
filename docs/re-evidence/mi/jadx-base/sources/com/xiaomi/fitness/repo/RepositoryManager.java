package com.xiaomi.fitness.repo;

import com.google.gson.Gson;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.repository.IBloodPressureRepository;
import com.xiaomi.fit.fitness.export.api.repository.IBloodSugarRepository;
import com.xiaomi.fit.fitness.export.api.repository.ICalorieRepository;
import com.xiaomi.fit.fitness.export.api.repository.IDevicesListRepository;
import com.xiaomi.fit.fitness.export.api.repository.IEcgRepository;
import com.xiaomi.fit.fitness.export.api.repository.IEnergyRepository;
import com.xiaomi.fit.fitness.export.api.repository.IExtraDataRepository;
import com.xiaomi.fit.fitness.export.api.repository.IHearingRepository;
import com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository;
import com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository;
import com.xiaomi.fit.fitness.export.api.repository.ILactateThresholdRepository;
import com.xiaomi.fit.fitness.export.api.repository.IPaiRepository;
import com.xiaomi.fit.fitness.export.api.repository.IPhysicalStatusRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRedDotRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.IRunningIndicatorRepository;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.api.repository.ISpo2Repository;
import com.xiaomi.fit.fitness.export.api.repository.IStandRepository;
import com.xiaomi.fit.fitness.export.api.repository.IStepRepository;
import com.xiaomi.fit.fitness.export.api.repository.IStrengthRepository;
import com.xiaomi.fit.fitness.export.api.repository.IStressRepository;
import com.xiaomi.fit.fitness.export.api.repository.ITemperatureRepository;
import com.xiaomi.fit.fitness.export.api.repository.ITemperatureTrendRepository;
import com.xiaomi.fit.fitness.export.api.repository.ITrainingLoadRepository;
import com.xiaomi.fit.fitness.export.api.repository.IVO2MaxRepository;
import com.xiaomi.fit.fitness.export.api.repository.IVitalityRepository;
import com.xiaomi.fit.fitness.export.api.repository.IWeightRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.repo.bloodpressure.BloodPressureRepository;
import com.xiaomi.fitness.repo.bloodsugar.BloodSugarRepository;
import com.xiaomi.fitness.repo.calorie.CalorieRepository;
import com.xiaomi.fitness.repo.device.DevicesListRepository;
import com.xiaomi.fitness.repo.ecg.EcgRepository;
import com.xiaomi.fitness.repo.energy.EnergyRepository;
import com.xiaomi.fitness.repo.extradata.ExtraDataRepository;
import com.xiaomi.fitness.repo.hearing.HearingRepository;
import com.xiaomi.fitness.repo.heartrate.HeartRateRepository;
import com.xiaomi.fitness.repo.home.HomeDataRepository;
import com.xiaomi.fitness.repo.lactatethreshold.LactateThresholdRepository;
import com.xiaomi.fitness.repo.pai.PaiRepository;
import com.xiaomi.fitness.repo.physicalstatus.PhysicalStatusRepository;
import com.xiaomi.fitness.repo.rainbow.RainbowRepository;
import com.xiaomi.fitness.repo.reddot.RedDotRepository;
import com.xiaomi.fitness.repo.runningIndex.RunningIndicatorRepository;
import com.xiaomi.fitness.repo.sleep.SleepRepository;
import com.xiaomi.fitness.repo.spo2.Spo2Repository;
import com.xiaomi.fitness.repo.stand.StandRepository;
import com.xiaomi.fitness.repo.step.StepRepository;
import com.xiaomi.fitness.repo.strength.StrengthRepository;
import com.xiaomi.fitness.repo.stress.StressRepository;
import com.xiaomi.fitness.repo.temperaturetrend.TemperatureCharacterRepository;
import com.xiaomi.fitness.repo.temperaturetrend.TemperatureTrendRepository;
import com.xiaomi.fitness.repo.teperature.TemperatureRepository;
import com.xiaomi.fitness.repo.trainingload.TrainingLoadRepository;
import com.xiaomi.fitness.repo.vitality.VitalityRepository;
import com.xiaomi.fitness.repo.vo2max.VO2MaxRepository;
import com.xiaomi.fitness.repo.weight.WeightRepository;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 °\u00012\u00020\u0001:\u0002°\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010 \u0001\u001a\n\u0012\u0005\u0012\u0003H¢\u00010¡\u0001\"\u0011\b\u0000\u0010¢\u0001*\n\u0012\u0005\u0012\u0003H¤\u00010£\u0001\"\u0005\b\u0001\u0010¤\u00012\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0016J\u001d\u0010§\u0001\u001a\f\u0012\u0007\b\u0001\u0012\u00030¨\u00010£\u00012\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0016J;\u0010©\u0001\u001a\u0003H¢\u0001\"\u0011\b\u0000\u0010¢\u0001*\n\u0012\u0005\u0012\u0003H¤\u00010£\u0001\"\u0005\b\u0001\u0010¤\u00012\u000f\u0010ª\u0001\u001a\n\u0012\u0005\u0012\u0003H¢\u00010¡\u0001H\u0016¢\u0006\u0003\u0010«\u0001J\t\u0010¬\u0001\u001a\u00020BH\u0016J\t\u0010\u00ad\u0001\u001a\u00020GH\u0016J\t\u0010®\u0001\u001a\u00020[H\u0016J\t\u0010¯\u0001\u001a\u00020`H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\t\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b*\u0010+R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\t\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\t\u001a\u0004\b4\u00105R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b9\u0010:R\u001b\u0010<\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\t\u001a\u0004\b>\u0010?R\u001b\u0010A\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\t\u001a\u0004\bC\u0010DR\u001b\u0010F\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\t\u001a\u0004\bH\u0010IR\u001b\u0010K\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\t\u001a\u0004\bM\u0010NR\u001b\u0010P\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010\t\u001a\u0004\bR\u0010SR\u001b\u0010U\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010\t\u001a\u0004\bW\u0010XR\u001b\u0010Z\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010\t\u001a\u0004\b\\\u0010]R\u001b\u0010_\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010\t\u001a\u0004\ba\u0010bR\u001b\u0010d\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010\t\u001a\u0004\bf\u0010gR\u001b\u0010i\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010\t\u001a\u0004\bk\u0010lR\u001b\u0010n\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010\t\u001a\u0004\bp\u0010qR\u001b\u0010s\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010\t\u001a\u0004\bu\u0010vR\u001b\u0010x\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010\t\u001a\u0004\bz\u0010{R\u001d\u0010}\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\t\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0082\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010\t\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u0087\u0001\u001a\u00030\u0088\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008b\u0001\u0010\t\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u008c\u0001\u001a\u00030\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0090\u0001\u0010\t\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0091\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0095\u0001\u0010\t\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010\u0096\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009a\u0001\u0010\t\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R \u0010\u009b\u0001\u001a\u00030\u009c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009f\u0001\u0010\t\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001¨\u0006±\u0001"}, d2 = {"Lcom/xiaomi/fitness/repo/RepositoryManager;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "<init>", "()V", "curTimeZoneOffsetInSecond", "", "getCurTimeZoneOffsetInSecond", "()I", "curTimeZoneOffsetInSecond$delegate", "Lkotlin/Lazy;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "bloodPressureRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IBloodPressureRepository;", "getBloodPressureRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IBloodPressureRepository;", "bloodPressureRepo$delegate", "heartRateRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IHeartRateRepository;", "getHeartRateRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IHeartRateRepository;", "heartRateRepo$delegate", "stepRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IStepRepository;", "getStepRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IStepRepository;", "stepRepo$delegate", "calorieRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ICalorieRepository;", "getCalorieRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ICalorieRepository;", "calorieRepo$delegate", "standRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IStandRepository;", "getStandRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IStandRepository;", "standRepo$delegate", "strengthRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IStrengthRepository;", "getStrengthRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IStrengthRepository;", "strengthRepo$delegate", "sleepRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "getSleepRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ISleepRepository;", "sleepRepo$delegate", "spo2Repo", "Lcom/xiaomi/fit/fitness/export/api/repository/ISpo2Repository;", "getSpo2Repo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ISpo2Repository;", "spo2Repo$delegate", "stressRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IStressRepository;", "getStressRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IStressRepository;", "stressRepo$delegate", "energyRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IEnergyRepository;", "getEnergyRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IEnergyRepository;", "energyRepo$delegate", "rainbowRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IRainbowRepository;", "getRainbowRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRainbowRepository;", "rainbowRepo$delegate", "homeDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IHomeDataRepository;", "getHomeDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IHomeDataRepository;", "homeDataRepo$delegate", "weightRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IWeightRepository;", "getWeightRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IWeightRepository;", "weightRepo$delegate", "vo2MaxRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IVO2MaxRepository;", "getVo2MaxRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IVO2MaxRepository;", "vo2MaxRepo$delegate", "paiRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IPaiRepository;", "getPaiRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IPaiRepository;", "paiRepo$delegate", "deviceListRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IDevicesListRepository;", "getDeviceListRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IDevicesListRepository;", "deviceListRepo$delegate", "redDotRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IRedDotRepository;", "getRedDotRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRedDotRepository;", "redDotRepo$delegate", "hearingRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IHearingRepository;", "getHearingRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IHearingRepository;", "hearingRepo$delegate", "tlRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ITrainingLoadRepository;", "getTlRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ITrainingLoadRepository;", "tlRepo$delegate", "tempRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureRepository;", "getTempRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureRepository;", "tempRepo$delegate", "tempTrendRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureTrendRepository;", "getTempTrendRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ITemperatureTrendRepository;", "tempTrendRepo$delegate", "tempCharacterRepo", "Lcom/xiaomi/fitness/repo/temperaturetrend/TemperatureCharacterRepository;", "getTempCharacterRepo", "()Lcom/xiaomi/fitness/repo/temperaturetrend/TemperatureCharacterRepository;", "tempCharacterRepo$delegate", "runAbilityRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IRunningIndicatorRepository;", "getRunAbilityRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRunningIndicatorRepository;", "runAbilityRepo$delegate", "vitalityRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IVitalityRepository;", "getVitalityRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IVitalityRepository;", "vitalityRepo$delegate", "ecgRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IEcgRepository;", "getEcgRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IEcgRepository;", "ecgRepo$delegate", "bloodSugarRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IBloodSugarRepository;", "getBloodSugarRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IBloodSugarRepository;", "bloodSugarRepo$delegate", "physicalStatusRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IPhysicalStatusRepository;", "getPhysicalStatusRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IPhysicalStatusRepository;", "physicalStatusRepo$delegate", "lactateThresholdRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/ILactateThresholdRepository;", "getLactateThresholdRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/ILactateThresholdRepository;", "lactateThresholdRepo$delegate", "extraDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IExtraDataRepository;", "getExtraDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IExtraDataRepository;", "extraDataRepo$delegate", "getRepositoryClass", "Ljava/lang/Class;", "T", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "R", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getRepositoryByType", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "getRepository", "clazz", "(Ljava/lang/Class;)Lcom/xiaomi/fit/fitness/export/api/repository/IRepository;", "getRainbowRepository", "getHomeDataRepository", "getDevicesListRepository", "getRedDotRepository", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RepositoryManager implements IRepositoryProvider {
    public static final int GAP_5_MINUTE = 300;
    public static final int GAP_A_DAY = 86400;
    public static final int GAP_A_HOUR = 3600;
    public static final int GAP_A_MINUTE = 60;
    public static final int GAP_HALF_HOUR = 1800;
    public static final long GAP_X_MINUTE = 1800;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<RepositoryManager> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nlk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.instance_delegate$lambda$31();
        }
    });

    /* JADX INFO: renamed from: curTimeZoneOffsetInSecond$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy curTimeZoneOffsetInSecond = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ylk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(FitnessDateUtils.getCurrentTZOffsetInSec());
        }
    });

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qlk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.gson_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: bloodPressureRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bloodPressureRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.bloodPressureRepo_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: heartRateRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy heartRateRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: emk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.heartRateRepo_delegate$lambda$3();
        }
    });

    /* JADX INFO: renamed from: stepRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stepRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.stepRepo_delegate$lambda$4();
        }
    });

    /* JADX INFO: renamed from: calorieRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy calorieRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.calorieRepo_delegate$lambda$5();
        }
    });

    /* JADX INFO: renamed from: standRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy standRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.standRepo_delegate$lambda$6();
        }
    });

    /* JADX INFO: renamed from: strengthRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy strengthRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: imk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.strengthRepo_delegate$lambda$7();
        }
    });

    /* JADX INFO: renamed from: sleepRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.sleepRepo_delegate$lambda$8();
        }
    });

    /* JADX INFO: renamed from: spo2Repo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy spo2Repo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.spo2Repo_delegate$lambda$9();
        }
    });

    /* JADX INFO: renamed from: stressRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stressRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.stressRepo_delegate$lambda$10();
        }
    });

    /* JADX INFO: renamed from: energyRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy energyRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.energyRepo_delegate$lambda$11();
        }
    });

    /* JADX INFO: renamed from: rainbowRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rainbowRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.rainbowRepo_delegate$lambda$12();
        }
    });

    /* JADX INFO: renamed from: homeDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy homeDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: omk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.homeDataRepo_delegate$lambda$13();
        }
    });

    /* JADX INFO: renamed from: weightRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy weightRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.weightRepo_delegate$lambda$14();
        }
    });

    /* JADX INFO: renamed from: vo2MaxRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vo2MaxRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.vo2MaxRepo_delegate$lambda$15();
        }
    });

    /* JADX INFO: renamed from: paiRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy paiRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.paiRepo_delegate$lambda$16();
        }
    });

    /* JADX INFO: renamed from: deviceListRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceListRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: smk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.deviceListRepo_delegate$lambda$17();
        }
    });

    /* JADX INFO: renamed from: redDotRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy redDotRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: olk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.redDotRepo_delegate$lambda$18();
        }
    });

    /* JADX INFO: renamed from: hearingRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hearingRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: plk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.hearingRepo_delegate$lambda$19();
        }
    });

    /* JADX INFO: renamed from: tlRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tlRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: rlk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.tlRepo_delegate$lambda$20();
        }
    });

    /* JADX INFO: renamed from: tempRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tempRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: slk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.tempRepo_delegate$lambda$21();
        }
    });

    /* JADX INFO: renamed from: tempTrendRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tempTrendRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tlk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.tempTrendRepo_delegate$lambda$22();
        }
    });

    /* JADX INFO: renamed from: tempCharacterRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tempCharacterRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ulk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.tempCharacterRepo_delegate$lambda$23();
        }
    });

    /* JADX INFO: renamed from: runAbilityRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy runAbilityRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vlk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.runAbilityRepo_delegate$lambda$24();
        }
    });

    /* JADX INFO: renamed from: vitalityRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vitalityRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wlk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.vitalityRepo_delegate$lambda$25();
        }
    });

    /* JADX INFO: renamed from: ecgRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ecgRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xlk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.ecgRepo_delegate$lambda$26();
        }
    });

    /* JADX INFO: renamed from: bloodSugarRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bloodSugarRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zlk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.bloodSugarRepo_delegate$lambda$27();
        }
    });

    /* JADX INFO: renamed from: physicalStatusRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy physicalStatusRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: amk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.physicalStatusRepo_delegate$lambda$28();
        }
    });

    /* JADX INFO: renamed from: lactateThresholdRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lactateThresholdRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.lactateThresholdRepo_delegate$lambda$29();
        }
    });

    /* JADX INFO: renamed from: extraDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy extraDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dmk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryManager.extraDataRepo_delegate$lambda$30();
        }
    });

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/repo/RepositoryManager$Companion;", "", "<init>", "()V", "GAP_A_MINUTE", "", "GAP_A_HOUR", "GAP_HALF_HOUR", "GAP_A_DAY", "GAP_X_MINUTE", "", "GAP_5_MINUTE", "instance", "Lcom/xiaomi/fitness/repo/RepositoryManager;", "getInstance", "()Lcom/xiaomi/fitness/repo/RepositoryManager;", "instance$delegate", "Lkotlin/Lazy;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RepositoryManager getInstance() {
            return (RepositoryManager) RepositoryManager.instance$delegate.getValue();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.BLOOD_PRESSURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.HR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.STEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.CALORIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeDataType.VALID_STAND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeDataType.MH_STRENGTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeDataType.SLEEP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeDataType.STRESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeDataType.ENERGY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HomeDataType.WEIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HomeDataType.V02_MAX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HomeDataType.PAI.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HomeDataType.HEARING_HEALTH.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HomeDataType.TRAINING_LOAD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[HomeDataType.RUNNING_INDICATOR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[HomeDataType.RAINBOW.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[HomeDataType.VITALITY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[HomeDataType.ECG_MEDICAL.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[HomeDataType.BLOOD_SUGAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[HomeDataType.PHYSICAL_STATUS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[HomeDataType.LACTATE_THRESHOLD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[HomeDataType.EXTRA_DATA.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE_TREND.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE_CHARACTER.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BloodPressureRepository bloodPressureRepo_delegate$lambda$2() {
        return new BloodPressureRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BloodSugarRepository bloodSugarRepo_delegate$lambda$27() {
        return new BloodSugarRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CalorieRepository calorieRepo_delegate$lambda$5() {
        return new CalorieRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DevicesListRepository deviceListRepo_delegate$lambda$17() {
        return new DevicesListRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcgRepository ecgRepo_delegate$lambda$26() {
        return new EcgRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnergyRepository energyRepo_delegate$lambda$11() {
        return new EnergyRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtraDataRepository extraDataRepo_delegate$lambda$30() {
        return new ExtraDataRepository();
    }

    private final IBloodPressureRepository getBloodPressureRepo() {
        return (IBloodPressureRepository) this.bloodPressureRepo.getValue();
    }

    private final IBloodSugarRepository getBloodSugarRepo() {
        return (IBloodSugarRepository) this.bloodSugarRepo.getValue();
    }

    private final ICalorieRepository getCalorieRepo() {
        return (ICalorieRepository) this.calorieRepo.getValue();
    }

    private final IDevicesListRepository getDeviceListRepo() {
        return (IDevicesListRepository) this.deviceListRepo.getValue();
    }

    private final IEcgRepository getEcgRepo() {
        return (IEcgRepository) this.ecgRepo.getValue();
    }

    private final IEnergyRepository getEnergyRepo() {
        return (IEnergyRepository) this.energyRepo.getValue();
    }

    private final IExtraDataRepository getExtraDataRepo() {
        return (IExtraDataRepository) this.extraDataRepo.getValue();
    }

    private final IHearingRepository getHearingRepo() {
        return (IHearingRepository) this.hearingRepo.getValue();
    }

    private final IHeartRateRepository getHeartRateRepo() {
        return (IHeartRateRepository) this.heartRateRepo.getValue();
    }

    private final IHomeDataRepository getHomeDataRepo() {
        return (IHomeDataRepository) this.homeDataRepo.getValue();
    }

    private final ILactateThresholdRepository getLactateThresholdRepo() {
        return (ILactateThresholdRepository) this.lactateThresholdRepo.getValue();
    }

    private final IPaiRepository getPaiRepo() {
        return (IPaiRepository) this.paiRepo.getValue();
    }

    private final IPhysicalStatusRepository getPhysicalStatusRepo() {
        return (IPhysicalStatusRepository) this.physicalStatusRepo.getValue();
    }

    private final IRainbowRepository getRainbowRepo() {
        return (IRainbowRepository) this.rainbowRepo.getValue();
    }

    private final IRedDotRepository getRedDotRepo() {
        return (IRedDotRepository) this.redDotRepo.getValue();
    }

    private final IRunningIndicatorRepository getRunAbilityRepo() {
        return (IRunningIndicatorRepository) this.runAbilityRepo.getValue();
    }

    private final ISleepRepository getSleepRepo() {
        return (ISleepRepository) this.sleepRepo.getValue();
    }

    private final ISpo2Repository getSpo2Repo() {
        return (ISpo2Repository) this.spo2Repo.getValue();
    }

    private final IStandRepository getStandRepo() {
        return (IStandRepository) this.standRepo.getValue();
    }

    private final IStepRepository getStepRepo() {
        return (IStepRepository) this.stepRepo.getValue();
    }

    private final IStrengthRepository getStrengthRepo() {
        return (IStrengthRepository) this.strengthRepo.getValue();
    }

    private final IStressRepository getStressRepo() {
        return (IStressRepository) this.stressRepo.getValue();
    }

    private final TemperatureCharacterRepository getTempCharacterRepo() {
        return (TemperatureCharacterRepository) this.tempCharacterRepo.getValue();
    }

    private final ITemperatureRepository getTempRepo() {
        return (ITemperatureRepository) this.tempRepo.getValue();
    }

    private final ITemperatureTrendRepository getTempTrendRepo() {
        return (ITemperatureTrendRepository) this.tempTrendRepo.getValue();
    }

    private final ITrainingLoadRepository getTlRepo() {
        return (ITrainingLoadRepository) this.tlRepo.getValue();
    }

    private final IVitalityRepository getVitalityRepo() {
        return (IVitalityRepository) this.vitalityRepo.getValue();
    }

    private final IVO2MaxRepository getVo2MaxRepo() {
        return (IVO2MaxRepository) this.vo2MaxRepo.getValue();
    }

    private final IWeightRepository getWeightRepo() {
        return (IWeightRepository) this.weightRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$1() {
        return new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HearingRepository hearingRepo_delegate$lambda$19() {
        return new HearingRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HeartRateRepository heartRateRepo_delegate$lambda$3() {
        return new HeartRateRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomeDataRepository homeDataRepo_delegate$lambda$13() {
        return new HomeDataRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RepositoryManager instance_delegate$lambda$31() {
        return new RepositoryManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LactateThresholdRepository lactateThresholdRepo_delegate$lambda$29() {
        return new LactateThresholdRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaiRepository paiRepo_delegate$lambda$16() {
        return new PaiRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PhysicalStatusRepository physicalStatusRepo_delegate$lambda$28() {
        return new PhysicalStatusRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RainbowRepository rainbowRepo_delegate$lambda$12() {
        return new RainbowRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RedDotRepository redDotRepo_delegate$lambda$18() {
        return new RedDotRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RunningIndicatorRepository runAbilityRepo_delegate$lambda$24() {
        return new RunningIndicatorRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRepository sleepRepo_delegate$lambda$8() {
        return new SleepRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spo2Repository spo2Repo_delegate$lambda$9() {
        return new Spo2Repository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StandRepository standRepo_delegate$lambda$6() {
        return new StandRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StepRepository stepRepo_delegate$lambda$4() {
        return new StepRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StrengthRepository strengthRepo_delegate$lambda$7() {
        return new StrengthRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StressRepository stressRepo_delegate$lambda$10() {
        return new StressRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TemperatureCharacterRepository tempCharacterRepo_delegate$lambda$23() {
        return new TemperatureCharacterRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TemperatureRepository tempRepo_delegate$lambda$21() {
        return new TemperatureRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TemperatureTrendRepository tempTrendRepo_delegate$lambda$22() {
        return new TemperatureTrendRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrainingLoadRepository tlRepo_delegate$lambda$20() {
        return new TrainingLoadRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VitalityRepository vitalityRepo_delegate$lambda$25() {
        return new VitalityRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VO2MaxRepository vo2MaxRepo_delegate$lambda$15() {
        return new VO2MaxRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WeightRepository weightRepo_delegate$lambda$14() {
        return new WeightRepository();
    }

    public final int getCurTimeZoneOffsetInSecond() {
        return ((Number) this.curTimeZoneOffsetInSecond.getValue()).intValue();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public IDevicesListRepository getDevicesListRepository() {
        return getDeviceListRepo();
    }

    @NotNull
    public final Gson getGson() {
        return (Gson) this.gson.getValue();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public IHomeDataRepository getHomeDataRepository() {
        return getHomeDataRepo();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public IRainbowRepository getRainbowRepository() {
        return getRainbowRepo();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public IRedDotRepository getRedDotRepository() {
        return getRedDotRepo();
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public <T extends IRepository<R>, R> T getRepository(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (Intrinsics.areEqual(clazz, IBloodPressureRepository.class)) {
            IBloodPressureRepository bloodPressureRepo = getBloodPressureRepo();
            Intrinsics.checkNotNull(bloodPressureRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return bloodPressureRepo;
        }
        if (Intrinsics.areEqual(clazz, IHeartRateRepository.class)) {
            IHeartRateRepository heartRateRepo = getHeartRateRepo();
            Intrinsics.checkNotNull(heartRateRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return heartRateRepo;
        }
        if (Intrinsics.areEqual(clazz, IStepRepository.class)) {
            IStepRepository stepRepo = getStepRepo();
            Intrinsics.checkNotNull(stepRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return stepRepo;
        }
        if (Intrinsics.areEqual(clazz, ICalorieRepository.class)) {
            ICalorieRepository calorieRepo = getCalorieRepo();
            Intrinsics.checkNotNull(calorieRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return calorieRepo;
        }
        if (Intrinsics.areEqual(clazz, IStandRepository.class)) {
            IStandRepository standRepo = getStandRepo();
            Intrinsics.checkNotNull(standRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return standRepo;
        }
        if (Intrinsics.areEqual(clazz, IStrengthRepository.class)) {
            IStrengthRepository strengthRepo = getStrengthRepo();
            Intrinsics.checkNotNull(strengthRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return strengthRepo;
        }
        if (Intrinsics.areEqual(clazz, ISleepRepository.class)) {
            ISleepRepository sleepRepo = getSleepRepo();
            Intrinsics.checkNotNull(sleepRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return sleepRepo;
        }
        if (Intrinsics.areEqual(clazz, ISpo2Repository.class)) {
            ISpo2Repository spo2Repo = getSpo2Repo();
            Intrinsics.checkNotNull(spo2Repo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return spo2Repo;
        }
        if (Intrinsics.areEqual(clazz, IStressRepository.class)) {
            IStressRepository stressRepo = getStressRepo();
            Intrinsics.checkNotNull(stressRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return stressRepo;
        }
        if (Intrinsics.areEqual(clazz, IEnergyRepository.class)) {
            IEnergyRepository energyRepo = getEnergyRepo();
            Intrinsics.checkNotNull(energyRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return energyRepo;
        }
        if (Intrinsics.areEqual(clazz, IWeightRepository.class)) {
            IWeightRepository weightRepo = getWeightRepo();
            Intrinsics.checkNotNull(weightRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return weightRepo;
        }
        if (Intrinsics.areEqual(clazz, IVO2MaxRepository.class)) {
            IVO2MaxRepository vo2MaxRepo = getVo2MaxRepo();
            Intrinsics.checkNotNull(vo2MaxRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return vo2MaxRepo;
        }
        if (Intrinsics.areEqual(clazz, IPaiRepository.class)) {
            IPaiRepository paiRepo = getPaiRepo();
            Intrinsics.checkNotNull(paiRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return paiRepo;
        }
        if (Intrinsics.areEqual(clazz, IHearingRepository.class)) {
            IHearingRepository hearingRepo = getHearingRepo();
            Intrinsics.checkNotNull(hearingRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return hearingRepo;
        }
        if (Intrinsics.areEqual(clazz, ITrainingLoadRepository.class)) {
            ITrainingLoadRepository tlRepo = getTlRepo();
            Intrinsics.checkNotNull(tlRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return tlRepo;
        }
        if (Intrinsics.areEqual(clazz, ITemperatureRepository.class)) {
            ITemperatureRepository tempRepo = getTempRepo();
            Intrinsics.checkNotNull(tempRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return tempRepo;
        }
        if (Intrinsics.areEqual(clazz, IRunningIndicatorRepository.class)) {
            IRunningIndicatorRepository runAbilityRepo = getRunAbilityRepo();
            Intrinsics.checkNotNull(runAbilityRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return runAbilityRepo;
        }
        if (Intrinsics.areEqual(clazz, IRainbowRepository.class)) {
            IRainbowRepository rainbowRepo = getRainbowRepo();
            Intrinsics.checkNotNull(rainbowRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return rainbowRepo;
        }
        if (Intrinsics.areEqual(clazz, IVitalityRepository.class)) {
            IVitalityRepository vitalityRepo = getVitalityRepo();
            Intrinsics.checkNotNull(vitalityRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return vitalityRepo;
        }
        if (Intrinsics.areEqual(clazz, IEcgRepository.class)) {
            IEcgRepository ecgRepo = getEcgRepo();
            Intrinsics.checkNotNull(ecgRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return ecgRepo;
        }
        if (Intrinsics.areEqual(clazz, IBloodSugarRepository.class)) {
            IBloodSugarRepository bloodSugarRepo = getBloodSugarRepo();
            Intrinsics.checkNotNull(bloodSugarRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return bloodSugarRepo;
        }
        if (Intrinsics.areEqual(clazz, ILactateThresholdRepository.class)) {
            ILactateThresholdRepository lactateThresholdRepo = getLactateThresholdRepo();
            Intrinsics.checkNotNull(lactateThresholdRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return lactateThresholdRepo;
        }
        if (Intrinsics.areEqual(clazz, IPhysicalStatusRepository.class)) {
            IPhysicalStatusRepository physicalStatusRepo = getPhysicalStatusRepo();
            Intrinsics.checkNotNull(physicalStatusRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return physicalStatusRepo;
        }
        if (Intrinsics.areEqual(clazz, IExtraDataRepository.class)) {
            IExtraDataRepository extraDataRepo = getExtraDataRepo();
            Intrinsics.checkNotNull(extraDataRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return extraDataRepo;
        }
        if (Intrinsics.areEqual(clazz, ITemperatureTrendRepository.class)) {
            ITemperatureTrendRepository tempTrendRepo = getTempTrendRepo();
            Intrinsics.checkNotNull(tempTrendRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return tempTrendRepo;
        }
        if (Intrinsics.areEqual(clazz, TemperatureCharacterRepository.class)) {
            TemperatureCharacterRepository tempCharacterRepo = getTempCharacterRepo();
            Intrinsics.checkNotNull(tempCharacterRepo, "null cannot be cast to non-null type T of com.xiaomi.fitness.repo.RepositoryManager.getRepository");
            return tempCharacterRepo;
        }
        throw new IllegalArgumentException("unknown clazz " + clazz);
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public IRepository<? extends DailyBasicReport> getRepositoryByType(@NotNull HomeDataType dataType) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        switch (WhenMappings.$EnumSwitchMapping$0[dataType.ordinal()]) {
            case 1:
                return getBloodPressureRepo();
            case 2:
                return getHeartRateRepo();
            case 3:
                return getStepRepo();
            case 4:
                return getCalorieRepo();
            case 5:
                return getStandRepo();
            case 6:
                return getStrengthRepo();
            case 7:
                return getSleepRepo();
            case 8:
                return getSpo2Repo();
            case 9:
                return getStressRepo();
            case 10:
                return getEnergyRepo();
            case 11:
                return getWeightRepo();
            case 12:
                return getVo2MaxRepo();
            case 13:
                return getPaiRepo();
            case 14:
                return getHearingRepo();
            case 15:
                return getTlRepo();
            case 16:
                return getTempRepo();
            case 17:
                return getRunAbilityRepo();
            case 18:
                return getRainbowRepo();
            case 19:
                return getVitalityRepo();
            case 20:
                return getEcgRepo();
            case 21:
                return getBloodSugarRepo();
            case 22:
                return getPhysicalStatusRepo();
            case 23:
                return getLactateThresholdRepo();
            case 24:
                return getExtraDataRepo();
            case 25:
                return getTempTrendRepo();
            case 26:
                return getTempCharacterRepo();
            default:
                throw new IllegalArgumentException("unknown type " + dataType);
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider
    @NotNull
    public <T extends IRepository<R>, R> Class<T> getRepositoryClass(@NotNull HomeDataType dataType) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        switch (WhenMappings.$EnumSwitchMapping$0[dataType.ordinal()]) {
            case 1:
                return IBloodPressureRepository.class;
            case 2:
                return IHeartRateRepository.class;
            case 3:
                return IStepRepository.class;
            case 4:
                return ICalorieRepository.class;
            case 5:
                return IStandRepository.class;
            case 6:
                return IStrengthRepository.class;
            case 7:
                return ISleepRepository.class;
            case 8:
                return ISpo2Repository.class;
            case 9:
                return IStressRepository.class;
            case 10:
                return IEnergyRepository.class;
            case 11:
                return IWeightRepository.class;
            case 12:
                return IVO2MaxRepository.class;
            case 13:
                return IPaiRepository.class;
            case 14:
                return IHearingRepository.class;
            case 15:
                return ITrainingLoadRepository.class;
            case 16:
                return ITemperatureRepository.class;
            case 17:
                return IRunningIndicatorRepository.class;
            case 18:
                return IRainbowRepository.class;
            case 19:
                return IVitalityRepository.class;
            case 20:
                return IEcgRepository.class;
            case 21:
                return IBloodSugarRepository.class;
            case 22:
            case 23:
                return IPhysicalStatusRepository.class;
            case 24:
                return IExtraDataRepository.class;
            case 25:
                return ITemperatureTrendRepository.class;
            case 26:
                return TemperatureCharacterRepository.class;
            default:
                throw new IllegalArgumentException("unknown type " + dataType);
        }
    }
}
