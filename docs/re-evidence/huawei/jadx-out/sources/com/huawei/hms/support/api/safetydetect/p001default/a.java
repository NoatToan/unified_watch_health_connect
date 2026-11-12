package com.huawei.hms.support.api.safetydetect.p001default;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.safetydetect.SafetyDetectStatusCodes;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public abstract class a<T> extends TaskApiCall<t, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f16555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16556b;

    public abstract T a(String str, int i, String str2);

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 60100004;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(t tVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<T> taskCompletionSource) throws Throwable {
        Throwable th;
        int i;
        int i2;
        s e;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        try {
            if (responseErrorCode == null) {
                throw new s(getUri() + "response is null");
            }
            if (responseErrorCode.getErrorCode() == 0 && responseErrorCode.getStatusCode() == 0) {
                try {
                    taskCompletionSource.setResult(a(str, responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason()));
                    i5 = 0;
                } catch (s e2) {
                    e = e2;
                    i3 = 0;
                    try {
                        HMSLog.e("AbstractTaskApiCall", getUri() + "doExecute exception:" + e.getMessage());
                        taskCompletionSource.setException(new ApiException(new Status(SafetyDetectStatusCodes.SDK_INTERNAL_ERROR, SafetyDetectStatusCodes.getStatusCodeString(SafetyDetectStatusCodes.SDK_INTERNAL_ERROR))));
                        if (!this.f16556b) {
                            return;
                        } else {
                            i4 = i3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = i3;
                        i = i6;
                        if (this.f16556b) {
                            HiAnalyticsClient.reportExit(this.f16555a, getUri(), getTransactionId(), i, i2, 60700305);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                    i2 = 0;
                    if (this.f16556b) {
                        HiAnalyticsClient.reportExit(this.f16555a, getUri(), getTransactionId(), i, i2, 60700305);
                    }
                    throw th;
                }
            } else {
                int errorCode = responseErrorCode.getErrorCode();
                int iA = TextUtils.isEmpty(str) ? 1 : a(str, 1);
                taskCompletionSource.setException(new ApiException(a(errorCode, responseErrorCode.getErrorReason(), str)));
                i6 = iA;
                i5 = errorCode;
            }
            if (this.f16556b) {
                i4 = i5;
                HiAnalyticsClient.reportExit(this.f16555a, getUri(), getTransactionId(), i6, i4, 60700305);
            }
        } catch (s e3) {
            e = e3;
            i6 = 1;
            i3 = 0;
        } catch (Throwable th4) {
            th = th4;
            i = 1;
            i2 = 0;
        }
    }

    private Status a(int i, String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            return new Status(i, str);
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return new Status(jSONObject.getInt("statusCode"), jSONObject.getString("statusMsg"));
        } catch (JSONException unused) {
            return new Status(i, str);
        }
    }

    private int a(String str, int i) {
        try {
            return new JSONObject(str).optInt("statusCode", 1);
        } catch (JSONException e) {
            HMSLog.e("AbstractTaskApiCall", getUri() + "Get Status Code Error : " + e.getMessage());
            return i;
        }
    }

    a(Context context, String str, String str2, boolean z) {
        super(str, str2, z ? HiAnalyticsClient.reportEntry(context, str, 60700305) : null);
        this.f16555a = context;
        this.f16556b = z;
    }
}
