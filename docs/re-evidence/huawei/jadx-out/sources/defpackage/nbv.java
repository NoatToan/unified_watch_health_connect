package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.gson.JsonObject;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nbv implements DataReceiveCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42854b;
    private Context e;

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final nbv f42855b = new nbv();
    }

    private nbv() {
        this.e = BaseApplication.getContext();
        this.f42854b = 255;
    }

    public static nbv b() {
        return b.f42855b;
    }

    public void c() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.network", this);
    }

    public void a() {
        edc.e().unRegisterDeviceSampleListener("hw.unitedevice.network");
    }

    private eee d() {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.network");
        eeeVar.setWearPkgName("com.huawei.health.wear.golf");
        eeeVar.setCommandId(2);
        eeeVar.a(800100026L);
        eeeVar.a(0);
        eeeVar.e(eeq.c(e()));
        return eeeVar;
    }

    private String e() {
        int i = NetworkUtil.i() ? 1 : 2;
        int iJ = j();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("status", Integer.valueOf(i));
        jsonObject.addProperty("currentNetworkType", Integer.valueOf(iJ));
        jsonObject.addProperty("beforeNetworkType", Integer.valueOf(this.f42854b));
        this.f42854b = iJ;
        return eeq.a(GsonUtil.toJson(jsonObject));
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        LogUtil.a("NetworkConnStatusSyncMgr", "errorCode is ", Integer.valueOf(i));
        if (deviceInfo == null || eecVar == null) {
            LogUtil.e("NetworkConnStatusSyncMgr", "onDataReceived, deviceInfo or message is null");
            return;
        }
        if (!(eecVar instanceof eee)) {
            LogUtil.e("NetworkConnStatusSyncMgr", "onDataReceived, message is error");
            return;
        }
        eee eeeVar = (eee) eecVar;
        if (eecVar.getCommandId() != 2) {
            LogUtil.e("NetworkConnStatusSyncMgr", "onDataReceived, message commandId: ", Integer.valueOf(eecVar.getCommandId()));
            return;
        }
        if (eeeVar.d() != 800100026) {
            LogUtil.e("NetworkConnStatusSyncMgr", "onDataReceived, sampleEvent EventId is error");
            return;
        }
        byte[] bArrC = eeeVar.c();
        if (bArrC == null) {
            LogUtil.e("NetworkConnStatusSyncMgr", "onDataReceived, eventData is null");
        } else {
            LogUtil.a("NetworkConnStatusSyncMgr", "onDataReceived data:", eeq.d(eeq.e(bArrC)));
            edc.e().sendSampleEventCommand(mgg.d("NetworkConnStatusSyncMgr"), d(), "NetworkConnStatusSyncMgr");
        }
    }

    private NetworkInfo c(Context context) {
        if (!(context.getSystemService("connectivity") instanceof ConnectivityManager)) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        health.compact.a.util.LogUtil.d("NetworkConnStatusSyncMgr", "get network info is error, connectivityManager is null");
        return null;
    }

    private int j() {
        int i;
        NetworkInfo networkInfoC = c(this.e);
        if (networkInfoC == null) {
            LogUtil.j("NetworkConnStatusSyncMgr", "get net work type error");
            return 255;
        }
        int type = networkInfoC.getType();
        if (type == 0) {
            i = 0;
        } else if (type == 1) {
            i = 1;
        } else if (type == 7) {
            i = 2;
        } else {
            i = type == 9 ? 5 : 6;
        }
        LogUtil.a("NetworkConnStatusSyncMgr", "current networkType is ", Integer.valueOf(i));
        return i;
    }
}
