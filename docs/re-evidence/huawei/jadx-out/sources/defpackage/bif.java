package defpackage;

import com.huawei.appgallery.marketinstallerservice.b.a.b.b;
import com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.RequestBean;
import com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.ResponseBean;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
public class bif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Class> f1125a;
    public static final ThreadPoolExecutor d;

    public static ResponseBean e(RequestBean requestBean) {
        return new b(requestBean, null).b(requestBean.getContext());
    }

    public static b b(RequestBean requestBean, com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.b bVar) {
        b bVar2 = new b(requestBean, bVar);
        bVar2.b(d);
        return bVar2;
    }

    static {
        HashMap map = new HashMap();
        f1125a = map;
        if (map.size() <= 0) {
            map.put("client.getMarketInfo", big.class);
        }
        d = new ThreadPoolExecutor(6, 6, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        Executors.newFixedThreadPool(1);
    }
}
