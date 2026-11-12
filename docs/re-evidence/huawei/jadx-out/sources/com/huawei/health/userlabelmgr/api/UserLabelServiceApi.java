package com.huawei.health.userlabelmgr.api;

import android.content.Context;
import defpackage.gxd;
import defpackage.gxh;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface UserLabelServiceApi {
    void clickRecord(int i, String str);

    void destroyOdmf();

    List<String> getAllLabels(String str);

    List<String> getLabels(List<String> list, String str);

    void getPengineAllLabels(Context context);

    void initDailySleepLabel(gxd gxdVar);

    void initLabel(String str, String str2, String str3);

    void initMonthlySleepLabel(gxh gxhVar);

    boolean isContainsHealthLabel(List<String> list);

    boolean isContainsOtherLabel(List<String> list);

    void registerCallback(int i);

    void saveBindingDeviceToOdmf(String str);

    void saveThirtyDaysTrackDataToOdmf(Context context);

    void saveTrackDataToOdmf(String str);

    void subscribeTrackDataChanged(Context context);

    void unRegisterCallback(int i);

    void unSubscribeTrackData(Context context);

    void uploadBindingDevice();

    void uploadSleepData();

    void uploadSportEvent();
}
