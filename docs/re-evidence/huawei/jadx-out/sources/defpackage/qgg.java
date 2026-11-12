package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.Services;
import java.io.File;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes15.dex */
public class qgg implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f46168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private oaw f46169c;

    public boolean b(oaw oawVar) {
        return true;
    }

    public qgg(oaw oawVar) {
        this.f46169c = oawVar;
        c();
    }

    public String a() {
        return this.f46169c.d();
    }

    protected void c(oaw oawVar) {
        if (oawVar == null) {
            LogUtil.j("BaseTask", "onTaskSuccess basicMessage is null ");
        } else {
            LogUtil.a("BaseTask", "onTaskSuccess state == ", Integer.valueOf(oawVar.c()));
        }
    }

    protected void d(oaw oawVar) {
        LogUtil.e("BaseTask", "onTaskFailed");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (b(this.f46169c)) {
            c(this.f46169c);
        } else {
            d(this.f46169c);
        }
    }

    obb a(oaw oawVar) {
        if (!(oawVar instanceof obb)) {
            return null;
        }
        obb obbVar = (obb) oawVar;
        obbVar.b(CommonUtil.a(BaseApplication.getContext()));
        if (TextUtils.isEmpty(this.f46168b)) {
            c();
        }
        obbVar.e(this.f46168b);
        obbVar.e(200);
        return obbVar;
    }

    obb d(int i) {
        return new obb(a(), i, 2);
    }

    xiu e(obb obbVar) {
        byte[] bytes;
        xiu.c cVar = new xiu.c();
        String json = new Gson().toJson(obbVar);
        LogUtil.a("BaseTask", "SendDeviceMsg == ", json);
        try {
            bytes = json.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("BaseTask", "getRequestMsg UnsupportedEncodingException");
            bytes = null;
        }
        cVar.a(bytes);
        return cVar.c();
    }

    xiu b(File file) {
        xiu.c cVar = new xiu.c();
        cVar.a(file);
        return cVar.c();
    }

    private void c() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        if (EnvironmentUtils.d()) {
            String strE = e(userProfileMgrApi.getUserInfo());
            this.f46168b = strE;
            LogUtil.d("BaseTask", "Main process get userinfo success mUserName = ", strE);
            return;
        }
        userProfileMgrApi.getUserInfo(new BaseResponseCallback<UserInfomation>() { // from class: qgg.2
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, UserInfomation userInfomation) {
                if (i != 0) {
                    LogUtil.j("BaseTask", "get userinfo failed errCode = ", Integer.valueOf(i));
                } else {
                    if (userInfomation == null) {
                        LogUtil.j("BaseTask", "get userinfo success but obtain null objData");
                        return;
                    }
                    qgg qggVar = qgg.this;
                    qggVar.f46168b = qggVar.e(userInfomation);
                    LogUtil.d("BaseTask", "not Main process get mUserName = ", qgg.this.f46168b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(UserInfomation userInfomation) {
        if (userInfomation != null) {
            String name = userInfomation.getName();
            return TextUtils.isEmpty(name) ? new UpApi(BaseApplication.getContext()).getAccountName() : name;
        }
        return "";
    }

    public static class b implements SendCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ResponseCallback f46171c;

        b(ResponseCallback responseCallback) {
            this.f46171c = responseCallback;
        }

        @Override // com.huawei.health.deviceconnect.callback.SendCallback
        public void onSendResult(int i) {
            if (i == 500000) {
                return;
            }
            if (i == 207) {
                LogUtil.a("BaseTask", "SendEndMessage success, code == ", Integer.valueOf(i));
            } else {
                LogUtil.a("BaseTask", "SendEndMessage fail! code ", Integer.valueOf(i));
            }
            ResponseCallback responseCallback = this.f46171c;
            if (responseCallback != null) {
                responseCallback.onResult(i, null);
            }
        }

        @Override // com.huawei.health.deviceconnect.callback.SendCallback
        public void onSendProgress(long j) {
            LogUtil.d("BaseTask", "SendEndMessage onSendProgress count == ", Long.valueOf(j));
        }

        @Override // com.huawei.health.deviceconnect.callback.SendCallback
        public void onFileTransferReport(String str) {
            LogUtil.d("BaseTask", "SendEndMessageCallback onFileTransferReport transferWay:", str);
        }
    }

    protected boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return xjh.a(str);
    }

    xiu c(oba obaVar) {
        byte[] bytes;
        LogUtil.a("BaseTask", "generatorMedalMessage SendDeviceMsg");
        xiu.c cVar = new xiu.c();
        String json = new Gson().toJson(obaVar);
        LogUtil.d("BaseTask", "generatorMedalMessage SendDeviceMsg == ", json);
        try {
            bytes = json.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("BaseTask", "getRequestMsg UnsupportedEncodingException");
            bytes = null;
        }
        cVar.a(bytes);
        return cVar.c();
    }
}
