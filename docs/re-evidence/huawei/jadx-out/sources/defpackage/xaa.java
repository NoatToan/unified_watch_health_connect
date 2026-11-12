package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.UnknownHostException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class xaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f52644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f52645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f52646c;
    private String e;

    public xaa() {
        Context context = BaseApplication.getContext();
        this.f52644a = context;
        this.f52645b = LoginInit.getInstance(context).getAccountInfo(1008);
        this.f52646c = LoginInit.getInstance(this.f52644a).getAccountInfo(1011);
        this.e = GRSManager.c(this.f52644a).getUrl("healthCloudUrl") + "/dataOpen/weixin/createQrcodeTicketsNew";
    }

    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("WechatRankingCloudInteractor", "getQrCodeTicket");
        if (iBaseResponseCallback == null) {
            LogUtil.e("WechatRankingCloudInteractor", "callback is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: xaa.5
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    String strE = xaa.this.e();
                    LogUtil.d("WechatRankingCloudInteractor", "getQrCodeTicket ticketStr is ", strE);
                    xaa.this.c(strE, iBaseResponseCallback);
                }
            });
        }
    }

    private String e(String str) throws Throwable {
        Throwable th;
        InputStreamReader inputStreamReader;
        Exception e;
        InputStream content;
        if (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f52646c) || TextUtils.isEmpty(this.f52645b)) {
            LogUtil.e("WechatRankingCloudInteractor", "mCreateQrCodeUrl or param is null");
            return "";
        }
        InputStream inputStream = null;
        InputStreamReader inputStreamReader2 = null;
        inputStreamReader = null;
        inputStreamReader = null;
        inputStreamReader = null;
        inputStreamReader = null;
        inputStreamReader = null;
        InputStreamReader inputStreamReader3 = null;
        inputStream = null;
        try {
            HttpPost httpPost = new HttpPost(this.e);
            httpPost.setHeader("x-huid", this.f52646c);
            httpPost.setHeader("x-version", CommonUtil.c(this.f52644a));
            httpPost.setHeader("Content-Type", "application/json; charset=utf-8");
            httpPost.setEntity(new StringEntity(str, "utf-8"));
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            defaultHttpClient.getParams().setParameter("http.connection.timeout", 10000);
            defaultHttpClient.getParams().setParameter("http.socket.timeout", 10000);
            HttpResponse httpResponseExecute = defaultHttpClient.execute(httpPost);
            int statusCode = httpResponseExecute.getStatusLine().getStatusCode();
            LogUtil.a("WechatRankingCloudInteractor", "getQrCodeTicket: response = ", Integer.valueOf(statusCode));
            if (statusCode != 200) {
                LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket Network error!");
                FileUtils.a((Closeable) null);
                FileUtils.a((Closeable) null);
                return "";
            }
            content = httpResponseExecute.getEntity().getContent();
            try {
                InputStreamReader inputStreamReader4 = new InputStreamReader(content, "UTF-8");
                try {
                    String strD = d(inputStreamReader4);
                    FileUtils.a(content);
                    FileUtils.a(inputStreamReader4);
                    return strD;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    e = e;
                    inputStreamReader3 = inputStreamReader4;
                    try {
                        LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket error,", e.getMessage());
                        FileUtils.a(content);
                        inputStreamReader = inputStreamReader3;
                        FileUtils.a(inputStreamReader);
                        return "";
                    } catch (Throwable th2) {
                        th = th2;
                        inputStreamReader4 = inputStreamReader3;
                        inputStream = content;
                        inputStreamReader = inputStreamReader4;
                        FileUtils.a(inputStream);
                        FileUtils.a(inputStreamReader);
                        throw th;
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    e = e;
                    inputStreamReader3 = inputStreamReader4;
                    LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket error,", e.getMessage());
                    FileUtils.a(content);
                    inputStreamReader = inputStreamReader3;
                    FileUtils.a(inputStreamReader);
                    return "";
                } catch (UnknownHostException e4) {
                    e = e4;
                    e = e;
                    inputStreamReader3 = inputStreamReader4;
                    LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket error,", e.getMessage());
                    FileUtils.a(content);
                    inputStreamReader = inputStreamReader3;
                    FileUtils.a(inputStreamReader);
                    return "";
                } catch (ClientProtocolException e5) {
                    e = e5;
                    e = e;
                    inputStreamReader3 = inputStreamReader4;
                    LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket error,", e.getMessage());
                    FileUtils.a(content);
                    inputStreamReader = inputStreamReader3;
                    FileUtils.a(inputStreamReader);
                    return "";
                } catch (HttpHostConnectException e6) {
                    e = e6;
                    e = e;
                    inputStreamReader3 = inputStreamReader4;
                    LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket error,", e.getMessage());
                    FileUtils.a(content);
                    inputStreamReader = inputStreamReader3;
                    FileUtils.a(inputStreamReader);
                    return "";
                } catch (IOException unused) {
                    inputStreamReader2 = inputStreamReader4;
                    InputStreamReader inputStreamReader5 = inputStreamReader2;
                    inputStream = content;
                    inputStreamReader = inputStreamReader5;
                    try {
                        LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket IOException");
                        FileUtils.a(inputStream);
                        FileUtils.a(inputStreamReader);
                        return "";
                    } catch (Throwable th3) {
                        th = th3;
                        FileUtils.a(inputStream);
                        FileUtils.a(inputStreamReader);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = content;
                    inputStreamReader = inputStreamReader4;
                    FileUtils.a(inputStream);
                    FileUtils.a(inputStreamReader);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (IllegalArgumentException e7) {
                e = e7;
            } catch (IllegalStateException e8) {
                e = e8;
            } catch (UnknownHostException e9) {
                e = e9;
            } catch (ClientProtocolException e10) {
                e = e10;
            } catch (HttpHostConnectException e11) {
                e = e11;
            } catch (Throwable th5) {
                th = th5;
                inputStream = content;
                inputStreamReader = null;
                FileUtils.a(inputStream);
                FileUtils.a(inputStreamReader);
                throw th;
            }
        } catch (IllegalArgumentException e12) {
            e = e12;
            e = e;
            content = null;
            LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket error,", e.getMessage());
            FileUtils.a(content);
            inputStreamReader = inputStreamReader3;
            FileUtils.a(inputStreamReader);
            return "";
        } catch (IllegalStateException e13) {
            e = e13;
            e = e;
            content = null;
            LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket error,", e.getMessage());
            FileUtils.a(content);
            inputStreamReader = inputStreamReader3;
            FileUtils.a(inputStreamReader);
            return "";
        } catch (UnknownHostException e14) {
            e = e14;
            e = e;
            content = null;
            LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket error,", e.getMessage());
            FileUtils.a(content);
            inputStreamReader = inputStreamReader3;
            FileUtils.a(inputStreamReader);
            return "";
        } catch (ClientProtocolException e15) {
            e = e15;
            e = e;
            content = null;
            LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket error,", e.getMessage());
            FileUtils.a(content);
            inputStreamReader = inputStreamReader3;
            FileUtils.a(inputStreamReader);
            return "";
        } catch (HttpHostConnectException e16) {
            e = e16;
            e = e;
            content = null;
            LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket error,", e.getMessage());
            FileUtils.a(content);
            inputStreamReader = inputStreamReader3;
            FileUtils.a(inputStreamReader);
            return "";
        } catch (IOException unused3) {
            inputStreamReader = null;
        } catch (Throwable th6) {
            th = th6;
            inputStreamReader = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("WechatRankingCloudInteractor", "qrCodeInfo is null");
            iBaseResponseCallback.a(-1, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("ticket");
            String strOptString2 = jSONObject.optString("verifyCode");
            String strOptString3 = jSONObject.optString("expireTime");
            String strOptString4 = jSONObject.optString("resultCode");
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                xab xabVar = new xab(d(strOptString, strOptString2), CommonUtil.m(this.f52644a, strOptString3), 5);
                if ("601010".equals(strOptString4)) {
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_BIND_WECHAT_85070019.value(), CommonUtil.n(this.f52644a, strOptString4));
                    iBaseResponseCallback.a(2, xabVar);
                    return;
                } else {
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_BIND_WECHAT_85070019.value(), CommonUtil.n(this.f52644a, "0"));
                    iBaseResponseCallback.a(0, xabVar);
                    return;
                }
            }
            LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket ticket/verifyCode/expireTime is empty");
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_BIND_WECHAT_85070019.value(), CommonUtil.n(this.f52644a, strOptString4));
            iBaseResponseCallback.a(-1, null);
        } catch (JSONException e) {
            LogUtil.e("WechatRankingCloudInteractor", "getQrCodeTicket JSONException,e is ", e.getMessage());
            iBaseResponseCallback.a(-1, null);
        }
    }

    private String d(String str, String str2) {
        return str + "#" + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() throws Throwable {
        LogUtil.a("WechatRankingCloudInteractor", "getTicketByRequestUrl");
        String strE = e(e(1));
        if (b(strE)) {
            return strE;
        }
        LogUtil.j("WechatRankingCloudInteractor", "getTicketByRequestUrl not bound");
        return e(e(0));
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WechatRankingCloudInteractor", "isTicketValid: ticket is empty");
            return false;
        }
        String strD = lon.c().d("domain_we_qq");
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("WechatRankingCloudInteractor", "isTicketValid: get tencentDomainName fail");
            return false;
        }
        return str.contains(strD);
    }

    private String e(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mac", "");
            jSONObject.put("opType", i);
            jSONObject.put("productId", "");
            jSONObject.put("devType", "classical");
            jSONObject.put("source", 1);
            jSONObject.put("token", this.f52645b);
            jSONObject.put("tokenType", ThirdLoginDataStorageUtil.getTokenTypeValue());
            jSONObject.put("appId", BaseApplication.getAppPackage());
            jSONObject.put("upDeviceType", 9);
            jSONObject.put("environment", 1);
            jSONObject.put("ts", System.currentTimeMillis());
            LogUtil.a("WechatRankingCloudInteractor", "ts is", Long.valueOf(System.currentTimeMillis()));
        } catch (JSONException unused) {
            LogUtil.a("WechatRankingCloudInteractor", "JSONException e");
        }
        return jSONObject.toString();
    }

    private String d(InputStreamReader inputStreamReader) {
        char[] cArr = new char[1024];
        StringBuilder sb = new StringBuilder(1024);
        int i = 0;
        do {
            try {
                int i2 = inputStreamReader.read(cArr, 0, 1024);
                if (i2 == -1) {
                    break;
                }
                sb.append(cArr, 0, i2);
                i += i2;
            } catch (IOException unused) {
                LogUtil.e("WechatRankingCloudInteractor", "inputStreamReader2String IOException");
            }
        } while (i <= 10485760);
        return sb.toString();
    }
}
