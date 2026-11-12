package com.unionpay.ui.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.ui.fragment.SupportUnionPayBankFragment;

/* JADX INFO: loaded from: classes18.dex */
public class SupportUnionPayBankActivity extends BaseUnionPayActivity {
    @Override // com.unionpay.ui.activity.BaseUnionPayActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.wl_support_bank_list);
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), new SupportUnionPayBankFragment()).commit();
    }
}
