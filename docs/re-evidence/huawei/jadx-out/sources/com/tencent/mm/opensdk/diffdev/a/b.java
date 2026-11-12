package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.util.Base64;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class b extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30964c;
    private String d;
    private String e;
    private OAuthListener f;
    private c g;

    @Override // android.os.AsyncTask
    protected a doInBackground(Void[] voidArr) throws Throwable {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String str = String.format("https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s", this.f30962a, this.f30964c, this.d, this.f30963b, this.e);
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrA = com.tencent.mm.opensdk.channel.a.a.a(str, 60000);
        Log.d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", str, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return a.a(bArrA);
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.f30965a;
        if (oAuthErrCode != OAuthErrCode.WechatAuth_Err_OK) {
            Log.e("MicroMsg.SDK.GetQRCodeTask", String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", oAuthErrCode));
            this.f.onAuthFinish(aVar2.f30965a, null);
            return;
        }
        Log.d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.e.length);
        this.f.onAuthGotQrcode(aVar2.d, aVar2.e);
        c cVar = new c(aVar2.f30966b, this.f);
        this.g = cVar;
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OAuthErrCode f30965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30967c;
        public String d;
        public byte[] e;

        public static a a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String str;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i = jSONObject.getInt("errcode");
                        if (i != 0) {
                            Log.e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i)));
                            aVar.f30965a = OAuthErrCode.WechatAuth_Err_NormalErr;
                            jSONObject.optString("errmsg");
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string == null || string.length() == 0) {
                            Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                        } else {
                            byte[] bArrDecode = Base64.decode(string, 0);
                            if (bArrDecode != null && bArrDecode.length != 0) {
                                aVar.f30965a = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.e = bArrDecode;
                                aVar.f30966b = jSONObject.getString("uuid");
                                String string2 = jSONObject.getString("appname");
                                aVar.f30967c = string2;
                                Log.d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f30966b, string2, Integer.valueOf(aVar.e.length)));
                                return aVar;
                            }
                            Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                        }
                        aVar.f30965a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (Exception e) {
                        str = String.format("parse json fail, ex = %s", e.getMessage());
                        Log.e("MicroMsg.SDK.GetQRCodeResult", str);
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f30965a = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e2) {
                    str = String.format("parse fail, build String fail, ex = %s", e2.getMessage());
                }
            }
            aVar.f30965a = oAuthErrCode;
            return aVar;
        }

        private a() {
        }
    }

    public boolean a() {
        Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        c cVar = this.g;
        return cVar == null ? cancel(true) : cVar.cancel(true);
    }

    public b(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.f30962a = str;
        this.f30963b = str2;
        this.f30964c = str3;
        this.d = str4;
        this.e = str5;
        this.f = oAuthListener;
    }
}
