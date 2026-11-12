package defpackage;

import android.util.SparseIntArray;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class mjd {
    private static mjd d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap<Integer, Integer> f41735b;
    private final SparseIntArray e;

    private boolean d(int i, int i2) {
        return (i2 & i) == i;
    }

    private mjd() {
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>(4);
        this.f41735b = linkedHashMap;
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        this.e = sparseIntArray;
        LogUtil.a("DetailGpsWorkoutUtil", "DetailGpsWorkoutUtil");
        linkedHashMap.put(8, 8);
        linkedHashMap.put(4, 10);
        linkedHashMap.put(2, 8);
        linkedHashMap.put(1, 8);
        this.f41734a = 15;
        sparseIntArray.put(2, 0);
        sparseIntArray.put(4, 1);
        sparseIntArray.put(1, 3);
        sparseIntArray.put(8, 2);
    }

    public static mjd a() {
        mjd mjdVar;
        synchronized (mjd.class) {
            if (d == null) {
                d = new mjd();
            }
            mjdVar = d;
        }
        return mjdVar;
    }

    public int e(muz muzVar) {
        if (muzVar != null) {
            return muzVar.e();
        }
        return -1;
    }

    public boolean d(muz muzVar) {
        if (muzVar == null) {
            return false;
        }
        LogUtil.a("DetailGpsWorkoutUtil", "gpsHeaderBitmap is" + muzVar.b() + ",isSupportAltitude is" + (muzVar.b() & 128));
        return (muzVar.b() & 128) == 128;
    }

    public muz a(byte[] bArr) {
        if (bArr == null || bArr.length < 64) {
            return null;
        }
        String strA = a(bArr, 0, 64);
        LogUtil.a("DetailGpsWorkoutUtil", "getGpsFrameHeader info is ", strA);
        return b(strA);
    }

    private static String a(byte[] bArr, int i, int i2) {
        if (bArr == null || i > i2) {
            LogUtil.j("DetailGpsWorkoutUtil", "byteToString bytes is null");
            return "";
        }
        if (i < 0) {
            LogUtil.j("DetailGpsWorkoutUtil", "Start less than zero");
            return "";
        }
        if (i2 > bArr.length) {
            LogUtil.j("DetailGpsWorkoutUtil", "End is too large");
            return "";
        }
        byte[] bArr2 = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            bArr2[i3] = bArr[i];
            i++;
            i3++;
        }
        return eeq.e(bArr2);
    }

    public Map<Long, double[]> d(byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder(16);
        if (bArr != null) {
            try {
                sb.append(new String(bArr, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                LogUtil.e("DetailGpsWorkoutUtil", "getGPSMap e is ", e.getMessage());
            }
        }
        LogUtil.a("DetailGpsWorkoutUtil", "getGPSMap sb is ", sb.toString());
        return e(sb.toString());
    }

    private Map<Long, double[]> e(String str) {
        HashMap map = new HashMap(16);
        if (str.length() > 64) {
            String strSubstring = str.substring(0, 64);
            muz muzVarB = b(strSubstring);
            if (b(muzVarB.b())) {
                c(map, e(muzVarB.b(), str.substring(strSubstring.length(), str.length())));
            }
        }
        LogUtil.a("DetailGpsWorkoutUtil", "parse end.");
        return map;
    }

    private void c(Map<Long, double[]> map, List<muu> list) {
        if (list != null) {
            for (muu muuVar : list) {
                if (muuVar != null) {
                    map.put(Long.valueOf(muuVar.e()), muuVar.c());
                }
            }
        }
    }

    private muz b(String str) {
        muz muzVar = new muz();
        try {
            muzVar.e(Integer.parseInt(str.substring(0, 16), 16));
            muzVar.d(Integer.parseInt(str.substring(16, 20), 16));
            muzVar.a(Integer.parseInt(str.substring(20, 24), 16));
            int i = Integer.parseInt(str.substring(24, 28), 16);
            muzVar.b(i);
            if (i > 1) {
                muzVar.c(Integer.parseInt(str.substring(28, 30), 16));
                return muzVar;
            }
            muzVar.c(-1);
            return muzVar;
        } catch (NumberFormatException e) {
            LogUtil.a("DetailGpsWorkoutUtil", "getGPSFrameHeader NumberFormatException:", e.getMessage());
            return muzVar;
        }
    }

    private boolean b(int i) {
        int i2 = this.f41734a;
        boolean z = (i ^ i2) <= i2;
        LogUtil.a("DetailGpsWorkoutUtil", "canParseGPSFile : ", Boolean.valueOf(z), "bitmap : ", Integer.valueOf(i));
        return z;
    }

    private List<muu> e(int i, String str) {
        Set<Map.Entry<Integer, Integer>> setEntrySet = this.f41735b.entrySet();
        ArrayList arrayList = new ArrayList(16);
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            muu muuVar = new muu();
            int size = this.f41735b.size();
            double[] dArr = new double[size];
            for (Map.Entry<Integer, Integer> entry : setEntrySet) {
                int iIntValue = entry.getKey().intValue();
                int iIntValue2 = entry.getValue().intValue() + i2;
                if (str.length() < iIntValue2) {
                    LogUtil.j("DetailGpsWorkoutUtil", "parseFileByBitmap gpsFileDataList.size()", Integer.valueOf(arrayList.size()));
                    return arrayList;
                }
                if (d(iIntValue, i)) {
                    dArr[this.e.get(iIntValue)] = b(iIntValue, str.substring(i2, iIntValue2));
                    i2 = iIntValue2;
                }
            }
            if (size > 0 && dArr[0] != 0.0d && dArr[1] != 0.0d) {
                muuVar.e(i3);
                muuVar.b(dArr);
                arrayList.add(muuVar);
            } else {
                LogUtil.a("DetailGpsWorkoutUtil", "lat and lon is not suit.");
            }
            i3++;
        }
        LogUtil.a("DetailGpsWorkoutUtil", "gpsFileDataList.size()", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private double b(int i, String str) {
        try {
            if (i == 1) {
                return Long.parseLong(str, 16) * 1000;
            }
            if (i == 2) {
                double d2 = Long.parseLong(str, 16) / 1.6777216E7d;
                return new BigDecimal((d2 < 0.0d || d2 > 180.0d) ? 0.0d : d2 - 90.0d).setScale(7, 4).doubleValue();
            }
            if (i == 4) {
                double d3 = Long.parseLong(str, 16) / 1.6777216E7d;
                return new BigDecimal((d3 < 0.0d || d3 > 360.0d) ? 0.0d : d3 - 180.0d).setScale(7, 4).doubleValue();
            }
            if (i != 8) {
                LogUtil.a("DetailGpsWorkoutUtil", "no support bitmap.");
                return 0.0d;
            }
            double d4 = Long.parseLong(str, 16) / 256.0d;
            return new BigDecimal(d4 > 0.0d ? d4 - 1000.0d : 0.0d).setScale(3, 4).doubleValue();
        } catch (NumberFormatException unused) {
            LogUtil.e("DetailGpsWorkoutUtil", "parseFileAndSaveList NumberFormatException.");
            return 0.0d;
        }
    }
}
