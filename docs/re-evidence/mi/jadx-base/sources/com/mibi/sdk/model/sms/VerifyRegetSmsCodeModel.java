package com.mibi.sdk.model.sms;

import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import defpackage.n4h;

/* JADX INFO: loaded from: classes5.dex */
public class VerifyRegetSmsCodeModel extends Model<Void> {
    private static final String TAG = "VerifyRegetSmsCodeModel";

    public VerifyRegetSmsCodeModel(Session session) {
        super(session);
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<Void> iResultCallback) {
        MibiLog.d(TAG, "resend sms");
        super.request(bundle, iResultCallback);
        String string = bundle.getString(CommonConstants.KEY_PROCESS_ID);
        RxVerifyRegetSmsCodeTask rxVerifyRegetSmsCodeTask = new RxVerifyRegetSmsCodeTask(getContext(), getSession());
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, string);
        rxVerifyRegetSmsCodeTask.setParams(sortedParameter);
        n4h.a(rxVerifyRegetSmsCodeTask).b();
    }
}
