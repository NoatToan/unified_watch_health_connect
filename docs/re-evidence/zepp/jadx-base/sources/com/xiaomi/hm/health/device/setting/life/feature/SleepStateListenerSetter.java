package com.xiaomi.hm.health.device.setting.life.feature;

import com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule;
import com.huami.bluetooth.profile.channel.module.openapp.SleepState;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.mipush.sdk.MiPushClient;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\u000e\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/SleepStateListenerSetter;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "Lorg/koin/core/component/KoinComponent;", "", "getName", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/module/openapp/SleepState;", "b", "Lkotlin/jvm/functions/Function1;", "callback", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepStateListenerSetter implements BleEventSubscriber, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function1<SleepState, Unit> callback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/SleepState;", "state", "", "<no name provided>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<SleepState, Unit> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.life.feature.SleepStateListenerSetter$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0846a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMLFEvent a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0846a(HMLFEvent hMLFEvent) {
                super(0);
                this.a = hMLFEvent;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Post sleep state event:" + this.a;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull SleepState sleepState) {
            LfType lfType;
            if (Intrinsics.areEqual(sleepState, SleepState.Waking.INSTANCE)) {
                lfType = LfType.AWAKING;
            } else {
                if (!Intrinsics.areEqual(sleepState, SleepState.Sleeping.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                lfType = LfType.SLEEPING;
            }
            HMLFEvent hMLFEvent = new HMLFEvent(SleepStateListenerSetter.this.a().getMajorDeviceType(), lfType);
            HMLog.info(SleepStateListenerSetter.this.getName(), new C0846a(hMLFEvent));
            EventBus.getDefault().post(hMLFEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SleepState sleepState) {
            a(sleepState);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "没有获取到睡眠监听模块";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepStateListenerSetter() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.SleepStateListenerSetter$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.callback = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    public String getName() {
        return "SleepStateListenerSetter";
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        if (device.supportModule(29)) {
            OpenAppModule openAppModule = (OpenAppModule) device.getChannelModule(OpenAppModule.class);
            if (openAppModule == null) {
                HMLog.info(getName(), b.a);
            } else {
                openAppModule.registerSleepStateListener(this.callback);
            }
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
    }
}
