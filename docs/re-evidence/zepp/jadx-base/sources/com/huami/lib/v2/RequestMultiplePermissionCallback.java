package com.huami.lib.v2;

import com.huami.utils.permissionx.PermissionResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010\n\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/huami/lib/v2/RequestMultiplePermissionCallback;", "", "", "", "permissions", "", "onPermissionGranted", "", "Lcom/huami/utils/permissionx/PermissionResult;", "permissionMap", "onPermissionDenied", "onPermissionResult", "<init>", "()V", "zeppPermission_release"}, k = 1, mv = {1, 5, 1})
public class RequestMultiplePermissionCallback {
    public void onPermissionDenied(@NotNull Map<String, ? extends PermissionResult> permissionMap) {
    }

    public void onPermissionGranted(@NotNull List<String> permissions) {
    }

    public void onPermissionResult(@NotNull Map<String, ? extends PermissionResult> permissionMap) {
    }
}
