package com.xiaomi.hm.health.bt.profile.usernew;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xmlywind.sdk.common.mta.PointCategory;
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

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u0003:\u00012B\u000f\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001b\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010&\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00168V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/usernew/UserInfoModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/profile/usernew/IUserInfoProfile;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/bt/profile/usernew/UserInfoDto;", GoogleApiAvailabilityLight.a, "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", PointCategory.INIT, "userInfoDto", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "callback", "setUserInfo", "Lcom/xiaomi/hm/health/bt/model/UserInfoExt;", "info", "getUserInfo", "Lcom/xiaomi/hm/health/bt/profile/user/LocationExt;", "location", "setLocation", "", StatEvent.EventParams.TYPE_CARD_GOAL, "setGoal", "(Lcom/xiaomi/hm/health/bt/profile/usernew/UserInfoDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Job;", "g", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "", "", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "h", "Ljava/util/Map;", "channels", "getModule", "()I", "module", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class UserInfoModule extends BaseModule implements CoroutineScope, IUserInfoProfile {
    public static final byte CMD_READ_USER_INFO = 3;
    public static final byte CMD_READ_USER_INFO_REPLY = 4;
    public static final byte CMD_WRITE_USER_INFO = 1;
    public static final int ERROR_CODE_BIRTH_PACKET_MALFORMED = 2;
    public static final byte ERROR_CODE_NONE = 1;
    public static final int ERROR_CODE_UNKNOWN = 3;
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
    private static final int i = 23;

    @NotNull
    private static final String j = "UserInfoModule";
    private static final byte k = 2;
    private static final int l = 2047;
    private static final long m = 15000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Byte, Channel<ChannelResponse>> channels;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/model/UserInfoExt;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$getUserInfo$1", f = "UserInfoModule.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserInfoExt>, Object> {
        public int a;
        public final /* synthetic */ HMDeviceSource c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceSource hMDeviceSource, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = hMDeviceSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super UserInfoExt> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoModule userInfoModule = UserInfoModule.this;
                HMDeviceSource hMDeviceSource = this.c;
                this.a = 1;
                obj = userInfoModule.d(hMDeviceSource, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return UserInfoParserKt.userInfoDto2Ext((UserInfoDto) obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule", f = "UserInfoModule.kt", i = {}, l = {146, 148}, m = "getUserInfoDto", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return UserInfoModule.this.d(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$getUserInfoDto$response$1", f = "UserInfoModule.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new c(continuation);
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
                Channel channel = (Channel) UserInfoModule.this.channels.get(Boxing.boxByte((byte) 4));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$init$1$1", f = "UserInfoModule.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ UserInfoModule c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, UserInfoModule userInfoModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = userInfoModule;
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
                    Channel channel = (Channel) this.c.channels.get(Boxing.boxByte(ArraysKt___ArraysKt.first(this.b.getData())));
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
                return Unit.INSTANCE;
            }
        }

        public d() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            UserInfoModule userInfoModule = UserInfoModule.this;
            kotlinx.coroutines.e.f(userInfoModule, null, null, new a(channelResponse, userInfoModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Job> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job getA() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$setGoal$1", f = "UserInfoModule.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            UserInfoModule userInfoModule = UserInfoModule.this;
            UserInfoDto userInfoDto = new UserInfoDto(null, null, null, null, null, Boxing.boxLong(this.c), null, null, null, null, null, 2015, null);
            this.a = 1;
            Object userInfo = userInfoModule.setUserInfo(userInfoDto, this);
            return userInfo == coroutine_suspended ? coroutine_suspended : userInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$setLocation$1", f = "UserInfoModule.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ LocationExt c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(LocationExt locationExt, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = locationExt;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new g(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            UserInfoModule userInfoModule = UserInfoModule.this;
            UserInfoDto userInfoDto = new UserInfoDto(null, null, null, null, null, null, this.c, null, null, null, null, 1983, null);
            this.a = 1;
            Object userInfo = userInfoModule.setUserInfo(userInfoDto, this);
            return userInfo == coroutine_suspended ? coroutine_suspended : userInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$setUserInfo$1", f = "UserInfoModule.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ UserInfoDto c;
        public final /* synthetic */ HMCallback<Boolean> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(UserInfoDto userInfoDto, HMCallback<Boolean> hMCallback, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = userInfoDto;
            this.d = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new h(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoModule userInfoModule = UserInfoModule.this;
                UserInfoDto userInfoDto = this.c;
                this.a = 1;
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
            this.d.sendFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$setUserInfo$2", f = "UserInfoModule.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ UserInfoExt c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(UserInfoExt userInfoExt, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = userInfoExt;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new i(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoModule userInfoModule = UserInfoModule.this;
                UserInfoDto userInfoDtoUserInfoExt2Dto = UserInfoParserKt.userInfoExt2Dto(this.c);
                this.a = 1;
                obj = userInfoModule.setUserInfo(userInfoDtoUserInfoExt2Dto, this);
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
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule", f = "UserInfoModule.kt", i = {}, l = {116, 118}, m = "setUserInfo", n = {}, s = {})
    public static final class j extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return UserInfoModule.this.setUserInfo((UserInfoDto) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.profile.usernew.UserInfoModule$setUserInfo$response$1", f = "UserInfoModule.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserInfoModule.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) UserInfoModule.this.channels.get(Boxing.boxByte((byte) 2));
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

    public UserInfoModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(e.a);
        this.channels = new LinkedHashMap();
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00df  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(HMDeviceSource hMDeviceSource, Continuation<? super UserInfoDto> continuation) {
        b bVar;
        UserInfoModule userInfoModule;
        ChannelResponse channelResponse;
        String hexString;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.e = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objSendDataWithResult$default = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                hMDeviceSource = (HMDeviceSource) bVar.b;
                userInfoModule = (UserInfoModule) bVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMDeviceSource = (HMDeviceSource) bVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                hexString = null;
            } else {
                hexString = channelResponse.toHexString();
            }
            Debug.fi(j, Intrinsics.stringPlus("getUserInfo response: ", hexString));
            if (channelResponse == null) {
                return null;
            }
            UserInfoDto userInfoDto = UserInfoParserKt.toUserInfoDto(channelResponse.getData(), hMDeviceSource);
            Debug.fi(j, Intrinsics.stringPlus("userInfoDto: ", userInfoDto));
            return userInfoDto;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Debug.fi(j, Intrinsics.stringPlus("source: ", hMDeviceSource));
        UserInfoRequest userInfoRequest = new UserInfoRequest();
        userInfoRequest.setBirth(true);
        userInfoRequest.setGender(true);
        userInfoRequest.setHeight(true);
        userInfoRequest.setWeight(true);
        userInfoRequest.setStepGoal(true);
        userInfoRequest.setLocation(true);
        userInfoRequest.setUid(true);
        userInfoRequest.setBloodPressure(true);
        userInfoRequest.setRegisterRegion(true);
        userInfoRequest.setIdc(true);
        userInfoRequest.setNickName(true);
        byte[] bleByte = userInfoRequest.toBleByte();
        if (bleByte == null) {
            return null;
        }
        Debug.fi(j, Intrinsics.stringPlus("getUserInfo bleBytes: ", GattUtils.bytesToHexString(bleByte)));
        this.channels.put(Boxing.boxByte((byte) 4), ChannelKt.Channel$default(0, 1, null));
        bVar.a = this;
        bVar.b = hMDeviceSource;
        bVar.e = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bleByte, 0, false, bVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        userInfoModule = this;
        Debug.fi(j, Intrinsics.stringPlus("getUserInfo ret: ", Boxing.boxBoolean(((Boolean) objSendDataWithResult$default).booleanValue())));
        c cVar = userInfoModule.new c(null);
        bVar.a = hMDeviceSource;
        bVar.b = null;
        bVar.e = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, cVar, bVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            hexString = null;
        } else {
            hexString = channelResponse.toHexString();
        }
        Debug.fi(j, Intrinsics.stringPlus("getUserInfo response: ", hexString));
        if (channelResponse == null) {
            return null;
        }
        UserInfoDto userInfoDto2 = UserInfoParserKt.toUserInfoDto(channelResponse.getData(), hMDeviceSource);
        Debug.fi(j, Intrinsics.stringPlus("userInfoDto: ", userInfoDto2));
        return userInfoDto2;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 23;
    }

    @Override // com.xiaomi.hm.health.bt.profile.usernew.IUserInfoProfile
    @Nullable
    public UserInfoExt getUserInfo(@Nullable HMDeviceSource source) {
        return (UserInfoExt) kotlinx.coroutines.d.b(null, new a(source, null), 1, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new d(), 2, null);
    }

    @Override // com.xiaomi.hm.health.bt.profile.usernew.IUserInfoProfile
    public boolean setGoal(int goal) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new f(goal, null), 1, null)).booleanValue();
    }

    @Override // com.xiaomi.hm.health.bt.profile.usernew.IUserInfoProfile
    public boolean setLocation(@NotNull LocationExt location) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new g(location, null), 1, null)).booleanValue();
    }

    public final void setUserInfo(@NotNull UserInfoDto userInfoDto, @NotNull HMCallback<Boolean> callback) {
        kotlinx.coroutines.e.f(this, null, null, new h(userInfoDto, callback, null), 3, null);
    }

    @Override // com.xiaomi.hm.health.bt.profile.usernew.IUserInfoProfile
    public boolean setUserInfo(@NotNull UserInfoExt info) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new i(info, null), 1, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object setUserInfo(@NotNull UserInfoDto userInfoDto, @NotNull Continuation<? super Boolean> continuation) {
        j jVar;
        UserInfoModule userInfoModule;
        ChannelResponse channelResponse;
        String hexString;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.d = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        j jVar2 = jVar;
        Object objSendDataWithResult$default = jVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = jVar2.d;
        boolean z = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            byte[] bleBytes = UserInfoParserKt.toBleBytes(userInfoDto);
            if (bleBytes == null) {
                return Boxing.boxBoolean(false);
            }
            Debug.fi(j, Intrinsics.stringPlus("setUserInfo bleBytes: ", GattUtils.bytesToHexString(bleBytes)));
            this.channels.put(Boxing.boxByte((byte) 2), ChannelKt.Channel$default(0, 1, null));
            jVar2.a = this;
            jVar2.d = 1;
            objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bleBytes, 0, false, jVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            userInfoModule = this;
        } else {
            if (i3 == 1) {
                userInfoModule = (UserInfoModule) jVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                hexString = null;
            } else {
                hexString = channelResponse.toHexString();
            }
            Debug.fi(j, Intrinsics.stringPlus("setUserInfo response: ", hexString));
            if ((channelResponse != null ? channelResponse.getData() : null) == null) {
                return Boxing.boxBoolean(false);
            }
            if (channelResponse.getData().length == 2 && channelResponse.getData()[0] == 2 && channelResponse.getData()[1] == 1) {
                z = true;
            }
            return Boxing.boxBoolean(z);
        }
        Debug.fi(j, Intrinsics.stringPlus("setUserInfo ret: ", Boxing.boxBoolean(((Boolean) objSendDataWithResult$default).booleanValue())));
        k kVar = userInfoModule.new k(null);
        jVar2.a = null;
        jVar2.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, kVar, jVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            hexString = null;
        } else {
            hexString = channelResponse.toHexString();
        }
        Debug.fi(j, Intrinsics.stringPlus("setUserInfo response: ", hexString));
        if ((channelResponse != null ? channelResponse.getData() : null) == null) {
            return Boxing.boxBoolean(false);
        }
        if (channelResponse.getData().length == 2) {
            z = true;
        }
        return Boxing.boxBoolean(z);
    }
}
