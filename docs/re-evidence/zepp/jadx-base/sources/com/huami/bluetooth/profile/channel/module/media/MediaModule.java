package com.huami.bluetooth.profile.channel.module.media;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import io.flutter.plugins.firebase.crashlytics.Constants;
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
import kotlin.coroutines.jvm.internal.Boxing;
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
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b3\u00104J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010J\u001b\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00122\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u001c\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R(\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/MediaModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "", "data", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "callback", "", "e", "", GoogleApiAvailabilityLight.a, "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/media/QueryImageFormat;", "queryImageFormat", "Lcom/huami/bluetooth/profile/channel/module/media/ImageFormat;", "Lcom/huami/bluetooth/profile/channel/module/media/IMediaCallback;", "setCallback", "Lcom/huami/bluetooth/profile/channel/module/media/AudioData;", "sendAudioData", "(Lcom/huami/bluetooth/profile/channel/module/media/AudioData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/media/MediaException;", Constants.EXCEPTION, "sendException", "(Lcom/huami/bluetooth/profile/channel/module/media/MediaException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "g", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "Lkotlinx/coroutines/Job;", "h", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "i", "Ljava/util/Map;", "channels", z.j, "Lcom/huami/bluetooth/profile/channel/module/media/IMediaCallback;", "mediaCallback", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", "module", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MediaModule extends BaseModule implements CoroutineScope {
    public static final int FAILED = 1;
    public static final int MEDIA_MODULE = 4;

    @NotNull
    public static final String MODULE_COMMAND = "MediaModule command:";

    @NotNull
    public static final String MODULE_RESPONSE = "MediaModule response:";
    public static final int SUCCESS = 0;
    public static final long TIMEOUT = 5000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ChannelApi channelController;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private IMediaCallback mediaCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.media.MediaModule$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.media.MediaModule$1$1", f = "MediaModule.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0329a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ MediaModule c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0329a(ChannelResponse channelResponse, MediaModule mediaModule, Continuation<? super C0329a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = mediaModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0329a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0329a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    if (Debug.isEnabled()) {
                        Debug.i(BaseModule.TAG, Intrinsics.stringPlus(MediaModule.MODULE_RESPONSE, GattUtils.bytesToHexString(this.b.getData())));
                    }
                    byte bFirst = ArraysKt___ArraysKt.first(this.b.getData());
                    if (bFirst == 2) {
                        Channel channel = (Channel) this.c.channels.get(Boxing.boxInt(ArraysKt___ArraysKt.first(this.b.getData())));
                        if (channel != null) {
                            ChannelResponse channelResponse = this.b;
                            this.a = 1;
                            if (channel.send(channelResponse, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (bFirst == 3) {
                        RequestImage requestImageFromBytes = RequestImage.INSTANCE.fromBytes(this.b.getData());
                        IMediaCallback iMediaCallback = this.c.mediaCallback;
                        if (iMediaCallback != null) {
                            iMediaCallback.onRequestImage(requestImageFromBytes);
                        }
                    } else if (bFirst == 4) {
                        RequestAudio requestAudioFromBytes = RequestAudio.INSTANCE.fromBytes(this.b.getData());
                        IMediaCallback iMediaCallback2 = this.c.mediaCallback;
                        if (iMediaCallback2 != null) {
                            iMediaCallback2.onRequestAudio(requestAudioFromBytes);
                        }
                    } else if (bFirst == 6) {
                        AudioControl audioControlFromBytes = AudioControl.INSTANCE.fromBytes(this.b.getData());
                        IMediaCallback iMediaCallback3 = this.c.mediaCallback;
                        if (iMediaCallback3 != null) {
                            iMediaCallback3.onAudioControl(audioControlFromBytes);
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

        public final void a(@NotNull ChannelResponse channelResponse) {
            MediaModule mediaModule = MediaModule.this;
            e.f(mediaModule, null, null, new C0329a(channelResponse, mediaModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Job> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job getA() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.media.MediaModule$queryImageFormat$1", f = "MediaModule.kt", i = {}, l = {81, 85}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ QueryImageFormat b;
        public final /* synthetic */ MediaModule c;
        public final /* synthetic */ HMCallback<ImageFormat> d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.media.MediaModule$queryImageFormat$1$response$1", f = "MediaModule.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
            public int a;
            public final /* synthetic */ MediaModule b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MediaModule mediaModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = mediaModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = (Channel) this.b.channels.get(Boxing.boxInt(2));
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(QueryImageFormat queryImageFormat, MediaModule mediaModule, HMCallback<ImageFormat> hMCallback, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = queryImageFormat;
            this.c = mediaModule;
            this.d = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006e  */
        /* JADX WARN: Code duplicated, block: B:27:0x0071  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ChannelResponse channelResponse;
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
                channelResponse = (ChannelResponse) obj;
                if (channelResponse == null) {
                    return Unit.INSTANCE;
                }
                this.d.onFinish(QueryImageFormat.INSTANCE.fromBytes(channelResponse.getData()));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            byte[] bytes = this.b.getBytes();
            if (Debug.isEnabled()) {
                Debug.i(BaseModule.TAG, Intrinsics.stringPlus(MediaModule.MODULE_COMMAND, GattUtils.bytesToHexString(bytes)));
            }
            MediaModule mediaModule = this.c;
            this.a = 1;
            obj = BaseModule.sendDataWithResult$default(mediaModule, bytes, 0, false, this, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            a aVar = new a(this.c, null);
            this.a = 2;
            obj = TimeoutKt.withTimeoutOrNull(5000L, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            channelResponse = (ChannelResponse) obj;
            if (channelResponse == null) {
                return Unit.INSTANCE;
            }
            this.d.onFinish(QueryImageFormat.INSTANCE.fromBytes(channelResponse.getData()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.media.MediaModule$sendCommand$1", f = "MediaModule.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ HMCallback<Integer> c;
        public final /* synthetic */ MediaModule d;
        public final /* synthetic */ byte[] e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMCallback<Integer> hMCallback, MediaModule mediaModule, byte[] bArr, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = hMCallback;
            this.d = mediaModule;
            this.e = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HMCallback<Integer> hMCallback;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMCallback<Integer> hMCallback2 = this.c;
                MediaModule mediaModule = this.d;
                byte[] bArr = this.e;
                this.a = hMCallback2;
                this.b = 1;
                Object objD = mediaModule.d(bArr, this);
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
            hMCallback.onFinish(Boxing.boxInt(!((Boolean) obj).booleanValue() ? 1 : 0));
            return Unit.INSTANCE;
        }
    }

    public MediaModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.channelController = channelApi;
        this.job = LazyKt__LazyJVMKt.lazy(b.a);
        this.channels = new LinkedHashMap();
        BaseModule.registerCallback$default(this, 4, false, new a(), 2, null);
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(byte[] bArr, Continuation<? super Boolean> continuation) {
        if (Debug.isEnabled()) {
            Debug.i(BaseModule.TAG, Intrinsics.stringPlus(MODULE_COMMAND, GattUtils.bytesToHexString(bArr)));
        }
        return BaseModule.sendDataWithResult$default(this, bArr, 0, false, continuation, 6, null);
    }

    private final void e(byte[] data, HMCallback<Integer> callback) {
        e.f(this, null, null, new d(callback, this, data, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 4;
    }

    public final void queryImageFormat(@NotNull QueryImageFormat queryImageFormat, @NotNull HMCallback<ImageFormat> callback) {
        e.f(this, null, null, new c(queryImageFormat, this, callback, null), 3, null);
    }

    @Nullable
    public final Object sendAudioData(@NotNull AudioData audioData, @NotNull Continuation<? super Boolean> continuation) {
        return d(audioData.getBytes(), continuation);
    }

    @Nullable
    public final Object sendException(@NotNull MediaException mediaException, @NotNull Continuation<? super Boolean> continuation) {
        return d(mediaException.getBytes(), continuation);
    }

    public final void setCallback(@NotNull IMediaCallback callback) {
        this.mediaCallback = callback;
    }

    public final void sendAudioData(@NotNull AudioData data, @NotNull HMCallback<Integer> callback) {
        e(data.getBytes(), callback);
    }

    public final void sendException(@NotNull MediaException exception, @NotNull HMCallback<Integer> callback) {
        e(exception.getBytes(), callback);
    }
}
