package com.xiaomi.hm.health.ui.smartplay.alarm;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmVersionInfo;
import com.huami.bluetooth.profile.channel.module.schedule.action.IDataInterceptor;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0019\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\fH\u0016J\u001a\u0010\u000f\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\fH\u0016J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/HuamiOsAlarmDevice;", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/IAlarmDevice;", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "alarm", "", "addAlarm", "deleteAlarm", "updateAlarm", "", "queryAlarm", "Lkotlin/Function0;", "", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmChangeListener;", "alarmChangeListener", "registerChangeListener", "unRegisterChangeListener", "Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmVersionInfo;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "b", "Lkotlin/jvm/functions/Function0;", "com/xiaomi/hm/health/ui/smartplay/alarm/HuamiOsAlarmDevice$interceptor$1", "c", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/HuamiOsAlarmDevice$interceptor$1;", "interceptor", "Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmModule;", "()Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmModule;", "module", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HuamiOsAlarmDevice implements IAlarmDevice {

    @NotNull
    private static final String d = "HuamiOsAlarmDevice";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> alarmChangeListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HuamiOsAlarmDevice$interceptor$1 interceptor = new IDataInterceptor() { // from class: com.xiaomi.hm.health.ui.smartplay.alarm.HuamiOsAlarmDevice$interceptor$1
        @Override // com.huami.bluetooth.profile.channel.module.schedule.action.IDataInterceptor
        public void onFinishSend(byte cmd, boolean result) {
        }

        @Override // com.huami.bluetooth.profile.channel.module.schedule.action.IDataInterceptor
        public void onReceive(byte cmd, @NotNull byte[] data) {
            Function0 function0;
            if (cmd != 15 || (function0 = this.a.alarmChangeListener) == null) {
                return;
            }
            function0.invoke();
        }

        @Override // com.huami.bluetooth.profile.channel.module.schedule.action.IDataInterceptor
        public void onSend(byte cmd, @NotNull byte[] data) {
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.alarm.HuamiOsAlarmDevice$deleteAlarm$1", f = "HuamiOsAlarmDevice.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ AlarmClockExt c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AlarmClockExt alarmClockExt, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = alarmClockExt;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HuamiOsAlarmDevice.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean zBooleanValue = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModuleA = HuamiOsAlarmDevice.this.a();
                if (alarmModuleA != null) {
                    AlarmClockExt alarmClockExt = this.c;
                    this.a = 1;
                    obj = alarmModuleA.deleteAlarm(alarmClockExt, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
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
            return "deviceModule is null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.alarm.HuamiOsAlarmDevice$updateAlarm$1", f = "HuamiOsAlarmDevice.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ AlarmClockExt c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AlarmClockExt alarmClockExt, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = alarmClockExt;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HuamiOsAlarmDevice.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean zBooleanValue = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModuleA = HuamiOsAlarmDevice.this.a();
                if (alarmModuleA != null) {
                    AlarmClockExt alarmClockExt = this.c;
                    this.a = 1;
                    obj = alarmModuleA.modifyAlarm(alarmClockExt, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.xiaomi.hm.health.ui.smartplay.alarm.HuamiOsAlarmDevice$interceptor$1] */
    public HuamiOsAlarmDevice(@NotNull HMBaseDevice hMBaseDevice) {
        this.device = hMBaseDevice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlarmModule a() {
        AlarmModule alarmModule = (AlarmModule) this.device.getChannelModule(AlarmModule.class);
        if (alarmModule == null) {
            HMLog.info(d, b.a);
        }
        return alarmModule;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public boolean addAlarm(@NotNull AlarmClockExt alarm) {
        AlarmModule alarmModuleA = a();
        if (alarmModuleA == null) {
            return false;
        }
        return alarmModuleA.addAlarmSync(alarm);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public boolean deleteAlarm(@NotNull AlarmClockExt alarm) {
        return ((Boolean) d.b(null, new a(alarm, null), 1, null)).booleanValue();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    @Nullable
    public List<AlarmClockExt> queryAlarm() {
        AlarmModule alarmModuleA = a();
        if (alarmModuleA == null) {
            return null;
        }
        return alarmModuleA.inquireAlarmSync();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    @Nullable
    public Object queryVersion(@NotNull Continuation<? super AlarmVersionInfo> continuation) {
        AlarmModule alarmModuleA = a();
        if (alarmModuleA == null) {
            return null;
        }
        return alarmModuleA.getAlarmVersionInfo(continuation);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public void registerChangeListener(@NotNull Function0<Unit> alarmChangeListener) {
        AlarmModule alarmModuleA = a();
        if (alarmModuleA != null) {
            alarmModuleA.registerInterceptor(this.interceptor);
        }
        this.alarmChangeListener = alarmChangeListener;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public void unRegisterChangeListener(@NotNull Function0<Unit> alarmChangeListener) {
        AlarmModule alarmModuleA = a();
        if (alarmModuleA != null) {
            alarmModuleA.unregisterInterceptor(this.interceptor);
        }
        this.alarmChangeListener = null;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public boolean updateAlarm(@NotNull AlarmClockExt alarm) {
        return ((Boolean) d.b(null, new c(alarm, null), 1, null)).booleanValue();
    }
}
