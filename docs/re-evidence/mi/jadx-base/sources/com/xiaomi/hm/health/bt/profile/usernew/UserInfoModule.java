package com.xiaomi.hm.health.bt.profile.usernew;

import com.huami.bluetooth.profile.channel.module.a;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.UserInfoDto;
import defpackage.cj;
import defpackage.kk;
import defpackage.qd;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import defpackage.tv;
import defpackage.uv;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u00012B\u000f\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001b\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010$\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/usernew/UserInfoModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "Lcj;", "Lqd;", "source", "Lrv;", "getUserInfoDto", "(Lqd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "init", "userInfoDto", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "callback", "setUserInfo", "Lcom/xiaomi/hm/health/bt/model/UserInfoExt;", "info", "getUserInfo", "Lkk;", "location", "setLocation", "", FitnessPersistKey.Rainbow, "setGoal", "(Lrv;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "", "Lkotlinx/coroutines/channels/Channel;", "Lm4;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class UserInfoModule extends a implements CoroutineScope, cj {
    public static final byte CMD_READ_USER_INFO = 3;
    public static final byte CMD_READ_USER_INFO_REPLY = 4;
    public static final byte CMD_WRITE_USER_INFO = 1;
    private static final byte CMD_WRITE_USER_INFO_REPLY = 2;
    public static final int ERROR_CODE_BIRTH_PACKET_MALFORMED = 2;
    public static final byte ERROR_CODE_NONE = 1;
    public static final int ERROR_CODE_UNKNOWN = 3;
    private static final int FLAG_ALL = 2047;
    public static final int FLAG_BIRTH = 1;
    public static final int FLAG_BLOOD_PRESSURE = 128;
    public static final int FLAG_GENDER = 2;
    public static final int FLAG_HEIGHT = 4;
    public static final int FLAG_IDC = 512;
    public static final int FLAG_NICKNAME = 1024;
    public static final int FLAG_REGISTER_REGION = 256;
    public static final int FLAG_SENSOR_LOCATION = 32;
    public static final int FLAG_STEP_GOAL = 16;
    public static final int FLAG_UID = 64;
    public static final int FLAG_WEIGHT = 8;

    @NotNull
    private static final String TAG = "UserInfoModule";
    private static final long TIMEOUT = 15000;
    private static final int USER_INFO_MODULE = 23;

    @NotNull
    private final Map<Byte, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/model/UserInfoExt;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$getUserInfo$1", f = "UserInfoModule.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserInfoExt>, Object> {
        public int t;
        public final /* synthetic */ qd v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qd qdVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.v = qdVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super UserInfoExt> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new b(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoModule userInfoModule = UserInfoModule.this;
                qd qdVar = this.v;
                this.t = 1;
                obj = userInfoModule.getUserInfoDto(qdVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return tv.c((UserInfoDto) obj);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule", f = "UserInfoModule.kt", i = {0, 0, 1}, l = {146, 148}, m = "getUserInfoDto", n = {"this", "source", "source"}, s = {"L$0", "L$1", "L$0"})
    public static final class c extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return UserInfoModule.this.getUserInfoDto(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$getUserInfoDto$response$1", f = "UserInfoModule.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
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
            return UserInfoModule.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) UserInfoModule.this.channels.get(Boxing.boxByte((byte) 4));
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$init$1$1", f = "UserInfoModule.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ UserInfoModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, UserInfoModule userInfoModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = userInfoModule;
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
                    Channel channel = (Channel) this.v.channels.get(Boxing.boxByte(ArraysKt___ArraysKt.first(this.u.getData())));
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
                return Unit.INSTANCE;
            }
        }

        public e() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            UserInfoModule userInfoModule = UserInfoModule.this;
            BuildersKt__Builders_commonKt.launch$default(userInfoModule, null, null, new a(it, userInfoModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function0<CompletableJob> {
        public static final f t = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$setGoal$1", f = "UserInfoModule.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, Continuation<? super g> continuation) {
            super(2, continuation);
            this.v = i;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new g(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            UserInfoModule userInfoModule = UserInfoModule.this;
            UserInfoDto userInfoDto = new UserInfoDto(null, null, null, null, null, Boxing.boxLong(this.v), null, null, null, null, null, 2015, null);
            this.t = 1;
            Object userInfo = userInfoModule.setUserInfo(userInfoDto, this);
            return userInfo == coroutine_suspended ? coroutine_suspended : userInfo;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$setLocation$1", f = "UserInfoModule.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ kk v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(kk kkVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.v = kkVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new h(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            UserInfoModule userInfoModule = UserInfoModule.this;
            UserInfoDto userInfoDto = new UserInfoDto(null, null, null, null, null, null, this.v, null, null, null, null, 1983, null);
            this.t = 1;
            Object userInfo = userInfoModule.setUserInfo(userInfoDto, this);
            return userInfo == coroutine_suspended ? coroutine_suspended : userInfo;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$setUserInfo$1", f = "UserInfoModule.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ UserInfoDto v;
        public final /* synthetic */ HMCallback<Boolean> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(UserInfoDto userInfoDto, HMCallback<Boolean> hMCallback, Continuation<? super i> continuation) {
            super(2, continuation);
            this.v = userInfoDto;
            this.w = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new i(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoModule userInfoModule = UserInfoModule.this;
                UserInfoDto userInfoDto = this.v;
                this.t = 1;
                obj = userInfoModule.setUserInfo(userInfoDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.w.sendFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$setUserInfo$2", f = "UserInfoModule.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ UserInfoExt v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(UserInfoExt userInfoExt, Continuation<? super j> continuation) {
            super(2, continuation);
            this.v = userInfoExt;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new j(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoModule userInfoModule = UserInfoModule.this;
                UserInfoDto userInfoDtoA = tv.a(this.v);
                this.t = 1;
                obj = userInfoModule.setUserInfo(userInfoDtoA, this);
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

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule", f = "UserInfoModule.kt", i = {0}, l = {116, 118}, m = "setUserInfo", n = {"this"}, s = {"L$0"})
    public static final class k extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return UserInfoModule.this.setUserInfo((UserInfoDto) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$setUserInfo$response$1", f = "UserInfoModule.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new l(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) UserInfoModule.this.channels.get(Boxing.boxByte((byte) 2));
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
    public UserInfoModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(f.t);
        this.channels = new LinkedHashMap();
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0106  */
    /* JADX WARN: Code duplicated, block: B:29:0x010b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x0119, please report this as an issue */
    public final Object getUserInfoDto(qd qdVar, Continuation<? super UserInfoDto> continuation) {
        c cVar;
        UserInfoModule userInfoModule;
        ChannelResponse channelResponse;
        String strD;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.x = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objSendDataWithResult$default = cVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cVar.x;
        if (i3 != 0) {
            if (i3 == 1) {
                qdVar = (qd) cVar.u;
                userInfoModule = (UserInfoModule) cVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qdVar = (qd) cVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            StringBuilder sb = new StringBuilder();
            sb.append("getUserInfo response: ");
            if (channelResponse != null) {
                strD = channelResponse.d();
            } else {
                strD = null;
            }
            sb.append(strD);
            t5t.d(TAG, sb.toString());
            if (channelResponse == null) {
                return null;
            }
            UserInfoDto userInfoDtoA = tv.a(channelResponse.getData(), qdVar);
            t5t.d(TAG, "userInfoDto: " + userInfoDtoA);
            return userInfoDtoA;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        t5t.d(TAG, "source: " + qdVar);
        uv uvVar = new uv();
        uvVar.a(true);
        uvVar.c(true);
        uvVar.d(true);
        uvVar.k(true);
        uvVar.i(true);
        uvVar.f(true);
        uvVar.j(true);
        uvVar.b(true);
        uvVar.h(true);
        uvVar.e(true);
        uvVar.g(true);
        byte[] bArrA = uvVar.a();
        if (bArrA == null) {
            return null;
        }
        t5t.d(TAG, "getUserInfo bleBytes: " + tet.x(bArrA));
        this.channels.put(Boxing.boxByte((byte) 4), ChannelKt.Channel$default(0, null, null, 7, null));
        cVar.t = this;
        cVar.u = qdVar;
        cVar.x = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrA, 0, false, cVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        userInfoModule = this;
        t5t.d(TAG, "getUserInfo ret: " + ((Boolean) objSendDataWithResult$default).booleanValue());
        d dVar = userInfoModule.new d(null);
        cVar.t = qdVar;
        cVar.u = null;
        cVar.x = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, dVar, cVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getUserInfo response: ");
        if (channelResponse != null) {
            strD = channelResponse.d();
        } else {
            strD = null;
        }
        sb2.append(strD);
        t5t.d(TAG, sb2.toString());
        if (channelResponse == null) {
            return null;
        }
        UserInfoDto userInfoDtoA2 = tv.a(channelResponse.getData(), qdVar);
        t5t.d(TAG, "userInfoDto: " + userInfoDtoA2);
        return userInfoDtoA2;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 23;
    }

    @Override // defpackage.cj
    @Nullable
    public UserInfoExt getUserInfo(@Nullable qd source) {
        return (UserInfoExt) BuildersKt__BuildersKt.runBlocking$default(null, new b(source, null), 1, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new e(), 2, null);
    }

    @Override // defpackage.cj
    public boolean setGoal(int goal) {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new g(goal, null), 1, null)).booleanValue();
    }

    @Override // defpackage.cj
    public boolean setLocation(@NotNull kk location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new h(location, null), 1, null)).booleanValue();
    }

    public final void setUserInfo(@NotNull UserInfoDto userInfoDto, @NotNull HMCallback<Boolean> callback) {
        Intrinsics.checkNotNullParameter(userInfoDto, "userInfoDto");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new i(userInfoDto, callback, null), 3, null);
    }

    @Override // defpackage.cj
    public boolean setUserInfo(@NotNull UserInfoExt info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new j(info, null), 1, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object setUserInfo(@NotNull UserInfoDto userInfoDto, @NotNull Continuation<? super Boolean> continuation) {
        k kVar;
        UserInfoModule userInfoModule;
        ChannelResponse channelResponse;
        String strD;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.w = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        k kVar2 = kVar;
        Object objSendDataWithResult$default = kVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = kVar2.w;
        boolean z = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            byte[] bArrB = tv.b(userInfoDto);
            if (bArrB == null) {
                return Boxing.boxBoolean(false);
            }
            t5t.d(TAG, "setUserInfo bleBytes: " + tet.x(bArrB));
            this.channels.put(Boxing.boxByte((byte) 2), ChannelKt.Channel$default(0, null, null, 7, null));
            kVar2.t = this;
            kVar2.w = 1;
            objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrB, 0, false, kVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            userInfoModule = this;
        } else {
            if (i3 == 1) {
                userInfoModule = (UserInfoModule) kVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            StringBuilder sb = new StringBuilder();
            sb.append("setUserInfo response: ");
            if (channelResponse != null) {
                strD = channelResponse.d();
            } else {
                strD = null;
            }
            sb.append(strD);
            t5t.d(TAG, sb.toString());
            if ((channelResponse != null ? channelResponse.getData() : null) == null) {
                return Boxing.boxBoolean(false);
            }
            if (channelResponse.getData().length == 2 && channelResponse.getData()[0] == 2 && channelResponse.getData()[1] == 1) {
                z = true;
            }
            return Boxing.boxBoolean(z);
        }
        t5t.d(TAG, "setUserInfo ret: " + ((Boolean) objSendDataWithResult$default).booleanValue());
        l lVar = userInfoModule.new l(null);
        kVar2.t = null;
        kVar2.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, lVar, kVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setUserInfo response: ");
        if (channelResponse != null) {
            strD = channelResponse.d();
        } else {
            strD = null;
        }
        sb2.append(strD);
        t5t.d(TAG, sb2.toString());
        if ((channelResponse != null ? channelResponse.getData() : null) == null) {
            return Boxing.boxBoolean(false);
        }
        if (channelResponse.getData().length == 2) {
            z = true;
        }
        return Boxing.boxBoolean(z);
    }
}
