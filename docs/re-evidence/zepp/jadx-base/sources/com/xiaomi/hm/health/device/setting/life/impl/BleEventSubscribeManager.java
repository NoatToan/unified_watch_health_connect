package com.xiaomi.hm.health.device.setting.life.impl;

import com.huami.devicex.DeviceXBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.life.LifeCycleFilter;
import com.xiaomi.hm.health.device.setting.life.feature.AlarmControllerSetter;
import com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.DeviceHttpProxyEventSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.DeviceTodoFetchSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.DeviceTokenSetter;
import com.xiaomi.hm.health.device.setting.life.feature.FamilySetter;
import com.xiaomi.hm.health.device.setting.life.feature.FemaleListenerSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.HostSetter;
import com.xiaomi.hm.health.device.setting.life.feature.HttpProxySetter;
import com.xiaomi.hm.health.device.setting.life.feature.JsAppFeatureGetter;
import com.xiaomi.hm.health.device.setting.life.feature.MessageEventSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.MusicControllerSetter;
import com.xiaomi.hm.health.device.setting.life.feature.NowTimeSetter;
import com.xiaomi.hm.health.device.setting.life.feature.OpenAppPageSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.SleepStateListenerSetter;
import com.xiaomi.hm.health.device.setting.life.feature.SportEventListenerSetter;
import com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.WeatherSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.WifiEventSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.bloodpressure.BloodPressureJsAppSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.bloodpressure.HealthPlanSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.earbud.EarbudSyncDataSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.health.HealthDeviceChangeSubscriber;
import com.xiaomi.hm.health.device.setting.life.feature.health.TargetStandSyncSubscriber;
import com.xiaomi.hm.health.device.weight.WeightSubscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001d\u0010\r\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/impl/BleEventSubscribeManager;", "Lorg/koin/core/component/KoinComponent;", "", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "createSubscribers", "", "isBound", "createHealthSubscribers", "createConnectSubscribers", "Lcom/xiaomi/hm/health/device/setting/life/feature/MusicControllerSetter;", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/setting/life/feature/MusicControllerSetter;", "musicControllerSetter", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class BleEventSubscribeManager implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "DeviceLifeCycle-BleEvent";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy musicControllerSetter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/impl/BleEventSubscribeManager$Companion;", "", "", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "events", "", "a", "", "tag", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<BleEventSubscriber> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends BleEventSubscriber> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "reg event count : " + this.a.size();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ BleEventSubscriber a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(BleEventSubscriber bleEventSubscriber) {
                super(0);
                this.a = bleEventSubscriber;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "item -- " + this.a.getTag();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(List<? extends BleEventSubscriber> events) {
            HMLog.info(BleEventSubscribeManager.b, new a(events));
            Iterator<T> it2 = events.iterator();
            while (it2.hasNext()) {
                HMLog.info(BleEventSubscribeManager.b, new b((BleEventSubscriber) it2.next()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleEventSubscribeManager() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.musicControllerSetter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<MusicControllerSetter>() { // from class: com.xiaomi.hm.health.device.setting.life.impl.BleEventSubscribeManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.life.feature.MusicControllerSetter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final MusicControllerSetter getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(MusicControllerSetter.class), qualifier, objArr);
            }
        });
    }

    private final MusicControllerSetter a() {
        return (MusicControllerSetter) this.musicControllerSetter.getValue();
    }

    public static /* synthetic */ List createHealthSubscribers$default(BleEventSubscribeManager bleEventSubscribeManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return bleEventSubscribeManager.createHealthSubscribers(z);
    }

    @NotNull
    public final List<BleEventSubscriber> createConnectSubscribers() {
        List<BleEventSubscriber> listFilterConnectSubscribers;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(createHealthSubscribers$default(this, false, 1, null));
        arrayList.add(new NowTimeSetter());
        arrayList.add(new DeviceTodoFetchSubscriber());
        INSTANCE.a(arrayList);
        LifeCycleFilter lifeCycleFilter$devicex_zeppRelease = DeviceXBuilder.INSTANCE.getLifeCycleFilter$devicex_zeppRelease();
        return (lifeCycleFilter$devicex_zeppRelease == null || (listFilterConnectSubscribers = lifeCycleFilter$devicex_zeppRelease.filterConnectSubscribers(arrayList)) == null) ? arrayList : listFilterConnectSubscribers;
    }

    @NotNull
    public final List<BleEventSubscriber> createHealthSubscribers(boolean isBound) {
        List<BleEventSubscriber> listFilterHealthSubscribers;
        ArrayList arrayList = new ArrayList();
        if (!isBound) {
            arrayList.add(new TargetStandSyncSubscriber());
        }
        arrayList.add(new HealthDeviceChangeSubscriber());
        arrayList.add(new FemaleListenerSubscriber());
        INSTANCE.a(arrayList);
        LifeCycleFilter lifeCycleFilter$devicex_zeppRelease = DeviceXBuilder.INSTANCE.getLifeCycleFilter$devicex_zeppRelease();
        return (lifeCycleFilter$devicex_zeppRelease == null || (listFilterHealthSubscribers = lifeCycleFilter$devicex_zeppRelease.filterHealthSubscribers(arrayList)) == null) ? arrayList : listFilterHealthSubscribers;
    }

    @NotNull
    public final List<BleEventSubscriber> createSubscribers() {
        List<BleEventSubscriber> listFilterSubscriber;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HttpProxySetter());
        arrayList.add(new WifiEventSubscriber());
        arrayList.add(new HostSetter());
        arrayList.add(new FamilySetter());
        arrayList.add(new DeviceTokenSetter());
        arrayList.add(new MessageEventSubscriber());
        arrayList.add(new DeviceHttpProxyEventSubscriber());
        arrayList.add(new SyncSubscriber());
        arrayList.add(a());
        arrayList.add(new OpenAppPageSubscriber());
        arrayList.add(new AlarmControllerSetter());
        arrayList.add(new WeightSubscriber());
        arrayList.add(new JsAppFeatureGetter());
        arrayList.add(new EarbudSyncDataSubscriber());
        arrayList.add(new SleepStateListenerSetter());
        arrayList.add(new SportEventListenerSetter());
        arrayList.add(new HealthPlanSubscriber());
        arrayList.add(new BloodPressureJsAppSubscriber());
        arrayList.add(new WeatherSubscriber());
        INSTANCE.a(arrayList);
        LifeCycleFilter lifeCycleFilter$devicex_zeppRelease = DeviceXBuilder.INSTANCE.getLifeCycleFilter$devicex_zeppRelease();
        return (lifeCycleFilter$devicex_zeppRelease == null || (listFilterSubscriber = lifeCycleFilter$devicex_zeppRelease.filterSubscriber(arrayList)) == null) ? arrayList : listFilterSubscriber;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
