package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.google.android.gms.wallet.WalletConstants;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class c extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f54826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f54827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OAuthListener f54828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54829d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OAuthErrCode f54830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f54831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54832c;
    }

    public c(String str, OAuthListener oAuthListener) {
        this.f54826a = str;
        this.f54828c = oAuthListener;
        this.f54827b = fb1.c.n("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=", str);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c9 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:20:0x0085, B:22:0x0094, B:26:0x00ad, B:28:0x00b1, B:31:0x00c0, B:35:0x00cb, B:32:0x00c3, B:33:0x00c6, B:34:0x00c9), top: B:64:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x012d A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    public a doInBackground(Void[] voidArr) throws Throwable {
        a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        OAuthErrCode oAuthErrCode2;
        OAuthErrCode oAuthErrCode3;
        int i14;
        String str2;
        String message;
        StringBuilder sb3;
        OAuthErrCode oAuthErrCode4;
        Thread.currentThread().setName("OpenSdkNoopingTask");
        String str3 = this.f54826a;
        if (str3 == null || str3.length() == 0) {
            Log.e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            a aVar2 = new a();
            aVar2.f54830a = OAuthErrCode.WechatAuth_Err_NormalErr;
            return aVar2;
        }
        Log.i("MicroMsg.SDK.NoopingTask", "doInBackground start " + isCancelled());
        while (!isCancelled()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f54827b);
            if (this.f54829d == 0) {
                str = "";
            } else {
                str = "&last=" + this.f54829d;
            }
            sb4.append(str);
            String string = sb4.toString();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArrA = com.tencent.mm.opensdk.channel.a.a.a(string, DateTimeConstants.MILLIS_PER_MINUTE);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            aVar = new a();
            Log.d("MicroMsg.SDK.NoopingResult", "star parse NoopingResult");
            if (bArrA != null && bArrA.length != 0) {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArrA, "utf-8"));
                        int i15 = jSONObject.getInt("wx_errcode");
                        aVar.f54832c = i15;
                        Log.d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", Integer.valueOf(i15)));
                        int i16 = aVar.f54832c;
                        if (i16 == 408) {
                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                            aVar.f54830a = oAuthErrCode4;
                        } else if (i16 != 500) {
                            switch (i16) {
                                case 402:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Timeout;
                                    aVar.f54830a = oAuthErrCode4;
                                    break;
                                case 403:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Cancel;
                                    aVar.f54830a = oAuthErrCode4;
                                    break;
                                case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /* 404 */:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                                    aVar.f54830a = oAuthErrCode4;
                                    break;
                                case WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR /* 405 */:
                                    aVar.f54830a = OAuthErrCode.WechatAuth_Err_OK;
                                    aVar.f54831b = jSONObject.getString("wx_code");
                                    break;
                                default:
                                    oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                    aVar.f54830a = oAuthErrCode4;
                                    break;
                            }
                        } else {
                            oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.f54830a = oAuthErrCode4;
                        }
                    } catch (Exception e4) {
                        message = e4.getMessage();
                        sb3 = new StringBuilder("parse json fail, ex = ");
                        sb3.append(message);
                        Log.e("MicroMsg.SDK.NoopingResult", sb3.toString());
                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f54830a = oAuthErrCode2;
                    }
                } catch (Exception e14) {
                    message = e14.getMessage();
                    sb3 = new StringBuilder("parse fail, build String fail, ex = ");
                }
                Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f54830a.toString(), Integer.valueOf(aVar.f54832c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                oAuthErrCode3 = aVar.f54830a;
                if (oAuthErrCode3 == OAuthErrCode.WechatAuth_Err_OK) {
                    i14 = aVar.f54832c;
                    this.f54829d = i14;
                    if (i14 == d.UUID_SCANED.a()) {
                        this.f54828c.onQrcodeScanned();
                    } else if (aVar.f54832c == d.UUID_KEEP_CONNECT.a() && aVar.f54832c == d.UUID_CONFIRM.a()) {
                        str2 = aVar.f54831b;
                        if (str2 != null || str2.length() == 0) {
                            Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.f54830a = oAuthErrCode;
                        }
                    }
                } else {
                    Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f54832c)));
                }
                return aVar;
            }
            Log.e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
            oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NetworkErr;
            aVar.f54830a = oAuthErrCode2;
            Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f54830a.toString(), Integer.valueOf(aVar.f54832c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
            oAuthErrCode3 = aVar.f54830a;
            if (oAuthErrCode3 == OAuthErrCode.WechatAuth_Err_OK) {
                i14 = aVar.f54832c;
                this.f54829d = i14;
                if (i14 == d.UUID_SCANED.a()) {
                    this.f54828c.onQrcodeScanned();
                } else if (aVar.f54832c == d.UUID_KEEP_CONNECT.a()) {
                    continue;
                } else {
                    str2 = aVar.f54831b;
                    if (str2 != null) {
                    }
                    Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.f54830a = oAuthErrCode;
                }
            } else {
                Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f54832c)));
            }
            return aVar;
        }
        Log.i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
        aVar = new a();
        oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
        aVar.f54830a = oAuthErrCode;
        return aVar;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.f54828c.onAuthFinish(aVar2.f54830a, aVar2.f54831b);
    }
}
