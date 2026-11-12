package com.xiaomi.hm.health.device.earbud.viewmodel;

import android.app.Application;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.EarbudRebootInfo;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.earbud.model.EarbudLoadingResult;
import com.xiaomi.hm.health.device.earbud.model.EarbudLoadingType;
import com.xiaomi.hm.health.device.earbud.repo.EarbudConfigDataManager;
import com.xiaomi.hm.health.device.earbud.repo.EarbudDeviceDataRepo;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel;
import com.xiaomi.hm.health.device.firmware.FirmwareManagerApi;
import com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u0096\u00012\u00020\u00012\u00020\u0002:\u0002\u0096\u0001B\u0013\u0012\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0006J\u001e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010%\u001a\u00020\u0006J\u0006\u0010&\u001a\u00020\u0006J\u0006\u0010'\u001a\u00020\u0006J\u000e\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0010J\u000e\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*J\u001e\u0010/\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0010J\u000e\u00100\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*J\u000e\u00101\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*J\u0006\u00102\u001a\u00020\u0006J\u000e\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u000203JO\u0010?\u001a\u00020\u00062\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\b\b\u0002\u00108\u001a\u00020\u00102'\u0010>\u001a#\b\u0001\u0012\u0004\u0012\u00020:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100;\u0012\u0006\u0012\u0004\u0018\u00010<09¢\u0006\u0002\b=ø\u0001\u0000¢\u0006\u0004\b?\u0010@R\u001d\u0010F\u001a\u00020A8D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010K\u001a\u00020G8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010JR\u001f\u0010R\u001a\b\u0012\u0004\u0012\u00020M0L8\u0006@\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00100L8\u0006@\u0006¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\bT\u0010QR\u001f\u0010\\\u001a\b\u0012\u0004\u0012\u00020W0V8\u0006@\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001f\u0010^\u001a\b\u0012\u0004\u0012\u00020W0L8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\b]\u0010QR\u001f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010_\u001a\u0004\b`\u0010aR\u001f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00100L8\u0006@\u0006¢\u0006\f\n\u0004\bc\u0010O\u001a\u0004\bd\u0010QR%\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180f0L8\u0006@\u0006¢\u0006\f\n\u0004\bg\u0010O\u001a\u0004\bh\u0010QR%\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180f0L8\u0006@\u0006¢\u0006\f\n\u0004\bj\u0010O\u001a\u0004\bk\u0010QR\u001f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u001f0L8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\bm\u0010QR\u001f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00100L8\u0006@\u0006¢\u0006\f\n\u0004\bo\u0010O\u001a\u0004\bp\u0010QR\u001f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u001f0L8\u0006@\u0006¢\u0006\f\n\u0004\br\u0010O\u001a\u0004\bs\u0010QR\u001f\u0010v\u001a\b\u0012\u0004\u0012\u0002030L8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bu\u0010QR%\u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0w0L8\u0006@\u0006¢\u0006\f\n\u0004\bx\u0010O\u001a\u0004\by\u0010QR%\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020{0f0L8\u0006@\u0006¢\u0006\f\n\u0004\b|\u0010O\u001a\u0004\b}\u0010QR!\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100V8\u0006@\u0006¢\u0006\r\n\u0004\b\u007f\u0010Y\u001a\u0005\b\u0080\u0001\u0010[R!\u0010\u0085\u0001\u001a\u00030\u0082\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010C\u001a\u0005\br\u0010\u0084\u0001R!\u0010\u0089\u0001\u001a\u00030\u0086\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010C\u001a\u0005\bg\u0010\u0088\u0001R!\u0010\u008d\u0001\u001a\u00030\u008a\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010C\u001a\u0005\bc\u0010\u008c\u0001R!\u0010\u0091\u0001\u001a\u00030\u008e\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010C\u001a\u0005\bj\u0010\u0090\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0097\u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/OnActiveLiveData;", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "liveData", "", GoogleApiAvailabilityLight.b, "", hl.k, "f", "refreshDevice", "loadBattery", "loadSleepNotDisturb", "loadRedDot", "disableRedDot", "", "isNotDisturb", "setSleepNotDisturb", "callNotify", "updateEnableCallNotify", "smsNotify", "updateEnableSmsNotify", "refreshOperSettings", "", "setting", "isLeft", "isDouble", "updateOperSettings", "resetOperSettings", "loadPlayTime", "", "minute", "setPlayTime", "loadSmartPlay", "smartPlay", "setSmartPlay", "loadPlayTimeSetting", "removeAllDownload", "resetDevice", WebAPI.PARAM_IS_REFRESH, "loadAlarm", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "alarm", "deleteAlarm", "position", "isEnable", "enableAlarm", "saveAlarm", "onAlarmAdd", "loadDeviceResetTimes", "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingResult;", "result", "postDialogData", "Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;", "loadingType", "checkDeviceConnect", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "earbudLaunch", "(Lcom/xiaomi/hm/health/device/earbud/model/EarbudLoadingType;ZLkotlin/jvm/functions/Function2;)V", "Lcom/xiaomi/hm/health/device/earbud/repo/EarbudDeviceDataRepo;", "a", "Lkotlin/Lazy;", "getMDeviceRepo", "()Lcom/xiaomi/hm/health/device/earbud/repo/EarbudDeviceDataRepo;", "mDeviceRepo", "Lcom/xiaomi/hm/health/device/earbud/repo/EarbudConfigDataManager;", "b", "g", "()Lcom/xiaomi/hm/health/device/earbud/repo/EarbudConfigDataManager;", "configManager", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/bt/device/HmEarbudDevice;", "c", "Landroidx/lifecycle/MutableLiveData;", "getDeviceData", "()Landroidx/lifecycle/MutableLiveData;", "deviceData", GoogleApiAvailabilityLight.a, "getLeftRightConnectData", "leftRightConnectData", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "e", "Landroidx/lifecycle/MediatorLiveData;", "getLeftBatteryData", "()Landroidx/lifecycle/MediatorLiveData;", "leftBatteryData", "getRightBatteryData", "rightBatteryData", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/OnActiveLiveData;", "getDeviceUserConfigData", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/OnActiveLiveData;", "deviceUserConfigData", "h", "getSleepNotDisturbData", "sleepNotDisturbData", "", "i", "getLeftOperSettingData", "leftOperSettingData", com.loc.z.j, "getRightOperSettingData", "rightOperSettingData", "getPlayTimeData", "playTimeData", "l", "getSmartPlayData", "smartPlayData", "m", "getPlayTimeSetting", "playTimeSetting", "getEarbudOperResultData", "earbudOperResultData", "", "o", "getAlarmListData", "alarmListData", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/EarbudRebootInfo;", com.google.android.exoplayer2.text.ttml.b.r, "getDeviceRebootTimeData", "deviceRebootTimeData", DTransferConstants.SEARCH_KEY, "getShowUpdateRedDot", "showUpdateRedDot", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "r", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", SOAP.XMLNS, "()Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", "firmwareManagerApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", "t", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/firmware/FirmwareOnlineManagerApi;", "u", "()Lcom/xiaomi/hm/health/device/firmware/FirmwareOnlineManagerApi;", "firmwareOnlineManagerApi", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class EarbudDeviceViewModel extends AndroidViewModel implements KoinComponent {
    private static final byte v = 1;
    private static final byte w = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy configManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<HmEarbudDevice> deviceData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> leftRightConnectData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<BatteryInfo> leftBatteryData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BatteryInfo> rightBatteryData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final OnActiveLiveData<HMMiliConfig> deviceUserConfigData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> sleepNotDisturbData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<Byte>> leftOperSettingData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<Byte>> rightOperSettingData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> playTimeData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> smartPlayData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> playTimeSetting;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<EarbudLoadingResult> earbudOperResultData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<Alarm>> alarmListData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<EarbudRebootInfo>> deviceRebootTimeData;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> showUpdateRedDot;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApi;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final Lazy firmwareManagerApi;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final Lazy firmwareOnlineManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$cancelSyncingData$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HmEarbudDevice value = EarbudDeviceViewModel.this.getDeviceData().getValue();
            if (value != null) {
                if (!Boxing.boxBoolean(value.isAllConnected()).booleanValue()) {
                    value = null;
                }
                if (value != null) {
                    value.stopSyncData();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$updateEnableCallNotify$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ EarbudDeviceViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(boolean z, EarbudDeviceViewModel earbudDeviceViewModel, Continuation<? super a0> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = earbudDeviceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a0(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.b) {
                this.c.g().getConfig().enableInComingCallTime();
            } else {
                this.c.g().getConfig().disableInComingCallTime();
            }
            this.c.g().save();
            DeviceXFunctionsKt.getPropertyStoreApi().postPropertiesToServer(true);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/repo/EarbudConfigDataManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<EarbudConfigDataManager> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudConfigDataManager invoke() {
            return EarbudConfigDataManager.INSTANCE.getInstance();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$updateEnableSmsNotify$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(boolean z, Continuation<? super b0> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new b0(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EarbudDeviceViewModel.this.g().getConfig().setSmsNotifyEnabled(this.c);
            EarbudDeviceViewModel.this.g().save();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$deleteAlarm$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ Alarm b;
        public final /* synthetic */ EarbudDeviceViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Alarm alarm, EarbudDeviceViewModel earbudDeviceViewModel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = alarm;
            this.c = earbudDeviceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = false;
            this.b.setEnabled(Boxing.boxBoolean(false));
            this.b.setVisible(Boxing.boxBoolean(false));
            if (this.c.getMDeviceRepo().saveAlarm(this.b)) {
                List<Alarm> value = this.c.getAlarmListData().getValue();
                if (value != null) {
                    Alarm alarm = this.b;
                    EarbudDeviceViewModel earbudDeviceViewModel = this.c;
                    value.remove(alarm);
                    earbudDeviceViewModel.getAlarmListData().postValue(value);
                }
                z = true;
            }
            return Boxing.boxBoolean(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$updateOperSettings$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ byte e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(boolean z, boolean z2, byte b, Continuation<? super c0> continuation) {
            super(2, continuation);
            this.c = z;
            this.d = z2;
            this.e = b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new c0(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean leftClickSetting;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<Byte> value = EarbudDeviceViewModel.this.getLeftOperSettingData().getValue();
            List<Byte> mutableList = value == null ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) value);
            if (mutableList == null) {
                mutableList = CollectionsKt__CollectionsKt.mutableListOf(Boxing.boxByte((byte) 1), Boxing.boxByte((byte) 5));
            }
            List<Byte> value2 = EarbudDeviceViewModel.this.getRightOperSettingData().getValue();
            List<Byte> mutableList2 = value2 != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) value2) : null;
            if (mutableList2 == null) {
                mutableList2 = CollectionsKt__CollectionsKt.mutableListOf(Boxing.boxByte((byte) 1), Boxing.boxByte((byte) 5));
            }
            byte[] bArr = new byte[4];
            bArr[0] = mutableList.get(0).byteValue();
            bArr[1] = mutableList2.get(0).byteValue();
            bArr[2] = mutableList.get(1).byteValue();
            bArr[3] = mutableList2.get(1).byteValue();
            if (this.c) {
                boolean z = this.d;
                byte b = bArr[z ? (char) 2 : (char) 0];
                bArr[z ? (char) 2 : (char) 0] = this.e;
                leftClickSetting = EarbudDeviceViewModel.this.getMDeviceRepo().setLeftClickSetting(bArr);
                if (leftClickSetting) {
                    b = this.e;
                }
                mutableList.set(this.d ? 1 : 0, Boxing.boxByte(b));
                EarbudDeviceViewModel.this.getLeftOperSettingData().postValue(mutableList);
            } else {
                boolean z2 = this.d;
                byte b2 = bArr[z2 ? (char) 3 : (char) 1];
                bArr[z2 ? (char) 3 : (char) 1] = this.e;
                boolean rightClickSetting = EarbudDeviceViewModel.this.getMDeviceRepo().setRightClickSetting(bArr);
                if (rightClickSetting) {
                    b2 = this.e;
                }
                mutableList2.set(this.d ? 1 : 0, Boxing.boxByte(b2));
                EarbudDeviceViewModel.this.getRightOperSettingData().postValue(mutableList2);
                leftClickSetting = rightClickSetting;
            }
            return Boxing.boxBoolean(leftClickSetting);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/viewmodel/OnActiveLiveData;", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "liveData", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<OnActiveLiveData<HMMiliConfig>, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull OnActiveLiveData<HMMiliConfig> onActiveLiveData) {
            EarbudDeviceViewModel.this.n(onActiveLiveData);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnActiveLiveData<HMMiliConfig> onActiveLiveData) {
            a(onActiveLiveData);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$earbudLaunch$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {403}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ EarbudDeviceViewModel d;
        public final /* synthetic */ EarbudLoadingType e;
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Boolean>, Object> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(boolean z, EarbudDeviceViewModel earbudDeviceViewModel, EarbudLoadingType earbudLoadingType, Function2<? super CoroutineScope, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = z;
            this.d = earbudDeviceViewModel;
            this.e = earbudLoadingType;
            this.f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = new e(this.c, this.d, this.e, this.f, continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                if (this.c) {
                    HmEarbudDevice value = this.d.getDeviceData().getValue();
                    boolean z = false;
                    if (value != null && value.isAllConnected()) {
                        z = true;
                    }
                    if (!z) {
                        EarbudLoadingType earbudLoadingType = this.e;
                        if (earbudLoadingType != null) {
                            this.d.postDialogData(EarbudLoadingResult.INSTANCE.fail(earbudLoadingType));
                        }
                        return Unit.INSTANCE;
                    }
                }
                EarbudLoadingType earbudLoadingType2 = this.e;
                if (earbudLoadingType2 != null) {
                    this.d.postDialogData(EarbudLoadingResult.INSTANCE.loading(earbudLoadingType2));
                }
                Function2<CoroutineScope, Continuation<? super Boolean>, Object> function2 = this.f;
                this.a = 1;
                obj = function2.invoke(coroutineScope, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                EarbudLoadingType earbudLoadingType3 = this.e;
                if (earbudLoadingType3 != null) {
                    this.d.postDialogData(EarbudLoadingResult.INSTANCE.success(earbudLoadingType3));
                }
            } else {
                EarbudLoadingType earbudLoadingType4 = this.e;
                if (earbudLoadingType4 != null) {
                    this.d.postDialogData(EarbudLoadingResult.INSTANCE.fail(earbudLoadingType4));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$enableAlarm$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ Alarm b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ EarbudDeviceViewModel d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Alarm alarm, boolean z, EarbudDeviceViewModel earbudDeviceViewModel, int i, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = alarm;
            this.c = z;
            this.d = earbudDeviceViewModel;
            this.e = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.setEnabled(Boxing.boxBoolean(this.c));
            boolean z = true;
            if (this.d.getMDeviceRepo().saveAlarm(this.b)) {
                List<Alarm> value = this.d.getAlarmListData().getValue();
                if (value != null) {
                    if (!Boxing.boxBoolean(value.size() > this.e).booleanValue()) {
                        value = null;
                    }
                    if (value != null) {
                        int i = this.e;
                        Alarm alarm = this.b;
                        EarbudDeviceViewModel earbudDeviceViewModel = this.d;
                        value.set(i, alarm);
                        kotlin.collections.g.sortWith(value, earbudDeviceViewModel.getMDeviceRepo().getAlarmComparator());
                        earbudDeviceViewModel.getAlarmListData().postValue(value);
                    }
                }
            } else {
                this.d.getAlarmListData().postValue(this.d.getAlarmListData().getValue());
                z = false;
            }
            return Boxing.boxBoolean(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$loadAlarm$2$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {TypedValues.AttributesType.TYPE_EASING}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ EarbudDeviceViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, EarbudDeviceViewModel earbudDeviceViewModel, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = earbudDeviceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.b) {
                    this.a = 1;
                    if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<Alarm> listLoadAlarms = this.c.getMDeviceRepo().loadAlarms();
            if (listLoadAlarms == null) {
                listLoadAlarms = null;
            } else {
                this.c.getAlarmListData().postValue(listLoadAlarms);
            }
            return Boxing.boxBoolean(listLoadAlarms != null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$loadBattery$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EarbudDeviceViewModel.this.getLeftBatteryData().postValue(EarbudDeviceViewModel.this.getMDeviceRepo().getLeftButteryInfo());
            EarbudDeviceViewModel.this.getRightBatteryData().postValue(EarbudDeviceViewModel.this.getMDeviceRepo().getRightButteryInfo());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$loadDeviceResetTimes$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<EarbudRebootInfo> deviceRebootTimes = EarbudDeviceViewModel.this.getMDeviceRepo().getDeviceRebootTimes();
            List<EarbudRebootInfo> list = null;
            if (deviceRebootTimes != null) {
                if (!Boxing.boxBoolean(deviceRebootTimes.size() == 2).booleanValue()) {
                    deviceRebootTimes = null;
                }
                if (deviceRebootTimes != null) {
                    EarbudDeviceViewModel.this.getDeviceRebootTimeData().postValue(deviceRebootTimes);
                    list = deviceRebootTimes;
                }
            }
            return Boxing.boxBoolean(list != null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$loadPlayTime$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EarbudDeviceViewModel.this.getPlayTimeData().postValue(Boxing.boxInt(EarbudDeviceViewModel.this.getMDeviceRepo().getPlayTime()));
            return Boxing.boxBoolean(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$loadPlayTimeSetting$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (EarbudDeviceViewModel.this.getMDeviceRepo().getSmartPlay()) {
                EarbudDeviceViewModel.this.getPlayTimeSetting().postValue(null);
            } else {
                EarbudDeviceViewModel.this.getPlayTimeSetting().postValue(Boxing.boxInt(EarbudDeviceViewModel.this.getMDeviceRepo().getPlayTime()));
            }
            return Boxing.boxBoolean(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$loadRedDot$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0065  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            DeviceInfo deviceInfo;
            boolean z;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HmEarbudDevice value = EarbudDeviceViewModel.this.getDeviceData().getValue();
            if (value != null && (deviceInfo = value.getDeviceInfo()) != null) {
                EarbudDeviceViewModel earbudDeviceViewModel = EarbudDeviceViewModel.this;
                String fwUpgradeRedDotHideVersion = earbudDeviceViewModel.m().getFwUpgradeRedDotHideVersion(deviceInfo.getDeviceID() + "_device_page");
                if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade()) {
                    FirmwareOnlineManagerApi firmwareOnlineManagerApiJ = earbudDeviceViewModel.j();
                    HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
                    if (firmwareOnlineManagerApiJ.useOnline(hMDeviceType) && earbudDeviceViewModel.j().hasFwUpgrade(hMDeviceType)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    earbudDeviceViewModel.getShowUpdateRedDot().postValue(Boxing.boxBoolean(false));
                    earbudDeviceViewModel.i().checkFw(HMDeviceType.EARBUD, true);
                } else if (Intrinsics.areEqual(fwUpgradeRedDotHideVersion, earbudDeviceViewModel.k())) {
                    earbudDeviceViewModel.getShowUpdateRedDot().postValue(Boxing.boxBoolean(false));
                } else {
                    earbudDeviceViewModel.getShowUpdateRedDot().postValue(Boxing.boxBoolean(true));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$loadSleepNotDisturb$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EarbudDeviceViewModel.this.getSleepNotDisturbData().postValue(Boxing.boxBoolean(EarbudDeviceViewModel.this.getMDeviceRepo().isSleepNotDisturb()));
            return Boxing.boxBoolean(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$loadSmartPlay$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EarbudDeviceViewModel.this.getSmartPlayData().postValue(Boxing.boxBoolean(EarbudDeviceViewModel.this.getMDeviceRepo().getSmartPlay()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$loadUserConfig$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ OnActiveLiveData<HMMiliConfig> b;
        public final /* synthetic */ EarbudDeviceViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(OnActiveLiveData<HMMiliConfig> onActiveLiveData, EarbudDeviceViewModel earbudDeviceViewModel, Continuation<? super o> continuation) {
            super(2, continuation);
            this.b = onActiveLiveData;
            this.c = earbudDeviceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.postValue(this.c.g().getConfig());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/repo/EarbudDeviceDataRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<EarbudDeviceDataRepo> {
        public p() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(EarbudDeviceViewModel earbudDeviceViewModel, boolean z) {
            earbudDeviceViewModel.getLeftRightConnectData().postValue(Boolean.valueOf(z));
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EarbudDeviceDataRepo invoke() {
            final EarbudDeviceViewModel earbudDeviceViewModel = EarbudDeviceViewModel.this;
            return new EarbudDeviceDataRepo(new HmEarbudDevice.OnEarbudLRConnectChangeListener() { // from class: com.xiaomi.hm.health.device.earbud.viewmodel.a
                @Override // com.xiaomi.hm.health.bt.device.HmEarbudDevice.OnEarbudLRConnectChangeListener
                public final void onChange(boolean z) {
                    EarbudDeviceViewModel.p.c(earbudDeviceViewModel, z);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$onAlarmAdd$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Alarm c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Alarm alarm, Continuation<? super q> continuation) {
            super(2, continuation);
            this.c = alarm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new q(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<Alarm> value = EarbudDeviceViewModel.this.getAlarmListData().getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            Alarm alarm = this.c;
            int i = 0;
            Iterator<Alarm> it2 = value.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                if (Boxing.boxBoolean(Intrinsics.areEqual(it2.next().getIndex(), alarm.getIndex())).booleanValue()) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                value.set(i, this.c);
            } else {
                value.add(this.c);
            }
            kotlin.collections.g.sortWith(value, EarbudDeviceViewModel.this.getMDeviceRepo().getAlarmComparator());
            EarbudDeviceViewModel.this.getAlarmListData().postValue(value);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$postDialogData$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ EarbudLoadingResult c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(EarbudLoadingResult earbudLoadingResult, Continuation<? super r> continuation) {
            super(2, continuation);
            this.c = earbudLoadingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new r(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EarbudDeviceViewModel.this.getEarbudOperResultData().setValue(this.c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$refreshDevice$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new s(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EarbudDeviceViewModel.this.getMDeviceRepo().refreshDevice();
            EarbudDeviceViewModel.this.getDeviceData().postValue(EarbudDeviceViewModel.this.getMDeviceRepo().getMDevice());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$refreshOperSettings$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableLiveData<List<Byte>> leftOperSettingData = EarbudDeviceViewModel.this.getLeftOperSettingData();
            List<Byte> leftClickSetting = EarbudDeviceViewModel.this.getMDeviceRepo().getLeftClickSetting();
            if (leftClickSetting == null) {
                leftClickSetting = CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{Boxing.boxByte((byte) 1), Boxing.boxByte((byte) 5)});
            }
            leftOperSettingData.postValue(leftClickSetting);
            MutableLiveData<List<Byte>> rightOperSettingData = EarbudDeviceViewModel.this.getRightOperSettingData();
            List<Byte> rightClickSetting = EarbudDeviceViewModel.this.getMDeviceRepo().getRightClickSetting();
            if (rightClickSetting == null) {
                rightClickSetting = CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{Boxing.boxByte((byte) 1), Boxing.boxByte((byte) 5)});
            }
            rightOperSettingData.postValue(rightClickSetting);
            return Boxing.boxBoolean(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$resetDevice$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public u(Continuation<? super u> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new u(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EarbudDeviceViewModel earbudDeviceViewModel = EarbudDeviceViewModel.this;
            EarbudLoadingResult.Companion companion = EarbudLoadingResult.INSTANCE;
            EarbudLoadingType earbudLoadingType = EarbudLoadingType.RESET_DEVICE;
            earbudDeviceViewModel.postDialogData(companion.loading(earbudLoadingType));
            if (EarbudDeviceViewModel.this.getMDeviceRepo().reset()) {
                HmEarbudDevice value = EarbudDeviceViewModel.this.getDeviceData().getValue();
                if (value != null) {
                    value.cancelDownloadMusic();
                }
                EarbudDeviceViewModel.this.h().resetEarbudSetting(false);
                EarbudDeviceViewModel.this.postDialogData(companion.success(earbudLoadingType));
            } else {
                EarbudDeviceViewModel.this.postDialogData(companion.fail(earbudLoadingType));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$resetOperSettings$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            byte[] bArr = {1, 1, 5, 5};
            boolean leftClickSetting = EarbudDeviceViewModel.this.getMDeviceRepo().setLeftClickSetting(bArr);
            if (leftClickSetting) {
                EarbudDeviceViewModel.this.getLeftOperSettingData().postValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{Boxing.boxByte(bArr[0]), Boxing.boxByte(bArr[2])}));
                leftClickSetting = EarbudDeviceViewModel.this.getMDeviceRepo().setRightClickSetting(bArr);
            }
            if (leftClickSetting) {
                EarbudDeviceViewModel.this.getRightOperSettingData().postValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{Boxing.boxByte(bArr[1]), Boxing.boxByte(bArr[3])}));
            }
            return Boxing.boxBoolean(leftClickSetting);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$saveAlarm$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ Alarm c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Alarm alarm, Continuation<? super w> continuation) {
            super(2, continuation);
            this.c = alarm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new w(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(EarbudDeviceViewModel.this.getMDeviceRepo().saveAlarm(this.c));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$setPlayTime$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class x extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(int i, Continuation<? super x> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new x(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (EarbudDeviceViewModel.this.getMDeviceRepo().setPlayTime(this.c)) {
                EarbudDeviceViewModel.this.getPlayTimeData().postValue(Boxing.boxInt(this.c));
                EarbudDeviceViewModel.this.getSmartPlayData().postValue(Boxing.boxBoolean(EarbudDeviceViewModel.this.getMDeviceRepo().getSmartPlay()));
                z = true;
            } else {
                z = false;
            }
            return Boxing.boxBoolean(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$setSleepNotDisturb$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(boolean z, Continuation<? super y> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new y(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = true;
            if (EarbudDeviceViewModel.this.getMDeviceRepo().saveIsSleepNotDisturb(this.c)) {
                EarbudDeviceViewModel.this.getSleepNotDisturbData().postValue(Boxing.boxBoolean(this.c));
            } else {
                EarbudDeviceViewModel.this.getSleepNotDisturbData().postValue(Boxing.boxBoolean(true ^ this.c));
                z = false;
            }
            return Boxing.boxBoolean(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$setSmartPlay$1", f = "EarbudDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class z extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(boolean z, Continuation<? super z> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudDeviceViewModel.this.new z(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (EarbudDeviceViewModel.this.getMDeviceRepo().setSmartPlay(this.c)) {
                EarbudDeviceViewModel.this.getSmartPlayData().postValue(Boxing.boxBoolean(this.c));
                EarbudDeviceViewModel.this.getPlayTimeData().postValue(Boxing.boxInt(EarbudDeviceViewModel.this.getMDeviceRepo().getPlayTime()));
                z = true;
            } else {
                z = false;
            }
            return Boxing.boxBoolean(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EarbudDeviceViewModel(@NotNull Application application) {
        super(application);
        this.mDeviceRepo = LazyKt__LazyJVMKt.lazy(new p());
        this.configManager = LazyKt__LazyJVMKt.lazy(b.a);
        MutableLiveData<HmEarbudDevice> mutableLiveData = new MutableLiveData<>();
        this.deviceData = mutableLiveData;
        this.leftRightConnectData = new MutableLiveData<>();
        MediatorLiveData<BatteryInfo> mediatorLiveData = new MediatorLiveData<>();
        this.leftBatteryData = mediatorLiveData;
        MutableLiveData<BatteryInfo> mutableLiveData2 = new MutableLiveData<>();
        this.rightBatteryData = mutableLiveData2;
        OnActiveLiveData<HMMiliConfig> onActiveLiveData = new OnActiveLiveData<>(new d());
        this.deviceUserConfigData = onActiveLiveData;
        this.sleepNotDisturbData = new MutableLiveData<>();
        this.leftOperSettingData = new MutableLiveData<>();
        this.rightOperSettingData = new MutableLiveData<>();
        this.playTimeData = new MutableLiveData<>();
        this.smartPlayData = new MutableLiveData<>();
        this.playTimeSetting = new MutableLiveData<>();
        this.earbudOperResultData = new MutableLiveData<>();
        this.alarmListData = new MutableLiveData<>();
        this.deviceRebootTimeData = new MutableLiveData<>();
        MediatorLiveData<Boolean> mediatorLiveData2 = new MediatorLiveData<>();
        this.showUpdateRedDot = mediatorLiveData2;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KeeperProxyApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.firmwareManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<FirmwareManagerApi>() { // from class: com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.firmware.FirmwareManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FirmwareManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FirmwareManagerApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.firmwareOnlineManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<FirmwareOnlineManagerApi>() { // from class: com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FirmwareOnlineManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FirmwareOnlineManagerApi.class), objArr6, objArr7);
            }
        });
        mutableLiveData.setValue(getMDeviceRepo().getMDevice());
        f();
        mediatorLiveData.postValue(getMDeviceRepo().getLeftButteryInfo());
        mutableLiveData2.postValue(getMDeviceRepo().getRightButteryInfo());
        mediatorLiveData.addSource(mutableLiveData, new Observer() { // from class: re1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudDeviceViewModel.c(this.a, (HmEarbudDevice) obj);
            }
        });
        onActiveLiveData.postValue(g().getConfig());
        mediatorLiveData2.postValue(Boolean.FALSE);
        mediatorLiveData2.addSource(mutableLiveData, new Observer() { // from class: se1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudDeviceViewModel.e(this.a, (HmEarbudDevice) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(EarbudDeviceViewModel earbudDeviceViewModel, HmEarbudDevice hmEarbudDevice) {
        earbudDeviceViewModel.loadBattery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(EarbudDeviceViewModel earbudDeviceViewModel, HmEarbudDevice hmEarbudDevice) {
        if (hmEarbudDevice == null) {
            return;
        }
        if (!hmEarbudDevice.isAllConnected()) {
            hmEarbudDevice = null;
        }
        if (hmEarbudDevice == null) {
            return;
        }
        earbudDeviceViewModel.loadRedDot();
    }

    public static /* synthetic */ void earbudLaunch$default(EarbudDeviceViewModel earbudDeviceViewModel, EarbudLoadingType earbudLoadingType, boolean z2, Function2 function2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: earbudLaunch");
        }
        if ((i2 & 1) != 0) {
            earbudLoadingType = null;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        earbudDeviceViewModel.earbudLaunch(earbudLoadingType, z2, function2);
    }

    private final void f() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EarbudConfigDataManager g() {
        return (EarbudConfigDataManager) this.configManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi h() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FirmwareManagerApi i() {
        return (FirmwareManagerApi) this.firmwareManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FirmwareOnlineManagerApi j() {
        return (FirmwareOnlineManagerApi) this.firmwareOnlineManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k() {
        HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
        return (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && j().useOnline(hMDeviceType)) ? j().getFwUpgradeVer(hMDeviceType) : i().getFwLocalUpgradeVer(hMDeviceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeeperProxyApi m() {
        return (KeeperProxyApi) this.keeperProxyApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(OnActiveLiveData<HMMiliConfig> liveData) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o(liveData, this, null), 2, null);
    }

    public final void deleteAlarm(@NotNull Alarm alarm) {
        earbudLaunch$default(this, EarbudLoadingType.DELETE_ALARM, false, new c(alarm, this, null), 2, null);
    }

    public final void disableRedDot() {
        DeviceInfo deviceInfo;
        HmEarbudDevice value = this.deviceData.getValue();
        String deviceID = null;
        if (value != null && (deviceInfo = value.getDeviceInfo()) != null) {
            deviceID = deviceInfo.getDeviceID();
        }
        if (!Intrinsics.areEqual(this.showUpdateRedDot.getValue(), Boolean.TRUE) || deviceID == null) {
            return;
        }
        m().saveFwUpgradeRedDotHideVersion(deviceID + "_device_page", k());
        this.showUpdateRedDot.postValue(Boolean.FALSE);
    }

    public final void earbudLaunch(@Nullable EarbudLoadingType loadingType, boolean checkDeviceConnect, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Boolean>, ? extends Object> block) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(checkDeviceConnect, this, loadingType, block, null), 2, null);
    }

    public final void enableAlarm(int position, @NotNull Alarm alarm, boolean isEnable) {
        if (Intrinsics.areEqual(alarm.getEnabled(), Boolean.valueOf(isEnable))) {
            return;
        }
        earbudLaunch$default(this, isEnable ? EarbudLoadingType.TURN_ON_ALARM : EarbudLoadingType.TURN_OFF_ALARM, false, new f(alarm, isEnable, this, position, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<List<Alarm>> getAlarmListData() {
        return this.alarmListData;
    }

    @NotNull
    public final MutableLiveData<HmEarbudDevice> getDeviceData() {
        return this.deviceData;
    }

    @NotNull
    public final MutableLiveData<List<EarbudRebootInfo>> getDeviceRebootTimeData() {
        return this.deviceRebootTimeData;
    }

    @NotNull
    public final OnActiveLiveData<HMMiliConfig> getDeviceUserConfigData() {
        return this.deviceUserConfigData;
    }

    @NotNull
    public final MutableLiveData<EarbudLoadingResult> getEarbudOperResultData() {
        return this.earbudOperResultData;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MediatorLiveData<BatteryInfo> getLeftBatteryData() {
        return this.leftBatteryData;
    }

    @NotNull
    public final MutableLiveData<List<Byte>> getLeftOperSettingData() {
        return this.leftOperSettingData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getLeftRightConnectData() {
        return this.leftRightConnectData;
    }

    @NotNull
    public final EarbudDeviceDataRepo getMDeviceRepo() {
        return (EarbudDeviceDataRepo) this.mDeviceRepo.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getPlayTimeData() {
        return this.playTimeData;
    }

    @NotNull
    public final MutableLiveData<Integer> getPlayTimeSetting() {
        return this.playTimeSetting;
    }

    @NotNull
    public final MutableLiveData<BatteryInfo> getRightBatteryData() {
        return this.rightBatteryData;
    }

    @NotNull
    public final MutableLiveData<List<Byte>> getRightOperSettingData() {
        return this.rightOperSettingData;
    }

    @NotNull
    public final MediatorLiveData<Boolean> getShowUpdateRedDot() {
        return this.showUpdateRedDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepNotDisturbData() {
        return this.sleepNotDisturbData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSmartPlayData() {
        return this.smartPlayData;
    }

    public final void loadAlarm(boolean isRefresh) {
        EarbudLoadingType earbudLoadingType = isRefresh ? null : EarbudLoadingType.LOAD_ALARM;
        HmEarbudDevice value = this.deviceData.getValue();
        if (value == null) {
            return;
        }
        if (!value.isAllConnected()) {
            value = null;
        }
        if (value == null) {
            return;
        }
        earbudLaunch$default(this, earbudLoadingType, false, new g(isRefresh, this, null), 2, null);
    }

    public final void loadBattery() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new h(null), 2, null);
    }

    public final void loadDeviceResetTimes() {
        earbudLaunch$default(this, EarbudLoadingType.LOAD_DEVICE_REBOOT_TIME, false, new i(null), 2, null);
    }

    public final void loadPlayTime() {
        earbudLaunch$default(this, EarbudLoadingType.LOAD_PLAY_TIME, false, new j(null), 2, null);
    }

    public final void loadPlayTimeSetting() {
        earbudLaunch$default(this, null, false, new k(null), 3, null);
    }

    public final void loadRedDot() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new l(null), 2, null);
    }

    public final void loadSleepNotDisturb() {
        earbudLaunch$default(this, EarbudLoadingType.LOAD_SLEEP_NOT_DISTURB, false, new m(null), 2, null);
    }

    public final void loadSmartPlay() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new n(null), 2, null);
    }

    public final void onAlarmAdd(@NotNull Alarm alarm) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new q(alarm, null), 2, null);
    }

    public final void postDialogData(@NotNull EarbudLoadingResult result) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new r(result, null), 2, null);
    }

    public final void refreshDevice() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new s(null), 2, null);
    }

    public final void refreshOperSettings() {
        earbudLaunch$default(this, EarbudLoadingType.LOAD_OPER_SETTING, false, new t(null), 2, null);
    }

    public final void removeAllDownload() {
        getMDeviceRepo().removeAllDownload();
    }

    public final void resetDevice() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new u(null), 2, null);
    }

    public final void resetOperSettings() {
        earbudLaunch$default(this, EarbudLoadingType.SET_OPER_SETTING, false, new v(null), 2, null);
    }

    public final void saveAlarm(@NotNull Alarm alarm) {
        earbudLaunch$default(this, EarbudLoadingType.SAVE_ALARM, false, new w(alarm, null), 2, null);
    }

    public final void setPlayTime(int minute) {
        earbudLaunch$default(this, EarbudLoadingType.SET_PLAY_TIME, false, new x(minute, null), 2, null);
    }

    public final void setSleepNotDisturb(boolean isNotDisturb) {
        earbudLaunch$default(this, EarbudLoadingType.SET_SLEEP_NOT_DISTURB, false, new y(isNotDisturb, null), 2, null);
    }

    public final void setSmartPlay(boolean smartPlay) {
        earbudLaunch$default(this, EarbudLoadingType.SET_SMART_PLAY, false, new z(smartPlay, null), 2, null);
    }

    public final void updateEnableCallNotify(boolean callNotify) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a0(callNotify, this, null), 2, null);
    }

    public final void updateEnableSmsNotify(boolean smsNotify) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b0(smsNotify, null), 2, null);
    }

    public final void updateOperSettings(byte setting, boolean isLeft, boolean isDouble) {
        earbudLaunch$default(this, EarbudLoadingType.SET_OPER_SETTING, false, new c0(isLeft, isDouble, setting, null), 2, null);
    }
}
