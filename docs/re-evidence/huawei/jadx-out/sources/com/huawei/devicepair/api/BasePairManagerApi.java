package com.huawei.devicepair.api;

import android.content.Context;
import com.huawei.devicepair.model.StartPairOption;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import defpackage.cjo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface BasePairManagerApi {
    void connectDevice(Context context, String str, boolean z, String str2, IBaseResponseCallback iBaseResponseCallback);

    void disconnectDevice(String str, String str2, boolean z, IBaseResponseCallback iBaseResponseCallback);

    String getOobePath(String str);

    void hwSynergy(String str, int i);

    boolean isSupportH5Pair(String str);

    boolean isSupportHwSynergy(String str);

    boolean isSupportKeepAlive();

    boolean isSupportOobe(String str);

    boolean isSupportSyncAccount(String str);

    List<cjo> listDevice();

    void onDestroyActivity();

    void onSuccessPair(Context context, String str);

    void removeDevice(String str);

    void sendDeclarationInfoList(String str, String str2);

    void sendOobeStatus(DeviceInfo deviceInfo);

    void startPair(Context context, StartPairOption startPairOption);

    void syncAccount(String str, int i);
}
