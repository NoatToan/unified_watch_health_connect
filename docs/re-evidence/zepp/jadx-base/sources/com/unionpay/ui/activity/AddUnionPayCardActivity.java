package com.unionpay.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.ui.fragment.AddUnionPayCardFragment;

/* JADX INFO: loaded from: classes18.dex */
public class AddUnionPayCardActivity extends BaseUnionPayActivity {
    private AddUnionPayCardFragment b;

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.b.needRefreshCardList()) {
            super.onBackPressed();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) UnionPayCardDetailActivity.class);
        intent.putExtra("refresh", true);
        startActivity(intent);
    }

    @Override // com.unionpay.ui.activity.BaseUnionPayActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getString(R.string.wl_add_bank_card));
        this.b = new AddUnionPayCardFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.wl_content, this.b).commit();
    }
}
