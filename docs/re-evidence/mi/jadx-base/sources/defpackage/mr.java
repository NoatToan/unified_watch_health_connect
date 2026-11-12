package defpackage;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleModule;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleStatus;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\rH\u0016J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016J/\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0014\u0018\u00010\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u001d\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010 \u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u001cJ'\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001cJ!\u0010'\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001cJ#\u0010+\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b+\u0010,R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0005\u00100R\u001b\u00105\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b\u0007\u00104\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lmr;", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "", "data", "", PluginDeviceInfo.FMODEL, "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", PluginDeviceInfo.FDESC, "Le6;", "callback", LoginPreferenceConfig.TYPE_REGISTER, "", "moduleId", "Lkr;", "", "enableSchedule", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lnr;", "queryProtocolVersion", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryDataChanged", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestCacheVersion", "", "ids", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "queryData", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "addOrUpdate", "(Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "delete", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sourceList", "deleteBySource", "items", "syncDataToDevice", "clearDataChangedStatus", "", "msg", "errorCode", "onError", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Lsp;", "queryResultAction$delegate", "Lkotlin/Lazy;", "()Lsp;", "queryResultAction", "Llv;", "updateDeleteResultAction$delegate", "()Llv;", "updateDeleteResultAction", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleModule;", "model", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleModule;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class mr implements ScheduleApi {

    @NotNull
    public static final b D = new b(null);

    @NotNull
    public final HashMap<lr, Channel<Response<ScheduleVersion>>> A;

    @NotNull
    public final HashMap<lr, Channel<Response<List<ScheduleStatus>>>> B;

    @NotNull
    public final HashMap<lr, Channel<Response<Boolean>>> C;

    @NotNull
    public final ScheduleModule t;

    @NotNull
    public final Lazy u;

    @NotNull
    public final Lazy v;

    @Nullable
    public kr w;

    @Nullable
    public e6 x;

    @Nullable
    public volatile ScheduleVersion y;

    @NotNull
    public final HashMap<lr, Channel<Response<List<ScheduleModel>>>> z;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$1", f = "ScheduleImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<byte[], Continuation<? super Unit>, Object> {
        public int t;
        public /* synthetic */ Object u;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull byte[] bArr, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(bArr, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = mr.this.new a(continuation);
            aVar.u = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            byte[] bArr = (byte[]) this.u;
            if (bArr.length == 0) {
                return Unit.INSTANCE;
            }
            mr.this.a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmr$b;", "", "", "SCHEDULE", "I", "", "TIMEOUT", "J", "TIMEOUT_SEND", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$addOrUpdate$2", f = "ScheduleImpl.kt", i = {}, l = {132, 140}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int t;
        public final /* synthetic */ ScheduleModel v;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$addOrUpdate$2$1", f = "ScheduleImpl.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
            public int t;
            public final /* synthetic */ Channel<Response<Boolean>> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<Boolean>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
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
                    Channel<Response<Boolean>> channel = this.u;
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
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ScheduleModel scheduleModel, Continuation<? super c> continuation) {
            super(2, continuation);
            this.v = scheduleModel;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return mr.this.new c(this.v, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0091  */
        /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Response response;
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
                response = (Response) obj;
                if (response == null) {
                    return Response.INSTANCE.a();
                }
                return response;
            }
            ResultKt.throwOnFailure(obj);
            mr mrVar = mr.this;
            this.t = 1;
            obj = mrVar.requestCacheVersion(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ScheduleVersion scheduleVersion = (ScheduleVersion) obj;
            HashMap map = mr.this.C;
            lr lrVar = lr.RESULT_ADD_OR_UPDATE;
            Channel channelChannel$default = (Channel) map.get(lrVar);
            if (channelChannel$default == null) {
                channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
                mr.this.C.put(lrVar, channelChannel$default);
            }
            Intrinsics.checkNotNullExpressionValue(channelChannel$default, "cacheChannelBoolean[Sche… = this\n                }");
            byte[] bArrA = new o(this.v, scheduleVersion != null && scheduleVersion.getSupportLocation()).a();
            com.huami.bluetooth.profile.channel.module.a.sendData$default(mr.this.t, bArrA, 0, 2, null);
            e6 e6Var = mr.this.x;
            if (e6Var != null) {
                e6Var.a(bArrA);
            }
            a aVar = new a(channelChannel$default, null);
            this.t = 2;
            obj = TimeoutKt.withTimeoutOrNull(3000L, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            response = (Response) obj;
            if (response == null) {
                return Response.INSTANCE.a();
            }
            return response;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$clearDataChangedStatus$2", f = "ScheduleImpl.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ List<Long> u;
        public final /* synthetic */ mr v;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$clearDataChangedStatus$2$2", f = "ScheduleImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
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
                return new a(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<Long> list, mr mrVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.u = list;
            this.v = mrVar;
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
            return new d(this.u, this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                byte[] bArrA = new IdsRequest(lr.CMD_CLEAR_DATA_CHANGED_STATUS, this.u).a();
                mr mrVar = this.v;
                com.huami.bluetooth.profile.channel.module.a.sendData$default(mrVar.t, bArrA, 0, 2, null);
                e6 e6Var = mrVar.x;
                if (e6Var != null) {
                    e6Var.a(bArrA);
                }
                a aVar = new a(null);
                this.t = 1;
                obj = TimeoutKt.withTimeoutOrNull(5000L, aVar, this);
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$delete$2", f = "ScheduleImpl.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int t;
        public final /* synthetic */ long v;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$delete$2$1", f = "ScheduleImpl.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
            public int t;
            public final /* synthetic */ Channel<Response<Boolean>> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<Boolean>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
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
                    Channel<Response<Boolean>> channel = this.u;
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
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, Continuation<? super e> continuation) {
            super(2, continuation);
            this.v = j;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return mr.this.new e(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = mr.this.C;
                lr lrVar = lr.RESULT_DELETE;
                Channel channelChannel$default = (Channel) map.get(lrVar);
                if (channelChannel$default == null) {
                    channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
                    mr.this.C.put(lrVar, channelChannel$default);
                }
                Intrinsics.checkNotNullExpressionValue(channelChannel$default, "cacheChannelBoolean[Sche… = this\n                }");
                byte[] bArr = {lr.CMD_DELETE.b()};
                byte[] bArrR = tet.r(this.v, 4);
                Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(id, 4)");
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(bArr, bArrR);
                com.huami.bluetooth.profile.channel.module.a.sendData$default(mr.this.t, bArrPlus, 0, 2, null);
                e6 e6Var = mr.this.x;
                if (e6Var != null) {
                    e6Var.a(bArrPlus);
                }
                a aVar = new a(channelChannel$default, null);
                this.t = 1;
                obj = TimeoutKt.withTimeoutOrNull(3000L, aVar, this);
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
            return response == null ? Response.INSTANCE.a() : response;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$deleteBySource$2", f = "ScheduleImpl.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int t;
        public final /* synthetic */ List<Integer> v;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$deleteBySource$2$2", f = "ScheduleImpl.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
            public int t;
            public final /* synthetic */ Channel<Response<Boolean>> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<Boolean>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
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
                    Channel<Response<Boolean>> channel = this.u;
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
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<Integer> list, Continuation<? super f> continuation) {
            super(2, continuation);
            this.v = list;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return mr.this.new f(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = mr.this.C;
                lr lrVar = lr.RESULT_DELETE_BY_SOURCE;
                Channel channelChannel$default = (Channel) map.get(lrVar);
                if (channelChannel$default == null) {
                    channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
                    mr.this.C.put(lrVar, channelChannel$default);
                }
                Intrinsics.checkNotNullExpressionValue(channelChannel$default, "cacheChannelBoolean[Sche… = this\n                }");
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{lr.CMD_DELETE_BY_SOURCE.b()}, c3.a(this.v.size(), 2));
                List<Integer> list = this.v;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Boxing.boxByte((byte) ((Number) it.next()).intValue()));
                }
                com.huami.bluetooth.profile.channel.module.a.sendData$default(mr.this.t, ArraysKt___ArraysJvmKt.plus(bArrPlus, (Collection<Byte>) arrayList), 0, 2, null);
                a aVar = new a(channelChannel$default, null);
                this.t = 1;
                obj = TimeoutKt.withTimeoutOrNull(3000L, aVar, this);
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
            return response == null ? Response.INSTANCE.a() : response;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$dispatcher$1", f = "ScheduleImpl.kt", i = {2, 3, 4, 5, 6}, l = {SportReportBaseParser.ReportType.avgFreq, 228, 235, 240, 245, 250, 260}, m = "invokeSuspend", n = {com.xiaomi.onetrack.api.b.I, com.xiaomi.onetrack.api.b.I, com.xiaomi.onetrack.api.b.I, com.xiaomi.onetrack.api.b.I, com.xiaomi.onetrack.api.b.I}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object t;
        public int u;
        public final /* synthetic */ byte[] v;
        public final /* synthetic */ mr w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(byte[] bArr, mr mrVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.v = bArr;
            this.w = mrVar;
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
            return new g(this.v, this.w, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x01e2 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:108:0x0204 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:109:0x0206 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:111:0x0212 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:113:0x022c A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:115:0x0237 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:119:0x0241 A[Catch: Exception -> 0x001b, TRY_LEAVE, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x0096 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x0098 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00be A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00c7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x00c8 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:47:0x00ca A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x00d6 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x00e6 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:57:0x0100 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x010b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:63:0x0115 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x011c A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0128 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0142 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x014d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:75:0x0157 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:77:0x015e A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x016a A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x0184 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:83:0x018f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:87:0x0199 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x01a0 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:91:0x01ac A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:93:0x01c6 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:95:0x01d1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:99:0x01db A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:117:0x0239, B:119:0x0241, B:12:0x0022, B:97:0x01d3, B:99:0x01db, B:15:0x002b, B:85:0x0191, B:87:0x0199, B:18:0x0034, B:73:0x014f, B:75:0x0157, B:21:0x003d, B:61:0x010d, B:63:0x0115, B:22:0x0042, B:25:0x004a, B:27:0x0053, B:29:0x005f, B:31:0x0071, B:33:0x007c, B:35:0x008d, B:39:0x0098, B:41:0x00a4, B:43:0x00be, B:47:0x00ca, B:49:0x00d6, B:51:0x00e6, B:55:0x00ee, B:57:0x0100, B:65:0x011c, B:67:0x0128, B:69:0x0142, B:77:0x015e, B:79:0x016a, B:81:0x0184, B:89:0x01a0, B:91:0x01ac, B:93:0x01c6, B:101:0x01e2, B:103:0x01ee, B:105:0x01f8, B:107:0x0200, B:109:0x0206, B:111:0x0212, B:113:0x022c), top: B:124:0x0007 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            byte bByteValue;
            lr lrVar;
            Response<Boolean> responseA;
            Channel channel;
            Response<Boolean> response;
            kr krVar;
            byte bByteValue2;
            lr lrVar2;
            Response<Boolean> responseC;
            Channel channel2;
            Response<Boolean> response2;
            byte bByteValue3;
            lr lrVar3;
            Response<Boolean> responseA2;
            Channel channel3;
            Response<Boolean> response3;
            byte bByteValue4;
            lr lrVar4;
            Response<Boolean> responseB;
            Channel channel4;
            Response<Boolean> response4;
            byte bByteValue5;
            lr lrVar5;
            ScheduleVersion scheduleVersion;
            Response<List<ScheduleModel>> responseA3;
            Channel channel5;
            Response<List<ScheduleModel>> response5;
            byte bByteValue6;
            lr lrVar6;
            Response<List<ScheduleStatus>> responseA4;
            Channel channel6;
            kr krVar2;
            kr krVar3;
            kr krVar4;
            kr krVar5;
            kr krVar6;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.u) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Byte bFirstOrNull = ArraysKt___ArraysKt.firstOrNull(this.v);
                        boolean z = true;
                        if (bFirstOrNull != null) {
                            byte bByteValue7 = bFirstOrNull.byteValue();
                            lr lrVar7 = lr.RESULT_QUERY_PROTOCOL_VERSION;
                            if (bByteValue7 == lrVar7.b()) {
                                Response<ScheduleVersion> responseB2 = this.w.a().b(this.v);
                                this.w.y = responseB2 instanceof Success ? (ScheduleVersion) ((Success) responseB2).getData() : null;
                                Channel channel7 = (Channel) this.w.A.get(lrVar7);
                                if (channel7 != null) {
                                    this.u = 1;
                                    if (channel7.send(responseB2, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else if (bFirstOrNull != null) {
                                bByteValue6 = bFirstOrNull.byteValue();
                                lrVar6 = lr.RESULT_QUERY_DATA_CHANGED;
                                if (bByteValue6 == lrVar6.b()) {
                                    responseA4 = this.w.a().a(this.v);
                                    channel6 = (Channel) this.w.B.get(lrVar6);
                                    if (channel6 != null) {
                                        this.u = 2;
                                        if (channel6.send(responseA4, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (bFirstOrNull != null) {
                                        bByteValue5 = bFirstOrNull.byteValue();
                                        lrVar5 = lr.RESULT_QUERY_DATA;
                                        if (bByteValue5 == lrVar5.b()) {
                                            sp spVarA = this.w.a();
                                            byte[] bArr = this.v;
                                            scheduleVersion = this.w.y;
                                            if (scheduleVersion != null || !scheduleVersion.getSupportLocation()) {
                                                z = false;
                                            }
                                            responseA3 = spVarA.a(bArr, z);
                                            channel5 = (Channel) this.w.z.get(lrVar5);
                                            if (channel5 != null) {
                                                this.t = responseA3;
                                                this.u = 3;
                                                if (channel5.send(responseA3, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            response5 = responseA3;
                                            krVar2 = this.w.w;
                                            if (krVar2 != null) {
                                                krVar2.d(response5);
                                            }
                                        }
                                    }
                                    if (bFirstOrNull != null) {
                                        bByteValue4 = bFirstOrNull.byteValue();
                                        lrVar4 = lr.RESULT_ADD_OR_UPDATE;
                                        if (bByteValue4 == lrVar4.b()) {
                                            responseB = this.w.b().b(this.v);
                                            channel4 = (Channel) this.w.C.get(lrVar4);
                                            if (channel4 != null) {
                                                this.t = responseB;
                                                this.u = 4;
                                                if (channel4.send(responseB, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            response4 = responseB;
                                            krVar3 = this.w.w;
                                            if (krVar3 != null) {
                                                krVar3.a(response4);
                                            }
                                        }
                                    }
                                    if (bFirstOrNull != null) {
                                        bByteValue3 = bFirstOrNull.byteValue();
                                        lrVar3 = lr.RESULT_DELETE;
                                        if (bByteValue3 == lrVar3.b()) {
                                            responseA2 = this.w.b().a(this.v);
                                            channel3 = (Channel) this.w.C.get(lrVar3);
                                            if (channel3 != null) {
                                                this.t = responseA2;
                                                this.u = 5;
                                                if (channel3.send(responseA2, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            response3 = responseA2;
                                            krVar4 = this.w.w;
                                            if (krVar4 != null) {
                                                krVar4.c(response3);
                                            }
                                        }
                                    }
                                    if (bFirstOrNull != null) {
                                        bByteValue2 = bFirstOrNull.byteValue();
                                        lrVar2 = lr.RESULT_SYNC_DATA;
                                        if (bByteValue2 == lrVar2.b()) {
                                            responseC = this.w.b().c(this.v);
                                            channel2 = (Channel) this.w.C.get(lrVar2);
                                            if (channel2 != null) {
                                                this.t = responseC;
                                                this.u = 6;
                                                if (channel2.send(responseC, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            response2 = responseC;
                                            krVar5 = this.w.w;
                                            if (krVar5 != null) {
                                                krVar5.b(response2);
                                            }
                                        }
                                    }
                                    if (bFirstOrNull == null && bFirstOrNull.byteValue() == lr.NOTIFY_DATA_CHANGED.b()) {
                                        ScheduleStatus scheduleStatusB = this.w.b(this.v);
                                        if (scheduleStatusB != null && (krVar = this.w.w) != null) {
                                            krVar.a(scheduleStatusB);
                                        }
                                    } else if (bFirstOrNull != null) {
                                        bByteValue = bFirstOrNull.byteValue();
                                        lrVar = lr.RESULT_DELETE_BY_SOURCE;
                                        if (bByteValue == lrVar.b()) {
                                            responseA = this.w.b().a(this.v);
                                            channel = (Channel) this.w.C.get(lrVar);
                                            if (channel != null) {
                                                this.t = responseA;
                                                this.u = 7;
                                                if (channel.send(responseA, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            response = responseA;
                                            krVar6 = this.w.w;
                                            if (krVar6 != null) {
                                                krVar6.c(response);
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (bFirstOrNull != null) {
                                    bByteValue5 = bFirstOrNull.byteValue();
                                    lrVar5 = lr.RESULT_QUERY_DATA;
                                    if (bByteValue5 == lrVar5.b()) {
                                        sp spVarA2 = this.w.a();
                                        byte[] bArr2 = this.v;
                                        scheduleVersion = this.w.y;
                                        if (scheduleVersion != null) {
                                            z = false;
                                        } else {
                                            z = false;
                                        }
                                        responseA3 = spVarA2.a(bArr2, z);
                                        channel5 = (Channel) this.w.z.get(lrVar5);
                                        if (channel5 != null) {
                                            this.t = responseA3;
                                            this.u = 3;
                                            if (channel5.send(responseA3, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        response5 = responseA3;
                                        krVar2 = this.w.w;
                                        if (krVar2 != null) {
                                            krVar2.d(response5);
                                        }
                                    }
                                }
                                if (bFirstOrNull != null) {
                                    bByteValue4 = bFirstOrNull.byteValue();
                                    lrVar4 = lr.RESULT_ADD_OR_UPDATE;
                                    if (bByteValue4 == lrVar4.b()) {
                                        responseB = this.w.b().b(this.v);
                                        channel4 = (Channel) this.w.C.get(lrVar4);
                                        if (channel4 != null) {
                                            this.t = responseB;
                                            this.u = 4;
                                            if (channel4.send(responseB, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        response4 = responseB;
                                        krVar3 = this.w.w;
                                        if (krVar3 != null) {
                                            krVar3.a(response4);
                                        }
                                    }
                                }
                                if (bFirstOrNull != null) {
                                    bByteValue3 = bFirstOrNull.byteValue();
                                    lrVar3 = lr.RESULT_DELETE;
                                    if (bByteValue3 == lrVar3.b()) {
                                        responseA2 = this.w.b().a(this.v);
                                        channel3 = (Channel) this.w.C.get(lrVar3);
                                        if (channel3 != null) {
                                            this.t = responseA2;
                                            this.u = 5;
                                            if (channel3.send(responseA2, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        response3 = responseA2;
                                        krVar4 = this.w.w;
                                        if (krVar4 != null) {
                                            krVar4.c(response3);
                                        }
                                    }
                                }
                                if (bFirstOrNull != null) {
                                    bByteValue2 = bFirstOrNull.byteValue();
                                    lrVar2 = lr.RESULT_SYNC_DATA;
                                    if (bByteValue2 == lrVar2.b()) {
                                        responseC = this.w.b().c(this.v);
                                        channel2 = (Channel) this.w.C.get(lrVar2);
                                        if (channel2 != null) {
                                            this.t = responseC;
                                            this.u = 6;
                                            if (channel2.send(responseC, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        response2 = responseC;
                                        krVar5 = this.w.w;
                                        if (krVar5 != null) {
                                            krVar5.b(response2);
                                        }
                                    }
                                }
                                if (bFirstOrNull == null) {
                                    if (bFirstOrNull != null) {
                                        bByteValue = bFirstOrNull.byteValue();
                                        lrVar = lr.RESULT_DELETE_BY_SOURCE;
                                        if (bByteValue == lrVar.b()) {
                                            responseA = this.w.b().a(this.v);
                                            channel = (Channel) this.w.C.get(lrVar);
                                            if (channel != null) {
                                                this.t = responseA;
                                                this.u = 7;
                                                if (channel.send(responseA, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            response = responseA;
                                            krVar6 = this.w.w;
                                            if (krVar6 != null) {
                                                krVar6.c(response);
                                            }
                                        }
                                    }
                                } else if (bFirstOrNull != null) {
                                    bByteValue = bFirstOrNull.byteValue();
                                    lrVar = lr.RESULT_DELETE_BY_SOURCE;
                                    if (bByteValue == lrVar.b()) {
                                        responseA = this.w.b().a(this.v);
                                        channel = (Channel) this.w.C.get(lrVar);
                                        if (channel != null) {
                                            this.t = responseA;
                                            this.u = 7;
                                            if (channel.send(responseA, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        response = responseA;
                                        krVar6 = this.w.w;
                                        if (krVar6 != null) {
                                            krVar6.c(response);
                                        }
                                    }
                                }
                            }
                        } else if (bFirstOrNull != null) {
                            bByteValue6 = bFirstOrNull.byteValue();
                            lrVar6 = lr.RESULT_QUERY_DATA_CHANGED;
                            if (bByteValue6 == lrVar6.b()) {
                                responseA4 = this.w.a().a(this.v);
                                channel6 = (Channel) this.w.B.get(lrVar6);
                                if (channel6 != null) {
                                    this.u = 2;
                                    if (channel6.send(responseA4, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (bFirstOrNull != null) {
                                    bByteValue5 = bFirstOrNull.byteValue();
                                    lrVar5 = lr.RESULT_QUERY_DATA;
                                    if (bByteValue5 == lrVar5.b()) {
                                        sp spVarA3 = this.w.a();
                                        byte[] bArr3 = this.v;
                                        scheduleVersion = this.w.y;
                                        if (scheduleVersion != null) {
                                            z = false;
                                        } else {
                                            z = false;
                                        }
                                        responseA3 = spVarA3.a(bArr3, z);
                                        channel5 = (Channel) this.w.z.get(lrVar5);
                                        if (channel5 != null) {
                                            this.t = responseA3;
                                            this.u = 3;
                                            if (channel5.send(responseA3, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        response5 = responseA3;
                                        krVar2 = this.w.w;
                                        if (krVar2 != null) {
                                            krVar2.d(response5);
                                        }
                                    }
                                }
                                if (bFirstOrNull != null) {
                                    bByteValue4 = bFirstOrNull.byteValue();
                                    lrVar4 = lr.RESULT_ADD_OR_UPDATE;
                                    if (bByteValue4 == lrVar4.b()) {
                                        responseB = this.w.b().b(this.v);
                                        channel4 = (Channel) this.w.C.get(lrVar4);
                                        if (channel4 != null) {
                                            this.t = responseB;
                                            this.u = 4;
                                            if (channel4.send(responseB, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        response4 = responseB;
                                        krVar3 = this.w.w;
                                        if (krVar3 != null) {
                                            krVar3.a(response4);
                                        }
                                    }
                                }
                                if (bFirstOrNull != null) {
                                    bByteValue3 = bFirstOrNull.byteValue();
                                    lrVar3 = lr.RESULT_DELETE;
                                    if (bByteValue3 == lrVar3.b()) {
                                        responseA2 = this.w.b().a(this.v);
                                        channel3 = (Channel) this.w.C.get(lrVar3);
                                        if (channel3 != null) {
                                            this.t = responseA2;
                                            this.u = 5;
                                            if (channel3.send(responseA2, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        response3 = responseA2;
                                        krVar4 = this.w.w;
                                        if (krVar4 != null) {
                                            krVar4.c(response3);
                                        }
                                    }
                                }
                                if (bFirstOrNull != null) {
                                    bByteValue2 = bFirstOrNull.byteValue();
                                    lrVar2 = lr.RESULT_SYNC_DATA;
                                    if (bByteValue2 == lrVar2.b()) {
                                        responseC = this.w.b().c(this.v);
                                        channel2 = (Channel) this.w.C.get(lrVar2);
                                        if (channel2 != null) {
                                            this.t = responseC;
                                            this.u = 6;
                                            if (channel2.send(responseC, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        response2 = responseC;
                                        krVar5 = this.w.w;
                                        if (krVar5 != null) {
                                            krVar5.b(response2);
                                        }
                                    }
                                }
                                if (bFirstOrNull == null) {
                                    if (bFirstOrNull != null) {
                                        bByteValue = bFirstOrNull.byteValue();
                                        lrVar = lr.RESULT_DELETE_BY_SOURCE;
                                        if (bByteValue == lrVar.b()) {
                                            responseA = this.w.b().a(this.v);
                                            channel = (Channel) this.w.C.get(lrVar);
                                            if (channel != null) {
                                                this.t = responseA;
                                                this.u = 7;
                                                if (channel.send(responseA, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            response = responseA;
                                            krVar6 = this.w.w;
                                            if (krVar6 != null) {
                                                krVar6.c(response);
                                            }
                                        }
                                    }
                                } else if (bFirstOrNull != null) {
                                    bByteValue = bFirstOrNull.byteValue();
                                    lrVar = lr.RESULT_DELETE_BY_SOURCE;
                                    if (bByteValue == lrVar.b()) {
                                        responseA = this.w.b().a(this.v);
                                        channel = (Channel) this.w.C.get(lrVar);
                                        if (channel != null) {
                                            this.t = responseA;
                                            this.u = 7;
                                            if (channel.send(responseA, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        response = responseA;
                                        krVar6 = this.w.w;
                                        if (krVar6 != null) {
                                            krVar6.c(response);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (bFirstOrNull != null) {
                                bByteValue5 = bFirstOrNull.byteValue();
                                lrVar5 = lr.RESULT_QUERY_DATA;
                                if (bByteValue5 == lrVar5.b()) {
                                    sp spVarA4 = this.w.a();
                                    byte[] bArr4 = this.v;
                                    scheduleVersion = this.w.y;
                                    if (scheduleVersion != null) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    responseA3 = spVarA4.a(bArr4, z);
                                    channel5 = (Channel) this.w.z.get(lrVar5);
                                    if (channel5 != null) {
                                        this.t = responseA3;
                                        this.u = 3;
                                        if (channel5.send(responseA3, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    response5 = responseA3;
                                    krVar2 = this.w.w;
                                    if (krVar2 != null) {
                                        krVar2.d(response5);
                                    }
                                }
                            }
                            if (bFirstOrNull != null) {
                                bByteValue4 = bFirstOrNull.byteValue();
                                lrVar4 = lr.RESULT_ADD_OR_UPDATE;
                                if (bByteValue4 == lrVar4.b()) {
                                    responseB = this.w.b().b(this.v);
                                    channel4 = (Channel) this.w.C.get(lrVar4);
                                    if (channel4 != null) {
                                        this.t = responseB;
                                        this.u = 4;
                                        if (channel4.send(responseB, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    response4 = responseB;
                                    krVar3 = this.w.w;
                                    if (krVar3 != null) {
                                        krVar3.a(response4);
                                    }
                                }
                            }
                            if (bFirstOrNull != null) {
                                bByteValue3 = bFirstOrNull.byteValue();
                                lrVar3 = lr.RESULT_DELETE;
                                if (bByteValue3 == lrVar3.b()) {
                                    responseA2 = this.w.b().a(this.v);
                                    channel3 = (Channel) this.w.C.get(lrVar3);
                                    if (channel3 != null) {
                                        this.t = responseA2;
                                        this.u = 5;
                                        if (channel3.send(responseA2, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    response3 = responseA2;
                                    krVar4 = this.w.w;
                                    if (krVar4 != null) {
                                        krVar4.c(response3);
                                    }
                                }
                            }
                            if (bFirstOrNull != null) {
                                bByteValue2 = bFirstOrNull.byteValue();
                                lrVar2 = lr.RESULT_SYNC_DATA;
                                if (bByteValue2 == lrVar2.b()) {
                                    responseC = this.w.b().c(this.v);
                                    channel2 = (Channel) this.w.C.get(lrVar2);
                                    if (channel2 != null) {
                                        this.t = responseC;
                                        this.u = 6;
                                        if (channel2.send(responseC, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    response2 = responseC;
                                    krVar5 = this.w.w;
                                    if (krVar5 != null) {
                                        krVar5.b(response2);
                                    }
                                }
                            }
                            if (bFirstOrNull == null) {
                                if (bFirstOrNull != null) {
                                    bByteValue = bFirstOrNull.byteValue();
                                    lrVar = lr.RESULT_DELETE_BY_SOURCE;
                                    if (bByteValue == lrVar.b()) {
                                        responseA = this.w.b().a(this.v);
                                        channel = (Channel) this.w.C.get(lrVar);
                                        if (channel != null) {
                                            this.t = responseA;
                                            this.u = 7;
                                            if (channel.send(responseA, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                        response = responseA;
                                        krVar6 = this.w.w;
                                        if (krVar6 != null) {
                                            krVar6.c(response);
                                        }
                                    }
                                }
                            } else if (bFirstOrNull != null) {
                                bByteValue = bFirstOrNull.byteValue();
                                lrVar = lr.RESULT_DELETE_BY_SOURCE;
                                if (bByteValue == lrVar.b()) {
                                    responseA = this.w.b().a(this.v);
                                    channel = (Channel) this.w.C.get(lrVar);
                                    if (channel != null) {
                                        this.t = responseA;
                                        this.u = 7;
                                        if (channel.send(responseA, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    response = responseA;
                                    krVar6 = this.w.w;
                                    if (krVar6 != null) {
                                        krVar6.c(response);
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                    case 2:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 3:
                        response5 = (Response) this.t;
                        ResultKt.throwOnFailure(obj);
                        krVar2 = this.w.w;
                        if (krVar2 != null) {
                            krVar2.d(response5);
                        }
                        return Unit.INSTANCE;
                    case 4:
                        response4 = (Response) this.t;
                        ResultKt.throwOnFailure(obj);
                        krVar3 = this.w.w;
                        if (krVar3 != null) {
                            krVar3.a(response4);
                        }
                        return Unit.INSTANCE;
                    case 5:
                        response3 = (Response) this.t;
                        ResultKt.throwOnFailure(obj);
                        krVar4 = this.w.w;
                        if (krVar4 != null) {
                            krVar4.c(response3);
                        }
                        return Unit.INSTANCE;
                    case 6:
                        response2 = (Response) this.t;
                        ResultKt.throwOnFailure(obj);
                        krVar5 = this.w.w;
                        if (krVar5 != null) {
                            krVar5.b(response2);
                        }
                        return Unit.INSTANCE;
                    case 7:
                        response = (Response) this.t;
                        ResultKt.throwOnFailure(obj);
                        krVar6 = this.w.w;
                        if (krVar6 != null) {
                            krVar6.c(response);
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                this.w.onError("解析出错 " + e.getStackTrace(), Boxing.boxInt(0));
                t5t.f("ScheduleApi", "error", e);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$queryData$2", f = "ScheduleImpl.kt", i = {}, l = {113, 122}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<List<? extends ScheduleModel>>>, Object> {
        public int t;
        public final /* synthetic */ List<Long> v;

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$queryData$2$2", f = "ScheduleImpl.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<List<? extends ScheduleModel>>>, Object> {
            public int t;
            public final /* synthetic */ Channel<Response<List<ScheduleModel>>> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<List<ScheduleModel>>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<List<ScheduleModel>>> continuation) {
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
                    Channel<Response<List<ScheduleModel>>> channel = this.u;
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
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<Long> list, Continuation<? super h> continuation) {
            super(2, continuation);
            this.v = list;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<List<ScheduleModel>>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return mr.this.new h(this.v, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0084  */
        /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Response response;
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
                response = (Response) obj;
                if (response == null) {
                    return Response.INSTANCE.a();
                }
                return response;
            }
            ResultKt.throwOnFailure(obj);
            mr mrVar = mr.this;
            this.t = 1;
            if (mrVar.requestCacheVersion(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            HashMap map = mr.this.z;
            lr lrVar = lr.RESULT_QUERY_DATA;
            Channel channelChannel$default = (Channel) map.get(lrVar);
            if (channelChannel$default == null) {
                channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
                mr.this.z.put(lrVar, channelChannel$default);
            }
            Intrinsics.checkNotNullExpressionValue(channelChannel$default, "cacheChannel[ScheduleCmd… = this\n                }");
            byte[] bArrA = new IdsRequest(lr.CMD_QUERY_DATA, this.v).a();
            mr mrVar2 = mr.this;
            com.huami.bluetooth.profile.channel.module.a.sendData$default(mrVar2.t, bArrA, 0, 2, null);
            e6 e6Var = mrVar2.x;
            if (e6Var != null) {
                e6Var.a(bArrA);
            }
            a aVar = new a(channelChannel$default, null);
            this.t = 2;
            obj = TimeoutKt.withTimeoutOrNull(5000L, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            response = (Response) obj;
            if (response == null) {
                return Response.INSTANCE.a();
            }
            return response;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$queryDataChanged$2", f = "ScheduleImpl.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<List<? extends ScheduleStatus>>>, Object> {
        public int t;

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$queryDataChanged$2$2", f = "ScheduleImpl.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<List<? extends ScheduleStatus>>>, Object> {
            public int t;
            public final /* synthetic */ Channel<Response<List<ScheduleStatus>>> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<List<ScheduleStatus>>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<List<ScheduleStatus>>> continuation) {
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
                    Channel<Response<List<ScheduleStatus>>> channel = this.u;
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
                return obj;
            }
        }

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<List<ScheduleStatus>>> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return mr.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = mr.this.B;
                lr lrVar = lr.RESULT_QUERY_DATA_CHANGED;
                Channel channelChannel$default = (Channel) map.get(lrVar);
                if (channelChannel$default == null) {
                    channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
                    mr.this.B.put(lrVar, channelChannel$default);
                }
                Intrinsics.checkNotNullExpressionValue(channelChannel$default, "cacheChannelDataChanged[… = this\n                }");
                byte[] bArrC = lr.CMD_QUERY_DATA_CHANGED.c();
                mr mrVar = mr.this;
                com.huami.bluetooth.profile.channel.module.a.sendData$default(mrVar.t, bArrC, 0, 2, null);
                e6 e6Var = mrVar.x;
                if (e6Var != null) {
                    e6Var.a(bArrC);
                }
                a aVar = new a(channelChannel$default, null);
                this.t = 1;
                obj = TimeoutKt.withTimeoutOrNull(3000L, aVar, this);
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
            return response == null ? Response.INSTANCE.a() : response;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lnr;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$queryProtocolVersion$2", f = "ScheduleImpl.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<ScheduleVersion>>, Object> {
        public int t;
        public final /* synthetic */ Boolean v;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lnr;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$queryProtocolVersion$2$1", f = "ScheduleImpl.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<ScheduleVersion>>, Object> {
            public int t;
            public final /* synthetic */ Channel<Response<ScheduleVersion>> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<ScheduleVersion>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<ScheduleVersion>> continuation) {
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
                    Channel<Response<ScheduleVersion>> channel = this.u;
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
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Boolean bool, Continuation<? super j> continuation) {
            super(2, continuation);
            this.v = bool;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<ScheduleVersion>> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return mr.this.new j(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = mr.this.A;
                lr lrVar = lr.RESULT_QUERY_PROTOCOL_VERSION;
                Channel channelChannel$default = (Channel) map.get(lrVar);
                if (channelChannel$default == null) {
                    channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
                    mr.this.A.put(lrVar, channelChannel$default);
                }
                Intrinsics.checkNotNullExpressionValue(channelChannel$default, "cacheChannelVersion[Sche… = this\n                }");
                byte[] bArrC = lr.CMD_QUERY_PROTOCOL_VERSION.c();
                Boolean bool = this.v;
                if (bool != null) {
                    ArraysKt___ArraysJvmKt.plus(bArrC, !bool.booleanValue() ? (byte) 1 : (byte) 0);
                }
                com.huami.bluetooth.profile.channel.module.a.sendData$default(mr.this.t, bArrC, 0, 2, null);
                e6 e6Var = mr.this.x;
                if (e6Var != null) {
                    e6Var.a(bArrC);
                }
                a aVar = new a(channelChannel$default, null);
                this.t = 1;
                obj = TimeoutKt.withTimeoutOrNull(3000L, aVar, this);
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
            return response == null ? Response.INSTANCE.a() : response;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsp;", PluginDeviceInfo.FMODEL, "()Lsp;"}, k = 3, mv = {1, 7, 1})
    public static final class k extends Lambda implements Function0<sp> {
        public static final k t = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sp invoke() {
            return new sp();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl", f = "ScheduleImpl.kt", i = {0}, l = {106}, m = "requestCacheVersion", n = {"this"}, s = {"L$0"})
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
            return mr.this.requestCacheVersion(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$syncDataToDevice$2", f = "ScheduleImpl.kt", i = {}, l = {SportReportBaseParser.ReportType.maxWaterTemperature}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int t;
        public final /* synthetic */ List<ScheduleModel> v;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$syncDataToDevice$2$2", f = "ScheduleImpl.kt", i = {}, l = {SportReportBaseParser.ReportType.minWaterTemperature}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
            public int t;
            public final /* synthetic */ Channel<Response<Boolean>> u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<Boolean>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
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
                    Channel<Response<Boolean>> channel = this.u;
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
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(List<ScheduleModel> list, Continuation<? super m> continuation) {
            super(2, continuation);
            this.v = list;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return mr.this.new m(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = mr.this.C;
                lr lrVar = lr.RESULT_SYNC_DATA;
                Channel channelChannel$default = (Channel) map.get(lrVar);
                if (channelChannel$default == null) {
                    channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
                    mr.this.C.put(lrVar, channelChannel$default);
                }
                Intrinsics.checkNotNullExpressionValue(channelChannel$default, "cacheChannelBoolean[Sche… = this\n                }");
                byte[] bArrA = new SyncRequest(this.v).a();
                mr mrVar = mr.this;
                com.huami.bluetooth.profile.channel.module.a.sendData$default(mrVar.t, bArrA, 0, 2, null);
                e6 e6Var = mrVar.x;
                if (e6Var != null) {
                    e6Var.a(bArrA);
                }
                a aVar = new a(channelChannel$default, null);
                this.t = 1;
                obj = TimeoutKt.withTimeoutOrNull(5000L, aVar, this);
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
            return response == null ? Response.INSTANCE.a() : response;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llv;", PluginDeviceInfo.FMODEL, "()Llv;"}, k = 3, mv = {1, 7, 1})
    public static final class n extends Lambda implements Function0<lv> {
        public static final n t = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lv invoke() {
            return new lv();
        }
    }

    public mr(@NotNull ScheduleModule model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.t = model;
        this.u = LazyKt__LazyJVMKt.lazy(k.t);
        this.v = LazyKt__LazyJVMKt.lazy(n.t);
        model.registerMessageCallback(new a(null));
        this.z = new HashMap<>();
        this.A = new HashMap<>();
        this.B = new HashMap<>();
        this.C = new HashMap<>();
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object addOrUpdate(@NotNull ScheduleModel scheduleModel, @NotNull Continuation<? super Response<Boolean>> continuation) {
        return BuildersKt.withContext(this.t.getCoroutineContext(), new c(scheduleModel, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object clearDataChangedStatus(@NotNull List<Long> list, @NotNull Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(this.t.getCoroutineContext(), new d(list, this, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object delete(long j2, @NotNull Continuation<? super Response<Boolean>> continuation) {
        return BuildersKt.withContext(this.t.getCoroutineContext(), new e(j2, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object deleteBySource(@NotNull List<Integer> list, @NotNull Continuation<? super Response<Boolean>> continuation) {
        return BuildersKt.withContext(this.t.getCoroutineContext(), new f(list, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    public int moduleId() {
        return 7;
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    public void onError(@Nullable String msg, @Nullable Integer errorCode) {
        kr krVar = this.w;
        if (krVar != null) {
            krVar.onError(msg, errorCode);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object queryData(@NotNull List<Long> list, @NotNull Continuation<? super Response<List<ScheduleModel>>> continuation) {
        return BuildersKt.withContext(this.t.getCoroutineContext(), new h(list, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object queryDataChanged(@NotNull Continuation<? super Response<List<ScheduleStatus>>> continuation) {
        return BuildersKt.withContext(this.t.getCoroutineContext(), new i(null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object queryProtocolVersion(@Nullable Boolean bool, @NotNull Continuation<? super Response<ScheduleVersion>> continuation) {
        return BuildersKt.withContext(this.t.getCoroutineContext(), new j(bool, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    public void register(@NotNull e6 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.x = callback;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object requestCacheVersion(@NotNull Continuation<? super ScheduleVersion> continuation) {
        l lVar;
        mr mrVar;
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
        Object obj = lVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = lVar.w;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.y == null) {
                lVar.t = this;
                lVar.w = 1;
                if (ScheduleApi.b.a(this, null, lVar, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            mrVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mrVar = (mr) lVar.t;
            ResultKt.throwOnFailure(obj);
        }
        return mrVar.y;
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object syncDataToDevice(@NotNull List<ScheduleModel> list, @NotNull Continuation<? super Response<Boolean>> continuation) {
        return BuildersKt.withContext(this.t.getCoroutineContext(), new m(list, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    public void register(@NotNull kr callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.w = callback;
    }

    public final lv b() {
        return (lv) this.v.getValue();
    }

    public final sp a() {
        return (sp) this.u.getValue();
    }

    public final ScheduleStatus b(byte[] data) {
        if (data.length == 7) {
            return new ScheduleStatus(tet.v(data, 2, 4), data[1], 0L, 4, null);
        }
        t5t.d("MenstruationDataParser", "parse device change schedule error");
        return null;
    }

    public final void a(byte[] data) {
        e6 e6Var = this.x;
        if (e6Var != null) {
            e6Var.b(data);
        }
        BuildersKt__Builders_commonKt.launch$default(this.t, null, null, new g(data, this, null), 3, null);
    }
}
