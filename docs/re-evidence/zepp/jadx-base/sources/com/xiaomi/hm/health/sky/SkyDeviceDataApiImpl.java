package com.xiaomi.hm.health.sky;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.Transformations;
import com.huami.sky.lib.api.DeviceDataApi;
import com.huami.sky.lib.entity.DeviceDataEntity;
import com.huami.sky.lib.entity.HeartRate;
import com.huami.sky.lib.entity.UserActivity;
import com.huami.sky.lib.entity.UserRrInterval;
import com.huami.sky.lib.entity.UserSleepProbability;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.starsky.StarSkyActivity;
import com.xiaomi.hm.health.bt.model.starsky.StarSkySleep;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import com.xiaomi.hm.health.heartrate.HeartRateCenter;
import com.xiaomi.hm.health.heartrate.LongTermCallback;
import com.xiaomi.hm.health.play.card.InvalidateLiveData;
import com.xiaomi.hm.health.sleep.eventbus.SleepDataNotifiers;
import com.xiaomi.hm.health.smalltool.model.Tool;
import com.xiaomi.hm.health.starsky.StarSkyUtil;
import com.xiaomi.hm.health.starsky.StartSkyDataCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/sky/SkyDeviceDataApiImpl;", "Lcom/huami/sky/lib/api/DeviceDataApi;", "", "isSupportAlarmClock", "isSupportRrInterval", "isSupportSleepNotify", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sky/lib/entity/DeviceDataEntity;", "registerDeviceData", "Lcom/huami/sky/lib/entity/HeartRate;", "registerHeartRate", "", "sleepStateNotify", "isSupportSkyFeature", "", "findAllActiveDeviceId", "getDeviceSource", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "b", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "deviceRepositoryApi", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SkyDeviceDataApiImpl implements DeviceDataApi {

    @NotNull
    private static final String c = "keySky";
    private static final int d = 100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceRepositoryApi deviceRepositoryApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ StringBuilder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StringBuilder sb) {
            super(0);
            this.a = sb;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "星空获取已激活设备的device_id: " + ((Object) this.a);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.sky.SkyDeviceDataApiImpl$registerDeviceData$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/huami/sky/lib/entity/DeviceDataEntity;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.sky.SkyDeviceDataApiImpl$registerDeviceData$1", f = "SkyDeviceDataApiImpl.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super DeviceDataEntity>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.sky.SkyDeviceDataApiImpl$registerDeviceData$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                StarSkyUtil.INSTANCE.getStarSkyApi().unregister();
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<? super DeviceDataEntity> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.b;
                StarSkyUtil.INSTANCE.getStarSkyApi().registerDataCallback(new StartSkyDataCallback() { // from class: com.xiaomi.hm.health.sky.SkyDeviceDataApiImpl.registerDeviceData.1.1
                    @Override // com.xiaomi.hm.health.starsky.StartSkyDataCallback
                    public void onData(@NotNull List<StarSkyActivity> activity, @NotNull List<StarSkySleep> sleep, @NotNull List<Long> rrTimeStamp, @NotNull List<Integer> rrInterval) {
                        ProducerScope<DeviceDataEntity> producerScope2 = producerScope;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(activity, 10));
                        for (StarSkyActivity starSkyActivity : activity) {
                            arrayList.add(new UserActivity(starSkyActivity.getTimestamp(), starSkyActivity.getActivity()));
                        }
                        ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(new UserRrInterval(rrTimeStamp, rrInterval));
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sleep, 10));
                        for (StarSkySleep starSkySleep : sleep) {
                            float f = 100;
                            arrayList2.add(new UserSleepProbability(starSkySleep.getTimestamp(), starSkySleep.getSleepProbability() / f, starSkySleep.getDeepSleepProbability() / f, starSkySleep.getRemProbability() / f));
                        }
                        producerScope2.mo4435trySendJP2dKIU(new DeviceDataEntity(arrayList, arrayListArrayListOf, arrayList2));
                    }
                });
                a aVar = a.a;
                this.a = 1;
                if (ProduceKt.awaitClose(producerScope, aVar, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.sky.SkyDeviceDataApiImpl$registerHeartRate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/huami/sky/lib/entity/HeartRate;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.sky.SkyDeviceDataApiImpl$registerHeartRate$1", f = "SkyDeviceDataApiImpl.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class C16371 extends SuspendLambda implements Function2<ProducerScope<? super HeartRate>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.sky.SkyDeviceDataApiImpl$registerHeartRate$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HeartRateCenter.INSTANCE.stopRealtimeHrForSpecialModule(SkyDeviceDataApiImpl.c);
            }
        }

        public C16371(Continuation<? super C16371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C16371 c16371 = new C16371(continuation);
            c16371.b = obj;
            return c16371;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProducerScope<? super HeartRate> producerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C16371) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.b;
                HeartRateCenter.INSTANCE.startRealtimeHrForSpecialModule(SkyDeviceDataApiImpl.c, new LongTermCallback() { // from class: com.xiaomi.hm.health.sky.SkyDeviceDataApiImpl.registerHeartRate.1.1
                    @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController.IHeartRateCallback
                    public void onHeartRateChanged(int hr) {
                        producerScope.mo4435trySendJP2dKIU(new HeartRate(System.currentTimeMillis(), hr));
                    }

                    @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController.IHeartRateCallback
                    public void onOpen(boolean result) {
                    }
                });
                a aVar = a.a;
                this.a = 1;
                if (ProduceKt.awaitClose(producerScope, aVar, this) == coroutine_suspended) {
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
    }

    public SkyDeviceDataApiImpl(@NotNull Context context, @NotNull DeviceRepositoryApi deviceRepositoryApi) {
        this.context = context;
        this.deviceRepositoryApi = deviceRepositoryApi;
    }

    @Override // com.huami.sky.lib.api.DeviceDataApi
    @NotNull
    public String findAllActiveDeviceId() {
        List<Device> listFindAllActiveDevices = this.deviceRepositoryApi.findAllActiveDevices();
        Device device = (Device) CollectionsKt.lastOrNull((List) listFindAllActiveDevices);
        StringBuilder sb = new StringBuilder();
        for (Device device2 : listFindAllActiveDevices) {
            sb.append(device2.getDevice_source().intValue());
            if (!Intrinsics.areEqual(device, device2)) {
                sb.append(",");
            }
        }
        HMLog.info("SkyDeviceDataApiImpl", new a(sb));
        return sb.toString();
    }

    @Override // com.huami.sky.lib.api.DeviceDataApi
    public int getDeviceSource() {
        return HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI).getValue();
    }

    @Override // com.huami.sky.lib.api.DeviceDataApi
    public boolean isSupportAlarmClock() {
        return Tool.ALARM.isSupport(this.context, HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceManager.getInstance().getMajorDeviceType()));
    }

    @Override // com.huami.sky.lib.api.DeviceDataApi
    public boolean isSupportRrInterval() {
        return StarSkyUtil.INSTANCE.isDeviceSupportStarSkyFeature(HMDeviceManager.getInstance().getMajorDeviceType());
    }

    @Override // com.huami.sky.lib.api.DeviceDataApi
    public boolean isSupportSkyFeature() {
        return StarSkyUtil.INSTANCE.isSupportDeviceStatusInSky(HMDeviceManager.getInstance().getMajorDeviceType());
    }

    @Override // com.huami.sky.lib.api.DeviceDataApi
    public boolean isSupportSleepNotify() {
        return HMDeviceManager.getInstance().getMajorDeviceType() == HMDeviceType.MILI;
    }

    @Override // com.huami.sky.lib.api.DeviceDataApi
    @NotNull
    public Flow<DeviceDataEntity> registerDeviceData() {
        return FlowKt.callbackFlow(new AnonymousClass1(null));
    }

    @Override // com.huami.sky.lib.api.DeviceDataApi
    @NotNull
    public Flow<HeartRate> registerHeartRate() {
        return FlowKt.callbackFlow(new C16371(null));
    }

    @Override // com.huami.sky.lib.api.DeviceDataApi
    @NotNull
    public Flow<Integer> sleepStateNotify() {
        return FlowLiveDataConversions.asFlow(Transformations.map(InvalidateLiveData.INSTANCE.listen(SleepDataNotifiers.INSTANCE.getSleepStateNotifier()), new Function<Integer, Integer>() { // from class: com.xiaomi.hm.health.sky.SkyDeviceDataApiImpl$sleepStateNotify$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Integer apply(Integer num) {
                Integer num2 = num;
                return Integer.valueOf(num2 == null ? -1 : num2.intValue());
            }
        }));
    }
}
