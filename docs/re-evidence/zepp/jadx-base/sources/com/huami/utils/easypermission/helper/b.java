package com.huami.utils.easypermission.helper;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes15.dex */
class b extends BaseSupportPermissionsHelper<AppCompatActivity> {
    public b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public void directRequestPermissions(int i, @NonNull String... strArr) {
        ActivityCompat.requestPermissions(getHost(), strArr, i);
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public Context getContext() {
        return getHost();
    }

    @Override // com.huami.utils.easypermission.helper.BaseSupportPermissionsHelper
    public FragmentManager getSupportFragmentManager() {
        return getHost().getSupportFragmentManager();
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        return ActivityCompat.shouldShowRequestPermissionRationale(getHost(), str);
    }
}
