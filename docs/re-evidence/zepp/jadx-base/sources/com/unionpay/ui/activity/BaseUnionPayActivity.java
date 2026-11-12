package com.unionpay.ui.activity;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentActivity;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.view.basetitle.SystemBarTintManager;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.ui.widget.BankActionBar;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseUnionPayActivity extends FragmentActivity {
    private BankActionBar a;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        onBackPressed();
    }

    private void e() {
        SystemBarTintManager systemBarTintManager = new SystemBarTintManager(this);
        StatusBarUtil.setStatusColor(this, false, true, -1);
        systemBarTintManager.setStatusBarTintEnabled(true);
        systemBarTintManager.setStatusBarTintColor(-1);
    }

    public int getContentViewId() {
        return R.id.wl_content;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.wl_watch_bank_activit_base_unionpay);
        e();
        BankActionBar bankActionBar = (BankActionBar) findViewById(R.id.wl_header);
        this.a = bankActionBar;
        bankActionBar.setBackArrowClickListener(new View.OnClickListener() { // from class: sr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d(view);
            }
        });
    }

    @Override // android.app.Activity
    public void setTitle(@StringRes int i) {
        super.setTitle(i);
        this.a.setTitle(getString(i));
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.setTitle(charSequence.toString());
    }
}
