package com.xiaomi.hm.health.device.setting.life.feature;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMNowTimeConfig;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/NowTimeSetter;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "proDevice", "", "a", "", "getName", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "register", MiPushClient.COMMAND_UNREGISTER, "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class NowTimeSetter implements BleEventSubscriber {

    @NotNull
    public static final String TAG = "NowTimeSetter";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.feature.NowTimeSetter$register$1", f = "NowTimeSetter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice b;
        public final /* synthetic */ NowTimeSetter c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.life.feature.NowTimeSetter$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0845a extends Lambda implements Function0<String> {
            public final /* synthetic */ HMBaseDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0845a(HMBaseDevice hMBaseDevice) {
                super(0);
                this.a = hMBaseDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "此设备(" + ((HMMiLiProDevice) this.a).getMDeviceSource() + ")不支持整点报时";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMBaseDevice hMBaseDevice, NowTimeSetter nowTimeSetter, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = hMBaseDevice;
            this.c = nowTimeSetter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
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
            HMBaseDevice hMBaseDevice = this.b;
            if (!(hMBaseDevice instanceof HMMiLiProDevice)) {
                return Unit.INSTANCE;
            }
            if (HMNowTimeConfig.INSTANCE.supportNowTime(((HMMiLiProDevice) hMBaseDevice).getMDeviceSource(), ((HMMiLiProDevice) this.b).getDeviceInfo())) {
                this.c.a((HMMiLiProDevice) this.b);
                return Unit.INSTANCE;
            }
            HMLog.info(NowTimeSetter.TAG, new C0845a(this.b));
            return Unit.INSTANCE;
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "set now Time:" + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(HMMiLiProDevice proDevice) {
        HMLog.info(TAG, new b(proDevice.setNowTimeConfig(HMNowTimeConfig.INSTANCE.fromNowTimeConfig().toNowTimeConfig())));
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    public String getName() {
        return TAG;
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) throws InterruptedException {
        d.b(null, new a(device, this, null), 1, null);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
    }
}
