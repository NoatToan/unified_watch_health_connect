package defpackage;

import com.huawei.health.ecologydevice.fitness.factory.RopeDataFactory;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ehm {
    private static final Map<String, RopeDataFactory> e = new HashMap();

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private static void b(String str) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 721504305) {
            if (iHashCode != 1151864826) {
                if (iHashCode == 1960780819 && str.equals("RopeControlSingle")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("RopeConfigSubPackage")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("RopeControlSubPackage")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            e.put("RopeControlSubPackage", new ehk());
        } else if (b2 == 1) {
            e.put("RopeConfigSubPackage", new ehi());
        } else {
            if (b2 != 2) {
                return;
            }
            e.put("RopeControlSingle", new ehf());
        }
    }

    public static RopeDataFactory c(String str) {
        LogUtil.a("CommandHandlerFactory", "type = ", str);
        Map<String, RopeDataFactory> map = e;
        if (map.get(str) == null) {
            b(str);
        }
        return map.get(str);
    }
}
