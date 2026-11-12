package com.huami.bluetooth.profile.channel.module.pai;

import com.huami.bluetooth.profile.channel.module.a;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.r0;
import defpackage.r3;
import defpackage.t5t;
import defpackage.udt;
import defpackage.y2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR&\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/pai/PaiModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Ludt;", "", "getSetCmd", "(Ludt;)B", "", "getResponseCmd", "(Ludt;)I", "", "init", "()V", "queryVersion", "()I", "paiInfo", "", "setPai", "(Ludt;)Z", RnReportConst.ApiReport.PARAM_MODULE, "I", "getModule", "", "Lkotlinx/coroutines/channels/Channel;", "", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class PaiModule extends a {
    private static final byte CMD_DELETE_MANUAL_ACTIVITY = 6;
    private static final byte CMD_DELETE_MANUAL_ACTIVITY_RESPONSE = 7;
    private static final byte CMD_QUERY_VERSION = 0;
    private static final byte CMD_QUERY_VERSION_RESPONSE = 1;
    private static final byte CMD_SET_ACTIVITY_SCORE = 2;
    private static final byte CMD_SET_ACTIVITY_SCORE_RESPONSE = 3;
    private static final byte CMD_SET_MANUAL_ACTIVITY = 4;
    private static final byte CMD_SET_MANUAL_ACTIVITY_RESPONSE = 5;
    private static final byte CMD_SET_MAX_HR_OFFSET = 8;
    private static final byte CMD_SET_MAX_HR_OFFSET_RESPONSE = 9;
    private static final byte CMD_SET_PAI_INFO = 10;
    private static final byte CMD_SET_PAI_INFO_RESPONSE = 11;
    private static final int CODE_SUCCESS = 0;
    public static final int PAI_MODULE = 34;

    @NotNull
    private final Map<Integer, Channel<byte[]>> channels;
    private final int module;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.pai.PaiModule$init$1$1", f = "PaiModule.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ PaiModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, PaiModule paiModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = paiModule;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.u.getData().length == 0) {
                        t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, "pai module response:" + this.u.d());
                    Channel channel = (Channel) this.v.channels.get(Boxing.boxInt(r0.a(ArraysKt___ArraysKt.first(this.u.getData()))));
                    if (channel != null) {
                        byte[] bArrA = y2.a(this.u.getData());
                        this.t = 1;
                        if (channel.send(bArrA, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse response) throws InterruptedException {
            Intrinsics.checkNotNullParameter(response, "response");
            BuildersKt__BuildersKt.runBlocking$default(null, new a(response, PaiModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.pai.PaiModule$queryVersion$1", f = "PaiModule.kt", i = {}, l = {61, 66}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int t;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.pai.PaiModule$queryVersion$1$1", f = "PaiModule.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int t;
            public final /* synthetic */ PaiModule u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PaiModule paiModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = paiModule;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = (Channel) this.u.channels.get(Boxing.boxInt(1));
                    if (channel == null) {
                        return null;
                    }
                    this.t = 1;
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
                return (byte[]) obj;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PaiModule.this.new c(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x007a  */
        /* JADX WARN: Code duplicated, block: B:22:0x0082  */
        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int iIntValue;
            byte[] bArr;
            byte[] bArr2;
            Integer numA;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                bArr = (byte[]) obj;
                if (bArr == null) {
                    iIntValue = -1;
                } else {
                    bArr2 = (ArraysKt___ArraysKt.first(bArr) & 255) == 0 ? bArr : null;
                    if (bArr2 != null || (numA = r0.a(bArr2)) == null) {
                        iIntValue = -1;
                    } else {
                        iIntValue = numA.intValue() & 255;
                    }
                }
                return Boxing.boxInt(iIntValue);
            }
            ResultKt.throwOnFailure(obj);
            PaiModule.this.channels.put(Boxing.boxInt(1), ChannelKt.Channel$default(0, null, null, 7, null));
            PaiModule paiModule = PaiModule.this;
            ArrayList arrayList = new ArrayList();
            arrayList.add(Boxing.boxByte((byte) 0));
            byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
            this.t = 1;
            obj = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(paiModule, byteArray, 0, false, this, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, "query pai module version fail");
            if (zBooleanValue) {
                a aVar = new a(PaiModule.this, null);
                this.t = 2;
                obj = TimeoutKt.withTimeoutOrNull(15000L, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bArr = (byte[]) obj;
                if (bArr == null) {
                    iIntValue = -1;
                } else {
                    if ((ArraysKt___ArraysKt.first(bArr) & 255) == 0) {
                    }
                    if (bArr2 != null) {
                        iIntValue = -1;
                    } else {
                        iIntValue = -1;
                    }
                }
            } else {
                iIntValue = -1;
            }
            return Boxing.boxInt(iIntValue);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.pai.PaiModule$setPai$1", f = "PaiModule.kt", i = {0, 0, 1}, l = {89, 90}, m = "invokeSuspend", n = {"result", "rspCode", "result"}, s = {"L$0", "I$0", "L$0"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public Object t;
        public Object u;
        public int v;
        public int w;
        public final /* synthetic */ udt x;
        public final /* synthetic */ PaiModule y;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.pai.PaiModule$setPai$1$1$1", f = "PaiModule.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int t;
            public final /* synthetic */ PaiModule u;
            public final /* synthetic */ int v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PaiModule paiModule, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = paiModule;
                this.v = i;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = (Channel) this.u.channels.get(Boxing.boxInt(this.v));
                    if (channel == null) {
                        return null;
                    }
                    this.t = 1;
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
                return (byte[]) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(udt udtVar, PaiModule paiModule, Continuation<? super d> continuation) {
            super(2, continuation);
            this.x = udtVar;
            this.y = paiModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.x, this.y, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00b4 A[Catch: all -> 0x00da, TRY_LEAVE, TryCatch #2 {all -> 0x00da, blocks: (B:23:0x00ac, B:25:0x00b4), top: B:54:0x00ac }] */
        /* JADX WARN: Code duplicated, block: B:27:0x00c7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:31:0x00cd A[Catch: all -> 0x003e, TryCatch #3 {all -> 0x003e, blocks: (B:29:0x00c9, B:31:0x00cd, B:39:0x00de, B:14:0x0037), top: B:56:0x0037 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
        /* JADX WARN: Instruction removed from duplicated block: B:47:0x00fe, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.BooleanRef booleanRef;
            int responseCmd;
            Object objSendDataWithResult$default;
            Ref.BooleanRef booleanRef2;
            PaiModule paiModule;
            Ref.BooleanRef booleanRef3;
            Object objWithTimeoutOrNull;
            Object objM886constructorimpl;
            Throwable thM889exceptionOrNullimpl;
            byte[] bArr;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.w;
            boolean z = false;
            byte[] bArr2 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
                PaiModule paiModule2 = this.y;
                udt udtVar = this.x;
                try {
                    Result.Companion companion = Result.Companion;
                    int iQueryVersion = paiModule2.queryVersion();
                    byte setCmd = paiModule2.getSetCmd(udtVar);
                    responseCmd = paiModule2.getResponseCmd(udtVar);
                    paiModule2.channels.put(Boxing.boxInt(responseCmd), ChannelKt.Channel$default(0, null, null, 7, null));
                    byte[] bArrD = udtVar.d(iQueryVersion);
                    Intrinsics.checkNotNullExpressionValue(bArrD, "paiInfo.getWriteBytes(version)");
                    List mutableList = ArraysKt___ArraysKt.toMutableList(bArrD);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Boxing.boxByte(setCmd));
                    arrayList.addAll(mutableList.subList(2, mutableList.size()));
                    byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
                    this.t = booleanRef4;
                    this.u = paiModule2;
                    this.v = responseCmd;
                    this.w = 1;
                    objSendDataWithResult$default = com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(paiModule2, byteArray, 0, false, this, 6, null);
                    if (objSendDataWithResult$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef2 = booleanRef4;
                    paiModule = paiModule2;
                    if (((Boolean) objSendDataWithResult$default).booleanValue()) {
                        a aVar = new a(paiModule, responseCmd, null);
                        this.t = booleanRef2;
                        this.u = booleanRef2;
                        this.w = 2;
                        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, aVar, this);
                        if (objWithTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        booleanRef3 = booleanRef2;
                        bArr = (byte[]) objWithTimeoutOrNull;
                        if (bArr != null) {
                            bArr2 = bArr;
                        }
                        if (bArr2 != null) {
                            z = true;
                        }
                    } else {
                        booleanRef3 = booleanRef2;
                    }
                    booleanRef3.element = z;
                    objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    th = th;
                    booleanRef = booleanRef4;
                    booleanRef2 = booleanRef;
                    Result.Companion companion2 = Result.Companion;
                    objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                    thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
                    if (thM889exceptionOrNullimpl != null) {
                        t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, "set pai info with code:" + this.x.N() + " error:" + thM889exceptionOrNullimpl.getMessage());
                    }
                    t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, "set pai info with code:" + this.x.N() + " result:" + booleanRef2.element);
                    return Boxing.boxBoolean(booleanRef2.element);
                }
            } else if (i == 1) {
                int i2 = this.v;
                paiModule = (PaiModule) this.u;
                booleanRef2 = (Ref.BooleanRef) this.t;
                try {
                    ResultKt.throwOnFailure(obj);
                    responseCmd = i2;
                    objSendDataWithResult$default = obj;
                    try {
                        if (((Boolean) objSendDataWithResult$default).booleanValue()) {
                            a aVar2 = new a(paiModule, responseCmd, null);
                            this.t = booleanRef2;
                            this.u = booleanRef2;
                            this.w = 2;
                            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, aVar2, this);
                            if (objWithTimeoutOrNull == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            booleanRef3 = booleanRef2;
                            bArr = (byte[]) objWithTimeoutOrNull;
                            if (bArr != null) {
                                bArr2 = bArr;
                            }
                            if (bArr2 != null) {
                                z = true;
                            }
                        } else {
                            booleanRef3 = booleanRef2;
                        }
                        booleanRef3.element = z;
                        objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        th = th2;
                        booleanRef = booleanRef2;
                        booleanRef2 = booleanRef;
                        Result.Companion companion3 = Result.Companion;
                        objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    Result.Companion companion4 = Result.Companion;
                    objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef3 = (Ref.BooleanRef) this.u;
                booleanRef = (Ref.BooleanRef) this.t;
                try {
                    ResultKt.throwOnFailure(obj);
                    booleanRef2 = booleanRef;
                    objWithTimeoutOrNull = obj;
                    bArr = (byte[]) objWithTimeoutOrNull;
                    if (bArr != null && (ArraysKt___ArraysKt.first(bArr) & 255) == 0) {
                        bArr2 = bArr;
                    }
                    if (bArr2 != null) {
                        z = true;
                    }
                    booleanRef3.element = z;
                    objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
                } catch (Throwable th4) {
                    th = th4;
                    booleanRef2 = booleanRef;
                    Result.Companion companion5 = Result.Companion;
                    objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                }
            }
            thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl != null) {
                t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, "set pai info with code:" + this.x.N() + " error:" + thM889exceptionOrNullimpl.getMessage());
            }
            t5t.d(com.huami.bluetooth.profile.channel.module.a.TAG, "set pai info with code:" + this.x.N() + " result:" + booleanRef2.element);
            return Boxing.boxBoolean(booleanRef2.element);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaiModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.module = 34;
        this.channels = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getResponseCmd(udt udtVar) {
        int iN = udtVar.N();
        if (iN == 1) {
            return 3;
        }
        if (iN == 2) {
            return 5;
        }
        if (iN != 3) {
            return iN != 4 ? 11 : 9;
        }
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte getSetCmd(udt udtVar) {
        int iN = udtVar.N();
        if (iN == 1) {
            return (byte) 2;
        }
        if (iN == 2) {
            return (byte) 4;
        }
        if (iN != 3) {
            return iN != 4 ? (byte) 10 : (byte) 8;
        }
        return (byte) 6;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return this.module;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new b(), 2, null);
    }

    public final int queryVersion() {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new c(null), 1, null)).intValue();
    }

    public final boolean setPai(@NotNull udt paiInfo) {
        Intrinsics.checkNotNullParameter(paiInfo, "paiInfo");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new d(paiInfo, this, null), 1, null)).booleanValue();
    }
}
