package com.huawei.hms.hwid;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.account.result.AccountIcon;
import com.huawei.hms.support.account.result.GetChannelResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.tencent.open.SocialConstants;
import org.json.JSONException;

/* JADX INFO: loaded from: classes34.dex */
public class i extends TaskApiCall<c, AccountIcon> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13562a;

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 10;
    }

    public i(String str, String str2, String str3, Context context) {
        super(str, str2, str3);
        this.f13562a = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(c cVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<AccountIcon> taskCompletionSource) {
        if (responseErrorCode == null) {
            ar.b("[AccountSDK]AccountGetChannelTaskApiCall", "response is null.", true);
            taskCompletionSource.setException(new ApiException(new Status(2003, "response is null.")));
            return;
        }
        int errorCode = responseErrorCode.getErrorCode();
        if (errorCode != 0 && CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            ar.b("[AccountSDK]AccountGetChannelTaskApiCall", "apk version is low or is not exist.", true);
            Status status = new Status(errorCode, responseErrorCode.getErrorReason());
            ao.a(responseErrorCode, status);
            taskCompletionSource.setException(new ResolvableApiException(status));
            return;
        }
        ar.b("[AccountSDK]AccountGetChannelTaskApiCall", "ResponseErrorCode.status:" + responseErrorCode.getErrorCode(), true);
        AccountIcon accountIcon = new AccountIcon();
        if (TextUtils.isEmpty(str)) {
            ar.b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel complete, response is null, failed", true);
            taskCompletionSource.setException(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
            return;
        }
        if ("{}".equals(str)) {
            ar.b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel complete, body is null", true);
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        try {
            GetChannelResult getChannelResultFromJson = new GetChannelResult().fromJson(str);
            if (getChannelResultFromJson.isSuccess()) {
                ar.b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel success", true);
                accountIcon.setDescription(getChannelResultFromJson.getDescription());
                accountIcon.setIcon(a(getChannelResultFromJson.getIcon()));
                taskCompletionSource.setResult(accountIcon);
                long jA = ao.a();
                SharedPreferences.Editor editorEdit = this.f13562a.getSharedPreferences("ACCOUNT_CHANNEL_CACHE", 0).edit();
                editorEdit.putLong("cache_time", jA);
                editorEdit.putString(SocialConstants.PARAM_APP_DESC, getChannelResultFromJson.getDescription());
                editorEdit.putString("icon", getChannelResultFromJson.getIcon());
                editorEdit.apply();
                return;
            }
            ar.b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel failed", true);
            taskCompletionSource.setException(new ApiException(getChannelResultFromJson.getStatus()));
        } catch (JSONException unused) {
            ar.c("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel complete, but parser json exception", true);
            taskCompletionSource.setException(new ApiException(new Status(errorCode, responseErrorCode.getErrorReason())));
        }
    }

    private Bitmap a(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e) {
            ar.d("[AccountSDK]AccountGetChannelTaskApiCall", "stringToBitmap Exception is " + e.getClass().getSimpleName(), true);
            return null;
        } catch (OutOfMemoryError unused) {
            ar.d("[AccountSDK]AccountGetChannelTaskApiCall", "out of memory error ", true);
            return null;
        }
    }
}
