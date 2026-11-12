package com.xiaomi.fitness.util;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.mi.fitness.menstrual.MenstrualAlgo;
import com.mi.fitness.menstrual.MenstrualAlgoNative;
import com.mi.fitness.menstrual.data.MenstrualCycleElement;
import com.mi.fitness.menstrual.data.MenstrualCycleInfo;
import com.mi.fitness.menstrual.data.MenstrualPredictDateRequest;
import com.mi.fitness.menstrual.data.MenstrualSettingRequest;
import com.mi.fitness.menstrual.data.TemperatureBasicInfo;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.repository.IRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.annotation.SleepAnimalType;
import com.xiaomi.fit.fitness.export.data.item.AlgoCurseItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureTrendItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseFragment;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureFragment;
import com.xiaomi.fitness.health.calorie.CalorieFragment;
import com.xiaomi.fitness.health.curse.CurseMainActivity;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.CurseResetActivity;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.ecg.EcgFragment;
import com.xiaomi.fitness.health.energy.EnergyFragment;
import com.xiaomi.fitness.health.hearing.HearingFragment;
import com.xiaomi.fitness.health.hrm.HrmFragment;
import com.xiaomi.fitness.health.mhintensity.MHStrengthFragment;
import com.xiaomi.fitness.health.pai.PaiFragment;
import com.xiaomi.fitness.health.physicalstatus.PhysicalStatusFragment;
import com.xiaomi.fitness.health.runningindicator.RunningIndicatorFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepFragment;
import com.xiaomi.fitness.health.spo2.Spo2Fragment;
import com.xiaomi.fitness.health.stand.StandFragment;
import com.xiaomi.fitness.health.step.StepFragment;
import com.xiaomi.fitness.health.stress.StressFragment;
import com.xiaomi.fitness.health.temperature.ui.TemperatureFragment;
import com.xiaomi.fitness.health.todayhealth.ui.TodayHealthFragment;
import com.xiaomi.fitness.health.trainload.TrainingLoadFragment;
import com.xiaomi.fitness.health.vitality.VitalityFragment;
import com.xiaomi.fitness.health.vo2max.VO2MaxFragment;
import com.xiaomi.fitness.health.weight.ui.WeightFragment;
import com.xiaomi.fitness.login.NeedLoginAspect;
import com.xiaomi.fitness.login.annotation.NeedLogin;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl;
import com.xiaomi.fitness.privacy.export.PrivacyHelper;
import com.xiaomi.fitness.privacy.export.PrivacyHelperPointKt;
import com.xiaomi.fitness.widget.distribute.IDataAdapter;
import com.xiaomi.onetrack.OneTrack;
import defpackage.b4s;
import defpackage.c0j;
import defpackage.dih;
import defpackage.fai;
import defpackage.km5;
import defpackage.l2c;
import defpackage.m2c;
import defpackage.nrd;
import defpackage.s69;
import defpackage.xj4;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\br\u0010\u000fJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u001f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001cH\u0007¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b)\u0010(J;\u0010-\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010,\u001a\u00020\u0019H\u0007¢\u0006\u0004\b-\u0010.JC\u00101\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010/2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010,\u001a\u00020\u0019¢\u0006\u0004\b1\u00102J7\u00105\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u00104\u001a\u0006\u0012\u0002\b\u0003032\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b5\u00106J-\u00108\u001a\u0002072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u00104\u001a\u0006\u0012\u0002\b\u0003032\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b8\u00109J%\u0010>\u001a\u00020=2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u0002¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u0002¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020\u001f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\u0004\bB\u0010!J\u0015\u0010D\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u0019¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u0019¢\u0006\u0004\bF\u0010EJ\u0015\u0010G\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u0019¢\u0006\u0004\bG\u0010EJ\u0015\u0010H\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u0019¢\u0006\u0004\bH\u0010EJ\u0015\u0010I\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u0019¢\u0006\u0004\bI\u0010EJ\u0015\u0010J\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u0019¢\u0006\u0004\bJ\u0010EJ\r\u0010K\u001a\u00020\u0019¢\u0006\u0004\bK\u0010%J\r\u0010L\u001a\u00020\u0019¢\u0006\u0004\bL\u0010%J\u0017\u0010N\u001a\u00020\u00192\b\b\u0001\u0010M\u001a\u00020\u0002¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u0019¢\u0006\u0004\bP\u0010%J\u001d\u0010T\u001a\u00020S2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bT\u0010UJ!\u0010Y\u001a\u00020\r2\u0012\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0W0V¢\u0006\u0004\bY\u0010ZJF\u0010b\u001a\u00020\r2\u0006\u0010[\u001a\u00020:2\u0006\u0010\\\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u00022\u0006\u0010^\u001a\u00020\u00022\u0014\u0010a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010`\u0012\u0004\u0012\u00020\r0_H\u0086@¢\u0006\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\bf\u0010eR\u0014\u0010g\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\bg\u0010eR\u001a\u0010h\u001a\u00020&8FX\u0087\u0004¢\u0006\f\u0012\u0004\bj\u0010\u000f\u001a\u0004\bh\u0010iR\u001a\u0010m\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\bl\u0010\u000f\u001a\u0004\bk\u0010AR\u001a\u0010q\u001a\u00020\u001f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bp\u0010\u000f\u001a\u0004\bn\u0010o¨\u0006s"}, d2 = {"Lcom/xiaomi/fitness/util/HealthUtil;", "", "", "value", "sumValue", "computePercentage", "(II)I", DailyRecordKey.sportType, "getSportTypeImageHomePage", "(I)I", "getDataModelSpanSize", "sleepState", "getSleepType", "", "triggerPullSleepAnimal", "()V", "Landroid/content/Context;", "context", "Landroid/app/ActivityOptions;", "activityOptions", "gotoCurseDetail", "(Landroid/content/Context;Landroid/app/ActivityOptions;)V", "createModelSecondSortId", "Lorg/joda/time/LocalDate;", "localDate", "", "getWeekDateStr", "(Lorg/joda/time/LocalDate;)Ljava/lang/String;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "entries", "", "getTheMaxNumber", "(Ljava/util/List;)F", "Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;", "getTheMaxValuesNumber", "getHost", "()Ljava/lang/String;", "", "needCheckLogin", "(I)Z", "needCheckUserInfo", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "origin", "goDataPageCheckUserInfo", "(Landroid/content/Context;ILandroid/os/Bundle;Landroid/app/ActivityOptions;Ljava/lang/String;)V", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "goDataPage", "(Landroidx/fragment/app/FragmentActivity;Landroid/content/Context;ILandroid/os/Bundle;Landroid/app/ActivityOptions;Ljava/lang/String;)V", "Ljava/lang/Class;", "targetClazz", "gotoPage", "(Landroid/content/Context;Ljava/lang/Class;Landroid/os/Bundle;Landroid/app/ActivityOptions;)V", "Landroid/content/Intent;", "gotoPageIntent", "(Landroid/content/Context;Ljava/lang/Class;Landroid/os/Bundle;)Landroid/content/Intent;", "", "time", "sortId", "Lkm5;", "createDefaultDataModel", "(JII)Lkm5;", "checkLoginAccountStatusInfo", "()I", "getTheMaxTarget", "locale", "getTargetDataUrl", "(Ljava/lang/String;)Ljava/lang/String;", "getUnderstandHrmUrl", "getUnderstandSleepUrl", "getUnderstandSleepEfficiencyUrl", "getUnderstandPhysicalStatusUrl", "getUnderstandBloodSugarUrl", "getUnderstandSleepUrlWithDevice", "getUnderstandSleepUrlWithStruct", "type", "getUnderstandSleepAnimalUrl", "(I)Ljava/lang/String;", "getUnderstandSleepRhythm", "Lcom/xiaomi/fitness/widget/distribute/IDataAdapter;", "adapter", "Landroidx/recyclerview/widget/GridLayoutManager;", "buildCommonDataAdapterLayoutManager", "(Landroid/content/Context;Lcom/xiaomi/fitness/widget/distribute/IDataAdapter;)Landroidx/recyclerview/widget/GridLayoutManager;", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "callbackWeakReference", "listenOnLogInAndProceed", "(Ljava/lang/ref/WeakReference;)V", "startDateSec", "cursePeriod", "menstrualPeriod", "requestType", "Lkotlin/Function1;", "Lcom/mi/fitness/menstrual/data/MenstrualCycleInfo;", "action", "requestCursePredictionAlgo", "(JIIILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ORIGIN_HOME_CARD", "Ljava/lang/String;", "ORIGIN_SHOW_ALL_DATA", "HOST_OPERATION", "isFemale", "()Z", "isFemale$annotations", "getAge", "getAge$annotations", "age", "getHeight", "()F", "getHeight$annotations", "height", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHealthUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthUtil.kt\ncom/xiaomi/fitness/util/HealthUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,720:1\n1863#2,2:721\n1053#2:723\n360#2,7:724\n*S KotlinDebug\n*F\n+ 1 HealthUtil.kt\ncom/xiaomi/fitness/util/HealthUtil\n*L\n595#1:721,2\n617#1:723\n627#1:724,7\n*E\n"})
public final class HealthUtil {

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    public static final HealthUtil INSTANCE;

    @NotNull
    public static final String ORIGIN_HOME_CARD = "home_card";

    @NotNull
    public static final String ORIGIN_SHOW_ALL_DATA = "show_all_data";
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ nrd.a ajc$tjp_0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.util.HealthUtil$requestCursePredictionAlgo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.util.HealthUtil", f = "HealthUtil.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {581, 617}, m = "requestCursePredictionAlgo", n = {"action", "startDateSec", "cursePeriod", "menstrualPeriod", "requestType", "action", "fileDateTriple", "menstrualSetting", "menstrualPredictDate", "trendTargetTimes", "fdTimes", "startDateSec", "requestType", OneTrack.Param.TZ}, s = {"L$0", "J$0", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "I$0", "I$1"})
    public static final class C33181 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C33181(Continuation<? super C33181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthUtil.this.requestCursePredictionAlgo(0L, 0, 0, 0, null, this);
        }
    }

    static {
        ajc$preClinit();
        INSTANCE = new HealthUtil();
    }

    private HealthUtil() {
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("HealthUtil.kt", HealthUtil.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g(b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD, "goDataPageCheckUserInfo", "com.xiaomi.fitness.util.HealthUtil", "android.content.Context:int:android.os.Bundle:android.app.ActivityOptions:java.lang.String", "context:sportType:bundle:activityOptions:origin", "", "void"), 0);
    }

    @JvmStatic
    public static final int computePercentage(int value, int sumValue) {
        return Math.max(0, Math.round((value * 100) / (sumValue * 1.0f)));
    }

    private final int createModelSecondSortId(int sportType) {
        if (sportType == 1) {
            return 3;
        }
        if (sportType != 6) {
            return sportType != 19 ? 0 : 2;
        }
        return 1;
    }

    public static final int getAge() {
        return UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getAge();
    }

    @JvmStatic
    public static /* synthetic */ void getAge$annotations() {
    }

    private final int getDataModelSpanSize(int sportType) {
        boolean zIsTabletAndLandscape = UIUtils.INSTANCE.isTabletAndLandscape(ApplicationExtKt.getApplication());
        if (sportType != 1) {
            if (sportType != 19) {
                return 1;
            }
            if (!zIsTabletAndLandscape) {
                return 2;
            }
        } else {
            if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand()) {
                return 3;
            }
            if (!zIsTabletAndLandscape) {
                return 2;
            }
        }
        return 4;
    }

    public static final float getHeight() {
        return UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getHeight();
    }

    @JvmStatic
    public static /* synthetic */ void getHeight$annotations() {
    }

    private final String getHost() {
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{""}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{lowerCase + "."}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @JvmStatic
    public static final int getSleepType(int sleepState) {
        if (sleepState == 2) {
            return 3;
        }
        if (sleepState == 3) {
            return 2;
        }
        if (sleepState == 4) {
            return 1;
        }
        if (sleepState != 5) {
            return sleepState != 6 ? -1 : 4;
        }
        return 0;
    }

    @JvmStatic
    public static final int getSportTypeImageHomePage(int sportType) {
        return l2c.a(sportType);
    }

    @JvmStatic
    public static final float getTheMaxNumber(@Nullable List<? extends RecyclerBarEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            return 0.0f;
        }
        float y = entries.get(0).getY();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            y = Math.max(y, entries.get(i).getY());
        }
        return y;
    }

    @JvmStatic
    public static final float getTheMaxValuesNumber(@Nullable List<BloodGlucoseEntry> entries) {
        if (entries == null || entries.isEmpty()) {
            return 0.0f;
        }
        float y = entries.get(0).getY();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            BloodGlucoseEntry bloodGlucoseEntry = entries.get(i);
            int size2 = bloodGlucoseEntry.getValues().size();
            for (int i2 = 0; i2 < size2; i2++) {
                y = Math.max(y, bloodGlucoseEntry.getValues().get(i2).getValue());
            }
        }
        return y;
    }

    @JvmStatic
    @NotNull
    public static final String getWeekDateStr(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        LocalDate localDatePlusDays = localDate.plusDays(6);
        Intrinsics.checkNotNull(localDatePlusDays);
        return TimeDateUtil.getDateRangeFormat(localDate, localDatePlusDays);
    }

    public static final /* synthetic */ void goDataPageCheckUserInfo_aroundBody0(HealthUtil healthUtil, Context context, int i, Bundle bundle, ActivityOptions activityOptions, String origin, nrd nrdVar) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(origin, "origin");
        bundle.putString("origin", origin);
        if (i == 2) {
            healthUtil.gotoPage(context, CalorieFragment.class, bundle, activityOptions);
            return;
        }
        if (i == 3) {
            healthUtil.gotoPage(context, StepFragment.class, bundle, activityOptions);
        } else if (i == 4) {
            healthUtil.gotoPage(context, HrmFragment.class, bundle, activityOptions);
        } else {
            if (i != 15) {
                return;
            }
            healthUtil.gotoPage(context, MHStrengthFragment.class, bundle, activityOptions);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gotoCurseDetail(Context context, ActivityOptions activityOptions) {
        if (CurseExtKt.curseReady()) {
            dih.a().c(context, CurseExtKt.isSettingMiss(CurseManager.INSTANCE.getInstance().getSetting()) ? CurseResetActivity.class : CurseMainActivity.class, null, activityOptions);
        } else if (context != null) {
            ToastExtKt.toast$default(context, c0j.common_hint_network_unavailable, 0, 0, 0L, 14, null);
        }
    }

    public static final boolean isFemale() {
        return Intrinsics.areEqual("female", UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex());
    }

    @JvmStatic
    public static /* synthetic */ void isFemale$annotations() {
    }

    private final void triggerPullSleepAnimal() {
        IRepository<? extends DailyBasicReport> repositoryByType = FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepositoryByType(HomeDataType.SLEEP);
        Intrinsics.checkNotNull(repositoryByType, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.api.repository.ISleepRepository");
        ((ISleepRepository) repositoryByType).pullSleepAnimalAsync();
    }

    @NotNull
    public final GridLayoutManager buildCommonDataAdapterLayoutManager(@NotNull Context context, @NotNull final IDataAdapter adapter) {
        final int i;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        UIUtils uIUtils = UIUtils.INSTANCE;
        if (uIUtils.isTabletAndLandscape(context)) {
            i = 4;
        } else {
            i = (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() || uIUtils.isTabletAndPortrait(context)) ? 3 : 2;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.util.HealthUtil.buildCommonDataAdapterLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                if (adapter.isHeaderView(position) || adapter.isFooterView(position)) {
                    return i;
                }
                return 1;
            }
        });
        return gridLayoutManager;
    }

    public final int checkLoginAccountStatusInfo() {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            return !UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).isCompleted() ? 2 : 0;
        }
        return 1;
    }

    @NotNull
    public final km5 createDefaultDataModel(long time, int sportType, int sortId) {
        km5 km5Var = new km5();
        km5Var.f23979b = sportType;
        km5Var.f23978a = time;
        km5Var.g = getDataModelSpanSize(sportType);
        km5Var.f = createModelSecondSortId(sportType);
        km5Var.e = sortId;
        return km5Var;
    }

    @NotNull
    public final String getTargetDataUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/vitality_interpretation/index.html?locale=%s", Arrays.copyOf(new Object[]{getHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final float getTheMaxTarget(@Nullable List<? extends RecyclerBarEntry> entries) {
        List<? extends RecyclerBarEntry> list = entries;
        if (list == null || list.isEmpty()) {
            return 0.0f;
        }
        int goalValue = entries.get(0).getGoalValue();
        int size = entries.size();
        for (int i = 0; i < size; i++) {
            goalValue = RangesKt___RangesKt.coerceAtLeast(goalValue, entries.get(i).getGoalValue());
        }
        return goalValue;
    }

    @NotNull
    public final String getUnderstandBloodSugarUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/about-blood-sugar/index.html?locale=%s", Arrays.copyOf(new Object[]{getHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getUnderstandHrmUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/understand_heart_rate/index.html?locale=%s", Arrays.copyOf(new Object[]{getHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getUnderstandPhysicalStatusUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/n62/index.html?type=about_tsb&locale=%s", Arrays.copyOf(new Object[]{getHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getUnderstandSleepAnimalUrl(@SleepAnimalType int type) {
        String str;
        if (type == 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s/html/sleep-animal/index.html?locale=%s", Arrays.copyOf(new Object[]{getHost(), LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        if (type == 1) {
            str = "penguin";
        } else if (type == 2) {
            str = "bear";
        } else if (type == 3) {
            str = "sheep";
        } else if (type != 4) {
            str = type != 5 ? RomUtils.BLACK_SHARK : "koala";
        } else {
            str = "owl";
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str3 = String.format("%s/html/sleep-animal/index.html?type=%s&locale=%s", Arrays.copyOf(new Object[]{getHost(), str, LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 3));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }

    @NotNull
    public final String getUnderstandSleepEfficiencyUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/general/index.html?locale=%s#/sleep-efficiency", Arrays.copyOf(new Object[]{getHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getUnderstandSleepRhythm() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/about-sleep-rhythm/index.html?locale=%s", Arrays.copyOf(new Object[]{getHost(), LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getUnderstandSleepUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/sleep/index.html?miui=%s&locale=%s", Arrays.copyOf(new Object[]{getHost(), Boolean.valueOf(RomUtils.INSTANCE.isMiui()), locale}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getUnderstandSleepUrlWithDevice() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/sleep/index.html?device=true&locale=%s", Arrays.copyOf(new Object[]{getHost(), LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getUnderstandSleepUrlWithStruct() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/sleep/index.html?struct=true&locale=%s", Arrays.copyOf(new Object[]{getHost(), LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final void goDataPage(@Nullable final FragmentActivity activity, @Nullable final Context context, int sportType, @NotNull Bundle bundle, @Nullable final ActivityOptions activityOptions, @NotNull String origin) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(origin, "origin");
        bundle.putString("origin", origin);
        if (sportType == 12) {
            gotoPage(context, VO2MaxFragment.class, bundle, activityOptions);
        }
        if (sportType == 13) {
            gotoPage(context, Spo2Fragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 16) {
            gotoPage(context, BloodPressureFragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 17) {
            gotoPage(context, HearingFragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 402) {
            gotoPage(context, EcgFragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 403) {
            gotoPage(context, BloodGlucoseFragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 10000) {
            gotoPage(context, WeightFragment.class, bundle, activityOptions);
            return;
        }
        if (sportType == 30000) {
            gotoPage(context, TodayHealthFragment.class, bundle, activityOptions);
            return;
        }
        switch (sportType) {
            case 5:
                gotoPage(context, StandFragment.class, bundle, activityOptions);
                break;
            case 6:
                gotoPage(context, SleepFragment.class, bundle, activityOptions);
                triggerPullSleepAnimal();
                break;
            case 7:
                gotoPage(context, StressFragment.class, bundle, activityOptions);
                break;
            case 8:
                gotoPage(context, EnergyFragment.class, bundle, activityOptions);
                break;
            case 9:
                if (activity != null) {
                    PrivacyHelperPointKt.getInstance(PrivacyHelper.INSTANCE).showPrivacySensitiveDialogIfNeed(activity, new IPrivacySensitiveImpl() { // from class: com.xiaomi.fitness.util.HealthUtil.goDataPage.1
                        @Override // com.xiaomi.fitness.privacy.export.IPrivacySensitiveImpl, com.xiaomi.fitness.privacy.export.IPrivacySensitive
                        public void onPrivacyAccepted() {
                            if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                                HealthUtil.INSTANCE.gotoCurseDetail(context, activityOptions);
                            } else {
                                CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(activity);
                            }
                        }
                    });
                    break;
                }
                break;
            case 10:
                gotoPage(context, PaiFragment.class, bundle, activityOptions);
                break;
            default:
                switch (sportType) {
                    case 20:
                        gotoPage(context, TrainingLoadFragment.class, bundle, activityOptions);
                        break;
                    case 21:
                        gotoPage(context, TemperatureFragment.class, bundle, activityOptions);
                        break;
                    case 22:
                        gotoPage(context, RunningIndicatorFragment.class, bundle, activityOptions);
                        break;
                    case 23:
                        gotoPage(context, VitalityFragment.class, bundle, activityOptions);
                        break;
                    case 24:
                        gotoPage(context, PhysicalStatusFragment.class, bundle, activityOptions);
                        break;
                }
                break;
        }
    }

    @NeedLogin(needCompleteUserInfo = true, needLogin = false)
    public final void goDataPageCheckUserInfo(@Nullable Context context, int sportType, @NotNull Bundle bundle, @Nullable ActivityOptions activityOptions, @NotNull String origin) throws Throwable {
        nrd nrdVarE = s69.e(ajc$tjp_0, this, this, new Object[]{context, xj4.c(sportType), bundle, activityOptions, origin});
        NeedLoginAspect needLoginAspectAspectOf = NeedLoginAspect.aspectOf();
        fai faiVarC = new m2c(new Object[]{this, context, xj4.c(sportType), bundle, activityOptions, origin, nrdVarE}).c(69648);
        Annotation annotation = ajc$anno$0;
        if (annotation == null) {
            annotation = HealthUtil.class.getDeclaredMethod("goDataPageCheckUserInfo", Context.class, Integer.TYPE, Bundle.class, ActivityOptions.class, String.class).getAnnotation(NeedLogin.class);
            ajc$anno$0 = annotation;
        }
        needLoginAspectAspectOf.aroundNeedLogin(faiVarC, (NeedLogin) annotation);
    }

    public final void gotoPage(@Nullable Context context, @NotNull Class<?> targetClazz, @Nullable Bundle bundle, @Nullable ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().g(context, fragmentParamsB, true, activityOptions);
    }

    @NotNull
    public final Intent gotoPageIntent(@Nullable Context context, @NotNull Class<?> targetClazz, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(targetClazz, "targetClazz");
        FragmentParams fragmentParamsB = new FragmentParams.b().e(targetClazz).c(bundle).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        Intent intentB = dih.a().b(context, fragmentParamsB, true);
        Intrinsics.checkNotNullExpressionValue(intentB, "getGoCommonActivityIntent(...)");
        return intentB;
    }

    public final void listenOnLogInAndProceed(@NotNull final WeakReference<Function0<Unit>> callbackWeakReference) {
        Intrinsics.checkNotNullParameter(callbackWeakReference, "callbackWeakReference");
        final AccountManager accountManagerExtKt = AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
        boolean zIsLogin = accountManagerExtKt.isLogin();
        Logger.d("listenOnLogInAndProceed isLogIn=" + zIsLogin, new Object[0]);
        if (!zIsLogin) {
            accountManagerExtKt.addAccountListener(new Function1<Boolean, Unit>() { // from class: com.xiaomi.fitness.util.HealthUtil.listenOnLogInAndProceed.1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public void invoke(boolean loggedIn) {
                    if (loggedIn) {
                        Function0<Unit> function0 = callbackWeakReference.get();
                        if (function0 != null) {
                            function0.invoke();
                        }
                        accountManagerExtKt.removeAccountListener(this);
                    }
                }
            });
            return;
        }
        Function0<Unit> function0 = callbackWeakReference.get();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean needCheckLogin(int sportType) {
        return sportType == 1;
    }

    public final boolean needCheckUserInfo(int sportType) {
        return sportType == 3 || sportType == 2 || sportType == 15 || sportType == 4 || sportType == 1;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0232  */
    /* JADX WARN: Code duplicated, block: B:39:0x023d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0269  */
    /* JADX WARN: Code duplicated, block: B:42:0x026f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0296  */
    /* JADX WARN: Code duplicated, block: B:52:0x02a5 A[LOOP:0: B:47:0x0290->B:52:0x02a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x02a9 A[EDGE_INSN: B:61:0x02a9->B:54:0x02a9 BREAK  A[LOOP:0: B:47:0x0290->B:52:0x02a5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x023d, please report this as an issue */
    @Nullable
    public final Object requestCursePredictionAlgo(long j, int i, int i2, int i3, @NotNull Function1<? super MenstrualCycleInfo, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        C33181 c33181;
        Function1<? super MenstrualCycleInfo, Unit> function2;
        MenstrualPredictDateRequest menstrualPredictDateRequest;
        long j2;
        final int i4;
        int i5;
        Triple triple;
        final Function1<? super MenstrualCycleInfo, Unit> function3;
        List<Long> list;
        List list2;
        MenstrualSettingRequest menstrualSettingRequest;
        final List listSortedWith;
        long time;
        Iterator it;
        int i6;
        long j3 = j;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        if (continuation instanceof C33181) {
            c33181 = (C33181) continuation;
            int i10 = c33181.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c33181.label = i10 - Integer.MIN_VALUE;
            } else {
                c33181 = new C33181(continuation);
            }
        } else {
            c33181 = new C33181(continuation);
        }
        Object tempFileData = c33181.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = c33181.label;
        if (i11 != 0) {
            if (i11 == 1) {
                int i12 = c33181.I$2;
                int i13 = c33181.I$1;
                i7 = c33181.I$0;
                long j4 = c33181.J$0;
                function2 = (Function1) c33181.L$0;
                ResultKt.throwOnFailure(tempFileData);
                i9 = i12;
                i8 = i13;
                j3 = j4;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = c33181.I$1;
                int i14 = c33181.I$0;
                long j5 = c33181.J$0;
                list2 = (List) c33181.L$5;
                List<Long> list3 = (List) c33181.L$4;
                MenstrualPredictDateRequest menstrualPredictDateRequest2 = (MenstrualPredictDateRequest) c33181.L$3;
                menstrualSettingRequest = (MenstrualSettingRequest) c33181.L$2;
                triple = (Triple) c33181.L$1;
                function3 = (Function1) c33181.L$0;
                ResultKt.throwOnFailure(tempFileData);
                i5 = i14;
                j2 = j5;
                list = list3;
                menstrualPredictDateRequest = menstrualPredictDateRequest2;
            }
            listSortedWith = CollectionsKt___CollectionsKt.sortedWith((Iterable) tempFileData, new Comparator() { // from class: com.xiaomi.fitness.util.HealthUtil$requestCursePredictionAlgo$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureTrendItem) t).getTime()), Long.valueOf(((TemperatureTrendItem) t2).getTime()));
                }
            });
            Logger.d("HealthUtil", "ttData:" + listSortedWith);
            if (listSortedWith.isEmpty()) {
                Boxing.boxBoolean(list.addAll(list2));
            } else {
                time = ((TemperatureTrendItem) CollectionsKt___CollectionsKt.last(listSortedWith)).getTime();
                Logger.d("HealthUtil", "ttData lastTrendTime:" + time);
                if (((Number) CollectionsKt___CollectionsKt.first(list2)).longValue() > time) {
                    list.addAll(list2);
                } else if (((Number) CollectionsKt___CollectionsKt.first(list2)).longValue() <= time && ((Number) CollectionsKt___CollectionsKt.last(list2)).longValue() > time) {
                    it = list2.iterator();
                    i6 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i6 = -1;
                            break;
                        }
                        if (((Number) it.next()).longValue() > time) {
                            break;
                        }
                        i6++;
                    }
                    list.addAll(list2.subList(i6, list2.size()));
                }
            }
            Logger.d("HealthUtil", "menstrualSetting:" + menstrualSettingRequest + ",menstrualPredictDate:" + menstrualPredictDateRequest + ",trendTargetTimes:" + list);
            MenstrualAlgo companion = MenstrualAlgo.INSTANCE.getInstance();
            Object first = triple.getFirst();
            Intrinsics.checkNotNull(first);
            companion.parseMenstrual(j2, menstrualSettingRequest, menstrualPredictDateRequest, (List) first, list, new MenstrualAlgoNative.JniDataCallback() { // from class: com.xiaomi.fitness.util.HealthUtil.requestCursePredictionAlgo.3
                @Override // com.mi.fitness.menstrual.MenstrualAlgoNative.JniDataCallback
                public void onError(int errorCode, String errorMsg) {
                    Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                }

                @Override // com.mi.fitness.menstrual.MenstrualAlgoNative.JniDataCallback
                public void onMenstrualParseResult(MenstrualCycleInfo info) {
                    Intrinsics.checkNotNullParameter(info, "info");
                    Logger.i("HealthUtil", "onMenstrualParseResult menstrual info:" + info);
                    MenstrualCycleElement menstrualCycleElement = info.currentCycle;
                    AlgoCurseItem algoCurseItem = new AlgoCurseItem(0, (int) menstrualCycleElement.startDate, (int) menstrualCycleElement.endDate, (int) menstrualCycleElement.ovulationDate, info.mcycle, info.tcycle, info.status);
                    MenstrualCycleElement menstrualCycleElement2 = info.nextCycle;
                    AlgoCurseItem algoCurseItem2 = new AlgoCurseItem(1, (int) menstrualCycleElement2.startDate, (int) menstrualCycleElement2.endDate, (int) menstrualCycleElement2.ovulationDate, info.mcycle, info.tcycle, info.status);
                    MenstrualCycleElement menstrualCycleElement3 = info.secondCycle;
                    ScopeExtKt.scope(Dispatchers.getIO(), new HealthUtil$requestCursePredictionAlgo$3$onMenstrualParseResult$1(algoCurseItem, algoCurseItem2, new AlgoCurseItem(2, (int) menstrualCycleElement3.startDate, (int) menstrualCycleElement3.endDate, (int) menstrualCycleElement3.ovulationDate, info.mcycle, info.tcycle, info.status), function3, info, null));
                }

                @Override // com.mi.fitness.menstrual.MenstrualAlgoNative.JniDataCallback
                public void onTempParseResult(TemperatureBasicInfo info) {
                    Object next;
                    long j6;
                    Intrinsics.checkNotNullParameter(info, "info");
                    Logger.i("HealthUtil", "onTempParseResult TemperatureBasicInfo:" + info);
                    Iterator<T> it2 = listSortedWith.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            j6 = 1000;
                        }
                    } while (!TimeUtils.INSTANCE.isSameDay(((TemperatureTrendItem) next).getTime() * j6, info.currentDate * j6));
                    if (next != null) {
                        return;
                    }
                    int i15 = info.status;
                    if (i15 == 0 || i15 == 1 || i15 == 2) {
                        TemperatureTrendItem temperatureTrendItem = new TemperatureTrendItem();
                        temperatureTrendItem.setTime(info.currentDate);
                        temperatureTrendItem.setBaseTemp(info.baseTemp);
                        temperatureTrendItem.setBaseLine(info.baseline);
                        temperatureTrendItem.setDiffTemp(info.diffTemp);
                        temperatureTrendItem.setStatus(info.status);
                        Logger.i("HealthUtil", "recordTemperatureTrendItem result:" + FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).recordTemperatureTrendItem("xiaomiwear_app", i4, temperatureTrendItem) + ", tempTrendItem:" + temperatureTrendItem);
                    }
                }
            }, i5, i4);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(tempFileData);
        Logger.i("HealthUtil", "requestCursePredictionAlgo startDate:" + j3 + ",cursePeriod:" + i7 + ", menstrualPeriod:" + i8 + " ,requestType:" + i9);
        FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
        function2 = function1;
        c33181.L$0 = function2;
        c33181.J$0 = j3;
        c33181.I$0 = i7;
        c33181.I$1 = i8;
        c33181.I$2 = i9;
        c33181.label = 1;
        tempFileData = fitnessDataExtKt.getTempFileData(j3, c33181);
        if (tempFileData == coroutine_suspended) {
            return coroutine_suspended;
        }
        Triple triple2 = (Triple) tempFileData;
        Logger.d("HealthUtil", "file date Times:" + triple2.getSecond());
        if (triple2.getFirst() != null) {
            Object first2 = triple2.getFirst();
            Intrinsics.checkNotNull(first2);
            if (!((List) first2).isEmpty()) {
                CurseManager.INSTANCE.getInstance().setHasTempCharacterRecordHistory(true);
                long j6 = 1000;
                long j7 = j3 * j6;
                List<Record> period = FitnessDataExtKt.getCurseApi().getPeriod(j7 - 5184000000L, j7);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (period != null) {
                    for (Record record : period) {
                        arrayList.add(Boxing.boxInt((int) (record.getStartMills() / j6)));
                        arrayList2.add(Boxing.boxInt((int) (record.getEndMills() / j6)));
                        coroutine_suspended = coroutine_suspended;
                    }
                }
                Object obj = coroutine_suspended;
                MenstrualSettingRequest menstrualSettingRequest2 = new MenstrualSettingRequest();
                menstrualSettingRequest2.userMenstrualCycle = i7;
                menstrualSettingRequest2.userMenstrualDuration = i8;
                menstrualSettingRequest2.histMenstrualStartTimeSeconds = arrayList;
                menstrualSettingRequest2.histMenstrualEndTimeSeconds = arrayList2;
                CurseManager.Companion companion2 = CurseManager.INSTANCE;
                Triple<Long, Long, Long> nextInDuration = companion2.getInstance().getNextInDuration(j7);
                menstrualPredictDateRequest = new MenstrualPredictDateRequest();
                menstrualPredictDateRequest.currentDate = (int) j3;
                menstrualPredictDateRequest.nextCycleStart = (int) (nextInDuration.getFirst().longValue() / j6);
                menstrualPredictDateRequest.nextCycleEnd = (int) (nextInDuration.getSecond().longValue() / j6);
                menstrualPredictDateRequest.nextOvulationDay = (int) (nextInDuration.getThird().longValue() / j6);
                int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
                ArrayList arrayList3 = new ArrayList();
                Object second = triple2.getSecond();
                Intrinsics.checkNotNull(second);
                List list4 = (List) second;
                if (!list4.isEmpty()) {
                    CurseManager companion3 = companion2.getInstance();
                    long jLongValue = ((Number) CollectionsKt___CollectionsKt.first(list4)).longValue();
                    c33181.L$0 = function2;
                    c33181.L$1 = triple2;
                    c33181.L$2 = menstrualSettingRequest2;
                    c33181.L$3 = menstrualPredictDateRequest;
                    c33181.L$4 = arrayList3;
                    c33181.L$5 = list4;
                    c33181.J$0 = j3;
                    c33181.I$0 = i9;
                    c33181.I$1 = currentTZOffsetInSec;
                    c33181.label = 2;
                    Object tempTrendData = companion3.getTempTrendData(jLongValue, j3, currentTZOffsetInSec, c33181);
                    if (tempTrendData == obj) {
                        return obj;
                    }
                    j2 = j3;
                    i4 = currentTZOffsetInSec;
                    i5 = i9;
                    triple = triple2;
                    function3 = function2;
                    list = arrayList3;
                    list2 = list4;
                    tempFileData = tempTrendData;
                    menstrualSettingRequest = menstrualSettingRequest2;
                    listSortedWith = CollectionsKt___CollectionsKt.sortedWith((Iterable) tempFileData, new Comparator() { // from class: com.xiaomi.fitness.util.HealthUtil$requestCursePredictionAlgo$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureTrendItem) t).getTime()), Long.valueOf(((TemperatureTrendItem) t2).getTime()));
                        }
                    });
                    Logger.d("HealthUtil", "ttData:" + listSortedWith);
                    if (listSortedWith.isEmpty()) {
                        Boxing.boxBoolean(list.addAll(list2));
                    } else {
                        time = ((TemperatureTrendItem) CollectionsKt___CollectionsKt.last(listSortedWith)).getTime();
                        Logger.d("HealthUtil", "ttData lastTrendTime:" + time);
                        if (((Number) CollectionsKt___CollectionsKt.first(list2)).longValue() > time) {
                            list.addAll(list2);
                        } else if (((Number) CollectionsKt___CollectionsKt.first(list2)).longValue() <= time) {
                            it = list2.iterator();
                            i6 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    i6 = -1;
                                    break;
                                }
                                if (((Number) it.next()).longValue() > time) {
                                    break;
                                    break;
                                }
                                i6++;
                            }
                            list.addAll(list2.subList(i6, list2.size()));
                        }
                    }
                    Logger.d("HealthUtil", "menstrualSetting:" + menstrualSettingRequest + ",menstrualPredictDate:" + menstrualPredictDateRequest + ",trendTargetTimes:" + list);
                    MenstrualAlgo companion4 = MenstrualAlgo.INSTANCE.getInstance();
                    Object first3 = triple.getFirst();
                    Intrinsics.checkNotNull(first3);
                    companion4.parseMenstrual(j2, menstrualSettingRequest, menstrualPredictDateRequest, (List) first3, list, new MenstrualAlgoNative.JniDataCallback() { // from class: com.xiaomi.fitness.util.HealthUtil.requestCursePredictionAlgo.3
                        @Override // com.mi.fitness.menstrual.MenstrualAlgoNative.JniDataCallback
                        public void onError(int errorCode, String errorMsg) {
                            Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                        }

                        @Override // com.mi.fitness.menstrual.MenstrualAlgoNative.JniDataCallback
                        public void onMenstrualParseResult(MenstrualCycleInfo info) {
                            Intrinsics.checkNotNullParameter(info, "info");
                            Logger.i("HealthUtil", "onMenstrualParseResult menstrual info:" + info);
                            MenstrualCycleElement menstrualCycleElement = info.currentCycle;
                            AlgoCurseItem algoCurseItem = new AlgoCurseItem(0, (int) menstrualCycleElement.startDate, (int) menstrualCycleElement.endDate, (int) menstrualCycleElement.ovulationDate, info.mcycle, info.tcycle, info.status);
                            MenstrualCycleElement menstrualCycleElement2 = info.nextCycle;
                            AlgoCurseItem algoCurseItem2 = new AlgoCurseItem(1, (int) menstrualCycleElement2.startDate, (int) menstrualCycleElement2.endDate, (int) menstrualCycleElement2.ovulationDate, info.mcycle, info.tcycle, info.status);
                            MenstrualCycleElement menstrualCycleElement3 = info.secondCycle;
                            ScopeExtKt.scope(Dispatchers.getIO(), new HealthUtil$requestCursePredictionAlgo$3$onMenstrualParseResult$1(algoCurseItem, algoCurseItem2, new AlgoCurseItem(2, (int) menstrualCycleElement3.startDate, (int) menstrualCycleElement3.endDate, (int) menstrualCycleElement3.ovulationDate, info.mcycle, info.tcycle, info.status), function3, info, null));
                        }

                        @Override // com.mi.fitness.menstrual.MenstrualAlgoNative.JniDataCallback
                        public void onTempParseResult(TemperatureBasicInfo info) {
                            Object next;
                            long j8;
                            Intrinsics.checkNotNullParameter(info, "info");
                            Logger.i("HealthUtil", "onTempParseResult TemperatureBasicInfo:" + info);
                            Iterator<T> it2 = listSortedWith.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                } else {
                                    next = it2.next();
                                    j8 = 1000;
                                }
                            } while (!TimeUtils.INSTANCE.isSameDay(((TemperatureTrendItem) next).getTime() * j8, info.currentDate * j8));
                            if (next != null) {
                                return;
                            }
                            int i15 = info.status;
                            if (i15 == 0 || i15 == 1 || i15 == 2) {
                                TemperatureTrendItem temperatureTrendItem = new TemperatureTrendItem();
                                temperatureTrendItem.setTime(info.currentDate);
                                temperatureTrendItem.setBaseTemp(info.baseTemp);
                                temperatureTrendItem.setBaseLine(info.baseline);
                                temperatureTrendItem.setDiffTemp(info.diffTemp);
                                temperatureTrendItem.setStatus(info.status);
                                Logger.i("HealthUtil", "recordTemperatureTrendItem result:" + FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).recordTemperatureTrendItem("xiaomiwear_app", i4, temperatureTrendItem) + ", tempTrendItem:" + temperatureTrendItem);
                            }
                        }
                    }, i5, i4);
                }
                return Unit.INSTANCE;
            }
        }
        function2.invoke2(null);
        FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).cleanAlgoCurseData();
        return Unit.INSTANCE;
    }
}
