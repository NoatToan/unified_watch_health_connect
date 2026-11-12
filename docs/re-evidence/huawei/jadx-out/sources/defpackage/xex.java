package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.huawei.uikit.hwlunar.R;
import com.huawei.uikit.hwlunar.utils.HwLunarCalendar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class xex {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static xex f52809b;
    private HwLunarCalendar r;
    private Context t;
    private String[] e = new String[205];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f52810a = new String[205];
    private SparseArray<Integer> d = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SparseArray<String> f52811c = new SparseArray<>();
    private SparseArray<String> g = new SparseArray<>();
    private Map<String, Integer> j = new HashMap(10);
    private Map<String, Integer> i = new HashMap(10);
    private Map<Integer, List<String>> h = new HashMap(10);
    private Map<Integer, String> f = new HashMap(10);
    private Map<String, Integer> l = new HashMap(10);
    private Map<String, String> o = new HashMap(10);
    private Map<String, List<String>> n = new HashMap(10);
    private List<Object> m = new ArrayList(10);
    private List<Object> k = new ArrayList(10);
    private List<Object> s = new ArrayList(10);
    private Map<String, List<String>> p = new HashMap(10);
    private String q = null;
    private String w = null;
    private String x = null;
    private final Object y = new Object();
    private List<String> v = new ArrayList(10);
    private Map<String, Integer> u = new HashMap(10);

    protected xex(Context context) throws Throwable {
        this.t = context.getApplicationContext();
        this.r = new HwLunarCalendar(this.t);
        k();
    }

    public static GregorianCalendar a() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1900, 0, 31);
        return gregorianCalendar;
    }

    public static GregorianCalendar c() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(2101, 0, 27);
        return gregorianCalendar;
    }

    public static xex e(Context context) {
        xex xexVarL;
        synchronized (xex.class) {
            if (f52809b == null) {
                a(new xex(context));
            }
            xexVarL = l();
        }
        return xexVarL;
    }

    private void k() throws Throwable {
        Log.w("HwLunarDataOperate", "init ");
        int i = 0;
        for (int i2 = 1898; i2 < 2103; i2++) {
            this.r.e(i2, 8, 8);
            String strD = this.r.d();
            this.e[i] = strD;
            this.f52810a[i] = String.valueOf(i2);
            this.d.put(i2, Integer.valueOf(i));
            this.f52811c.put(i2, strD);
            this.g.put(i, strD);
            this.j.put(strD, Integer.valueOf(i2));
            this.i.put(strD, Integer.valueOf(i));
            i++;
        }
        o();
        this.u.put(this.t.getString(R.string.chinese_twenty) + this.t.getString(R.string.eight), 1);
        this.u.put(this.t.getString(R.string.chinese_twenty) + this.t.getString(R.string.nine), 2);
        this.u.put(this.t.getString(R.string.chinese_thirty), 3);
        this.u.put(this.t.getString(R.string.chinese_thirty) + this.t.getString(R.string.one), 3);
    }

    private static xex l() {
        return f52809b;
    }

    private void o() throws Throwable {
        Throwable th;
        InputStream inputStreamOpenRawResource;
        BufferedReader bufferedReader;
        Throwable th2;
        BufferedReader bufferedReader2 = null;
        String str = null;
        bufferedReader = null;
        bufferedReader = null;
        BufferedReader bufferedReader3 = null;
        try {
            inputStreamOpenRawResource = this.t.getResources().openRawResource(R.raw.all_month);
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, "UTF-8"));
                    try {
                        ArrayList arrayList = new ArrayList(10);
                        int i = 0;
                        String str2 = null;
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                xfa.c(inputStreamOpenRawResource);
                                xfa.c(bufferedReader);
                                return;
                            }
                            if (e(line, i)) {
                                xfa.c(inputStreamOpenRawResource);
                                xfa.c(bufferedReader);
                                return;
                            }
                            String[] strArrD = d(b(a(line)));
                            a(i, strArrD);
                            if (str == null) {
                                str = strArrD[0];
                                str2 = strArrD[1];
                                arrayList.add(strArrD[2]);
                            } else if (str.equals(strArrD[0])) {
                                arrayList.add(strArrD[2]);
                            } else {
                                b(str, arrayList);
                                this.n.put(str2, arrayList);
                                ArrayList arrayList2 = new ArrayList(10);
                                String str3 = strArrD[0];
                                String str4 = strArrD[1];
                                arrayList2.add(strArrD[2]);
                                arrayList = arrayList2;
                                str = str3;
                                str2 = str4;
                            }
                            i++;
                        }
                    } catch (IOException unused) {
                        bufferedReader3 = bufferedReader;
                        Log.e("HwLunarDataOperate", "loadAllMonth has an Exception.");
                        xfa.c(inputStreamOpenRawResource);
                        xfa.c(bufferedReader3);
                    } catch (Throwable th3) {
                        th2 = th3;
                        xfa.c(inputStreamOpenRawResource);
                        xfa.c(bufferedReader);
                        throw th2;
                    }
                } catch (IOException unused2) {
                }
            } catch (Throwable th4) {
                th = th4;
                inputStreamOpenRawResource = inputStreamOpenRawResource;
                bufferedReader2 = bufferedReader3;
                Throwable th5 = th;
                bufferedReader = bufferedReader2;
                th2 = th5;
                xfa.c(inputStreamOpenRawResource);
                xfa.c(bufferedReader);
                throw th2;
            }
        } catch (IOException unused3) {
            inputStreamOpenRawResource = null;
        } catch (Throwable th6) {
            th = th6;
            inputStreamOpenRawResource = null;
            Throwable th7 = th;
            bufferedReader = bufferedReader2;
            th2 = th7;
            xfa.c(inputStreamOpenRawResource);
            xfa.c(bufferedReader);
            throw th2;
        }
    }

    public Map<Integer, String> b() {
        return this.f;
    }

    public GregorianCalendar d(String str, String str2, String str3, boolean z) {
        GregorianCalendar gregorianCalendarC;
        synchronized (this.y) {
            int iIntValue = this.j.get(str).intValue();
            String str4 = str + str2 + str3;
            gregorianCalendarC = !this.m.isEmpty() ? c(this.m, str4) : null;
            if (gregorianCalendarC == null && !this.s.isEmpty()) {
                gregorianCalendarC = c(this.s, str4);
            }
            if (gregorianCalendarC == null && !this.k.isEmpty()) {
                gregorianCalendarC = c(this.k, str4);
            }
            if (gregorianCalendarC == null) {
                e(iIntValue);
                if (!this.m.isEmpty()) {
                    gregorianCalendarC = c(this.m, str4);
                }
                if (gregorianCalendarC == null && !this.s.isEmpty()) {
                    gregorianCalendarC = c(this.s, str4);
                }
                gregorianCalendarC = e(z, gregorianCalendarC);
            }
        }
        return gregorianCalendarC;
    }

    public Map<String, Integer> d() {
        return this.i;
    }

    public void e(int i) {
        synchronized (this.y) {
            this.q = null;
            this.w = null;
            this.x = null;
            if (!this.p.isEmpty()) {
                this.p = new HashMap(10);
            }
            int i2 = R.raw.year_1899 + (i - 1899);
            this.k = c(i2 - 1);
            this.m = c(i2);
            this.s = c(i2 + 1);
        }
    }

    public String[] e() {
        return this.f52810a;
    }

    public Map<String, List<String>> f() {
        return this.n;
    }

    public Map<String, Integer> g() {
        return this.l;
    }

    public String[] h() {
        return this.e;
    }

    public Map<String, Integer> i() {
        return this.j;
    }

    public SparseArray<String> j() {
        return this.f52811c;
    }

    public Map<String, List<String>> n() {
        return this.p;
    }

    private static void a(xex xexVar) {
        f52809b = xexVar;
    }

    private void b(String str, List<String> list) {
        try {
            this.h.put(Integer.valueOf(str), list);
        } catch (NumberFormatException unused) {
            Log.e("HwLunarDataOperate", "parse string to int error, westernYear = " + str);
        }
    }

    private boolean e(String str, int i) {
        if (i > 10000) {
            Log.e("HwLunarDataOperate", "loadAllMonth: too many lines in all month config file!");
            return true;
        }
        if (str.length() <= 6) {
            return false;
        }
        Log.e("HwLunarDataOperate", "hex month string length is illegal");
        return true;
    }

    private void a(int i, String[] strArr) {
        if (strArr != null && strArr.length == 4) {
            this.f.put(Integer.valueOf(i), strArr[1] + "_" + strArr[2]);
            this.l.put(strArr[1] + "_" + strArr[2], Integer.valueOf(i));
            this.o.put(strArr[1] + strArr[2], strArr[3]);
            return;
        }
        Log.e("HwLunarDataOperate", "decode month table error");
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str, 16);
        } catch (NumberFormatException | IllegalFormatException unused) {
            Log.e("HwLunarDataOperate", "parse string to hex error, hexStr = " + str);
            return 0;
        }
    }

    private GregorianCalendar c(String str) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (str.length() == 8) {
            String strSubstring = str.substring(0, 4);
            String strSubstring2 = str.substring(4, 6);
            String strSubstring3 = str.substring(6, 8);
            if (strSubstring2.indexOf("0") != -1 && strSubstring2.indexOf("0") != 1) {
                strSubstring2 = strSubstring2.substring(1, 2);
            }
            try {
                gregorianCalendar.set(Integer.parseInt(strSubstring), Integer.parseInt(strSubstring2) - 1, Integer.parseInt(strSubstring3));
                return gregorianCalendar;
            } catch (NumberFormatException unused) {
                Log.e("HwLunarDataOperate", "parse string to int error.");
            }
        }
        return gregorianCalendar;
    }

    public GregorianCalendar e(String str, String str2, String str3, int i, boolean z) {
        GregorianCalendar gregorianCalendarC;
        synchronized (this.y) {
            int iIntValue = this.j.get(str).intValue();
            String str4 = str + str2 + str3;
            gregorianCalendarC = !this.m.isEmpty() ? c(this.m, str4) : null;
            if (gregorianCalendarC == null && !this.s.isEmpty()) {
                gregorianCalendarC = c(this.s, str4);
            }
            if (gregorianCalendarC == null && !this.k.isEmpty()) {
                gregorianCalendarC = c(this.k, str4);
            }
            if (gregorianCalendarC == null) {
                e(iIntValue);
                if (!this.m.isEmpty()) {
                    gregorianCalendarC = c(this.m, str4);
                }
                if (gregorianCalendarC == null && !this.s.isEmpty()) {
                    gregorianCalendarC = c(this.s, str4);
                }
                if (gregorianCalendarC == null) {
                    a(str, str2, str3, i, z);
                }
            }
        }
        return gregorianCalendarC;
    }

    private int[] b(int i) {
        return new int[]{(i & 255) + 1890, (i >> 8) & 15, (i >> 12) & 15, (i >> 16) & 1, (i >> 17) & 15, (i >> 21) & 1};
    }

    private String[] d(int[] iArr) {
        if (iArr.length != 6) {
            Log.e("HwLunarDataOperate", "decode year month table error");
            return new String[0];
        }
        String[] strArr = new String[4];
        strArr[0] = iArr[0] + "";
        StringBuilder sb = new StringBuilder();
        String[] strArr2 = xfa.f52822b;
        sb.append(strArr2[iArr[1] % strArr2.length]);
        String[] strArr3 = xfa.f52823c;
        sb.append(strArr3[iArr[2] % strArr3.length]);
        String[] strArr4 = xfa.g;
        sb.append(strArr4[iArr[2] % strArr4.length]);
        sb.append("年");
        sb.append(iArr[0]);
        strArr[1] = sb.toString();
        if (iArr[3] == 0) {
            String[] strArr5 = xfa.d;
            strArr[2] = strArr5[iArr[4] % strArr5.length];
        } else {
            StringBuilder sb2 = new StringBuilder("闰");
            String[] strArr6 = xfa.d;
            sb2.append(strArr6[iArr[4] % strArr6.length]);
            strArr[2] = sb2.toString();
        }
        String[] strArr7 = xfa.e;
        strArr[3] = strArr7[(iArr[5] + 28) % strArr7.length];
        return strArr;
    }

    private GregorianCalendar e(boolean z, GregorianCalendar gregorianCalendar) {
        return (gregorianCalendar == null && z) ? new GregorianCalendar() : gregorianCalendar;
    }

    private GregorianCalendar a(String str, String str2, String str3, int i, boolean z) {
        if (i == 1) {
            String str4 = this.o.get(str + str2);
            if (str4 != null) {
                if (this.u.get(str3).intValue() > this.u.get(str4).intValue()) {
                    return d(str, str2, str4, false);
                }
                return null;
            }
            return e(z, (GregorianCalendar) null);
        }
        if (i == 0) {
            if (str2.indexOf(this.t.getString(R.string.run)) != -1) {
                GregorianCalendar gregorianCalendarE = e(str, str2, str3, 1, false);
                if (gregorianCalendarE != null) {
                    return gregorianCalendarE;
                }
                String strReplace = str2.replace(this.t.getString(R.string.run), "");
                GregorianCalendar gregorianCalendarD = d(str, strReplace, str3, false);
                return gregorianCalendarD != null ? gregorianCalendarD : e(z, e(str, strReplace, str3, 1, false));
            }
            GregorianCalendar gregorianCalendarE2 = e(str, str2, str3, 1, false);
            return (gregorianCalendarE2 == null && z) ? new GregorianCalendar() : gregorianCalendarE2;
        }
        return e(z, (GregorianCalendar) null);
    }

    private int[] d(int i) {
        return new int[]{i & 15, (i >> 4) & 31, (i >> 9) & 15, (i >> 13) & 15, (i >> 17) & 1, (i >> 18) & 1, (i >> 19) & 15, (i >> 23) & 31};
    }

    private void a(String[] strArr) {
        if (strArr == null || strArr.length != 4) {
            return;
        }
        this.p.put(this.q + this.w, this.v);
        ArrayList arrayList = new ArrayList(10);
        this.v = arrayList;
        this.w = strArr[2];
        this.q = strArr[1];
        String str = strArr[3];
        this.x = str;
        arrayList.add(str);
    }

    private List<Object> c(int i) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        InputStream inputStreamOpenRawResource;
        BufferedReader bufferedReader2;
        List<Object> arrayList = new ArrayList<>(10);
        InputStream inputStream = null;
        bufferedReader = null;
        bufferedReader = null;
        BufferedReader bufferedReader3 = null;
        try {
            inputStreamOpenRawResource = this.t.getResources().openRawResource(i);
            try {
                try {
                    bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, "UTF-8"));
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null && line.length() <= 7) {
                            try {
                                int i2 = Integer.parseInt(line, 16);
                                Map<String, String> map = new HashMap<>(10);
                                List<Object> listB = b(bufferedReader2, arrayList, i2, map, 1);
                                if (listB != null) {
                                    xfa.c(inputStreamOpenRawResource);
                                    xfa.c(bufferedReader2);
                                    return listB;
                                }
                                arrayList.add(map);
                            } catch (NumberFormatException unused) {
                                Log.e("HwLunarDataOperate", "readOneYearData: parse string to hex error, line = " + line);
                                xfa.c(inputStreamOpenRawResource);
                                xfa.c(bufferedReader2);
                                return arrayList;
                            }
                        } else {
                            Log.e("HwLunarDataOperate", "readOneYearData: year index length is illegal, line = " + line);
                            xfa.c(inputStreamOpenRawResource);
                            xfa.c(bufferedReader2);
                            return arrayList;
                        }
                    } catch (IOException unused2) {
                        bufferedReader3 = bufferedReader2;
                        Log.e("HwLunarDataOperate", "readOneYearData has an Exception.");
                        bufferedReader2 = bufferedReader3;
                    } catch (Throwable th2) {
                        th = th2;
                        xfa.c(inputStreamOpenRawResource);
                        xfa.c(bufferedReader2);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (Throwable th3) {
                th = th3;
                BufferedReader bufferedReader4 = bufferedReader3;
                inputStream = inputStreamOpenRawResource;
                bufferedReader = bufferedReader4;
                bufferedReader2 = bufferedReader;
                inputStreamOpenRawResource = inputStream;
                xfa.c(inputStreamOpenRawResource);
                xfa.c(bufferedReader2);
                throw th;
            }
        } catch (IOException unused4) {
            inputStreamOpenRawResource = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            bufferedReader2 = bufferedReader;
            inputStreamOpenRawResource = inputStream;
            xfa.c(inputStreamOpenRawResource);
            xfa.c(bufferedReader2);
            throw th;
        }
        xfa.c(inputStreamOpenRawResource);
        xfa.c(bufferedReader2);
        return arrayList;
    }

    private GregorianCalendar c(List<Object> list, String str) {
        int i;
        Map map = (Map) list.get(0);
        if (map.get(str) == null) {
            return null;
        }
        int iA = a((String) map.get(str));
        int[] iArr = {iA & 15, (iA >> 4) & 31, (iA >> 17) & 1};
        String strSubstring = str.substring(4, 8);
        try {
            i = Integer.parseInt(strSubstring) + iArr[2];
        } catch (NumberFormatException unused) {
            Log.e("HwLunarDataOperate", "parse string to int error, lunarYear = " + strSubstring);
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String[] strArr = xfa.h;
        sb.append(strArr[iArr[0] % strArr.length]);
        String[] strArr2 = xfa.f52821a;
        sb.append(strArr2[iArr[1] % strArr2.length]);
        return c(sb.toString());
    }

    private List<Object> b(BufferedReader bufferedReader, List<Object> list, int i, Map<String, String> map, int i2) throws IOException {
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return null;
            }
            if (i2 > 1000) {
                Log.e("HwLunarDataOperate", "readOneYearData: Too many lines in one year data file");
                return list;
            }
            if (line.length() > 7) {
                Log.e("HwLunarDataOperate", "readOneYearData: yearData length is illegal, line = " + line);
                return list;
            }
            String[] strArrB = b(d(a(line)), i);
            if (strArrB != null && strArrB.length == 4) {
                map.put(strArrB[1] + strArrB[2] + strArrB[3], line);
                b(strArrB);
                i2++;
            } else {
                Log.e("HwLunarDataOperate", "readOneYearData: decode error");
                return list;
            }
        }
    }

    private void b(String[] strArr) {
        String str = this.t.getString(R.string.chinese_chu) + this.t.getString(R.string.one);
        if (this.w == null && str.equals(strArr[3])) {
            this.w = strArr[2];
            this.q = strArr[1];
            String str2 = strArr[3];
            this.x = str2;
            this.v.add(str2);
            return;
        }
        String str3 = this.w;
        if (str3 != null && strArr[2].equals(str3)) {
            String str4 = strArr[3];
            this.x = str4;
            this.v.add(str4);
        } else if (this.w != null) {
            a(strArr);
        } else {
            Log.e("HwLunarDataOperate", "readOneYearData: load data error");
        }
    }

    private String[] b(int[] iArr, int i) {
        if (iArr != null && iArr.length == 8) {
            String[] strArr = new String[4];
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            String[] strArr2 = xfa.h;
            sb.append(strArr2[iArr[0] % strArr2.length]);
            String[] strArr3 = xfa.f52821a;
            sb.append(strArr3[iArr[1] % strArr3.length]);
            strArr[0] = sb.toString();
            int i2 = iArr[4];
            StringBuilder sb2 = new StringBuilder();
            String[] strArr4 = xfa.f52822b;
            sb2.append(strArr4[iArr[2] % strArr4.length]);
            String[] strArr5 = xfa.f52823c;
            sb2.append(strArr5[iArr[3] % strArr5.length]);
            String[] strArr6 = xfa.g;
            sb2.append(strArr6[iArr[3] % strArr6.length]);
            sb2.append("年");
            sb2.append(i - i2);
            strArr[1] = sb2.toString();
            if (iArr[5] == 0) {
                String[] strArr7 = xfa.d;
                strArr[2] = strArr7[iArr[6] % strArr7.length];
            } else {
                StringBuilder sb3 = new StringBuilder("闰");
                String[] strArr8 = xfa.d;
                sb3.append(strArr8[iArr[6] % strArr8.length]);
                strArr[2] = sb3.toString();
            }
            String[] strArr9 = xfa.e;
            strArr[3] = strArr9[iArr[7] % strArr9.length];
            return strArr;
        }
        Log.e("HwLunarDataOperate", "decode year index error");
        return new String[0];
    }
}
