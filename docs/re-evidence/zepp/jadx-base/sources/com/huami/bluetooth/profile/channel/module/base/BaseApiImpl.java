package com.huami.bluetooth.profile.channel.module.base;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.Request.Command;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000 9*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u00019B\u000f\u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\b7\u00108J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0002J\u000f\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\nH$¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\nH$¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0004J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00052\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0004J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0006H\u0004J\"\u0010#\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0004R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*RJ\u0010/\u001a6\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u000e0,j\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000f0\u000e`-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010.R\u0016\u00103\u001a\u0002008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00106\u001a\u00020!8$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006:"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/BaseApiImpl;", "Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", Constant.h, "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", AbstractJSONTokenResponse.RESPONSE, "", "a", "", "rawData", "e", "command", "", "Lkotlinx/coroutines/channels/Channel;", "b", "initCallback$bluetooth_release", "()V", "initCallback", "parseCommand", "([B)Lcom/huami/bluetooth/profile/Request$Command;", "data", "handleCommand", "(Lcom/huami/bluetooth/profile/Request$Command;[B)V", "", "timeMillis", "sendRequest", "", "sendRequestNoResponse", "dispatchResponse", "", "code", "", "msg", "dispatchError", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "channelMap", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getTag", "()Ljava/lang/String;", "tag", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseApiImpl<T extends Request.Command> implements CoroutineScope {
    public static final long TIMEOUT = 5000;
    public static final long TIMEOUT_LONG = 15000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BaseModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy job = LazyKt__LazyJVMKt.lazy(f.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Request.Command, List<Channel<Object>>> channelMap = new HashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Dispatch no channels!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$dispatch$3", f = "BaseApiImpl.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ Ref.ObjectRef<List<Channel<Object>>> f;
        public final /* synthetic */ BaseApiImpl<T> g;
        public final /* synthetic */ Response<Object> h;
        public final /* synthetic */ Request.Command i;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Request.Command a;
            public final /* synthetic */ Channel<Object> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Request.Command command, Channel<Object> channel) {
                super(0);
                this.a = command;
                this.b = channel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Dispatch " + this.a + " channel: " + this.b.hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.ObjectRef<List<Channel<Object>>> objectRef, BaseApiImpl<T> baseApiImpl, Response<Object> response, Request.Command command, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f = objectRef;
            this.g = baseApiImpl;
            this.h = response;
            this.i = command;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f, this.g, this.h, this.i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            BaseApiImpl<T> baseApiImpl;
            Iterator it2;
            Response<Object> response;
            Request.Command command;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<Channel<Object>> list = this.f.element;
                BaseApiImpl<T> baseApiImpl2 = this.g;
                Response<Object> response2 = this.h;
                Request.Command command2 = this.i;
                baseApiImpl = baseApiImpl2;
                it2 = list.iterator();
                response = response2;
                command = command2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (Iterator) this.d;
                command = (Request.Command) this.c;
                response = (Response) this.b;
                baseApiImpl = (BaseApiImpl) this.a;
                ResultKt.throwOnFailure(obj);
            }
            while (it2.hasNext()) {
                Channel channel = (Channel) it2.next();
                HMLog.debug(baseApiImpl.getTag(), new a(command, channel));
                this.a = baseApiImpl;
                this.b = response;
                this.c = command;
                this.d = it2;
                this.e = 1;
                if (channel.send(response, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Request.Command a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Request.Command command, int i, String str) {
            super(0);
            this.a = command;
            this.b = i;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Dispatch error: " + this.a + " - " + this.b + ": " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Request.Command a;
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Request.Command command, Object obj) {
            super(0);
            this.a = command;
            this.b = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Dispatch response: " + this.a + " - " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<ChannelResponse, Unit> {
        public final /* synthetic */ BaseApiImpl<T> a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$initCallback$1$1", f = "BaseApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ BaseApiImpl<T> b;
            public final /* synthetic */ ChannelResponse c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BaseApiImpl<T> baseApiImpl, ChannelResponse channelResponse, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = baseApiImpl;
                this.c = channelResponse;
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
                this.b.e(this.c.getData());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BaseApiImpl<T> baseApiImpl) {
            super(1);
            this.a = baseApiImpl;
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            BaseApiImpl<T> baseApiImpl = this.a;
            kotlinx.coroutines.e.f(baseApiImpl, null, null, new a(baseApiImpl, channelResponse, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Job> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ T a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(T t) {
            super(0);
            this.a = t;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Handle command: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Handle command error!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Parse command error!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0000*\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/Request$Command;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$sendRequest$1", f = "BaseApiImpl.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<T>>, Object> {
        public Object a;
        public Object b;
        public int c;
        private /* synthetic */ Object d;
        public final /* synthetic */ BaseApiImpl<T> e;
        public final /* synthetic */ long f;
        public final /* synthetic */ Request.Command g;
        public final /* synthetic */ byte[] h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0000*\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/Request$Command;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Request.Command a;
            public final /* synthetic */ Channel<Response<T>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Request.Command command, Channel<Response<T>> channel) {
                super(0);
                this.a = command;
                this.b = channel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Add " + this.a + StringUtil.SPACE + this.b.hashCode();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0000*\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/Request$Command;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$sendRequest$1$3", f = "BaseApiImpl.kt", i = {}, l = {62, 64}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<T>>, Object> {
            public int a;
            public final /* synthetic */ BaseApiImpl<T> b;
            public final /* synthetic */ Request.Command c;
            public final /* synthetic */ byte[] d;
            public final /* synthetic */ Channel<Response<T>> e;
            public final /* synthetic */ Ref.ObjectRef<List<Channel<Object>>> f;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0000*\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/Request$Command;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Request.Command a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Request.Command command) {
                    super(0);
                    this.a = command;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Wait " + this.a + " response...";
                }
            }

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$j$b$b, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0000*\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/Request$Command;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0323b extends Lambda implements Function0<String> {
                public final /* synthetic */ Request.Command a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0323b(Request.Command command) {
                    super(0);
                    this.a = command;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Send " + this.a + " failed!";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(BaseApiImpl<T> baseApiImpl, Request.Command command, byte[] bArr, Channel<Response<T>> channel, Ref.ObjectRef<List<Channel<Object>>> objectRef, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = baseApiImpl;
                this.c = command;
                this.d = bArr;
                this.e = channel;
                this.f = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<T>> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    return (Response) obj;
                }
                ResultKt.throwOnFailure(obj);
                BaseModule baseModule = ((BaseApiImpl) this.b).module;
                byte[] bArr = new Request(this.c, this.d).getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                this.a = 1;
                obj = BaseModule.sendDataWithResult$default(baseModule, bArr, 0, false, this, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) obj).booleanValue()) {
                    this.f.element.remove(this.e);
                    HMLog.error$default(this.b.getTag(), null, null, new C0323b(this.c), 6, null);
                    return new com.huami.bluetooth.profile.channel.module.assistant.response.Failure("Send failed!", 0, 2, null);
                }
                HMLog.info(this.b.getTag(), new a(this.c));
                Channel<Response<T>> channel = this.e;
                this.a = 2;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (Response) obj;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0000*\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/Request$Command;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ Request.Command a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Request.Command command) {
                super(0);
                this.a = command;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Send " + this.a + " timeout!";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(BaseApiImpl<T> baseApiImpl, long j, Request.Command command, byte[] bArr, Continuation<? super j> continuation) {
            super(2, continuation);
            this.e = baseApiImpl;
            this.f = j;
            this.g = command;
            this.h = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            j jVar = new j(this.e, this.f, this.g, this.h, continuation);
            jVar.d = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<T>> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Channel channelChannel$default;
            Object objWithTimeoutOrNull;
            Ref.ObjectRef objectRef;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.d;
                channelChannel$default = ChannelKt.Channel$default(0, 1, null);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                HashMap map = ((BaseApiImpl) this.e).channelMap;
                BaseApiImpl<T> baseApiImpl = this.e;
                Request.Command command = this.g;
                synchronized (map) {
                    ?? B = baseApiImpl.b(command);
                    objectRef2.element = B;
                    Boxing.boxBoolean(((List) B).add(channelChannel$default));
                }
                HMLog.info(this.e.getTag(), new a(this.g, channelChannel$default));
                long j = this.f;
                b bVar = new b(this.e, this.g, this.h, channelChannel$default, objectRef2, null);
                this.d = coroutineScope;
                this.a = channelChannel$default;
                this.b = objectRef2;
                this.c = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, bVar, this);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.b;
                Channel channel = (Channel) this.a;
                ResultKt.throwOnFailure(obj);
                channelChannel$default = channel;
                objWithTimeoutOrNull = obj;
            }
            Response response = (Response) objWithTimeoutOrNull;
            if (response != null) {
                return response;
            }
            BaseApiImpl<T> baseApiImpl2 = this.e;
            Request.Command command2 = this.g;
            ((List) objectRef.element).remove(channelChannel$default);
            HMLog.error$default(baseApiImpl2.getTag(), null, null, new c(command2), 6, null);
            return new com.huami.bluetooth.profile.channel.module.assistant.response.Timeout(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$sendRequestNoResponse$1", f = "BaseApiImpl.kt", i = {0}, l = {79}, m = "invokeSuspend", n = {"$this$runBlocking"}, s = {"L$0"})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ long c;
        public final /* synthetic */ BaseApiImpl<T> d;
        public final /* synthetic */ Request.Command e;
        public final /* synthetic */ byte[] f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$sendRequestNoResponse$1$1", f = "BaseApiImpl.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
            public int a;
            public final /* synthetic */ BaseApiImpl<T> b;
            public final /* synthetic */ Request.Command c;
            public final /* synthetic */ byte[] d;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.base.BaseApiImpl$k$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0324a extends Lambda implements Function0<String> {
                public final /* synthetic */ Request.Command a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0324a(Request.Command command) {
                    super(0);
                    this.a = command;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Send " + this.a + " success!";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ Request.Command a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Request.Command command) {
                    super(0);
                    this.a = command;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Send " + this.a + " failed!";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BaseApiImpl<T> baseApiImpl, Request.Command command, byte[] bArr, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = baseApiImpl;
                this.c = command;
                this.d = bArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BaseModule baseModule = ((BaseApiImpl) this.b).module;
                    byte[] bArr = new Request(this.c, this.d).getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String();
                    this.a = 1;
                    obj = BaseModule.sendDataWithResult$default(baseModule, bArr, 0, false, this, 6, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    HMLog.info(this.b.getTag(), new C0324a(this.c));
                    return new com.huami.bluetooth.profile.channel.module.assistant.response.Success(Boxing.boxBoolean(true));
                }
                HMLog.error$default(this.b.getTag(), null, null, new b(this.c), 6, null);
                return new com.huami.bluetooth.profile.channel.module.assistant.response.Failure("Send failed!", 0, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/Request$Command;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Request.Command a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Request.Command command) {
                super(0);
                this.a = command;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Send " + this.a + " timeout!";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j, BaseApiImpl<T> baseApiImpl, Request.Command command, byte[] bArr, Continuation<? super k> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = baseApiImpl;
            this.e = command;
            this.f = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            k kVar = new k(this.c, this.d, this.e, this.f, continuation);
            kVar.b = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                long j = this.c;
                a aVar = new a(this.d, this.e, this.f, null);
                this.b = coroutineScope;
                this.a = 1;
                obj = TimeoutKt.withTimeoutOrNull(j, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            if (response != null) {
                return response;
            }
            HMLog.error$default(this.d.getTag(), null, null, new b(this.e), 6, null);
            return new com.huami.bluetooth.profile.channel.module.assistant.response.Timeout(null, 1, null);
        }
    }

    public BaseApiImpl(@NotNull BaseModule baseModule) {
        this.module = baseModule;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.util.ArrayList] */
    private final void a(Request.Command cmd, Response<Object> response) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.channelMap) {
            List<Channel<Object>> list = this.channelMap.get(cmd);
            if (list != null) {
                if (!(!list.isEmpty())) {
                    list = null;
                }
                if (list != null) {
                    objectRef.element = new ArrayList(list);
                    list.clear();
                }
            }
        }
        if (objectRef.element == 0) {
            HMLog.warn$default(getTag(), null, a.a, 2, null);
        } else {
            kotlinx.coroutines.e.f(this, null, null, new b(objectRef, this, response, cmd, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Channel<Object>> b(Request.Command command) {
        List<Channel<Object>> list = this.channelMap.get(command);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.channelMap.put(command, arrayList);
        return arrayList;
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    public static /* synthetic */ void dispatchError$default(BaseApiImpl baseApiImpl, Request.Command command, int i2, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchError");
        }
        if ((i3 & 4) != 0) {
            str = "";
        }
        baseApiImpl.dispatchError(command, i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(byte[] rawData) {
        try {
            Request.Command command = parseCommand(rawData);
            if (command == null) {
                return;
            }
            byte[] bArrCopyOfRange = command.getLength() < rawData.length ? ArraysKt___ArraysJvmKt.copyOfRange(rawData, command.getLength(), rawData.length) : new byte[0];
            try {
                HMLog.info(getTag(), new g(command));
                handleCommand(command, bArrCopyOfRange);
            } catch (Exception e2) {
                HMLog.error$default(getTag(), null, e2, h.a, 2, null);
            }
        } catch (Exception e3) {
            HMLog.error$default(getTag(), null, e3, i.a, 2, null);
        }
    }

    public static /* synthetic */ Response sendRequest$default(BaseApiImpl baseApiImpl, Request.Command command, byte[] bArr, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendRequest");
        }
        if ((i2 & 2) != 0) {
            bArr = null;
        }
        if ((i2 & 4) != 0) {
            j2 = 5000;
        }
        return baseApiImpl.sendRequest(command, bArr, j2);
    }

    public static /* synthetic */ Response sendRequestNoResponse$default(BaseApiImpl baseApiImpl, Request.Command command, byte[] bArr, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendRequestNoResponse");
        }
        if ((i2 & 2) != 0) {
            bArr = null;
        }
        if ((i2 & 4) != 0) {
            j2 = 5000;
        }
        return baseApiImpl.sendRequestNoResponse(command, bArr, j2);
    }

    public final void dispatchError(@NotNull Request.Command cmd, int code, @NotNull String msg) {
        HMLog.info(getTag(), new c(cmd, code, msg));
        a(cmd, Response.INSTANCE.fail(msg, code));
    }

    public final void dispatchResponse(@NotNull Request.Command cmd, @NotNull Object data) {
        HMLog.info(getTag(), new d(cmd, data));
        a(cmd, Response.INSTANCE.success(data));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    @NotNull
    public abstract String getTag();

    public abstract void handleCommand(@NotNull T cmd, @NotNull byte[] data);

    public final void initCallback$bluetooth_release() {
        BaseModule baseModule = this.module;
        BaseModule.registerCallback$default(baseModule, baseModule.getModule(), false, new e(this), 2, null);
    }

    @Nullable
    public abstract T parseCommand(@NotNull byte[] rawData);

    @NotNull
    public final <T> Response<T> sendRequest(@NotNull Request.Command cmd, @Nullable byte[] data, long timeMillis) {
        return (Response) BuildersKt.runBlocking(getCoroutineContext(), new j(this, timeMillis, cmd, data, null));
    }

    @NotNull
    public final Response<Boolean> sendRequestNoResponse(@NotNull Request.Command cmd, @Nullable byte[] data, long timeMillis) {
        return (Response) BuildersKt.runBlocking(getCoroutineContext(), new k(timeMillis, this, cmd, data, null));
    }
}
