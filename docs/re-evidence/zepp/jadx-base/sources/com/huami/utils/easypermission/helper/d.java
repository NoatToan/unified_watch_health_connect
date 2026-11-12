package com.huami.utils.easypermission.helper;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes15.dex */
class d extends BaseSupportPermissionsHelper<Fragment> {
    public d(@NonNull Fragment fragment) {
        super(fragment);
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public void directRequestPermissions(int i, @NonNull String... strArr) {
        getHost().requestPermissions(strArr, i);
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public Context getContext() {
        return getHost().getActivity();
    }

    @Override // com.huami.utils.easypermission.helper.BaseSupportPermissionsHelper
    public FragmentManager getSupportFragmentManager() {
        return getHost().getChildFragmentManager();
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        return getHost().shouldShowRequestPermissionRationale(str);
    }
}
