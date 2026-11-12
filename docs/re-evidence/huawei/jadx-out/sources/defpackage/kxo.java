package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.data.constant.HiHealthDataKey;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.db.table.DBPointCommon;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kxo {
    private DBPointCommon e;

    /* synthetic */ kxo(AnonymousClass5 anonymousClass5) {
        this();
    }

    private kxo() {
        this.e = kvd.e();
    }

    protected kxo(DBPointCommon dBPointCommon) {
        this.e = dBPointCommon;
    }

    static class b {
        private static final kxo e = new kxo((AnonymousClass5) null);
    }

    public static kxo a() {
        return b.e;
    }

    public List<HiHealthData> c(List<Integer> list, HiDataReadOption hiDataReadOption) {
        String[] strArr = new String[(list.size() * 2) + hiDataReadOption.getType().length + 4];
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(20001);
        strArr[3] = Integer.toString(21000);
        return kwf.g(this.e.rawQuery(kwb.a(hiDataReadOption, list, strArr, 4, false), strArr), hiDataReadOption.getConstantsKey());
    }

    public List<HiHealthData> d(List<Integer> list, HiDataReadOption hiDataReadOption) {
        String[] strArr = new String[(list.size() * 2) + hiDataReadOption.getType().length + 6];
        strArr[0] = Long.toString(hiDataReadOption.getStartTime());
        strArr[1] = Long.toString(hiDataReadOption.getEndTime());
        strArr[2] = Integer.toString(20001);
        strArr[3] = Integer.toString(21000);
        strArr[4] = Integer.toString(0);
        strArr[5] = Integer.toString(0);
        return kwf.g(this.e.rawQuery(kwb.a(hiDataReadOption, list, strArr, 6, true), strArr), hiDataReadOption.getConstantsKey());
    }

    public List<HiHealthData> c(int i, HiDataReadOption hiDataReadOption, int i2) {
        String[] strArr = new String[hiDataReadOption.getType().length + 3];
        strArr[0] = Integer.toString(0);
        strArr[1] = Integer.toString(i);
        strArr[2] = Integer.toString(i);
        return kwf.i(this.e.rawQuery(kwb.a(hiDataReadOption.getType(), hiDataReadOption.getConstantsKey(), i2, strArr, 3), strArr), hiDataReadOption.getConstantsKey());
    }

    public List<HiHealthData> c(int i, HiDataReadOption hiDataReadOption) {
        String[] strArr = new String[hiDataReadOption.getType().length + 5];
        strArr[0] = Integer.toString(0);
        strArr[1] = Integer.toString(i);
        strArr[2] = Integer.toString(i);
        strArr[3] = Long.toString(hiDataReadOption.getStartTime());
        strArr[4] = Long.toString(hiDataReadOption.getEndTime());
        return kwf.i(this.e.rawQuery(kwb.e(hiDataReadOption.getType(), hiDataReadOption.getConstantsKey(), strArr, 5), strArr), hiDataReadOption.getConstantsKey());
    }

    public List<HiHealthData> a(List<Integer> list, HiDataReadOption hiDataReadOption, int i) {
        String[] strArr = new String[hiDataReadOption.getType().length + 1 + list.size()];
        strArr[0] = Integer.toString(0);
        return kwf.h(this.e.rawQuery(kwb.b(list, hiDataReadOption.getType(), hiDataReadOption.getConstantsKey(), i, strArr, 1), strArr), hiDataReadOption.getConstantsKey());
    }

    public List<HiHealthData> b(List<Integer> list, HiAggregateOption hiAggregateOption) {
        String[] strArr;
        String strD;
        int size = list.size();
        int alignType = hiAggregateOption.getAlignType();
        if (alignType == 20001) {
            strArr = new String[(size * 2) + 6];
            strArr[0] = Long.toString(hiAggregateOption.getStartTime());
            strArr[1] = Long.toString(hiAggregateOption.getEndTime());
            strArr[2] = Integer.toString(20001);
            strArr[3] = Integer.toString(21000);
            strArr[4] = Integer.toString(0);
            strArr[5] = Integer.toString(0);
            strD = kwb.d(list, strArr, 6, hiAggregateOption, true);
        } else {
            strArr = new String[(size * 2) + 5];
            strArr[0] = Long.toString(hiAggregateOption.getStartTime());
            strArr[1] = Long.toString(hiAggregateOption.getEndTime());
            strArr[2] = Integer.toString(alignType);
            strArr[3] = Integer.toString(0);
            strArr[4] = Integer.toString(0);
            strD = kwb.d(list, strArr, 5, hiAggregateOption, true);
        }
        return kwf.c(this.e.rawQuery(strD, strArr), hiAggregateOption.getConstantsKey());
    }

    public List<HiHealthData> a(List<Integer> list, HiAggregateOption hiAggregateOption) {
        String[] strArr;
        String strB;
        int size = list.size();
        int alignType = hiAggregateOption.getAlignType();
        if (alignType == 20001) {
            strArr = new String[(size * 2) + 6];
            strArr[0] = Long.toString(hiAggregateOption.getStartTime());
            strArr[1] = Long.toString(hiAggregateOption.getEndTime());
            strArr[2] = Integer.toString(20001);
            strArr[3] = Integer.toString(21000);
            strArr[4] = Integer.toString(0);
            strArr[5] = Integer.toString(0);
            strB = kwh.b(list, strArr, 6, hiAggregateOption, true);
        } else {
            strArr = new String[(size * 2) + 5];
            strArr[0] = Long.toString(hiAggregateOption.getStartTime());
            strArr[1] = Long.toString(hiAggregateOption.getEndTime());
            strArr[2] = Integer.toString(alignType);
            strArr[3] = Integer.toString(0);
            strArr[4] = Integer.toString(0);
            strB = kwh.b(list, strArr, 5, hiAggregateOption, true);
        }
        LogUtil.d("Debug_RawQueryManager", "querySportAggregateDataByAlignType() aggregateSQL = ", strB, ",selectAgs = ", HiJsonUtil.d(strArr));
        return kwf.c(this.e.rawQuery(strB, strArr), hiAggregateOption.getConstantsKey());
    }

    public List<HiHealthData> d(List<Integer> list, HiAggregateOption hiAggregateOption) {
        String[] strArr;
        String strD;
        int size = list.size();
        int alignType = hiAggregateOption.getAlignType();
        if (alignType == 20001) {
            strArr = new String[(size * 2) + 4];
            strArr[0] = Long.toString(hiAggregateOption.getStartTime());
            strArr[1] = Long.toString(hiAggregateOption.getEndTime());
            strArr[2] = Integer.toString(20001);
            strArr[3] = Integer.toString(21000);
            strD = kwb.d(list, strArr, 4, hiAggregateOption, false);
        } else {
            strArr = new String[(size * 2) + 3];
            strArr[0] = Long.toString(hiAggregateOption.getStartTime());
            strArr[1] = Long.toString(hiAggregateOption.getEndTime());
            strArr[2] = Integer.toString(alignType);
            strD = kwb.d(list, strArr, 3, hiAggregateOption, false);
        }
        return kwf.c(this.e.rawQuery(strD, strArr), hiAggregateOption.getConstantsKey());
    }

    public List<HiHealthData> d(List<Integer> list, HiAggregateOption hiAggregateOption, kth kthVar) {
        String strB;
        List<HiHealthData> listA;
        int[] iArrE;
        String[] strArrD;
        String str;
        String[] strArr;
        int i;
        String strA;
        int i2;
        int size = list.size();
        int[] type = hiAggregateOption.getType();
        int i3 = type[0];
        HiHealthDataType.Category categoryD = HiHealthDataType.d(i3);
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        int i4 = AnonymousClass5.f39591a[categoryD.ordinal()];
        if (i4 == 1) {
            if (i3 <= 21000) {
                return b(list, hiAggregateOption, true);
            }
            if (i3 <= 22099) {
                return c(list, hiAggregateOption, true);
            }
            return a(list, hiAggregateOption, true);
        }
        if (i4 == 2) {
            String[] strArr2 = new String[size + type.length + 3 + (hiAggregateOption.getModifiedEndTime() > 0 ? 2 : 0)];
            strArr2[0] = Long.toString(hiAggregateOption.getStartTime());
            strArr2[1] = Long.toString(hiAggregateOption.getEndTime());
            strArr2[2] = Integer.toString(0);
            int iB = b(strArr2, 3, hiAggregateOption);
            if (i3 < 2000) {
                strB = kwb.c(list, strArr2, iB, hiAggregateOption, true);
                listA = kwf.b(this.e.rawQuery(c(strB, kthVar), strArr2), constantsKey);
            } else if (HiHealthDataType.t(i3)) {
                strB = kwb.a(list, strArr2, iB, hiAggregateOption, true);
                listA = kwf.a(this.e.rawQuery(c(strB, kthVar), strArr2), constantsKey);
            } else {
                strB = kwb.b(list, strArr2, iB, hiAggregateOption, true, kthVar);
                listA = kwf.a(this.e.rawQuery(strB, strArr2), constantsKey);
            }
            LogUtil.d("Debug_RawQueryManager", "queryMergeAggregateDataNoAlignType-point: sql= " + strB, " ,param=" + HiJsonUtil.d(strB));
            return listA;
        }
        if (i4 == 3) {
            String[] strArr3 = new String[size + 4];
            strArr3[0] = Long.toString(hiAggregateOption.getStartTime());
            strArr3[1] = Long.toString(hiAggregateOption.getEndTime());
            strArr3[2] = Long.toString(type[0]);
            strArr3[3] = Integer.toString(0);
            String strE = kwb.e(list, strArr3, 4, hiAggregateOption, true);
            LogUtil.d("Debug_RawQueryManager", "queryMergeAggregateDataNoAlignType-sequence: sql= " + strE, " ,param=" + HiJsonUtil.d(strE));
            return kwf.d(this.e.rawQuery(strE, strArr3), constantsKey);
        }
        List<HiHealthData> listJ = null;
        if (i4 != 4) {
            return null;
        }
        HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a((Context) null).a(i3);
        if (10006 == i3 || hiHealthDictTypeA != null) {
            if (hiHealthDictTypeA != null) {
                List<Integer> listF = HiHealthDictManager.a((Context) null).f(i3);
                List<String> listD = HiHealthDictManager.a((Context) null).d(i3);
                if (i3 == DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value()) {
                    listF.add(2018);
                    listD.add("rest_heart_rate");
                }
                iArrE = CommonUtil.c(listF);
                strArrD = (String[]) listD.toArray(new String[0]);
            } else {
                iArrE = HiHealthDataType.e(i3);
                strArrD = HiHealthDataKey.d(i3);
            }
            String[] strArr4 = strArrD;
            hiAggregateOption.setType(iArrE);
            hiAggregateOption.setConstantsKey(strArr4);
            int count = hiAggregateOption.getCount();
            String filter = hiAggregateOption.getFilter();
            if (count > 0 && filter == null) {
                hiAggregateOption.setCount(0);
            }
            if (filter == null || "".equals(filter)) {
                str = filter;
                strArr = new String[size + iArrE.length + 3 + (hiAggregateOption.getModifiedEndTime() > 0 ? 2 : 0)];
                strArr[0] = Long.toString(hiAggregateOption.getStartTime());
                strArr[1] = Long.toString(hiAggregateOption.getEndTime());
                int iB2 = b(strArr, 2, hiAggregateOption);
                strArr[iB2] = Integer.toString(0);
                i = count;
                strA = kwb.a(list, strArr, iB2 + 1, hiAggregateOption, true, (String) null, kthVar);
            } else {
                if ("NULL".equals(filter) || "-1".equals(filter)) {
                    str = filter;
                    strArr = new String[size + iArrE.length + 3 + (hiAggregateOption.getModifiedEndTime() > 0 ? 2 : 0)];
                    strArr[0] = Long.toString(hiAggregateOption.getStartTime());
                    strArr[1] = Long.toString(hiAggregateOption.getEndTime());
                    int iB3 = b(strArr, 2, hiAggregateOption);
                    strArr[iB3] = Integer.toString(0);
                    i2 = count;
                    strA = kwb.a(list, strArr, iB3 + 1, hiAggregateOption, true, str, kthVar);
                } else {
                    strArr = new String[size + iArrE.length + 4 + (hiAggregateOption.getModifiedEndTime() > 0 ? 2 : 0)];
                    strArr[0] = Long.toString(hiAggregateOption.getStartTime());
                    strArr[1] = Long.toString(hiAggregateOption.getEndTime());
                    int iB4 = b(strArr, 2, hiAggregateOption);
                    strArr[iB4] = Integer.toString(0);
                    strArr[iB4 + 1] = filter;
                    i2 = count;
                    str = filter;
                    strA = kwb.a(list, strArr, iB4 + 2, hiAggregateOption, true, str, kthVar);
                }
                i = i2;
            }
            LogUtil.d("Debug_RawQueryManager", "queryMergeAggregateDataNoAlignType-set: sql= " + strA, " ,param=" + HiJsonUtil.d(strA));
            listJ = kwf.j(this.e.rawQuery(strA, strArr), strArr4);
            d(i3, listJ);
            if (i3 == 10006 && str == null) {
                return d(listJ, i);
            }
        }
        if (i3 < 10010 || i3 > 10060) {
            return listJ;
        }
        List<HiHealthData> listH = h(list, hiAggregateOption);
        d(i3, listH);
        return listH;
    }

    /* JADX INFO: renamed from: kxo$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39591a;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            f39591a = iArr;
            try {
                iArr[HiHealthDataType.Category.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39591a[HiHealthDataType.Category.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39591a[HiHealthDataType.Category.SEQUENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39591a[HiHealthDataType.Category.SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static int b(String[] strArr, int i, HiAggregateOption hiAggregateOption) {
        if (hiAggregateOption.getModifiedEndTime() <= 0) {
            return i;
        }
        strArr[i] = Long.toString(hiAggregateOption.getModifiedStartTime());
        strArr[i + 1] = Long.toString(hiAggregateOption.getModifiedEndTime());
        return i + 2;
    }

    private List<HiHealthData> h(List<Integer> list, HiAggregateOption hiAggregateOption) {
        int[] iArrE;
        String[] strArrD;
        int iG = kwt.b().g(kwt.b().o(list.get(0).intValue()));
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(Integer.valueOf(iG));
        int[] type = hiAggregateOption.getType();
        hiAggregateOption.setType(type);
        if (HiHealthDataType.l(type[0])) {
            iArrE = HiHealthDataType.e(10010);
            strArrD = HiHealthDataKey.d(10010);
        } else {
            iArrE = HiHealthDataType.e(type[0]);
            strArrD = HiHealthDataKey.d(type[0]);
        }
        hiAggregateOption.setConstantsKey(strArrD);
        hiAggregateOption.setType(iArrE);
        hiAggregateOption.setFilter(String.valueOf(type[0]));
        String[] strArr = new String[arrayList.size() + iArrE.length + 3];
        strArr[0] = Long.toString(HiDateUtil.d(hiAggregateOption.getStartTime()));
        strArr[1] = Long.toString(HiDateUtil.d(hiAggregateOption.getEndTime()));
        strArr[2] = Integer.toString(2);
        return kwf.c(this.e.rawQuery(kwb.c(arrayList, strArr, 3, hiAggregateOption), strArr), strArrD, false);
    }

    public List<HiHealthData> g(List<Integer> list, HiAggregateOption hiAggregateOption) {
        int size = list.size();
        int[] type = hiAggregateOption.getType();
        int i = type[0];
        HiHealthDataType.Category categoryD = HiHealthDataType.d(i);
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        if (AnonymousClass5.f39591a[categoryD.ordinal()] != 2) {
            return null;
        }
        String[] strArr = new String[size + type.length + 3];
        strArr[0] = Long.toString(hiAggregateOption.getStartTime());
        strArr[1] = Long.toString(hiAggregateOption.getEndTime());
        strArr[2] = Integer.toString(0);
        if (i >= 2000) {
            return null;
        }
        String strC = kwj.c(list, strArr, 3, hiAggregateOption, true);
        Cursor cursorRawQuery = this.e.rawQuery(strC, strArr);
        LogUtil.d("Debug_RawQueryManager", "queryMergeSportPointAggregateDataNoAlignTypeByTimeZone() aggregateSQL = ", strC, ",selectAgs = ", HiJsonUtil.d(strArr));
        return kwf.b(cursorRawQuery, constantsKey);
    }

    private void d(int i, List<HiHealthData> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            it.next().setType(i);
        }
    }

    private List<HiHealthData> d(List<HiHealthData> list, int i) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("Debug_RawQueryManager", "datas is null");
            return list;
        }
        LogUtil.d("Debug_RawQueryManager", "filterMainUserIDData enter datas =", list);
        String strD = kxq.c().d(kwt.b().o(list.get(0).getClientId()));
        if (strD == null) {
            LogUtil.j("Debug_RawQueryManager", "huid is null");
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            String metaData = hiHealthData.getMetaData();
            if (metaData == null || metaData.length() == 0 || Constants.NULL.equalsIgnoreCase(metaData) || "0".equals(metaData) || metaData.equals(strD)) {
                arrayList.add(hiHealthData);
            }
        }
        if (i > 0) {
            if (arrayList.size() <= i) {
                i = arrayList.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add((HiHealthData) arrayList.get(i2));
            }
        } else {
            arrayList2.addAll(arrayList);
        }
        LogUtil.d("Debug_RawQueryManager", "filterMainUserIDData datas=", arrayList2);
        return arrayList2;
    }

    public List<HiHealthData> d(List<Integer> list, long j, long j2, int i, int i2, String[] strArr, int[] iArr, int i3) {
        String[] strArr2 = new String[list.size() + 5];
        strArr2[0] = Long.toString(j);
        strArr2[1] = Long.toString(j2);
        strArr2[2] = Integer.toString(i2);
        strArr2[3] = Integer.toString(0);
        strArr2[4] = Integer.toString(2);
        String strA = kwb.a(list, strArr2, 5, i, i2, strArr, iArr, i3);
        LogUtil.d("Debug_RawQueryManager", "queryMergeAggregateHealthPointDataNoAlignTypeEX() aggregateSQL = ", strA, ",selectAgs = ", HiJsonUtil.d(strArr2));
        return kwf.a(this.e.rawQuery(strA, strArr2), strArr);
    }

    public List<HiHealthData> a(List<Integer> list, long j, long j2, int i, int i2, String[] strArr, int[] iArr, int i3, double d) {
        String[] strArr2 = new String[list.size() + 5];
        strArr2[0] = Long.toString(j);
        strArr2[1] = Long.toString(j2);
        strArr2[2] = Integer.toString(i2);
        strArr2[3] = Integer.toString(0);
        strArr2[4] = Integer.toString(2);
        String strC = kwj.c(list, strArr2, 5, i, i2, strArr, iArr, i3, d);
        LogUtil.d("Debug_RawQueryManager", "queryMergeAggregateHealthPointDataNoAlignTypeEX() aggregateSQL = ", strC, ",selectAgs = ", HiJsonUtil.d(strArr2));
        return kwf.a(this.e.rawQuery(strC, strArr2), strArr);
    }

    private List<HiHealthData> b(List<Integer> list, HiAggregateOption hiAggregateOption, boolean z) {
        int i;
        String[] strArrC;
        String strC;
        List<HiHealthData> listB;
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        ArrayList arrayList = new ArrayList();
        int[] type = hiAggregateOption.getType();
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < type.length) {
            int i4 = type[i3];
            String str = constantsKey[i3];
            if (i4 != 20001) {
                if (z) {
                    if (hiAggregateOption.getAggregateType() == 6) {
                        strArrC = c(list, hiAggregateOption, i4);
                        strC = kwb.c(str, list, strArrC, 9, true);
                    } else {
                        strArrC = new String[size + 4];
                        strArrC[i2] = Long.toString(hiAggregateOption.getStartTime());
                        strArrC[1] = Long.toString(hiAggregateOption.getEndTime());
                        strArrC[2] = Integer.toString(i4);
                        strArrC[3] = Integer.toString(i2);
                        strC = kwb.c(list, strArrC, 4, hiAggregateOption, i4, str, true);
                    }
                } else if (hiAggregateOption.getAggregateType() == 6) {
                    String[] strArr = new String[list.size() + 7];
                    strArr[1] = Long.toString(hiAggregateOption.getStartTime());
                    strArr[2] = Long.toString(hiAggregateOption.getEndTime());
                    strArr[3] = Integer.toString(i4);
                    strArr[4] = Integer.toString(i4);
                    strArr[0] = Integer.toString(i4);
                    strArr[5] = Long.toString(hiAggregateOption.getStartTime());
                    strArr[6] = Long.toString(hiAggregateOption.getEndTime());
                    i = 0;
                    strArrC = strArr;
                    strC = kwb.c(str, list, strArr, 7, false);
                } else {
                    String[] strArr2 = new String[size + 3];
                    strArr2[0] = Long.toString(hiAggregateOption.getStartTime());
                    strArr2[1] = Long.toString(hiAggregateOption.getEndTime());
                    strArr2[2] = Integer.toString(i4);
                    strC = kwb.c(list, strArr2, 3, hiAggregateOption, i4, str, false);
                    strArrC = strArr2;
                }
                i = 0;
            } else {
                int i5 = i2;
                if (z) {
                    String[] strArr3 = new String[size + 5];
                    strArr3[i5] = Long.toString(hiAggregateOption.getStartTime());
                    strArr3[1] = Long.toString(hiAggregateOption.getEndTime());
                    strArr3[2] = Integer.toString(20001);
                    strArr3[3] = Integer.toString(21000);
                    strArr3[4] = Integer.toString(i5);
                    strArrC = strArr3;
                    strC = kwb.c(list, strArrC, 5, hiAggregateOption, i4, str, true);
                    i = 0;
                } else {
                    String[] strArr4 = new String[size + 4];
                    i = 0;
                    strArr4[0] = Long.toString(hiAggregateOption.getStartTime());
                    strArr4[1] = Long.toString(hiAggregateOption.getEndTime());
                    strArr4[2] = Integer.toString(20001);
                    strArr4[3] = Integer.toString(21000);
                    strArrC = strArr4;
                    strC = kwb.c(list, strArrC, 4, hiAggregateOption, i4, str, false);
                }
            }
            Cursor cursorRawQuery = this.e.rawQuery(strC, strArrC);
            if (hiAggregateOption.getAggregateType() == 6) {
                listB = kwf.b(cursorRawQuery, str);
            } else {
                listB = kwf.d(cursorRawQuery, str);
            }
            if (listB != null && !listB.isEmpty()) {
                arrayList.addAll(listB);
            }
            i3++;
            i2 = i;
        }
        return arrayList;
    }

    private List<HiHealthData> c(List<Integer> list, HiAggregateOption hiAggregateOption, boolean z) {
        int i;
        String[] strArrC;
        String strD;
        List<HiHealthData> listB;
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        ArrayList arrayList = new ArrayList();
        int[] type = hiAggregateOption.getType();
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < type.length) {
            int i4 = type[i3];
            String str = constantsKey[i3];
            if (i4 != 22000) {
                if (z) {
                    if (hiAggregateOption.getAggregateType() == 6) {
                        strArrC = c(list, hiAggregateOption, i4);
                        strD = kwb.e(str, list, strArrC, 9, true);
                    } else {
                        strArrC = new String[size + 4];
                        strArrC[i2] = Long.toString(hiAggregateOption.getStartTime());
                        strArrC[1] = Long.toString(hiAggregateOption.getEndTime());
                        strArrC[2] = Integer.toString(i4);
                        strArrC[3] = Integer.toString(i2);
                        strD = kwb.d(list, strArrC, 4, hiAggregateOption, i4, str, true);
                    }
                } else if (hiAggregateOption.getAggregateType() == 6) {
                    String[] strArr = new String[list.size() + 7];
                    strArr[1] = Long.toString(hiAggregateOption.getStartTime());
                    strArr[2] = Long.toString(hiAggregateOption.getEndTime());
                    strArr[3] = Integer.toString(i4);
                    strArr[4] = Integer.toString(i4);
                    strArr[0] = Integer.toString(i4);
                    strArr[5] = Long.toString(hiAggregateOption.getStartTime());
                    strArr[6] = Long.toString(hiAggregateOption.getEndTime());
                    i = 0;
                    strArrC = strArr;
                    strD = kwb.e(str, list, strArr, 7, false);
                } else {
                    String[] strArr2 = new String[size + 3];
                    strArr2[0] = Long.toString(hiAggregateOption.getStartTime());
                    strArr2[1] = Long.toString(hiAggregateOption.getEndTime());
                    strArr2[2] = Integer.toString(i4);
                    strD = kwb.d(list, strArr2, 3, hiAggregateOption, i4, str, false);
                    strArrC = strArr2;
                }
                i = 0;
            } else {
                int i5 = i2;
                if (z) {
                    String[] strArr3 = new String[size + 5];
                    strArr3[i5] = Long.toString(hiAggregateOption.getStartTime());
                    strArr3[1] = Long.toString(hiAggregateOption.getEndTime());
                    strArr3[2] = Integer.toString(22000);
                    strArr3[3] = Integer.toString(22099);
                    strArr3[4] = Integer.toString(i5);
                    strArrC = strArr3;
                    strD = kwb.d(list, strArrC, 5, hiAggregateOption, i4, str, true);
                    i = 0;
                } else {
                    String[] strArr4 = new String[size + 4];
                    i = 0;
                    strArr4[0] = Long.toString(hiAggregateOption.getStartTime());
                    strArr4[1] = Long.toString(hiAggregateOption.getEndTime());
                    if (TextUtils.equals(hiAggregateOption.getFilter(), "GET_SESSION_SLEEP_DATA")) {
                        strArr4[2] = Integer.toString(22001);
                        strArr4[3] = Integer.toString(22002);
                    } else {
                        strArr4[2] = Integer.toString(22000);
                        strArr4[3] = Integer.toString(22099);
                    }
                    strArrC = strArr4;
                    strD = kwb.d(list, strArrC, 4, hiAggregateOption, i4, str, false);
                }
            }
            Cursor cursorRawQuery = this.e.rawQuery(strD, strArrC);
            if (hiAggregateOption.getAggregateType() == 6) {
                listB = kwf.b(cursorRawQuery, str);
            } else {
                listB = kwf.a(cursorRawQuery, str);
            }
            if (listB != null && !listB.isEmpty()) {
                arrayList.addAll(listB);
            }
            i3++;
            i2 = i;
        }
        return arrayList;
    }

    private String[] c(List<Integer> list, HiAggregateOption hiAggregateOption, int i) {
        String[] strArr = new String[list.size() + 9];
        strArr[0] = Integer.toString(i);
        strArr[1] = Long.toString(hiAggregateOption.getStartTime());
        strArr[2] = Long.toString(hiAggregateOption.getEndTime());
        strArr[3] = Integer.toString(0);
        strArr[4] = Integer.toString(i);
        strArr[5] = Integer.toString(i);
        strArr[6] = Long.toString(hiAggregateOption.getStartTime());
        strArr[7] = Long.toString(hiAggregateOption.getEndTime());
        strArr[8] = Integer.toString(0);
        return strArr;
    }

    private List<HiHealthData> a(List<Integer> list, HiAggregateOption hiAggregateOption, boolean z) {
        int i;
        int i2;
        String strB;
        String[] strArrC;
        List<HiHealthData> listB;
        String[] strArr;
        String strB2;
        ArrayList arrayList = new ArrayList();
        int[] type = hiAggregateOption.getType();
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < type.length) {
            int i5 = type[i4];
            String str = constantsKey[i4];
            if (i5 != 22100) {
                if (z) {
                    if (hiAggregateOption.getAggregateType() == 6) {
                        i = 6;
                        strArrC = c(list, hiAggregateOption, i5);
                        strB = kwb.b(str, list, strArrC, 9, true);
                    } else {
                        String[] strArr2 = new String[size + 4];
                        strArr2[i3] = Long.toString(hiAggregateOption.getStartTime());
                        strArr2[1] = Long.toString(hiAggregateOption.getEndTime());
                        strArr2[2] = Integer.toString(i5);
                        strArr2[3] = Integer.toString(i3);
                        strArr = strArr2;
                        i = 6;
                        strB2 = kwb.b(list, strArr2, 4, hiAggregateOption, i5, str, true);
                    }
                    i2 = 0;
                } else {
                    i = 6;
                    if (hiAggregateOption.getAggregateType() == 6) {
                        String[] strArr3 = new String[list.size() + 7];
                        strArr3[0] = Integer.toString(i5);
                        strArr3[1] = Long.toString(hiAggregateOption.getStartTime());
                        strArr3[2] = Long.toString(hiAggregateOption.getEndTime());
                        strArr3[3] = Integer.toString(i5);
                        strArr3[4] = Integer.toString(i5);
                        strArr3[5] = Long.toString(hiAggregateOption.getStartTime());
                        strArr3[6] = Long.toString(hiAggregateOption.getEndTime());
                        strB = kwb.b(str, list, strArr3, 7, false);
                        strArrC = strArr3;
                        i2 = 0;
                    } else {
                        String[] strArr4 = new String[size + 3];
                        strArr4[0] = Long.toString(hiAggregateOption.getStartTime());
                        strArr4[1] = Long.toString(hiAggregateOption.getEndTime());
                        strArr4[2] = Integer.toString(i5);
                        strArr = strArr4;
                        strB2 = kwb.b(list, strArr4, 3, hiAggregateOption, i5, str, false);
                    }
                }
                strB = strB2;
                strArrC = strArr;
                i2 = 0;
            } else {
                int i6 = i3;
                i = 6;
                if (z) {
                    String[] strArr5 = new String[size + 5];
                    strArr5[i6] = Long.toString(hiAggregateOption.getStartTime());
                    strArr5[1] = Long.toString(hiAggregateOption.getEndTime());
                    strArr5[2] = Integer.toString(22100);
                    strArr5[3] = Integer.toString(22199);
                    strArr5[4] = Integer.toString(i6);
                    strB = kwb.b(list, strArr5, 5, hiAggregateOption, i5, str, true);
                    strArrC = strArr5;
                    i2 = 0;
                } else {
                    int i7 = TextUtils.equals(hiAggregateOption.getFilter(), "GET_SESSION_SLEEP_DATA") ? 8 : 4;
                    String[] strArr6 = new String[size + i7];
                    i2 = 0;
                    strArr6[0] = Long.toString(hiAggregateOption.getStartTime());
                    strArr6[1] = Long.toString(hiAggregateOption.getEndTime());
                    if (TextUtils.equals(hiAggregateOption.getFilter(), "GET_SESSION_SLEEP_DATA")) {
                        strArr6[2] = Integer.toString(22105);
                        strArr6[3] = Integer.toString(22103);
                        strArr6[4] = Integer.toString(22102);
                        strArr6[5] = Integer.toString(22101);
                        strArr6[6] = Integer.toString(22106);
                        strArr6[7] = Integer.toString(22107);
                    } else {
                        strArr6[2] = Integer.toString(22100);
                        strArr6[3] = Integer.toString(22199);
                    }
                    strB = kwb.b(list, strArr6, i7, hiAggregateOption, i5, str, false);
                    strArrC = strArr6;
                }
            }
            Cursor cursorRawQuery = this.e.rawQuery(strB, strArrC);
            LogUtil.d("Debug_RawQueryManager", " queryAggregateCoreSessionData");
            if (hiAggregateOption.getAggregateType() == i) {
                listB = kwf.b(cursorRawQuery, str);
            } else {
                listB = kwf.a(cursorRawQuery, str);
            }
            if (listB != null && !listB.isEmpty()) {
                LogUtil.d("Debug_RawQueryManager", "add data");
                arrayList.addAll(listB);
            }
            i4++;
            i3 = i2;
        }
        return arrayList;
    }

    public List<HiHealthData> e(List<Integer> list, HiAggregateOption hiAggregateOption, kth kthVar) {
        String strB;
        List<HiHealthData> listE;
        int[] iArrE;
        String[] strArrD;
        String str;
        String[] strArr;
        String strA;
        int size = list.size();
        int[] type = hiAggregateOption.getType();
        int i = type[0];
        int i2 = AnonymousClass5.f39591a[HiHealthDataType.d(i).ordinal()];
        if (i2 == 1) {
            if (i <= 21000) {
                return b(list, hiAggregateOption, false);
            }
            if (i <= 22099) {
                return c(list, hiAggregateOption, false);
            }
            return a(list, hiAggregateOption, false);
        }
        if (i2 == 2) {
            String[] strArr2 = new String[size + type.length + 3];
            strArr2[0] = Long.toString(hiAggregateOption.getStartTime());
            strArr2[1] = Long.toString(hiAggregateOption.getEndTime());
            strArr2[2] = Integer.toString(2);
            if (i < 2000) {
                strB = kwb.c(list, strArr2, 3, hiAggregateOption, false);
                listE = kwf.c(this.e.rawQuery(c(strB, kthVar), strArr2), hiAggregateOption.getConstantsKey());
            } else if (i < 2019 || (2022 <= i && 2033 >= i)) {
                strB = kwb.b(list, strArr2, 3, hiAggregateOption, false, (kth) null);
                listE = kwf.e(this.e.rawQuery(c(strB, kthVar), strArr2), hiAggregateOption.getConstantsKey());
            } else if (HiHealthDataType.t(i)) {
                strB = kwb.a(list, strArr2, 3, hiAggregateOption, false);
                listE = kwf.e(this.e.rawQuery(c(strB, kthVar), strArr2), hiAggregateOption.getConstantsKey());
            } else {
                strB = kwb.b(list, strArr2, 3, hiAggregateOption, false, (kth) null);
                listE = kwf.a(this.e.rawQuery(c(strB, kthVar), strArr2), hiAggregateOption.getConstantsKey());
            }
            LogUtil.d("Debug_RawQueryManager", "aggregateSQL=", strB, "-selectAgs-", HiJsonUtil.d(strArr2));
            LogUtil.d("Debug_RawQueryManager", "aggregateSqlBuilder= " + c(strB, kthVar));
            return listE;
        }
        if (i2 == 3) {
            String[] strArr3 = new String[size + 3];
            strArr3[0] = Long.toString(hiAggregateOption.getStartTime());
            strArr3[1] = Long.toString(hiAggregateOption.getEndTime());
            strArr3[2] = Long.toString(type[0]);
            return kwf.d(this.e.rawQuery(kwb.e(list, strArr3, 3, hiAggregateOption, false), strArr3), hiAggregateOption.getConstantsKey());
        }
        List<HiHealthData> listJ = null;
        if (i2 != 4) {
            return null;
        }
        HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a((Context) null).a(i);
        if (10006 == i || hiHealthDictTypeA != null) {
            if (hiHealthDictTypeA != null) {
                List<Integer> listF = HiHealthDictManager.a((Context) null).f(i);
                List<String> listD = HiHealthDictManager.a((Context) null).d(i);
                if (i == DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value()) {
                    listF.add(2018);
                    listD.add("rest_heart_rate");
                }
                iArrE = CommonUtil.c(listF);
                strArrD = (String[]) listD.toArray(new String[0]);
            } else {
                iArrE = HiHealthDataType.e(i);
                strArrD = HiHealthDataKey.d(i);
            }
            String[] strArr4 = strArrD;
            hiAggregateOption.setType(iArrE);
            hiAggregateOption.setConstantsKey(strArr4);
            int count = hiAggregateOption.getCount();
            String filter = hiAggregateOption.getFilter();
            if (count > 0 && filter == null) {
                hiAggregateOption.setCount(0);
            }
            if (filter == null || "".equals(filter)) {
                str = filter;
                strArr = new String[size + iArrE.length + 2];
                strArr[0] = Long.toString(hiAggregateOption.getStartTime());
                strArr[1] = Long.toString(hiAggregateOption.getEndTime());
                strA = kwb.a(list, strArr, 2, hiAggregateOption, false, (String) null, kthVar);
            } else if ("NULL".equals(filter)) {
                strArr = new String[size + iArrE.length + 2];
                strArr[0] = Long.toString(hiAggregateOption.getStartTime());
                strArr[1] = Long.toString(hiAggregateOption.getEndTime());
                str = filter;
                strA = kwb.a(list, strArr, 2, hiAggregateOption, false, str, kthVar);
            } else {
                str = filter;
                String[] strArr5 = new String[size + iArrE.length + 3];
                strArr5[0] = Long.toString(hiAggregateOption.getStartTime());
                strArr5[1] = Long.toString(hiAggregateOption.getEndTime());
                strArr5[2] = str;
                strArr = strArr5;
                strA = kwb.a(list, strArr5, 3, hiAggregateOption, false, str, kthVar);
            }
            LogUtil.d("Debug_RawQueryManager", "aggregateSQL=", strA, "-selectAgs-", HiJsonUtil.d(strArr));
            listJ = kwf.j(this.e.rawQuery(strA, strArr), strArr4);
            d(i, listJ);
            if (i == 10006 && str == null) {
                return d(listJ, count);
            }
        }
        if (i < 10010 || i > 10060) {
            return listJ;
        }
        List<HiHealthData> listH = h(list, hiAggregateOption);
        d(i, listH);
        return listH;
    }

    public List<HiHealthData> c(List<Integer> list, HiAggregateOption hiAggregateOption) {
        int size = list.size();
        int[] type = hiAggregateOption.getType();
        int i = type[0];
        if (AnonymousClass5.f39591a[HiHealthDataType.d(i).ordinal()] != 2) {
            return null;
        }
        String[] strArr = new String[size + type.length + 2];
        strArr[0] = Long.toString(hiAggregateOption.getStartTime());
        strArr[1] = Long.toString(hiAggregateOption.getEndTime());
        if (i >= 2000) {
            return null;
        }
        String strC = kwj.c(list, strArr, 2, hiAggregateOption, false);
        List<HiHealthData> listC = kwf.c(this.e.rawQuery(strC, strArr), hiAggregateOption.getConstantsKey());
        LogUtil.d("Debug_RawQueryManager", "queryAggregateDataNoAlignTypeByTimeZone() aggregateSQL = ", strC, ",selectAgs = ", HiJsonUtil.d(strArr));
        return listC;
    }

    public List<HiHealthData> b(int i, HiAggregateOption hiAggregateOption, kth kthVar) {
        String[] strArr = new String[hiAggregateOption.getType().length + 4];
        boolean z = false;
        strArr[0] = Integer.toString(HiDateUtil.d(hiAggregateOption.getStartTime()));
        strArr[1] = Integer.toString(HiDateUtil.d(hiAggregateOption.getEndTime()));
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(2);
        String strD = kwb.d(hiAggregateOption, strArr, 4, kthVar);
        LogUtil.d("Debug_RawQueryManager", "queryAggregateStatData aggregateSQL= ", strD);
        Cursor cursorRawQuery = this.e.rawQuery(strD, strArr);
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        if (kthVar != null && kthVar.f()) {
            z = true;
        }
        return kwf.c(cursorRawQuery, constantsKey, z);
    }

    public List<HiHealthData> d(int i, HiSportStatDataAggregateOption hiSportStatDataAggregateOption) {
        int length = hiSportStatDataAggregateOption.getType().length;
        int[] hiHealthTypes = hiSportStatDataAggregateOption.getHiHealthTypes();
        int i2 = 0;
        String[] strArr = new String[length + 3 + ((hiHealthTypes == null || hiHealthTypes.length <= 0) ? 0 : hiHealthTypes.length)];
        strArr[0] = Integer.toString(HiDateUtil.d(hiSportStatDataAggregateOption.getStartTime()));
        strArr[1] = Integer.toString(HiDateUtil.d(hiSportStatDataAggregateOption.getEndTime()));
        strArr[2] = Integer.toString(i);
        String strC = kwb.c(hiSportStatDataAggregateOption, strArr, 3);
        LogUtil.d("Debug_RawQueryManager", "aggregateSql is ", strC, "selectArgs is ", HiJsonUtil.d(strArr));
        Cursor cursorRawQuery = this.e.rawQuery(strC, strArr);
        try {
            i2 = Integer.parseInt(hiSportStatDataAggregateOption.getFilter());
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("HiH_RawQueryManager", "queryAggregateSportStatData NumberFormatException");
        }
        return kwf.e(i2, cursorRawQuery, hiSportStatDataAggregateOption.getConstantsKey());
    }

    public List<HiHealthData> d(int i, List<Integer> list, HiAggregateOption hiAggregateOption, boolean z) {
        int[] type = hiAggregateOption.getType();
        String[] strArr = new String[type.length + 1 + list.size()];
        strArr[0] = Integer.toString(i);
        String[] constantsKey = hiAggregateOption.getConstantsKey();
        String strA = kwb.a(hiAggregateOption.getCount(), type, constantsKey, list, strArr, hiAggregateOption.getSortOrder(), 1);
        Cursor cursorRawQuery = this.e.rawQuery(strA, strArr);
        LogUtil.d("Debug_RawQueryManager", "queryStatDataByDays sql=", strA, ", selectAgs=", HiJsonUtil.d(strArr));
        return kwf.d(cursorRawQuery, constantsKey, z);
    }

    public List<HiHealthData> e(List<Integer> list, HiAggregateOption hiAggregateOption) {
        String[] strArr = new String[list.size() + hiAggregateOption.getType().length + 3];
        strArr[0] = Long.toString(hiAggregateOption.getStartTime());
        strArr[1] = Long.toString(hiAggregateOption.getEndTime());
        strArr[2] = Integer.toString(0);
        return kwf.b(this.e.rawQuery(kwb.b(list, strArr, 3, hiAggregateOption, false), strArr), hiAggregateOption.getConstantsKey());
    }

    public List<Integer> e(long j, long j2, int i, List<Integer> list) {
        String[] strArr = new String[list.size() + 3];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(i);
        StringBuffer stringBuffer = new StringBuffer((list.size() * 2) + 128);
        stringBuffer.append("select distinct(client_id) from sample_point where start_time >=? and start_time <=? and type_id =? ");
        kwb.e("client_id", list, stringBuffer, strArr, 3);
        return kwf.i(this.e.rawQuery(stringBuffer.toString(), strArr), "client_id");
    }

    public List<Integer> d(long j, long j2, int i, List<Integer> list) {
        String[] strArr = new String[list.size() + 4];
        strArr[0] = Long.toString(j);
        strArr[1] = Long.toString(j2);
        strArr[2] = Integer.toString(i);
        strArr[3] = Integer.toString(2);
        StringBuffer stringBuffer = new StringBuffer((list.size() * 2) + 64);
        stringBuffer.append("select distinct(client_id) from sample_point_health_stress where start_time >=? and start_time <=? and type_id =? and sync_status !=? ");
        kwb.e("client_id", list, stringBuffer, strArr, 4);
        return kwf.i(this.e.rawQuery(stringBuffer.toString(), strArr), "client_id");
    }

    public boolean d(int i, int i2, int i3, String str) {
        return kwf.m(this.e.rawQuery(kwb.a() + " and hihealth_permission.permission =? ", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3), str}));
    }

    private String c(String str, kth kthVar) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("Debug_RawQueryManager", "transToWhereSql aggregateSQL null");
            return "";
        }
        if (kthVar == null || TextUtils.isEmpty(kthVar.b())) {
            return str;
        }
        try {
            HiDataFilter hiDataFilter = (HiDataFilter) HiJsonUtil.d(kthVar.b(), HiDataFilter.class);
            StringBuilder sb = new StringBuilder(16);
            sb.append("select * from (");
            sb.append(str);
            sb.append(") where ");
            sb.append(kwb.d(hiDataFilter));
            return sb.toString();
        } catch (JsonSyntaxException unused) {
            throw new JsonSyntaxException("not HiDataFilter param");
        }
    }
}
