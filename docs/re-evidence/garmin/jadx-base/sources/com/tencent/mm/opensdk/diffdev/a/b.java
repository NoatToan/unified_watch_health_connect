package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.util.Base64;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f54814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f54815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f54816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f54817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f54818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OAuthListener f54819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f54820g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OAuthErrCode f54821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f54822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f54823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f54824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f54825e;

        private a() {
        }

        public static a a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String message;
            StringBuilder sb3;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i14 = jSONObject.getInt("errcode");
                        if (i14 != 0) {
                            Log.e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i14)));
                            aVar.f54821a = OAuthErrCode.WechatAuth_Err_NormalErr;
                            jSONObject.optString("errmsg");
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string == null || string.length() == 0) {
                            Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                        } else {
                            byte[] bArrDecode = Base64.decode(string, 0);
                            if (bArrDecode != null && bArrDecode.length != 0) {
                                aVar.f54821a = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.f54825e = bArrDecode;
                                aVar.f54822b = jSONObject.getString("uuid");
                                String string2 = jSONObject.getString("appname");
                                aVar.f54823c = string2;
                                Log.d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f54822b, string2, Integer.valueOf(aVar.f54825e.length)));
                                return aVar;
                            }
                            Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                        }
                        aVar.f54821a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (Exception e4) {
                        message = e4.getMessage();
                        sb3 = new StringBuilder("parse json fail, ex = ");
                        sb3.append(message);
                        Log.e("MicroMsg.SDK.GetQRCodeResult", sb3.toString());
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f54821a = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e14) {
                    message = e14.getMessage();
                    sb3 = new StringBuilder("parse fail, build String fail, ex = ");
                }
            }
            aVar.f54821a = oAuthErrCode;
            return aVar;
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.f54814a = str;
        this.f54815b = str2;
        this.f54816c = str3;
        this.f54817d = str4;
        this.f54818e = str5;
        this.f54819f = oAuthListener;
    }

    public boolean a() {
        Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        c cVar = this.f54820g;
        return cVar == null ? cancel(true) : cVar.cancel(true);
    }

    @Override // android.os.AsyncTask
    public a doInBackground(Void[] voidArr) throws Throwable {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String str = this.f54814a;
        String str2 = this.f54816c;
        String str3 = this.f54817d;
        String str4 = this.f54815b;
        String str5 = this.f54818e;
        StringBuilder sbI = p6.b.i("https://open.weixin.qq.com/connect/sdk/qrconnect?appid=", str, "&noncestr=", str2, "&timestamp=");
        sn.a.t(sbI, str3, "&scope=", str4, "&signature=");
        sbI.append(str5);
        String string = sbI.toString();
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrA = com.tencent.mm.opensdk.channel.a.a.a(string, DateTimeConstants.MILLIS_PER_MINUTE);
        Log.d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", string, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return a.a(bArrA);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(a aVar) {
        a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.f54821a;
        if (oAuthErrCode != OAuthErrCode.WechatAuth_Err_OK) {
            Log.e("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode fail, OAuthErrCode = " + oAuthErrCode);
            this.f54819f.onAuthFinish(aVar2.f54821a, null);
            return;
        }
        Log.d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.f54825e.length);
        this.f54819f.onAuthGotQrcode(aVar2.f54824d, aVar2.f54825e);
        c cVar = new c(aVar2.f54822b, this.f54819f);
        this.f54820g = cVar;
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
