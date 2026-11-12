package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class wzo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f52622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f52623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f52624c;
    private String d;
    private String e;
    private String g;
    private String i;

    wzo(Map<String, String> map, boolean z) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                if (TextUtils.equals(key, "resultStatus")) {
                    this.i = entry.getValue();
                } else if (TextUtils.equals(key, "result")) {
                    this.f52622a = entry.getValue();
                } else if (TextUtils.equals(key, "memo")) {
                    this.e = entry.getValue();
                } else {
                    LogUtil.a("AuthResult", "key = ", key);
                }
            }
        }
        if (TextUtils.isEmpty(this.f52622a)) {
            return;
        }
        for (String str : this.f52622a.split("&")) {
            if (str.startsWith("alipay_open_id")) {
                this.f52623b = a(d("alipay_open_id=", str), z);
            } else if (str.startsWith("auth_code")) {
                this.d = a(d("auth_code=", str), z);
            } else if (str.startsWith("result_code")) {
                this.f52624c = a(d("result_code=", str), z);
            } else if (str.startsWith("user_id")) {
                this.g = a(d("user_id=", str), z);
            }
        }
    }

    private String a(String str, boolean z) {
        if (!z || TextUtils.isEmpty(str)) {
            return str;
        }
        String strReplaceFirst = str.startsWith("\"") ? str.replaceFirst("\"", "") : str;
        return strReplaceFirst.endsWith("\"") ? str.substring(0, strReplaceFirst.length() - 1) : strReplaceFirst;
    }

    private String d(String str, String str2) {
        if (str == null || str2 == null) {
            return "";
        }
        return str2.substring(str.length(), str2.length());
    }

    public String c() {
        return this.i;
    }

    public String e() {
        return this.f52624c;
    }

    public String b() {
        return this.d;
    }

    public String d() {
        return this.g;
    }

    public String toString() {
        return "resultStatus={" + this.i + "};memo={" + this.e + "};result={" + this.f52622a + "}";
    }
}
