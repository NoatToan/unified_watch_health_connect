package com.xiaomi.hm.health.device.setting.consts.webapi;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.components.bluetoothproxyserver.constants.HttpResponseStatus;
import com.tencent.connect.common.Constants;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+JG\u0010\u000f\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062#\u0010\u000e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bH\u0007J\b\u0010\u0010\u001a\u00020\tH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002JA\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u001aJA\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u001bJC\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010$\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0016\u0010%\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010)\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/consts/webapi/WebApi;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "bleDevice", "Ljava/util/Locale;", "local", "", "category", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "url", "", "callback", "loadH5Url", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "b", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "c", "source", Constants.PARAM_PLATFORM, com.xiaomi.market.sdk.Constants.JSON_VERSION, "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Ljava/util/Locale;ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;Ljava/util/Locale;ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "metaValue", "(Ljava/lang/String;Ljava/util/Locale;ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "tag", "webPostUrl", "TAG", GoogleApiAvailabilityLight.a, "PLATFORM_WATCH", "PLATFORM_ACTIVITY", "OS_DEFAULT", LogUtil.I, "OS_INTRODUCE", "CATEGORY_INSTRUCTION", "CATEGORY_ACTIVITY", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WebApi {
    public static final int CATEGORY_ACTIVITY = 1;
    public static final int CATEGORY_INSTRUCTION = 75;

    @NotNull
    public static final WebApi INSTANCE = new WebApi();
    public static final int OS_DEFAULT = 1;
    public static final int OS_INTRODUCE = 4;

    @NotNull
    public static final String PLATFORM_ACTIVITY = "activity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String tag = "WebApi";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String webPostUrl = "t/posts?";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "WebApi";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String PLATFORM_WATCH = "watch";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pnpInfo null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.consts.webapi.WebApi$loadH5Url$1", f = "WebApi.kt", i = {}, l = {55, 56}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ DeviceInfo b;
        public final /* synthetic */ Locale c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Function1<String, Unit> e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.consts.webapi.WebApi$loadH5Url$1$1", f = "WebApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function1<String, Unit> b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super String, Unit> function1, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function1;
                this.c = str;
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
                this.b.invoke(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(DeviceInfo deviceInfo, Locale locale, int i, Function1<? super String, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = deviceInfo;
            this.c = locale;
            this.d = i;
            this.e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
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
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WebApi webApi = WebApi.INSTANCE;
            DeviceInfo deviceInfo = this.b;
            Locale locale = this.c;
            int i2 = this.d;
            this.a = 1;
            obj = WebApi.loadH5Url$default(webApi, deviceInfo, locale, i2, (String) null, 0, this, 24, (Object) null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.e, (String) obj, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.consts.webapi.WebApi$loadH5Url$6, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.consts.webapi.WebApi$loadH5Url$6", f = "WebApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public int a;
        public final /* synthetic */ StringBuilder b;
        public final /* synthetic */ CountDownLatch c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.consts.webapi.WebApi$loadH5Url$6$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "url: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(StringBuilder sb, CountDownLatch countDownLatch, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.b = sb;
            this.c = countDownLatch;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass6(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws InterruptedException {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            String string = this.b.toString();
            HMLog.info("WebApi", new a(string));
            Support.RequestSupport requestSupport = Support.RequestSupport.GET;
            final CountDownLatch countDownLatch = this.c;
            HMWebUtil.doRequest(string, null, requestSupport, new IHMBasicHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.setting.consts.webapi.WebApi.loadH5Url.6.2

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.consts.webapi.WebApi$loadH5Url$6$2$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ int a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(int i) {
                        super(0);
                        this.a = i;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "onCancel: " + this.a;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.consts.webapi.WebApi$loadH5Url$6$2$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public static final b a = new b();

                    public b() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "onCompleted";
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.consts.webapi.WebApi$loadH5Url$6$2$c */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class c extends Lambda implements Function0<String> {
                    public final /* synthetic */ Throwable a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(Throwable th) {
                        super(0);
                        this.a = th;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "onError: " + this.a;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.consts.webapi.WebApi$loadH5Url$6$2$d */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class d extends Lambda implements Function0<String> {
                    public final /* synthetic */ HMHttpResponseData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public d(HMHttpResponseData hMHttpResponseData) {
                        super(0);
                        this.a = hMHttpResponseData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "onFailure: " + this.a;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.consts.webapi.WebApi$loadH5Url$6$2$e */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class e extends Lambda implements Function0<String> {
                    public final /* synthetic */ HMHttpResponseData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(HMHttpResponseData hMHttpResponseData) {
                        super(0);
                        this.a = hMHttpResponseData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "onSuccess: " + this.a;
                    }
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onCancel(int type) {
                    HMLog.info("WebApi", new a(type));
                    countDownLatch.countDown();
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onCompleted() {
                    HMLog.info("WebApi", b.a);
                    countDownLatch.countDown();
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onError(@Nullable Throwable throwable) {
                    HMLog.info("WebApi", new c(throwable));
                    countDownLatch.countDown();
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onFailure(@Nullable HMHttpResponseData item) {
                    HMLog.info("WebApi", new d(item));
                    objectRef.element = null;
                    countDownLatch.countDown();
                }

                /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onSuccess(@Nullable HMHttpResponseData item) {
                    HMLog.info("WebApi", new e(item));
                    if (item != null) {
                        try {
                            try {
                                if (item.getStatusCode() == HttpResponseStatus._200.getStatus()) {
                                    JSONObject jSONObject = new JSONObject(item.getResponseString());
                                    objectRef.element = jSONObject.optString("target");
                                }
                            } catch (Exception e2) {
                                HMLog.e("WebApi", e2);
                            }
                        } finally {
                            countDownLatch.countDown();
                        }
                    }
                }
            });
            this.c.await(3L, TimeUnit.SECONDS);
            return objectRef.element;
        }
    }

    private WebApi() {
    }

    private final String a() {
        if (Intrinsics.areEqual("unknown", DeviceXFunctionsKt.getAppStateApi().getAreaBySave())) {
            return Locale.getDefault().getCountry().toUpperCase(Locale.US);
        }
        String areaBySave = DeviceXFunctionsKt.getAppStateApi().getAreaBySave();
        Locale locale = Locale.US;
        Objects.requireNonNull(areaBySave, "null cannot be cast to non-null type java.lang.String");
        return areaBySave.toUpperCase(locale);
    }

    private final String b(HMDeviceSource deviceSource) {
        int[] pnp = deviceSource.getPnp();
        if (pnp == null) {
            HMLog.error$default("WebApi", null, null, a.a, 6, null);
            return null;
        }
        return pnp[0] + "." + pnp[1] + "." + deviceSource.getType().getValue() + "." + deviceSource.getValue();
    }

    private final String c(DeviceInfo deviceInfo) {
        return (deviceInfo.getProductId() == -1 ? "" : String.valueOf(deviceInfo.getProductId())) + "." + (deviceInfo.getProductVersion() != -1 ? String.valueOf(deviceInfo.getProductVersion()) : "") + "." + String.valueOf(deviceInfo.getDeviceSource().getType().getValue()) + "." + String.valueOf(deviceInfo.getDeviceSource().getValue());
    }

    @JvmStatic
    public static final void loadH5Url(@Nullable HMBaseDevice bleDevice, @NotNull Locale local, int category, @NotNull Function1<? super String, Unit> callback) {
        DeviceInfo deviceInfo = bleDevice == null ? null : bleDevice.getDeviceInfo();
        if (deviceInfo == null) {
            callback.invoke(null);
        } else {
            e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new b(deviceInfo, local, category, callback, null), 2, null);
        }
    }

    public static /* synthetic */ Object loadH5Url$default(WebApi webApi, HMDeviceSource hMDeviceSource, Locale locale, int i, String str, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            str = "watch";
        }
        return webApi.loadH5Url(hMDeviceSource, locale, i, str, (i3 & 16) != 0 ? 1 : i2, (Continuation<? super String>) continuation);
    }

    public static /* synthetic */ Object loadH5Url$default(WebApi webApi, DeviceInfo deviceInfo, Locale locale, int i, String str, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            str = "watch";
        }
        return webApi.loadH5Url(deviceInfo, locale, i, str, (i3 & 16) != 0 ? 1 : i2, (Continuation<? super String>) continuation);
    }

    public static /* synthetic */ Object loadH5Url$default(WebApi webApi, String str, Locale locale, int i, String str2, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            str2 = "watch";
        }
        return webApi.loadH5Url(str, locale, i, str2, (i3 & 16) != 0 ? 1 : i2, (Continuation<? super String>) continuation);
    }

    @Nullable
    public final Object loadH5Url(@NotNull HMDeviceSource hMDeviceSource, @NotNull Locale locale, int i, @NotNull String str, int i2, @NotNull Continuation<? super String> continuation) {
        return loadH5Url(b(hMDeviceSource), locale, i, str, i2, continuation);
    }

    @Nullable
    public final Object loadH5Url(@NotNull DeviceInfo deviceInfo, @NotNull Locale locale, int i, @NotNull String str, int i2, @NotNull Continuation<? super String> continuation) {
        return loadH5Url(c(deviceInfo), locale, i, str, i2, continuation);
    }

    @Nullable
    public final Object loadH5Url(@Nullable String str, @NotNull Locale locale, int i, @NotNull String str2, int i2, @NotNull Continuation<? super String> continuation) {
        String host = HMServerDef.getHost();
        StringBuilder sb = new StringBuilder();
        sb.append(host + webPostUrl);
        sb.append("platform=" + str2 + com.alipay.sdk.m.s.a.l);
        sb.append("meta_key=device&");
        sb.append("meta_value=" + str + com.alipay.sdk.m.s.a.l);
        sb.append("category=" + i + com.alipay.sdk.m.s.a.l);
        sb.append("lang=" + locale.toLanguageTag() + com.alipay.sdk.m.s.a.l);
        sb.append("country=" + INSTANCE.a() + com.alipay.sdk.m.s.a.l);
        sb.append("os=" + i2 + com.alipay.sdk.m.s.a.l);
        sb.append("userid=" + HMPersonInfo.getInstance().getUserInfo().getUserid());
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass6(sb, new CountDownLatch(1), null), continuation);
    }
}
