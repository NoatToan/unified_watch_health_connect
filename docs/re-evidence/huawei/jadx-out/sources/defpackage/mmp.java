package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.common.DataSender;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class mmp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataSender f41931a;
    private final Map<String, DataSender> e;

    private mmp(DataSender dataSender, Map<String, DataSender> map) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.e = concurrentHashMap;
        this.f41931a = (DataSender) Objects.requireNonNull(dataSender, "defaultSender is must be not null");
        if (map != null) {
            concurrentHashMap.putAll(map);
        }
    }

    public DataSender b(String str) {
        return this.e.getOrDefault(str, this.f41931a);
    }

    public void a() {
        this.e.clear();
    }

    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private DataSender f41932b;
        private final Map<String, DataSender> e = new HashMap();

        public e e(DataSender dataSender) {
            this.f41932b = dataSender;
            return this;
        }

        public e a(String str, DataSender dataSender) {
            this.e.put(str, dataSender);
            return this;
        }

        public mmp d() {
            return new mmp(this.f41932b, this.e);
        }
    }
}
