package com.mibi.sdk.pay.model;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.pay.task.RxUploadOrderGiftcardSettingTask;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import defpackage.n4h;

/* JADX INFO: loaded from: classes5.dex */
public class UploadOrderGiftcardModel extends Model<Void> {

    public class b extends RxBaseErrorHandleTaskListener<RxUploadOrderGiftcardSettingTask.Result> {
        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleSuccess(RxUploadOrderGiftcardSettingTask.Result result) {
            UploadOrderGiftcardModel.this.getCallback().onSuccess(null);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            UploadOrderGiftcardModel.this.getCallback().onFailed(i, str, th);
        }

        public b(Context context) {
            super(context);
        }
    }

    public UploadOrderGiftcardModel(Session session) {
        super(session);
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<Void> iResultCallback) {
        super.request(bundle, iResultCallback);
        RxUploadOrderGiftcardSettingTask rxUploadOrderGiftcardSettingTask = new RxUploadOrderGiftcardSettingTask(getContext(), getSession());
        rxUploadOrderGiftcardSettingTask.setParams((SortedParameter) bundle.getSerializable(Constants.KEY_SORTED_PARAMETERS));
        n4h.a(rxUploadOrderGiftcardSettingTask).c(new b(getContext()));
    }
}
