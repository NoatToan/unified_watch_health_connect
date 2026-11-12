package com.huawei.health.suggestion.ui.fitness.callback;

import android.os.RemoteException;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.controlcenter.featureability.sdk.IConnectCallback;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.onehop.fasdk.model.DeviceConnectState;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.hik;
import defpackage.idy;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class TrainDetailConnectCallback extends IConnectCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UiCallback<Integer> f9288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9290c;
    private FitWorkout d;
    private final long e;

    public TrainDetailConnectCallback(FitWorkout fitWorkout, String str, long j, UiCallback<Integer> uiCallback) {
        this.d = fitWorkout;
        this.e = j;
        this.f9288a = uiCallback;
        this.f9289b = str;
    }

    public void setToken(int i) {
        this.f9290c = i;
    }

    @Override // com.huawei.controlcenter.featureability.sdk.IConnectCallback
    public void connect(String str, String str2, String str3) throws RemoteException {
        LogUtil.a("TrainDetailConnectCallback", "executor IConnectCallback connect,the deviceId: " + CommonUtil.n(str), " deviceType: ", str2);
        if (this.d == null) {
            LogUtil.j("TrainDetailConnectCallback", "connect mFitWorkout is null");
            return;
        }
        HashMap map = new HashMap(10);
        map.put("click", "1");
        map.put("workout_id", this.d.acquireId());
        map.put("workout_name", this.d.acquireName());
        idy.b(AnalyticsValue.FA_HOP_START.value(), map);
        DistributedApi distributedApi = (DistributedApi) Services.b("DistributedService", DistributedApi.class);
        hik hikVar = new hik(this.d, this.f9289b, this.e, this.f9288a);
        hikVar.c(this.f9290c);
        distributedApi.initDistributedEnvironment(str, hikVar);
        LogUtil.a("TrainDetailConnectCallback", "connect mToken:", Integer.valueOf(this.f9290c));
        if (distributedApi.updateConnectStatus(this.f9290c, str, DeviceConnectState.CONNECTING)) {
            return;
        }
        ReleaseLogUtil.e("TrainDetailConnectCallback", "updateConnectStatus to CONNECTING failed.");
    }

    @Override // com.huawei.controlcenter.featureability.sdk.IConnectCallback
    public void disconnect(String str) throws RemoteException {
        if (this.d == null) {
            LogUtil.j("TrainDetailConnectCallback", "disconnect mFitWorkout is null");
            return;
        }
        LogUtil.j("TrainDetailConnectCallback", "executor IConnectCallback disconnect the deviceId: ", CommonUtil.n(str));
        DistributedApi distributedApi = (DistributedApi) Services.b("DistributedService", DistributedApi.class);
        LogUtil.a("TrainDetailConnectCallback", "disconnect mToken:", Integer.valueOf(this.f9290c));
        distributedApi.updateConnectStatus(this.f9290c, str, DeviceConnectState.IDLE);
        hik hikVar = new hik(this.d, this.f9289b, this.e, this.f9288a);
        hikVar.c(this.f9290c);
        distributedApi.unInitDistributedEnvironment(str, hikVar);
    }
}
