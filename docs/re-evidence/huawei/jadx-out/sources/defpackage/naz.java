package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.eventprocessor.EventProcessor;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class naz {
    private static final Map<Long, EventProcessor> d;

    static {
        HashMap map = new HashMap();
        d = map;
        map.put(800400014L, new nba());
        map.put(800400002L, new nbe());
        map.put(800400003L, new nbh());
        map.put(800400004L, new nbb());
        map.put(800400005L, new nbg());
    }

    public static EventProcessor d(Long l) {
        ReleaseLogUtil.d("R_LINKAGE_Event_ProcessorFactory", "getProcessor eventId: ", l);
        Map<Long, EventProcessor> map = d;
        if (map.get(l) != null) {
            return map.get(l);
        }
        return new nbc();
    }
}
