package com.huami.bluetooth.profile.channel.module.voice;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.ModuleUtilsKt;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.huami.bluetooth.profile.channel.module.voice.command.VoiceCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.VoiceVersion;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.infra.galaxy.fds.Common;
import com.xmlywind.sdk.common.mta.PointCategory;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
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
import kotlinx.coroutines.BuildersKt;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB\u000f\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0005J/\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\"H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J)\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170%H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010&J\"\u0010'\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\"J\u001c\u0010'\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170%J\"\u0010(\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\"J\u001c\u0010(\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170%J\u0014\u0010)\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130%J\u001c\u0010*\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170%J\u001c\u0010+\u001a\u00020\u00072\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00070\"J\b\u0010,\u001a\u0004\u0018\u00010\u0011J\u0015\u0010-\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010\u0015R$\u00101\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b-\u00100R\u0016\u00102\u001a\u00020\u00178\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u001e\u00105\u001a\n 3*\u0004\u0018\u00010\t0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u001d\u0010:\u001a\u0002068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u00109R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010;R+\u0010B\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0<8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00178V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u00100R\u0016\u0010H\u001a\u00020E8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/VoiceModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "", "byteArray", "Lcom/huami/bluetooth/profile/channel/module/voice/ICtrlCallback;", "ctrlCallback", "", "g", "Ljava/nio/ByteBuffer;", "byteBuffer", "e", "value", "Lcom/huami/bluetooth/profile/channel/module/voice/VoiceConfig;", "i", "f", "data", "Lcom/huami/bluetooth/profile/channel/module/voice/content/VoiceVersion;", hl.k, "Lcom/huami/bluetooth/profile/channel/module/voice/LanguageSetting;", GoogleApiAvailabilityLight.a, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setting", "", "l", "(Lcom/huami/bluetooth/profile/channel/module/voice/LanguageSetting;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", z.j, PointCategory.INIT, "parse", "callback", "setCallback", "Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;", "command", "Lkotlin/Function1;", "sendCommandSuspend", "(Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "(Lcom/huami/bluetooth/profile/channel/module/voice/command/VoiceCommand;Lcom/xiaomi/hm/health/bt/device/HMCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendCommand", "sendCommandSync", "getLanguageSetting", "setLanguageSetting", "getVersionAsync", "getVersionSync", "getVersion", "<set-?>", LogUtil.I, "()I", "version", "BUFFER_SIZE", "kotlin.jvm.PlatformType", "Ljava/nio/ByteBuffer;", "buffer", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "Lcom/huami/bluetooth/profile/channel/module/voice/ICtrlCallback;", "", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "Ljava/util/Map;", "getChannels", "()Ljava/util/Map;", "channels", "getModule", "module", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class VoiceModule extends BaseModule implements CoroutineScope {
    public static final int CMD_QUERY_VERSION = 32;
    public static final int CMD_RETURN_VERSION = 33;
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
    private static final int m = 1;
    private static final int n = 2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int version;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int BUFFER_SIZE;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final ByteBuffer buffer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private ICtrlCallback ctrlCallback;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$getLanguageSetting$1", f = "VoiceModule.kt", i = {}, l = {FTPCodes.NEED_ACCOUNT}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ HMCallback<LanguageSetting> c;
        public final /* synthetic */ VoiceModule d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMCallback<LanguageSetting> hMCallback, VoiceModule voiceModule, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = hMCallback;
            this.d = voiceModule;
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
                HMCallback<LanguageSetting> hMCallback2 = this.c;
                VoiceModule voiceModule = this.d;
                this.a = hMCallback2;
                this.b = 1;
                Object objD = voiceModule.d(this);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hMCallback = hMCallback2;
                obj = objD;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMCallback = (HMCallback) this.a;
                ResultKt.throwOnFailure(obj);
            }
            hMCallback.onFinish(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule", f = "VoiceModule.kt", i = {}, l = {386, 391}, m = "getLanguageSetting", n = {}, s = {})
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
            return VoiceModule.this.d(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$getLanguageSetting$response$1", f = "VoiceModule.kt", i = {}, l = {391}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new c(continuation);
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
                Channel<ChannelResponse> channel = VoiceModule.this.getChannels().get(Boxing.boxInt(17));
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule", f = "VoiceModule.kt", i = {}, l = {360, 365}, m = "getVersion", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return VoiceModule.this.getVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$getVersion$response$1", f = "VoiceModule.kt", i = {}, l = {365}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<ChannelResponse> channel = VoiceModule.this.getChannels().get(Boxing.boxInt(33));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$getVersionAsync$1", f = "VoiceModule.kt", i = {}, l = {SportDeviceUtils.SOURCE_PROVENCE_W, 348}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<VoiceVersion, Unit> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$getVersionAsync$1$1", f = "VoiceModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function1<VoiceVersion, Unit> b;
            public final /* synthetic */ VoiceVersion c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super VoiceVersion, Unit> function1, VoiceVersion voiceVersion, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function1;
                this.c = voiceVersion;
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
                this.b.invoke(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super VoiceVersion, Unit> function1, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
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
            this.a = 1;
            obj = voiceModule.getVersion(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.c, (VoiceVersion) obj, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/VoiceVersion;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$getVersionSync$1", f = "VoiceModule.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VoiceVersion>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super VoiceVersion> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VoiceModule voiceModule = VoiceModule.this;
                this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$init$1$1", f = "VoiceModule.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ VoiceModule b;
            public final /* synthetic */ int c;
            public final /* synthetic */ ChannelResponse d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(VoiceModule voiceModule, int i, ChannelResponse channelResponse, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = voiceModule;
                this.c = i;
                this.d = channelResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
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
                    Channel<ChannelResponse> channel = this.b.getChannels().get(Boxing.boxInt(this.c));
                    if (channel != null) {
                        ChannelResponse channelResponse = this.d;
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
                return Unit.INSTANCE;
            }
        }

        public h() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            if (channelResponse.getData().length == 0) {
                return;
            }
            if (Debug.isEnabled()) {
                Debug.i(VoiceModule.TAG, Intrinsics.stringPlus("Received data:", GattUtils.bytesToHexString(channelResponse.getData())));
            }
            byte bFirst = ArraysKt___ArraysKt.first(channelResponse.getData());
            if (bFirst != 17 && bFirst != 19 && bFirst != 33) {
                VoiceModule.this.parse(channelResponse.getData());
            } else {
                VoiceModule voiceModule = VoiceModule.this;
                kotlinx.coroutines.e.f(voiceModule, null, null, new a(voiceModule, bFirst, channelResponse, null), 3, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Job> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$sendCommand$1", f = "VoiceModule.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ VoiceCommand c;
        public final /* synthetic */ Function1<Integer, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(VoiceCommand voiceCommand, Function1<? super Integer, Unit> function1, Continuation<? super j> continuation) {
            super(2, continuation);
            this.c = voiceCommand;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new j(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VoiceModule voiceModule = VoiceModule.this;
                VoiceCommand voiceCommand = this.c;
                Function1<Integer, Unit> function1 = this.d;
                this.a = 1;
                if (voiceModule.sendCommandSuspend(voiceCommand, function1, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$sendCommand$2", f = "VoiceModule.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ VoiceCommand c;
        public final /* synthetic */ HMCallback<Integer> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(VoiceCommand voiceCommand, HMCallback<Integer> hMCallback, Continuation<? super k> continuation) {
            super(2, continuation);
            this.c = voiceCommand;
            this.d = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new k(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VoiceModule voiceModule = VoiceModule.this;
                VoiceCommand voiceCommand = this.c;
                HMCallback<Integer> hMCallback = this.d;
                this.a = 1;
                if (voiceModule.sendCommandSuspend(voiceCommand, hMCallback, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule", f = "VoiceModule.kt", i = {0}, l = {282}, m = "sendCommandSuspend", n = {"callback"}, s = {"L$0"})
    public static final class l extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return VoiceModule.this.sendCommandSuspend((VoiceCommand) null, (Function1<? super Integer, Unit>) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule", f = "VoiceModule.kt", i = {0}, l = {290}, m = "sendCommandSuspend", n = {"callback"}, s = {"L$0"})
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
            return VoiceModule.this.sendCommandSuspend((VoiceCommand) null, (HMCallback<Integer>) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$sendCommandSync$1", f = "VoiceModule.kt", i = {}, l = {TypedValues.AttributesType.TYPE_EASING}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ VoiceCommand c;
        public final /* synthetic */ Function1<Integer, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(VoiceCommand voiceCommand, Function1<? super Integer, Unit> function1, Continuation<? super n> continuation) {
            super(2, continuation);
            this.c = voiceCommand;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new n(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VoiceModule voiceModule = VoiceModule.this;
                VoiceCommand voiceCommand = this.c;
                Function1<Integer, Unit> function1 = this.d;
                this.a = 1;
                if (voiceModule.sendCommandSuspend(voiceCommand, function1, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$sendCommandSync$2", f = "VoiceModule.kt", i = {}, l = {SportDeviceUtils.SOURCE_VERONA}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ VoiceCommand c;
        public final /* synthetic */ HMCallback<Integer> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(VoiceCommand voiceCommand, HMCallback<Integer> hMCallback, Continuation<? super o> continuation) {
            super(2, continuation);
            this.c = voiceCommand;
            this.d = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new o(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VoiceModule voiceModule = VoiceModule.this;
                VoiceCommand voiceCommand = this.c;
                HMCallback<Integer> hMCallback = this.d;
                this.a = 1;
                if (voiceModule.sendCommandSuspend(voiceCommand, hMCallback, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$setLanguageSetting$1", f = "VoiceModule.kt", i = {}, l = {341}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ LanguageSetting c;
        public final /* synthetic */ HMCallback<Integer> d;
        public final /* synthetic */ VoiceModule e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(LanguageSetting languageSetting, HMCallback<Integer> hMCallback, VoiceModule voiceModule, Continuation<? super p> continuation) {
            super(2, continuation);
            this.c = languageSetting;
            this.d = hMCallback;
            this.e = voiceModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new p(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HMCallback hMCallback;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (Debug.isEnabled()) {
                    Debug.i(VoiceModule.TAG, Intrinsics.stringPlus("LanguageSetting:", this.c));
                }
                HMCallback<Integer> hMCallback2 = this.d;
                VoiceModule voiceModule = this.e;
                LanguageSetting languageSetting = this.c;
                this.a = hMCallback2;
                this.b = 1;
                Object objL = voiceModule.l(languageSetting, this);
                if (objL == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hMCallback = hMCallback2;
                obj = objL;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMCallback = (HMCallback) this.a;
                ResultKt.throwOnFailure(obj);
            }
            hMCallback.onFinish(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule", f = "VoiceModule.kt", i = {}, l = {Common.HTTP_STATUS_CONFLICT, 414}, m = "setLanguageSetting", n = {}, s = {})
    public static final class q extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return VoiceModule.this.l(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.voice.VoiceModule$setLanguageSetting$response$1", f = "VoiceModule.kt", i = {}, l = {414}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceModule.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<ChannelResponse> channel = VoiceModule.this.getChannels().get(Boxing.boxInt(19));
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

    public VoiceModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.version = 1;
        this.BUFFER_SIZE = 1024;
        this.buffer = ByteBuffer.allocate(1024);
        this.job = LazyKt__LazyJVMKt.lazy(i.a);
        this.channels = new LinkedHashMap();
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Continuation<? super LanguageSetting> continuation) {
        b bVar;
        VoiceModule voiceModule;
        VoiceModule voiceModule2;
        ChannelResponse channelResponse;
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
                voiceModule = (VoiceModule) bVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                voiceModule2 = (VoiceModule) bVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                return voiceModule2.h(channelResponse.getData());
            }
            Debug.fi(TAG, "getLanguageSetting null");
            return null;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Debug.fi(TAG, "getLanguageSetting");
        getChannels().put(Boxing.boxInt(17), ChannelKt.Channel$default(0, 1, null));
        bVar.a = this;
        bVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, new byte[]{16}, 0, false, bVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        voiceModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(TAG, Intrinsics.stringPlus("getLanguageSetting ret: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        c cVar = voiceModule.new c(null);
        bVar.a = voiceModule;
        bVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(5000L, cVar, bVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        voiceModule2 = voiceModule;
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            return voiceModule2.h(channelResponse.getData());
        }
        Debug.fi(TAG, "getLanguageSetting null");
        return null;
    }

    private final void e(ByteBuffer byteBuffer, ICtrlCallback ctrlCallback) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            ByteBufferExtendsKt.getUInt32(byteBuffer);
            Unit unit = null;
            if (byteBuffer.get() == 2) {
                byte b2 = byteBuffer.get();
                String string = ByteBufferExtendsKt.getString(byteBuffer);
                boolean z = ByteBufferExtendsKt.getBoolean(byteBuffer);
                if (ctrlCallback != null) {
                    ctrlCallback.onAlertChanged(new AlertItem(b2, string, z));
                    unit = Unit.INSTANCE;
                }
            } else {
                byte b3 = byteBuffer.get();
                int uInt16 = ByteBufferExtendsKt.getUInt16(byteBuffer);
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it2 = kotlin.ranges.e.until(0, uInt16).iterator();
                while (it2.hasNext()) {
                    ((IntIterator) it2).nextInt();
                    arrayList.add(new AlertItem(b3, ByteBufferExtendsKt.getString(byteBuffer), ByteBufferExtendsKt.getBoolean(byteBuffer)));
                }
                if (ctrlCallback != null) {
                    ctrlCallback.onAlertReceived(arrayList);
                    unit = Unit.INSTANCE;
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(TAG, Intrinsics.stringPlus("parseAlert: ", thM3848exceptionOrNullimpl));
        }
    }

    private final void f(byte[] value) {
        this.buffer.put(value, 5, value.length - 5);
        int i2 = this.buffer.get(0) & 255;
        while (this.buffer.position() > i2) {
            int i3 = i2 + 1;
            byte[] bArr = new byte[i3];
            this.buffer.flip();
            this.buffer.get(bArr);
            if (Debug.isEnabled()) {
                Debug.i(TAG, "oneFrame:" + i3 + ',' + ((Object) GattUtils.bytesToHexString(bArr)));
            }
            ByteBuffer byteBufferSlice = this.buffer.slice();
            this.buffer.clear();
            if (byteBufferSlice.capacity() > 0) {
                this.buffer.put(byteBufferSlice);
            }
            i2 = this.buffer.get(0) & 255;
            ICtrlCallback iCtrlCallback = this.ctrlCallback;
            if (iCtrlCallback != null) {
                iCtrlCallback.onAudioData(bArr);
            }
        }
    }

    private final void g(byte[] byteArray, ICtrlCallback ctrlCallback) {
        Debug.fi(TAG, Intrinsics.stringPlus("parseEvent:", GattUtils.bytesToHexString(byteArray)));
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArray);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        if (byteBufferWrap.get() != 4) {
            Debug.fi(TAG, "parseEvent cmd not match");
            return;
        }
        int uInt16 = ByteBufferExtendsKt.getUInt16(byteBufferWrap);
        if (uInt16 == 2) {
            e(byteBufferWrap, ctrlCallback);
        } else {
            Debug.fi(TAG, Intrinsics.stringPlus("domain 不支持：", Integer.valueOf(uInt16)));
        }
    }

    private final LanguageSetting h(byte[] data) {
        int iFindStringEndFlag;
        int iFindStringEndFlag2;
        Debug.i(TAG, "");
        if (data.length < 2) {
            return null;
        }
        char c2 = data[0];
        if (data[1] != 1 || (iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(data, 2)) < 0) {
            return null;
        }
        String strSliceString = ModuleUtilsKt.sliceString(data, 2, iFindStringEndFlag - 2);
        int i2 = iFindStringEndFlag + 1;
        int i3 = i2 + 1;
        int i4 = data[i2];
        Debug.i(TAG, Intrinsics.stringPlus("len:", Integer.valueOf(i4)));
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i5 = i4 - 1;
            if (i4 <= 0 || (iFindStringEndFlag2 = ModuleUtilsKt.findStringEndFlag(data, i3)) < 0) {
                break;
            }
            String strSliceString2 = ModuleUtilsKt.sliceString(data, i3, iFindStringEndFlag2 - i3);
            if (strSliceString2 != null) {
                arrayList.add(strSliceString2);
            }
            i3 = iFindStringEndFlag2 + 1;
            i4 = i5;
        }
        if (strSliceString == null) {
            return null;
        }
        return new LanguageSetting(strSliceString, arrayList);
    }

    private final VoiceConfig i(byte[] value) {
        byte b2 = value[1];
        this.version = b2;
        Debug.fi(TAG, Intrinsics.stringPlus("version:", Integer.valueOf(b2)));
        byte b3 = value[2];
        VoiceConfig voiceConfig = new VoiceConfig(b3, value[3], this.version, null, null, 24, null);
        int i2 = 4;
        if ((b3 & 8) != 0) {
            voiceConfig.setTtsCodec(Byte.valueOf(value[4]));
            i2 = 5;
        }
        if (voiceConfig.getVersion() >= 2) {
            voiceConfig.setConfiguration(ModuleUtilsKt.sliceString(value, i2));
        }
        return voiceConfig;
    }

    private final int j(byte[] data) {
        if (data.length >= 2) {
            return data[1];
        }
        return 0;
    }

    private final VoiceVersion k(byte[] data) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new VoiceVersion(data[1], ByteUtilsKt.toBoolean(data[2])));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(TAG, Intrinsics.stringPlus("parseVersion: ", thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (VoiceVersion) objM3845constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(LanguageSetting languageSetting, Continuation<? super Integer> continuation) {
        q qVar;
        VoiceModule voiceModule;
        ChannelResponse channelResponse;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i2 = qVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.d = i2 - Integer.MIN_VALUE;
            } else {
                qVar = new q(continuation);
            }
        } else {
            qVar = new q(continuation);
        }
        Object objSendDataWithResult$default = qVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = qVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                voiceModule = (VoiceModule) qVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                voiceModule = (VoiceModule) qVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                return Boxing.boxInt(voiceModule.j(channelResponse.getData()));
            }
            Debug.fi(TAG, "setLanguageSetting null");
            return Boxing.boxInt(0);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Debug.fi(TAG, "setLanguageSetting");
        getChannels().put(Boxing.boxInt(19), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(18);
        String str = languageSetting.getCom.huami.account.UserLegalInfoManager.KEY_LANGUAGE java.lang.String();
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        qVar.a = this;
        qVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, byteArray, 0, false, qVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        voiceModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(TAG, Intrinsics.stringPlus("setLanguageSetting ret: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        r rVar = voiceModule.new r(null);
        qVar.a = voiceModule;
        qVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(5000L, rVar, qVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            return Boxing.boxInt(voiceModule.j(channelResponse.getData()));
        }
        Debug.fi(TAG, "setLanguageSetting null");
        return Boxing.boxInt(0);
    }

    @NotNull
    public final Map<Integer, Channel<ChannelResponse>> getChannels() {
        return this.channels;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    public final void getLanguageSetting(@NotNull HMCallback<LanguageSetting> callback) {
        kotlinx.coroutines.e.f(this, null, null, new a(callback, this, null), 3, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    /* JADX INFO: renamed from: getModule */
    public int getChannelModule() {
        return 17;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void getVersionAsync(@NotNull Function1<? super VoiceVersion, Unit> callback) {
        kotlinx.coroutines.e.f(this, null, null, new f(callback, null), 3, null);
    }

    @Nullable
    public final VoiceVersion getVersionSync() {
        return (VoiceVersion) kotlinx.coroutines.d.b(null, new g(null), 1, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getChannelModule(), false, new h(), 2, null);
    }

    public final void parse(@NotNull byte[] data) {
        Debug.fi(TAG, "Parse voice packet...");
        if (this.ctrlCallback == null) {
            Debug.fi(TAG, "No ctrl callback");
        }
        byte bFirst = ArraysKt___ArraysKt.first(data);
        if (bFirst == 1) {
            ICtrlCallback iCtrlCallback = this.ctrlCallback;
            if (iCtrlCallback == null) {
                return;
            }
            iCtrlCallback.onStartSession(i(data));
            return;
        }
        if (bFirst == 2) {
            ICtrlCallback iCtrlCallback2 = this.ctrlCallback;
            if (iCtrlCallback2 == null) {
                return;
            }
            iCtrlCallback2.onStopSession();
            return;
        }
        if (bFirst == 4) {
            g(data, this.ctrlCallback);
        } else if (bFirst == 5) {
            f(data);
        }
    }

    public final void sendCommand(@NotNull VoiceCommand command, @NotNull Function1<? super Integer, Unit> callback) {
        kotlinx.coroutines.e.f(this, null, null, new j(command, callback, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendCommandSuspend(@NotNull VoiceCommand voiceCommand, @NotNull Function1<? super Integer, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        l lVar;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.d = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        l lVar2 = lVar;
        Object objSendDataWithResult$default = lVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = lVar2.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            voiceCommand.setVersion(getVersion());
            if (Debug.isEnabled()) {
                Debug.i(TAG, Intrinsics.stringPlus("command:", GattUtils.bytesToHexString(voiceCommand.toByteArray())));
            }
            byte[] byteArray = voiceCommand.toByteArray();
            lVar2.a = function1;
            lVar2.d = 1;
            objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, byteArray, 0, false, lVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) lVar2.a;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        function1.invoke(Boxing.boxInt(!((Boolean) objSendDataWithResult$default).booleanValue() ? 1 : 0));
        return Unit.INSTANCE;
    }

    public final void sendCommandSync(@NotNull VoiceCommand command, @NotNull Function1<? super Integer, Unit> callback) {
        kotlinx.coroutines.d.b(null, new n(command, callback, null), 1, null);
    }

    public final void setCallback(@NotNull ICtrlCallback callback) {
        this.ctrlCallback = callback;
    }

    public final void setLanguageSetting(@NotNull LanguageSetting setting, @NotNull HMCallback<Integer> callback) {
        kotlinx.coroutines.e.f(this, null, null, new p(setting, callback, this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getVersion(@NotNull Continuation<? super VoiceVersion> continuation) {
        d dVar;
        VoiceModule voiceModule;
        VoiceModule voiceModule2;
        ChannelResponse channelResponse;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objSendDataWithResult$default = dVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                voiceModule = (VoiceModule) dVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                voiceModule2 = (VoiceModule) dVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                return voiceModule2.k(channelResponse.getData());
            }
            Debug.fi(TAG, "getVersion null");
            return null;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        getChannels().put(Boxing.boxInt(33), ChannelKt.Channel$default(0, 1, null));
        dVar.a = this;
        dVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, new byte[]{32}, 0, false, dVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        voiceModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(TAG, Intrinsics.stringPlus("getVersion ret: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        e eVar = voiceModule.new e(null);
        dVar.a = voiceModule;
        dVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(5000L, eVar, dVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        voiceModule2 = voiceModule;
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            return voiceModule2.k(channelResponse.getData());
        }
        Debug.fi(TAG, "getVersion null");
        return null;
    }

    public final void sendCommand(@NotNull VoiceCommand command, @NotNull HMCallback<Integer> callback) {
        kotlinx.coroutines.e.f(this, null, null, new k(command, callback, null), 3, null);
    }

    public final void sendCommandSync(@NotNull VoiceCommand command, @NotNull HMCallback<Integer> callback) throws InterruptedException {
        kotlinx.coroutines.d.b(null, new o(command, callback, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendCommandSuspend(@NotNull VoiceCommand voiceCommand, @NotNull HMCallback<Integer> hMCallback, @NotNull Continuation<? super Unit> continuation) {
        m mVar;
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
        m mVar2 = mVar;
        Object objSendDataWithResult$default = mVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar2.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            if (Debug.isEnabled()) {
                Debug.i(TAG, Intrinsics.stringPlus("command:", GattUtils.bytesToHexString(voiceCommand.toByteArray())));
            }
            byte[] byteArray = voiceCommand.toByteArray();
            mVar2.a = hMCallback;
            mVar2.d = 1;
            objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, byteArray, 0, false, mVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hMCallback = (HMCallback) mVar2.a;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        hMCallback.onFinish(Boxing.boxInt(!((Boolean) objSendDataWithResult$default).booleanValue() ? 1 : 0));
        return Unit.INSTANCE;
    }
}
