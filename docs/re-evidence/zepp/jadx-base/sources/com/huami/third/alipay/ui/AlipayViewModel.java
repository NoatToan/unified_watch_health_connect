package com.huami.third.alipay.ui;

import android.app.Activity;
import android.text.TextUtils;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.third.alipay.AlipaySource;
import com.huami.third.alipay.ApiResult;
import com.huami.third.alipay.AuthInfo;
import com.huami.third.alipay.AuthResult;
import com.huami.third.alipay.UploadResult;
import com.huami.third.alipay.UserInfo;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J&\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002R!\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/third/alipay/ui/AlipayViewModel;", "Landroidx/lifecycle/ViewModel;", "", "userId", "appId", "", "checkAuth", "", "status", "", "isAuthorized", "authString", "Landroid/app/Activity;", "activity", "auth", "nickName", "revokeAuth", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/third/alipay/AuthInfo;", "a", "Landroidx/lifecycle/MutableLiveData;", "getCheckAuthLiveData", "()Landroidx/lifecycle/MutableLiveData;", "checkAuthLiveData", "Lcom/huami/third/alipay/UserInfo;", "b", "getUserInfoLiveData", "userInfoLiveData", "c", "getAuthLiveData", "authLiveData", GoogleApiAvailabilityLight.a, "getRevokeAuthLiveData", "revokeAuthLiveData", "Lcom/huami/third/alipay/AlipaySource;", "e", "Lcom/huami/third/alipay/AlipaySource;", "alipaySource", "<init>", "(Lcom/huami/third/alipay/AlipaySource;)V", "Companion", "alipay-ui_release"}, k = 1, mv = {1, 4, 1})
public final class AlipayViewModel extends ViewModel {
    public static final int AUTHORIZED = 1;

