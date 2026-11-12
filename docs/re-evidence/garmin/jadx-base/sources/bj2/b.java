package bj2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, e> f18353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<C0267b> f18354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f18356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f18357f;

    public static class a {
        public a(String str, int i14) {
        }
    }

    public static class c {
        public c(int i14, int i15) {
            new f(i14, i15);
        }
    }

    public enum d {
        GFX_ORNTN_0,
        GFX_ORNTN_90,
        GFX_ORNTN_180,
        GFX_ORNTN_270,
        GFX_N_ORNTNS;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] dVarArrValuesCustom = values();
            int length = dVarArrValuesCustom.length;
            d[] dVarArr = new d[length];
            System.arraycopy(dVarArrValuesCustom, 0, dVarArr, 0, length);
            return dVarArr;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<String> f18368a;

        public e(String str, ArrayList<String> arrayList, Short sh3, bj2.a aVar) {
            this.f18368a = arrayList;
        }
    }

    public static class f {
        public f(int i14, int i15) {
        }
    }

    public b(String str, String str2, HashMap<String, e> map, d dVar, int i14, List<C0267b> list, List<String> list2, c cVar, List<a> list3, String str3, f fVar, String str4) {
        this.f18352a = str;
        this.f18353b = new HashMap<>();
        for (Map.Entry<String, e> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            for (String str5 : entry.getValue().f18368a) {
                if (str5.equalsIgnoreCase("cht")) {
                    arrayList.add("zht");
                } else if (str5.equalsIgnoreCase("chs")) {
                    arrayList.add("zhs");
                }
                arrayList.add(str5);
            }
            e value = entry.getValue();
            ArrayList<String> arrayList2 = value.f18368a;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            this.f18353b.put(entry.getKey(), value);
        }
        this.f18356e = dVar;
        this.f18355d = i14;
        this.f18354c = list;
        this.f18357f = list3;
    }

    /* JADX INFO: renamed from: bj2.b$b, reason: collision with other inner class name */
    public static class C0267b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f18361d;

        public C0267b(String str) {
            str = (str.startsWith("0x") || str.startsWith("0X")) ? str.substring(2) : str;
            int i14 = Integer.parseInt(str, 16);
            this.f18359b = (i14 >> 16) & 255;
            this.f18360c = (i14 >> 8) & 255;
            this.f18361d = i14 & 255;
            if (str.length() == 6) {
                this.f18358a = 255;
            } else {
                this.f18358a = (i14 >> 24) & 255;
            }
        }

        public C0267b(int i14, int i15, int i16, int i17) {
            this.f18358a = i14;
            this.f18359b = i15;
            this.f18360c = i16;
            this.f18361d = i17;
        }

        public C0267b(long j8) {
            this.f18359b = ((int) (j8 >> 16)) & 255;
            this.f18360c = ((int) (j8 >> 8)) & 255;
            this.f18361d = ((int) j8) & 255;
            this.f18358a = ((int) (j8 >> 24)) & 255;
        }

        public C0267b(int i14) {
            this.f18359b = (i14 >> 16) & 255;
            this.f18360c = (i14 >> 8) & 255;
            this.f18361d = i14 & 255;
            this.f18358a = (i14 >> 24) & 255;
        }
    }

    public b(String str, String str2, HashMap<String, e> map, d dVar, int i14, List<C0267b> list, c cVar, List<a> list2, String str3, String str4) {
        this(str, str2, map, dVar, i14, list, null, cVar, list2, str3, null, str4);
    }

    public b(String str, String str2, HashMap<String, e> map, d dVar, int i14, List<C0267b> list, c cVar, List<a> list2, String str3, f fVar, String str4) {
        this(str, str2, map, dVar, i14, list, null, cVar, list2, str3, fVar, str4);
    }
}
