package com.mibi.sdk.partner.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.MibiSdkConstants;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.BaseEntryActivity;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.component.OrderBean;
import com.mibi.sdk.partner.a;

/* JADX INFO: loaded from: classes5.dex */
public class PartnerPayEntryActivity extends BaseEntryActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OrderBean f10189a;

    public final void a() {
        if (TextUtils.isEmpty(this.f10189a.mQueryIntervalConfig)) {
            return;
        }
        getSession().getMemoryStorage().put(MibiSdkConstants.MIBI_EXTRA_PARAMS, this.f10189a.mQueryIntervalConfig);
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doActivityResult(int i, int i2, Intent intent) {
        super.doActivityResult(i, i2, intent);
        MibiLog.d("PartnerPayEntryAct", "on activity result called");
        setResult(i2, intent);
        finish();
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doEntryFailed(int i, String str) {
        MibiLog.d("PartnerPayEntryAct", "do entry failed code : " + i + " ; msg : " + str);
        returnError(i, str);
        finish();
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doEntrySuccess() {
        MibiLog.d("PartnerPayEntryAct", "do entry success");
        OrderBean orderBean = this.f10189a;
        if (orderBean != null && !TextUtils.isEmpty(orderBean.mPartnerUserId) && !TextUtils.isEmpty(this.f10189a.mPartnerAccountType) && !TextUtils.isEmpty(this.f10189a.mOrder)) {
            OrderBean orderBean2 = this.f10189a;
            if (orderBean2.mPartnerMarketType > 0 && (orderBean2.mUseUi || !TextUtils.isEmpty(orderBean2.mChannel))) {
                this.mSession.getMemoryStorage().put(CommonConstants.KEY_IS_PARTNER_ACCOUNT, Boolean.TRUE);
                a();
                Intent intent = new Intent(this, (Class<?>) PartnerPayActivity.class);
                intent.putExtra(Constants.KEY_ORDER_BEAN, this.f10189a);
                startActivityForResult(intent, 48);
                return;
            }
        }
        String string = getString(a.f10182a);
        MibiLog.e("PartnerPayEntryAct", string);
        returnError(ErrorCodes.PARTNER_ORDER_INVALID, string);
        finish();
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doPreCreate(Bundle bundle) {
        super.doPreCreate(bundle);
        this.f10189a = (OrderBean) getIntent().getParcelableExtra(Constants.KEY_ORDER_BEAN);
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public boolean isNoAccount() {
        return true;
    }
}
