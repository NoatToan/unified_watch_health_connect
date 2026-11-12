package com.xiaomi.hm.health.di.koin.imp;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.AccountStatEvent;
import com.huami.account.IAccountDelegate;
import com.huami.account.XiaomiTokenMananger;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.bean.AuthDevice;
import com.huami.account.bean.AuthDeviceSource;
import com.huami.account.bean.LogoutSyncTask;
import com.huami.account.utils.UtilsKt;
import com.huami.ad.AdRepository;
import com.huami.ai.speech.simplify.engine.XiaoAiConfigConstantsKt;
import com.huami.ai.speech.simplify.inject.impl.miai.XiaoMiTokenImpl;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.feedback.api.FeedbackService;
import com.huami.femalehealth.uilib.viewmodel.FemaleMifitViewModel;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.properties.HMUserPropertiesAPI;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.network.hmnetwork.properties.PropertyItem;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.passport.entity.ThirdPartyToken;
import com.huami.phn.logic.PHNDataUploadAndCleanLogic;
import com.huami.reddot.RedDotManager;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.snore.core.manager.SnoreDataManager;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.entity.AbsFetchParams;
import com.huami.userproperty.entity.BatchFetchResult;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.huami.userproperty.service.entity.remote.ResultFuture;
import com.huami.wallet.accessdoor.utils.AccessDoorUI;
import com.huami.wallet.ui.utils.WalletUI;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.account.AccountCallback;
import com.huami.watch.companion.account.AccountMiTokenUtil;
import com.huami.watch.companion.bind.BindUtil;
import com.huami.watch.companion.cloud.Cloud;
import com.loc.z;
import com.xiaomi.ai.android.utils.DeviceUtils;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.HMProperty;
import com.xiaomi.hm.health.account.AccountNavController;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.adapter.FemaleAppNoticeHelperAdapter;
import com.xiaomi.hm.health.atrialfibrillation.AtrialFibUseCaseUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import com.xiaomi.hm.health.device.database.DeviceDataDb;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.earbud.repo.EarbudConfigDataManager;
import com.xiaomi.hm.health.device.service.residentnoti.ResidentNotificationManager;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.devicex.manage.koin.DeviceManageModules;
import com.xiaomi.hm.health.di.koin.KoinLifecycleManager;
import com.xiaomi.hm.health.di.koin.imp.AccountDelegateImp;
import com.xiaomi.hm.health.di.koin.spo2.Spo2Proxy;
import com.xiaomi.hm.health.discovery.WebActivityUtil;
import com.xiaomi.hm.health.healthdata.bp.BloodPressureHelper;
import com.xiaomi.hm.health.healthdata.core.HealthDataDb;
import com.xiaomi.hm.health.heartrate.HeartRateCenter;
import com.xiaomi.hm.health.httpkit.HttpKitHelper;
import com.xiaomi.hm.health.jobcenter.manager.ThreadPoolManager;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.manager.ExternalLogoutManager;
import com.xiaomi.hm.health.manager.HMKeepDataManager;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryScreen;
import com.xiaomi.hm.health.nfc.KoinHelperKt;
import com.xiaomi.hm.health.notification.AppNotification;
import com.xiaomi.hm.health.pushHelper.PushHelper;
import com.xiaomi.hm.health.relation.RelationServiceKt;
import com.xiaomi.hm.health.resprate.RespRateUseCaseUtils;
import com.xiaomi.hm.health.sky.SkyServiceKt;
import com.xiaomi.hm.health.stress.StressUseCaseUtils;
import com.xiaomi.hm.health.temperature.TempUseCaseUtils;
import com.xiaomi.hm.health.thirdbind.ThirdAuthApi;
import com.xiaomi.hm.health.traininglib.TrainingLib;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateRepo;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager;
import com.xiaomi.hm.health.ui.sportfitness.manager.HistoryRecordManager;
import com.xiaomi.hm.health.ui.sportfitness.utils.ExerciseHistoryDateUtils;
import com.xiaomi.hm.health.utils.ApmHelper;
import com.xiaomi.hm.health.utils.DataCleanManager;
import com.xiaomi.hm.health.utils.RecordUtils;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.watchfacestore.WatchFaceHelper;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import com.xiaomi.hm.health.webapi.account.model.HMBeanPersonInfo;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 [2\u00020\u0001:\u0001[B\u000f\u0012\u0006\u0010X\u001a\u00020\u0018¢\u0006\u0004\bY\u0010ZJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J4\u0010\u0011\u001a\u00020\u00042*\u0010\u0010\u001a&\u0012\u0004\u0012\u00020\f\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bj\u0002`\u000f0\r0\u000bH\u0002J\u001c\u0010\u0015\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0016\u0010\u001d\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001bH\u0016J \u0010 \u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010$\u001a\u00020!H\u0016J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0002H\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u000eH\u0016J$\u00101\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020/0.H\u0016J\b\u00102\u001a\u00020\u0004H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u00020!H\u0016J\b\u00105\u001a\u00020\u0004H\u0016J\b\u00106\u001a\u00020\u0004H\u0016J\b\u00107\u001a\u00020\u0004H\u0016J\b\u00108\u001a\u00020\u0004H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020:09H\u0016J\b\u0010<\u001a\u00020\u0004H\u0016J\b\u0010=\u001a\u00020\u0004H\u0016J\b\u0010>\u001a\u00020!H\u0016J \u0010C\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020AH\u0016J\u0014\u0010E\u001a\u0004\u0018\u00010\u000e2\b\u0010D\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010G\u001a\u0004\u0018\u00010FH\u0016J\u0018\u0010J\u001a\u00020\u00042\u0006\u0010H\u001a\u00020&2\u0006\u0010I\u001a\u00020\u000eH\u0016J\b\u0010L\u001a\u00020KH\u0016J\b\u0010M\u001a\u00020\u0004H\u0016J\u001e\u0010O\u001a\u0004\u0018\u00010\u000e2\b\u0010D\u001a\u0004\u0018\u00010\u000e2\b\u0010N\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010P\u001a\u00020!H\u0016J\u0010\u0010Q\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010R\u001a\u00020\u0004H\u0016J\b\u0010S\u001a\u00020\u0004H\u0016R\u0019\u0010X\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006\\"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/imp/AccountDelegateImp;", "Lcom/huami/account/IAccountDelegate;", "Lcom/xiaomi/hm/health/webapi/account/model/HMBeanPersonInfo;", "hmBeanPersonInfo", "", GoogleApiAvailabilityLight.a, "e", "Lorg/json/JSONObject;", "json", "i", z.j, "", "Lcom/huami/userproperty/entity/AbsFetchParams;", "Lcom/huami/userproperty/service/entity/remote/FetchResult$Success;", "", "Lcom/huami/userproperty/entity/RawResult;", "result", "h", "Landroid/content/Intent;", "from", "to", "c", "Landroid/content/SharedPreferences;", "initAccountKeeper", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "goAccountMifit", "", "hosts", "onHttpDnsInit", AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "huamiId", "initDB", "", "syncNeededUserData", "initData", "isNewUser", "goMainTabPage", "", "loginType", "personInfo", "afterLoginSuccess", "userId", "keepDataRemoveData", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "info", "", "", "params", "interceptUpdateProfile", "unInitWhenLogout", "isStaging", "updateCompanionHosts", "clearDataExternal", "goStartUpActivityFromLogout", "goStartUpActivityLoginMi", "afterLogoutActions", "", "Lcom/huami/account/bean/LogoutSyncTask;", "externalSyncDataActionsWhenLogout", "forceLogoutAndClearAllData", "cleanApplicationData", "refreshMiTokenExternalConditions", "refreshToken", "accessToken", "", "expiresIn", "saveTokenToWatch", "deviceId", "getMiotDid", "Lcom/huami/account/bean/AuthDevice;", "getCurrentDevice", "source", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_AUTH_KEY_NEW, "updateDeviceAuthKey", "Lcom/huami/account/bean/AuthDeviceSource;", "getInvalidAuthKeyDeviceSource", "updateSpeechMiotToken", "miotDid", "getDefaultDeviceState", "getDeviceListFromServer", "syncUserSettings", "setActiveHistoryLogin", "processExitingUser", "a", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AccountDelegateImp implements IAccountDelegate {

    @NotNull
    public static final String TAG = "AccountDelegateImp";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context applicationContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "用户退出登录清除 token";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/Intent;", "intent", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Intent, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull Intent intent) {
            intent.putExtra(MainTabActivity.NEW_REGISTERED_USER, true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
            a(intent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/userproperty/entity/BatchFetchResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.imp.AccountDelegateImp$syncUserSettings$fetchResult$1", f = "AccountDelegateImp.kt", i = {}, l = {476}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BatchFetchResult>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super BatchFetchResult> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ResultFuture<BatchFetchResult> resultFutureFetchAllRegistered = UserPropertyManager.INSTANCE.fetchAllRegistered();
                this.a = 1;
                obj = resultFutureFetchAllRegistered.get(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public AccountDelegateImp(@NotNull Context context) {
        this.applicationContext = context;
    }

    private final void c(Intent from, Intent to) {
        if (from == null || to == null) {
            return;
        }
        Uri data = from.getData();
        Bundle extras = from.getExtras();
        if (data != null) {
            to.setData(data);
        }
        if (extras != null) {
            to.putExtras(extras);
        }
    }

    private final void d(HMBeanPersonInfo hmBeanPersonInfo) {
        if (hmBeanPersonInfo.getAlarmClocks() == null || hmBeanPersonInfo.getAlarmClocks().size() <= 0) {
            return;
        }
        AlarmClockManager.initAlarmForLogin(hmBeanPersonInfo.getAlarmClocks());
    }

    private final void e() {
        Pair<Long, Long> weekStartEndTime = ExerciseHistoryDateUtils.getWeekStartEndTime(Calendar.getInstance().getTime());
        HistoryRecordManager.getInstance().loadWebDataByTimeRangeInRx((Long) weekStartEndTime.first, (Long) weekStartEndTime.second, new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())).subscribe(new Action1() { // from class: e3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                AccountDelegateImp.f((Boolean) obj);
            }
        }, new Action1() { // from class: f3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                AccountDelegateImp.g((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Throwable th) {
        th.printStackTrace();
    }

    private final void h(Map<AbsFetchParams, FetchResult.Success<Map<String, String>>> result) {
        Set<Map.Entry<String, String>> setEntrySet;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<AbsFetchParams, FetchResult.Success<Map<String, String>>>> it2 = result.entrySet().iterator();
        while (it2.hasNext()) {
            Map<String, String> value = it2.next().getValue().getValue();
            List list = null;
            if (value != null && (setEntrySet = value.entrySet()) != null) {
                list = CollectionsKt___CollectionsKt.toList(setEntrySet);
            }
            if (list != null) {
                arrayList.add(list);
            }
        }
        List<Map.Entry> listFlatten = CollectionsKt__IterablesKt.flatten(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFlatten, 10));
        for (Map.Entry entry : listFlatten) {
            arrayList2.add(TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        Map map = r.toMap(arrayList2);
        if (map.containsKey(Property.PROPERTY_GPS_SYNC_TIME)) {
            try {
                String str = (String) map.get(Property.PROPERTY_GPS_SYNC_TIME);
                if (str == null) {
                    return;
                }
                i(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
    }

    private final void i(JSONObject json) {
        try {
            long j = json.getLong(EcgData.TIMESTAMP_SERVER_UPDATED) * ((long) 1000);
            Calendar calendar = Calendar.getInstance(ProfileUtils.getTimezone((byte) json.getInt("timeZone")));
            calendar.setTimeInMillis(j);
            HMDeviceManager.getInstance().setGpsSyncTime(HMDeviceType.MILI, calendar);
        } catch (JSONException unused) {
        }
    }

    private final void j() {
        HMAppSortDataManager.clear();
        DeviceCenter.getInstance().setUserData(HMDeviceUtils.getThirdPartyUserData());
        DeviceManageModules deviceManageModules = DeviceManageModules.INSTANCE;
        deviceManageModules.closeWatchSettingsScope();
        deviceManageModules.closeDeviceDataScope();
        EarbudConfigDataManager.INSTANCE.getInstance().reLoadConfig();
        EventRemindManager.syncReminderFromServer();
    }

    @Override // com.huami.account.IAccountDelegate
    public void afterLoginSuccess(int loginType, @NotNull HMBeanPersonInfo personInfo) {
        d(personInfo);
        j();
        if (loginType == 1) {
            AccountCallback.onLoginSuccess(CompanionApplication.get());
        }
        if (loginType == 2) {
            HMUserPropertiesAPI.postProperty(new PropertyItem(HMProperty.PROPERTY_KEY_APPLICATION_NAME, Utils.getApplicationName()), false, (IHMBasicHttpResponseHandler) new IHMSimpleHttpResponseHandler() { // from class: com.xiaomi.hm.health.di.koin.imp.AccountDelegateImp.afterLoginSuccess.1
                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onFailure(@NotNull HMHttpResponseData item) {
                }

                @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
                public void onSuccess(@NotNull WebResponse response, @NotNull HMHttpResponseData item) {
                }
            });
        }
        if (loginType == 1 || loginType == 2) {
            ApmHelper.enable();
        }
        SkyServiceKt.getSkyNotification().startSleepReminderAlarm();
    }

    @Override // com.huami.account.IAccountDelegate
    public void afterLogoutActions() {
        KoinHelperKt.onUserDestroy();
        KoinLifecycleManager.INSTANCE.stopUserLifecycle();
        PushHelper.INSTANCE.unregister();
        ApmHelper.disable();
    }

    @Override // com.huami.account.IAccountDelegate
    public void cleanApplicationData() {
        DataCleanManager.cleanApplicationData(BraceletApp.getContext(), new String[0]);
    }

    @Override // com.huami.account.IAccountDelegate
    public void clearDataExternal() {
        WatchFaceHelper.INSTANCE.deleteSupportPayRecord();
        new FemaleAppNoticeHelperAdapter().getFemaleAppNoticeHelper().cancelCurrentUserAppNotifyTask(BraceletApp.getContext());
        ((FemaleMifitViewModel) KoinJavaComponent.inject$default(FemaleMifitViewModel.class, null, null, 6, null).getValue()).clearFemaleData();
        ExternalLogoutManager.clearAllWeightInfos();
        RunningManager.logout(BraceletApp.getContext());
        if (SecondaryScreen.getInstance() != null) {
            SecondaryScreen.getInstance().clearAll();
        }
        RelationServiceKt.getRelationService().cleanData();
        NotificationManager notificationManager = (NotificationManager) BraceletApp.getContext().getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
        ThreadPoolManager.getInstance().stopAllTask();
        BraceletApp.exitApp();
        HMKeepDataManager.keepData();
        WebActivityUtil.removeCookies(BraceletApp.getContext());
        TrainingLib.logout();
        RedDotManager.getManager().clear();
        AlarmClockManager.destroy();
        Analytics.onLogout();
        AdRepository.getInstance().clearData();
        LocWeatherManager.getInstance().clearData();
        HMAppSortDataManager.clear();
        HMDevicePropertyCache.INSTANCE.clear();
        RecordUtils.releaseSpeechResource();
        AccountCallback.onLogoutSuccess(BraceletApp.getContext(), true);
        AppNotification.cancelFwUpgradeFinish();
        SnoreDataManager.instance.clearSnoreData(BraceletApp.getContext());
        HealthDataDb.INSTANCE.clean();
        XiaomiTokenMananger.clearXiaomiToken();
        XiaomiTokenMananger.clearAllDeviceToken();
        HMLog.info(XiaoMiTokenImpl.TOKEN_CLEAR_TAG, a.a);
        TempUseCaseUtils.INSTANCE.cleanDb();
        DeviceDataDb.INSTANCE.logout();
        AtrialFibUseCaseUtils.INSTANCE.clearAllData();
        Spo2Proxy.INSTANCE.clearData();
        StressUseCaseUtils.INSTANCE.cleanDb();
        RespRateUseCaseUtils.INSTANCE.clearRespRateData();
        SkyServiceHelperKt.getSkyService().logoutSkyService();
        SkyServiceKt.getSkyNotification().cancelSleepReminderAlarm();
        BloodPressureHelper.INSTANCE.cleanBloodPressureData();
        HeartRateCenter.INSTANCE.clear();
        PHNDataUploadAndCleanLogic.INSTANCE.cleanData();
    }

    @Override // com.huami.account.IAccountDelegate
    @NotNull
    public List<LogoutSyncTask> externalSyncDataActionsWhenLogout() {
        return ExternalLogoutManager.syncDataWhenLogout();
    }

    @Override // com.huami.account.IAccountDelegate
    public void forceLogoutAndClearAllData() {
        cleanApplicationData();
        HMKeeper.clear();
    }

    @NotNull
    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // com.huami.account.IAccountDelegate
    @Nullable
    public AuthDevice getCurrentDevice() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (device == null) {
            return null;
        }
        HMDeviceSource deviceSource = device.getMDeviceSource();
        AuthDeviceSource authDeviceSource = new AuthDeviceSource(deviceSource.getValue(), deviceSource.getType().getValue());
        DeviceInfo deviceInfo = device.getDeviceInfo();
        if (deviceInfo == null) {
            return null;
        }
        String serialNumber = deviceInfo.getSerialNumber();
        String deviceID = deviceInfo.getDeviceID();
        if (deviceID == null) {
            deviceID = "";
        }
        return new AuthDevice(authDeviceSource, serialNumber, deviceID);
    }

    @Override // com.huami.account.IAccountDelegate
    @Nullable
    public String getDefaultDeviceState(@Nullable String deviceId, @Nullable String miotDid) {
        return DeviceUtils.getDefaultState(deviceId, miotDid);
    }

    @Override // com.huami.account.IAccountDelegate
    public boolean getDeviceListFromServer() {
        final WebResponse webResponse = new WebResponse();
        HMDeviceWebAPI.getDeviceListFromServerSync(new IHMSimpleHttpResponseHandler() { // from class: com.xiaomi.hm.health.di.koin.imp.AccountDelegateImp.getDeviceListFromServer.1
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
            }

            @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
            public void onSuccess(@NotNull WebResponse response, @NotNull HMHttpResponseData item) {
                if (item.isSuccess()) {
                    ArrayList<Device> deviceListFromWeb = HMDeviceWebAPI.parseDeviceListFromWeb(item);
                    if (deviceListFromWeb != null) {
                        HMDaoManager.getInstance().getDeviceDao().insertOrReplaceInTx(deviceListFromWeb);
                    }
                    webResponse.code = 1;
                }
            }
        }, true);
        return webResponse.success();
    }

    @Override // com.huami.account.IAccountDelegate
    @NotNull
    public AuthDeviceSource getInvalidAuthKeyDeviceSource() {
        HMDeviceSource invalidAuthKeyDeviceSource = HMDeviceManager.getInstance().getInvalidAuthKeyDeviceSource();
        return new AuthDeviceSource(invalidAuthKeyDeviceSource.getValue(), invalidAuthKeyDeviceSource.getType().getValue());
    }

    @Override // com.huami.account.IAccountDelegate
    @Nullable
    public String getMiotDid(@Nullable String deviceId) {
        return XiaoAiConfigConstantsKt.getMiotDid(deviceId);
    }

    @Override // com.huami.account.IAccountDelegate
    public void goAccountMifit(@NotNull Context context) {
        Utils.goAccountMifit(context);
    }

    @Override // com.huami.account.IAccountDelegate
    public void goMainTabPage(@NotNull Context context, boolean isNewUser) {
        if (isNewUser) {
            AccountNavController.navigateToMain(context, b.a);
        } else {
            AccountNavController.navigateToMain$default(context, null, 2, null);
        }
    }

    @Override // com.huami.account.IAccountDelegate
    public void goStartUpActivityFromLogout() {
    }

    @Override // com.huami.account.IAccountDelegate
    public void goStartUpActivityLoginMi() {
    }

    @Override // com.huami.account.IAccountDelegate
    @NotNull
    public SharedPreferences initAccountKeeper() {
        return HMKeeper.init(this.applicationContext);
    }

    @Override // com.huami.account.IAccountDelegate
    public void initDB(@NotNull Context context, @NotNull String thirdName, @NotNull String huamiId) {
        KoinLifecycleManager.INSTANCE.startUserLifecycle();
        BraceletApp.initDB(context, thirdName, huamiId);
    }

    @Override // com.huami.account.IAccountDelegate
    public void initData() {
        BraceletApp.initData();
    }

    @Override // com.huami.account.IAccountDelegate
    public void interceptUpdateProfile(@NotNull HMPersonInfo info, @NotNull Map<String, Object> params) {
        try {
            params.put(HMAccountWebAPI.PARAM_BIND_PERSON_ALARM_CLOCK, UtilsKt.checkNull(URLEncoder.encode(HMHttpUtils.getGson().toJson(AlarmClockManager.getAlarmForSync()), "utf-8")));
        } catch (Exception e2) {
            HMLog.info(TAG, new c(e2));
        }
        try {
            params.put("config", UtilsKt.checkNull(URLEncoder.encode(HMAccountWebExtAPI.getMiliConfigJson(info), "utf-8")));
        } catch (Exception e3) {
            HMLog.info(TAG, new d(e3));
        }
    }

    @Override // com.huami.account.IAccountDelegate
    public boolean isChineseOnly() {
        return IAccountDelegate.DefaultImpls.isChineseOnly(this);
    }

    @Override // com.huami.account.IAccountDelegate
    public void keepDataRemoveData(@NotNull String userId) {
        HMKeepDataManager.removeData(userId);
    }

    @Override // com.huami.account.IAccountDelegate
    public void onHttpDnsInit(@NotNull Set<String> hosts) {
        hosts.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{AdRepository.HUAMI_PRODUCT_HOST, ThirdAuthApi.INSTANCE.getOriHost(HMServerDef.isProductUrl())}));
    }

    @Override // com.huami.account.IAccountDelegate
    public void processExitingUser() {
        BraceletApp.processOldUser();
    }

    @Override // com.huami.account.IAccountDelegate
    public boolean refreshMiTokenExternalConditions() {
        return (WalletUI.getInstance().isInWallet() || AccessDoorUI.getInstance().isInAccessDoor()) ? false : true;
    }

    @Override // com.huami.account.IAccountDelegate
    public void saveTokenToWatch(@NotNull String refreshToken, @NotNull String accessToken, long expiresIn) {
        ThirdPartyToken thirdPartyToken = new ThirdPartyToken();
        thirdPartyToken.setRefreshToken(refreshToken);
        thirdPartyToken.setAccessToken(accessToken);
        thirdPartyToken.setExpiresIn(expiresIn);
        AccountMiTokenUtil.saveMiToken(thirdPartyToken);
        AccountMiTokenUtil.broadcastMiAuthState(BraceletApp.getContext(), true);
    }

    @Override // com.huami.account.IAccountDelegate
    public void setActiveHistoryLogin() {
        HMKeeper.setActiveHistory(3);
    }

    @Override // com.huami.account.IAccountDelegate
    public boolean syncNeededUserData() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            e();
            HistoryRecordManager.getInstance().reqLatestExerciseHistoryInRx();
            BraceletApp.processOldUser();
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.TRUE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    @Override // com.huami.account.IAccountDelegate
    public boolean syncUserSettings(@NotNull Context context) {
        BatchFetchResult batchFetchResult = (BatchFetchResult) kotlinx.coroutines.d.b(null, new e(null), 1, null);
        if (!batchFetchResult.isSuccess()) {
            return false;
        }
        h(batchFetchResult.getSuccessItems());
        return Account.syncUserSettings(context);
    }

    @Override // com.huami.account.IAccountDelegate
    public void unInitWhenLogout() {
        HMUnbindBaseLogic.unbindThirdRelationForMiLi(BraceletApp.getContext(), "AccountDelegateImp.unInitWhenLogout");
        HMDeviceManager.getInstance().deInitDevices();
        BindUtil.disconnectAllDevices(CompanionApplication.get());
        KoinHelperKt.onUserDestroy();
        ResidentNotificationManager.cancelAllNotification();
        VibrateRepo.getInstance().clear();
        AtrialFibUseCaseUtils.INSTANCE.clearDataWhenLogOut();
        UserPropertyManager.INSTANCE.clearData();
        HMKeeper.setLastTimeUnit(-1);
        ((FeedbackService) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(FeedbackService.class), null, null)).clearFeedbackNotification(this.applicationContext);
    }

    @Override // com.huami.account.IAccountDelegate
    public void updateCompanionHosts(boolean isStaging) {
        HttpKitHelper.INSTANCE.initHttp();
        Cloud.get().updateHosts(Account.isOversea(this.applicationContext), isStaging);
    }

    @Override // com.huami.account.IAccountDelegate
    public void updateDeviceAuthKey(int source, @NotNull String authKey) {
        HMDeviceManager.getInstance().updateAuthKey(HMDeviceSource.fromValue(source), authKey);
    }

    @Override // com.huami.account.IAccountDelegate
    public void updateSpeechMiotToken() {
    }
}
