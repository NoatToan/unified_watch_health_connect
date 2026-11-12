package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bhl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static GrsClient f1106c;

    public static String a(Context context, String str) {
        return bhp.c(context, str);
    }

    private static boolean b(Context context) {
        bhm bhmVarD = bhm.d();
        String strD = bhmVarD.d(context);
        String strA = bhmVarD.a(context);
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        if (!TextUtils.isEmpty(strD)) {
            grsBaseInfo.setAppName(strD);
        }
        if (!TextUtils.isEmpty(strA)) {
            grsBaseInfo.setSerCountry(strA);
        }
        try {
            f1106c = new GrsClient(context, grsBaseInfo);
            return true;
        } catch (NullPointerException unused) {
            bhn.a("GrsConfigObtainer", "init grs failed,context is null");
            return false;
        }
    }

    public static Map<String, String> e(Context context, String str) {
        synchronized (bhl.class) {
            if (f1106c == null) {
                bhn.b("GrsConfigObtainer", "grs not init ,do init ");
                if (!b(context)) {
                    bhn.b("GrsConfigObtainer", "grs init failed");
                    return null;
                }
            }
            return f1106c.synGetGrsUrls(str);
        }
    }
}
