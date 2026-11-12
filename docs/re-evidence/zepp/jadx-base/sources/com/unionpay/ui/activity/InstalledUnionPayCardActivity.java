package com.unionpay.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.ui.fragment.InstalledUnionPayCardFragment;

/* JADX INFO: loaded from: classes18.dex */
public class InstalledUnionPayCardActivity extends BaseUnionPayActivity {
    public static final String KEY_INFO = "installed_info";

    public static void open(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) InstalledUnionPayCardActivity.class);
        intent.putExtra(KEY_INFO, str);
        context.startActivity(intent);
    }

    @Override // com.unionpay.ui.activity.BaseUnionPayActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.wl_bank_my_bank_card);
        InstalledUnionPayCardFragment installedUnionPayCardFragment = new InstalledUnionPayCardFragment();
        installedUnionPayCardFragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), installedUnionPayCardFragment).commit();
    }
}
