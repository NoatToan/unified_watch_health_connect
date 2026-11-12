package com.xiaomi.fitness.util;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.fitness.menstrual.data.MenstrualCycleInfo;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.aireco.AirEcoAccessExtKt;
import com.xiaomi.fit.data.common.data.aireco.AirEcoIntentionConstants;
import com.xiaomi.fit.data.common.data.aireco.IntentionDataDto;
import com.xiaomi.fit.data.common.data.aireco.IntentionType;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.health.bloodglucose.notification.GlucoseNotificationUtils;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFilteredRecordsFragment;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFragment;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureFragment;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureRemindFragment;
import com.xiaomi.fitness.health.calorie.CalorieFragment;
import com.xiaomi.fitness.health.curse.CurseEnterActivity;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.vm.CurseEditVMKt;
import com.xiaomi.fitness.health.ecg.notification.EcgNotificationUtil;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.export.MenstrualWidgetEntryList;
import com.xiaomi.fitness.health.export.MenstrualWidgetSampleBrief;
import com.xiaomi.fitness.health.hearing.HearingFragment;
import com.xiaomi.fitness.health.hrm.HrAndPaceExpandableAllRecordsFragment;
import com.xiaomi.fitness.health.hrm.HrmFragment;
import com.xiaomi.fitness.health.physicalstatus.PhysicalStatusFragment;
import com.xiaomi.fitness.health.pingan.PinganHealthCareWebViewActivityKt;
import com.xiaomi.fitness.health.pinganhealth.DepartmentType;
import com.xiaomi.fitness.health.runningindicator.RunningIndicatorFragment;
import com.xiaomi.fitness.health.runningindicator.RunningIndicatorUnderstandFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepFragment;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingFragment;
import com.xiaomi.fitness.health.spo2.Spo2Fragment;
import com.xiaomi.fitness.health.stand.StandFragment;
import com.xiaomi.fitness.health.step.StepFragment;
import com.xiaomi.fitness.health.threetarget.SportTargetFragment;
import com.xiaomi.fitness.health.threetarget.model.TrainingIndexDataItem;
import com.xiaomi.fitness.health.trainload.TrainingLoadFragment;
import com.xiaomi.fitness.health.vo2max.TrainingLoadUnderstandFragment;
import com.xiaomi.fitness.health.vo2max.VO2MaxFragment;
import com.xiaomi.fitness.health.vo2max.VO2MaxUnderstandFragment;
import com.xiaomi.fitness.health.weight.ui.WeightFragment;
import com.xiaomi.fitness.health.weight.ui.WeightFragmentKt;
import com.xiaomi.fitness.homepage.util.AirEcoIntentionUtil;
import com.xiaomi.fitness.homepage.util.HealthDataTypeUtils;
import com.xiaomi.fitness.relative.home.RelativeHealthFragment;
import com.xiaomi.fitness.relative.hrm.HrmRFragment;
import com.xiaomi.fitness.relative.spo2.Spo2RFragment;
import com.xiaomi.fitness.research.export.ResearchExtKt;
import com.xiaomi.fitness.research.export.ResearchSupporter;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.c0j;
import defpackage.pni;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 n2\u00020\u0001:\u0001nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\u0012\u0010\u0017\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0018\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0019\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u001a\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u000bH\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020\u000bH\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\n\u0010+\u001a\u0004\u0018\u00010*H\u0016J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020*0-2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020&H\u0016J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020*0-2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020&H\u0016J\u0018\u00101\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u00102\u001a\u00020 H\u0016J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000206H\u0016J(\u00107\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020$H\u0016J \u0010;\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u00020&H\u0016J \u0010>\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u00020&H\u0016J\u001c\u0010?\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0@2\u0006\u0010A\u001a\u00020BH\u0016J\"\u0010C\u001a\u00020\u00052\u0006\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020$2\b\u0010:\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010D\u001a\u00020$2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010E\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020GH\u0016J\u0018\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020 H\u0016J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020B0-H\u0016J\u0018\u0010M\u001a\u00020N2\u0006\u0010A\u001a\u00020B2\u0006\u0010O\u001a\u00020PH\u0016J4\u0010Q\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020&2\b\u0010R\u001a\u0004\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020B2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\u0010\u0010U\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020WH\u0016J\u0010\u0010X\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020WH\u0016J\u0018\u0010Y\u001a\u00020\u001c2\u0006\u0010Z\u001a\u00020[2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010\\\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010]\u001a\u00020\u000bH\u0016J\u0010\u0010^\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020$H\u0016J\u001e\u0010`\u001a\u00020\u000b2\f\b\u0001\u0010a\u001a\u00020b\"\u00020 2\u0006\u0010c\u001a\u00020$H\u0016J\u001a\u0010d\u001a\u00020\u001c2\b\b\u0001\u0010a\u001a\u00020 2\u0006\u0010c\u001a\u00020$H\u0016J\u0010\u0010e\u001a\u00020$2\u0006\u0010A\u001a\u00020BH\u0016J\u0016\u0010i\u001a\u00020\u001c2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u001c0hH\u0016J\u0016\u0010k\u001a\u00020\u001c2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u001c0hH\u0016J\b\u0010l\u001a\u00020\u001cH\u0016J\u0010\u0010m\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020$H\u0016R\u001a\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0h0gX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006o"}, d2 = {"Lcom/xiaomi/fitness/util/HealthPageImpl;", "Lcom/xiaomi/fitness/health/export/IHealthPage;", "<init>", "()V", "getStepPageIntent", "Landroid/content/Intent;", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "getSleepPageIntent", "getWeightPageIntent", "isFrom8Electrode", "", "getMensesPageIntent", "getBloodPressurePageIntent", "getStandPageIntent", "getHeartRatePageIntent", "getHeartRateDetectionPageIntent", "getHearingPageIntent", "getRainbowPageIntent", "getAppHomeIntent", "getSpo2PageIntent", "getSleepSettingIntent", "goBloodPressureMeasurePage", "goBloodGlucosePageIntent", "goBloodGlucoseRecordDetailPage", "goHrAndPaceAllRecordPage", "getIntentToCaloriePage", "goToHealthVisitDoctorPage", "", "context", "Landroid/content/Context;", "deptType", "", "registerAirEcoIntentionHandler", "usedCurse", "getCurseTitle", "", "mills", "", "getCurseSubTitle", "hasPredictData", "getCurseLatestRecord", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "getCurseLatestPredict", "getCurseRecords", "", "startMills", "endMills", "getCursePredictRecords", "markCurseStatus", "targetMarkType", "getWidgetProviderSampleBrief", "Lcom/xiaomi/fitness/health/export/MenstrualWidgetSampleBrief;", "getWidgetProviderEntryList", "Lcom/xiaomi/fitness/health/export/MenstrualWidgetEntryList;", "gotoRelativeHealthFragment", "relativeUid", "relativeNode", "origin", "gotoRelativeHrmFragment", "timestamp", "relativeId", "gotoRelativeSpo2Fragment", "getHealthItemNameIconResIdPair", "Lkotlin/Pair;", "homeDataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getIntentForRelativeHealthPage", "getHealthDataTypeNameByHomeDataType", "notifyNewEcgRecordToUser", "ecgReport", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "notifyAbnormalGlucose", "item", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "level", "getSupportedHomeDataTypesForTrainingIndex", "getTrainingIndexDataItem", "Lcom/xiaomi/fitness/health/threetarget/model/TrainingIndexDataItem;", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "goToTrainingIndexDataPage", "did", "activityOptions", "Landroid/app/ActivityOptions;", "showSyncSwitchOpenDialog", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "showLoginConfirmDialog", "goToTrainingIndexUnderstandPage", "contextFragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "grantAndJumpToPinganRedirectUrl", "getGrantPingan", "setPingPanPageUrl", "url", "doSendAirEcoIntention", "intentionType", "", "callSite", "sendRevertIntentionToAirEco", "getDataTypeNoDataGuide", "mWeightChangeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function0;", "addWeightChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeWeightChangeListener", "notifyWeightChanged", "syncTemperatureFile", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthPageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthPageImpl.kt\ncom/xiaomi/fitness/util/HealthPageImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,671:1\n1863#2,2:672\n*S KotlinDebug\n*F\n+ 1 HealthPageImpl.kt\ncom/xiaomi/fitness/util/HealthPageImpl\n*L\n656#1:672,2\n*E\n"})
public final class HealthPageImpl implements IHealthPage {
    public static final int health_research_bp_type = 2;
    public static final int health_research_homepage_type = 3;
    public static final int health_research_sleep_type = 1;

