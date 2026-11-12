package com.xiaomi.fitness.map.export;

import android.app.Activity;
import android.os.Process;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.dialog.CircleProgressDialog;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.net.downloadV2.DownloadException;
import com.xiaomi.fitness.net.downloadV2.DownloadManager;
import com.xiaomi.fitness.net.downloadV2.DownloadRequest;
import com.xiaomi.fitness.net.downloadV2.DownloadRequestKt;
import com.xiaomi.fitness.net.downloadV2.listener.BaseSingleFileDownloadListener;
import defpackage.i0j;
import defpackage.oui;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122 \u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u0015\u0012\f\u0012\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0016\u0012\u0004\u0012\u00020\u00100\u0014J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0005J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/map/export/MapDynamicUtils;", "", "<init>", "()V", "TAG", "", "URL_SO_64", "URL_SO_32", "ARM64_V8A", "ARMEABI_V7A", "loadingDialog", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/baseui/dialog/CircleProgressDialog;", "hasLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "checkSoLoaded", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "callback", "Lkotlin/Function2;", "", "Lkotlin/Exception;", "Ljava/lang/Exception;", "setLibPath", "soFilePath", "abi", "showLoading", "hideLoading", "getDownloadUrl", "getSoAbiPlatform", "map-amap-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MapDynamicUtils {

    @NotNull
    private static final String ARM64_V8A = "arm64-v8a";

    @NotNull
    private static final String ARMEABI_V7A = "armeabi-v7a";

    @NotNull
    private static final String TAG = "AMapUtils_Dynamic_Load";

    @NotNull
    private static final String URL_SO_32 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/amap/so/armeabi-v7a/libAMapSDK_MAP_v10_1_300.so";

    @NotNull
    private static final String URL_SO_64 = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/amap/so/arm64-v8a/libAMapSDK_MAP_v10_1_300.so";

    @Nullable
    private static WeakReference<CircleProgressDialog> loadingDialog;

    @NotNull
    public static final MapDynamicUtils INSTANCE = new MapDynamicUtils();

    @NotNull
    private static final AtomicBoolean hasLoaded = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.xiaomi.fitness.map.export.MapDynamicUtils$checkSoLoaded$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.map.export.MapDynamicUtils$checkSoLoaded$1", f = "MapDynamicUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Boolean, Exception, Unit> $callback;
        final /* synthetic */ WeakReference<FragmentActivity> $curActivityRef;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.map.export.MapDynamicUtils$checkSoLoaded$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.map.export.MapDynamicUtils$checkSoLoaded$1$1", f = "MapDynamicUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ WeakReference<FragmentActivity> $curActivityRef;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06421(WeakReference<FragmentActivity> weakReference, Continuation<? super C06421> continuation) {
                super(2, continuation);
                this.$curActivityRef = weakReference;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06421(this.$curActivityRef, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FragmentActivity fragmentActivity = this.$curActivityRef.get();
                if (fragmentActivity != null) {
                    MapDynamicUtils.INSTANCE.showLoading(fragmentActivity);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super Boolean, ? super Exception, Unit> function2, WeakReference<FragmentActivity> weakReference, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = function2;
            this.$curActivityRef = weakReference;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, this.$curActivityRef, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MapDynamicUtils mapDynamicUtils = MapDynamicUtils.INSTANCE;
            DownloadRequest downloadRequest = new DownloadRequest(mapDynamicUtils.getDownloadUrl(), new DownloadRequest.Option.Builder().external(false).build(), null, null, 12, null);
            if (DownloadRequestKt.isFileExist(downloadRequest)) {
                mapDynamicUtils.setLibPath(DownloadRequestKt.getDownloadFilePath(downloadRequest), mapDynamicUtils.getSoAbiPlatform());
                this.$callback.invoke(Boxing.boxBoolean(true), null);
            } else {
                AnyExtKt.main$default(null, new C06421(this.$curActivityRef, null), 1, null);
                DownloadManager downloadManager = DownloadManager.INSTANCE;
                final Function2<Boolean, Exception, Unit> function2 = this.$callback;
                downloadManager.downloadSingleFile(downloadRequest, new BaseSingleFileDownloadListener() { // from class: com.xiaomi.fitness.map.export.MapDynamicUtils.checkSoLoaded.1.2
                    @Override // com.xiaomi.fitness.net.downloadV2.listener.BaseSingleFileDownloadListener, com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
                    public void onError(DownloadException e) {
                        Intrinsics.checkNotNullParameter(e, "e");
                        super.onError(e);
                        Logger.e(MapDynamicUtils.TAG, "download lib so exception:" + e.getError().getCode(), e);
                        AnyExtKt.main$default(null, new MapDynamicUtils$checkSoLoaded$1$2$onError$1(function2, e, null), 1, null);
                    }

                    @Override // com.xiaomi.fitness.net.downloadV2.listener.BaseSingleFileDownloadListener, com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener
                    public void onSuccess(String path) {
                        Intrinsics.checkNotNullParameter(path, "path");
                        super.onSuccess(path);
                        MapDynamicUtils mapDynamicUtils2 = MapDynamicUtils.INSTANCE;
                        mapDynamicUtils2.setLibPath(path, mapDynamicUtils2.getSoAbiPlatform());
                        AnyExtKt.main$default(null, new MapDynamicUtils$checkSoLoaded$1$2$onSuccess$1(function2, null), 1, null);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private MapDynamicUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoading() {
        CircleProgressDialog circleProgressDialog;
        try {
            WeakReference<CircleProgressDialog> weakReference = loadingDialog;
            if (weakReference == null || (circleProgressDialog = weakReference.get()) == null) {
                return;
            }
            circleProgressDialog.dismissAllowingStateLoss();
        } catch (Exception e) {
            Logger.e(TAG, "hideLoading exception: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading(FragmentActivity activity) {
        if (activity == null) {
            return;
        }
        CircleProgressDialog circleProgressDialogCreate = new CircleProgressDialog.a("download_amap_so").setCustomLayoutId(oui.f29698a).setCancelable(true).setCanceledOnTouchOutside(true).create();
        circleProgressDialogCreate.setPickerHintText(ApplicationExtKt.getApplication().getString(i0j.common_amap_res_loading));
        circleProgressDialogCreate.showIfNeed(activity.getSupportFragmentManager());
        loadingDialog = new WeakReference<>(circleProgressDialogCreate);
    }

    public final void checkSoLoaded(@Nullable FragmentActivity activity, @NotNull Function2<? super Boolean, ? super Exception, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (activity == null) {
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            activity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        }
        WeakReference weakReference = new WeakReference(activity);
        AppUtil appUtil = AppUtil.INSTANCE;
        boolean zIsPlayChannel = appUtil.isPlayChannel();
        IMapExportService.Companion companion = IMapExportService.INSTANCE;
        Logger.i(TAG, "isAppChannel:" + zIsPlayChannel + ",exclude:" + MapExportExtKt.getInstance(companion).isPackageExcludeAMapSo());
        if (appUtil.isPlayChannel() || !MapExportExtKt.getInstance(companion).isPackageExcludeAMapSo()) {
            callback.invoke(Boolean.TRUE, null);
        } else if (hasLoaded.get()) {
            callback.invoke(Boolean.TRUE, null);
        } else {
            AnyExtKt.io$default(null, new AnonymousClass1(callback, weakReference, null), 1, null);
        }
    }

    @NotNull
    public final String getDownloadUrl() {
        return Process.is64Bit() ? URL_SO_64 : URL_SO_32;
    }

    @NotNull
    public final String getSoAbiPlatform() {
        return Process.is64Bit() ? "arm64-v8a" : "armeabi-v7a";
    }

    public final void setLibPath(@NotNull String soFilePath) {
        Intrinsics.checkNotNullParameter(soFilePath, "soFilePath");
        setLibPath(soFilePath, getSoAbiPlatform());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLibPath(String soFilePath, String abi) {
        MapExportExtKt.getInstance(IMapExportService.INSTANCE).setLibPath(soFilePath, abi);
        hasLoaded.set(true);
    }
}
