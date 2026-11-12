package com.xiaomi.hm.health.device.weight;

import com.huami.bluetooth.profile.channel.module.ScaleSettingModule;
import com.huami.bluetooth.profile.channel.module.SettingResult;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.WeightSettingViewModel;
import com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber;
import com.xiaomi.hm.health.device.webapi.WeightApi;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/weight/WeightSubscriber;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "a", "", "getName", "register", MiPushClient.COMMAND_UNREGISTER, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightSubscriber implements BleEventSubscriber {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.weight.WeightSubscriber$updateUsersBound$1", f = "WeightSubscriber.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u2d1"}, s = {"L$2"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public final /* synthetic */ HMBaseDevice e;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.weight.WeightSubscriber$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0890a extends Lambda implements Function1<ArrayList<Long>, Unit> {
            public final /* synthetic */ ScaleSettingModule a;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.weight.WeightSubscriber$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.xiaomi.hm.health.device.weight.WeightSubscriber$updateUsersBound$1$1$1$1$1", f = "WeightSubscriber.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0891a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ ScaleSettingModule b;
                public final /* synthetic */ ArrayList<Long> c;

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.weight.WeightSubscriber$a$a$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0892a extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0892a(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "set users result: " + this.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0891a(ScaleSettingModule scaleSettingModule, ArrayList<Long> arrayList, Continuation<? super C0891a> continuation) {
                    super(2, continuation);
                    this.b = scaleSettingModule;
                    this.c = arrayList;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0891a(this.b, this.c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0891a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ScaleSettingModule scaleSettingModule = this.b;
                        ArrayList<Long> arrayList = this.c;
                        this.a = 1;
                        obj = scaleSettingModule.setUsersBound(arrayList, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    HMLog.info(WeightSettingViewModel.TAG, new C0892a(((Boolean) obj).booleanValue()));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0890a(ScaleSettingModule scaleSettingModule) {
                super(1);
                this.a = scaleSettingModule;
            }

            public final void a(@NotNull ArrayList<Long> arrayList) {
                e.f(this.a, null, null, new C0891a(this.a, arrayList, null), 3, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ArrayList<Long> arrayList) {
                a(arrayList);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMBaseDevice hMBaseDevice, Continuation<? super a> continuation) {
            super(2, continuation);
            this.e = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HMBaseDevice hMBaseDevice;
            ScaleSettingModule scaleSettingModule;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScaleSettingModule scaleSettingModule2 = (ScaleSettingModule) this.e.getChannelModule(ScaleSettingModule.class);
                if (scaleSettingModule2 != null) {
                    hMBaseDevice = this.e;
                    this.a = scaleSettingModule2;
                    this.b = hMBaseDevice;
                    this.c = scaleSettingModule2;
                    this.d = 1;
                    Object usersBound = scaleSettingModule2.getUsersBound(this);
                    if (usersBound == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    scaleSettingModule = scaleSettingModule2;
                    obj = usersBound;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scaleSettingModule = (ScaleSettingModule) this.c;
            hMBaseDevice = (HMBaseDevice) this.b;
            ResultKt.throwOnFailure(obj);
            SettingResult settingResult = (SettingResult) obj;
            if (settingResult.getSuccess() && settingResult.getT() != null) {
                try {
                    WeightApi.INSTANCE.getAvailableUserIds((ArrayList) settingResult.getT(), hMBaseDevice.getDeviceInfo().getDeviceID(), new C0890a(scaleSettingModule));
                } catch (Exception unused) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void a(HMBaseDevice device) {
        e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(device, null), 2, null);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    public String getName() {
        return WeightSubscriber.class.getSimpleName();
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        if (device.isConnected() && device.getMDeviceSource() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE) {
            a(device);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
    }
}
