package com.huami.bluetooth.profile.channel.module;

import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.OtaResult;
import defpackage.ao;
import defpackage.c3;
import defpackage.le;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
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
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00018B\u000f\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u000f\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\fJ*\u0010\u0015\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0019\u001a\u00020\u00102\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0005R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/OtaModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "sendVersionInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "version", "", "length", "crc32", "changeLog", "", "writePresetFirmwareInfo", "(Ljava/lang/String;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPresetFirmwareInfo", "", "init", "", "queryVersion", "supportPresetFirmwareInformation", "getWritePresetFirmwareInfoResponse", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lzn;", "callback", "getOtaInfo", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lm4;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "Lkotlin/Function0;", "unZipListener", "Lkotlin/jvm/functions/Function0;", "getUnZipListener", "()Lkotlin/jvm/functions/Function0;", "setUnZipListener", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class OtaModule extends a implements CoroutineScope {
    public static final int CMD_QUERY_VERSION_CMD = 1;
    public static final int CMD_RETURN_QUERY_VERSION_CMD = 2;
    public static final int OTA_CODE_NETWORK_ERROR = 3;
    public static final int OTA_CODE_NOT_WIFI = 4;
    public static final int OTA_CODE_NO_NETWORK = 2;
    public static final int OTA_CODE_SUCCESS = 1;
    public static final int OTA_DEVICE_QUERY_NEW_FIRMWARE_VERSION = 6;
    public static final int OTA_DEVICE_RETURN_NEW_FIRMWARE_VERSION = 7;
    private static final int PRESET_FIRMWARE_INFORMATION = 9;
    private static final int PRESET_FIRMWARE_INFORMATION_RESULT = 10;

    @NotNull
    private static final String TAG = "OtaModule";
    private static final long TIMEOUT = 5000;
    private static final byte UN_ZIP_START = 5;
    public static final int VERSION_ERROR = -1;

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Nullable
    private Function0<Unit> unZipListener;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$getOtaInfo$1", f = "OtaModule.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object t;
        public int u;
        public final /* synthetic */ HMCallback<OtaResult> v;
        public final /* synthetic */ OtaModule w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMCallback<OtaResult> hMCallback, OtaModule otaModule, Continuation<? super b> continuation) {
            super(2, continuation);
            this.v = hMCallback;
            this.w = otaModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HMCallback hMCallback;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.u;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMCallback<OtaResult> hMCallback2 = this.v;
                OtaModule otaModule = this.w;
                this.t = hMCallback2;
                this.u = 1;
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
                hMCallback = (HMCallback) this.t;
                ResultKt.throwOnFailure(obj);
            }
            hMCallback.sendOnFinishMessage(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule", f = "OtaModule.kt", i = {0}, l = {151, 156}, m = "getOtaInfo", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return OtaModule.this.getOtaInfo(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$getOtaInfo$response$1", f = "OtaModule.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OtaModule.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) OtaModule.this.channels.get(Boxing.boxInt(4));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$getWritePresetFirmwareInfoResponse$1", f = "OtaModule.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ String v;
        public final /* synthetic */ long w;
        public final /* synthetic */ long x;
        public final /* synthetic */ String y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, long j, long j2, String str2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.v = str;
            this.w = j;
            this.x = j2;
            this.y = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OtaModule.this.new e(this.v, this.w, this.x, this.y, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OtaModule otaModule = OtaModule.this;
                String str = this.v;
                long j = this.w;
                long j2 = this.x;
                String str2 = this.y;
                this.t = 1;
                obj = otaModule.writePresetFirmwareInfo(str, j, j2, str2, this);
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$init$1$1", f = "OtaModule.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ OtaModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, OtaModule otaModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = otaModule;
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
                        return Unit.INSTANCE;
                    }
                    t5t.d(OtaModule.TAG, "data: " + tet.x(this.u.getData()));
                    Channel channel = (Channel) this.v.channels.get(Boxing.boxInt(ArraysKt___ArraysKt.first(this.u.getData())));
                    if (channel != null) {
                        ChannelResponse channelResponse = this.u;
                        this.t = 1;
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
                if (this.u.getData()[0] == 5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unZipListener is null: ");
                    sb.append(this.v.getUnZipListener() == null);
                    t5t.d(OtaModule.TAG, sb.toString());
                    Function0<Unit> unZipListener = this.v.getUnZipListener();
                    if (unZipListener != null) {
                        unZipListener.invoke();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public f() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            OtaModule otaModule = OtaModule.this;
            BuildersKt__Builders_commonKt.launch$default(otaModule, null, null, new a(it, otaModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements Function0<CompletableJob> {
        public static final g t = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$queryVersion$1", f = "OtaModule.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int t;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OtaModule.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int iA;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OtaModule otaModule = OtaModule.this;
                this.t = 1;
                obj = otaModule.sendVersionInfo(this);
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
            if (bArr == null || bArr.length <= 1) {
                iA = -1;
            } else {
                iA = c3.a(bArr, 1, 1);
                le.c(OtaModule.TAG, "version=" + iA, new Object[0]);
            }
            return Boxing.boxInt(iA);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule", f = "OtaModule.kt", i = {0}, l = {84, 89}, m = "sendVersionInfo", n = {"this"}, s = {"L$0"})
    public static final class i extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return OtaModule.this.sendVersionInfo(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$sendVersionInfo$response$1", f = "OtaModule.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OtaModule.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) OtaModule.this.channels.get(Boxing.boxInt(2));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$supportPresetFirmwareInformation$1", f = "OtaModule.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OtaModule.this.new k(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OtaModule otaModule = OtaModule.this;
                this.t = 1;
                obj = otaModule.sendVersionInfo(this);
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
            return Boxing.boxBoolean(bArr != null && bArr.length > 2 && c3.a(bArr, 1, 2) == 1);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule", f = "OtaModule.kt", i = {0}, l = {105, 110}, m = "writePresetFirmwareInfo", n = {"this"}, s = {"L$0"})
    public static final class l extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return OtaModule.this.writePresetFirmwareInfo(null, 0L, 0L, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.OtaModule$writePresetFirmwareInfo$response$1", f = "OtaModule.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OtaModule.this.new m(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) OtaModule.this.channels.get(Boxing.boxInt(10));
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
            return (ChannelResponse) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtaModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(g.t);
        this.channels = new LinkedHashMap();
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    private final byte[] getPresetFirmwareInfo(String version, long length, long crc32, String changeLog) throws IOException {
        le.c(TAG, "getPresetFirmwareInfo:version=" + version + ";length=" + length + ";crc32=" + crc32 + ";changeLog=" + changeLog, new Object[0]);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(9);
        if (version == null || version.length() == 0) {
            byteArrayOutputStream.write(0);
        } else {
            byte[] bytes = version.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(0);
        }
        byteArrayOutputStream.write(tet.r(length, 4));
        byteArrayOutputStream.write(tet.r(crc32, 4));
        if (changeLog == null || changeLog.length() == 0) {
            byteArrayOutputStream.write(0);
        } else {
            byte[] bytes2 = changeLog.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes2);
            byteArrayOutputStream.write(0);
        }
        byte[] result = byteArrayOutputStream.toByteArray();
        le.c(TAG, "getPresetFirmwareInfo:result=" + Arrays.toString(result), new Object[0]);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object sendVersionInfo(Continuation<? super byte[]> continuation) {
        i iVar;
        OtaModule otaModule;
        ChannelResponse channelResponse;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.w = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objSendDataWithResult$default = iVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                otaModule = (OtaModule) iVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            t5t.d(TAG, "response: " + channelResponse);
            if (channelResponse != null) {
                return channelResponse.getData();
            }
            return null;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, null, null, 7, null));
        iVar.t = this;
        iVar.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, new byte[]{1}, 0, false, iVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        otaModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        if (!zBooleanValue) {
            return null;
        }
        t5t.d(TAG, "result: " + zBooleanValue);
        j jVar = otaModule.new j(null);
        iVar.t = null;
        iVar.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(5000L, jVar, iVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        t5t.d(TAG, "response: " + channelResponse);
        if (channelResponse != null) {
            return channelResponse.getData();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object writePresetFirmwareInfo(String str, long j2, long j3, String str2, Continuation<? super Boolean> continuation) throws IOException {
        l lVar;
        OtaModule otaModule;
        byte[] data;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.w = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object objSendDataWithResult$default = lVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = lVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                otaModule = (OtaModule) lVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            t5t.d(TAG, "response: " + channelResponse);
            data = channelResponse != null ? channelResponse.getData() : null;
            if (data != null || data.length <= 1) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(c3.a(data, 1, 1) == 1);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(10), ChannelKt.Channel$default(0, null, null, 7, null));
        byte[] presetFirmwareInfo = getPresetFirmwareInfo(str, j2, j3, str2);
        lVar.t = this;
        lVar.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, presetFirmwareInfo, 0, false, lVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        otaModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        t5t.d(TAG, "result: " + zBooleanValue);
        m mVar = otaModule.new m(null);
        lVar.t = null;
        lVar.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(5000L, mVar, lVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        t5t.d(TAG, "response: " + channelResponse2);
        if (channelResponse2 != null) {
        }
        if (data != null) {
        }
        return Boxing.boxBoolean(false);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 12;
    }

    public final void getOtaInfo(@NotNull HMCallback<OtaResult> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(callback, this, null), 3, null);
    }

    @Nullable
    public final Function0<Unit> getUnZipListener() {
        return this.unZipListener;
    }

    public final boolean getWritePresetFirmwareInfoResponse(@Nullable String version, long length, long crc32, @Nullable String changeLog) {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new e(version, length, crc32, changeLog, null), 1, null)).booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new f(), 2, null);
    }

    public final int queryVersion() {
        return ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new h(null), 1, null)).intValue();
    }

    public final void setUnZipListener(@Nullable Function0<Unit> function0) {
        this.unZipListener = function0;
    }

    public final boolean supportPresetFirmwareInformation() {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new k(null), 1, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object getOtaInfo(@NotNull Continuation<? super OtaResult> continuation) {
        c cVar;
        OtaModule otaModule;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.w = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objSendDataWithResult$default = cVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                otaModule = (OtaModule) cVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            t5t.d(TAG, "response: " + channelResponse);
            return ao.a(channelResponse != null ? channelResponse.getData() : null);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, null, null, 7, null));
        cVar.t = this;
        cVar.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, new byte[]{3}, 0, false, cVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        otaModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        if (!zBooleanValue) {
            return null;
        }
        t5t.d(TAG, "result: " + zBooleanValue);
        d dVar = otaModule.new d(null);
        cVar.t = null;
        cVar.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(5000L, dVar, cVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        t5t.d(TAG, "response: " + channelResponse2);
        return ao.a(channelResponse2 != null ? channelResponse2.getData() : null);
    }
}
