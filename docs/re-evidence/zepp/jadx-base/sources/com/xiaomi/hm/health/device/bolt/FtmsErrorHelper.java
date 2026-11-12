package com.xiaomi.hm.health.device.bolt;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener;
import com.xiaomi.hm.health.bt.profile.ftms.MachineStatus;
import com.xiaomi.hm.health.bt.profile.ftms.TreadmillData;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b'\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u0010\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\rR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0014\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/device/bolt/FtmsErrorHelper;", "Lcom/xiaomi/hm/health/bt/profile/ftms/IFTMSListener;", "Lorg/koin/core/component/KoinComponent;", "", "a", "", "getErrorCode", "Lcom/xiaomi/hm/health/bt/profile/ftms/TreadmillData;", "data", "onTreadmillData", "Lcom/xiaomi/hm/health/bt/profile/ftms/MachineStatus;", "status", "onMachineStatus", "Lkotlin/Function1;", "", "callback", "disableNotify", "", "Ljava/lang/String;", "TAG", "b", LogUtil.I, "MSG_CLEAR_ERROR", "", "c", "J", "CLEAR_ERROR_TIMEOUT", "Landroid/os/Handler;", GoogleApiAvailabilityLight.a, "Landroid/os/Handler;", "ftmsHandler", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "e", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "f", "Lcom/xiaomi/hm/health/bt/profile/ftms/MachineStatus;", "machineStatus", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FtmsErrorHelper implements IFTMSListener, KoinComponent {

    @NotNull
    public static final FtmsErrorHelper INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "FtmsErrorHelper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int MSG_CLEAR_ERROR = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final long CLEAR_ERROR_TIMEOUT = 3000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Handler ftmsHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy keeperProxyApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private static volatile MachineStatus machineStatus;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ MachineStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MachineStatus machineStatus) {
            super(0);
            this.a = machineStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "machineStatus: " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final FtmsErrorHelper ftmsErrorHelper = new FtmsErrorHelper();
        INSTANCE = ftmsErrorHelper;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.bolt.FtmsErrorHelper$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KeeperProxyApi invoke() {
                KoinComponent koinComponent = ftmsErrorHelper;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), qualifier, objArr);
            }
        });
        HandlerThread handlerThread = new HandlerThread(TAG);
        handlerThread.start();
        ftmsHandler = new Handler(handlerThread.getLooper()) { // from class: com.xiaomi.hm.health.device.bolt.FtmsErrorHelper.1
            @Override // android.os.Handler
            public void handleMessage(@NotNull Message msg) {
                if (msg.what == 1) {
                    FtmsErrorHelper ftmsErrorHelper2 = FtmsErrorHelper.INSTANCE;
                    FtmsErrorHelper.machineStatus = null;
                    EventBus.getDefault().post(new TreadmillErrorEvent(-1));
                }
            }
        };
    }

    private FtmsErrorHelper() {
    }

    private final void a() {
        b().setMaintain(false);
        EventBus.getDefault().post(new TreadmillMaintainEvent(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeeperProxyApi b() {
        return (KeeperProxyApi) keeperProxyApi.getValue();
    }

    public final void disableNotify(@NotNull final Function1<? super Boolean, Unit> callback) {
        a();
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(HMDeviceType.TREADMILL);
        HMBoltClassicDevice hMBoltClassicDevice = device instanceof HMBoltClassicDevice ? (HMBoltClassicDevice) device : null;
        if (hMBoltClassicDevice != null && hMBoltClassicDevice.isConnected()) {
            hMBoltClassicDevice.disableNotify(new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.bolt.FtmsErrorHelper.disableNotify.1

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.bolt.FtmsErrorHelper$disableNotify$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "disableNotify: " + this.a;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                    onFinish(bool.booleanValue());
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    HMLog.info(FtmsErrorHelper.TAG, new a(result));
                    FtmsErrorHelper.INSTANCE.b().setWriteMaintain(!result);
                    callback.invoke(Boolean.valueOf(result));
                }
            });
        } else {
            b().setWriteMaintain(true);
            callback.invoke(Boolean.FALSE);
        }
    }

    public final int getErrorCode() {
        MachineStatus machineStatus2 = machineStatus;
        if (machineStatus2 != null && machineStatus2.getData() != null) {
            if (!(machineStatus2.getData().length == 0)) {
                return machineStatus2.getData()[0];
            }
        }
        return -1;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener
    public void onMachineStatus(@Nullable MachineStatus status) {
        HMLog.info(TAG, new a(status));
        if (status == null || status.getData() == null) {
            return;
        }
        if (status.getData().length == 0) {
            return;
        }
        int op = status.getOp();
        if (op == 2) {
            machineStatus = status;
            Handler handler = ftmsHandler;
            handler.removeMessages(1);
            EventBus.getDefault().post(new TreadmillErrorEvent(status.getData()[0]));
            handler.sendEmptyMessageDelayed(1, 3000L);
            return;
        }
        if (op != 3) {
            return;
        }
        boolean z = status.getData()[0] == 1;
        FtmsErrorHelper ftmsErrorHelper = INSTANCE;
        ftmsErrorHelper.b().setMaintain(z);
        EventBus.getDefault().post(new TreadmillMaintainEvent(z));
        if (z) {
            return;
        }
        ftmsErrorHelper.b().setMaintainRedDotVisible(true);
    }

    @Override // com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener
    public void onTreadmillData(@Nullable TreadmillData data) {
    }
}
