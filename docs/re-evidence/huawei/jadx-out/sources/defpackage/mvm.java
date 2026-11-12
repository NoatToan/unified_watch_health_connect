package defpackage;

import com.huawei.health.devicemgr.api.phoneprocess.SamplePointAfterProcess;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionaryActionInterface;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mvm implements DictionaryActionInterface {
    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionaryActionInterface
    public void readHiHealthData(int i, DeviceInfo deviceInfo, HiDataReadResultListener hiDataReadResultListener) {
        HiDataReadOption hiDataReadOptionD = d(new int[]{i}, deviceInfo, 0L, System.currentTimeMillis(), 1);
        LogUtil.a("DictionaryActionImpl", "readHiHealthData ", hiDataReadOptionD);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOptionD, hiDataReadResultListener);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionaryActionInterface
    public void insertToHiHealth(mva mvaVar, HiDataOperateListener hiDataOperateListener) {
        ArrayList arrayList = new ArrayList(16);
        b(arrayList, mvaVar);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, hiDataOperateListener);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionaryActionInterface
    public mvi genCacheDicInfo(int i, long j, long j2) {
        mvi mviVar = new mvi();
        mviVar.b(i);
        mviVar.d(j);
        mviVar.a(j2);
        mviVar.e(1);
        mviVar.a(3);
        return mviVar;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionaryActionInterface
    public mva parsePointData(ees eesVar) {
        mva mvaVar = new mva();
        e(mvaVar, eesVar);
        a(mvaVar, eesVar);
        LogUtil.a("DictionaryActionImpl", "parsePointData dictionaryInfo:", mvaVar);
        return mvaVar;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionaryActionInterface
    public boolean syncNextInfo(mva mvaVar, mvi mviVar) {
        int size;
        mvb mvbVar;
        if (mvaVar != null && mviVar != null) {
            if (mvaVar.a() != mviVar.a()) {
                LogUtil.j("DictionaryActionImpl", "syncNextInfo dictionaryInfo:", Integer.valueOf(mvaVar.a()), ",cache id:", Integer.valueOf(mviVar.a()));
                return false;
            }
            if (mvaVar.c() == null || (size = mvaVar.c().size()) <= 0 || (mvbVar = mvaVar.c().get(size - 1)) == null) {
                return false;
            }
            long jC = mvbVar.c();
            long jD = mvbVar.d();
            if (jD != 0) {
                jC = jD;
            }
            long jC2 = mviVar.c();
            LogUtil.a("DictionaryActionImpl", "endTime:", Long.valueOf(jC), ",request endTime:", Long.valueOf(jC2));
            if (jC >= jC2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy.DictionaryActionInterface
    public xiu buildSendMessage(mvi mviVar) {
        if (mviVar == null) {
            return null;
        }
        int iB = mviVar.b();
        int iA = mviVar.a();
        long jD = mviVar.d();
        long jC = mviVar.c();
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(HiAnalyticsConstant.KeyAndValue.NUMBER_01);
        String strD = eeq.d(iB);
        String strB = eeq.b(strD.length() / 2);
        stringBuffer.append(eeq.d(1));
        stringBuffer.append(strB);
        stringBuffer.append(strD);
        String strD2 = eeq.d(iA);
        String strB2 = eeq.b(strD2.length() / 2);
        stringBuffer.append(eeq.d(2));
        stringBuffer.append(strB2);
        stringBuffer.append(strD2);
        String strB3 = eeq.b(jD);
        String strB4 = eeq.b(strB3.length() / 2);
        stringBuffer.append(eeq.d(5));
        stringBuffer.append(strB4);
        stringBuffer.append(strB3);
        String strB5 = eeq.b(jC);
        String strB6 = eeq.b(strB5.length() / 2);
        stringBuffer.append(eeq.d(6));
        stringBuffer.append(strB6);
        stringBuffer.append(strB5);
        String strD3 = eeq.d(1);
        String strB7 = eeq.b(strD3.length() / 2);
        stringBuffer.append(eeq.d(13));
        stringBuffer.append(strB7);
        stringBuffer.append(strD3);
        xiu.c cVar = new xiu.c();
        cVar.a(eeq.c(stringBuffer.toString()));
        LogUtil.a("DictionaryActionImpl", "command:", stringBuffer.toString());
        return cVar.c();
    }

    private void e(mva mvaVar, ees eesVar) {
        List<eew> listE;
        if (eesVar == null || (listE = eesVar.e()) == null) {
            return;
        }
        for (eew eewVar : listE) {
            String strB = eewVar.b();
            int iV = CommonUtil.v(eewVar.e());
            LogUtil.a("DictionaryActionImpl", "TLV-getTag:", Integer.valueOf(iV), "TLV-getValue:", strB);
            if (iV == 2) {
                mvaVar.e(CommonUtil.v(strB));
                return;
            }
            LogUtil.a("DictionaryActionImpl", "TLV-getTag:", Integer.valueOf(iV));
        }
    }

    private void a(mva mvaVar, ees eesVar) {
        if (eesVar == null) {
            return;
        }
        List<ees> listB = eesVar.b();
        LogUtil.a("DictionaryActionImpl", "tlvs.size():", Integer.valueOf(listB.size()));
        ArrayList arrayList = new ArrayList(16);
        Iterator<ees> it = listB.iterator();
        while (it.hasNext()) {
            List<ees> listB2 = it.next().b();
            LogUtil.a("DictionaryActionImpl", "dataTlvs.size():", Integer.valueOf(listB2.size()));
            for (ees eesVar2 : listB2) {
                HashMap<Integer, String> map = new HashMap<>(0);
                HashMap<Integer, Double> map2 = new HashMap<>(0);
                mvb mvbVar = new mvb();
                c(mvbVar, eesVar2.e());
                d(eesVar2.b(), map2, map);
                mvbVar.a(map2);
                mvbVar.c(map);
                arrayList.add(mvbVar);
            }
        }
        mvaVar.d(arrayList);
    }

    private void c(mvb mvbVar, List<eew> list) {
        if (list == null) {
            return;
        }
        for (eew eewVar : list) {
            int iV = CommonUtil.v(eewVar.e());
            String strB = eewVar.b();
            LogUtil.a("DictionaryActionImpl", "infoDataTlv-Tag:", Integer.valueOf(iV), "infoDataTlv-Value:", strB);
            if (iV == 5) {
                mvbVar.d(CommonUtil.x(strB));
            } else if (iV == 6) {
                mvbVar.e(CommonUtil.x(strB));
            } else if (iV == 12) {
                mvbVar.a(CommonUtil.x(strB));
            } else {
                LogUtil.a("DictionaryActionImpl", "no recognize Tag:", Integer.valueOf(iV), "infoDataTlv-Value:", strB);
            }
        }
    }

    private void d(List<ees> list, HashMap<Integer, Double> map, HashMap<Integer, String> map2) {
        List<ees> listB;
        if (list == null) {
            return;
        }
        Iterator<ees> it = list.iterator();
        while (it.hasNext() && (listB = it.next().b()) != null) {
            a(listB, map, map2);
        }
    }

    private void a(List<ees> list, HashMap<Integer, Double> map, HashMap<Integer, String> map2) {
        List<eew> listE;
        Iterator<ees> it = list.iterator();
        while (it.hasNext() && (listE = it.next().e()) != null) {
            LogUtil.a("DictionaryActionImpl", "headList.size:", Integer.valueOf(listE.size()));
            b(listE, map, map2);
        }
    }

    private void b(List<eew> list, HashMap<Integer, Double> map, HashMap<Integer, String> map2) {
        int iV = -1;
        for (eew eewVar : list) {
            int iV2 = CommonUtil.v(eewVar.e());
            String strB = eewVar.b();
            LogUtil.a("DictionaryActionImpl", "metaDataTlvs-getTag:", Integer.valueOf(iV2), "metaDataTlvs-getValue:", strB, ",long value:", Long.valueOf(CommonUtil.x(strB)));
            if (iV2 == 9) {
                iV = CommonUtil.v(strB);
            } else if (iV2 == 10) {
                if (iV != -1) {
                    map.put(Integer.valueOf(iV), Double.valueOf(Double.longBitsToDouble(e(strB))));
                }
            } else if (iV2 != 11) {
                LogUtil.a("DictionaryActionImpl", "no recognize getTag:", Integer.valueOf(iV2), "metaDataTlvs-getValue:", strB);
            } else if (iV != -1) {
                map2.put(Integer.valueOf(iV), eeq.d(strB));
            }
        }
    }

    private long e(String str) {
        long unsignedLong;
        try {
            try {
                return Long.parseLong(str, 16);
            } catch (NumberFormatException unused) {
                LogUtil.e("DictionaryActionImpl", "hexStringToLong NumberFormatException");
                unsignedLong = -1;
                LogUtil.a("DictionaryActionImpl", "result:", Long.valueOf(unsignedLong));
                return unsignedLong;
            }
        } catch (NumberFormatException unused2) {
            unsignedLong = Long.parseUnsignedLong(str, 16);
            LogUtil.a("DictionaryActionImpl", "result:", Long.valueOf(unsignedLong));
            return unsignedLong;
        }
    }

    private HiDataReadOption d(int[] iArr, DeviceInfo deviceInfo, long j, long j2, int i) {
        String strE = mvs.e(deviceInfo);
        LogUtil.a("DictionaryActionImpl", "read getHiDataReadOption:", CommonUtil.n(strE));
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setDeviceUuid(strE);
        hiDataReadOption.setSortOrder(i);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setCount(1);
        hiDataReadOption.setReadType(2);
        return hiDataReadOption;
    }

    private HiHealthData a(int i, long j, long j2, long j3, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(i);
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setStartTime(j);
        if (j2 == 0) {
            hiHealthData.setEndTime(j);
        } else {
            hiHealthData.setEndTime(j2);
        }
        if ((i == DicDataTypeUtil.DataType.PHYSIOLOGICAL_CYCLE.value() || i == DicDataTypeUtil.DataType.EMOTION_SET.value()) && j3 > 0) {
            hiHealthData.setModifiedTime(j3);
        }
        return hiHealthData;
    }

    private void b(List<HiHealthData> list, mva mvaVar) {
        if (mvaVar == null) {
            LogUtil.j("DictionaryActionImpl", "In setDictionaryToList, dictionaryInfo is null");
            return;
        }
        String strE = mvs.e(mvaVar.e());
        LogUtil.a("DictionaryActionImpl", "setDictionaryToList:", CommonUtil.n(strE));
        if (mvaVar.c() == null) {
            LogUtil.j("DictionaryActionImpl", "setDictionaryToList, dictionaryInfo.getPointStruct() is null");
            return;
        }
        SamplePointAfterProcess samplePointAfterProcessE = ecz.e(mvaVar.a());
        for (mvb mvbVar : mvaVar.c()) {
            HiHealthData hiHealthDataA = a(mvaVar.a(), mvbVar.c(), mvbVar.d(), mvbVar.e(), strE);
            hiHealthDataA.setFieldsValue(HiJsonUtil.d(mvbVar.b()));
            hiHealthDataA.setFieldsMetaData(HiJsonUtil.d(mvbVar.a()));
            if (samplePointAfterProcessE != null) {
                LogUtil.a("DictionaryActionImpl", "setDictionaryToList SamplePointAfterProcess enter");
                hiHealthDataA = samplePointAfterProcessE.onSamplePointAfterProcess(hiHealthDataA, "");
            }
            LogUtil.a("DictionaryActionImpl", "setDictionaryToList healthData:", hiHealthDataA.getFieldsMetaData());
            list.add(hiHealthDataA);
        }
    }
}
