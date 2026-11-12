package defpackage;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class uhl extends TagPayloadReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f35766b;
    public long[] c;
    public long[] d;

    public uhl() {
        super(new p67());
        this.f35766b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    public static Boolean g(okh okhVar) {
        return Boolean.valueOf(okhVar.D() == 1);
    }

    public static Object h(okh okhVar, int i) {
        if (i == 0) {
            return j(okhVar);
        }
        if (i == 1) {
            return g(okhVar);
        }
        if (i == 2) {
            return n(okhVar);
        }
        if (i == 3) {
            return l(okhVar);
        }
        if (i == 8) {
            return k(okhVar);
        }
        if (i == 10) {
            return m(okhVar);
        }
        if (i != 11) {
            return null;
        }
        return i(okhVar);
    }

    public static Date i(okh okhVar) {
        Date date = new Date((long) j(okhVar).doubleValue());
        okhVar.Q(2);
        return date;
    }

    public static Double j(okh okhVar) {
        return Double.valueOf(Double.longBitsToDouble(okhVar.w()));
    }

    public static HashMap<String, Object> k(okh okhVar) {
        int iH = okhVar.H();
        HashMap<String, Object> map = new HashMap<>(iH);
        for (int i = 0; i < iH; i++) {
            String strN = n(okhVar);
            Object objH = h(okhVar, o(okhVar));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    public static HashMap<String, Object> l(okh okhVar) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strN = n(okhVar);
            int iO = o(okhVar);
            if (iO == 9) {
                return map;
            }
            Object objH = h(okhVar, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    public static ArrayList<Object> m(okh okhVar) {
        int iH = okhVar.H();
        ArrayList<Object> arrayList = new ArrayList<>(iH);
        for (int i = 0; i < iH; i++) {
            Object objH = h(okhVar, o(okhVar));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    public static String n(okh okhVar) {
        int iJ = okhVar.J();
        int iE = okhVar.e();
        okhVar.Q(iJ);
        return new String(okhVar.d(), iE, iJ);
    }

    public static int o(okh okhVar) {
        return okhVar.D();
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(okh okhVar) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(okh okhVar, long j) {
        if (o(okhVar) != 2 || !"onMetaData".equals(n(okhVar)) || o(okhVar) != 8) {
            return false;
        }
        HashMap<String, Object> mapK = k(okhVar);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f35766b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                    this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f35766b;
    }

    public long[] e() {
        return this.d;
    }

    public long[] f() {
        return this.c;
    }
}
