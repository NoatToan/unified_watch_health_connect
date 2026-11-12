package defpackage;

import com.huawei.networkclient.IRequest;
import com.huawei.operation.ble.BleConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class gjx implements IRequest {
    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bi();
    }

    public Map<String, String> a() {
        HashMap map = new HashMap();
        map.put("page", String.valueOf(1));
        map.put(BleConstants.LIMIT, String.valueOf(200));
        map.put("language", pjn.b(null));
        return map;
    }

    public Map<String, String> c(long j, long j2) {
        HashMap map = new HashMap();
        map.put("page", String.valueOf(1));
        map.put(BleConstants.LIMIT, String.valueOf(200));
        map.put("language", pjn.b(null));
        map.put("minEventTime", String.valueOf(j));
        map.put("maxEventTime", String.valueOf(j2));
        return map;
    }
}
