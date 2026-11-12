package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hihealth.HealthKitDictQuery;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataAggregateProOption;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiHealthDataQueryOption;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.HiMetadataFilter;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.IAggregateListener;
import com.huawei.hihealth.IAggregateListenerEx;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.IMultiDataClientListener;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.constant.HiHealthDataKey;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lbb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private len f39773c;
    private String d;
    private Context e;

    public lbb(Context context, String str, len lenVar) {
        this(context, str, lenVar, null);
    }

    lbb(Context context, String str, len lenVar, String str2) {
        this.e = context.getApplicationContext();
        this.d = str;
        this.f39772b = str2;
        this.f39773c = lenVar;
    }

    public void b(HealthKitDictQuery healthKitDictQuery, IDataReadResultListener iDataReadResultListener, lbh lbhVar) throws RemoteException {
        int sampleType = healthKitDictQuery.getSampleType();
        if (sampleType != 10001 && HiHealthDataType.d(sampleType) == HiHealthDataType.Category.SET) {
            e(healthKitDictQuery, iDataReadResultListener, lbhVar);
        } else {
            i(healthKitDictQuery, iDataReadResultListener, lbhVar);
        }
    }

    public void a(HealthKitDictQuery healthKitDictQuery, IDataReadResultListener iDataReadResultListener, lbh lbhVar) throws RemoteException {
        LogUtil.a("HiHealthKitQueryDicHelper", "enter aggregate query");
        if (healthKitDictQuery.getBoolean("isSportType").booleanValue()) {
            d(healthKitDictQuery, iDataReadResultListener, lbhVar);
        } else {
            e(healthKitDictQuery, iDataReadResultListener, lbhVar);
        }
    }

    public void c(final HealthKitDictQuery healthKitDictQuery, final IDataReadResultListener iDataReadResultListener, final lbh lbhVar) throws RemoteException {
        HiTimeInterval hiTimeInterval = new HiTimeInterval(healthKitDictQuery.getStartTime(), healthKitDictQuery.getEndTime());
        ktr.b().d(b(healthKitDictQuery.getSampleType()), hiTimeInterval, true, new IMultiDataClientListener.Stub() { // from class: lbb.5
            @Override // com.huawei.hihealth.IMultiDataClientListener
            public void onMultiTypeResult(Map map) {
            }

            @Override // com.huawei.hihealth.IMultiDataClientListener
            public void onMergeTypeResult(List list) {
                ReleaseLogUtil.d("HiHealthKitQueryDicHelper", "getDataSource onResult success.");
                lbb.this.a(lbb.this.a(list, healthKitDictQuery, lbhVar), 0, 2, iDataReadResultListener);
                lbb lbbVar = lbb.this;
                lbbVar.d(lbbVar.f39773c, lbhVar.c(), 0, lbhVar.e());
            }
        });
    }

    private void d(HealthKitDictQuery healthKitDictQuery, final IDataReadResultListener iDataReadResultListener, final lbh lbhVar) throws RemoteException {
        ReleaseLogUtil.d("HiHealthKitQueryDicHelper", "enter getAggregateSportStatData");
        HiHealthNativeApi.a(this.e).aggregateSportStatData(e(healthKitDictQuery), new HiAggregateListener() { // from class: lbb.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List list, int i, int i2) {
                ReleaseLogUtil.d("HiHealthKitQueryDicHelper", "aggregateSportStatData onResult: errorCode = ", Integer.valueOf(i), ", resultType = ", Integer.valueOf(i2));
                int iC = lck.c(i);
                lbb.this.a(lbb.this.e(list, lbhVar), iC, i2, iDataReadResultListener);
                if (i2 == 2) {
                    lbb lbbVar = lbb.this;
                    lbbVar.d(lbbVar.f39773c, lbhVar.c(), iC, lbhVar.e());
                }
            }
        });
    }

    private HiSportStatDataAggregateOption e(HealthKitDictQuery healthKitDictQuery) {
        int sampleType = healthKitDictQuery.getSampleType() - 30000;
        int i = healthKitDictQuery.getInt("timeUnit");
        long startTime = healthKitDictQuery.getStartTime();
        long endTime = healthKitDictQuery.getEndTime();
        int order = healthKitDictQuery.getHiHealthDataQueryOption().getOrder();
        LogUtil.a("HiHealthKitQueryDicHelper", "requestTrackMonthData sportType = ", Integer.valueOf(sampleType), "timeUnit:", Integer.valueOf(i));
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setSortOrder(order);
        hiSportStatDataAggregateOption.setStartTime(startTime);
        hiSportStatDataAggregateOption.setEndTime(endTime);
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{sampleType});
        int[] sportTypeMap = ldy.getSportTypeMap(sampleType);
        String[] sportTypeQueryKeys = ldy.getSportTypeQueryKeys(sampleType);
        LogUtil.a("HiHealthKitQueryDicHelper", "types", sportTypeMap);
        hiSportStatDataAggregateOption.setConstantsKey(sportTypeQueryKeys);
        hiSportStatDataAggregateOption.setType(sportTypeMap);
        hiSportStatDataAggregateOption.setGroupUnitType(i);
        hiSportStatDataAggregateOption.setReadType(0);
        return hiSportStatDataAggregateOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthKitData> e(List list, lbh lbhVar) {
        if (list == null) {
            ReleaseLogUtil.e("HiHealthKitQueryDicHelper", "dealAggregateData: hiHealthDataList is null");
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HiHealthData hiHealthData = (HiHealthData) it.next();
            HiHealthKitData hiHealthKitData = new HiHealthKitData();
            hiHealthKitData.setType(hiHealthData.getType());
            hiHealthKitData.setContentValues(hiHealthData.getValueHolder());
            arrayList.add(hiHealthKitData);
        }
        return arrayList;
    }

    private void i(HealthKitDictQuery healthKitDictQuery, IDataReadResultListener iDataReadResultListener, lbh lbhVar) throws RemoteException {
        ReleaseLogUtil.d("HiHealthKitQueryDicHelper", "enter readHiHealthDataPro");
        HiDataReadOption hiDataReadOptionA = a(healthKitDictQuery);
        IDataReadResultListener iDataReadResultListenerD = d(lbhVar, iDataReadResultListener);
        if (healthKitDictQuery.getBoolean("isSportType").booleanValue()) {
            ktr.b().a(hiDataReadOptionA, iDataReadResultListenerD, false);
            return;
        }
        ktr.b().e(new HiDataReadProOption.Builder().e(hiDataReadOptionA).a(healthKitDictQuery.getString("package_name")).a(healthKitDictQuery.getInt("sequence_data_type")).d(d(healthKitDictQuery)).b(), iDataReadResultListenerD, false);
    }

    private String d(HealthKitDictQuery healthKitDictQuery) {
        if (HiHealthDataType.d(healthKitDictQuery.getSampleType()) != HiHealthDataType.Category.SEQUENCE) {
            ReleaseLogUtil.e("HiHealthKitQueryDicHelper", "unsupported filter condition");
            return "";
        }
        ArrayList<String> filterKeys = healthKitDictQuery.getFilterKeys();
        ArrayList<String> filterValues = healthKitDictQuery.getFilterValues();
        if (filterKeys == null || filterKeys.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < filterKeys.size(); i++) {
            arrayList.add(new HiMetadataFilter.MetadataFilterExpression(filterKeys.get(i), filterValues.get(i), false));
        }
        return HiJsonUtil.d(new HiMetadataFilter(arrayList));
    }

    private IDataReadResultListener d(final lbh lbhVar, final IDataReadResultListener iDataReadResultListener) {
        return new IDataReadResultListener.Stub() { // from class: lbb.3
            @Override // com.huawei.hihealth.IDataReadResultListener
            public void onResult(List list, int i, int i2) throws RemoteException {
                ReleaseLogUtil.d("HiHealthKitQueryDicHelper", "getDataReadResultListener onResult: errorCode = ", Integer.valueOf(i), ", resultType = ", Integer.valueOf(i2));
                int iC = lck.c(i);
                lbb.this.a(lbb.this.d(list, lbhVar, (List<Integer>) null), iC, i2, iDataReadResultListener);
                if (i2 == 2) {
                    lbb lbbVar = lbb.this;
                    lbbVar.d(lbbVar.f39773c, lbhVar.c(), iC, lbhVar.e());
                }
            }
        };
    }

    private void e(final HealthKitDictQuery healthKitDictQuery, final IDataReadResultListener iDataReadResultListener, final lbh lbhVar) throws RemoteException {
        ReleaseLogUtil.d("HiHealthKitQueryDicHelper", "enter aggregateHiHealthDataPro");
        List<HiDataAggregateProOption> arrayList = new ArrayList<>();
        if (h(healthKitDictQuery)) {
            arrayList = c(healthKitDictQuery);
        } else {
            arrayList.add(b(healthKitDictQuery));
        }
        ktr.b().b(arrayList, (IAggregateListenerEx) new IAggregateListenerEx.Stub() { // from class: lbb.1
            @Override // com.huawei.hihealth.IAggregateListenerEx
            public void onResult(List list, int i, int i2) {
                ReleaseLogUtil.d("HiHealthKitQueryDicHelper", "onResult: errorCode = ", Integer.valueOf(i), ", resultType = ", Integer.valueOf(i2));
                int iC = lck.c(i);
                List listD = lbb.this.d(list, lbhVar, healthKitDictQuery.getSubTypes());
                if (healthKitDictQuery.getSampleType() == 10007) {
                    try {
                        lbb.this.c((List<HiHealthKitData>) listD, lbhVar, healthKitDictQuery);
                    } catch (RemoteException e) {
                        ReleaseLogUtil.a("HiH_HiHealthKitQueryDicHelper", "query manual or phone monitor sleep data RemoteException: ", e.getMessage());
                    }
                }
                lbb.this.a(listD, iC, i2, iDataReadResultListener);
                if (i2 == 2) {
                    lbb lbbVar = lbb.this;
                    lbbVar.d(lbbVar.f39773c, lbhVar.c(), iC, lbhVar.e());
                }
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthKitData> d(List list, lbh lbhVar, List<Integer> list2) {
        if (list == null) {
            ReleaseLogUtil.e("HiHealthKitQueryDicHelper", "dealHiHealthKitData: hiHealthDataList is null");
            return null;
        }
        LogUtil.a("HiHealthKitQueryDicHelper", "data size is ", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HiHealthData hiHealthData = (HiHealthData) it.next();
            HiHealthKitData hiHealthKitData = new HiHealthKitData();
            d(hiHealthData, hiHealthKitData, lbhVar.b());
            hiHealthKitData.setType(hiHealthData.getType());
            hiHealthKitData.setTimeInterval(hiHealthData.getStartTime(), hiHealthData.getEndTime());
            hiHealthKitData.putLong("update_time", hiHealthData.getModifiedTime());
            c(hiHealthData, hiHealthKitData, lbhVar, list2);
            arrayList.add(hiHealthKitData);
        }
        return arrayList;
    }

    private void c(HiHealthData hiHealthData, HiHealthKitData hiHealthKitData, lbh lbhVar, List<Integer> list) {
        int i;
        try {
            i = Integer.parseInt(lbhVar.e());
        } catch (NumberFormatException e) {
            ReleaseLogUtil.a("HiH_HiHealthKitQueryDicHelper", e.getMessage());
            i = 0;
        }
        int i2 = AnonymousClass8.e[HiHealthDataType.d(i).ordinal()];
        if (i2 == 1) {
            a(hiHealthData, hiHealthKitData);
            return;
        }
        if (i2 == 2) {
            d(hiHealthData, hiHealthKitData);
        } else if (i2 == 3) {
            c(hiHealthData, hiHealthKitData, i, list);
        } else {
            ReleaseLogUtil.d("HiHealthKitQueryDicHelper", "dealHiHealthKitData: query type not support");
        }
    }

    /* JADX INFO: renamed from: lbb$8, reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            e = iArr;
            try {
                iArr[HiHealthDataType.Category.SEQUENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[HiHealthDataType.Category.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[HiHealthDataType.Category.SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void a(HiHealthData hiHealthData, HiHealthKitData hiHealthKitData) {
        hiHealthKitData.putString("meta_data", hiHealthData.getMetaData());
        hiHealthKitData.putString("detail_data", hiHealthData.getSequenceData());
        hiHealthKitData.putString("simple_data", hiHealthData.getSimpleData());
        hiHealthKitData.putInt("deviceType", hiHealthData.getInt("trackdata_deviceType"));
        hiHealthKitData.putString("data_id", String.valueOf(hiHealthData.getDataId()));
        String string = hiHealthData.getString("interpret_data");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        hiHealthKitData.putString("interpret_data", string);
    }

    private void d(HiHealthData hiHealthData, HiHealthKitData hiHealthKitData) {
        HiHealthDictField hiHealthDictFieldC = HiHealthDictManager.a(this.e).c(hiHealthData.getType());
        if (hiHealthDictFieldC == null) {
            ReleaseLogUtil.e("HiHealthKitQueryDicHelper", "HiHealthDictField is null, type is ", Integer.valueOf(hiHealthData.getType()));
            return;
        }
        String strD = hiHealthDictFieldC.d();
        if ("Integer".equals(strD)) {
            hiHealthKitData.putInt(String.valueOf(hiHealthData.getType()), hiHealthData.getIntValue());
            return;
        }
        if ("Double".equals(strD)) {
            hiHealthKitData.putDouble(String.valueOf(hiHealthData.getType()), hiHealthData.getValue());
        } else if ("Float".equals(strD)) {
            hiHealthKitData.putFloat(String.valueOf(hiHealthData.getType()), hiHealthData.getFloatValue());
        } else {
            hiHealthKitData.putString("metadata", hiHealthData.getMetaData());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    private void c(HiHealthData hiHealthData, HiHealthKitData hiHealthKitData, int i, List<Integer> list) {
        byte b2;
        if (!HiHealthDictManager.a(this.e).k(i)) {
            a(hiHealthData, hiHealthKitData, i);
            return;
        }
        List<Integer> listF = HiHealthDictManager.a(this.e).f(i);
        if (list != null && !list.isEmpty()) {
            listF.retainAll(list);
        }
        b(hiHealthData);
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            HiHealthDictField hiHealthDictFieldC = HiHealthDictManager.a(this.e).c(it.next().intValue());
            if (hiHealthDictFieldC != null) {
                String strD = hiHealthDictFieldC.d();
                String strC = hiHealthDictFieldC.c();
                int iE = hiHealthDictFieldC.e();
                if (hiHealthData.get(strC) != null) {
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
                        hiHealthKitData.putInt(String.valueOf(iE), hiHealthData.getInt(strC));
                    } else if (b2 == 1) {
                        hiHealthKitData.putLong(String.valueOf(iE), hiHealthData.getLong(strC));
                    } else if (b2 == 2) {
                        hiHealthKitData.putFloat(String.valueOf(iE), hiHealthData.getFloat(strC));
                    } else if (b2 == 3) {
                        hiHealthKitData.putDouble(String.valueOf(iE), hiHealthData.getDouble(strC));
                    } else {
                        hiHealthKitData.putString("metadata", hiHealthData.getMetaData());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthKitData> list, lbh lbhVar, HealthKitDictQuery healthKitDictQuery) throws RemoteException {
        if (list == null) {
            return;
        }
        for (final HiHealthKitData hiHealthKitData : list) {
            int i = hiHealthKitData.getInt(String.valueOf(44110));
            if (i == Integer.parseInt("001", 16)) {
                final HealthKitDictQuery healthKitDictQuery2 = new HealthKitDictQuery(DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD.value(), HiDateUtil.o(hiHealthKitData.getStartTime()), HiDateUtil.m(hiHealthKitData.getEndTime()));
                healthKitDictQuery2.putSubTypes(healthKitDictQuery.getSubTypes());
                healthKitDictQuery2.setValueFilterType(DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_BED_TIME.value());
                final lbh lbhVar2 = new lbh(lbhVar.b(), lbhVar.c(), lbhVar.d(), String.valueOf(DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD.value()));
                ktr.b().d(b(healthKitDictQuery2), (IAggregateListener) new IAggregateListener.Stub() { // from class: lbb.2
                    @Override // com.huawei.hihealth.IAggregateListener
                    public void onResult(List list2, int i2, int i3) {
                        LogUtil.a("HiHealthKitQueryDicHelper", "onResult: errorCode = ", Integer.valueOf(i2), ", resultType = ", Integer.valueOf(i3));
                        lbb.this.d(hiHealthKitData, (List<HiHealthData>) list2, lbhVar2, healthKitDictQuery2.getSubTypes());
                    }
                }, false);
            } else if (i == Integer.parseInt("011", 16) || i == Integer.parseInt("00E", 16)) {
                final HealthKitDictQuery healthKitDictQuery3 = new HealthKitDictQuery(DicDataTypeUtil.DataType.SLEEP_RECORD.value(), HiDateUtil.o(hiHealthKitData.getStartTime()), HiDateUtil.m(hiHealthKitData.getEndTime()));
                healthKitDictQuery3.putSubTypes(healthKitDictQuery.getSubTypes());
                healthKitDictQuery3.setValueFilterType(DicDataTypeUtil.DataType.BED_TIME.value());
                HiDataAggregateProOption hiDataAggregateProOptionB = b(healthKitDictQuery3);
                final lbh lbhVar3 = new lbh(lbhVar.b(), lbhVar.c(), lbhVar.d(), String.valueOf(DicDataTypeUtil.DataType.SLEEP_RECORD.value()));
                ktr.b().d(hiDataAggregateProOptionB, (IAggregateListener) new IAggregateListener.Stub() { // from class: lbb.9
                    @Override // com.huawei.hihealth.IAggregateListener
                    public void onResult(List list2, int i2, int i3) {
                        LogUtil.a("HiHealthKitQueryDicHelper", "onResult: errorCode = ", Integer.valueOf(i2), ", resultType = ", Integer.valueOf(i3));
                        lbb.this.d(hiHealthKitData, (List<HiHealthData>) list2, lbhVar3, healthKitDictQuery3.getSubTypes());
                    }
                }, false);
            } else {
                LogUtil.a("HiHealthKitQueryDicHelper", "nothing to add");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HiHealthKitData hiHealthKitData, List<HiHealthData> list, lbh lbhVar, ArrayList<Integer> arrayList) {
        if (list == null || list.isEmpty()) {
            return;
        }
        List<HiHealthKitData> listD = d(list, lbhVar, arrayList);
        HiHealthKitData hiHealthKitData2 = listD.get(listD.size() - 1);
        hiHealthKitData2.setTimeInterval(hiHealthKitData.getStartTime(), hiHealthKitData.getEndTime());
        hiHealthKitData.getContentValue().putAll(hiHealthKitData2.getContentValue());
    }

    private void b(HiHealthData hiHealthData) {
        hiHealthData.putDouble("protein", leo.a(hiHealthData));
        leo.c(hiHealthData.getValueHolder(), BleConstants.BODY_FAT_RATE, "bodyFat");
        leo.c(hiHealthData.getValueHolder(), "protein", BleConstants.PROTEIN_RATE);
    }

    private void a(HiHealthData hiHealthData, HiHealthKitData hiHealthKitData, int i) {
        hiHealthKitData.putString("metadata", hiHealthData.getMetaData());
        if (i == 10001) {
            hiHealthKitData.putDouble(String.valueOf(hiHealthData.getType()), hiHealthData.getValue());
            return;
        }
        int i2 = 0;
        if (i == 10007) {
            int[] iArrE = HiHealthDataType.e();
            String[] strArrE = HiHealthDataKey.e();
            int i3 = 0;
            while (i2 < strArrE.length) {
                if (hiHealthData.containsKey(strArrE[i2]) && i3 < iArrE.length) {
                    hiHealthKitData.putDouble(String.valueOf(iArrE[i3]), hiHealthData.getDouble(strArrE[i2]));
                }
                i2++;
                i3++;
            }
            return;
        }
        int[] iArrE2 = HiHealthDataType.e(i);
        int length = iArrE2.length;
        while (i2 < length) {
            int i4 = iArrE2[i2];
            hiHealthKitData.putDouble(String.valueOf(i4), hiHealthData.getDouble(HiHealthDataKey.a(i4)));
            i2++;
        }
    }

    private void d(HiHealthData hiHealthData, HiHealthKitData hiHealthKitData, boolean z) {
        String string = hiHealthData.getString("device_uniquecode");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        String string2 = hiHealthData.getString("device_name");
        String string3 = hiHealthData.getString("device_model");
        if (!z) {
            hiHealthKitData.putString("device_uniquecode", "***");
        } else {
            hiHealthKitData.putString("device_uniquecode", string);
        }
        hiHealthKitData.putString("device_name", string2);
        hiHealthKitData.putString("device_model", string3);
        hiHealthKitData.putString("trackdata_deviceType", hiHealthData.getString("trackdata_deviceType"));
    }

    private void b(HiDataReadOption hiDataReadOption, HealthKitDictQuery healthKitDictQuery) {
        String string = healthKitDictQuery.getString("device_uniquecode");
        String string2 = healthKitDictQuery.getString("package_name");
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            hiDataReadOption.setReadType(3);
        } else if (!TextUtils.isEmpty(string)) {
            hiDataReadOption.setReadType(2);
        } else if (!TextUtils.isEmpty(string2)) {
            hiDataReadOption.setReadType(1);
        } else {
            hiDataReadOption.setReadType(0);
        }
        hiDataReadOption.setDeviceUuid(string);
    }

    private HiDataReadOption a(HealthKitDictQuery healthKitDictQuery) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        if (healthKitDictQuery.getBoolean("isSportType").booleanValue()) {
            healthKitDictQuery.setSampleType(healthKitDictQuery.getSampleType() - 30000);
        }
        hiDataReadOption.setType(new int[]{healthKitDictQuery.getSampleType()});
        hiDataReadOption.setStartTime(healthKitDictQuery.getStartTime());
        hiDataReadOption.setEndTime(healthKitDictQuery.getEndTime());
        HiHealthDataQueryOption hiHealthDataQueryOption = healthKitDictQuery.getHiHealthDataQueryOption();
        if (hiHealthDataQueryOption != null) {
            hiDataReadOption.setSortOrder(hiHealthDataQueryOption.getOrder());
            hiDataReadOption.setAnchor(hiHealthDataQueryOption.getOffset());
            hiDataReadOption.setCount(hiHealthDataQueryOption.getLimit());
        }
        b(hiDataReadOption, healthKitDictQuery);
        return hiDataReadOption;
    }

    private HiDataAggregateProOption b(HealthKitDictQuery healthKitDictQuery) {
        String strC;
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        int sampleType = healthKitDictQuery.getSampleType();
        if (sampleType == 10002 || sampleType == 10007) {
            b(sampleType, hiAggregateOption);
        } else if (HiHealthDictManager.a(this.e).k(sampleType)) {
            c(hiAggregateOption, sampleType, healthKitDictQuery.getSubTypes());
        } else {
            e(hiAggregateOption, sampleType);
        }
        hiAggregateOption.setTimeInterval(healthKitDictQuery.getStartTime(), healthKitDictQuery.getEndTime());
        HiHealthDataQueryOption hiHealthDataQueryOption = healthKitDictQuery.getHiHealthDataQueryOption();
        if (hiHealthDataQueryOption != null) {
            hiAggregateOption.setSortOrder(hiHealthDataQueryOption.getOrder());
            hiAggregateOption.setAnchor(hiHealthDataQueryOption.getOffset());
            hiAggregateOption.setCount(hiHealthDataQueryOption.getLimit());
        }
        hiAggregateOption.setGroupUnitType(healthKitDictQuery.getGroupUnitType());
        hiAggregateOption.setAggregateType(healthKitDictQuery.getAggregateType());
        b(hiAggregateOption, healthKitDictQuery);
        if (healthKitDictQuery.getValueFilterType() <= 0) {
            strC = "";
        } else {
            hiAggregateOption.setTimeInterval(0L, System.currentTimeMillis());
            strC = c(Long.valueOf(healthKitDictQuery.getStartTime()), Long.valueOf(healthKitDictQuery.getEndTime()), c(healthKitDictQuery.getValueFilterType(), hiAggregateOption.getType(), hiAggregateOption.getConstantsKey()));
        }
        if (!TextUtils.isEmpty(healthKitDictQuery.getString("metadata"))) {
            hiAggregateOption.setFilter(healthKitDictQuery.getString("metadata"));
        }
        if (!TextUtils.isEmpty(healthKitDictQuery.getString("filterStartTime")) || !TextUtils.isEmpty(healthKitDictQuery.getString("filterEndTime"))) {
            hiAggregateOption.setFilterTimeInterval(healthKitDictQuery.getString("filterStartTime"), healthKitDictQuery.getString("filterEndTime"));
        }
        return new HiDataAggregateProOption.Builder().c(hiAggregateOption).e(healthKitDictQuery.getString("package_name")).b(strC).e();
    }

    private String c(int i, int[] iArr, String[] strArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i == iArr[i2] && i2 < strArr.length) {
                return strArr[i2];
            }
        }
        return "";
    }

    private String c(Long l, Long l2, String str) {
        HiDataFilter.DataFilterExpression dataFilterExpression = new HiDataFilter.DataFilterExpression(str, HiDataFilter.DataFilterExpression.BIGGER_EQUAL, l.longValue());
        HiDataFilter.DataFilterExpression dataFilterExpression2 = new HiDataFilter.DataFilterExpression(str, HiDataFilter.DataFilterExpression.LESS_EQUAL, l2.longValue());
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataFilterExpression);
        arrayList.add(dataFilterExpression2);
        return HiJsonUtil.d(new HiDataFilter(arrayList, Collections.singletonList(0)));
    }

    private void b(int i, HiAggregateOption hiAggregateOption) {
        int[] iArrE;
        String[] strArrE;
        if (i == 10002) {
            iArrE = new int[]{DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value()};
            strArrE = new String[]{"BLOOD_PRESSURE_SYSTOLIC", "BLOOD_PRESSURE_DIASTOLIC", BleConstants.BLOODPRESSURE_SPHYGMUS};
        } else if (i == 10007) {
            iArrE = HiHealthDataType.e();
            strArrE = HiHealthDataKey.e();
        } else {
            LogUtil.j("HiHealthKitQueryDicHelper", "unsupported type");
            iArrE = null;
            strArrE = null;
        }
        hiAggregateOption.setType(iArrE);
        hiAggregateOption.setConstantsKey(strArrE);
    }

    private void c(HiAggregateOption hiAggregateOption, int i, List<Integer> list) {
        List<Integer> arrayList = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        if (i == 10006) {
            arrayList.add(Integer.valueOf(i));
            arrayList2.add(String.valueOf(i));
        } else {
            arrayList = HiHealthDictManager.a(this.e).f(i);
            arrayList2 = HiHealthDictManager.a(this.e).d(i);
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < arrayList.size() && list.contains(arrayList.get(i2)); i2++) {
                arrayList3.add(arrayList.get(i2));
                arrayList4.add(arrayList2.get(i2));
            }
            arrayList = arrayList3;
            arrayList2 = arrayList4;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = arrayList.get(i3).intValue();
        }
        hiAggregateOption.setType(iArr);
        hiAggregateOption.setConstantsKey((String[]) arrayList2.toArray(new String[0]));
    }

    private void e(HiDataReadOption hiDataReadOption, int i) {
        int[] iArrE = HiHealthDataType.e(i);
        String[] strArr = new String[iArrE.length];
        for (int i2 = 0; i2 < iArrE.length; i2++) {
            strArr[i2] = HiHealthDataKey.a(iArrE[i2]);
        }
        hiDataReadOption.setType(iArrE);
        hiDataReadOption.setConstantsKey(strArr);
    }

    private boolean h(HealthKitDictQuery healthKitDictQuery) {
        String string = healthKitDictQuery.getString("device_uniquecode");
        return !TextUtils.isEmpty(string) && string.contains(",");
    }

    private List<HiDataAggregateProOption> c(HealthKitDictQuery healthKitDictQuery) {
        ArrayList arrayList = new ArrayList();
        for (String str : healthKitDictQuery.getString("device_uniquecode").split(",")) {
            if (!TextUtils.isEmpty(str)) {
                healthKitDictQuery.putValue("device_uniquecode", str);
                arrayList.add(b(healthKitDictQuery));
            }
        }
        return arrayList;
    }

    private List<Integer> b(int i) {
        ArrayList arrayList = new ArrayList();
        if (HiHealthDictManager.a(this.e).k(i)) {
            return HiHealthDictManager.a(this.e).f(i);
        }
        arrayList.add(Integer.valueOf(i));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HiHealthKitData> a(List list, HealthKitDictQuery healthKitDictQuery, lbh lbhVar) {
        ArrayList arrayList = new ArrayList();
        if (njy.b(list)) {
            LogUtil.a("HiHealthKitQueryDicHelper", "data source result size is:", Integer.valueOf(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HiHealthClient hiHealthClient = (HiHealthClient) it.next();
                if (hiHealthClient == null) {
                    LogUtil.j("HiHealthKitQueryDicHelper", "hiHealthClient is null.");
                } else {
                    HiDeviceInfo hiDeviceInfo = hiHealthClient.getHiDeviceInfo();
                    String deviceUniqueCode = hiDeviceInfo.getDeviceUniqueCode();
                    if (TextUtils.isEmpty(deviceUniqueCode)) {
                        LogUtil.a("HiHealthKitQueryDicHelper", "uniqueCode is null.");
                    } else {
                        HiHealthKitData hiHealthKitData = new HiHealthKitData();
                        hiHealthKitData.setType(healthKitDictQuery.getSampleType());
                        hiHealthKitData.setTimeInterval(healthKitDictQuery.getStartTime(), healthKitDictQuery.getEndTime());
                        if (lbhVar.b()) {
                            hiHealthKitData.putString("device_uniquecode", deviceUniqueCode);
                        } else {
                            hiHealthKitData.putString("device_uniquecode", "***");
                        }
                        hiHealthKitData.putString("device_name", hiDeviceInfo.getDeviceName());
                        hiHealthKitData.putString("device_model", hiDeviceInfo.getModel());
                        arrayList.add(hiHealthKitData);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list, int i, int i2, IDataReadResultListener iDataReadResultListener) {
        try {
            iDataReadResultListener.onResult(list, i, i2);
        } catch (RemoteException e) {
            ReleaseLogUtil.a("HiH_HiHealthKitQueryDicHelper", "notifyDataReadResult RemoteException", LogAnonymous.b(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(len lenVar, String str, int i, String str2) {
        lenVar.d(this.e, new ler(str, i, this.d, this.f39772b, str2));
    }
}
