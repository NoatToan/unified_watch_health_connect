package com.huami.wallet.ui.wlpay;

import android.text.TextUtils;
import androidx.core.provider.FontsContractCompat;
import com.alipay.sdk.m.s.a;
import com.alipay.sdk.m.u.i;
import com.alipay.sdk.m.u.l;
import com.huami.passport.Configs;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class AuthResult {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public AuthResult(Map<String, String> map, boolean z) {
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            if (TextUtils.equals(str, l.a)) {
                this.a = map.get(str);
            } else if (TextUtils.equals(str, "result")) {
                this.b = map.get(str);
            } else if (TextUtils.equals(str, l.b)) {
                this.c = map.get(str);
            }
        }
        for (String str2 : this.b.split(a.l)) {
            if (str2.startsWith("alipay_open_id")) {
                this.f = b(a("alipay_open_id=", str2), z);
            } else if (str2.startsWith(Configs.Params.AUTH_CODE)) {
                this.e = b(a("auth_code=", str2), z);
            } else if (str2.startsWith(FontsContractCompat.Columns.RESULT_CODE)) {
                this.d = b(a("result_code=", str2), z);
            }
        }
    }

    private String a(String str, String str2) {
        return str2.substring(str.length(), str2.length());
    }

    private String b(String str, boolean z) {
        if (!z || TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"")) {
            str = str.replaceFirst("\"", "");
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    public String getAlipayOpenId() {
        return this.f;
    }

    public String getAuthCode() {
        return this.e;
    }

    public String getMemo() {
        return this.c;
    }

    public String getResult() {
        return this.b;
    }

    public String getResultCode() {
        return this.d;
    }

    public String getResultStatus() {
        return this.a;
    }

    public String toString() {
        return "resultStatus={" + this.a + "};memo={" + this.c + "};result={" + this.b + i.d;
    }
}
