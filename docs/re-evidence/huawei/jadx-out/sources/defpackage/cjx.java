package defpackage;

import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.devicesdk.strategy.ScanStrategyBle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class cjx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<ScanMode, String> f1657a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<SendMode, String> f1658c;
    private static final Map<ConnectMode, String> e;

    static {
        HashMap map = new HashMap(5);
        f1657a = map;
        map.put(ScanMode.BR, cob.class.getName());
        map.put(ScanMode.BLE, ScanStrategyBle.class.getName());
        HashMap map2 = new HashMap(5);
        e = map2;
        map2.put(ConnectMode.GENERAL, cnx.class.getName());
        map2.put(ConnectMode.SIMPLE, cnt.class.getName());
        map2.put(ConnectMode.TRANSPARENT, cnv.class.getName());
        HashMap map3 = new HashMap(5);
        f1658c = map3;
        map3.put(SendMode.PROTOCOL_TYPE_5A, cnz.class.getName());
        map3.put(SendMode.PROTOCOL_TYPE_D, cog.class.getName());
        map3.put(SendMode.PROTOCOL_TYPE_DIRECT, coe.class.getName());
        map3.put(SendMode.PROTOCOL_TYPE_FRAGMENT, coh.class.getName());
    }

    public static Map<ScanMode, String> b() {
        return Collections.unmodifiableMap(f1657a);
    }

    public static Map<ConnectMode, String> d() {
        return Collections.unmodifiableMap(e);
    }

    public static Map<SendMode, String> c() {
        return Collections.unmodifiableMap(f1658c);
    }
}
