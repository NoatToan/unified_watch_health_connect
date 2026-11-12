package com.xiaomi.fitness.userinfo.utils;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.Scopes;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.DallyGoalItem;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelper;
import com.xiaomi.fitness.devicesettings.export.sync.DeviceSettingsSyncHelperExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.stand.StandDetectConstants;
import com.xiaomi.fitness.user.info.export.GoalPageManager;
import com.xiaomi.fitness.user.info.export.GoalPageManagerExtKt;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack;
import com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository;
import com.xiaomi.fitness.user.info.export.medicalid.MedicalIdRecord;
import com.xiaomi.fitness.user.info.export.medicalid.MedicalIdRepositoryExtKt;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.GenderExt;
import com.xiaomi.wearable.hm.HuaMiRemindMultiTarget;
import defpackage.fyi;
import defpackage.o1j;
import defpackage.s7r;
import defpackage.tu9;
import defpackage.ur9;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010;\u001a\u00020\u001dJ\u0006\u0010<\u001a\u00020\u0013J\u0006\u0010=\u001a\u00020\u0013J,\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002062\n\b\u0002\u0010E\u001a\u0004\u0018\u00010FJL\u0010G\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020A2\u0006\u0010H\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u00132\b\u0010J\u001a\u0004\u0018\u00010\u001d2\u0006\u0010K\u001a\u00020L2\b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010M\u001a\u0002002\u0006\u0010D\u001a\u000206J*\u0010N\u001a\u0004\u0018\u00010C2\u0006\u0010H\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u00132\u0006\u0010K\u001a\u00020L2\u0006\u0010O\u001a\u00020CH\u0002J\"\u0010N\u001a\u0004\u0018\u00010C2\u0006\u0010H\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u001d2\u0006\u0010M\u001a\u000200H\u0002J\u000e\u0010P\u001a\u00020?2\u0006\u0010Q\u001a\u00020\u0016J3\u0010R\u001a\u00020?2\u0006\u0010B\u001a\u00020C2\u0006\u0010S\u001a\u00020T2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010L¢\u0006\u0002\u0010XJ\u001e\u0010Y\u001a\u00020\u00162\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010[2\u0006\u0010H\u001a\u00020\u0016J\"\u0010]\u001a\u00020?2\u0006\u0010^\u001a\u00020C2\u0006\u0010S\u001a\u00020T2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010VJ \u0010_\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010`\u001a\u00020\u0016J\u001a\u0010a\u001a\u0004\u0018\u00010\u001d2\u0006\u0010b\u001a\u00020!2\b\u0010c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010d\u001a\u00020\u00162\u0006\u0010e\u001a\u00020CJa\u0010G\u001a\u00020?2\u0006\u0010H\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u00132\b\u0010E\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010M\u001a\u0004\u0018\u0001002\n\b\u0002\u0010D\u001a\u0004\u0018\u0001062\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010A¢\u0006\u0002\u0010gJ\u0012\u0010h\u001a\u0004\u0018\u00010i2\u0006\u0010^\u001a\u00020CH\u0002J\u0010\u0010j\u001a\u0004\u0018\u00010k2\u0006\u0010^\u001a\u00020CJ\u0010\u0010l\u001a\u00020!2\b\u0010m\u001a\u0004\u0018\u00010\u001dJ\u0016\u0010n\u001a\u00020?2\u0006\u0010^\u001a\u00020C2\u0006\u0010S\u001a\u00020TJ\"\u0010o\u001a\u00020L2\u0006\u0010^\u001a\u00020C2\u0006\u0010S\u001a\u00020T2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010VR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u000e\u0010\u0012\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020\u001dX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0014\u0010%\u001a\u00020\u001dX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0014\u0010'\u001a\u00020\u001dX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0014\u0010)\u001a\u00020\u001dX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u000e\u0010+\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0013X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010/\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00102R\u001b\u00105\u001a\u0002068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b7\u00108R\u000e\u0010:\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000¨\u0006p"}, d2 = {"Lcom/xiaomi/fitness/userinfo/utils/UserInfoConfigUtil;", "", "<init>", "()V", "SUPPORTED_HEIGHT_RANGE", "", "getSUPPORTED_HEIGHT_RANGE", "()[I", "SUPPORTED_HEIGHT_FEET_RANGE", "getSUPPORTED_HEIGHT_FEET_RANGE", "SUPPORTED_HEIGHT_INCH_RANGE", "getSUPPORTED_HEIGHT_INCH_RANGE", "SUPPORTED_WEIGHT_RANGE_KG", "getSUPPORTED_WEIGHT_RANGE_KG", "SUPPORTED_WEIGHT_RANGE_POUND", "getSUPPORTED_WEIGHT_RANGE_POUND", "SUPPORTED_WEIGHT_RANGE_K", "getSUPPORTED_WEIGHT_RANGE_K", "DEFAULT_HEIGHT", "", "DEFAULT_WEIGHT_MALE", "DEFAULT_GOAL_SIZE", "", "DEFAULT_ERROR_CODE_REGION_LIMIT_AGE", "getDEFAULT_ERROR_CODE_REGION_LIMIT_AGE", "()I", "setDEFAULT_ERROR_CODE_REGION_LIMIT_AGE", "(I)V", "DEFAULT_BIRTHDAY", "", "getDEFAULT_BIRTHDAY", "()Ljava/lang/String;", "MIN_BIRTHDAY_TIME", "", "DEFAULT_BIRTHDAY_TIME", "MODE_AUTO", "getMODE_AUTO", "MODE_PHONE", "getMODE_PHONE", "FEMALE", "getFEMALE", "MALE", "getMALE", "KEY_HEART_RATE", "KEY_AUTO_HEART", "TAG", "TEXTVIEW_SIZE", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "mUserInfoManager$delegate", "Lkotlin/Lazy;", "mAccountRequest", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "getMAccountRequest", "()Lcom/xiaomi/fitness/account/api/AccountRequest;", "mAccountRequest$delegate", "ACTION_USER_INFO_GUIDE_FINISH_ACTIVITY", "getDefaultGender", "getDefaultHeight", "getDefaultWeight", "sendAllProfile", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "userProfile", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "accountRequest", "callBack", "Lcom/xiaomi/fitness/user/info/export/callback/SendProfileCallBack;", "sendProfile", "type", "value", "sValue", "isRecordHeartAuto", "", "userInfoManager", "buildSendProfile", "oldProfile", "showShortToast", "msg", "syncUserInfoToSportDevice", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "callback", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "clearDidFlag", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;Ljava/lang/Boolean;)V", "getDailyGoalItem", "list", "", "Lcom/xiaomi/fitness/account/user/DallyGoalItem;", "syncHuamiUserInfoToSportDevice", "userInfo", "getUserInfoValue", "from", "getDateToString", "milSecond", "pattern", "getAutoHrm", Scopes.PROFILE, "viewModelScope", "(IFLcom/xiaomi/fitness/user/info/export/callback/SendProfileCallBack;Lcom/xiaomi/fitness/account/user/UserInfoManager;Lcom/xiaomi/fitness/account/api/AccountRequest;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/coroutines/CoroutineScope;)V", "getGenderExt", "Lcom/xiaomi/hm/health/bt/profile/user/GenderExt;", "getBirthDateExt", "Lcom/xiaomi/hm/health/bt/profile/user/BirthDateExt;", "birthStringToMillis", MedicalIdSPContract.PREF_BIRTHDAY, "updateDids", "checkSyncFinishedDid", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserInfoConfigUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoConfigUtil.kt\ncom/xiaomi/fitness/userinfo/utils/UserInfoConfigUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,838:1\n37#2:839\n36#2,3:840\n37#2:844\n36#2,3:845\n37#2:852\n36#2,3:853\n37#2:856\n36#2,3:857\n1#3:843\n1557#4:848\n1628#4,3:849\n*S KotlinDebug\n*F\n+ 1 UserInfoConfigUtil.kt\ncom/xiaomi/fitness/userinfo/utils/UserInfoConfigUtil\n*L\n365#1:839\n365#1:840,3\n372#1:844\n372#1:845,3\n774#1:852\n774#1:853,3\n786#1:856\n786#1:857,3\n531#1:848\n531#1:849,3\n*E\n"})
public final class UserInfoConfigUtil {

