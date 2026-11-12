package com.huami.utils.permissionx.dsl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.utils.permissionx.PermissionResult;
import com.huami.watch.notification.TransportUri;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J&\u0010\t\u001a\u00020\u00022\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00020\u0004J&\u0010\n\u001a\u00020\u00022\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00020\u0004J&\u0010\u000b\u001a\u00020\u00022\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u00020\u0004R\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR0\u0010\u0011\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0013\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R0\u0010\u0015\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/huami/utils/permissionx/dsl/RequestMultiplePermissionDsl;", "", "", "invoke", "Lkotlin/Function1;", "", "", "Lcom/huami/utils/permissionx/PermissionResult;", TransportUri.ACTION_BLOCK, "onPermissionsDenied", "onPermissionsGranted", "onAllPermissionResult", "a", "Ljava/util/Map;", "results", "b", "Lkotlin/jvm/functions/Function1;", "onGrantedCallback", "c", "onDeniedCallback", GoogleApiAvailabilityLight.a, "onResultCallback", "<init>", "(Ljava/util/Map;)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class RequestMultiplePermissionDsl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<String, PermissionResult> results;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Map<String, ? extends PermissionResult>, Unit> onGrantedCallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Map<String, ? extends PermissionResult>, Unit> onDeniedCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Map<String, ? extends PermissionResult>, Unit> onResultCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestMultiplePermissionDsl(@NotNull Map<String, ? extends PermissionResult> map) {
        this.results = map;
    }

    public final void invoke() {
        Function1<? super Map<String, ? extends PermissionResult>, Unit> function1;
        Function1<? super Map<String, ? extends PermissionResult>, Unit> function2;
        Function1<? super Map<String, ? extends PermissionResult>, Unit> function3 = this.onResultCallback;
        if (function3 != null) {
            function3.invoke(this.results);
        }
        Map<String, PermissionResult> map = this.results;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PermissionResult> entry : map.entrySet()) {
            if (Intrinsics.areEqual(entry.getValue(), PermissionResult.Granted.INSTANCE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if ((!linkedHashMap.isEmpty()) && (function2 = this.onGrantedCallback) != null) {
            function2.invoke(linkedHashMap);
        }
        Map<String, PermissionResult> map2 = this.results;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, PermissionResult> entry2 : map2.entrySet()) {
            if (!Intrinsics.areEqual(entry2.getValue(), PermissionResult.Granted.INSTANCE)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        if (!(!linkedHashMap2.isEmpty()) || (function1 = this.onDeniedCallback) == null) {
            return;
        }
        function1.invoke(linkedHashMap2);
    }

    public final void onAllPermissionResult(@NotNull Function1<? super Map<String, ? extends PermissionResult>, Unit> block) {
        this.onResultCallback = block;
    }

    public final void onPermissionsDenied(@NotNull Function1<? super Map<String, ? extends PermissionResult>, Unit> block) {
        this.onDeniedCallback = block;
    }

    public final void onPermissionsGranted(@NotNull Function1<? super Map<String, ? extends PermissionResult>, Unit> block) {
        this.onGrantedCallback = block;
    }
}
