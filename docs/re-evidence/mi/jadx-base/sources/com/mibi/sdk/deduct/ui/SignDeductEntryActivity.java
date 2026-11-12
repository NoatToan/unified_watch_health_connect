package com.mibi.sdk.deduct.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.MibiSdkConstants;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseEntryActivity;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.OrderBean;

/* JADX INFO: loaded from: classes5.dex */
public class SignDeductEntryActivity extends BaseEntryActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OrderBean f10178a;

    private int a(int i) {
        if (i != 9820) {
            return i;
        }
        return -1;
    }

    private void b() {
        if (TextUtils.isEmpty(this.f10178a.mQueryIntervalConfig)) {
            return;
        }
        getSession().getMemoryStorage().put(MibiSdkConstants.MIBI_EXTRA_PARAMS, this.f10178a.mQueryIntervalConfig);
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doActivityResult(int i, int i2, Intent intent) {
        super.doActivityResult(i, i2, intent);
        MibiLog.d("SignDeductEntryActivity", "doActivityResult req : " + i + " ; res : " + i2);
        if (i == 1) {
            setResult(a(i2), intent);
        }
        finish();
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doEntryFailed(int i, String str) {
        MibiLog.d("SignDeductEntryActivity", "entry failed  code : " + i + " ; msg : " + str);
        returnError(i, str);
        finish();
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doEntrySuccess() {
        b();
        String str = this.f10178a.mOrder;
        if (TextUtils.isEmpty(str)) {
            MibiLog.d("SignDeductEntryActivity", "order is null");
            setResult(17);
            finish();
        } else {
            String str2 = this.f10178a.mChannel;
            Intent intent = new Intent(this, (Class<?>) CheckSignDeductOrderActivity.class);
            intent.putExtra("deductSignAndPayOrder", str);
            intent.putExtra(Constants.KEY_SIGN_DEDUCT_CHANNEL, str2);
            startActivityForResult(intent, 1);
        }
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doPreCreate(Bundle bundle) {
        super.doPreCreate(bundle);
        this.f10178a = (OrderBean) getIntent().getParcelableExtra(Constants.KEY_ORDER_BEAN);
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public boolean isNoAccount() {
        return this.f10178a.mIsNoAccount;
    }
}
