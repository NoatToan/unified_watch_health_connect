package com.huawei.hihealthservice.hihealthkit;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.C;
import com.amap.api.services.core.AMapException;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiHealthAggregateQuery;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiHealthDataQuery;
import com.huawei.hihealth.HiHealthDataQueryOption;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.HiHealthUserPermission;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.IAggregateListener;
import com.huawei.hihealth.IBaseCallback;
import com.huawei.hihealth.ICommonListener;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.TrendQuery;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.constant.HiHealthDataKey;
import com.huawei.hihealth.data.listener.HealthTrendListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.ICommonReport;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.util.HiDivideUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.hihealthkit.HiHealthKitQueryHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import defpackage.ktr;
import defpackage.kwi;
import defpackage.kxa;
import defpackage.kxj;
import defpackage.kxs;
import defpackage.kyd;
import defpackage.kzw;
import defpackage.lbh;
import defpackage.lck;
import defpackage.lcq;
import defpackage.lcs;
import defpackage.lct;
import defpackage.lek;
import defpackage.len;
import defpackage.leo;
import defpackage.ler;
import defpackage.let;
import defpackage.njy;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class HiHealthKitQueryHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, String> f12463c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kzw f12464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12465b;
    private Context d;
    private String e;

    static {
        HashMap map = new HashMap();
        f12463c = map;
        map.put(40002, "step");
        map.put(40003, "carior");
        map.put(40004, "distance");
    }

    HiHealthKitQueryHelper(Context context, String str) {
        this(context, str, null);
    }

    HiHealthKitQueryHelper(Context context, String str, String str2) {
        this.d = context.getApplicationContext();
        this.f12464a = kzw.c();
        this.f12465b = str;
        this.e = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(HiHealthData hiHealthData, HiHealthKitData hiHealthKitData) {
        Map map = hiHealthKitData.getMap();
        map.put(44209, Float.valueOf(hiHealthData.getFloat("stat_core_sleep_duration_sum") + hiHealthData.getFloat("stat_core_sleep_noon_duration")));
        hiHealthKitData.setMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(HiHealthData hiHealthData, HiHealthKitData hiHealthKitData) {
        hiHealthKitData.getMap().put(2028, Double.valueOf(leo.a(hiHealthData)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HiHealthKitData e(HiHealthData hiHealthData, InnerAggregateOption innerAggregateOption, lbh lbhVar) {
        f resolveOption = innerAggregateOption.getResolveOption();
        HiHealthKitData hiHealthKitData = new HiHealthKitData();
        b(hiHealthData, hiHealthKitData, lbhVar.b());
        hiHealthKitData.setTimeInterval(hiHealthData.getStartTime(), hiHealthData.getEndTime());
        hiHealthKitData.setMap(e(hiHealthData, resolveOption));
        hiHealthKitData.setType(resolveOption.e);
        hiHealthKitData.putString("metadata", hiHealthData.getMetaData());
        hiHealthKitData.putLong("update_time", hiHealthData.getModifiedTime());
        return hiHealthKitData;
    }

    private static HashMap e(HiHealthData hiHealthData, f fVar) {
        int[] iArr = fVar.f12497c;
        String[] strArr = fVar.f12496b;
        int[] iArr2 = fVar.d;
        HashMap map = new HashMap(16);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr2[i2];
            if (i3 == 0) {
                map.put(Integer.valueOf(iArr[i2]), Integer.valueOf(hiHealthData.getInt(strArr[i2])));
            } else if (i3 == 1) {
                map.put(Integer.valueOf(iArr[i2]), Long.valueOf(hiHealthData.getLong(strArr[i2])));
            } else if (i3 == 2) {
                map.put(Integer.valueOf(iArr[i2]), Float.valueOf(hiHealthData.getFloat(strArr[i2])));
            } else if (i3 == 3) {
                map.put(Integer.valueOf(iArr[i2]), Double.valueOf(hiHealthData.getDouble(strArr[i2])));
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(IDataReadResultListener iDataReadResultListener, int i2, List list, int i3, boolean z) {
        try {
            if (z && list != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(list.size()));
                iDataReadResultListener.onResult(arrayList, i2, i3);
                return;
            }
            iDataReadResultListener.onResult(list, i2, i3);
        } catch (RemoteException e2) {
            ReleaseLogUtil.b("R_HiHlthKitQryHlp", "notifyDataReadResult RemoteException", LogAnonymous.b(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(HiHealthData hiHealthData, HiHealthKitData hiHealthKitData, boolean z) {
        String string = hiHealthData.getString("device_uniquecode");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String string2 = hiHealthData.getString("device_name");
        String string3 = hiHealthData.getString("device_model");
        String string4 = hiHealthData.getString("trackdata_deviceType");
        if (!z) {
            hiHealthKitData.putString("device_uniquecode", "***");
        } else {
            hiHealthKitData.putString("device_uniquecode", string);
        }
        hiHealthKitData.putString("device_name", string2);
        hiHealthKitData.putString("device_model", string3);
        hiHealthKitData.putString("deviceType", e(string4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(HiHealthData hiHealthData, HiHealthKitData hiHealthKitData) {
        if (lcs.a(hiHealthData.getType())) {
            hiHealthKitData.setDoubleValue(Double.valueOf(hiHealthData.getValue()));
        } else if (lcs.d(hiHealthData.getType())) {
            hiHealthKitData.putString("metadata", hiHealthData.getMetaData());
        } else {
            hiHealthKitData.setValue(hiHealthData.getIntValue());
        }
    }

    protected void d(int i2, IDataOperateListener iDataOperateListener) throws RemoteException {
        int iB = kwi.b().b(this.f12465b);
        LogUtil.a("HiHlthKitQryHlp", "getDataAuthStatus appId:", Integer.valueOf(iB));
        HiHealthUserPermission hiHealthUserPermissionC = kxj.a(this.d).c(iB, i2);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(hiHealthUserPermissionC.getAllowWrite()));
        iDataOperateListener.onResult(0, arrayList);
    }

    protected void c(int[] iArr, int[] iArr2, IBaseCallback iBaseCallback) throws RemoteException {
        int iB = kwi.b().b(this.f12465b);
        LogUtil.a("HiHlthKitQryHlp", "getDataAuthStatusEx appId:", Integer.valueOf(iB));
        List<HiHealthUserPermission> listB = kxj.a(this.d).b(iB);
        int[] iArr3 = new int[iArr == null ? 0 : iArr.length];
        int[] iArr4 = new int[iArr2 == null ? 0 : iArr2.length];
        for (int i2 = 0; iArr != null && i2 < iArr.length; i2++) {
            for (HiHealthUserPermission hiHealthUserPermission : listB) {
                if (iArr[i2] == hiHealthUserPermission.getScopeId()) {
                    iArr3[i2] = hiHealthUserPermission.getAllowWrite();
                    break;
                }
            }
        }
        for (int i3 = 0; iArr2 != null && i3 < iArr2.length; i3++) {
            for (HiHealthUserPermission hiHealthUserPermission2 : listB) {
                if (iArr2[i3] == hiHealthUserPermission2.getScopeId()) {
                    iArr4[i3] = hiHealthUserPermission2.getAllowRead();
                    break;
                }
            }
        }
        HashMap map = new HashMap(2);
        map.put("writeTypes", iArr3);
        map.put("readTypes", iArr4);
        ReleaseLogUtil.c("R_HiHlthKitQryHlp", "getDataAuthStatusEx: ", HiJsonUtil.d(map));
        iBaseCallback.onResult(0, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ICommonListener iCommonListener, int i2) throws RemoteException {
        if (i2 < 0 && i2 != -1) {
            iCommonListener.onFailure(4, null);
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(i2));
        iCommonListener.onSuccess(0, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ICommonListener iCommonListener, float f2) throws RemoteException {
        ArrayList arrayList = new ArrayList(1);
        if (f2 < 0.0f && f2 != -100.0f) {
            iCommonListener.onFailure(4, null);
            return;
        }
        if (f2 == -100.0f) {
            arrayList.add(Float.valueOf(0.0f));
        } else {
            arrayList.add(Float.valueOf(f2));
        }
        iCommonListener.onSuccess(0, arrayList);
    }

    void a(final len lenVar, final ICommonListener iCommonListener, final String str) throws RemoteException {
        if (iCommonListener == null || str == null) {
            if (iCommonListener != null) {
                iCommonListener.onFailure(3, null);
                d(lenVar, null, 3, null);
            }
            LogUtil.j("HiHlthKitQryHlp", "param is null");
            return;
        }
        ktr.b().c((ICommonListener) new ICommonListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitQueryHelper.3
            @Override // com.huawei.hihealth.ICommonListener
            public void onSuccess(int i2, List list) throws RemoteException {
                if (njy.e(list)) {
                    LogUtil.j("HiHlthKitQryHlp", "userInfo is null");
                    return;
                }
                HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                int iA = HiHealthKitQueryHelper.this.a(hiUserInfo, str);
                if ("getWeight".equals(str)) {
                    HiHealthKitQueryHelper.this.b(iCommonListener, hiUserInfo != null ? hiUserInfo.getWeight() : 0.0f);
                } else {
                    HiHealthKitQueryHelper.this.b(iCommonListener, iA);
                }
                HiHealthKitQueryHelper.this.d(lenVar, str, 0, null);
                LogUtil.a("HiHlthKitQryHlp", "HiHealthApiManager getUserInfo onSuccess errorCode = ", 0);
            }

            @Override // com.huawei.hihealth.ICommonListener
            public void onFailure(int i2, List list) throws RemoteException {
                int iC = lck.c(i2);
                iCommonListener.onFailure(iC, list);
                HiHealthKitQueryHelper.this.d(lenVar, str, iC, null);
                if (list != null && list.size() > 0) {
                    LogUtil.a("HiHlthKitQryHlp", "fetchUserData fail, errMsg = ", list.get(0));
                }
                LogUtil.a("HiHlthKitQryHlp", "HiHealthApiManager getUserInfo onSuccess errorCode = ", Integer.valueOf(i2));
            }
        }, false);
    }

    protected void b(HiHealthAggregateQuery hiHealthAggregateQuery, IDataReadResultListener iDataReadResultListener, lbh lbhVar) {
        if (hiHealthAggregateQuery.getSampleType() != 10009) {
            return;
        }
        e(new IrregularHeartBeatQueryOption(hiHealthAggregateQuery), iDataReadResultListener, lbhVar);
    }

    protected void a(HiHealthDataQuery hiHealthDataQuery, IDataReadResultListener iDataReadResultListener, lbh lbhVar) throws RemoteException {
        if (lcq.c(hiHealthDataQuery.getSampleType())) {
            b(iDataReadResultListener, hiHealthDataQuery.getSampleType(), lbhVar);
        }
        if (hiHealthDataQuery.getSampleType() == 44000) {
            e(a(hiHealthDataQuery, false), iDataReadResultListener, lbhVar);
            return;
        }
        if (hiHealthDataQuery.getSampleType() == 15002) {
            LogUtil.a("HiHlthKitQryHlp", "enter query goal step");
            a(iDataReadResultListener, 2, lbhVar);
            return;
        }
        LogUtil.a("HiHlthKitQryHlp", "getHiHealthData");
        switch (AnonymousClass8.e[HiHealthDataType.d(hiHealthDataQuery.getSampleType()).ordinal()]) {
            case 1:
            case 2:
            case 3:
                e(hiHealthDataQuery, iDataReadResultListener, lbhVar);
                break;
            case 4:
                if (hiHealthDataQuery.getSampleType() == 10002) {
                    d(hiHealthDataQuery, iDataReadResultListener, lbhVar);
                } else {
                    e(a(hiHealthDataQuery, false), iDataReadResultListener, lbhVar);
                }
                break;
            case 5:
                b(hiHealthDataQuery, iDataReadResultListener, lbhVar);
                break;
            case 6:
                c(hiHealthDataQuery, iDataReadResultListener, lbhVar);
                break;
            default:
                LogUtil.j("HiHlthKitQryHlp", "invalid sample type");
                iDataReadResultListener.onResult(null, 2, 2);
                break;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hihealthservice.hihealthkit.HiHealthKitQueryHelper$8, reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            e = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[HiHealthDataType.Category.STAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[HiHealthDataType.Category.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[HiHealthDataType.Category.SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[HiHealthDataType.Category.SEQUENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[HiHealthDataType.Category.SESSION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private void a(IDataReadResultListener iDataReadResultListener, int i2, lbh lbhVar) {
        int i3 = this.f12464a.i();
        len lenVar = new len();
        if (i3 <= 0) {
            LogUtil.j("HiHlthKitQryHlp", "queryConfig who <= 0");
            b(iDataReadResultListener, 4, Collections.EMPTY_LIST, 2, false);
            b(lenVar, lbhVar.c(), 4, lbhVar.e());
            return;
        }
        List<HiGoalInfo> listB = kxa.e().b(i3, i2);
        if (njy.e(listB)) {
            b(iDataReadResultListener, 0, Collections.EMPTY_LIST, 2, false);
            b(lenVar, lbhVar.c(), 0, lbhVar.e());
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(a(listB, i2));
            b(iDataReadResultListener, 0, (List) arrayList, 2, false);
            b(lenVar, lbhVar.c(), 0, lbhVar.e());
        }
    }

    private HiHealthKitData a(List<HiGoalInfo> list, int i2) {
        int size = list.size();
        HiHealthKitData hiHealthKitData = new HiHealthKitData();
        hiHealthKitData.setType(i2);
        HashMap map = new HashMap(size);
        for (HiGoalInfo hiGoalInfo : list) {
            map.put(2901, Double.valueOf(hiGoalInfo.getGoalValue()));
            map.put(2903, Integer.valueOf(hiGoalInfo.getDealLine()));
            map.put(2902, Integer.valueOf(hiGoalInfo.getGoalUnit()));
            map.put(2904, Integer.valueOf(hiGoalInfo.getTargetType()));
        }
        hiHealthKitData.setMap(map);
        return hiHealthKitData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    public int a(HiUserInfo hiUserInfo, String str) {
        byte b2;
        if (hiUserInfo != null) {
            str.hashCode();
            int iHashCode = str.hashCode();
            if (iHashCode != -1147691021) {
                if (iHashCode != 446502327) {
                    if (iHashCode == 474985501 && str.equals("getHeight")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("getGender")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("getBirthday")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 != 0) {
                if (b2 == 1) {
                    if (hiUserInfo.getGender() != -100) {
                        return hiUserInfo.getGender();
                    }
                    return -1;
                }
                if (b2 == 2) {
                    return hiUserInfo.getHeight();
                }
                LogUtil.e("HiHlthKitQryHlp", "getBasicUserFeatyre unrecognized dataType");
                return 0;
            }
            if (hiUserInfo.getBirthday() != -100) {
                return hiUserInfo.getBirthday();
            }
        }
        return 0;
    }

    private void d(final HiHealthDataQuery hiHealthDataQuery, final IDataReadResultListener iDataReadResultListener, final lbh lbhVar) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final IDataReadResultListener.Stub stub = new IDataReadResultListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitQueryHelper.1
            @Override // com.huawei.hihealth.IDataReadResultListener
            public void onResult(List list, int i2, int i3) throws RemoteException {
                arrayList2.addAll(list);
                if (i3 == 2) {
                    int i4 = 0;
                    for (List list2 : arrayList) {
                        if (i4 == arrayList.size() - 1) {
                            iDataReadResultListener.onResult(HiHealthKitQueryHelper.this.a((List<HiHealthKitData>) list2, (List<HiHealthKitData>) arrayList2), i2, 2);
                        } else {
                            iDataReadResultListener.onResult(HiHealthKitQueryHelper.this.a((List<HiHealthKitData>) list2, (List<HiHealthKitData>) arrayList2), i2, 0);
                        }
                        i4++;
                    }
                }
            }
        };
        e(a(hiHealthDataQuery, true), new IDataReadResultListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitQueryHelper.4
            @Override // com.huawei.hihealth.IDataReadResultListener
            public void onResult(List list, int i2, int i3) throws RemoteException {
                if (lbhVar.a()) {
                    iDataReadResultListener.onResult(list, i2, i3);
                    return;
                }
                arrayList.add(list);
                if (i3 == 2) {
                    if (i2 == 0) {
                        HiHealthKitQueryHelper hiHealthKitQueryHelper = HiHealthKitQueryHelper.this;
                        hiHealthKitQueryHelper.e(hiHealthKitQueryHelper.a(hiHealthDataQuery, false), stub, lbhVar);
                    } else {
                        iDataReadResultListener.onResult(list, i2, i3);
                    }
                }
            }
        }, lbhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthKitData> a(List<HiHealthKitData> list, List<HiHealthKitData> list2) {
        if (list2 != null && list != null) {
            for (HiHealthKitData hiHealthKitData : list) {
                Map map = hiHealthKitData.getMap();
                for (HiHealthKitData hiHealthKitData2 : list2) {
                    if (hiHealthKitData.getStartTime() == hiHealthKitData2.getStartTime() && hiHealthKitData.getEndTime() == hiHealthKitData2.getEndTime()) {
                        map.putAll(hiHealthKitData2.getMap());
                        break;
                    }
                }
                if (Double.valueOf(String.valueOf(map.get(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value())))).doubleValue() > 0.0d) {
                    map.put(2018, map.get(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value())));
                }
                map.remove(Integer.valueOf(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value()));
            }
        }
        return list;
    }

    private void b(IDataReadResultListener iDataReadResultListener, int i2, lbh lbhVar) {
        int i3 = this.f12464a.i();
        len lenVar = new len();
        if (i3 <= 0) {
            LogUtil.j("HiHlthKitQryHlp", "queryConfig who <= 0");
            b(iDataReadResultListener, 4, Collections.EMPTY_LIST, 2, false);
            d(lenVar, lbhVar.c(), 4, lbhVar.e());
            return;
        }
        HiUserPreference hiUserPreferenceB = kxs.c(this.d).b(i3, lcq.d(i2));
        if (hiUserPreferenceB == null) {
            b(iDataReadResultListener, 0, Collections.EMPTY_LIST, 2, false);
            d(lenVar, lbhVar.c(), 0, lbhVar.e());
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(e(hiUserPreferenceB, i2));
            b(iDataReadResultListener, 0, (List) arrayList, 2, false);
            d(lenVar, lbhVar.c(), 0, lbhVar.e());
        }
    }

    private HiHealthKitData e(HiUserPreference hiUserPreference, int i2) {
        HiHealthKitData hiHealthKitData = new HiHealthKitData();
        hiHealthKitData.setType(i2);
        hiHealthKitData.setTimeInterval(hiUserPreference.getModifiedTime(), hiUserPreference.getModifiedTime());
        HashMap map = new HashMap(1);
        map.put(Integer.valueOf(i2), hiUserPreference.getValue());
        hiHealthKitData.setMap(map);
        hiHealthKitData.putLong("update_time", hiUserPreference.getModifiedTime());
        return hiHealthKitData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InnerAggregateOption a(HiHealthDataQuery hiHealthDataQuery, boolean z) {
        if (HiHealthDataType.l(hiHealthDataQuery.getSampleType())) {
            return new MenstrualQueryOption(hiHealthDataQuery);
        }
        if (hiHealthDataQuery.getSampleType() == DicDataTypeUtil.DataType.OSA_SET.value()) {
            return new OsaQueryOption(hiHealthDataQuery);
        }
        int sampleType = hiHealthDataQuery.getSampleType();
        if (sampleType == 10001) {
            return new BloodSugarQueryOption(hiHealthDataQuery);
        }
        if (sampleType == 10002) {
            return new BloodPressureQueryOption(hiHealthDataQuery, z);
        }
        if (sampleType != 44000) {
            switch (sampleType) {
                case 10006:
                    return new WeightSetQueryOption(hiHealthDataQuery);
                case 10007:
                    return new CoreSleepQueryOption(hiHealthDataQuery);
                case 10008:
                    return new HeartRateQueryOption(hiHealthDataQuery);
                case 10009:
                    return new IrregularHeartBeatQueryOption(hiHealthDataQuery);
                default:
                    return null;
            }
        }
        return new SleepQueryOption(hiHealthDataQuery);
    }

    private void b(HiHealthDataQuery hiHealthDataQuery, IDataReadResultListener iDataReadResultListener, lbh lbhVar) {
        IDataReadResultListener eVar;
        int sampleType = hiHealthDataQuery.getSampleType();
        if (sampleType == 30029) {
            hiHealthDataQuery.setSampleType(30002);
        }
        InnerReadOption innerReadOption = new InnerReadOption(hiHealthDataQuery);
        if (HiHealthDataType.o(sampleType)) {
            eVar = new j(iDataReadResultListener, hiHealthDataQuery, lbhVar);
        } else if (HiHealthDataType.m(sampleType)) {
            eVar = new e(iDataReadResultListener, lbhVar, hiHealthDataQuery);
        } else {
            LogUtil.e("HiHlthKitQryHlp", "querySequenceData, unknown type");
            return;
        }
        try {
            d(innerReadOption, eVar, lbhVar);
        } catch (RemoteException e2) {
            ReleaseLogUtil.c("R_HiHlthKitQryHlp", "queryPointData Remote Exception", LogAnonymous.b(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(InnerAggregateOption innerAggregateOption, IDataReadResultListener iDataReadResultListener, lbh lbhVar) {
        try {
            a(innerAggregateOption, new a(iDataReadResultListener, innerAggregateOption, lbhVar), lbhVar);
        } catch (RemoteException e2) {
            ReleaseLogUtil.c("R_HiHlthKitQryHlp", "RemoteException", LogAnonymous.b(e2));
        }
    }

    private void e(HiHealthDataQuery hiHealthDataQuery, IDataReadResultListener iDataReadResultListener, lbh lbhVar) {
        try {
            d(new InnerReadOption(hiHealthDataQuery), new b(iDataReadResultListener, lbhVar, hiHealthDataQuery), lbhVar);
        } catch (RemoteException e2) {
            ReleaseLogUtil.c("R_HiHlthKitQryHlp", "queryPointData Remote Exception", LogAnonymous.b(e2));
        }
    }

    private void c(HiHealthDataQuery hiHealthDataQuery, IDataReadResultListener iDataReadResultListener, lbh lbhVar) {
        InnerReadOption innerReadOption = new InnerReadOption(hiHealthDataQuery);
        HiDataReadResultListener cVar = new c(iDataReadResultListener, lbhVar);
        if (hiHealthDataQuery.getSampleType() == 22104) {
            cVar = new h(iDataReadResultListener, lbhVar);
        }
        HiHealthManager.d(this.d).readHiHealthData(innerReadOption, cVar);
    }

    private void d(HiDataReadOption hiDataReadOption, final IDataReadResultListener iDataReadResultListener, final lbh lbhVar) throws RemoteException {
        if (iDataReadResultListener == null) {
            LogUtil.a("HiHlthKitQryHlp", "listener is null!");
            return;
        }
        LogUtil.a("HiHlthKitQryHlp", "readHiHealthData");
        final len lenVar = new len();
        ktr.b().c(hiDataReadOption, new IDataReadResultListener() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitQueryHelper.2
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.huawei.hihealth.IDataReadResultListener
            public void onResult(List list, int i2, int i3) throws RemoteException {
                LogUtil.a("HiHlthKitQryHlp", "HiHealthApiManager readHiHealthData errorCode = ", Integer.valueOf(i2));
                int iC = lck.c(i2);
                if (i3 == 2) {
                    HiHealthKitQueryHelper.this.d(lenVar, lbhVar.c(), iC, lbhVar.e());
                }
                iDataReadResultListener.onResult(list, iC, i3);
            }
        }, false);
    }

    private void a(final HiAggregateOption hiAggregateOption, final IAggregateListener iAggregateListener, final lbh lbhVar) throws RemoteException {
        if (iAggregateListener == null) {
            LogUtil.a("HiHlthKitQryHlp", "listener is null!");
        } else {
            final len lenVar = new len();
            ktr.b().b(hiAggregateOption, new IAggregateListener() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitQueryHelper.5
                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return null;
                }

                @Override // com.huawei.hihealth.IAggregateListener
                public void onResult(List list, int i2, int i3) throws RemoteException {
                    LogUtil.a("HiHlthKitQryHlp", "HiHealthApiManager aggregateHiHealthData errorCode = ", Integer.valueOf(i2));
                    int iC = lck.c(i2);
                    if (i3 == 2) {
                        HiHealthKitQueryHelper.this.d(lenVar, lbhVar.c(), iC, lbhVar.e());
                    }
                    if (hiAggregateOption instanceof CoreSleepQueryOption) {
                        HiHealthKitQueryHelper.this.a(list);
                    }
                    iAggregateListener.onResult(list, iC, i3);
                }
            }, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list) {
        if (list == null || list.isEmpty()) {
            LogUtil.a("HiHlthKitQryHlp", "handleCoreSleepData, data is null");
            return;
        }
        LogUtil.a("HiHlthKitQryHlp", "enter handleCoreSleepData");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HiHealthData hiHealthData = (HiHealthData) it.next();
            if (hiHealthData.getInt("maxSleepVersion") < 5) {
                LogUtil.a("HiHlthKitQryHlp", "version < 5, no need to process");
            } else {
                int i2 = hiHealthData.getInt("dayDreamDurationREM");
                int i3 = hiHealthData.getInt("dayDeepDurationN3");
                int i4 = hiHealthData.getInt("dayShallowDurationN1N2");
                hiHealthData.getValueHolder().put("stat_core_sleep_dream_duration", Integer.valueOf(i2));
                hiHealthData.getValueHolder().put("stat_core_sleep_deep_duration", Integer.valueOf(i3));
                hiHealthData.getValueHolder().put("stat_core_sleep_shallow_duration", Integer.valueOf(i4));
            }
        }
        LogUtil.a("HiHlthKitQryHlp", "core sleep data process finished");
    }

    private void b(len lenVar, String str, int i2, String str2) {
        if (lek.c()) {
            return;
        }
        d(lenVar, str, i2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(len lenVar, String str, int i2, String str2) {
        lenVar.d(this.d, new ler(str, i2, this.f12465b, this.e, str2));
    }

    static class MenstrualQueryOption extends InnerAggregateOption {
        MenstrualQueryOption(HiHealthDataQuery hiHealthDataQuery) {
            super(hiHealthDataQuery);
            this.type = new int[]{hiHealthDataQuery.getSampleType()};
            this.constantsKey = new String[]{"menstrual"};
            int[] iArrE = HiHealthDataType.e(10010);
            String[] strArrD = HiHealthDataKey.d(10010);
            int[] iArr = new int[iArrE.length];
            Arrays.fill(iArr, 0);
            super.setResolveOption(new f(iArrE, strArrD, iArr, 10010));
            super.setAggregateType(1);
            super.setGroupUnitType(0);
        }
    }

    static class IrregularHeartBeatQueryOption extends InnerAggregateOption {
        IrregularHeartBeatQueryOption(HiHealthDataQuery hiHealthDataQuery) {
            super(hiHealthDataQuery);
            this.type = new int[]{AMapException.CODE_AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR};
            this.constantsKey = new String[]{"ppg"};
            int[] iArr = new int[this.type.length];
            Arrays.fill(iArr, 0);
            super.setResolveOption(new f(this.type, this.constantsKey, iArr, AMapException.CODE_AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR));
        }

        IrregularHeartBeatQueryOption(HiHealthAggregateQuery hiHealthAggregateQuery) {
            super(hiHealthAggregateQuery);
            this.type = HiHealthDataType.j();
            this.constantsKey = HiHealthDataKey.a();
            int[] iArr = new int[this.type.length];
            Arrays.fill(iArr, 0);
            super.setResolveOption(new f(this.type, this.constantsKey, iArr, 10009));
        }
    }

    static class OsaQueryOption extends InnerAggregateOption {
        OsaQueryOption(HiHealthDataQuery hiHealthDataQuery) {
            super(hiHealthDataQuery);
            this.type = new int[]{DicDataTypeUtil.DataType.OSA_LEVEL.value(), DicDataTypeUtil.DataType.OSA_AVG_CNT_PER_HOUR.value()};
            this.constantsKey = new String[]{"osaLevel", "osaAvgCntPerHour"};
            int[] iArr = new int[this.type.length];
            iArr[0] = 0;
            iArr[1] = 3;
            super.setResolveOption(new f(this.type, this.constantsKey, iArr, DicDataTypeUtil.DataType.OSA_SET.value()));
            super.setGroupUnitType(0);
            super.setAggregateType(4);
            super.setReadType(0);
        }
    }

    static class WeightSetQueryOption extends InnerAggregateOption {
        WeightSetQueryOption(HiHealthDataQuery hiHealthDataQuery) {
            super(hiHealthDataQuery);
            this.type = new int[]{10006};
            this.constantsKey = new String[]{BleConstants.WEIGHT_KEY};
            int[] iArr = {2004, 2022, 2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030, 2031, Constants.START_TO_MAIN_ACTIVITY, 2033, 2053, 2076, 2077, 2078, 2079, 2080, 2081, 2083, 2084, 2085, 2086, 2087, 2088};
            String[] strArr = {"bodyWeight", BleConstants.BMI, BleConstants.MUSCLE_MASS, BleConstants.BASAL_METABOLISM, BleConstants.MOISTURE, BleConstants.VISCERAL_FAT_LEVEL, BleConstants.BONE_SALT, "protein", BleConstants.BODY_SCORE, BleConstants.BODY_AGE, BleConstants.BODY_FAT_RATE, BleConstants.IMPEDANCE, BleConstants.MOISTURE_RATE, "skeletalMusclelMass", "lhrhImpedance", "lhlfImpedance", "lhrfImpedance", "rhlfImpedance", "rhrfImpedance", "lfrfImpedance", "lhrhHfImpedance", "lhlfHfImpedance", "lhrfHfImpedance", "rhlfHfImpedance", "rhrfHfImpedance", "lfrfHfImpedance"};
            int[] iArr2 = new int[26];
            Arrays.fill(iArr2, 3);
            super.setResolveOption(new f(iArr, strArr, iArr2, 10006));
            super.setAggregateType(1);
            super.setGroupUnitType(0);
        }
    }

    static class HeartRateQueryOption extends InnerAggregateOption {
        HeartRateQueryOption(HiHealthDataQuery hiHealthDataQuery) {
            super(hiHealthDataQuery);
            this.type = new int[]{46016, 46017, 46018, 47052, 47053, 47002, 47003};
            this.constantsKey = new String[]{"maxHeartRate", "minHeartRate", "avgRestingHeartRate", "heart_rate_bradycardia_min", "heart_rate_bradycardia_max", "heart_rate_rise_min", "heart_rate_rise_max"};
            int[] iArr = new int[this.type.length];
            Arrays.fill(iArr, 2);
            super.setResolveOption(new f(this.type, this.constantsKey, iArr, 10008));
            super.setAggregateType(1);
            super.setGroupUnitType(0);
            super.setReadType(0);
        }
    }

    static class BloodSugarQueryOption extends InnerAggregateOption {
        BloodSugarQueryOption(HiHealthDataQuery hiHealthDataQuery) {
            super(hiHealthDataQuery);
            this.type = HiHealthDataType.e(10001);
            this.constantsKey = new String[this.type.length];
            for (int i = 0; i < this.type.length; i++) {
                this.constantsKey[i] = HiHealthDataKey.a(this.type[i]);
            }
            int[] iArr = new int[this.type.length];
            Arrays.fill(iArr, 3);
            super.setResolveOption(new f(this.type, this.constantsKey, iArr, 10001));
            super.setAggregateType(1);
            super.setGroupUnitType(0);
            super.setReadType(0);
        }
    }

    static class BloodPressureQueryOption extends InnerAggregateOption {
        BloodPressureQueryOption(HiHealthDataQuery hiHealthDataQuery, boolean z) {
            super(hiHealthDataQuery);
            if (z) {
                this.type = new int[]{2006, 2007, DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value()};
                this.constantsKey = new String[]{"BLOOD_PRESSURE_SYSTOLIC", "BLOOD_PRESSURE_DIASTOLIC", "sphygmus_new"};
            } else {
                this.type = new int[]{2018};
                this.constantsKey = new String[]{BleConstants.BLOODPRESSURE_SPHYGMUS};
            }
            int[] iArr = new int[this.type.length];
            Arrays.fill(iArr, 3);
            super.setResolveOption(new f(this.type, this.constantsKey, iArr, 10002));
            super.setAggregateType(1);
            super.setGroupUnitType(0);
            super.setReadType(0);
        }
    }

    static class CoreSleepQueryOption extends InnerAggregateOption {
        CoreSleepQueryOption(HiHealthDataQuery hiHealthDataQuery) {
            super(hiHealthDataQuery);
            this.type = HiHealthDataType.e();
            this.constantsKey = HiHealthDataKey.e();
            int[] iArr = {44101, 44102, 44103, 44105, 44106, 44107, 44108, 44110, 44207, 44104, 44109, 44206, 44204, 44208, 44201, 44202, 44203, 44236};
            String[] strArr = {"stat_core_sleep_dream_duration", "stat_core_sleep_deep_duration", "stat_core_sleep_shallow_duration", "stat_core_sleep_duration_sum", "stat_core_sleep_deep_part_count", "stat_core_sleep_wake_count", "stat_core_sleep_noon_duration", "stat_core_sleep_device_category", "stat_out_core_sleep_efficiency", "stat_core_sleep_wake_duration", "stat_core_sleep_bed_duration", "stat_out_core_sleep_valid_data", "stat_out_core_sleep_latency", "stat_out_core_sleep_snore_freq", "stat_out_core_sleep_fall_time", "stat_out_core_sleep_wake_up_time", "stat_out_core_sleep_score", "lastStableSleepRatio"};
            int[] iArr2 = new int[18];
            Arrays.fill(iArr2, 2);
            for (int i = 14; i < 18; i++) {
                iArr2[i] = 1;
            }
            super.setResolveOption(new f(iArr, strArr, iArr2, 10007));
            super.setGroupUnitType(3);
            super.setAggregateType(1);
            super.setGroupUnitSize(1);
            super.setReadType(0);
        }
    }

    static class SleepQueryOption extends InnerAggregateOption {
        SleepQueryOption(HiHealthDataQuery hiHealthDataQuery) {
            super(hiHealthDataQuery);
            super.setStartTime(hiHealthDataQuery.getStartTime());
            super.setEndTime(hiHealthDataQuery.getEndTime());
            this.type = new int[]{44006, 44007, 44004, 44001, 44002, 44003, 44005};
            this.constantsKey = new String[]{"mStartTime", "mEndTime", "totalDuration", "deepDuration", "lightDuration", "awakeDuration", "awakeTimes"};
            int[] iArr = {44006, 44007, 44004, 44001, 44002, 44003, 44005};
            String[] strArr = {"mStartTime", "mEndTime", "totalDuration", "deepDuration", "lightDuration", "awakeDuration", "awakeTimes"};
            int[] iArr2 = new int[7];
            Arrays.fill(iArr2, 2);
            for (int i = 0; i <= 1; i++) {
                iArr2[i] = 1;
            }
            super.setResolveOption(new f(iArr, strArr, iArr2, 44000));
            super.setGroupUnitType(3);
            super.setAggregateType(1);
            super.setGroupUnitSize(1);
            super.setReadType(0);
        }
    }

    static class InnerAggregateOption extends HiAggregateOption {
        f resolveOption;

        InnerAggregateOption(HiHealthDataQuery hiHealthDataQuery) {
            super.setTimeInterval(hiHealthDataQuery.getStartTime(), hiHealthDataQuery.getEndTime());
            HiHealthDataQueryOption hiHealthDataQueryOption = hiHealthDataQuery.getHiHealthDataQueryOption();
            if (hiHealthDataQueryOption != null) {
                super.setSortOrder(hiHealthDataQueryOption.getOrder());
                super.setAnchor(hiHealthDataQueryOption.getOffset());
                super.setCount(hiHealthDataQueryOption.getLimit());
            }
        }

        InnerAggregateOption(HiHealthAggregateQuery hiHealthAggregateQuery) {
            super.setTimeInterval(hiHealthAggregateQuery.getStartTime(), hiHealthAggregateQuery.getEndTime());
            super.setAggregateType(hiHealthAggregateQuery.getAggregateType());
            super.setGroupUnitSize(hiHealthAggregateQuery.getGroupUnitSize());
            super.setGroupUnitType(hiHealthAggregateQuery.getGroupUnitType());
            super.setSortOrder(hiHealthAggregateQuery.getOrder());
            super.setAnchor(hiHealthAggregateQuery.getOffset());
            super.setCount(hiHealthAggregateQuery.getLimit());
            super.setDeviceUuid(hiHealthAggregateQuery.getDeviceUuid());
        }

        f getResolveOption() {
            return this.resolveOption;
        }

        void setResolveOption(f fVar) {
            this.resolveOption = fVar;
        }
    }

    static class InnerReadOption extends HiDataReadOption {
        InnerReadOption(HiHealthDataQuery hiHealthDataQuery) {
            super.setType(HiHealthKitQueryHelper.c(hiHealthDataQuery.getSampleType()));
            super.setStartTime(hiHealthDataQuery.getStartTime());
            super.setEndTime(hiHealthDataQuery.getEndTime());
            HiHealthDataQueryOption hiHealthDataQueryOption = hiHealthDataQuery.getHiHealthDataQueryOption();
            if (hiHealthDataQueryOption != null) {
                super.setSortOrder(hiHealthDataQueryOption.getOrder());
                super.setAnchor(hiHealthDataQueryOption.getOffset());
                super.setCount(hiHealthDataQueryOption.getLimit());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] c(int i2) {
        if (i2 == HiHealthDataType.d) {
            return new int[]{HiHealthDataType.d, 2104};
        }
        return new int[]{i2};
    }

    static class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String[] f12496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f12497c;
        int[] d;
        int e;

        f(int[] iArr, String[] strArr, int[] iArr2, int i) {
            this.f12497c = iArr;
            this.f12496b = strArr;
            this.d = iArr2;
            this.e = i;
        }
    }

    static class a extends IAggregateListener.Stub {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        InnerAggregateOption f12486b;
        lbh d;
        IDataReadResultListener e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List f12485a = new ArrayList(10);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List f12487c = new ArrayList(10);

        a(IDataReadResultListener iDataReadResultListener, InnerAggregateOption innerAggregateOption, lbh lbhVar) {
            this.e = iDataReadResultListener;
            this.f12486b = innerAggregateOption;
            this.d = lbhVar;
        }

        @Override // com.huawei.hihealth.IAggregateListener
        public void onResult(List list, int i, int i2) throws RemoteException {
            InnerAggregateOption innerAggregateOption;
            if (this.e == null || (innerAggregateOption = this.f12486b) == null || innerAggregateOption.getResolveOption() == null) {
                LogUtil.e("HiHlthKitQryHlp", "SetDataReadResultProxy, null param");
            } else if (let.d(this.d.d()) <= 2) {
                d(list, i, i2);
            } else {
                c(list, i, i2);
            }
        }

        private void c(List list, int i, int i2) {
            if (list == null) {
                LogUtil.a("HiHlthKitQryHlp", "SetDataReadResultProxy, return null errorCode: ", Integer.valueOf(i));
                HiHealthKitQueryHelper.b(this.e, i, Collections.EMPTY_LIST, i2, this.d.a());
            } else {
                ArrayList arrayList = new ArrayList();
                b(list, arrayList);
                HiHealthKitQueryHelper.b(this.e, i, arrayList, i2, this.d.a());
            }
        }

        private void b(List list, List list2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HiHealthData hiHealthData = (HiHealthData) it.next();
                HiHealthKitData hiHealthKitDataE = HiHealthKitQueryHelper.e(hiHealthData, this.f12486b, this.d);
                if (this.f12486b.getResolveOption().e == 10007) {
                    HiHealthKitQueryHelper.b(hiHealthData, hiHealthKitDataE);
                }
                if (this.f12486b.getResolveOption().e == 10006) {
                    HiHealthKitQueryHelper.a(hiHealthData, hiHealthKitDataE);
                }
                list2.add(hiHealthKitDataE);
            }
            LogUtil.a("HiHlthKitQryHlp", "SetDataReadResultProxy, return type: ", Integer.valueOf(this.f12486b.getResolveOption().e), " dataSize: ", Integer.valueOf(list2.size()));
        }

        private void d(List list, int i, int i2) throws RemoteException {
            if (HiDivideUtil.d((List<HiHealthData>) list, i2, (List<HiHealthData>) this.f12485a)) {
                List list2 = this.f12485a;
                if (list2 == null) {
                    LogUtil.a("HiHlthKitQryHlp", "SetDataReadResultProxy, return null errorCode: ", Integer.valueOf(i));
                    this.e.onResult(null, i, i2);
                    return;
                }
                b(list2, this.f12487c);
                if (list != null || i == 0 || i2 != 2) {
                    HiHealthKitQueryHelper.b(this.e, i, this.f12487c, i2, this.d.a());
                    return;
                }
                try {
                    this.e.onResult(null, i, i2);
                } catch (RemoteException e) {
                    ReleaseLogUtil.b("R_HiHlthKitQryHlp", "SetDataReadResultProxy RemoteException", LogAnonymous.b(e));
                }
            }
        }
    }

    static class j extends IDataReadResultListener.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12501a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IDataReadResultListener f12502b;
        lbh d;
        int e;

        j(IDataReadResultListener iDataReadResultListener, HiHealthDataQuery hiHealthDataQuery, lbh lbhVar) {
            this.f12502b = iDataReadResultListener;
            this.e = hiHealthDataQuery.getSampleType();
            this.d = lbhVar;
        }

        @Override // com.huawei.hihealth.IDataReadResultListener
        public void onResult(List list, int i, int i2) {
            LogUtil.a("HiHlthKitQryHlp", "enter queryMetaData onResult");
            if (list != null) {
                ArrayList arrayList = new ArrayList(10);
                LogUtil.a("HiHlthKitQryHlp", "trackMetaData size =", Integer.valueOf(list.size()));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(b((HiHealthData) it.next()));
                }
                this.f12501a += list.size();
                d(i, i2, arrayList);
                return;
            }
            c(i, i2);
        }

        private void c(int i, int i2) {
            LogUtil.a("HiHlthKitQryHlp", "queryMetaData datas == null");
            try {
                if (let.d(this.d.d()) > 2) {
                    this.f12502b.onResult(null, i, i2);
                    return;
                }
                if (i2 == 2) {
                    if (i != 0) {
                        this.f12502b.onResult(null, i, i2);
                    } else if (this.d.a()) {
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(Integer.valueOf(this.f12501a));
                        this.f12502b.onResult(arrayList, i, i2);
                    }
                }
            } catch (RemoteException e) {
                ReleaseLogUtil.b("R_HiHlthKitQryHlp", "TrackMetaDataReadResultProxy RemoteException", LogAnonymous.b(e));
            }
        }

        private void d(int i, int i2, List list) {
            if (!this.d.a()) {
                HiHealthKitQueryHelper.b(this.f12502b, i, list, i2, this.d.a());
            } else if (let.d(this.d.d()) > 2) {
                HiHealthKitQueryHelper.b(this.f12502b, i, list, i2, this.d.a());
            }
        }

        private HiHealthKitData b(HiHealthData hiHealthData) {
            HiHealthKitData hiHealthKitData = new HiHealthKitData();
            HiHealthKitQueryHelper.b(hiHealthData, hiHealthKitData, this.d.b());
            hiHealthKitData.setType(hiHealthData.getType());
            hiHealthKitData.setTimeInterval(hiHealthData.getStartTime(), hiHealthData.getEndTime());
            hiHealthKitData.putLong("update_time", hiHealthData.getModifiedTime());
            HashMap map = new HashMap(16);
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
            if (hiTrackMetaData == null) {
                return hiHealthKitData;
            }
            LogUtil.a("HiHlthKitQryHlp", "resolveTrackMetaData: sampleType = ", Integer.valueOf(this.e));
            if (this.e == 30002 && hiTrackMetaData.getSportType() == 283) {
                hiHealthKitData.setType(30029);
                b(map, hiTrackMetaData);
                hiHealthKitData.setMap(map);
                return hiHealthKitData;
            }
            map.put("total_distance", Integer.valueOf(hiTrackMetaData.getTotalDistance()));
            map.put("total_time", Long.valueOf(hiTrackMetaData.getTotalTime()));
            map.put("total_calories", Integer.valueOf(hiTrackMetaData.getTotalCalories()));
            map.put("average_heart_rate", Integer.valueOf(hiTrackMetaData.getAvgHeartRate()));
            map.put("date", Integer.valueOf(HiDateUtil.d(hiHealthData.getStartTime())));
            map.put("average_pace", Float.valueOf(hiTrackMetaData.getAvgPace()));
            map.put("data_source", Integer.valueOf(lct.a(hiTrackMetaData.getSportDataSource())));
            if (hiTrackMetaData.getTotalTime() <= 0) {
                map.put("average_speed", Double.valueOf(0.0d));
            } else {
                map.put("average_speed", Double.valueOf(((double) hiTrackMetaData.getTotalDistance()) / hiTrackMetaData.getTotalTime()));
            }
            if (this.e != 30007) {
                map.put("average_step_rate", Integer.valueOf(hiTrackMetaData.getAvgStepRate()));
                map.put("step", Integer.valueOf(hiTrackMetaData.getTotalSteps()));
                map.put("total_altitude", Float.valueOf(hiTrackMetaData.getCreepingWave()));
                map.put("total_descent", Float.valueOf(hiTrackMetaData.getTotalDescent()));
                if (hiTrackMetaData.getTotalSteps() <= 0) {
                    map.put("step_distance", Double.valueOf(0.0d));
                } else {
                    map.put("step_distance", Double.valueOf(((double) hiTrackMetaData.getTotalDistance()) / ((double) hiTrackMetaData.getTotalSteps())));
                }
            }
            hiHealthKitData.setMap(map);
            return hiHealthKitData;
        }

        private void b(Map map, HiTrackMetaData hiTrackMetaData) {
            LogUtil.a("HiHlthKitQryHlp", "parseRopeSkippingMetaData");
            map.put(BleConstants.SPORT_TYPE, Integer.valueOf(hiTrackMetaData.getSportType()));
            map.put("totalTime", Long.valueOf(hiTrackMetaData.getTotalTime()));
            map.put(BleConstants.TOTAL_CALORIES, Integer.valueOf(hiTrackMetaData.getTotalCalories()));
            Map<String, String> extendTrackMap = hiTrackMetaData.getExtendTrackMap();
            map.put("skipNum", extendTrackMap.get("skipNum"));
            map.put("skipSpeed", extendTrackMap.get("skipSpeed"));
            map.put("stumblingRope", extendTrackMap.get("stumblingRope"));
            map.put("maxSkippingTimes", extendTrackMap.get("maxSkippingTimes"));
        }
    }

    static class e extends IDataReadResultListener.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f12493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f12494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List<List> f12495c = new ArrayList(10);
        IDataReadResultListener d;
        lbh e;
        int f;

        e(IDataReadResultListener iDataReadResultListener, lbh lbhVar, HiHealthDataQuery hiHealthDataQuery) {
            this.d = iDataReadResultListener;
            this.f = hiHealthDataQuery.getSampleType();
            this.e = lbhVar;
            this.f12493a = hiHealthDataQuery.getSampleType() != 31001;
        }

        @Override // com.huawei.hihealth.IDataReadResultListener
        public void onResult(List list, int i, int i2) {
            LogUtil.a("HiHlthKitQryHlp", "SequenceDataReadResultProxy onResult errorCode:", Integer.valueOf(i), " resultType:", Integer.valueOf(i2));
            if (let.d(this.e.d()) <= 2) {
                a(list, i, i2);
            } else {
                d(list, i, i2);
            }
        }

        private void d(List list, int i, int i2) {
            if (list == null || list.size() <= 0) {
                LogUtil.e("HiHlthKitQryHlp", "SequenceDataReadResultProxy return empty list, errCode:", Integer.valueOf(i));
                HiHealthKitQueryHelper.b(this.d, i, Collections.EMPTY_LIST, i2, this.e.a());
            } else {
                List<HiHealthKitData> listE = e(list);
                a(listE);
                LogUtil.a("HiHlthKitQryHlp", "SequenceDataReadResultProxy return sequenceData size:", Integer.valueOf(listE.size()));
                HiHealthKitQueryHelper.b(this.d, 0, listE, i2, this.e.a());
            }
        }

        private List<HiHealthKitData> e(List list) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HiHealthData hiHealthData = (HiHealthData) it.next();
                this.f12494b += hiHealthData.getSequenceData() == null ? 0L : hiHealthData.getSequenceData().length();
                arrayList.add(c(hiHealthData));
            }
            return arrayList;
        }

        private void a(List list, int i, int i2) {
            if (d(list, i2)) {
                if (this.f12495c.size() > 0) {
                    if (this.f12493a) {
                        List<HiHealthKitData> listC = c();
                        a(listC);
                        LogUtil.a("HiHlthKitQryHlp", "SequenceDataReadResultProxy return metaData size:", Integer.valueOf(listC.size()));
                        HiHealthKitQueryHelper.b(this.d, 0, listC, 1, this.e.a());
                        return;
                    }
                    b();
                    for (List list2 : this.f12495c) {
                        a(list2);
                        LogUtil.a("HiHlthKitQryHlp", "SequenceDataReadResultProxy return sequenceData size:", Integer.valueOf(list2.size()));
                        HiHealthKitQueryHelper.b(this.d, 0, list2, 0, this.e.a());
                    }
                    LogUtil.a("HiHlthKitQryHlp", "SequenceDataReadResultProxy return sequenceData over");
                    HiHealthKitQueryHelper.b(this.d, 0, new ArrayList(0), 1, this.e.a());
                    return;
                }
                if (i == this.f) {
                    LogUtil.a("HiHlthKitQryHlp", "SequenceDataReadResultProxy return empty list, errorCode 0");
                    HiHealthKitQueryHelper.b(this.d, 0, new ArrayList(0), 1, this.e.a());
                } else {
                    LogUtil.e("HiHlthKitQryHlp", "SequenceDataReadResultProxy return empty list, errCode:", Integer.valueOf(i));
                    HiHealthKitQueryHelper.b(this.d, i, new ArrayList(0), 1, this.e.a());
                }
            }
        }

        private void b() {
            LogUtil.a("HiHlthKitQryHlp", "enter packageSequenceDivideData, and allData size = ", Integer.valueOf(this.f12495c.size()));
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<List> it = this.f12495c.iterator();
            while (it.hasNext()) {
                Map map = d(it.next()).getMap();
                if (map.containsKey("detail_data")) {
                    stringBuffer.append(map.get("detail_data"));
                }
                if (map.get("meta_data") == null) {
                    it.remove();
                } else {
                    map.remove("detail_data");
                    LogUtil.a("HiHlthKitQryHlp", "detail data size = ", Integer.valueOf(stringBuffer.length()));
                    map.put("detail_data", stringBuffer.toString());
                }
            }
        }

        private HiHealthKitData d(List list) {
            if (!HiCommonUtil.b(list)) {
                Object obj = list.get(0);
                if (obj instanceof HiHealthKitData) {
                    return (HiHealthKitData) obj;
                }
            }
            LogUtil.a("HiHlthKitQryHlp", "List is null or class cast exception");
            return new HiHealthKitData();
        }

        private List<HiHealthKitData> c() {
            ArrayList arrayList = new ArrayList(10);
            Iterator<List> it = this.f12495c.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next());
            }
            return arrayList;
        }

        private HiHealthKitData c(HiHealthData hiHealthData) {
            HiHealthKitData hiHealthKitData = new HiHealthKitData();
            HiHealthKitQueryHelper.b(hiHealthData, hiHealthKitData, this.e.b());
            hiHealthKitData.setType(hiHealthData.getType());
            hiHealthKitData.setTimeInterval(hiHealthData.getStartTime(), hiHealthData.getEndTime());
            hiHealthKitData.putLong("update_time", hiHealthData.getModifiedTime());
            HashMap map = new HashMap(16);
            map.put("meta_data", hiHealthData.getMetaData());
            if (hiHealthData.getSequenceData() != null) {
                map.put("detail_data", hiHealthData.getSequenceData());
            }
            map.put("simple_data", hiHealthData.getSimpleData());
            String string = hiHealthData.getString("interpret_data");
            if (!TextUtils.isEmpty(string)) {
                map.put("interpret_data", string);
            }
            map.put("data_id", String.valueOf(hiHealthData.getDataId()));
            hiHealthKitData.setMap(map);
            return hiHealthKitData;
        }

        private void a(List<HiHealthKitData> list) {
            LogUtil.a("HiHlthKitQryHlp", "SequenceDataReadResultProxy updateSizeInfo available:", Long.valueOf(this.f12494b));
            Iterator<HiHealthKitData> it = list.iterator();
            while (it.hasNext()) {
                it.next().putLong("size", this.f12494b);
            }
        }

        private boolean d(List list, int i) {
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    HiHealthData hiHealthData = (HiHealthData) it.next();
                    this.f12494b += hiHealthData.getSequenceData() == null ? 0L : hiHealthData.getSequenceData().length();
                    arrayList.add(c(hiHealthData));
                }
                this.f12495c.add(arrayList);
            }
            return i == 2;
        }
    }

    static class b extends IDataReadResultListener.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f12488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f12489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        lbh f12490c;
        String e;
        int f;
        IDataReadResultListener h;
        HiHealthKitData n;
        int m = 0;
        int j = 0;
        int i = 0;
        int g = 0;
        boolean d = true;

        b(IDataReadResultListener iDataReadResultListener, lbh lbhVar, HiHealthDataQuery hiHealthDataQuery) {
            this.h = iDataReadResultListener;
            this.f12490c = lbhVar;
            this.f = hiHealthDataQuery.getSampleType();
            e(hiHealthDataQuery);
        }

        private void e(HiHealthDataQuery hiHealthDataQuery) {
            HiHealthDataQueryOption hiHealthDataQueryOption = hiHealthDataQuery.getHiHealthDataQueryOption();
            if (hiHealthDataQueryOption != null) {
                this.j = hiHealthDataQueryOption.getOrder();
                this.i = hiHealthDataQueryOption.getOffset();
                this.g = hiHealthDataQueryOption.getLimit();
            }
            long jP = HiDateUtil.p(System.currentTimeMillis());
            this.f12489b = hiHealthDataQuery.getEndTime() >= jP && HiHealthKitQueryHelper.f12463c.containsKey(Integer.valueOf(hiHealthDataQuery.getSampleType()));
            this.f12488a = hiHealthDataQuery.getStartTime() >= jP;
            if (this.f12489b) {
                String str = (String) HiHealthKitQueryHelper.f12463c.get(Integer.valueOf(hiHealthDataQuery.getSampleType()));
                this.e = str;
                this.n = HiHealthKitQueryHelper.b(str);
                if (this.f12488a) {
                    LogUtil.a("HiHlthKitQryHlp", "query sport data only today");
                    return;
                }
                hiHealthDataQuery.setEndTime(jP - 1);
                if (this.i <= 0 || this.g <= 0 || this.j != 1) {
                    return;
                }
                HiHealthKitData hiHealthKitData = this.n;
                if (hiHealthKitData != null && hiHealthKitData.getIntValue() > 0) {
                    hiHealthDataQueryOption.setOffset(this.i - 1);
                }
                this.f12489b = false;
            }
        }

        @Override // com.huawei.hihealth.IDataReadResultListener
        public void onResult(List list, int i, int i2) {
            LogUtil.a("HiHlthKitQryHlp", "PointDataReadResultProxy, onResult");
            if (list != null) {
                ArrayList arrayList = new ArrayList(10);
                LogUtil.a("HiHlthKitQryHlp", "PointDataReadResultProxy, size =", Integer.valueOf(list.size()));
                for (Object obj : list) {
                    if (obj != null) {
                        arrayList.add(b((HiHealthData) obj));
                    } else {
                        LogUtil.e("HiHlthKitQryHlp", "PointDataReadResultProxy, pointData obj null");
                    }
                }
                c(i, i2, arrayList);
                return;
            }
            c(i, i2);
        }

        private HiHealthKitData b(HiHealthData hiHealthData) {
            HiHealthKitData hiHealthKitData = new HiHealthKitData();
            if (this.f == HiHealthDataType.d) {
                hiHealthKitData.setType(this.f);
            } else {
                hiHealthKitData.setType(hiHealthData.getType());
            }
            HiHealthKitQueryHelper.b(hiHealthData, hiHealthKitData, this.f12490c.b());
            HiHealthKitQueryHelper.h(hiHealthData, hiHealthKitData);
            hiHealthKitData.setTimeInterval(hiHealthData.getStartTime(), hiHealthData.getEndTime());
            hiHealthKitData.putLong("update_time", hiHealthData.getModifiedTime());
            return hiHealthKitData;
        }

        private void c(int i, int i2) {
            LogUtil.a("HiHlthKitQryHlp", "PointDataReadResultProxy, datas == null");
            try {
                if (let.d(this.f12490c.d()) > 2) {
                    this.h.onResult(null, i, i2);
                    return;
                }
                if (i2 == 2) {
                    if (i != 0) {
                        this.h.onResult(null, i, i2);
                    } else if (this.f12490c.a()) {
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(Integer.valueOf(this.m));
                        this.h.onResult(arrayList, i, i2);
                    }
                }
            } catch (RemoteException e) {
                ReleaseLogUtil.b("R_HiHlthKitQryHlp", "PointDataReadResultProxy RemoteException", LogAnonymous.b(e));
            }
        }

        private void c(int i, int i2, List list) {
            this.m += list.size();
            b(i2, list);
            if (!this.f12490c.a()) {
                HiHealthKitQueryHelper.b(this.h, i, list, i2, this.f12490c.a());
            } else if (let.d(this.f12490c.d()) > 2) {
                HiHealthKitQueryHelper.b(this.h, i, list, i2, this.f12490c.a());
            }
        }

        private void b(int i, List list) {
            if (this.f12489b) {
                HiHealthKitData hiHealthKitData = this.n;
                if (hiHealthKitData == null || hiHealthKitData.getIntValue() <= 0) {
                    LogUtil.j("HiHlthKitQryHlp", "today sport data is invalid");
                    return;
                }
                LogUtil.a("HiHlthKitQryHlp", "start deal today sport data");
                if (!this.f12488a) {
                    if (this.j == 0 && i == 1) {
                        LogUtil.a("HiHlthKitQryHlp", "dealTodaySportData isAddEnd");
                        list.add(this.n);
                        this.m++;
                    }
                    if (this.j == 1 && this.d) {
                        this.d = false;
                        LogUtil.a("HiHlthKitQryHlp", "dealTodaySportData isAddStart");
                        list.add(0, this.n);
                        this.m++;
                    }
                    int i2 = this.g;
                    if (i2 <= 0 || this.m <= i2) {
                        return;
                    }
                    LogUtil.a("HiHlthKitQryHlp", "dealTodaySportData removeLast");
                    list.remove(list.size() - 1);
                    this.m--;
                    return;
                }
                if (list.isEmpty()) {
                    this.m = 1;
                }
                list.clear();
                list.add(this.n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HiHealthKitData b(final String str) {
        final i iVar = new i();
        final d dVar = new d();
        final HealthOpenSDK healthOpenSDK = new HealthOpenSDK();
        long jP = HiDateUtil.p(System.currentTimeMillis());
        final HiHealthKitData hiHealthKitData = new HiHealthKitData();
        hiHealthKitData.setStartTime(jP);
        hiHealthKitData.setEndTime(jP);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        healthOpenSDK.initSDK(BaseApplication.getContext(), new IExecuteResult() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitQueryHelper.7
            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onSuccess(Object obj) {
                LogUtil.a("HiHlthKitQryHlp", "initSDK Success");
                HiHealthKitQueryHelper.a(hiHealthKitData, iVar, dVar, healthOpenSDK, str);
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onFailed(Object obj) {
                LogUtil.e("HiHlthKitQryHlp", "initSDK failed");
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onServiceException(Object obj) {
                LogUtil.e("HiHlthKitQryHlp", "initSDK exception");
                countDownLatch.countDown();
            }
        }, "Health Kit");
        try {
            LogUtil.a("HiHlthKitQryHlp", "query today sport data count down result : ", Boolean.valueOf(countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e2) {
            ReleaseLogUtil.b("R_HiHlthKitQryHlp", "query today sport data process is interruputed", LogAnonymous.b(e2));
        }
        healthOpenSDK.destorySDK();
        return hiHealthKitData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final HiHealthKitData hiHealthKitData, i iVar, d dVar, final HealthOpenSDK healthOpenSDK, final String str) {
        healthOpenSDK.a(iVar, dVar);
        LogUtil.a("HiHlthKitQryHlp", "register stepCallback success");
        healthOpenSDK.d(new IExecuteResult() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitQueryHelper.9
            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onSuccess(Object obj) {
                if (obj == null) {
                    LogUtil.j("HiHlthKitQryHlp", "step notification result is null");
                } else {
                    healthOpenSDK.c(new IExecuteResult() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitQueryHelper.9.2
                        @Override // com.huawei.hihealth.motion.IExecuteResult
                        public void onSuccess(Object obj2) {
                            if (obj2 instanceof Bundle) {
                                int i2 = ((Bundle) obj2).getInt(str, -1);
                                LogUtil.a("HiHlthKitQryHlp", "get today ", str, " success");
                                if (i2 > -1) {
                                    hiHealthKitData.setValue(i2);
                                    return;
                                } else {
                                    LogUtil.j("HiHlthKitQryHlp", "bundle is not containsKey ", str);
                                    return;
                                }
                            }
                            LogUtil.j("HiHlthKitQryHlp", "get sport data success, but object is not instance of bundle", obj2);
                        }

                        @Override // com.huawei.hihealth.motion.IExecuteResult
                        public void onFailed(Object obj2) {
                            LogUtil.e("HiHlthKitQryHlp", "failed to get today sport data", obj2);
                        }

                        @Override // com.huawei.hihealth.motion.IExecuteResult
                        public void onServiceException(Object obj2) {
                            LogUtil.e("HiHlthKitQryHlp", "service error when get today sport data", obj2);
                        }
                    });
                }
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onFailed(Object obj) {
                LogUtil.e("HiHlthKitQryHlp", "get steps notification state failed", obj);
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onServiceException(Object obj) {
                LogUtil.e("HiHlthKitQryHlp", "steps notification service error", obj);
            }
        });
    }

    static class d implements IExecuteResult {
        private d() {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            LogUtil.a("HiHlthKitQryHlp", "onSuccess");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            LogUtil.e("HiHlthKitQryHlp", "onFailed");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            LogUtil.e("HiHlthKitQryHlp", "onServiceException");
        }
    }

    static class i implements ICommonReport {
        @Override // com.huawei.hihealth.motion.ICommonReport
        public void report(Bundle bundle) {
        }

        private i() {
        }
    }

    class h implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IDataReadResultListener f12499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        lbh f12500c;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        h(IDataReadResultListener iDataReadResultListener, lbh lbhVar) {
            this.f12499b = iDataReadResultListener;
            this.f12500c = lbhVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            len lenVar = new len();
            int iC = lck.c(i);
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray == null || sparseArray.size() <= 0) {
                HiHealthKitQueryHelper.b(this.f12499b, 0, (List) null, 2, false);
                HiHealthKitQueryHelper.this.d(lenVar, this.f12500c.c(), iC, this.f12500c.e());
            } else {
                c((List) sparseArray.get(22104), lenVar, iC);
            }
        }

        private void c(List<HiHealthData> list, len lenVar, int i) {
            if (njy.e(list)) {
                HiHealthKitQueryHelper.b(this.f12499b, i, Collections.EMPTY_LIST, 2, false);
                HiHealthKitQueryHelper.this.d(lenVar, this.f12500c.c(), i, this.f12500c.e());
                return;
            }
            ArrayList arrayList = new ArrayList(10);
            long startTime = list.get(0).getStartTime();
            long endTime = list.get(0).getEndTime();
            for (HiHealthData hiHealthData : list) {
                long startTime2 = hiHealthData.getStartTime();
                long endTime2 = hiHealthData.getEndTime();
                if (startTime - endTime2 > 60000) {
                    HiHealthKitData hiHealthKitData = new HiHealthKitData();
                    hiHealthKitData.setStartTime(startTime);
                    hiHealthKitData.setEndTime(endTime);
                    arrayList.add(hiHealthKitData);
                    endTime = endTime2;
                }
                startTime = startTime2;
            }
            HiHealthData hiHealthData2 = list.get(list.size() - 1);
            HiHealthKitData hiHealthKitData2 = new HiHealthKitData();
            hiHealthKitData2.setStartTime(hiHealthData2.getStartTime());
            hiHealthKitData2.setEndTime(endTime);
            arrayList.add(hiHealthKitData2);
            HiHealthKitQueryHelper.b(this.f12499b, i, (List) arrayList, 2, false);
            HiHealthKitQueryHelper.this.d(lenVar, this.f12500c.c(), i, this.f12500c.e());
        }
    }

    class c implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        IDataReadResultListener f12491a;
        lbh e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        c(IDataReadResultListener iDataReadResultListener, lbh lbhVar) {
            this.f12491a = iDataReadResultListener;
            this.e = lbhVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            len lenVar = new len();
            int iC = lck.c(i);
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray == null || sparseArray.size() <= 0) {
                HiHealthKitQueryHelper.b(this.f12491a, 0, (List) null, 2, false);
                HiHealthKitQueryHelper.this.d(lenVar, this.e.c(), iC, this.e.e());
                LogUtil.j("HiHlthKitQryHlp", "map is null or size=0");
                return;
            }
            ArrayList arrayList = new ArrayList(10);
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (!(sparseArray.get(sparseArray.keyAt(i3)) instanceof List)) {
                    LogUtil.j("HiHlthKitQryHlp", "map value is not List<?> type");
                } else {
                    for (HiHealthData hiHealthData : (List) sparseArray.get(sparseArray.keyAt(i3))) {
                        HiHealthKitData hiHealthKitData = new HiHealthKitData();
                        hiHealthKitData.setStartTime(hiHealthData.getStartTime());
                        hiHealthKitData.setEndTime(hiHealthData.getEndTime());
                        hiHealthKitData.putLong("update_time", hiHealthData.getModifiedTime());
                        hiHealthKitData.setType(hiHealthData.getType());
                        HiHealthKitQueryHelper.b(hiHealthData, hiHealthKitData, this.e.b());
                        arrayList.add(hiHealthKitData);
                    }
                }
            }
            if (let.d(this.e.d()) <= 3) {
                HiHealthKitQueryHelper.b(this.f12491a, 0, arrayList, 2, this.e.a());
                return;
            }
            try {
                HiDivideUtil.d(i, arrayList, this.f12491a);
                HiHealthKitQueryHelper.b(this.f12491a, 0, (List) null, 2, this.e.a());
            } catch (RemoteException e) {
                ReleaseLogUtil.b("R_HiHlthKitQryHlp", "RemoteException: ", e.getMessage(), " in SessionProxy");
            }
        }
    }

    public static String e(String str) {
        List<ProductMapInfo> listC = ProductMap.c("deviceId", str);
        if (njy.b(listC)) {
            return listC.get(0).e();
        }
        return "";
    }

    protected void d(TrendQuery trendQuery, int i2, final IDataReadResultListener iDataReadResultListener) {
        ReleaseLogUtil.c("R_HiHlthKitQryHlp", "enter queryTrends");
        List<String> listE = leo.e(trendQuery.getDataTypes());
        int[] trendPeriods = trendQuery.getTrendPeriods();
        String recordDay = trendQuery.getRecordDay();
        if (TextUtils.isEmpty(recordDay)) {
            kyd.e(listE, trendPeriods, i2, new HealthTrendListener() { // from class: lbc
                @Override // com.huawei.hihealth.data.listener.HealthTrendListener
                public final void onResult(int i3, List list) {
                    HiHealthKitQueryHelper.c(iDataReadResultListener, i3, list);
                }
            }, trendQuery.getIsForce());
        } else {
            kyd.b(listE, trendPeriods, i2, new HealthTrendListener() { // from class: lbf
                @Override // com.huawei.hihealth.data.listener.HealthTrendListener
                public final void onResult(int i3, List list) {
                    HiHealthKitQueryHelper.a(iDataReadResultListener, i3, list);
                }
            }, recordDay);
        }
    }

    public static /* synthetic */ void c(IDataReadResultListener iDataReadResultListener, int i2, List list) {
        ReleaseLogUtil.c("R_HiHlthKitQryHlp", "queryTrends resultCode: ", Integer.valueOf(i2), ", data size = ", Integer.valueOf(list.size()));
        b(iDataReadResultListener, i2, list, 2, false);
    }

    public static /* synthetic */ void a(IDataReadResultListener iDataReadResultListener, int i2, List list) {
        ReleaseLogUtil.c("R_HiHlthKitQryHlp", "queryTrends resultCode: ", Integer.valueOf(i2), ", data size = ", Integer.valueOf(list.size()));
        b(iDataReadResultListener, i2, list, 2, false);
    }
}
