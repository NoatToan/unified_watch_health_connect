package com.huami.account.ui;

import android.os.Bundle;
import com.huami.account.event.EventAccountStatus;
import com.huami.android.design.dialog.loading.LoadingDialog;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes4.dex */
public class MutexAutoLoginActivity extends MutexLoginActivity {
    @Override // com.huami.account.ui.MutexLoginActivity
    public LoadingDialog createDialog() {
        return LoadingDialog.showDialog(this);
    }

    @Override // com.huami.account.ui.MutexLoginActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        reLogin();
    }

    @Override // com.huami.account.ui.MutexLoginActivity
    public void updateSuccessUI() {
        this.mLoadingDialog.dismiss();
        finish();
        EventBus.getDefault().post(new EventAccountStatus(2));
    }
}
