package defpackage;

import com.huawei.healthcloud.plugintrack.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jhe {
    private static LinkedHashMap<String, Integer> e;

    static {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        e = linkedHashMap;
        linkedHashMap.put("[28]", Integer.valueOf(R.drawable.expression_28));
        e.put("[29]", Integer.valueOf(R.drawable.expression_29));
        e.put("[30]", Integer.valueOf(R.drawable.expression_30));
        e.put("[31]", Integer.valueOf(R.drawable.expression_31));
        e.put("[32]", Integer.valueOf(R.drawable.expression_32));
        e.put("[33]", Integer.valueOf(R.drawable.expression_33));
        e.put("[34]", Integer.valueOf(R.drawable.expression_34));
        e.put("[35]", Integer.valueOf(R.drawable.expression_35));
        e.put("[36]", Integer.valueOf(R.drawable.expression_36));
        e.put("[37]", Integer.valueOf(R.drawable.expression_37));
        e.put("[38]", Integer.valueOf(R.drawable.expression_38));
        e.put("[39]", Integer.valueOf(R.drawable.expression_39));
        e.put("[40]", Integer.valueOf(R.drawable.expression_40));
        e.put("[41]", Integer.valueOf(R.drawable.expression_41));
        e.put("[42]", Integer.valueOf(R.drawable.expression_42));
        e.put("[43]", Integer.valueOf(R.drawable.expression_43));
        e.put("[44]", Integer.valueOf(R.drawable.expression_44));
        e.put("[45]", Integer.valueOf(R.drawable.expression_45));
        e.put("[46]", Integer.valueOf(R.drawable.expression_46));
        e.put("[47]", Integer.valueOf(R.drawable.expression_47));
        e.put("[48]", Integer.valueOf(R.drawable.expression_48));
        e.put("[49]", Integer.valueOf(R.drawable.expression_49));
        e.put("[50]", Integer.valueOf(R.drawable.expression_50));
        e.put("[51]", Integer.valueOf(R.drawable.expression_51));
        e.put("[52]", Integer.valueOf(R.drawable.expression_52));
        e.put("[53]", Integer.valueOf(R.drawable.expression_53));
        e.put("[54]", Integer.valueOf(R.drawable.expression_54));
        e.put("[55]", Integer.valueOf(R.drawable.expression_55));
        e.put("[10]", Integer.valueOf(R.drawable.expression_10));
        e.put("[11]", Integer.valueOf(R.drawable.expression_11));
        e.put("[12]", Integer.valueOf(R.drawable.expression_12));
        e.put("[14]", Integer.valueOf(R.drawable.expression_14));
        e.put("[15]", Integer.valueOf(R.drawable.expression_15));
        e.put("[16]", Integer.valueOf(R.drawable.expression_16));
        e.put("[17]", Integer.valueOf(R.drawable.expression_17));
        e.put("[18]", Integer.valueOf(R.drawable.expression_18));
        e.put("[19]", Integer.valueOf(R.drawable.expression_19));
        e.put("[20]", Integer.valueOf(R.drawable.expression_20));
        e.put("[21]", Integer.valueOf(R.drawable.expression_21));
        e.put("[01]", Integer.valueOf(R.drawable.expression_1));
        e.put("[02]", Integer.valueOf(R.drawable.expression_2));
        e.put("[03]", Integer.valueOf(R.drawable.expression_3));
        e.put("[04]", Integer.valueOf(R.drawable.expression_4));
        e.put("[05]", Integer.valueOf(R.drawable.expression_5));
        e.put("[06]", Integer.valueOf(R.drawable.expression_6));
        e.put("[07]", Integer.valueOf(R.drawable.expression_7));
        e.put("[08]", Integer.valueOf(R.drawable.expression_8));
        e.put("[09]", Integer.valueOf(R.drawable.expression_9));
        e.put("[13]", Integer.valueOf(R.drawable.expression_13));
        e.put("[22]", Integer.valueOf(R.drawable.expression_22));
        e.put("[23]", Integer.valueOf(R.drawable.expression_23));
        e.put("[24]", Integer.valueOf(R.drawable.expression_24));
        e.put("[25]", Integer.valueOf(R.drawable.expression_25));
        e.put("[26]", Integer.valueOf(R.drawable.expression_26));
        e.put("[27]", Integer.valueOf(R.drawable.expression_27));
        e.put("[56]", Integer.valueOf(R.drawable.expression_56));
    }

    public static int c(String str) {
        Integer num = e.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public static List<jhg> a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : e.entrySet()) {
            arrayList.add(new jhg(entry.getKey(), entry.getValue().intValue()));
        }
        return arrayList;
    }
}
