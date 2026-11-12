package com.huami.bluetooth.profile.channel.module.pai;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xmlywind.sdk.common.mta.PointCategory;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002R\u001c\u0010\u0011\u001a\u00020\u00058\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/pai/PaiModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pai/HMPaiData;", "", GoogleApiAvailabilityLight.a, "", "c", "", PointCategory.INIT, "queryVersion", "paiInfo", "", "setPai", "g", LogUtil.I, "getModule", "()I", "module", "", "Lkotlinx/coroutines/channels/Channel;", "", "h", "Ljava/util/Map;", "channels", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PaiModule extends BaseModule {
    public static final int PAI_MODULE = 34;
    private static final byte i = 0;
    private static final byte j = 1;
    private static final byte k = 2;
    private static final byte l = 3;
    private static final byte m = 4;
    private static final byte n = 5;
    private static final byte o = 6;
    private static final byte p = 7;
    private static final byte q = 8;
    private static final byte r = 9;
    private static final byte s = 10;
    private static final byte t = 11;
    private static final int u = 0;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int module;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<byte[]>> channels;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.pai.PaiModule$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.pai.PaiModule$init$1$1", f = "PaiModule.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0331a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ PaiModule c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0331a(ChannelResponse channelResponse, PaiModule paiModule, Continuation<? super C0331a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = paiModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0331a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0331a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.b.getData().length == 0) {
                        Debug.fi(BaseModule.TAG, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    Debug.fi(BaseModule.TAG, Intrinsics.stringPlus("pai module response:", this.b.toHexString()));
                    Channel channel = (Channel) this.c.channels.get(Boxing.boxInt(AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(this.b.getData()))));
                    if (channel != null) {
                        byte[] bArrSubArrayWithoutFirstElement = ByteArrayKt.subArrayWithoutFirstElement(this.b.getData());
                        this.a = 1;
                        if (channel.send(bArrSubArrayWithoutFirstElement, this) == coroutine_suspended) {
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

        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) throws InterruptedException {
            d.b(null, new C0331a(channelResponse, PaiModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.pai.PaiModule$queryVersion$1", f = "PaiModule.kt", i = {}, l = {61, 66}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.pai.PaiModule$queryVersion$1$1", f = "PaiModule.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int a;
            public final /* synthetic */ PaiModule b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PaiModule paiModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = paiModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = (Channel) this.b.channels.get(Boxing.boxInt(1));
                    if (channel == null) {
                        return null;
                    }
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
                return (byte[]) obj;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PaiModule.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x007f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0087  */
        /* JADX WARN: Code duplicated, block: B:26:0x0092  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objSendDataWithResult$default;
            Object objWithTimeoutOrNull;
            byte[] bArr;
            byte[] bArr2;
            Integer numSecond;
            Integer numBoxInt;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            int iIntValue = -1;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    objSendDataWithResult$default = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objWithTimeoutOrNull = obj;
                }
                bArr = (byte[]) objWithTimeoutOrNull;
                if (bArr != null) {
                    bArr2 = Boxing.boxBoolean((ArraysKt___ArraysKt.first(bArr) & 255) == 0).booleanValue() ? bArr : null;
                    if (bArr2 != null && (numSecond = AuthModuleKt.second(bArr2)) != null && (numBoxInt = Boxing.boxInt(numSecond.intValue() & 255)) != null) {
                        iIntValue = numBoxInt.intValue();
                    }
                }
                return Boxing.boxInt(iIntValue);
            }
            ResultKt.throwOnFailure(obj);
            PaiModule.this.channels.put(Boxing.boxInt(1), ChannelKt.Channel$default(0, 1, null));
            PaiModule paiModule = PaiModule.this;
            ArrayList arrayList = new ArrayList();
            arrayList.add(Boxing.boxByte((byte) 0));
            Unit unit = Unit.INSTANCE;
            byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
            this.a = 1;
            objSendDataWithResult$default = BaseModule.sendDataWithResult$default(paiModule, byteArray, 0, false, this, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
            Debug.fi(BaseModule.TAG, "query pai module version fail");
            if (zBooleanValue) {
                a aVar = new a(PaiModule.this, null);
                this.a = 2;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, aVar, this);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bArr = (byte[]) objWithTimeoutOrNull;
                if (bArr != null) {
                    if (Boxing.boxBoolean((ArraysKt___ArraysKt.first(bArr) & 255) == 0).booleanValue()) {
                    }
                    if (bArr2 != null) {
                        iIntValue = numBoxInt.intValue();
                    }
                }
            }
            return Boxing.boxInt(iIntValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.pai.PaiModule$setPai$1", f = "PaiModule.kt", i = {0, 0, 1}, l = {89, 90}, m = "invokeSuspend", n = {"result", "rspCode", "result"}, s = {"L$0", "I$0", "L$0"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public final /* synthetic */ HMPaiData e;
        public final /* synthetic */ PaiModule f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.pai.PaiModule$setPai$1$1$1", f = "PaiModule.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int a;
            public final /* synthetic */ PaiModule b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PaiModule paiModule, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = paiModule;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = (Channel) this.b.channels.get(Boxing.boxInt(this.c));
                    if (channel == null) {
                        return null;
                    }
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
                return (byte[]) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMPaiData hMPaiData, PaiModule paiModule, Continuation<? super c> continuation) {
            super(2, continuation);
            this.e = hMPaiData;
            this.f = paiModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c9 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:29:0x00c4, B:32:0x00c9, B:36:0x00d4, B:14:0x0037, B:23:0x00a7, B:25:0x00af), top: B:59:0x0037 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:38:0x00de  */
        /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:52:0x010d  */
        /* JADX WARN: Instruction removed from duplicated block: B:52:0x010d, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.BooleanRef booleanRef;
            int iC;
            Object objSendDataWithResult$default;
            Ref.BooleanRef booleanRef2;
            PaiModule paiModule;
            Ref.BooleanRef booleanRef3;
            Object objWithTimeoutOrNull;
            Ref.BooleanRef booleanRef4;
            Object objM3845constructorimpl;
            Throwable thM3848exceptionOrNullimpl;
            byte[] bArr;
            boolean z;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.d;
            boolean z2 = false;
            byte[] bArr2 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef5 = new Ref.BooleanRef();
                PaiModule paiModule2 = this.f;
                HMPaiData hMPaiData = this.e;
                try {
                    Result.Companion companion = Result.Companion;
                    int iQueryVersion = paiModule2.queryVersion();
                    byte bD = paiModule2.d(hMPaiData);
                    iC = paiModule2.c(hMPaiData);
                    paiModule2.channels.put(Boxing.boxInt(iC), ChannelKt.Channel$default(0, 1, null));
                    List<Byte> mutableList = ArraysKt___ArraysKt.toMutableList(hMPaiData.getWriteBytes(iQueryVersion));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Boxing.boxByte(bD));
                    arrayList.addAll(mutableList.subList(2, mutableList.size()));
                    byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
                    this.a = booleanRef5;
                    this.b = paiModule2;
                    this.c = iC;
                    this.d = 1;
                    objSendDataWithResult$default = BaseModule.sendDataWithResult$default(paiModule2, byteArray, 0, false, this, 6, null);
                    if (objSendDataWithResult$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef2 = booleanRef5;
                    paiModule = paiModule2;
                } catch (Throwable th) {
                    th = th;
                    booleanRef = booleanRef5;
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef4 = (Ref.BooleanRef) this.b;
                    booleanRef = (Ref.BooleanRef) this.a;
                    try {
                        ResultKt.throwOnFailure(obj);
                        booleanRef2 = booleanRef;
                        objWithTimeoutOrNull = obj;
                        bArr = (byte[]) objWithTimeoutOrNull;
                        if (bArr != null) {
                            if ((ArraysKt___ArraysKt.first(bArr) & 255) == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (Boxing.boxBoolean(z).booleanValue()) {
                                bArr2 = bArr;
                            }
                        }
                        if (bArr2 != null) {
                            booleanRef = booleanRef2;
                            z2 = true;
                        } else {
                            Ref.BooleanRef booleanRef6 = booleanRef2;
                            booleanRef2 = booleanRef4;
                            booleanRef3 = booleanRef6;
                            booleanRef = booleanRef3;
                            booleanRef4 = booleanRef2;
                        }
                        booleanRef4.element = z2;
                        objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion3 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        Debug.fi(BaseModule.TAG, "set pai info with code:" + this.e.getOp() + " error:" + ((Object) thM3848exceptionOrNullimpl.getMessage()));
                    }
                    Debug.fi(BaseModule.TAG, "set pai info with code:" + this.e.getOp() + " result:" + booleanRef.element);
                    return Boxing.boxBoolean(booleanRef.element);
                }
                int i2 = this.c;
                paiModule = (PaiModule) this.b;
                booleanRef2 = (Ref.BooleanRef) this.a;
                try {
                    ResultKt.throwOnFailure(obj);
                    iC = i2;
                    objSendDataWithResult$default = obj;
                } catch (Throwable th3) {
                    th = th3;
                    booleanRef = booleanRef2;
                    Result.Companion companion4 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
            }
            if (((Boolean) objSendDataWithResult$default).booleanValue()) {
                a aVar = new a(paiModule, iC, null);
                this.a = booleanRef2;
                this.b = booleanRef2;
                this.d = 2;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, aVar, this);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef4 = booleanRef2;
                bArr = (byte[]) objWithTimeoutOrNull;
                if (bArr != null) {
                    if ((ArraysKt___ArraysKt.first(bArr) & 255) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Boxing.boxBoolean(z).booleanValue()) {
                        bArr2 = bArr;
                    }
                }
                if (bArr2 != null) {
                    booleanRef = booleanRef2;
                    z2 = true;
                } else {
                    Ref.BooleanRef booleanRef7 = booleanRef2;
                    booleanRef2 = booleanRef4;
                    booleanRef3 = booleanRef7;
                }
                booleanRef4.element = z2;
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    Debug.fi(BaseModule.TAG, "set pai info with code:" + this.e.getOp() + " error:" + ((Object) thM3848exceptionOrNullimpl.getMessage()));
                }
                Debug.fi(BaseModule.TAG, "set pai info with code:" + this.e.getOp() + " result:" + booleanRef.element);
                return Boxing.boxBoolean(booleanRef.element);
            }
            booleanRef3 = booleanRef2;
            booleanRef = booleanRef3;
            booleanRef4 = booleanRef2;
            booleanRef4.element = z2;
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                Debug.fi(BaseModule.TAG, "set pai info with code:" + this.e.getOp() + " error:" + ((Object) thM3848exceptionOrNullimpl.getMessage()));
            }
            Debug.fi(BaseModule.TAG, "set pai info with code:" + this.e.getOp() + " result:" + booleanRef.element);
            return Boxing.boxBoolean(booleanRef.element);
        }
    }

    public PaiModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.module = 34;
        this.channels = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c(HMPaiData hMPaiData) {
        int op = hMPaiData.getOp();
        if (op == 1) {
            return 3;
        }
        if (op == 2) {
            return 5;
        }
        if (op != 3) {
            return op != 4 ? 11 : 9;
        }
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte d(HMPaiData hMPaiData) {
        int op = hMPaiData.getOp();
        if (op == 1) {
            return (byte) 2;
        }
        if (op == 2) {
            return (byte) 4;
        }
        if (op != 3) {
            return op != 4 ? (byte) 10 : (byte) 8;
        }
        return (byte) 6;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return this.module;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new a(), 2, null);
    }

    public final int queryVersion() {
        return ((Number) d.b(null, new b(null), 1, null)).intValue();
    }

    public final boolean setPai(@NotNull HMPaiData paiInfo) {
        return ((Boolean) d.b(null, new c(paiInfo, this, null), 1, null)).booleanValue();
    }
}