    @NotNull
    public static final String ACTION_USER_INFO_GUIDE_FINISH_ACTIVITY = "action_user_info_guide_finish_activity";
    public static final long DEFAULT_BIRTHDAY_TIME = 631123200000L;
    public static final int DEFAULT_GOAL_SIZE = 3;
    public static final float DEFAULT_HEIGHT = 170.0f;
    public static final float DEFAULT_WEIGHT_MALE = 60.0f;

    @NotNull
    public static final String KEY_AUTO_HEART = "key_auto_heart";

    @NotNull
    public static final String KEY_HEART_RATE = "key_heart_rate";
    public static final long MIN_BIRTHDAY_TIME = -2209017600000L;

    @NotNull
    public static final String TAG = "UserInfoConfigUtil";
    public static final float TEXTVIEW_SIZE = 14.0f;

    @NotNull
    public static final UserInfoConfigUtil INSTANCE = new UserInfoConfigUtil();

    @NotNull
    private static final int[] SUPPORTED_HEIGHT_RANGE = {30, 272};

    @NotNull
    private static final int[] SUPPORTED_HEIGHT_FEET_RANGE = {1, 8};

    @NotNull
    private static final int[] SUPPORTED_HEIGHT_INCH_RANGE = {0, 11};

    @NotNull
    private static final int[] SUPPORTED_WEIGHT_RANGE_KG = {3, 700};

    @NotNull
    private static final int[] SUPPORTED_WEIGHT_RANGE_POUND = {6, 1545};

    @NotNull
    private static final int[] SUPPORTED_WEIGHT_RANGE_K = {6, StandDetectConstants.DETECT_IGNORE_NOTICE_END};
    private static int DEFAULT_ERROR_CODE_REGION_LIMIT_AGE = -4005002;

    @NotNull
    private static final String DEFAULT_BIRTHDAY = "1990-01-01";

    @NotNull
    private static final String MODE_AUTO = "auto";

    @NotNull
    private static final String MODE_PHONE = "phone";

    @NotNull
    private static final String FEMALE = "female";

    @NotNull
    private static final String MALE = "male";

