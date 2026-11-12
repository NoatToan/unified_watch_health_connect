package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.linkage.channel.SampelBaseHandler;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nav {
    private static final Map<String, SampelBaseHandler> d;

    static {
        HashMap map = new HashMap();
        d = map;
        map.put(eeh.class.getName(), new nbd());
        map.put(eef.class.getName(), new nay());
        map.put(eee.class.getName(), new naw());
    }

    public static SampelBaseHandler a(eec eecVar) {
        String name = eecVar.getClass().getName();
        LogUtil.a("LINKAGE_SampleBaseHandlerFactory", "getHandler sampleBaseClassName: ", name);
        Map<String, SampelBaseHandler> map = d;
        if (map.get(name) != null) {
            return map.get(name);
        }
        return new nax();
    }
}
