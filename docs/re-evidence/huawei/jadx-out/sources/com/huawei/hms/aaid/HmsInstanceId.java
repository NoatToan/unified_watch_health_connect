package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.agconnect.common.aaid.AaidUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.a;
import com.huawei.hms.opendevice.b;
import com.huawei.hms.opendevice.e;
import com.huawei.hms.opendevice.f;
import com.huawei.hms.opendevice.g;
import com.huawei.hms.opendevice.h;
import com.huawei.hms.opendevice.i;
import com.huawei.hms.opendevice.l;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes3.dex */
public class HmsInstanceId {
    public static final String TAG = "HmsInstanceId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PushPreferences f12666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HuaweiApi<Api.ApiOptions.NoOptions> f12667c;

    private HmsInstanceId(Context context) {
        this.f12665a = context.getApplicationContext();
        this.f12666b = new PushPreferences(context, AaidUtils.f4803a);
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f12667c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f12667c = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f12667c.setKitSdkVersion(61300301);
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!e.e(this.f12665a)) {
            i.a(this.f12665a).removeKey("subjectId");
            return;
        }
        String string = i.a(this.f12665a).getString("subjectId");
        if (TextUtils.isEmpty(string)) {
            i.a(this.f12665a).saveString("subjectId", str);
            return;
        }
        if (string.contains(str)) {
            return;
        }
        i.a(this.f12665a).saveString("subjectId", string + "," + str);
    }

    private void b() throws ApiException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw ErrorEnum.ERROR_MAIN_THREAD.toApiException();
        }
    }

    public static HmsInstanceId getInstance(Context context) {
        Preconditions.checkNotNull(context);
        l.c(context);
        return new HmsInstanceId(context);
    }

    public void deleteAAID() throws ApiException {
        b();
        try {
            if (this.f12666b.containsKey(AaidUtils.f4803a)) {
                this.f12666b.removeKey(AaidUtils.f4803a);
                this.f12666b.removeKey(AaidUtils.f4804b);
                if (b.d(this.f12665a)) {
                    if (ProxyCenter.getProxy() != null) {
                        HMSLog.i(TAG, "use proxy delete all token after delete AaId.");
                        ProxyCenter.getProxy().deleteAllToken(this.f12665a);
                        return;
                    }
                    DeleteTokenReq deleteTokenReqA = b.a(this.f12665a);
                    deleteTokenReqA.setDeleteType(1);
                    deleteTokenReqA.setMultiSender(false);
                    a(deleteTokenReqA, 1);
                    BaseUtils.deleteAllTokenCache(this.f12665a);
                }
            }
        } catch (ApiException e) {
            throw e;
        } catch (Exception unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public void deleteToken(String str, String str2) throws ApiException {
        b();
        a();
        DeleteTokenReq deleteTokenReqA = b.a(this.f12665a, str, str2);
        deleteTokenReqA.setMultiSender(false);
        a(deleteTokenReqA, 1);
    }

    public Task<AAIDResult> getAAID() {
        try {
            return Tasks.callInBackground(new a(this.f12665a.getApplicationContext()));
        } catch (Exception unused) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setException(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            return taskCompletionSource.getTask();
        }
    }

    public long getCreationTime() {
        try {
            if (!this.f12666b.containsKey(AaidUtils.f4804b)) {
                getAAID();
            }
            return this.f12666b.getLong(AaidUtils.f4804b);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String getId() {
        return b.b(this.f12665a);
    }

    @Deprecated
    public String getToken() {
        try {
            return getToken(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getToken(String str, String str2) throws ApiException {
        b();
        a();
        TokenReq tokenReqB = b.b(this.f12665a, null, str2);
        tokenReqB.setAaid(getId());
        tokenReqB.setMultiSender(false);
        i.a(this.f12665a).saveString(this.f12665a.getPackageName(), "1");
        return a(tokenReqB, 1);
    }

    public void deleteToken(String str) throws ApiException {
        b();
        a();
        if (!TextUtils.isEmpty(str)) {
            String strC = b.c(this.f12665a);
            if (!TextUtils.isEmpty(strC)) {
                if (str.equals(strC)) {
                    deleteToken(null, null);
                    return;
                }
                DeleteTokenReq deleteTokenReqA = b.a(this.f12665a, str);
                deleteTokenReqA.setMultiSender(true);
                a(deleteTokenReqA, 2);
                return;
            }
            throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public String getToken(String str) throws ApiException {
        b();
        a();
        if (!TextUtils.isEmpty(str)) {
            String strC = b.c(this.f12665a);
            if (!TextUtils.isEmpty(strC)) {
                if (str.equals(strC)) {
                    return getToken(null, null);
                }
                TokenReq tokenReqB = b.b(this.f12665a, str);
                tokenReqB.setAaid(getId());
                tokenReqB.setMultiSender(true);
                return a(tokenReqB, 2);
            }
            throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    private String a(TokenReq tokenReq, int i) throws ApiException {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
            ProxyCenter.getProxy().getToken(this.f12665a, tokenReq.getSubjectId(), null);
            return null;
        }
        a(tokenReq.getSubjectId());
        String strA = h.a(this.f12665a, "push.gettoken");
        try {
            HMSLog.d(TAG, "getToken req :" + tokenReq.toString());
            g gVar = new g("push.gettoken", tokenReq, this.f12665a, strA);
            gVar.setApiLevel(i);
            return ((TokenResult) Tasks.await(this.f12667c.doWrite(gVar))).getToken();
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e.getCause();
                h.a(this.f12665a, "push.gettoken", strA, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f12665a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context, "push.gettoken", strA, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    private void a(DeleteTokenReq deleteTokenReq, int i) throws ApiException {
        String subjectId = deleteTokenReq.getSubjectId();
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i(TAG, "use proxy delete token");
            ProxyCenter.getProxy().deleteToken(this.f12665a, subjectId, null);
            return;
        }
        String strA = h.a(this.f12665a, "push.deletetoken");
        try {
            String strB = i.a(this.f12665a).b(subjectId);
            if (deleteTokenReq.isMultiSender() && (TextUtils.isEmpty(strB) || strB.equals(i.a(this.f12665a).b(null)))) {
                i.a(this.f12665a).removeKey(subjectId);
                HMSLog.i(TAG, "The local subject token is null");
                return;
            }
            deleteTokenReq.setToken(strB);
            f fVar = new f("push.deletetoken", deleteTokenReq, strA);
            fVar.setApiLevel(i);
            Tasks.await(this.f12667c.doWrite(fVar));
            i.a(this.f12665a).c(subjectId);
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e.getCause();
                h.a(this.f12665a, "push.deletetoken", strA, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f12665a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            h.a(context, "push.deletetoken", strA, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    private void a() throws ApiException {
        if (BaseUtils.getProxyInit(this.f12665a) && ProxyCenter.getProxy() == null && !BaseUtils.isMainProc(this.f12665a)) {
            HMSLog.e(TAG, "Operations in child processes are not supported.");
            throw ErrorEnum.ERROR_OPER_IN_CHILD_PROCESS.toApiException();
        }
    }
}
