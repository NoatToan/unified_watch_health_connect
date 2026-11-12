package com.huami.utils.permissionx;

import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.contract.ActivityResultContract;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.utils.permissionx.ActivityResultLauncher;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B#\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0007H\u0002J\u001b\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/utils/permissionx/ActivityResultLauncher;", LogUtil.I, "O", "", "input", "Landroidx/activity/result/ActivityResultCallback;", "callback", "", "b", "(Ljava/lang/Object;Landroidx/activity/result/ActivityResultCallback;)V", GoogleApiAvailabilityLight.a, WebConstant.QueryParam.LAUNCH, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/activity/result/ActivityResultRegistry;", "a", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Landroidx/activity/result/ActivityResultLauncher;", "c", "Landroidx/activity/result/ActivityResultLauncher;", "launcher", "<init>", "(Landroidx/activity/result/ActivityResultRegistry;Landroidx/activity/result/contract/ActivityResultContract;)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class ActivityResultLauncher<I, O> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ActivityResultRegistry registry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ActivityResultContract<I, O> contract;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private androidx.view.result.ActivityResultLauncher<I> launcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001H\n"}, d2 = {LogUtil.I, "O", "kotlin.jvm.PlatformType", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a<O> implements ActivityResultCallback {
        public final /* synthetic */ CancellableContinuation<O> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CancellableContinuation<? super O> cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // androidx.view.result.ActivityResultCallback
        public final void onActivityResult(O o) {
            CancellableContinuation<O> cancellableContinuation = this.a;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m3845constructorimpl(o));
        }
    }

    public ActivityResultLauncher(@NotNull ActivityResultRegistry activityResultRegistry, @NotNull ActivityResultContract<I, O> activityResultContract) {
        this.registry = activityResultRegistry;
        this.contract = activityResultContract;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(I input, final ActivityResultCallback<O> callback) {
        androidx.view.result.ActivityResultLauncher<I> activityResultLauncherRegister = this.registry.register(Intrinsics.stringPlus("com.madroid#activity-result-launcher#", Integer.valueOf(hashCode())), this.contract, new ActivityResultCallback() { // from class: j6
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultLauncher.c(callback, this, obj);
            }
        });
        this.launcher = activityResultLauncherRegister;
        activityResultLauncherRegister.launch(input);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ActivityResultCallback activityResultCallback, ActivityResultLauncher activityResultLauncher, Object obj) {
        activityResultCallback.onActivityResult(obj);
        activityResultLauncher.d();
    }

    private final void d() {
        androidx.view.result.ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher == null) {
            return;
        }
        activityResultLauncher.unregister();
    }

    @Nullable
    public final Object launch(I i, @NotNull Continuation<? super O> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        b(i, new a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
