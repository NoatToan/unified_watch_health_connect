package com.mibi.sdk.model.domain;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import defpackage.n4h;

/* JADX INFO: loaded from: classes5.dex */
public class UpdateDomainModel extends Model<Void> {
    private static final String TAG = "UpdateDomainModel";

    public class UpdateDomainTaskListener extends RxBaseErrorHandleTaskListener<RxUpdateDomainTask.Result> {
        public UpdateDomainTaskListener(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d(UpdateDomainModel.TAG, "update domain failed code : " + i + " ; desc : " + str, th);
            UpdateDomainModel.this.getCallback().onFailed(i, str, th);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleSuccess(RxUpdateDomainTask.Result result) {
            MibiLog.d(UpdateDomainModel.TAG, "update domain success");
            UpdateDomainModel.this.getCallback().onSuccess(null);
        }
    }

    public UpdateDomainModel(Session session) {
        super(session);
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<Void> iResultCallback) {
        super.request(bundle, iResultCallback);
        MibiLog.d(TAG, "start request");
        SortedParameter sortedParameter = (SortedParameter) bundle.getSerializable(Constants.KEY_SORTED_PARAMETERS);
        RxUpdateDomainTask rxUpdateDomainTask = new RxUpdateDomainTask(getContext(), getSession());
        rxUpdateDomainTask.setParams(sortedParameter);
        n4h.a(rxUpdateDomainTask).c(new UpdateDomainTaskListener(getContext()));
    }
}
