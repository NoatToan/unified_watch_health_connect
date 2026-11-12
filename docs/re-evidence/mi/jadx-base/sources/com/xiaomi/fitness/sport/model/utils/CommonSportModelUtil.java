package com.xiaomi.fitness.sport.model.utils;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.text.TextUtils;
import com.mi.health.course.export.CourseApiKt;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.HrZone;
import com.xiaomi.fitness.account.HrZoneLevel;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt;
import com.xiaomi.fitness.sport.utils.SportUtilsExtKt;
import com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport.view.wear.guide.SportBeanUiDataModel;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.utils.SportStateUtilsKt;
import defpackage.c1j;
import defpackage.eoi;
import defpackage.i7r;
import defpackage.zxi;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020'J0\u0010-\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020'H\u0002J\u0018\u0010.\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020#H\u0002J0\u0010/\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020'H\u0002J\u0010\u00100\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u00010\tJ(\u00102\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002J4\u00103\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0007J.\u00104\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020'H\u0002J.\u00105\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020'H\u0002J,\u00106\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020'H\u0003J0\u00107\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020'H\u0002J0\u00108\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020'H\u0002J,\u00109\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J0\u0010:\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020'H\u0002J0\u0010;\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020'H\u0002J\u001e\u0010<\u001a\u00020\u001e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010=\u001a\u00020+H\u0002J\u0006\u0010>\u001a\u00020?J\u000e\u0010@\u001a\u00020+2\u0006\u0010\"\u001a\u00020#J\u000e\u0010@\u001a\u00020+2\u0006\u0010A\u001a\u00020'J\u0010\u0010B\u001a\u00020+2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010C\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0002J\u0014\u0010D\u001a\u00020\t2\n\u0010E\u001a\u00020F\"\u00020'H\u0007J \u0010G\u001a\u00020H2\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010J2\b\b\u0002\u0010K\u001a\u00020?J.\u0010L\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002J \u0010M\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002J\"\u0010N\u001a\b\u0012\u0004\u0012\u00020+0J2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010O\u001a\u00020'J\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020+0J2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0JJ\u0014\u0010Q\u001a\u00020'2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020+0JR\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006S"}, d2 = {"Lcom/xiaomi/fitness/sport/model/utils/CommonSportModelUtil;", "", "<init>", "()V", TSMAuthContants.PARAM_RESOURCE, "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "Landroid/content/res/Resources;", "KEY_RUNNING_POSTURE", "", "KEY_LANDING_STYLE", "KEY_SPORT_BEAN_ERROR_STATE", "KEY_SPORT_BEAN_MODE_CHANGED", "KEY_SPORT_BEAN_LOW_BATTERY", "userProfile", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "mDurationFormat", "Ljava/text/SimpleDateFormat;", "getMDurationFormat", "()Ljava/text/SimpleDateFormat;", "mDurationFormat$delegate", "Lkotlin/Lazy;", "deviceDid", "targetViewUtils", "Lcom/xiaomi/fitness/sport/model/utils/ITargetTitleViewUtils;", "getTargetViewUtils", "()Lcom/xiaomi/fitness/sport/model/utils/ITargetTitleViewUtils;", "setTargetViewUtils", "(Lcom/xiaomi/fitness/sport/model/utils/ITargetTitleViewUtils;)V", "buildTitle", "", "map", "", "Lcom/xiaomi/fitness/sport/model/CommonSportModel$SportTitle;", "phoneSportData", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "sportGoalValue", "", "sportGoalType", "", DailyRecordKey.sportType, "list", "", "Lcom/xiaomi/fitness/sport/bean/SportingItemData;", "sportWearMode", "buildIndoorData", "getPaceOrSpeed", "buildData", "getHeartVisibility", "dataDes", "addSportBeanRunningPostureData", "buildDistanceTitle", "buildDistanceData", "buildIndoorDistanceData", "buildCalTitle", "buildCalData", "buildCalIndoorData", "buildDurationTitle", "buildDurationData", "buildDurationIndoorData", "addHr", "hr", "curSportIsShowDeviceData", "", "getDistance", "distance", "buildHrSportingItemData", "getDeviceConnectInfo", "getCourse30Tag", "types", "", "getUiDataListModel", "Lcom/xiaomi/fitness/sport/view/wear/guide/SportBeanUiDataModel;", "original", "", "showRunningPosture", "addSportBeanData", "addSportBeanErrorStateData", "filterOutSportBeanDataIfNeed", "wearMode", "getSportBeanSpecificSportingItemList", "getLandingStyleResId", "itemList", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonSportModelUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonSportModelUtil.kt\ncom/xiaomi/fitness/sport/model/utils/CommonSportModelUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,852:1\n1#2:853\n1863#3,2:854\n774#3:856\n865#3,2:857\n774#3:859\n865#3,2:860\n*S KotlinDebug\n*F\n+ 1 CommonSportModelUtil.kt\ncom/xiaomi/fitness/sport/model/utils/CommonSportModelUtil\n*L\n740#1:854,2\n830#1:856\n830#1:857,2\n839#1:859\n839#1:860,2\n*E\n"})
public final class CommonSportModelUtil {

