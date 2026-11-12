package com.huawei.hihealthservice.hihealthkit;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HealthKitDictQuery;
import com.huawei.hihealth.HiHealthDataQuery;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.HiHealthKitDataOhos;
import com.huawei.hihealth.HiUserPreferenceData;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.IDataOperateListener;
import com.huawei.hihealth.IDataOperateListenerOhos;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.IDataReadResultListenerOhos;
import com.huawei.hihealth.IHiHealthKitCommonOhos;
import com.huawei.hihealth.ISportDataCallback;
import com.huawei.hihealth.StartSportParam;
import com.huawei.hihealthkit.context.H5ProAppInfo;
import com.huawei.hihealthkit.context.OutOfBandData;
import com.huawei.hihealthservice.InsertExecutor;
import com.huawei.up.utils.Constants;
import defpackage.lcm;
import defpackage.lcr;
import defpackage.len;
import defpackage.ler;
import defpackage.lkf;
import defpackage.njy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthKitCommonOhosBinder extends IHiHealthKitCommonOhos.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HiHealthKitExtendBinder f12409a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f12410c;
    private HiHealthKitBinder e;

    public HiHealthKitCommonOhosBinder(Context context, InsertExecutor insertExecutor) {
        this.f12410c = context;
        this.e = new HiHealthKitBinder(context, insertExecutor);
        this.f12409a = new HiHealthKitExtendBinder(context, insertExecutor);
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void execQueryOhos(OutOfBandData outOfBandData, IDataReadResultListenerOhos iDataReadResultListenerOhos, int i, HiHealthDataQuery hiHealthDataQuery) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter ", "execQuery");
        if (a(outOfBandData, iDataReadResultListenerOhos, "execQuery")) {
            return;
        }
        IDataReadResultListener iDataReadResultListenerE = e(iDataReadResultListenerOhos);
        if (outOfBandData instanceof H5ProAppInfo) {
            this.f12409a.execQuery(outOfBandData, hiHealthDataQuery, i, iDataReadResultListenerE);
        } else {
            this.e.execQuery(0, hiHealthDataQuery, i, iDataReadResultListenerE);
        }
    }

    private void c(OutOfBandData outOfBandData, String str, int i) {
        String strD;
        String appId;
        len lenVar = new len();
        if (outOfBandData instanceof H5ProAppInfo) {
            H5ProAppInfo h5ProAppInfo = (H5ProAppInfo) outOfBandData;
            strD = h5ProAppInfo.getPkgName();
            appId = h5ProAppInfo.getAppId();
        } else {
            strD = lkf.d(this.f12410c);
            appId = null;
        }
        lenVar.d(this.f12410c, new ler(str, i, strD, appId));
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void setKitVersion(String str) {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter setKitVersion");
        this.e.setKitVersion(str);
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void registerPackageName(String str) {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter registerPackageName");
        this.f12409a.registerPackageName(str);
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public int getServiceApiLevel(OutOfBandData outOfBandData) {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter getServiceApiLevel");
        if (outOfBandData instanceof H5ProAppInfo) {
            return this.f12409a.getServiceApiLevel(outOfBandData);
        }
        return this.e.getServiceApiLevel();
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public String getCategory(int i) {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter getCategory");
        return this.e.getCategory(i);
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void saveSamplesOhos(OutOfBandData outOfBandData, List<HiHealthKitDataOhos> list, final IDataOperateListenerOhos iDataOperateListenerOhos) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter ", "saveSamples");
        if (a(outOfBandData, iDataOperateListenerOhos, "saveSamples")) {
            return;
        }
        if (njy.e(list)) {
            ReleaseLogUtil.e("HiH_HiHealthKitCommonOhosBinder", "saveSamples", " data is null");
            c(outOfBandData, "saveSamples", 2);
            iDataOperateListenerOhos.onResult(2, lcr.e(2));
            return;
        }
        ArrayList arrayList = new ArrayList();
        e(arrayList, list);
        IDataOperateListener.Stub stub = new IDataOperateListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitCommonOhosBinder.3
            @Override // com.huawei.hihealth.IDataOperateListener
            public void onResult(int i, List list2) throws RemoteException {
                HiHealthKitCommonOhosBinder.this.d(i, list2, iDataOperateListenerOhos);
            }
        };
        if (outOfBandData instanceof H5ProAppInfo) {
            this.f12409a.saveSamples(outOfBandData, arrayList, stub);
        } else {
            this.e.saveSamples(0, arrayList, stub);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void queryDataOhos(OutOfBandData outOfBandData, HealthKitDictQuery healthKitDictQuery, IDataReadResultListenerOhos iDataReadResultListenerOhos) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter ", "queryData");
        if (a(outOfBandData, iDataReadResultListenerOhos, "queryData")) {
            return;
        }
        IDataReadResultListener iDataReadResultListenerE = e(iDataReadResultListenerOhos);
        if (outOfBandData instanceof H5ProAppInfo) {
            this.f12409a.queryData(outOfBandData, healthKitDictQuery, iDataReadResultListenerE);
        } else {
            this.e.queryData(healthKitDictQuery, iDataReadResultListenerE);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void getUserInfo(OutOfBandData outOfBandData, List<String> list, ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter ", Constants.METHOD_GET_USER_INFO);
        if (a(outOfBandData, iCommonCallback, Constants.METHOD_GET_USER_INFO)) {
            return;
        }
        if (outOfBandData instanceof H5ProAppInfo) {
            this.f12409a.getUserInfo(outOfBandData, list, iCommonCallback);
        } else {
            this.e.getUserInfo(list, iCommonCallback);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void setUserPreference(OutOfBandData outOfBandData, HiUserPreferenceData hiUserPreferenceData, boolean z, IDataOperateListener iDataOperateListener) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter ", "setUserPreference");
        if (a(outOfBandData, iDataOperateListener, "setUserPreference")) {
            return;
        }
        if (outOfBandData instanceof H5ProAppInfo) {
            this.f12409a.setUserPreference(outOfBandData, hiUserPreferenceData, z, iDataOperateListener);
        } else {
            this.e.setUserPreference(hiUserPreferenceData, z, iDataOperateListener);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void getUserPreference(OutOfBandData outOfBandData, List<String> list, IDataOperateListener iDataOperateListener) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter ", "getUserPreference");
        if (a(outOfBandData, iDataOperateListener, "getUserPreference")) {
            return;
        }
        if (outOfBandData instanceof H5ProAppInfo) {
            this.f12409a.getUserPreference(outOfBandData, list, iDataOperateListener);
        } else {
            this.e.getUserPreference(list, iDataOperateListener);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void startSportEnhance(OutOfBandData outOfBandData, StartSportParam startSportParam, ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter ", "startSportEnhance");
        if (a(outOfBandData, iCommonCallback, "startSportEnhance")) {
            return;
        }
        if (outOfBandData instanceof H5ProAppInfo) {
            this.f12409a.startSportEnhance(outOfBandData, startSportParam, iCommonCallback);
        } else {
            this.e.startSportEnhance(startSportParam, iCommonCallback);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void stopSport(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter ", "stopSport");
        if (a(outOfBandData, iCommonCallback, "stopSport")) {
            return;
        }
        if (outOfBandData instanceof H5ProAppInfo) {
            this.f12409a.stopSport(outOfBandData, iCommonCallback);
        } else {
            this.e.stopSport(iCommonCallback);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void registerSportData(OutOfBandData outOfBandData, ISportDataCallback iSportDataCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter ", "registerSportData");
        if (a(outOfBandData, iSportDataCallback, "registerSportData")) {
            return;
        }
        if (outOfBandData instanceof H5ProAppInfo) {
            this.f12409a.registerRealTimeSportCallback(outOfBandData, iSportDataCallback);
        } else {
            this.e.registerRealTimeSportCallback(iSportDataCallback);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void unregisterSportData(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter ", "unregisterSportData");
        if (a(outOfBandData, iCommonCallback, "unregisterSportData")) {
            return;
        }
        if (outOfBandData instanceof H5ProAppInfo) {
            this.f12409a.unregisterRealTimeSportCallback(outOfBandData, iCommonCallback);
        } else {
            this.e.unregisterRealTimeSportCallback(iCommonCallback);
        }
    }

    @Override // com.huawei.hihealth.IHiHealthKitCommonOhos
    public void isAvailable(OutOfBandData outOfBandData, ICommonCallback iCommonCallback) throws RemoteException {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "enter ", "isAvailable");
        if (!a(outOfBandData, iCommonCallback, "isAvailable") && lcm.e("isAvailable", iCommonCallback)) {
            iCommonCallback.onResult(0, lcr.b(0));
            c(outOfBandData, "isAvailable", 0);
        }
    }

    private boolean a(OutOfBandData outOfBandData, Object obj, String str) {
        if (obj != null) {
            return false;
        }
        ReleaseLogUtil.e("HiH_HiHealthKitCommonOhosBinder", str, " listener is null");
        c(outOfBandData, str, 2);
        return true;
    }

    private IDataReadResultListener e(final IDataReadResultListenerOhos iDataReadResultListenerOhos) {
        return new IDataReadResultListener.Stub() { // from class: com.huawei.hihealthservice.hihealthkit.HiHealthKitCommonOhosBinder.1
            @Override // com.huawei.hihealth.IDataReadResultListener
            public void onResult(List list, int i, int i2) throws RemoteException {
                if (list == null) {
                    iDataReadResultListenerOhos.onResult(null, i, i2);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                HiHealthKitCommonOhosBinder.this.c(list, arrayList);
                iDataReadResultListenerOhos.onResult(arrayList, i, i2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List list, List<HiHealthKitDataOhos> list2) {
        for (Object obj : list) {
            if (obj instanceof HiHealthKitData) {
                HiHealthKitDataOhos hiHealthKitDataOhos = new HiHealthKitDataOhos();
                HiHealthKitData hiHealthKitData = (HiHealthKitData) obj;
                hiHealthKitDataOhos.setContentValues(hiHealthKitData.getContentValue());
                hiHealthKitDataOhos.setMap(hiHealthKitData.getMap());
                hiHealthKitDataOhos.setType(hiHealthKitData.getType());
                list2.add(hiHealthKitDataOhos);
            }
        }
    }

    private void e(HiHealthKitData hiHealthKitData, HiHealthKitDataOhos hiHealthKitDataOhos) {
        hiHealthKitData.setType(hiHealthKitDataOhos.getType());
        hiHealthKitData.setMap(hiHealthKitDataOhos.getMap());
        hiHealthKitData.setContentValues(hiHealthKitDataOhos.getContentValues());
    }

    private void e(List<HiHealthKitData> list, List<HiHealthKitDataOhos> list2) {
        for (HiHealthKitDataOhos hiHealthKitDataOhos : list2) {
            HiHealthKitData hiHealthKitData = new HiHealthKitData();
            e(hiHealthKitData, hiHealthKitDataOhos);
            list.add(hiHealthKitData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, List list, IDataOperateListenerOhos iDataOperateListenerOhos) throws RemoteException {
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

    public void onDestroy() {
        ReleaseLogUtil.d("HiH_HiHealthKitCommonOhosBinder", "onDestroy");
    }
}
