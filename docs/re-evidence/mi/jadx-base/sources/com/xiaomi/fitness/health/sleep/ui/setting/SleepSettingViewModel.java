package com.xiaomi.fitness.health.sleep.ui.setting;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ScopeExtKt;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.BackgroundRestrictionUtil;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel;
import com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepSettingRepository;
import com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference;
import com.xiaomi.fitness.health.sleep.utils.SleepSettingPreference;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import com.xiaomi.fitness.sleep.trace.SleepTraceConfiguration;
import com.xiaomi.fitness.sleep.trace.SleepTracer;
import com.xiaomi.fitness.sleep.trace.extensions.TraceExtKt;
import com.xiaomi.fitness.user.info.export.UserInformationManager;
import com.xiaomi.fitness.user.info.export.UserInformationManagerExtKt;
import com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack;
import com.xiaomi.fitness.util.DeviceModelExtKt;
import com.xiaomi.onetrack.c.q;
import defpackage.c0j;
import defpackage.h4b;
import defpackage.ls9;
import defpackage.s7r;
import defpackage.ur9;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u0000 \u0085\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0085\u0001B\n\b\u0007¢\u0006\u0005\b\u0084\u0001\u0010\fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0003*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0007J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u0007J(\u0010\u001e\u001a\u00020\u0005*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u001dH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u001bH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020\u0003*\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020\u0003*\u00020(H\u0002¢\u0006\u0004\b+\u0010*J\u0013\u0010,\u001a\u00020\u0003*\u00020(H\u0002¢\u0006\u0004\b,\u0010*J\u0013\u0010-\u001a\u00020\u0003*\u00020(H\u0002¢\u0006\u0004\b-\u0010*J\u0013\u0010.\u001a\u00020\u0003*\u00020(H\u0002¢\u0006\u0004\b.\u0010*J\u0013\u0010/\u001a\u00020\u0003*\u00020(H\u0002¢\u0006\u0004\b/\u0010*J\u0013\u00100\u001a\u00020(*\u00020(H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J#\u0010:\u001a\u00020\u00052\u0006\u00107\u001a\u0002062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u001b08¢\u0006\u0004\b:\u0010;J#\u0010<\u001a\u00020\u00052\u0006\u00107\u001a\u0002062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000308¢\u0006\u0004\b<\u0010;J\u001f\u0010=\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b=\u0010\nJ\r\u0010>\u001a\u00020\u0005¢\u0006\u0004\b>\u0010\fJ\u0019\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0?¢\u0006\u0004\b@\u0010AJ\u001d\u0010D\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001b¢\u0006\u0004\bD\u0010\"J\u0017\u0010G\u001a\u00020\u00052\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\bI\u0010\u0007J\r\u0010J\u001a\u00020\u0003¢\u0006\u0004\bJ\u0010'J\u0015\u0010L\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u0003¢\u0006\u0004\bL\u0010\u0007J\r\u0010M\u001a\u00020\u001b¢\u0006\u0004\bM\u0010NJ\u0013\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001b0O¢\u0006\u0004\bP\u0010QJ\u0015\u0010R\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u001b¢\u0006\u0004\bR\u0010%J\u0015\u0010S\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u0003¢\u0006\u0004\bS\u0010\u0007J\r\u0010T\u001a\u00020\u0003¢\u0006\u0004\bT\u0010'J\u0013\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00030O¢\u0006\u0004\bU\u0010QJ\r\u0010V\u001a\u00020\u0005¢\u0006\u0004\bV\u0010\fJ\u0015\u0010W\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u0003¢\u0006\u0004\bW\u0010\u0007J\r\u0010X\u001a\u00020\u0005¢\u0006\u0004\bX\u0010\fR\u001f\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030Y8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bZ\u0010\\R\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001b0Y8\u0006¢\u0006\f\n\u0004\b]\u0010[\u001a\u0004\b^\u0010\\R\"\u0010`\u001a\u00020_8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010g\u001a\u00020f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001b\u0010r\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\u001b0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010[R\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00030Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010[R\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010o\u001a\u0004\bw\u0010xR\u0018\u0010{\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010~\u001a\u00020}8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0086\u0001"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/SleepSettingViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/health/sleep/ui/setting/SleepSettingModel;", "", "switch", "", "setSleepBreathDetectionSwitchHuami", "(Z)V", "isDetection", "setSleepBreathDetectionSwitchBle", "(ZZ)V", "onSettingConfigLoaded", "()V", "Lkotlin/Function0;", "callback", "loadAssistSleepSwitch", "(Lkotlin/jvm/functions/Function0;)V", "loadHuamiAssistSleepSwitch", "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "isSleepAIDSDetectionEnable", "(Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;)Z", "loadBleAssistSleepSwitch", "checked", "setHuamiAssistSleepSwitch", "isChecked", "setBleAssistSleepSwitch", "Lkotlinx/coroutines/CoroutineScope;", "", "sleepGoalTime", "Lcom/xiaomi/fitness/user/info/export/callback/SendProfileCallBack;", "sendSleepProfile", "(Lkotlinx/coroutines/CoroutineScope;ILcom/xiaomi/fitness/user/info/export/callback/SendProfileCallBack;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preSleepGoal", "trackSleepGoal", "(II)V", "status", "postStatus", "(I)V", "isScheduleActivityAvailable", "()Z", "Lls9;", "isSupportAssistSleep", "(Lls9;)Z", "isSupportSleepBreath", "isSleepSwitchOn", "isSupportSleepRate", "isSleepBreathSwitchOn", "isSleepRateSwitchOn", "deepCopy", "(Lls9;)Lls9;", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/Observer;", "observer", "observerLoadStatus", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V", "observerDeepLightDetectionLiveData", "setSleepBreathSwitch", "loadSleepSettingConfig", "Lkotlin/Pair;", "getCurSleepGoal", "()Lkotlin/Pair;", "hourValue", "minute", "setSleepGoal", "Landroid/view/View;", "view", "onSleepScheduleItemClicked", "(Landroid/view/View;)V", "setAssistSleepSwitch", "getAutoClearAudioFileValue", "enabled", "setAutoClearAudioFileEnabled", "getSnoreAndSleepWordsDetectionValue", "()I", "Landroidx/lifecycle/LiveData;", "getSnoreDetectSwitchStateLiveData", "()Landroidx/lifecycle/LiveData;", "setSnoreAndSleepWordsDetectionStatusToSP", "setDeepLightSleepDetectEnable", "getDeepLightDetectEnable", "getDeepLightDetectEnableLiveData", "setSnoreDetectionSwitchCloseOnce", "setSleepSnoreDetectionEnable", "queryRestrictionLevel", "Landroidx/lifecycle/MutableLiveData;", "isNoRestrictedLevelLiveData", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "restrictionLevelLiveData", "getRestrictionLevelLiveData", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "mAccountRequest", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "getMAccountRequest", "()Lcom/xiaomi/fitness/account/api/AccountRequest;", "setMAccountRequest", "(Lcom/xiaomi/fitness/account/api/AccountRequest;)V", "Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "mSleepTracer$delegate", "Lkotlin/Lazy;", "getMSleepTracer", "()Lcom/xiaomi/fitness/sleep/trace/SleepTracer;", "mSleepTracer", "loadStatus", "deepLightDetection", "Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "settingRepo$delegate", "getSettingRepo", "()Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "settingRepo", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "hrConfig", "Ljava/lang/Object;", "", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepSettingViewModel.kt\ncom/xiaomi/fitness/health/sleep/ui/setting/SleepSettingViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,592:1\n1#2:593\n*E\n"})
public class SleepSettingViewModel extends BaseViewModel<SleepSettingModel> {
    public static final int DETECTION_MODE_ALL = 3;
    public static final int DETECTION_MODE_CLOSE = 0;
    public static final int DETECTION_MODE_HR = 2;
    public static final int DETECTION_MODE_SLEEP = 1;

    @NotNull
    protected static final String INTENT_CLOCK_ACTION = "com.android.deskclock.BEDTIME_MANAGE";
    public static final int LOAD_STATUS_DEVICE_NOT_CONNECT = 4;
    public static final int LOAD_STATUS_DONE = 2;
    public static final int LOAD_STATUS_ERROR = 3;
    public static final int LOAD_STATUS_LOADING = 1;
    public static final int LOAD_STATUS_SET_ERROR = 5;
    public static final int OPEN_ASSIST_DONE = 6;

    @Nullable
    private WearableDeviceModel device;
    private Object hrConfig;
    public AccountRequest mAccountRequest;
    public UserInfoManager mUserInfoManager;

    @NotNull
    private final MutableLiveData<Boolean> isNoRestrictedLevelLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> restrictionLevelLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: mSleepTracer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepTracer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: aym
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepSettingViewModel.mSleepTracer_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<Integer> loadStatus = new MutableLiveData<>(-1);

    @NotNull
    private final MutableLiveData<Boolean> deepLightDetection = new MutableLiveData<>(Boolean.TRUE);

    /* JADX INFO: renamed from: settingRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bym
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepSettingViewModel.settingRepo_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel$loadSleepSettingConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel$loadSleepSettingConfig$1", f = "SleepSettingViewModel.kt", i = {0}, l = {201}, m = "invokeSuspend", n = {"sleepGoalTime"}, s = {"I$0"})
    public static final class C25261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        int label;

        public C25261(Continuation<? super C25261> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(SleepSettingViewModel sleepSettingViewModel) {
            sleepSettingViewModel.onSettingConfigLoaded();
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25261 c25261 = SleepSettingViewModel.this.new C25261(continuation);
            c25261.L$0 = obj;
            return c25261;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x007f  */
        /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:35:0x0102  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int dailySleepGoal;
            int i;
            WearableDeviceModel wearableDeviceModel;
            boolean z;
            boolean zIsSupport;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            boolean z2 = false;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                boolean zIsLogin = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin();
                dailySleepGoal = zIsLogin ? UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getDailySleepGoal() : HealthPrefer.INSTANCE.getSLEEP_GOAL_TIME_LOCAL();
                if (zIsLogin && dailySleepGoal == 0) {
                    SleepSettingViewModel sleepSettingViewModel = SleepSettingViewModel.this;
                    this.I$0 = 480;
                    this.label = 1;
                    if (SleepSettingViewModel.sendSleepProfile$default(sleepSettingViewModel, coroutineScope, 480, null, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = 480;
                }
                SleepSettingViewModel.this.getMModel().setSleepGoalTime(dailySleepGoal);
                wearableDeviceModel = SleepSettingViewModel.this.device;
                if (wearableDeviceModel == null && wearableDeviceModel.getIsDeviceConnected() && DeviceModelExtKt.isSupportAssistSleep(wearableDeviceModel)) {
                    z = true;
                } else {
                    z = false;
                }
                SleepSettingViewModel.this.getMModel().getDeviceSupport().set(z);
                zIsSupport = SleepSettingViewModel.this.getMSleepTracer().isSupport();
                Logger.d(SleepSettingViewModel.this.getTAG(), "sleepTracerSupport :" + zIsSupport);
                SleepSettingViewModel.this.getMModel().getRomSupport().set(zIsSupport);
                ObservableBoolean scheduleSupport = SleepSettingViewModel.this.getMModel().getScheduleSupport();
                if (zIsSupport && SleepSettingViewModel.this.isScheduleActivityAvailable()) {
                    z2 = true;
                }
                scheduleSupport.set(z2);
                SleepSettingViewModel.this.getMModel().getSleepTraceEnabled().set(SleepTraceConfiguration.INSTANCE.isEnable(ApplicationExtKt.getApplication()));
                if (z) {
                    final SleepSettingViewModel sleepSettingViewModel2 = SleepSettingViewModel.this;
                    sleepSettingViewModel2.loadAssistSleepSwitch(new Function0() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SleepSettingViewModel.C25261.invokeSuspend$lambda$1(sleepSettingViewModel2);
                        }
                    });
                } else {
                    SleepSettingViewModel.this.onSettingConfigLoaded();
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            ResultKt.throwOnFailure(obj);
            dailySleepGoal = i;
            SleepSettingViewModel.this.getMModel().setSleepGoalTime(dailySleepGoal);
            wearableDeviceModel = SleepSettingViewModel.this.device;
            if (wearableDeviceModel == null) {
                z = false;
            } else {
                z = false;
            }
            SleepSettingViewModel.this.getMModel().getDeviceSupport().set(z);
            zIsSupport = SleepSettingViewModel.this.getMSleepTracer().isSupport();
            Logger.d(SleepSettingViewModel.this.getTAG(), "sleepTracerSupport :" + zIsSupport);
            SleepSettingViewModel.this.getMModel().getRomSupport().set(zIsSupport);
            ObservableBoolean scheduleSupport2 = SleepSettingViewModel.this.getMModel().getScheduleSupport();
            if (zIsSupport) {
                z2 = true;
            }
            scheduleSupport2.set(z2);
            SleepSettingViewModel.this.getMModel().getSleepTraceEnabled().set(SleepTraceConfiguration.INSTANCE.isEnable(ApplicationExtKt.getApplication()));
            if (z) {
                final SleepSettingViewModel sleepSettingViewModel3 = SleepSettingViewModel.this;
                sleepSettingViewModel3.loadAssistSleepSwitch(new Function0() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SleepSettingViewModel.C25261.invokeSuspend$lambda$1(sleepSettingViewModel3);
                    }
                });
            } else {
                SleepSettingViewModel.this.onSettingConfigLoaded();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel$sendSleepProfile$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel$sendSleepProfile$2", f = "SleepSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel$setHuamiAssistSleepSwitch$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel$setHuamiAssistSleepSwitch$1", f = "SleepSettingViewModel.kt", i = {0, 0}, l = {379}, m = "invokeSuspend", n = {q.f13857a, "originType"}, s = {"L$0", "I$0"})
    public static final class C25281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $checked;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25281(boolean z, Continuation<? super C25281> continuation) {
            super(2, continuation);
            this.$checked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepSettingViewModel.this.new C25281(this.$checked, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HRDetect hRDetect;
            int i;
            MutableLiveData mutableLiveData;
            int i2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = SleepSettingViewModel.this.hrConfig;
                if (obj2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("hrConfig");
                    obj2 = Unit.INSTANCE;
                }
                hRDetect = (HRDetect) obj2;
                int type = hRDetect.getType();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                SleepSettingViewModel$setHuamiAssistSleepSwitch$1$success$1 sleepSettingViewModel$setHuamiAssistSleepSwitch$1$success$1 = new SleepSettingViewModel$setHuamiAssistSleepSwitch$1$success$1(hRDetect, this.$checked, type, SleepSettingViewModel.this, null);
                this.L$0 = hRDetect;
                this.I$0 = type;
                this.label = 1;
                Object objWithContext = BuildersKt.withContext(io2, sleepSettingViewModel$setHuamiAssistSleepSwitch$1$success$1, this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = type;
                obj = objWithContext;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                hRDetect = (HRDetect) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.d(SleepSettingViewModel.this.getTAG(), "setHuamiAssistSleepSwitch result:" + zBooleanValue);
            if (zBooleanValue) {
                DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
                WearableDeviceModel wearableDeviceModel = SleepSettingViewModel.this.device;
                Intrinsics.checkNotNull(wearableDeviceModel);
                companion.sendSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.KE_HRDETECT, hRDetect);
                SleepSettingViewModel.this.getMModel().getDeviceSleepAssistSwitch().set(this.$checked);
                SleepSettingPreference sleepSettingPreference = SleepSettingPreference.INSTANCE;
                WearableDeviceModel wearableDeviceModel2 = SleepSettingViewModel.this.device;
                Intrinsics.checkNotNull(wearableDeviceModel2);
                sleepSettingPreference.setLastSleepAssistSwitchStatus(wearableDeviceModel2.getDid(), this.$checked);
                if (this.$checked) {
                    mutableLiveData = SleepSettingViewModel.this.loadStatus;
                    i2 = 6;
                } else {
                    mutableLiveData = SleepSettingViewModel.this.loadStatus;
                    i2 = 2;
                }
                mutableLiveData.postValue(Boxing.boxInt(i2));
            } else {
                hRDetect.setType(i);
                SleepSettingViewModel.this.loadStatus.postValue(Boxing.boxInt(5));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel$setSleepBreathDetectionSwitchHuami$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel$setSleepBreathDetectionSwitchHuami$1", f = "SleepSettingViewModel.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $switch;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25301(boolean z, Continuation<? super C25301> continuation) {
            super(2, continuation);
            this.$switch = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepSettingViewModel.this.new C25301(this.$switch, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                SleepSettingViewModel$setSleepBreathDetectionSwitchHuami$1$ret$1 sleepSettingViewModel$setSleepBreathDetectionSwitchHuami$1$ret$1 = new SleepSettingViewModel$setSleepBreathDetectionSwitchHuami$1$ret$1(SleepSettingViewModel.this, this.$switch, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, sleepSettingViewModel$setSleepBreathDetectionSwitchHuami$1$ret$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Logger.i(SleepSettingViewModel.this.getTAG(), "setSleepBreathDetectionSwitchHuami :" + zBooleanValue);
            if (zBooleanValue) {
                Object obj2 = SleepSettingViewModel.this.hrConfig;
                if (obj2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("hrConfig");
                    obj2 = Unit.INSTANCE;
                }
                HRDetect hRDetect = (HRDetect) obj2;
                hRDetect.setSleepBreathQualityEnable(this.$switch);
                DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
                WearableDeviceModel wearableDeviceModel = SleepSettingViewModel.this.device;
                Intrinsics.checkNotNull(wearableDeviceModel);
                companion.sendSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.KE_HRDETECT, hRDetect);
                SleepSettingViewModel.this.getMModel().getSleepBreathDetectionSwitch().postValue(Boxing.boxBoolean(this.$switch));
                Logger.i(SleepSettingViewModel.this.getTAG(), "sleepBreathDetectionSwitch init sleepBreathDetectionSwitch:" + hRDetect.isSleepBreathQualityEnable());
                SleepSettingViewModel.this.loadStatus.postValue(Boxing.boxInt(2));
            } else {
                SleepSettingViewModel.this.loadStatus.postValue(Boxing.boxInt(5));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel$setSleepGoal$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel$setSleepGoal$1", f = "SleepSettingViewModel.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $preSleepGoal;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25311(int i, Continuation<? super C25311> continuation) {
            super(2, continuation);
            this.$preSleepGoal = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25311 c25311 = SleepSettingViewModel.this.new C25311(this.$preSleepGoal, continuation);
            c25311.L$0 = obj;
            return c25311;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                SleepSettingViewModel sleepSettingViewModel = SleepSettingViewModel.this;
                sleepSettingViewModel.trackSleepGoal(this.$preSleepGoal, sleepSettingViewModel.getMModel().getSleepGoalTime());
                SleepSettingViewModel sleepSettingViewModel2 = SleepSettingViewModel.this;
                int sleepGoalTime = sleepSettingViewModel2.getMModel().getSleepGoalTime();
                final SleepSettingViewModel sleepSettingViewModel3 = SleepSettingViewModel.this;
                SendProfileCallBack sendProfileCallBack = new SendProfileCallBack() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel.setSleepGoal.1.1
                    @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
                    public void onProfileToDBSuccess(boolean result) {
                        Logger.i(sleepSettingViewModel3.getTAG(), "onSendSleepProfileToDBSuccess " + result);
                        sleepSettingViewModel3.loadStatus.postValue(2);
                    }

                    @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
                    public void onSendError() {
                        Logger.e(sleepSettingViewModel3.getTAG(), "onSendSleepProfileError");
                        sleepSettingViewModel3.loadStatus.postValue(3);
                    }

                    @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
                    public void onSendSuccess(UserProfile profile) {
                        Logger.i(sleepSettingViewModel3.getTAG(), "onSendSleepProfileSuccess, " + profile);
                        sleepSettingViewModel3.loadStatus.postValue(2);
                    }

                    @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
                    public void onSendError(int code) {
                        Logger.e(sleepSettingViewModel3.getTAG(), "onSendSleepProfileError " + code);
                        sleepSettingViewModel3.loadStatus.postValue(3);
                    }
                };
                this.label = 1;
                if (sleepSettingViewModel2.sendSleepProfile(coroutineScope, sleepGoalTime, sendProfileCallBack, this) == coroutine_suspended) {
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
            return ((C25311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final ls9 deepCopy(ls9 ls9Var) {
        Object objD = h4b.d(h4b.c(ls9Var), ls9.class);
        Intrinsics.checkNotNullExpressionValue(objD, "toObject(...)");
        return (ls9) objD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepTracer getMSleepTracer() {
        return (SleepTracer) this.mSleepTracer.getValue();
    }

    private final SleepSettingRepository getSettingRepo() {
        return (SleepSettingRepository) this.settingRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isScheduleActivityAvailable() {
        return new Intent(INTENT_CLOCK_ACTION).resolveActivity(ApplicationExtKt.getApplication().getPackageManager()) != null;
    }

    private final boolean isSleepAIDSDetectionEnable(HRDetect hRDetect) {
        return hRDetect.getType() == 1 || hRDetect.getType() == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSleepBreathSwitchOn(ls9 ls9Var) {
        return ls9Var.f25395k == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSleepRateSwitchOn(ls9 ls9Var) {
        return ls9Var.l == 1;
    }

    private final boolean isSleepSwitchOn(ls9 ls9Var) {
        ls9.a aVar = ls9Var.j;
        if (aVar != null) {
            return aVar.c;
        }
        return false;
    }

    private final boolean isSupportAssistSleep(ls9 ls9Var) {
        return ls9Var.j != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSupportSleepBreath(ls9 ls9Var) {
        return ls9Var.f25395k != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSupportSleepRate(ls9 ls9Var) {
        return ls9Var.l != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAssistSleepSwitch(Function0<Unit> callback) {
        WearableDeviceModel wearableDeviceModel = this.device;
        if (wearableDeviceModel == null || wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            this.loadStatus.postValue(4);
            return;
        }
        WearableDeviceModel wearableDeviceModel2 = this.device;
        if (wearableDeviceModel2 == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel2)) {
            loadBleAssistSleepSwitch(callback);
        } else {
            loadHuamiAssistSleepSwitch(callback);
        }
    }

    private final void loadBleAssistSleepSwitch(final Function0<Unit> callback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 10;
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel wearableDeviceModel = this.device;
        Intrinsics.checkNotNull(wearableDeviceModel);
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, wearableDeviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel.loadBleAssistSleepSwitch.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(SleepSettingViewModel.this.getTAG(), "loadAssistSleepSwitch onError " + code);
                SleepSettingViewModel.this.getMModel().getDeviceSleepAssistSwitch().set(false);
                callback.invoke();
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                ur9 ur9VarU;
                ls9 ls9VarZ;
                if (result == null || (packet = result.getPacket()) == null || (ur9VarU = packet.u()) == null || (ls9VarZ = ur9VarU.z()) == null) {
                    onError(did, type, -1);
                    return;
                }
                SleepSettingViewModel sleepSettingViewModel = SleepSettingViewModel.this;
                Function0<Unit> function0 = callback;
                sleepSettingViewModel.hrConfig = ls9VarZ;
                sleepSettingViewModel.getMModel().getDeviceSupport().set(sleepSettingViewModel.getMModel().getDeviceSupport().get() && ls9VarZ.j != null);
                ls9.a aVar = ls9VarZ.j;
                boolean z = aVar != null ? aVar.c : false;
                Logger.i(sleepSettingViewModel.getTAG(), "loadAssistSleepSwitch onSuccess " + z);
                sleepSettingViewModel.getMModel().getDeviceSleepAssistSwitch().set(z);
                if (sleepSettingViewModel.isSupportSleepBreath(ls9VarZ)) {
                    sleepSettingViewModel.getMModel().getSleepBreathDetectionSwitch().postValue(Boolean.valueOf(sleepSettingViewModel.isSleepBreathSwitchOn(ls9VarZ)));
                }
                sleepSettingViewModel.getMModel().getSleepBreathDetectionSupport().postValue(Boolean.valueOf(sleepSettingViewModel.isSupportSleepBreath(ls9VarZ)));
                if (sleepSettingViewModel.isSupportSleepRate(ls9VarZ)) {
                    sleepSettingViewModel.getMModel().getSleepBreathRateSwitch().postValue(Boolean.valueOf(sleepSettingViewModel.isSleepRateSwitchOn(ls9VarZ)));
                }
                sleepSettingViewModel.getMModel().getSleepBreathRateSupport().postValue(Boolean.valueOf(sleepSettingViewModel.isSupportSleepRate(ls9VarZ)));
                function0.invoke();
            }
        }, 0, 16, (Object) null);
    }

    private final void loadHuamiAssistSleepSwitch(Function0<Unit> callback) {
        DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
        WearableDeviceModel wearableDeviceModel = this.device;
        Intrinsics.checkNotNull(wearableDeviceModel);
        SettingItemEntity settingItemValue = companion.readSettingItemValue(wearableDeviceModel.getDid(), DeviceSettingConfigKey.KE_HRDETECT);
        Object objValueToObject = settingItemValue != null ? settingItemValue.valueToObject(HRDetect.class) : null;
        HRDetect hRDetect = objValueToObject instanceof HRDetect ? (HRDetect) objValueToObject : null;
        if (hRDetect == null) {
            hRDetect = new HRDetect();
            hRDetect.setType(2);
            hRDetect.setFreq(10);
            hRDetect.setWarningEnable(true);
            hRDetect.setWarningValue(150);
        }
        this.hrConfig = hRDetect;
        getMModel().getDeviceSleepAssistSwitch().set(isSleepAIDSDetectionEnable(hRDetect));
        getMModel().getSleepBreathDetectionSwitch().postValue(Boolean.valueOf(hRDetect.isSleepBreathQualityEnable()));
        Logger.i(getTAG(), "sleepBreathDetectionSwitch init sleepBreathDetectionSwitch:" + hRDetect.isSleepBreathQualityEnable());
        callback.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepTracer mSleepTracer_delegate$lambda$0() {
        return TraceExtKt.getInstance(SleepTracer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSettingConfigLoaded() {
        String tag = getTAG();
        WearableDeviceModel wearableDeviceModel = this.device;
        Boolean boolValueOf = wearableDeviceModel != null ? Boolean.valueOf(wearableDeviceModel.getIsDeviceConnected()) : null;
        Logger.i(tag, "onSettingConfigLoaded: " + boolValueOf + " " + getMModel());
        this.loadStatus.postValue(2);
    }

    private final void postStatus(int status) {
        this.loadStatus.postValue(Integer.valueOf(status));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryRestrictionLevel$lambda$8(SleepSettingViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BackgroundRestrictionUtil backgroundRestrictionUtil = BackgroundRestrictionUtil.INSTANCE;
        Application application = ApplicationExtKt.getApplication();
        String packageName = ApplicationExtKt.getApplication().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        int iQueryRestrictionLevel = backgroundRestrictionUtil.queryRestrictionLevel(application, packageName);
        this$0.restrictionLevelLiveData.postValue(Integer.valueOf(iQueryRestrictionLevel));
        this$0.isNoRestrictedLevelLiveData.postValue(backgroundRestrictionUtil.isNoRestrictedLevel(iQueryRestrictionLevel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendSleepProfile(CoroutineScope coroutineScope, int i, SendProfileCallBack sendProfileCallBack, Continuation<? super Unit> continuation) {
        boolean zIsLogin = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin();
        boolean netWorkAvailable = NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication());
        Logger.d(getTAG(), "sendSleepProfile:" + i + " " + zIsLogin + " " + netWorkAvailable);
        if (zIsLogin) {
            if (netWorkAvailable) {
                try {
                    try {
                        UserInformationManager.DefaultImpls.sendProfile$default(UserInformationManagerExtKt.getInstance(UserInformationManager.INSTANCE), 9, i, sendProfileCallBack, null, null, null, null, ScopeExtKt.scopeNetLife$default(this, null, new AnonymousClass2(null), 1, null), 120, null);
                    } catch (ApiException e) {
                        e = e;
                        Logger.e(getTAG(), "sendSleepProfile " + i + " error:", e);
                        ToastUtil.showShortToast(c0j.common_hint_unkonwn_error);
                    }
                } catch (ApiException e2) {
                    e = e2;
                }
            } else {
                Logger.e(getTAG(), "sendSleepProfile has not internet!");
                ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c0j.common_hint_network_unavailable);
                HealthPrefer.INSTANCE.setSLEEP_GOAL_TIME_LOCAL(i);
                if (sendProfileCallBack != null) {
                    sendProfileCallBack.onSendSuccess(null);
                }
            }
            return Unit.INSTANCE;
        }
        HealthPrefer.INSTANCE.setSLEEP_GOAL_TIME_LOCAL(i);
        if (sendProfileCallBack != null) {
            sendProfileCallBack.onSendSuccess(null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object sendSleepProfile$default(SleepSettingViewModel sleepSettingViewModel, CoroutineScope coroutineScope, int i, SendProfileCallBack sendProfileCallBack, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendSleepProfile");
        }
        if ((i2 & 2) != 0) {
            sendProfileCallBack = null;
        }
        return sleepSettingViewModel.sendSleepProfile(coroutineScope, i, sendProfileCallBack, continuation);
    }

    private final void setBleAssistSleepSwitch(final boolean isChecked) {
        Object obj = this.hrConfig;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrConfig");
            obj = Unit.INSTANCE;
        }
        if (!(obj instanceof ls9)) {
            this.loadStatus.postValue(5);
            return;
        }
        this.loadStatus.postValue(1);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 11;
        Object obj2 = this.hrConfig;
        if (obj2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrConfig");
            obj2 = Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.xiaomi.wear.protobuf.nano.FitnessProtos.HeartRateMonitor");
        ls9 ls9Var = (ls9) obj2;
        ls9.a aVar = ls9Var.j;
        if (aVar != null) {
            aVar.c = isChecked;
        }
        ur9 ur9Var = new ur9();
        ur9Var.o0(ls9Var);
        s7rVar.S(ur9Var);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel wearableDeviceModel = this.device;
        Intrinsics.checkNotNull(wearableDeviceModel);
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, wearableDeviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel.setBleAssistSleepSwitch.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e(SleepSettingViewModel.this.getTAG(), "setBleAssistSleepSwitch onSuccess " + code);
                SleepSettingViewModel.this.loadStatus.postValue(5);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                MutableLiveData mutableLiveData;
                int i;
                Logger.d(SleepSettingViewModel.this.getTAG(), "setBleAssistSleepSwitch onSuccess " + result);
                SleepSettingViewModel.this.getMModel().getDeviceSleepAssistSwitch().set(isChecked);
                SleepSettingPreference sleepSettingPreference = SleepSettingPreference.INSTANCE;
                WearableDeviceModel wearableDeviceModel2 = SleepSettingViewModel.this.device;
                Intrinsics.checkNotNull(wearableDeviceModel2);
                sleepSettingPreference.setLastSleepAssistSwitchStatus(wearableDeviceModel2.getDid(), isChecked);
                if (isChecked) {
                    mutableLiveData = SleepSettingViewModel.this.loadStatus;
                    i = 6;
                } else {
                    mutableLiveData = SleepSettingViewModel.this.loadStatus;
                    i = 2;
                }
                mutableLiveData.postValue(Integer.valueOf(i));
            }
        }, 0, 16, (Object) null);
    }

    private final void setHuamiAssistSleepSwitch(boolean checked) {
        Object obj = this.hrConfig;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrConfig");
            obj = Unit.INSTANCE;
        }
        if (!(obj instanceof HRDetect)) {
            this.loadStatus.postValue(5);
        } else {
            this.loadStatus.postValue(1);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C25281(checked, null), 3, null);
        }
    }

    private final void setSleepBreathDetectionSwitchBle(final boolean z, final boolean isDetection) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 11;
        Object obj = this.hrConfig;
        if (obj == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hrConfig");
            obj = Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.wear.protobuf.nano.FitnessProtos.HeartRateMonitor");
        ls9 ls9Var = (ls9) obj;
        if (isDetection) {
            ls9Var.f25395k = z ? 1 : 2;
        } else {
            ls9Var.l = z ? 1 : 2;
        }
        ls9 ls9VarDeepCopy = deepCopy(ls9Var);
        ur9 ur9Var = new ur9();
        ur9Var.o0(ls9VarDeepCopy);
        s7rVar.S(ur9Var);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel wearableDeviceModel = this.device;
        Intrinsics.checkNotNull(wearableDeviceModel);
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, wearableDeviceModel.getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel.setSleepBreathDetectionSwitchBle.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(this.getTAG(), "setSleepBreathDetectionSwitchBle onError " + code);
                this.loadStatus.postValue(3);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null || !result.isSuccess()) {
                    onError(did, type, -1);
                    return;
                }
                if (isDetection) {
                    this.getMModel().getSleepBreathDetectionSwitch().postValue(Boolean.valueOf(z));
                } else {
                    this.getMModel().getSleepBreathRateSwitch().postValue(Boolean.valueOf(z));
                }
                this.loadStatus.postValue(2);
            }
        }, 0, 16, (Object) null);
    }

    public static /* synthetic */ void setSleepBreathDetectionSwitchBle$default(SleepSettingViewModel sleepSettingViewModel, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSleepBreathDetectionSwitchBle");
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        sleepSettingViewModel.setSleepBreathDetectionSwitchBle(z, z2);
    }

    private final void setSleepBreathDetectionSwitchHuami(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C25301(z, null), 3, null);
    }

    public static /* synthetic */ void setSleepBreathSwitch$default(SleepSettingViewModel sleepSettingViewModel, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSleepBreathSwitch");
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        sleepSettingViewModel.setSleepBreathSwitch(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepSettingRepository settingRepo_delegate$lambda$1() {
        return new SleepSettingRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackSleepGoal(int preSleepGoal, int sleepGoalTime) {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        boolean z;
        WearableDeviceModel wearableDeviceModel;
        WearableDeviceModel wearableDeviceModel2;
        this.device = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        MutableLiveData<Boolean> sleepBreathDetectionSupport = getMModel().getSleepBreathDetectionSupport();
        WearableDeviceModel wearableDeviceModel3 = this.device;
        if (wearableDeviceModel3 != null) {
            z = true;
            if (!wearableDeviceModel3.getIsDeviceConnected() || (wearableDeviceModel = this.device) == null || com.xiaomi.fitness.device.manager.DeviceModelExtKt.isKongMing(wearableDeviceModel) || ((wearableDeviceModel2 = this.device) != null && com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBle(wearableDeviceModel2))) {
                z = false;
            }
        } else {
            z = false;
        }
        sleepBreathDetectionSupport.postValue(Boolean.valueOf(z));
    }

    public final boolean getAutoClearAudioFileValue() {
        return getSettingRepo().getAutoClearAudioFileValue();
    }

    @NotNull
    public final Pair<Integer, Integer> getCurSleepGoal() {
        return TuplesKt.to(Integer.valueOf(getMModel().getSleepGoalTime() / 60), Integer.valueOf(getMModel().getSleepGoalTime() % 60));
    }

    public final boolean getDeepLightDetectEnable() {
        return getSettingRepo().getDeepLightDetectEnable();
    }

    @NotNull
    public final LiveData<Boolean> getDeepLightDetectEnableLiveData() {
        return getSettingRepo().getDeepLightDetectEnableLiveData();
    }

    @NotNull
    public final AccountRequest getMAccountRequest() {
        AccountRequest accountRequest = this.mAccountRequest;
        if (accountRequest != null) {
            return accountRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountRequest");
        return null;
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    @NotNull
    public final MutableLiveData<Integer> getRestrictionLevelLiveData() {
        return this.restrictionLevelLiveData;
    }

    public final int getSnoreAndSleepWordsDetectionValue() {
        return getSettingRepo().getSleepSnoreSwitchStatus();
    }

    @NotNull
    public final LiveData<Integer> getSnoreDetectSwitchStateLiveData() {
        return getSettingRepo().getSnoreDetectSwitchStateLiveData();
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "SleepSettingViewModel";
    }

    @NotNull
    public final MutableLiveData<Boolean> isNoRestrictedLevelLiveData() {
        return this.isNoRestrictedLevelLiveData;
    }

    public final void loadSleepSettingConfig() {
        this.loadStatus.setValue(1);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25261(null), 2, null);
    }

    public final void observerDeepLightDetectionLiveData(@NotNull LifecycleOwner lifecycleOwner, @NotNull Observer<Boolean> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.deepLightDetection.observe(lifecycleOwner, observer);
    }

    public final void observerLoadStatus(@NotNull LifecycleOwner lifecycleOwner, @NotNull Observer<Integer> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.loadStatus.observe(lifecycleOwner, observer);
    }

    public final void onSleepScheduleItemClicked(@Nullable View view) {
        if (view != null) {
            try {
                Context context = view.getContext();
                if (context != null) {
                    context.startActivity(new Intent(INTENT_CLOCK_ACTION));
                }
            } catch (Exception e) {
                Logger.e(getTAG(), "onSleepScheduleItemClicked error", e);
                ToastUtil.showShortToast(c0j.common_hint_unkonwn_error);
            }
        }
    }

    public final void queryRestrictionLevel() {
        ExecutorHelper.runInBackground(new Runnable() { // from class: zxm
            @Override // java.lang.Runnable
            public final void run() {
                SleepSettingViewModel.queryRestrictionLevel$lambda$8(this.f41788a);
            }
        });
    }

    public final void setAssistSleepSwitch(boolean isChecked) {
        String tag = getTAG();
        WearableDeviceModel wearableDeviceModel = this.device;
        Logger.d(tag, "setAssistSleepSwitch " + (wearableDeviceModel != null ? com.xiaomi.fitness.device.manager.DeviceModelExtKt.getModel(wearableDeviceModel) : null) + " " + isChecked);
        if (this.hrConfig == null) {
            this.loadStatus.postValue(3);
            return;
        }
        WearableDeviceModel wearableDeviceModel2 = this.device;
        if (wearableDeviceModel2 == null || wearableDeviceModel2 == null || !wearableDeviceModel2.getIsDeviceConnected()) {
            postStatus(4);
            return;
        }
        WearableDeviceModel wearableDeviceModel3 = this.device;
        if (wearableDeviceModel3 == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel3)) {
            setBleAssistSleepSwitch(isChecked);
        } else {
            setHuamiAssistSleepSwitch(isChecked);
        }
    }

    public final void setAutoClearAudioFileEnabled(boolean enabled) {
        getSettingRepo().setAutoClearAudioFileEnabled(enabled);
    }

    public final void setDeepLightSleepDetectEnable(boolean enabled) {
        getSettingRepo().setDeepLightSleepDetectEnable(enabled);
    }

    public final void setMAccountRequest(@NotNull AccountRequest accountRequest) {
        Intrinsics.checkNotNullParameter(accountRequest, "<set-?>");
        this.mAccountRequest = accountRequest;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setSleepBreathSwitch(boolean z, boolean isDetection) {
        this.loadStatus.setValue(1);
        if (this.hrConfig == null) {
            this.loadStatus.postValue(3);
            return;
        }
        WearableDeviceModel wearableDeviceModel = this.device;
        if (wearableDeviceModel == null || wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            this.loadStatus.postValue(4);
            return;
        }
        WearableDeviceModel wearableDeviceModel2 = this.device;
        if (wearableDeviceModel2 == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isHuaMi(wearableDeviceModel2)) {
            setSleepBreathDetectionSwitchBle(z, isDetection);
        } else {
            setSleepBreathDetectionSwitchHuami(z);
        }
    }

    public final void setSleepGoal(int hourValue, int minute) {
        int sleepGoalTime = getMModel().getSleepGoalTime();
        getMModel().setSleepGoalTime((hourValue * 60) + minute);
        this.loadStatus.setValue(1);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25311(sleepGoalTime, null), 2, null);
    }

    public final void setSleepSnoreDetectionEnable(boolean enabled) {
        if (enabled) {
            TraceExtKt.getInstance(SleepTracer.INSTANCE).setSnoreDetectionStatus(2);
        } else {
            TraceExtKt.getInstance(SleepTracer.INSTANCE).setSnoreDetectionStatus(0);
        }
    }

    public final void setSnoreAndSleepWordsDetectionStatusToSP(int status) {
        if (status == 2) {
            SleepTracePermissionGuidePreference.INSTANCE.setOPEN_AUDIO_SWITCH_TIME(System.currentTimeMillis());
        }
        getSettingRepo().setSnoreAndSleepWordsDetectionStatusToSP(status);
    }

    public final void setSnoreDetectionSwitchCloseOnce() {
        TraceExtKt.getInstance(SleepTracer.INSTANCE).setSnoreDetectionStatus(1);
    }
}
