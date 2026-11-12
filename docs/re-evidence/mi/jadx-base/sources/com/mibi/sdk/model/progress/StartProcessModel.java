package com.mibi.sdk.model.progress;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.mibi.sdk.common.session.Session;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.ErrorCodes;
import com.mibi.sdk.model.IBaseModel;
import com.mibi.sdk.model.Model;
import com.mibi.sdk.task.RxBaseErrorHandleTaskListener;
import com.mibi.sdk.task.handler.NoPrivacyRightExceptionHandler;
import defpackage.n4h;

/* JADX INFO: loaded from: classes5.dex */
public class StartProcessModel extends Model<String> {
    private static final String TAG = "StartProcessModel";

    public class ProcessTaskListener extends RxBaseErrorHandleTaskListener<RxStartProcessTask.Result> {
        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleError(int i, String str, Throwable th) {
            MibiLog.d(StartProcessModel.TAG, "start process failed code : " + i + " ; desc : " + str, th);
            StartProcessModel.this.getCallback().onFailed(i, str, th);
        }

        private ProcessTaskListener(Context context) {
            super(context);
        }

        @Override // com.mibi.sdk.task.RxBaseErrorHandleTaskListener
        public void handleSuccess(RxStartProcessTask.Result result) {
            MibiLog.d(StartProcessModel.TAG, "start process success");
            String str = result.mProcessId;
            if (!TextUtils.isEmpty(str)) {
                StartProcessModel.this.getCallback().onSuccess(str);
            } else {
                MibiLog.d(StartProcessModel.TAG, "process is is null");
                StartProcessModel.this.getCallback().onFailed(ErrorCodes.START_PROCESS_FAILED, "process is is null", null);
            }
        }
    }

    public StartProcessModel(Session session) {
        super(session);
    }

    @Override // com.mibi.sdk.model.Model, com.mibi.sdk.model.IBaseModel
    public void request(Bundle bundle, IBaseModel.IResultCallback<String> iResultCallback) {
        super.request(bundle, iResultCallback);
        ProcessTaskListener processTaskListener = new ProcessTaskListener(getContext());
        processTaskListener.getDispatcher().register(new NoPrivacyRightExceptionHandler(getContext()) { // from class: com.mibi.sdk.model.progress.StartProcessModel.1
            @Override // com.mibi.sdk.task.handler.NoPrivacyRightExceptionHandler
            public boolean handleNoPrivacyRightException(int i, String str) {
                StartProcessModel.this.getCallback().onFailed(ErrorCodes.MIBI_PRIVACY_AUTHENTICATE_FAILED, str, null);
                return true;
            }
        });
        n4h.a(new RxStartProcessTask(getContext(), getSession())).c(processTaskListener);
    }
}
