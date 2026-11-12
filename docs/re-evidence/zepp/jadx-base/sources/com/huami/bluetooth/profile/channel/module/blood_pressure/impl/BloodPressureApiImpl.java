package com.huami.bluetooth.profile.channel.module.blood_pressure.impl;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureApi;
import com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureModule;
import com.huami.bluetooth.profile.channel.module.blood_pressure.model.BloodPressureCorrectProgress;
import com.huami.bluetooth.profile.channel.module.blood_pressure.model.BloodPressureCorrectStatus;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&J\u0013\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0005J\u0015\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0005J\u001b\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0005R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0016\u0010$\u001a\u00020!8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/blood_pressure/impl/BloodPressureApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/blood_pressure/BloodPressureApi;", "Lkotlinx/coroutines/CoroutineScope;", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "diastolic", "systolic", "", "correct", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryCorrectDate", "Lcom/huami/bluetooth/profile/channel/module/blood_pressure/model/BloodPressureCorrectStatus;", "queryCorrectStatus", "status", "setCorrectStatus", "(Lcom/huami/bluetooth/profile/channel/module/blood_pressure/model/BloodPressureCorrectStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/blood_pressure/model/BloodPressureCorrectProgress;", "queryCorrectProgress", "open", "sendClinicalTrialsStatus", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCorrectHeartBeat", "Lcom/huami/bluetooth/profile/channel/module/blood_pressure/BloodPressureModule;", "a", "Lcom/huami/bluetooth/profile/channel/module/blood_pressure/BloodPressureModule;", "module", "Lkotlinx/coroutines/Job;", "b", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/Job;", "job", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/blood_pressure/BloodPressureModule;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureApiImpl implements BloodPressureApi, CoroutineScope {

    @NotNull
    private static final String c = "BloodPressureApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BloodPressureModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy job = LazyKt__LazyJVMKt.lazy(d.a);

    @NotNull
    private static final Map<Integer, Channel<byte[]>> d = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl$1$1", f = "BloodPressureApiImpl.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0325a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl$1$1$1", f = "BloodPressureApiImpl.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0326a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ byte[] c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0326a(int i, byte[] bArr, Continuation<? super C0326a> continuation) {
                    super(2, continuation);
                    this.b = i;
                    this.c = bArr;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0326a(this.b, this.c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0326a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Channel channel = (Channel) BloodPressureApiImpl.d.get(Boxing.boxInt(this.b));
                        if (channel == null) {
                            return null;
                        }
                        byte[] bArrSubArrayWithoutFirstElement = ByteArrayKt.subArrayWithoutFirstElement(this.c);
                        this.a = 1;
                        if (channel.send(bArrSubArrayWithoutFirstElement, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0325a(ChannelResponse channelResponse, Continuation<? super C0325a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0325a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0325a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Debug.fi(BloodPressureApiImpl.c, Intrinsics.stringPlus("receive data: ", this.b));
                    byte[] data = this.b.getData();
                    if (data.length == 0) {
                        return Unit.INSTANCE;
                    }
                    C0326a c0326a = new C0326a(AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(data)), data, null);
                    this.a = 1;
                    if (TimeoutKt.withTimeoutOrNull(500L, c0326a, this) == coroutine_suspended) {
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

        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            kotlinx.coroutines.e.f(BloodPressureApiImpl.this, null, null, new C0325a(channelResponse, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl", f = "BloodPressureApiImpl.kt", i = {}, l = {84, 89}, m = "correct", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BloodPressureApiImpl.this.correct(0, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl$correct$receive$1", f = "BloodPressureApiImpl.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ Channel<byte[]> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Channel<byte[]> channel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = this.b;
                this.a = 1;
                obj = channel.receive(this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Job> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job getA() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl", f = "BloodPressureApiImpl.kt", i = {}, l = {98, 103}, m = "queryCorrectDate", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BloodPressureApiImpl.this.queryCorrectDate(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl$queryCorrectDate$2", f = "BloodPressureApiImpl.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ Channel<byte[]> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Channel<byte[]> channel, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = this.b;
                this.a = 1;
                obj = channel.receive(this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl", f = "BloodPressureApiImpl.kt", i = {}, l = {153, 158}, m = "queryCorrectProgress", n = {}, s = {})
    public static final class g extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BloodPressureApiImpl.this.queryCorrectProgress(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl$queryCorrectProgress$2", f = "BloodPressureApiImpl.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ Channel<byte[]> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Channel<byte[]> channel, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = this.b;
                this.a = 1;
                obj = channel.receive(this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl", f = "BloodPressureApiImpl.kt", i = {}, l = {113, 118}, m = "queryCorrectStatus", n = {}, s = {})
    public static final class i extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BloodPressureApiImpl.this.queryCorrectStatus(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl$queryCorrectStatus$2", f = "BloodPressureApiImpl.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ Channel<byte[]> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Channel<byte[]> channel, Continuation<? super j> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new j(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = this.b;
                this.a = 1;
                obj = channel.receive(this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl", f = "BloodPressureApiImpl.kt", i = {}, l = {69, 73}, m = "queryVersion", n = {}, s = {})
    public static final class k extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BloodPressureApiImpl.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl$queryVersion$2", f = "BloodPressureApiImpl.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ Channel<byte[]> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Channel<byte[]> channel, Continuation<? super l> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new l(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = this.b;
                this.a = 1;
                obj = channel.receive(this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl", f = "BloodPressureApiImpl.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_CHECKERS, DataTypeSource.SPORT_TYPE_SHOOT}, m = "sendClinicalTrialsStatus", n = {}, s = {})
    public static final class m extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BloodPressureApiImpl.this.sendClinicalTrialsStatus(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl$sendClinicalTrialsStatus$2", f = "BloodPressureApiImpl.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_SHOOT}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ Channel<byte[]> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Channel<byte[]> channel, Continuation<? super n> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new n(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = this.b;
                this.a = 1;
                obj = channel.receive(this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl", f = "BloodPressureApiImpl.kt", i = {}, l = {190}, m = "sendCorrectHeartBeat", n = {}, s = {})
    public static final class o extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return BloodPressureApiImpl.this.sendCorrectHeartBeat(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl", f = "BloodPressureApiImpl.kt", i = {}, l = {139, 144}, m = "setCorrectStatus", n = {}, s = {})
    public static final class p extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BloodPressureApiImpl.this.setCorrectStatus(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl$setCorrectStatus$receive$1", f = "BloodPressureApiImpl.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ Channel<byte[]> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Channel<byte[]> channel, Continuation<? super q> continuation) {
            super(2, continuation);
            this.b = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new q(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = this.b;
                this.a = 1;
                obj = channel.receive(this);
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

    public BloodPressureApiImpl(@NotNull BloodPressureModule bloodPressureModule) {
        this.module = bloodPressureModule;
        bloodPressureModule.setReceiveCallback(new a());
    }

    private final Job a() {
        return (Job) this.job.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    @Override // com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureApi
    @Nullable
    public Object correct(int i2, int i3, @NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        Channel<byte[]> channelChannel$default;
        boolean z;
        ?? r16;
        byte[] bArr;
        boolean z2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i4 = bVar.d;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.d = i4 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objSendDataWithResult$default = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i5 = bVar.d;
        if (i5 != 0) {
            if (i5 == 1) {
                channelChannel$default = (Channel) bVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
                z = false;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
                r16 = 0;
            }
            r16 = z;
            bArr = (byte[]) objSendDataWithResult$default;
            if (bArr == null) {
                return Boxing.boxBoolean(r16);
            }
            if (bArr[r16] == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return Boxing.boxBoolean(z2);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boxing.boxByte((byte) 3));
        arrayList.add(Boxing.boxByte((byte) i3));
        arrayList.add(Boxing.boxByte((byte) i2));
        Debug.fi(c, "correct blood pressure, diastolic:" + i2 + " systolic:" + i3);
        channelChannel$default = ChannelKt.Channel$default(0, 1, null);
        d.put(Boxing.boxInt(4), channelChannel$default);
        BloodPressureModule bloodPressureModule = this.module;
        byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
        bVar.a = channelChannel$default;
        bVar.d = 1;
        z = false;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(bloodPressureModule, byteArray, 0, false, bVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (!((Boolean) objSendDataWithResult$default).booleanValue()) {
            Debug.fi(c, "send correct blood pressure cmd fail");
            return Boxing.boxBoolean(z);
        }
        c cVar = new c(channelChannel$default, null);
        bVar.a = null;
        bVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, cVar, bVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            r16 = z;
            return coroutine_suspended;
        }
        r16 = z;
        bArr = (byte[]) objSendDataWithResult$default;
        if (bArr == null) {
            return Boxing.boxBoolean(r16);
        }
        if (bArr[r16] == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boxing.boxBoolean(z2);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return a().plus(Dispatchers.getIO());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureApi
    @Nullable
    public Object queryCorrectDate(@NotNull Continuation<? super Long> continuation) {
        e eVar;
        Channel<byte[]> channel;
        byte[] bArr;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objSendDataWithResult$default = eVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                channel = (Channel) eVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            bArr = (byte[]) objSendDataWithResult$default;
            if (bArr == null) {
                return null;
            }
            return Boxing.boxLong(GattUtils.bytesToLong(bArr, 0, 4));
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Debug.fi(c, "query blood pressure correct date");
        Channel<byte[]> channelChannel$default = ChannelKt.Channel$default(0, 1, null);
        d.put(Boxing.boxInt(6), channelChannel$default);
        BloodPressureModule bloodPressureModule = this.module;
        eVar.a = channelChannel$default;
        eVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(bloodPressureModule, new byte[]{5}, 0, false, eVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channel = channelChannel$default;
        if (!((Boolean) objSendDataWithResult$default).booleanValue()) {
            Debug.fi(c, "send query correct blood pressure date cmd fail");
            return null;
        }
        f fVar = new f(channel, null);
        eVar.a = null;
        eVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, fVar, eVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        bArr = (byte[]) objSendDataWithResult$default;
        if (bArr == null) {
            return null;
        }
        return Boxing.boxLong(GattUtils.bytesToLong(bArr, 0, 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureApi
    @Nullable
    public Object queryCorrectProgress(@NotNull Continuation<? super BloodPressureCorrectProgress> continuation) {
        g gVar;
        Channel<byte[]> channel;
        byte[] bArr;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.d = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objWithTimeoutOrNull = gVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                channel = (Channel) gVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            bArr = (byte[]) objWithTimeoutOrNull;
            if (bArr == null && bArr.length == 2) {
                return new BloodPressureCorrectProgress(AuthModuleKt.toUnSignInt(bArr[1]), AuthModuleKt.toUnSignInt(bArr[0]));
            }
            return null;
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        Debug.fi(c, "query blood pressure correct progress");
        Channel<byte[]> channelChannel$default = ChannelKt.Channel$default(0, 1, null);
        d.put(Boxing.boxInt(12), channelChannel$default);
        BloodPressureModule bloodPressureModule = this.module;
        gVar.a = channelChannel$default;
        gVar.d = 1;
        Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(bloodPressureModule, new byte[]{11}, 0, false, gVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channel = channelChannel$default;
        objWithTimeoutOrNull = objSendDataWithResult$default;
        if (!((Boolean) objWithTimeoutOrNull).booleanValue()) {
            Debug.fi(c, "send query correct blood pressure progress cmd fail");
            return null;
        }
        h hVar = new h(channel, null);
        gVar.a = null;
        gVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, hVar, gVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        bArr = (byte[]) objWithTimeoutOrNull;
        if (bArr == null) {
            return null;
        }
        return new BloodPressureCorrectProgress(AuthModuleKt.toUnSignInt(bArr[1]), AuthModuleKt.toUnSignInt(bArr[0]));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureApi
    @Nullable
    public Object queryCorrectStatus(@NotNull Continuation<? super BloodPressureCorrectStatus> continuation) {
        i iVar;
        Channel<byte[]> channel;
        byte[] bArr;
        boolean z;
        Byte bBoxByte;
        byte bByteValue;
        int i2;
        BloodPressureCorrectStatus bloodPressureCorrectStatus;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i3 = iVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.d = i3 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objWithTimeoutOrNull = iVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = iVar.d;
        if (i4 != 0) {
            if (i4 == 1) {
                channel = (Channel) iVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            bArr = (byte[]) objWithTimeoutOrNull;
            if (bArr == null) {
                return null;
            }
            if (bArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!Boxing.boxBoolean(!z).booleanValue()) {
                bArr = null;
            }
            if (bArr != null || (bBoxByte = Boxing.boxByte(bArr[0])) == null) {
                return null;
            }
            bByteValue = bBoxByte.byteValue();
            i2 = bByteValue & 255;
            bloodPressureCorrectStatus = BloodPressureCorrectStatus.IDEL.INSTANCE;
            if (i2 != bloodPressureCorrectStatus.getStatus()) {
                bloodPressureCorrectStatus = BloodPressureCorrectStatus.PREPARE.INSTANCE;
                if (i2 != bloodPressureCorrectStatus.getStatus()) {
                    bloodPressureCorrectStatus = BloodPressureCorrectStatus.CORRECTING.INSTANCE;
                    if (i2 != bloodPressureCorrectStatus.getStatus()) {
                        bloodPressureCorrectStatus = BloodPressureCorrectStatus.FINISH.INSTANCE;
                        if (i2 != bloodPressureCorrectStatus.getStatus()) {
                            Debug.fi(c, Intrinsics.stringPlus("无法识别返回的状态:", Boxing.boxByte(bByteValue)));
                            return null;
                        }
                    }
                }
            }
            return bloodPressureCorrectStatus;
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        Debug.fi(c, "query blood pressure correct status");
        Channel<byte[]> channelChannel$default = ChannelKt.Channel$default(0, 1, null);
        d.put(Boxing.boxInt(8), channelChannel$default);
        BloodPressureModule bloodPressureModule = this.module;
        iVar.a = channelChannel$default;
        iVar.d = 1;
        Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(bloodPressureModule, new byte[]{7}, 0, false, iVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channel = channelChannel$default;
        objWithTimeoutOrNull = objSendDataWithResult$default;
        if (!((Boolean) objWithTimeoutOrNull).booleanValue()) {
            Debug.fi(c, "send query correct blood pressure status cmd fail");
            return null;
        }
        j jVar = new j(channel, null);
        iVar.a = null;
        iVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, jVar, iVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        bArr = (byte[]) objWithTimeoutOrNull;
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!Boxing.boxBoolean(!z).booleanValue()) {
            bArr = null;
        }
        if (bArr != null) {
            return null;
        }
        bByteValue = bBoxByte.byteValue();
        i2 = bByteValue & 255;
        bloodPressureCorrectStatus = BloodPressureCorrectStatus.IDEL.INSTANCE;
        if (i2 != bloodPressureCorrectStatus.getStatus()) {
            bloodPressureCorrectStatus = BloodPressureCorrectStatus.PREPARE.INSTANCE;
            if (i2 != bloodPressureCorrectStatus.getStatus()) {
                bloodPressureCorrectStatus = BloodPressureCorrectStatus.CORRECTING.INSTANCE;
                if (i2 != bloodPressureCorrectStatus.getStatus()) {
                    bloodPressureCorrectStatus = BloodPressureCorrectStatus.FINISH.INSTANCE;
                    if (i2 != bloodPressureCorrectStatus.getStatus()) {
                        Debug.fi(c, Intrinsics.stringPlus("无法识别返回的状态:", Boxing.boxByte(bByteValue)));
                        return null;
                    }
                }
            }
        }
        return bloodPressureCorrectStatus;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureApi
    @Nullable
    public Object queryVersion(@NotNull Continuation<? super Integer> continuation) {
        k kVar;
        Channel<byte[]> channel;
        byte[] bArr;
        Byte bBoxByte;
        Integer numBoxInt;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.d = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objSendDataWithResult$default = kVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.d;
        int iIntValue = -1;
        if (i3 != 0) {
            if (i3 == 1) {
                channel = (Channel) kVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            bArr = (byte[]) objSendDataWithResult$default;
            if (bArr != null && (bBoxByte = Boxing.boxByte(bArr[0])) != null && (numBoxInt = Boxing.boxInt(AuthModuleKt.toUnSignInt(bBoxByte.byteValue()))) != null) {
                iIntValue = numBoxInt.intValue();
            }
            return Boxing.boxInt(iIntValue);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Channel<byte[]> channelChannel$default = ChannelKt.Channel$default(0, 1, null);
        d.put(Boxing.boxInt(2), channelChannel$default);
        BloodPressureModule bloodPressureModule = this.module;
        kVar.a = channelChannel$default;
        kVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(bloodPressureModule, new byte[]{1}, 0, false, kVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channel = channelChannel$default;
        if (!((Boolean) objSendDataWithResult$default).booleanValue()) {
            return Boxing.boxInt(-1);
        }
        l lVar = new l(channel, null);
        kVar.a = null;
        kVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, lVar, kVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        bArr = (byte[]) objSendDataWithResult$default;
        if (bArr != null) {
            iIntValue = numBoxInt.intValue();
        }
        return Boxing.boxInt(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureApi
    @Nullable
    public Object sendClinicalTrialsStatus(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        m mVar;
        Channel<byte[]> channel;
        byte[] bArr;
        Boolean boolBoxBoolean;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.d = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objWithTimeoutOrNull = mVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar.d;
        boolean zBooleanValue = false;
        if (i3 != 0) {
            if (i3 == 1) {
                channel = (Channel) mVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            bArr = (byte[]) objWithTimeoutOrNull;
            if (bArr != null) {
                boolBoxBoolean = Boxing.boxBoolean(bArr.length != 1 && bArr[0] == 0);
                if (boolBoxBoolean != null) {
                    zBooleanValue = boolBoxBoolean.booleanValue();
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        Debug.fi(c, Intrinsics.stringPlus("sendClinicalTrialsStatus: ", Boxing.boxBoolean(z)));
        byte[] bArr2 = {13, ByteUtilsKt.toByte(z)};
        Channel<byte[]> channelChannel$default = ChannelKt.Channel$default(0, 1, null);
        d.put(Boxing.boxInt(14), channelChannel$default);
        BloodPressureModule bloodPressureModule = this.module;
        mVar.a = channelChannel$default;
        mVar.d = 1;
        Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(bloodPressureModule, bArr2, 0, false, mVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channel = channelChannel$default;
        objWithTimeoutOrNull = objSendDataWithResult$default;
        if (!((Boolean) objWithTimeoutOrNull).booleanValue()) {
            Debug.fi(c, "sendClinicalTrialsStatus fail!");
            return Boxing.boxBoolean(false);
        }
        n nVar = new n(channel, null);
        mVar.a = null;
        mVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, nVar, mVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        bArr = (byte[]) objWithTimeoutOrNull;
        if (bArr != null) {
            boolBoxBoolean = Boxing.boxBoolean(bArr.length != 1 && bArr[0] == 0);
            if (boolBoxBoolean != null) {
                zBooleanValue = boolBoxBoolean.booleanValue();
            }
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureApi
    @Nullable
    public Object sendCorrectHeartBeat(@NotNull Continuation<? super Boolean> continuation) {
        o oVar;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.c = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        } else {
            oVar = new o(continuation);
        }
        o oVar2 = oVar;
        Object objSendDataWithResult$default = oVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = oVar2.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            Debug.fi(c, "sendCorrectHeartBeat");
            BloodPressureModule bloodPressureModule = this.module;
            oVar2.c = 1;
            objSendDataWithResult$default = BaseModule.sendDataWithResult$default(bloodPressureModule, new byte[]{-1}, 0, false, oVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(c, Intrinsics.stringPlus("sendCorrectHeartBeat result:", Boxing.boxBoolean(zBooleanValue)));
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureApi
    @Nullable
    public Object setCorrectStatus(@NotNull BloodPressureCorrectStatus bloodPressureCorrectStatus, @NotNull Continuation<? super Boolean> continuation) {
        p pVar;
        Channel<byte[]> channel;
        byte[] bArr;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i2 = pVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.d = i2 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        Object objSendDataWithResult$default = pVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = pVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                channel = (Channel) pVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            bArr = (byte[]) objSendDataWithResult$default;
            if (bArr == null) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(bArr[0] == 0);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Debug.fi(c, Intrinsics.stringPlus("set blood pressure correct status:", Boxing.boxInt(bloodPressureCorrectStatus.getStatus())));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boxing.boxByte((byte) 9));
        arrayList.add(Boxing.boxByte((byte) bloodPressureCorrectStatus.getStatus()));
        Channel<byte[]> channelChannel$default = ChannelKt.Channel$default(0, 1, null);
        d.put(Boxing.boxInt(10), channelChannel$default);
        BloodPressureModule bloodPressureModule = this.module;
        byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
        pVar.a = channelChannel$default;
        pVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(bloodPressureModule, byteArray, 0, false, pVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channel = channelChannel$default;
        if (!((Boolean) objSendDataWithResult$default).booleanValue()) {
            Debug.fi(c, "send set correct blood pressure status cmd fail");
            return Boxing.boxBoolean(false);
        }
        q qVar = new q(channel, null);
        pVar.a = null;
        pVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, qVar, pVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        bArr = (byte[]) objSendDataWithResult$default;
        if (bArr == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(bArr[0] == 0);
    }
}
