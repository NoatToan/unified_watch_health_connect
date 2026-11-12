package com.huami.bluetooth.profile.channel.module.voice;

import com.huami.bluetooth.profile.channel.module.a;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.AlertItem;
import defpackage.ChannelResponse;
import defpackage.VoiceVersion;
import defpackage.ak;
import defpackage.c3;
import defpackage.ih;
import defpackage.pw;
import defpackage.ql;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import defpackage.z2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.IntIterator;
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
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001LB\u000f\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0005J/\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\"H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J)\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170%H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010&J\"\u0010'\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\"J\u001c\u0010'\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170%J\"\u0010(\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\"J\u001c\u0010(\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170%J\u0014\u0010\u0014\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130%J\u001c\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170%J\u001c\u0010)\u001a\u00020\u00072\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00070\"J\b\u0010*\u001a\u0004\u0018\u00010\u0011J\u0015\u0010+\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0015R$\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010/R\u0014\u00100\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u0010.R\u001c\u00102\u001a\n 1*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R)\u0010=\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0:8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010/R\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/VoiceModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "byteArray", "Lih;", "ctrlCallback", "", "parseEvent", "Ljava/nio/ByteBuffer;", "byteBuffer", "parseAlert", "value", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "parseStartSession", "parseAudioData", "data", "Lrw;", "parseVersion", "Lak;", "getLanguageSetting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setting", "", "setLanguageSetting", "(Lak;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseLanguageSetting", "parseUpdateLanguageSetting", "init", "parse", "callback", "setCallback", "Lpw;", "command", "Lkotlin/Function1;", "sendCommandSuspend", "(Lpw;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "(Lpw;Lcom/xiaomi/hm/health/bt/device/HMCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCommand", "sendCommandSync", "getVersionAsync", "getVersionSync", "getVersion", "<set-?>", "version", "I", "()I", "BUFFER_SIZE", "kotlin.jvm.PlatformType", "buffer", "Ljava/nio/ByteBuffer;", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lm4;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "getChannels", "()Ljava/util/Map;", "getModule", RnReportConst.ApiReport.PARAM_MODULE, "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class VoiceModule extends a implements CoroutineScope {
    public static final int CMD_QUERY_VERSION = 32;
    public static final int CMD_RETURN_VERSION = 33;
    private static final int EVENT_COMMAND_ALL = 1;
    private static final int EVENT_COMMAND_SINGLE = 2;
    public static final int FAILED = 1;
    public static final int LANG_MANDATORY_SIZE = 2;
    public static final int LANG_SUCCESS = 1;
    public static final long LANG_TIMEOUT = 5000;
    public static final int QUERY_LANGUAGE_SETTING = 16;
    public static final int RSP_AUDIO_DATA = 5;
    public static final int RSP_EVENT = 4;
    public static final int RSP_LANGUAGE_SETTING = 17;
    public static final int RSP_START_SESSION = 1;
    public static final int RSP_STOP_SESSION = 2;
    public static final int RSP_UPDATE_LANGUAGE_SETTINGS = 19;
    public static final int SUCCESS = 0;

    @NotNull
    public static final String TAG = "VoiceModule";
    public static final int UPDATE_LANGUAGE_SETTING = 18;
    public static final int VOICE_MODULE = 17;
    private final int BUFFER_SIZE;
    private final ByteBuffer buffer;

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    @Nullable
    private ih ctrlCallback;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;
    private int version;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$getLanguageSetting$1", f = "VoiceModule.kt", i = {}, l = {339}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object t;
        public int u;
        public final /* synthetic */ HMCallback<ak> v;
        public final /* synthetic */ VoiceModule w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMCallback<ak> hMCallback, VoiceModule voiceModule, Continuation<? super b> continuation) {
            super(2, continuation);
            this.v = hMCallback;
            this.w = voiceModule;
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
                HMCallback<ak> hMCallback2 = this.v;
                VoiceModule voiceModule = this.w;
                this.t = hMCallback2;
                this.u = 1;
                Object languageSetting = voiceModule.getLanguageSetting(this);
                if (languageSetting == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hMCallback = hMCallback2;
                obj = languageSetting;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMCallback = (HMCallback) this.t;
                ResultKt.throwOnFailure(obj);
            }
            hMCallback.onFinish(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule", f = "VoiceModule.kt", i = {0, 1}, l = {401, 406}, m = "getLanguageSetting", n = {"this", "this"}, s = {"L$0", "L$0"})
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
            return VoiceModule.this.getLanguageSetting(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$getLanguageSetting$response$1", f = "VoiceModule.kt", i = {}, l = {406}, m = "invokeSuspend", n = {}, s = {})
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
            return VoiceModule.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<ChannelResponse> channel = VoiceModule.this.getChannels().get(Boxing.boxInt(17));
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

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule", f = "VoiceModule.kt", i = {0, 1}, l = {367, 372}, m = "getVersion", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class e extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return VoiceModule.this.getVersion(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$getVersion$response$1", f = "VoiceModule.kt", i = {}, l = {372}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<ChannelResponse> channel = VoiceModule.this.getChannels().get(Boxing.boxInt(33));
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$getVersionAsync$1", f = "VoiceModule.kt", i = {}, l = {354, 355}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ Function1<VoiceVersion, Unit> v;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$getVersionAsync$1$1", f = "VoiceModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ Function1<VoiceVersion, Unit> u;
            public final /* synthetic */ VoiceVersion v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super VoiceVersion, Unit> function1, VoiceVersion voiceVersion, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = function1;
                this.v = voiceVersion;
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
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.u.invoke2(this.v);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super VoiceVersion, Unit> function1, Continuation<? super g> continuation) {
            super(2, continuation);
            this.v = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new g(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
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
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            VoiceModule voiceModule = VoiceModule.this;
            this.t = 1;
            obj = voiceModule.getVersion(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.v, (VoiceVersion) obj, null);
            this.t = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lrw;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$getVersionSync$1", f = "VoiceModule.kt", i = {}, l = {362}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VoiceVersion>, Object> {
        public int t;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super VoiceVersion> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VoiceModule voiceModule = VoiceModule.this;
                this.t = 1;
                obj = voiceModule.getVersion(this);
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
    public static final class i extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$init$1$1", f = "VoiceModule.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ VoiceModule u;
            public final /* synthetic */ int v;
            public final /* synthetic */ ChannelResponse w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(VoiceModule voiceModule, int i, ChannelResponse channelResponse, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = voiceModule;
                this.v = i;
                this.w = channelResponse;
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
                return new a(this.u, this.v, this.w, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<ChannelResponse> channel = this.u.getChannels().get(Boxing.boxInt(this.v));
                    if (channel != null) {
                        ChannelResponse channelResponse = this.w;
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
                return Unit.INSTANCE;
            }
        }

        public i() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getData().length == 0) {
                return;
            }
            if (t5t.o()) {
                t5t.m(VoiceModule.TAG, "Received data:" + tet.x(it.getData()));
            }
            byte bFirst = ArraysKt___ArraysKt.first(it.getData());
            if (bFirst != 17 && bFirst != 19 && bFirst != 33) {
                VoiceModule.this.parse(it.getData());
            } else {
                VoiceModule voiceModule = VoiceModule.this;
                BuildersKt__Builders_commonKt.launch$default(voiceModule, null, null, new a(voiceModule, bFirst, it, null), 3, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class j extends Lambda implements Function0<CompletableJob> {
        public static final j t = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$sendCommand$1", f = "VoiceModule.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ pw v;
        public final /* synthetic */ Function1<Integer, Unit> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(pw pwVar, Function1<? super Integer, Unit> function1, Continuation<? super k> continuation) {
            super(2, continuation);
            this.v = pwVar;
            this.w = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new k(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VoiceModule voiceModule = VoiceModule.this;
                pw pwVar = this.v;
                Function1<Integer, Unit> function1 = this.w;
                this.t = 1;
                if (voiceModule.sendCommandSuspend(pwVar, function1, this) == coroutine_suspended) {
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$sendCommand$2", f = "VoiceModule.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ pw v;
        public final /* synthetic */ HMCallback<Integer> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(pw pwVar, HMCallback<Integer> hMCallback, Continuation<? super l> continuation) {
            super(2, continuation);
            this.v = pwVar;
            this.w = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new l(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VoiceModule voiceModule = VoiceModule.this;
                pw pwVar = this.v;
                HMCallback<Integer> hMCallback = this.w;
                this.t = 1;
                if (voiceModule.sendCommandSuspend(pwVar, hMCallback, this) == coroutine_suspended) {
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

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule", f = "VoiceModule.kt", i = {0}, l = {288}, m = "sendCommandSuspend", n = {"callback"}, s = {"L$0"})
    public static final class m extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return VoiceModule.this.sendCommandSuspend((pw) null, (Function1<? super Integer, Unit>) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule", f = "VoiceModule.kt", i = {0}, l = {297}, m = "sendCommandSuspend", n = {"callback"}, s = {"L$0"})
    public static final class n extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return VoiceModule.this.sendCommandSuspend((pw) null, (HMCallback<Integer>) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$sendCommandSync$1", f = "VoiceModule.kt", i = {}, l = {324}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ pw v;
        public final /* synthetic */ Function1<Integer, Unit> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(pw pwVar, Function1<? super Integer, Unit> function1, Continuation<? super o> continuation) {
            super(2, continuation);
            this.v = pwVar;
            this.w = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new o(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VoiceModule voiceModule = VoiceModule.this;
                pw pwVar = this.v;
                Function1<Integer, Unit> function1 = this.w;
                this.t = 1;
                if (voiceModule.sendCommandSuspend(pwVar, function1, this) == coroutine_suspended) {
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$sendCommandSync$2", f = "VoiceModule.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ pw v;
        public final /* synthetic */ HMCallback<Integer> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(pw pwVar, HMCallback<Integer> hMCallback, Continuation<? super p> continuation) {
            super(2, continuation);
            this.v = pwVar;
            this.w = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new p(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VoiceModule voiceModule = VoiceModule.this;
                pw pwVar = this.v;
                HMCallback<Integer> hMCallback = this.w;
                this.t = 1;
                if (voiceModule.sendCommandSuspend(pwVar, hMCallback, this) == coroutine_suspended) {
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$setLanguageSetting$1", f = "VoiceModule.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object t;
        public int u;
        public final /* synthetic */ ak v;
        public final /* synthetic */ HMCallback<Integer> w;
        public final /* synthetic */ VoiceModule x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ak akVar, HMCallback<Integer> hMCallback, VoiceModule voiceModule, Continuation<? super q> continuation) {
            super(2, continuation);
            this.v = akVar;
            this.w = hMCallback;
            this.x = voiceModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new q(this.v, this.w, this.x, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IOException {
            HMCallback hMCallback;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.u;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (t5t.o()) {
                    t5t.m(VoiceModule.TAG, "LanguageSetting:" + this.v);
                }
                HMCallback<Integer> hMCallback2 = this.w;
                VoiceModule voiceModule = this.x;
                ak akVar = this.v;
                this.t = hMCallback2;
                this.u = 1;
                Object languageSetting = voiceModule.setLanguageSetting(akVar, this);
                if (languageSetting == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hMCallback = hMCallback2;
                obj = languageSetting;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMCallback = (HMCallback) this.t;
                ResultKt.throwOnFailure(obj);
            }
            hMCallback.onFinish(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule", f = "VoiceModule.kt", i = {0, 1}, l = {424, 429}, m = "setLanguageSetting", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class r extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return VoiceModule.this.setLanguageSetting((ak) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$setLanguageSetting$response$1", f = "VoiceModule.kt", i = {}, l = {429}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new s(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<ChannelResponse> channel = VoiceModule.this.getChannels().get(Boxing.boxInt(19));
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
    public VoiceModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.version = 1;
        this.BUFFER_SIZE = 1024;
        this.buffer = ByteBuffer.allocate(1024);
        this.job = LazyKt__LazyJVMKt.lazy(j.t);
        this.channels = new LinkedHashMap();
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0062  */
    private final void parseAlert(ByteBuffer byteBuffer, ih ctrlCallback) {
        Object objM886constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.Companion;
            z2.u(byteBuffer);
            if (byteBuffer.get() == 2) {
                byte b2 = byteBuffer.get();
                String strQ = z2.q(byteBuffer);
                boolean zL = z2.l(byteBuffer);
                if (ctrlCallback != null) {
                    ctrlCallback.a(new AlertItem(b2, strQ, zL));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } else {
                byte b3 = byteBuffer.get();
                int iT = z2.t(byteBuffer);
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it = RangesKt___RangesKt.until(0, iT).iterator();
                while (it.hasNext()) {
                    ((IntIterator) it).nextInt();
                    arrayList.add(new AlertItem(b3, z2.q(byteBuffer), z2.l(byteBuffer)));
                }
                if (ctrlCallback != null) {
                    ctrlCallback.a(arrayList);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            objM886constructorimpl = Result.m886constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d(TAG, "parseAlert: " + thM889exceptionOrNullimpl);
        }
    }

    private final void parseAudioData(byte[] value) {
        this.buffer.put(value, 5, value.length - 5);
        int i2 = this.buffer.get(0) & 255;
        while (this.buffer.position() > i2) {
            int i3 = i2 + 1;
            byte[] bArr = new byte[i3];
            this.buffer.flip();
            this.buffer.get(bArr);
            if (t5t.o()) {
                t5t.m(TAG, "oneFrame:" + i3 + ',' + tet.x(bArr));
            }
            ByteBuffer byteBufferSlice = this.buffer.slice();
            this.buffer.clear();
            if (byteBufferSlice.capacity() > 0) {
                this.buffer.put(byteBufferSlice);
            }
            i2 = this.buffer.get(0) & 255;
            ih ihVar = this.ctrlCallback;
            if (ihVar != null) {
                ihVar.onAudioData(bArr);
            }
        }
    }

    private final void parseEvent(byte[] byteArray, ih ctrlCallback) {
        t5t.d(TAG, "parseEvent:" + tet.x(byteArray));
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        if (byteBuffer.get() != 4) {
            t5t.d(TAG, "parseEvent cmd not match");
            return;
        }
        Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
        int iT = z2.t(byteBuffer);
        if (iT == 2) {
            parseAlert(byteBuffer, ctrlCallback);
            return;
        }
        t5t.d(TAG, "domain 不支持：" + iT);
    }

    private final ak parseLanguageSetting(byte[] data) {
        int iA;
        int iA2;
        t5t.m(TAG, "");
        if (data.length < 2) {
            return null;
        }
        char c2 = data[0];
        if (data[1] != 1 || (iA = ql.a(data, 2)) < 0) {
            return null;
        }
        String strA = ql.a(data, 2, iA - 2);
        int i2 = iA + 1;
        int i3 = iA + 2;
        int i4 = data[i2];
        t5t.m(TAG, "len:" + i4);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i5 = i4 - 1;
            if (i4 <= 0 || (iA2 = ql.a(data, i3)) < 0) {
                break;
            }
            String strA2 = ql.a(data, i3, iA2 - i3);
            if (strA2 != null) {
                arrayList.add(strA2);
            }
            i3 = iA2 + 1;
            i4 = i5;
        }
        if (strA != null) {
            return new ak(strA, arrayList);
        }
        return null;
    }

    private final VoiceConfig parseStartSession(byte[] value) {
        this.version = value[1];
        t5t.d(TAG, "version:" + this.version);
        byte b2 = value[2];
        VoiceConfig voiceConfig = new VoiceConfig(b2, value[3], this.version, null, null, 24, null);
        int i2 = 4;
        if ((b2 & 8) != 0) {
            voiceConfig.setTtsCodec(Byte.valueOf(value[4]));
            i2 = 5;
        }
        if (voiceConfig.getVersion() >= 2) {
            voiceConfig.setConfiguration(ql.b(value, i2));
        }
        return voiceConfig;
    }

    private final int parseUpdateLanguageSetting(byte[] data) {
        if (data.length >= 2) {
            return data[1];
        }
        return 0;
    }

    private final VoiceVersion parseVersion(byte[] data) {
        Object objM886constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(new VoiceVersion(data[1], c3.a(data[2]), data.length >= 4 ? c3.a(data[3]) : false));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d(TAG, "parseVersion: " + thM889exceptionOrNullimpl);
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = null;
        }
        return (VoiceVersion) objM886constructorimpl;
    }

    @NotNull
    public final Map<Integer, Channel<ChannelResponse>> getChannels() {
        return this.channels;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return getJob().plus(Dispatchers.getIO());
    }

    public final void getLanguageSetting(@NotNull HMCallback<ak> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(callback, this, null), 3, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    /* JADX INFO: renamed from: getModule */
    public int getChannelModule() {
        return 17;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void getVersionAsync(@NotNull Function1<? super VoiceVersion, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new g(callback, null), 3, null);
    }

    @Nullable
    public final VoiceVersion getVersionSync() {
        return (VoiceVersion) BuildersKt__BuildersKt.runBlocking$default(null, new h(null), 1, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getChannelModule(), false, new i(), 2, null);
    }

    public final void parse(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        t5t.d(TAG, "Parse voice packet...");
        if (this.ctrlCallback == null) {
            t5t.d(TAG, "No ctrl callback");
        }
        byte bFirst = ArraysKt___ArraysKt.first(data);
        if (bFirst == 1) {
            ih ihVar = this.ctrlCallback;
            if (ihVar != null) {
                ihVar.onStartSession(parseStartSession(data));
                return;
            }
            return;
        }
        if (bFirst == 2) {
            ih ihVar2 = this.ctrlCallback;
            if (ihVar2 != null) {
                ihVar2.onStopSession();
                return;
            }
            return;
        }
        if (bFirst == 4) {
            parseEvent(data, this.ctrlCallback);
        } else if (bFirst == 5) {
            parseAudioData(data);
        }
    }

    public final void sendCommand(@NotNull pw command, @NotNull Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new k(command, callback, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object sendCommandSuspend(@NotNull pw pwVar, @NotNull Function1<? super Integer, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws IOException {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.w = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        m mVar2 = mVar;
        Object objSendDataWithResult$default = mVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = mVar2.w;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            pwVar.a(this.version);
            if (t5t.o()) {
                t5t.m(TAG, "command:" + tet.x(pwVar.d()));
            }
            byte[] bArrD = pwVar.d();
            mVar2.t = function1;
            mVar2.w = 1;
            objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrD, 0, false, mVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) mVar2.t;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        function1.invoke2(Boxing.boxInt(!((Boolean) objSendDataWithResult$default).booleanValue() ? 1 : 0));
        return Unit.INSTANCE;
    }

    public final void sendCommandSync(@NotNull pw command, @NotNull Function1<? super Integer, Unit> callback) throws InterruptedException {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__BuildersKt.runBlocking$default(null, new o(command, callback, null), 1, null);
    }

    public final void setCallback(@NotNull ih callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.ctrlCallback = callback;
    }

    public final void setLanguageSetting(@NotNull ak setting, @NotNull HMCallback<Integer> callback) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new q(setting, callback, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object getLanguageSetting(Continuation<? super ak> continuation) {
        c cVar;
        VoiceModule voiceModule;
        ChannelResponse channelResponse;
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
                voiceModule = (VoiceModule) cVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                voiceModule = (VoiceModule) cVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                return voiceModule.parseLanguageSetting(channelResponse.getData());
            }
            t5t.d(TAG, "getLanguageSetting null");
            return null;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        t5t.d(TAG, "getLanguageSetting");
        this.channels.put(Boxing.boxInt(17), ChannelKt.Channel$default(0, null, null, 7, null));
        cVar.t = this;
        cVar.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, new byte[]{16}, 0, false, cVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        voiceModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "getLanguageSetting ret: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        d dVar = voiceModule.new d(null);
        cVar.t = voiceModule;
        cVar.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(5000L, dVar, cVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            return voiceModule.parseLanguageSetting(channelResponse.getData());
        }
        t5t.d(TAG, "getLanguageSetting null");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setLanguageSetting(ak akVar, Continuation<? super Integer> continuation) throws IOException {
        r rVar;
        VoiceModule voiceModule;
        ChannelResponse channelResponse;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i2 = rVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.w = i2 - Integer.MIN_VALUE;
            } else {
                rVar = new r(continuation);
            }
        } else {
            rVar = new r(continuation);
        }
        Object objSendDataWithResult$default = rVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = rVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                voiceModule = (VoiceModule) rVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                voiceModule = (VoiceModule) rVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                return Boxing.boxInt(voiceModule.parseUpdateLanguageSetting(channelResponse.getData()));
            }
            t5t.d(TAG, "setLanguageSetting null");
            return Boxing.boxInt(0);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        t5t.d(TAG, "setLanguageSetting");
        this.channels.put(Boxing.boxInt(19), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(18);
        byte[] bytes = akVar.getF1115a().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        rVar.t = this;
        rVar.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, byteArray, 0, false, rVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        voiceModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "setLanguageSetting ret: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        s sVar = voiceModule.new s(null);
        rVar.t = voiceModule;
        rVar.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(5000L, sVar, rVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            return Boxing.boxInt(voiceModule.parseUpdateLanguageSetting(channelResponse.getData()));
        }
        t5t.d(TAG, "setLanguageSetting null");
        return Boxing.boxInt(0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object getVersion(@NotNull Continuation<? super VoiceVersion> continuation) {
        e eVar;
        VoiceModule voiceModule;
        ChannelResponse channelResponse;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.w = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objSendDataWithResult$default = eVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = eVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                voiceModule = (VoiceModule) eVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                voiceModule = (VoiceModule) eVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                return voiceModule.parseVersion(channelResponse.getData());
            }
            t5t.d(TAG, "getVersion null");
            return null;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(33), ChannelKt.Channel$default(0, null, null, 7, null));
        eVar.t = this;
        eVar.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, new byte[]{32}, 0, false, eVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        voiceModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "getVersion ret: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        f fVar = voiceModule.new f(null);
        eVar.t = voiceModule;
        eVar.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(5000L, fVar, eVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            return voiceModule.parseVersion(channelResponse.getData());
        }
        t5t.d(TAG, "getVersion null");
        return null;
    }

    public final void sendCommand(@NotNull pw command, @NotNull HMCallback<Integer> callback) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new l(command, callback, null), 3, null);
    }

    public final void sendCommandSync(@NotNull pw command, @NotNull HMCallback<Integer> callback) throws InterruptedException {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__BuildersKt.runBlocking$default(null, new p(command, callback, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object sendCommandSuspend(@NotNull pw pwVar, @NotNull HMCallback<Integer> hMCallback, @NotNull Continuation<? super Unit> continuation) throws IOException {
        n nVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.w = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        } else {
            nVar = new n(continuation);
        }
        n nVar2 = nVar;
        Object objSendDataWithResult$default = nVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar2.w;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            pwVar.a(this.version);
            if (t5t.o()) {
                t5t.m(TAG, "command:" + tet.x(pwVar.d()));
            }
            byte[] bArrD = pwVar.d();
            nVar2.t = hMCallback;
            nVar2.w = 1;
            objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrD, 0, false, nVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hMCallback = (HMCallback) nVar2.t;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        hMCallback.onFinish(Boxing.boxInt(!((Boolean) objSendDataWithResult$default).booleanValue() ? 1 : 0));
        return Unit.INSTANCE;
    }
}
