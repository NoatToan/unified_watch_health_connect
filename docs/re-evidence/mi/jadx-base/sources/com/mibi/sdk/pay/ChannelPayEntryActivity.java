package com.mibi.sdk.pay;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.MibiSdkConstants;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseEntryActivity;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.OrderBean;
import com.mibi.sdk.component.privacy.MibiPrivacyUtils;
import com.mibi.sdk.component.privacy.PrivacyManager;
import com.mibi.sdk.pay.prepare.PrepareActivity;

/* JADX INFO: loaded from: classes5.dex */
public class ChannelPayEntryActivity extends BaseEntryActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OrderBean f10193a;

    public final boolean a() {
        if (TextUtils.isEmpty(this.f10193a.mOrder)) {
            MibiLog.e("ChannelPayEntryActivity", "order is empty");
            return false;
        }
        OrderBean orderBean = this.f10193a;
        if (orderBean.mUseUi || !TextUtils.isEmpty(orderBean.mChannel)) {
            return true;
        }
        MibiLog.e("ChannelPayEntryActivity", "channel is empty");
        return false;
    }

    public final void b() {
        if (TextUtils.isEmpty(this.f10193a.mQueryIntervalConfig)) {
            return;
        }
        getSession().getMemoryStorage().put(MibiSdkConstants.MIBI_EXTRA_PARAMS, this.f10193a.mQueryIntervalConfig);
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doActivityResult(int i, int i2, Intent intent) {
        MibiLog.d("ChannelPayEntryActivity", "doActivityResult req : " + i + " ; res : " + i2);
        super.doActivityResult(i, i2, intent);
        returnResult(i2, intent);
        finish();
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doEntryFailed(int i, String str) {
        MibiLog.d("ChannelPayEntryActivity", "doEntryFailed");
        returnError(i, str);
        finish();
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doEntrySuccess() {
        MibiLog.d("ChannelPayEntryActivity", "entrySuccess");
        if (this.f10193a == null) {
            String string = getBaseContext().getResources().getString(a.e);
            MibiLog.e("ChannelPayEntryActivity", string);
            returnError(0, string);
            finish();
            return;
        }
        if (!a()) {
            String string2 = getBaseContext().getResources().getString(a.d);
            MibiLog.e("ChannelPayEntryActivity", string2);
            returnError(0, string2);
            finish();
            return;
        }
        b();
        PrivacyManager.makePrivacyParam(getSession(), MibiPrivacyUtils.MIBI_MARKET_TYPE, MibiPrivacyUtils.PRIVACY_PAYMENT_ENTRY);
        Intent intent = new Intent(this, (Class<?>) PrepareActivity.class);
        intent.putExtra(Constants.KEY_ORDER_BEAN, this.f10193a);
        startActivityForResult(intent, 1);
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doPreCreate(Bundle bundle) {
        super.doPreCreate(bundle);
        this.f10193a = (OrderBean) getIntent().getParcelableExtra(Constants.KEY_ORDER_BEAN);
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public boolean isNoAccount() {
        MibiLog.d("ChannelPayEntryActivity", "isNoAccount:" + this.f10193a.mIsNoAccount);
        return this.f10193a.mIsNoAccount;
    }
}