    @NotNull
    public static final CommonSportModelUtil INSTANCE;

    @NotNull
    private static final String KEY_LANDING_STYLE = "landing_style";

    @NotNull
    public static final String KEY_RUNNING_POSTURE = "running_posture";

    @NotNull
    private static final String KEY_SPORT_BEAN_ERROR_STATE = "sport_bean_error_state";

    @NotNull
    private static final String KEY_SPORT_BEAN_LOW_BATTERY = "key_sport_bean_low_battery";

    @NotNull
    private static final String KEY_SPORT_BEAN_MODE_CHANGED = "key_sport_bean_mode_changed";

    @NotNull
    private static String deviceDid;

    /* JADX INFO: renamed from: mDurationFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mDurationFormat;
    private static final Resources resource;

    @Nullable
    private static ITargetTitleViewUtils targetViewUtils;

    @Nullable
    private static UserProfile userProfile;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil$1", f = "CommonSportModelUtil.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil$1$1", f = "CommonSportModelUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserProfile>, Object> {
            int label;

            public C07411(Continuation<? super C07411> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07411(continuation);
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
                return ((C07411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                C07411 c07411 = new C07411(null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, c07411, this);
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
            int[] iArr = new int[HrZoneLevel.values().length];
            try {
                iArr[HrZoneLevel.Smooth.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HrZoneLevel.WarmUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HrZoneLevel.FatBurning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HrZoneLevel.Aerobic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HrZoneLevel.Anaerobic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HrZoneLevel.Extreme.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil$buildHrSportingItemData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil$buildHrSportingItemData$1", f = "CommonSportModelUtil.kt", i = {}, l = {657}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil$buildHrSportingItemData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil$buildHrSportingItemData$1$1", f = "CommonSportModelUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserProfile>, Object> {
            int label;

            public C07421(Continuation<? super C07421> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07421(continuation);
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
                return ((C07421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C29481(Continuation<? super C29481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29481(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CommonSportModelUtil commonSportModelUtil = CommonSportModelUtil.INSTANCE;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C07421 c07421 = new C07421(null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, c07421, this);
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
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        CommonSportModelUtil commonSportModelUtil = new CommonSportModelUtil();
        INSTANCE = commonSportModelUtil;
        resource = AppUtil.getApp().getResources();
        mDurationFormat = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: x74
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
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && curSportIsShowDeviceData()) {
            ISportRemoteState.Companion companion = ISportRemoteState.INSTANCE;
            if (SportManagerExtKt.getInstance(companion).getAppLaunchType() != 2) {
                SportManagerExtKt.getInstance(companion).isSupportLaunchSport(1, new i7r() { // from class: z74
                    @Override // defpackage.i7r
                    public final void a(Boolean bool) {
                        CommonSportModelUtil.addHr$lambda$3(list, hr, bool);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addHr$lambda$3(List list, SportingItemData hr, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(hr, "$hr");
        if (bool.booleanValue()) {
            list.add(hr);
        }
    }

    private final void addSportBeanData(int sportWearMode, int sportType, PhoneSportData phoneSportData, List<SportingItemData> list) {
        Logger.d("CommonSportModelUtil", "addSportBeanData sportType=" + sportType + " supportsSportBean=" + SportBeanHelperExtKt.getSupportsSportBean() + " isBeanMode=" + (sportWearMode == 1));
        addHr(list, buildHrSportingItemData(phoneSportData));
        if (sportWearMode == 1 || SportStateUtilsKt.isSupportWristPosture(sportType)) {
            if (sportType == 1 || sportType == 2 || sportType == 3) {
                addSportBeanRunningPostureData(sportType, phoneSportData, list);
            } else if (sportType == 6) {
                int i = phoneSportData.stride_frequency;
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                String strValueOf = "--";
                if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected() && i != 0) {
                    strValueOf = String.valueOf(i);
                }
                list.add(new SportingItemData(String.valueOf(strValueOf), ResourceExtKt.getString(c1j.s0), null, 4, null));
            }
            addSportBeanErrorStateData(phoneSportData, list);
        }
    }

    private final void addSportBeanErrorStateData(PhoneSportData phoneSportData, List<SportingItemData> list) {
        if (phoneSportData == null) {
            return;
        }
        SportingItemData sportingItemData = new SportingItemData(String.valueOf(phoneSportData.lowBattery), KEY_SPORT_BEAN_LOW_BATTERY, KEY_SPORT_BEAN_ERROR_STATE);
        Logger.d("CommonSportModelUtil", "lowBatterySportItemData=" + sportingItemData);
        list.add(sportingItemData);
    }

    private final void addSportBeanRunningPostureData(int sportType, PhoneSportData phoneSportData, List<SportingItemData> list) {
        Logger.d("CommonSportModelUtil", "addSportBeanRunningPostureData phoneSportData=" + (phoneSportData != null ? phoneSportData : AbstractJsonLexerKt.NULL));
        if (phoneSportData == null) {
            return;
        }
        list.add(new SportingItemData(String.valueOf(phoneSportData.runStyle), KEY_LANDING_STYLE, KEY_RUNNING_POSTURE));
        list.add(new SportingItemData(String.valueOf(phoneSportData.stride_frequency), ResourceExtKt.getString(c1j.T4), KEY_RUNNING_POSTURE));
        list.add(new SportingItemData(String.valueOf(phoneSportData.stride), ResourceExtKt.getString(c1j.X4), KEY_RUNNING_POSTURE));
        int i = phoneSportData.onGround;
        list.add(new SportingItemData(i == 0 ? "--" : String.valueOf(i), ResourceExtKt.getString(c1j.Y2), KEY_RUNNING_POSTURE));
        if (SportBeanHelperExtKt.getSupportsSportBean()) {
            list.add(new SportingItemData(String.valueOf(phoneSportData.impact / 10.0f), ResourceExtKt.getString(c1j.o2), KEY_RUNNING_POSTURE));
        }
        if (SportStateUtilsKt.isSupportWristPosture(sportType)) {
            if (sportType == 1 || sportType == 2) {
                int i2 = phoneSportData.verticalAmplitude;
                list.add(new SportingItemData(i2 == 0 ? "--" : String.valueOf(i2 / 10), ResourceExtKt.getString(c1j.v5), KEY_RUNNING_POSTURE));
                int i3 = phoneSportData.verticalStrideRatio;
                list.add(new SportingItemData(i3 != 0 ? String.valueOf(i3 / 10) : "--", ResourceExtKt.getString(c1j.w5), KEY_RUNNING_POSTURE));
            }
        }
    }

    private final void buildCalData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType, int sportWearMode) {
        SimpleDateFormat mDurationFormat2 = getMDurationFormat();
        Integer numValueOf = phoneSportData != null ? Integer.valueOf(phoneSportData.duration) : null;
        Intrinsics.checkNotNull(numValueOf);
        String str = mDurationFormat2.format(new Date(((long) numValueOf.intValue()) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        SportingItemData sportingItemData = new SportingItemData(str, resource.getString(c1j.l1), null, 4, null);
        SportingItemData distance = getDistance(phoneSportData);
        SportingItemData paceOrSpeed = getPaceOrSpeed(sportType, phoneSportData);
        list.add(sportingItemData);
        list.add(distance);
        list.add(paceOrSpeed);
        addSportBeanData(sportWearMode, sportType, phoneSportData, list);
    }

    private final void buildCalIndoorData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType, int sportWearMode) {
        SimpleDateFormat mDurationFormat2 = getMDurationFormat();
        Integer numValueOf = phoneSportData != null ? Integer.valueOf(phoneSportData.duration) : null;
        Intrinsics.checkNotNull(numValueOf);
        String str = mDurationFormat2.format(new Date(((long) numValueOf.intValue()) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Resources resources = resource;
        SportingItemData sportingItemData = new SportingItemData(str, resources.getString(c1j.l1), null, 4, null);
        SportingItemData distance = getDistance(phoneSportData);
        int i = phoneSportData.pace;
        int i2 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str2 = null;
        SportingItemData sportingItemData2 = new SportingItemData(i == 0 ? "--" : TimeDateUtil.getSportPaceStrWithSecDef(i), resources.getString(c1j.b3), str2, i2, defaultConstructorMarker);
        SportingItemData sportingItemData3 = new SportingItemData(String.valueOf(phoneSportData.step), resources.getString(c1j.R4), null, 4, null);
        SportingItemData sportingItemData4 = new SportingItemData(String.valueOf(phoneSportData.stride_frequency), resources.getString(c1j.S4), str2, i2, defaultConstructorMarker);
        list.add(sportingItemData);
        list.add(distance);
        list.add(sportingItemData2);
        list.add(sportingItemData3);
        list.add(sportingItemData4);
        addSportBeanData(sportWearMode, sportType, phoneSportData, list);
    }

    @SuppressLint({"StringFormatMatches"})
    private final void buildCalTitle(Map<CommonSportModel.SportTitle, String> map, PhoneSportData phoneSportData, int sportGoalValue) {
        map.put(CommonSportModel.SportTitle.majorData, String.valueOf((int) (phoneSportData.calorie / 1000)));
        CommonSportModel.SportTitle sportTitle = CommonSportModel.SportTitle.progressDetail;
        Resources resources = resource;
        map.put(sportTitle, resources.getString(c1j.e5, Integer.valueOf(sportGoalValue)));
        float f = ((phoneSportData.calorie / 1000.0f) / sportGoalValue) * 100;
        int i = f < 100.0f ? (int) f : 100;
        map.put(CommonSportModel.SportTitle.progressPercentage, i + "%");
        map.put(CommonSportModel.SportTitle.progressValue, String.valueOf(i));
        map.put(CommonSportModel.SportTitle.unit, resources.getString(c1j.n2));
    }

    private final void buildData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType, int sportWearMode) {
        Float fValueOf = phoneSportData != null ? Float.valueOf(phoneSportData.calorie) : null;
        Intrinsics.checkNotNull(fValueOf);
        String strValueOf = String.valueOf((int) (fValueOf.floatValue() / 1000));
        Resources resources = resource;
        SportingItemData sportingItemData = new SportingItemData(strValueOf, resources.getString(c1j.u0), null, 4, null);
        SportingItemData paceOrSpeed = getPaceOrSpeed(sportType, phoneSportData);
        String str = getMDurationFormat().format(new Date(((long) phoneSportData.duration) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        list.add(new SportingItemData(str, resources.getString(c1j.h5), null, 4, null));
        list.add(paceOrSpeed);
        list.add(sportingItemData);
        addSportBeanData(sportWearMode, sportType, phoneSportData, list);
    }

    private final void buildDistanceData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType, int sportWearMode) {
        String str = getMDurationFormat().format(new Date(((long) phoneSportData.duration) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Resources resources = resource;
        SportingItemData sportingItemData = new SportingItemData(str, resources.getString(c1j.l1), null, 4, null);
        SportingItemData sportingItemData2 = new SportingItemData(String.valueOf((int) (phoneSportData.calorie / 1000)), resources.getString(c1j.u0), null, 4, null);
        SportingItemData paceOrSpeed = getPaceOrSpeed(sportType, phoneSportData);
        list.add(sportingItemData);
        list.add(sportingItemData2);
        list.add(paceOrSpeed);
        addSportBeanData(sportWearMode, sportType, phoneSportData, list);
    }

    private final void buildDurationData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType, int sportWearMode) {
        Float fValueOf = phoneSportData != null ? Float.valueOf(phoneSportData.calorie) : null;
        Intrinsics.checkNotNull(fValueOf);
        SportingItemData sportingItemData = new SportingItemData(String.valueOf((int) (fValueOf.floatValue() / 1000)), resource.getString(c1j.u0), null, 4, null);
        SportingItemData distance = getDistance(phoneSportData);
        SportingItemData paceOrSpeed = getPaceOrSpeed(sportType, phoneSportData);
        list.add(sportingItemData);
        list.add(distance);
        list.add(paceOrSpeed);
        addSportBeanData(sportWearMode, sportType, phoneSportData, list);
    }

    private final void buildDurationIndoorData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType, int sportWearMode) {
        Float fValueOf = phoneSportData != null ? Float.valueOf(phoneSportData.calorie) : null;
        Intrinsics.checkNotNull(fValueOf);
        String strValueOf = String.valueOf((int) (fValueOf.floatValue() / 1000));
        Resources resources = resource;
        SportingItemData sportingItemData = new SportingItemData(strValueOf, resources.getString(c1j.u0), null, 4, null);
        SportingItemData distance = getDistance(phoneSportData);
        int i = phoneSportData.pace;
        int i2 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        SportingItemData sportingItemData2 = new SportingItemData(i == 0 ? "--" : TimeDateUtil.getSportPaceStrWithSecDef(i), resources.getString(c1j.b3), str, i2, defaultConstructorMarker);
        SportingItemData sportingItemData3 = new SportingItemData(String.valueOf(phoneSportData.step), resources.getString(c1j.R4), null, 4, null);
        SportingItemData sportingItemData4 = new SportingItemData(String.valueOf(phoneSportData.stride_frequency), resources.getString(c1j.S4), str, i2, defaultConstructorMarker);
        list.add(sportingItemData);
        list.add(distance);
        list.add(sportingItemData2);
        list.add(sportingItemData3);
        list.add(sportingItemData4);
        addSportBeanData(sportWearMode, sportType, phoneSportData, list);
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
        map.put(CommonSportModel.SportTitle.unit, ResourceExtKt.getString(c1j.h5));
    }

    private final SportingItemData buildHrSportingItemData(PhoneSportData phoneSportData) {
        String string;
        if (userProfile == null) {
            ScopeExtKt.scope$default(null, new C29481(null), 1, null);
        }
        switch (WhenMappings.$EnumSwitchMapping$0[new HrZone().getHrZone(phoneSportData.heart_rate).ordinal()]) {
            case 1:
            default:
                string = "--";
                break;
            case 2:
                string = resource.getString(c1j.q3);
                break;
            case 3:
                string = resource.getString(c1j.p3);
                break;
            case 4:
                string = resource.getString(c1j.m3);
                break;
            case 5:
                string = resource.getString(c1j.n3);
                break;
            case 6:
                string = resource.getString(c1j.o3);
                break;
        }
        return new SportingItemData(Intrinsics.areEqual(String.valueOf(phoneSportData.heart_rate), "0") ? "--" : String.valueOf(phoneSportData.heart_rate), resource.getString(c1j.O1), string);
    }

    private final void buildIndoorData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType, int sportWearMode) {
        Float fValueOf = phoneSportData != null ? Float.valueOf(phoneSportData.calorie) : null;
        Intrinsics.checkNotNull(fValueOf);
        SportingItemData sportingItemData = new SportingItemData(String.valueOf((int) (fValueOf.floatValue() / 1000)), AppUtil.getApp().getResources().getString(c1j.u0), null, 4, null);
        getDistance(phoneSportData);
        SportingItemData paceOrSpeed = getPaceOrSpeed(sportType, phoneSportData);
        String strValueOf = String.valueOf(phoneSportData.step);
        Resources resources = resource;
        DefaultConstructorMarker defaultConstructorMarker = null;
        SportingItemData sportingItemData2 = new SportingItemData(strValueOf, resources.getString(c1j.R4), null, 4, defaultConstructorMarker);
        SportingItemData sportingItemData3 = new SportingItemData(String.valueOf(phoneSportData.stride_frequency), resources.getString(c1j.S4), null, 4, null);
        String str = getMDurationFormat().format(new Date(((long) phoneSportData.duration) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        list.add(new SportingItemData(str, resources.getString(c1j.h5), null, 4, defaultConstructorMarker));
        list.add(paceOrSpeed);
        list.add(sportingItemData);
        list.add(sportingItemData2);
        list.add(sportingItemData3);
        addSportBeanData(sportWearMode, sportType, phoneSportData, list);
    }

    private final void buildIndoorDistanceData(PhoneSportData phoneSportData, List<SportingItemData> list, int sportType, int sportWearMode) {
        String str = getMDurationFormat().format(new Date(((long) phoneSportData.duration) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Resources resources = resource;
        SportingItemData sportingItemData = new SportingItemData(str, resources.getString(c1j.l1), null, 4, null);
        SportingItemData sportingItemData2 = new SportingItemData(String.valueOf((int) (phoneSportData.calorie / 1000)), resources.getString(c1j.u0), null, 4, null);
        int i = phoneSportData.pace;
        int i2 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str2 = null;
        SportingItemData sportingItemData3 = new SportingItemData(i == 0 ? "--" : TimeDateUtil.getSportPaceStrWithSecDef(i), resources.getString(c1j.b3), str2, i2, defaultConstructorMarker);
        SportingItemData sportingItemData4 = new SportingItemData(String.valueOf(phoneSportData.step), resources.getString(c1j.R4), null, 4, null);
        SportingItemData sportingItemData5 = new SportingItemData(String.valueOf(phoneSportData.stride_frequency), resources.getString(c1j.S4), str2, i2, defaultConstructorMarker);
        list.add(sportingItemData);
        list.add(sportingItemData2);
        list.add(sportingItemData3);
        list.add(sportingItemData4);
        list.add(sportingItemData5);
        addSportBeanData(sportWearMode, sportType, phoneSportData, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.String] */
    private final String getDeviceConnectInfo(String deviceDid2, int sportType) {
        String string;
        WearableDeviceInfo deviceInfo;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = gymDeviceModel.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel != null && wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected() && sportType == 3) {
            Object obj = objectRef.element;
            WearableDeviceModel wearableDeviceModelCurGymDeviceModel2 = gymDeviceModel.curGymDeviceModel();
            if (wearableDeviceModelCurGymDeviceModel2 == null || (deviceInfo = wearableDeviceModelCurGymDeviceModel2.getDeviceInfo()) == null || (string = deviceInfo.getName()) == null) {
                string = resource.getString(c1j.L1);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            objectRef.element = obj + string;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            ISportRemoteState.Companion companion = ISportRemoteState.INSTANCE;
            if (SportManagerExtKt.getInstance(companion).getAppLaunchType() != 2) {
                SportManagerExtKt.getInstance(companion).isSupportLaunchSport(1, new i7r() { // from class: b84
                    @Override // defpackage.i7r
                    public final void a(Boolean bool) {
                        CommonSportModelUtil.getDeviceConnectInfo$lambda$4(objectRef, bool);
                    }
                });
            }
        }
        return (String) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v12, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, java.lang.String] */
    public static final void getDeviceConnectInfo$lambda$4(Ref.ObjectRef connectTitle, Boolean bool) {
        WearableDeviceInfo deviceInfo;
        String name;
        Intrinsics.checkNotNullParameter(connectTitle, "$connectTitle");
        if (bool.booleanValue() && INSTANCE.curSportIsShowDeviceData()) {
            if (!StringsKt__StringsKt.isBlank((CharSequence) connectTitle.element)) {
                connectTitle.element = connectTitle.element + " | ";
            }
            Object obj = connectTitle.element;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            connectTitle.element = obj + ((wearableDeviceModel == null || (deviceInfo = wearableDeviceModel.getDeviceInfo()) == null || (name = deviceInfo.getName()) == null) ? null : StringsKt__StringsKt.trim((CharSequence) name).toString());
        }
    }

