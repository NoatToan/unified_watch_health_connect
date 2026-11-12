package com.xiaomi.hm.health.sky;

import android.bluetooth.BluetoothAdapter;
import androidx.p008lifecycle.FlowLiveDataConversions;
import com.huami.devicestylepower.DeviceStyle;
import com.huami.devicestylepower.DeviceStyleKt;
import com.huami.devicestylepower.IPowerAndStyleManager;
import com.huami.passport.Configs;
import com.huami.sky.lib.assist.ISkyDeviceStatusAssistant;
import com.huami.sky.lib.assist.SkyDeviceStatus;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.play.card.DataNotifiers;
import com.xiaomi.hm.health.play.card.InvalidateLiveData;
import com.xiaomi.hm.health.starsky.StarSkyUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/sky/SkyDeviceStatusAssistantImpl;", "Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "", "connectionType", "deviceTypeValue", "Lcom/huami/sky/lib/assist/SkyDeviceStatus;", "a", "", "b", "Lkotlinx/coroutines/flow/Flow;", "deviceBoundNotifiers", "deviceConnectNotifiers", "devicePowerNotifiers", "getDeviceConnectStatus", "getDevicePower", "Lcom/huami/devicestylepower/IPowerAndStyleManager;", "Lcom/huami/devicestylepower/IPowerAndStyleManager;", "deviceStylePowerManager", "<init>", "(Lcom/huami/devicestylepower/IPowerAndStyleManager;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SkyDeviceStatusAssistantImpl implements ISkyDeviceStatusAssistant {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IPowerAndStyleManager deviceStylePowerManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", Configs.Params.OLD, "new", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<HMDeviceConnectionEvent, HMDeviceConnectionEvent, Boolean> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        public final boolean a(@NotNull HMDeviceConnectionEvent hMDeviceConnectionEvent, @NotNull HMDeviceConnectionEvent hMDeviceConnectionEvent2) {
            return hMDeviceConnectionEvent2.getDeviceType() == hMDeviceConnectionEvent.getDeviceType() && hMDeviceConnectionEvent2.getConnectionType() == hMDeviceConnectionEvent.getConnectionType();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(HMDeviceConnectionEvent hMDeviceConnectionEvent, HMDeviceConnectionEvent hMDeviceConnectionEvent2) {
            return Boolean.valueOf(a(hMDeviceConnectionEvent, hMDeviceConnectionEvent2));
        }
    }

    public SkyDeviceStatusAssistantImpl(@NotNull IPowerAndStyleManager iPowerAndStyleManager) {
        this.deviceStylePowerManager = iPowerAndStyleManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkyDeviceStatus a(int connectionType, int deviceTypeValue) {
        if (connectionType == 0) {
            SkyDeviceStatus skyDeviceStatus = SkyDeviceStatus.CONNECTING;
            skyDeviceStatus.setDeviceTypeValue(deviceTypeValue);
            return skyDeviceStatus;
        }
        if (connectionType == 1) {
            SkyDeviceStatus skyDeviceStatus2 = SkyDeviceStatus.CONNECT_SUCCESS;
            skyDeviceStatus2.setDeviceTypeValue(deviceTypeValue);
            return skyDeviceStatus2;
        }
        SkyDeviceStatus skyDeviceStatus3 = SkyDeviceStatus.CONNECT_FAIL;
        skyDeviceStatus3.setDeviceTypeValue(deviceTypeValue);
        skyDeviceStatus3.setErrorCode(1);
        return skyDeviceStatus3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    @Override // com.huami.sky.lib.assist.ISkyDeviceStatusAssistant
    @NotNull
    public Flow<SkyDeviceStatus> deviceBoundNotifiers() {
        final Flow flowFilterNotNull = FlowKt.filterNotNull(FlowLiveDataConversions.asFlow(InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getDeviceBoundNotifier())));
        return new Flow<SkyDeviceStatus>() { // from class: com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$deviceBoundNotifiers$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$deviceBoundNotifiers$$inlined$mapNotNull$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<HMDeviceBindEvent> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$deviceBoundNotifiers$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$deviceBoundNotifiers$$inlined$mapNotNull$1$2", f = "SkyDeviceStatusAssistantImpl.kt", i = {}, l = {147}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(HMDeviceBindEvent hMDeviceBindEvent, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    SkyDeviceStatus skyDeviceStatus;
                    SkyDeviceStatus skyDeviceStatus2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        HMDeviceBindEvent hMDeviceBindEvent2 = hMDeviceBindEvent;
                        if (StarSkyUtil.INSTANCE.isSupportDeviceStatusInSky(hMDeviceBindEvent2.getDeviceType())) {
                            if (hMDeviceBindEvent2.isBound()) {
                                skyDeviceStatus = SkyDeviceStatus.CONNECT_SUCCESS;
                                skyDeviceStatus.setDeviceTypeValue(hMDeviceBindEvent2.getDeviceType().getValue());
                            } else {
                                skyDeviceStatus = SkyDeviceStatus.CONNECT_FAIL;
                                skyDeviceStatus.setDeviceTypeValue(hMDeviceBindEvent2.getDeviceType().getValue());
                                skyDeviceStatus.setErrorCode(1);
                            }
                            skyDeviceStatus2 = skyDeviceStatus;
                        } else {
                            skyDeviceStatus2 = null;
                        }
                        if (skyDeviceStatus2 != null) {
                            anonymousClass1.b = 1;
                            if (flowCollector.emit(skyDeviceStatus2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super SkyDeviceStatus> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.sky.lib.assist.ISkyDeviceStatusAssistant
    @NotNull
    public Flow<SkyDeviceStatus> deviceConnectNotifiers() {
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.filterNotNull(FlowLiveDataConversions.asFlow(InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getDeviceConnectNotifier()))), a.a);
        return new Flow<SkyDeviceStatus>() { // from class: com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$deviceConnectNotifiers$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$deviceConnectNotifiers$$inlined$mapNotNull$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<HMDeviceConnectionEvent> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ SkyDeviceStatusAssistantImpl b;

                /* JADX INFO: renamed from: com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$deviceConnectNotifiers$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$deviceConnectNotifiers$$inlined$mapNotNull$1$2", f = "SkyDeviceStatusAssistantImpl.kt", i = {}, l = {148}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, SkyDeviceStatusAssistantImpl skyDeviceStatusAssistantImpl) {
                    this.a = flowCollector;
                    this.b = skyDeviceStatusAssistantImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(HMDeviceConnectionEvent hMDeviceConnectionEvent, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    SkyDeviceStatus skyDeviceStatusA;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        HMDeviceConnectionEvent hMDeviceConnectionEvent2 = hMDeviceConnectionEvent;
                        if (this.b.b()) {
                            skyDeviceStatusA = !StarSkyUtil.INSTANCE.isSupportDeviceStatusInSky(hMDeviceConnectionEvent2.getDeviceType()) ? null : this.b.a(hMDeviceConnectionEvent2.getConnectionType(), hMDeviceConnectionEvent2.getDeviceType().getValue());
                        } else {
                            skyDeviceStatusA = SkyDeviceStatus.CONNECT_FAIL;
                            skyDeviceStatusA.setErrorCode(2);
                        }
                        if (skyDeviceStatusA != null) {
                            anonymousClass1.b = 1;
                            if (flowCollector.emit(skyDeviceStatusA, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super SkyDeviceStatus> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.sky.lib.assist.ISkyDeviceStatusAssistant
    @NotNull
    public Flow<Integer> devicePowerNotifiers() {
        final Flow flowAsFlow = FlowLiveDataConversions.asFlow(InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getDeviceBatteryNotifier()));
        final Flow<HMDeviceBatteryEvent> flow = new Flow<HMDeviceBatteryEvent>() { // from class: com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$devicePowerNotifiers$$inlined$filter$1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$devicePowerNotifiers$$inlined$filter$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<HMDeviceBatteryEvent> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$devicePowerNotifiers$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$devicePowerNotifiers$$inlined$filter$1$2", f = "SkyDeviceStatusAssistantImpl.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(HMDeviceBatteryEvent hMDeviceBatteryEvent, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        HMDeviceBatteryEvent hMDeviceBatteryEvent2 = hMDeviceBatteryEvent;
                        if (Boxing.boxBoolean(hMDeviceBatteryEvent2 != null && StarSkyUtil.INSTANCE.isSupportDeviceStatusInSky(hMDeviceBatteryEvent2.getDeviceType())).booleanValue()) {
                            anonymousClass1.b = 1;
                            if (flowCollector.emit(hMDeviceBatteryEvent, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super HMDeviceBatteryEvent> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return new Flow<Integer>() { // from class: com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$devicePowerNotifiers$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$devicePowerNotifiers$$inlined$mapNotNull$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<HMDeviceBatteryEvent> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$devicePowerNotifiers$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.xiaomi.hm.health.sky.SkyDeviceStatusAssistantImpl$devicePowerNotifiers$$inlined$mapNotNull$1$2", f = "SkyDeviceStatusAssistantImpl.kt", i = {}, l = {138}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(HMDeviceBatteryEvent hMDeviceBatteryEvent, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    HMDeviceType deviceType;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        HMDeviceBatteryEvent hMDeviceBatteryEvent2 = hMDeviceBatteryEvent;
                        Integer numBoxInt = null;
                        if (hMDeviceBatteryEvent2 != null && (deviceType = hMDeviceBatteryEvent2.getDeviceType()) != null) {
                            numBoxInt = Boxing.boxInt(deviceType.getValue());
                        }
                        if (numBoxInt != null) {
                            anonymousClass1.b = 1;
                            if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Integer> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.sky.lib.assist.ISkyDeviceStatusAssistant
    @NotNull
    public SkyDeviceStatus getDeviceConnectStatus() {
        if (!b()) {
            SkyDeviceStatus skyDeviceStatus = SkyDeviceStatus.CONNECT_FAIL;
            skyDeviceStatus.setErrorCode(2);
            return skyDeviceStatus;
        }
        HMDeviceType majorDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
        boolean zIsConnected = HMDeviceManager.getInstance().isConnected(majorDeviceType);
        return a(zIsConnected ? 1 : 0, majorDeviceType.getValue());
    }

    @Override // com.huami.sky.lib.assist.ISkyDeviceStatusAssistant
    public int getDevicePower() {
        DeviceStyle deviceStylePowerAndStyle = this.deviceStylePowerManager.powerAndStyle(HMDeviceManager.getInstance().getMajorDeviceType().getValue());
        if (deviceStylePowerAndStyle == null) {
            return 0;
        }
        return DeviceStyleKt.getSingleBatteryRatio(deviceStylePowerAndStyle);
    }
}
