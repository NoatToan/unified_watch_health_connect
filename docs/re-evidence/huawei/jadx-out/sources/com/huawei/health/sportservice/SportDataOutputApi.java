package com.huawei.health.sportservice;

import android.os.Bundle;
import com.huawei.health.sport.ITargetUpdateListener;
import com.huawei.health.sportservice.constants.SportObserverType;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwsportmodel.SportAchieveSubscribe;
import defpackage.hau;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface SportDataOutputApi {
    void addDeviceStatusCallback(String str, IBaseResponseCallback iBaseResponseCallback);

    boolean addObserver(SportObserverType sportObserverType, String str, Object obj);

    boolean cancelSubscribeNotify(hau hauVar);

    List<Integer> connectSubDeviceStatus(List<Integer> list);

    void destroyModel();

    Object getData(String str);

    int getDataSource();

    default <T> T getParas(SportParamsType sportParamsType) {
        return null;
    }

    int getSportType();

    int getStatus();

    int getTargetSportStatus();

    void initModel(Bundle bundle);

    boolean isAlreadyInit();

    boolean isDeviceMirrorLink();

    boolean isRestart();

    boolean isSportServiceRunning();

    boolean isToSave();

    void onDestroy();

    void onSportBleStateChange(String str);

    void registerAchieveLevel(String str, SportAchieveSubscribe sportAchieveSubscribe);

    void registerDeviceDataCallback(ISportDataCallback iSportDataCallback);

    boolean registerSportBleStatus(String str, SportBleStatus sportBleStatus);

    boolean registerSportDataSavedCallback(String str, ISportDataSaveStatusCallback iSportDataSaveStatusCallback);

    boolean registerSportStatus(String str, SportLifecycle sportLifecycle);

    void removeDeviceStatusCallback(String str);

    boolean removeObserver(SportObserverType sportObserverType, String str);

    void setParas(SportParamsType sportParamsType, Object obj);

    boolean subscribeNotify(hau hauVar, SportDataNotify sportDataNotify);

    void subscribeTargetStatus(String str, ITargetUpdateListener iTargetUpdateListener);

    boolean unRegisterSportBleStatus(String str);

    boolean unRegisterSportStatus(String str);

    boolean unregisterSportDataSavedCallback(String str);

    void updateSourceData(String str, String str2, Object obj);
}
