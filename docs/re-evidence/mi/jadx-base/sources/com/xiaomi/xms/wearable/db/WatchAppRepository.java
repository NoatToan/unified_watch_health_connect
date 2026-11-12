package com.xiaomi.xms.wearable.db;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.xms.wearable.auth.Permission;
import com.xiaomi.xms.wearable.db.WatchAppRepository;
import com.xiaomi.xms.wearable.db.dao.WatchAppCapabilityDao;
import com.xiaomi.xms.wearable.db.dao.WatchAppItemDao;
import com.xiaomi.xms.wearable.db.entity.WatchAppCapability;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import defpackage.lg1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\"\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00100\u0019J\u0016\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001c\u001a\u00020\u0012H\u0002J\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012J\u0016\u0010#\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%J\u0014\u0010&\u001a\u00020\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020!0\u0014J\u0016\u0010(\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010)\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010*\u001a\u00020\u001aJ\f\u0010+\u001a\b\u0012\u0004\u0012\u00020!0\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006-"}, d2 = {"Lcom/xiaomi/xms/wearable/db/WatchAppRepository;", "", "<init>", "()V", "appDao", "Lcom/xiaomi/xms/wearable/db/dao/WatchAppItemDao;", "getAppDao", "()Lcom/xiaomi/xms/wearable/db/dao/WatchAppItemDao;", "appDao$delegate", "Lkotlin/Lazy;", "appCapabilityDao", "Lcom/xiaomi/xms/wearable/db/dao/WatchAppCapabilityDao;", "getAppCapabilityDao", "()Lcom/xiaomi/xms/wearable/db/dao/WatchAppCapabilityDao;", "appCapabilityDao$delegate", "syncAppsToRepository", "", "did", "", "list", "", "Lcom/xiaomi/xms/wearable/db/entity/WatchAppItemEntity;", "insertWatchAppWithCallback", "item", "callback", "Lkotlin/Function1;", "", "deleteWatchApp", "packageName", "getWatchAppList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWatchApp", "getWatchCapability", "Lcom/xiaomi/xms/wearable/db/entity/WatchAppCapability;", "hasWatchAppCapability", "isPermissionGranted", "permission", "Lcom/xiaomi/xms/wearable/auth/Permission;", "insertWatchCapability", "watchCapabilities", "hasWatchApps", "updatePermission", "isGranted", "getWatchAppCapabilities", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WatchAppRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<WatchAppRepository> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: z4r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WatchAppRepository.instance_delegate$lambda$3();
        }
    });

    /* JADX INFO: renamed from: appDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy appDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: a5r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WatchAppRepository.appDao_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: appCapabilityDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy appCapabilityDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: b5r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WatchAppRepository.appCapabilityDao_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/xms/wearable/db/WatchAppRepository$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/xms/wearable/db/WatchAppRepository;", "getInstance", "()Lcom/xiaomi/xms/wearable/db/WatchAppRepository;", "instance$delegate", "Lkotlin/Lazy;", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WatchAppRepository getInstance() {
            return (WatchAppRepository) WatchAppRepository.instance$delegate.getValue();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.db.WatchAppRepository$deleteWatchApp$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.db.WatchAppRepository$deleteWatchApp$1", f = "WatchAppRepository.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ String $packageName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$packageName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WatchAppRepository.this.new AnonymousClass1(this.$did, this.$packageName, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchAppItemDao appDao = WatchAppRepository.this.getAppDao();
                String str = this.$did;
                String str2 = this.$packageName;
                this.label = 1;
                if (appDao.deleteItem(str, str2, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.db.WatchAppRepository$insertWatchAppWithCallback$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.db.WatchAppRepository$insertWatchAppWithCallback$1", f = "WatchAppRepository.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class C35021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        final /* synthetic */ WatchAppItemEntity $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C35021(WatchAppItemEntity watchAppItemEntity, Function1<? super Boolean, Unit> function1, Continuation<? super C35021> continuation) {
            super(2, continuation);
            this.$item = watchAppItemEntity;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WatchAppRepository.this.new C35021(this.$item, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchAppItemDao appDao = WatchAppRepository.this.getAppDao();
                List<WatchAppItemEntity> listListOf = CollectionsKt__CollectionsJVMKt.listOf(this.$item);
                this.label = 1;
                obj = appDao.insertAll(listListOf, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Long[] lArr = (Long[]) obj;
            Logger.d("insertWatchAppWithCallback result:" + lArr, new Object[0]);
            this.$callback.invoke2(Boxing.boxBoolean(lArr.length >= 0 && lArr[0].longValue() >= 0));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.db.WatchAppRepository$syncAppsToRepository$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.db.WatchAppRepository$syncAppsToRepository$1", f = "WatchAppRepository.kt", i = {}, l = {33, 34}, m = "invokeSuspend", n = {}, s = {})
    public static final class C35031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ List<WatchAppItemEntity> $list;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35031(String str, List<WatchAppItemEntity> list, Continuation<? super C35031> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$list = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WatchAppRepository.this.new C35031(this.$did, this.$list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                lg1.d("getInstalledWatchApp from device installAll success");
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WatchAppItemDao appDao = WatchAppRepository.this.getAppDao();
            String str = this.$did;
            this.label = 1;
            if (appDao.deleteAllByDevice(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            WatchAppItemDao appDao2 = WatchAppRepository.this.getAppDao();
            List<WatchAppItemEntity> list = this.$list;
            this.label = 2;
            if (appDao2.insertAll(list, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            lg1.d("getInstalledWatchApp from device installAll success");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private WatchAppRepository() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatchAppCapabilityDao appCapabilityDao_delegate$lambda$1() {
        return WatchAppItemDatabase.INSTANCE.getInstance().watchAppCapabilityDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatchAppItemDao appDao_delegate$lambda$0() {
        return WatchAppItemDatabase.INSTANCE.getInstance().watchAppItemDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WatchAppCapabilityDao getAppCapabilityDao() {
        return (WatchAppCapabilityDao) this.appCapabilityDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WatchAppItemDao getAppDao() {
        return (WatchAppItemDao) this.appDao.getValue();
    }

    private final WatchAppCapability getWatchCapability(String packageName) {
        return getAppCapabilityDao().findByPackageName(packageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WatchAppRepository instance_delegate$lambda$3() {
        return new WatchAppRepository();
    }

    public final void deleteWatchApp(@NotNull String did, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        ScopeExtKt.scope$default(null, new AnonymousClass1(did, packageName, null), 1, null);
    }

    @Nullable
    public final WatchAppItemEntity getWatchApp(@NotNull String packageName, @NotNull String did) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(did, "did");
        return getAppDao().findAppItem(packageName, did);
    }

    @NotNull
    public final List<WatchAppCapability> getWatchAppCapabilities() {
        return getAppCapabilityDao().findAll();
    }

    @Nullable
    public final Object getWatchAppList(@NotNull String str, @NotNull Continuation<? super List<WatchAppItemEntity>> continuation) {
        return getAppDao().findAllByDevice(str, continuation);
    }

    public final boolean hasWatchAppCapability(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return getWatchCapability(packageName) != null;
    }

    public final boolean hasWatchApps(@NotNull String packageName, @NotNull String did) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(did, "did");
        return getWatchApp(packageName, did) != null;
    }

    public final void insertWatchAppWithCallback(@NotNull WatchAppItemEntity item, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ScopeExtKt.scope$default(null, new C35021(item, callback, null), 1, null);
    }

    public final void insertWatchCapability(@NotNull List<WatchAppCapability> watchCapabilities) {
        Intrinsics.checkNotNullParameter(watchCapabilities, "watchCapabilities");
        getAppCapabilityDao().insertAll(watchCapabilities);
    }

    public final boolean isPermissionGranted(@NotNull String packageName, @NotNull Permission permission) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(permission, "permission");
        WatchAppCapability watchCapability = getWatchCapability(packageName);
        String strA = permission.a();
        if (Intrinsics.areEqual(strA, Permission.DEVICE_MANAGER.a())) {
            if (watchCapability != null) {
                return watchCapability.getHasObserveStatePermission();
            }
            return false;
        }
        if (!Intrinsics.areEqual(strA, Permission.NOTIFY.a()) || watchCapability == null) {
            return false;
        }
        return watchCapability.getHasNotificationPermission();
    }

    public final void syncAppsToRepository(@NotNull String did, @NotNull List<WatchAppItemEntity> list) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(list, "list");
        ScopeExtKt.scope$default(null, new C35031(did, list, null), 1, null);
    }

    public final void updatePermission(@NotNull String packageName, @NotNull Permission permission, boolean isGranted) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(permission, "permission");
        WatchAppCapability watchCapability = getWatchCapability(packageName);
        if (watchCapability != null) {
            String strA = permission.a();
            if (Intrinsics.areEqual(strA, Permission.DEVICE_MANAGER.a())) {
                watchCapability.setHasObserveStatePermission(isGranted);
            } else if (Intrinsics.areEqual(strA, Permission.NOTIFY.a())) {
                watchCapability.setHasNotificationPermission(isGranted);
            }
            ScopeExtKt.scope(Dispatchers.getIO(), new WatchAppRepository$updatePermission$1$1(this, watchCapability, null));
        }
    }
}
