package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mpw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Integer> f42158c = new LinkedHashMap(16);
    private static final Map<Integer, Integer> e = new HashMap(16);

    public static int d(ees eesVar) {
        if (eesVar == null) {
            LogUtil.j("BasicUnTlvSample", "unTlvGetSampleFrameCount is null");
            return 0;
        }
        List<ees> listB = eesVar.b();
        int iV = 0;
        for (int i = 0; i < listB.size(); i++) {
            List<eew> listE = listB.get(i).e();
            for (int i2 = 0; i2 < listE.size(); i2++) {
                String strB = listE.get(i2).b();
                if (CommonUtil.v(listE.get(i2).e()) != 2) {
                    LogUtil.j("BasicUnTlvSample", "unTlvGetSampleFrameCount default");
                } else {
                    iV = CommonUtil.v(strB);
                }
            }
        }
        return iV;
    }

    private static List<mqf> a(String str) {
        ArrayList arrayList = new ArrayList(16);
        if (str.length() == 0 || str.length() < 2) {
            LogUtil.j("BasicUnTlvSample", "value.length is 0 or value.length() < position + SINGLE_BYTE_STRING_LEN");
            return arrayList;
        }
        try {
            int iD = d(str);
            byte[] bArrC = eeq.c(str.substring(0, iD));
            String strSubstring = str.substring(iD);
            if (TextUtils.isEmpty(strSubstring)) {
                return arrayList;
            }
            Map<Integer, Integer> mapC = c();
            if (!c(bArrC, mapC, strSubstring)) {
                LogUtil.j("BasicUnTlvSample", "watch or band send tlv is wrong, please check : ", str);
                return arrayList;
            }
            c(bArrC, strSubstring, mapC, arrayList);
            return arrayList;
        } catch (StringIndexOutOfBoundsException unused) {
            LogUtil.e("BasicUnTlvSample", "parseBaseParameter: StringIndexOutOfBoundsException");
            return arrayList;
        }
    }

    private static void c(byte[] bArr, String str, Map<Integer, Integer> map, List<mqf> list) {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if (CommonUtil.a(bArr, iIntValue)) {
                int iIntValue2 = (entry.getValue().intValue() * 2) + i;
                list.add(c(str.substring(i, iIntValue2), iIntValue));
                i = iIntValue2;
            }
        }
    }

    private static mqf c(String str, int i) {
        int iV = CommonUtil.v(str);
        Integer num = a().get(Integer.valueOf(i));
        if (num != null) {
            i = num.intValue();
        }
        return new mqf(i, iV);
    }

    private static int d(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        while (true) {
            i = i2 + 2;
            if (i > length || !CommonUtil.a(eeq.c(str.substring(i2, i)), 7)) {
                break;
            }
            i2 = i;
        }
        return i;
    }

    private static boolean c(byte[] bArr, Map<Integer, Integer> map, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int iIntValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (CommonUtil.a(bArr, entry.getKey().intValue())) {
                iIntValue += entry.getValue().intValue() * 2;
            }
        }
        return str.length() >= iIntValue;
    }

    private static Map<Integer, Integer> c() {
        Map<Integer, Integer> map = f42158c;
        if (map.isEmpty()) {
            map.put(0, 2);
            map.put(1, 2);
            map.put(2, 2);
            map.put(3, 2);
            map.put(4, 2);
            map.put(5, 1);
            map.put(6, 1);
            map.put(8, 1);
            map.put(9, 1);
            map.put(10, 2);
            e();
        }
        return map;
    }

    private static void e() {
        if (CommonUtil.ap()) {
            int i = -1;
            for (Map.Entry<Integer, Integer> entry : f42158c.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                i = i % 8 == 6 ? i + 2 : i + 1;
                if (iIntValue != i) {
                    throw new RuntimeException("PARAMETER_INDEX_AND_LENGTH index must increase 1, if last index is (8 * n + 7),increase 2,you support index is " + iIntValue + ",you should put key is : " + i);
                }
                if (entry.getValue().intValue() <= 0) {
                    throw new RuntimeException("you put support index : " + iIntValue + " byteLength is <= 0, please check.");
                }
            }
        }
    }

    private static Map<Integer, Integer> a() {
        Map<Integer, Integer> map = e;
        if (map.isEmpty()) {
            map.put(0, 4);
            map.put(4, 5);
            map.put(5, 6);
            map.put(6, 7);
        }
        return map;
    }

    private static List<mqf> d(List<mqf> list, long j, int i, int i2, int i3) {
        long j2 = i * 60;
        for (mqf mqfVar : list) {
            mqfVar.c(j + j2);
            mqfVar.e(i2);
            mqfVar.d(i3);
        }
        return list;
    }

    public static mqh b(ees eesVar) {
        mqh mqhVar = new mqh();
        if (eesVar == null) {
            LogUtil.j("BasicUnTlvSample", "unTlvGetSampleFrame is null");
            return mqhVar;
        }
        ArrayList arrayList = new ArrayList(16);
        List<ees> listB = eesVar.b();
        int iV = 0;
        for (int i = 0; i < listB.size(); i++) {
            List<eew> listE = listB.get(i).e();
            for (int i2 = 0; i2 < listE.size(); i2++) {
                String strB = listE.get(i2).b();
                if (CommonUtil.v(listE.get(i2).e()) != 3) {
                    LogUtil.j("BasicUnTlvSample", "unTlvGetSampleFrame default");
                } else {
                    iV = CommonUtil.v(strB);
                    mqhVar.e(iV);
                }
            }
            b(arrayList, i, listB, iV);
        }
        mqhVar.c(arrayList);
        return mqhVar;
    }

    private static void b(List<mqf> list, int i, List<ees> list2, int i2) {
        if (i < 0 || i >= list2.size()) {
            LogUtil.j("BasicUnTlvSample", "dealSamplePointList out of index");
            return;
        }
        List<ees> listB = list2.get(i).b();
        for (int i3 = 0; i3 < listB.size(); i3++) {
            List<eew> listE = listB.get(i3).e();
            ArrayList arrayList = new ArrayList(16);
            int iV = 0;
            int iV2 = 0;
            int iV3 = 0;
            for (int i4 = 0; i4 < listE.size(); i4++) {
                String strB = listE.get(i4).b();
                int iV4 = CommonUtil.v(listE.get(i4).e());
                if (iV4 == 5) {
                    iV = CommonUtil.v(strB);
                } else if (iV4 == 6) {
                    arrayList.addAll(a(strB));
                } else if (iV4 == 8) {
                    iV2 = CommonUtil.v(strB);
                } else if (iV4 == 9) {
                    iV3 = CommonUtil.v(strB);
                } else {
                    arrayList.add(new mqf(iV4, CommonUtil.v(strB)));
                }
            }
            d(arrayList, i2, iV, iV2, iV3);
            list.addAll(arrayList);
        }
    }

    public static int a(ees eesVar) {
        int iV = 0;
        if (eesVar == null) {
            LogUtil.j("BasicUnTlvSample", "unTlvGetDesFrameCount is null");
            return 0;
        }
        for (eew eewVar : eesVar.e()) {
            if (CommonUtil.v(eewVar.e()) != 1) {
                LogUtil.j("BasicUnTlvSample", "unTlvGetDesFrameCount default");
            } else {
                iV = CommonUtil.v(eewVar.b());
            }
        }
        return iV;
    }

    public static mqi e(ees eesVar) {
        mqi mqiVar = new mqi();
        if (eesVar == null) {
            LogUtil.j("BasicUnTlvSample", "unTlvGetDesFrame is null");
            return mqiVar;
        }
        List<eew> listE = eesVar.e();
        List<ees> listB = eesVar.b();
        for (eew eewVar : listE) {
            if (CommonUtil.v(eewVar.e()) != 1) {
                LogUtil.j("BasicUnTlvSample", "unTlvGetDesFrame default");
            } else {
                mqiVar.e(CommonUtil.v(eewVar.b()));
            }
        }
        Iterator<ees> it = listB.iterator();
        while (it.hasNext()) {
            d(mqiVar, it.next());
            LogUtil.d("BasicUnTlvSample", "desFrame.getDatas().add(frame)", mqiVar.toString());
        }
        return mqiVar;
    }

    private static void d(mqi mqiVar, ees eesVar) {
        Iterator<ees> it = eesVar.b().iterator();
        while (it.hasNext()) {
            List<eew> listE = it.next().e();
            mqi.d dVar = new mqi.d();
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 4) {
                    dVar.a(CommonUtil.v(eewVar.b()));
                } else if (iV == 5) {
                    dVar.c(CommonUtil.v(eewVar.b()));
                } else if (iV == 6) {
                    dVar.e(CommonUtil.v(eewVar.b()));
                } else {
                    LogUtil.j("BasicUnTlvSample", "unTlvGetDesFrameCount default");
                }
            }
            mqiVar.d().add(dVar);
        }
    }
}
