package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.linkage.eventproducer.SampleEventProducer;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nbn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, SampleEventProducer> f42841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, SampleEventProducer> f42842b;

    static {
        HashMap map = new HashMap();
        f42841a = map;
        HashMap map2 = new HashMap();
        f42842b = map2;
        map.put(102, new nbo());
        map.put(203, new nbl());
        map.put(204, new nbr());
        map.put(202, new nbj());
        map2.put(100, new nbm());
        map2.put(101, new nbf());
        map2.put(102, new nbk());
    }

    public static SampleEventProducer d(int i) {
        ReleaseLogUtil.d("R_LINKAGE_SampleEventFactory", "getProducer operationType ", Integer.valueOf(i));
        Map<Integer, SampleEventProducer> map = f42841a;
        if (map.get(Integer.valueOf(i)) != null) {
            return map.get(Integer.valueOf(i));
        }
        return new nbi();
    }

    public static SampleEventProducer e(int i, String str) {
        ReleaseLogUtil.d("R_LINKAGE_SampleEventFactory", "getProducer operationType ", Integer.valueOf(i), ", replyCode ", str);
        Map<Integer, SampleEventProducer> map = f42842b;
        if (map.get(Integer.valueOf(i)) != null) {
            return map.get(Integer.valueOf(i));
        }
        return new nbi();
    }
}
