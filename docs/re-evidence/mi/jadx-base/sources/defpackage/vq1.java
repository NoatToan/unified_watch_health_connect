package defpackage;

import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class vq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37123b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public vq1(Map<String, String> map, boolean z) {
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            if (TextUtils.equals(str, "resultStatus")) {
                this.f37122a = map.get(str);
            } else if (TextUtils.equals(str, "result")) {
                this.f37123b = map.get(str);
            } else if (TextUtils.equals(str, "memo")) {
                this.c = map.get(str);
            }
        }
        for (String str2 : this.f37123b.split(gv5.CONNECT_STR)) {
            if (str2.startsWith("alipay_open_id")) {
                this.g = f(e("alipay_open_id=", str2), z);
            } else if (str2.startsWith(ThirdPartAccessConstants.PARAM_AUTH_CODE)) {
                this.f = f(e("auth_code=", str2), z);
            } else if (str2.startsWith(Constants.EXTRA_RESULT_CODE)) {
                this.d = f(e("result_code=", str2), z);
            } else if (str2.startsWith("user_id")) {
                this.e = f(e("user_id=", str2), z);
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
        return this.f37122a;
    }

    public String d() {
        return this.e;
    }

    public final String e(String str, String str2) {
        return str2.substring(str.length(), str2.length());
    }

    public final String f(String str, boolean z) {
        if (!z || TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"")) {
            str = str.replaceFirst("\"", "");
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    public String toString() {
        return "authCode={" + this.f + "}; resultStatus={" + this.f37122a + "}; memo={" + this.c + "}; result={" + this.f37123b + "}";
    }
}
