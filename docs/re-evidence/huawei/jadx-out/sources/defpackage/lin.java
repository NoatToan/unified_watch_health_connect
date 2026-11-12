package defpackage;

import com.huawei.hihealth.util.HiJsonUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lin {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Double> f40307c;

    public lin() {
        this.f40307c = new HashMap();
    }

    public void c(String str, double d) {
        Map<String, Double> map = this.f40307c;
        if (map == null) {
            return;
        }
        map.put(str, Double.valueOf(d));
    }

    public String b() {
        Map<String, Double> map = this.f40307c;
        if (map == null) {
            return null;
        }
        return HiJsonUtil.e(map, Map.class);
    }

    public lin(String str) {
        this.f40307c = (Map) HiJsonUtil.a(str, Map.class);
    }

    public Map<String, Double> a() {
        return this.f40307c;
    }
}
