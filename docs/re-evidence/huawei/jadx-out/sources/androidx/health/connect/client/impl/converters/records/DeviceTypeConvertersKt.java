package androidx.health.connect.client.impl.converters.records;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import defpackage.yyu;
import defpackage.yyz;
import defpackage.yzp;
import defpackage.zae;
import defpackage.zdm;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"DEVICE_TYPE_STRING_TO_INT_MAP", "", "", "", "getDEVICE_TYPE_STRING_TO_INT_MAP", "()Ljava/util/Map;", "DEVICE_TYPE_INT_TO_STRING_MAP", "getDEVICE_TYPE_INT_TO_STRING_MAP", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceTypeConvertersKt {
    private static final Map<Integer, String> DEVICE_TYPE_INT_TO_STRING_MAP;
    private static final Map<String, Integer> DEVICE_TYPE_STRING_TO_INT_MAP;

    public static final Map<String, Integer> getDEVICE_TYPE_STRING_TO_INT_MAP() {
        return DEVICE_TYPE_STRING_TO_INT_MAP;
    }

    static {
        Map<String, Integer> mapE = zae.e(yyz.c("UNKNOWN", 0), yyz.c(DeviceTypes.CHEST_STRAP, 7), yyz.c(DeviceTypes.FITNESS_BAND, 6), yyz.c(DeviceTypes.HEAD_MOUNTED, 5), yyz.c(DeviceTypes.PHONE, 2), yyz.c(DeviceTypes.RING, 4), yyz.c(DeviceTypes.SCALE, 3), yyz.c(DeviceTypes.SMART_DISPLAY, 8), yyz.c(DeviceTypes.WATCH, 1));
        DEVICE_TYPE_STRING_TO_INT_MAP = mapE;
        Set<Map.Entry<String, Integer>> setEntrySet = mapE.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(yzp.e(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            yyu yyuVarC = yyz.c(entry.getValue(), entry.getKey());
            linkedHashMap.put(yyuVarC.c(), yyuVarC.d());
        }
        DEVICE_TYPE_INT_TO_STRING_MAP = linkedHashMap;
    }

    public static final Map<Integer, String> getDEVICE_TYPE_INT_TO_STRING_MAP() {
        return DEVICE_TYPE_INT_TO_STRING_MAP;
    }
}
