package com.unionpay.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.ui.fragment.UnionPayCardDetailFragment;

/* JADX INFO: loaded from: classes18.dex */
public class UnionPayCardDetailActivity extends BaseUnionPayActivity {
    public static final String KEY_CARD_ID = "card_id";
    public static final String KEY_REFRESH_DATA = "refresh";
    private UnionPayCardDetailFragment b;

    @Override // com.unionpay.ui.activity.BaseUnionPayActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.wl_union_pay_card);
        this.b = new UnionPayCardDetailFragment();
        getSupportFragmentManager().beginTransaction().replace(getContentViewId(), this.b).commit();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra(KEY_CARD_ID);
        UnionPayCardDetailFragment unionPayCardDetailFragment = this.b;
        if (unionPayCardDetailFragment != null) {
            unionPayCardDetailFragment.setCardId(stringExtra);
        }
        if (intent.getBooleanExtra("refresh", false)) {
            this.b.refreshData();
        }
    }
}
