package zy0;

import ch.qos.logback.classic.spi.CallerData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class q {
    public static final String a(Map map, String str, Object... objArr) {
        str.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        StringBuilder sb3 = new StringBuilder(String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
        if (!map.isEmpty()) {
            sb3.append(CallerData.NA);
            Set setEntrySet = map.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((Map.Entry) obj).getValue() != null) {
                    arrayList.add(obj);
                }
            }
            sb3.append(h0.k0(arrayList, "&", null, null, new zw.b(4), 30));
        }
        return sb3.toString();
    }
}
