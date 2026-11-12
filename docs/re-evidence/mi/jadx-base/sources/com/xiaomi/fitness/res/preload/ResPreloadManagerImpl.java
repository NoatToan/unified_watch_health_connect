package com.xiaomi.fitness.res.preload;

import android.os.Looper;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.downloadV2.DownloadManager;
import com.xiaomi.fitness.net.downloadV2.DownloadRequestKt;
import com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.res.preload.export.ResPreloadManager;
import com.xiaomi.fitness.res.preload.export.ResRegistryModel;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/res/preload/ResPreloadManagerImpl;", "Lcom/xiaomi/fitness/res/preload/export/ResPreloadManager;", "<init>", "()V", "resSet", "", "Lcom/xiaomi/fitness/res/preload/export/ResRegistryModel;", "getResSet", "()Ljava/util/Set;", "setResSet", "(Ljava/util/Set;)V", "preloadIfNeed", "", "doPreload", "Companion", "res-preload_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResPreloadManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResPreloadManagerImpl.kt\ncom/xiaomi/fitness/res/preload/ResPreloadManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1863#2,2:63\n*S KotlinDebug\n*F\n+ 1 ResPreloadManagerImpl.kt\ncom/xiaomi/fitness/res/preload/ResPreloadManagerImpl\n*L\n41#1:63,2\n*E\n"})
public final class ResPreloadManagerImpl implements ResPreloadManager {

    @NotNull
    private static final String TAG = "ResPreloadManagerImpl";
    public Set<ResRegistryModel> resSet;

    /* JADX INFO: renamed from: com.xiaomi.fitness.res.preload.ResPreloadManagerImpl$preloadIfNeed$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.res.preload.ResPreloadManagerImpl$preloadIfNeed$1", f = "ResPreloadManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ResPreloadManagerImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ResPreloadManagerImpl.this.doPreload();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doPreload() {
        try {
            Logger.i(TAG, "preload check size:" + getResSet().size());
            for (ResRegistryModel resRegistryModel : getResSet()) {
                if (resRegistryModel.getExistCheck().invoke().booleanValue()) {
                    String downloadFilePath = DownloadRequestKt.getDownloadFilePath(resRegistryModel.getRequest());
                    ISingleFileDownloadListener downloadListener = resRegistryModel.getDownloadListener();
                    if (downloadListener != null) {
                        downloadListener.onSuccess(downloadFilePath);
                    }
                } else {
                    DownloadManager.INSTANCE.downloadSingleFile(resRegistryModel.getRequest(), resRegistryModel.getDownloadListener());
                }
            }
        } catch (Exception e) {
            Logger.e(TAG, "doPreload exception:" + e.getMessage(), e);
        }
    }

    @NotNull
    public final Set<ResRegistryModel> getResSet() {
        Set<ResRegistryModel> set = this.resSet;
        if (set != null) {
            return set;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resSet");
        return null;
    }

    @Override // com.xiaomi.fitness.res.preload.export.ResPreloadManager
    public void preloadIfNeed() {
        if (!RegionPreference.INSTANCE.getPRIVACY_AGREE()) {
            Logger.i(TAG, "has not agree privacy!!");
        } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(null));
        } else {
            doPreload();
        }
    }

    public final void setResSet(@NotNull Set<ResRegistryModel> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.resSet = set;
    }
}
