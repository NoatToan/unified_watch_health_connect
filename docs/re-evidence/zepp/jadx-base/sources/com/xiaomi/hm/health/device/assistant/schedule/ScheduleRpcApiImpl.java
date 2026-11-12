package com.xiaomi.hm.health.device.assistant.schedule;

import android.text.TextUtils;
import com.huami.assistant.ui.v2.repo.ScheduleRpcApi;
import com.huami.bluetooth.profile.channel.module.assistant.response.Failure;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.assistant.response.Timeout;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleCallback;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleModule;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleStatus;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleVersion;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0007¢\u0006\u0004\b*\u0010+JC\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0016\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0016\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010H\u0016J\u0010\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0016R\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/ScheduleRpcApiImpl;", "Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "Lorg/koin/core/component/KoinComponent;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "body", "c", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "event", "", TransportUri.ACTION_ADD, "", "", "ids", "", "clearDeviceChanges", "id", "deleteById", "", "sourceList", "deleteBySource", "findAll", "findChanges", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "queryVersion", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleCallback;", "callback", "register", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "b", "()Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "scheduleApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ScheduleRpcApiImpl implements ScheduleRpcApi, KoinComponent {

    @NotNull
    private static final String b = "Schedule-->ScheduleRpcApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcApiImpl$add$1", f = "ScheduleRpcApiImpl.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ ScheduleModel c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcApiImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0801a extends Lambda implements Function0<String> {
            public final /* synthetic */ ScheduleModel a;
            public final /* synthetic */ Response<Boolean> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0801a(ScheduleModel scheduleModel, Response<Boolean> response) {
                super(0);
                this.a = scheduleModel;
                this.b = response;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "add schedule " + this.a + " result:" + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScheduleModel scheduleModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = scheduleModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleRpcApiImpl.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0041  */
        /* JADX WARN: Code duplicated, block: B:18:0x004e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0053  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Response response;
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleApi scheduleApiB = ScheduleRpcApiImpl.this.b();
                if (scheduleApiB == null) {
                    response = null;
                } else {
                    ScheduleModel scheduleModel = this.c;
                    this.a = 1;
                    obj = scheduleApiB.addOrUpdate(scheduleModel, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                HMLog.info(ScheduleRpcApiImpl.b, new C0801a(this.c, response));
                if (response instanceof Success) {
                    zBooleanValue = ((Boolean) ((Success) response).getData()).booleanValue();
                } else {
                    if (!(response instanceof Failure)) {
                        boolean z = response instanceof Timeout;
                    }
                    zBooleanValue = false;
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            response = (Response) obj;
            HMLog.info(ScheduleRpcApiImpl.b, new C0801a(this.c, response));
            if (response instanceof Success) {
                zBooleanValue = ((Boolean) ((Success) response).getData()).booleanValue();
            } else {
                if (!(response instanceof Failure)) {
                    boolean z2 = response instanceof Timeout;
                }
                zBooleanValue = false;
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcApiImpl$clearDeviceChanges$1", f = "ScheduleRpcApiImpl.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<Long> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Long> list, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleRpcApiImpl.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleApi scheduleApiB = ScheduleRpcApiImpl.this.b();
                if (scheduleApiB == null) {
                    return null;
                }
                List<Long> list = this.c;
                this.a = 1;
                if (scheduleApiB.clearDataChangedStatus(list, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcApiImpl$deleteById$1", f = "ScheduleRpcApiImpl.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ long c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ long a;
            public final /* synthetic */ Response<Boolean> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, Response<Boolean> response) {
                super(0);
                this.a = j;
                this.b = response;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "delete schedule id:" + this.a + " result" + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleRpcApiImpl.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0041  */
        /* JADX WARN: Code duplicated, block: B:18:0x004e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0053  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Response response;
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleApi scheduleApiB = ScheduleRpcApiImpl.this.b();
                if (scheduleApiB == null) {
                    response = null;
                } else {
                    long j = this.c;
                    this.a = 1;
                    obj = scheduleApiB.delete(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                HMLog.info(ScheduleRpcApiImpl.b, new a(this.c, response));
                if (response instanceof Success) {
                    zBooleanValue = ((Boolean) ((Success) response).getData()).booleanValue();
                } else {
                    if (!(response instanceof Failure)) {
                        boolean z = response instanceof Timeout;
                    }
                    zBooleanValue = false;
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            response = (Response) obj;
            HMLog.info(ScheduleRpcApiImpl.b, new a(this.c, response));
            if (response instanceof Success) {
                zBooleanValue = ((Boolean) ((Success) response).getData()).booleanValue();
            } else {
                if (!(response instanceof Failure)) {
                    boolean z2 = response instanceof Timeout;
                }
                zBooleanValue = false;
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcApiImpl$deleteBySource$1", f = "ScheduleRpcApiImpl.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ List<Integer> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<Integer> a;
            public final /* synthetic */ Response<Boolean> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<Integer> list, Response<Boolean> response) {
                super(0);
                this.a = list;
                this.b = response;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "delete schedule source:" + TextUtils.join(",", this.a) + " result" + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<Integer> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleRpcApiImpl.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0041  */
        /* JADX WARN: Code duplicated, block: B:18:0x004e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0053  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Response response;
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleApi scheduleApiB = ScheduleRpcApiImpl.this.b();
                if (scheduleApiB == null) {
                    response = null;
                } else {
                    List<Integer> list = this.c;
                    this.a = 1;
                    obj = scheduleApiB.deleteBySource(list, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                HMLog.info(ScheduleRpcApiImpl.b, new a(this.c, response));
                if (response instanceof Success) {
                    zBooleanValue = ((Boolean) ((Success) response).getData()).booleanValue();
                } else {
                    if (!(response instanceof Failure)) {
                        boolean z = response instanceof Timeout;
                    }
                    zBooleanValue = false;
                }
                return Boxing.boxBoolean(zBooleanValue);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            response = (Response) obj;
            HMLog.info(ScheduleRpcApiImpl.b, new a(this.c, response));
            if (response instanceof Success) {
                zBooleanValue = ((Boolean) ((Success) response).getData()).booleanValue();
            } else {
                if (!(response instanceof Failure)) {
                    boolean z2 = response instanceof Timeout;
                }
                zBooleanValue = false;
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "find all schedule result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcApiImpl$findAll$queryResult$1", f = "ScheduleRpcApiImpl.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ScheduleModel>>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleRpcApiImpl.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ScheduleModel>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ScheduleModel>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<ScheduleModel>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0038  */
        /* JADX WARN: Code duplicated, block: B:18:0x0042  */
        /* JADX WARN: Code duplicated, block: B:21:0x0047  */
        /* JADX WARN: Code duplicated, block: B:24:0x004c  */
        /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Response response;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleApi scheduleApiB = ScheduleRpcApiImpl.this.b();
                if (scheduleApiB == null) {
                    response = null;
                } else {
                    List<Long> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    this.a = 1;
                    obj = scheduleApiB.queryData(listEmptyList, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (response instanceof Success) {
                    return (List) ((Success) response).getData();
                }
                if (response instanceof Failure ? true : response instanceof Timeout) {
                    return null;
                }
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            response = (Response) obj;
            if (response instanceof Success) {
                return (List) ((Success) response).getData();
            }
            if (response instanceof Failure ? true : response instanceof Timeout) {
                return null;
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ List<ScheduleModel> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<ScheduleModel> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "find all change schedule result:" + TextUtils.join(",", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcApiImpl$findChanges$queryResult$1", f = "ScheduleRpcApiImpl.kt", i = {}, l = {100, 106}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ScheduleModel>>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleRpcApiImpl.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ScheduleModel>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ScheduleModel>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<ScheduleModel>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003c  */
        /* JADX WARN: Code duplicated, block: B:20:0x0045  */
        /* JADX WARN: Code duplicated, block: B:22:0x0049  */
        /* JADX WARN: Code duplicated, block: B:23:0x004b  */
        /* JADX WARN: Code duplicated, block: B:25:0x004f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0054  */
        /* JADX WARN: Code duplicated, block: B:30:0x006d A[LOOP:0: B:28:0x0067->B:30:0x006d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:34:0x008f  */
        /* JADX WARN: Code duplicated, block: B:37:0x0093  */
        /* JADX WARN: Code duplicated, block: B:40:0x009c  */
        /* JADX WARN: Code duplicated, block: B:42:0x00a4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:53:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Response response;
            boolean z;
            List listEmptyList;
            ArrayList arrayList;
            Iterator it2;
            ScheduleApi scheduleApiB;
            List listEmptyList2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            Response response2 = null;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                response2 = (Response) obj;
                if (response2 instanceof Success) {
                    listEmptyList2 = (List) ((Success) response2).getData();
                } else {
                    if (response2 instanceof Failure ? true : response2 instanceof Timeout) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    }
                }
                return listEmptyList2;
            }
            ResultKt.throwOnFailure(obj);
            ScheduleApi scheduleApiB2 = ScheduleRpcApiImpl.this.b();
            if (scheduleApiB2 == null) {
                response = null;
            } else {
                this.a = 1;
                obj = scheduleApiB2.queryDataChanged(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (response instanceof Success) {
                listEmptyList = (List) ((Success) response).getData();
            } else {
                if (response instanceof Failure) {
                    z = true;
                } else {
                    z = response instanceof Timeout;
                }
                if (z) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
            }
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listEmptyList, 10));
            it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                arrayList.add(Boxing.boxLong(((ScheduleStatus) it2.next()).getId()));
            }
            if (!Boxing.boxBoolean(!arrayList.isEmpty()).booleanValue()) {
                arrayList = null;
            }
            if (arrayList == null) {
                return null;
            }
            scheduleApiB = ScheduleRpcApiImpl.this.b();
            if (scheduleApiB != null) {
                this.a = 2;
                obj = scheduleApiB.queryData(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                response2 = (Response) obj;
            }
            if (response2 instanceof Success) {
                listEmptyList2 = (List) ((Success) response2).getData();
            } else {
                if (response2 instanceof Failure ? true : response2 instanceof Timeout) {
                    listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                }
            }
            return listEmptyList2;
            response = (Response) obj;
            if (response instanceof Success) {
                listEmptyList = (List) ((Success) response).getData();
            } else {
                if (response instanceof Failure) {
                    z = true;
                } else {
                    z = response instanceof Timeout;
                }
                if (z) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
            }
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listEmptyList, 10));
            it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                arrayList.add(Boxing.boxLong(((ScheduleStatus) it2.next()).getId()));
            }
            if (!Boxing.boxBoolean(!arrayList.isEmpty()).booleanValue()) {
                arrayList = null;
            }
            if (arrayList == null) {
                return null;
            }
            scheduleApiB = ScheduleRpcApiImpl.this.b();
            if (scheduleApiB != null) {
                this.a = 2;
                obj = scheduleApiB.queryData(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                response2 = (Response) obj;
            }
            if (response2 instanceof Success) {
                listEmptyList2 = (List) ((Success) response2).getData();
            } else {
                if (response2 instanceof Failure ? true : response2 instanceof Timeout) {
                    listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                }
            }
            return listEmptyList2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcApiImpl$queryVersion$1", f = "ScheduleRpcApiImpl.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ScheduleVersion>, Object> {
        public int a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleRpcApiImpl.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ScheduleVersion> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleApi scheduleApiB = ScheduleRpcApiImpl.this.b();
                if (scheduleApiB == null) {
                    return null;
                }
                this.a = 1;
                obj = scheduleApiB.requestCacheVersion(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (ScheduleVersion) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "register ScheduleCallback";
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcApiImpl$runBlockingWithCatch$1", f = "ScheduleRpcApiImpl.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class k<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super R>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super k> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            k kVar = new k(this.c, continuation);
            kVar.b = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super R> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                Function2<CoroutineScope, Continuation<? super R>, Object> function2 = this.c;
                this.a = 1;
                obj = function2.invoke(coroutineScope, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"R", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScheduleRpcApiImpl() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcApiImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduleApi b() {
        ScheduleModule scheduleModule;
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        if (device == null) {
            return null;
        }
        if ((device instanceof HMMiLiProDevice ? device : null) == null || (scheduleModule = (ScheduleModule) device.getChannelModule(ScheduleModule.class)) == null) {
            return null;
        }
        return scheduleModule.loadOperationApi();
    }

    private final <R> R c(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> body) {
        try {
            return (R) kotlinx.coroutines.d.b(null, new k(body, null), 1, null);
        } catch (Exception e2) {
            HMLog.error(b, "", e2, new l(e2));
            return null;
        }
    }

    @Override // com.huami.assistant.ui.v2.repo.ScheduleRpcApi
    public boolean add(@NotNull ScheduleModel event) {
        return Intrinsics.areEqual(c(new a(event, null)), Boolean.TRUE);
    }

    @Override // com.huami.assistant.ui.v2.repo.ScheduleRpcApi
    public void clearDeviceChanges(@NotNull List<Long> ids) {
        c(new b(ids, null));
    }

    @Override // com.huami.assistant.ui.v2.repo.ScheduleRpcApi
    public boolean deleteById(long id) {
        Boolean bool = (Boolean) c(new c(id, null));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.huami.assistant.ui.v2.repo.ScheduleRpcApi
    public boolean deleteBySource(@NotNull List<Integer> sourceList) {
        Boolean bool = (Boolean) c(new d(sourceList, null));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.huami.assistant.ui.v2.repo.ScheduleRpcApi
    @Nullable
    public List<ScheduleModel> findAll() {
        List<ScheduleModel> list = (List) c(new f(null));
        HMLog.info(b, new e(list == null ? "null" : TextUtils.join(",", list)));
        return list;
    }

    @Override // com.huami.assistant.ui.v2.repo.ScheduleRpcApi
    @NotNull
    public List<ScheduleModel> findChanges() {
        List<ScheduleModel> listEmptyList = (List) c(new h(null));
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        HMLog.info(b, new g(listEmptyList));
        return listEmptyList;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.assistant.ui.v2.repo.ScheduleRpcApi
    @NotNull
    public ScheduleVersion queryVersion() {
        ScheduleVersion scheduleVersion = (ScheduleVersion) c(new i(null));
        return scheduleVersion == null ? new ScheduleVersion(1, false, false) : scheduleVersion;
    }

    @Override // com.huami.assistant.ui.v2.repo.ScheduleRpcApi
    public void register(@NotNull ScheduleCallback callback) {
        HMLog.info(b, j.a);
        ScheduleApi scheduleApiB = b();
        if (scheduleApiB == null) {
            return;
        }
        scheduleApiB.register(callback);
    }
}
