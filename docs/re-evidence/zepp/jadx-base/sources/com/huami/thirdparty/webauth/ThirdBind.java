package com.huami.thirdparty.webauth;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.annotation.WorkerThread;
import androidx.appcompat.app.AlertDialog;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.reflect.TypeToken;
import com.huami.account.AccountStatEvent;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.thirdparty.webauth.client.Aqara;
import com.huami.thirdparty.webauth.client.AuthClient;
import com.huami.thirdparty.webauth.client.AuthUser;
import com.huami.thirdparty.webauth.client.MapMyFitness;
import com.huami.thirdparty.webauth.client.Relive;
import com.huami.thirdparty.webauth.client.RunKeeper;
import com.huami.thirdparty.webauth.client.Strava;
import com.huami.thirdparty.webauth.client.TrainingPeaks;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.Constant;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b:\u0010;J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007J:\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u0007H\u0007J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0012\"\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016JD\u0010\u001a\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00180\u0017J8\u0010\u001c\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u001c\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u0007H\u0007JQ\u0010$\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072*\u0010#\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\"0\u0012\"\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\"¢\u0006\u0004\b$\u0010%J \u0010)\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0007J\u0016\u0010+\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007J8\u0010,\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007R\u001d\u00101\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u00100R\u001d\u00105\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00106R\u0016\u00109\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00106¨\u0006<"}, d2 = {"Lcom/huami/thirdparty/webauth/ThirdBind;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", Constant.PAI_KEY_DAILY_PAI, "a", "", "name", AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "uid", "countryCode", "", "revokeAuth", "refreshToken", "region", "Lcom/huami/thirdparty/webauth/TokenInfo;", "getToken", "", "thirdNames", "", "getTokenList", "([Ljava/lang/String;)Ljava/util/List;", "Lkotlin/Function1;", "", "callback", "getTokenAutoRefresh", "tokenInfo", "checkNeedRefresh", "Lcom/huami/thirdparty/webauth/client/AuthClient;", "authClient", "accessToken", "Lcom/huami/thirdparty/webauth/client/AuthUser;", "getUser", "Lkotlin/Pair;", "pairs", "refreshEachToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V", "trackId", "deviceSource", "shareName", "shareSport", "state", "authStateChange", "autoShareDialog", "Lcom/huami/thirdparty/webauth/AuthSourceImpl;", "Lkotlin/Lazy;", "b", "()Lcom/huami/thirdparty/webauth/AuthSourceImpl;", "authSource", "Lcom/huami/thirdparty/webauth/ShareSourceImpl;", "c", "()Lcom/huami/thirdparty/webauth/ShareSourceImpl;", "shareSource", "Ljava/lang/String;", ThirdBind.AUTO_SHARE, GoogleApiAvailabilityLight.a, ThirdBind.UNAUTO_SHARE, "<init>", "()V", "webauth_release"}, k = 1, mv = {1, 4, 1})
public final class ThirdBind {

