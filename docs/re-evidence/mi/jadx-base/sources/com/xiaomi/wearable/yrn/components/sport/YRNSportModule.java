package com.xiaomi.wearable.yrn.components.sport;

import android.app.Activity;
import android.app.ActivityOptions;
import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.mi.health.course.export.CourseApiKt;
import com.mibi.sdk.DeductConstants;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.DataExtKt;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.api.repository.ICalorieRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.IWeightRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyWeightReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.GsonExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.threetarget.model.TrainingIndexDataItem;
import com.xiaomi.fitness.map.export.MapDynamicUtils;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.sport_export.ISportAccessApi;
import com.xiaomi.fitness.sport_export.SportAccessExportExtKt;
import com.xiaomi.fitness.sport_export.SportAidongGameApiKt;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanCourseContent;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanVideoCourse;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.model.SportKey;
import com.xiaomi.fitness.training_plan_export.utils.TrainingEventUtils;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.wearable.yrn.components.YRNComponentsExtKt;
import com.xiaomi.wearable.yrn.components.sport.YRNSportModule;
import defpackage.lp5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 w2\u00020\u0001:\u0001wB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J(\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0007J \u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012H\u0007J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0007J\"\u0010&\u001a\u00020'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)H\u0082@¢\u0006\u0002\u0010,J,\u0010-\u001a\u0004\u0018\u00010.2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010/\u001a\u00020*H\u0082@¢\u0006\u0002\u00100J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020.H\u0002J\u0010\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u001aH\u0002J\"\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u00108\u001a\u00020\u001aH\u0007J\f\u00109\u001a\u00020\u001a*\u00020*H\u0002J\f\u0010:\u001a\u00020**\u00020\u001aH\u0002J0\u0010;\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0016H\u0007J \u0010@\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u0012H\u0007J \u0010C\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u0012H\u0007J\u0010\u0010F\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u0012H\u0007J\"\u0010H\u001a\u00020\u00142\u0006\u0010I\u001a\u00020\u00162\u0006\u0010J\u001a\u00020\u00162\b\u0010K\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010L\u001a\u00020\u00142\b\u0010K\u001a\u0004\u0018\u00010\u0012H\u0002J0\u0010M\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0007J(\u0010P\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020\u00122\u0006\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0007J(\u0010R\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0007J(\u0010V\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010W\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010X\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\u0012H\u0007J\u0010\u0010Z\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0007J\u0012\u0010[\u001a\u0002022\b\u0010\\\u001a\u0004\u0018\u00010]H\u0002J\u0012\u0010^\u001a\u0002022\b\u0010\\\u001a\u0004\u0018\u00010_H\u0002J\u0010\u0010`\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012H\u0007J\b\u0010c\u001a\u00020\u0014H\u0007J\b\u0010d\u001a\u00020\u0014H\u0007J\b\u0010f\u001a\u00020\u0014H\u0007J\b\u0010g\u001a\u00020\u0014H\u0007J\b\u0010j\u001a\u00020\u0014H\u0007J\b\u0010k\u001a\u00020\u0014H\u0007J\b\u0010m\u001a\u00020\u0014H\u0007J\b\u0010n\u001a\u00020\u0014H\u0007J\u0010\u0010o\u001a\u00020\u00142\u0006\u0010p\u001a\u00020\u0012H\u0007J\u0010\u0010q\u001a\u00020r2\u0006\u0010p\u001a\u00020sH\u0002J\u0012\u0010t\u001a\u00020\u00142\b\u0010u\u001a\u0004\u0018\u00010vH\u0007R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR \u0010a\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010e\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00140iX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00140iX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006x"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/sport/YRNSportModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "serverSyncer", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer$delegate", "Lkotlin/Lazy;", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dataGetter$delegate", "getName", "", "doAllNecessaryCheckAndGoToAidongSdkIfNeed", "", "supportJustDance", "", "did", "gotoSportPage", DailyRecordKey.sportType, "", "updateTodayAbilityPlan", "planInfo", "trainingType", "id", "dateStr", "gotoTraining", "planIdStr", "info", "getTrainingIndicators", "callback", "Lcom/facebook/react/bridge/Callback;", "getTrainingIndexModelList", "Lcom/facebook/react/bridge/WritableArray;", "map", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrainingIndexByHomeDataType", "Lcom/xiaomi/fitness/health/threetarget/model/TrainingIndexDataItem;", "targetKey", "(Ljava/util/Map;Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertReportToMap", "Lcom/facebook/react/bridge/WritableMap;", "model", "getColorHex", "colorInt", "goToTrainingIndexDataPage", "timestamp", "homeDataTypeNumber", "dataTypeToInt", "intToDataType", "terminateTrainingPlan", "planType", "curProgress", "success", "withReport", "gotoSportReport", "planId", "jsonStr", "launchAbilityRunningCourseDetailPage", "courseId", DialWidgetType.DATE, "launchVideoCourseInfoActivity", "videoCourseStr", "showHabitCreatePlanActionSheet", "isPure", "hasHabitHistory", "habitDayPlanStr", "showHabitPlanSportDialog", "getPlanDetailProgress", "startSecStr", "endSecStr", "getSportRecord", "category", "getCaloriesValue", StatConstants.PARAM_START, StatConstants.PARAM_END, CloudContract.COL_VIEW_TAG, "getWeightValue", "getLatestSportReport", "goSportDetail", "sportBasicReportStr", "getBodyFatScaleDeviceModels", "convertDeviceModel", "deviceModel", "Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "convertEcoDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "toPluginDevicePage", "sportChangedListener", "Lkotlin/Function2;", "registerSportStatusChangedListener", "removeSportStatusChangedListener", "courseChangedListener", "registerCourseStatusChangedListener", "removeCourseStatusChangedListener", "weightChangedListener", "Lkotlin/Function0;", "registerWeightStatusChangedListener", "removeWeightStatusChangedListener", "sportDataChangedListener", "registerSportDataStatusChangedListener", "removeSportDataStatusChangedListener", "syncWeightToLocal", "weight", "getWeightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "", "saveSupportOpenCityData", "data", "Lcom/facebook/react/bridge/ReadableMap;", "Companion", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYRNSportModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNSportModule.kt\ncom/xiaomi/wearable/yrn/components/sport/YRNSportModule\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,757:1\n53#2,7:758\n53#2,7:767\n53#2,7:774\n53#2,7:781\n53#2,7:794\n1863#3,2:765\n1863#3,2:788\n1863#3:790\n1863#3,2:791\n1864#3:793\n1863#3,2:801\n1863#3,2:803\n1#4:805\n*S KotlinDebug\n*F\n+ 1 YRNSportModule.kt\ncom/xiaomi/wearable/yrn/components/sport/YRNSportModule\n*L\n166#1:758,7\n357#1:767,7\n394#1:774,7\n426#1:781,7\n567#1:794,7\n265#1:765,2\n499#1:788,2\n518#1:790\n531#1:791,2\n518#1:793\n594#1:801,2\n602#1:803,2\n*E\n"})
public final class YRNSportModule extends ReactContextBaseJavaModule {

    @NotNull
    private static final String TAG = "YRNSportModule";

    @NotNull
    private final Function2<String, Integer, Unit> courseChangedListener;

    /* JADX INFO: renamed from: dataGetter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataGetter;

    /* JADX INFO: renamed from: serverSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy serverSyncer;

    @NotNull
    private final Function2<String, Integer, Unit> sportChangedListener;

    @NotNull
    private final Function0<Unit> sportDataChangedListener;

    @NotNull
    private final Function0<Unit> weightChangedListener;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.TRAINING_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.V02_MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.RUNNING_INDICATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.PHYSICAL_STATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.components.sport.YRNSportModule$getLatestSportReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.yrn.components.sport.YRNSportModule$getLatestSportReport$1", f = "YRNSportModule.kt", i = {0}, l = {550}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Callback $callback;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Callback callback, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = callback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WritableMap writableMap;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WritableMap writableMapCreateMap = Arguments.createMap();
                this.L$0 = writableMapCreateMap;
                this.label = 1;
                Object latestSportReport = DataExtKt.getLatestSportReport(this);
                if (latestSportReport == coroutine_suspended) {
                    return coroutine_suspended;
                }
                writableMap = writableMapCreateMap;
                obj = latestSportReport;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                writableMap = (WritableMap) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            SportBasicReport sportBasicReport = (SportBasicReport) obj;
            if (sportBasicReport != null) {
                writableMap.putString("id", String.valueOf(sportBasicReport.getDataId()));
                writableMap.putString("type", String.valueOf(sportBasicReport.getSportType()));
                ISportAccessApi.Companion companion = ISportAccessApi.INSTANCE;
                writableMap.putString("desc", SportAccessExportExtKt.getINSTANCE(companion).getFirstLineStr(sportBasicReport));
                writableMap.putString("tag", SportAccessExportExtKt.getINSTANCE(companion).getSecondLineStr(sportBasicReport));
                writableMap.putString("report", GsonExtKt.toJson(sportBasicReport));
            }
            this.$callback.invoke(writableMap);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.components.sport.YRNSportModule$getPlanDetailProgress$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.yrn.components.sport.YRNSportModule$getPlanDetailProgress$1", f = "YRNSportModule.kt", i = {}, l = {444}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nYRNSportModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNSportModule.kt\ncom/xiaomi/wearable/yrn/components/sport/YRNSportModule$getPlanDetailProgress$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,757:1\n774#2:758\n865#2,2:759\n1863#2,2:761\n*S KotlinDebug\n*F\n+ 1 YRNSportModule.kt\ncom/xiaomi/wearable/yrn/components/sport/YRNSportModule$getPlanDetailProgress$1\n*L\n451#1:758\n451#1:759,2\n451#1:761,2\n*E\n"})
    public static final class C34871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ long $endSec;
        final /* synthetic */ long $planId;
        final /* synthetic */ long $startSec;
        int label;
        final /* synthetic */ YRNSportModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34871(Callback callback, YRNSportModule yRNSportModule, long j, long j2, long j3, Continuation<? super C34871> continuation) {
            super(2, continuation);
            this.$callback = callback;
            this.this$0 = yRNSportModule;
            this.$startSec = j;
            this.$endSec = j2;
            this.$planId = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34871(this.$callback, this.this$0, this.$startSec, this.$endSec, this.$planId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Long trainingPlanId;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                YRNSportModule$getPlanDetailProgress$1$ret$1 yRNSportModule$getPlanDetailProgress$1$ret$1 = new YRNSportModule$getPlanDetailProgress$1$ret$1(this.this$0, this.$startSec, this.$endSec, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, yRNSportModule$getPlanDetailProgress$1$ret$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            Ref.IntRef intRef = new Ref.IntRef();
            Ref.IntRef intRef2 = new Ref.IntRef();
            Ref.IntRef intRef3 = new Ref.IntRef();
            long j = this.$planId;
            ArrayList<SportBasicReport> arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                SportBasicReport sportBasicReport = (SportBasicReport) obj2;
                Long trainingPlanId2 = sportBasicReport.getTrainingPlanId();
                if ((trainingPlanId2 != null ? trainingPlanId2.longValue() : 0L) != 0 && (trainingPlanId = sportBasicReport.getTrainingPlanId()) != null && trainingPlanId.longValue() == j) {
                    arrayList.add(obj2);
                }
            }
            for (SportBasicReport sportBasicReport2 : arrayList) {
                int i2 = intRef.element;
                Integer calories = sportBasicReport2.getCalories();
                int iIntValue = 0;
                intRef.element = i2 + (calories != null ? calories.intValue() : 0);
                intRef2.element += sportBasicReport2.getDuration();
                int i3 = intRef3.element;
                Integer distance = sportBasicReport2.getDistance();
                if (distance != null) {
                    iIntValue = distance.intValue();
                }
                intRef3.element = i3 + iIntValue;
            }
            writableMapCreateMap.putInt("totalHours", intRef2.element);
            writableMapCreateMap.putInt("totalDistance", intRef3.element);
            writableMapCreateMap.putInt("totalCalories", intRef.element);
            this.$callback.invoke(writableMapCreateMap);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.components.sport.YRNSportModule$getSportRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.yrn.components.sport.YRNSportModule$getSportRecord$1", f = "YRNSportModule.kt", i = {}, l = {470}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nYRNSportModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YRNSportModule.kt\ncom/xiaomi/wearable/yrn/components/sport/YRNSportModule$getSportRecord$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,757:1\n1863#2,2:758\n*S KotlinDebug\n*F\n+ 1 YRNSportModule.kt\ncom/xiaomi/wearable/yrn/components/sport/YRNSportModule$getSportRecord$1\n*L\n475#1:758,2\n*E\n"})
    public static final class C34881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Callback $callback;
        final /* synthetic */ String $category;
        final /* synthetic */ long $endSec;
        final /* synthetic */ long $startSec;
        int label;
        final /* synthetic */ YRNSportModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34881(Callback callback, String str, YRNSportModule yRNSportModule, long j, long j2, Continuation<? super C34881> continuation) {
            super(2, continuation);
            this.$callback = callback;
            this.$category = str;
            this.this$0 = yRNSportModule;
            this.$startSec = j;
            this.$endSec = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34881(this.$callback, this.$category, this.this$0, this.$startSec, this.$endSec, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                YRNSportModule$getSportRecord$1$ret$1 yRNSportModule$getSportRecord$1$ret$1 = new YRNSportModule$getSportRecord$1$ret$1(this.$category, this.this$0, this.$startSec, this.$endSec, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, yRNSportModule$getSportRecord$1$ret$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (SportBasicReport sportBasicReport : (List) obj) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                Integer calories = sportBasicReport.getCalories();
                writableMapCreateMap.putInt("calories", calories != null ? calories.intValue() : 0);
                writableMapCreateMap.putInt("duration", sportBasicReport.getDuration());
                Long cloudCourseId = sportBasicReport.getCloudCourseId();
                String string = null;
                writableMapCreateMap.putString("course_id", cloudCourseId != null ? cloudCourseId.toString() : null);
                writableMapCreateMap.putString("time", String.valueOf(sportBasicReport.getTimeStamp()));
                Integer distance = sportBasicReport.getDistance();
                writableMapCreateMap.putInt("distance", distance != null ? distance.intValue() : 0);
                Long trainingPlanId = sportBasicReport.getTrainingPlanId();
                if (trainingPlanId != null) {
                    string = trainingPlanId.toString();
                }
                writableMapCreateMap.putString(DeductConstants.KEY_WX_PLAN_ID, string);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
            this.$callback.invoke(writableArrayCreateArray);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.components.sport.YRNSportModule$getTrainingIndexModelList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.yrn.components.sport.YRNSportModule", f = "YRNSportModule.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3}, l = {222, SportReportBaseParser.ReportType.maxFreq, 228, ErrorCode.ERROR_SP_NOTICE_NOT_READY}, m = "getTrainingIndexModelList", n = {"this", "map", "array", "this", "map", "array", "this", "map", "array", "this", "array"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class C34891 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C34891(Continuation<? super C34891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return YRNSportModule.this.getTrainingIndexModelList(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.components.sport.YRNSportModule$syncWeightToLocal$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.yrn.components.sport.YRNSportModule$syncWeightToLocal$1", f = "YRNSportModule.kt", i = {}, l = {727}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $weight;
        int label;
        final /* synthetic */ YRNSportModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34901(String str, YRNSportModule yRNSportModule, Continuation<? super C34901> continuation) {
            super(2, continuation);
            this.$weight = str;
            this.this$0 = yRNSportModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34901(this.$weight, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Float floatOrNull = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(this.$weight);
                if (floatOrNull != null) {
                    WeightItem weightItem = this.this$0.getWeightItem(floatOrNull.floatValue());
                    weightItem.setSid("xiaomiwear_app_manually");
                    IWeightRepository iWeightRepository = (IWeightRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(IWeightRepository.class);
                    this.label = 1;
                    if (iWeightRepository.addRecord(weightItem, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
            return ((C34901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YRNSportModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.serverSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tyr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YRNSportModule.serverSyncer_delegate$lambda$0();
            }
        });
        this.dataGetter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: uyr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YRNSportModule.dataGetter_delegate$lambda$1();
            }
        });
        this.sportChangedListener = new Function2() { // from class: vyr
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return YRNSportModule.sportChangedListener$lambda$32(this.f37375a, (String) obj, ((Integer) obj2).intValue());
            }
        };
        this.courseChangedListener = new Function2() { // from class: wyr
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return YRNSportModule.courseChangedListener$lambda$33(this.f38485a, (String) obj, ((Integer) obj2).intValue());
            }
        };
        this.weightChangedListener = new Function0() { // from class: xyr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YRNSportModule.weightChangedListener$lambda$34(this.f39596a);
            }
        };
        this.sportDataChangedListener = new Function0() { // from class: yyr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YRNSportModule.sportDataChangedListener$lambda$35(this.f40700a);
            }
        };
    }

    private final WritableMap convertDeviceModel(RNDeviceModel deviceModel) {
        String model;
        String productName;
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (deviceModel == null) {
            Intrinsics.checkNotNull(writableMapCreateMap);
            return writableMapCreateMap;
        }
        writableMapCreateMap.putString("did", deviceModel.getDid());
        Product product = deviceModel.getDeviceInfo().getProduct();
        String str = "";
        if (product == null || (model = product.getModel()) == null) {
            model = "";
        }
        writableMapCreateMap.putString("model", model);
        Product product2 = deviceModel.getDeviceInfo().getProduct();
        if (product2 != null && (productName = product2.getProductName()) != null) {
            str = productName;
        }
        writableMapCreateMap.putString("name", str);
        RNDevice rNDevice = (RNDevice) deviceModel.getDeviceInfo().device;
        writableMapCreateMap.putInt("status", rNDevice != null ? rNDevice.getStatus() : -1);
        Logger.d(TAG, "convertDeviceModel " + writableMapCreateMap);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    private final WritableMap convertEcoDeviceModel(EcoDeviceModel deviceModel) {
        String model;
        String productName;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Logger.d(TAG, "convertDeviceModel " + (deviceModel != null ? Integer.valueOf(deviceModel.getDeviceStatus()) : null));
        if (deviceModel == null) {
            Intrinsics.checkNotNull(writableMapCreateMap);
            return writableMapCreateMap;
        }
        writableMapCreateMap.putString("did", deviceModel.getDid());
        Product product = deviceModel.getDeviceInfo().getProduct();
        String str = "";
        if (product == null || (model = product.getModel()) == null) {
            model = "";
        }
        writableMapCreateMap.putString("model", model);
        Product product2 = deviceModel.getDeviceInfo().getProduct();
        if (product2 != null && (productName = product2.getProductName()) != null) {
            str = productName;
        }
        writableMapCreateMap.putString("name", str);
        EcoDevice ecoDevice = (EcoDevice) deviceModel.getDeviceInfo().device;
        writableMapCreateMap.putInt("status", ecoDevice != null ? ecoDevice.getStatus() : -1);
        Logger.d(TAG, "convertDeviceModel " + writableMapCreateMap);
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    private final WritableMap convertReportToMap(TrainingIndexDataItem model) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("type", dataTypeToInt(model.getHomeDataType()));
        writableMapCreateMap.putString("id", model.getDid());
        writableMapCreateMap.putString("title", model.getTitle());
        String value = model.getValue();
        writableMapCreateMap.putString("value", (value == null || value.length() == 0) ? HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getDataTypeNoDataGuide(model.getHomeDataType()) : model.getValue());
        writableMapCreateMap.putString("status", model.getDes());
        writableMapCreateMap.putString("description", model.getDes());
        writableMapCreateMap.putString(DialWidgetType.DATE, String.valueOf(model.getTimestamp()));
        writableMapCreateMap.putString(Constants.KEY_RECHARGE_MINVALUE, model.getStartLevelName());
        writableMapCreateMap.putString(Constants.KEY_RECHARGE_MAXVALUE, model.getEndLevelName());
        writableMapCreateMap.putInt("activeIndex", model.getArrowPosition());
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (LevelBarView.LevelItem levelItem : model.getLevelItems()) {
            Activity currentActivity = getCurrentActivity();
            writableArrayCreateArray.pushString(getColorHex(currentActivity != null ? currentActivity.getColor(levelItem.f11683a) : 0));
        }
        Unit unit = Unit.INSTANCE;
        writableMapCreateMap.putArray("colors", writableArrayCreateArray);
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit courseChangedListener$lambda$33(YRNSportModule this$0, String status, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(status, "status");
        Logger.d(TAG, "sportChangedListener：" + status + "," + i);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", status);
        writableMapCreateMap.putInt("type", i);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this$0.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(CourseApiKt.getWEAR_COURSE_STATUS_MESSAGE(), writableMapCreateMap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataGetter dataGetter_delegate$lambda$1() {
        return FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
    }

    private final int dataTypeToInt(HomeDataType homeDataType) {
        int i = WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()];
        if (i == 1) {
            return 101;
        }
        if (i == 2) {
            return 102;
        }
        if (i != 3) {
            return i != 4 ? -1 : 103;
        }
        return 100;
    }

    private final String getColorHex(int colorInt) {
        int iAlpha = Color.alpha(colorInt);
        int iRed = Color.red(colorInt);
        int iGreen = Color.green(colorInt);
        int iBlue = Color.blue(colorInt);
        if (iAlpha != 255) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("#%02X%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iAlpha), Integer.valueOf(iRed), Integer.valueOf(iGreen), Integer.valueOf(iBlue)}, 4));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iRed), Integer.valueOf(iGreen), Integer.valueOf(iBlue)}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FitnessDataGetter getDataGetter() {
        return (FitnessDataGetter) this.dataGetter.getValue();
    }

    private final FitnessServerSyncer getServerSyncer() {
        return (FitnessServerSyncer) this.serverSyncer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTrainingIndexByHomeDataType(Map<HomeDataType, ? extends Object> map, HomeDataType homeDataType, Continuation<? super TrainingIndexDataItem> continuation) {
        try {
            if (map.containsKey(homeDataType)) {
                IHealthPage healthPageExtKt = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
                Object obj = map.get(homeDataType);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport");
                return healthPageExtKt.getTrainingIndexDataItem(homeDataType, (DailyBasicReport) obj);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getTrainingIndexModelList(Map<HomeDataType, ? extends Object> map, Continuation<? super WritableArray> continuation) {
        C34891 c34891;
        YRNSportModule yRNSportModule;
        Map<HomeDataType, ? extends Object> map2;
        WritableArray writableArray;
        YRNSportModule yRNSportModule2;
        TrainingIndexDataItem trainingIndexDataItem;
        YRNSportModule yRNSportModule3;
        TrainingIndexDataItem trainingIndexDataItem2;
        YRNSportModule yRNSportModule4;
        TrainingIndexDataItem trainingIndexDataItem3;
        if (continuation instanceof C34891) {
            c34891 = (C34891) continuation;
            int i = c34891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34891.label = i - Integer.MIN_VALUE;
            } else {
                c34891 = new C34891(continuation);
            }
        } else {
            c34891 = new C34891(continuation);
        }
        Object trainingIndexByHomeDataType = c34891.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34891.label;
        if (i2 != 0) {
            if (i2 == 1) {
                writableArray = (WritableArray) c34891.L$2;
                map2 = (Map) c34891.L$1;
                yRNSportModule = (YRNSportModule) c34891.L$0;
                ResultKt.throwOnFailure(trainingIndexByHomeDataType);
            } else if (i2 == 2) {
                writableArray = (WritableArray) c34891.L$2;
                map2 = (Map) c34891.L$1;
                yRNSportModule2 = (YRNSportModule) c34891.L$0;
                ResultKt.throwOnFailure(trainingIndexByHomeDataType);
                trainingIndexDataItem = (TrainingIndexDataItem) trainingIndexByHomeDataType;
                if (trainingIndexDataItem != null) {
                    writableArray.pushMap(yRNSportModule2.convertReportToMap(trainingIndexDataItem));
                }
                HomeDataType homeDataType = HomeDataType.RUNNING_INDICATOR;
                c34891.L$0 = yRNSportModule2;
                c34891.L$1 = map2;
                c34891.L$2 = writableArray;
                c34891.label = 3;
                trainingIndexByHomeDataType = yRNSportModule2.getTrainingIndexByHomeDataType(map2, homeDataType, c34891);
                if (trainingIndexByHomeDataType == coroutine_suspended) {
                    return coroutine_suspended;
                }
                yRNSportModule3 = yRNSportModule2;
                trainingIndexDataItem2 = (TrainingIndexDataItem) trainingIndexByHomeDataType;
                if (trainingIndexDataItem2 != null) {
                    writableArray.pushMap(yRNSportModule3.convertReportToMap(trainingIndexDataItem2));
                }
                HomeDataType homeDataType2 = HomeDataType.PHYSICAL_STATUS;
                c34891.L$0 = yRNSportModule3;
                c34891.L$1 = writableArray;
                c34891.L$2 = null;
                c34891.label = 4;
                trainingIndexByHomeDataType = yRNSportModule3.getTrainingIndexByHomeDataType(map2, homeDataType2, c34891);
                if (trainingIndexByHomeDataType == coroutine_suspended) {
                    return coroutine_suspended;
                }
                yRNSportModule4 = yRNSportModule3;
            } else if (i2 == 3) {
                writableArray = (WritableArray) c34891.L$2;
                map2 = (Map) c34891.L$1;
                yRNSportModule3 = (YRNSportModule) c34891.L$0;
                ResultKt.throwOnFailure(trainingIndexByHomeDataType);
                trainingIndexDataItem2 = (TrainingIndexDataItem) trainingIndexByHomeDataType;
                if (trainingIndexDataItem2 != null) {
                    writableArray.pushMap(yRNSportModule3.convertReportToMap(trainingIndexDataItem2));
                }
                HomeDataType homeDataType3 = HomeDataType.PHYSICAL_STATUS;
                c34891.L$0 = yRNSportModule3;
                c34891.L$1 = writableArray;
                c34891.L$2 = null;
                c34891.label = 4;
                trainingIndexByHomeDataType = yRNSportModule3.getTrainingIndexByHomeDataType(map2, homeDataType3, c34891);
                if (trainingIndexByHomeDataType == coroutine_suspended) {
                    return coroutine_suspended;
                }
                yRNSportModule4 = yRNSportModule3;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                writableArray = (WritableArray) c34891.L$1;
                yRNSportModule4 = (YRNSportModule) c34891.L$0;
                ResultKt.throwOnFailure(trainingIndexByHomeDataType);
            }
            trainingIndexDataItem3 = (TrainingIndexDataItem) trainingIndexByHomeDataType;
            if (trainingIndexDataItem3 != null) {
                writableArray.pushMap(yRNSportModule4.convertReportToMap(trainingIndexDataItem3));
            }
            Intrinsics.checkNotNull(writableArray);
            return writableArray;
        }
        ResultKt.throwOnFailure(trainingIndexByHomeDataType);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        HomeDataType homeDataType4 = HomeDataType.TRAINING_LOAD;
        c34891.L$0 = this;
        c34891.L$1 = map;
        c34891.L$2 = writableArrayCreateArray;
        c34891.label = 1;
        Object trainingIndexByHomeDataType2 = getTrainingIndexByHomeDataType(map, homeDataType4, c34891);
        if (trainingIndexByHomeDataType2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        yRNSportModule = this;
        map2 = map;
        writableArray = writableArrayCreateArray;
        trainingIndexByHomeDataType = trainingIndexByHomeDataType2;
        TrainingIndexDataItem trainingIndexDataItem4 = (TrainingIndexDataItem) trainingIndexByHomeDataType;
        if (trainingIndexDataItem4 != null) {
            writableArray.pushMap(yRNSportModule.convertReportToMap(trainingIndexDataItem4));
        }
        HomeDataType homeDataType5 = HomeDataType.V02_MAX;
        c34891.L$0 = yRNSportModule;
        c34891.L$1 = map2;
        c34891.L$2 = writableArray;
        c34891.label = 2;
        trainingIndexByHomeDataType = yRNSportModule.getTrainingIndexByHomeDataType(map2, homeDataType5, c34891);
        if (trainingIndexByHomeDataType == coroutine_suspended) {
            return coroutine_suspended;
        }
        yRNSportModule2 = yRNSportModule;
        trainingIndexDataItem = (TrainingIndexDataItem) trainingIndexByHomeDataType;
        if (trainingIndexDataItem != null) {
            writableArray.pushMap(yRNSportModule2.convertReportToMap(trainingIndexDataItem));
        }
        HomeDataType homeDataType6 = HomeDataType.RUNNING_INDICATOR;
        c34891.L$0 = yRNSportModule2;
        c34891.L$1 = map2;
        c34891.L$2 = writableArray;
        c34891.label = 3;
        trainingIndexByHomeDataType = yRNSportModule2.getTrainingIndexByHomeDataType(map2, homeDataType6, c34891);
        if (trainingIndexByHomeDataType == coroutine_suspended) {
            return coroutine_suspended;
        }
        yRNSportModule3 = yRNSportModule2;
        trainingIndexDataItem2 = (TrainingIndexDataItem) trainingIndexByHomeDataType;
        if (trainingIndexDataItem2 != null) {
            writableArray.pushMap(yRNSportModule3.convertReportToMap(trainingIndexDataItem2));
        }
        HomeDataType homeDataType7 = HomeDataType.PHYSICAL_STATUS;
        c34891.L$0 = yRNSportModule3;
        c34891.L$1 = writableArray;
        c34891.L$2 = null;
        c34891.label = 4;
        trainingIndexByHomeDataType = yRNSportModule3.getTrainingIndexByHomeDataType(map2, homeDataType7, c34891);
        if (trainingIndexByHomeDataType == coroutine_suspended) {
            return coroutine_suspended;
        }
        yRNSportModule4 = yRNSportModule3;
        trainingIndexDataItem3 = (TrainingIndexDataItem) trainingIndexByHomeDataType;
        if (trainingIndexDataItem3 != null) {
            writableArray.pushMap(yRNSportModule4.convertReportToMap(trainingIndexDataItem3));
        }
        Intrinsics.checkNotNull(writableArray);
        return writableArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTrainingIndicators$lambda$5(YRNSportModule this$0, Callback callback, Map it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new YRNSportModule$getTrainingIndicators$1$1(this$0, it, callback, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeightItem getWeightItem(float weight) {
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        float height = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getHeight();
        return new WeightItem(jCurrentTimeMillis, weight, height > 0.0f ? Float.valueOf(weight / ((float) Math.pow(height / 100.0f, 2.0f))) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gotoSportPage$lambda$2(Activity activity, int i, boolean z, Exception exc) {
        if (z) {
            AnyExtKt.main$default(null, new YRNSportModule$gotoSportPage$1$1(activity, i, null), 1, null);
        } else {
            Object[] objArr = new Object[2];
            objArr[0] = "checkSoLoaded exception:" + (exc != null ? exc.getMessage() : null);
            objArr[1] = exc;
            Logger.e(TAG, objArr);
        }
        return Unit.INSTANCE;
    }

    private final HomeDataType intToDataType(int i) {
        switch (i) {
            case 100:
                return HomeDataType.RUNNING_INDICATOR;
            case 101:
                return HomeDataType.TRAINING_LOAD;
            case 102:
                return HomeDataType.V02_MAX;
            case 103:
                return HomeDataType.PHYSICAL_STATUS;
            default:
                return HomeDataType.UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessServerSyncer serverSyncer_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    private final void showHabitPlanSportDialog(String habitDayPlanStr) {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof FragmentActivity)) {
            Logger.e(TAG, "没有可用的activity");
            return;
        }
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
            Gson gsonCreate = gsonBuilder.create();
            Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
            HabitDayPlan habitDayPlan = (HabitDayPlan) gsonCreate.fromJson(habitDayPlanStr, HabitDayPlan.class);
            Intrinsics.checkNotNull(habitDayPlan);
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).showHabitPlanSportDialog((FragmentActivity) currentActivity, habitDayPlan, true);
        } catch (JsonSyntaxException e) {
            Logger.e(TAG, "showHabitPlanSportDialog JsonSyntaxException:" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sportChangedListener$lambda$32(YRNSportModule this$0, String status, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(status, "status");
        Logger.d(TAG, "sportChangedListener：" + status + "," + i);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", status);
        writableMapCreateMap.putInt("type", i);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this$0.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(SportAccessExportExtKt.getSPORT_CHANGE_MESSAGE(), writableMapCreateMap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sportDataChangedListener$lambda$35(YRNSportModule this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "sportDataChangedListener");
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this$0.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(SportAccessExportExtKt.getSPORT_DATA_CHANGE_MESSAGE(), null);
        return Unit.INSTANCE;
    }

    private final boolean supportJustDance(String did) {
        return (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(did) & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit weightChangedListener$lambda$34(YRNSportModule this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(TAG, "weightChangedListener：");
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this$0.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(HealthPageExtKt.WEAR_WEIGHT_STATUS_MESSAGE, null);
        return Unit.INSTANCE;
    }

    @ReactMethod
    public final void doAllNecessaryCheckAndGoToAidongSdkIfNeed() {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        Logger.i(TAG, "currentActivity:" + currentActivity);
        if (currentActivity == null || !(currentActivity instanceof FragmentActivity)) {
            Logger.e(TAG, "没有可用的activity");
        } else {
            SportAidongGameApiKt.getSportAidongGameApi().doAllNecessaryCheckAndGoToAidongSdkIfNeed((FragmentActivity) currentActivity);
        }
    }

    @ReactMethod
    public final void getBodyFatScaleDeviceModels(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceManagerExtKt.getInstance(companion).getDeviceModels();
        RNDeviceManager.Companion companion2 = RNDeviceManager.INSTANCE;
        Logger.d(TAG, "convertDeviceModel " + RNDeviceManagerExtKt.getInstance(companion2).getDeviceSize() + "  ecoSize:" + EcoDeviceManagerExtKt.getInstance(companion).getDeviceSize());
        for (RNDeviceModel rNDeviceModel : RNDeviceManagerExtKt.getInstance(companion2).getDeviceModels()) {
            if (!Intrinsics.areEqual(DeviceModelExtKt.getModel(rNDeviceModel), "yunmai.scales.ms3001")) {
                writableArrayCreateArray.pushMap(convertDeviceModel(rNDeviceModel));
            }
        }
        Iterator it = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModels().iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushMap(convertEcoDeviceModel((EcoDeviceModel) it.next()));
        }
        callback.invoke(writableArrayCreateArray);
    }

    @ReactMethod
    public final void getCaloriesValue(@NotNull String start, @NotNull String end, @NotNull String viewTag, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ICalorieRepository iCalorieRepository = (ICalorieRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ICalorieRepository.class);
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(start);
        long jLongValue = longOrNull != null ? longOrNull.longValue() : System.currentTimeMillis() / ((long) 1000);
        Long longOrNull2 = StringsKt__StringNumberConversionsKt.toLongOrNull(end);
        long jLongValue2 = longOrNull2 != null ? longOrNull2.longValue() : System.currentTimeMillis() / ((long) 1000);
        List<DailyCalorieReport> reportListForSummary = iCalorieRepository.getReportListForSummary("", viewTag, jLongValue, jLongValue2);
        Logger.i(TAG, "calories value2:startTime:" + jLongValue + ",endTime:" + jLongValue2 + ",value2:" + reportListForSummary);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (DailyCalorieReport dailyCalorieReport : reportListForSummary) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("calories", dailyCalorieReport.getCalories());
            writableMapCreateMap.putString("time", String.valueOf(dailyCalorieReport.getTime()));
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        callback.invoke(writableArrayCreateArray);
    }

    @ReactMethod
    public final void getLatestSportReport(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        AnyExtKt.io$default(null, new AnonymousClass1(callback, null), 1, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void getPlanDetailProgress(@NotNull String planIdStr, int planType, @NotNull String startSecStr, @NotNull String endSecStr, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(planIdStr, "planIdStr");
        Intrinsics.checkNotNullParameter(startSecStr, "startSecStr");
        Intrinsics.checkNotNullParameter(endSecStr, "endSecStr");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(startSecStr);
        long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
        Long longOrNull2 = StringsKt__StringNumberConversionsKt.toLongOrNull(endSecStr);
        long jLongValue2 = longOrNull2 != null ? longOrNull2.longValue() : 0L;
        Long longOrNull3 = StringsKt__StringNumberConversionsKt.toLongOrNull(planIdStr);
        long jLongValue3 = longOrNull3 != null ? longOrNull3.longValue() : 0L;
        Logger.d(TAG, "getRecord: category = $, startSec = " + jLongValue + ", endSec = " + jLongValue2);
        AnyExtKt.io$default(null, new C34871(callback, this, jLongValue, jLongValue2, jLongValue3, null), 1, null);
    }

    @ReactMethod
    public final void getSportRecord(@NotNull String category, @NotNull String startSecStr, @NotNull String endSecStr, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(startSecStr, "startSecStr");
        Intrinsics.checkNotNullParameter(endSecStr, "endSecStr");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(startSecStr);
        long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
        Long longOrNull2 = StringsKt__StringNumberConversionsKt.toLongOrNull(endSecStr);
        long jLongValue2 = longOrNull2 != null ? longOrNull2.longValue() : 0L;
        Logger.d(TAG, "getRecord: category = " + category + ", startSec = " + jLongValue + ", endSec = " + jLongValue2);
        AnyExtKt.io$default(null, new C34881(callback, category, this, jLongValue, jLongValue2, null), 1, null);
    }

    @ReactMethod
    public final void getTrainingIndicators(@NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        List<HomeDataType> supportedHomeDataTypesForTrainingIndex = HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getSupportedHomeDataTypesForTrainingIndex();
        Logger.i(TAG, "refreshSupportedTypes:" + GsonExtKt.toJson(supportedHomeDataTypesForTrainingIndex));
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(supportedHomeDataTypesForTrainingIndex);
        FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository().getHomeData(copyOnWriteArrayList, new Function1() { // from class: syr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YRNSportModule.getTrainingIndicators$lambda$5(this.f34109a, callback, (Map) obj);
            }
        });
    }

    @ReactMethod
    public final void getWeightValue(@NotNull String start, @NotNull String end, @NotNull String viewTag, @NotNull Callback callback) {
        WeightItem weightItem;
        WeightItem weightItem2;
        Long dbTime;
        WeightItem weightItem3;
        Long dbTime2;
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IWeightRepository iWeightRepository = (IWeightRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(IWeightRepository.class);
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(start);
        long jLongValue = longOrNull != null ? longOrNull.longValue() : System.currentTimeMillis() / ((long) 1000);
        Long longOrNull2 = StringsKt__StringNumberConversionsKt.toLongOrNull(end);
        long jLongValue2 = longOrNull2 != null ? longOrNull2.longValue() : System.currentTimeMillis() / ((long) 1000);
        List<DailyWeightReport> reportListForSummary = iWeightRepository.getReportListForSummary("", viewTag, jLongValue, jLongValue2);
        Logger.i(TAG, "getWeightValue :startTime:" + jLongValue + ",endTime:" + jLongValue2 + ",value2:" + reportListForSummary);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (DailyWeightReport dailyWeightReport : reportListForSummary) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            WeightItem preDayWeightItem = dailyWeightReport.getPreDayWeightItem();
            double weight = 0.0d;
            writableMapCreateMap2.putDouble("weight", preDayWeightItem != null ? preDayWeightItem.getWeight() : 0.0d);
            WeightItem preDayWeightItem2 = dailyWeightReport.getPreDayWeightItem();
            writableMapCreateMap2.putString("time", (preDayWeightItem2 == null || (dbTime2 = preDayWeightItem2.getDbTime()) == null) ? null : dbTime2.toString());
            WeightItem preDayWeightItem3 = dailyWeightReport.getPreDayWeightItem();
            writableMapCreateMap2.putString("sid", preDayWeightItem3 != null ? preDayWeightItem3.getSid() : null);
            Unit unit = Unit.INSTANCE;
            writableMapCreateMap.putMap("preDayWeightItem", writableMapCreateMap2);
            WritableMap writableMapCreateMap3 = Arguments.createMap();
            List<WeightItem> weightRecordList = dailyWeightReport.getWeightRecordList();
            if (weightRecordList != null && (weightItem3 = (WeightItem) CollectionsKt___CollectionsKt.getOrNull(weightRecordList, 0)) != null) {
                weight = weightItem3.getWeight();
            }
            writableMapCreateMap3.putDouble("weight", weight);
            List<WeightItem> weightRecordList2 = dailyWeightReport.getWeightRecordList();
            writableMapCreateMap3.putString("time", (weightRecordList2 == null || (weightItem2 = (WeightItem) CollectionsKt___CollectionsKt.getOrNull(weightRecordList2, 0)) == null || (dbTime = weightItem2.getDbTime()) == null) ? null : dbTime.toString());
            List<WeightItem> weightRecordList3 = dailyWeightReport.getWeightRecordList();
            writableMapCreateMap3.putString("sid", (weightRecordList3 == null || (weightItem = (WeightItem) CollectionsKt___CollectionsKt.getOrNull(weightRecordList3, 0)) == null) ? null : weightItem.getSid());
            writableMapCreateMap.putMap("currentWeight", writableMapCreateMap3);
            WritableArray writableArrayCreateArray2 = Arguments.createArray();
            List<WeightItem> weightRecordList4 = dailyWeightReport.getWeightRecordList();
            if (weightRecordList4 != null) {
                for (WeightItem weightItem4 : weightRecordList4) {
                    WritableMap writableMapCreateMap4 = Arguments.createMap();
                    writableMapCreateMap4.putDouble("weight", weightItem4.getWeight());
                    Long dbTime3 = weightItem4.getDbTime();
                    writableMapCreateMap4.putString("time", dbTime3 != null ? dbTime3.toString() : null);
                    writableMapCreateMap4.putString("sid", weightItem4.getSid());
                    writableArrayCreateArray2.pushMap(writableMapCreateMap4);
                }
            }
            Unit unit2 = Unit.INSTANCE;
            writableMapCreateMap.putArray("todayWeights", writableArrayCreateArray2);
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        callback.invoke(writableArrayCreateArray);
    }

    @ReactMethod
    public final void goSportDetail(@NotNull String sportBasicReportStr) {
        Intrinsics.checkNotNullParameter(sportBasicReportStr, "sportBasicReportStr");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            Logger.e(TAG, "没有可用的activity");
            return;
        }
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
            Gson gsonCreate = gsonBuilder.create();
            Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
            SportBasicReport sportBasicReport = (SportBasicReport) gsonCreate.fromJson(sportBasicReportStr, SportBasicReport.class);
            Bundle bundle = new Bundle();
            String sid = sportBasicReport.getSid();
            if (sid != null && !StringsKt__StringsKt.isBlank(sid)) {
                bundle.putString("did", sid);
            }
            bundle.putSerializable("local_date", Long.valueOf(sportBasicReport.getTimeStamp()));
            bundle.putLong("time_stamp", sportBasicReport.getTimeStamp());
            bundle.putSerializable("sport_report", sportBasicReport);
            bundle.putString("sport_source", "workout_tab");
            bundle.putInt("sport_type", lp5.a(sportBasicReport));
            SportRecordApi sportRecordApi = SportRecordApiKt.getSportRecordApi();
            Intrinsics.checkNotNull(sportBasicReport);
            sportRecordApi.goSportDetail(currentActivity, bundle, (ActivityOptions) null, sportBasicReport);
        } catch (JsonSyntaxException e) {
            Logger.e(TAG, "goSportDetail JsonSyntaxException：" + e);
        }
    }

    @ReactMethod
    public final void goToTrainingIndexDataPage(@NotNull String timestamp, @Nullable String did, int homeDataTypeNumber) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        HomeDataType homeDataTypeIntToDataType = intToDataType(homeDataTypeNumber);
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            Logger.e(TAG, "没有可用的activity");
            return;
        }
        IHealthPage healthPageExtKt = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(timestamp);
        healthPageExtKt.goToTrainingIndexDataPage(longOrNull != null ? longOrNull.longValue() : 0L, did, currentActivity, homeDataTypeIntToDataType, null);
    }

    @ReactMethod
    public final void gotoSportPage(final int sportType) {
        final Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        Logger.i(TAG, "currentActivity:" + currentActivity);
        if (currentActivity == null || !(currentActivity instanceof FragmentActivity)) {
            Logger.e(TAG, "没有可用的activity");
        } else if (ArraysKt___ArraysKt.contains(new Integer[]{6, 1, 2}, Integer.valueOf(sportType))) {
            MapDynamicUtils.INSTANCE.checkSoLoaded((FragmentActivity) currentActivity, new Function2() { // from class: zyr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return YRNSportModule.gotoSportPage$lambda$2(currentActivity, sportType, ((Boolean) obj).booleanValue(), (Exception) obj2);
                }
            });
        } else {
            SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).clickSportBanner((FragmentActivity) currentActivity, sportType);
        }
    }

    @ReactMethod
    public final void gotoSportReport(int planType, @NotNull String planId, @NotNull String jsonStr) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            Logger.e(TAG, "没有可用的activity");
            return;
        }
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
            Gson gsonCreate = gsonBuilder.create();
            Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
            SportKey sportKey = (SportKey) gsonCreate.fromJson(jsonStr, SportKey.class);
            ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
            Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(planId);
            long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
            Intrinsics.checkNotNull(sportKey);
            trainingManagerExtKt.gotoSportReport(currentActivity, planType, jLongValue, sportKey);
        } catch (JsonSyntaxException e) {
            Logger.e(TAG, "gotoSportReport JsonSyntaxException:" + e);
        }
    }

    @ReactMethod
    public final void gotoTraining(@NotNull String dateStr, @NotNull String planIdStr, @NotNull String info) {
        AbilityPlanCourseContent courseContent;
        AbilityPlanCourseContent courseContent2;
        Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        Intrinsics.checkNotNullParameter(planIdStr, "planIdStr");
        Intrinsics.checkNotNullParameter(info, "info");
        Logger.d(TAG, "gotoTraining:" + dateStr + "," + planIdStr + ",info:" + info);
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
            Gson gsonCreate = gsonBuilder.create();
            Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
            AbilityDayPlanCourse abilityDayPlanCourse = (AbilityDayPlanCourse) gsonCreate.fromJson(info, AbilityDayPlanCourse.class);
            Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(planIdStr);
            long jLongValue = longOrNull != null ? longOrNull.longValue() : -1L;
            Long longOrNull2 = StringsKt__StringNumberConversionsKt.toLongOrNull(dateStr);
            long jLongValue2 = longOrNull2 != null ? longOrNull2.longValue() : -1L;
            AbilityPlanVideoCourse videoCourse = null;
            Integer numValueOf = abilityDayPlanCourse != null ? Integer.valueOf(abilityDayPlanCourse.getFrom()) : null;
            AbilityPlanRunningCourse runningCourse = (abilityDayPlanCourse == null || (courseContent2 = abilityDayPlanCourse.getCourseContent()) == null) ? null : courseContent2.getRunningCourse();
            if (abilityDayPlanCourse != null && (courseContent = abilityDayPlanCourse.getCourseContent()) != null) {
                videoCourse = courseContent.getVideoCourse();
            }
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                if (runningCourse != null) {
                    Logger.d(TAG, "launch running course detail:" + jLongValue + "-" + abilityDayPlanCourse.getCourseId());
                    TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).launchAbilityRunningCourseDetailActivity(currentActivity, jLongValue, abilityDayPlanCourse.getCourseId(), jLongValue2);
                    return;
                }
                if (videoCourse == null) {
                    Logger.w(TAG, "can not start course info activity with empty running or video course!!");
                    return;
                }
                Logger.d(TAG, "launch video course detail:" + jLongValue + "-" + abilityDayPlanCourse.getCourseId());
                ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
                videoCourse.setPlanId(jLongValue);
                videoCourse.setCourseStatus(abilityDayPlanCourse.getStatus());
                Unit unit = Unit.INSTANCE;
                trainingManagerExtKt.launchVideoCourseInfoActivity(currentActivity, videoCourse, numValueOf != null ? numValueOf.intValue() : 0);
            }
        } catch (JsonSyntaxException e) {
            Logger.e(TAG, "gotoTraining JsonSyntaxException:" + e);
        }
    }

    @ReactMethod
    public final void launchAbilityRunningCourseDetailPage(@NotNull String planId, @NotNull String courseId, @NotNull String date) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(date, "date");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            Logger.e(TAG, "没有可用的activity");
            return;
        }
        ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(planId);
        long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
        Long longOrNull2 = StringsKt__StringNumberConversionsKt.toLongOrNull(courseId);
        long jLongValue2 = longOrNull2 != null ? longOrNull2.longValue() : 0L;
        Long longOrNull3 = StringsKt__StringNumberConversionsKt.toLongOrNull(date);
        trainingManagerExtKt.launchAbilityRunningCourseDetailActivity(currentActivity, jLongValue, jLongValue2, longOrNull3 != null ? longOrNull3.longValue() : 0L);
    }

    @ReactMethod
    public final void launchVideoCourseInfoActivity(@NotNull String videoCourseStr) {
        Intrinsics.checkNotNullParameter(videoCourseStr, "videoCourseStr");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            Logger.e(TAG, "没有可用的activity");
            return;
        }
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
            Gson gsonCreate = gsonBuilder.create();
            Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
            AbilityPlanVideoCourse abilityPlanVideoCourse = (AbilityPlanVideoCourse) gsonCreate.fromJson(videoCourseStr, AbilityPlanVideoCourse.class);
            ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
            Intrinsics.checkNotNull(abilityPlanVideoCourse);
            ITrainingManager.DefaultImpls.launchVideoCourseInfoActivity$default(trainingManagerExtKt, currentActivity, abilityPlanVideoCourse, 0, 4, null);
        } catch (JsonSyntaxException e) {
            Logger.e(TAG, "launchVideoCourseInfoActivity JsonSyntaxException:" + e);
        }
    }

    @ReactMethod
    public final void registerCourseStatusChangedListener() {
        CourseApiKt.getCourseApi().addCourseChangeListener(this.courseChangedListener);
    }

    @ReactMethod
    public final void registerSportDataStatusChangedListener() {
        SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).addSportDataChangeListener(this.sportDataChangedListener);
    }

    @ReactMethod
    public final void registerSportStatusChangedListener() {
        SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).addSportChangeListener(this.sportChangedListener);
    }

    @ReactMethod
    public final void registerWeightStatusChangedListener() {
        HealthPageExtKt.getInstance(IHealthPage.INSTANCE).addWeightChangeListener(this.weightChangedListener);
    }

    @ReactMethod
    public final void removeCourseStatusChangedListener() {
        CourseApiKt.getCourseApi().removeCourseChangeListener(this.courseChangedListener);
    }

    @ReactMethod
    public final void removeSportDataStatusChangedListener() {
        SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).removeSportDataChangeListener(this.sportDataChangedListener);
    }

    @ReactMethod
    public final void removeSportStatusChangedListener() {
        SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).removeSportChangeListener(this.sportChangedListener);
    }

    @ReactMethod
    public final void removeWeightStatusChangedListener() {
        HealthPageExtKt.getInstance(IHealthPage.INSTANCE).removeWeightChangeListener(this.weightChangedListener);
    }

    @ReactMethod
    public final void saveSupportOpenCityData(@Nullable ReadableMap data) {
        if (data != null) {
            String strSafeGetString = YRNComponentsExtKt.safeGetString(data, "city_code", "");
            RunningRouteSupportCityBean runningRouteSupportCityBean = new RunningRouteSupportCityBean(strSafeGetString != null ? strSafeGetString : "", YRNComponentsExtKt.safeGetBoolean$default(data, "official_open", false, 2, null), YRNComponentsExtKt.safeGetBoolean$default(data, "ai_open", false, 2, null));
            Logger.d(TAG, "saveSupportOpenCityData supportCityBean:" + runningRouteSupportCityBean);
            SportAccessExportExtKt.getINSTANCE(ISportAccessApi.INSTANCE).initSupportCityData(runningRouteSupportCityBean);
        }
    }

    @ReactMethod
    public final void showHabitCreatePlanActionSheet(boolean isPure, boolean hasHabitHistory, @Nullable String habitDayPlanStr) {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof FragmentActivity)) {
            Logger.e(TAG, "没有可用的activity");
        } else if (isPure) {
            showHabitPlanSportDialog(habitDayPlanStr);
        } else {
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).showHabitCreatePlanDialog((FragmentActivity) currentActivity, hasHabitHistory, true);
        }
    }

    @ReactMethod
    public final void syncWeightToLocal(@NotNull String weight) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        AnyExtKt.io$default(null, new C34901(weight, this, null), 1, null);
    }

    @ReactMethod
    public final void terminateTrainingPlan(@NotNull String planIdStr, int planType, int curProgress, boolean success, boolean withReport) {
        Intrinsics.checkNotNullParameter(planIdStr, "planIdStr");
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(planIdStr);
        long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
        getServerSyncer().deleteCurDataByPlanId(jLongValue);
        if (success) {
            if (withReport) {
                TrainingEventUtils.INSTANCE.trackPlanStopped(2, curProgress, 2);
                Activity currentActivity = getCurrentActivity();
                if (currentActivity != null) {
                    TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).launchPlanReport(currentActivity, planType, jLongValue);
                }
            } else {
                TrainingEventUtils.INSTANCE.trackPlanStopped(2, curProgress, 1);
            }
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).clearTrainingPlanSettings();
        }
    }

    @ReactMethod
    public final void toPluginDevicePage(@NotNull String did) {
        Object next;
        Intrinsics.checkNotNullParameter(did, "did");
        Iterator it = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModels().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((EcoDeviceModel) next).getDid(), did));
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) next;
        if (ecoDeviceModel == null) {
            RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).openPlugin(did);
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            String mac = EcoDeviceModelExtKt.getMac(ecoDeviceModel);
            if (mac == null) {
                mac = "";
            }
            ElectronicScaleManagerExtKt.launchToElectronicScaleMainActivity$default(currentActivity, did, mac, false, 4, null);
        }
    }

    @ReactMethod
    public final void updateTodayAbilityPlan(@NotNull String planInfo, int trainingType, @NotNull String id, @NotNull String dateStr) {
        Intrinsics.checkNotNullParameter(planInfo, "planInfo");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        Long longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(id);
        long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
        Long longOrNull2 = StringsKt__StringNumberConversionsKt.toLongOrNull(dateStr);
        long jLongValue2 = longOrNull2 != null ? longOrNull2.longValue() : 0L;
        if (jLongValue != 0 && jLongValue2 != 0) {
            getServerSyncer().syncCurDatePlanInfo(trainingType, jLongValue, jLongValue2, planInfo);
            return;
        }
        Logger.i(TAG, "cacheAbilityPlan " + jLongValue + "," + jLongValue2);
    }
}