    @NotNull
    private final CopyOnWriteArrayList<Function0<Unit>> mWeightChangeListeners = new CopyOnWriteArrayList<>();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.CALORIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.VALID_STAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.MH_STRENGTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeDataType.SLEEP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeDataType.WOMEN_HEALTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeDataType.HR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeDataType.WEIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeDataType.BLOOD_PRESSURE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HomeDataType.RAINBOW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HomeDataType.ENERGY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HomeDataType.STRESS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HomeDataType.V02_MAX.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HomeDataType.PAI.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HomeDataType.HEARING_HEALTH.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[HomeDataType.TRAINING_LOAD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[HomeDataType.RUNNING_INDICATOR.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[HomeDataType.PHYSICAL_STATUS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.util.HealthPageImpl$sendRevertIntentionToAirEco$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.util.HealthPageImpl$sendRevertIntentionToAirEco$1", f = "HealthPageImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bundle $bundle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Bundle bundle, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bundle = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$bundle, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String string;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Bundle bundleCall = ApplicationExtKt.getApplication().getContentResolver().call(AirEcoIntentionConstants.INTENTION_AUTHORITY_URI, AirEcoIntentionConstants.REVERT_CALL_METHOD, (String) null, this.$bundle);
                int i = bundleCall != null ? bundleCall.getInt("code") : 0;
                if (bundleCall == null || (string = bundleCall.getString("message")) == null) {
                    string = "";
                }
                Logger.i(AirEcoAccessExtKt.TAG, "sendRevertIntentionToAirEco succeeded. code=" + i + " message=" + string);
            } catch (Exception e) {
                Logger.i(AirEcoAccessExtKt.TAG, "sendRevertIntentionToAirEco failed. exception=" + e);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.util.HealthPageImpl$syncTemperatureFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.util.HealthPageImpl$syncTemperatureFile$1", f = "HealthPageImpl.kt", i = {}, l = {663}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C33151(Continuation<? super C33151> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(MenstrualCycleInfo menstrualCycleInfo) {
            Logger.i("HealthPageImpl", "syncCurse: requestCursePredictionAlgo,menstrual info:" + menstrualCycleInfo);
            if (menstrualCycleInfo != null) {
                CurseManager.INSTANCE.getInstance().getAlgoCurseManager().refreshAlgoCurseData();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33151(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthUtil healthUtil = HealthUtil.INSTANCE;
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                CurseManager.Companion companion = CurseManager.INSTANCE;
                int inDays = companion.getInstance().getInDays();
                int interval = companion.getInstance().getInterval();
                Function1<? super MenstrualCycleInfo, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.util.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return HealthPageImpl.C33151.invokeSuspend$lambda$1((MenstrualCycleInfo) obj2);
                    }
                };
                this.label = 1;
                if (healthUtil.requestCursePredictionAlgo(jCurrentTimeMillis, inDays, interval, 0, function1, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void addWeightChangeListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mWeightChangeListeners.add(listener);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public boolean doSendAirEcoIntention(@IntentionType @NotNull int[] intentionType, @NotNull String callSite) {
        String string;
        Intrinsics.checkNotNullParameter(intentionType, "intentionType");
        Intrinsics.checkNotNullParameter(callSite, "callSite");
        if (!AirEcoAccessExtKt.getSupportAirEcoIntentionAccess()) {
            return false;
        }
        Bundle bundle = new Bundle();
        List<IntentionDataDto> intentionDtoList = AirEcoAccessExtKt.getIntentionDtoList(Arrays.copyOf(intentionType, intentionType.length));
        if (!(!intentionDtoList.isEmpty())) {
            return false;
        }
        String strA = xpd.a(intentionDtoList);
        Logger.i(AirEcoAccessExtKt.TAG, "doSendAirEcoIntention intentionListJsonStr=" + strA + " callSite=" + callSite);
        bundle.putString("key_param_intention", strA);
        try {
            Bundle bundleCall = ApplicationExtKt.getApplication().getContentResolver().call(AirEcoIntentionConstants.INTENTION_AUTHORITY_URI, AirEcoIntentionConstants.NOTIFY_CALL_METHOD, (String) null, bundle);
            int i = bundleCall != null ? bundleCall.getInt("code") : 0;
            if (bundleCall == null || (string = bundleCall.getString("message")) == null) {
                string = "";
            }
            Logger.i(AirEcoAccessExtKt.TAG, "doSendAirEcoIntention succeeded. code=" + i + " message=" + string);
            return true;
        } catch (Exception e) {
            Logger.i(AirEcoAccessExtKt.TAG, "doSendAirEcoIntention failed. exception=" + e);
            return false;
        }
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getAppHomeIntent() {
        Intent intent = new Intent(ApplicationExtKt.getApplication().getPackageName() + ".action.HOME");
        intent.addCategory("android.intent.category.DEFAULT");
        return intent;
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getBloodPressurePageIntent(@Nullable Bundle bundle) {
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), BloodPressureFragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @Nullable
    public Record getCurseLatestPredict() {
        return new CurseManager().initData("provider").getLatestPredictRecord();
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @Nullable
    public Record getCurseLatestRecord() {
        return new CurseManager().initData("provider").getLatestRecord();
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public List<Record> getCursePredictRecords(long startMills, long endMills) {
        return new CurseManager().initData("provider").getPredictRecords(startMills, endMills);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public List<Record> getCurseRecords(long startMills, long endMills) {
        return FitnessDataExtKt.getCurseApi().getPeriod(startMills, endMills);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @Nullable
    public String getCurseSubTitle(long mills) {
        return CurseManager.getDesc$default(new CurseManager().initData("provider"), mills, 0, 0, 6, null);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @Nullable
    public String getCurseTitle(long mills) {
        return ExtUtilKt.getString(c0j.v5);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public String getDataTypeNoDataGuide(@NotNull HomeDataType homeDataType) {
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        int i = WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()];
        if (i == 14) {
            String string = ApplicationExtKt.getApplication().getString(c0j.i8);
            Intrinsics.checkNotNull(string);
            return string;
        }
        switch (i) {
            case 17:
                String string2 = ApplicationExtKt.getApplication().getString(c0j.Yb);
                Intrinsics.checkNotNull(string2);
                return string2;
            case 18:
                String string3 = ApplicationExtKt.getApplication().getString(c0j.i8);
                Intrinsics.checkNotNull(string3);
                return string3;
            case 19:
                String string4 = ApplicationExtKt.getApplication().getString(c0j.h8);
                Intrinsics.checkNotNull(string4);
                return string4;
            default:
                return "";
        }
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public boolean getGrantPingan() {
        return HealthPrefer.INSTANCE.getPINGAN_HEALTH_AUTHORIZED();
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public String getHealthDataTypeNameByHomeDataType(@NotNull HomeDataType homeDataType) {
        int i;
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        switch (WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()]) {
            case 1:
                i = c0j.u7;
                break;
            case 2:
                i = c0j.g7;
                break;
            case 3:
                i = c0j.t7;
                break;
            case 4:
                i = c0j.tm;
                break;
            case 5:
                i = c0j.q7;
                break;
            case 6:
                i = c0j.h7;
                break;
            case 7:
                i = c0j.k7;
                break;
            case 8:
                i = c0j.r7;
                break;
            case 9:
                i = c0j.x7;
                break;
            case 10:
                i = c0j.f7;
                break;
            case 11:
                i = c0j.jm;
                break;
            case 12:
                i = c0j.i7;
                break;
            case 13:
                i = c0j.v7;
                break;
            case 14:
                i = c0j.w7;
                break;
            case 15:
                i = c0j.n7;
                break;
            case 16:
                i = c0j.j7;
                break;
            case 17:
                i = c0j.Zn;
                break;
            case 18:
                i = c0j.o7;
                break;
            case 19:
                i = c0j.mb;
                break;
            default:
                i = 0;
                break;
        }
        return ExtUtilKt.getString(i);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Pair<Integer, Integer> getHealthItemNameIconResIdPair(@NotNull HomeDataType homeDataType) {
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        switch (WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()]) {
            case 1:
                return new Pair<>(Integer.valueOf(c0j.u7), Integer.valueOf(pni.a0));
            case 2:
                return new Pair<>(Integer.valueOf(c0j.g7), Integer.valueOf(pni.M));
            case 3:
                return new Pair<>(Integer.valueOf(c0j.t7), Integer.valueOf(pni.Y));
            case 4:
                return new Pair<>(Integer.valueOf(c0j.tm), Integer.valueOf(pni.R));
            case 5:
                return new Pair<>(Integer.valueOf(c0j.q7), Integer.valueOf(pni.W));
            case 6:
                return new Pair<>(Integer.valueOf(c0j.h7), Integer.valueOf(pni.N));
            case 7:
                return new Pair<>(Integer.valueOf(c0j.k7), Integer.valueOf(pni.T));
            case 8:
                return new Pair<>(Integer.valueOf(c0j.r7), Integer.valueOf(pni.U));
            case 9:
                return new Pair<>(Integer.valueOf(c0j.x7), Integer.valueOf(pni.f0));
            case 10:
                return new Pair<>(Integer.valueOf(c0j.f7), Integer.valueOf(pni.K));
            case 11:
                return new Pair<>(Integer.valueOf(c0j.jm), Integer.valueOf(pni.t0));
            default:
                return new Pair<>(0, 0);
        }
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getHearingPageIntent(@Nullable Bundle bundle) {
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), HearingFragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getHeartRateDetectionPageIntent(@Nullable Bundle bundle) {
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), HrmFragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getHeartRatePageIntent(@Nullable Bundle bundle) {
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), HrmFragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getIntentForRelativeHealthPage(long relativeUid, @NotNull String relativeNode, @Nullable String origin) {
        Intrinsics.checkNotNullParameter(relativeNode, "relativeNode");
        Bundle bundle = new Bundle();
        bundle.putLong("key_relative_uid", relativeUid);
        bundle.putString("origin", origin);
        bundle.putSerializable("key_relative_note", relativeNode);
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), RelativeHealthFragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getIntentToCaloriePage(@Nullable Bundle bundle) {
        return HealthUtil.INSTANCE.gotoPageIntent(ApplicationExtKt.getApplication(), CalorieFragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getMensesPageIntent(@Nullable Bundle bundle) {
        return new Intent(AppUtil.getApp(), (Class<?>) CurseEnterActivity.class);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getRainbowPageIntent(@Nullable Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("sport_type", 14);
        bundle.putString("did", "default_did");
        bundle.putSerializable("local_date", LocalDate.now());
        Intent intentAddFlags = HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), SportTargetFragment.class, bundle).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        return intentAddFlags;
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getSleepPageIntent(@Nullable Bundle bundle) {
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), SleepFragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getSleepSettingIntent(@Nullable Bundle bundle) {
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), SleepSettingFragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getSpo2PageIntent(@Nullable Bundle bundle) {
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), Spo2Fragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getStandPageIntent(@Nullable Bundle bundle) {
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), StandFragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getStepPageIntent(@Nullable Bundle bundle) {
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), StepFragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public List<HomeDataType> getSupportedHomeDataTypesForTrainingIndex() {
        return HealthDataTypeUtils.INSTANCE.getSupportiveHomeDataTypeListForTrainingIndex();
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public TrainingIndexDataItem getTrainingIndexDataItem(@NotNull HomeDataType homeDataType, @NotNull DailyBasicReport report) {
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        Intrinsics.checkNotNullParameter(report, "report");
        return HealthDataTypeUtils.INSTANCE.getTrainingIndexDataItem(homeDataType, report);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent getWeightPageIntent(@Nullable Bundle bundle, boolean isFrom8Electrode) {
        (bundle == null ? new Bundle() : bundle).putBoolean(WeightFragmentKt.KEY_IS_FROM_8_ELECTRODE, true);
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), WeightFragment.class, bundle);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public MenstrualWidgetEntryList getWidgetProviderEntryList() {
        return new CurseManager().initData("widget").getWidgetProviderEntryList();
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public MenstrualWidgetSampleBrief getWidgetProviderSampleBrief() {
        return new CurseManager().initData("widget").getTodayWidgetProviderSampleBrief();
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent goBloodGlucosePageIntent(@Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt("sport_type", 403);
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), BloodGlucoseFragment.class, bundle2);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent goBloodGlucoseRecordDetailPage(@Nullable Bundle bundle) {
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), BloodGlucoseFilteredRecordsFragment.class, null);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent goBloodPressureMeasurePage() {
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), BloodPressureRemindFragment.class, null);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    @NotNull
    public Intent goHrAndPaceAllRecordPage(@Nullable Bundle bundle) {
        return HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), HrAndPaceExpandableAllRecordsFragment.class, null);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void goToHealthVisitDoctorPage(@NotNull Context context, @DepartmentType int deptType) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(context, "context");
        if (deptType % 10 != 8) {
            String departmentUrl = PingAnHealthExtKt.getDepartmentUrl(deptType);
            HealthPrefer healthPrefer = HealthPrefer.INSTANCE;
            if (healthPrefer.getPINGAN_HEALTH_AUTHORIZED()) {
                PinganHealthCareWebViewActivityKt.startPinganHealthCareWebActivity(departmentUrl, context);
                return;
            } else {
                healthPrefer.setPINGAN_HEALTH_URL(departmentUrl);
                WebViewUtilKt.startWebView$default(PingAnHealthExtKt.URL_XIAOMI_PINGAN_AUTH_URL, null, false, false, null, false, null, false, 254, null);
                return;
            }
        }
        PackageManager packageManager = context.getPackageManager();
        Intent launchIntentForPackage = packageManager != null ? packageManager.getLaunchIntentForPackage("com.mi.healthresearch") : null;
        if (launchIntentForPackage == null || !AppUtil.INSTANCE.appInstalled(context, "com.mi.healthresearch")) {
            if (deptType / 10 == 0) {
                str = "56.98.2.1.38017";
                str2 = "xiaomi_blood_download";
            } else {
                str = "56.37.5.1.38005";
                str2 = "xiaomi_sleep_download";
            }
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("click_v3", str), "name", str2);
            ResearchExtKt.getInstance(ResearchSupporter.INSTANCE).installApp(context);
            return;
        }
        int i = deptType / 10;
        if (i == 0) {
            launchIntentForPackage.setComponent(new ComponentName("com.mi.healthresearch", "com.mi.research.main.MainActivity"));
            launchIntentForPackage.putExtra("RESEARCH_TYPE", 2);
            context.startActivity(launchIntentForPackage);
        } else if (i == 1 || i == 7) {
            launchIntentForPackage.setComponent(new ComponentName("com.mi.healthresearch", "com.mi.research.main.MainActivity"));
            launchIntentForPackage.putExtra("RESEARCH_TYPE", 1);
            context.startActivity(launchIntentForPackage);
        } else {
            launchIntentForPackage.setComponent(new ComponentName("com.mi.healthresearch", "com.mi.research.main.MainActivity"));
            launchIntentForPackage.putExtra("RESEARCH_TYPE", 3);
            context.startActivity(launchIntentForPackage);
        }
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void goToTrainingIndexDataPage(long timestamp, @Nullable String did, @NotNull Context context, @NotNull HomeDataType homeDataType, @Nullable ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        Bundle bundle = new Bundle();
        bundle.putSerializable("local_date", TimeDateUtil.timestampToLocalDate(timestamp));
        if (did != null && !StringsKt__StringsKt.isBlank(did)) {
            bundle.putString("did", did);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()];
        if (i == 14) {
            HealthUtil.INSTANCE.gotoPage(context, VO2MaxFragment.class, bundle, activityOptions);
        }
        switch (i) {
            case 17:
                HealthUtil.INSTANCE.gotoPage(context, TrainingLoadFragment.class, bundle, activityOptions);
                break;
            case 18:
                HealthUtil.INSTANCE.gotoPage(context, RunningIndicatorFragment.class, bundle, activityOptions);
                break;
            case 19:
                Bundle bundle2 = new Bundle();
                bundle2.putInt("sport_type", 24);
                HealthUtil.INSTANCE.gotoPage(context, PhysicalStatusFragment.class, bundle2, activityOptions);
                break;
        }
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void goToTrainingIndexUnderstandPage(@NotNull BaseFragment contextFragment, @NotNull HomeDataType homeDataType) {
        Intrinsics.checkNotNullParameter(contextFragment, "contextFragment");
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        int i = WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()];
        if (i == 14) {
            BaseFragmentExKt.gotoPage(contextFragment, VO2MaxUnderstandFragment.class, null);
        }
        switch (i) {
            case 17:
                BaseFragmentExKt.gotoPage(contextFragment, TrainingLoadUnderstandFragment.class, null);
                break;
            case 18:
                BaseFragmentExKt.gotoPage(contextFragment, RunningIndicatorUnderstandFragment.class, null);
                break;
            case 19:
                WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandPhysicalStatusUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), ExtUtilKt.getString(c0j.ob), false, false, null, false, null, false, 252, null);
                break;
        }
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void gotoRelativeHealthFragment(@NotNull Context context, long relativeUid, @NotNull String relativeNode, @NotNull String origin) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(relativeNode, "relativeNode");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Bundle bundle = new Bundle();
        bundle.putLong("key_relative_uid", relativeUid);
        bundle.putString("key_relative_note", relativeNode);
        bundle.putString("origin", origin);
        Intent intentGotoPageIntent = HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), RelativeHealthFragment.class, bundle);
        intentGotoPageIntent.addFlags(268435456);
        context.startActivity(intentGotoPageIntent);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void gotoRelativeHrmFragment(@NotNull Context context, long timestamp, long relativeId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle = new Bundle();
        bundle.putSerializable("local_date", TimeDateUtil.timestampToLocalDate(timestamp));
        bundle.putLong("key_relative_uid", relativeId);
        Intent intentGotoPageIntent = HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), HrmRFragment.class, bundle);
        intentGotoPageIntent.addFlags(268435456);
        context.startActivity(intentGotoPageIntent);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void gotoRelativeSpo2Fragment(@NotNull Context context, long timestamp, long relativeId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle = new Bundle();
        bundle.putSerializable("local_date", TimeDateUtil.timestampToLocalDate(timestamp));
        bundle.putLong("key_relative_uid", relativeId);
        Intent intentGotoPageIntent = HealthUtil.INSTANCE.gotoPageIntent(AppUtil.getApp(), Spo2RFragment.class, bundle);
        intentGotoPageIntent.addFlags(268435456);
        context.startActivity(intentGotoPageIntent);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void grantAndJumpToPinganRedirectUrl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HealthPrefer healthPrefer = HealthPrefer.INSTANCE;
        healthPrefer.setPINGAN_HEALTH_AUTHORIZED(true);
        PinganHealthCareWebViewActivityKt.startPinganHealthCareWebActivity(healthPrefer.getPINGAN_HEALTH_URL(), context);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public boolean hasPredictData() {
        CurseSetting setting = new CurseManager().readSetting();
        return setting != null && setting.isPredictEnable();
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public int markCurseStatus(long mills, int targetMarkType) {
        return CurseEditVMKt.actionDataProvider(mills, targetMarkType);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void notifyAbnormalGlucose(@NotNull BloodSugarItem item, int level) {
        Intrinsics.checkNotNullParameter(item, "item");
        GlucoseNotificationUtils.INSTANCE.notifyAbnormalGlucose(item, level);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void notifyNewEcgRecordToUser(@NotNull EcgMedicalItemReport ecgReport) {
        Intrinsics.checkNotNullParameter(ecgReport, "ecgReport");
        EcgNotificationUtil.INSTANCE.notifyNewEcgRecordToUser(ecgReport);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void notifyWeightChanged() {
        Iterator<T> it = this.mWeightChangeListeners.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void registerAirEcoIntentionHandler() {
        AirEcoIntentionUtil.INSTANCE.registerHandler();
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void removeWeightChangeListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mWeightChangeListeners.remove(listener);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void sendRevertIntentionToAirEco(@IntentionType int intentionType, @NotNull String callSite) {
        Intrinsics.checkNotNullParameter(callSite, "callSite");
        Logger.i(AirEcoAccessExtKt.TAG, "sendRevertIntentionToAirEco intentionType=" + intentionType + " callSite=" + callSite);
        if (AirEcoAccessExtKt.getSupportAirEcoIntentionAccess()) {
            Bundle bundle = new Bundle();
            String widgetIntentId = AirEcoAccessExtKt.getWidgetIntentId(intentionType);
            if (widgetIntentId == null) {
                return;
            }
            ArrayList<String> arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(widgetIntentId);
            Logger.i(AirEcoAccessExtKt.TAG, "sendRevertIntentionToAirEco intentionIdList=" + arrayListArrayListOf);
            bundle.putStringArrayList("key_intent_id_list", arrayListArrayListOf);
            AnyExtKt.io$default(null, new AnonymousClass1(bundle, null), 1, null);
        }
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void setPingPanPageUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HealthPrefer.INSTANCE.setPINGAN_HEALTH_URL(url);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void showLoginConfirmDialog(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        HealthHelper.INSTANCE.getInstance(activity).showLoginConfirmDialog(activity);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void showSyncSwitchOpenDialog(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        HealthHelper.INSTANCE.getInstance(activity).showSyncSwitchOpenDialog(activity);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public void syncTemperatureFile(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        AnyExtKt.io$default(null, new C33151(null), 1, null);
    }

    @Override // com.xiaomi.fitness.health.export.IHealthPage
    public boolean usedCurse() {
        boolean z = new CurseManager().readSetting() != null;
        Logger.i("CurseProvider", "usedCurse: " + z);
        return z;
    }
}
