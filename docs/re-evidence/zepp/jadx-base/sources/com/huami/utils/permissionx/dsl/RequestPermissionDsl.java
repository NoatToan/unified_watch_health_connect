package com.huami.utils.permissionx.dsl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.utils.permissionx.PermissionResult;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u001a\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004J\u0014\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\bJ\u001a\u0010\n\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004R\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestPermissionDsl;", "", "", "invoke", "Lkotlin/Function1;", "Lcom/huami/utils/permissionx/PermissionResult;", TransportUri.ACTION_BLOCK, "onPermissionDenied", "Lkotlin/Function0;", "onPermissionGranted", "onPermissionResult", "a", "Lcom/huami/utils/permissionx/PermissionResult;", "result", "b", "Lkotlin/jvm/functions/Function0;", "onGrantedCallback", "c", "Lkotlin/jvm/functions/Function1;", "onDeniedCallback", GoogleApiAvailabilityLight.a, "onResultCallback", "<init>", "(Lcom/huami/utils/permissionx/PermissionResult;)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class RequestPermissionDsl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PermissionResult result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onGrantedCallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super PermissionResult, Unit> onDeniedCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function1<? super PermissionResult, Unit> onResultCallback;

    public RequestPermissionDsl(@NotNull PermissionResult permissionResult) {
        this.result = permissionResult;
    }

    public final void invoke() {
        Function1<? super PermissionResult, Unit> function1 = this.onResultCallback;
        if (function1 != null) {
            function1.invoke(this.result);
        }
        PermissionResult permissionResult = this.result;
        if (permissionResult instanceof PermissionResult.Granted) {
            Function0<Unit> function0 = this.onGrantedCallback;
            if (function0 == null) {
                return;
            }
            function0.invoke();
            return;
        }
        Function1<? super PermissionResult, Unit> function2 = this.onDeniedCallback;
        if (function2 == null) {
            return;
        }
        function2.invoke(permissionResult);
    }

    public final void onPermissionDenied(@NotNull Function1<? super PermissionResult, Unit> block) {
        this.onDeniedCallback = block;
    }

    public final void onPermissionGranted(@NotNull Function0<Unit> block) {
        this.onGrantedCallback = block;
    }

    public final void onPermissionResult(@NotNull Function1<? super PermissionResult, Unit> block) {
        this.onResultCallback = block;
    }
}
