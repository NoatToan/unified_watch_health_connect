package com.huawei.hms.hwid;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.utils.UIUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ae extends TaskApiCall<u, Intent> {
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    public ae(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(u uVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Intent> taskCompletionSource) {
        if (responseErrorCode == null) {
            ar.b("NoticeTaskApiCall", "header is null.", true);
            taskCompletionSource.setException(new ApiException(new Status(2003, "response is null.")));
        } else if (responseErrorCode.getStatusCode() == 0 && responseErrorCode.getErrorCode() == 0) {
            ar.b("NoticeTaskApiCall", "Jos Notice onResult success.", true);
            a(responseErrorCode.getParcelable(), uVar, responseErrorCode, taskCompletionSource);
        } else {
            ar.c("NoticeTaskApiCall", "Jos Notice onResult failed, ErrCode" + responseErrorCode.getErrorCode(), true);
        }
    }

    private void a(Parcelable parcelable, u uVar, ResponseErrorCode responseErrorCode, TaskCompletionSource<Intent> taskCompletionSource) {
        Activity currentActivity = ActivityMgr.INST.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            ar.b("NoticeTaskApiCall", "launchNoticeActivity failed, activity is invalid", true);
            return;
        }
        if (parcelable instanceof Intent) {
            try {
                currentActivity.startActivity((Intent) parcelable);
            } catch (Exception unused) {
                ar.d("NoticeTaskApiCall", "Jos Notice startActivity meet exception", true);
            }
        } else if (parcelable instanceof PendingIntent) {
            PendingIntent pendingIntent = (PendingIntent) parcelable;
            try {
                if (UIUtil.isBackground(uVar.getContext())) {
                    ar.b("NoticeTaskApiCall", "ui isBackground.", true);
                    taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), pendingIntent)));
                } else {
                    currentActivity.startIntentSender(pendingIntent.getIntentSender(), null, 0, 0, 0);
                }
            } catch (IntentSender.SendIntentException unused2) {
                ar.d("NoticeTaskApiCall", "Jos Notice startIntentSender meet exception", true);
            }
        }
    }
}
