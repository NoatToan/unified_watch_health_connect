package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import com.huawei.agconnect.common.aaid.AaidUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.b;
import com.huawei.hms.opendevice.g;
import com.huawei.hms.opendevice.h;
import com.huawei.hms.support.log.HMSLog;
import java.util.UUID;

/* JADX INFO: loaded from: classes33.dex */
@Deprecated
public class HmsInstanceIdEx {
    public static final String TAG = "HmsInstanceIdEx";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PushPreferences f12669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f12670c;

    private HmsInstanceIdEx(Context context) {
        this.f12669b = null;
        this.f12668a = context;
        this.f12669b = new PushPreferences(context, AaidUtils.f4803a);
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f12670c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f12670c = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f12670c.setKitSdkVersion(61300301);
    }

    private String a(String str) {
        return AaidUtils.f4804b + str;
    }

    public static HmsInstanceIdEx getInstance(Context context) {
        Preconditions.checkNotNull(context);
        return new HmsInstanceIdEx(context);
    }

    public void deleteAAID(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (this.f12669b.containsKey(str)) {
                this.f12669b.removeKey(str);
                this.f12669b.removeKey(a(str));
            }
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public String getAAId(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (this.f12669b.containsKey(str)) {
                return this.f12669b.getString(str);
            }
            String string = UUID.randomUUID().toString();
            this.f12669b.saveString(str, string);
            this.f12669b.saveLong(a(str), Long.valueOf(System.currentTimeMillis()));
            return string;
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public long getCreationTime(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (!this.f12669b.containsKey(a(str))) {
                getAAId(str);
            }
            return this.f12669b.getLong(a(str));
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public Task<TokenResult> getToken() {
        if (ProxyCenter.getProxy() != null) {
            try {
                HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
                ProxyCenter.getProxy().getToken(this.f12668a, null, null);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                taskCompletionSource.setResult(new TokenResult());
                return taskCompletionSource.getTask();
            } catch (ApiException e) {
                return a(e);
            } catch (Exception unused) {
                return a(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            }
        }
        String strA = h.a(this.f12668a, "push.gettoken");
        try {
            TokenReq tokenReqB = b.b(this.f12668a, null, null);
            tokenReqB.setAaid(HmsInstanceId.getInstance(this.f12668a).getId());
            return this.f12670c.doWrite(new g("push.gettoken", tokenReqB, this.f12668a, strA));
        } catch (RuntimeException unused2) {
            Context context = this.f12668a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context, "push.gettoken", strA, errorEnum);
            return a(errorEnum.toApiException());
        } catch (Exception unused3) {
            Context context2 = this.f12668a;
            ErrorEnum errorEnum2 = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context2, "push.gettoken", strA, errorEnum2);
            return a(errorEnum2.toApiException());
        }
    }

    private Task<TokenResult> a(Exception exc) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setException(exc);
        return taskCompletionSource.getTask();
    }
}
