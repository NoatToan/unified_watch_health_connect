package com.huawei.hwcloudmodel.agreement;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.hwcloudmodel.https.HttpResCallBack;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.lqb;
import defpackage.lsy;
import health.compact.a.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AgrHttp {
    private static final String QUERY_NSP = "as.user.query";
    private static final String SIGN_NSP = "as.user.sign";
    private static final String TAG = "SignAgrHttp";

    public String signHttpReq(String str, String str2, SignAgreementRequestBean signAgreementRequestBean, HttpResCallBack httpResCallBack) {
        String json = new Gson().toJson(signAgreementRequestBean);
        LogUtil.a(TAG, "Show_signAgrReqBean ", json);
        String strObtainBody = obtainBody(SIGN_NSP, str, json);
        LogUtil.a(TAG, "Show_signAgrReqBean reqBody ", strObtainBody);
        try {
            postReq(str2, strObtainBody, obtainHeader(new URL(str2).getHost()), httpResCallBack);
            return json;
        } catch (IOException unused) {
            LogUtil.e(TAG, "agr_sign_response data exception");
            return json;
        }
    }

    public String signHttpReq(String str, String str2, boolean z, List<Integer> list, String str3, String str4, HttpResCallBack httpResCallBack) {
        LogUtil.a(TAG, "Show_signAgrReqBean CountryCode ", str3);
        String json = new Gson().toJson(composeSignAgrReqBean(str3, str4, z, list));
        LogUtil.a(TAG, "Show_signAgrReqBean ", json);
        String strObtainBody = obtainBody(SIGN_NSP, str, json);
        LogUtil.a(TAG, "Show_signAgrReqBean reqBody ", strObtainBody);
        try {
            postReq(str2, strObtainBody, obtainHeader(new URL(str2).getHost()), httpResCallBack);
            return json;
        } catch (IOException unused) {
            LogUtil.e(TAG, "agr_sign_response data exception");
            return json;
        }
    }

    public String queryHttpReq(String str, String str2, QueryAgreementRequestBean queryAgreementRequestBean, HttpResCallBack httpResCallBack) {
        String json = new Gson().toJson(queryAgreementRequestBean);
        LogUtil.a(TAG, "Show_queryAgrReqBean ", json);
        try {
            postReq(str2, obtainBody(QUERY_NSP, str, json), obtainHeader(new URL(str2).getHost()), httpResCallBack);
            return "";
        } catch (IOException unused) {
            LogUtil.e(TAG, "queryHttpReq data IOException");
            return "";
        }
    }

    public String queryHttpReq(String str, String str2, boolean z, HttpResCallBack httpResCallBack) {
        String json = new Gson().toJson(composeQueryAgrReqBean(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010), z));
        LogUtil.a(TAG, "Show_queryAgrReqBean ", json);
        try {
            postReq(str2, obtainBody(QUERY_NSP, str, json), obtainHeader(new URL(str2).getHost()), httpResCallBack);
            return "";
        } catch (IOException unused) {
            LogUtil.e(TAG, "queryHttpReq data IOException");
            return "";
        }
    }

    public String queryHttpBetaReq(String str, String str2, HttpResCallBack httpResCallBack) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new QueryAgreementRequestInfo(AgrConstant.BETA_USER_AGREEMENT_CODE, accountInfo));
        String json = new Gson().toJson(new QueryAgreementRequestBean(arrayList));
        LogUtil.a(TAG, "Show_queryHttpBetaReq ", json);
        try {
            postReq(str2, obtainBody(QUERY_NSP, str, json), obtainHeader(new URL(str2).getHost()), httpResCallBack);
            return "";
        } catch (IOException unused) {
            LogUtil.e(TAG, "queryHttpBetaReq data IOException");
            httpResCallBack.onFinished(-1, null);
            return "";
        }
    }

    public static int postReq(String str, String str2, HashMap<String, String> map, HttpResCallBack httpResCallBack) {
        LogUtil.a(TAG, "entry Https.postReq Url:", str, ", Param:", str2);
        HttpsURLConnection httpsURLConnectionC = lqb.c(str);
        if (httpsURLConnectionC == null) {
            if (httpResCallBack != null) {
                httpResCallBack.onFinished(-1, null);
            }
            return -1;
        }
        lqb.e(httpsURLConnectionC);
        httpsURLConnectionC.setDoOutput(true);
        httpsURLConnectionC.setDoInput(true);
        httpsURLConnectionC.setUseCaches(false);
        try {
            httpsURLConnectionC.setRequestMethod("POST");
            if (map != null) {
                lqb.c(httpsURLConnectionC, map);
            }
            LogUtil.d(TAG, "postReq-->stringBody:", str2);
            lsy.a(startRunnable(str2, httpsURLConnectionC, httpResCallBack));
            LogUtil.a(TAG, "exit AchieveHttps.postReq");
            return 0;
        } catch (ProtocolException unused) {
            LogUtil.e(TAG, "postReq ProtocolException");
            return -1;
        }
    }

    private static Runnable startRunnable(final String str, final HttpsURLConnection httpsURLConnection, final HttpResCallBack httpResCallBack) {
        return new Runnable() { // from class: com.huawei.hwcloudmodel.agreement.AgrHttp.1
            /* JADX WARN: Code duplicated, block: B:48:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                InputStream inputStream;
                String str2;
                String str3;
                HttpResCallBack httpResCallBack2;
                OutputStream outputStream;
                int i = -1;
                OutputStream outputStream2 = null;
                str = null;
                InputStream inputStream2 = null;
                String str4 = null;
                outputStream2 = null;
                outputStream2 = null;
                OutputStream outputStream3 = null;
                try {
                    try {
                        if (TextUtils.isEmpty(str)) {
                            outputStream = null;
                        } else {
                            outputStream = httpsURLConnection.getOutputStream();
                            try {
                                outputStream.write(str.getBytes("UTF-8"));
                                outputStream.flush();
                            } catch (IOException unused) {
                                inputStream = null;
                                OutputStream outputStream4 = outputStream;
                                str3 = str4;
                                outputStream2 = outputStream4;
                                LogUtil.e(AgrHttp.TAG, "startRunnable IOException");
                                str2 = str3;
                                AgrHttp.dealFinallyStream(outputStream2, inputStream);
                                httpResCallBack2 = httpResCallBack;
                                if (httpResCallBack2 != null) {
                                    try {
                                        httpResCallBack2.onFinished(i, str2);
                                    } catch (Exception unused2) {
                                        LogUtil.e(AgrHttp.TAG, "startRunnable Exception");
                                        return;
                                    }
                                }
                            } catch (Exception unused3) {
                                inputStream = null;
                                str2 = null;
                                outputStream2 = outputStream;
                                LogUtil.e(AgrHttp.TAG, "startRunnable Exception");
                                AgrHttp.dealFinallyStream(outputStream2, inputStream);
                                httpResCallBack2 = httpResCallBack;
                                if (httpResCallBack2 != null) {
                                    httpResCallBack2.onFinished(i, str2);
                                }
                            } catch (Throwable th) {
                                th = th;
                                inputStream = null;
                                outputStream3 = outputStream;
                                AgrHttp.dealFinallyStream(outputStream3, inputStream);
                                throw th;
                            }
                        }
                        httpsURLConnection.connect();
                        int responseCode = httpsURLConnection.getResponseCode();
                        LogUtil.a(AgrHttp.TAG, "postReq-->responseCode:", Integer.valueOf(responseCode), " message ", httpsURLConnection.getResponseMessage());
                        LogUtil.a(AgrHttp.TAG, "postReq-->responseHeader: ", httpsURLConnection.getHeaderFields());
                        if (responseCode == 200) {
                            inputStream = httpsURLConnection.getInputStream();
                            try {
                                try {
                                    str2 = new String(lqb.e(inputStream), "UTF-8");
                                    try {
                                        LogUtil.d(AgrHttp.TAG, "postReq-->jsonResult :", str2);
                                        JSONObject jSONObject = new JSONObject(str2);
                                        LogUtil.a(AgrHttp.TAG, "handleAgrResData errorCode = ", Integer.valueOf(jSONObject.optInt("errorCode")), " errorMessage = ", jSONObject.optString("errorMessage"));
                                        i = responseCode;
                                        inputStream2 = inputStream;
                                    } catch (IOException unused4) {
                                        str4 = str2;
                                        OutputStream outputStream5 = outputStream;
                                        str3 = str4;
                                        outputStream2 = outputStream5;
                                        LogUtil.e(AgrHttp.TAG, "startRunnable IOException");
                                        str2 = str3;
                                        AgrHttp.dealFinallyStream(outputStream2, inputStream);
                                    } catch (Exception unused5) {
                                        outputStream2 = outputStream;
                                        LogUtil.e(AgrHttp.TAG, "startRunnable Exception");
                                        AgrHttp.dealFinallyStream(outputStream2, inputStream);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    outputStream3 = outputStream;
                                    AgrHttp.dealFinallyStream(outputStream3, inputStream);
                                    throw th;
                                }
                            } catch (IOException unused6) {
                            } catch (Exception unused7) {
                                str2 = null;
                            }
                        } else {
                            str2 = null;
                        }
                        AgrHttp.dealFinallyStream(outputStream, inputStream2);
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStream;
                        outputStream3 = outputStream2;
                    }
                } catch (IOException unused8) {
                    str3 = null;
                    inputStream = null;
                } catch (Exception unused9) {
                    inputStream = null;
                    str2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                }
                httpResCallBack2 = httpResCallBack;
                if (httpResCallBack2 != null) {
                    httpResCallBack2.onFinished(i, str2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dealFinallyStream(OutputStream outputStream, InputStream inputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
                LogUtil.e(TAG, "dealFinallyStream Exception");
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused2) {
                LogUtil.e(TAG, "dealFinallyStream Exception");
            }
        }
    }

    private String obtainBody(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        String str4 = "nsp_svc=" + str;
        try {
            return (str4 + "&access_token=" + URLEncoder.encode(str2, "UTF-8")) + "&request=" + URLEncoder.encode(str3, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e(TAG, "obtainBody UnsupportedEncodingException");
            return str4;
        }
    }

    public SignAgreementRequestBean composeSignAgrReqBean(String str, String str2, boolean z, List<Integer> list) {
        ArrayList arrayList = new ArrayList(10);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new SignAgreementRequestInfo(it.next().intValue(), z, str, str2));
        }
        return new SignAgreementRequestBean(arrayList);
    }

    public QueryAgreementRequestBean composeQueryAgrReqBean(String str, boolean z) {
        ArrayList arrayList = new ArrayList(10);
        if (z && !Utils.o()) {
            arrayList.add(new QueryAgreementRequestInfo(134, str));
            arrayList.add(new QueryAgreementRequestInfo(10023, str));
        }
        arrayList.add(new QueryAgreementRequestInfo(AgrConstant.HEALTH_AGREEMENT_CODE, str));
        arrayList.add(new QueryAgreementRequestInfo(10009, str));
        return new QueryAgreementRequestBean(arrayList);
    }

    protected String getUserAgent() {
        return "Android/1.0";
    }

    private HashMap<String, String> obtainHeader(String str) {
        HashMap<String, String> map = new HashMap<>(16);
        map.put("Content-Type", "text/plain; charset=UTF-8");
        map.put("Content-Encoding", Constants.GZIP);
        map.put("Connection", "Keep-Alive");
        map.put("User-Agent", getUserAgent());
        map.put("Host", str);
        return map;
    }
}
