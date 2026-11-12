package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.model.HiHealthDictStat;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.healthdatacloud.model.DeleteSampleSequenceRep;
import com.huawei.hwcloudmodel.model.unite.DataDeleteCondition;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lij {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Integer[] f40301b = {2015, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2106, 2104, 2108, 2107, 2103};

    public static void b(Context context, int i) throws lif {
        ReleaseLogUtil.d("HiH_HiDelCloudData", "delHealthData who is ", Integer.valueOf(i));
        List<Integer> listB = kwt.b().b(i);
        if (listB == null || listB.isEmpty()) {
            LogUtil.j("Debug_HiDelCloudData", "no clientIDs get , who is ", Integer.valueOf(i));
            return;
        }
        LogUtil.a("Debug_HiDelCloudData", "clientid list size =", Integer.valueOf(listB.size()));
        Iterator<Integer> it = liq.d().iterator();
        while (it.hasNext()) {
            e(context, i, it.next().intValue(), listB);
        }
        ReleaseLogUtil.d("HiH_HiDelCloudData", "delHealthData end ");
    }

    public static void c(Context context, int i) throws lif {
        List<Integer> listB = liq.b("type_id", 2);
        if (HiCommonUtil.b(listB)) {
            return;
        }
        Iterator<Integer> it = listB.iterator();
        while (it.hasNext()) {
            a(context, i, it.next().intValue());
        }
    }

    public static void a(Context context, int i) throws lif {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(kwt.b().g(i)));
        int i2 = 0;
        while (i2 < 2) {
            List<kuk> listE = e(context, arrayList);
            if (liq.c(context, listE)) {
                for (kuk kukVar : listE) {
                    ljq.d(context, kukVar.g()).a(kukVar.a());
                }
                ReleaseLogUtil.d("Debug_HiDelCloudData", "deleteHealthStatData OK !");
            } else {
                if (HiCommonUtil.b(listE)) {
                    return;
                }
                ReleaseLogUtil.e("Debug_HiDelCloudData", "deleteHealthStatData failed !");
                i2++;
            }
        }
    }

    public static void d(Context context, int i) throws lif {
        int iG = kwt.b().g(i);
        int i2 = 0;
        while (i2 < 2) {
            List<Integer> listA = kww.c(context).a(iG, HiHealthDataType.e());
            if (HiCommonUtil.b(listA)) {
                return;
            }
            ReleaseLogUtil.d("Debug_HiDelCloudData", "deleteSleepStat start !", HiJsonUtil.d(listA), ",statClient", Integer.valueOf(iG));
            for (Integer num : listA) {
                if (liq.a(context, num.intValue())) {
                    kww.c(context).b(44100, 44299, iG, 2, num.intValue());
                    kww.c(context).e(iG, num.intValue(), 44100, 44299, 1);
                    ReleaseLogUtil.d("Debug_HiDelCloudData", "deleteSleepStat OK !", listA);
                } else {
                    ReleaseLogUtil.d("Debug_HiDelCloudData", "deleteSleepStat failed !", listA);
                    i2++;
                }
            }
        }
    }

    public static void e(Context context, int i) throws lif {
        if (context == null) {
            return;
        }
        LogUtil.a("HiH_HiDelCloudData", "delHealthSensitiveData who is ", Integer.valueOf(i));
        List<Integer> listB = kwt.b().b(i);
        if (listB == null || listB.isEmpty()) {
            LogUtil.j("Debug_HiDelCloudData", "no clientIDs get , who is ", Integer.valueOf(i));
            return;
        }
        LogUtil.a("Debug_HiDelCloudData", "clientid list size =", Integer.valueOf(listB.size()));
        List<Integer> listE = kxc.c().e("type_id", 2);
        if (HiCommonUtil.b(listE)) {
            return;
        }
        for (Integer num : listE) {
            int iIntValue = num.intValue();
            if (Arrays.asList(f40301b).contains(num)) {
                e(context, i, iIntValue, listB);
            }
        }
        LogUtil.a("HiH_HiDelCloudData", "delHealthSensitiveData end ");
    }

    private static void e(Context context, int i, int i2, List<Integer> list) throws lif {
        ReleaseLogUtil.d("HiH_HiDelCloudData", "deleteDataByType start type = ", Integer.valueOf(i2));
        int i3 = 0;
        while (i3 < 2) {
            List<HiHealthData> listD = d(context, i, i2, list);
            if (HiCommonUtil.b(listD)) {
                ReleaseLogUtil.d("HiH_HiDelCloudData", "nothing need to del,type is ", Integer.valueOf(i2));
                return;
            }
            List<DataDeleteCondition> listD2 = liq.d(context, listD);
            if (njy.e(listD2)) {
                ReleaseLogUtil.e("HiH_HiDelCloudData", "no recordMap get ! type is ", Integer.valueOf(i2));
                return;
            }
            int size = listD.size();
            int size2 = listD2.size();
            int iCeil = (int) Math.ceil(((double) size2) / ((double) size));
            ReleaseLogUtil.d("HiH_HiDelCloudData", "deleteDataByType getDataDelCondition dataDeleteConditions size = ", Integer.valueOf(size2));
            for (int i4 = 0; i4 < iCeil; i4++) {
                int i5 = i4 * size;
                if (c(context, listD2.subList(i5, Math.min(i5 + size, size2)), listD)) {
                    ReleaseLogUtil.d("HiH_HiDelCloudData", "deleteDataByType OK ! type is ", Integer.valueOf(i2), ", idx = ", Integer.valueOf(i4));
                } else {
                    i3++;
                    ReleaseLogUtil.e("HiH_HiDelCloudData", "deleteDataByType failed ! type is ", Integer.valueOf(i2), ", idx = ", Integer.valueOf(i4));
                }
            }
        }
        ReleaseLogUtil.d("HiH_HiDelCloudData", "deleteDataByType end type = ", Integer.valueOf(i2));
    }

    private static List<HiHealthData> d(Context context, int i, int i2, List<Integer> list) {
        if (HiHealthDataType.h(i2)) {
            return ljq.a(context, i2).d(new int[]{i2}, 2, list, 100);
        }
        if (HiHealthDataType.t(i2)) {
            return kxd.e(context).d(i2, 2, list, 100);
        }
        if (HiHealthDataType.r(i2)) {
            return kxg.c(context).b(i2, 2, list, 100);
        }
        if (HiHealthDataType.j(i2)) {
            return kwu.c(context).e(i2, 2, list, 100);
        }
        if (i2 == 31001) {
            return kws.e(context).d(list, 31001, 2, 10);
        }
        return null;
    }

    private static boolean c(Context context, List<DataDeleteCondition> list, List<HiHealthData> list2) throws lif {
        if (!liq.a(context, list)) {
            return false;
        }
        int type = list2.get(0).getType();
        boolean z = true;
        if (HiHealthDataType.h(type)) {
            Iterator<HiHealthData> it = list2.iterator();
            while (it.hasNext()) {
                if (ljq.a(context, type).b(it.next().getDataId()) < 0) {
                    z = false;
                }
            }
            return z;
        }
        if (HiHealthDataType.t(type)) {
            Iterator<HiHealthData> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (kxd.e(context).d(it2.next().getDataId()) < 0) {
                    z = false;
                }
            }
            return z;
        }
        if (HiHealthDataType.r(type)) {
            Iterator<HiHealthData> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (kxg.c(context).a(it3.next().getDataId()) < 0) {
                    z = false;
                }
            }
            return z;
        }
        if (HiHealthDataType.j(type)) {
            Iterator<HiHealthData> it4 = list2.iterator();
            while (it4.hasNext()) {
                if (kwu.c(context).a(it4.next().getDataId()) < 0) {
                    z = false;
                }
            }
            return z;
        }
        if (type == 31001) {
            Iterator<HiHealthData> it5 = list2.iterator();
            while (it5.hasNext()) {
                if (kws.e(context).c(it5.next()) < 0) {
                    z = false;
                }
            }
            return z;
        }
        ReleaseLogUtil.e("HiH_HiDelCloudData", "deleteCloudAndLocalData failed ! type is ", Integer.valueOf(type));
        return false;
    }

    public static void a(Context context, int i, int i2) throws lif {
        if (context == null) {
            LogUtil.j("Debug_HiDelCloudData", "context is null");
            return;
        }
        LogUtil.a("HiH_HiDelCloudData", "delDictData start, who is ", Integer.valueOf(i), ",type ", Integer.valueOf(i2));
        int i3 = AnonymousClass5.d[HiHealthDataType.d(i2).ordinal()];
        if (i3 == 1) {
            List<Integer> listB = liq.b("type_id", 2);
            if (HiCommonUtil.b(listB)) {
                return;
            }
            if (listB.contains(Integer.valueOf(i2))) {
                c(context, i2, i);
            }
        } else if (i3 == 2) {
            e(context, i2, i);
        } else if (i3 == 3) {
            b(context, i2, i);
        }
        LogUtil.a("HiH_HiDelCloudData", "delDictData end ");
    }

    /* JADX INFO: renamed from: lij$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            d = iArr;
            try {
                iArr[HiHealthDataType.Category.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[HiHealthDataType.Category.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[HiHealthDataType.Category.STAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static void e(Context context, int i, int i2) throws lif {
        HiHealthDictType hiHealthDictTypeA;
        List<HiHealthData> listD;
        List<Integer> listB = kwt.b().b(i2);
        if (HiCommonUtil.b(listB)) {
            ReleaseLogUtil.e("Debug_HiDelCloudData", "no clientIds get , who is ", Integer.valueOf(i2));
            return;
        }
        LogUtil.a("Debug_HiDelCloudData", "clientIds list size = ", Integer.valueOf(listB.size()));
        int i3 = 0;
        while (i3 < 2 && (hiHealthDictTypeA = HiHealthDictManager.a(context).a(i)) != null) {
            if (hiHealthDictTypeA.i() == 0) {
                listD = kws.e(context).d(listB, new int[]{i}, new int[]{0}, 2, 10);
                if (HiCommonUtil.b(listD)) {
                    return;
                }
            } else {
                listD = kws.e(context).d(listB, new int[]{30001}, new int[]{hiHealthDictTypeA.i()}, 2, 10);
                if (HiCommonUtil.b(listD)) {
                    return;
                }
                for (HiHealthData hiHealthData : listD) {
                    if (hiHealthData != null) {
                        hiHealthData.setType(i);
                    }
                }
            }
            LogUtil.a("Debug_HiDelCloudData", "deleteDictSequenceData getDelHealthData delData size = ", Integer.valueOf(listD.size()));
            List<DataDeleteCondition> listD2 = liq.d(context, listD);
            if (njy.e(listD2)) {
                ReleaseLogUtil.e("Debug_HiDelCloudData", "no dataDeleteConditions get ! type is ", Integer.valueOf(i));
                return;
            }
            LogUtil.a("Debug_HiDelCloudData", "deleteDictSequenceData getDataDelCondition size = ", Integer.valueOf(listD2.size()));
            DeleteSampleSequenceRep deleteSampleSequenceRep = new DeleteSampleSequenceRep();
            deleteSampleSequenceRep.setDeleteSampleSequenceConditons(listD2);
            if (lih.e(lqo.b(context).b(deleteSampleSequenceRep), false)) {
                for (HiHealthData hiHealthData2 : listD) {
                    if (hiHealthData2 != null) {
                        ReleaseLogUtil.d("Debug_HiDelCloudData", "delTrackDone sequenceID is ", Long.valueOf(hiHealthData2.getDataId()), "result is ", Integer.valueOf(kws.e(context).c(hiHealthData2)));
                    }
                }
                ReleaseLogUtil.d("Debug_HiDelCloudData", "deleteDictSequenceData OK ! type is ", Integer.valueOf(i));
            } else {
                ReleaseLogUtil.e("Debug_HiDelCloudData", "deleteDictSequenceData failed ! type is ", Integer.valueOf(i));
                i3++;
            }
        }
    }

    private static void c(Context context, int i, int i2) throws lif {
        List<Integer> listB = kwt.b().b(i2);
        if (HiCommonUtil.b(listB)) {
            ReleaseLogUtil.e("Debug_HiDelCloudData", "no clientIds get , who is ", Integer.valueOf(i2));
            return;
        }
        LogUtil.a("Debug_HiDelCloudData", "clientIds list size = ", Integer.valueOf(listB.size()));
        int i3 = 0;
        while (i3 < 2) {
            List<HiHealthData> listE = e(context, i, listB);
            if (HiCommonUtil.b(listE)) {
                return;
            }
            LogUtil.a("Debug_HiDelCloudData", "delDictData getDelHealthData delData size = ", Integer.valueOf(listE.size()));
            List<DataDeleteCondition> listD = liq.d(context, listE);
            if (njy.e(listD)) {
                ReleaseLogUtil.e("Debug_HiDelCloudData", "no dataDeleteConditions get ! type is ", Integer.valueOf(i));
                return;
            }
            LogUtil.a("Debug_HiDelCloudData", "delDictData getDataDelCondition dataDeleteConditions size = ", Integer.valueOf(listD.size()));
            if (liq.a(context, listD)) {
                for (HiHealthData hiHealthData : listE) {
                    ljq.a(context, hiHealthData.getType()).b(hiHealthData.getDataId());
                }
                ReleaseLogUtil.d("Debug_HiDelCloudData", "delDictData deleteDictPointData OK ! type is ", Integer.valueOf(i));
            } else {
                ReleaseLogUtil.e("Debug_HiDelCloudData", "delDictData deleteDictPointData failed ! type is ", Integer.valueOf(i));
                i3++;
            }
        }
    }

    private static void b(Context context, int i, int i2) throws lif {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(kwt.b().g(i2)));
        int i3 = 0;
        while (i3 < 2) {
            List<kuk> listA = a(context, i, arrayList);
            if (HiCommonUtil.b(listA)) {
                LogUtil.a("Debug_HiDelCloudData", "deleteDictStatData nothing need to del,type is ");
                return;
            }
            if (liq.c(context, listA)) {
                for (kuk kukVar : listA) {
                    ljq.d(context, kukVar.g()).e(kukVar);
                }
                ReleaseLogUtil.d("Debug_HiDelCloudData", "deleteDictStatData OK ! type is ", Integer.valueOf(i));
            } else {
                ReleaseLogUtil.e("Debug_HiDelCloudData", "deleteDictStatData failed ! type is ", Integer.valueOf(i));
                i3++;
            }
        }
    }

    private static List<HiHealthData> e(Context context, int i, List<Integer> list) {
        ArrayList arrayList = new ArrayList(10);
        List<Integer> listF = HiHealthDictManager.a(context).f(i);
        if (listF.size() != 0) {
            int size = 100 / listF.size();
            Iterator<Integer> it = listF.iterator();
            while (it.hasNext()) {
                List<HiHealthData> listD = ljq.a(context, i).d(new int[]{it.next().intValue()}, 2, list, size);
                if (!HiCommonUtil.b(listD)) {
                    arrayList.addAll(listD);
                }
            }
        }
        return arrayList;
    }

    private static List<kuk> a(Context context, int i, List<Integer> list) {
        ArrayList arrayList = new ArrayList(10);
        List<HiHealthDictField> listH = HiHealthDictManager.a(context).h(i);
        if (HiCommonUtil.b(listH)) {
            ReleaseLogUtil.e("Debug_HiDelCloudData", "healthDictFields is null, health type is ", Integer.valueOf(i));
            return Collections.EMPTY_LIST;
        }
        Iterator<HiHealthDictField> it = listH.iterator();
        while (it.hasNext()) {
            Iterator<HiHealthDictStat> it2 = it.next().j().iterator();
            while (it2.hasNext()) {
                List<kuk> listD = ljq.d(context, i).d(it2.next().c(), 2, list, 100);
                if (!HiCommonUtil.b(listD)) {
                    arrayList.addAll(listD);
                }
            }
        }
        return arrayList;
    }

    private static List<kuk> e(Context context, List<Integer> list) {
        ArrayList arrayList = new ArrayList(10);
        List<kuk> listC = kww.c(context).c(2, list);
        List<kuk> listC2 = kwz.d().c(2, list);
        if (!HiCommonUtil.b(listC)) {
            arrayList.addAll(listC);
        }
        if (!HiCommonUtil.b(listC2)) {
            arrayList.addAll(listC2);
        }
        return arrayList;
    }
}