    /* JADX INFO: renamed from: mUserInfoManager$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mUserInfoManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ugq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserInfoConfigUtil.mUserInfoManager_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mAccountRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mAccountRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vgq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UserInfoConfigUtil.mAccountRequest_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil$syncHuamiUserInfoToSportDevice$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil$syncHuamiUserInfoToSportDevice$3", f = "UserInfoConfigUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nUserInfoConfigUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoConfigUtil.kt\ncom/xiaomi/fitness/userinfo/utils/UserInfoConfigUtil$syncHuamiUserInfoToSportDevice$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,838:1\n1#2:839\n*E\n"})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.LongRef $activityData;
        final /* synthetic */ Ref.LongRef $cal;
        final /* synthetic */ OnSyncCallback $callback;
        final /* synthetic */ WearableDeviceModel $deviceModel;
        final /* synthetic */ HuamiApiCaller $huamiDevice;
        final /* synthetic */ Ref.LongRef $stand;
        final /* synthetic */ Ref.LongRef $step;
        final /* synthetic */ UserProfile $userInfo;
        final /* synthetic */ UserInfoExt $userInfoExt;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(WearableDeviceModel wearableDeviceModel, HuamiApiCaller huamiApiCaller, UserProfile userProfile, Ref.LongRef longRef, Ref.LongRef longRef2, Ref.LongRef longRef3, Ref.LongRef longRef4, UserInfoExt userInfoExt, OnSyncCallback onSyncCallback, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
            this.$huamiDevice = huamiApiCaller;
            this.$userInfo = userProfile;
            this.$step = longRef;
            this.$cal = longRef2;
            this.$stand = longRef3;
            this.$activityData = longRef4;
            this.$userInfoExt = userInfoExt;
            this.$callback = onSyncCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$deviceModel, this.$huamiDevice, this.$userInfo, this.$step, this.$cal, this.$stand, this.$activityData, this.$userInfoExt, this.$callback, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006e  */
        /* JADX WARN: Code duplicated, block: B:33:0x0092  */
        /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean boolBoxBoolean;
            Long lBoxLong;
            Long lBoxLong2;
            Long lBoxLong3;
            Long lBoxLong4;
            Long lBoxLong5;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean zIsSupportFeature = DeviceModelExtKt.isSupportFeature(this.$deviceModel, Feature.SLEEP_GOAL);
            boolean zIsSupportFeature2 = DeviceModelExtKt.isSupportFeature(this.$deviceModel, Feature.VIALIY_DATA);
            if (zIsSupportFeature || zIsSupportFeature2) {
                HuamiApiCaller huamiApiCaller = this.$huamiDevice;
                if (huamiApiCaller != null) {
                    Boolean boolBoxBoolean2 = zIsSupportFeature ? Boxing.boxBoolean(DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE).getHuamiGoalRemindEnable()) : null;
                    if (zIsSupportFeature) {
                        long dailySleepGoal = this.$userInfo.getDailySleepGoal();
                        lBoxLong = dailySleepGoal == 0 ? null : Boxing.boxLong(dailySleepGoal);
                    } else {
                        lBoxLong = null;
                    }
                    Boolean boolBoxBoolean3 = zIsSupportFeature2 ? Boxing.boxBoolean(DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE).getHuamiGoalRemindEnable()) : null;
                    if (zIsSupportFeature2) {
                        long j = this.$step.element;
                        if (j == 0) {
                            lBoxLong2 = null;
                        } else {
                            lBoxLong2 = Boxing.boxLong(j);
                        }
                    } else {
                        lBoxLong2 = null;
                    }
                    Boolean boolBoxBoolean4 = zIsSupportFeature2 ? Boxing.boxBoolean(DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE).getHuamiGoalRemindEnable()) : null;
                    if (zIsSupportFeature2) {
                        long j2 = this.$cal.element;
                        if (j2 == 0) {
                            lBoxLong3 = null;
                        } else {
                            lBoxLong3 = Boxing.boxLong(j2);
                        }
                    } else {
                        lBoxLong3 = null;
                    }
                    Boolean boolBoxBoolean5 = zIsSupportFeature2 ? Boxing.boxBoolean(DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE).getHuamiGoalRemindEnable()) : null;
                    if (zIsSupportFeature2) {
                        long j3 = this.$stand.element;
                        if (j3 == 0) {
                            lBoxLong4 = null;
                        } else {
                            lBoxLong4 = Boxing.boxLong(j3);
                        }
                    } else {
                        lBoxLong4 = null;
                    }
                    Boolean boolBoxBoolean6 = zIsSupportFeature2 ? Boxing.boxBoolean(DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE).getHuamiGoalRemindEnable()) : null;
                    if (zIsSupportFeature2) {
                        long j4 = this.$activityData.element;
                        if (j4 == 0) {
                            lBoxLong5 = null;
                        } else {
                            lBoxLong5 = Boxing.boxLong(j4);
                        }
                    } else {
                        lBoxLong5 = null;
                    }
                    boolBoxBoolean = Boxing.boxBoolean(huamiApiCaller.setMultiTarget(new HuaMiRemindMultiTarget(boolBoxBoolean3, lBoxLong2, boolBoxBoolean4, lBoxLong3, boolBoxBoolean2, lBoxLong, boolBoxBoolean5, lBoxLong4, boolBoxBoolean6, lBoxLong5)));
                } else {
                    boolBoxBoolean = null;
                }
                Logger.i(UserInfoConfigUtil.TAG, "isSupportRemind : " + DeviceSettingsSyncHelperExtKt.getInstance(DeviceSettingsSyncHelper.INSTANCE).getHuamiGoalRemindEnable() + ", isSupportSleep:" + zIsSupportFeature + " , isSupportVialiy : " + zIsSupportFeature2 + ", step:" + this.$step.element + ",cal:" + this.$cal.element + " ,stand:" + this.$stand.element + ",activity:" + this.$activityData.element);
                StringBuilder sb = new StringBuilder();
                sb.append("syncHuamiUserInfoToSportDevice setMultiTarget is ");
                sb.append(boolBoxBoolean);
                Logger.i(UserInfoConfigUtil.TAG, sb.toString());
            }
            if (zIsSupportFeature2) {
                long j5 = this.$stand.element;
                if (j5 != 0 || this.$activityData.element != 0) {
                    int i = j5 == 0 ? 1 : 0;
                    Logger.i(UserInfoConfigUtil.TAG, "activityMode : " + i);
                    HuamiApiCaller huamiApiCaller2 = this.$huamiDevice;
                    if (huamiApiCaller2 != null) {
                        Boxing.boxBoolean(huamiApiCaller2.setActivityMode(i));
                    }
                }
            }
            HuamiApiCaller huamiApiCaller3 = this.$huamiDevice;
            if (huamiApiCaller3 == null || !huamiApiCaller3.setUserInfoSync(this.$userInfoExt)) {
                Logger.i(UserInfoConfigUtil.TAG, "syncHuamiUserInfoToSportDevice deviceModel.did " + this.$deviceModel.getDid() + " ERROR");
                OnSyncCallback onSyncCallback = this.$callback;
                if (onSyncCallback != null) {
                    onSyncCallback.onError(this.$deviceModel.getDid(), 5, -1);
                }
            } else {
                Logger.i(UserInfoConfigUtil.TAG, "syncHuamiUserInfoToSportDevice deviceModel.did " + this.$deviceModel.getDid() + " SUCCESS");
                OnSyncCallback onSyncCallback2 = this.$callback;
                if (onSyncCallback2 != null) {
                    onSyncCallback2.onSuccess(this.$deviceModel.getDid(), 5, null);
                }
            }
            if (DeviceModelExtKt.isL66(this.$deviceModel) && this.$userInfo.getRecordMaxHrm() != null) {
                UserProfile.RecordMaxHrm recordMaxHrm = this.$userInfo.getRecordMaxHrm();
                Intrinsics.checkNotNull(recordMaxHrm);
                int hrm = recordMaxHrm.getHrm();
                if (hrm > 0) {
                    Logger.i(UserInfoConfigUtil.TAG, "setHrMaxValue to huami (" + hrm + ")");
                    HuamiApiCaller huamiApiCaller4 = this.$huamiDevice;
                    if (huamiApiCaller4 != null) {
                        huamiApiCaller4.setHrMaxValue(hrm);
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private UserInfoConfigUtil() {
    }

    private final UserProfile buildSendProfile(int type, float value, boolean isRecordHeartAuto, UserProfile oldProfile) {
        UserProfile userProfile;
        int i = 0;
        UserProfile userProfile2 = new UserProfile(null, null, null, null, 0.0f, 0.0f, null, 0, 0, 0, null, i, i, 0, 0, null, 0, 0, null, 0, null, 0.0f, null, null, 16777215, null);
        GuidePageUtil guidePageUtil = GuidePageUtil.INSTANCE;
        if (type == guidePageUtil.getTYPE_HEIGHT()) {
            userProfile = userProfile2;
            userProfile.setHeight(value);
            oldProfile.setHeight(value);
        } else {
            userProfile = userProfile2;
            if (type == guidePageUtil.getTYPE_WEIGHT()) {
                userProfile.setWeight(value);
                oldProfile.setWeight(value);
            } else if (type == guidePageUtil.getTYPE_SLEEP_GOAL()) {
                oldProfile.setDailySleepGoal((int) value);
                userProfile.setDailySleepGoal(oldProfile.getDailySleepGoal());
            } else if (type == guidePageUtil.getTYPE_RECORD_MAX_HEART()) {
                if (userProfile.getRecordMaxHrm() == null) {
                    userProfile.setRecordMaxHrm(new UserProfile.RecordMaxHrm(0, null, 0, 7, null));
                    oldProfile.setRecordMaxHrm(new UserProfile.RecordMaxHrm(0, null, 0, 7, null));
                }
                UserProfile.RecordMaxHrm recordMaxHrm = userProfile.getRecordMaxHrm();
                Intrinsics.checkNotNull(recordMaxHrm);
                int i2 = (int) value;
                recordMaxHrm.setHrm(i2);
                if (isRecordHeartAuto) {
                    UserProfile.RecordMaxHrm recordMaxHrm2 = userProfile.getRecordMaxHrm();
                    Intrinsics.checkNotNull(recordMaxHrm2);
                    recordMaxHrm2.setAutoHrm(i2);
                }
                UserProfile.RecordMaxHrm recordMaxHrm3 = userProfile.getRecordMaxHrm();
                Intrinsics.checkNotNull(recordMaxHrm3);
                recordMaxHrm3.setSource(isRecordHeartAuto ? MODE_AUTO : MODE_PHONE);
                UserProfile.RecordMaxHrm recordMaxHrm4 = oldProfile.getRecordMaxHrm();
                Intrinsics.checkNotNull(recordMaxHrm4);
                recordMaxHrm4.setHrm(i2);
                if (isRecordHeartAuto) {
                    UserProfile.RecordMaxHrm recordMaxHrm5 = userProfile.getRecordMaxHrm();
                    Intrinsics.checkNotNull(recordMaxHrm5);
                    recordMaxHrm5.setAutoHrm(i2);
                }
                UserProfile.RecordMaxHrm recordMaxHrm6 = oldProfile.getRecordMaxHrm();
                Intrinsics.checkNotNull(recordMaxHrm6);
                recordMaxHrm6.setSource(isRecordHeartAuto ? MODE_AUTO : MODE_PHONE);
            } else if (type == guidePageUtil.getTYPE_GOAL_CALORIE()) {
                int i3 = (int) value;
                oldProfile.setDailyCalGoal(i3);
                userProfile.setDailyCalGoal(oldProfile.getDailyCalGoal());
                userProfile.setGoalConfig(oldProfile, i3, 2);
                userProfile.setRegularGoalList(oldProfile.getRegularGoalList());
            } else if (type == guidePageUtil.getTYPE_GOAL_STEPS()) {
                int i4 = (int) value;
                oldProfile.setDailyStepGoal(i4);
                userProfile.setDailyStepGoal(oldProfile.getDailyStepGoal());
                userProfile.setGoalConfig(oldProfile, i4, 1);
                userProfile.setRegularGoalList(oldProfile.getRegularGoalList());
            } else if (type == guidePageUtil.getTYPE_GOAL_MHS()) {
                int i5 = (int) value;
                oldProfile.setDailyMhsGoal(i5);
                userProfile.setDailyMhsGoal(oldProfile.getDailyMhsGoal());
                userProfile.setGoalConfig(oldProfile, i5, 4);
                userProfile.setRegularGoalList(oldProfile.getRegularGoalList());
            } else if (type == guidePageUtil.getTYPE_MAX_VO2()) {
                int i6 = (int) value;
                userProfile.setVo2Max(i6);
                oldProfile.setVo2Max(i6);
            } else if (type == guidePageUtil.getTYPE_MAXIMAL_MET()) {
                userProfile.setMaximalMet(value);
                oldProfile.setMaximalMet(value);
            } else if (type == guidePageUtil.getTYPE_STAND_COUNT()) {
                int i7 = (int) value;
                oldProfile.setDailyStandTimesGoal(i7);
                userProfile.setDailyStandTimesGoal(oldProfile.getDailyStandTimesGoal());
                userProfile.setGoalConfig(oldProfile, i7, 3);
                userProfile.setRegularGoalList(oldProfile.getRegularGoalList());
            } else if (type == guidePageUtil.getTYPE_SEX()) {
                int i8 = (int) value;
                userProfile.setSex(i8 == 1 ? MALE : FEMALE);
                oldProfile.setSex(i8 == 1 ? MALE : FEMALE);
            } else {
                guidePageUtil.getTYPE_BIRTHDAY();
            }
        }
        RegionManager.Companion companion = RegionManager.INSTANCE;
        String localCountry = RegionExtKt.getInstance(companion).getLocalCountry();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = localCountry.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        userProfile.setRegion(lowerCase);
        String localCountry2 = RegionExtKt.getInstance(companion).getLocalCountry();
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase2 = localCountry2.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        oldProfile.setRegion(lowerCase2);
        return userProfile;
    }

    public static /* synthetic */ boolean checkSyncFinishedDid$default(UserInfoConfigUtil userInfoConfigUtil, UserProfile userProfile, WearableDeviceModel wearableDeviceModel, OnSyncCallback onSyncCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            onSyncCallback = null;
        }
        return userInfoConfigUtil.checkSyncFinishedDid(userProfile, wearableDeviceModel, onSyncCallback);
    }

    private final GenderExt getGenderExt(UserProfile userInfo) {
        if (TextUtils.isEmpty(userInfo.getSexOrDefault())) {
            return GenderExt.UNSPECIFIED;
        }
        return StringsKt__StringsJVMKt.equals$default(userInfo.getSex(), "female", false, 2, null) ? GenderExt.FEMALE : GenderExt.MALE;
    }

    public static /* synthetic */ String getUserInfoValue$default(UserInfoConfigUtil userInfoConfigUtil, String str, UserProfile userProfile, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return userInfoConfigUtil.getUserInfoValue(str, userProfile, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountRequest mAccountRequest_delegate$lambda$1() {
        return new AccountRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInfoManager mUserInfoManager_delegate$lambda$0() {
        return AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
    }

    public static /* synthetic */ void sendAllProfile$default(UserInfoConfigUtil userInfoConfigUtil, CoroutineScope coroutineScope, UserProfile userProfile, AccountRequest accountRequest, SendProfileCallBack sendProfileCallBack, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 8) != 0) {
            sendProfileCallBack = null;
        }
        userInfoConfigUtil.sendAllProfile(coroutineScope, userProfile, accountRequest, sendProfileCallBack);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendAllProfile$lambda$2(UserProfile userProfile, SendProfileCallBack sendProfileCallBack, boolean z) {
        Intrinsics.checkNotNullParameter(userProfile, "$userProfile");
        Logger.i(TAG, "user info guide sendAllProfile IS SUCCESS " + userProfile);
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).saveUserProfile(userProfile);
        INSTANCE.showShortToast(o1j.y0);
        if (sendProfileCallBack != null) {
            sendProfileCallBack.onSendSuccess(userProfile);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendAllProfile$lambda$3(SendProfileCallBack sendProfileCallBack, ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "user info guide sendAllProfile IS ERROR  " + it.getErrorCode());
        if (sendProfileCallBack != null) {
            sendProfileCallBack.onSendError();
        }
        INSTANCE.showShortToast(o1j.z0);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void sendProfile$default(UserInfoConfigUtil userInfoConfigUtil, CoroutineScope coroutineScope, int i, float f, String str, boolean z, SendProfileCallBack sendProfileCallBack, UserInfoManager userInfoManager, AccountRequest accountRequest, int i2, Object obj) {
        CoroutineScope netCoroutineScope;
        if ((i2 & 1) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        userInfoConfigUtil.sendProfile(netCoroutineScope, i, f, str, z, sendProfileCallBack, userInfoManager, accountRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit sendProfile$lambda$6$lambda$4(Ref.ObjectRef oldProfile, UserProfile it1, String str, int i, UserProfile userProfile, UserInfoManager userInfoManager, SendProfileCallBack sendProfileCallBack, boolean z) {
        Intrinsics.checkNotNullParameter(oldProfile, "$oldProfile");
        Intrinsics.checkNotNullParameter(it1, "$it1");
        Intrinsics.checkNotNullParameter(userInfoManager, "$userInfoManager");
        Logger.i(TAG, "sendProfile type and value success oldProfile is " + oldProfile.element + " profile is " + it1);
        if (str != null && i == GuidePageUtil.INSTANCE.getTYPE_BIRTHDAY()) {
            oldProfile.element = userProfile;
        }
        userInfoManager.saveUserProfile((UserProfile) oldProfile.element);
        if (sendProfileCallBack != null) {
            T t = oldProfile.element;
            Intrinsics.checkNotNull(t);
            sendProfileCallBack.onSendSuccess((UserProfile) t);
        }
        if (sendProfileCallBack != null) {
            sendProfileCallBack.onProfileToDBSuccess(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendProfile$lambda$6$lambda$5(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "sendProfile is error " + it.getErrorCode());
        INSTANCE.showShortToast(o1j.common_set_error);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void syncHuamiUserInfoToSportDevice$default(UserInfoConfigUtil userInfoConfigUtil, UserProfile userProfile, WearableDeviceModel wearableDeviceModel, OnSyncCallback onSyncCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            onSyncCallback = null;
        }
        userInfoConfigUtil.syncHuamiUserInfoToSportDevice(userProfile, wearableDeviceModel, onSyncCallback);
    }

    public static /* synthetic */ void syncUserInfoToSportDevice$default(UserInfoConfigUtil userInfoConfigUtil, UserProfile userProfile, WearableDeviceModel wearableDeviceModel, OnSyncCallback onSyncCallback, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            onSyncCallback = null;
        }
        if ((i & 8) != 0) {
            bool = Boolean.TRUE;
        }
        userInfoConfigUtil.syncUserInfoToSportDevice(userProfile, wearableDeviceModel, onSyncCallback, bool);
    }

    public final long birthStringToMillis(@Nullable String birth) {
        long dateInMonth;
        List<String> listSplit;
        String[] strArr = (birth == null || (listSplit = new Regex("-").split(birth, 0)) == null) ? null : (String[]) listSplit.toArray(new String[0]);
        if (strArr != null) {
            dateInMonth = TimeUtils.INSTANCE.getDateInMonth(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
            Logger.d(TAG, "year " + strArr[0] + " -" + strArr[1] + " -" + strArr[2] + " time " + dateInMonth);
        } else {
            dateInMonth = 0;
        }
        if (dateInMonth != 0) {
            return dateInMonth;
        }
        return 631123200000L;
    }

    public final boolean checkSyncFinishedDid(@NotNull UserProfile userInfo, @NotNull WearableDeviceModel deviceModel, @Nullable OnSyncCallback callback) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        List<String> dids = AccountManagerExtKt.toUserInfoProfile$default(userInfo, null, 1, null).getDids();
        Logger.i(TAG, deviceModel.getDid() + " syncUserInfo,deviceDids is " + dids);
        if (dids == null || !dids.contains(deviceModel.getDid())) {
            return false;
        }
        if (callback != null) {
            callback.onSuccess(deviceModel.getDid(), 5, null);
        }
        return true;
    }

    public final int getAutoHrm(@NotNull UserProfile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        int limitAge = GuidePageUtil.INSTANCE.getLimitAge();
        if (TextUtils.isEmpty(profile.getBirth())) {
            limitAge = Calendar.getInstance().get(1) - 1990;
        } else {
            try {
                new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                limitAge = profile.getAge();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int i = 220 - limitAge;
        Logger.i(" RegionUtil auto_hrm = " + i + ", age = " + limitAge, new Object[0]);
        return i;
    }

    @Nullable
    public final BirthDateExt getBirthDateExt(@NotNull UserProfile userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        if (userInfo.getBirth() == null) {
            return null;
        }
        String[] strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) userInfo.getBirthOrDefault(), new String[]{"-"}, false, 0, 6, (Object) null).toArray(new String[0]);
        try {
            short s = Short.parseShort(strArr[0]);
            Byte bValueOf = Byte.valueOf(strArr[1]);
            Intrinsics.checkNotNullExpressionValue(bValueOf, "valueOf(...)");
            byte bByteValue = bValueOf.byteValue();
            Byte bValueOf2 = Byte.valueOf(strArr[2]);
            Intrinsics.checkNotNullExpressionValue(bValueOf2, "valueOf(...)");
            return new BirthDateExt(s, bByteValue, bValueOf2.byteValue());
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public final String getDEFAULT_BIRTHDAY() {
        return DEFAULT_BIRTHDAY;
    }

    public final int getDEFAULT_ERROR_CODE_REGION_LIMIT_AGE() {
        return DEFAULT_ERROR_CODE_REGION_LIMIT_AGE;
    }

    public final int getDailyGoalItem(@Nullable List<DallyGoalItem> list, int type) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).getField() == type) {
                    return list.get(i).getTarget();
                }
            }
        }
        Logger.i(TAG, "getDailyGoalItem origin list " + list + " , not find type " + type + " ,return default value");
        return UserInfoManager.getUserProfile$default(new UserInfoManager(), false, 1, null).getDEFAULT_TARGET()[type - 1];
    }

    @Nullable
    public final String getDateToString(long milSecond, @Nullable String pattern) {
        return new SimpleDateFormat(pattern).format(new Date(milSecond));
    }

    @NotNull
    public final String getDefaultGender() {
        return ResourceExtKt.getString(o1j.F);
    }

    public final float getDefaultHeight() {
        return 170.0f;
    }

    public final float getDefaultWeight() {
        return 60.0f;
    }

    @NotNull
    public final String getFEMALE() {
        return FEMALE;
    }

    @NotNull
    public final String getMALE() {
        return MALE;
    }

    @NotNull
    public final AccountRequest getMAccountRequest() {
        return (AccountRequest) mAccountRequest.getValue();
    }

    @NotNull
    public final String getMODE_AUTO() {
        return MODE_AUTO;
    }

    @NotNull
    public final String getMODE_PHONE() {
        return MODE_PHONE;
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        return (UserInfoManager) mUserInfoManager.getValue();
    }

    @NotNull
    public final int[] getSUPPORTED_HEIGHT_FEET_RANGE() {
        return SUPPORTED_HEIGHT_FEET_RANGE;
    }

    @NotNull
    public final int[] getSUPPORTED_HEIGHT_INCH_RANGE() {
        return SUPPORTED_HEIGHT_INCH_RANGE;
    }

    @NotNull
    public final int[] getSUPPORTED_HEIGHT_RANGE() {
        return SUPPORTED_HEIGHT_RANGE;
    }

    @NotNull
    public final int[] getSUPPORTED_WEIGHT_RANGE_K() {
        return SUPPORTED_WEIGHT_RANGE_K;
    }

    @NotNull
    public final int[] getSUPPORTED_WEIGHT_RANGE_KG() {
        return SUPPORTED_WEIGHT_RANGE_KG;
    }

    @NotNull
    public final int[] getSUPPORTED_WEIGHT_RANGE_POUND() {
        return SUPPORTED_WEIGHT_RANGE_POUND;
    }

    @NotNull
    public final String getUserInfoValue(@NotNull String value, @NotNull UserProfile userProfile, int from) {
        String birth;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        if (value.equals(ResourceExtKt.getString(o1j.t1))) {
            Logger.i(TAG, "value is sex " + userProfile);
            String sex = userProfile.getSex();
            if (sex != null && sex.length() != 0) {
                String string = StringsKt__StringsJVMKt.equals$default(userProfile.getSex(), FEMALE, false, 2, null) ? ResourceExtKt.getString(o1j.D) : ResourceExtKt.getString(o1j.F);
                Logger.i(TAG, "string is " + string);
                return string;
            }
        }
        if (value.equals(ResourceExtKt.getString(o1j.i0)) && (birth = userProfile.getBirth()) != null && birth.length() != 0) {
            String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(birthStringToMillis(userProfile.getBirth()));
            Intrinsics.checkNotNull(dateYYYYMMddLocalFormat);
            return dateYYYYMMddLocalFormat;
        }
        if (value.equals(ResourceExtKt.getString(o1j.E)) && userProfile.getHeight() > 0.0f) {
            return ((int) userProfile.getHeight()) + ResourceExtKt.getString(o1j.z);
        }
        if (value.equals(ResourceExtKt.getString(o1j.l1))) {
            UserProfile.RecordMaxHrm recordMaxHrm = userProfile.getRecordMaxHrm();
            Integer numValueOf = recordMaxHrm != null ? Integer.valueOf(recordMaxHrm.getHrm()) : null;
            if (numValueOf != null && numValueOf.intValue() > 0) {
                UserProfile.RecordMaxHrm recordMaxHrm2 = userProfile.getRecordMaxHrm();
                return (recordMaxHrm2 != null ? Integer.valueOf(recordMaxHrm2.getHrm()) : null) + ResourceExtKt.getString(o1j.V);
            }
        }
        if (value.equals(ResourceExtKt.getString(o1j.L))) {
            float weight = userProfile.getWeight();
            if (weight > 0.0f) {
                return weight + ResourceExtKt.getString(o1j.n1);
            }
        }
        return from == 2 ? ResourceExtKt.getString(o1j.i1) : ResourceExtKt.getString(o1j.G);
    }

    public final void sendAllProfile(@NotNull CoroutineScope scope, @NotNull final UserProfile userProfile, @NotNull AccountRequest accountRequest, @Nullable final SendProfileCallBack callBack) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        Intrinsics.checkNotNullParameter(accountRequest, "accountRequest");
        accountRequest.setUserProfile(scope, userProfile, new Function1() { // from class: wgq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserInfoConfigUtil.sendAllProfile$lambda$2(userProfile, callBack, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: xgq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserInfoConfigUtil.sendAllProfile$lambda$3(callBack, (ApiException) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, com.xiaomi.fitness.account.api.bean.UserProfile] */
    public final void sendProfile(@NotNull CoroutineScope scope, final int type, float value, @Nullable final String sValue, boolean isRecordHeartAuto, @Nullable final SendProfileCallBack callBack, @NotNull final UserInfoManager userInfoManager, @NotNull AccountRequest accountRequest) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(userInfoManager, "userInfoManager");
        Intrinsics.checkNotNullParameter(accountRequest, "accountRequest");
        Logger.i(TAG, "sendProfile type" + type + ";value" + value + ";sValue" + sValue);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = userInfoManager.getUserProfile(false);
        GuidePageUtil guidePageUtil = GuidePageUtil.INSTANCE;
        if (type == guidePageUtil.getTYPE_RECORD_MAX_HEART() && isRecordHeartAuto && sValue != null) {
            ((UserProfile) objectRef.element).setBirth(sValue);
        }
        final UserProfile userProfileBuildSendProfile = (sValue == null || type != guidePageUtil.getTYPE_BIRTHDAY()) ? buildSendProfile(type, value, isRecordHeartAuto, (UserProfile) objectRef.element) : buildSendProfile(type, sValue, userInfoManager);
        if (userProfileBuildSendProfile != null) {
            accountRequest.setUserProfile(new NetCoroutineScope(null, null, null, 7, null), userProfileBuildSendProfile, new Function1() { // from class: ygq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UserInfoConfigUtil.sendProfile$lambda$6$lambda$4(objectRef, userProfileBuildSendProfile, sValue, type, userProfileBuildSendProfile, userInfoManager, callBack, ((Boolean) obj).booleanValue());
                }
            }, new Function1() { // from class: zgq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UserInfoConfigUtil.sendProfile$lambda$6$lambda$5((ApiException) obj);
                }
            });
        } else if (callBack != null) {
            callBack.onSendError();
        }
    }

    public final void setDEFAULT_ERROR_CODE_REGION_LIMIT_AGE(int i) {
        DEFAULT_ERROR_CODE_REGION_LIMIT_AGE = i;
    }

    public final void showShortToast(int msg) {
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), msg);
    }

    public final void syncHuamiUserInfoToSportDevice(@NotNull UserProfile userInfo, @NotNull WearableDeviceModel deviceModel, @Nullable OnSyncCallback callback) {
        Object obj;
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Logger.i(TAG, "deviceModel " + deviceModel);
        UserInfoExt userInfoExt = new UserInfoExt();
        String alias = deviceModel.getProduct().getAlias();
        if (alias == null) {
            alias = "kongming";
        }
        userInfoExt.setAlias(alias);
        userInfoExt.setGender(getGenderExt(userInfo));
        BirthDateExt birthDateExt = getBirthDateExt(userInfo);
        if (birthDateExt != null) {
            userInfoExt.setBirthDate(birthDateExt);
        }
        userInfoExt.setHeight((short) userInfo.getHeightOrDefault());
        userInfoExt.setWeight((short) userInfo.getWeightOrDefault());
        userInfoExt.setGoal(userInfo.getDailyStepGoal());
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        userInfoExt.setRegisterRegion(lowerCase);
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        BirthDateExt birthDate = userInfoExt.getBirthDate();
        short height = userInfoExt.getHeight();
        short weight = userInfoExt.getWeight();
        Logger.i(TAG, "syncHuamiUserInfoToSportDevice birth is " + birthDate + " height is " + ((int) height) + " weight is " + ((int) weight) + " goal is " + userInfoExt.getGoal() + "dailySleepGoal is " + userInfo.getDailySleepGoal() + " registerResion:" + lowerCase);
        Ref.LongRef longRef = new Ref.LongRef();
        Ref.LongRef longRef2 = new Ref.LongRef();
        Ref.LongRef longRef3 = new Ref.LongRef();
        Ref.LongRef longRef4 = new Ref.LongRef();
        List<DallyGoalItem> regularGoalList = userInfo.getRegularGoalList();
        if (regularGoalList != null) {
            List<DallyGoalItem> list = regularGoalList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (DallyGoalItem dallyGoalItem : list) {
                int field = dallyGoalItem.getField();
                if (field == 1) {
                    longRef4.element = dallyGoalItem.getTarget();
                    obj = Unit.INSTANCE;
                } else if (field == 2) {
                    longRef.element = dallyGoalItem.getTarget();
                    obj = Unit.INSTANCE;
                } else if (field == 3) {
                    longRef2.element = dallyGoalItem.getTarget();
                    obj = Unit.INSTANCE;
                } else if (field != 4) {
                    obj = 0;
                } else {
                    longRef3.element = dallyGoalItem.getTarget();
                    obj = Unit.INSTANCE;
                }
                arrayList.add(obj);
            }
        }
        AnyExtKt.io$default(null, new AnonymousClass3(deviceModel, huaMiApiCaller, userInfo, longRef4, longRef, longRef2, longRef3, userInfoExt, callback, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void syncUserInfoToSportDevice(@NotNull UserProfile userProfile, @NotNull final WearableDeviceModel deviceModel, @Nullable final OnSyncCallback callback, @Nullable Boolean clearDidFlag) {
        int i;
        List<String> listSplit;
        List<String> dids;
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Logger.i(TAG, "syncUserInfoToSportDevice...");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = userProfile;
        if (Intrinsics.areEqual(clearDidFlag, Boolean.TRUE)) {
            if (userProfile.getDids() != null && (dids = userProfile.getDids()) != null) {
                dids.clear();
            }
            INSTANCE.getMUserInfoManager().saveUserProfile(userProfile);
            Logger.i(TAG, "clearDidFlag profile remove did:" + deviceModel.getDid() + " it is " + userProfile);
            objectRef.element = userProfile;
        }
        Logger.i(TAG, "clearDidFlag " + clearDidFlag + ";did " + deviceModel.getDid() + ";userInfo:" + objectRef.element);
        boolean z = com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isM62S(deviceModel.getProduct()) || com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isM62A(deviceModel.getProduct());
        Logger.i(TAG, "interceptStatus " + z + "; model: " + deviceModel.getProduct().getModel());
        if (!z && checkSyncFinishedDid((UserProfile) objectRef.element, deviceModel, callback)) {
            Logger.i(TAG, "checkSyncFinishedDid result true, jump sync");
            return;
        }
        GoalPageManagerExtKt.getInstance(GoalPageManager.INSTANCE).setCurrentTarget();
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 0;
        tu9 tu9Var = new tu9();
        String birth = ((UserProfile) objectRef.element).getBirth();
        String[] strArr = (birth == null || (listSplit = new Regex("-").split(birth, 0)) == null) ? null : (String[]) listSplit.toArray(new String[0]);
        if (strArr != null) {
            i = Integer.parseInt(strArr[0] + strArr[1] + strArr[2]);
        } else {
            i = 0;
        }
        if (i == 0) {
            String[] strArr2 = (String[]) new Regex("-").split(DEFAULT_BIRTHDAY, 0).toArray(new String[0]);
            tu9Var.e = Integer.parseInt(strArr2[0] + strArr2[1] + strArr2[2]);
            tu9Var.i = 1;
        } else {
            tu9Var.e = i;
            tu9Var.i = 0;
        }
        if (((UserProfile) objectRef.element).getHeight() == 0.0f) {
            tu9Var.c = 170;
            tu9Var.g = 1;
        } else {
            tu9Var.c = (int) ((UserProfile) objectRef.element).getHeight();
            tu9Var.g = 0;
        }
        if (((UserProfile) objectRef.element).getWeight() == 0.0f) {
            tu9Var.d = 60.0f;
            tu9Var.h = 1;
        } else {
            tu9Var.d = ((UserProfile) objectRef.element).getWeight();
            tu9Var.h = 0;
        }
        String sex = ((UserProfile) objectRef.element).getSex();
        if (sex == null || sex.length() == 0) {
            tu9Var.f = 1;
            tu9Var.j = 1;
        } else {
            tu9Var.f = StringsKt__StringsJVMKt.equals$default(((UserProfile) objectRef.element).getSex(), "male", false, 2, null) ? 1 : 2;
            tu9Var.j = 0;
        }
        Logger.i(TAG, "profileProto.birth =  " + tu9Var.e + "(" + tu9Var.i + "), profileProto.height = " + tu9Var.c + "(" + tu9Var.g + "), profileProto.weight = " + tu9Var.d + "(" + tu9Var.h + "), profileProto.sex = " + tu9Var.f + "(" + tu9Var.j + ")");
        UserProfile.RecordMaxHrm recordMaxHrm = ((UserProfile) objectRef.element).getRecordMaxHrm();
        tu9Var.f35051k = recordMaxHrm != null ? recordMaxHrm.getHrm() : 0;
        List<DallyGoalItem> regularGoalList = ((UserProfile) objectRef.element).getRegularGoalList();
        Logger.i(TAG, "user info regular goal : " + regularGoalList);
        tu9Var.m = getDailyGoalItem(regularGoalList, Integer.parseInt("1"));
        tu9Var.l = getDailyGoalItem(regularGoalList, Integer.parseInt("2"));
        tu9Var.o = getDailyGoalItem(regularGoalList, Integer.parseInt("3"));
        tu9Var.q = getDailyGoalItem(regularGoalList, Integer.parseInt("4"));
        tu9Var.n = ((UserProfile) objectRef.element).getMaximalMet();
        tu9Var.p = ((UserProfile) objectRef.element).getDailySleepGoal();
        IMedicalIdRepository.Companion companion = IMedicalIdRepository.INSTANCE;
        MedicalIdRecord medicalIdRecord = MedicalIdRepositoryExtKt.getInstance(companion).getMedicalIdRecord();
        tu9.a aVar = new tu9.a();
        aVar.c = medicalIdRecord.getContactName();
        aVar.d = medicalIdRecord.getContactNumber();
        aVar.e = medicalIdRecord.getContactRelationType() == 22 ? 255 : medicalIdRecord.getContactRelationType();
        tu9Var.v = aVar;
        tu9Var.f35052r = medicalIdRecord.getName();
        Pair<Integer, Integer> bloodType = MedicalIdRepositoryExtKt.getInstance(companion).getBloodType(medicalIdRecord.getBloodType());
        tu9Var.s = ((Number) bloodType.first).intValue();
        tu9Var.t = ((Number) bloodType.second).intValue();
        tu9Var.u = medicalIdRecord.getDonorType();
        tu9Var.w = medicalIdRecord.getAllergyDrugs();
        tu9Var.x = medicalIdRecord.getChronic();
        tu9Var.y = medicalIdRecord.getTreatment();
        ur9 ur9Var = new ur9();
        ur9Var.S0(tu9Var);
        s7rVar.S(ur9Var);
        Logger.i(TAG, "writeUserInfo :stand_count = " + tu9Var.o + ",sleepGoal = " + tu9Var.p + ", profileProto.goalStep = " + tu9Var.m + ", profileProto.goalCalorie = " + tu9Var.l + ", profileProto.goalIntensity = " + tu9Var.q + ", profileProto.maxHr = " + tu9Var.f35051k);
        StringBuilder sb = new StringBuilder();
        sb.append("syncUserInfoToSportDevice: ");
        sb.append(s7rVar);
        Logger.d(TAG, sb.toString());
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), deviceModel.getDeviceInfo().getDid(), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil.syncUserInfoToSportDevice.4
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                OnSyncCallback onSyncCallback = callback;
                if (onSyncCallback != null) {
                    onSyncCallback.onError(did, type, code);
                }
                Logger.i(UserInfoConfigUtil.TAG, "syncUserInfoToSportDevice onError type " + type + ", code " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                OnSyncCallback onSyncCallback = callback;
                if (onSyncCallback != null) {
                    onSyncCallback.onSuccess(did, type, result);
                }
                Logger.i(UserInfoConfigUtil.TAG, "syncUserInfoToSportDevice onSuccess");
                UserInfoConfigUtil.INSTANCE.updateDids(objectRef.element, deviceModel);
            }
        }, 0, 16, (Object) null);
    }

    public final void updateDids(@NotNull UserProfile userInfo, @NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        List<String> dids = userInfo.getDids();
        if (dids == null) {
            dids = new ArrayList<>();
        }
        Logger.i(TAG, "dids.size is " + dids.size());
        int size = dids.size() - 1;
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Logger.i(TAG, "dids list is " + ((Object) dids.get(i)) + " deviceModel.did is " + deviceModel + ".did");
            if (Intrinsics.areEqual(deviceModel.getDid(), dids.get(i))) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        Logger.i(TAG, " dids has did is " + z + ",did is " + deviceModel.getDid());
        dids.add(deviceModel.getDid());
        userInfo.setDids(dids);
        AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).saveUserProfile(userInfo);
    }

    public static /* synthetic */ void sendProfile$default(UserInfoConfigUtil userInfoConfigUtil, int i, float f, SendProfileCallBack sendProfileCallBack, UserInfoManager userInfoManager, AccountRequest accountRequest, String str, Boolean bool, CoroutineScope coroutineScope, int i2, Object obj) {
        CoroutineScope netCoroutineScope;
        UserInfoManager mUserInfoManager2 = (i2 & 8) != 0 ? userInfoConfigUtil.getMUserInfoManager() : userInfoManager;
        AccountRequest mAccountRequest2 = (i2 & 16) != 0 ? userInfoConfigUtil.getMAccountRequest() : accountRequest;
        String str2 = (i2 & 32) != 0 ? null : str;
        Boolean bool2 = (i2 & 64) != 0 ? Boolean.FALSE : bool;
        if ((i2 & 128) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        userInfoConfigUtil.sendProfile(i, f, sendProfileCallBack, mUserInfoManager2, mAccountRequest2, str2, bool2, netCoroutineScope);
    }

    public final void sendProfile(int type, float value, @Nullable final SendProfileCallBack callBack, @Nullable UserInfoManager userInfoManager, @Nullable AccountRequest accountRequest, @Nullable String sValue, @Nullable Boolean isRecordHeartAuto, @Nullable CoroutineScope viewModelScope) {
        if (userInfoManager == null || accountRequest == null) {
            return;
        }
        Intrinsics.checkNotNull(viewModelScope);
        Intrinsics.checkNotNull(isRecordHeartAuto);
        sendProfile(viewModelScope, type, value, sValue, isRecordHeartAuto.booleanValue(), new SendProfileCallBack() { // from class: com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil.sendProfile.2
            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onProfileToDBSuccess(boolean result) {
                SendProfileCallBack sendProfileCallBack = callBack;
                if (sendProfileCallBack != null) {
                    sendProfileCallBack.onProfileToDBSuccess(result);
                }
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendError() {
                UserInfoConfigUtil.INSTANCE.showShortToast(o1j.common_set_error);
                SendProfileCallBack sendProfileCallBack = callBack;
                if (sendProfileCallBack != null) {
                    sendProfileCallBack.onSendError();
                }
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendSuccess(UserProfile profile) {
                SendProfileCallBack sendProfileCallBack = callBack;
                if (sendProfileCallBack != null) {
                    sendProfileCallBack.onSendSuccess(profile);
                }
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected() || profile == null) {
                    return;
                }
                if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                    UserInfoConfigUtil.syncHuamiUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, profile, wearableDeviceModel, null, 4, null);
                } else {
                    UserInfoConfigUtil.syncUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, profile, wearableDeviceModel, null, null, 12, null);
                }
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendError(int code) {
                if (code == -8) {
                    UserInfoConfigUtil.INSTANCE.showShortToast(o1j.p1);
                } else {
                    UserInfoConfigUtil userInfoConfigUtil = UserInfoConfigUtil.INSTANCE;
                    if (code == userInfoConfigUtil.getDEFAULT_ERROR_CODE_REGION_LIMIT_AGE()) {
                        int limitAge = GuidePageUtil.INSTANCE.getLimitAge();
                        Intrinsics.checkNotNullExpressionValue(ApplicationExtKt.getApplication().getResources().getQuantityString(fyi.f18376b, limitAge, Integer.valueOf(limitAge)), "getQuantityString(...)");
                        userInfoConfigUtil.showShortToast(o1j.q1);
                    } else {
                        userInfoConfigUtil.showShortToast(o1j.common_set_error);
                    }
                }
                SendProfileCallBack sendProfileCallBack = callBack;
                if (sendProfileCallBack != null) {
                    sendProfileCallBack.onSendError(code);
                }
            }
        }, userInfoManager, accountRequest);
    }

    private final UserProfile buildSendProfile(int type, String value, UserInfoManager userInfoManager) {
        UserProfile userProfile = userInfoManager.getUserProfile(false);
        if (type == GuidePageUtil.INSTANCE.getTYPE_BIRTHDAY()) {
            userProfile.setBirth(value);
        }
        String localCountry = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = localCountry.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        userProfile.setRegion(lowerCase);
        Logger.i(TAG, "profile " + userProfile);
        return userProfile;
    }
}
