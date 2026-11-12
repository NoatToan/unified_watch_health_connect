package defpackage;

import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class uq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36018b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public uq1(Map<String, String> map, boolean z) {
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            if (TextUtils.equals(str, "resultStatus")) {
                this.f36017a = map.get(str);
            } else if (TextUtils.equals(str, "result")) {
                this.f36018b = map.get(str);
            } else if (TextUtils.equals(str, "memo")) {
                this.c = map.get(str);
            }
        }
        for (String str2 : this.f36018b.split(gv5.CONNECT_STR)) {
            if (str2.startsWith("alipay_open_id")) {
                this.g = e(d("alipay_open_id=", str2), z);
            } else if (str2.startsWith(ThirdPartAccessConstants.PARAM_AUTH_CODE)) {
                this.f = e(d("auth_code=", str2), z);
            } else if (str2.startsWith(Constants.EXTRA_RESULT_CODE)) {
                this.d = e(d("result_code=", str2), z);
            } else if (str2.startsWith("user_id")) {
                this.e = e(d("user_id=", str2), z);
            }
        }
    }

    public String a() {
        return this.f;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.f36017a;
    }

    public final String d(String str, String str2) {
        return str2.substring(str.length(), str2.length());
    }

    public final String e(String str, boolean z) {
        if (!z || TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"")) {
            str = str.replaceFirst("\"", "");
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    public String toString() {
        return "authCode={" + this.f + "}; resultStatus={" + this.f36017a + "}; memo={" + this.c + "}; result={" + this.f36018b + "}";
    }
}
