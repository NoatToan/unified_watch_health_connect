package com.xiaomi.hm.health.device.assistant.schedule;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.calendar.Event;
import com.huami.bluetooth.profile.channel.module.assistant.response.Failure;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.assistant.response.Timeout;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleModule;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleStatus;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJC\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/BleScheduleRpcImpl;", "Lcom/xiaomi/hm/health/device/assistant/facotry/ScheduleRpcApi;", "Lorg/koin/core/component/KoinComponent;", "", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "schedule", "", "a", "(Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "body", "c", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "findAll", "findChanges", "", "ids", "clearDeviceChanges", "Lcom/huami/assistant/calendar/Event;", "event", TransportUri.ACTION_ADD, "id", "deleteById", "update", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "scheduleApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BleScheduleRpcImpl implements ScheduleRpcApi, KoinComponent {

    @NotNull
    private static final String c = "BleScheduleRpcImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ScheduleApi scheduleApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl$add$1", f = "BleScheduleRpcImpl.kt", i = {0}, l = {92}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ Event f;
        public final /* synthetic */ BleScheduleRpcImpl g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Event event, BleScheduleRpcImpl bleScheduleRpcImpl, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f = event;
            this.g = bleScheduleRpcImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x004e  */
        /* JADX WARN: Code duplicated, block: B:13:0x0068 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0069 -> B:15:0x0070). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.e
                r2 = 1
                if (r1 == 0) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r1 = r7.d
                kotlin.jvm.internal.Ref$BooleanRef r1 = (kotlin.jvm.internal.Ref.BooleanRef) r1
                java.lang.Object r3 = r7.c
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r7.b
                com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl r4 = (com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl) r4
                java.lang.Object r5 = r7.a
                kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref.BooleanRef) r5
                kotlin.ResultKt.throwOnFailure(r8)
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r7
                goto L70
            L24:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L2c:
                kotlin.ResultKt.throwOnFailure(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
                r8.<init>()
                r8.element = r2
                com.huami.assistant.ui.v2.parse.EventScheduleParser r1 = com.huami.assistant.ui.v2.parse.EventScheduleParser.INSTANCE
                com.huami.assistant.calendar.Event r3 = r7.f
                java.util.List r1 = r1.parse(r3)
                com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl r3 = r7.g
                java.util.Iterator r1 = r1.iterator()
                r4 = r3
                r3 = r1
                r1 = r8
                r8 = r7
            L48:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L80
                java.lang.Object r5 = r3.next()
                com.huami.assistant.ui.v2.model.ScheduleModel r5 = (com.huami.assistant.ui.v2.model.ScheduleModel) r5
                com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel r5 = r5.toWatchSchedule()
                r8.a = r1
                r8.b = r4
                r8.c = r3
                r8.d = r1
                r8.e = r2
                java.lang.Object r5 = com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl.access$addOrUpdate(r4, r5, r8)
                if (r5 != r0) goto L69
                return r0
            L69:
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                r8 = r5
                r5 = r3
            L70:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                r3.element = r8
                boolean r8 = r5.element
                r8 = r0
                r0 = r1
                r3 = r4
                r1 = r5
                r4 = r6
                goto L48
            L80:
                boolean r8 = r1.element
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl", f = "BleScheduleRpcImpl.kt", i = {}, l = {127}, m = "addOrUpdate", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BleScheduleRpcImpl.this.a(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ScheduleModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ScheduleModel scheduleModel) {
            super(0);
            this.a = scheduleModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "add or update schedule:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl$clearDeviceChanges$1", f = "BleScheduleRpcImpl.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<Long> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<Long> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BleScheduleRpcImpl.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleApi scheduleApi = BleScheduleRpcImpl.this.scheduleApi;
                if (scheduleApi == null) {
                    return null;
                }
                List<Long> list = this.c;
                this.a = 1;
                if (scheduleApi.clearDataChangedStatus(list, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "delete schedule id:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl$deleteById$2", f = "BleScheduleRpcImpl.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BleScheduleRpcImpl.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0035  */
        /* JADX WARN: Code duplicated, block: B:18:0x0042  */
        /* JADX WARN: Code duplicated, block: B:21:0x0047  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Response response;
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleApi scheduleApi = BleScheduleRpcImpl.this.scheduleApi;
                if (scheduleApi == null) {
                    response = null;
                } else {
                    long j = this.c;
                    this.a = 1;
                    obj = scheduleApi.delete(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl$findAll$1", f = "BleScheduleRpcImpl.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ScheduleModel>>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BleScheduleRpcImpl.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ScheduleModel>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<ScheduleModel>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<ScheduleModel>> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0037  */
        /* JADX WARN: Code duplicated, block: B:18:0x0040  */
        /* JADX WARN: Code duplicated, block: B:21:0x0045  */
        /* JADX WARN: Code duplicated, block: B:23:0x0049  */
        /* JADX WARN: Code duplicated, block: B:24:0x004e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Response response;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ScheduleApi scheduleApi = BleScheduleRpcImpl.this.scheduleApi;
                if (scheduleApi == null) {
                    response = null;
                } else {
                    List<Long> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    this.a = 1;
                    obj = scheduleApi.queryData(listEmptyList, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (response instanceof Success) {
                    return (List) ((Success) response).getData();
                }
                return response instanceof Failure ? true : response instanceof Timeout ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsKt.emptyList();
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
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl$findChanges$1", f = "BleScheduleRpcImpl.kt", i = {}, l = {67, 73}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ScheduleModel>>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BleScheduleRpcImpl.this.new h(continuation);
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
            ScheduleApi scheduleApi;
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
            ScheduleApi scheduleApi2 = BleScheduleRpcImpl.this.scheduleApi;
            if (scheduleApi2 == null) {
                response = null;
            } else {
                this.a = 1;
                obj = scheduleApi2.queryDataChanged(this);
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
            scheduleApi = BleScheduleRpcImpl.this.scheduleApi;
            if (scheduleApi != null) {
                this.a = 2;
                obj = scheduleApi.queryData(arrayList, this);
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
            scheduleApi = BleScheduleRpcImpl.this.scheduleApi;
            if (scheduleApi != null) {
                this.a = 2;
                obj = scheduleApi.queryData(arrayList, this);
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl$runBlockingWithCatch$1", f = "BleScheduleRpcImpl.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    public static final class i<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super R>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            i iVar = new i(this.c, continuation);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super R> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Exception exc) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl$update$1", f = "BleScheduleRpcImpl.kt", i = {0}, l = {116}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ Event f;
        public final /* synthetic */ BleScheduleRpcImpl g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Event event, BleScheduleRpcImpl bleScheduleRpcImpl, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f = event;
            this.g = bleScheduleRpcImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x004e  */
        /* JADX WARN: Code duplicated, block: B:13:0x0068 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0069 -> B:15:0x0070). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.e
                r2 = 1
                if (r1 == 0) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r1 = r7.d
                kotlin.jvm.internal.Ref$BooleanRef r1 = (kotlin.jvm.internal.Ref.BooleanRef) r1
                java.lang.Object r3 = r7.c
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r7.b
                com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl r4 = (com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl) r4
                java.lang.Object r5 = r7.a
                kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref.BooleanRef) r5
                kotlin.ResultKt.throwOnFailure(r8)
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r7
                goto L70
            L24:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L2c:
                kotlin.ResultKt.throwOnFailure(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
                r8.<init>()
                r8.element = r2
                com.huami.assistant.ui.v2.parse.EventScheduleParser r1 = com.huami.assistant.ui.v2.parse.EventScheduleParser.INSTANCE
                com.huami.assistant.calendar.Event r3 = r7.f
                java.util.List r1 = r1.parse(r3)
                com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl r3 = r7.g
                java.util.Iterator r1 = r1.iterator()
                r4 = r3
                r3 = r1
                r1 = r8
                r8 = r7
            L48:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L80
                java.lang.Object r5 = r3.next()
                com.huami.assistant.ui.v2.model.ScheduleModel r5 = (com.huami.assistant.ui.v2.model.ScheduleModel) r5
                com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel r5 = r5.toWatchSchedule()
                r8.a = r1
                r8.b = r4
                r8.c = r3
                r8.d = r1
                r8.e = r2
                java.lang.Object r5 = com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl.access$addOrUpdate(r4, r5, r8)
                if (r5 != r0) goto L69
                return r0
            L69:
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                r8 = r5
                r5 = r3
            L70:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                r3.element = r8
                boolean r8 = r5.element
                r8 = r0
                r0 = r1
                r3 = r4
                r1 = r5
                r4 = r6
                goto L48
            L80:
                boolean r8 = r1.element
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleScheduleRpcImpl() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.assistant.schedule.BleScheduleRpcImpl$special$$inlined$inject$default$1
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
        d();
        if (this.scheduleApi != null) {
            HMLog.w(c, "Device not support Schedule API", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ScheduleModel scheduleModel, Continuation<? super Boolean> continuation) {
        b bVar;
        Response response;
        boolean zBooleanValue;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.c = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objAddOrUpdate = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objAddOrUpdate);
            HMLog.info(c, new c(scheduleModel));
            ScheduleApi scheduleApi = this.scheduleApi;
            if (scheduleApi == null) {
                response = null;
            } else {
                bVar.c = 1;
                objAddOrUpdate = scheduleApi.addOrUpdate(scheduleModel, bVar);
                if (objAddOrUpdate == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
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
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objAddOrUpdate);
        response = (Response) objAddOrUpdate;
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

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final <R> R c(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> body) {
        try {
            return (R) kotlinx.coroutines.d.b(null, new i(body, null), 1, null);
        } catch (Exception e2) {
            HMLog.error(c, "", e2, new j(e2));
            return null;
        }
    }

    private final void d() {
        HMBaseDevice device = b().getDevice(HMDeviceType.MILI);
        boolean z = false;
        if (device != null && !device.isConnected()) {
            z = true;
        }
        if (!z && (device instanceof HMMiLiProDevice)) {
            ScheduleModule scheduleModule = (ScheduleModule) ((HMMiLiProDevice) device).getChannelModule(ScheduleModule.class);
            this.scheduleApi = scheduleModule == null ? null : scheduleModule.loadOperationApi();
        }
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi
    public boolean add(@NotNull Event event) {
        Boolean bool = (Boolean) c(new a(event, this, null));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi
    public void clearDeviceChanges(@NotNull List<Long> ids) {
        c(new d(ids, null));
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi
    public boolean deleteById(long id) {
        HMLog.info(c, new e(id));
        Boolean bool = (Boolean) c(new f(id, null));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi
    @NotNull
    public List<ScheduleModel> findAll() {
        List<ScheduleModel> list = (List) c(new g(null));
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi
    @NotNull
    public List<ScheduleModel> findChanges() {
        List<ScheduleModel> list = (List) c(new h(null));
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi
    public boolean update(@NotNull Event event) {
        Boolean bool = (Boolean) c(new k(event, this, null));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
