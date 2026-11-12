package com.huami.device.feature.health.device;

import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.settings.PressureSetting;
import com.huami.device.feature.health.settings.device.ReadFromDevice;
import com.huami.device.feature.health.user.HealthSettingConfig;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/device/feature/health/device/DeviceLfEventCase;", "", "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "event", "", "onEvent", "Lcom/huami/device/feature/health/device/HealthDevice;", "a", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "<init>", "(Lcom/huami/device/feature/health/device/HealthDevice;)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceLfEventCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LfType.values().length];
            iArr[LfType.HEART_RATE_ALL_DAY.ordinal()] = 1;
            iArr[LfType.ALL_DAY_PRESSURE_CHANGE.ordinal()] = 2;
            iArr[LfType.ATRIAL_FIB_CHANGED.ordinal()] = 3;
            iArr[LfType.HEART_RATE_DETECTION_INTERVAL.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.device.DeviceLfEventCase$onEvent$4$1", f = "DeviceLfEventCase.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ReadFromDevice readFromDevice;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PressureSetting service = HealthFunc.PRESSURE.INSTANCE.getService();
                if (service != null && (readFromDevice = service.getReadFromDevice()) != null) {
                    this.a = 1;
                    obj = readFromDevice.read(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public DeviceLfEventCase(@NotNull HealthDevice healthDevice) {
        this.device = healthDevice;
    }

    private static final Job a() {
        return e.f(GlobalScope.INSTANCE, null, null, new a(null), 3, null);
    }

    public final void onEvent(@NotNull HMLFEvent event) {
        Byte bFirstOrNull;
        Byte bFirstOrNull2;
        Byte bFirstOrNull3;
        byte[] extra;
        Byte bFirstOrNull4;
        LfType lfType = event.getLfType();
        int i = lfType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lfType.ordinal()];
        unit = null;
        Unit unit = null;
        if (i == 1) {
            byte[] extra2 = event.getExtra();
            if (extra2 == null || (bFirstOrNull = ArraysKt___ArraysKt.firstOrNull(extra2)) == null) {
                return;
            }
            Byte b = bFirstOrNull.byteValue() == 1 ? bFirstOrNull : null;
            if (b == null) {
                return;
            }
            b.byteValue();
            HealthSettingConfig userConfig = HealthDetect.INSTANCE.getHealthConfig().getUserConfig();
            userConfig.setHrEnable(true);
            userConfig.setFreq(1);
            userConfig.save(true);
            return;
        }
        if (i == 2) {
            byte[] extra3 = event.getExtra();
            if (extra3 != null && (bFirstOrNull2 = ArraysKt___ArraysKt.firstOrNull(extra3)) != null) {
                byte bByteValue = bFirstOrNull2.byteValue();
                HealthSettingConfig userConfig2 = HealthDetect.INSTANCE.getHealthConfig().getUserConfig();
                userConfig2.setPressureEnable(bByteValue != 0);
                userConfig2.save(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                a();
                return;
            }
            return;
        }
        if (i == 3) {
            byte[] extra4 = event.getExtra();
            if (extra4 == null || (bFirstOrNull3 = ArraysKt___ArraysKt.firstOrNull(extra4)) == null) {
                return;
            }
            byte bByteValue2 = bFirstOrNull3.byteValue();
            HealthSettingConfig userConfig3 = HealthDetect.INSTANCE.getHealthConfig().getUserConfig();
            userConfig3.setAtrialFibEnable(bByteValue2 != 0);
            userConfig3.save(true);
            return;
        }
        if (i != 4 || (extra = event.getExtra()) == null || (bFirstOrNull4 = ArraysKt___ArraysKt.firstOrNull(extra)) == null) {
            return;
        }
        byte bByteValue3 = bFirstOrNull4.byteValue();
        HealthSettingConfig userConfig4 = HealthDetect.INSTANCE.getHealthConfig().getUserConfig();
        userConfig4.setFreq(bByteValue3);
        if (this.device.isHealthDetect()) {
            userConfig4.setHrEnable(bByteValue3 > 0);
        }
        userConfig4.save(true);
    }
}