    private final SimpleDateFormat getMDurationFormat() {
        return (SimpleDateFormat) mDurationFormat.getValue();
    }

    private final SportingItemData getPaceOrSpeed(int sportType, PhoneSportData phoneSportData) {
        SportingItemData sportingItemData;
        if (sportType == 6) {
            int i = phoneSportData.pace;
            float f = i == 0 ? 0.0f : i / 1000;
            if (f == 0.0f) {
                return new SportingItemData("--", resource.getString(c1j.J4), null, 4, null);
            }
            float f2 = 3.6f / f;
            float f3 = 100;
            float fRound = Math.round(f2 * f3) / f3;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(fRound)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            sportingItemData = new SportingItemData(str, resource.getString(c1j.J4), "pace");
        } else {
            int i2 = phoneSportData.pace;
            if (i2 == 0) {
                return new SportingItemData("--", AppUtil.getApp().getResources().getString(c1j.d1), "pace");
            }
            sportingItemData = new SportingItemData(TimeDateUtil.getSportPaceStrWithSecDef(i2), AppUtil.getApp().getResources().getString(c1j.d1), "pace");
        }
        return sportingItemData;
    }

    public static /* synthetic */ SportBeanUiDataModel getUiDataListModel$default(CommonSportModelUtil commonSportModelUtil, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return commonSportModelUtil.getUiDataListModel(list, z);
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
        map.put(sportTitle, resources.getString(c1j.f5, Float.valueOf(sportGoalValue)));
        int i = (int) (((phoneSportData.distance / 1000.0f) / sportGoalValue) * 100);
        int i2 = i < 100 ? i : 100;
        map.put(CommonSportModel.SportTitle.progressPercentage, i2 + "%");
        map.put(CommonSportModel.SportTitle.progressValue, String.valueOf(i2));
        FitnessLogUtils.d("CommonSportModelUtil", "sportGoalValue : " + sportGoalValue + " , percent : " + i2);
        int i3 = phoneSportData.distance;
        if (i3 < 1000) {
            String quantityString = resources.getQuantityString(zxi.q, i3);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            map.put(CommonSportModel.SportTitle.unit, quantityString);
        } else {
            String quantityString2 = resources.getQuantityString(zxi.p, i3 / 1000);
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            map.put(CommonSportModel.SportTitle.unit, quantityString2);
        }
    }

