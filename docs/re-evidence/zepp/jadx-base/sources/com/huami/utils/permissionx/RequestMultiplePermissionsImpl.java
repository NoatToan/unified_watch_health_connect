package com.huami.utils.permissionx;

import android.app.Activity;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ5\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/huami/utils/permissionx/RequestMultiplePermissionsImpl;", "Lcom/huami/utils/permissionx/RequestMultiplePermissions;", "Lcom/huami/utils/permissionx/MultiplePermissionRationale;", "", "", "permissions", "", "Lcom/huami/utils/permissionx/PermissionResult;", "a", "(Lcom/huami/utils/permissionx/MultiplePermissionRationale;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/utils/permissionx/AppSettingsRationale;", "appSetting", "b", "(Lcom/huami/utils/permissionx/AppSettingsRationale;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAndRequest", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestPermission", "Lcom/huami/utils/permissionx/PlatformApi;", "Lcom/huami/utils/permissionx/PlatformApi;", "platformApi", "Lcom/huami/utils/permissionx/MultiplePermissionRationale;", "rationale", "c", "Lcom/huami/utils/permissionx/AppSettingsRationale;", "appSettingRationale", "<init>", "(Lcom/huami/utils/permissionx/PlatformApi;Lcom/huami/utils/permissionx/MultiplePermissionRationale;Lcom/huami/utils/permissionx/AppSettingsRationale;)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class RequestMultiplePermissionsImpl implements RequestMultiplePermissions {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PlatformApi platformApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final MultiplePermissionRationale rationale;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final AppSettingsRationale appSettingRationale;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.RequestMultiplePermissionsImpl", f = "MultiplePermissions.kt", i = {0}, l = {29, 30, 33, 39}, m = "checkAndRequest", n = {"it"}, s = {"L$2"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return RequestMultiplePermissionsImpl.this.checkAndRequest(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.RequestMultiplePermissionsImpl", f = "MultiplePermissions.kt", i = {0, 0}, l = {60, 83}, m = "requestPermission", n = {"this", "permissions"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return RequestMultiplePermissionsImpl.this.requestPermission(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.RequestMultiplePermissionsImpl", f = "MultiplePermissions.kt", i = {0, 0}, l = {44, 50}, m = "requestWithRationale", n = {"this", "permissions"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return RequestMultiplePermissionsImpl.this.a(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.RequestMultiplePermissionsImpl$requestWithRationale$showResult$1", f = "MultiplePermissions.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ MultiplePermissionRationale b;
        public final /* synthetic */ RequestMultiplePermissionsImpl c;
        public final /* synthetic */ List<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MultiplePermissionRationale multiplePermissionRationale, RequestMultiplePermissionsImpl requestMultiplePermissionsImpl, List<String> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = multiplePermissionRationale;
            this.c = requestMultiplePermissionsImpl;
            this.d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Logger logger = LoggerKt.getLogger();
                if (logger != null) {
                    logger.info("展示说明弹框 ... ");
                }
                MultiplePermissionRationale multiplePermissionRationale = this.b;
                Activity activity = this.c.platformApi.getActivity();
                List<String> list = this.d;
                this.a = 1;
                obj = multiplePermissionRationale.showRationale(activity, list, this);
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
    @DebugMetadata(c = "com.huami.utils.permissionx.RequestMultiplePermissionsImpl", f = "MultiplePermissions.kt", i = {0, 0, 1, 1}, l = {104, 110}, m = "showAndNavigationAppDetailsSetting", n = {"this", "permissions", "this", "permissions"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return RequestMultiplePermissionsImpl.this.b(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.RequestMultiplePermissionsImpl$showAndNavigationAppDetailsSetting$showResult$1", f = "MultiplePermissions.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ AppSettingsRationale b;
        public final /* synthetic */ RequestMultiplePermissionsImpl c;
        public final /* synthetic */ List<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AppSettingsRationale appSettingsRationale, RequestMultiplePermissionsImpl requestMultiplePermissionsImpl, List<String> list, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = appSettingsRationale;
            this.c = requestMultiplePermissionsImpl;
            this.d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AppSettingsRationale appSettingsRationale = this.b;
                Activity activity = this.c.platformApi.getActivity();
                List<String> list = this.d;
                this.a = 1;
                obj = appSettingsRationale.showAppSettingRationale(activity, list, this);
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

    public RequestMultiplePermissionsImpl(@NotNull PlatformApi platformApi, @Nullable MultiplePermissionRationale multiplePermissionRationale, @Nullable AppSettingsRationale appSettingsRationale) {
        this.platformApi = platformApi;
        this.rationale = multiplePermissionRationale;
        this.appSettingRationale = appSettingsRationale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(MultiplePermissionRationale multiplePermissionRationale, List<String> list, Continuation<? super Map<String, ? extends PermissionResult>> continuation) throws Throwable {
        c cVar;
        RequestMultiplePermissionsImpl requestMultiplePermissionsImpl;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.e = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objWithContext = cVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                list = (List) cVar.b;
                requestMultiplePermissionsImpl = (RequestMultiplePermissionsImpl) cVar.a;
                ResultKt.throwOnFailure(objWithContext);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
            }
        }
        ResultKt.throwOnFailure(objWithContext);
        MainCoroutineDispatcher main = Dispatchers.getMain();
        d dVar = new d(multiplePermissionRationale, this, list, null);
        cVar.a = this;
        cVar.b = list;
        cVar.e = 1;
        objWithContext = BuildersKt.withContext(main, dVar, cVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        requestMultiplePermissionsImpl = this;
        boolean zBooleanValue = ((Boolean) objWithContext).booleanValue();
        Logger logger = LoggerKt.getLogger();
        if (logger != null) {
            logger.info(Intrinsics.stringPlus("用户在权限说明弹框决策是否同意申请权限：", Boxing.boxBoolean(zBooleanValue)));
        }
        if (zBooleanValue) {
            cVar.a = null;
            cVar.b = null;
            cVar.e = 2;
            objWithContext = requestMultiplePermissionsImpl.requestPermission(list, cVar);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, PermissionResult.RationaleDenied.INSTANCE);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(AppSettingsRationale appSettingsRationale, List<String> list, Continuation<? super Map<String, ? extends PermissionResult>> continuation) throws Throwable {
        e eVar;
        List<String> list2;
        RequestMultiplePermissionsImpl requestMultiplePermissionsImpl;
        LinkedHashMap linkedHashMap;
        Logger logger;
        Iterator<T> it2;
        Map.Entry entry;
        Object obj;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.e = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objWithContext = eVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                List<String> list3 = (List) eVar.b;
                RequestMultiplePermissionsImpl requestMultiplePermissionsImpl2 = (RequestMultiplePermissionsImpl) eVar.a;
                ResultKt.throwOnFailure(objWithContext);
                requestMultiplePermissionsImpl = requestMultiplePermissionsImpl2;
                list2 = list3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) eVar.b;
                requestMultiplePermissionsImpl = (RequestMultiplePermissionsImpl) eVar.a;
                ResultKt.throwOnFailure(objWithContext);
            }
            logger = LoggerKt.getLogger();
            if (logger != null) {
                logger.info("用户从 App 详情页返回至 App 中 ...");
            }
            Map<String, Boolean> mapIsAllGranted = requestMultiplePermissionsImpl.platformApi.isAllGranted(list2);
            linkedHashMap = new LinkedHashMap(q.mapCapacity(mapIsAllGranted.size()));
            it2 = mapIsAllGranted.entrySet().iterator();
            while (it2.hasNext()) {
                entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                if (((Boolean) entry.getValue()).booleanValue()) {
                    obj = PermissionResult.Granted.INSTANCE;
                } else {
                    obj = PermissionResult.AppSettingCancel.INSTANCE;
                }
                linkedHashMap.put(key, obj);
            }
            return linkedHashMap;
        }
        ResultKt.throwOnFailure(objWithContext);
        Logger logger2 = LoggerKt.getLogger();
        if (logger2 != null) {
            logger2.info("展示进入 App 详情页的弹框 ...");
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        f fVar = new f(appSettingsRationale, this, list, null);
        eVar.a = this;
        eVar.b = list;
        eVar.e = 1;
        objWithContext = BuildersKt.withContext(main, fVar, eVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        list2 = list;
        requestMultiplePermissionsImpl = this;
        if (((Boolean) objWithContext).booleanValue()) {
            Logger logger3 = LoggerKt.getLogger();
            if (logger3 != null) {
                logger3.info("调转至 App 详情页 ...");
            }
            PlatformApi platformApi = requestMultiplePermissionsImpl.platformApi;
            eVar.a = requestMultiplePermissionsImpl;
            eVar.b = list2;
            eVar.e = 2;
            if (platformApi.navigationAppDetailsSetting(eVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            logger = LoggerKt.getLogger();
            if (logger != null) {
                logger.info("用户从 App 详情页返回至 App 中 ...");
            }
            Map<String, Boolean> mapIsAllGranted2 = requestMultiplePermissionsImpl.platformApi.isAllGranted(list2);
            linkedHashMap = new LinkedHashMap(q.mapCapacity(mapIsAllGranted2.size()));
            it2 = mapIsAllGranted2.entrySet().iterator();
            while (it2.hasNext()) {
                entry = (Map.Entry) it2.next();
                Object key2 = entry.getKey();
                if (((Boolean) entry.getValue()).booleanValue()) {
                    obj = PermissionResult.Granted.INSTANCE;
                } else {
                    obj = PermissionResult.AppSettingCancel.INSTANCE;
                }
                linkedHashMap.put(key2, obj);
            }
        } else {
            Logger logger4 = LoggerKt.getLogger();
            if (logger4 != null) {
                logger4.info("用户拒绝进入 App 详情页");
            }
            Map<String, Boolean> mapIsAllGranted3 = requestMultiplePermissionsImpl.platformApi.isAllGranted(list2);
            linkedHashMap = new LinkedHashMap(q.mapCapacity(mapIsAllGranted3.size()));
            Iterator<T> it3 = mapIsAllGranted3.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it3.next();
                linkedHashMap.put(entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue() ? PermissionResult.Granted.INSTANCE : PermissionResult.AppSettingDenied.INSTANCE);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.utils.permissionx.RequestMultiplePermissions
    @Nullable
    public Object checkAndRequest(@NotNull List<String> list, @NotNull Continuation<? super Map<String, ? extends PermissionResult>> continuation) throws Throwable {
        a aVar;
        RequestMultiplePermissionsImpl requestMultiplePermissionsImpl;
        List<String> list2;
        MultiplePermissionRationale multiplePermissionRationale;
        Logger logger;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objRequestPermission = aVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(objRequestPermission);
                    return (Map) objRequestPermission;
                }
                if (i2 == 3) {
                    ResultKt.throwOnFailure(objRequestPermission);
                    return (Map) objRequestPermission;
                }
                if (i2 == 4) {
                    ResultKt.throwOnFailure(objRequestPermission);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            multiplePermissionRationale = (MultiplePermissionRationale) aVar.c;
            list2 = (List) aVar.b;
            requestMultiplePermissionsImpl = (RequestMultiplePermissionsImpl) aVar.a;
            ResultKt.throwOnFailure(objRequestPermission);
            if (((Boolean) objRequestPermission).booleanValue()) {
                aVar.a = null;
                aVar.b = null;
                aVar.c = null;
                aVar.f = 2;
                objRequestPermission = requestMultiplePermissionsImpl.a(multiplePermissionRationale, list2, aVar);
                if (objRequestPermission == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (Map) objRequestPermission;
            }
            logger = LoggerKt.getLogger();
            if (logger != null) {
                logger.info("不需要展示说明弹框，直接请求系统权限 ...");
            }
            aVar.a = null;
            aVar.b = null;
            aVar.c = null;
            aVar.f = 3;
            objRequestPermission = requestMultiplePermissionsImpl.requestPermission(list2, aVar);
            if (objRequestPermission == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (Map) objRequestPermission;
        }
        ResultKt.throwOnFailure(objRequestPermission);
        Map<String, Boolean> mapIsAllGranted = this.platformApi.isAllGranted(list);
        Logger logger2 = LoggerKt.getLogger();
        if (logger2 != null) {
            logger2.info(Intrinsics.stringPlus("check permissions result: ", mapIsAllGranted));
        }
        if (!mapIsAllGranted.containsValue(Boxing.boxBoolean(false))) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(q.mapCapacity(mapIsAllGranted.size()));
            Iterator<T> it2 = mapIsAllGranted.entrySet().iterator();
            while (it2.hasNext()) {
                linkedHashMap.put(((Map.Entry) it2.next()).getKey(), PermissionResult.Granted.INSTANCE);
            }
            return linkedHashMap;
        }
        MultiplePermissionRationale multiplePermissionRationale2 = this.rationale;
        if (multiplePermissionRationale2 == null) {
            Logger logger3 = LoggerKt.getLogger();
            if (logger3 != null) {
                logger3.info("未配置了权限说明弹框逻辑, 直接请求系统权限...");
            }
            aVar.f = 4;
            objRequestPermission = requestPermission(list, aVar);
            return objRequestPermission == coroutine_suspended ? coroutine_suspended : objRequestPermission;
        }
        Logger logger4 = LoggerKt.getLogger();
        if (logger4 != null) {
            logger4.info("配置了权限说明弹框逻辑，检查是否需要展示弹框 ... ");
        }
        Activity activity = this.platformApi.getActivity();
        aVar.a = this;
        aVar.b = list;
        aVar.c = multiplePermissionRationale2;
        aVar.f = 1;
        Object objShouldShowRationale = multiplePermissionRationale2.shouldShowRationale(activity, list, aVar);
        if (objShouldShowRationale == coroutine_suspended) {
            return coroutine_suspended;
        }
        requestMultiplePermissionsImpl = this;
        list2 = list;
        multiplePermissionRationale = multiplePermissionRationale2;
        objRequestPermission = objShouldShowRationale;
        if (((Boolean) objRequestPermission).booleanValue()) {
            aVar.a = null;
            aVar.b = null;
            aVar.c = null;
            aVar.f = 2;
            objRequestPermission = requestMultiplePermissionsImpl.a(multiplePermissionRationale, list2, aVar);
            if (objRequestPermission == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (Map) objRequestPermission;
        }
        logger = LoggerKt.getLogger();
        if (logger != null) {
            logger.info("不需要展示说明弹框，直接请求系统权限 ...");
        }
        aVar.a = null;
        aVar.b = null;
        aVar.c = null;
        aVar.f = 3;
        objRequestPermission = requestMultiplePermissionsImpl.requestPermission(list2, aVar);
        if (objRequestPermission == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (Map) objRequestPermission;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @VisibleForTesting
    @Nullable
    public final Object requestPermission(@NotNull List<String> list, @NotNull Continuation<? super Map<String, ? extends PermissionResult>> continuation) throws Throwable {
        b bVar;
        RequestMultiplePermissionsImpl requestMultiplePermissionsImpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.e = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objRequestMultiplePermission = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                list = (List) bVar.b;
                requestMultiplePermissionsImpl = (RequestMultiplePermissionsImpl) bVar.a;
                ResultKt.throwOnFailure(objRequestMultiplePermission);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRequestMultiplePermission);
            }
        }
        ResultKt.throwOnFailure(objRequestMultiplePermission);
        Logger logger = LoggerKt.getLogger();
        if (logger != null) {
            logger.info("请求系统权限 ...");
        }
        PlatformApi platformApi = this.platformApi;
        bVar.a = this;
        bVar.b = list;
        bVar.e = 1;
        objRequestMultiplePermission = platformApi.requestMultiplePermission(list, bVar);
        if (objRequestMultiplePermission == coroutine_suspended) {
            return coroutine_suspended;
        }
        requestMultiplePermissionsImpl = this;
        Map map = (Map) objRequestMultiplePermission;
        boolean z = false;
        if (!map.containsValue(Boxing.boxBoolean(false))) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(q.mapCapacity(map.size()));
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                linkedHashMap.put(((Map.Entry) it2.next()).getKey(), PermissionResult.Granted.INSTANCE);
            }
            return linkedHashMap;
        }
        Logger logger2 = LoggerKt.getLogger();
        if (logger2 != null) {
            logger2.info("包含未同意的权限 ...");
        }
        if (!(!requestMultiplePermissionsImpl.platformApi.shouldShowRationale(list))) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(q.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap2.put(entry.getKey(), ((Boolean) entry.getValue()).booleanValue() ? PermissionResult.Granted.INSTANCE : new PermissionResult.SystemDenied(false));
            }
            return linkedHashMap2;
        }
        Logger logger3 = LoggerKt.getLogger();
        if (logger3 != null) {
            logger3.info("包含不再询问的未同意的权限 ...");
        }
        AppSettingsRationale appSettingsRationale = requestMultiplePermissionsImpl.appSettingRationale;
        if (appSettingsRationale != null && appSettingsRationale.shouldShowAppSettingRationale(requestMultiplePermissionsImpl.platformApi.getActivity(), list)) {
            z = true;
        }
        if (z) {
            AppSettingsRationale appSettingsRationale2 = requestMultiplePermissionsImpl.appSettingRationale;
            bVar.a = null;
            bVar.b = null;
            bVar.e = 2;
            objRequestMultiplePermission = requestMultiplePermissionsImpl.b(appSettingsRationale2, list, bVar);
            return objRequestMultiplePermission == coroutine_suspended ? coroutine_suspended : objRequestMultiplePermission;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(q.mapCapacity(map.size()));
        for (Map.Entry entry2 : map.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue() ? PermissionResult.Granted.INSTANCE : new PermissionResult.SystemDenied(true));
        }
        return linkedHashMap3;
    }
}