    @NotNull
    public static final ThirdBind INSTANCE = new ThirdBind();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Lazy authSource = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Lazy shareSource = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String AUTO_SHARE = "AUTO_SHARE";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String UNAUTO_SHARE = "UNAUTO_SHARE";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/thirdparty/webauth/AuthSourceImpl;", "a", "()Lcom/huami/thirdparty/webauth/AuthSourceImpl;"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<AuthSourceImpl> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AuthSourceImpl invoke() {
            return new AuthSourceImpl();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.thirdparty.webauth.ThirdBind$autoShareDialog$1$1", f = "ThirdBind.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return b.this.new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
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
                b bVar = b.this;
                thirdBind.revokeAuth(bVar.a, bVar.b, bVar.c, bVar.d);
                return Unit.INSTANCE;
            }
        }

        public b(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            UtilKt.launchCoroutine$default(Dispatchers.getIO(), null, new a(null), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c implements DialogInterface.OnClickListener {
        public final /* synthetic */ CheckBox a;
        public final /* synthetic */ String b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.thirdparty.webauth.ThirdBind$autoShareDialog$2$1", f = "ThirdBind.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Continuation continuation) {
                super(2, continuation);
                this.c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return c.this.new a(this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
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
                ThirdBind.INSTANCE.b().authStateChange(c.this.b, this.c);
                return Unit.INSTANCE;
            }
        }

        public c(CheckBox checkBox, String str) {
            this.a = checkBox;
            this.b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            UtilKt.launchCoroutine$default(Dispatchers.getIO(), null, new a(this.a.isChecked() ? ThirdBind.AUTO_SHARE : ThirdBind.UNAUTO_SHARE, null), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.thirdparty.webauth.ThirdBind$getTokenAutoRefresh$1", f = "ThirdBind.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ Function1 c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/thirdparty/webauth/TokenInfo;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        @DebugMetadata(c = "com.huami.thirdparty.webauth.ThirdBind$getTokenAutoRefresh$1$1", f = "ThirdBind.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TokenInfo>, Object> {
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
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TokenInfo> continuation) {
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
                AuthSourceImpl authSourceImplB = ThirdBind.INSTANCE.b();
                d dVar = d.this;
                return authSourceImplB.getTokenAutoRefresh(dVar.d, dVar.e, dVar.f, dVar.g, dVar.h);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, String str, String str2, String str3, String str4, String str5, Continuation continuation) {
            super(2, continuation);
            this.c = function1;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.c, this.d, this.e, this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Function1 function1;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1 function2 = this.c;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(null);
                this.a = function2;
                this.b = 1;
                Object objWithContext = BuildersKt.withContext(io2, aVar, this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.a;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/thirdparty/webauth/ShareSourceImpl;", "a", "()Lcom/huami/thirdparty/webauth/ShareSourceImpl;"}, k = 3, mv = {1, 4, 1})
    public static final class e extends Lambda implements Function0<ShareSourceImpl> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShareSourceImpl invoke() {
            return new ShareSourceImpl();
        }
    }

    private ThirdBind() {
    }

    private final int a(Context context, int dp) {
        return (int) TypedValue.applyDimension(1, dp, context.getResources().getDisplayMetrics());
    }

    public static /* synthetic */ void autoShareDialog$default(ThirdBind thirdBind, Context context, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            str4 = "";
        }
        thirdBind.autoShareDialog(context, i, str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthSourceImpl b() {
        return (AuthSourceImpl) authSource.getValue();
    }

    private final ShareSourceImpl c() {
        return (ShareSourceImpl) shareSource.getValue();
    }

    public static /* synthetic */ AuthUser getUser$default(ThirdBind thirdBind, AuthClient authClient, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return thirdBind.getUser(authClient, str);
    }

    public static /* synthetic */ boolean revokeAuth$default(ThirdBind thirdBind, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        return thirdBind.revokeAuth(str, str2, str3, str4);
    }

    public final boolean authStateChange(@NotNull String name, @NotNull String state) {
        return b().authStateChange(name, state);
    }

    public final void autoShareDialog(@NotNull Context context, int state, @NotNull String name, @NotNull String thirdName, @NotNull String uid, @NotNull String countryCode) {
        CheckBox checkBox = new CheckBox(context);
        checkBox.setText(context.getString(R.string.auto_upload));
        checkBox.setChecked(state == 1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView(checkBox);
        linearLayout.setGravity(17);
        ThirdBind thirdBind = INSTANCE;
        linearLayout.setPadding(0, thirdBind.a(context, 50), 0, thirdBind.a(context, 30));
        new AlertDialog.Builder(context).setCancelable(false).setView(linearLayout).setNegativeButton(context.getString(R.string.disconneect), new b(name, thirdName, uid, countryCode)).setPositiveButton(context.getString(R.string.save), new c(checkBox, name)).create().show();
    }

    @Nullable
    public final TokenInfo checkNeedRefresh(@NotNull TokenInfo tokenInfo, @NotNull String name, @NotNull String thirdName, @NotNull String uid, @NotNull String countryCode, @NotNull String region) {
        return b().checkNeedRefresh(tokenInfo, name, thirdName, uid, countryCode, region);
    }

    @WorkerThread
    @Nullable
    public final TokenInfo getToken(@NotNull String thirdName) {
        return b().getToken(thirdName);
    }

    public final void getTokenAutoRefresh(@NotNull String name, @NotNull String uid, @NotNull String thirdName, @NotNull String countryCode, @NotNull String region, @NotNull Function1<? super TokenInfo, Unit> callback) {
        UtilKt.launchCoroutine$default(null, null, new d(callback, name, uid, thirdName, countryCode, region, null), 3, null);
    }

    @NotNull
    public final List<TokenInfo> getTokenList(@NotNull String... thirdNames) {
        return b().getTokenList((String[]) Arrays.copyOf(thirdNames, thirdNames.length));
    }

    @WorkerThread
    @Nullable
    public final AuthUser getUser(@NotNull AuthClient authClient, @NotNull String accessToken) {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        Object objM3845constructorimpl3;
        Object objM3845constructorimpl4;
        Object objM3845constructorimpl5;
        Object objM3845constructorimpl6;
        Object obj = null;
        if (Intrinsics.areEqual(authClient, Strava.INSTANCE)) {
            AuthSourceImpl authSourceImplB = b();
            String userUrl = authClient.getUserUrl();
            try {
                HMLog.info(AuthSourceImpl.TAG, AuthSourceImpl.AnonymousClass1.INSTANCE);
                Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(authSourceImplB, userUrl, null, q.mapOf(TuplesKt.to("Authorization", "Bearer " + accessToken)), 2, null);
                try {
                    Result.Companion companion = Result.Companion;
                    ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
                    if (!responseHttpGet$default.isSuccessful()) {
                        objM3845constructorimpl6 = Result.m3845constructorimpl(null);
                        if (!Result.m3850isFailureimpl(objM3845constructorimpl6)) {
                        }
                        return (AuthUser) obj;
                    }
                    ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody = responseHttpGet$default.body();
                    if (responseBodyBody == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl6 = converter.convert(responseBodyBody, new TypeToken<Strava.User>() { // from class: com.huami.thirdparty.webauth.ThirdBind$getUser$$inlined$queryUser$1
                    }.getType());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl6 = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                obj = objM3845constructorimpl6;
            } catch (Exception e2) {
                HMLog.error$default(AuthSourceImpl.TAG, null, e2, AuthSourceImpl.AnonymousClass2.INSTANCE, 2, null);
            }
            return (AuthUser) obj;
        }
        if (Intrinsics.areEqual(authClient, RunKeeper.INSTANCE)) {
            AuthSourceImpl authSourceImplB2 = b();
            String userUrl2 = authClient.getUserUrl();
            try {
                HMLog.info(AuthSourceImpl.TAG, AuthSourceImpl.AnonymousClass1.INSTANCE);
                Response responseHttpGet$default2 = HttpKitKtxKt.httpGet$default(authSourceImplB2, userUrl2, null, q.mapOf(TuplesKt.to("Authorization", "Bearer " + accessToken)), 2, null);
                try {
                    Result.Companion companion3 = Result.Companion;
                    ConverterKt.checkToken(responseHttpGet$default2, ConverterKt.responseToJsonStr(responseHttpGet$default2));
                    if (!responseHttpGet$default2.isSuccessful()) {
                        objM3845constructorimpl5 = Result.m3845constructorimpl(null);
                        if (!Result.m3850isFailureimpl(objM3845constructorimpl5)) {
                        }
                        return (AuthUser) obj;
                    }
                    ResponseBodyConverter converter2 = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody2 = responseHttpGet$default2.body();
                    if (responseBodyBody2 == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl5 = converter2.convert(responseBodyBody2, new TypeToken<RunKeeper.User>() { // from class: com.huami.thirdparty.webauth.ThirdBind$getUser$$inlined$queryUser$2
                    }.getType());
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    objM3845constructorimpl5 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                }
                obj = objM3845constructorimpl5;
            } catch (Exception e3) {
                HMLog.error$default(AuthSourceImpl.TAG, null, e3, AuthSourceImpl.AnonymousClass2.INSTANCE, 2, null);
            }
            return (AuthUser) obj;
        }
        if (Intrinsics.areEqual(authClient, Relive.INSTANCE)) {
            AuthSourceImpl authSourceImplB3 = b();
            String userUrl3 = authClient.getUserUrl();
            try {
                HMLog.info(AuthSourceImpl.TAG, AuthSourceImpl.AnonymousClass1.INSTANCE);
                Response responseHttpGet$default3 = HttpKitKtxKt.httpGet$default(authSourceImplB3, userUrl3, null, q.mapOf(TuplesKt.to("Authorization", "Bearer " + accessToken)), 2, null);
                try {
                    Result.Companion companion5 = Result.Companion;
                    ConverterKt.checkToken(responseHttpGet$default3, ConverterKt.responseToJsonStr(responseHttpGet$default3));
                    if (!responseHttpGet$default3.isSuccessful()) {
                        objM3845constructorimpl4 = Result.m3845constructorimpl(null);
                        if (!Result.m3850isFailureimpl(objM3845constructorimpl4)) {
                        }
                        return (AuthUser) obj;
                    }
                    ResponseBodyConverter converter3 = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody3 = responseHttpGet$default3.body();
                    if (responseBodyBody3 == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl4 = converter3.convert(responseBodyBody3, new TypeToken<Relive.User>() { // from class: com.huami.thirdparty.webauth.ThirdBind$getUser$$inlined$queryUser$3
                    }.getType());
                } catch (Throwable th3) {
                    Result.Companion companion6 = Result.Companion;
                    objM3845constructorimpl4 = Result.m3845constructorimpl(ResultKt.createFailure(th3));
                }
                obj = objM3845constructorimpl4;
            } catch (Exception e4) {
                HMLog.error$default(AuthSourceImpl.TAG, null, e4, AuthSourceImpl.AnonymousClass2.INSTANCE, 2, null);
            }
            return (AuthUser) obj;
        }
        if (Intrinsics.areEqual(authClient, TrainingPeaks.INSTANCE)) {
            AuthSourceImpl authSourceImplB4 = b();
            String userUrl4 = authClient.getUserUrl();
            try {
                HMLog.info(AuthSourceImpl.TAG, AuthSourceImpl.AnonymousClass1.INSTANCE);
                Response responseHttpGet$default4 = HttpKitKtxKt.httpGet$default(authSourceImplB4, userUrl4, null, q.mapOf(TuplesKt.to("Authorization", "Bearer " + accessToken)), 2, null);
                try {
                    Result.Companion companion7 = Result.Companion;
                    ConverterKt.checkToken(responseHttpGet$default4, ConverterKt.responseToJsonStr(responseHttpGet$default4));
                    if (!responseHttpGet$default4.isSuccessful()) {
                        objM3845constructorimpl3 = Result.m3845constructorimpl(null);
                        if (!Result.m3850isFailureimpl(objM3845constructorimpl3)) {
                        }
                        return (AuthUser) obj;
                    }
                    ResponseBodyConverter converter4 = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody4 = responseHttpGet$default4.body();
                    if (responseBodyBody4 == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl3 = converter4.convert(responseBodyBody4, new TypeToken<TrainingPeaks.User>() { // from class: com.huami.thirdparty.webauth.ThirdBind$getUser$$inlined$queryUser$4
                    }.getType());
                } catch (Throwable th4) {
                    Result.Companion companion8 = Result.Companion;
                    objM3845constructorimpl3 = Result.m3845constructorimpl(ResultKt.createFailure(th4));
                }
                obj = objM3845constructorimpl3;
            } catch (Exception e5) {
                HMLog.error$default(AuthSourceImpl.TAG, null, e5, AuthSourceImpl.AnonymousClass2.INSTANCE, 2, null);
            }
            return (AuthUser) obj;
        }
        if (Intrinsics.areEqual(authClient, MapMyFitness.INSTANCE)) {
            AuthSourceImpl authSourceImplB5 = b();
            String userUrl5 = authClient.getUserUrl();
            try {
                HMLog.info(AuthSourceImpl.TAG, AuthSourceImpl.AnonymousClass1.INSTANCE);
                Response responseHttpGet$default5 = HttpKitKtxKt.httpGet$default(authSourceImplB5, userUrl5, null, q.mapOf(TuplesKt.to("Authorization", "Bearer " + accessToken)), 2, null);
                try {
                    Result.Companion companion9 = Result.Companion;
                    ConverterKt.checkToken(responseHttpGet$default5, ConverterKt.responseToJsonStr(responseHttpGet$default5));
                    if (!responseHttpGet$default5.isSuccessful()) {
                        objM3845constructorimpl2 = Result.m3845constructorimpl(null);
                        if (!Result.m3850isFailureimpl(objM3845constructorimpl2)) {
                        }
                        return (AuthUser) obj;
                    }
                    ResponseBodyConverter converter5 = HttpKitContext.INSTANCE.getConverter();
                    ResponseBody responseBodyBody5 = responseHttpGet$default5.body();
                    if (responseBodyBody5 == null) {
                        Intrinsics.throwNpe();
                    }
                    objM3845constructorimpl2 = converter5.convert(responseBodyBody5, new TypeToken<MapMyFitness.User>() { // from class: com.huami.thirdparty.webauth.ThirdBind$getUser$$inlined$queryUser$5
                    }.getType());
                } catch (Throwable th5) {
                    Result.Companion companion10 = Result.Companion;
                    objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th5));
                }
                obj = objM3845constructorimpl2;
            } catch (Exception e6) {
                HMLog.error$default(AuthSourceImpl.TAG, null, e6, AuthSourceImpl.AnonymousClass2.INSTANCE, 2, null);
            }
            return (AuthUser) obj;
        }
        if (!Intrinsics.areEqual(authClient, Aqara.INSTANCE)) {
            return null;
        }
        AuthSourceImpl authSourceImplB6 = b();
        String userUrl6 = authClient.getUserUrl();
        try {
            HMLog.info(AuthSourceImpl.TAG, AuthSourceImpl.AnonymousClass1.INSTANCE);
            Response responseHttpGet$default6 = HttpKitKtxKt.httpGet$default(authSourceImplB6, userUrl6, null, q.mapOf(TuplesKt.to("Authorization", "Bearer " + accessToken)), 2, null);
            try {
                Result.Companion companion11 = Result.Companion;
                ConverterKt.checkToken(responseHttpGet$default6, ConverterKt.responseToJsonStr(responseHttpGet$default6));
                if (!responseHttpGet$default6.isSuccessful()) {
                    objM3845constructorimpl = Result.m3845constructorimpl(null);
                    if (!Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    }
                    return (AuthUser) obj;
                }
                ResponseBodyConverter converter6 = HttpKitContext.INSTANCE.getConverter();
                ResponseBody responseBodyBody6 = responseHttpGet$default6.body();
                if (responseBodyBody6 == null) {
                    Intrinsics.throwNpe();
                }
                objM3845constructorimpl = converter6.convert(responseBodyBody6, new TypeToken<Aqara.User>() { // from class: com.huami.thirdparty.webauth.ThirdBind$getUser$$inlined$queryUser$6
                }.getType());
            } catch (Throwable th6) {
                Result.Companion companion12 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th6));
            }
            obj = objM3845constructorimpl;
        } catch (Exception e7) {
            HMLog.error$default(AuthSourceImpl.TAG, null, e7, AuthSourceImpl.AnonymousClass2.INSTANCE, 2, null);
        }
        return (AuthUser) obj;
    }

    public final void refreshEachToken(@NotNull String uid, @NotNull String countryCode, @NotNull String region, @NotNull Pair<String, String>... pairs) {
        b().refreshEachToken(uid, countryCode, region, (Pair[]) Arrays.copyOf(pairs, pairs.length));
    }

    @WorkerThread
    @Nullable
    public final TokenInfo refreshToken(@NotNull String name, @NotNull String uid, @NotNull String thirdName, @NotNull String countryCode, @NotNull String refreshToken, @NotNull String region) {
        return b().refreshToken(name, uid, thirdName, countryCode, refreshToken, region);
    }

    @WorkerThread
    public final boolean revokeAuth(@NotNull String name, @NotNull String thirdName, @NotNull String uid, @NotNull String countryCode) {
        return b().unbind(name, thirdName, uid, countryCode);
    }

    @WorkerThread
    public final boolean shareSport(@NotNull String trackId, @NotNull String deviceSource, @NotNull String shareName) {
        return c().shareSport(trackId, deviceSource, shareName);
    }
}
