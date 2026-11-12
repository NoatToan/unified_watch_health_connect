package com.xiaomi.fit.fitness.impl;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fit.fitness.DailyRecordItemModel;
import com.xiaomi.fit.fitness.FitnessDataUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.CaloriesItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.data.item.EnergyItem;
import com.xiaomi.fit.fitness.export.data.item.GradePredictionItem;
import com.xiaomi.fit.fitness.export.data.item.HeadsetItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fit.fitness.export.data.item.LightValueItem;
import com.xiaomi.fit.fitness.export.data.item.MHStrengthItem;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fit.fitness.export.data.item.OneDayPaiReport;
import com.xiaomi.fit.fitness.export.data.item.PhysicalStatusItem;
import com.xiaomi.fit.fitness.export.data.item.ReportHrItem;
import com.xiaomi.fit.fitness.export.data.item.ReportSpo2Item;
import com.xiaomi.fit.fitness.export.data.item.RestHrItem;
import com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureCharacterItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fit.fitness.export.data.item.TrainingLoadItem;
import com.xiaomi.fit.fitness.export.data.item.ValidStandItem;
import com.xiaomi.fit.fitness.export.data.item.VitalityItem;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthStatus;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fit.fitness.export.data.item.body;
import com.xiaomi.fit.fitness.impl.FitnessDataRecorderImpl;
import com.xiaomi.fit.fitness.impl.internal.utils.StressComputeUtils;
import com.xiaomi.fit.fitness.persist.SleepDataFDSUploader;
import com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity;
import com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentEntity;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.FitnessFDSDataDaoUtils;
import com.xiaomi.fit.fitness.remote.FitnessDBDataUpdater;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.user.info.export.UserInformationManager;
import com.xiaomi.fitness.user.info.export.UserInformationManagerExtKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0098\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 ë\u00012\u00020\u0001:\u0002ë\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J1\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0016¢\u0006\u0002\u0010\u0018J1\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0016¢\u0006\u0002\u0010\u0018J9\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0002¢\u0006\u0002\u0010\u001cJ1\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u0016\"\u00020\u001fH\u0016¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J$\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#J9\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u000e2\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u0016\"\u00020\u001fH\u0016¢\u0006\u0002\u0010%J.\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#H\u0002J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J1\u0010)\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0\u0016\"\u00020+H\u0016¢\u0006\u0002\u0010,J$\u0010)\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010-\u001a\b\u0012\u0004\u0012\u00020+0#J1\u0010.\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0\u0016\"\u00020+H\u0016¢\u0006\u0002\u0010,J1\u0010/\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u0002010\u0016\"\u000201H\u0016¢\u0006\u0002\u00102J1\u00103\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u0002050\u0016\"\u000205H\u0016¢\u0006\u0002\u00106J1\u00107\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u0002050\u0016\"\u000205H\u0016¢\u0006\u0002\u00106J1\u00108\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u00109\u001a\n\u0012\u0006\b\u0001\u0012\u00020:0\u0016\"\u00020:H\u0016¢\u0006\u0002\u0010;J1\u0010<\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010=\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0\u0016\"\u00020>H\u0016¢\u0006\u0002\u0010?J1\u0010@\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020B0\u0016\"\u00020BH\u0016¢\u0006\u0002\u0010CJ1\u0010D\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020B0\u0016\"\u00020BH\u0016¢\u0006\u0002\u0010CJ1\u0010E\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010F\u001a\n\u0012\u0006\b\u0001\u0012\u00020G0\u0016\"\u00020GH\u0016¢\u0006\u0002\u0010HJ1\u0010I\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u00020K0\u0016\"\u00020KH\u0016¢\u0006\u0002\u0010LJ1\u0010M\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u00020K0\u0016\"\u00020KH\u0016¢\u0006\u0002\u0010LJ1\u0010N\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010O\u001a\n\u0012\u0006\b\u0001\u0012\u00020P0\u0016\"\u00020PH\u0016¢\u0006\u0002\u0010QJ1\u0010R\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020T0\u0016\"\u00020TH\u0016¢\u0006\u0002\u0010UJ1\u0010V\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020B0\u0016\"\u00020BH\u0016¢\u0006\u0002\u0010CJ1\u0010X\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020Y0\u0016\"\u00020YH\u0016¢\u0006\u0002\u0010ZJ1\u0010[\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020Y0\u0016\"\u00020YH\u0016¢\u0006\u0002\u0010ZJ1\u0010\\\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00020^0\u0016\"\u00020^H\u0016¢\u0006\u0002\u0010_J \u0010`\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010a\u001a\u00020b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J1\u0010c\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010d\u001a\n\u0012\u0006\b\u0001\u0012\u00020e0\u0016\"\u00020eH\u0016¢\u0006\u0002\u0010fJ1\u0010g\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010d\u001a\n\u0012\u0006\b\u0001\u0012\u00020e0\u0016\"\u00020eH\u0016¢\u0006\u0002\u0010fJ1\u0010h\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010i\u001a\n\u0012\u0006\b\u0001\u0012\u00020B0\u0016\"\u00020BH\u0016¢\u0006\u0002\u0010CJ1\u0010j\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010k\u001a\n\u0012\u0006\b\u0001\u0012\u00020l0\u0016\"\u00020lH\u0016¢\u0006\u0002\u0010mJ$\u0010j\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010n\u001a\b\u0012\u0004\u0012\u00020l0#J1\u0010o\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010p\u001a\n\u0012\u0006\b\u0001\u0012\u00020q0\u0016\"\u00020qH\u0016¢\u0006\u0002\u0010rJ$\u0010o\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010s\u001a\b\u0012\u0004\u0012\u00020q0#J1\u0010t\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010u\u001a\n\u0012\u0006\b\u0001\u0012\u00020v0\u0016\"\u00020vH\u0016¢\u0006\u0002\u0010wJ$\u0010t\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010x\u001a\b\u0012\u0004\u0012\u00020v0#J1\u0010y\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010z\u001a\n\u0012\u0006\b\u0001\u0012\u00020{0\u0016\"\u00020{H\u0016¢\u0006\u0002\u0010|J$\u0010y\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010}\u001a\b\u0012\u0004\u0012\u00020{0#J'\u0010~\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\r\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010#H\u0016J(\u0010\u0081\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\r\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010#H\u0016J6\u0010\u0082\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010\u0083\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u0084\u00010\u0016\"\u00030\u0084\u0001H\u0016¢\u0006\u0003\u0010\u0085\u0001J'\u0010\u0082\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0086\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010#J6\u0010\u0087\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010\u0088\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u0089\u00010\u0016\"\u00030\u0089\u0001H\u0016¢\u0006\u0003\u0010\u008a\u0001J'\u0010\u0087\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010#J6\u0010\u008c\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010\u008d\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u008e\u00010\u0016\"\u00030\u008e\u0001H\u0016¢\u0006\u0003\u0010\u008f\u0001J'\u0010\u008c\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010#J!\u0010\u0090\u0001\u001a\u00020\u00052\u000e\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010#2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J6\u0010\u0092\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010\u0093\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u0094\u00010\u0016\"\u00030\u0094\u0001H\u0016¢\u0006\u0003\u0010\u0095\u0001J6\u0010\u0096\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010\u0097\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u0098\u00010\u0016\"\u00030\u0098\u0001H\u0016¢\u0006\u0003\u0010\u0099\u0001J6\u0010\u009a\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010\u009b\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u009c\u00010\u0016\"\u00030\u009c\u0001H\u0016¢\u0006\u0003\u0010\u009d\u0001J6\u0010\u009e\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010\u009f\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030 \u00010\u0016\"\u00030 \u0001H\u0016¢\u0006\u0003\u0010¡\u0001J6\u0010¢\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010£\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¤\u00010\u0016\"\u00030¤\u0001H\u0016¢\u0006\u0003\u0010¥\u0001J6\u0010¦\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010§\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¨\u00010\u0016\"\u00030¨\u0001H\u0016¢\u0006\u0003\u0010©\u0001J'\u0010ª\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010«\u0001\u001a\t\u0012\u0005\u0012\u00030¨\u00010#J6\u0010¬\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010\u00ad\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030®\u00010\u0016\"\u00030®\u0001H\u0016¢\u0006\u0003\u0010¯\u0001J6\u0010°\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010±\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030²\u00010\u0016\"\u00030²\u0001H\u0016¢\u0006\u0003\u0010³\u0001J6\u0010´\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010µ\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¶\u00010\u0016\"\u00030¶\u0001H\u0016¢\u0006\u0003\u0010·\u0001J6\u0010¸\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010¹\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030º\u00010\u0016\"\u00030º\u0001H\u0016¢\u0006\u0003\u0010»\u0001J6\u0010¼\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010½\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030¾\u00010\u0016\"\u00030¾\u0001H\u0016¢\u0006\u0003\u0010¿\u0001J6\u0010À\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010Á\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Â\u00010\u0016\"\u00030Â\u0001H\u0016¢\u0006\u0003\u0010Ã\u0001J6\u0010Ä\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010Å\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Æ\u00010\u0016\"\u00030Æ\u0001H\u0016¢\u0006\u0003\u0010Ç\u0001J6\u0010È\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010É\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ê\u00010\u0016\"\u00030Ê\u0001H\u0016¢\u0006\u0003\u0010Ë\u0001J)\u0010È\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010É\u0001\u001a\t\u0012\u0005\u0012\u00030Ê\u00010#H\u0016J6\u0010Ì\u0001\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0015\u0010Í\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Î\u00010\u0016\"\u00030Î\u0001H\u0016¢\u0006\u0003\u0010Ï\u0001J;\u0010Ð\u0001\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\r\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030Ñ\u00010#2\t\b\u0002\u0010Ò\u0001\u001a\u00020\u000eH\u0002J4\u0010Ð\u0001\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010Ó\u0001\u001a\t\u0012\u0005\u0012\u00030Ô\u00010#2\t\b\u0002\u0010Ò\u0001\u001a\u00020\u000eH\u0002J#\u0010Õ\u0001\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0016\"\u00020\u0013H\u0016¢\u0006\u0003\u0010Ö\u0001J/\u0010×\u0001\u001a\u00020\u000e2\u0007\u0010Ø\u0001\u001a\u00020\u00072\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ñ\u00010\u0016\"\u00030Ñ\u0001H\u0016¢\u0006\u0003\u0010Ú\u0001J&\u0010Û\u0001\u001a\u00020\u000e2\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ñ\u00010\u0016\"\u00030Ñ\u0001H\u0016¢\u0006\u0003\u0010Ü\u0001J&\u0010Ý\u0001\u001a\u00020\u000e2\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ñ\u00010\u0016\"\u00030Ñ\u0001H\u0016¢\u0006\u0003\u0010Ü\u0001J&\u0010Þ\u0001\u001a\u00020\u000e2\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ñ\u00010\u0016\"\u00030Ñ\u0001H\u0016¢\u0006\u0003\u0010Ü\u0001J&\u0010ß\u0001\u001a\u00020\u000e2\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ñ\u00010\u0016\"\u00030Ñ\u0001H\u0016¢\u0006\u0003\u0010Ü\u0001J&\u0010à\u0001\u001a\u00020\u000e2\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ñ\u00010\u0016\"\u00030Ñ\u0001H\u0016¢\u0006\u0003\u0010Ü\u0001J&\u0010á\u0001\u001a\u00020\u000e2\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ñ\u00010\u0016\"\u00030Ñ\u0001H\u0016¢\u0006\u0003\u0010Ü\u0001J&\u0010â\u0001\u001a\u00020\u000e2\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ñ\u00010\u0016\"\u00030Ñ\u0001H\u0016¢\u0006\u0003\u0010Ü\u0001J&\u0010ã\u0001\u001a\u00020\u000e2\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ñ\u00010\u0016\"\u00030Ñ\u0001H\u0016¢\u0006\u0003\u0010Ü\u0001J&\u0010ä\u0001\u001a\u00020\u000e2\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ñ\u00010\u0016\"\u00030Ñ\u0001H\u0016¢\u0006\u0003\u0010Ü\u0001J&\u0010å\u0001\u001a\u00020\u000e2\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ñ\u00010\u0016\"\u00030Ñ\u0001H\u0016¢\u0006\u0003\u0010Ü\u0001J&\u0010æ\u0001\u001a\u00020\u000e2\u0015\u0010Ù\u0001\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030Ñ\u00010\u0016\"\u00030Ñ\u0001H\u0016¢\u0006\u0003\u0010Ü\u0001J\u0019\u0010ç\u0001\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0019\u0010è\u0001\u001a\u00020\u000e2\u000e\u0010Ó\u0001\u001a\t\u0012\u0005\u0012\u00030Ñ\u00010#H\u0016J\u0019\u0010é\u0001\u001a\u00020\u000e2\u000e\u0010Ó\u0001\u001a\t\u0012\u0005\u0012\u00030Ñ\u00010#H\u0016J,\u0010ê\u0001\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00072\u000e\u0010Ó\u0001\u001a\t\u0012\u0005\u0012\u00030Ñ\u00010#2\t\b\u0002\u0010Ò\u0001\u001a\u00020\u000eH\u0002¨\u0006ì\u0001"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/FitnessDataRecorderImpl;", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataRecorder;", "<init>", "()V", "uploadSleepSrcData", "", "sid", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "fileName", "data", "", "recordFDSData", "", "recordSportReport", "zoneOffsetInSec", "", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "recordDaytimeSleep", "sleepReport", "", "Lcom/xiaomi/fit/fitness/export/data/item/DayNightSleepReport;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/DayNightSleepReport;)Z", "recordNightSleep", "recordDayNightSleep", "persistKey", "(Ljava/lang/String;Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/DayNightSleepReport;)Z", "recordSleepSegment", "sleepSegment", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)Z", "updateSleepSegment", "sleepSegmentList", "", "isCompleteSleep", "(Ljava/lang/String;IZ[Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)Z", "updateSleep", "sleepEntity", "Lcom/xiaomi/fit/fitness/persist/db/internal/SleepSegmentEntity;", "recordManualHr", "hrItem", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/HrItem;)Z", "hrItemList", "recordDailyHr", "recordRestHr", "restHrItem", "Lcom/xiaomi/fit/fitness/export/data/item/RestHrItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/RestHrItem;)Z", "recordReportMaxHr", "items", "Lcom/xiaomi/fit/fitness/export/data/item/ReportHrItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/ReportHrItem;)Z", "recordReportMinHr", "recordAbnormalFib", "abFibItem", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;)Z", "recordAbnormalHr", "abHrItem", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalHrItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/AbnormalHrItem;)Z", "recordAbnormalHrHigh", "abHrItems", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;)Z", "recordAbnormalHrLow", "recordPai", "paiReport", "Lcom/xiaomi/fit/fitness/export/data/item/OneDayPaiReport;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/OneDayPaiReport;)Z", "recordManualSpo2", "spo2Item", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;)Z", "recordDailySpo2", "recordDailyLightValue", "lightValueItem", "Lcom/xiaomi/fit/fitness/export/data/item/LightValueItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/LightValueItem;)Z", "recordDailyBodyMomentum", "bodyMomentumItem", "Lcom/xiaomi/fit/fitness/export/data/item/BodyMomentumItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/BodyMomentumItem;)Z", "recordAbnormalSpo2", "spo2Items", "recordReportMaxSpo2", "Lcom/xiaomi/fit/fitness/export/data/item/ReportSpo2Item;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/ReportSpo2Item;)Z", "recordReportMinSpo2", "recordDailyEnergy", "energyItem", "Lcom/xiaomi/fit/fitness/export/data/item/EnergyItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/EnergyItem;)Z", "computeAndRecordStressByEnergyState", "time", "", "recordManualStress", "stressItem", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/StressItem;)Z", "recordDailyStress", "recordAbnormalStress", "stressItems", "recordStep", "stepItem", "Lcom/xiaomi/fit/fitness/export/data/item/StepItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/StepItem;)Z", "stepItemList", "recordActiveStage", "activeStageItem", "Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;)Z", "activeStageItemList", "recordCalorie", "caloriesItem", "Lcom/xiaomi/fit/fitness/export/data/item/CaloriesItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/CaloriesItem;)Z", "caloriesItemList", "recordBloodPressure", "bloodPressureItem", "Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;)Z", "bloodPressureList", "recordBloodSugar", "itemList", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "recordManualBloodSugar", "recordValidStand", "standItem", "Lcom/xiaomi/fit/fitness/export/data/item/ValidStandItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/ValidStandItem;)Z", "standList", "recordMHStrength", "mhStrengthItem", "Lcom/xiaomi/fit/fitness/export/data/item/MHStrengthItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/MHStrengthItem;)Z", "mhStrengthItemList", "recordWeight", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;)Z", "updateUserProfileWeight", "updateWeightItem", "recordHeadset", "headsetItem", "Lcom/xiaomi/fit/fitness/export/data/item/HeadsetItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/HeadsetItem;)Z", "recordHeadsetNoise", "noiseItem", "Lcom/xiaomi/fit/fitness/export/data/item/NoiseItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/NoiseItem;)Z", "recordV02max", "vo2MaxItem", "Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;)Z", "recordRunningIndicator", "runningIndexItem", "Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;)Z", "recordGradePrediction", "gradePredictionItem", "Lcom/xiaomi/fit/fitness/export/data/item/GradePredictionItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/GradePredictionItem;)Z", "recordWomenHealthStatus", "status", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthStatus;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthStatus;)Z", "recordFemaleHealthStatus", "statusList", "recordWomenHealthSymptoms", "symptoms", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;)Z", "recordTrainingLoad", "tlItem", "Lcom/xiaomi/fit/fitness/export/data/item/TrainingLoadItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/TrainingLoadItem;)Z", "recordTemperatureItem", "temperatureItem", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;)Z", "recordTemperatureTrendItem", "temperatureTrendItem", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;)Z", "recordTemperatureCharacteristic", "item", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureCharacterItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/TemperatureCharacterItem;)Z", "recordVitalityItem", "vitalityItem", "Lcom/xiaomi/fit/fitness/export/data/item/VitalityItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/VitalityItem;)Z", "recordEcgItemReport", "ecgItem", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;)Z", "recordPhysicalStatus", "physicalStatusItem", "Lcom/xiaomi/fit/fitness/export/data/item/PhysicalStatusItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/PhysicalStatusItem;)Z", "recordLactateThreshold", "LactateThresholdItem", "Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "(Ljava/lang/String;I[Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;)Z", "recordDailyData", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "allowSwitchProcess", "recordList", "Lcom/xiaomi/fit/fitness/DailyRecordItemModel;", "deleteSportReport", "([Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Z", "deleteDailyItems", "key", "recordItem", "(Ljava/lang/String;[Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)Z", "deleteManualHr", "([Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)Z", "deleteManualStress", "deleteManualSpo2", "deleteWeight", "deleteValidStand", "deleteBloodPressure", "deleteSleepSegment", "deleteMenstruation", "deleteMenstruationSymptoms", "deleteTemperature", "deleteEcg", "deleteFDSFile", "deleteBloodSugar", "deleteLactateThreshold", "deleteDailyDataItem", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessDataRecorderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDataRecorderImpl.kt\ncom/xiaomi/fit/fitness/impl/FitnessDataRecorderImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,691:1\n37#2:692\n36#2,3:693\n1863#3,2:696\n*S KotlinDebug\n*F\n+ 1 FitnessDataRecorderImpl.kt\ncom/xiaomi/fit/fitness/impl/FitnessDataRecorderImpl\n*L\n301#1:692\n301#1:693,3\n436#1:696,2\n*E\n"})
public final class FitnessDataRecorderImpl implements FitnessDataRecorder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<FitnessDataRecorderImpl> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yp9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataRecorderImpl.instance_delegate$lambda$1();
        }
    });

    @NotNull
    private static final String TAG = "FitnessDataRecordImpl";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fit/fitness/impl/FitnessDataRecorderImpl$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/impl/FitnessDataRecorderImpl;", "getInstance", "()Lcom/xiaomi/fit/fitness/impl/FitnessDataRecorderImpl;", "instance$delegate", "Lkotlin/Lazy;", "TAG", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FitnessDataRecorderImpl getInstance() {
            return (FitnessDataRecorderImpl) FitnessDataRecorderImpl.instance$delegate.getValue();
        }
    }

    private final void computeAndRecordStressByEnergyState(String sid, long time, int zoneOffsetInSec) {
        List<StressItem> listComputeTheDayStress = StressComputeUtils.INSTANCE.computeTheDayStress(sid, time, zoneOffsetInSec);
        if (!listComputeTheDayStress.isEmpty()) {
            StressItem[] stressItemArr = (StressItem[]) listComputeTheDayStress.toArray(new StressItem[0]);
            recordDailyStress(sid, zoneOffsetInSec, (StressItem[]) Arrays.copyOf(stressItemArr, stressItemArr.length));
        }
    }

    private final boolean deleteDailyDataItem(String persistKey, List<? extends DailyRecordItem> recordList, boolean allowSwitchProcess) {
        return FitnessDBDataUpdater.INSTANCE.getInstance().deleteDailyRecord(persistKey, recordList, allowSwitchProcess);
    }

    public static /* synthetic */ boolean deleteDailyDataItem$default(FitnessDataRecorderImpl fitnessDataRecorderImpl, String str, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return fitnessDataRecorderImpl.deleteDailyDataItem(str, list, z);
    }

    private final void deleteFDSFile(String sid, FitnessDataId dataId) {
        FitnessFileUtils.INSTANCE.deleteFile(FitnessFileUtils.getFDSDataFile(ApplicationExtKt.getApplication(), sid, dataId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRecorderImpl instance_delegate$lambda$1() {
        return new FitnessDataRecorderImpl();
    }

    private final boolean recordDailyData(String persistKey, String sid, int zoneOffsetInSec, List<? extends DailyRecordItem> itemList, boolean allowSwitchProcess) {
        ArrayList arrayList = new ArrayList();
        for (DailyRecordItem dailyRecordItem : itemList) {
            Long dbTime = dailyRecordItem.getDbTime();
            arrayList.add(new DailyRecordItemModel(dbTime != null ? dbTime.longValue() : dailyRecordItem.getTimestamp(), zoneOffsetInSec, dailyRecordItem));
        }
        return recordDailyData(persistKey, sid, arrayList, allowSwitchProcess);
    }

    public static /* synthetic */ boolean recordDailyData$default(FitnessDataRecorderImpl fitnessDataRecorderImpl, String str, String str2, int i, List list, boolean z, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z = true;
        }
        return fitnessDataRecorderImpl.recordDailyData(str, str2, i, list, z);
    }

    private final boolean recordDayNightSleep(String persistKey, String sid, int zoneOffsetInSec, DayNightSleepReport... sleepReport) {
        ArrayList arrayList = new ArrayList();
        int tzOffsetIn15minBySec = FitnessDateUtils.INSTANCE.getTzOffsetIn15minBySec(zoneOffsetInSec);
        for (DayNightSleepReport dayNightSleepReport : sleepReport) {
            if (tzOffsetIn15minBySec != dayNightSleepReport.getTzIn15Min()) {
                FitnessLogUtils.i(TAG, "sleep.timeZone(" + dayNightSleepReport.getTzIn15Min() + ") != " + tzOffsetIn15minBySec);
                return false;
            }
            arrayList.add(new DailyRecordItemModel(dayNightSleepReport.getTimestamp(), zoneOffsetInSec, dayNightSleepReport));
        }
        return recordDailyData$default(this, persistKey, sid, arrayList, false, 8, null);
    }

    private final boolean updateSleep(SleepSegmentEntity sleepEntity, SleepSegmentReport sleepSegment) {
        ArrayList arrayList = new ArrayList();
        FitnessDataUtils.INSTANCE.sleepSegmentToDBTime(CollectionsKt__CollectionsJVMKt.listOf(sleepSegment));
        DailyRecordItemModel dailyRecordItemModel = new DailyRecordItemModel(sleepEntity.getTime(), sleepEntity.getZoneOffsetInSec(), sleepSegment);
        dailyRecordItemModel.setCompleteSleep(Boolean.valueOf(sleepEntity.getIsComplete()));
        arrayList.add(dailyRecordItemModel);
        return recordDailyData$default(this, sleepEntity.getKey(), sleepEntity.getSid(), arrayList, false, 8, null);
    }

    private final void updateUserProfileWeight(List<WeightItem> updateWeightItem, int zoneOffsetInSec) {
        DailyRecordItem recentOneData = DailyRecordDaoUtils.INSTANCE.getRecentOneData("weight", null, System.currentTimeMillis() / ((long) 1000), zoneOffsetInSec);
        if (recentOneData == null) {
            return;
        }
        FitnessLogUtils.i(TAG, "updateUserProfileWeight recent " + recentOneData);
        for (WeightItem weightItem : updateWeightItem) {
            if (Intrinsics.compare(weightItem.getTime(), recentOneData.getTimestamp()) == 0) {
                FitnessLogUtils.i(TAG, "update user profile weight: (" + weightItem + ")");
                UserInformationManager.DefaultImpls.sendProfile$default(UserInformationManagerExtKt.getInstance(UserInformationManager.INSTANCE), 0, weightItem.getWeight(), null, null, null, null, null, null, 248, null);
            }
        }
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteBloodPressure(@NotNull DailyRecordItem... recordItem) {
        Intrinsics.checkNotNullParameter(recordItem, "recordItem");
        return deleteDailyDataItem$default(this, "blood_pressure", ArraysKt___ArraysKt.toList(recordItem), false, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteBloodSugar(@NotNull List<? extends DailyRecordItem> recordList) {
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        return deleteDailyDataItem$default(this, FitnessPersistKey.ManualBloodSugar, recordList, false, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteDailyItems(@NotNull String key, @NotNull DailyRecordItem... recordItem) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(recordItem, "recordItem");
        return deleteDailyDataItem$default(this, key, ArraysKt___ArraysKt.toList(recordItem), false, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteEcg(@NotNull DailyRecordItem... recordItem) {
        Intrinsics.checkNotNullParameter(recordItem, "recordItem");
        boolean zDeleteDailyDataItem$default = deleteDailyDataItem$default(this, FitnessPersistKey.EcgMedical, ArraysKt___ArraysKt.toList(recordItem), false, 4, null);
        if (zDeleteDailyDataItem$default) {
            for (DailyRecordItem dailyRecordItem : recordItem) {
                if (dailyRecordItem.getSid() != null) {
                    String sid = dailyRecordItem.getSid();
                    Intrinsics.checkNotNull(sid);
                    Intrinsics.checkNotNull(dailyRecordItem, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport");
                    deleteFDSFile(sid, ((EcgMedicalItemReport) dailyRecordItem).getDataId());
                }
            }
        }
        return zDeleteDailyDataItem$default;
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteLactateThreshold(@NotNull List<? extends DailyRecordItem> recordList) {
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        return deleteDailyDataItem$default(this, "lactate_threshold", recordList, false, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteManualHr(@NotNull DailyRecordItem... recordItem) {
        Intrinsics.checkNotNullParameter(recordItem, "recordItem");
        return deleteDailyDataItem$default(this, FitnessPersistKey.ManualHr, ArraysKt___ArraysKt.toList(recordItem), false, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteManualSpo2(@NotNull DailyRecordItem... recordItem) {
        Intrinsics.checkNotNullParameter(recordItem, "recordItem");
        return deleteDailyDataItem$default(this, FitnessPersistKey.ManualSpo2, ArraysKt___ArraysKt.toList(recordItem), false, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteManualStress(@NotNull DailyRecordItem... recordItem) {
        Intrinsics.checkNotNullParameter(recordItem, "recordItem");
        return deleteDailyDataItem$default(this, FitnessPersistKey.ManualStress, ArraysKt___ArraysKt.toList(recordItem), false, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteMenstruation(@NotNull DailyRecordItem... recordItem) {
        Intrinsics.checkNotNullParameter(recordItem, "recordItem");
        return deleteDailyDataItem(FitnessPersistKey.WomenHealthStatus, ArraysKt___ArraysKt.toList(recordItem), false);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteMenstruationSymptoms(@NotNull DailyRecordItem... recordItem) {
        Intrinsics.checkNotNullParameter(recordItem, "recordItem");
        return deleteDailyDataItem(FitnessPersistKey.WomenHealthSymptoms, ArraysKt___ArraysKt.toList(recordItem), false);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteSleepSegment(@NotNull DailyRecordItem... recordItem) {
        Intrinsics.checkNotNullParameter(recordItem, "recordItem");
        return deleteDailyDataItem$default(this, "sleep", ArraysKt___ArraysKt.toList(recordItem), false, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteSportReport(@NotNull SportBasicReport... sportReport) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        return FitnessDBDataUpdater.INSTANCE.getInstance().deleteSportReport(ArraysKt___ArraysKt.toList(sportReport));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteTemperature(@NotNull DailyRecordItem... recordItem) {
        Intrinsics.checkNotNullParameter(recordItem, "recordItem");
        return deleteDailyDataItem$default(this, FitnessPersistKey.ManualTemperature, ArraysKt___ArraysKt.toList(recordItem), false, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteValidStand(@NotNull DailyRecordItem... recordItem) {
        Intrinsics.checkNotNullParameter(recordItem, "recordItem");
        return deleteDailyDataItem$default(this, FitnessPersistKey.ValidStand, ArraysKt___ArraysKt.toList(recordItem), false, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean deleteWeight(@NotNull DailyRecordItem... recordItem) {
        Intrinsics.checkNotNullParameter(recordItem, "recordItem");
        return deleteDailyDataItem$default(this, "weight", ArraysKt___ArraysKt.toList(recordItem), false, 4, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordAbnormalFib(@NotNull String sid, int zoneOffsetInSec, @NotNull AbnormalFibItem... abFibItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(abFibItem, "abFibItem");
        return recordDailyData$default(this, "abnormal_heart_beat", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(abFibItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordAbnormalHr(@NotNull String sid, int zoneOffsetInSec, @NotNull AbnormalHrItem... abHrItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(abHrItem, "abHrItem");
        return recordDailyData$default(this, FitnessPersistKey.AbnormalHr, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(abHrItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordAbnormalHrHigh(@NotNull String sid, int zoneOffsetInSec, @NotNull SegmentItem... abHrItems) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(abHrItems, "abHrItems");
        return recordDailyData$default(this, "high_heart_rate", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(abHrItems), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordAbnormalHrLow(@NotNull String sid, int zoneOffsetInSec, @NotNull SegmentItem... abHrItems) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(abHrItems, "abHrItems");
        return recordDailyData$default(this, FitnessPersistKey.AbnormalHrLow, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(abHrItems), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordAbnormalSpo2(@NotNull String sid, int zoneOffsetInSec, @NotNull SegmentItem... spo2Items) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(spo2Items, "spo2Items");
        return recordDailyData$default(this, "low_spo2", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(spo2Items), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordAbnormalStress(@NotNull String sid, int zoneOffsetInSec, @NotNull SegmentItem... stressItems) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(stressItems, "stressItems");
        return recordDailyData$default(this, FitnessPersistKey.AbnormalStress, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(stressItems), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordActiveStage(@NotNull String sid, int zoneOffsetInSec, @NotNull ActiveStageItem... activeStageItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(activeStageItem, "activeStageItem");
        return recordActiveStage(sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(activeStageItem));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordBloodPressure(@NotNull String sid, int zoneOffsetInSec, @NotNull BloodPressureItem... bloodPressureItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(bloodPressureItem, "bloodPressureItem");
        return recordBloodPressure(sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(bloodPressureItem));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordBloodSugar(@NotNull String sid, int zoneOffsetInSec, @NotNull List<BloodSugarItem> itemList) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        return recordDailyData$default(this, "blood_sugar", sid, zoneOffsetInSec, itemList, false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordCalorie(@NotNull String sid, int zoneOffsetInSec, @NotNull CaloriesItem... caloriesItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(caloriesItem, "caloriesItem");
        return recordCalorie(sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(caloriesItem));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordDailyBodyMomentum(@NotNull String sid, int zoneOffsetInSec, @NotNull body... bodyMomentumItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(bodyMomentumItem, "bodyMomentumItem");
        return recordDailyData$default(this, "body_momentum", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(bodyMomentumItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordDailyEnergy(@NotNull String sid, int zoneOffsetInSec, @NotNull EnergyItem... energyItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(energyItem, "energyItem");
        boolean zRecordDailyData$default = recordDailyData$default(this, "energy", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(energyItem), false, 16, null);
        if (!(energyItem.length == 0)) {
            computeAndRecordStressByEnergyState(sid, energyItem[0].getTime(), zoneOffsetInSec);
        }
        return zRecordDailyData$default;
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordDailyHr(@NotNull String sid, int zoneOffsetInSec, @NotNull HrItem... hrItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(hrItem, "hrItem");
        return recordDailyData$default(this, "heart_rate", sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(hrItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordDailyLightValue(@NotNull String sid, int zoneOffsetInSec, @NotNull LightValueItem... lightValueItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(lightValueItem, "lightValueItem");
        return recordDailyData$default(this, "light_sensitivity_value", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(lightValueItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordDailySpo2(@NotNull String sid, int zoneOffsetInSec, @NotNull Spo2Item... spo2Item) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(spo2Item, "spo2Item");
        return recordDailyData$default(this, "spo2", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(spo2Item), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordDailyStress(@NotNull String sid, int zoneOffsetInSec, @NotNull StressItem... stressItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(stressItem, "stressItem");
        return recordDailyData$default(this, "stress", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(stressItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordDaytimeSleep(@NotNull String sid, int zoneOffsetInSec, @NotNull DayNightSleepReport... sleepReport) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(sleepReport, "sleepReport");
        return recordDayNightSleep(FitnessPersistKey.DaytimeSleep, sid, zoneOffsetInSec, (DayNightSleepReport[]) Arrays.copyOf(sleepReport, sleepReport.length));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordEcgItemReport(@NotNull String sid, int zoneOffsetInSec, @NotNull EcgMedicalItemReport... ecgItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(ecgItem, "ecgItem");
        return recordDailyData$default(this, FitnessPersistKey.EcgMedical, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(ecgItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordFDSData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(data, "data");
        FitnessFileUtils.writeFile(FitnessFileUtils.getFDSDataFile(ApplicationExtKt.getApplication(), sid, dataId), data);
        return FitnessFDSDataDaoUtils.INSTANCE.recordFDSDataIdToDB(sid, dataId);
    }

    public final boolean recordFemaleHealthStatus(@NotNull String sid, int zoneOffsetInSec, @NotNull List<WomenHealthStatus> statusList) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(statusList, "statusList");
        return recordDailyData(FitnessPersistKey.WomenHealthStatus, sid, zoneOffsetInSec, CollectionsKt___CollectionsKt.toList(statusList), false);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordGradePrediction(@NotNull String sid, int zoneOffsetInSec, @NotNull GradePredictionItem... gradePredictionItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(gradePredictionItem, "gradePredictionItem");
        return recordDailyData$default(this, FitnessPersistKey.GradePrediction, sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(gradePredictionItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordHeadset(@NotNull String sid, int zoneOffsetInSec, @NotNull HeadsetItem... headsetItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(headsetItem, "headsetItem");
        return recordDailyData$default(this, "headset", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(headsetItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordHeadsetNoise(@NotNull String sid, int zoneOffsetInSec, @NotNull NoiseItem... noiseItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(noiseItem, "noiseItem");
        return recordDailyData$default(this, FitnessPersistKey.Noise, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(noiseItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordLactateThreshold(@NotNull String sid, int zoneOffsetInSec, @NotNull LactateThresholdItem... LactateThresholdItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(LactateThresholdItem, "LactateThresholdItem");
        return recordDailyData$default(this, "lactate_threshold", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(LactateThresholdItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordMHStrength(@NotNull String sid, int zoneOffsetInSec, @NotNull MHStrengthItem... mhStrengthItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(mhStrengthItem, "mhStrengthItem");
        return recordMHStrength(sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(mhStrengthItem));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordManualBloodSugar(@NotNull String sid, int zoneOffsetInSec, @NotNull List<BloodSugarItem> itemList) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        return recordDailyData$default(this, FitnessPersistKey.ManualBloodSugar, sid, zoneOffsetInSec, itemList, false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordManualHr(@NotNull String sid, int zoneOffsetInSec, @NotNull HrItem... hrItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(hrItem, "hrItem");
        return recordManualHr(sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(hrItem));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordManualSpo2(@NotNull String sid, int zoneOffsetInSec, @NotNull Spo2Item... spo2Item) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(spo2Item, "spo2Item");
        return recordDailyData$default(this, FitnessPersistKey.ManualSpo2, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(spo2Item), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordManualStress(@NotNull String sid, int zoneOffsetInSec, @NotNull StressItem... stressItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(stressItem, "stressItem");
        return recordDailyData$default(this, FitnessPersistKey.ManualStress, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(stressItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordNightSleep(@NotNull String sid, int zoneOffsetInSec, @NotNull DayNightSleepReport... sleepReport) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(sleepReport, "sleepReport");
        return recordDayNightSleep(FitnessPersistKey.NightSleep, sid, zoneOffsetInSec, (DayNightSleepReport[]) Arrays.copyOf(sleepReport, sleepReport.length));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordPai(@NotNull String sid, int zoneOffsetInSec, @NotNull OneDayPaiReport... paiReport) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(paiReport, "paiReport");
        return recordDailyData$default(this, "pai", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(paiReport), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordPhysicalStatus(@NotNull String sid, int zoneOffsetInSec, @NotNull PhysicalStatusItem... physicalStatusItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(physicalStatusItem, "physicalStatusItem");
        return recordDailyData$default(this, "physical_fitness_status", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(physicalStatusItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordReportMaxHr(@NotNull String sid, int zoneOffsetInSec, @NotNull ReportHrItem... items) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(items, "items");
        return recordDailyData$default(this, FitnessPersistKey.ReportMaxHr, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(items), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordReportMaxSpo2(@NotNull String sid, int zoneOffsetInSec, @NotNull ReportSpo2Item... items) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(items, "items");
        return recordDailyData$default(this, FitnessPersistKey.ReportMaxSpo2, sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(items), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordReportMinHr(@NotNull String sid, int zoneOffsetInSec, @NotNull ReportHrItem... items) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(items, "items");
        return recordDailyData$default(this, FitnessPersistKey.ReportMinHr, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(items), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordReportMinSpo2(@NotNull String sid, int zoneOffsetInSec, @NotNull ReportSpo2Item... items) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(items, "items");
        return recordDailyData$default(this, FitnessPersistKey.ReportMinSpo2, sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(items), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordRestHr(@NotNull String sid, int zoneOffsetInSec, @NotNull RestHrItem... restHrItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(restHrItem, "restHrItem");
        return recordDailyData$default(this, FitnessPersistKey.RestHr, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(restHrItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordRunningIndicator(@NotNull String sid, int zoneOffsetInSec, @NotNull RunningIndicatorItem... runningIndexItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(runningIndexItem, "runningIndexItem");
        return recordDailyData$default(this, FitnessPersistKey.RunningIndicator, sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(runningIndexItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordSleepSegment(@NotNull String sid, int zoneOffsetInSec, @NotNull SleepSegmentReport... sleepSegment) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(sleepSegment, "sleepSegment");
        return recordSleepSegment(sid, zoneOffsetInSec, true, ArraysKt___ArraysJvmKt.asList(sleepSegment));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordSportReport(@NotNull String sid, int zoneOffsetInSec, @NotNull SportBasicReport sportReport) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        return FitnessDBDataUpdater.INSTANCE.getInstance().recordSportReport(sid, sportReport);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordStep(@NotNull String sid, int zoneOffsetInSec, @NotNull StepItem... stepItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(stepItem, "stepItem");
        return recordStep(sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(stepItem));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordTemperatureCharacteristic(@NotNull String sid, int zoneOffsetInSec, @NotNull TemperatureCharacterItem... item) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(item, "item");
        return recordDailyData$default(this, FitnessPersistKey.TemperatureCharacter, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(item), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordTemperatureItem(@NotNull String sid, int zoneOffsetInSec, @NotNull TemperatureItem... temperatureItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(temperatureItem, "temperatureItem");
        return recordDailyData$default(this, FitnessPersistKey.ManualTemperature, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(temperatureItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordTemperatureTrendItem(@NotNull String sid, int zoneOffsetInSec, @NotNull TemperatureTrendItem... temperatureTrendItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(temperatureTrendItem, "temperatureTrendItem");
        return recordDailyData$default(this, "temperature_trend", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(temperatureTrendItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordTrainingLoad(@NotNull String sid, int zoneOffsetInSec, @NotNull TrainingLoadItem... tlItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(tlItem, "tlItem");
        return recordDailyData$default(this, FitnessPersistKey.TrainingLoad, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(tlItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordV02max(@NotNull String sid, int zoneOffsetInSec, @NotNull Vo2MaxItem... vo2MaxItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(vo2MaxItem, "vo2MaxItem");
        return recordDailyData$default(this, FitnessPersistKey.Vo2Max, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(vo2MaxItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordValidStand(@NotNull String sid, int zoneOffsetInSec, @NotNull ValidStandItem... standItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(standItem, "standItem");
        return recordValidStand(sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(standItem));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordVitalityItem(@NotNull String sid, int zoneOffsetInSec, @NotNull VitalityItem... vitalityItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(vitalityItem, "vitalityItem");
        return recordDailyData$default(this, "vitality", sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(vitalityItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordWeight(@NotNull String sid, int zoneOffsetInSec, @NotNull WeightItem... weightItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        return recordWeight(sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(weightItem));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordWomenHealthStatus(@NotNull String sid, int zoneOffsetInSec, @NotNull WomenHealthStatus... status) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(status, "status");
        return recordFemaleHealthStatus(sid, zoneOffsetInSec, ArraysKt___ArraysJvmKt.asList(status));
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordWomenHealthSymptoms(@NotNull String sid, int zoneOffsetInSec, @NotNull WomenHealthSymptoms... symptoms) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(symptoms, "symptoms");
        return recordDailyData(FitnessPersistKey.WomenHealthSymptoms, sid, zoneOffsetInSec, ArraysKt___ArraysKt.toList(symptoms), false);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean updateSleepSegment(@NotNull SleepSegmentReport sleepSegment) {
        Intrinsics.checkNotNullParameter(sleepSegment, "sleepSegment");
        if (sleepSegment.getSid() == null) {
            return true;
        }
        DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
        String sid = sleepSegment.getSid();
        Intrinsics.checkNotNull(sid);
        DailyRecordBaseEntity sleepSegmentEntity = dailyRecordDaoUtils.getSleepSegmentEntity("sleep", sid, sleepSegment.getProtoTime(), Integer.valueOf(sleepSegment.getTzIn15Min()));
        if (!(sleepSegmentEntity instanceof SleepSegmentEntity)) {
            return true;
        }
        updateSleep((SleepSegmentEntity) sleepSegmentEntity, sleepSegment);
        return true;
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public void uploadSleepSrcData(@NotNull String sid, @NotNull FitnessDataId dataId, @NotNull String fileName, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(data, "data");
        SleepDataFDSUploader.INSTANCE.getInstance().uploadSleepSrcData(sid, dataId, fileName, data);
    }

    public static /* synthetic */ boolean recordDailyData$default(FitnessDataRecorderImpl fitnessDataRecorderImpl, String str, String str2, List list, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return fitnessDataRecorderImpl.recordDailyData(str, str2, list, z);
    }

    public final boolean recordActiveStage(@NotNull String sid, int zoneOffsetInSec, @NotNull List<ActiveStageItem> activeStageItemList) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(activeStageItemList, "activeStageItemList");
        return recordDailyData$default(this, FitnessPersistKey.ActiveStage, sid, zoneOffsetInSec, activeStageItemList, false, 16, null);
    }

    public final boolean recordBloodPressure(@NotNull String sid, int zoneOffsetInSec, @NotNull List<BloodPressureItem> bloodPressureList) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(bloodPressureList, "bloodPressureList");
        return recordDailyData$default(this, FitnessPersistKey.BloodPressureMedical, sid, zoneOffsetInSec, bloodPressureList, false, 16, null);
    }

    public final boolean recordCalorie(@NotNull String sid, int zoneOffsetInSec, @NotNull List<CaloriesItem> caloriesItemList) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(caloriesItemList, "caloriesItemList");
        return recordDailyData$default(this, "calories", sid, zoneOffsetInSec, caloriesItemList, false, 16, null);
    }

    public final boolean recordMHStrength(@NotNull String sid, int zoneOffsetInSec, @NotNull List<MHStrengthItem> mhStrengthItemList) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(mhStrengthItemList, "mhStrengthItemList");
        return recordDailyData$default(this, "intensity", sid, zoneOffsetInSec, mhStrengthItemList, false, 16, null);
    }

    public final boolean recordManualHr(@NotNull String sid, int zoneOffsetInSec, @NotNull List<HrItem> hrItemList) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(hrItemList, "hrItemList");
        return recordDailyData$default(this, FitnessPersistKey.ManualHr, sid, zoneOffsetInSec, hrItemList, false, 16, null);
    }

    public final boolean recordSleepSegment(@NotNull String sid, int zoneOffsetInSec, @NotNull List<SleepSegmentReport> sleepSegmentList) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(sleepSegmentList, "sleepSegmentList");
        return recordSleepSegment(sid, zoneOffsetInSec, true, sleepSegmentList);
    }

    public final boolean recordStep(@NotNull String sid, int zoneOffsetInSec, @NotNull List<StepItem> stepItemList) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(stepItemList, "stepItemList");
        return recordDailyData$default(this, "steps", sid, zoneOffsetInSec, stepItemList, false, 16, null);
    }

    public final boolean recordValidStand(@NotNull String sid, int zoneOffsetInSec, @NotNull List<ValidStandItem> standList) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(standList, "standList");
        return recordDailyData$default(this, FitnessPersistKey.ValidStand, sid, zoneOffsetInSec, standList, false, 16, null);
    }

    public final boolean recordWeight(@NotNull String sid, int zoneOffsetInSec, @NotNull List<WeightItem> weightItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        boolean zRecordDailyData$default = recordDailyData$default(this, "weight", sid, zoneOffsetInSec, weightItem, false, 16, null);
        if (zRecordDailyData$default) {
            updateUserProfileWeight(weightItem, zoneOffsetInSec);
        }
        return zRecordDailyData$default;
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordPhysicalStatus(@NotNull String sid, int zoneOffsetInSec, @NotNull List<PhysicalStatusItem> physicalStatusItem) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(physicalStatusItem, "physicalStatusItem");
        return recordDailyData$default(this, "physical_fitness_status", sid, zoneOffsetInSec, CollectionsKt___CollectionsKt.toList(physicalStatusItem), false, 16, null);
    }

    @Override // com.xiaomi.fit.fitness.export.api.FitnessDataRecorder
    public boolean recordSleepSegment(@NotNull String sid, int zoneOffsetInSec, boolean isCompleteSleep, @NotNull SleepSegmentReport... sleepSegment) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(sleepSegment, "sleepSegment");
        return recordSleepSegment(sid, zoneOffsetInSec, isCompleteSleep, ArraysKt___ArraysJvmKt.asList(sleepSegment));
    }

    private final boolean recordSleepSegment(String sid, int zoneOffsetInSec, boolean isCompleteSleep, List<SleepSegmentReport> sleepSegmentList) {
        ArrayList arrayList = new ArrayList();
        for (SleepSegmentReport sleepSegmentReport : sleepSegmentList) {
            if (Intrinsics.compare(sleepSegmentReport.getBedTime(), 0L) != 0 && Intrinsics.compare(sleepSegmentReport.getWakeupTime(), 0L) != 0 && sleepSegmentReport.getSleepDuration() != 0) {
                DailyRecordItemModel dailyRecordItemModel = new DailyRecordItemModel(sleepSegmentReport.getWakeupTime(), zoneOffsetInSec, sleepSegmentReport);
                dailyRecordItemModel.setCompleteSleep(Boolean.valueOf(isCompleteSleep));
                arrayList.add(dailyRecordItemModel);
            } else {
                FitnessLogUtils.i(TAG, "illegal sleep " + sleepSegmentReport);
            }
        }
        return recordDailyData$default(this, "sleep", sid, arrayList, false, 8, null);
    }

    private final boolean recordDailyData(String persistKey, String sid, List<DailyRecordItemModel> recordList, boolean allowSwitchProcess) {
        return FitnessDBDataUpdater.INSTANCE.getInstance().recordDailyRecord(persistKey, sid, recordList, allowSwitchProcess);
    }
}
