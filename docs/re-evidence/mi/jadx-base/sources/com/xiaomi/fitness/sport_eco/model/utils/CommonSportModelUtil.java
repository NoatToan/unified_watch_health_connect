package com.xiaomi.fitness.sport_eco.model.utils;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import com.mi.health.course.export.CourseApiKt;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.heartrate.finger.CustomizedFingerprintAcquiredInfo;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport_eco.utils.SportUtilsExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.fitness.sport_eco_manager_export.data.IntervalSportTarget;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportTarget;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.utils.HrZoneLevelUtil;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.ayi;
import defpackage.e1j;
import defpackage.j7r;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0015\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ(\u0010!\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002Jb\u0010\"\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0007J \u0010'\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J4\u0010(\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001cH\u0003J(\u0010)\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002JT\u0010*\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u001cH\u0003J(\u00100\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J(\u00101\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0018\u00102\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J(\u00103\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J4\u00104\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007J&\u00105\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u001e\u00106\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u001e\u00107\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J,\u00108\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001cH\u0003J(\u00109\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J \u0010:\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J \u0010;\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J,\u0010<\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J(\u0010=\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J \u0010>\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J \u0010?\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u001e\u0010@\u001a\u00020\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010A\u001a\u00020 H\u0002J\u0006\u0010B\u001a\u00020-J\u000e\u0010C\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010D\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010E\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010F\u001a\u00020\u00112\n\u0010G\u001a\u00020H\"\u00020\u001cH\u0007J\u0006\u0010I\u001a\u00020\u0011R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/model/utils/CommonSportModelUtil;", "", "<init>", "()V", TSMAuthContants.PARAM_RESOURCE, "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "Landroid/content/res/Resources;", "userProfile", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "mDurationFormat", "Ljava/text/SimpleDateFormat;", "getMDurationFormat", "()Ljava/text/SimpleDateFormat;", "mDurationFormat$delegate", "Lkotlin/Lazy;", "deviceDid", "", "buildTitle", "", "map", "", "Lcom/xiaomi/fitness/sport_eco/model/CommonSportModel$SportTitle;", "phoneSportData", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "sportGoalValue", "", "sportGoalType", "", DailyRecordKey.sportType, "list", "", "Lcom/xiaomi/fitness/sport_eco/bean/SportingItemData;", "buildIndoorData", "buildJumpTitle", "jumpIntervalTargetArr", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/IntervalSportTarget;", "trainingMode", "buildFreeJumpData", "buildTargetJumpTitle", "buildTargetJumpData", "buildIntervalJumpTitle", "restGoalValue", "isSportRest", "", "restDuration", "group", "buildIntervalJumpData", "buildIndoorRidingData", "getPaceOrSpeed", "buildData", "buildDistanceTitle", "buildDistanceData", "buildIndoorDistanceData", "buildIndoorRidingDistanceData", "buildCalTitle", "buildCalData", "buildCalIndoorData", "buildCalIndoorRidingData", "buildDurationTitle", "buildDurationData", "buildDurationIndoorData", "buildDurationIndoorRidingData", "addHr", "hr", "curSportIsShowDeviceData", "getDistance", "buildHrSportingItemData", "getDeviceConnectInfo", "getCourse30Tag", "types", "", "getJumpDeviceConnectInfo", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonSportModelUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonSportModelUtil.kt\ncom/xiaomi/fitness/sport_eco/model/utils/CommonSportModelUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1157:1\n1#2:1158\n*E\n"})
public final class CommonSportModelUtil {

    @NotNull
    public static final CommonSportModelUtil INSTANCE;

    @NotNull
    private static String deviceDid;

    /* JADX INFO: renamed from: mDurationFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mDurationFormat;
    private static final Resources resource;

    @Nullable
    private static UserProfile userProfile;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.model.utils.CommonSportModelUtil$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.model.utils.CommonSportModelUtil$1", f = "CommonSportModelUtil.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.model.utils.CommonSportModelUtil$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.model.utils.CommonSportModelUtil$1$1", f = "CommonSportModelUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserProfile>, Object> {
            int label;

            public C07861(Continuation<? super C07861> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07861(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserProfile> continuation) {
                return ((C07861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UserProfile.RecordMaxHrm recordMaxHrm;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            Integer numBoxInt = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CommonSportModelUtil commonSportModelUtil = CommonSportModelUtil.INSTANCE;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07861 c07861 = new C07861(null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, c07861, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CommonSportModelUtil.userProfile = (UserProfile) obj;
            UserProfile userProfile = CommonSportModelUtil.userProfile;
            if (userProfile != null && (recordMaxHrm = userProfile.getRecordMaxHrm()) != null) {
                numBoxInt = Boxing.boxInt(recordMaxHrm.getHrm());
            }
            FitnessLogUtils.i("CommonSportModelUtil", "HRM :" + numBoxInt);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HrZoneLevelUtil.HrZoneLevel.values().length];
            try {
                iArr[HrZoneLevelUtil.HrZoneLevel.smooth.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HrZoneLevelUtil.HrZoneLevel.warmUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HrZoneLevelUtil.HrZoneLevel.fatBurning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HrZoneLevelUtil.HrZoneLevel.aerobic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HrZoneLevelUtil.HrZoneLevel.anaerobic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HrZoneLevelUtil.HrZoneLevel.extreme.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.model.utils.CommonSportModelUtil$buildHrSportingItemData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.model.utils.CommonSportModelUtil$buildHrSportingItemData$1", f = "CommonSportModelUtil.kt", i = {}, l = {CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_INVALID_DATA}, m = "invokeSuspend", n = {}, s = {})
    public static final class C31201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.model.utils.CommonSportModelUtil$buildHrSportingItemData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.model.utils.CommonSportModelUtil$buildHrSportingItemData$1$1", f = "CommonSportModelUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserProfile>, Object> {
            int label;

            public C07871(Continuation<? super C07871> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07871(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserProfile> continuation) {
                return ((C07871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C31201(Continuation<? super C31201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31201(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UserProfile.RecordMaxHrm recordMaxHrm;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            Integer numBoxInt = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CommonSportModelUtil commonSportModelUtil = CommonSportModelUtil.INSTANCE;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07871 c07871 = new C07871(null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, c07871, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CommonSportModelUtil.userProfile = (UserProfile) obj;
            UserProfile userProfile = CommonSportModelUtil.userProfile;
            if (userProfile != null && (recordMaxHrm = userProfile.getRecordMaxHrm()) != null) {
                numBoxInt = Boxing.boxInt(recordMaxHrm.getHrm());
            }
            FitnessLogUtils.i("CommonSportModelUtil", "buildHrSportingItemData ,HRM :" + numBoxInt);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        CommonSportModelUtil commonSportModelUtil = new CommonSportModelUtil();
        INSTANCE = commonSportModelUtil;
        resource = AppUtil.getApp().getResources();
        mDurationFormat = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: y74
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommonSportModelUtil.mDurationFormat_delegate$lambda$0();
            }
        });
        deviceDid = "";
        commonSportModelUtil.getMDurationFormat().setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        ScopeExtKt.scope$default(null, new AnonymousClass1(null), 1, null);
    }

    private CommonSportModelUtil() {
    }

    private final void addHr(final List<SportingItemData> list, final SportingItemData hr) {
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected() && curSportIsShowDeviceData()) {
            IEcoSportRemoteState.Companion companion = IEcoSportRemoteState.INSTANCE;
            if (SportEcoManagerExtKt.getInstance(companion).getAppLaunchType() != 2) {
                SportEcoManagerExtKt.getInstance(companion).isSupportLaunchSport(1, new j7r() { // from class: a84
                    @Override // defpackage.j7r
                    public final void a(Boolean bool) {
                        CommonSportModelUtil.addHr$lambda$7(list, hr, bool);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addHr$lambda$7(List list, SportingItemData hr, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(hr, "$hr");
        if (bool.booleanValue()) {
            list.add(hr);
        }
    }

    private final void buildCalData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType) {
        SimpleDateFormat mDurationFormat2 = getMDurationFormat();
        Integer numValueOf = phoneSportData != null ? Integer.valueOf(phoneSportData.duration) : null;
        Intrinsics.checkNotNull(numValueOf);
        String str = mDurationFormat2.format(new Date(((long) numValueOf.intValue()) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        SportingItemData sportingItemData = new SportingItemData(str, resource.getString(e1j.D0), null, 4, null);
        SportingItemData distance = getDistance(phoneSportData);
        SportingItemData paceOrSpeed = getPaceOrSpeed(sportType, phoneSportData);
        SportingItemData sportingItemDataBuildHrSportingItemData = buildHrSportingItemData(phoneSportData);
        list.add(sportingItemData);
        list.add(distance);
        list.add(paceOrSpeed);
        addHr(list, sportingItemDataBuildHrSportingItemData);
    }

    private final void buildCalIndoorData(PhoneSportData phoneSportData, List<SportingItemData> list) {
        SimpleDateFormat mDurationFormat2 = getMDurationFormat();
        Integer numValueOf = phoneSportData != null ? Integer.valueOf(phoneSportData.duration) : null;
        Intrinsics.checkNotNull(numValueOf);
        String str = mDurationFormat2.format(new Date(((long) numValueOf.intValue()) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Resources resources = resource;
        SportingItemData sportingItemData = new SportingItemData(str, resources.getString(e1j.D0), null, 4, null);
        SportingItemData distance = getDistance(phoneSportData);
        SportingItemData sportingItemData2 = new SportingItemData(TimeDateUtil.getSportPaceStrWithSecDef(phoneSportData.pace), resources.getString(e1j.x2), null, 4, null);
        SportingItemData sportingItemData3 = new SportingItemData(String.valueOf(phoneSportData.step), resources.getString(e1j.t4), null, 4, null);
        SportingItemData sportingItemData4 = new SportingItemData(String.valueOf((int) (phoneSportData.stepRate * 60)), resources.getString(e1j.u4), null, 4, null);
        SportingItemData sportingItemDataBuildHrSportingItemData = buildHrSportingItemData(phoneSportData);
        list.add(sportingItemData);
        list.add(distance);
        list.add(sportingItemData2);
        list.add(sportingItemData3);
        list.add(sportingItemData4);
        addHr(list, sportingItemDataBuildHrSportingItemData);
    }

    private final void buildCalIndoorRidingData(PhoneSportData phoneSportData, List<SportingItemData> list) {
        SimpleDateFormat mDurationFormat2 = getMDurationFormat();
        Integer numValueOf = phoneSportData != null ? Integer.valueOf(phoneSportData.duration) : null;
        Intrinsics.checkNotNull(numValueOf);
        String str = mDurationFormat2.format(new Date(((long) numValueOf.intValue()) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        SportingItemData sportingItemData = new SportingItemData(str, resource.getString(e1j.D0), null, 4, null);
        SportingItemData distance = getDistance(phoneSportData);
        SportingItemData sportingItemData2 = new SportingItemData(String.valueOf(phoneSportData.bike_rpm), "RPM", null, 4, null);
        SportingItemData sportingItemData3 = new SportingItemData(String.valueOf(phoneSportData.bike_power), AppUtil.getApp().getString(e1j.W2), null, 4, null);
        SportingItemData sportingItemData4 = new SportingItemData(String.valueOf(phoneSportData.bike_resistance_level), AppUtil.getApp().getString(e1j.R2), null, 4, null);
        SportingItemData sportingItemDataBuildHrSportingItemData = buildHrSportingItemData(phoneSportData);
        list.add(sportingItemData);
        list.add(distance);
        list.add(sportingItemData2);
        list.add(sportingItemData3);
        list.add(sportingItemData4);
        addHr(list, sportingItemDataBuildHrSportingItemData);
    }

    @SuppressLint({"StringFormatMatches"})
    private final void buildCalTitle(Map<CommonSportModel.SportTitle, String> map, PhoneSportData phoneSportData, int sportGoalValue) {
        map.put(CommonSportModel.SportTitle.majorData, String.valueOf((int) (phoneSportData.calorie / 1000)));
        CommonSportModel.SportTitle sportTitle = CommonSportModel.SportTitle.progressDetail;
        Resources resources = resource;
        map.put(sportTitle, resources.getString(e1j.B4, Integer.valueOf(sportGoalValue)));
        float f = ((phoneSportData.calorie / 1000.0f) / sportGoalValue) * 100;
        int i = f < 100.0f ? (int) f : 100;
        map.put(CommonSportModel.SportTitle.progressPercentage, i + "%");
        map.put(CommonSportModel.SportTitle.progressValue, String.valueOf(i));
        map.put(CommonSportModel.SportTitle.unit, resources.getString(e1j.a2));
    }

    private final void buildData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType) {
        Float fValueOf = phoneSportData != null ? Float.valueOf(phoneSportData.calorie) : null;
        Intrinsics.checkNotNull(fValueOf);
        String strValueOf = String.valueOf((int) (fValueOf.floatValue() / 1000));
        Resources resources = resource;
        SportingItemData sportingItemData = new SportingItemData(strValueOf, resources.getString(e1j.N), null, 4, null);
        SportingItemData paceOrSpeed = getPaceOrSpeed(sportType, phoneSportData);
        SportingItemData sportingItemDataBuildHrSportingItemData = buildHrSportingItemData(phoneSportData);
        String str = getMDurationFormat().format(new Date(((long) phoneSportData.duration) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        list.add(new SportingItemData(str, resources.getString(e1j.E4), null, 4, null));
        list.add(paceOrSpeed);
        list.add(sportingItemData);
        addHr(list, sportingItemDataBuildHrSportingItemData);
    }

    private final void buildDistanceData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType) {
        String str = getMDurationFormat().format(new Date(((long) phoneSportData.duration) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Resources resources = resource;
        SportingItemData sportingItemData = new SportingItemData(str, resources.getString(e1j.D0), null, 4, null);
        SportingItemData sportingItemData2 = new SportingItemData(String.valueOf((int) (phoneSportData.calorie / 1000)), resources.getString(e1j.N), null, 4, null);
        SportingItemData paceOrSpeed = getPaceOrSpeed(sportType, phoneSportData);
        SportingItemData sportingItemDataBuildHrSportingItemData = buildHrSportingItemData(phoneSportData);
        list.add(sportingItemData);
        list.add(sportingItemData2);
        list.add(paceOrSpeed);
        addHr(list, sportingItemDataBuildHrSportingItemData);
    }

    private final void buildDurationData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType) {
        Float fValueOf = phoneSportData != null ? Float.valueOf(phoneSportData.calorie) : null;
        Intrinsics.checkNotNull(fValueOf);
        SportingItemData sportingItemData = new SportingItemData(String.valueOf((int) (fValueOf.floatValue() / 1000)), resource.getString(e1j.N), null, 4, null);
        SportingItemData distance = getDistance(phoneSportData);
        SportingItemData paceOrSpeed = getPaceOrSpeed(sportType, phoneSportData);
        SportingItemData sportingItemDataBuildHrSportingItemData = buildHrSportingItemData(phoneSportData);
        list.add(sportingItemData);
        list.add(distance);
        list.add(paceOrSpeed);
        addHr(list, sportingItemDataBuildHrSportingItemData);
    }

    private final void buildDurationIndoorData(PhoneSportData phoneSportData, List<SportingItemData> list) {
        Float fValueOf = phoneSportData != null ? Float.valueOf(phoneSportData.calorie) : null;
        Intrinsics.checkNotNull(fValueOf);
        String strValueOf = String.valueOf((int) (fValueOf.floatValue() / 1000));
        Resources resources = resource;
        SportingItemData sportingItemData = new SportingItemData(strValueOf, resources.getString(e1j.N), null, 4, null);
        SportingItemData distance = getDistance(phoneSportData);
        SportingItemData sportingItemData2 = new SportingItemData(TimeDateUtil.getSportPaceStrWithSecDef(phoneSportData.pace), resources.getString(e1j.x2), null, 4, null);
        SportingItemData sportingItemData3 = new SportingItemData(String.valueOf(phoneSportData.step), resources.getString(e1j.t4), null, 4, null);
        SportingItemData sportingItemData4 = new SportingItemData(String.valueOf((int) (phoneSportData.stepRate * 60)), resources.getString(e1j.u4), null, 4, null);
        SportingItemData sportingItemDataBuildHrSportingItemData = buildHrSportingItemData(phoneSportData);
        list.add(sportingItemData);
        list.add(distance);
        list.add(sportingItemData2);
        list.add(sportingItemData3);
        list.add(sportingItemData4);
        addHr(list, sportingItemDataBuildHrSportingItemData);
    }

    private final void buildDurationIndoorRidingData(PhoneSportData phoneSportData, List<SportingItemData> list) {
        Float fValueOf = phoneSportData != null ? Float.valueOf(phoneSportData.calorie) : null;
        Intrinsics.checkNotNull(fValueOf);
        SportingItemData sportingItemData = new SportingItemData(String.valueOf((int) (fValueOf.floatValue() / 1000)), resource.getString(e1j.N), null, 4, null);
        SportingItemData distance = getDistance(phoneSportData);
        SportingItemData sportingItemData2 = new SportingItemData(String.valueOf(phoneSportData.bike_rpm), "RPM", null, 4, null);
        SportingItemData sportingItemData3 = new SportingItemData(String.valueOf(phoneSportData.bike_power), AppUtil.getApp().getString(e1j.W2), null, 4, null);
        SportingItemData sportingItemData4 = new SportingItemData(String.valueOf(phoneSportData.bike_resistance_level), AppUtil.getApp().getString(e1j.R2), null, 4, null);
        SportingItemData sportingItemDataBuildHrSportingItemData = buildHrSportingItemData(phoneSportData);
        list.add(sportingItemData);
        list.add(distance);
        list.add(sportingItemData2);
        list.add(sportingItemData3);
        list.add(sportingItemData4);
        addHr(list, sportingItemDataBuildHrSportingItemData);
    }

    private final void buildDurationTitle(Map<CommonSportModel.SportTitle, String> map, PhoneSportData phoneSportData, float sportGoalValue) {
        int i = (int) sportGoalValue;
        int i2 = i / 60;
        int i3 = i % 60;
        String str = (i2 >= 10 ? "" : "0") + i2 + ":" + (i3 >= 10 ? "" : "0") + i3 + ":00";
        map.put(CommonSportModel.SportTitle.majorData, getMDurationFormat().format(new Date(((long) phoneSportData.duration) * 1000)));
        map.put(CommonSportModel.SportTitle.progressDetail, str);
        int i4 = (int) ((phoneSportData.duration / (sportGoalValue * 60)) * 100);
        int i5 = i4 < 100 ? i4 : 100;
        map.put(CommonSportModel.SportTitle.progressPercentage, i5 + "%");
        map.put(CommonSportModel.SportTitle.progressValue, String.valueOf(i5));
    }

    private final void buildFreeJumpData(PhoneSportData phoneSportData, List<SportingItemData> list) {
        if (phoneSportData != null) {
            String str = INSTANCE.getMDurationFormat().format(new Date(((long) phoneSportData.jumpDuration) * 1000));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Resources resources = resource;
            SportingItemData sportingItemData = new SportingItemData(str, resources.getString(e1j.D0), null, 4, null);
            int i = (int) (phoneSportData.calorie / 1000);
            SportingItemData sportingItemData2 = new SportingItemData(String.valueOf(i), resources.getQuantityString(ayi.f, i), null, 4, null);
            String strValueOf = String.valueOf(phoneSportData.jumpFrequency);
            int i2 = ayi.e;
            int i3 = phoneSportData.jumpFrequency;
            SportingItemData sportingItemData3 = new SportingItemData(strValueOf, resources.getQuantityString(i2, i3, Integer.valueOf(i3)), null, 4, null);
            String strValueOf2 = String.valueOf(phoneSportData.stumbleCount);
            int i4 = ayi.j;
            int i5 = phoneSportData.stumbleCount;
            SportingItemData sportingItemData4 = new SportingItemData(strValueOf2, resources.getQuantityString(i4, i5, Integer.valueOf(i5)), null, 4, null);
            list.add(sportingItemData);
            list.add(sportingItemData2);
            list.add(sportingItemData3);
            list.add(sportingItemData4);
        }
    }

    private final SportingItemData buildHrSportingItemData(PhoneSportData phoneSportData) {
        UserProfile.RecordMaxHrm recordMaxHrm;
        if (userProfile == null) {
            ScopeExtKt.scope$default(null, new C31201(null), 1, null);
        }
        int i = phoneSportData.heart_rate;
        UserProfile userProfile2 = userProfile;
        HrZoneLevelUtil.HrZoneLevel heartRateZone = HrZoneLevelUtil.getHeartRateZone(i, (userProfile2 == null || (recordMaxHrm = userProfile2.getRecordMaxHrm()) == null) ? 0 : recordMaxHrm.getHrm());
        String string = "--";
        switch (heartRateZone == null ? -1 : WhenMappings.$EnumSwitchMapping$0[heartRateZone.ordinal()]) {
            case 2:
                string = resource.getString(e1j.M2);
                break;
            case 3:
                string = resource.getString(e1j.L2);
                break;
            case 4:
                string = resource.getString(e1j.I2);
                break;
            case 5:
                string = resource.getString(e1j.J2);
                break;
            case 6:
                string = resource.getString(e1j.K2);
                break;
        }
        return new SportingItemData(String.valueOf(phoneSportData.heart_rate), resource.getString(e1j.X1), string);
    }

    private final void buildIndoorData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType) {
        Float fValueOf = phoneSportData != null ? Float.valueOf(phoneSportData.calorie) : null;
        Intrinsics.checkNotNull(fValueOf);
        SportingItemData sportingItemData = new SportingItemData(String.valueOf((int) (fValueOf.floatValue() / 1000)), AppUtil.getApp().getResources().getString(e1j.N), null, 4, null);
        getDistance(phoneSportData);
        SportingItemData paceOrSpeed = getPaceOrSpeed(sportType, phoneSportData);
        String strValueOf = String.valueOf(phoneSportData.step);
        Resources resources = resource;
        SportingItemData sportingItemData2 = new SportingItemData(strValueOf, resources.getString(e1j.t4), null, 4, null);
        SportingItemData sportingItemData3 = new SportingItemData(String.valueOf((int) (phoneSportData.stepRate * 60)), resources.getString(e1j.u4), null, 4, null);
        String str = getMDurationFormat().format(new Date(((long) phoneSportData.duration) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        SportingItemData sportingItemData4 = new SportingItemData(str, resources.getString(e1j.E4), null, 4, null);
        SportingItemData sportingItemDataBuildHrSportingItemData = buildHrSportingItemData(phoneSportData);
        list.add(sportingItemData4);
        list.add(paceOrSpeed);
        list.add(sportingItemData);
        list.add(sportingItemData2);
        list.add(sportingItemData3);
        addHr(list, sportingItemDataBuildHrSportingItemData);
    }

    private final void buildIndoorDistanceData(PhoneSportData phoneSportData, List<SportingItemData> list) {
        String str = getMDurationFormat().format(new Date(((long) phoneSportData.duration) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Resources resources = resource;
        SportingItemData sportingItemData = new SportingItemData(str, resources.getString(e1j.D0), null, 4, null);
        SportingItemData sportingItemData2 = new SportingItemData(String.valueOf((int) (phoneSportData.calorie / 1000)), resources.getString(e1j.N), null, 4, null);
        SportingItemData sportingItemData3 = new SportingItemData(TimeDateUtil.getSportPaceStrWithSecDef(phoneSportData.pace), resources.getString(e1j.x2), null, 4, null);
        SportingItemData sportingItemData4 = new SportingItemData(String.valueOf(phoneSportData.step), resources.getString(e1j.t4), null, 4, null);
        SportingItemData sportingItemData5 = new SportingItemData(String.valueOf((int) (phoneSportData.stepRate * 60)), resources.getString(e1j.u4), null, 4, null);
        SportingItemData sportingItemDataBuildHrSportingItemData = buildHrSportingItemData(phoneSportData);
        list.add(sportingItemData);
        list.add(sportingItemData2);
        list.add(sportingItemData3);
        list.add(sportingItemData4);
        list.add(sportingItemData5);
        addHr(list, sportingItemDataBuildHrSportingItemData);
    }

    private final void buildIndoorRidingData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType) {
        Float fValueOf = phoneSportData != null ? Float.valueOf(phoneSportData.calorie) : null;
        Intrinsics.checkNotNull(fValueOf);
        SportingItemData sportingItemData = new SportingItemData(String.valueOf((int) (fValueOf.floatValue() / 1000)), AppUtil.getApp().getResources().getString(e1j.N), null, 4, null);
        SportingItemData sportingItemData2 = new SportingItemData(String.valueOf(phoneSportData.bike_rpm), "RPM", null, 4, null);
        SportingItemData sportingItemData3 = new SportingItemData(String.valueOf(phoneSportData.bike_power), AppUtil.getApp().getString(e1j.W2), null, 4, null);
        SportingItemData sportingItemData4 = new SportingItemData(String.valueOf(phoneSportData.bike_resistance_level), AppUtil.getApp().getString(e1j.R2), null, 4, null);
        String str = getMDurationFormat().format(new Date(((long) phoneSportData.duration) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        SportingItemData sportingItemData5 = new SportingItemData(str, resource.getString(e1j.E4), null, 4, null);
        SportingItemData sportingItemDataBuildHrSportingItemData = buildHrSportingItemData(phoneSportData);
        list.add(sportingItemData5);
        list.add(sportingItemData);
        list.add(sportingItemData3);
        list.add(sportingItemData4);
        list.add(sportingItemData2);
        addHr(list, sportingItemDataBuildHrSportingItemData);
    }

    private final void buildIndoorRidingDistanceData(PhoneSportData phoneSportData, List<SportingItemData> list) {
        String str = getMDurationFormat().format(new Date(((long) phoneSportData.duration) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Resources resources = resource;
        SportingItemData sportingItemData = new SportingItemData(str, resources.getString(e1j.D0), null, 4, null);
        SportingItemData sportingItemData2 = new SportingItemData(String.valueOf((int) (phoneSportData.calorie / 1000)), resources.getString(e1j.N), null, 4, null);
        SportingItemData sportingItemData3 = new SportingItemData(String.valueOf(phoneSportData.bike_rpm), "RPM", null, 4, null);
        SportingItemData sportingItemData4 = new SportingItemData(String.valueOf(phoneSportData.bike_power), AppUtil.getApp().getString(e1j.W2), null, 4, null);
        SportingItemData sportingItemData5 = new SportingItemData(String.valueOf(phoneSportData.bike_resistance_level), AppUtil.getApp().getString(e1j.R2), null, 4, null);
        SportingItemData sportingItemDataBuildHrSportingItemData = buildHrSportingItemData(phoneSportData);
        list.add(sportingItemData);
        list.add(sportingItemData2);
        list.add(sportingItemData3);
        list.add(sportingItemData4);
        list.add(sportingItemData5);
        addHr(list, sportingItemDataBuildHrSportingItemData);
    }

    private final void buildIntervalJumpData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportGoalType) {
        if (sportGoalType == 1) {
            if (phoneSportData != null) {
                String strValueOf = String.valueOf(phoneSportData.jumpCount);
                Resources resources = resource;
                SportingItemData sportingItemData = new SportingItemData(strValueOf, resources.getString(e1j.y3), null, 4, null);
                int i = (int) (phoneSportData.calorie / 1000);
                SportingItemData sportingItemData2 = new SportingItemData(String.valueOf(i), resources.getQuantityString(ayi.f, i), null, 4, null);
                String strValueOf2 = String.valueOf(phoneSportData.jumpFrequency);
                int i2 = ayi.e;
                int i3 = phoneSportData.jumpFrequency;
                SportingItemData sportingItemData3 = new SportingItemData(strValueOf2, resources.getQuantityString(i2, i3, Integer.valueOf(i3)), null, 4, null);
                String strValueOf3 = String.valueOf(phoneSportData.stumbleCount);
                int i4 = ayi.j;
                int i5 = phoneSportData.stumbleCount;
                SportingItemData sportingItemData4 = new SportingItemData(strValueOf3, resources.getQuantityString(i4, i5, Integer.valueOf(i5)), null, 4, null);
                list.add(sportingItemData);
                list.add(sportingItemData2);
                list.add(sportingItemData3);
                list.add(sportingItemData4);
                return;
            }
            return;
        }
        if (sportGoalType == 6 && phoneSportData != null) {
            String str = INSTANCE.getMDurationFormat().format(new Date(((long) phoneSportData.jumpDuration) * 1000));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Resources resources2 = resource;
            SportingItemData sportingItemData5 = new SportingItemData(str, resources2.getString(e1j.D0), null, 4, null);
            int i6 = (int) (phoneSportData.calorie / 1000);
            SportingItemData sportingItemData6 = new SportingItemData(String.valueOf(i6), resources2.getQuantityString(ayi.f, i6), null, 4, null);
            String strValueOf4 = String.valueOf(phoneSportData.jumpFrequency);
            int i7 = ayi.e;
            int i8 = phoneSportData.jumpFrequency;
            SportingItemData sportingItemData7 = new SportingItemData(strValueOf4, resources2.getQuantityString(i7, i8, Integer.valueOf(i8)), null, 4, null);
            String strValueOf5 = String.valueOf(phoneSportData.stumbleCount);
            int i9 = ayi.j;
            int i10 = phoneSportData.stumbleCount;
            SportingItemData sportingItemData8 = new SportingItemData(strValueOf5, resources2.getQuantityString(i9, i10, Integer.valueOf(i10)), null, 4, null);
            list.add(sportingItemData6);
            list.add(sportingItemData5);
            list.add(sportingItemData7);
            list.add(sportingItemData8);
        }
    }

    @SuppressLint({"StringFormatMatches"})
    private final void buildIntervalJumpTitle(Map<CommonSportModel.SportTitle, String> map, PhoneSportData phoneSportData, int sportGoalType, int sportGoalValue, int restGoalValue, boolean isSportRest, int restDuration, int group) {
        int i;
        int i2;
        int i3 = sportGoalValue;
        if (sportGoalType == 1) {
            if (isSportRest) {
                i3 = restGoalValue;
                i = restDuration;
            } else {
                i = phoneSportData.jumpDuration - ((i3 + restGoalValue) * group);
                if (i < 0) {
                    i = 0;
                }
            }
            int i4 = i3 / 3600;
            int i5 = i3 / 60;
            int i6 = i3 % 60;
            String str = (i4 >= 10 ? "" : "0") + i4 + ":" + (i5 >= 10 ? "" : "0") + i5 + ":" + (i6 >= 10 ? "" : "0") + i6;
            map.put(CommonSportModel.SportTitle.majorData, getMDurationFormat().format(new Date(((long) i) * 1000)));
            map.put(CommonSportModel.SportTitle.progressDetail, resource.getString(e1j.Q3, str));
            float f = (i / i3) * 100;
            i2 = f < 100.0f ? (int) f : 100;
            map.put(CommonSportModel.SportTitle.progressPercentage, i2 + "%");
            map.put(CommonSportModel.SportTitle.progressValue, String.valueOf(i2));
            return;
        }
        if (sportGoalType != 6) {
            return;
        }
        if (!isSportRest) {
            int i7 = phoneSportData.jumpCount - (group * i3);
            map.put(CommonSportModel.SportTitle.majorData, String.valueOf(i7));
            CommonSportModel.SportTitle sportTitle = CommonSportModel.SportTitle.unit;
            Resources resources = resource;
            map.put(sportTitle, resources.getQuantityString(ayi.m, i7, ""));
            map.put(CommonSportModel.SportTitle.progressDetail, resources.getString(e1j.R3, Integer.valueOf(sportGoalValue)));
            float f2 = (i7 / i3) * 100;
            i2 = f2 < 100.0f ? (int) f2 : 100;
            map.put(CommonSportModel.SportTitle.progressPercentage, i2 + "%");
            map.put(CommonSportModel.SportTitle.progressValue, String.valueOf(i2));
            return;
        }
        int i8 = restGoalValue / 3600;
        int i9 = restGoalValue / 60;
        int i10 = restGoalValue % 60;
        String str2 = (i8 >= 10 ? "" : "0") + i8 + ":" + (i9 >= 10 ? "" : "0") + i9 + ":" + (i10 >= 10 ? "" : "0") + i10;
        map.put(CommonSportModel.SportTitle.majorData, getMDurationFormat().format(new Date(((long) restDuration) * 1000)));
        map.put(CommonSportModel.SportTitle.unit, "");
        map.put(CommonSportModel.SportTitle.progressDetail, resource.getString(e1j.Q3, str2));
        float f3 = (restDuration / restGoalValue) * 100;
        i2 = f3 < 100.0f ? (int) f3 : 100;
        map.put(CommonSportModel.SportTitle.progressPercentage, i2 + "%");
        map.put(CommonSportModel.SportTitle.progressValue, String.valueOf(i2));
    }

    private final void buildTargetJumpData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportGoalType) {
        if (sportGoalType == 1) {
            if (phoneSportData != null) {
                int i = (int) (phoneSportData.calorie / 1000);
                String strValueOf = String.valueOf(i);
                Resources resources = resource;
                SportingItemData sportingItemData = new SportingItemData(strValueOf, resources.getQuantityString(ayi.f, i), null, 4, null);
                SportingItemData sportingItemData2 = new SportingItemData(String.valueOf(phoneSportData.jumpCount), resources.getString(e1j.y3), null, 4, null);
                String strValueOf2 = String.valueOf(phoneSportData.jumpFrequency);
                int i2 = ayi.e;
                int i3 = phoneSportData.jumpFrequency;
                SportingItemData sportingItemData3 = new SportingItemData(strValueOf2, resources.getQuantityString(i2, i3, Integer.valueOf(i3)), null, 4, null);
                String strValueOf3 = String.valueOf(phoneSportData.stumbleCount);
                int i4 = ayi.j;
                int i5 = phoneSportData.stumbleCount;
                SportingItemData sportingItemData4 = new SportingItemData(strValueOf3, resources.getQuantityString(i4, i5, Integer.valueOf(i5)), null, 4, null);
                list.add(sportingItemData);
                list.add(sportingItemData2);
                list.add(sportingItemData3);
                list.add(sportingItemData4);
                return;
            }
            return;
        }
        if (sportGoalType == 2) {
            if (phoneSportData != null) {
                String str = INSTANCE.getMDurationFormat().format(new Date(((long) phoneSportData.jumpDuration) * 1000));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                Resources resources2 = resource;
                SportingItemData sportingItemData5 = new SportingItemData(str, resources2.getString(e1j.D0), null, 4, null);
                SportingItemData sportingItemData6 = new SportingItemData(String.valueOf(phoneSportData.jumpCount), resources2.getString(e1j.y3), null, 4, null);
                String strValueOf4 = String.valueOf(phoneSportData.jumpFrequency);
                int i6 = ayi.e;
                int i7 = phoneSportData.jumpFrequency;
                SportingItemData sportingItemData7 = new SportingItemData(strValueOf4, resources2.getQuantityString(i6, i7, Integer.valueOf(i7)), null, 4, null);
                String strValueOf5 = String.valueOf(phoneSportData.stumbleCount);
                int i8 = ayi.j;
                int i9 = phoneSportData.stumbleCount;
                SportingItemData sportingItemData8 = new SportingItemData(strValueOf5, resources2.getQuantityString(i8, i9, Integer.valueOf(i9)), null, 4, null);
                list.add(sportingItemData5);
                list.add(sportingItemData6);
                list.add(sportingItemData7);
                list.add(sportingItemData8);
                return;
            }
            return;
        }
        if (sportGoalType == 6 && phoneSportData != null) {
            String str2 = INSTANCE.getMDurationFormat().format(new Date(((long) phoneSportData.jumpDuration) * 1000));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            Resources resources3 = resource;
            SportingItemData sportingItemData9 = new SportingItemData(str2, resources3.getString(e1j.D0), null, 4, null);
            int i10 = (int) (phoneSportData.calorie / 1000);
            SportingItemData sportingItemData10 = new SportingItemData(String.valueOf(i10), resources3.getQuantityString(ayi.f, i10), null, 4, null);
            String strValueOf6 = String.valueOf(phoneSportData.jumpFrequency);
            int i11 = ayi.e;
            int i12 = phoneSportData.jumpFrequency;
            SportingItemData sportingItemData11 = new SportingItemData(strValueOf6, resources3.getQuantityString(i11, i12, Integer.valueOf(i12)), null, 4, null);
            String strValueOf7 = String.valueOf(phoneSportData.stumbleCount);
            int i13 = ayi.j;
            int i14 = phoneSportData.stumbleCount;
            SportingItemData sportingItemData12 = new SportingItemData(strValueOf7, resources3.getQuantityString(i13, i14, Integer.valueOf(i14)), null, 4, null);
            list.add(sportingItemData9);
            list.add(sportingItemData10);
            list.add(sportingItemData11);
            list.add(sportingItemData12);
        }
    }

    @SuppressLint({"StringFormatMatches"})
    private final void buildTargetJumpTitle(Map<CommonSportModel.SportTitle, String> map, PhoneSportData phoneSportData, int sportGoalType, int sportGoalValue) {
        int i;
        if (sportGoalType == 1) {
            int i2 = sportGoalValue / 60;
            int i3 = sportGoalValue % 60;
            String str = (i2 >= 10 ? "" : "0") + i2 + ":" + (i3 < 10 ? "0" : "") + i3 + ":00";
            map.put(CommonSportModel.SportTitle.majorData, getMDurationFormat().format(new Date(((long) phoneSportData.jumpDuration) * 1000)));
            map.put(CommonSportModel.SportTitle.progressDetail, str);
            float f = (phoneSportData.jumpDuration / (sportGoalValue * 60)) * 100;
            i = f < 100.0f ? (int) f : 100;
            map.put(CommonSportModel.SportTitle.progressPercentage, i + "%");
            map.put(CommonSportModel.SportTitle.progressValue, String.valueOf(i));
            return;
        }
        if (sportGoalType == 2) {
            int i4 = (int) (phoneSportData.calorie / 1000);
            map.put(CommonSportModel.SportTitle.majorData, String.valueOf(i4));
            CommonSportModel.SportTitle sportTitle = CommonSportModel.SportTitle.unit;
            Resources resources = resource;
            map.put(sportTitle, resources.getQuantityString(ayi.f, i4));
            map.put(CommonSportModel.SportTitle.progressDetail, resources.getQuantityString(ayi.f3582k, sportGoalValue, Integer.valueOf(sportGoalValue)));
            float f2 = ((phoneSportData.calorie / 1000.0f) / sportGoalValue) * 100;
            i = f2 < 100.0f ? (int) f2 : 100;
            map.put(CommonSportModel.SportTitle.progressPercentage, i + "%");
            map.put(CommonSportModel.SportTitle.progressValue, String.valueOf(i));
            return;
        }
        if (sportGoalType != 6) {
            return;
        }
        map.put(CommonSportModel.SportTitle.majorData, String.valueOf(phoneSportData.jumpCount));
        CommonSportModel.SportTitle sportTitle2 = CommonSportModel.SportTitle.unit;
        Resources resources2 = resource;
        map.put(sportTitle2, resources2.getQuantityString(ayi.m, phoneSportData.jumpCount, ""));
        map.put(CommonSportModel.SportTitle.progressDetail, resources2.getString(e1j.R3, Integer.valueOf(sportGoalValue)));
        float f3 = (phoneSportData.jumpCount / sportGoalValue) * 100;
        i = f3 < 100.0f ? (int) f3 : 100;
        map.put(CommonSportModel.SportTitle.progressPercentage, i + "%");
        map.put(CommonSportModel.SportTitle.progressValue, String.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v20, types: [T, java.lang.String] */
    private final String getDeviceConnectInfo(String deviceDid2) {
        String name;
        EcoDeviceInfo deviceInfo;
        String name2;
        EcoDeviceInfo deviceInfo2;
        String string;
        EcoDeviceInfo deviceInfo3;
        SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
        FitnessLogUtils.i("CommonSportModelUtil", "getDeviceConnectInfo model ,00 :" + sportManagerExportPreference.getKEY_GYM_LOCAL_SPORT_TYPE());
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        FitnessLogUtils.i("CommonSportModelUtil", "getDeviceConnectInfo ,01 :" + EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(sportManagerExportPreference.getKEY_GYM_LOCAL_SPORT_TYPE()));
        FitnessLogUtils.i("CommonSportModelUtil", "getDeviceConnectInfo ,02 :" + EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        IEcoSportRemoteState.Companion companion2 = IEcoSportRemoteState.INSTANCE;
        if (SportEcoManagerExtKt.getInstance(companion2).getAppLaunchType() == 6 || SportEcoManagerExtKt.getInstance(companion2).getAppLaunchType() == 7) {
            EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("ksmb.treadmill.m1v1");
            if (localDeviceModel != null && localDeviceModel.getIsDeviceConnected()) {
                Object obj = objectRef.element;
                EcoDeviceModel localDeviceModel2 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("ksmb.treadmill.m1v1");
                if (localDeviceModel2 == null || (deviceInfo3 = localDeviceModel2.getDeviceInfo()) == null || (string = deviceInfo3.getName()) == null) {
                    string = resource.getString(e1j.U1);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                objectRef.element = obj + string;
            }
            EcoDeviceModel localDeviceModel3 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("runmi.exbike.jscrm1");
            if (localDeviceModel3 != null && localDeviceModel3.getIsDeviceConnected()) {
                Object obj2 = objectRef.element;
                EcoDeviceModel localDeviceModel4 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("runmi.exbike.jscrm1");
                if (localDeviceModel4 == null || (deviceInfo2 = localDeviceModel4.getDeviceInfo()) == null || (name2 = deviceInfo2.getName()) == null) {
                    name2 = "健身车 | " + resource.getString(e1j.c0);
                }
                objectRef.element = obj2 + name2;
            }
            EcoDeviceModel localDeviceModel5 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("yesoul.exbike.jsc01y");
            if (localDeviceModel5 != null && localDeviceModel5.getIsDeviceConnected()) {
                Object obj3 = objectRef.element;
                EcoDeviceModel localDeviceModel6 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("yesoul.exbike.jsc01y");
                if (localDeviceModel6 == null || (deviceInfo = localDeviceModel6.getDeviceInfo()) == null || (name = deviceInfo.getName()) == null) {
                    name = "健身车 | " + resource.getString(e1j.c0);
                }
                objectRef.element = obj3 + name;
            }
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected()) {
            SportEcoManagerExtKt.getInstance(companion2).isSupportLaunchSport(1, new j7r() { // from class: w74
                @Override // defpackage.j7r
                public final void a(Boolean bool) {
                    CommonSportModelUtil.getDeviceConnectInfo$lambda$8(objectRef, bool);
                }
            });
        }
        return (String) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v12, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, java.lang.String] */
    public static final void getDeviceConnectInfo$lambda$8(Ref.ObjectRef connectTitle, Boolean bool) {
        EcoDeviceInfo deviceInfo;
        String name;
        Intrinsics.checkNotNullParameter(connectTitle, "$connectTitle");
        if (bool.booleanValue() && INSTANCE.curSportIsShowDeviceData()) {
            if (!StringsKt__StringsKt.isBlank((CharSequence) connectTitle.element)) {
                connectTitle.element = connectTitle.element + " | ";
            }
            Object obj = connectTitle.element;
            EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getCurrentDeviceModel();
            connectTitle.element = obj + ((ecoDeviceModel == null || (deviceInfo = ecoDeviceModel.getDeviceInfo()) == null || (name = deviceInfo.getName()) == null) ? null : StringsKt__StringsKt.trim((CharSequence) name).toString());
        }
    }

    private final SimpleDateFormat getMDurationFormat() {
        return (SimpleDateFormat) mDurationFormat.getValue();
    }

    private final SportingItemData getPaceOrSpeed(int sportType, PhoneSportData phoneSportData) {
        if (sportType != 6) {
            return new SportingItemData(TimeDateUtil.getSportPaceStrWithSecDef(phoneSportData.pace), AppUtil.getApp().getResources().getString(e1j.w0), null, 4, null);
        }
        int i = phoneSportData.pace;
        float f = i == 0 ? 0.0f : i / 1000;
        if (f == 0.0f) {
            return new SportingItemData("--", resource.getString(e1j.o4), null, 4, null);
        }
        float f2 = 3.6f / f;
        float f3 = 100;
        float fRound = Math.round(f2 * f3) / f3;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(fRound)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new SportingItemData(str, resource.getString(e1j.o4), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat mDurationFormat_delegate$lambda$0() {
        return new SimpleDateFormat(StringUtils.EXPECT_TIME_FORMAT);
    }

    @SuppressLint({"StringFormatMatches"})
    public final void buildDistanceTitle(@NotNull Map<CommonSportModel.SportTitle, String> map, @NotNull PhoneSportData phoneSportData, float sportGoalValue, int sportType) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(phoneSportData, "phoneSportData");
        map.put(CommonSportModel.SportTitle.majorData, getDistance(phoneSportData).getData());
        CommonSportModel.SportTitle sportTitle = CommonSportModel.SportTitle.progressDetail;
        Resources resources = resource;
        map.put(sportTitle, resources.getString(e1j.C4, Float.valueOf(sportGoalValue)));
        int i = (int) (((phoneSportData.distance / 1000.0f) / sportGoalValue) * 100);
        int i2 = i < 100 ? i : 100;
        map.put(CommonSportModel.SportTitle.progressPercentage, i2 + "%");
        map.put(CommonSportModel.SportTitle.progressValue, String.valueOf(i2));
        FitnessLogUtils.d("CommonSportModelUtil", "sportGoalValue : " + sportGoalValue + " , percent : " + i2);
        int i3 = phoneSportData.distance;
        if (i3 < 1000) {
            String quantityString = resources.getQuantityString(ayi.o, i3);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            map.put(CommonSportModel.SportTitle.unit, quantityString);
        } else {
            String quantityString2 = resources.getQuantityString(ayi.n, i3 / 1000);
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            map.put(CommonSportModel.SportTitle.unit, quantityString2);
        }
    }

    @SuppressLint({"StringFormatMatches"})
    public final void buildJumpTitle(@NotNull Map<CommonSportModel.SportTitle, String> map, @NotNull PhoneSportData phoneSportData, float sportGoalValue, int sportGoalType, @Nullable ArrayList<IntervalSportTarget> jumpIntervalTargetArr, int sportType, int trainingMode, @NotNull List<SportingItemData> list) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(phoneSportData, "phoneSportData");
        Intrinsics.checkNotNullParameter(list, "list");
        map.put(CommonSportModel.SportTitle.SportType, ResourceExtKt.getString(SportUtilsExtKt.getSportTypeStr(sportType)));
        map.put(CommonSportModel.SportTitle.connectDevice, getJumpDeviceConnectInfo());
        if (trainingMode == 0) {
            map.put(CommonSportModel.SportTitle.majorData, String.valueOf(phoneSportData.jumpCount));
            map.put(CommonSportModel.SportTitle.unit, resource.getQuantityString(ayi.m, phoneSportData.jumpCount, ""));
            buildFreeJumpData(phoneSportData, list);
            return;
        }
        if (trainingMode == 1) {
            buildTargetJumpTitle(map, phoneSportData, sportGoalType, (int) sportGoalValue);
            buildTargetJumpData(phoneSportData, list, sportGoalType);
            return;
        }
        if (trainingMode != 2) {
            return;
        }
        if (jumpIntervalTargetArr == null || jumpIntervalTargetArr.size() <= 0) {
            FitnessLogUtils.i("CommonSportModelUtil", "buildJumpTitle jumpIntervalTargetArr == null");
            return;
        }
        IntervalSportTarget intervalSportTarget = jumpIntervalTargetArr.get(0);
        Intrinsics.checkNotNullExpressionValue(intervalSportTarget, "get(...)");
        IntervalSportTarget intervalSportTarget2 = intervalSportTarget;
        SportTarget sportTarget = intervalSportTarget2.getSportTarget();
        int i = phoneSportData.step;
        float f = phoneSportData.stepRate * 60;
        boolean z = f > 0.0f && f < 255.0f;
        buildIntervalJumpTitle(map, phoneSportData, sportTarget.getType(), sportTarget.getValue(), intervalSportTarget2.getRestDuration(), z, (int) f, i);
        buildIntervalJumpData(phoneSportData, list, sportTarget.getType());
        if (z) {
            map.put(CommonSportModel.SportTitle.groupData, resource.getString(e1j.l3));
            return;
        }
        Resources resources = resource;
        int i2 = i + 1;
        String quantityString = resources.getQuantityString(ayi.c, i2, Integer.valueOf(i2));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = resources.getQuantityString(ayi.d, jumpIntervalTargetArr.size(), Integer.valueOf(jumpIntervalTargetArr.size()));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        map.put(CommonSportModel.SportTitle.groupData, resources.getString(e1j.z3, quantityString, quantityString2));
    }

    public final void buildTitle(@NotNull String deviceDid2, @NotNull Map<CommonSportModel.SportTitle, String> map, @NotNull PhoneSportData phoneSportData, float sportGoalValue, int sportGoalType, int sportType, @NotNull List<SportingItemData> list) {
        Intrinsics.checkNotNullParameter(deviceDid2, "deviceDid");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(phoneSportData, "phoneSportData");
        Intrinsics.checkNotNullParameter(list, "list");
        deviceDid = deviceDid2;
        FitnessLogUtils.i("CommonSportModelUtil", "getDeviceConnectInfo :" + getDeviceConnectInfo(deviceDid2));
        map.put(CommonSportModel.SportTitle.SportType, ResourceExtKt.getString(SportUtilsExtKt.getSportTypeStr(sportType)));
        map.put(CommonSportModel.SportTitle.connectDevice, getDeviceConnectInfo(deviceDid2));
        if (sportGoalType == -1) {
            SportingItemData distance = getDistance(phoneSportData);
            map.put(CommonSportModel.SportTitle.majorData, distance.getData());
            CommonSportModel.SportTitle sportTitle = CommonSportModel.SportTitle.unit;
            String dataDes = distance.getDataDes();
            if (dataDes == null) {
                dataDes = "";
            }
            map.put(sportTitle, dataDes);
            if (sportType == 3) {
                buildIndoorData(phoneSportData, list, sportType);
                return;
            } else if (sportType != 7) {
                buildData(phoneSportData, list, sportType);
                return;
            } else {
                buildIndoorRidingData(phoneSportData, list, sportType);
                return;
            }
        }
        if (sportGoalType == 0) {
            buildDistanceTitle(map, phoneSportData, sportGoalValue, sportType);
            if (sportType == 3) {
                buildIndoorDistanceData(phoneSportData, list);
                return;
            } else if (sportType != 7) {
                buildDistanceData(phoneSportData, list, sportType);
                return;
            } else {
                buildIndoorRidingDistanceData(phoneSportData, list);
                return;
            }
        }
        if (sportGoalType == 1) {
            buildDurationTitle(map, phoneSportData, sportGoalValue);
            if (sportType == 3) {
                buildDurationIndoorData(phoneSportData, list);
                return;
            } else if (sportType != 7) {
                buildDurationData(phoneSportData, list, sportType);
                return;
            } else {
                buildDurationIndoorRidingData(phoneSportData, list);
                return;
            }
        }
        if (sportGoalType != 2) {
            return;
        }
        buildCalTitle(map, phoneSportData, (int) sportGoalValue);
        if (sportType == 3) {
            buildCalIndoorData(phoneSportData, list);
        } else if (sportType != 7) {
            buildCalData(phoneSportData, list, sportType);
        } else {
            buildCalIndoorRidingData(phoneSportData, list);
        }
    }

    public final boolean curSportIsShowDeviceData() {
        return !Intrinsics.areEqual(deviceDid, "xiaomiwear_app") || SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).getAppLaunchType() == 6;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x003c A[ORIG_RETURN, RETURN] */
    @NotNull
    public final String getCourse30Tag(@NotNull int... types) {
        Intrinsics.checkNotNullParameter(types, "types");
        for (Object obj : FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE).getSportReport(CourseApiKt.getCOURSE_TAG_TIME_SEC(), 222539587200L)) {
            if (ArraysKt___ArraysKt.contains(types, ((SportBasicReport) obj).getSportType())) {
                if (obj != null) {
                    return CourseApiKt.COURSE_TAG_IN30;
                }
                return CourseApiKt.COURSE_TAG_OUT30;
            }
        }
        obj = null;
        if (obj != null) {
            return CourseApiKt.COURSE_TAG_IN30;
        }
        return CourseApiKt.COURSE_TAG_OUT30;
    }

    @NotNull
    public final SportingItemData getDistance(@NotNull PhoneSportData phoneSportData) {
        Intrinsics.checkNotNullParameter(phoneSportData, "phoneSportData");
        int i = phoneSportData.distance;
        if (i < 1000) {
            String quantityString = resource.getQuantityString(ayi.o, i);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return new SportingItemData(String.valueOf(phoneSportData.distance), quantityString, null, 4, null);
        }
        String quantityString2 = resource.getQuantityString(ayi.n, i / 1000);
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(phoneSportData.distance / 1000.0f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new SportingItemData(str, quantityString2, null, 4, null);
    }

    @NotNull
    public final String getJumpDeviceConnectInfo() {
        EcoDeviceModel localDeviceModel;
        EcoDeviceModel localDeviceModel2;
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel localDeviceModel3 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("yunmai.jmprope.sr803");
        if ((localDeviceModel3 == null || !localDeviceModel3.getIsDeviceConnected()) && (((localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel("yunmai.jmprope.sr804")) == null || !localDeviceModel.getIsDeviceConnected()) && ((localDeviceModel2 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED)) == null || !localDeviceModel2.getIsDeviceConnected()))) {
            return "";
        }
        Resources resources = resource;
        return resources.getString(e1j.Y2) + " | " + resources.getString(e1j.c0);
    }
}
