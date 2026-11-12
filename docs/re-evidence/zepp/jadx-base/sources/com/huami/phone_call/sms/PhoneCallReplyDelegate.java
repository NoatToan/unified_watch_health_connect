package com.huami.phone_call.sms;

import androidx.core.content.ContextCompat;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyDelegate;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyModule;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyResult;
import com.huami.bluetooth.profile.channel.module.call_reply.SmsPermission;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0019\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\r\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/phone_call/sms/PhoneCallReplyDelegate;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyDelegate;", "Lorg/koin/core/component/KoinComponent;", "", "c", "", "phoneNo", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "msg", "", "requestCallReply", "requestSmsPermission", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", "a", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", "getApi", "()Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", "api", "Lcom/huami/phone_call/sms/PhoneCallSmsReplyFeature;", "b", "Lkotlin/Lazy;", "()Lcom/huami/phone_call/sms/PhoneCallSmsReplyFeature;", "callReplyFeature", "Lcom/huami/phone_call/sms/PhoneCallReplyAnalytics;", "()Lcom/huami/phone_call/sms/PhoneCallReplyAnalytics;", "analytics", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;)V", "Companion", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneCallReplyDelegate implements CallReplyDelegate, KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = "PhoneCallReplyDelegate";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CallReplyApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy callReplyFeature;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy analytics;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/phone_call/sms/PhoneCallReplyDelegate$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", PointCategory.INIT, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void init(@NotNull HMMiLiProDevice device) {
            CallReplyModule callReplyModule = (CallReplyModule) device.getChannelModule(CallReplyModule.class);
            DefaultConstructorMarker defaultConstructorMarker = null;
            CallReplyApi callReplyApiLoadApi = callReplyModule == null ? null : callReplyModule.loadApi();
            if (callReplyApiLoadApi == null) {
                return;
            }
            new PhoneCallReplyDelegate(callReplyApiLoadApi, defaultConstructorMarker);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "error", "Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<String, Job> {

        /* JADX INFO: renamed from: com.huami.phone_call.sms.PhoneCallReplyDelegate$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0539a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0539a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.phone_call.sms.PhoneCallReplyDelegate$requestCallReply$sendFailed$1$2", f = "PhoneCallReplyDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ PhoneCallReplyDelegate b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PhoneCallReplyDelegate phoneCallReplyDelegate, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = phoneCallReplyDelegate;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.getApi().sendReplyResult(ReplyResult.Failed.INSTANCE);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke(@NotNull String str) {
            HMLog.error$default(PhoneCallReplyDelegate.d, null, null, new C0539a(str), 6, null);
            return e.f(GlobalScope.INSTANCE, null, null, new b(PhoneCallReplyDelegate.this, null), 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.phone_call.sms.PhoneCallReplyDelegate$requestSmsPermission$1", f = "PhoneCallReplyDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ PhoneCallReplyDelegate a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PhoneCallReplyDelegate phoneCallReplyDelegate) {
                super(0);
                this.a = phoneCallReplyDelegate;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Permission granted: " + this.a.c();
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PhoneCallReplyDelegate.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info(PhoneCallReplyDelegate.d, new a(PhoneCallReplyDelegate.this));
            PhoneCallReplyDelegate.this.getApi().sendSmsPermission(PhoneCallReplyDelegate.this.c() ? SmsPermission.Authorized.INSTANCE : SmsPermission.Unauthorized.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PhoneCallReplyDelegate(CallReplyApi callReplyApi) {
        this.api = callReplyApi;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.callReplyFeature = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<PhoneCallSmsReplyFeature>() { // from class: com.huami.phone_call.sms.PhoneCallReplyDelegate$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.phone_call.sms.PhoneCallSmsReplyFeature, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PhoneCallSmsReplyFeature getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(PhoneCallSmsReplyFeature.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.analytics = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<PhoneCallReplyAnalytics>() { // from class: com.huami.phone_call.sms.PhoneCallReplyDelegate$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.phone_call.sms.PhoneCallReplyAnalytics, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PhoneCallReplyAnalytics getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(PhoneCallReplyAnalytics.class), objArr2, objArr3);
            }
        });
        callReplyApi.setReplyDelegate(this);
    }

    public /* synthetic */ PhoneCallReplyDelegate(CallReplyApi callReplyApi, DefaultConstructorMarker defaultConstructorMarker) {
        this(callReplyApi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneCallReplyAnalytics a() {
        return (PhoneCallReplyAnalytics) this.analytics.getValue();
    }

    private final PhoneCallSmsReplyFeature b() {
        return (PhoneCallSmsReplyFeature) this.callReplyFeature.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c() {
        return ContextCompat.checkSelfPermission(b().getContext(), "android.permission.SEND_SMS") == 0 && b().isFeatureEnable() && b().isEnable();
    }

    @JvmStatic
    public static final void init(@NotNull HMMiLiProDevice hMMiLiProDevice) {
        INSTANCE.init(hMMiLiProDevice);
    }

    @NotNull
    public final CallReplyApi getApi() {
        return this.api;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyDelegate
    public void requestCallReply(@NotNull String phoneNo, @NotNull final ReplyMsg msg) {
        a aVar = new a();
        if (phoneNo.length() == 0) {
            aVar.invoke("Invalid phone NO.! (" + phoneNo + ")");
            return;
        }
        if (!m.isBlank(msg.getContent())) {
            if (ContextCompat.checkSelfPermission(b().getContext(), "android.permission.SEND_SMS") != 0) {
                aVar.invoke("Send sms permission denied!");
                return;
            } else {
                SmsService.sendTextMessage$default(SmsService.INSTANCE.get(), phoneNo, msg.getContent(), new SmsService.Callback() { // from class: com.huami.phone_call.sms.PhoneCallReplyDelegate.requestCallReply.1

                    /* JADX INFO: renamed from: com.huami.phone_call.sms.PhoneCallReplyDelegate$requestCallReply$1$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public static final a a = new a();

                        public a() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "Call reply failed!";
                        }
                    }

                    /* JADX INFO: renamed from: com.huami.phone_call.sms.PhoneCallReplyDelegate$requestCallReply$1$b */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "com.huami.phone_call.sms.PhoneCallReplyDelegate$requestCallReply$1$onFailed$2", f = "PhoneCallReplyDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
                        public int a;
                        public final /* synthetic */ PhoneCallReplyDelegate b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public b(PhoneCallReplyDelegate phoneCallReplyDelegate, Continuation<? super b> continuation) {
                            super(2, continuation);
                            this.b = phoneCallReplyDelegate;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new b(this.b, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
                            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                            if (this.a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return this.b.getApi().sendReplyResult(ReplyResult.Failed.INSTANCE);
                        }
                    }

                    /* JADX INFO: renamed from: com.huami.phone_call.sms.PhoneCallReplyDelegate$requestCallReply$1$c */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class c extends Lambda implements Function0<String> {
                        public static final c a = new c();

                        public c() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "Call reply success!";
                        }
                    }

                    /* JADX INFO: renamed from: com.huami.phone_call.sms.PhoneCallReplyDelegate$requestCallReply$1$d */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "com.huami.phone_call.sms.PhoneCallReplyDelegate$requestCallReply$1$onSuccess$2", f = "PhoneCallReplyDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
                        public int a;
                        public final /* synthetic */ PhoneCallReplyDelegate b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public d(PhoneCallReplyDelegate phoneCallReplyDelegate, Continuation<? super d> continuation) {
                            super(2, continuation);
                            this.b = phoneCallReplyDelegate;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new d(this.b, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
                            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                            if (this.a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return this.b.getApi().sendReplyResult(ReplyResult.Success.INSTANCE);
                        }
                    }

                    @Override // com.huami.phone_call.sms.SmsService.Callback
                    public void onFailed(@Nullable Integer error) throws InterruptedException {
                        HMLog.info(PhoneCallReplyDelegate.d, a.a);
                        PhoneCallReplyDelegate.this.a().sendResult(msg.getContent(), false);
                        kotlinx.coroutines.d.b(null, new b(PhoneCallReplyDelegate.this, null), 1, null);
                    }

                    @Override // com.huami.phone_call.sms.SmsService.Callback
                    public void onSuccess() throws InterruptedException {
                        HMLog.info(PhoneCallReplyDelegate.d, c.a);
                        PhoneCallReplyDelegate.this.a().sendResult(msg.getContent(), true);
                        kotlinx.coroutines.d.b(null, new d(PhoneCallReplyDelegate.this, null), 1, null);
                    }
                }, null, 8, null);
                return;
            }
        }
        aVar.invoke("Invalid message body! (" + msg.getContent() + ")");
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyDelegate
    public void requestSmsPermission() {
        e.f(GlobalScope.INSTANCE, null, null, new b(null), 3, null);
    }
}
