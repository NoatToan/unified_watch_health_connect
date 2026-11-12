package defpackage;

import android.content.Context;
import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.model.LatLng;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwcloudmodel.model.unite.DataDeleteCondition;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public class liu {
    private static List<String> e = new ArrayList(10);

    static HiAggregateOption b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(HiDateUtil.p(jCurrentTimeMillis), HiDateUtil.g(jCurrentTimeMillis));
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setType(new int[]{2, 4});
        hiAggregateOption.setConstantsKey(new String[]{"step", "calorie"});
        return hiAggregateOption;
    }

    private static LatLng b(lip lipVar) {
        return new LatLng(lipVar.d, lipVar.f40308a);
    }

    static double[] c(Context context, double[] dArr) {
        if (context != null && dArr != null && dArr.length >= 2) {
            CoordinateConverter coordinateConverter = new CoordinateConverter(context);
            coordinateConverter.from(CoordinateConverter.CoordType.GPS);
            coordinateConverter.coord(b(new lip(dArr[0], dArr[1])));
            LatLng latLngConvert = coordinateConverter.convert();
            if (latLngConvert != null) {
                dArr[0] = latLngConvert.latitude;
                dArr[1] = latLngConvert.longitude;
            }
        }
        return dArr;
    }

    static List<DataDeleteCondition> b(Context context, List<HiHealthData> list) {
        int iD;
        if (list == null) {
            return new ArrayList();
        }
        e.clear();
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            int clientId = hiHealthData.getClientId();
            kym kymVarJ = kwt.b().j(clientId);
            if (kymVarJ == null) {
                LogUtil.j("HiH_HiSyncUtilHelper", "createDelMap,nothing need to del ,no healthContext,clientId is ", Integer.valueOf(clientId));
            } else {
                String str = "manual_client_key_" + kyf.a(String.valueOf(kymVarJ.b()), String.valueOf(kymVarJ.i()), String.valueOf(kymVarJ.d()));
                String strB = SharedPreferenceManager.b("HiHealthService", str, "");
                List<Long> arrayList2 = new ArrayList();
                if (!HiCommonUtil.a(strB)) {
                    ReleaseLogUtil.c("HiH_HiSyncUtilHelper", "manualClientKey=", str, ",cloudDeviceCodeStr=", strB);
                    arrayList2 = (List) Arrays.stream(strB.split(",")).map(new Function() { // from class: liw
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(Long.parseLong((String) obj));
                        }
                    }).collect(Collectors.toList());
                }
                if (!arrayList2.contains(Long.valueOf(kymVarJ.e()))) {
                    arrayList2.add(Long.valueOf(kymVarJ.e()));
                }
                for (Long l : arrayList2) {
                    if (l.longValue() <= 0) {
                        LogUtil.j("HiH_HiSyncUtilHelper", "createDelMap,nothing need to del ,no deviceCode,clientId is ", Integer.valueOf(clientId));
                    } else {
                        int type = hiHealthData.getType();
                        if (lik.g(type)) {
                            iD = lik.d(type);
                            if (iD <= 0) {
                                LogUtil.j("HiH_HiSyncUtilHelper", "createDelMap , error type no such type can delete ,type is ", Integer.valueOf(type));
                            } else {
                                e(arrayList, hiHealthData, l.longValue(), iD);
                            }
                        } else {
                            HiHealthDictType hiHealthDictTypeD = d(context, type);
                            if (hiHealthDictTypeD == null) {
                                e(arrayList, hiHealthData, l.longValue(), 0);
                            } else {
                                iD = hiHealthDictTypeD.l();
                                if (hiHealthDictTypeD.i() != 0) {
                                    iD = 30001;
                                }
                                String str2 = iD + "_" + hiHealthData.getStartTime() + "_" + hiHealthData.getEndTime() + "_" + l;
                                if (!e.contains(str2)) {
                                    e.add(str2);
                                    e(arrayList, hiHealthData, l.longValue(), iD);
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static void e(List<DataDeleteCondition> list, HiHealthData hiHealthData, long j, int i) {
        DataDeleteCondition dataDeleteCondition = new DataDeleteCondition();
        dataDeleteCondition.setDeviceCode(Long.valueOf(j));
        dataDeleteCondition.setStartTime(Long.valueOf(hiHealthData.getStartTime()));
        dataDeleteCondition.setEndTime(Long.valueOf(hiHealthData.getEndTime()));
        if (i == 0) {
            dataDeleteCondition.setType(null);
        } else {
            dataDeleteCondition.setType(Integer.valueOf(i));
        }
        if (hiHealthData.getType() == 2002) {
            dataDeleteCondition.setKey("DATA_POINT_DYNAMIC_HEARTRATE");
        }
        if (hiHealthData.getType() == 2018) {
            dataDeleteCondition.setKey("DATA_POINT_REST_HEARTRATE");
        }
        if (hiHealthData.getType() == 2105) {
            dataDeleteCondition.setKey("DATA_POINT_NEW_REST_HEARTRATE");
        }
        LogUtil.d("HiH_HiSyncUtilHelper", "addConditon conditon = ", dataDeleteCondition);
        list.add(dataDeleteCondition);
    }

    /* JADX INFO: renamed from: liu$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f40316c;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            f40316c = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40316c[HiHealthDataType.Category.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static HiHealthDictType d(Context context, int i) {
        int i2 = AnonymousClass3.f40316c[HiHealthDataType.d(i).ordinal()];
        if (i2 == 1) {
            return HiHealthDictManager.a(context).i(i);
        }
        if (i2 == 2) {
            return HiHealthDictManager.a(context).a(i);
        }
        LogUtil.j("HiH_HiSyncUtilHelper", "unknow category, type is ", Integer.valueOf(i));
        return null;
    }
}
