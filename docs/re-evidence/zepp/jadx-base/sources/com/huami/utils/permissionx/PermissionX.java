package com.huami.utils.permissionx;

import android.app.Activity;
import androidx.view.result.ActivityResultRegistry;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.utils.permissionx.business.AppSettingsRationaleWithCode;
import com.huami.utils.permissionx.business.PermissionsRationaleWithCode;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b;\u0010<JP\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0007Jb\u0010\u0016\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u001e\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u0015\u0012\u0004\u0012\u00020\u00100\u000eH\u0007J?\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JQ\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"Lcom/huami/utils/permissionx/PermissionX;", "", "", PointCategory.PERMISSION, "Landroid/app/Activity;", "activity", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lkotlinx/coroutines/CoroutineScope;", "lifecycleScope", "Lcom/huami/utils/permissionx/MultiplePermissionRationale;", "showRationale", "Lcom/huami/utils/permissionx/AppSettingsRationale;", "appSetting", "Lkotlin/Function1;", "Lcom/huami/utils/permissionx/PermissionResult;", "", "resultCallback", "checkAndRequest", "", "permissions", "", "checkAndRequestMultiple", "awaitCheckAndRequest", "(Ljava/lang/String;Landroid/app/Activity;Landroidx/activity/result/ActivityResultRegistry;Lcom/huami/utils/permissionx/MultiplePermissionRationale;Lcom/huami/utils/permissionx/AppSettingsRationale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitRequestMultiple", "(Ljava/util/List;Landroid/app/Activity;Landroidx/activity/result/ActivityResultRegistry;Lcom/huami/utils/permissionx/MultiplePermissionRationale;Lcom/huami/utils/permissionx/AppSettingsRationale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/utils/permissionx/Logger;", "a", "Lcom/huami/utils/permissionx/Logger;", "getLogger", "()Lcom/huami/utils/permissionx/Logger;", "setLogger", "(Lcom/huami/utils/permissionx/Logger;)V", "logger", "Lcom/huami/utils/permissionx/business/PermissionsRationaleWithCode;", "b", "Lcom/huami/utils/permissionx/business/PermissionsRationaleWithCode;", "getDefaultPermissionsRationaleWithCode", "()Lcom/huami/utils/permissionx/business/PermissionsRationaleWithCode;", "setDefaultPermissionsRationaleWithCode", "(Lcom/huami/utils/permissionx/business/PermissionsRationaleWithCode;)V", "defaultPermissionsRationaleWithCode", "Lcom/huami/utils/permissionx/business/AppSettingsRationaleWithCode;", "c", "Lcom/huami/utils/permissionx/business/AppSettingsRationaleWithCode;", "getDefaultAppSettingsRationaleWithCode", "()Lcom/huami/utils/permissionx/business/AppSettingsRationaleWithCode;", "setDefaultAppSettingsRationaleWithCode", "(Lcom/huami/utils/permissionx/business/AppSettingsRationaleWithCode;)V", "defaultAppSettingsRationaleWithCode", "Lcom/huami/utils/permissionx/PermissionRationaleConfig;", GoogleApiAvailabilityLight.a, "Lcom/huami/utils/permissionx/PermissionRationaleConfig;", "getRationalesConfig", "()Lcom/huami/utils/permissionx/PermissionRationaleConfig;", "setRationalesConfig", "(Lcom/huami/utils/permissionx/PermissionRationaleConfig;)V", "rationalesConfig", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class PermissionX {

    @NotNull
    public static final PermissionX INSTANCE = new PermissionX();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static Logger logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static PermissionsRationaleWithCode defaultPermissionsRationaleWithCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static AppSettingsRationaleWithCode defaultAppSettingsRationaleWithCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private static PermissionRationaleConfig rationalesConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.PermissionX", f = "PermissionX.kt", i = {}, l = {74}, m = "awaitCheckAndRequest", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return PermissionX.this.awaitCheckAndRequest(null, null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "", "Lcom/huami/utils/permissionx/PermissionResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.PermissionX$awaitRequestMultiple$2", f = "PermissionX.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends PermissionResult>>, Object> {
        public int a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ ActivityResultRegistry c;
        public final /* synthetic */ MultiplePermissionRationale d;
        public final /* synthetic */ AppSettingsRationale e;
        public final /* synthetic */ List<String> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, ActivityResultRegistry activityResultRegistry, MultiplePermissionRationale multiplePermissionRationale, AppSettingsRationale appSettingsRationale, List<String> list, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = activity;
            this.c = activityResultRegistry;
            this.d = multiplePermissionRationale;
            this.e = appSettingsRationale;
            this.f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Map<String, ? extends PermissionResult>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger logger = PermissionX.INSTANCE.getLogger();
                if (logger != null) {
                    logger.info("============== PermissionX ==============");
                }
                RequestMultiplePermissions requestMultiplePermissionsCreateRequestMultiple = FactoryKt.createRequestMultiple(this.b, this.c, this.d, this.e);
                List<String> list = this.f;
                this.a = 1;
                obj = requestMultiplePermissionsCreateRequestMultiple.checkAndRequest(list, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Map map = (Map) obj;
            PermissionX permissionX = PermissionX.INSTANCE;
            Logger logger2 = permissionX.getLogger();
            if (logger2 != null) {
                logger2.info(Intrinsics.stringPlus("检查或请求权限操作结束： ", map));
            }
            Logger logger3 = permissionX.getLogger();
            if (logger3 != null) {
                logger3.info("=========================================");
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
        public final /* synthetic */ Function1<PermissionResult, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super PermissionResult, Unit> function1) {
            super(1);
            this.a = function1;
        }

        public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
            this.a.invoke((PermissionResult) CollectionsKt.first(map.values()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
            a(map);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.PermissionX$checkAndRequestMultiple$1", f = "PermissionX.kt", i = {}, l = {106, 107}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<String> b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ ActivityResultRegistry d;
        public final /* synthetic */ MultiplePermissionRationale e;
        public final /* synthetic */ AppSettingsRationale f;
        public final /* synthetic */ Function1<Map<String, ? extends PermissionResult>, Unit> g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.utils.permissionx.PermissionX$checkAndRequestMultiple$1$1", f = "PermissionX.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function1<Map<String, ? extends PermissionResult>, Unit> b;
            public final /* synthetic */ Map<String, PermissionResult> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super Map<String, ? extends PermissionResult>, Unit> function1, Map<String, ? extends PermissionResult> map, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function1;
                this.c = map;
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
        public d(List<String> list, Activity activity, ActivityResultRegistry activityResultRegistry, MultiplePermissionRationale multiplePermissionRationale, AppSettingsRationale appSettingsRationale, Function1<? super Map<String, ? extends PermissionResult>, Unit> function1, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = list;
            this.c = activity;
            this.d = activityResultRegistry;
            this.e = multiplePermissionRationale;
            this.f = appSettingsRationale;
            this.g = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PermissionX permissionX = PermissionX.INSTANCE;
            List<String> list = this.b;
            Activity activity = this.c;
            ActivityResultRegistry activityResultRegistry = this.d;
            MultiplePermissionRationale multiplePermissionRationale = this.e;
            AppSettingsRationale appSettingsRationale = this.f;
            this.a = 1;
            obj = permissionX.awaitRequestMultiple(list, activity, activityResultRegistry, multiplePermissionRationale, appSettingsRationale, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.g, (Map) obj, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    private PermissionX() {
    }

    @JvmStatic
    public static final void checkAndRequest(@NotNull String permission, @NotNull Activity activity, @NotNull ActivityResultRegistry registry, @NotNull CoroutineScope lifecycleScope, @Nullable MultiplePermissionRationale showRationale, @Nullable AppSettingsRationale appSetting, @NotNull Function1<? super PermissionResult, Unit> resultCallback) {
        checkAndRequestMultiple(e.listOf(permission), activity, registry, lifecycleScope, showRationale, appSetting, new c(resultCallback));
    }

    @JvmStatic
    public static final void checkAndRequestMultiple(@NotNull List<String> permissions, @NotNull Activity activity, @NotNull ActivityResultRegistry registry, @NotNull CoroutineScope lifecycleScope, @Nullable MultiplePermissionRationale showRationale, @Nullable AppSettingsRationale appSetting, @NotNull Function1<? super Map<String, ? extends PermissionResult>, Unit> resultCallback) {
        kotlinx.coroutines.e.f(lifecycleScope, null, null, new d(permissions, activity, registry, showRationale, appSetting, resultCallback, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object awaitCheckAndRequest(@NotNull String str, @NotNull Activity activity, @NotNull ActivityResultRegistry activityResultRegistry, @Nullable MultiplePermissionRationale multiplePermissionRationale, @Nullable AppSettingsRationale appSettingsRationale, @NotNull Continuation<? super PermissionResult> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object objAwaitRequestMultiple = aVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitRequestMultiple);
            List<String> listListOf = e.listOf(str);
            aVar2.c = 1;
            objAwaitRequestMultiple = awaitRequestMultiple(listListOf, activity, activityResultRegistry, multiplePermissionRationale, appSettingsRationale, aVar2);
            if (objAwaitRequestMultiple == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitRequestMultiple);
        }
        return CollectionsKt.first(((Map) objAwaitRequestMultiple).values());
    }

    @Nullable
    public final Object awaitRequestMultiple(@NotNull List<String> list, @NotNull Activity activity, @NotNull ActivityResultRegistry activityResultRegistry, @Nullable MultiplePermissionRationale multiplePermissionRationale, @Nullable AppSettingsRationale appSettingsRationale, @NotNull Continuation<? super Map<String, ? extends PermissionResult>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(activity, activityResultRegistry, multiplePermissionRationale, appSettingsRationale, list, null), continuation);
    }

    @Nullable
    public final AppSettingsRationaleWithCode getDefaultAppSettingsRationaleWithCode() {
        return defaultAppSettingsRationaleWithCode;
    }

    @Nullable
    public final PermissionsRationaleWithCode getDefaultPermissionsRationaleWithCode() {
        return defaultPermissionsRationaleWithCode;
    }

    @Nullable
    public final Logger getLogger() {
        return logger;
    }

    @Nullable
    public final PermissionRationaleConfig getRationalesConfig() {
        return rationalesConfig;
    }

    public final void setDefaultAppSettingsRationaleWithCode(@Nullable AppSettingsRationaleWithCode appSettingsRationaleWithCode) {
        defaultAppSettingsRationaleWithCode = appSettingsRationaleWithCode;
    }

    public final void setDefaultPermissionsRationaleWithCode(@Nullable PermissionsRationaleWithCode permissionsRationaleWithCode) {
        defaultPermissionsRationaleWithCode = permissionsRationaleWithCode;
    }

    public final void setLogger(@Nullable Logger logger2) {
        logger = logger2;
    }

    public final void setRationalesConfig(@Nullable PermissionRationaleConfig permissionRationaleConfig) {
        rationalesConfig = permissionRationaleConfig;
    }
}
