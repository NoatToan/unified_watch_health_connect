package com.xiaomi.hm.health.ui.smartplay.alarm;

import androidx.annotation.WorkerThread;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmVersionInfo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
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
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\fH\u0016J\u001a\u0010\u000f\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\fH\u0016J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\u000b2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b0\u0013H\u0007R\u001d\u0010\u0019\u001a\u00020\u00018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmCompactDevice;", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/IAlarmDevice;", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "alarm", "", "addAlarm", "deleteAlarm", "updateAlarm", "", "queryAlarm", "Lkotlin/Function0;", "", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmChangeListener;", "alarmChangeListener", "registerChangeListener", "unRegisterChangeListener", "Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmVersionInfo;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/IAlarmCallback;", "callback", "queryAlarmAsync", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/ui/smartplay/alarm/IAlarmDevice;", "alarmDevice", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AlarmCompactDevice implements IAlarmDevice {

    @NotNull
    private static final String b = "AlarmCompactDevice";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy alarmDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/IAlarmDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<IAlarmDevice> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.smartplay.alarm.AlarmCompactDevice$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1028a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1028a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "alarmDevice:" + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IAlarmDevice invoke() {
            IAlarmDevice huamiOsAlarmDevice = this.a.supportModule(15) ? new HuamiOsAlarmDevice(this.a) : new TraditionalAlarmDevice(this.a);
            HMLog.info(AlarmCompactDevice.b, new C1028a(huamiOsAlarmDevice instanceof HuamiOsAlarmDevice ? "HuamiOsAlarmDevice" : "TraditionalAlarmDevice"));
            return huamiOsAlarmDevice;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.alarm.AlarmCompactDevice$queryAlarmAsync$1", f = "AlarmCompactDevice.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ IAlarmCallback<List<AlarmClockExt>> d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.alarm.AlarmCompactDevice$queryAlarmAsync$1$1", f = "AlarmCompactDevice.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ IAlarmCallback<List<AlarmClockExt>> b;
            public final /* synthetic */ List<AlarmClockExt> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(IAlarmCallback<List<AlarmClockExt>> iAlarmCallback, List<? extends AlarmClockExt> list, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = iAlarmCallback;
                this.c = list;
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
                this.b.onResult(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IAlarmCallback<List<AlarmClockExt>> iAlarmCallback, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = iAlarmCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = AlarmCompactDevice.this.new b(this.d, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            e.f((CoroutineScope) this.b, Dispatchers.getMain(), null, new a(this.d, AlarmCompactDevice.this.queryAlarm(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    public AlarmCompactDevice(@NotNull HMBaseDevice hMBaseDevice) {
        this.alarmDevice = LazyKt__LazyJVMKt.lazy(new a(hMBaseDevice));
    }

    private final IAlarmDevice a() {
        return (IAlarmDevice) this.alarmDevice.getValue();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public boolean addAlarm(@NotNull AlarmClockExt alarm) {
        return a().addAlarm(alarm);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public boolean deleteAlarm(@NotNull AlarmClockExt alarm) {
        return a().deleteAlarm(alarm);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    @Nullable
    public List<AlarmClockExt> queryAlarm() {
        return a().queryAlarm();
    }

    @WorkerThread
    public final void queryAlarmAsync(@NotNull IAlarmCallback<List<AlarmClockExt>> callback) {
        e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new b(callback, null), 2, null);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    @Nullable
    public Object queryVersion(@NotNull Continuation<? super AlarmVersionInfo> continuation) {
        return a().queryVersion(continuation);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public void registerChangeListener(@NotNull Function0<Unit> alarmChangeListener) {
        a().registerChangeListener(alarmChangeListener);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public void unRegisterChangeListener(@NotNull Function0<Unit> alarmChangeListener) {
        a().unRegisterChangeListener(alarmChangeListener);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public boolean updateAlarm(@NotNull AlarmClockExt alarm) {
        return a().updateAlarm(alarm);
    }
}
