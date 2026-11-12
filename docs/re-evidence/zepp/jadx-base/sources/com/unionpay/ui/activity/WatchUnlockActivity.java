package com.unionpay.ui.activity;

import android.os.Bundle;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.ui.fragment.WatchUnlockFragment;

/* JADX INFO: loaded from: classes18.dex */
public class WatchUnlockActivity extends BaseUnionPayActivity {
    public static final int ACTION_ADD_CARD = 0;
    public static final int ACTION_UNBIND = 1;
    public static final String ARGS_ACTION = "pageTitle";
    public static final int REQUEST_CODE = 17;

    @Override // com.unionpay.ui.activity.BaseUnionPayActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra(ARGS_ACTION, 0);
        String string = getString(R.string.wl_union_pay_card);
        if (1 == intExtra) {
            string = getString(R.string.wl_bank_unbind);
        }
        setTitle(string);
        WatchUnlockFragment watchUnlockFragment = new WatchUnlockFragment();
        watchUnlockFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), watchUnlockFragment).commit();
    }
}
