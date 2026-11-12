package com.huawei.hihealthservice.hihealthkit;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.hihealth.ClientToken;
import com.huawei.hihealth.DataReportModel;
import com.huawei.hihealth.HealthKitDictQuery;
import com.huawei.hihealth.HiHealthDataQuery;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.HiHealthKitDataOhos;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.ICommonListener;
import com.huawei.hihealth.ICommonListenerOhos;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.IDataOperateListenerOhos;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.IDataReadResultListenerOhos;
import com.huawei.hihealth.IHiHealthKitOhos;
import com.huawei.hihealth.IRealTimeDataCallback;
import com.huawei.hihealth.IRegisterRealTimeCallback;
import com.huawei.hihealth.ISportDataCallback;
import com.huawei.hihealth.StartSportParam;
import com.huawei.hihealth.util.HiFileUtil;
import com.huawei.hihealthservice.InsertExecutor;
import defpackage.eeq;
import defpackage.lcm;
import defpackage.len;
import defpackage.ler;
import defpackage.let;
import defpackage.lev;
import defpackage.lkf;
import defpackage.njy;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import health.compact.a.WhiteBoxManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthKitOhosBinder extends IHiHealthKitOhos.Stub {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f12447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiHealthKitBinder f12448c;

    public HiHealthKitOhosBinder(Context context, InsertExecutor insertExecutor) {
        this.f12447b = context;
        this.f12448c = new HiHealthKitBinder(context, insertExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> d(List list) {
        ArrayList arrayList = new ArrayList(16);
        if (!njy.e(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next()));
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void getGenderOhos(int i, final ICommonListenerOhos iCommonListenerOhos) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter getGenderOhos");
        if (iCommonListenerOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "getGender", " listener is null");
            d("getGender", 2);
        } else {
            this.f12448c.getGender(i, new ICommonListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitOhosBinder.4
                @Override // com.huawei.hihealth.ICommonListener
                public void onSuccess(int i2, List list) throws RemoteException {
                    iCommonListenerOhos.onSuccess(i2, HiHealthKitOhosBinder.this.d(list));
                }

                @Override // com.huawei.hihealth.ICommonListener
                public void onFailure(int i2, List list) throws RemoteException {
                    iCommonListenerOhos.onFailure(i2, HiHealthKitOhosBinder.this.d(list));
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void getBirthdayOhos(int i, final ICommonListenerOhos iCommonListenerOhos) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter getBirthdayOhos");
        if (iCommonListenerOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "getBirthday", " listener is null");
            d("getBirthday", 2);
        } else {
            this.f12448c.getBirthday(i, new ICommonListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitOhosBinder.2
                @Override // com.huawei.hihealth.ICommonListener
                public void onSuccess(int i2, List list) throws RemoteException {
                    iCommonListenerOhos.onSuccess(i2, HiHealthKitOhosBinder.this.d(list));
                }

                @Override // com.huawei.hihealth.ICommonListener
                public void onFailure(int i2, List list) throws RemoteException {
                    iCommonListenerOhos.onFailure(i2, HiHealthKitOhosBinder.this.d(list));
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void getHeightOhos(int i, final ICommonListenerOhos iCommonListenerOhos) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter getHeight");
        if (iCommonListenerOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "getHeight", " listener is null");
            d("getHeight", 2);
        } else {
            this.f12448c.getHeight(i, new ICommonListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitOhosBinder.5
                @Override // com.huawei.hihealth.ICommonListener
                public void onSuccess(int i2, List list) throws RemoteException {
                    iCommonListenerOhos.onSuccess(i2, HiHealthKitOhosBinder.this.d(list));
                }

                @Override // com.huawei.hihealth.ICommonListener
                public void onFailure(int i2, List list) throws RemoteException {
                    iCommonListenerOhos.onFailure(i2, HiHealthKitOhosBinder.this.d(list));
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void getWeightOhos(int i, final ICommonListenerOhos iCommonListenerOhos) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter getWeightOhos");
        if (iCommonListenerOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", " listener is null");
            d("getWeight", 2);
        } else {
            this.f12448c.getWeight(i, new ICommonListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitOhosBinder.9
                @Override // com.huawei.hihealth.ICommonListener
                public void onSuccess(int i2, List list) throws RemoteException {
                    iCommonListenerOhos.onSuccess(i2, HiHealthKitOhosBinder.this.d(list));
                }

                @Override // com.huawei.hihealth.ICommonListener
                public void onFailure(int i2, List list) throws RemoteException {
                    iCommonListenerOhos.onFailure(i2, HiHealthKitOhosBinder.this.d(list));
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void execQueryOhos(int i, final IDataReadResultListenerOhos iDataReadResultListenerOhos, int i2, HiHealthDataQuery hiHealthDataQuery) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter execQueryOhos");
        if (iDataReadResultListenerOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "execQuery", " listener is null");
            d("execQuery", 2);
        } else {
            this.f12448c.execQuery(i, hiHealthDataQuery, 0, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitOhosBinder.6
                @Override // com.huawei.hihealth.IDataReadResultListener
                public void onResult(List list, int i3, int i4) throws RemoteException {
                    if (list == null) {
                        iDataReadResultListenerOhos.onResult(null, i3, i4);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        iDataReadResultListenerOhos.onResult(arrayList, i3, i4);
                        return;
                    }
                    for (Object obj : list) {
                        if (obj instanceof HiHealthKitData) {
                            HiHealthKitDataOhos hiHealthKitDataOhos = new HiHealthKitDataOhos();
                            HiHealthKitData hiHealthKitData = (HiHealthKitData) obj;
                            hiHealthKitDataOhos.setContentValues(hiHealthKitData.getContentValue());
                            hiHealthKitDataOhos.setMap(hiHealthKitData.getMap());
                            hiHealthKitDataOhos.setType(hiHealthKitData.getType());
                            arrayList.add(hiHealthKitDataOhos);
                        }
                    }
                    iDataReadResultListenerOhos.onResult(arrayList, i3, i4);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void getCountOhos(int i, final IDataReadResultListenerOhos iDataReadResultListenerOhos, final HiHealthDataQuery hiHealthDataQuery) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter getCountOhos");
        if (iDataReadResultListenerOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "getCount", " listener is null");
            d("getCount", 2);
        } else {
            this.f12448c.getCount(i, hiHealthDataQuery, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitOhosBinder.7
                @Override // com.huawei.hihealth.IDataReadResultListener
                public void onResult(List list, int i2, int i3) throws RemoteException {
                    ArrayList arrayList = new ArrayList();
                    if (njy.e(list)) {
                        iDataReadResultListenerOhos.onResult(arrayList, i2, i3);
                        return;
                    }
                    for (Object obj : list) {
                        if (obj instanceof Integer) {
                            HiHealthKitDataOhos hiHealthKitDataOhos = new HiHealthKitDataOhos();
                            HashMap map = new HashMap(1);
                            map.put(Integer.valueOf(hiHealthDataQuery.getSampleType()), (Integer) obj);
                            hiHealthKitDataOhos.setMap(map);
                            arrayList.add(hiHealthKitDataOhos);
                        }
                    }
                    iDataReadResultListenerOhos.onResult(arrayList, i2, i3);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void saveSampleOhos(int i, HiHealthKitDataOhos hiHealthKitDataOhos, final IDataOperateListenerOhos iDataOperateListenerOhos) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter saveSampleOhos");
        if (iDataOperateListenerOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "saveSample", " listener is null");
            d("saveSample", 2);
        } else if (hiHealthKitDataOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "saveSample", " data is null");
            d("saveSample", 2);
        } else {
            HiHealthKitData hiHealthKitData = new HiHealthKitData();
            c(hiHealthKitData, hiHealthKitDataOhos);
            this.f12448c.saveSample(i, hiHealthKitData, new IDataOperateListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitOhosBinder.8
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i2, List list) throws RemoteException {
                    HiHealthKitOhosBinder.this.b(i2, list, iDataOperateListenerOhos);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void saveSamplesOhos(int i, List<HiHealthKitDataOhos> list, final IDataOperateListenerOhos iDataOperateListenerOhos) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter saveSamplesOhos");
        if (iDataOperateListenerOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "saveSamples", " listener is null");
            d("saveSamples", 2);
        } else if (njy.e(list)) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "saveSamples", " data is null");
            d("saveSamples", 2);
        } else {
            ArrayList arrayList = new ArrayList();
            d(arrayList, list);
            this.f12448c.saveSamples(i, arrayList, new IDataOperateListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitOhosBinder.10
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i2, List list2) throws RemoteException {
                    HiHealthKitOhosBinder.this.b(i2, list2, iDataOperateListenerOhos);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void deleteSampleOhos(int i, HiHealthKitDataOhos hiHealthKitDataOhos, final IDataOperateListenerOhos iDataOperateListenerOhos) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter deleteSampleOhos");
        if (iDataOperateListenerOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "deleteSample", " listener is null");
            d("deleteSample", 2);
        } else if (hiHealthKitDataOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "deleteSample", " data is null");
            d("deleteSample", 2);
        } else {
            HiHealthKitData hiHealthKitData = new HiHealthKitData();
            c(hiHealthKitData, hiHealthKitDataOhos);
            this.f12448c.deleteSample(i, hiHealthKitData, new IDataOperateListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitOhosBinder.12
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i2, List list) throws RemoteException {
                    HiHealthKitOhosBinder.this.b(i2, list, iDataOperateListenerOhos);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void deleteSamplesOhos(int i, List<HiHealthKitDataOhos> list, final IDataOperateListenerOhos iDataOperateListenerOhos) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter deleteSamplesOhos");
        if (iDataOperateListenerOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "deleteSamples", " listener is null");
            d("deleteSamples", 2);
        } else if (njy.e(list)) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "deleteSamples", " data is null");
            d("deleteSamples", 2);
        } else {
            ArrayList arrayList = new ArrayList();
            d(arrayList, list);
            this.f12448c.deleteSamples(i, arrayList, new IDataOperateListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitOhosBinder.1
                @Override // com.huawei.hihealth.IDataOperateListener
                public void onResult(int i2, List list2) throws RemoteException {
                    HiHealthKitOhosBinder.this.b(i2, list2, iDataOperateListenerOhos);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void startReadingRRIOhos(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter startReadingRRIOhos");
        this.f12448c.startReadingRRI(i, iRealTimeDataCallback);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void stopReadingRRIOhos(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter stopReadingRRIOhos");
        this.f12448c.stopReadingRRI(i, iRealTimeDataCallback);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void registerToken(ClientToken clientToken) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter registerToken");
        this.f12448c.setBinder(clientToken.asBinder());
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void startSportOhos(int i, ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter startSportOhos");
        this.f12448c.startSport(i, iCommonCallback);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void startSportEnhanceOhos(StartSportParam startSportParam, ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter startSportEnhanceOhos");
        this.f12448c.startSportEnhance(startSportParam, iCommonCallback);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void stopSportOhos(ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter stopSportOhos");
        this.f12448c.stopSport(iCommonCallback);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void registerSportDataOhos(ISportDataCallback iSportDataCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter registerSportDataOhos");
        this.f12448c.registerRealTimeSportCallback(iSportDataCallback);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void unregisterSportDataOhos(ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter unregisterSportDataOhos");
        this.f12448c.unregisterRealTimeSportCallback(iCommonCallback);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public String getCategory(int i) {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter getCategory");
        return this.f12448c.getCategory(i);
    }

    private void c(HiHealthKitData hiHealthKitData, HiHealthKitDataOhos hiHealthKitDataOhos) {
        hiHealthKitData.setType(hiHealthKitDataOhos.getType());
        hiHealthKitData.setMap(hiHealthKitDataOhos.getMap());
        hiHealthKitData.setContentValues(hiHealthKitDataOhos.getContentValues());
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void startReadingHeartRateOhos(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter startReadingHeartRateOhos");
        this.f12448c.startReadingHeartRate(i, iRealTimeDataCallback);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void stopReadingHeartRateOhos(int i, IRealTimeDataCallback iRealTimeDataCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter stopReadingHeartRateOhos");
        this.f12448c.stopReadingHeartRate(i, iRealTimeDataCallback);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void setKitVersionOhos(String str) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter setKitVersionOhos");
        let.e(lkf.d(this.f12447b), str);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void registerPackageName(String str) {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter registerPackageName, packageName: ", str);
        lkf.a(this.f12447b, str);
        lev.e(this.f12447b).a();
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public int getServiceApiLevel() throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter getServiceApiLevel");
        return this.f12448c.getServiceApiLevel();
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void registerDataAutoReportOhos(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter registerDataAutoReportOhos");
        this.f12448c.registerDataAutoReport(dataReportModel, iRegisterRealTimeCallback);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void unregisterDataAutoReportOhos(DataReportModel dataReportModel, IRegisterRealTimeCallback iRegisterRealTimeCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter unregisterDataAutoReportOhos");
        this.f12448c.unregisterDataAutoReport(dataReportModel, iRegisterRealTimeCallback);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void bindDevice(String str, String str2, String str3, int i, ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter bindDevice");
        this.f12448c.bindDevice(str, str2, str3, i, iCommonCallback);
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void queryDataOhos(HealthKitDictQuery healthKitDictQuery, final IDataReadResultListenerOhos iDataReadResultListenerOhos) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter queryDataOhos");
        if (iDataReadResultListenerOhos == null) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "queryData", " listener is null");
            d("queryData", 2);
        } else {
            this.f12448c.queryData(healthKitDictQuery, new IDataReadResultListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitOhosBinder.3
                @Override // com.huawei.hihealth.IDataReadResultListener
                public void onResult(List list, int i, int i2) throws RemoteException {
                    if (list == null || list.isEmpty()) {
                        iDataReadResultListenerOhos.onResult(null, i, i2);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof HiHealthKitData) {
                            HiHealthKitDataOhos hiHealthKitDataOhos = new HiHealthKitDataOhos();
                            HiHealthKitData hiHealthKitData = (HiHealthKitData) obj;
                            hiHealthKitDataOhos.setContentValues(hiHealthKitData.getContentValue());
                            hiHealthKitDataOhos.setMap(hiHealthKitData.getMap());
                            hiHealthKitDataOhos.setType(hiHealthKitData.getType());
                            arrayList.add(hiHealthKitDataOhos);
                        }
                    }
                    iDataReadResultListenerOhos.onResult(arrayList, i, i2);
                }
            });
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitOhos
    public void saveDeviceInfo(String str) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter saveDeviceInfo");
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "saveDeviceInfo: deviceInfo is null");
            return;
        }
        if (!lcm.e("saveDeviceInfo", null)) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "saveDeviceInfo: privacy not permitted");
            return;
        }
        if (!"com.huawei.ohos.health.device".equals(lkf.d(this.f12447b))) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "saveDeviceInfo: Not FA Package");
            return;
        }
        LogUtil.b("HiHealthKitOhosBinder", "saveDeviceInfo: start");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("uniqueId");
            String strOptString2 = jSONObject.optString("productId");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "saveDeviceInfo: uniqueId or productId is empty");
                return;
            }
            if (((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).getBondedDeviceByUniqueId(strOptString) != null) {
                if (jSONObject.optBoolean("bindFlag")) {
                    ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "saveDeviceInfo: device already bound");
                    return;
                } else {
                    ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "saveDeviceInfo: unbind device");
                    ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).unbindDeviceByUniqueId(strOptString);
                    return;
                }
            }
            b(jSONObject, strOptString);
        } catch (JSONException unused) {
            ReleaseLogUtil.a("HiH_HiHealthKitOhosBinder", "saveDeviceInfo: deviceInfo is not correct json format");
            throw new RemoteException("deviceInfo is not correct json format");
        }
    }

    private void b(JSONObject jSONObject, String str) {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "saveDeviceInner");
        String strA = HiFileUtil.a(this.f12447b, "cache_data_from_fa");
        JSONObject jSONObject2 = new JSONObject();
        if (TextUtils.isEmpty(strA)) {
            c(jSONObject, str, jSONObject2);
            return;
        }
        try {
            jSONObject2 = new JSONObject(strA);
        } catch (JSONException e) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "saveDeviceInner: JSONException = ", e.getMessage());
        }
        if (jSONObject2.isNull(String.valueOf(str.hashCode()))) {
            c(jSONObject, str, jSONObject2);
        } else {
            b(jSONObject, str, jSONObject2);
        }
    }

    private void c(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter handleDeviceNotInCache");
        if (!jSONObject.optBoolean("bindFlag")) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "handleDeviceNotInCache: no cache data and unbind, return");
        } else {
            d(jSONObject, str, jSONObject2);
        }
    }

    private void b(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "handleDeviceInCache");
        boolean zOptBoolean = jSONObject.optBoolean("bindFlag");
        String strValueOf = String.valueOf(str.hashCode());
        if (zOptBoolean) {
            LogUtil.b("HiHealthKitOhosBinder", "handleDeviceInCache: this device info is already cached");
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(strValueOf);
            try {
                jSONObjectOptJSONObject.putOpt("uniqueId", new String(WhiteBoxManager.b().a(eeq.c(jSONObjectOptJSONObject.optString("uniqueId"))), StandardCharsets.UTF_8));
            } catch (JSONException e) {
                ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "handleDeviceInCache: JSONException = ", e.getMessage());
            }
            if (jSONObjectOptJSONObject.toString().equals(jSONObject.toString())) {
                ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "handleDeviceInCache: this device info doesn't change");
                return;
            } else {
                d(jSONObject, str, jSONObject2);
                return;
            }
        }
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "handleDeviceInCache: delete cached info of this device");
        jSONObject2.remove(strValueOf);
        if (jSONObject2.length() <= 0) {
            ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "handleDeviceInCache: no more device info, delete file");
            FileUtils.b(new File(this.f12447b.getFilesDir(), "cache_data_from_fa"));
        } else {
            ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "handleDeviceInCache: cache remaining device info to file");
            HiFileUtil.b(this.f12447b, jSONObject2.toString(), "cache_data_from_fa");
        }
    }

    private void d(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "enter writeDataToFile");
        String strE = eeq.e(WhiteBoxManager.b().e(str));
        if (TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "writeDataToFile: encodedUniqueId is null, return");
            return;
        }
        try {
            jSONObject.putOpt("uniqueId", strE);
            jSONObject2.putOpt(String.valueOf(str.hashCode()), jSONObject);
            HiFileUtil.b(this.f12447b, jSONObject2.toString(), "cache_data_from_fa");
        } catch (JSONException e) {
            ReleaseLogUtil.e("HiH_HiHealthKitOhosBinder", "writeDataToFile: put object failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, List list, IDataOperateListenerOhos iDataOperateListenerOhos) throws RemoteException {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            iDataOperateListenerOhos.onResult(i, arrayList);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        iDataOperateListenerOhos.onResult(i, arrayList);
    }

    private void d(List<HiHealthKitData> list, List<HiHealthKitDataOhos> list2) {
        for (HiHealthKitDataOhos hiHealthKitDataOhos : list2) {
            HiHealthKitData hiHealthKitData = new HiHealthKitData();
            c(hiHealthKitData, hiHealthKitDataOhos);
            list.add(hiHealthKitData);
        }
    }

    private void d(String str, int i) {
        new len().d(this.f12447b, new ler(str, i, lkf.d(this.f12447b)));
    }

    public void onDestroy() {
        ReleaseLogUtil.d("HiH_HiHealthKitOhosBinder", "onDestroy");
    }
}
