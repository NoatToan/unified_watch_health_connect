package com.huami.thirdparty.webauth.ui;

import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.account.AccountStatEvent;
import com.huami.thirdparty.webauth.Param;
import com.huami.thirdparty.webauth.ParamKt;
import com.huami.thirdparty.webauth.ThirdBind;
import com.huami.thirdparty.webauth.ThirdBindKt;
import com.huami.thirdparty.webauth.TokenInfo;
import com.huami.thirdparty.webauth.client.AuthClient;
import com.huami.thirdparty.webauth.client.AuthUser;
import com.huami.thirdparty.webauth.client.Relive;
import com.huami.thirdparty.webauth.client.RunKeeper;
import com.huami.thirdparty.webauth.client.Strava;
import com.huami.thirdparty.webauth.client.TrainingPeaks;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J6\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u000eJ~\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u000628\b\u0002\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0014\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0014\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\f0\u0013JS\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0014\u0012\b\b\u000b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\f0\u0019J\u0016\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006R\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"¨\u0006*"}, d2 = {"Lcom/huami/thirdparty/webauth/ui/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/thirdparty/webauth/ui/AuthType;", "authType", "Lcom/huami/thirdparty/webauth/client/AuthClient;", "a", "", "uid", AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "countryCode", "region", "name", "", "checkStatus", "", "isAuthorized", "Landroidx/fragment/app/FragmentActivity;", "activity", "clientId", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "success", "accessToken", "authResult", "auth", "Lkotlin/Function1;", "result", "Lkotlinx/coroutines/Job;", "cancelAuth", "queryUser", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/thirdparty/webauth/TokenInfo;", "Landroidx/lifecycle/MutableLiveData;", "getTokenInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "tokenInfoLiveData", "Lcom/huami/thirdparty/webauth/client/AuthUser;", "b", "getAuthUserLiveData", "authUserLiveData", "<init>", "()V", "webauth-ui_release"}, k = 1, mv = {1, 4, 1})
public final class AuthViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TokenInfo> tokenInfoLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<AuthUser> authUserLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AuthType.Strava.ordinal()] = 1;
            iArr[AuthType.RunKeeper.ordinal()] = 2;
            iArr[AuthType.Relive.ordinal()] = 3;
            iArr[AuthType.TRAINING_PEAKS.ordinal()] = 4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "a", "(ZLjava/lang/String;)V"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function2<Boolean, String, Unit> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        public final void a(boolean z, @NotNull String str) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str) {
            a(bool.booleanValue(), str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/huami/thirdparty/webauth/Param$Builder;", "", "a", "(Lcom/huami/thirdparty/webauth/Param$Builder;)V"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function1<Param.Builder, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, String str4, String str5) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final void a(@NotNull Param.Builder builder) {
            builder.clientId(this.a);
            builder.uid(this.b);
            builder.countryCode(this.c);
            builder.region(this.d);
            builder.name(this.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Param.Builder builder) {
            a(builder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "accessToken", "expires", "refreshToken", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 3, mv = {1, 4, 1})
    public static final class c extends Lambda implements Function3<String, String, String, Unit> {
        public final /* synthetic */ Function2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function2 function2) {
            super(3);
            this.b = function2;
        }

        public final void a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            if (str == null || str3 == null || str2 == null) {
                this.b.invoke(Boolean.FALSE, "");
            } else {
                AuthViewModel.this.getTokenInfoLiveData().setValue(new TokenInfo(str, 1, str2, str3, null, 16, null));
                this.b.invoke(Boolean.TRUE, str);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
            a(str, str2, str3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.thirdparty.webauth.ui.AuthViewModel$cancelAuth$1", f = "AuthViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AuthType c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ Function1 h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.thirdparty.webauth.ui.AuthViewModel$cancelAuth$1$success$1", f = "AuthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;

            /* JADX INFO: renamed from: com.huami.thirdparty.webauth.ui.AuthViewModel$d$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/thirdparty/webauth/Param$Builder;", "", "a", "(Lcom/huami/thirdparty/webauth/Param$Builder;)V", "com/huami/thirdparty/webauth/ui/AuthViewModel$cancelAuth$1$success$1$authClient$1$1"}, k = 3, mv = {1, 4, 1})
            public static final class C0618a extends Lambda implements Function1<Param.Builder, Unit> {
                public C0618a() {
                    super(1);
                }

                public final void a(@NotNull Param.Builder builder) {
                    builder.uid(d.this.d);
                    builder.countryCode(d.this.e);
                    builder.name(d.this.f);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Param.Builder builder) {
                    a(builder);
                    return Unit.INSTANCE;
                }
            }

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
                d dVar = d.this;
                AuthClient authClientA = AuthViewModel.this.a(dVar.c);
                authClientA.setParam(ParamKt.param(new C0618a()));
                ThirdBind thirdBind = ThirdBind.INSTANCE;
                String name = d.this.f.length() == 0 ? authClientA.getName() : d.this.f;
                d dVar2 = d.this;
                return Boxing.boxBoolean(thirdBind.revokeAuth(name, dVar2.g, dVar2.d, dVar2.e));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AuthType authType, String str, String str2, String str3, String str4, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.c = authType;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AuthViewModel.this.new d(this.c, this.d, this.e, this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(null);
                this.a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                AuthViewModel.this.getTokenInfoLiveData().setValue(null);
            }
            this.h.invoke(Boxing.boxBoolean(zBooleanValue));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/thirdparty/webauth/Param$Builder;", "", "a", "(Lcom/huami/thirdparty/webauth/Param$Builder;)V", "com/huami/thirdparty/webauth/ui/AuthViewModel$checkStatus$authClient$1$1"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function1<Param.Builder, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final void a(@NotNull Param.Builder builder) {
            builder.uid(this.a);
            builder.countryCode(this.b);
            builder.name(this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Param.Builder builder) {
            a(builder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.thirdparty.webauth.ui.AuthViewModel$checkStatus$1", f = "AuthViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ String d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/thirdparty/webauth/TokenInfo;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.thirdparty.webauth.ui.AuthViewModel$checkStatus$1$1", f = "AuthViewModel.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TokenInfo>, Object> {
            public Object a;
            public int b;

            /* JADX INFO: renamed from: com.huami.thirdparty.webauth.ui.AuthViewModel$f$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/huami/thirdparty/webauth/TokenInfo;", "it", "", "a", "(Lcom/huami/thirdparty/webauth/TokenInfo;)V"}, k = 3, mv = {1, 4, 1})
            public static final class C0619a extends Lambda implements Function1<TokenInfo, Unit> {
                public final /* synthetic */ Continuation a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0619a(Continuation continuation) {
                    super(1);
                    this.a = continuation;
                }

                public final void a(@Nullable TokenInfo tokenInfo) {
                    Continuation continuation = this.a;
                    Result.Companion companion = Result.Companion;
                    continuation.resumeWith(Result.m3845constructorimpl(tokenInfo));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TokenInfo tokenInfo) {
                    a(tokenInfo);
                    return Unit.INSTANCE;
                }
            }

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return f.this.new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TokenInfo> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.a = this;
                    this.b = 1;
                    SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                    ThirdBind thirdBind = ThirdBind.INSTANCE;
                    boolean z = f.this.d.length() == 0;
                    f fVar = f.this;
                    String name = z ? ((AuthClient) fVar.e.element).getName() : fVar.d;
                    f fVar2 = f.this;
                    thirdBind.getTokenAutoRefresh(name, fVar2.f, fVar2.g, fVar2.h, fVar2.i, new C0619a(safeContinuation));
                    obj = safeContinuation.getOrThrow();
                    if (obj == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
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
        public f(String str, Ref.ObjectRef objectRef, String str2, String str3, String str4, String str5, Continuation continuation) {
            super(2, continuation);
            this.d = str;
            this.e = objectRef;
            this.f = str2;
            this.g = str3;
            this.h = str4;
            this.i = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AuthViewModel.this.new f(this.d, this.e, this.f, this.g, this.h, this.i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<TokenInfo> tokenInfoLiveData = AuthViewModel.this.getTokenInfoLiveData();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(null);
                this.a = tokenInfoLiveData;
                this.b = 1;
                Object objWithContext = BuildersKt.withContext(io2, aVar, this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = tokenInfoLiveData;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.thirdparty.webauth.ui.AuthViewModel$queryUser$1", f = "AuthViewModel.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ AuthType d;
        public final /* synthetic */ String e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/thirdparty/webauth/client/AuthUser;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.thirdparty.webauth.ui.AuthViewModel$queryUser$1$1", f = "AuthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AuthUser>, Object> {
            public int a;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return g.this.new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AuthUser> continuation) {
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
                ThirdBind thirdBind = ThirdBind.INSTANCE;
                g gVar = g.this;
                return thirdBind.getUser(AuthViewModel.this.a(gVar.d), g.this.e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AuthType authType, String str, Continuation continuation) {
            super(2, continuation);
            this.d = authType;
            this.e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AuthViewModel.this.new g(this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<AuthUser> authUserLiveData = AuthViewModel.this.getAuthUserLiveData();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(null);
                this.a = authUserLiveData;
                this.b = 1;
                Object objWithContext = BuildersKt.withContext(io2, aVar, this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = authUserLiveData;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthClient a(AuthType authType) {
        int i = WhenMappings.$EnumSwitchMapping$0[authType.ordinal()];
        if (i == 1) {
            return Strava.INSTANCE;
        }
        if (i == 2) {
            return RunKeeper.INSTANCE;
        }
        if (i == 3) {
            return Relive.INSTANCE;
        }
        if (i == 4) {
            return TrainingPeaks.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Job cancelAuth$default(AuthViewModel authViewModel, AuthType authType, String str, String str2, String str3, String str4, Function1 function1, int i, Object obj) {
        if ((i & 16) != 0) {
            str4 = "";
        }
        return authViewModel.cancelAuth(authType, str, str2, str3, str4, function1);
    }

    public final void auth(@NotNull FragmentActivity activity, @NotNull AuthType authType, @NotNull String clientId, @NotNull String uid, @NotNull String countryCode, @NotNull String region, @NotNull String name, @NotNull Function2<? super Boolean, ? super String, Unit> authResult) {
        ThirdBindKt.auth(a(authType), activity, ParamKt.param(new b(clientId, uid, countryCode, region, name)), new c(authResult));
    }

    @NotNull
    public final Job cancelAuth(@NotNull AuthType authType, @NotNull String thirdName, @NotNull String name, @NotNull String uid, @NotNull String countryCode, @NotNull Function1<? super Boolean, Unit> result) {
        return kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new d(authType, uid, countryCode, name, thirdName, result, null), 3, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.huami.thirdparty.webauth.client.AuthClient] */
    public final void checkStatus(@NotNull AuthType authType, @NotNull String uid, @NotNull String thirdName, @NotNull String countryCode, @NotNull String region, @NotNull String name) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? A = a(authType);
        A.setParam(ParamKt.param(new e(uid, countryCode, name)));
        Unit unit = Unit.INSTANCE;
        objectRef.element = A;
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new f(name, objectRef, uid, thirdName, countryCode, region, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<AuthUser> getAuthUserLiveData() {
        return this.authUserLiveData;
    }

    @NotNull
    public final MutableLiveData<TokenInfo> getTokenInfoLiveData() {
        return this.tokenInfoLiveData;
    }

    public final boolean isAuthorized() {
        if (this.tokenInfoLiveData.getValue() == null) {
            return false;
        }
        TokenInfo value = this.tokenInfoLiveData.getValue();
        return value != null ? value.isAuth() : false;
    }

    public final void queryUser(@NotNull AuthType authType, @NotNull String accessToken) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), null, null, new g(authType, accessToken, null), 3, null);
    }
}
