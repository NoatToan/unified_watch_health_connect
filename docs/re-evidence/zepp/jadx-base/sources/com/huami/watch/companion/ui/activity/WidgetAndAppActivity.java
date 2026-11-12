package com.huami.watch.companion.ui.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.R;
import com.huami.watch.companion.app.QogirWidgetFragment;
import com.huami.watch.companion.app.WidgetFragment;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;

/* JADX INFO: loaded from: classes16.dex */
public class WidgetAndAppActivity extends BaseTitleActivity {
    public static final String KEY_MODEL = "deviceModel";
    private String x;

    private String l(String str) {
        if (DeviceSource.isSeriesEverest2(str)) {
            return getString(R.string.widget_manage);
        }
        return DeviceSource.isModelQogir(this.x) ? getString(R.string.widget_only_title) : getString(R.string.widget_order_hide);
    }

    private void m() {
        Fragment qogirWidgetFragment = DeviceUtil.isSupportWidgetManager2(DeviceManager.getManager(getApplicationContext()).findByModel(this.x)) ? new QogirWidgetFragment() : new WidgetFragment();
        FragmentManager fragmentManager = getFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putString("deviceModel", this.x);
        qogirWidgetFragment.setArguments(bundle);
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.add(R.id.container, qogirWidgetFragment);
        fragmentTransactionBeginTransaction.commit();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_base_content);
        String stringExtra = getIntent().getStringExtra("deviceModel");
        this.x = stringExtra;
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, -1, l(stringExtra), true);
        getTitleTextView().setTextSize(16.0f);
        m();
    }
}
