package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
class c extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OAuthListener f30970c;
    private int d;

    /* JADX WARN: Code duplicated, block: B:30:0x00c9 A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:20:0x0085, B:24:0x00af, B:26:0x00b3, B:27:0x00c0, B:31:0x00cb, B:28:0x00c3, B:29:0x00c6, B:30:0x00c9), top: B:61:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x012c A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    protected a doInBackground(Void[] voidArr) throws Throwable {
        a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        OAuthErrCode oAuthErrCode2;
        OAuthErrCode oAuthErrCode3;
        int i;
        String str2;
        String str3;
        OAuthErrCode oAuthErrCode4;
        Thread.currentThread().setName("OpenSdkNoopingTask");
        String str4 = this.f30968a;
        if (str4 == null || str4.length() == 0) {
            Log.e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            a aVar2 = new a();
            aVar2.f30971a = OAuthErrCode.WechatAuth_Err_NormalErr;
            return aVar2;
        }
        Log.i("MicroMsg.SDK.NoopingTask", "doInBackground start " + isCancelled());
        while (!isCancelled()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f30969b);
            if (this.d == 0) {
                str = "";
            } else {
                str = "&last=" + this.d;
            }
            sb.append(str);
            String string = sb.toString();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArrA = com.tencent.mm.opensdk.channel.a.a.a(string, 60000);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            aVar = new a();
            Log.d("MicroMsg.SDK.NoopingResult", "star parse NoopingResult");
            if (bArrA != null && bArrA.length != 0) {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArrA, "utf-8"));
                        int i2 = jSONObject.getInt("wx_errcode");
                        aVar.f30973c = i2;
                        Log.d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", Integer.valueOf(i2)));
                        int i3 = aVar.f30973c;
                        if (i3 == 408) {
                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                            aVar.f30971a = oAuthErrCode4;
                        } else if (i3 != 500) {
                            switch (i3) {
                                case 402:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Timeout;
                                    aVar.f30971a = oAuthErrCode4;
                                    break;
                                case 403:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Cancel;
                                    aVar.f30971a = oAuthErrCode4;
                                    break;
                                case 404:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                                    aVar.f30971a = oAuthErrCode4;
                                    break;
                                case 405:
                                    aVar.f30971a = OAuthErrCode.WechatAuth_Err_OK;
                                    aVar.f30972b = jSONObject.getString("wx_code");
                                    break;
                                default:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                    aVar.f30971a = oAuthErrCode4;
                                    break;
                            }
                        } else {
                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.f30971a = oAuthErrCode4;
                        }
                    } catch (Exception e) {
                        str3 = String.format("parse json fail, ex = %s", e.getMessage());
                        Log.e("MicroMsg.SDK.NoopingResult", str3);
                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f30971a = oAuthErrCode2;
                    }
                } catch (Exception e2) {
                    str3 = String.format("parse fail, build String fail, ex = %s", e2.getMessage());
                }
                Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f30971a.toString(), Integer.valueOf(aVar.f30973c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                oAuthErrCode3 = aVar.f30971a;
                if (oAuthErrCode3 == OAuthErrCode.WechatAuth_Err_OK) {
                    i = aVar.f30973c;
                    this.d = i;
                    if (i == d.UUID_SCANED.a()) {
                        this.f30970c.onQrcodeScanned();
                    } else if (aVar.f30973c == d.UUID_KEEP_CONNECT.a() && aVar.f30973c == d.UUID_CONFIRM.a()) {
                        str2 = aVar.f30972b;
                        if (str2 != null || str2.length() == 0) {
                            Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.f30971a = oAuthErrCode;
                        }
                    }
                } else {
                    Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f30973c)));
                }
                return aVar;
            }
            Log.e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
            oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NetworkErr;
            aVar.f30971a = oAuthErrCode2;
            Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f30971a.toString(), Integer.valueOf(aVar.f30973c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
            oAuthErrCode3 = aVar.f30971a;
            if (oAuthErrCode3 == OAuthErrCode.WechatAuth_Err_OK) {
                i = aVar.f30973c;
                this.d = i;
                if (i == d.UUID_SCANED.a()) {
                    this.f30970c.onQrcodeScanned();
                } else if (aVar.f30973c == d.UUID_KEEP_CONNECT.a()) {
                    continue;
                } else {
                    str2 = aVar.f30972b;
                    if (str2 != null) {
                    }
                    Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.f30971a = oAuthErrCode;
                }
            } else {
                Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f30973c)));
            }
            return aVar;
        }
        Log.i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
        aVar = new a();
        oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
        aVar.f30971a = oAuthErrCode;
        return aVar;
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.f30970c.onAuthFinish(aVar2.f30971a, aVar2.f30972b);
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OAuthErrCode f30971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30973c;

        a() {
        }
    }

    public c(String str, OAuthListener oAuthListener) {
        this.f30968a = str;
        this.f30970c = oAuthListener;
        this.f30969b = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }
}
