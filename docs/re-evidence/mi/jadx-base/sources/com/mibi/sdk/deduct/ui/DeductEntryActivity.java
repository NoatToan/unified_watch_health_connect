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
public class DeductEntryActivity extends BaseEntryActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OrderBean f10173a;

    private void b() {
        if (TextUtils.isEmpty(this.f10173a.mQueryIntervalConfig)) {
            return;
        }
        getSession().getMemoryStorage().put(MibiSdkConstants.MIBI_EXTRA_PARAMS, this.f10173a.mQueryIntervalConfig);
    }

    public final int a(int i) {
        if (i != 9810) {
            return i;
        }
        return -1;
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doActivityResult(int i, int i2, Intent intent) {
        super.doActivityResult(i, i2, intent);
        MibiLog.d("DeductEntryActivity", "activity result req : " + i + " ; res : " + i2);
        if (i == 1) {
            setResult(a(i2), intent);
        }
        finish();
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doEntryFailed(int i, String str) {
        MibiLog.d("DeductEntryActivity", "entry failed code : " + i + " ; msg : " + str);
        returnError(i, str);
        finish();
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doEntrySuccess() {
        b();
        OrderBean orderBean = this.f10173a;
        String str = orderBean.mOrder;
        String str2 = orderBean.mChannel;
        if (TextUtils.isEmpty(str)) {
            MibiLog.d("DeductEntryActivity", "order is null");
            setResult(17);
            finish();
        } else {
            Intent intent = new Intent(this, (Class<?>) CheckDeductOrderActivity.class);
            intent.putExtra(Constants.KEY_DEDUCT_ORDER, str);
            intent.putExtra("deductChannel", str2);
            startActivityForResult(intent, 1);
        }
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doPreCreate(Bundle bundle) {
        super.doPreCreate(bundle);
        this.f10173a = (OrderBean) getIntent().getParcelableExtra(Constants.KEY_ORDER_BEAN);
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public boolean isNoAccount() {
        return this.f10173a.mIsNoAccount;
    }
}
