package defpackage;

import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
public class t2n extends c17 {
    @Override // defpackage.c17
    public List<q69> a(List<q69> list, dq5 dq5Var, TimeZone timeZone) {
        ArrayList arrayList = new ArrayList();
        for (q69 q69Var : list) {
            Boolean bool = Boolean.FALSE;
            String str = "";
            for (Map.Entry<String, String> entry : q69Var.h().entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key.equals("level") || key.equals(RealNameWebViewActivity.NUMBER)) {
                    arrayList.add(q69Var);
                } else if (key.equals("fraction")) {
                    Map<String, String> mapH = q69Var.h();
                    mapH.put("fraction", "%" + value);
                    q69Var.m(mapH);
                    arrayList.add(q69Var);
                } else if (key.equals("temperature")) {
                    HashMap map = new HashMap();
                    map.put("factoid_temperature", value);
                    q69Var.m(map);
                    arrayList.add(q69Var);
                } else if (key.equals("norm_unit_name") && value.equals("千米每小时")) {
                    bool = Boolean.TRUE;
                } else if (key.equals("measure_unit")) {
                    str = value;
                }
            }
            if (bool.booleanValue() && !"".equals(str)) {
                HashMap map2 = new HashMap();
                map2.put("speed_level", str);
                q69Var.m(map2);
                arrayList.add(q69Var);
            }
        }
        return arrayList;
    }
}
