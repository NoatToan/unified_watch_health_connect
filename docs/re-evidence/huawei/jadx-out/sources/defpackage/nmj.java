package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hwcloudjs.g.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nmj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static GrsClient f43280b;
    private static nmj e;

    private nmj() {
    }

    public static nmj d() {
        nmj nmjVar;
        synchronized (nmj.class) {
            if (e == null) {
                e = new nmj();
            }
            nmjVar = e;
        }
        return nmjVar;
    }

    private void c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            nox.b("HmsGrsApiManager", "initGrsClient grsAppName is empty", true);
            return;
        }
        nox.b("HmsGrsApiManager", "initGrsClient grsAppName is " + str, false);
        if (f43280b == null) {
            f43280b = new GrsClient(context, a(context, str));
        }
    }

    public Map<String, String> a(Context context, String str, String str2) {
        c(context, str);
        GrsClient grsClient = f43280b;
        if (grsClient == null) {
            return new HashMap();
        }
        return grsClient.synGetGrsUrls(str2);
    }

    private GrsBaseInfo a(Context context, String str) {
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setAndroidVersion(nom.f(Build.VERSION.RELEASE));
        grsBaseInfo.setDeviceModel(nom.f(Build.MODEL));
        grsBaseInfo.setRomVersion(nom.f(nom.y()));
        grsBaseInfo.setAppName(nom.f(str));
        String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(context);
        if (TextUtils.isEmpty(issueCountryCode)) {
            issueCountryCode = "CN";
        }
        grsBaseInfo.setSerCountry(issueCountryCode);
        return grsBaseInfo;
    }

    public String c(Context context, String str, String str2) {
        String strSynGetGrsUrl = new GrsClient(context, a(context, a.f17122c)).synGetGrsUrl(str, str2);
        return TextUtils.isEmpty(strSynGetGrsUrl) ? "" : strSynGetGrsUrl;
    }
}
