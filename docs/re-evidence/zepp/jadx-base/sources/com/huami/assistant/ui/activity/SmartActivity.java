package com.huami.assistant.ui.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.huami.assistant.R;
import com.huami.assistant.ui.fragment.UpdatesFragment;
import com.huami.watch.util.DeviceCompatibility;

/* JADX INFO: loaded from: classes5.dex */
public class SmartActivity extends FragmentActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new UpdatesFragment()).commit();
    }
}
