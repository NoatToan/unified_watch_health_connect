package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hwidauth.utils.a;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class nou {
    private static boolean a(Context context) {
        nox.b("GlobalDownloadUtil", "check needUpdateProp ", true);
        long jC = c(context);
        long time = new Date().getTime();
        if (jC > time) {
            jC = 0;
        }
        if (jC == 0 || time - jC > 86400000) {
            nox.b("GlobalDownloadUtil", "need check prop", true);
            return true;
        }
        nox.b("GlobalDownloadUtil", "no need check prop", true);
        return false;
    }

    public static void d(final Context context) {
        if (a(context)) {
            nnr.d().execute(new Runnable() { // from class: nou.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        nou.e(context);
                    } catch (IOException unused) {
                        nox.a("GlobalDownloadUtil", "Error occured when download global Asyn.", true);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(Context context) throws IOException {
        nox.b("GlobalDownloadUtil", "Start syn download global.", true);
        String strC = nmj.d().c(context, "com.huawei.cloud.hwid", "Root");
        if (TextUtils.isEmpty(strC)) {
            nox.a("GlobalDownloadUtil", "asUrl is null", true);
            throw new IOException("asUrl is null");
        }
        String str = strC + "/AccountServer/global_cfg_for_android_mobile.xml";
        RestClient restClientE = noy.e(context, strC);
        if (restClientE == null) {
            nox.a("GlobalDownloadUtil", "restClient init Failed", true);
            throw new IOException(Constants.LOG_ERROR);
        }
        try {
            Response<ResponseBody> responseExecute = ((a) restClientE.create(a.class)).a(str).execute();
            if (responseExecute == null || responseExecute.getBody() == null || !responseExecute.isOK()) {
                return false;
            }
            nox.b("GlobalDownloadUtil", "downloadGlobalCountrySiteSyn Succ", true);
            noz.a(context, "global_cfg_for_android_mobile.xml", new String(responseExecute.getBody().bytes(), "UTF-8"));
            nnm.c().c(context);
            nnv.a(context).d("lastupdate", String.valueOf(System.currentTimeMillis()));
            return true;
        } catch (IOException e) {
            nox.a("GlobalDownloadUtil", "IOException", true);
            throw new IOException("IOException[don't set proxy]:" + e.getClass().getSimpleName());
        }
    }

    private static long c(Context context) {
        try {
            return Long.parseLong(nnv.a(context).a("lastupdate", "0"));
        } catch (Exception e) {
            nox.a("GlobalDownloadUtil", "get string lastUpdate " + e.getClass().getSimpleName(), true);
            long j = 0;
            try {
                long jC = nnv.a(context).c("lastupdate", 0L);
                if (jC <= 0) {
                    return jC;
                }
                try {
                    nnv.a(context).d("lastupdate", String.valueOf(jC));
                    return jC;
                } catch (Exception e2) {
                    e = e2;
                    j = jC;
                    nox.a("GlobalDownloadUtil", "get long lastUpdate " + e.getClass().getSimpleName(), true);
                    return j;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
    }
}
