package com.xiaomi.xms.wearable.ui.appshop.manager;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.wearable.hm.BroadcastsKt;
import com.xiaomi.xms.wearable.db.WatchAppRepository;
import com.xiaomi.xms.wearable.db.entity.WatchAppItemEntity;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppStatusManager;
import com.xiaomi.xms.wearable.ui.appshop.model.AppStatusInfo;
import com.xiaomi.xms.wearable.ui.appshop.model.WatchAppListData;
import defpackage.lg1;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0002 !B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\n0\rJ$\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\n0\rJ\u001c\u0010\u0010\u001a\u00020\n2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\n0\rJ\u001c\u0010\u0011\u001a\u00020\n2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\n0\rJ.\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0003J\u0016\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\bH\u0002J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppStatusManager;", "", "<init>", "()V", "globalObservable", "Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppStatusManager$StatusObservable;", "mAppStatusInfoMap", "", "", "addStatusListener", "", "packageName", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;", "removeStatusListener", "addGlobalStatusListener", "removeGlobalStatusListener", "updateStatus", "status", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "errMsg", "statusInfo", "rollbackAppStatus", "getCurAppStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatusObservable", "tryRemoveFile", "path", "file", "Ljava/io/File;", "StatusObservable", "Companion", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppStatusManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<AppStatusManager> INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: uh1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppStatusManager.INSTANCE_delegate$lambda$3();
        }
    });

    @NotNull
    private static final Handler sUIHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private final StatusObservable globalObservable = new StatusObservable();

    @NotNull
    private final Map<String, StatusObservable> mAppStatusInfoMap = new ConcurrentHashMap();

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010R!\u0010\u0004\u001a\u00020\u00058FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppStatusManager$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppStatusManager;", "getINSTANCE$annotations", "getINSTANCE", "()Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppStatusManager;", "INSTANCE$delegate", "Lkotlin/Lazy;", "sUIHandler", "Landroid/os/Handler;", "updateStatus", "", "packageName", "", "status", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "errMsg", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getINSTANCE$annotations() {
        }

        public static /* synthetic */ void updateStatus$default(Companion companion, String str, int i, int i2, String str2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            if ((i3 & 8) != 0) {
                str2 = null;
            }
            companion.updateStatus(str, i, i2, str2);
        }

        @NotNull
        public final AppStatusManager getINSTANCE() {
            return (AppStatusManager) AppStatusManager.INSTANCE$delegate.getValue();
        }

        public final void updateStatus(@NotNull String packageName, int status, int progress, @Nullable String errMsg) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            getINSTANCE().updateStatus(packageName, status, progress, errMsg);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0\bJ\u001c\u0010\f\u001a\u00020\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/manager/AppStatusManager$StatusObservable;", "", "<init>", "()V", "mStatus", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;", "mListeners", "", "Lkotlin/Function1;", "", "addObserver", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeObserver", "postValue", "newStatus", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAppStatusManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStatusManager.kt\ncom/xiaomi/xms/wearable/ui/appshop/manager/AppStatusManager$StatusObservable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n1863#2,2:185\n*S KotlinDebug\n*F\n+ 1 AppStatusManager.kt\ncom/xiaomi/xms/wearable/ui/appshop/manager/AppStatusManager$StatusObservable\n*L\n162#1:185,2\n*E\n"})
    public static final class StatusObservable {

        @NotNull
        private final Set<Function1<AppStatusInfo, Unit>> mListeners = new HashSet();

        @Nullable
        private AppStatusInfo mStatus;

        /* JADX INFO: Access modifiers changed from: private */
        public static final void addObserver$lambda$0(StatusObservable this$0, Function1 listener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            this$0.mListeners.add(listener);
            lg1.d("addedObserver " + listener + " " + this$0.mListeners.size() + "  " + this$0.mStatus);
            listener.invoke2(this$0.mStatus);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void postValue$lambda$3(StatusObservable this$0, AppStatusInfo appStatusInfo) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.mStatus = appStatusInfo;
            Iterator<T> it = this$0.mListeners.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke2(this$0.mStatus);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void removeObserver$lambda$1(StatusObservable this$0, Function1 listener) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            this$0.mListeners.remove(listener);
            lg1.d("removedObserver " + listener + " " + this$0.mListeners.size());
        }

        public final void addObserver(@NotNull final Function1<? super AppStatusInfo, Unit> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            AppStatusManager.sUIHandler.post(new Runnable() { // from class: vh1
                @Override // java.lang.Runnable
                public final void run() {
                    AppStatusManager.StatusObservable.addObserver$lambda$0(this.f36889a, listener);
                }
            });
        }

        public final void postValue(@Nullable final AppStatusInfo newStatus) {
            lg1.d("AppStatusManager postValue newStatus:" + newStatus);
            AppStatusManager.sUIHandler.post(new Runnable() { // from class: wh1
                @Override // java.lang.Runnable
                public final void run() {
                    AppStatusManager.StatusObservable.postValue$lambda$3(this.f37967a, newStatus);
                }
            });
        }

        public final void removeObserver(@NotNull final Function1<? super AppStatusInfo, Unit> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            AppStatusManager.sUIHandler.post(new Runnable() { // from class: xh1
                @Override // java.lang.Runnable
                public final void run() {
                    AppStatusManager.StatusObservable.removeObserver$lambda$1(this.f39112a, listener);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.ui.appshop.manager.AppStatusManager$getCurAppStatus$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.ui.appshop.manager.AppStatusManager$getCurAppStatus$2", f = "AppStatusManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AppStatusInfo>, Object> {
        final /* synthetic */ String $packageName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$packageName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$packageName, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String did;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppStatusInfo appStatusInfo = new AppStatusInfo(this.$packageName);
            WatchAppRepository companion = WatchAppRepository.INSTANCE.getInstance();
            String str = this.$packageName;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
                did = "";
            }
            WatchAppItemEntity watchApp = companion.getWatchApp(str, did);
            if (watchApp != null) {
                String str2 = this.$packageName;
                appStatusInfo.setStatus(1);
                WatchAppListData.WatchAppBean cachedAppInfo = AppDownloadManager.INSTANCE.getINSTANCE().getCachedAppInfo(str2);
                if (cachedAppInfo != null && cachedAppInfo.app_version_code > watchApp.getVersionCode()) {
                    appStatusInfo.setStatus(2);
                }
            }
            return appStatusInfo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AppStatusInfo> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.ui.appshop.manager.AppStatusManager$rollbackAppStatus$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.ui.appshop.manager.AppStatusManager$rollbackAppStatus$1", f = "AppStatusManager.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $packageName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$packageName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AppStatusManager.this.new AnonymousClass1(this.$packageName, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AppStatusManager appStatusManager = AppStatusManager.this;
                String str = this.$packageName;
                this.label = 1;
                obj = appStatusManager.getCurAppStatus(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AppStatusManager.this.updateStatus((AppStatusInfo) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private AppStatusManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppStatusManager INSTANCE_delegate$lambda$3() {
        return new AppStatusManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getCurAppStatus(String str, Continuation<? super AppStatusInfo> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, null), continuation);
    }

    @NotNull
    public static final AppStatusManager getINSTANCE() {
        return INSTANCE.getINSTANCE();
    }

    private final StatusObservable getStatusObservable(String packageName) {
        StatusObservable statusObservable = this.mAppStatusInfoMap.get(packageName);
        if (statusObservable != null) {
            return statusObservable;
        }
        StatusObservable statusObservable2 = new StatusObservable();
        this.mAppStatusInfoMap.put(packageName, statusObservable2);
        return statusObservable2;
    }

    @SuppressLint({"CheckResult"})
    private final void rollbackAppStatus(String packageName) {
        ScopeExtKt.scope$default(null, new AnonymousClass1(packageName, null), 1, null);
    }

    private final void tryRemoveFile(String path) {
        tryRemoveFile(new File(path));
    }

    public static /* synthetic */ void updateStatus$default(AppStatusManager appStatusManager, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            str2 = null;
        }
        appStatusManager.updateStatus(str, i, i2, str2);
    }

    public final void addGlobalStatusListener(@NotNull Function1<? super AppStatusInfo, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.globalObservable.addObserver(listener);
    }

    public final void addStatusListener(@NotNull String packageName, @NotNull Function1<? super AppStatusInfo, Unit> listener) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getStatusObservable(packageName).addObserver(listener);
    }

    public final void removeGlobalStatusListener(@NotNull Function1<? super AppStatusInfo, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.globalObservable.removeObserver(listener);
    }

    public final void removeStatusListener(@NotNull String packageName, @NotNull Function1<? super AppStatusInfo, Unit> listener) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        getStatusObservable(packageName).removeObserver(listener);
    }

    public final void updateStatus(@NotNull String packageName, int status, int progress, @Nullable String errMsg) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        AppStatusInfo appStatusInfo = new AppStatusInfo(packageName, status, progress);
        appStatusInfo.setErrMsg(errMsg);
        updateStatus(appStatusInfo);
        if (status == 1) {
            this.globalObservable.postValue(null);
        }
    }

    private final void tryRemoveFile(File file) {
        lg1.d("tryRemoveFile " + file.getName());
        if (!file.exists() || file.isDirectory()) {
            return;
        }
        try {
            file.delete();
            lg1.d("tryRemoveFile " + file.getName() + " success");
        } catch (Exception e) {
            e.printStackTrace();
            lg1.c("tryRemoveFile fail", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStatus(AppStatusInfo statusInfo) {
        lg1.d("updateStatus " + statusInfo);
        this.globalObservable.postValue(statusInfo);
        getStatusObservable(statusInfo.getPackageName()).postValue(statusInfo);
        int status = statusInfo.getStatus();
        if (status != 5) {
            if (status != 6 && status != 9) {
                if (status == 11) {
                    tryRemoveFile(AppDownloadManager.INSTANCE.getINSTANCE().getAppFilePath(statusInfo.getPackageName()));
                    return;
                }
                if (status != 12) {
                    if (status == 15) {
                        WatchAppRepository companion = WatchAppRepository.INSTANCE.getInstance();
                        T currentDeviceModel = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                        Intrinsics.checkNotNull(currentDeviceModel);
                        companion.deleteWatchApp(((WearableDeviceModel) currentDeviceModel).getDid(), statusInfo.getPackageName());
                        return;
                    }
                    if (status != 16) {
                        return;
                    }
                }
            }
            tryRemoveFile(AppDownloadManager.INSTANCE.getINSTANCE().getAppFilePath(statusInfo.getPackageName()));
            rollbackAppStatus(statusInfo.getPackageName());
            return;
        }
        WatchAppListData.WatchAppBean cachedAppInfo = AppDownloadManager.INSTANCE.getINSTANCE().getCachedAppInfo(statusInfo.getPackageName());
        if (cachedAppInfo != null) {
            AppInstallManager.INSTANCE.getINSTANCE().install(statusInfo.getPackageName(), cachedAppInfo.app_version_code);
        } else {
            lg1.b("get cached App Info error");
            updateStatus$default(this, statusInfo.getPackageName(), 6, 0, null, 12, null);
        }
    }
}
