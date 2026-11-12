package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.gson.Gson;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.data.type.HiConfigDataType;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiDivideUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f40081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kwm f40082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kwu f40083c;
    private kwn d;
    private kwo e;
    private kxg f;
    private kwv g;
    private kxd h;
    private kwq i;
    private kwr j;
    private HiHealthDictManager m;

    private lge() {
        this.g = kwv.e(f40081a);
        this.i = kwq.e(f40081a);
        this.f = kxg.c(f40081a);
        this.f40083c = kwu.c(f40081a);
        this.h = kxd.e(f40081a);
        this.j = kwr.c();
        this.f40082b = kwm.d();
        this.d = kwn.e();
        this.e = kwo.b();
        this.m = HiHealthDictManager.a(f40081a);
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final lge f40084b = new lge();
    }

    public static lge b(Context context) {
        f40081a = context.getApplicationContext();
        return a.f40084b;
    }

    public List<HiHealthData> a(int i, List<Integer> list, HiDataReadOption hiDataReadOption) {
        if (list == null || hiDataReadOption == null) {
            return null;
        }
        LogUtil.d("HiH_HiHealthDataRd", "readSessionData()");
        int readType = hiDataReadOption.getReadType();
        if (i == 20001) {
            if (readType == 0) {
                return this.g.a(hiDataReadOption, list, i, 21000);
            }
            return this.g.c(hiDataReadOption, list, i, 21000);
        }
        if (i != 22000) {
            if (i != 22100) {
                return e(i, list, hiDataReadOption, readType);
            }
            if (readType == 0) {
                return this.f40083c.b(hiDataReadOption, list, 22100, 22199);
            }
            return this.f40083c.e(hiDataReadOption, list, 22100, 22199);
        }
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(22001);
        arrayList.add(22002);
        if (readType == 0) {
            return ljx.a(this.f.d(hiDataReadOption, list, arrayList));
        }
        return ljx.a(this.f.c(hiDataReadOption, list, arrayList));
    }

    public boolean c(int i, List<Integer> list, HiDataReadOption hiDataReadOption) {
        if (list == null || hiDataReadOption == null) {
            return false;
        }
        LogUtil.d("HiH_HiHealthDataRd", "readSleepAllData()");
        if (i != 22000) {
            if (i == 22100) {
                return this.f40083c.c(hiDataReadOption, list, 22100, 22199);
            }
            ReleaseLogUtil.d("HiH_HiHealthDataRd", "readSleepAllData other");
            return false;
        }
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(22001);
        arrayList.add(22002);
        arrayList.add(22003);
        return this.f.b(hiDataReadOption, list, arrayList);
    }

    private List<HiHealthData> e(int i, List<Integer> list, HiDataReadOption hiDataReadOption, int i2) {
        if (i <= 21000) {
            if (i2 == 0) {
                return this.g.c(hiDataReadOption, list, i);
            }
            return this.g.d(hiDataReadOption, list, i);
        }
        if (i <= 22099) {
            if (i2 == 0) {
                return this.f.d(hiDataReadOption, list, i);
            }
            return this.f.c(hiDataReadOption, list, i);
        }
        if (i2 == 0) {
            return this.f40083c.d(hiDataReadOption, list, i);
        }
        return this.f40083c.a(hiDataReadOption, list, i);
    }

    public List<HiHealthData> a(int i, int i2, HiDataReadOption hiDataReadOption, kth kthVar) {
        if (hiDataReadOption == null) {
            return null;
        }
        LogUtil.d("HiH_HiHealthDataRd", "readStatData()");
        if (i2 <= 0) {
            return null;
        }
        if (42007 == i) {
            return ljq.d(f40081a, i).e(i, i2);
        }
        return ljq.d(f40081a, i).d(hiDataReadOption, i, i2, kthVar);
    }

    public List<HiHealthData> a(int i, List<Integer> list, HiDataReadOption hiDataReadOption, kth kthVar) {
        if (list == null || hiDataReadOption == null) {
            return null;
        }
        LogUtil.d("HiH_HiHealthDataRd", "readPointData()");
        if (hiDataReadOption.getReadType() == 0) {
            if (i < 2000) {
                return this.i.b(hiDataReadOption, i, list, kthVar);
            }
            if (HiHealthDataType.f(i)) {
                return ljq.a(f40081a, i).b(hiDataReadOption, i, list, kthVar);
            }
            return this.h.c(hiDataReadOption, i, list, kthVar);
        }
        if (i < 2000) {
            return this.i.a(hiDataReadOption, i, list, kthVar);
        }
        if (HiHealthDataType.f(i)) {
            return ljq.a(f40081a, i).e(hiDataReadOption, i, list, kthVar);
        }
        return this.h.b(hiDataReadOption, i, list, kthVar);
    }

    public List<HiHealthData> b(int i, List<Integer> list, HiDataReadOption hiDataReadOption) {
        if (list == null || hiDataReadOption == null) {
            return null;
        }
        if (!HiConfigDataType.f(i)) {
            LogUtil.j("HiH_HiHealthDataRd", "readConfigData is not support, pointType=", Integer.valueOf(i));
            return null;
        }
        int iIntValue = HiConfigDataType.a(i).intValue();
        Integer num = HiConfigDataType.c(iIntValue, 1) instanceof Integer ? (Integer) HiConfigDataType.c(iIntValue, 1) : null;
        if (num == null) {
            LogUtil.j("HiH_HiHealthDataRd", "config type is not set tablename");
            return null;
        }
        String strD = lke.d(num.intValue());
        if (hiDataReadOption.getReadType() == 0) {
            return this.f40082b.a(strD, hiDataReadOption, i, list);
        }
        return this.f40082b.e(strD, hiDataReadOption, i, list);
    }

    public List<HiHealthData> b(int i, int i2, HiDataReadOption hiDataReadOption) {
        if (hiDataReadOption == null || i2 <= 0) {
            return null;
        }
        if (!HiConfigDataType.i(i)) {
            LogUtil.j("HiH_HiHealthDataRd", "readConfigStatData statType is not support, statType=", Integer.valueOf(i));
            return null;
        }
        int iIntValue = HiConfigDataType.c(i).intValue();
        Integer num = HiConfigDataType.c(iIntValue, 7) instanceof Integer ? (Integer) HiConfigDataType.c(iIntValue, 7) : null;
        if (num == null) {
            LogUtil.j("HiH_HiHealthDataRd", "statType not set table name");
            return null;
        }
        return this.d.a(lke.d(num.intValue()), hiDataReadOption, i, i2);
    }

    public void e(int i, List<Integer> list, HiDataReadOption hiDataReadOption, kth kthVar, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        if (list == null || hiDataReadOption == null || iDataReadResultListener == null) {
            return;
        }
        if (this.m.k(i)) {
            a(i, list, hiDataReadOption, kthVar, iDataReadResultListener);
        } else {
            lgf.c(i, list, hiDataReadOption, iDataReadResultListener, f40081a, kthVar);
        }
    }

    public List<HiHealthData> c(int i, List<Integer> list, HiDataReadOption hiDataReadOption, kth kthVar) {
        List<HiHealthData> listA;
        if (list == null || hiDataReadOption == null) {
            return null;
        }
        LogUtil.d("HiH_HiHealthDataRd", "readSetData()");
        int[] iArrE = HiHealthDataType.e(i);
        if (i == 10001 || i == 10006) {
            if (hiDataReadOption.getReadType() == 0) {
                listA = ljq.a(f40081a, i).b(hiDataReadOption, iArrE, list);
            } else {
                listA = ljq.a(f40081a, i).a(hiDataReadOption, iArrE, list);
            }
            return kthVar.o() ? a(listA) : listA;
        }
        ArrayList arrayList = new ArrayList(iArrE.length);
        for (int i2 : iArrE) {
            arrayList.add(Integer.valueOf(i2));
        }
        if (i == DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value()) {
            arrayList.add(2018);
        }
        ArrayList arrayList2 = new ArrayList(10);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.addAll(a(((Integer) it.next()).intValue(), list, hiDataReadOption, (kth) null));
        }
        return kthVar.o() ? a(arrayList2) : arrayList2;
    }

    private List<HiHealthData> a(List<HiHealthData> list) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                long startTime = hiHealthData.getStartTime();
                if (map.containsKey(Long.valueOf(startTime))) {
                    HiHealthData hiHealthData2 = (HiHealthData) map.get(Long.valueOf(startTime));
                    map2.put("point_value", Double.valueOf(hiHealthData.getValue()));
                    map2.put("metadata", hiHealthData.getMetaData());
                    hiHealthData2.putString(String.valueOf(hiHealthData.getType()), HiJsonUtil.d(map2));
                } else {
                    map2.put("point_value", Double.valueOf(hiHealthData.getValue()));
                    map2.put("metadata", hiHealthData.getMetaData());
                    hiHealthData.getValueHolder().remove("point_value");
                    hiHealthData.getValueHolder().remove("metadata");
                    hiHealthData.putString(String.valueOf(hiHealthData.getType()), HiJsonUtil.d(map2));
                    map.put(Long.valueOf(startTime), hiHealthData);
                }
            }
        }
        ArrayList arrayList = new ArrayList(10);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((HiHealthData) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    public List<HiHealthData> e(int i, List<Integer> list, String str) {
        if (list == null || str == null) {
            return null;
        }
        LogUtil.d("HiH_HiHealthDataRd", "readRealTimeData()");
        return this.j.a(i, list, str);
    }

    public List<HiHealthData> a(int i, HiDataReadOption hiDataReadOption) {
        boolean z;
        int i2;
        int i3;
        if (hiDataReadOption == null) {
            return null;
        }
        LogUtil.d("HiH_HiHealthDataRd", "checkAlreadyDownload()");
        ArrayList arrayList = new ArrayList(10);
        HiHealthData hiHealthData = new HiHealthData(SmartMsgConstant.MSG_TYPE_TRACK_RECOVER_TIME_RECOMMEND);
        kul kulVarD = kxk.c().d(i, 0L, 10015);
        if (kulVarD == null) {
            hiHealthData.setValue(0);
            arrayList.add(hiHealthData);
            return arrayList;
        }
        int iD = kulVarD.d();
        int iD2 = HiDateUtil.d(hiDataReadOption.getStartTime());
        if (iD <= HiDateUtil.d(hiDataReadOption.getEndTime()) && iD <= iD2) {
            hiHealthData.setValue(0);
            z = false;
            i2 = 0;
            i3 = 0;
        } else {
            hiHealthData.setValue(-1);
            i3 = iD;
            i2 = iD2;
            z = true;
        }
        arrayList.add(hiHealthData);
        if (z) {
            HiSyncOption hiSyncOption = new HiSyncOption();
            hiSyncOption.setSyncAction(0);
            hiSyncOption.setSyncDataType(10018);
            hiSyncOption.setSyncModel(2);
            hiSyncOption.setSyncMethod(2);
            hiSyncOption.setSyncScope(1);
            lgp.f().a(hiSyncOption, kwi.b().b(f40081a.getPackageName()), i2, i3, hiDataReadOption.getType()[0]);
        }
        return arrayList;
    }

    public List<HiHealthData> c(int i, int i2, HiDataReadOption hiDataReadOption) {
        if (hiDataReadOption == null) {
            return null;
        }
        int iE = kyn.d(f40081a).e(0, i2, 0);
        if (iE <= 0) {
            ReleaseLogUtil.e("HiH_HiHealthDataRd", "readBusinessData stat() statClient <= 0");
            return null;
        }
        LogUtil.d("HiH_HiHealthDataRd", "readBusinessData() statClient = ", Integer.valueOf(iE));
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(Integer.valueOf(iE));
        if (hiDataReadOption.getReadType() == 0) {
            return this.e.c(hiDataReadOption, i, arrayList);
        }
        return this.e.d(hiDataReadOption, i, arrayList);
    }

    private void a(int i, List<Integer> list, HiDataReadOption hiDataReadOption, kth kthVar, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        List<HiHealthData> listE;
        int iH = kthVar.h();
        if (iH == 0) {
            listE = kws.e(f40081a).e(list, hiDataReadOption, i);
        } else if (iH == 1) {
            listE = kws.e(f40081a).a(list, hiDataReadOption, i);
        } else {
            ReleaseLogUtil.e("HiH_HiHealthDataRd", "sequenceDataType is not right, ", Integer.valueOf(kthVar.h()));
            return;
        }
        List<HiHealthData> listA = lgf.a(listE, f40081a);
        if (HiHealthDataType.c().contains(Integer.valueOf(i))) {
            b(f40081a, lik.a(i), listA);
        }
        HiDivideUtil.d(i, listA, iDataReadResultListener);
        ReleaseLogUtil.d("HiH_HiHealthDataRd", "readDicSequenceData:sz=", Integer.valueOf(listA.size()));
    }

    public static void b(Context context, int i, List<HiHealthData> list) {
        ReleaseLogUtil.d("HiH_HiHealthDataRd", "addInterpretDatas start");
        if (HiCommonUtil.b(list)) {
            ReleaseLogUtil.d("HiH_HiHealthDataRd", "no source data");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            List<HiHealthData> listB = kwl.e().b(hiHealthData.getType(), hiHealthData.getDataId(), i);
            if (HiCommonUtil.b(listB)) {
                ReleaseLogUtil.e("HiH_HiHealthDataRd", "error, this source data has no relate datas");
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<HiHealthData> it = listB.iterator();
                while (it.hasNext()) {
                    List<HiHealthData> listC = kwo.b().c(it.next().getInt("business_id"));
                    if (HiCommonUtil.b(listC)) {
                        ReleaseLogUtil.e("HiH_HiHealthDataRd", "error, this source data in relation table but not in business table");
                    } else {
                        HiHealthData hiHealthData2 = listC.get(0);
                        lib libVar = new lib();
                        libVar.b((int) hiHealthData2.getValue());
                        libVar.a(hiHealthData2.getEndTime());
                        libVar.e(hiHealthData2.getDataSource());
                        libVar.c(hiHealthData2.getStartTime());
                        libVar.d(hiHealthData2.getMetaData());
                        arrayList.add(libVar);
                    }
                }
                hiHealthData.putString("interpret_data", new Gson().toJson(arrayList));
            }
        }
        ReleaseLogUtil.d("HiH_HiHealthDataRd", "addInterpretDatas end");
    }
}
