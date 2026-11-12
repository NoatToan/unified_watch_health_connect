package oh0;

import c22.j0;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.HashMap;
import n23.j;
import o61.g;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: oh0.a$a, reason: collision with other inner class name */
    public enum EnumC2508a {
        /* JADX INFO: Fake field, exist only in values array */
        VALUE_METRIC_COUNT("count"),
        /* JADX INFO: Fake field, exist only in values array */
        VALUE_METRIC_MIN("min"),
        /* JADX INFO: Fake field, exist only in values array */
        VALUE_METRIC_MAX("max"),
        VALUE_METRIC_AVG("avg"),
        /* JADX INFO: Fake field, exist only in values array */
        VALUE_METRIC_SUM("sum");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f132161a;

        EnumC2508a(String str) {
            this.f132161a = str;
        }
    }

    private a() {
    }

    public static ArrayList a(String str, HashMap map) {
        i2.l("ServiceDataMappingUtil", "Creating groupedMetrics getPerformanceStatsMeasurementDTOAvgList  ".concat(str));
        EnumC2508a enumC2508a = EnumC2508a.VALUE_METRIC_AVG;
        StringBuilder sbL = hb.a.l("Creating groupedMetrics getPerformanceStatsMeasurementDTOList  ", str, StringUtils.SPACE);
        sbL.append(enumC2508a.f132161a);
        i2.l("ServiceDataMappingUtil", sbL.toString());
        ArrayList arrayList = new ArrayList();
        for (String str2 : map.keySet()) {
            HashMap map2 = (HashMap) map.get(str2);
            if (map2.containsKey(str) && ((ph0.a) map2.get(str)).f137703f) {
                g gVar = new g();
                gVar.f129584c = j0.I(str2);
                int iOrdinal = enumC2508a.ordinal();
                if (iOrdinal == 0) {
                    gVar.f129582a = ((ph0.a) map2.get(str)).f137698a;
                } else if (iOrdinal == 1) {
                    gVar.f129582a = ((ph0.a) map2.get(str)).f137699b;
                } else if (iOrdinal == 2) {
                    gVar.f129582a = ((ph0.a) map2.get(str)).f137700c;
                } else if (iOrdinal == 3) {
                    gVar.f129582a = ((ph0.a) map2.get(str)).f137701d;
                } else {
                    if (iOrdinal != 4) {
                        j.A(enumC2508a.f132161a, "Invalid valueName");
                        return null;
                    }
                    gVar.f129582a = ((ph0.a) map2.get(str)).f137702e;
                }
                if (str.equals("lactateThresholdSpeed")) {
                    gVar.f129582a *= 10.0d;
                }
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }
}
