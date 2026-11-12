package com.huami.bluetooth.profile.channel.module;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.dfu.OtaResult;
import com.xiaomi.hm.health.bt.profile.dfu.OtaResultKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
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
import kotlin.text.Charsets;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u000f\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u000f\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\fJ*\u0010\u0015\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0019\u001a\u00020\u00102\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0005R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R*\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u00128V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/OtaModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "version", "", SessionDescription.p, "crc32", "changeLog", "", "f", "(Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", GoogleApiAvailabilityLight.a, "", PointCategory.INIT, "", "queryVersion", "supportPresetFirmwareInformation", "getWritePresetFirmwareInfoResponse", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/profile/dfu/OtaResult;", "callback", "getOtaInfo", "Lkotlinx/coroutines/Job;", "g", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "h", "Ljava/util/Map;", "channels", "Lkotlin/Function0;", "i", "Lkotlin/jvm/functions/Function0;", "getUnZipListener", "()Lkotlin/jvm/functions/Function0;", "setUnZipListener", "(Lkotlin/jvm/functions/Function0;)V", "unZipListener", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class OtaModule extends BaseModule implements CoroutineScope {
    public static final int CMD_QUERY_VERSION_CMD = 1;
    public static final int CMD_RETURN_QUERY_VERSION_CMD = 2;
    public static final int OTA_CODE_NETWORK_ERROR = 3;
    public static final int OTA_CODE_NOT_WIFI = 4;
    public static final int OTA_CODE_NO_NETWORK = 2;
    public static final int OTA_CODE_SUCCESS = 1;
    public static final int OTA_DEVICE_QUERY_NEW_FIRMWARE_VERSION = 6;
    public static final int OTA_DEVICE_RETURN_NEW_FIRMWARE_VERSION = 7;
    public static final int VERSION_ERROR = -1;

    @NotNull
    private static final String j = "OtaModule";
    private static final long k = 5000;
    private static final byte l = 5;
    private static final int m = 9;
    private static final int n = 10;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> unZipListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$getOtaInfo$1", f = "OtaModule.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ HMCallback<OtaResult> c;
        public final /* synthetic */ OtaModule d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMCallback<OtaResult> hMCallback, OtaModule otaModule, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = hMCallback;
            this.d = otaModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HMCallback hMCallback;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMCallback<OtaResult> hMCallback2 = this.c;
                OtaModule otaModule = this.d;
                this.a = hMCallback2;
                this.b = 1;
                Object otaInfo = otaModule.getOtaInfo(this);
                if (otaInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hMCallback = hMCallback2;
                obj = otaInfo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMCallback = (HMCallback) this.a;
                ResultKt.throwOnFailure(obj);
            }
            hMCallback.sendOnFinishMessage(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule", f = "OtaModule.kt", i = {}, l = {151, 156}, m = "getOtaInfo", n = {}, s = {})
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
            return OtaModule.this.getOtaInfo(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$getOtaInfo$response$1", f = "OtaModule.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OtaModule.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) OtaModule.this.channels.get(Boxing.boxInt(4));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$getWritePresetFirmwareInfoResponse$1", f = "OtaModule.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, long j, long j2, String str2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = j;
            this.e = j2;
            this.f = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OtaModule.this.new d(this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OtaModule otaModule = OtaModule.this;
                String str = this.c;
                long j = this.d;
                long j2 = this.e;
                String str2 = this.f;
                this.a = 1;
                obj = otaModule.f(str, j, j2, str2, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$init$1$1", f = "OtaModule.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ OtaModule c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, OtaModule otaModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = otaModule;
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
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.b.getData().length == 0) {
                        return Unit.INSTANCE;
                    }
                    Debug.fi(OtaModule.j, Intrinsics.stringPlus("data: ", GattUtils.bytesToHexString(this.b.getData())));
                    Channel channel = (Channel) this.c.channels.get(Boxing.boxInt(ArraysKt___ArraysKt.first(this.b.getData())));
                    if (channel != null) {
                        ChannelResponse channelResponse = this.b;
                        this.a = 1;
                        if (channel.send(channelResponse, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (this.b.getData()[0] == 5) {
                    Debug.fi(OtaModule.j, Intrinsics.stringPlus("unZipListener is null: ", Boxing.boxBoolean(this.c.getUnZipListener() == null)));
                    Function0<Unit> unZipListener = this.c.getUnZipListener();
                    if (unZipListener != null) {
                        unZipListener.getA();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public e() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            OtaModule otaModule = OtaModule.this;
            kotlinx.coroutines.e.f(otaModule, null, null, new a(channelResponse, otaModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Job> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job getA() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$queryVersion$1", f = "OtaModule.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OtaModule.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.a;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                OtaModule otaModule = OtaModule.this;
                this.a = 1;
                obj = otaModule.e(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            byte[] bArr = (byte[]) obj;
            if (bArr == null || bArr.length <= 1) {
                i = -1;
            } else {
                i = ByteUtilsKt.toInt(bArr, 1, 1);
                HMLog.i(OtaModule.j, Intrinsics.stringPlus("version=", Boxing.boxInt(i)), new Object[0]);
            }
            return Boxing.boxInt(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule", f = "OtaModule.kt", i = {}, l = {84, 89}, m = "sendVersionInfo", n = {}, s = {})
    public static final class h extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return OtaModule.this.e(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$sendVersionInfo$response$1", f = "OtaModule.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OtaModule.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) OtaModule.this.channels.get(Boxing.boxInt(2));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$supportPresetFirmwareInformation$1", f = "OtaModule.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OtaModule.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OtaModule otaModule = OtaModule.this;
                this.a = 1;
                obj = otaModule.e(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            byte[] bArr = (byte[]) obj;
            return Boxing.boxBoolean(bArr != null && bArr.length > 2 && ByteUtilsKt.toInt(bArr, 1, 2) == 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule", f = "OtaModule.kt", i = {}, l = {105, 110}, m = "writePresetFirmwareInfo", n = {}, s = {})
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
            return OtaModule.this.f(null, 0L, 0L, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$writePresetFirmwareInfo$response$1", f = "OtaModule.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OtaModule.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) OtaModule.this.channels.get(Boxing.boxInt(10));
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
            return (ChannelResponse) obj;
        }
    }

    public OtaModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(f.a);
        this.channels = new LinkedHashMap();
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    private final byte[] d(String version, long length, long crc32, String changeLog) {
        HMLog.i(j, "getPresetFirmwareInfo:version=" + ((Object) version) + ";length=" + length + ";crc32=" + crc32 + ";changeLog=" + ((Object) changeLog), new Object[0]);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(9);
        boolean z = true;
        if (version == null || version.length() == 0) {
            byteArrayOutputStream.write(0);
        } else {
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(version, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(version.getBytes(charset));
            byteArrayOutputStream.write(0);
        }
        byteArrayOutputStream.write(GattUtils.numberToBytes(length, 4));
        byteArrayOutputStream.write(GattUtils.numberToBytes(crc32, 4));
        if (changeLog != null && changeLog.length() != 0) {
            z = false;
        }
        if (z) {
            byteArrayOutputStream.write(0);
        } else {
            Charset charset2 = Charsets.UTF_8;
            Objects.requireNonNull(changeLog, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(changeLog.getBytes(charset2));
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        HMLog.i(j, Intrinsics.stringPlus("getPresetFirmwareInfo:result=", Arrays.toString(byteArray)), new Object[0]);
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Continuation<? super byte[]> continuation) {
        h hVar;
        OtaModule otaModule;
        ChannelResponse channelResponse;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.d = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objSendDataWithResult$default = hVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = hVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                otaModule = (OtaModule) hVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            Debug.fi(j, Intrinsics.stringPlus("response: ", channelResponse));
            if (channelResponse == null) {
                return null;
            }
            return channelResponse.getData();
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, 1, null));
        hVar.a = this;
        hVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, new byte[]{1}, 0, false, hVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        otaModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        if (!zBooleanValue) {
            return null;
        }
        Debug.fi(j, Intrinsics.stringPlus("result: ", Boxing.boxBoolean(zBooleanValue)));
        i iVar = otaModule.new i(null);
        hVar.a = null;
        hVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(5000L, iVar, hVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        Debug.fi(j, Intrinsics.stringPlus("response: ", channelResponse));
        if (channelResponse == null) {
            return null;
        }
        return channelResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object f(String str, long j2, long j3, String str2, Continuation<? super Boolean> continuation) {
        k kVar;
        OtaModule otaModule;
        byte[] data;
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
        if (i3 != 0) {
            if (i3 == 1) {
                otaModule = (OtaModule) kVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            Debug.fi(j, Intrinsics.stringPlus("response: ", channelResponse));
            data = channelResponse != null ? channelResponse.getData() : null;
            if (data != null || data.length <= 1) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(ByteUtilsKt.toInt(data, 1, 1) == 1);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(10), ChannelKt.Channel$default(0, 1, null));
        byte[] bArrD = d(str, j2, j3, str2);
        kVar.a = this;
        kVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bArrD, 0, false, kVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        otaModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        Debug.fi(j, Intrinsics.stringPlus("result: ", Boxing.boxBoolean(zBooleanValue)));
        l lVar = otaModule.new l(null);
        kVar.a = null;
        kVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(5000L, lVar, kVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        Debug.fi(j, Intrinsics.stringPlus("response: ", channelResponse2));
        if (channelResponse2 != null) {
        }
        if (data != null) {
        }
        return Boxing.boxBoolean(false);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 12;
    }

    public final void getOtaInfo(@NotNull HMCallback<OtaResult> callback) {
        kotlinx.coroutines.e.f(this, null, null, new a(callback, this, null), 3, null);
    }

    @Nullable
    public final Function0<Unit> getUnZipListener() {
        return this.unZipListener;
    }

    public final boolean getWritePresetFirmwareInfoResponse(@Nullable String version, long length, long crc32, @Nullable String changeLog) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new d(version, length, crc32, changeLog, null), 1, null)).booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new e(), 2, null);
    }

    public final int queryVersion() {
        return ((Number) kotlinx.coroutines.d.b(null, new g(null), 1, null)).intValue();
    }

    public final void setUnZipListener(@Nullable Function0<Unit> function0) {
        this.unZipListener = function0;
    }

    public final boolean supportPresetFirmwareInformation() {
        return ((Boolean) kotlinx.coroutines.d.b(null, new j(null), 1, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getOtaInfo(@NotNull Continuation<? super OtaResult> continuation) {
        b bVar;
        OtaModule otaModule;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objSendDataWithResult$default = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                otaModule = (OtaModule) bVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            Debug.fi(j, Intrinsics.stringPlus("response: ", channelResponse));
            return OtaResultKt.parseOtaResult(channelResponse != null ? channelResponse.getData() : null);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, 1, null));
        bVar.a = this;
        bVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, new byte[]{3}, 0, false, bVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        otaModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        if (!zBooleanValue) {
            return null;
        }
        Debug.fi(j, Intrinsics.stringPlus("result: ", Boxing.boxBoolean(zBooleanValue)));
        c cVar = otaModule.new c(null);
        bVar.a = null;
        bVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(5000L, cVar, bVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        Debug.fi(j, Intrinsics.stringPlus("response: ", channelResponse2));
        return OtaResultKt.parseOtaResult(channelResponse2 != null ? channelResponse2.getData() : null);
    }
}
