package com.huami.sync;

import android.app.Application;
import com.huami.sync.job.LoggingKt;
import com.huami.tools.analytics.DbUtils;
import io.netty.util.internal.StringUtil;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b*\u0010+J)\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002J\u0014\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0003JW\u0010\u001a\u001a\u00020\u00072O\u0010\u0019\u001aK\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00070\u0013R\u0019\u0010 \u001a\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010(¨\u0006,"}, d2 = {"Lcom/huami/sync/TransmissionSource;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "", "callback", "startPoll", "Lkotlin/Function0;", "Lkotlinx/coroutines/Job;", "stopPoll", "toggle", "saveToggle", "", "time", "saveLastSendTime", "isOpen", "Lkotlin/Function3;", "allow", "", "msg", "Lcom/huami/sync/ToggleResult;", "result", "onFinish", "toggleCheck", "Landroid/app/Application;", "a", "Landroid/app/Application;", "getContext", "()Landroid/app/Application;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/huami/sync/NetSource;", "c", "Lkotlin/Lazy;", "()Lcom/huami/sync/NetSource;", "netSource", "<init>", "(Landroid/app/Application;Lkotlinx/coroutines/CoroutineScope;)V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class TransmissionSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy netSource = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sync/NetSourceImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<NetSourceImpl> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetSourceImpl invoke() {
            return new NetSourceImpl();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"", "allow", "", "msg", "Lcom/huami/sync/ToggleResult;", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function3<Boolean, String, ToggleResult, Unit> {
        public final /* synthetic */ Function1<Boolean, Unit> a;
        public final /* synthetic */ TransmissionSource b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ TransmissionSource a;

            /* JADX INFO: renamed from: com.huami.sync.TransmissionSource$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.sync.TransmissionSource$startPoll$1$1$1", f = "TransmissionSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0612a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ TransmissionSource b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0612a(TransmissionSource transmissionSource, Continuation<? super C0612a> continuation) {
                    super(2, continuation);
                    this.b = transmissionSource;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0612a(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0612a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    TransmissionNotification.INSTANCE.trySend(this.b.getContext());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TransmissionSource transmissionSource) {
                super(0);
                this.a = transmissionSource;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                e.f(this.a.coroutineScope, Dispatchers.getMain(), null, new C0612a(this.a, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Boolean, Unit> function1, TransmissionSource transmissionSource) {
            super(3);
            this.a = function1;
            this.b = transmissionSource;
        }

        public final void a(boolean z, @Nullable String str, @Nullable ToggleResult toggleResult) {
            LoggingKt.log("startPoll，实时数据开启状态：" + z + StringUtil.SPACE + ((Object) str));
            if (z) {
                long realTimeRate = (toggleResult == null ? 0L : toggleResult.getRealTimeRate()) * ((long) 1000);
                LoggingKt.log("实时数据轮询间隔 " + realTimeRate + " 毫秒");
                if (realTimeRate > 0) {
                    Config.INSTANCE.setPollPeriod(realTimeRate);
                }
                TransmissionPoller.INSTANCE.start(new a(this.b));
            }
            this.a.invoke(Boolean.valueOf(z));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str, ToggleResult toggleResult) {
            a(bool.booleanValue(), str, toggleResult);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sync.TransmissionSource$stopPoll$1", f = "TransmissionSource.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function0<Unit> b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sync.TransmissionSource$stopPoll$1$1", f = "TransmissionSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(continuation);
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
                TransmissionPoller.stop();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.b.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sync.TransmissionSource$toggleCheck$1", f = "TransmissionSource.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ Function3<Boolean, String, ToggleResult, Unit> c;
        public final /* synthetic */ TransmissionSource d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/sync/ToggleResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sync.TransmissionSource$toggleCheck$1$1$result$1", f = "TransmissionSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ToggleResult>, Object> {
            public int a;
            public final /* synthetic */ TransmissionSource b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TransmissionSource transmissionSource, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = transmissionSource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ToggleResult> continuation) {
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
                return this.b.a().toggle();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function3<? super Boolean, ? super String, ? super ToggleResult, Unit> function3, TransmissionSource transmissionSource, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = function3;
            this.d = transmissionSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            Function3<Boolean, String, ToggleResult, Unit> function3;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            boolean z = true;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function3<Boolean, String, ToggleResult, Unit> function4 = this.c;
                    TransmissionSource transmissionSource = this.d;
                    Result.Companion companion = Result.Companion;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    a aVar = new a(transmissionSource, null);
                    this.a = function4;
                    this.b = 1;
                    Object objWithContext = BuildersKt.withContext(io2, aVar, this);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function3 = function4;
                    obj = objWithContext;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function3 = (Function3) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                ToggleResult toggleResult = (ToggleResult) obj;
                if (toggleResult != null) {
                    boolean zIsAllow = toggleResult.isAllow();
                    Boolean boolBoxBoolean = Boxing.boxBoolean(zIsAllow);
                    if (!zIsAllow) {
                        z = false;
                    }
                    function3.invoke(boolBoxBoolean, Intrinsics.stringPlus("实时数据云端check结果：", Boxing.boxBoolean(z)), toggleResult);
                } else {
                    function3.invoke(Boxing.boxBoolean(false), "实时数据云端check接口失败", null);
                }
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Function3<Boolean, String, ToggleResult, Unit> function5 = this.c;
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                function5.invoke(Boxing.boxBoolean(false), thM3848exceptionOrNullimpl.getMessage(), null);
            }
            return Unit.INSTANCE;
        }
    }

    public TransmissionSource(@NotNull Application application, @NotNull CoroutineScope coroutineScope) {
        this.context = application;
        this.coroutineScope = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetSource a() {
        return (NetSource) this.netSource.getValue();
    }

    @NotNull
    public final Application getContext() {
        return this.context;
    }

    public final boolean isOpen() {
        return RealTimeCache.INSTANCE.isOpen();
    }

    public final void saveLastSendTime(long time) {
        RealTimeCache.INSTANCE.saveLastSendTime(time);
    }

    public final void saveToggle(boolean toggle) {
        RealTimeCache.INSTANCE.saveToggle(toggle);
    }

    public final void startPoll(@NotNull Function1<? super Boolean, Unit> callback) {
        toggleCheck(new b(callback, this));
    }

    @NotNull
    public final Job stopPoll(@NotNull Function0<Unit> callback) {
        return e.f(this.coroutineScope, null, null, new c(callback, null), 3, null);
    }

    public final void toggleCheck(@NotNull Function3<? super Boolean, ? super String, ? super ToggleResult, Unit> onFinish) {
        e.f(this.coroutineScope, null, null, new d(onFinish, this, null), 3, null);
    }
}
