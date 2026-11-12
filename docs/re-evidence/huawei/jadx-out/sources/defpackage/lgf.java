package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiDivideUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.HiCommonUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lgf {
    public static void c(int i, List<Integer> list, HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener, Context context) throws RemoteException {
        c(i, list, hiDataReadOption, iDataReadResultListener, context, null);
    }

    public static void c(int i, List<Integer> list, HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener, Context context, kth kthVar) throws RemoteException {
        List<HiHealthData> listD;
        List<HiHealthData> listD2;
        if (hiDataReadOption == null || list == null) {
            return;
        }
        kws kwsVarE = kws.e(context);
        long startTime = hiDataReadOption.getStartTime();
        long endTime = hiDataReadOption.getEndTime();
        int readType = hiDataReadOption.getReadType();
        if (i != 31001) {
            switch (i) {
                case 30001:
                case OnRegisterSkinAttrsListener.REGISTER_BY_SCAN /* 30003 */:
                    if (readType == 0) {
                        listD2 = kwsVarE.a(startTime, endTime, 30001, list);
                    } else {
                        listD2 = kwsVarE.d(startTime, endTime, 30001, list);
                    }
                    HiDivideUtil.e(i, a(listD2, context), iDataReadResultListener);
                    break;
                case 30002:
                    HiDivideUtil.d(i, e(list, hiDataReadOption, context, kwsVarE, readType, kthVar), iDataReadResultListener);
                    break;
                case 30004:
                    HiDivideUtil.d(i, c(list, hiDataReadOption, kwsVarE, readType), iDataReadResultListener);
                    break;
                default:
                    d(i, list, hiDataReadOption, iDataReadResultListener, context);
                    break;
            }
            return;
        }
        if (readType == 0) {
            listD = kwsVarE.a(startTime, endTime, 31001, list);
        } else {
            listD = kwsVarE.d(startTime, endTime, 31001, list);
        }
        HiDivideUtil.e(i, a(listD, context), iDataReadResultListener);
    }

    private static List<HiHealthData> e(List<Integer> list, HiDataReadOption hiDataReadOption, Context context, kws kwsVar, int i, kth kthVar) {
        List<HiHealthData> listE;
        if (kthVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (i == 0) {
            listE = kwsVar.d(list, hiDataReadOption, 30001, kthVar.g());
        } else {
            listE = kwsVar.e(list, hiDataReadOption, 30001, kthVar.g());
        }
        return a(listE, context);
    }

    private static List<HiHealthData> c(List<Integer> list, HiDataReadOption hiDataReadOption, kws kwsVar, int i) {
        if (i == 0) {
            return kwsVar.c(list, hiDataReadOption, 30001);
        }
        return kwsVar.g(list, hiDataReadOption, 30001);
    }

    private static void d(int i, List<Integer> list, HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener, Context context) throws RemoteException {
        List<HiHealthData> listB;
        LogUtil.d("HiH_HiHealthDataRd", "readHiHealthData() type == HiHealthDataType.SEQUENCE");
        kws kwsVarE = kws.e(context);
        int readType = hiDataReadOption.getReadType();
        if (i != 30021 && i != 30023 && i != 30025 && i != 30027) {
            switch (i) {
                case 30005:
                case 30006:
                case 30007:
                case 30008:
                    break;
                default:
                    switch (i) {
                        case 31002:
                        case 31003:
                        case 31004:
                        case 31005:
                        case 31006:
                        case 31007:
                            List<HiHealthData> listD = kwsVarE.d(list, hiDataReadOption, i);
                            List<HiHealthData> listA = a(listD, context);
                            lge.b(context, 61001, listD);
                            HiDivideUtil.d(i, listA, iDataReadResultListener);
                            break;
                        default:
                            e(i, list, hiDataReadOption, iDataReadResultListener, context);
                            break;
                    }
                    break;
            }
            return;
        }
        if (readType == 0) {
            listB = kwsVarE.a(list, hiDataReadOption, 30001);
        } else {
            listB = kwsVarE.b(list, hiDataReadOption, 30001);
        }
        List<HiHealthData> listA2 = a(listB, i);
        if (!njy.e(listA2)) {
            LogUtil.d("HiH_HiHealthDataRd", "readHiHealthData() SEQUENCE  ReadSequenceDatasByReadType, sequenceType is ", Integer.valueOf(i), ", size is ", Integer.valueOf(listA2.size()));
        }
        HiDivideUtil.d(i, a(listA2, context), iDataReadResultListener);
    }

    private static void e(int i, List<Integer> list, HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener, Context context) throws RemoteException {
        LogUtil.d("HiH_HiHealthDataRd", "readHiHealthData() type == HiHealthDataType.SEQUENCE");
        kws kwsVarE = kws.e(context);
        if (i == 30013) {
            List<HiHealthData> listD = lgh.d(kwsVarE.a(list, hiDataReadOption, 30001));
            LogUtil.d("HiH_HiHealthDataRd", "readHiHealthData() SEQUENCE  ReadSequenceDatas, sequenceType is ", Integer.valueOf(i), ", size is ", Integer.valueOf(listD.size()));
            c(list, hiDataReadOption, iDataReadResultListener, listD, context);
            return;
        }
        if (i == 30015 || i == 30017 || i == 30019) {
            List<HiHealthData> listD2 = lgh.d(lgh.d(kwsVarE.a(list, hiDataReadOption, 30001), i));
            LogUtil.d("HiH_HiHealthDataRd", "readHiHealthData() SEQUENCE  ReadSequenceDatas, sequenceType is ", Integer.valueOf(i), ", size is ", Integer.valueOf(listD2.size()));
            c(list, hiDataReadOption, iDataReadResultListener, listD2, context);
            return;
        }
        iDataReadResultListener.onResult(null, i, 1);
    }

    private static void c(List<Integer> list, HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener, List<HiHealthData> list2, Context context) throws RemoteException {
        if (HiCommonUtil.b(list2)) {
            LogUtil.j("HiH_HiHealthDataRd", "getSequenceDetailData() sequenceHealthDatas is null or empty");
            iDataReadResultListener.onResult(null, OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, 1);
            return;
        }
        hiDataReadOption.setStartTime(list2.get(0).getStartTime());
        hiDataReadOption.setEndTime(list2.get(0).getEndTime());
        hiDataReadOption.setReadType(0);
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        c(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN, list, hiDataReadOption, iDataReadResultListener, context);
    }

    public static List<HiHealthData> a(List<HiHealthData> list, int i) {
        ArrayList arrayList = new ArrayList(10);
        if (HiCommonUtil.b(list)) {
            LogUtil.j("HiH_HiHealthDataRd", "getSequenceDatasByReadType() sequenceMetaDatas is null or empty");
            return arrayList;
        }
        e(list, i, arrayList);
        return arrayList;
    }

    private static void e(List<HiHealthData> list, int i, List<HiHealthData> list2) {
        for (HiHealthData hiHealthData : list) {
            int sportType = ((HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class)).getSportType();
            if (i != 30021 && i != 30022) {
                switch (i) {
                    case 30005:
                    case 30009:
                        if (257 == sportType || 281 == sportType || 282 == sportType) {
                            list2.add(hiHealthData);
                        }
                        break;
                    case 30006:
                    case 30010:
                        if (258 == sportType || 264 == sportType || 280 == sportType) {
                            list2.add(hiHealthData);
                        }
                        break;
                    case 30007:
                    case 30011:
                        if (259 == sportType) {
                            list2.add(hiHealthData);
                        }
                        break;
                    case 30008:
                    case 30012:
                        if (c(sportType)) {
                            list2.add(hiHealthData);
                        }
                        break;
                    default:
                        e(list2, hiHealthData, i, sportType);
                        break;
                }
            } else if (sportType == 262 || sportType == 266) {
                list2.add(hiHealthData);
            }
        }
    }

    private static void e(List<HiHealthData> list, HiHealthData hiHealthData, int i, int i2) {
        switch (i) {
            case 30023:
            case 30024:
                if (i2 == 271) {
                    list.add(hiHealthData);
                }
                break;
            case 30025:
            case 30026:
                if (i2 == 217 || i2 == 218 || i2 == 219) {
                    list.add(hiHealthData);
                }
                break;
            case 30027:
            case 30028:
                if (i2 == 220) {
                    list.add(hiHealthData);
                }
                break;
            default:
                list.add(hiHealthData);
                break;
        }
    }

    private static boolean c(int i) {
        return !Arrays.asList(257, Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER), 282, 258, 264, 259, Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE), 262, Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM), Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_BASKETBALL)).contains(Integer.valueOf(i));
    }

    public static List<HiHealthData> a(List<HiHealthData> list, Context context) {
        ArrayList arrayList = new ArrayList(10);
        if (list != null) {
            for (HiHealthData hiHealthData : list) {
                int clientId = hiHealthData.getClientId();
                kyh kyhVarD = kyh.d(context);
                hiHealthData.putInt("trackdata_deviceType", kyhVarD.b(clientId));
                HiDeviceInfo hiDeviceInfoD = kyhVarD.d(clientId);
                String strB = kyhVarD.b(hiDeviceInfoD);
                String strE = kyhVarD.e(hiDeviceInfoD);
                String strA = kyhVarD.a(hiDeviceInfoD);
                String strC = kyhVarD.c(hiDeviceInfoD);
                String strD = kyhVarD.d(hiDeviceInfoD);
                hiHealthData.putString("device_model", strE);
                hiHealthData.putString("device_name", strB);
                hiHealthData.putString("device_uniquecode", strA);
                hiHealthData.putString("device_prodid", strC);
                hiHealthData.putString("device_subprodid", strD);
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }
}