    public final void buildTitle(@NotNull String deviceDid2, @NotNull Map<CommonSportModel.SportTitle, String> map, @NotNull PhoneSportData phoneSportData, float sportGoalValue, int sportGoalType, int sportType, @NotNull List<SportingItemData> list, int sportWearMode) {
        Intrinsics.checkNotNullParameter(deviceDid2, "deviceDid");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(phoneSportData, "phoneSportData");
        Intrinsics.checkNotNullParameter(list, "list");
        deviceDid = deviceDid2;
        CommonSportModel.SportTitle sportTitle = CommonSportModel.SportTitle.SportType;
        map.put(sportTitle, ResourceExtKt.getString(SportUtilsExtKt.getSportTypeStr(sportType)));
        map.put(CommonSportModel.SportTitle.connectDevice, getDeviceConnectInfo(deviceDid2, sportType));
        if (sportGoalType == -1) {
            SportingItemData distance = getDistance(phoneSportData);
            map.put(CommonSportModel.SportTitle.majorData, distance.getData());
            CommonSportModel.SportTitle sportTitle2 = CommonSportModel.SportTitle.unit;
            String dataDes = distance.getDataDes();
            if (dataDes == null) {
                dataDes = "";
            }
            map.put(sportTitle2, dataDes);
            if (sportType == 3) {
                buildIndoorData(phoneSportData, list, sportType, sportWearMode);
            } else {
                buildData(phoneSportData, list, sportType, sportWearMode);
            }
        } else if (sportGoalType == 0) {
            buildDistanceTitle(map, phoneSportData, sportGoalValue, sportType);
            if (sportType == 3) {
                buildIndoorDistanceData(phoneSportData, list, sportType, sportWearMode);
            } else {
                buildDistanceData(phoneSportData, list, sportType, sportWearMode);
            }
        } else if (sportGoalType == 1) {
            buildDurationTitle(map, phoneSportData, sportGoalValue);
            if (sportType == 3) {
                buildDurationIndoorData(phoneSportData, list, sportType, sportWearMode);
            } else {
                buildDurationData(phoneSportData, list, sportType, sportWearMode);
            }
        } else if (sportGoalType == 2) {
            buildCalTitle(map, phoneSportData, (int) sportGoalValue);
            if (sportType == 3) {
                buildCalIndoorData(phoneSportData, list, sportType, sportWearMode);
            } else {
                buildCalData(phoneSportData, list, sportType, sportWearMode);
            }
        }
        if (sportGoalType == -1) {
            ITargetTitleViewUtils iTargetTitleViewUtils = targetViewUtils;
            if (iTargetTitleViewUtils == null) {
                Logger.i("CommonSportModelUtil", "targetViewUtils empty");
                return;
            }
            SportInfo sportInfo = new SportInfo(phoneSportData.duration, phoneSportData.distance, phoneSportData.calorie);
            String sportType2 = iTargetTitleViewUtils.getSportType();
            if (TextUtils.isEmpty(sportType2)) {
                sportType2 = ResourceExtKt.getString(SportUtilsExtKt.getSportTypeStr(sportType));
            }
            map.put(sportTitle, sportType2);
            map.put(CommonSportModel.SportTitle.majorData, iTargetTitleViewUtils.buildMajorData(sportInfo));
            map.put(CommonSportModel.SportTitle.progressValue, iTargetTitleViewUtils.buildProgressValue(sportInfo));
            map.put(CommonSportModel.SportTitle.progressDetail, iTargetTitleViewUtils.buildProgressDetail(ApplicationExtKt.getApplication(), sportInfo));
            map.put(CommonSportModel.SportTitle.progressPercentage, iTargetTitleViewUtils.buildProgressPercentage(sportInfo));
            map.put(CommonSportModel.SportTitle.unit, iTargetTitleViewUtils.buildUnit(ApplicationExtKt.getApplication(), sportInfo));
            iTargetTitleViewUtils.processSportListData(ApplicationExtKt.getApplication(), sportInfo, list);
        }
    }

