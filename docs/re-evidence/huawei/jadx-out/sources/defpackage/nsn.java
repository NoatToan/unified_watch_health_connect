package defpackage;

import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.hwservicesmgr.remoterequestdata.RequestDataProvider;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class nsn {
    private static final HashMap<String, RequestDataProvider> d;

    static {
        HashMap<String, RequestDataProvider> map = new HashMap<>();
        d = map;
        map.put(KnitHealthDetailActivity.KEY_SLEEP_STATUS, new nsu());
    }

    public static RequestDataProvider d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Module cannot be null");
        }
        RequestDataProvider requestDataProvider = d.get(str);
        if (requestDataProvider != null) {
            return requestDataProvider;
        }
        throw new IllegalArgumentException("Unknown module: " + str);
    }
}
