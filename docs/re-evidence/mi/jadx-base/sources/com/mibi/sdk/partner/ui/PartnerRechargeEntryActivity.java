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
public class PartnerRechargeEntryActivity extends BaseEntryActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OrderBean f10192a;

    public final void a() {
        if (TextUtils.isEmpty(this.f10192a.mQueryIntervalConfig)) {
            return;
        }
        getSession().getMemoryStorage().put(MibiSdkConstants.MIBI_EXTRA_PARAMS, this.f10192a.mQueryIntervalConfig);
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doActivityResult(int i, int i2, Intent intent) {
        super.doActivityResult(i, i2, intent);
        MibiLog.d("PartnerRechargeEntryAct", "on activity result called");
        setResult(i2, intent);
        finish();
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doEntryFailed(int i, String str) {
        MibiLog.d("PartnerRechargeEntryAct", "do entry failed code : " + i + " ; msg : " + str);
        returnError(i, str);
        finish();
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doEntrySuccess() {
        MibiLog.d("PartnerRechargeEntryAct", "do entry success");
        OrderBean orderBean = this.f10192a;
        if (orderBean == null || TextUtils.isEmpty(orderBean.mPartnerUserId) || TextUtils.isEmpty(this.f10192a.mPartnerAccountType) || this.f10192a.mPartnerMarketType <= 0) {
            String string = getString(a.f10182a);
            MibiLog.e("PartnerRechargeEntryAct", string);
            returnError(ErrorCodes.PARTNER_ORDER_INVALID, string);
            finish();
            return;
        }
        this.mSession.getMemoryStorage().put(CommonConstants.KEY_IS_PARTNER_ACCOUNT, Boolean.TRUE);
        a();
        Intent intent = new Intent(this, (Class<?>) PartnerRechargeActivity.class);
        intent.putExtra(Constants.KEY_ORDER_BEAN, this.f10192a);
        startActivityForResult(intent, 49);
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public void doPreCreate(Bundle bundle) {
        super.doPreCreate(bundle);
        this.f10192a = (OrderBean) getIntent().getParcelableExtra(Constants.KEY_ORDER_BEAN);
    }

    @Override // com.mibi.sdk.component.BaseEntryActivity
    public boolean isNoAccount() {
        return true;
    }
}
