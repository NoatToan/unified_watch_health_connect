package com.huami.bluetooth.profile.channel.module.contact;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.VersionInfo;
import defpackage.e6;
import defpackage.g5t;
import defpackage.m5;
import defpackage.np;
import defpackage.r3;
import defpackage.s2;
import defpackage.u2;
import defpackage.vi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/contact/ContactModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lg5t;", "initContactApi", "()Lg5t;", "", "init", "()V", "Le6;", "interceptor", "setInterceptor", "(Le6;)V", "Ls2;", "request", "Lu2;", "sendRequest", "(Ls2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lvi;", "requests", "Ljava/util/Map;", "contactApi$delegate", "Lkotlin/Lazy;", "getContactApi", "contactApi", "", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ContactModule extends a {
    private static final int currentProtocolVersion = 0;
    private static final int modelId = 20;
    private static final long timeoutMs = 3000;

    /* JADX INFO: renamed from: contactApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy contactApi;

    @Nullable
    private e6 interceptor;

    @NotNull
    private final Map<s2, vi> requests;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg5t;", PluginDeviceInfo.FMODEL, "()Lg5t;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<g5t> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g5t invoke() {
            return ContactModule.this.initContactApi();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function1<ChannelResponse, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            byte bFirst = ArraysKt___ArraysKt.first(response.getData());
            Map map = ContactModule.this.requests;
            ContactModule contactModule = ContactModule.this;
            for (Map.Entry entry : map.entrySet()) {
                s2 s2Var = (s2) entry.getKey();
                vi viVar = (vi) entry.getValue();
                if (bFirst == s2Var.getF33189b()) {
                    viVar.a(response.getData());
                    contactModule.requests.remove(s2Var);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lmw;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.contact.ContactModule$initContactApi$version$1", f = "ContactModule.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VersionInfo>, Object> {
        public int t;
        public final /* synthetic */ m5 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m5 m5Var, Continuation<? super d> continuation) {
            super(2, continuation);
            this.u = m5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super VersionInfo> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                m5 m5Var = this.u;
                this.t = 1;
                obj = m5Var.a(this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.contact.ContactModule", f = "ContactModule.kt", i = {0}, l = {69, 74}, m = "sendRequest", n = {"completableDeferred"}, s = {"L$0"})
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
            return ContactModule.this.sendRequest(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/huami/bluetooth/profile/channel/module/contact/ContactModule$f", "Lvi;", "", "result", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class f implements vi {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CompletableDeferred<byte[]> f9865b;

        public f(CompletableDeferred<byte[]> completableDeferred) {
            this.f9865b = completableDeferred;
        }

        @Override // defpackage.vi
        public void a(@NotNull byte[] result) {
            Intrinsics.checkNotNullParameter(result, "result");
            e6 e6Var = ContactModule.this.interceptor;
            if (e6Var != null) {
                e6Var.b(result);
            }
            this.f9865b.complete(result);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lu2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.contact.ContactModule$sendRequest$3", f = "ContactModule.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super u2>, Object> {
        public int t;
        public final /* synthetic */ CompletableDeferred<byte[]> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(CompletableDeferred<byte[]> completableDeferred, Continuation<? super g> continuation) {
            super(2, continuation);
            this.u = completableDeferred;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super u2> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<byte[]> completableDeferred = this.u;
                this.t = 1;
                obj = completableDeferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new u2(true, (byte[]) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.requests = new LinkedHashMap();
        this.contactApi = LazyKt__LazyJVMKt.lazy(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g5t initContactApi() throws np {
        m5 m5Var = new m5(this);
        VersionInfo versionInfo = (VersionInfo) BuildersKt__BuildersKt.runBlocking$default(null, new d(m5Var, null), 1, null);
        if (versionInfo.getVersion() >= 0) {
            return m5Var;
        }
        throw new np("ContactModule not support this version " + versionInfo);
    }

    @NotNull
    public final g5t getContactApi() {
        return (g5t) this.contactApi.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 20;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, 20, false, new c(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendRequest(@NotNull s2 s2Var, @NotNull Continuation<? super u2> continuation) {
        e eVar;
        CompletableDeferred completableDeferred;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.w = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objWithTimeout = eVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = eVar.w;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    completableDeferred = (CompletableDeferred) eVar.t;
                    ResultKt.throwOnFailure(objWithTimeout);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objWithTimeout);
                }
                return (u2) objWithTimeout;
            }
            ResultKt.throwOnFailure(objWithTimeout);
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            this.requests.put(s2Var, new f(completableDeferredCompletableDeferred$default));
            e6 e6Var = this.interceptor;
            if (e6Var != null) {
                e6Var.a(s2Var.getF33188a());
            }
            byte[] f33188a = s2Var.getF33188a();
            eVar.t = completableDeferredCompletableDeferred$default;
            eVar.w = 1;
            Object objSendDataWithResult$default = a.sendDataWithResult$default(this, f33188a, 0, false, eVar, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            objWithTimeout = objSendDataWithResult$default;
            completableDeferred = completableDeferredCompletableDeferred$default;
            if (!((Boolean) objWithTimeout).booleanValue()) {
                return new u2(false, null, 2, null);
            }
            g gVar = new g(completableDeferred, null);
            eVar.t = null;
            eVar.w = 2;
            objWithTimeout = TimeoutKt.withTimeout(3000L, gVar, eVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (u2) objWithTimeout;
        } catch (Exception unused) {
            return new u2(false, null, 2, null);
        }
    }

    public final void setInterceptor(@NotNull e6 interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.interceptor = interceptor;
    }
}
