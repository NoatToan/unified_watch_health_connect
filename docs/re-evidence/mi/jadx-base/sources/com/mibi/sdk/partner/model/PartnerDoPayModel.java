package com.mibi.sdk.partner.model;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import defpackage.n2s;
import defpackage.n4h;

/* JADX INFO: loaded from: classes5.dex */
public class PartnerDoPayModel extends Model<Bundle> {
    private static final String TAG = "PartnerDoPayModel";

    public class b extends RxBaseErrorHandleTaskListener<n2s.a> {
        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(n2s.a aVar) {
            MibiLog.d(PartnerDoPayModel.TAG, "success");
            PartnerDoPayModel.this.getCallback().onSuccess(aVar.f27494a);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d(PartnerDoPayModel.TAG, "error:" + i, th);
            PartnerDoPayModel.this.getCallback().onFailed(i, str, th);
        }

        public b(Context context) {
            super(context);
        }
    }

    public PartnerDoPayModel(Session session) {
        super(session);
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<Bundle> iResultCallback) {
        super.request(bundle, iResultCallback);
        MibiLog.d(TAG, "request");
        String string = bundle.getString(CommonConstants.KEY_PROCESS_ID);
        boolean z = bundle.getBoolean(Constants.KEY_USE_GIFTCARD);
        boolean z2 = bundle.getBoolean(Constants.KEY_USE_PARTNER_GIFTCARD);
        long j = bundle.getLong(Constants.KEY_USE_DISCOUNT_GIFT_CARD_ID, 0L);
        SortedParameter sortedParameter = new SortedParameter();
        sortedParameter.add(CommonConstants.KEY_PROCESS_ID, string);
        sortedParameter.add(Constants.KEY_USE_GIFTCARD, Boolean.valueOf(z));
        sortedParameter.add(Constants.KEY_USE_PARTNER_GIFTCARD, Boolean.valueOf(z2));
        sortedParameter.add(Constants.KEY_USE_DISCOUNT_GIFT_CARD_ID, Long.valueOf(j));
        n2s n2sVar = new n2s(getContext(), getSession(), string);
        n2sVar.setParams(sortedParameter);
        n4h.a(n2sVar).c(new b(getContext()));
    }
}
