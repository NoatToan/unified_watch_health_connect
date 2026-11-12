package com.xiaomi.hm.health.thirdbind;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.cloud.api.AppSettingsAPI;
import com.xiaomi.hm.health.databases.model.HmProperty;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J3\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062#\u0010\u000e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010R\u0016\u0010\u0013\u001a\u00020\u00108\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001d\u0010'\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0015\u0010&¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/ThirdAuthManager;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/Job;", "syncAuthUrlSettings", "", StatEvent.TP_FIRST, "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/thirdbind/Result;", "Lkotlin/ParameterName;", "name", "data", "", "callback", "queryAuthorizeApps", "", "id", "navigateAuthDetail", "TAG", "Ljava/lang/String;", "a", "APPS_SETTINGS_AUTH_STOP", "APPS_SETTINGS_AUTH_PAGE", "", "b", LogUtil.I, DTransferConstants.PAGE, "c", "size", GoogleApiAvailabilityLight.a, "Z", "isLoadFinished", "e", "isLoading", "Lcom/xiaomi/hm/health/thirdbind/ThirdAuthApi;", "f", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/thirdbind/ThirdAuthApi;", "api", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ThirdAuthManager {

    @NotNull
    public static final String APPS_SETTINGS_AUTH_PAGE = "huami.thirdparty.oauth";

    @NotNull
    public static final String TAG = "ThirdAuthManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String APPS_SETTINGS_AUTH_STOP = "huami.thirdparty.oauth.stop";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int size = 20;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static boolean isLoadFinished;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static boolean isLoading;

    @NotNull
    public static final ThirdAuthManager INSTANCE = new ThirdAuthManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static int page = 1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Lazy api = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/ThirdAuthApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ThirdAuthApi> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ThirdAuthApi invoke() {
            return new ThirdAuthApi();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "huami.thirdparty.oauth.stop 为空，无法跳转";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "client_id 为空，无法跳转";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.ThirdAuthManager$queryAuthorizeApps$1", f = "ThirdAuthManager.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Result, Unit> b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/thirdbind/Result;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.ThirdAuthManager$queryAuthorizeApps$1$result$1", f = "ThirdAuthManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result>, Object> {
            public int a;
            private /* synthetic */ Object b;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.thirdbind.ThirdAuthManager$d$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C1015a extends Lambda implements Function0<String> {
                public final /* synthetic */ Throwable a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1015a(Throwable th) {
                    super(0);
                    this.a = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "queryAuthorizeApps error: " + this.a;
                }
            }

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Result> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM3845constructorimpl;
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                try {
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ThirdAuthManager.INSTANCE.a().query(ThirdAuthManager.page, 20));
                } catch (Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                    objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    HMLog.info(ThirdAuthManager.TAG, new C1015a(thM3848exceptionOrNullimpl));
                }
                if (kotlin.Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    return null;
                }
                return objM3845constructorimpl;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super Result, Unit> function1, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List<AuthorizeApp> items;
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
            Result result = (Result) obj;
            ThirdAuthManager thirdAuthManager = ThirdAuthManager.INSTANCE;
            boolean z = false;
            ThirdAuthManager.isLoading = false;
            if ((result == null || (items = result.getItems()) == null || !(items.isEmpty() ^ true)) ? false : true) {
                ThirdAuthManager.page++;
            }
            if (result != null && result.isFinished()) {
                z = true;
            }
            if (z) {
                ThirdAuthManager.isLoadFinished = true;
            }
            this.b.invoke(result);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.thirdbind.ThirdAuthManager$syncAuthUrlSettings$1", f = "ThirdAuthManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
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
            Map<String, String> appSettingsRange = AppSettingsAPI.getAppSettingsRange(this.b, "huami.thirdparty.oauth");
            ArrayList arrayList = new ArrayList(appSettingsRange.size());
            for (Map.Entry<String, String> entry : appSettingsRange.entrySet()) {
                arrayList.add(new HmProperty(entry.getKey(), entry.getValue(), Boxing.boxInt(1)));
            }
            HMPropertyUtil.setProperties(arrayList);
            return Unit.INSTANCE;
        }
    }

    private ThirdAuthManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThirdAuthApi a() {
        return (ThirdAuthApi) api.getValue();
    }

    @JvmStatic
    @NotNull
    public static final Job syncAuthUrlSettings(@NotNull Context context) {
        return kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new e(context, null), 2, null);
    }

    public final void navigateAuthDetail(@NotNull Context context, @Nullable String id) {
        String property = HMPropertyUtil.getProperty("huami.thirdparty.oauth.stop", "");
        if (property == null || m.isBlank(property)) {
            HMLog.info(TAG, b.a);
            return;
        }
        if (id == null || m.isBlank(id)) {
            HMLog.info(TAG, c.a);
            return;
        }
        WebHelper.launch$default(property + "?client_id=" + id, true, false, 4, null);
    }

    public final void queryAuthorizeApps(boolean first, @NotNull Function1<? super Result, Unit> callback) {
        if (first) {
            page = 1;
            isLoadFinished = false;
        }
        if (isLoadFinished || isLoading) {
            return;
        }
        isLoading = true;
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new d(callback, null), 2, null);
    }
}
