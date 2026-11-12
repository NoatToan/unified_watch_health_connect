package com.huami.utils.easypermission.helper;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.app.ActivityCompat;
import com.huami.utils.easypermission.HuamiRationaleDialogFragment;

/* JADX INFO: loaded from: classes15.dex */
class a extends PermissionHelper<Activity> {
    private static final String b = "ActPermissionHelper";

    public a(Activity activity) {
        super(activity);
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public void directRequestPermissions(int i, @NonNull String... strArr) {
        ActivityCompat.requestPermissions(getHost(), strArr, i);
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public Context getContext() {
        return getHost();
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        return ActivityCompat.shouldShowRequestPermissionRationale(getHost(), str);
    }

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public void showRequestPermissionRationale(boolean z, @NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, String str4, int i2, @NonNull String... strArr) {
        FragmentManager fragmentManager = getHost().getFragmentManager();
        if (fragmentManager.findFragmentByTag(HuamiRationaleDialogFragment.TAG) instanceof HuamiRationaleDialogFragment) {
            Log.d(b, "Found existing fragment, not showing rationale.");
        } else {
            HuamiRationaleDialogFragment.newInstance(str2, str3, str, i, str4, i2, z, strArr).showAllowingStateLoss(fragmentManager, HuamiRationaleDialogFragment.TAG);
        }
    }
}
