package com.huawei.hms.support.hwid.common.e;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.ResultCallback;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.hwid.bean.CheckPasswordByUserIdReq;
import com.huawei.hms.support.hwid.common.cloudservice.CloudRequestHandler;
import com.huawei.hwid.core.helper.handler.ErrorStatus;
import com.huawei.up.request.HttpRequestBase;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes34.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f16632a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f16633b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16634c = "";
    private Context d;
    private CloudRequestHandler e;

    public static d a() {
        return f16632a;
    }

    public void a(Context context, CheckPasswordByUserIdReq checkPasswordByUserIdReq, String str, String str2, String str3, CloudRequestHandler cloudRequestHandler) {
        this.f16633b = str3;
        this.f16634c = checkPasswordByUserIdReq.getPackageName();
        this.d = context;
        this.e = cloudRequestHandler;
        final com.huawei.hms.support.hwid.common.c.a.b bVar = new com.huawei.hms.support.hwid.common.c.a.b(context, checkPasswordByUserIdReq, str, str2, str3);
        RestClientGlobalInstance.getInstance().init(this.d);
        RestClient restClientBuild = new RestClient.Builder(this.d).build();
        if (restClientBuild == null) {
            a(2003, "restClient is null");
            return;
        }
        a aVar = (a) restClientBuild.create(a.class);
        try {
            aVar.a(bVar.d(), RequestBody.create(" text/html; charset=utf-8", bVar.e().getBytes("UTF-8"))).enqueue(new ResultCallback<ResponseBody>() { // from class: com.huawei.hms.support.hwid.common.e.d.1
                @Override // com.huawei.hms.framework.network.restclient.ResultCallback
                public void onResponse(Response<ResponseBody> response) {
                    e.a("GetVerifyPwdUtil", "request getResource for siteDomain success");
                    d.this.a(bVar, response);
                }

                @Override // com.huawei.hms.framework.network.restclient.ResultCallback
                public void onFailure(Throwable th) {
                    e.a("GetVerifyPwdUtil", "request getResource for siteDomain onFailure");
                    d.this.a(2016, "request getResource for siteDomain onFailure");
                }
            });
        } catch (IOException unused) {
            e.a("GetVerifyPwdUtil", "request getResource for siteDomain IOException");
            a(2016, "request getResource for siteDomain IOException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.huawei.hms.support.hwid.common.c.a.b bVar, Response<ResponseBody> response) {
        e.a("GetVerifyPwdUtil", "handleRequestNet");
        int code = response.getCode();
        e.a("GetVerifyPwdUtil", "code:" + code);
        if (code == 200) {
            e.a("GetVerifyPwdUtil", "GetResourceRequest success");
            try {
                bVar.a(new String(response.getBody().bytes(), "UTF-8"));
                Bundle bundleB = bVar.b();
                String string = bundleB.getString(CommonConstant.KEY_ID_TOKEN);
                if (!TextUtils.isEmpty(string)) {
                    e.a("GetVerifyPwdUtil", "idToken is:" + string, false);
                    Bundle bundle = new Bundle();
                    bundle.putString(CommonConstant.KEY_ID_TOKEN, string);
                    this.e.onFinish(bundle);
                    return;
                }
                int i = bundleB.getInt("errorCode");
                e.a("GetVerifyPwdUtil", "handleRequestNet errorCode:" + i, true);
                a(2016, i, bundleB.getString(HttpRequestBase.TAG_ERROR_DESC));
                return;
            } catch (IOException unused) {
                e.a("GetVerifyPwdUtil", "IOException");
                a(2015, "IOException");
                return;
            } catch (XmlPullParserException unused2) {
                e.a("GetVerifyPwdUtil", "XmlPullParserException");
                a(2015, "XmlPullParserException");
                return;
            }
        }
        a(2016, "request error.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        a(i, i, str);
    }

    private void a(int i, int i2, String str) {
        ErrorStatus errorStatus = new ErrorStatus(i, str);
        errorStatus.setSubErrCode(i2);
        this.e.onError(errorStatus);
    }
}
