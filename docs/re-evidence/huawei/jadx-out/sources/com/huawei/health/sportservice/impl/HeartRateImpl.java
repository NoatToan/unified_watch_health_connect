package com.huawei.health.sportservice.impl;

import android.content.Context;
import com.google.gson.Gson;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.inter.DataSourceCallback;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.suggestion.util.HeartRateGetterUtil;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthApi;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dmg;
import defpackage.ecu;
import defpackage.hbv;
import defpackage.njw;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class HeartRateImpl implements SportLifecycle {
    private static final int HEART_NONE = -1;
    private static final String TAG = "Track_HeartRateImpl";
    private DataSourceCallback mDataSourceCallback;
    private int mSportType;
    protected int mHeartRate = -1;
    private List<Integer> mHeartRateSuccessList = null;
    private boolean mHasWear = false;
    private int mLinkType = 2;
    private HiSubscribeListener mSubscribeListener = new HiSubscribeListener() { // from class: com.huawei.health.sportservice.impl.HeartRateImpl.1
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            LogUtil.a(HeartRateImpl.TAG, "registerHeartRateListener onResult");
            if (list == null || list.isEmpty()) {
                return;
            }
            LogUtil.a(HeartRateImpl.TAG, "registerHeartRateListener success");
            if (HeartRateImpl.this.mHeartRateSuccessList == null) {
                HeartRateImpl.this.mHeartRateSuccessList = new ArrayList();
            }
            if (list != null) {
                HeartRateImpl.this.mHeartRateSuccessList.addAll(list);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (hiHealthData == null) {
                LogUtil.e(HeartRateImpl.TAG, "onChange HiHealthData is null!");
                return;
            }
            LogUtil.a(HeartRateImpl.TAG, "registerHeartRateListener onChange");
            if (HeartRateImpl.this.mLinkType == 2) {
                HeartRateImpl.this.mHeartRate = hiHealthData.getIntValue();
            } else {
                njw njwVar = (njw) new Gson().fromJson(CommonUtil.ac(hiHealthData.getMetaData()), njw.class);
                if (njwVar == null) {
                    return;
                }
                HeartRateImpl.this.mHeartRate = njwVar.j();
            }
            HeartRateImpl heartRateImpl = HeartRateImpl.this;
            heartRateImpl.heartRateChange(heartRateImpl.mHeartRate);
            HeartRateImpl.this.mDataSourceCallback.onHeartRateChanges(HeartRateImpl.this.mHeartRate);
            LogUtil.a(HeartRateImpl.TAG, "onChange, get heartRate: ", Integer.valueOf(HeartRateImpl.this.mHeartRate), ", mSportState is ", Integer.valueOf(BaseSportManager.getInstance().getStatus()));
        }
    };

    public void heartRateChange(int i) {
    }

    public void init() {
        if (ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG) != null) {
            this.mHasWear = true;
        } else {
            this.mHasWear = false;
        }
        int sportType = BaseSportManager.getInstance().getSportType();
        this.mSportType = sportType;
        this.mLinkType = hbv.a(sportType);
    }

    public void setHeartRateCallback(DataSourceCallback dataSourceCallback) {
        this.mDataSourceCallback = dataSourceCallback;
    }

    private void startHeartRateAndRunPostureMeasure() {
        LogUtil.a(TAG, "result regHeartRateListener ", Boolean.valueOf(regHeartRateListener(BaseApplication.getContext())));
        startHeartDeviceMeasure();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        LogUtil.a(TAG, "onPreSport Enter");
        startHeartRateAndRunPostureMeasure();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        LogUtil.a(TAG, "onPreSport Enter");
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStopSport() {
        LogUtil.a(TAG, "onStopSport Enter");
        dmg.a().removeMessageOrStateCallback(com.huawei.haf.application.BaseApplication.j().getClass().getSimpleName(), true);
        unRegHeartRateListener();
        stopHeartDeviceMeasure();
    }

    private boolean regHeartRateListener(Context context) {
        LogUtil.a(TAG, "regHeartRateListener");
        HiHealthApi hiHealthApiD = HiHealthManager.d(context);
        if (hiHealthApiD == null || !this.mHasWear) {
            return false;
        }
        LogUtil.a(TAG, "regHeartRateListener, hiHealthApi is not null");
        if (this.mLinkType == 2) {
            hiHealthApiD.subscribeHiHealthData(13, this.mSubscribeListener);
            return true;
        }
        hiHealthApiD.subscribeHiHealthData(17, this.mSubscribeListener);
        return true;
    }

    private void unRegHeartRateListener() {
        List<Integer> list = this.mHeartRateSuccessList;
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a(TAG, "unRegHeartRateListener");
        HiHealthManager.d(BaseApplication.getContext()).unSubscribeHiHealthData(this.mHeartRateSuccessList, new HiUnSubscribeListener() { // from class: com.huawei.health.sportservice.impl.HeartRateImpl.2
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public void onResult(boolean z) {
                LogUtil.a(HeartRateImpl.TAG, "unregHeartRateListener isSuccess = ", Boolean.valueOf(z));
            }
        });
    }

    public void startHeartDeviceMeasure() {
        LogUtil.a(TAG, "startHeartDeviceMeasure");
        HeartRateGetterUtil.d().a();
    }

    private void stopHeartDeviceMeasure() {
        LogUtil.a(TAG, "stopHeartDeviceMeasure");
        HeartRateGetterUtil.d().c();
    }
}
