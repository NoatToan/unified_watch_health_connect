package com.huami.lib.v2;

import com.huami.utils.permissionx.PermissionResult;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/huami/lib/v2/RequestPermissionCallback;", "", "", PointCategory.PERMISSION, "", "onPermissionGranted", "Lcom/huami/utils/permissionx/PermissionResult;", "permissionResult", "onPermissionDenied", "onPermissionResult", "<init>", "()V", "zeppPermission_release"}, k = 1, mv = {1, 5, 1})
public class RequestPermissionCallback {
    public void onPermissionDenied(@NotNull String permission, @NotNull PermissionResult permissionResult) {
    }

    public void onPermissionGranted(@NotNull String permission) {
    }

    public void onPermissionResult(@NotNull String permission, @NotNull PermissionResult permissionResult) {
    }
}
