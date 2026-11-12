package com.xiaomi.fitness.v2;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyRunningIndicatorReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTrainingLoadReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.health.runningindicator.RunningIndicatorUtil;
import com.xiaomi.fitness.health.threetarget.model.TrainingIndexDataItem;
import com.xiaomi.fitness.health.trainload.TrainingLoadDataUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.HealthData;
import com.xiaomi.fitness.settingitem.settingitem.HealthDataSetting;
import com.xiaomi.fitness.util.VO2MaxDataUtil;
import defpackage.c0j;
import defpackage.km5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b<\u0010=J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0086@¢\u0006\u0004\b\"\u0010!J\u001d\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)J\u001b\u0010-\u001a\u00020,2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0002¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0000¢\u0006\u0004\b/\u0010\u001bJ\u0019\u00102\u001a\u0004\u0018\u00010\u00062\b\u00101\u001a\u0004\u0018\u00010#¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u0004\u0018\u00010#2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\b\u0012\u0004\u0012\u00020#0\u0002¢\u0006\u0004\b6\u0010\u0005J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b7\u0010\u0005R\u0014\u00108\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/v2/HealthDataTypeUtilsV2;", "", "", "Lcom/xiaomi/fitness/v2/HealthTypeBean;", "getAllSupportDataTypeList", "()Ljava/util/List;", "", "healthType", "", "isDefaultDisplayDataType", "(I)Z", "supportTheDataTypeInBoundDevices", "hasDataOfTheDataType", "", "getCloudHealthTypeInfo", "()Ljava/util/Map;", "Lcom/xiaomi/fitness/settingitem/settingitem/HealthDataSetting;", "getCloudHealthDataSetting", "()Lcom/xiaomi/fitness/settingitem/settingitem/HealthDataSetting;", "", "type", "enable", "Lcom/xiaomi/fitness/settingitem/settingitem/HealthData;", "createHealthData", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/xiaomi/fitness/settingitem/settingitem/HealthData;", "itemType", "getDeviceFeatureByType", "(I)Ljava/lang/String;", "getPersistKeyByType", "convertToDataTypeInt", "(Ljava/lang/String;)Ljava/lang/Integer;", "getAllDataItemTypes", "getAllDataTypeList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeDisplayTypeList", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "homeDataType", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "report", "Lcom/xiaomi/fitness/health/threetarget/model/TrainingIndexDataItem;", "getTrainingIndexDataItem", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;)Lcom/xiaomi/fitness/health/threetarget/model/TrainingIndexDataItem;", "Lkm5;", "dataList", "", "saveHealthDataSettingToCloud", "(Ljava/util/List;)V", "convertToDataTypeStr$health_chinaProductRelease", "convertToDataTypeStr", "homeType", "convertToHealthTypeInt", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;)Ljava/lang/Integer;", "convertToHomeDataType", "(I)Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "getRequestHomeTypeList", "getSupportedHealthDataTypeInTodayHealth", "TAG", "Ljava/lang/String;", "manualDataTypeList", "Ljava/util/List;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHealthDataTypeUtilsV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthDataTypeUtilsV2.kt\ncom/xiaomi/fitness/v2/HealthDataTypeUtilsV2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n1863#2,2:643\n1863#2,2:646\n1#3:645\n*S KotlinDebug\n*F\n+ 1 HealthDataTypeUtilsV2.kt\ncom/xiaomi/fitness/v2/HealthDataTypeUtilsV2\n*L\n315#1:643,2\n568#1:646,2\n*E\n"})
public final class HealthDataTypeUtilsV2 {

    @NotNull
    public static final HealthDataTypeUtilsV2 INSTANCE = new HealthDataTypeUtilsV2();

    @NotNull
    private static final String TAG = "HealthDataTypeUtils";

