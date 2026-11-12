package com.huami.utils.easypermission.helper;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.fragment.app.FragmentManager;
import com.huami.utils.easypermission.HuamiRationaleDialogFragmentCompat;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseSupportPermissionsHelper<T> extends PermissionHelper<T> {
    private static final String b = "BSPermissionsHelper";

    public BaseSupportPermissionsHelper(@NonNull T t) {
        super(t);
    }

    public abstract FragmentManager getSupportFragmentManager();

    @Override // com.huami.utils.easypermission.helper.PermissionHelper
    public void showRequestPermissionRationale(boolean z, @NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, String str4, int i2, @NonNull String... strArr) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag(HuamiRationaleDialogFragmentCompat.TAG) instanceof HuamiRationaleDialogFragmentCompat) {
            Log.d(b, "Found existing fragment, not showing rationale.");
        } else {
            HuamiRationaleDialogFragmentCompat.newInstance(z, str, str2, str3, i, str4, i2, strArr).showAllowingStateLoss(supportFragmentManager, HuamiRationaleDialogFragmentCompat.TAG);
        }
    }
}
