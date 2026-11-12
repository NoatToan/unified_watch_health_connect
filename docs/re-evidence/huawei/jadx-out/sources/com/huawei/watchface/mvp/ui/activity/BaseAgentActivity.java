package com.huawei.watchface.mvp.ui.activity;

import android.os.Bundle;
import android.view.Window;
import com.huawei.secure.android.common.activity.SafeFragmentActivity;

/* JADX INFO: loaded from: classes45.dex */
public class BaseAgentActivity extends SafeFragmentActivity {
    private void requestActivityTransparent() {
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
        }
    }

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestActivityTransparent();
    }
}
