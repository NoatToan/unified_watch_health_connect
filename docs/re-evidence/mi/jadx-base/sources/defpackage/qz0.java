package defpackage;

import android.text.TextUtils;
import com.mibi.sdk.common.CommonConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class qz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public iq1 f31995b;
    public l83 c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ jzc f31996a;

        public a(jzc jzcVar) {
            this.f31996a = jzcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            qz0.this.j(this.f31996a);
        }
    }

    public class b implements ctc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f31999b;
        public final /* synthetic */ jzc c;

        public b(String str, String str2, jzc jzcVar) {
            this.f31998a = str;
            this.f31999b = str2;
            this.c = jzcVar;
        }

        public final void a(int i, String str) {
            ycm.b("AuthFail: code: " + i + ", msg: " + str);
            sz0.o();
            this.c.onFail(i, str);
        }

        @Override // defpackage.ctc
        public void onFail(int i, String str) {
            a(i, str);
        }

        @Override // defpackage.ctc
        public void onSuccess(String str) {
            ycm.b("Path: requestAuth, query: " + this.f31998a + ", response: " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("code");
                String strOptString = jSONObject.optString("msg");
                JSONObject jSONObject2 = jSONObject.getJSONObject("resp_data");
                if (iOptInt == 60000) {
                    String strOptString2 = jSONObject2.optString("device_id");
                    String strOptString3 = jSONObject2.optString("tv_id");
                    String strOptString4 = jSONObject2.optString("public_key");
                    String strOptString5 = jSONObject2.optString("verify_code_additional");
                    String strOptString6 = jSONObject2.optString(CommonConstants.KEY_VERSION_CODE);
                    if (!this.f31999b.equals(strOptString2)) {
                        a(90004, "Error: Response device id error, local id: " + this.f31999b + ", response id: " + strOptString2);
                    } else if (TextUtils.isEmpty(strOptString4)) {
                        sz0.o();
                        this.c.a(strOptString3, strOptString6, true);
                    } else {
                        qz0.this.f31995b = new iq1();
                        qz0.this.f31995b.e(strOptString3);
                        qz0.this.f31995b.d(strOptString4);
                        qz0.this.f31995b.f(strOptString5);
                        this.c.a(strOptString3, strOptString6, false);
                    }
                } else {
                    a(iOptInt, strOptString);
                }
            } catch (JSONException unused) {
                a(90003, "Error: response json text syntax error, json: " + str);
            }
        }
    }

    public class c implements ctc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g4q f32001b;
        public final /* synthetic */ kqc c;

        public c(String str, g4q g4qVar, kqc kqcVar) {
            this.f32000a = str;
            this.f32001b = g4qVar;
            this.c = kqcVar;
        }

        private void a(int i, String str) {
            ycm.b("AuthFail: code: " + i + ", msg: " + str);
            sz0.o();
            this.c.onFail(i, str);
        }

        @Override // defpackage.ctc
        public void onFail(int i, String str) {
            a(i, str);
        }

        @Override // defpackage.ctc
        public void onSuccess(String str) {
            ycm.b("Path: completeAuth, query: " + this.f32000a + ", response: " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("code");
                String strOptString = jSONObject.optString("msg");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("resp_data");
                if (iOptInt == 60000) {
                    String strOptString2 = jSONObjectOptJSONObject.optString("tv_id");
                    this.f32001b.e(strOptString2);
                    ycm.b("Auth tv id: " + strOptString2);
                    sz0.g().a(this.f32001b);
                    sz0.o();
                    b01.g(strOptString2 + "cbcKey_Iv", qz0.this.c.a());
                    b01.g(strOptString2 + "cbcKey_Key", qz0.this.c.b());
                    this.c.onSuccess(strOptString2);
                } else {
                    a(iOptInt, strOptString);
                }
            } catch (JSONException e) {
                a(90009, "Error: tv id is null, " + e.getMessage());
            }
        }
    }

    public class d implements ctc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ upc f32003b;

        public d(String str, upc upcVar) {
            this.f32002a = str;
            this.f32003b = upcVar;
        }

        private void a(int i, String str) {
            ycm.b("cancelAuthFailed: code: " + i + ", msg: " + str);
            sz0.o();
            this.f32003b.onFail(i, str);
        }

        @Override // defpackage.ctc
        public void onFail(int i, String str) {
            a(i, str);
        }

        @Override // defpackage.ctc
        public void onSuccess(String str) {
            ycm.b("Path: cancelAuth, query: " + this.f32002a + ", response: " + str);
            try {
                if (new JSONObject(str).optInt("code") == 60000) {
                    this.f32003b.onSuccess();
                    sz0.o();
                } else {
                    a(90001, "");
                }
            } catch (JSONException unused) {
                a(90001, "Error: response json text syntax error, json: " + str);
            }
        }
    }

    public qz0(String str) {
        this.f31994a = str;
    }

    public static qz0 i(String str) {
        return new qz0(str);
    }

    public void d(upc upcVar) {
        if (upcVar == null) {
            ycm.b("Error: callback is null");
            return;
        }
        String str = "device_id=" + sz0.g().b().e();
        pz0.a(new fhc(this.f31994a, "cancelAuth", str, new d(str, upcVar)));
    }

    public final boolean e(String str) {
        return str.startsWith("airkan");
    }

    public void f(String str, String str2, kqc kqcVar) {
        if (kqcVar == null) {
            ycm.b("Error: finish callback is null");
            return;
        }
        if (this.f31995b == null) {
            ycm.b("Error: auth cache is null");
            kqcVar.onFail(90006, "Error: auth cache is null");
            return;
        }
        if (TextUtils.isEmpty(str) || !str.equals(this.f31995b.b())) {
            ycm.b("Error: tv id is not correct: inId: " + str + ", cacheId: " + this.f31995b.b());
            return;
        }
        if (TextUtils.isEmpty(str2) || str2.length() != 6) {
            ycm.b("Error: verify code is not correct, must be length 6, code: " + str2);
            return;
        }
        String strG = g(str2.concat(this.f31995b.c()));
        if (!e(strG)) {
            kqcVar.onFail(90007, "Error: enter verify code error, " + str2);
            return;
        }
        String strSubstring = strG.substring(6);
        String str3 = new String(strSubstring.getBytes(), 16, strSubstring.length() - 16);
        String strH = h(str3);
        if (TextUtils.isEmpty(strH)) {
            kqcVar.onFail(90008, "Error: encrypt rsa Exception");
            return;
        }
        String strB = b01.b(sz0.g().b().e(), b01.c(), strH);
        g4q g4qVar = new g4q();
        g4qVar.f(str3);
        g4qVar.d(1);
        pz0.a(new fhc(this.f31994a, "completeAuth", strB, new c(strB, g4qVar, kqcVar)));
    }

    public final String g(String str) {
        ycm.b("verifyCode: " + str);
        this.c = b01.a(oz0.e(b01.f(str), 10000));
        String strA = oz0.a(this.f31995b.a(), this.c, false);
        ycm.b("decryptData: " + strA);
        return strA;
    }

    public final String h(String str) {
        return oz0.c("airkandevicePublicKey=" + sz0.g().b().d() + gv5.CONNECT_STR + "serial_num=1", str);
    }

    public void j(jzc jzcVar) {
        sz0.f();
        if (jzcVar == null) {
            ycm.b("Auth callback is null when start authority");
            return;
        }
        if (!sz0.l() && sz0.n()) {
            sz0.p(new a(jzcVar));
            return;
        }
        if (!sz0.q()) {
            ycm.b("Error: sync conflict!");
            jzcVar.onFail(90005, "Error: sync conflict!");
            return;
        }
        yq1 yq1VarG = sz0.g();
        if (yq1VarG == null || yq1VarG.b() == null) {
            yq1VarG = sz0.j();
        }
        String strE = yq1VarG.b().e();
        String str = "device_id=" + strE;
        pz0.a(new fhc(this.f31994a, "requestAuth", str, new b(str, strE, jzcVar)));
    }
}
