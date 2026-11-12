package com.huami.bluetooth.profile.channel.module.media;

import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.AudioControl;
import defpackage.ChannelResponse;
import defpackage.ImageFormat;
import defpackage.RequestAudio;
import defpackage.RequestImage;
import defpackage.fzs;
import defpackage.j6s;
import defpackage.pi;
import defpackage.r3;
import defpackage.rp;
import defpackage.t5t;
import defpackage.tet;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00014B\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\fJ#\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005¢\u0006\u0004\b\u000e\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0015\u0010\u001bJ#\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0019\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/MediaModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "data", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "callback", "", "sendCommand", "([BLcom/xiaomi/hm/health/bt/device/HMCallback;)V", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrp;", "queryImageFormat", "Lkj;", "(Lrp;Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "Lpi;", "setCallback", "(Lpi;)V", "Lfzs;", "sendAudioData", "(Lfzs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj6s;", "exception", "sendException", "(Lj6s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lfzs;Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "(Lj6s;Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lm4;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class MediaModule extends com.huami.bluetooth.profile.channel.module.a implements CoroutineScope {
    public static final int FAILED = 1;
    public static final int MEDIA_MODULE = 4;

    @NotNull
    public static final String MODULE_COMMAND = "MediaModule command:";

    @NotNull
    public static final String MODULE_RESPONSE = "MediaModule response:";
    public static final int SUCCESS = 0;
    public static final long TIMEOUT = 5000;

    @NotNull
    private final r3 channelController;

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Nullable
    private pi mediaCallback;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.media.MediaModule$a$a, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.media.MediaModule$1$1", f = "MediaModule.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0281a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ MediaModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0281a(ChannelResponse channelResponse, MediaModule mediaModule, Continuation<? super C0281a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = mediaModule;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0281a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0281a(this.u, this.v, continuation);
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
                    if (t5t.o()) {
                        t5t.m(com.huami.bluetooth.profile.channel.module.a.TAG, MediaModule.MODULE_RESPONSE + tet.x(this.u.getData()));
                    }
                    byte bFirst = ArraysKt___ArraysKt.first(this.u.getData());
                    if (bFirst == 2) {
                        Channel channel = (Channel) this.v.channels.get(Boxing.boxInt(ArraysKt___ArraysKt.first(this.u.getData())));
                        if (channel != null) {
                            ChannelResponse channelResponse = this.u;
                            this.t = 1;
                            if (channel.send(channelResponse, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (bFirst == 3) {
                        RequestImage requestImageA = RequestImage.d.a(this.u.getData());
                        pi piVar = this.v.mediaCallback;
                        if (piVar != null) {
                            piVar.a(requestImageA);
                        }
                    } else if (bFirst == 4) {
                        RequestAudio requestAudioA = RequestAudio.f.a(this.u.getData());
                        pi piVar2 = this.v.mediaCallback;
                        if (piVar2 != null) {
                            piVar2.a(requestAudioA);
                        }
                    } else if (bFirst == 6) {
                        AudioControl audioControlA = AudioControl.c.a(this.u.getData());
                        pi piVar3 = this.v.mediaCallback;
                        if (piVar3 != null) {
                            piVar3.a(audioControlA);
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

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MediaModule mediaModule = MediaModule.this;
            BuildersKt__Builders_commonKt.launch$default(mediaModule, null, null, new C0281a(it, mediaModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<CompletableJob> {
        public static final c t = new c();

        public c() {
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.media.MediaModule$queryImageFormat$1", f = "MediaModule.kt", i = {}, l = {81, 85}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ MediaModule u;
        public final /* synthetic */ HMCallback<ImageFormat> v;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.media.MediaModule$queryImageFormat$1$response$1", f = "MediaModule.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
            public int t;
            public final /* synthetic */ MediaModule u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MediaModule mediaModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = mediaModule;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
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
                    Channel channel = (Channel) this.u.channels.get(Boxing.boxInt(2));
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
        public d(rp rpVar, MediaModule mediaModule, HMCallback<ImageFormat> hMCallback, Continuation<? super d> continuation) {
            super(2, continuation);
            this.u = mediaModule;
            this.v = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(null, this.u, this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                throw null;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                a aVar = new a(this.u, null);
                this.t = 2;
                obj = TimeoutKt.withTimeoutOrNull(5000L, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ChannelResponse channelResponse = (ChannelResponse) obj;
            if (channelResponse == null) {
                return Unit.INSTANCE;
            }
            this.v.onFinish(rp.f32761a.a(channelResponse.getData()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.media.MediaModule$sendCommand$1", f = "MediaModule.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object t;
        public int u;
        public final /* synthetic */ HMCallback<Integer> v;
        public final /* synthetic */ MediaModule w;
        public final /* synthetic */ byte[] x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMCallback<Integer> hMCallback, MediaModule mediaModule, byte[] bArr, Continuation<? super e> continuation) {
            super(2, continuation);
            this.v = hMCallback;
            this.w = mediaModule;
            this.x = bArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.v, this.w, this.x, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HMCallback<Integer> hMCallback;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.u;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMCallback<Integer> hMCallback2 = this.v;
                MediaModule mediaModule = this.w;
                byte[] bArr = this.x;
                this.t = hMCallback2;
                this.u = 1;
                Object objSendCommand = mediaModule.sendCommand(bArr, this);
                if (objSendCommand == coroutine_suspended) {
                    return coroutine_suspended;
                }
                hMCallback = hMCallback2;
                obj = objSendCommand;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMCallback = (HMCallback) this.t;
                ResultKt.throwOnFailure(obj);
            }
            hMCallback.onFinish(Boxing.boxInt(!((Boolean) obj).booleanValue() ? 1 : 0));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.channelController = channelController;
        this.job = LazyKt__LazyJVMKt.lazy(c.t);
        this.channels = new LinkedHashMap();
        com.huami.bluetooth.profile.channel.module.a.registerCallback$default(this, 4, false, new a(), 2, null);
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    private final void sendCommand(byte[] data, HMCallback<Integer> callback) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new e(callback, this, data, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 4;
    }

    public final void queryImageFormat(@NotNull rp queryImageFormat, @NotNull HMCallback<ImageFormat> callback) {
        Intrinsics.checkNotNullParameter(queryImageFormat, "queryImageFormat");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(queryImageFormat, this, callback, null), 3, null);
    }

    @Nullable
    public final Object sendAudioData(@NotNull fzs fzsVar, @NotNull Continuation<? super Boolean> continuation) {
        throw null;
    }

    @Nullable
    public final Object sendException(@NotNull j6s j6sVar, @NotNull Continuation<? super Boolean> continuation) {
        throw null;
    }

    public final void setCallback(@NotNull pi callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mediaCallback = callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendCommand(byte[] bArr, Continuation<? super Boolean> continuation) {
        if (t5t.o()) {
            t5t.m(com.huami.bluetooth.profile.channel.module.a.TAG, MODULE_COMMAND + tet.x(bArr));
        }
        return com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(this, bArr, 0, false, continuation, 6, null);
    }

    public final void sendAudioData(@NotNull fzs data, @NotNull HMCallback<Integer> callback) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callback, "callback");
        throw null;
    }

    public final void sendException(@NotNull j6s exception, @NotNull HMCallback<Integer> callback) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(callback, "callback");
        throw null;
    }
}
