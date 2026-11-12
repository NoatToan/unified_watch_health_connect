package com.huami.utils.permissionx.business;

import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import com.huami.utils.permissionx.AppSettingsRationale;
import com.huami.utils.permissionx.Logger;
import com.huami.utils.permissionx.LoggerKt;
import com.huami.utils.permissionx.MultiplePermissionRationale;
import com.huami.utils.permissionx.PermissionKvData;
import com.huami.utils.permissionx.PermissionResult;
import com.huami.utils.permissionx.PermissionX;
import com.huami.utils.permissionx.PlatformApiImpl;
import com.huami.utils.permissionx.dsl.RequestMultiplePermissionDsl;
import com.huami.utils.permissionx.dsl.RequestPermissionDsl;
import com.huami.watch.notification.TransportUri;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001aA\u0010\u0010\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0002\u001aQ\u0010\u0014\u001a\u00020\n*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001aG\u0010\u0015\u001a\u00020\n*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0002\u001aK\u0010\u0016\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001aQ\u0010\u0017\u001a\u00020\n*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u001a&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0002¨\u0006\u001b"}, d2 = {"Landroidx/activity/ComponentActivity;", "", PointCategory.PERMISSION, "code", "Lcom/huami/utils/permissionx/business/PermissionsRationaleWithCode;", "showRationale", "Lcom/huami/utils/permissionx/business/AppSettingsRationaleWithCode;", "appSetting", "Lkotlin/Function1;", "Lcom/huami/utils/permissionx/dsl/RequestPermissionDsl;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "withPermission", "Lcom/huami/utils/permissionx/MultiplePermissionRationale;", "Lcom/huami/utils/permissionx/AppSettingsRationale;", "b", "", "permissions", "Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "withPermissions", "c", "withPermissionOnlyOnce", "withPermissionsOnlyOnce", "", "Lcom/huami/utils/permissionx/PermissionResult;", "a", "permissionx_release"}, k = 2, mv = {1, 5, 1})
public final class PermissionXKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.business.PermissionXKt$withPermissionInternal$1", f = "PermissionX.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ComponentActivity c;
        public final /* synthetic */ MultiplePermissionRationale d;
        public final /* synthetic */ AppSettingsRationale e;
        public final /* synthetic */ Function1<RequestPermissionDsl, Unit> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, ComponentActivity componentActivity, MultiplePermissionRationale multiplePermissionRationale, AppSettingsRationale appSettingsRationale, Function1<? super RequestPermissionDsl, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = componentActivity;
            this.d = multiplePermissionRationale;
            this.e = appSettingsRationale;
            this.f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PermissionX permissionX = PermissionX.INSTANCE;
                String str = this.b;
                ComponentActivity componentActivity = this.c;
                ActivityResultRegistry activityResultRegistry = componentActivity.getActivityResultRegistry();
                MultiplePermissionRationale multiplePermissionRationale = this.d;
                AppSettingsRationale appSettingsRationale = this.e;
                this.a = 1;
                obj = permissionX.awaitCheckAndRequest(str, componentActivity, activityResultRegistry, multiplePermissionRationale, appSettingsRationale, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RequestPermissionDsl requestPermissionDsl = new RequestPermissionDsl((PermissionResult) obj);
            this.f.invoke(requestPermissionDsl);
            requestPermissionDsl.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<RequestMultiplePermissionDsl, Unit> {
        public final /* synthetic */ Function1<RequestPermissionDsl, Unit> a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/utils/permissionx/PermissionResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Map<String, ? extends PermissionResult>, Unit> {
            public final /* synthetic */ Function1<RequestPermissionDsl, Unit> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super RequestPermissionDsl, Unit> function1) {
                super(1);
                this.a = function1;
            }

            public final void a(@NotNull Map<String, ? extends PermissionResult> map) {
                RequestPermissionDsl requestPermissionDsl = new RequestPermissionDsl((PermissionResult) CollectionsKt.first(map.values()));
                this.a.invoke(requestPermissionDsl);
                requestPermissionDsl.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends PermissionResult> map) {
                a(map);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super RequestPermissionDsl, Unit> function1) {
            super(1);
            this.a = function1;
        }

        public final void a(@NotNull RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            requestMultiplePermissionDsl.onAllPermissionResult(new a(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RequestMultiplePermissionDsl requestMultiplePermissionDsl) {
            a(requestMultiplePermissionDsl);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.business.PermissionXKt$withPermissionsInternal$1", f = "PermissionX.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<String> b;
        public final /* synthetic */ ComponentActivity c;
        public final /* synthetic */ MultiplePermissionRationale d;
        public final /* synthetic */ AppSettingsRationale e;
        public final /* synthetic */ Function1<RequestMultiplePermissionDsl, Unit> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<String> list, ComponentActivity componentActivity, MultiplePermissionRationale multiplePermissionRationale, AppSettingsRationale appSettingsRationale, Function1<? super RequestMultiplePermissionDsl, Unit> function1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = list;
            this.c = componentActivity;
            this.d = multiplePermissionRationale;
            this.e = appSettingsRationale;
            this.f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, this.d, this.e, this.f, continuation);
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
                PermissionX permissionX = PermissionX.INSTANCE;
                List<String> list = this.b;
                ComponentActivity componentActivity = this.c;
                ActivityResultRegistry activityResultRegistry = componentActivity.getActivityResultRegistry();
                MultiplePermissionRationale multiplePermissionRationale = this.d;
                AppSettingsRationale appSettingsRationale = this.e;
                this.a = 1;
                obj = permissionX.awaitRequestMultiple(list, componentActivity, activityResultRegistry, multiplePermissionRationale, appSettingsRationale, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RequestMultiplePermissionDsl requestMultiplePermissionDsl = new RequestMultiplePermissionDsl((Map) obj);
            this.f.invoke(requestMultiplePermissionDsl);
            requestMultiplePermissionDsl.invoke();
            return Unit.INSTANCE;
        }
    }

    private static final Map<String, PermissionResult> a(ComponentActivity componentActivity, List<String> list) {
        Map<String, Boolean> mapIsAllGranted = new PlatformApiImpl(componentActivity, componentActivity.getActivityResultRegistry()).isAllGranted(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap(q.mapCapacity(mapIsAllGranted.size()));
        Iterator<T> it2 = mapIsAllGranted.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), ((Boolean) entry.getValue()).booleanValue() ? PermissionResult.Granted.INSTANCE : new PermissionResult.SystemDenied(true));
        }
        return linkedHashMap;
    }

    private static final void b(ComponentActivity componentActivity, String str, MultiplePermissionRationale multiplePermissionRationale, AppSettingsRationale appSettingsRationale, Function1<? super RequestPermissionDsl, Unit> function1) {
        e.f(LifecycleOwnerKt.getLifecycleScope(componentActivity), null, null, new a(str, componentActivity, multiplePermissionRationale, appSettingsRationale, function1, null), 3, null);
    }

    private static final void c(ComponentActivity componentActivity, List<String> list, MultiplePermissionRationale multiplePermissionRationale, AppSettingsRationale appSettingsRationale, Function1<? super RequestMultiplePermissionDsl, Unit> function1) {
        e.f(LifecycleOwnerKt.getLifecycleScope(componentActivity), null, null, new c(list, componentActivity, multiplePermissionRationale, appSettingsRationale, function1, null), 3, null);
    }

    public static final void withPermission(@NotNull ComponentActivity componentActivity, @NotNull String str, @NotNull String str2, @Nullable PermissionsRationaleWithCode permissionsRationaleWithCode, @Nullable AppSettingsRationaleWithCode appSettingsRationaleWithCode, @NotNull Function1<? super RequestPermissionDsl, Unit> function1) {
        b(componentActivity, str, permissionsRationaleWithCode != null ? new MultiplePermissionRationaleWithCodeWrapper(str2, permissionsRationaleWithCode) : null, appSettingsRationaleWithCode != null ? new AppSettingsRationaleWithCodeWrapper(str2, appSettingsRationaleWithCode) : null, function1);
    }

    public static /* synthetic */ void withPermission$default(ComponentActivity componentActivity, String str, String str2, PermissionsRationaleWithCode permissionsRationaleWithCode, AppSettingsRationaleWithCode appSettingsRationaleWithCode, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            permissionsRationaleWithCode = PermissionX.INSTANCE.getDefaultPermissionsRationaleWithCode();
        }
        PermissionsRationaleWithCode permissionsRationaleWithCode2 = permissionsRationaleWithCode;
        if ((i & 8) != 0) {
            appSettingsRationaleWithCode = PermissionX.INSTANCE.getDefaultAppSettingsRationaleWithCode();
        }
        withPermission(componentActivity, str, str2, permissionsRationaleWithCode2, appSettingsRationaleWithCode, function1);
    }

    public static final void withPermissionOnlyOnce(@NotNull ComponentActivity componentActivity, @NotNull String str, @NotNull String str2, @Nullable PermissionsRationaleWithCode permissionsRationaleWithCode, @Nullable AppSettingsRationaleWithCode appSettingsRationaleWithCode, @NotNull Function1<? super RequestPermissionDsl, Unit> function1) {
        withPermissionsOnlyOnce(componentActivity, kotlin.collections.e.listOf(str), str2, permissionsRationaleWithCode, appSettingsRationaleWithCode, new b(function1));
    }

    public static /* synthetic */ void withPermissionOnlyOnce$default(ComponentActivity componentActivity, String str, String str2, PermissionsRationaleWithCode permissionsRationaleWithCode, AppSettingsRationaleWithCode appSettingsRationaleWithCode, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            permissionsRationaleWithCode = PermissionX.INSTANCE.getDefaultPermissionsRationaleWithCode();
        }
        PermissionsRationaleWithCode permissionsRationaleWithCode2 = permissionsRationaleWithCode;
        if ((i & 8) != 0) {
            appSettingsRationaleWithCode = PermissionX.INSTANCE.getDefaultAppSettingsRationaleWithCode();
        }
        withPermissionOnlyOnce(componentActivity, str, str2, permissionsRationaleWithCode2, appSettingsRationaleWithCode, function1);
    }

    public static final void withPermissions(@NotNull ComponentActivity componentActivity, @NotNull List<String> list, @NotNull String str, @Nullable PermissionsRationaleWithCode permissionsRationaleWithCode, @Nullable AppSettingsRationaleWithCode appSettingsRationaleWithCode, @NotNull Function1<? super RequestMultiplePermissionDsl, Unit> function1) {
        c(componentActivity, list, permissionsRationaleWithCode != null ? new MultiplePermissionRationaleWithCodeWrapper(str, permissionsRationaleWithCode) : null, appSettingsRationaleWithCode != null ? new AppSettingsRationaleWithCodeWrapper(str, appSettingsRationaleWithCode) : null, function1);
    }

    public static /* synthetic */ void withPermissions$default(ComponentActivity componentActivity, List list, String str, PermissionsRationaleWithCode permissionsRationaleWithCode, AppSettingsRationaleWithCode appSettingsRationaleWithCode, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            permissionsRationaleWithCode = PermissionX.INSTANCE.getDefaultPermissionsRationaleWithCode();
        }
        PermissionsRationaleWithCode permissionsRationaleWithCode2 = permissionsRationaleWithCode;
        if ((i & 8) != 0) {
            appSettingsRationaleWithCode = PermissionX.INSTANCE.getDefaultAppSettingsRationaleWithCode();
        }
        withPermissions(componentActivity, list, str, permissionsRationaleWithCode2, appSettingsRationaleWithCode, function1);
    }

    public static final void withPermissionsOnlyOnce(@NotNull ComponentActivity componentActivity, @NotNull List<String> list, @NotNull String str, @Nullable PermissionsRationaleWithCode permissionsRationaleWithCode, @Nullable AppSettingsRationaleWithCode appSettingsRationaleWithCode, @NotNull Function1<? super RequestMultiplePermissionDsl, Unit> function1) {
        if (PermissionKvData.INSTANCE.shouldShowRationaleOnlyOnce(str)) {
            c(componentActivity, list, permissionsRationaleWithCode != null ? new MultiplePermissionRationaleWithCodeWrapper(str, permissionsRationaleWithCode) : null, appSettingsRationaleWithCode != null ? new AppSettingsRationaleWithCodeWrapper(str, appSettingsRationaleWithCode) : null, function1);
            return;
        }
        Logger logger = LoggerKt.getLogger();
        if (logger != null) {
            logger.info("============== PermissionX ==============");
        }
        Map<String, PermissionResult> mapA = a(componentActivity, list);
        Logger logger2 = LoggerKt.getLogger();
        if (logger2 != null) {
            logger2.info(Intrinsics.stringPlus("检查权限：\n", mapA));
        }
        RequestMultiplePermissionDsl requestMultiplePermissionDsl = new RequestMultiplePermissionDsl(mapA);
        function1.invoke(requestMultiplePermissionDsl);
        requestMultiplePermissionDsl.invoke();
        Logger logger3 = LoggerKt.getLogger();
        if (logger3 == null) {
            return;
        }
        logger3.info("全局只申请一次，只检查权限状态，不请求权限");
    }

    public static /* synthetic */ void withPermissionsOnlyOnce$default(ComponentActivity componentActivity, List list, String str, PermissionsRationaleWithCode permissionsRationaleWithCode, AppSettingsRationaleWithCode appSettingsRationaleWithCode, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            permissionsRationaleWithCode = PermissionX.INSTANCE.getDefaultPermissionsRationaleWithCode();
        }
        PermissionsRationaleWithCode permissionsRationaleWithCode2 = permissionsRationaleWithCode;
        if ((i & 8) != 0) {
            appSettingsRationaleWithCode = PermissionX.INSTANCE.getDefaultAppSettingsRationaleWithCode();
        }
        withPermissionsOnlyOnce(componentActivity, list, str, permissionsRationaleWithCode2, appSettingsRationaleWithCode, function1);
    }
}
