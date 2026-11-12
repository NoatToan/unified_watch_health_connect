package com.xiaomi.hm.health.device.setting.find;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceModule;
import com.huami.bluetooth.profile.channel.module.find.IFindDeviceBleCmdApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi;
import com.xiaomi.hm.health.device.setting.life.feature.inject.IFindPhoneNotification;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0003H\u0002J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0002J$\u0010\r\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u0010\u001a\u00020\tH\u0002J7\u0010\u0013\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\"R\u001d\u0010(\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/FindPhoneModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/FindPhoneApi;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/huami/bluetooth/profile/channel/module/find/IFindDeviceBleCmdApi;", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "device", "", "c", "", "fromDevice", "f", "a", "e", "g", "enable", "isIncall", "enableRing", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bleDevice", "startFindPhone", "(Landroid/content/Context;ZLcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopFindPhone", "onDeviceDisconnect", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceState;", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceState;", "state", "Landroid/os/Vibrator;", "Landroid/os/Vibrator;", "vibrator", "Ljava/util/TimerTask;", "Ljava/util/TimerTask;", "stopTask", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/IFindPhoneNotification;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/setting/life/feature/inject/IFindPhoneNotification;", "findPhoneNotification", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FindPhoneModel implements KoinComponent, FindPhoneApi {

    @Deprecated
    @NotNull
    public static final String TAG = "FindPhoneModel";

    @NotNull
    private static final a e = new a(null);

    @Deprecated
    private static final long f = 200;

    @Deprecated
    private static final long g = 60000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private FindDeviceState state = FindDeviceState.Idle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Vibrator vibrator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private TimerTask stopTask;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy findPhoneNotification;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"com/xiaomi/hm/health/device/setting/find/FindPhoneModel$a", "", "", "BRIGHT_SCREEN_WAKE_TIMEOUT", "J", "MINUTE", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onEnablePhoneRing: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onEnablePhoneRing return";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onDeviceDisconnect";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "shake failed as vib is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onFind state: " + FindPhoneModel.this.state;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "finding state: " + FindPhoneModel.this.state;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onStop state: " + FindPhoneModel.this.state;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "return as state is idle";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FindPhoneModel() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.findPhoneNotification = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IFindPhoneNotification>() { // from class: com.xiaomi.hm.health.device.setting.find.FindPhoneModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.life.feature.inject.IFindPhoneNotification, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IFindPhoneNotification invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IFindPhoneNotification.class), qualifier, objArr);
            }
        });
    }

    private final void a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            HMLog.i(TAG, "pm null", new Object[0]);
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(268435466, "BleTool: bright");
        if (wakeLockNewWakeLock == null) {
            HMLog.i(TAG, "wl null", new Object[0]);
            return;
        }
        wakeLockNewWakeLock.acquire(200L);
        wakeLockNewWakeLock.release();
        HMLog.i(TAG, "release wl", new Object[0]);
    }

    private final IFindDeviceBleCmdApi b(HMBaseDevice hMBaseDevice) {
        FindDeviceModule findDeviceModule;
        if (hMBaseDevice == null || (findDeviceModule = (FindDeviceModule) hMBaseDevice.getChannelModule(FindDeviceModule.class)) == null) {
            return null;
        }
        return findDeviceModule.getFindDeviceApi();
    }

    private final void c(final Context context, final HMBaseDevice device) {
        TimerTask timerTask = this.stopTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        Timer timer = new Timer(TAG, false);
        TimerTask timerTask2 = new TimerTask() { // from class: com.xiaomi.hm.health.device.setting.find.FindPhoneModel$delayStop$$inlined$schedule$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                this.a.f(context, true, device);
            }
        };
        timer.schedule(timerTask2, 60000L);
        this.stopTask = timerTask2;
    }

    private final IFindPhoneNotification d() {
        return (IFindPhoneNotification) this.findPhoneNotification.getValue();
    }

    private final void e(Context context) {
        if (this.vibrator == null) {
            Object systemService = context.getSystemService("vibrator");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            this.vibrator = (Vibrator) systemService;
        }
        Vibrator vibrator = this.vibrator;
        if (vibrator == null) {
            HMLog.info(TAG, e.a);
            return;
        }
        long[] jArr = {0, 1000, 1000};
        if (Build.VERSION.SDK_INT >= 29) {
            vibrator.vibrate(VibrationEffect.createWaveform(jArr, 0));
        } else {
            vibrator.vibrate(jArr, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Context context, boolean fromDevice, HMBaseDevice device) {
        HMLog.info(TAG, new h());
        FindDeviceState findDeviceState = this.state;
        FindDeviceState findDeviceState2 = FindDeviceState.Idle;
        if (findDeviceState == findDeviceState2) {
            HMLog.info(TAG, i.a);
            return;
        }
        this.state = findDeviceState2;
        TimerTask timerTask = this.stopTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.stopTask = null;
        d().cancelNotification();
        if (findDeviceState == FindDeviceState.ShakeAndRing) {
            PhoneAlertUtil.stopRing(context);
        }
        g();
        IFindDeviceBleCmdApi iFindDeviceBleCmdApiB = b(device);
        if (iFindDeviceBleCmdApiB == null) {
            return;
        }
        iFindDeviceBleCmdApiB.stopFindPhone(new ResultCallback("onStopFindPhone"));
    }

    private final void g() {
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
        }
        this.vibrator = null;
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi
    @Nullable
    public Object enableRing(@Nullable Context context, @Nullable HMBaseDevice hMBaseDevice, boolean z, boolean z2, @NotNull Continuation<? super Unit> continuation) {
        FindDeviceState findDeviceState;
        HMLog.info(TAG, new b(z));
        FindDeviceState findDeviceState2 = this.state;
        FindDeviceState findDeviceState3 = FindDeviceState.ShakeAndRing;
        if ((findDeviceState2 == findDeviceState3 && z) || (findDeviceState2 == (findDeviceState = FindDeviceState.Shake) && !z)) {
            HMLog.info(TAG, c.a);
            return Unit.INSTANCE;
        }
        if (!z) {
            findDeviceState3 = findDeviceState;
        }
        this.state = findDeviceState3;
        if (z) {
            PhoneAlertUtil.startRing(context, z2);
        } else {
            PhoneAlertUtil.stopRing(context);
        }
        c(context, hMBaseDevice);
        return Unit.INSTANCE;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi
    @Nullable
    public Object onDeviceDisconnect(@Nullable Context context, @NotNull Continuation<? super Unit> continuation) {
        HMLog.info(TAG, d.a);
        Object objStopFindPhone = stopFindPhone(context, false, null, continuation);
        return objStopFindPhone == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objStopFindPhone : Unit.INSTANCE;
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi
    @Nullable
    public Object startFindPhone(@NotNull Context context, boolean z, @Nullable HMBaseDevice hMBaseDevice, @NotNull Continuation<? super Unit> continuation) {
        HMDeviceSource mDeviceSource;
        HMLog.info(TAG, new f());
        if (this.state != FindDeviceState.Idle) {
            HMLog.info(TAG, new g());
            return Unit.INSTANCE;
        }
        this.state = FindDeviceState.Shake;
        if (hMBaseDevice != null && (mDeviceSource = hMBaseDevice.getMDeviceSource()) != null) {
            d().showNotification(mDeviceSource);
        }
        a(context);
        IFindDeviceBleCmdApi iFindDeviceBleCmdApiB = b(hMBaseDevice);
        if (iFindDeviceBleCmdApiB != null) {
            iFindDeviceBleCmdApiB.confirmFindPhone(new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.setting.find.FindPhoneModel.startFindPhone.5
            });
        }
        e(context);
        c(context, hMBaseDevice);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi
    @Nullable
    public Object stopFindPhone(@Nullable Context context, boolean z, @Nullable HMBaseDevice hMBaseDevice, @NotNull Continuation<? super Unit> continuation) {
        f(context, z, hMBaseDevice);
        return Unit.INSTANCE;
    }
}
