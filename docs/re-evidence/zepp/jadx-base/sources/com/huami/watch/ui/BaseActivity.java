package com.huami.watch.ui;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseActivity extends FragmentActivity {
    private static final String a = "BaseActivity";

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        Log.d(a, "OnRequestPermissionsResult : " + i + ", " + Arrays.toString(strArr) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Arrays.toString(iArr), new Object[0]);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(@LayoutRes int i) {
        super.setContentView(i);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
    }
}