    @Nullable
    private static List<? extends HealthData> manualDataTypeList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HomeDataType.values().length];
            try {
                iArr[HomeDataType.V02_MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeDataType.TRAINING_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeDataType.RUNNING_INDICATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeDataType.STEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomeDataType.CALORIE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomeDataType.VALID_STAND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomeDataType.MH_STRENGTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomeDataType.SLEEP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomeDataType.ENERGY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HomeDataType.HEARING_HEALTH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HomeDataType.PAI.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HomeDataType.WOMEN_HEALTH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HomeDataType.HR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HomeDataType.SPO2.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HomeDataType.STRESS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HomeDataType.SPORT_REPORT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[HomeDataType.WEIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[HomeDataType.BLOOD_PRESSURE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[HomeDataType.TEMPERATURE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[HomeDataType.RAINBOW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[HomeDataType.VITALITY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[HomeDataType.ECG_MEDICAL.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[HomeDataType.BLOOD_SUGAR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[HomeDataType.PHYSICAL_STATUS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[HomeDataType.TODAY_HEALTH.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.v2.HealthDataTypeUtilsV2$getAllDataTypeList$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fitness/v2/HealthTypeBean;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.v2.HealthDataTypeUtilsV2$getAllDataTypeList$2", f = "HealthDataTypeUtilsV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends HealthTypeBean>>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends HealthTypeBean>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<HealthTypeBean>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return HealthDataTypeUtilsV2.INSTANCE.getAllSupportDataTypeList();
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<HealthTypeBean>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.v2.HealthDataTypeUtilsV2$getHomeDisplayTypeList$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.v2.HealthDataTypeUtilsV2$getHomeDisplayTypeList$2", f = "HealthDataTypeUtilsV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nHealthDataTypeUtilsV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthDataTypeUtilsV2.kt\ncom/xiaomi/fitness/v2/HealthDataTypeUtilsV2$getHomeDisplayTypeList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,642:1\n1863#2,2:643\n*S KotlinDebug\n*F\n+ 1 HealthDataTypeUtilsV2.kt\ncom/xiaomi/fitness/v2/HealthDataTypeUtilsV2$getHomeDisplayTypeList$2\n*L\n134#1:643,2\n*E\n"})
    public static final class C33202 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<Integer>>, Object> {
        int label;

        public C33202(Continuation<? super C33202> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33202(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            for (HealthTypeBean healthTypeBean : HealthDataTypeUtilsV2.INSTANCE.getAllSupportDataTypeList()) {
                if (healthTypeBean.getEnable()) {
                    arrayList.add(Boxing.boxInt(healthTypeBean.getHealthType()));
                }
            }
            return arrayList;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<Integer>> continuation) {
            return ((C33202) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private HealthDataTypeUtilsV2() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Integer convertToDataTypeInt(String type) {
        switch (type.hashCode()) {
            case -2030863703:
                if (type.equals("blood_glucose")) {
                    return 403;
                }
                return null;
            case -2003821937:
                if (type.equals("mh_intensity")) {
                    return 15;
                }
                return null;
            case -1563643941:
                if (type.equals("ecg_medical")) {
                    return 402;
                }
                return null;
            case -1298713976:
                if (type.equals("energy")) {
                    return 8;
                }
                return null;
            case -891989580:
                if (type.equals("stress")) {
                    return 7;
                }
                return null;
            case -812619221:
                if (type.equals("vo2max")) {
                    return 12;
                }
                return null;
            case -791592328:
                if (type.equals("weight")) {
                    return 10000;
                }
                return null;
            case -568136405:
                if (type.equals(FitnessPersistKey.TrainingLoad)) {
                    return 20;
                }
                return null;
            case 110744:
                if (type.equals("pai")) {
                    return 10;
                }
                return null;
            case 3537088:
                if (type.equals("spo2")) {
                    return 13;
                }
                return null;
            case 3540684:
                if (type.equals("step")) {
                    return 3;
                }
                return null;
            case 95027346:
                if (type.equals("curse")) {
                    return 9;
                }
                return null;
            case 109522647:
                if (type.equals("sleep")) {
                    return 6;
                }
                return null;
            case 321701236:
                if (type.equals("temperature")) {
                    return 21;
                }
                return null;
            case 548738829:
                if (type.equals("calorie")) {
                    return 2;
                }
                return null;
            case 560044778:
                if (type.equals("blood_pressure")) {
                    return 16;
                }
                return null;
            case 795728692:
                if (type.equals("hearing")) {
                    return 17;
                }
                return null;
            case 845747557:
                if (type.equals("health_check")) {
                    return 30000;
                }
                return null;
            case 868936591:
                if (type.equals("running_indicator")) {
                    return 22;
                }
                return null;
            case 976395354:
                if (type.equals("physical_status")) {
                    return 24;
                }
                return null;
            case 1312635980:
                if (type.equals(Feature.STANDING)) {
                    return 5;
                }
                return null;
            case 1605680418:
                if (type.equals("vitality")) {
                    return 23;
                }
                return null;
            case 1930449209:
                if (type.equals("heart_rate")) {
                    return 4;
                }
                return null;
            default:
                return null;
        }
    }

    private final HealthData createHealthData(String type, Boolean enable) {
        HealthData healthData = new HealthData();
        healthData.setType(type);
        if (enable != null) {
            healthData.setEnable(enable.booleanValue());
        }
        return healthData;
    }

    public static /* synthetic */ HealthData createHealthData$default(HealthDataTypeUtilsV2 healthDataTypeUtilsV2, String str, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return healthDataTypeUtilsV2.createHealthData(str, bool);
    }

    private final List<Integer> getAllDataItemTypes() {
        ArrayList arrayList = new ArrayList();
        HealthPrefer healthPrefer = HealthPrefer.INSTANCE;
        if (!healthPrefer.getHEALTH_CARD_SORT().isEmpty()) {
            arrayList.addAll(healthPrefer.getHEALTH_CARD_SORT());
        }
        ArrayList arrayList2 = new ArrayList();
        boolean zIsFemale = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).isFemale();
        arrayList2.add(6);
        arrayList2.add(4);
        arrayList2.add(16);
        arrayList2.add(402);
        AppUtil appUtil = AppUtil.INSTANCE;
        if (!appUtil.isPlayChannel()) {
            arrayList2.add(403);
        }
        arrayList2.add(13);
        arrayList2.add(10000);
        arrayList2.add(21);
        if (zIsFemale) {
            arrayList2.add(9);
        }
        arrayList2.add(7);
        if (!appUtil.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            arrayList2.add(17);
        }
        arrayList2.add(23);
        arrayList2.add(10);
        arrayList2.add(8);
        if (!zIsFemale) {
            arrayList2.add(9);
        }
        arrayList2.add(30000);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (!arrayList.contains(Integer.valueOf(iIntValue))) {
                arrayList.add(Integer.valueOf(iIntValue));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HealthTypeBean> getAllSupportDataTypeList() {
        List<Integer> allDataItemTypes = getAllDataItemTypes();
        Map<Integer, HealthTypeBean> cloudHealthTypeInfo = getCloudHealthTypeInfo();
        ArrayList arrayList = new ArrayList();
        FitnessLogUtils.i(TAG, "getAllDataTypeList start");
        Iterator<Integer> it = allDataItemTypes.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            Logger.i(TAG, "getAllSupportDataTypeList type=" + iIntValue + " ");
            HealthTypeBean healthTypeBean = cloudHealthTypeInfo.get(Integer.valueOf(iIntValue));
            boolean manualSet = healthTypeBean != null ? healthTypeBean.getManualSet() : false;
            if (healthTypeBean == null || !healthTypeBean.getEnable()) {
                HealthTypeBean healthTypeBean2 = new HealthTypeBean(iIntValue, healthTypeBean == null, manualSet);
                if (isDefaultDisplayDataType(iIntValue)) {
                    FitnessLogUtils.i(TAG, "default support " + healthTypeBean2);
                    arrayList.add(healthTypeBean2);
                } else if (iIntValue == 9 && AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).isFemale()) {
                    FitnessLogUtils.i(TAG, "isFemale, support " + healthTypeBean2);
                    arrayList.add(healthTypeBean2);
                } else if (hasDataOfTheDataType(iIntValue)) {
                    FitnessLogUtils.i(TAG, "has data, support " + healthTypeBean2);
                    arrayList.add(healthTypeBean2);
                } else if (supportTheDataTypeInBoundDevices(iIntValue)) {
                    FitnessLogUtils.i(TAG, "device support " + healthTypeBean2);
                    arrayList.add(healthTypeBean2);
                } else if (iIntValue == 9) {
                    healthTypeBean2.setEnable(false);
                    FitnessLogUtils.i(TAG, "isMale, support " + healthTypeBean2);
                    arrayList.add(healthTypeBean2);
                }
            } else {
                HealthTypeBean healthTypeBean3 = new HealthTypeBean(iIntValue, true, manualSet);
                FitnessLogUtils.i(TAG, "cloud support " + healthTypeBean3);
                arrayList.add(healthTypeBean3);
            }
        }
        return arrayList;
    }

    private final HealthDataSetting getCloudHealthDataSetting() {
        Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem("xiaomiwear_app", DeviceSettingConfigKey.KEY_HEALTH_DATA).valueToObject(HealthDataSetting.class);
        HealthDataSetting healthDataSetting = objValueToObject instanceof HealthDataSetting ? (HealthDataSetting) objValueToObject : null;
        FitnessLogUtils.d(TAG, "getCloudHealthDataSetting is " + healthDataSetting);
        return healthDataSetting;
    }

    private final Map<Integer, HealthTypeBean> getCloudHealthTypeInfo() {
        Iterable<HealthData> healthmanuallist;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HealthDataSetting cloudHealthDataSetting = getCloudHealthDataSetting();
        if (cloudHealthDataSetting == null || (healthmanuallist = cloudHealthDataSetting.getHealthmanuallist()) == null) {
            healthmanuallist = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() ? null : manualDataTypeList;
        }
        if (healthmanuallist != null) {
            for (HealthData healthData : healthmanuallist) {
                if (healthData.getType() != null) {
                    HealthDataTypeUtilsV2 healthDataTypeUtilsV2 = INSTANCE;
                    String type = healthData.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    Integer numConvertToDataTypeInt = healthDataTypeUtilsV2.convertToDataTypeInt(type);
                    if (numConvertToDataTypeInt == null) {
                        FitnessLogUtils.i(TAG, "getCloudHealthTypes, " + healthData.getType() + " to null");
                    } else {
                        int iIntValue = numConvertToDataTypeInt.intValue();
                        Boolean enable = healthData.getEnable();
                        Intrinsics.checkNotNullExpressionValue(enable, "getEnable(...)");
                        linkedHashMap.put(numConvertToDataTypeInt, new HealthTypeBean(iIntValue, enable.booleanValue(), true));
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private final String getDeviceFeatureByType(int itemType) {
        if (itemType == 4) {
            return "heart_rate";
        }
        if (itemType == 10) {
            return "pai";
        }
        if (itemType == 10000) {
            return Feature.BODY_FAT;
        }
        if (itemType == 30000) {
            return Feature.HEALTH_CHECKUP;
        }
        if (itemType == 7) {
            return "pressure";
        }
        if (itemType == 8) {
            return "energy";
        }
        if (itemType == 12) {
            return "vo2max";
        }
        if (itemType == 13) {
            return Feature.SAO2;
        }
        if (itemType == 402) {
            return Feature.ECG_MEASURE_REMIND;
        }
        if (itemType == 403) {
            return "blood_sugar";
        }
        switch (itemType) {
            case 20:
                return Feature.TRAINING_LOAD;
            case 21:
                return "temperature";
            case 22:
                return Feature.RUNNING_INDEX;
            case 23:
                return "vitality";
            case 24:
                return "tsb";
            default:
                return null;
        }
    }

    private final String getPersistKeyByType(int itemType) {
        if (itemType == 17) {
            return "headset";
        }
        if (itemType == 402) {
            return FitnessPersistKey.EcgMedical;
        }
        if (itemType == 403) {
            return "blood_sugar";
        }
        switch (itemType) {
            case 8:
                return "energy";
            case 9:
                return FitnessPersistKey.WomenHealthStatus;
            case 10:
                return "pai";
            default:
                switch (itemType) {
                    case 20:
                        return FitnessPersistKey.TrainingLoad;
                    case 21:
                        return FitnessPersistKey.ManualTemperature;
                    case 22:
                        return FitnessPersistKey.RunningIndicator;
                    case 23:
                        return "vitality";
                    case 24:
                        return "physical_fitness_status";
                    default:
                        return null;
                }
        }
    }

    private final boolean hasDataOfTheDataType(int healthType) {
        String persistKeyByType = getPersistKeyByType(healthType);
        return (persistKeyByType == null || FitnessDataGetter.DefaultImpls.getRecentOneData$default(FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE), persistKeyByType, 0L, null, 6, null) == null) ? false : true;
    }

    private final boolean isDefaultDisplayDataType(int healthType) {
        if (healthType != 12 && healthType != 13 && healthType != 15 && healthType != 16 && healthType != 403 && healthType != 10000) {
            switch (healthType) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private final boolean supportTheDataTypeInBoundDevices(int healthType) {
        if (healthType == 17) {
            return AppUtil.INSTANCE.supportMiuiFunction();
        }
        if (healthType == 30000) {
            List<WearableDeviceInfo> allFeatureSupportDeviceInfoList = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getAllFeatureSupportDeviceInfoList(CollectionsKt__CollectionsJVMKt.listOf(Feature.HEALTH_CHECKUP));
            return !(allFeatureSupportDeviceInfoList == null || allFeatureSupportDeviceInfoList.isEmpty());
        }
        for (T t : DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModels()) {
            String deviceFeatureByType = getDeviceFeatureByType(healthType);
            if (deviceFeatureByType != null && DeviceModelExtKt.isSupportFeature(t, deviceFeatureByType)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String convertToDataTypeStr$health_chinaProductRelease(int type) {
        if (type == 12) {
            return "vo2max";
        }
        if (type == 13) {
            return "spo2";
        }
        if (type == 402) {
            return "ecg_medical";
        }
        if (type == 403) {
            return "blood_glucose";
        }
        if (type == 10000) {
            return "weight";
        }
        if (type == 30000) {
            return "health_check";
        }
        switch (type) {
            case 2:
                return "calorie";
            case 3:
                return "step";
            case 4:
                return "heart_rate";
            case 5:
                return Feature.STANDING;
            case 6:
                return "sleep";
            case 7:
                return "stress";
            case 8:
                return "energy";
            case 9:
                return "curse";
            case 10:
                return "pai";
            default:
                switch (type) {
                    case 15:
                        return "mh_intensity";
                    case 16:
                        return "blood_pressure";
                    case 17:
                        return "hearing";
                    default:
                        switch (type) {
                            case 20:
                                return FitnessPersistKey.TrainingLoad;
                            case 21:
                                return "temperature";
                            case 22:
                                return "running_indicator";
                            case 23:
                                return "vitality";
                            case 24:
                                return "physical_status";
                            default:
                                return null;
                        }
                }
        }
    }

    @Nullable
    public final Integer convertToHealthTypeInt(@Nullable HomeDataType homeType) {
        switch (homeType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[homeType.ordinal()]) {
            case 1:
                return 12;
            case 2:
                return 20;
            case 3:
                return 22;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 5;
            case 7:
                return 15;
            case 8:
                return 6;
            case 9:
                return 8;
            case 10:
                return 17;
            case 11:
                return 10;
            case 12:
                return 9;
            case 13:
                return 4;
            case 14:
                return 13;
            case 15:
                return 7;
            case 16:
                return 19;
            case 17:
                return 10000;
            case 18:
                return 16;
            case 19:
                return 21;
            case 20:
                return 14;
            case 21:
                return 23;
            case 22:
                return 402;
            case 23:
                return 403;
            case 24:
                return 24;
            case 25:
                return 30000;
            default:
                return null;
        }
    }

    @Nullable
    public final HomeDataType convertToHomeDataType(int healthType) {
        if (healthType == 402) {
            return HomeDataType.ECG_MEDICAL;
        }
        if (healthType == 403) {
            return HomeDataType.BLOOD_SUGAR;
        }
        if (healthType == 10000) {
            return HomeDataType.WEIGHT;
        }
        switch (healthType) {
            case 2:
                return HomeDataType.CALORIE;
            case 3:
                return HomeDataType.STEP;
            case 4:
                return HomeDataType.HR;
            case 5:
                return HomeDataType.VALID_STAND;
            case 6:
                return HomeDataType.SLEEP;
            case 7:
                return HomeDataType.STRESS;
            case 8:
                return HomeDataType.ENERGY;
            case 9:
                return HomeDataType.WOMEN_HEALTH;
            case 10:
                return HomeDataType.PAI;
            default:
                switch (healthType) {
                    case 12:
                        return HomeDataType.V02_MAX;
                    case 13:
                        return HomeDataType.SPO2;
                    case 14:
                        return HomeDataType.RAINBOW;
                    case 15:
                        return HomeDataType.MH_STRENGTH;
                    case 16:
                        return HomeDataType.BLOOD_PRESSURE;
                    case 17:
                        return HomeDataType.HEARING_HEALTH;
                    default:
                        switch (healthType) {
                            case 19:
                                return HomeDataType.SPORT_REPORT;
                            case 20:
                                return HomeDataType.TRAINING_LOAD;
                            case 21:
                                return HomeDataType.TEMPERATURE;
                            case 22:
                                return HomeDataType.RUNNING_INDICATOR;
                            case 23:
                                return HomeDataType.VITALITY;
                            case 24:
                                return HomeDataType.PHYSICAL_STATUS;
                            default:
                                return null;
                        }
                }
        }
    }

    @Nullable
    public final Object getAllDataTypeList(@NotNull Continuation<? super List<HealthTypeBean>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
    }

    @Nullable
    public final Object getHomeDisplayTypeList(@NotNull Continuation<? super List<Integer>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C33202(null), continuation);
    }

    @NotNull
    public final List<HomeDataType> getRequestHomeTypeList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(HomeDataType.SPORT_REPORT);
        arrayList.add(HomeDataType.SLEEP);
        arrayList.add(HomeDataType.HR);
        arrayList.add(HomeDataType.STEP);
        arrayList.add(HomeDataType.CALORIE);
        arrayList.add(HomeDataType.VALID_STAND);
        arrayList.add(HomeDataType.MH_STRENGTH);
        arrayList.add(HomeDataType.BLOOD_PRESSURE);
        arrayList.add(HomeDataType.STRESS);
        arrayList.add(HomeDataType.SPO2);
        arrayList.add(HomeDataType.PAI);
        arrayList.add(HomeDataType.ENERGY);
        arrayList.add(HomeDataType.V02_MAX);
        arrayList.add(HomeDataType.WEIGHT);
        arrayList.add(HomeDataType.HEARING_HEALTH);
        arrayList.add(HomeDataType.WOMEN_HEALTH);
        arrayList.add(HomeDataType.TRAINING_LOAD);
        arrayList.add(HomeDataType.TEMPERATURE);
        arrayList.add(HomeDataType.RUNNING_INDICATOR);
        arrayList.add(HomeDataType.VITALITY);
        arrayList.add(HomeDataType.ECG_MEDICAL);
        arrayList.add(HomeDataType.BLOOD_SUGAR);
        arrayList.add(HomeDataType.PHYSICAL_STATUS);
        arrayList.add(HomeDataType.TODAY_HEALTH);
        return arrayList;
    }

    @NotNull
    public final List<Integer> getSupportedHealthDataTypeInTodayHealth() {
        ArrayList arrayList = new ArrayList();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "heart_rate")) {
            arrayList.add(6);
        }
        if (wearableDeviceModel != null && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.SAO2)) {
            arrayList.add(13);
        }
        if (wearableDeviceModel != null && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "pressure")) {
            arrayList.add(7);
        }
        if (wearableDeviceModel != null && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.ASSIST_SLEEP)) {
            arrayList.add(6);
        }
        return arrayList;
    }

    @NotNull
    public final TrainingIndexDataItem getTrainingIndexDataItem(@NotNull HomeDataType homeDataType, @NotNull DailyBasicReport report) {
        String str;
        Integer runningIndicatorLevel;
        Intrinsics.checkNotNullParameter(homeDataType, "homeDataType");
        Intrinsics.checkNotNullParameter(report, "report");
        int i = WhenMappings.$EnumSwitchMapping$0[homeDataType.ordinal()];
        int level = 0;
        if (i == 1) {
            DailyVo2MaxReport dailyVo2MaxReport = (DailyVo2MaxReport) report;
            Vo2MaxItem latestItem = dailyVo2MaxReport.getLatestItem();
            Vo2MaxItem latestItem2 = dailyVo2MaxReport.getLatestItem();
            if ((latestItem2 != null ? Integer.valueOf(latestItem2.getVo2Max()) : null) == null) {
                return new TrainingIndexDataItem(dailyVo2MaxReport.getTime(), null, HomeDataType.V02_MAX, null, true, null, 0, null, null, null, ResourceExtKt.getString(c0j.Ko), ResourceExtKt.getString(c0j.Jo), 1002, null);
            }
            List<LevelBarView.LevelItem> vo2MaxLevelItems = VO2MaxDataUtil.INSTANCE.getVo2MaxLevelItems();
            Vo2MaxItem latestItem3 = dailyVo2MaxReport.getLatestItem();
            int vo2Max = latestItem3 != null ? latestItem3.getVo2Max() : 0;
            String dateMMddFormat = TimeDateUtil.getDateMMddFormat(dailyVo2MaxReport.getTime());
            if (latestItem != null) {
                level = VO2MaxDataUtil.getLevel(latestItem);
                str = dateMMddFormat + " " + VO2MaxDataUtil.getLevelString(level);
            } else {
                str = dateMMddFormat;
            }
            return new TrainingIndexDataItem(dailyVo2MaxReport.getTime(), null, HomeDataType.V02_MAX, null, false, null, level - 1, String.valueOf(vo2Max), str, vo2MaxLevelItems, ResourceExtKt.getString(c0j.Ko), ResourceExtKt.getString(c0j.Jo), 42, null);
        }
        if (i == 2) {
            TrainingLoadDataUtil trainingLoadDataUtil = TrainingLoadDataUtil.INSTANCE;
            List<LevelBarView.LevelItem> trainLoadLevelList = trainingLoadDataUtil.getTrainLoadLevelList();
            DailyTrainingLoadReport dailyTrainingLoadReport = (DailyTrainingLoadReport) report;
            int trainingLoadLevel = dailyTrainingLoadReport.getTrainingLoadLevel();
            int wtlSum = dailyTrainingLoadReport.getWtlSum();
            String trainingLoadGradeShortTitle = trainingLoadDataUtil.getTrainingLoadGradeShortTitle(ApplicationExtKt.getApplication(), trainingLoadLevel);
            String string = ApplicationExtKt.getApplication().getResources().getString(c0j.n9, trainingLoadGradeShortTitle);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Logger.d(TAG, "getTrainingLoadLevel level=" + trainingLoadLevel + " levelStr=" + trainingLoadGradeShortTitle);
            return new TrainingIndexDataItem(dailyTrainingLoadReport.getTime(), null, HomeDataType.TRAINING_LOAD, null, false, null, trainingLoadLevel - 1, String.valueOf(wtlSum), dailyTrainingLoadReport.getWtlSum() >= 0 ? string : "", trainLoadLevelList, ResourceExtKt.getString(c0j.l8), ResourceExtKt.getString(c0j.n8), 42, null);
        }
        if (i != 3) {
            return new TrainingIndexDataItem(report.getTime(), null, HomeDataType.V02_MAX, null, true, null, 0, null, null, null, "", "", 1002, null);
        }
        RunningIndicatorUtil runningIndicatorUtil = RunningIndicatorUtil.INSTANCE;
        List<LevelBarView.LevelItem> runningAbilityIndicatorLevelItems = runningIndicatorUtil.getRunningAbilityIndicatorLevelItems();
        DailyRunningIndicatorReport dailyRunningIndicatorReport = (DailyRunningIndicatorReport) report;
        RunningIndicatorItem latestItem4 = dailyRunningIndicatorReport.getLatestItem();
        String dateMMddFormat2 = TimeDateUtil.getDateMMddFormat(latestItem4 != null ? latestItem4.getTime() : 0L);
        RunningIndicatorItem latestItem5 = dailyRunningIndicatorReport.getLatestItem();
        Object objValueOf = latestItem5 != null ? Float.valueOf(latestItem5.getRunningIndicator()) : null;
        if (objValueOf == null) {
            return new TrainingIndexDataItem(dailyRunningIndicatorReport.getTime(), null, HomeDataType.RUNNING_INDICATOR, null, true, null, 0, null, null, null, ResourceExtKt.getString(c0j.zc), ResourceExtKt.getString(c0j.xc), 1002, null);
        }
        if (latestItem4 != null && (runningIndicatorLevel = latestItem4.getRunningIndicatorLevel()) != null) {
            level = runningIndicatorLevel.intValue();
        }
        return new TrainingIndexDataItem(dailyRunningIndicatorReport.getTime(), null, HomeDataType.RUNNING_INDICATOR, null, false, null, level - 1, String.valueOf(objValueOf), dateMMddFormat2 + " " + runningIndicatorUtil.getRunningAbilityLevelName(Integer.valueOf(level)), runningAbilityIndicatorLevelItems, ResourceExtKt.getString(c0j.zc), ResourceExtKt.getString(c0j.xc), 42, null);
    }

    public final void saveHealthDataSettingToCloud(@NotNull List<? extends km5> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        HealthDataSetting healthDataSetting = new HealthDataSetting();
        List<HealthData> healthdatalist = healthDataSetting.getHealthdatalist();
        List<HealthData> healthmanuallist = healthDataSetting.getHealthmanuallist();
        Iterator<? extends km5> it = dataList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            km5 next = it.next();
            String strConvertToDataTypeStr$health_chinaProductRelease = convertToDataTypeStr$health_chinaProductRelease(next.f23979b);
            if (strConvertToDataTypeStr$health_chinaProductRelease != null) {
                boolean z = next.e >= 0;
                if (z) {
                    healthdatalist.add(createHealthData$default(INSTANCE, strConvertToDataTypeStr$health_chinaProductRelease, null, 2, null));
                }
                if (next.l) {
                    healthmanuallist.add(INSTANCE.createHealthData(strConvertToDataTypeStr$health_chinaProductRelease, Boolean.valueOf(z)));
                }
            }
        }
        FitnessLogUtils.i(TAG, "save cloud healthData(" + healthdatalist + "), manualData(" + healthmanuallist + ")");
        DeviceSettingManager.INSTANCE.getInstance().sendUserSettingItem(DeviceSettingConfigKey.KEY_HEALTH_DATA, healthDataSetting, false);
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            return;
        }
        manualDataTypeList = healthmanuallist;
    }
}
