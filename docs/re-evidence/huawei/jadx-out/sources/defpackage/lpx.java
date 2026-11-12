package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lpx {
    public static void b(final String str, final List<lpy> list, final ResultCallback<lpw> resultCallback) {
        LogUtil.a("HonorPrivacyManager", "enter queryHonorPrivacy");
        ThreadPoolManager.c().execute(new Runnable() { // from class: lpx.2
            @Override // java.lang.Runnable
            public void run() {
                lqc lqcVar = new lqc();
                lqcVar.c(str);
                lqcVar.a(list);
                lqcVar.d(false);
                oet.d().c(lqcVar.getUrl(), lpx.d(), ofe.c(lqcVar), lpw.class, resultCallback);
            }
        });
    }

    public static void c(final String str, final List<lqf> list, final ResultCallback<lpw> resultCallback) {
        LogUtil.a("HonorPrivacyManager", "enter queryHonorPrivacy");
        ThreadPoolManager.c().execute(new Runnable() { // from class: lpx.5
            @Override // java.lang.Runnable
            public void run() {
                lqe lqeVar = new lqe();
                lqeVar.c(str);
                lqeVar.e(list);
                oet.d().c(lqeVar.getUrl(), lpx.d(), ofe.c(lqeVar), lpw.class, resultCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> d() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json");
        map.put("X-HW-ID", "3576ad5484514af79a9b6f77ebd48090");
        map.put("X-HW-APPKEY", "04X/NQfuHWMV4wWKfdj9og==");
        map.put("projectAppId", "3576ad5484514af79a9b6f77ebd48090");
        return map;
    }
}