    public final boolean curSportIsShowDeviceData() {
        return !Intrinsics.areEqual(deviceDid, "xiaomiwear_app") || SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).getAppLaunchType() == 6;
    }

    @NotNull
    public final List<SportingItemData> filterOutSportBeanDataIfNeed(@NotNull List<SportingItemData> list, int wearMode) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SportingItemData sportingItemData = (SportingItemData) obj;
            if (StringsKt__StringsKt.isBlank(sportingItemData.getOther()) || Intrinsics.areEqual(sportingItemData.getDataDes(), resource.getString(c1j.O1)) || Intrinsics.areEqual(sportingItemData.getOther(), "pace")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
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
            String quantityString = resource.getQuantityString(zxi.q, i);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return new SportingItemData(String.valueOf(phoneSportData.distance), quantityString, null, 4, null);
        }
        String quantityString2 = resource.getQuantityString(zxi.p, i / 1000);
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(phoneSportData.distance / 1000.0f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new SportingItemData(str, quantityString2, null, 4, null);
    }

    public final int getHeartVisibility(@Nullable String dataDes) {
        return Intrinsics.areEqual(dataDes, resource.getString(c1j.O1)) ? 0 : 8;
    }

    public final int getLandingStyleResId(@NotNull List<SportingItemData> itemList) {
        Integer numValueOf;
        Object next;
        String data;
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        Iterator<T> it = itemList.iterator();
        do {
            numValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((SportingItemData) next).getDataDes(), KEY_LANDING_STYLE));
        SportingItemData sportingItemData = (SportingItemData) next;
        if (sportingItemData != null && (data = sportingItemData.getData()) != null) {
            numValueOf = Integer.valueOf(Integer.parseInt(data));
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return eoi.I1;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return eoi.J1;
        }
        return (numValueOf != null && numValueOf.intValue() == 3) ? eoi.G1 : eoi.H1;
    }

    @NotNull
    public final List<SportingItemData> getSportBeanSpecificSportingItemList(@NotNull List<SportingItemData> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((SportingItemData) obj).getOther(), KEY_RUNNING_POSTURE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Nullable
    public final ITargetTitleViewUtils getTargetViewUtils() {
        return targetViewUtils;
    }

    @NotNull
    public final SportBeanUiDataModel getUiDataListModel(@Nullable List<SportingItemData> original, boolean showRunningPosture) {
        int i;
        SportBeanUiDataModel sportBeanUiDataModel = new SportBeanUiDataModel(null, null, null, null, 0, 31, null);
        if (original != null) {
            CopyOnWriteArrayList<SportingItemData> copyOnWriteArrayList = new CopyOnWriteArrayList(original);
            if (copyOnWriteArrayList.isEmpty()) {
                return sportBeanUiDataModel;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (SportingItemData sportingItemData : copyOnWriteArrayList) {
                if (Intrinsics.areEqual(sportingItemData.getDataDes(), KEY_SPORT_BEAN_MODE_CHANGED)) {
                    sportBeanUiDataModel.setModeChangedStr(sportingItemData.getData());
                }
                if (Intrinsics.areEqual(sportingItemData.getDataDes(), KEY_SPORT_BEAN_LOW_BATTERY)) {
                    sportBeanUiDataModel.setLowBatteryStr(sportingItemData.getData());
                }
                if (Intrinsics.areEqual(sportingItemData.getDataDes(), KEY_LANDING_STYLE)) {
                    i2 = Integer.parseInt(sportingItemData.getData());
                }
                if (!Intrinsics.areEqual(sportingItemData.getOther(), KEY_SPORT_BEAN_ERROR_STATE) && (!Intrinsics.areEqual(sportingItemData.getOther(), KEY_RUNNING_POSTURE) || !Intrinsics.areEqual(sportingItemData.getDataDes(), KEY_LANDING_STYLE))) {
                    if (Intrinsics.areEqual(sportingItemData.getOther(), KEY_RUNNING_POSTURE)) {
                        Intrinsics.checkNotNull(sportingItemData);
                        arrayList.add(sportingItemData);
                    } else {
                        Intrinsics.checkNotNull(sportingItemData);
                        arrayList2.add(sportingItemData);
                    }
                }
            }
            if (i2 == 1) {
                i = eoi.J1;
            } else if (i2 != 2) {
                i = i2 != 3 ? eoi.H1 : eoi.G1;
            } else {
                i = eoi.I1;
            }
            sportBeanUiDataModel.setLandingImageResId(i);
            if (showRunningPosture) {
                sportBeanUiDataModel.setSportBeanRunningPostureList(arrayList);
            } else {
                sportBeanUiDataModel.setCommonList(arrayList2);
            }
            Logger.d("CommonSportModelUtil", "getUiDataListModel runStyle=" + i2);
        }
        return sportBeanUiDataModel;
    }

    public final void setTargetViewUtils(@Nullable ITargetTitleViewUtils iTargetTitleViewUtils) {
        targetViewUtils = iTargetTitleViewUtils;
    }

    @NotNull
    public final SportingItemData getDistance(int distance) {
        if (distance < 1000) {
            String quantityString = resource.getQuantityString(zxi.q, distance);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return new SportingItemData(String.valueOf(distance), quantityString, null, 4, null);
        }
        String quantityString2 = resource.getQuantityString(zxi.p, distance / 1000);
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(distance / 1000.0f)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new SportingItemData(str, quantityString2, null, 4, null);
    }
}
