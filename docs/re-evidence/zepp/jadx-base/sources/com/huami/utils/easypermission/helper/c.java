package com.huami.utils.easypermission.helper;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.fragment.app.Fragment;
import com.huami.utils.easypermission.EasyPermissions;

/* JADX INFO: loaded from: classes15.dex */
class c<T> extends PermissionHelper<T> {
    public c(@NonNull T t) {
        super(t);
    }

    private static void e(@NonNull Object obj, int i, @NonNull String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            iArr[i2] = 0;
        }
        EasyPermissions.onRequestPermissionsResult(i, strArr, iArr, obj);
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public void directRequestPermissions(int i, @NonNull String... strArr) {
        e(getHost(), i, strArr);
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public Context getContext() {
        if (getHost() instanceof Activity) {
            return (Context) getHost();
        }
        if (getHost() instanceof Fragment) {
            return ((Fragment) getHost()).getContext();
        }
        throw new IllegalStateException("Unknown host: " + getHost());
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        return false;
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public void showRequestPermissionRationale(boolean z, @NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, String str4, int i2, @NonNull String... strArr) {
        e(getHost(), i2, strArr);
    }
}