    @NotNull
    public static final String TAG = "AlipayViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<AuthInfo> checkAuthLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<UserInfo> userInfoLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<UserInfo> authLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> revokeAuthLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AlipaySource alipaySource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.third.alipay.ui.AlipayViewModel$auth$1", f = "AlipayViewModel.kt", i = {1}, l = {65, 78}, m = "invokeSuspend", n = {"authResult"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ String d;
        public final /* synthetic */ Activity e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        /* JADX INFO: renamed from: com.huami.third.alipay.ui.AlipayViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class C0615a extends Lambda implements Function0<String> {
            public static final C0615a a = new C0615a();

            public C0615a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "alipay授权失败";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "alipay授权失败";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "alipay授权失败";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/third/alipay/AuthResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.third.alipay.ui.AlipayViewModel$auth$1$authResult$1", f = "AlipayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AuthResult>, Object> {
            public int a;

            public d(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return a.this.new d(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AuthResult> continuation) {
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
                AlipaySource alipaySource = AlipayViewModel.this.alipaySource;
                a aVar = a.this;
                return alipaySource.auth(aVar.d, aVar.e);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/third/alipay/UploadResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/huami/third/alipay/ui/AlipayViewModel$auth$1$3$uploadResult$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.third.alipay.ui.AlipayViewModel$auth$1$3$uploadResult$1", f = "AlipayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UploadResult>, Object> {
            public int a;
            public final /* synthetic */ String b;
            public final /* synthetic */ a c;
            public final /* synthetic */ AuthResult d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str, Continuation continuation, a aVar, AuthResult authResult) {
                super(2, continuation);
                this.b = str;
                this.c = aVar;
                this.d = authResult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new e(this.b, continuation, this.c, this.d);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UploadResult> continuation) {
                return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AlipaySource alipaySource = AlipayViewModel.this.alipaySource;
                String host = AlipayHolder.INSTANCE.getHost();
                a aVar = this.c;
                ApiResult<UploadResult> apiResultUploadAuthCode = alipaySource.uploadAuthCode(host, aVar.f, aVar.g, this.b);
                if (apiResultUploadAuthCode != null) {
                    return apiResultUploadAuthCode.getData();
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Activity activity, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.d = str;
            this.e = activity;
            this.f = str2;
            this.g = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlipayViewModel.this.new a(this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0098  */
        /* JADX WARN: Code duplicated, block: B:39:0x009e  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            AuthResult authResult;
            UploadResult uploadResult;
            String userId;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    authResult = (AuthResult) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                uploadResult = (UploadResult) obj;
                if (uploadResult != null) {
                    userId = authResult.getUserId();
                    if (userId != null) {
                        AlipayViewModel.this.getAuthLiveData().setValue(new UserInfo(userId, uploadResult.getNickName()));
                    }
                } else {
                    HMLog.info$default(null, c.a, 1, null);
                    AlipayViewModel.this.getAuthLiveData().setValue(null);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            d dVar = new d(null);
            this.b = 1;
            obj = BuildersKt.withContext(io2, dVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            AuthResult authResult2 = (AuthResult) obj;
            if (authResult2 != null && TextUtils.equals(authResult2.getCom.alipay.sdk.m.u.l.a java.lang.String(), "9000") && TextUtils.equals(authResult2.getResultCode(), "200")) {
                String str = authResult2.getCom.huami.passport.Configs.Params.AUTHCODE java.lang.String();
                if (str == null || str.length() == 0) {
                    HMLog.info$default(null, b.a, 1, null);
                    AlipayViewModel.this.getAuthLiveData().setValue(null);
                } else {
                    String str2 = authResult2.getCom.huami.passport.Configs.Params.AUTHCODE java.lang.String();
                    if (str2 != null) {
                        CoroutineDispatcher io3 = Dispatchers.getIO();
                        e eVar = new e(str2, null, this, authResult2);
                        this.a = authResult2;
                        this.b = 2;
                        Object objWithContext = BuildersKt.withContext(io3, eVar, this);
                        if (objWithContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        authResult = authResult2;
                        obj = objWithContext;
                        uploadResult = (UploadResult) obj;
                        if (uploadResult != null) {
                            userId = authResult.getUserId();
                            if (userId != null) {
                                AlipayViewModel.this.getAuthLiveData().setValue(new UserInfo(userId, uploadResult.getNickName()));
                            }
                        } else {
                            HMLog.info$default(null, c.a, 1, null);
                            AlipayViewModel.this.getAuthLiveData().setValue(null);
                        }
                    }
                }
            } else {
                HMLog.info$default(null, C0615a.a, 1, null);
                AlipayViewModel.this.getAuthLiveData().setValue(null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "检查alipay授权状态";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "alipay撤销授权";
        }
    }

    /* JADX INFO: renamed from: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2", f = "AlipayViewModel.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/third/alipay/ApiResult;", "Lcom/huami/third/alipay/AuthInfo;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$1", f = "AlipayViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<AuthInfo>>, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object a;
            public int b;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = AnonymousClass2.this.new a(continuation);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FlowCollector<? super ApiResult<AuthInfo>> flowCollector, Continuation<? super Unit> continuation) {
                return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.a;
                    AlipaySource alipaySource = AlipayViewModel.this.alipaySource;
                    String host = AlipayHolder.INSTANCE.getHost();
                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                    ApiResult<AuthInfo> authInfo = alipaySource.getAuthInfo(host, anonymousClass2.c, anonymousClass2.d);
                    this.b = 1;
                    if (flowCollector.emit(authInfo, this) == coroutine_suspended) {
                        return coroutine_suspended;
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

        /* JADX INFO: renamed from: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/huami/third/alipay/ApiResult;", "Lcom/huami/third/alipay/AuthInfo;", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$2", f = "AlipayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<ApiResult<AuthInfo>, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object a;
            public int b;

            public b(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = AnonymousClass2.this.new b(continuation);
                bVar.a = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<AuthInfo> apiResult, Continuation<? super Unit> continuation) {
                return ((b) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) this.a;
                AlipayViewModel.this.getCheckAuthLiveData().setValue(apiResult != null ? (AuthInfo) apiResult.getData() : null);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$c */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isAuth", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$4", f = "AlipayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            private /* synthetic */ boolean a;
            public int b;

            /* JADX INFO: renamed from: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$c$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "alipay未授权";
                }
            }

            /* JADX INFO: renamed from: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$c$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "alipay已授权";
                }
            }

            public c(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                c cVar = new c(continuation);
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                cVar.a = bool.booleanValue();
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return ((c) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.a) {
                    HMLog.info(AlipayViewModel.TAG, b.a);
                    return Unit.INSTANCE;
                }
                HMLog.error$default(AlipayViewModel.TAG, null, null, a.a, 6, null);
                throw new RuntimeException("未授权");
            }
        }

        /* JADX INFO: renamed from: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$d */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/third/alipay/UserInfo;", "", "cause", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$6", f = "AlipayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Function3<FlowCollector<? super UserInfo>, Throwable, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object a;
            public int b;

            /* JADX INFO: renamed from: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$d$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return this.a.getMessage();
                }
            }

            public d(Continuation continuation) {
                super(3, continuation);
            }

            @NotNull
            public final Continuation<Unit> a(@NotNull FlowCollector<? super UserInfo> flowCollector, @NotNull Throwable th, @NotNull Continuation<? super Unit> continuation) {
                d dVar = AnonymousClass2.this.new d(continuation);
                dVar.a = th;
                return dVar;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super UserInfo> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return ((d) a(flowCollector, th, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.a;
                HMLog.error$default(AlipayViewModel.TAG, null, th, new a(th), 2, null);
                AlipayViewModel.this.getUserInfoLiveData().setValue(null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.c = str;
            this.d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlipayViewModel.this.new AnonymousClass2(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowFlowOn = FlowKt.flowOn(FlowKt.onEach(FlowKt.flowOn(FlowKt.flow(new a(null)), Dispatchers.getIO()), new b(null)), Dispatchers.getMain());
                final Flow flowOnEach = FlowKt.onEach(new Flow<Boolean>() { // from class: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull final FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flowFlowOn.collect(new FlowCollector<ApiResult<AuthInfo>>() { // from class: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$invokeSuspend$$inlined$map$1.2
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            @Nullable
                            public Object emit(ApiResult<AuthInfo> apiResult, @NotNull Continuation continuation2) {
                                AuthInfo data;
                                Integer numBoxInt;
                                ApiResult<AuthInfo> apiResult2 = apiResult;
                                Object objEmit = flowCollector.emit(Boxing.boxBoolean(AlipayViewModel.this.isAuthorized((apiResult2 == null || (data = apiResult2.getData()) == null || (numBoxInt = Boxing.boxInt(data.getStatus())) == null) ? 0 : numBoxInt.intValue())), continuation2);
                                return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                            }
                        }, continuation);
                        return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new c(null));
                Flow flowM4456catch = FlowKt.m4456catch(FlowKt.flowOn(new Flow<UserInfo>() { // from class: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$invokeSuspend$$inlined$map$2
                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull final FlowCollector<? super UserInfo> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flowOnEach.collect(new FlowCollector<Boolean>() { // from class: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$invokeSuspend$$inlined$map$2.2
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            @Nullable
                            public Object emit(Boolean bool, @NotNull Continuation continuation2) {
                                FlowCollector flowCollector2 = flowCollector;
                                bool.booleanValue();
                                AlipaySource alipaySource = AlipayViewModel.this.alipaySource;
                                String host = AlipayHolder.INSTANCE.getHost();
                                AlipayViewModel.AnonymousClass2 anonymousClass2 = this;
                                ApiResult<UserInfo> userInfo = alipaySource.getUserInfo(host, anonymousClass2.c, anonymousClass2.d);
                                Object objEmit = flowCollector2.emit(userInfo != null ? userInfo.getData() : null, continuation2);
                                return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                            }
                        }, continuation);
                        return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, Dispatchers.getIO()), new d(null));
                FlowCollector<UserInfo> flowCollector = new FlowCollector<UserInfo>() { // from class: com.huami.third.alipay.ui.AlipayViewModel$checkAuth$2$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(UserInfo userInfo, @NotNull Continuation continuation) {
                        AlipayViewModel.this.getUserInfoLiveData().setValue(userInfo);
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (flowM4456catch.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.third.alipay.ui.AlipayViewModel$revokeAuth$2", f = "AlipayViewModel.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.third.alipay.ui.AlipayViewModel$revokeAuth$2$1", f = "AlipayViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return d.this.new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
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
                AlipaySource alipaySource = AlipayViewModel.this.alipaySource;
                String host = AlipayHolder.INSTANCE.getHost();
                d dVar = d.this;
                return Boxing.boxBoolean(alipaySource.unbind(host, dVar.d, dVar.e, dVar.f));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, Continuation continuation) {
            super(2, continuation);
            this.d = str;
            this.e = str2;
            this.f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlipayViewModel.this.new d(this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<Boolean> revokeAuthLiveData = AlipayViewModel.this.getRevokeAuthLiveData();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(null);
                this.a = revokeAuthLiveData;
                this.b = 1;
                Object objWithContext = BuildersKt.withContext(io2, aVar, this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = revokeAuthLiveData;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.a;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.setValue(obj);
            return Unit.INSTANCE;
        }
    }

    public AlipayViewModel(@NotNull AlipaySource alipaySource) {
        this.alipaySource = alipaySource;
    }

    public final void auth(@NotNull String userId, @NotNull String appId, @NotNull String authString, @NotNull Activity activity) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new a(authString, activity, userId, appId, null), 3, null);
    }

    public final void checkAuth(@NotNull String userId, @NotNull String appId) {
        HMLog.info(TAG, b.a);
        e.f(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(userId, appId, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<UserInfo> getAuthLiveData() {
        return this.authLiveData;
    }

    @NotNull
    public final MutableLiveData<AuthInfo> getCheckAuthLiveData() {
        return this.checkAuthLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getRevokeAuthLiveData() {
        return this.revokeAuthLiveData;
    }

    @NotNull
    public final MutableLiveData<UserInfo> getUserInfoLiveData() {
        return this.userInfoLiveData;
    }

    public final boolean isAuthorized(int status) {
        return status == 1;
    }

    public final void revokeAuth(@NotNull String userId, @NotNull String appId, @NotNull String nickName) {
        HMLog.info(TAG, c.a);
        e.f(ViewModelKt.getViewModelScope(this), null, null, new d(userId, appId, nickName, null), 3, null);
    }
}
