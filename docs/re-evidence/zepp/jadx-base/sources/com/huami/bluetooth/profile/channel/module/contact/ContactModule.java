package com.huami.bluetooth.profile.channel.module.contact;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.contact.bean.VersionInfo;
import com.huami.bluetooth.profile.channel.module.contact.request.BtRequest;
import com.huami.bluetooth.profile.channel.module.contact.request.BtResponse;
import com.huami.bluetooth.profile.channel.module.ex.ProtocolNotSupportException;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/contact/ContactModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/contact/ContactApi;", "c", "", PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "interceptor", "setInterceptor", "Lcom/huami/bluetooth/profile/channel/module/contact/request/BtRequest;", "request", "Lcom/huami/bluetooth/profile/channel/module/contact/request/BtResponse;", "sendRequest", "(Lcom/huami/bluetooth/profile/channel/module/contact/request/BtRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/contact/IResponseCallback;", "g", "Ljava/util/Map;", "requests", "h", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "i", "Lkotlin/Lazy;", "getContactApi", "()Lcom/huami/bluetooth/profile/channel/module/contact/ContactApi;", "contactApi", "", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ContactModule extends BaseModule {
    private static final int j = 20;
    private static final int k = 0;
    private static final long l = 3000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Map<BtRequest, IResponseCallback> requests;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private DataTransferCallback interceptor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy contactApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/contact/ContactApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ContactApi> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ContactApi invoke() {
            return ContactModule.this.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            byte bFirst = ArraysKt___ArraysKt.first(channelResponse.getData());
            Map map = ContactModule.this.requests;
            ContactModule contactModule = ContactModule.this;
            for (Map.Entry entry : map.entrySet()) {
                BtRequest btRequest = (BtRequest) entry.getKey();
                IResponseCallback iResponseCallback = (IResponseCallback) entry.getValue();
                if (bFirst == btRequest.getAcceptedResponseTag()) {
                    iResponseCallback.onResult(channelResponse.getData());
                    contactModule.requests.remove(btRequest);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/contact/bean/VersionInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.contact.ContactModule$initContactApi$version$1", f = "ContactModule.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super VersionInfo>, Object> {
        public int a;
        public final /* synthetic */ ContactImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContactImpl contactImpl, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = contactImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super VersionInfo> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ContactImpl contactImpl = this.b;
                this.a = 1;
                obj = contactImpl.queryVersion(this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.contact.ContactModule", f = "ContactModule.kt", i = {}, l = {69, 74}, m = "sendRequest", n = {}, s = {})
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
            return ContactModule.this.sendRequest(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/contact/request/BtResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.contact.ContactModule$sendRequest$3", f = "ContactModule.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BtResponse>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<byte[]> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CompletableDeferred<byte[]> completableDeferred, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super BtResponse> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<byte[]> completableDeferred = this.b;
                this.a = 1;
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
            return new BtResponse(true, (byte[]) obj);
        }
    }

    public ContactModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.requests = new LinkedHashMap();
        this.contactApi = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactApi c() throws ProtocolNotSupportException {
        ContactImpl contactImpl = new ContactImpl(this);
        VersionInfo versionInfo = (VersionInfo) kotlinx.coroutines.d.b(null, new c(contactImpl, null), 1, null);
        if (versionInfo.getVersion() >= 0) {
            return contactImpl;
        }
        throw new ProtocolNotSupportException(Intrinsics.stringPlus("ContactModule not support this version ", versionInfo));
    }

    @NotNull
    public final ContactApi getContactApi() {
        return (ContactApi) this.contactApi.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 20;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, 20, false, new b(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendRequest(@NotNull BtRequest btRequest, @NotNull Continuation<? super BtResponse> continuation) {
        d dVar;
        CompletableDeferred completableDeferred;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.d = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objWithTimeout = dVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    completableDeferred = (CompletableDeferred) dVar.a;
                    ResultKt.throwOnFailure(objWithTimeout);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objWithTimeout);
                }
                return (BtResponse) objWithTimeout;
            }
            ResultKt.throwOnFailure(objWithTimeout);
            final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            this.requests.put(btRequest, new IResponseCallback() { // from class: com.huami.bluetooth.profile.channel.module.contact.ContactModule.sendRequest.2
                @Override // com.huami.bluetooth.profile.channel.module.contact.IResponseCallback
                public void onResult(@NotNull byte[] result) {
                    DataTransferCallback dataTransferCallback = ContactModule.this.interceptor;
                    if (dataTransferCallback != null) {
                        dataTransferCallback.onReceive(result);
                    }
                    completableDeferredCompletableDeferred$default.complete(result);
                }
            });
            DataTransferCallback dataTransferCallback = this.interceptor;
            if (dataTransferCallback != null) {
                dataTransferCallback.onSend(btRequest.getByteArray());
            }
            byte[] byteArray = btRequest.getByteArray();
            dVar.a = completableDeferredCompletableDeferred$default;
            dVar.d = 1;
            Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, byteArray, 0, false, dVar, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            objWithTimeout = objSendDataWithResult$default;
            completableDeferred = completableDeferredCompletableDeferred$default;
            if (!((Boolean) objWithTimeout).booleanValue()) {
                return new BtResponse(false, null, 2, null);
            }
            e eVar = new e(completableDeferred, null);
            dVar.a = null;
            dVar.d = 2;
            objWithTimeout = TimeoutKt.withTimeout(3000L, eVar, dVar);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (BtResponse) objWithTimeout;
        } catch (Exception unused) {
            return new BtResponse(false, null, 2, null);
        }
    }

    public final void setInterceptor(@NotNull DataTransferCallback interceptor) {
        this.interceptor = interceptor;
    }
}
