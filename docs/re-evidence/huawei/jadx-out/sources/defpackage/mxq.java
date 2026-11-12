package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
class mxq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42661c = "GenerateCommandInfo";

    mxq() {
    }

    public String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j(this.f42661c, "getSeizeInfo input parameter is null.");
            return null;
        }
        StringBuilder sb = new StringBuilder(10);
        sb.append(a(11, "seize"));
        sb.append(a(12, str));
        return sb.toString();
    }

    public String d(int i, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j(this.f42661c, "getReplyInfo input parameter is null.");
            return null;
        }
        StringBuilder sb = new StringBuilder(10);
        sb.append(a(15, i));
        sb.append(a(16, str));
        sb.append(a(17, str));
        return sb.toString();
    }

    public String d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.j(this.f42661c, "requestSeize input parameter is null.");
            return null;
        }
        StringBuilder sb = new StringBuilder(10);
        sb.append(a(8, str));
        sb.append(a(9, str2));
        sb.append(a(10, str3));
        return sb.toString();
    }

    private String a(int i, String str) {
        String strA = eeq.a(str);
        return eeq.d(i) + eeq.b(strA.length() / 2) + strA;
    }

    private String a(int i, int i2) {
        return eeq.d(i) + eeq.b(1) + eeq.d(i2);
    }
}
