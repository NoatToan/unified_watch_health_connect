package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.HiRelationInformation;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.constant.HiHealthDataKey;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.InsertExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lbe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lbe f39787b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kzw f39789a = kzw.c();
    private int g;
    private Context h;
    private InsertExecutor j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<Integer> f39788c = new ArrayList(10);
    private static Map<Integer, int[]> e = new HashMap();
    private static final List d = new ArrayList(0);

    static {
        f39788c.add(10001);
        f39788c.add(10002);
        f39788c.add(10006);
        f39788c.add(22101);
        f39788c.add(22102);
        f39788c.add(22103);
        f39788c.add(22104);
        f39788c.add(22105);
        f39788c.add(10010);
        f39788c.add(Integer.valueOf(DicDataTypeUtil.DataType.PHYSIOLOGICAL_CYCLE.value()));
        f39788c.add(Integer.valueOf(DicDataTypeUtil.DataType.DRINK_WATER_SET.value()));
        f39788c.add(Integer.valueOf(DicDataTypeUtil.DataType.BODY_TEMPERATURE.value()));
        f39788c.add(Integer.valueOf(DicDataTypeUtil.DataType.PHYSIOLOGICAL_CYCLE_LINKAGES.value()));
        f39788c.add(Integer.valueOf(DicDataTypeUtil.DataType.ELECTROCARDIOGRAM.value()));
        f39788c.add(61002);
        f39788c.add(61001);
        int[] iArr = {9, 10007};
        e.put(22100, iArr);
        e.put(22101, iArr);
        e.put(22102, iArr);
        e.put(22103, iArr);
        e.put(22104, iArr);
        e.put(22105, iArr);
        e.put(22106, iArr);
        e.put(22107, iArr);
        int[] iArr2 = {5000};
        e.put(61002, iArr2);
        e.put(31001, new int[]{15});
        e.put(61001, iArr2);
    }

    private lbe(Context context) {
        this.h = context.getApplicationContext();
        f39787b = this;
    }

    public static void c(Context context, InsertExecutor insertExecutor) {
        synchronized (lbe.class) {
            if (f39787b == null) {
                lbe lbeVar = new lbe(context);
                f39787b = lbeVar;
                lbeVar.j = insertExecutor;
                LogUtil.a("HiHealthKitInsertHelper", "initialized");
                return;
            }
            LogUtil.a("HiHealthKitInsertHelper", "already initialized");
        }
    }

    public static lbe c() {
        lbe lbeVar = f39787b;
        if (lbeVar == null || lbeVar.j == null) {
            LogUtil.e("HiHealthKitInsertHelper", "HiHealthKitInsertHelper not initialized");
            return null;
        }
        lbeVar.g = lbeVar.f39789a.i();
        return f39787b;
    }

    public void a(ler lerVar, List<HiHealthKitData> list, IDataOperateListener iDataOperateListener) throws RemoteException {
        len lenVar = new len();
        if (list.get(0).getType() == 31001) {
            e(list, iDataOperateListener, lenVar, lerVar);
        } else {
            a(lerVar, list, iDataOperateListener, lenVar);
        }
    }

    private void a(final ler lerVar, final List<HiHealthKitData> list, final IDataOperateListener iDataOperateListener, final len lenVar) throws RemoteException {
        int iA = this.f39789a.a(lerVar.c());
        LogUtil.a("HiHealthKitInsertHelper", lerVar.a(), " appId:", Integer.valueOf(iA), " userId:", Integer.valueOf(this.g));
        this.j.execute(new Runnable() { // from class: lbe.4
            @Override // java.lang.Runnable
            public void run() {
                HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
                for (HiHealthKitData hiHealthKitData : list) {
                    hiDataDeleteOption.addTimeInterval(new HiTimeInterval(hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime()));
                }
                try {
                    int type = ((HiHealthKitData) list.get(0)).getType();
                    hiDataDeleteOption.setTypes(leo.d(type));
                    final boolean zD = lbe.this.d(type);
                    final boolean zB = lbe.this.b(list);
                    ktr.b().e(hiDataDeleteOption, new IDataOperateListener() { // from class: lbe.4.5
                        @Override // android.os.IInterface
                        public IBinder asBinder() {
                            return null;
                        }

                        @Override // com.huawei.hihealth.IDataOperateListener
                        public void onResult(int i, List list2) throws RemoteException {
                            ReleaseLogUtil.d("HiH_HiHealthKitInsertHelper", "HiHealthApiManager deleteHiHealthData errorCode = ", Integer.valueOf(i));
                            iDataOperateListener.onResult(i, Collections.EMPTY_LIST);
                            lenVar.d(lbe.this.h, lerVar.e(i));
                            if (i == 0) {
                                if (zD || zB) {
                                    ReleaseLogUtil.d("HiH_HiHealthKitInsertHelper", "delete success and sync cloud");
                                    lbe.this.e(Integer.MIN_VALUE);
                                }
                            }
                        }
                    }, true, false);
                } catch (RemoteException e2) {
                    ReleaseLogUtil.a("HiH_HiHealthKitInsertHelper", "deleteHealthData() RemoteException = ", e2.getMessage());
                    try {
                        iDataOperateListener.onResult(4, lbe.d);
                    } catch (RemoteException e3) {
                        ReleaseLogUtil.a("HiH_HiHealthKitInsertHelper", "onResult RemoteException = ", e3.getMessage());
                    }
                    lenVar.d(lbe.this.h, lerVar.e(4));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        ReleaseLogUtil.d("HiH_HiHealthKitInsertHelper", "syncType = ", Integer.valueOf(i));
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        if (i == Integer.MIN_VALUE) {
            hiSyncOption.setSyncDataType(20000);
        } else {
            hiSyncOption.setSyncDataType(i);
        }
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        HiHealthNativeApi.a(this.h).synCloud(hiSyncOption, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<Integer> list) {
        ReleaseLogUtil.d("HiH_HiHealthKitInsertHelper", "syncType = ", list.toString());
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataTypes(list);
        hiSyncOption.setForceSync(true);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        HiHealthNativeApi.a(this.h).synCloud(hiSyncOption, null);
    }

    public void b(final List<HiHealthKitData> list, final IDataOperateListener iDataOperateListener, String str) throws RemoteException {
        a(list.get(0), str);
        LogUtil.a("HiHealthKitInsertHelper", "save type ", Integer.valueOf(list.get(0).getType()));
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (HiHealthKitData hiHealthKitData : list) {
            HiHealthData hiHealthData = new HiHealthData(hiHealthKitData.getType());
            String string = hiHealthKitData.getString("device_uniquecode");
            if (string == null) {
                string = "-1";
            }
            hiHealthData.setDeviceUuid(string);
            hiHealthData.setStartTime(hiHealthKitData.getStartTime());
            hiHealthData.setEndTime(hiHealthKitData.getEndTime());
            if (hiHealthKitData.getUpdateTime() != 0) {
                hiHealthData.setModifiedTime(hiHealthKitData.getUpdateTime());
            }
            hiHealthData.setMetaData(hiHealthKitData.getString("metadata"));
            if (lcq.c(hiHealthKitData.getType())) {
                arrayList2.add(d(hiHealthKitData));
            } else {
                f(hiHealthKitData, hiHealthData);
                arrayList.add(hiHealthData);
            }
        }
        if (arrayList2.isEmpty()) {
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption(arrayList);
            hiDataInsertOption.setPackageName(str);
            final boolean zD = d(arrayList);
            final boolean zB = b(list);
            ktr.b().b(hiDataInsertOption, new IDataOperateListener.Stub() { // from class: lbe.3
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i, List list2) throws RemoteException {
                    if (i == 0 && (zD || zB)) {
                        LogUtil.a("HiHealthKitInsertHelper", "some need sync cloud types");
                        lbe.this.e((List<Integer>) new ArrayList(lbe.this.e((Collection<Integer>) lbe.this.a((List<HiHealthKitData>) list))));
                    }
                    ReleaseLogUtil.a("HiH_HiHealthKitInsertHelper", "HiHealthApiManager insertHiHealthData errorCode =", Integer.valueOf(i));
                    iDataOperateListener.onResult(i, list2);
                }
            }, list.get(0).getBoolean("insertRealTime"), false);
            return;
        }
        e(arrayList2, iDataOperateListener);
    }

    private boolean d(List<HiHealthData> list) {
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            if (f39788c.contains(Integer.valueOf(it.next().getType()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(int i) {
        return f39788c.contains(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(List<HiHealthKitData> list) {
        Iterator<HiHealthKitData> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getBoolean("sync_cloud_now")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<Integer> e(Collection<Integer> collection) {
        HashSet hashSet = new HashSet();
        for (Integer num : collection) {
            if (HiHealthDictManager.a(this.h).a(num.intValue()) != null) {
                hashSet.add(num);
            } else if (e.containsKey(num)) {
                for (int i : e.get(num)) {
                    hashSet.add(Integer.valueOf(i));
                }
            } else {
                hashSet.clear();
                hashSet.add(20000);
                break;
            }
        }
        LogUtil.a("HiHealthKitInsertHelper", "dataType2SyncDataType: ", hashSet);
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<Integer> a(List<HiHealthKitData> list) {
        HashSet hashSet = new HashSet();
        Iterator<HiHealthKitData> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(it.next().getType()));
        }
        LogUtil.a("HiHealthKitInsertHelper", "getTypesByDataList: ", hashSet);
        return hashSet;
    }

    private HiUserPreference d(HiHealthKitData hiHealthKitData) {
        return new HiUserPreference(lcq.d(hiHealthKitData.getType()), (String) hiHealthKitData.getMap().get(Integer.valueOf(hiHealthKitData.getType())));
    }

    /* JADX INFO: renamed from: lbe$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f39790c;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            f39790c = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39790c[HiHealthDataType.Category.STAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39790c[HiHealthDataType.Category.REALTIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39790c[HiHealthDataType.Category.SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39790c[HiHealthDataType.Category.SEQUENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39790c[HiHealthDataType.Category.BUSINESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private void f(HiHealthKitData hiHealthKitData, HiHealthData hiHealthData) {
        switch (AnonymousClass1.f39790c[HiHealthDataType.d(hiHealthKitData.getType()).ordinal()]) {
            case 1:
            case 2:
            case 3:
                b(hiHealthKitData, hiHealthData);
                break;
            case 4:
                j(hiHealthKitData, hiHealthData);
                break;
            case 5:
                d(hiHealthKitData, hiHealthData);
                break;
            case 6:
                c(hiHealthKitData, hiHealthData);
                break;
        }
    }

    private void b(HiHealthKitData hiHealthKitData, HiHealthData hiHealthData) {
        int iA = lff.a(hiHealthKitData.getType());
        if (iA == 0) {
            hiHealthData.setValue(hiHealthKitData.getIntValue());
        } else if (iA == 3) {
            hiHealthData.setValue(hiHealthKitData.getDoubleValue());
        } else {
            ReleaseLogUtil.e("HiH_HiHealthKitInsertHelper", "precision is not supported");
        }
    }

    private void j(HiHealthKitData hiHealthKitData, HiHealthData hiHealthData) {
        if (hiHealthKitData.getType() == DicDataTypeUtil.DataType.OSA_SET.value()) {
            a(hiHealthKitData, hiHealthData);
            return;
        }
        if (HiHealthDictManager.a(this.h).k(hiHealthData.getType()) && hiHealthKitData.getMap() == null) {
            leo.c(hiHealthKitData.getContentValue(), String.valueOf(2031), String.valueOf(2001));
            leo.c(hiHealthKitData.getContentValue(), String.valueOf(2028), String.valueOf(2090));
            e(hiHealthKitData, hiHealthData);
            return;
        }
        Map map = hiHealthKitData.getMap();
        if (map.containsKey(2018)) {
            int iValue = DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value();
            map.put(Integer.valueOf(iValue), (Double) map.get(2018));
            map.remove(2018);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getKey()).intValue() == 2031) {
                hiHealthData.putDouble(BleConstants.BODY_FAT_RATE, ((Double) entry.getValue()).doubleValue());
            } else if (((Integer) entry.getKey()).intValue() == 2028) {
                hiHealthData.putDouble("protein", ((Double) entry.getValue()).doubleValue());
            } else {
                hiHealthData.putDouble(HiHealthDataKey.a(((Integer) entry.getKey()).intValue()), ((Double) entry.getValue()).doubleValue());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    private void e(HiHealthKitData hiHealthKitData, HiHealthData hiHealthData) {
        byte b2;
        HashMap map = new HashMap(16);
        HashMap map2 = new HashMap(16);
        Iterator<Integer> it = HiHealthDictManager.a(this.h).f(hiHealthData.getType()).iterator();
        while (it.hasNext()) {
            HiHealthDictField hiHealthDictFieldC = HiHealthDictManager.a(this.h).c(it.next().intValue());
            if (hiHealthDictFieldC == null || hiHealthDictFieldC.d() == null) {
                ReleaseLogUtil.a("HiH_HiHealthKitInsertHelper", "invalid dict field");
                return;
            }
            String strD = hiHealthDictFieldC.d();
            int iE = hiHealthDictFieldC.e();
            if (hiHealthKitData.getContentValue().containsKey(String.valueOf(iE))) {
                strD.hashCode();
                switch (strD) {
                    case "Integer":
                        b2 = 0;
                        break;
                    case "Long":
                        b2 = 1;
                        break;
                    case "Float":
                        b2 = 2;
                        break;
                    case "Double":
                        b2 = 3;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    map.put(Integer.valueOf(iE), Double.valueOf(hiHealthKitData.getInt(String.valueOf(iE))));
                } else if (b2 == 1) {
                    map.put(Integer.valueOf(iE), Double.valueOf(hiHealthKitData.getLong(String.valueOf(iE))));
                } else if (b2 == 2) {
                    map.put(Integer.valueOf(iE), Double.valueOf(hiHealthKitData.getFloat(String.valueOf(iE))));
                } else if (b2 == 3) {
                    map.put(Integer.valueOf(iE), Double.valueOf(hiHealthKitData.getDouble(String.valueOf(iE))));
                } else {
                    map2.put(Integer.valueOf(iE), hiHealthKitData.getString(String.valueOf(iE)));
                }
            }
        }
        hiHealthData.setFieldsValue(HiJsonUtil.d(map));
        hiHealthData.setFieldsMetaData(HiJsonUtil.d(map2));
    }

    private void a(HiHealthKitData hiHealthKitData, HiHealthData hiHealthData) {
        Map map = hiHealthKitData.getMap();
        HashMap map2 = new HashMap(16);
        map2.put(Integer.valueOf(DicDataTypeUtil.DataType.OSA_LEVEL.value()), Double.valueOf(c(map, Integer.valueOf(DicDataTypeUtil.DataType.OSA_LEVEL.value()))));
        map2.put(Integer.valueOf(DicDataTypeUtil.DataType.OSA_AVG_CNT_PER_HOUR.value()), Double.valueOf(c(map, Integer.valueOf(DicDataTypeUtil.DataType.OSA_AVG_CNT_PER_HOUR.value()))));
        hiHealthData.setFieldsValue(HiJsonUtil.d(map2));
        Object obj = map.get(Integer.valueOf(DicDataTypeUtil.DataType.OSA_DETAIL_HALF_HOUR.value()));
        if (obj != null) {
            HashMap map3 = new HashMap(16);
            map3.put(Integer.valueOf(DicDataTypeUtil.DataType.OSA_DETAIL_HALF_HOUR.value()), obj.toString());
            hiHealthData.setFieldsMetaData(HiJsonUtil.d(map3));
        }
        new HiDataInsertOption().addData(hiHealthData);
    }

    private void d(HiHealthKitData hiHealthKitData, HiHealthData hiHealthData) {
        if (HiHealthDictManager.a(this.h).k(hiHealthKitData.getType())) {
            hiHealthData.setSequenceData(hiHealthKitData.getString("detail_data"));
            hiHealthData.setSimpleData(hiHealthKitData.getString("simple_data"));
            return;
        }
        Map map = hiHealthKitData.getMap();
        if (hiHealthKitData.getType() != 31001) {
            if (hiHealthKitData.getType() == 30029) {
                a(map, hiHealthData);
                return;
            } else {
                ReleaseLogUtil.e("HiH_HiHealthKitInsertHelper", "wrong sequence type");
                return;
            }
        }
        if (map == null || map.isEmpty()) {
            hiHealthData.setSequenceData(hiHealthKitData.getString("detail_data"));
            hiHealthData.setSimpleData(hiHealthKitData.getString("simple_data"));
            hiHealthData.setMetaData(hiHealthKitData.getString("meta_data"));
        } else {
            hiHealthData.setSequenceData(kzw.c(map, "detail_data"));
            hiHealthData.setSimpleData(kzw.c(map, "simple_data"));
            hiHealthData.setMetaData(kzw.c(map, "meta_data"));
        }
    }

    private void c(HiHealthKitData hiHealthKitData, HiHealthData hiHealthData) {
        Map map = hiHealthKitData.getMap();
        double dC = c(map, (Object) 2201);
        double dC2 = c(map, (Object) 2202);
        double dC3 = c(map, (Object) 2203);
        String strValueOf = String.valueOf(map.get(2204));
        LogUtil.a("HiHealthKitInsertHelper", " save value: ", Double.valueOf(dC), " dataId: ", Double.valueOf(dC3), " source: ", strValueOf);
        ArrayList arrayList = new ArrayList(10);
        HiRelationInformation hiRelationInformation = new HiRelationInformation();
        hiRelationInformation.a((int) dC3);
        hiRelationInformation.c((int) dC2);
        arrayList.add(hiRelationInformation);
        String json = new Gson().toJson(arrayList, new TypeToken<List<HiRelationInformation>>() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitInsertHelper$3
        }.getType());
        hiHealthData.setValue(dC);
        hiHealthData.setDataSource(strValueOf);
        hiHealthData.setRelationInformations(json);
        hiHealthData.setRelationFlag(true);
    }

    private void e(List<HiUserPreference> list, IDataOperateListener iDataOperateListener) throws RemoteException {
        if (list.isEmpty()) {
            ReleaseLogUtil.e("HiH_HiHealthKitInsertHelper", "userPreferences is empty");
            iDataOperateListener.onResult(2, Collections.EMPTY_LIST);
            return;
        }
        if (this.g <= 0) {
            ReleaseLogUtil.e("HiH_HiHealthKitInsertHelper", "userID <= 0");
            iDataOperateListener.onResult(4, Collections.EMPTY_LIST);
            return;
        }
        for (HiUserPreference hiUserPreference : list) {
            hiUserPreference.setUserId(this.g);
            if (!kxs.c(this.h).b(hiUserPreference)) {
                iDataOperateListener.onResult(4, Collections.EMPTY_LIST);
                return;
            }
        }
        iDataOperateListener.onResult(0, Arrays.asList(true, true));
        ReleaseLogUtil.d("HiH_HiHealthKitInsertHelper", "save config success");
    }

    private void a(HiHealthKitData hiHealthKitData, String str) {
        if (str.startsWith("com.huawei.health.device")) {
            ReleaseLogUtil.e("HiH_HiHealthKitInsertHelper", "registerNewDevice third device for h5");
            return;
        }
        String string = hiHealthKitData.getString("device_uniquecode");
        int i = hiHealthKitData.getInt("deviceType");
        LogUtil.d("HiHealthKitInsertHelper", "saveSample registDeviceInfo uniqueCode:", string);
        if (TextUtils.isEmpty(string) || i == 0) {
            ReleaseLogUtil.e("HiH_HiHealthKitInsertHelper", "uniqueCode or deviceType is empty, doesn't need registerNewDevice");
            return;
        }
        if (i == 1 || "-1".equals(string)) {
            ReleaseLogUtil.e("HiH_HiHealthKitInsertHelper", "deviceType or uuid is manual_input, register is not allowed");
            return;
        }
        if (kwy.b(this.h).b(string) == null) {
            HiDeviceInfo hiDeviceInfo = new HiDeviceInfo(i);
            hiDeviceInfo.setDeviceUniqueCode(string);
            hiDeviceInfo.setDeviceName(hiHealthKitData.getString("device_name"));
            hiDeviceInfo.setModel(hiHealthKitData.getString("device_model"));
            ReleaseLogUtil.d("HiH_HiHealthKitInsertHelper", "saveSample registerDeviceInfo result:", Boolean.valueOf(kwy.b(this.h).c(hiDeviceInfo) > 0));
            return;
        }
        ReleaseLogUtil.d("HiH_HiHealthKitInsertHelper", "device has been registered");
    }

    protected HiHealthData a(Map map, HiHealthData hiHealthData) {
        if (map != null && hiHealthData != null) {
            HiTrackMetaData hiTrackMetaData = new HiTrackMetaData();
            hiTrackMetaData.setSportType(kzw.b(map, BleConstants.SPORT_TYPE));
            hiTrackMetaData.setTotalTime(kzw.a(map, "totalTime"));
            hiTrackMetaData.setTotalCalories(kzw.b(map, BleConstants.TOTAL_CALORIES));
            HashMap map2 = new HashMap(16);
            map2.put("skipNum", kzw.c(map, "skipNum"));
            map2.put("skipSpeed", kzw.c(map, "skipSpeed"));
            map2.put("stumblingRope", map.containsKey("stumblingRope") ? kzw.c(map, "stumblingRope") : "-1");
            map2.put("maxSkippingTimes", map.containsKey("maxSkippingTimes") ? kzw.c(map, "maxSkippingTimes") : "-1");
            hiTrackMetaData.setExtendTrackDataMap(map2);
            hiTrackMetaData.setHasTrackPoint(false);
            hiTrackMetaData.setChiefSportDataType(7);
            hiTrackMetaData.setSportDataSource(5);
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.serializeSpecialFloatingPointValues();
            hiHealthData.setMetaData(gsonBuilder.create().toJson(hiTrackMetaData, HiTrackMetaData.class));
            hiHealthData.setSequenceData("0");
            hiHealthData.setType(30001);
        }
        return hiHealthData;
    }

    private double c(Map map, Object obj) throws NumberFormatException {
        Object obj2 = map.get(obj);
        if (obj2 instanceof Double) {
            return ((Double) obj2).doubleValue();
        }
        if (obj2 instanceof Integer) {
            return ((Integer) obj2).doubleValue();
        }
        if (obj2 instanceof String) {
            return Double.valueOf((String) obj2).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IDataOperateListener iDataOperateListener, int i, List list) {
        try {
            iDataOperateListener.onResult(i, list);
        } catch (RemoteException e2) {
            ReleaseLogUtil.a("HiH_HiHealthKitInsertHelper", "notifyResult RemoteException: ", e2.getMessage());
        }
    }

    private void e(List<HiHealthKitData> list, final IDataOperateListener iDataOperateListener, final len lenVar, final ler lerVar) {
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption(new int[]{31001});
        for (HiHealthKitData hiHealthKitData : list) {
            hiDataDeleteOption.addTimeInterval(new HiTimeInterval(hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime()));
        }
        HiHealthManager.d(this.h).deleteHiHealthData(hiDataDeleteOption, new HiDataOperateListener() { // from class: lbe.5
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("HiH_HiHealthKitInsertHelper", "deleteEcgData, errorCode: ", Integer.valueOf(i));
                int i2 = i == 0 ? 0 : 4;
                lbe.this.a(iDataOperateListener, i2, Collections.EMPTY_LIST);
                lenVar.d(lbe.this.h, lerVar.e(i2));
                if (i == 0) {
                    lbe.this.e(Integer.MIN_VALUE);
                    LogUtil.a("HiHealthKitInsertHelper", "Sync cloud after deleting ECG data");
                }
            }
        });
    }
}
