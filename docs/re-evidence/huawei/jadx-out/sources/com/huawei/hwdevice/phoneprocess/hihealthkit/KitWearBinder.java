package com.huawei.hwdevice.phoneprocess.hihealthkit;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.Gson;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.HiAppInfo;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.IDetectCommonCallback;
import com.huawei.health.IKitWearAIDL;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.HeartDeviceInfo;
import com.huawei.hwdevice.mainprocess.service.SyncMusicService;
import com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.HwMusicMgrCallback;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.cpl;
import defpackage.dmr;
import defpackage.dmu;
import defpackage.ecu;
import defpackage.eel;
import defpackage.eeq;
import defpackage.eey;
import defpackage.lre;
import defpackage.mhp;
import defpackage.mhs;
import defpackage.mjh;
import defpackage.mkb;
import defpackage.mkf;
import defpackage.mlb;
import defpackage.mlc;
import defpackage.mld;
import defpackage.mlg;
import defpackage.mmr;
import defpackage.mrj;
import defpackage.muj;
import defpackage.muy;
import defpackage.mve;
import defpackage.mvh;
import defpackage.mvo;
import defpackage.mwt;
import defpackage.mxf;
import defpackage.mxp;
import defpackage.mzj;
import defpackage.nio;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class KitWearBinder extends IKitWearAIDL.Stub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IBaseCommonCallback f17427c;
    private volatile HwMusicMgrCallback e = null;

    @Override // com.huawei.health.IKitWearAIDL
    public void getRealTimeData(String str, int i, int i2, final IBaseCommonCallback iBaseCommonCallback) {
        if (iBaseCommonCallback == null) {
            LogUtil.j("KitWearBinder", "IWearAIDL getRealTimeData callback is null");
            return;
        }
        if (!k(iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "no device connected");
            return;
        }
        HwHeartRateManager.getInstance().remindSwitchHeartRateForKit(i, i2, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                try {
                    iBaseCommonCallback.onResponse(i3, "OpenOrClose state");
                } catch (RemoteException e) {
                    LogUtil.e("KitWearBinder", "IWearAIDL getRealTimeData state e: ", e.getMessage());
                }
            }
        }, str);
        if (i2 == 1) {
            b(str, iBaseCommonCallback);
            return;
        }
        if (i2 == 2) {
            HwHeartRateManager.getInstance().unregisterKitHeartRateCallback(str);
            return;
        }
        if (i2 == 3) {
            d(str, iBaseCommonCallback);
        } else if (i2 != 4) {
            LogUtil.j("KitWearBinder", "IWearAIDL openOrClose is else");
        } else {
            HwHeartRateManager.getInstance().unregisterKitRriCallback(str);
        }
    }

    private void d(String str, final IBaseCommonCallback iBaseCommonCallback) {
        HwHeartRateManager.getInstance().registerKitRriCallback(str, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.15
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj == null) {
                    return;
                }
                LogUtil.a("KitWearBinder", "IWearAIDL getRRI errorCode: ", Integer.valueOf(i));
                LogUtil.d("KitWearBinder", "IWearAIDL getRRI objectData: ", obj);
                try {
                    iBaseCommonCallback.onResponse(i, new JSONObject(obj.toString()).getString("value"));
                } catch (RemoteException e) {
                    LogUtil.e("KitWearBinder", "IWearAIDL getRRI e: ", e.getMessage());
                } catch (JSONException unused) {
                    LogUtil.e("KitWearBinder", "IWearAIDL getRRI JSONException");
                }
            }
        });
    }

    private void b(String str, final IBaseCommonCallback iBaseCommonCallback) {
        HwHeartRateManager.getInstance().registerKitHeartRateCallback(str, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.20
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj == null) {
                    return;
                }
                LogUtil.a("KitWearBinder", "IWearAIDL getHeartRate state: ", Integer.valueOf(i));
                LogUtil.d("KitWearBinder", "IWearAIDL getHeartRate objectData: ", obj);
                try {
                    iBaseCommonCallback.onResponse(i, new JSONArray(new JSONObject(obj.toString()).getString("value")).get(0).toString());
                } catch (RemoteException e) {
                    LogUtil.e("KitWearBinder", "IWearAIDL getHeartRate e: ", e.getMessage());
                } catch (JSONException unused) {
                    LogUtil.e("KitWearBinder", "IWearAIDL getHeartRate JSONException");
                }
            }
        });
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void getDeviceList(IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        String string;
        if (iBaseCommonCallback == null) {
            LogUtil.j("KitWearBinder", "IWearAIDL getDeviceList callback is null");
            return;
        }
        String strC = c();
        try {
            JSONArray jSONArray = new JSONArray(strC);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has("deviceInfo")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString("deviceInfo"));
                    jSONObject2.put("mDeviceIdentify", cpl.e(jSONObject2.optString("mDeviceIdentify")));
                    jSONObject.put("deviceInfo", jSONObject2.toString());
                }
                jSONArray.put(i, jSONObject);
            }
            string = jSONArray.toString();
        } catch (JSONException e) {
            LogUtil.e("KitWearBinder", "getHeartDeviceInfo json exception: ", e.getMessage());
            string = strC;
        }
        LogUtil.a("KitWearBinder", "getDeviceList heartDeviceInfo:", string);
        iBaseCommonCallback.onResponse(0, strC);
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void sendDeviceCommand(String str, IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        JSONObject jSONObject;
        int iOptInt;
        int iOptInt2;
        if (str == null || iBaseCommonCallback == null) {
            LogUtil.j("KitWearBinder", "IWearAIDL sendDeviceCommand commandOptions or callback is null");
            return;
        }
        LogUtil.a("05", 1, "KitWearBinder", "sendDeviceCommand commandOptions is ", str);
        int iOptInt3 = 0;
        try {
            jSONObject = new JSONObject(str);
            try {
                iOptInt = jSONObject.optInt("openOrClose");
                try {
                    iOptInt2 = jSONObject.optInt("commandType");
                    try {
                        if (jSONObject.has("operator_measure_source")) {
                            iOptInt3 = jSONObject.optInt("operator_measure_source");
                        }
                    } catch (JSONException e) {
                        e = e;
                        ReleaseLogUtil.a("KITWEARRELEASE_KitWearBinder", "occur JSONException:", ExceptionUtils.c(e));
                    }
                } catch (JSONException e2) {
                    e = e2;
                    iOptInt2 = 0;
                }
            } catch (JSONException e3) {
                e = e3;
                iOptInt = 0;
                iOptInt2 = 0;
                ReleaseLogUtil.a("KITWEARRELEASE_KitWearBinder", "occur JSONException:", ExceptionUtils.c(e));
                e(iOptInt2, iBaseCommonCallback, iOptInt, iOptInt3, str, jSONObject);
            }
        } catch (JSONException e4) {
            e = e4;
            jSONObject = null;
        }
        e(iOptInt2, iBaseCommonCallback, iOptInt, iOptInt3, str, jSONObject);
    }

    private void e(int i, IBaseCommonCallback iBaseCommonCallback, int i2, int i3, String str, JSONObject jSONObject) {
        if (i == 2) {
            if (a(iBaseCommonCallback, i2)) {
                return;
            }
            d(iBaseCommonCallback, i2);
            return;
        }
        if (i == 3) {
            if (e(iBaseCommonCallback, i2)) {
                return;
            }
            e(iBaseCommonCallback, i2, i3);
            return;
        }
        if (i == 4) {
            b(iBaseCommonCallback);
            return;
        }
        if (i == 10) {
            l(iBaseCommonCallback);
            return;
        }
        if (i == 100) {
            a(str, iBaseCommonCallback);
            return;
        }
        if (i == 300) {
            d(iBaseCommonCallback);
            return;
        }
        if (i == 800) {
            e(str, iBaseCommonCallback);
            return;
        }
        if (i == 200) {
            c(iBaseCommonCallback, i2);
            return;
        }
        if (i == 201) {
            a(iBaseCommonCallback);
            return;
        }
        if (i == 600) {
            d(str);
        } else if (i == 601) {
            b();
        } else {
            a(iBaseCommonCallback, i, jSONObject);
        }
    }

    private void e(String str, IBaseCommonCallback iBaseCommonCallback) {
        int iOptInt;
        String strOptString;
        int iOptInt2 = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            iOptInt = jSONObject.optInt("serviceId");
            try {
                iOptInt2 = jSONObject.optInt("commandId");
                strOptString = jSONObject.optString("deviceCommand");
            } catch (JSONException unused) {
                LogUtil.e("KitWearBinder", "sendCommandForTheme JSONException");
                strOptString = "";
            }
        } catch (JSONException unused2) {
            iOptInt = 0;
        }
        LogUtil.a("KitWearBinder", "sendCommandForTheme, serviceId:", Integer.valueOf(iOptInt), ", commandId:", Integer.valueOf(iOptInt2));
        if (TextUtils.isEmpty(strOptString)) {
            LogUtil.j("KitWearBinder", "IWearAIDL sendDeviceCommand deviceCommand is null");
            return;
        }
        f17427c = iBaseCommonCallback;
        DeviceCommand deviceCommand = new DeviceCommand();
        try {
            deviceCommand.setServiceID(iOptInt);
            deviceCommand.setCommandID(iOptInt2);
            deviceCommand.setDataContent(eeq.c(strOptString));
            deviceCommand.setDataLen(eeq.c(strOptString).length);
            LogUtil.a("KitWearBinder", "theme deviceCommand:", deviceCommand.toString());
            mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
        } catch (NumberFormatException unused3) {
            LogUtil.e("KitWearBinder", "sendCommandForTheme, NumberFormatException");
        }
    }

    private void a(IBaseCommonCallback iBaseCommonCallback, int i, JSONObject jSONObject) {
        if (i == 5) {
            if (CommonUtil.bu()) {
                return;
            }
            f(iBaseCommonCallback);
            return;
        }
        if (i == 6) {
            e(iBaseCommonCallback);
            return;
        }
        if (i == 400) {
            n(iBaseCommonCallback);
            return;
        }
        if (i == 505) {
            i(iBaseCommonCallback);
            return;
        }
        if (i == 900) {
            c(iBaseCommonCallback, jSONObject);
            return;
        }
        if (i != 901) {
            switch (i) {
                case 500:
                    a(iBaseCommonCallback, jSONObject);
                    break;
                case 501:
                    d(iBaseCommonCallback, jSONObject);
                    break;
                case TypedValues.PositionType.TYPE_DRAWPATH /* 502 */:
                    j(iBaseCommonCallback);
                    break;
                case 503:
                    g(iBaseCommonCallback);
                    break;
                default:
                    try {
                        iBaseCommonCallback.onResponse(500000, "");
                    } catch (RemoteException unused) {
                        LogUtil.e("KitWearBinder", "checkOtherCommandType RemoteException");
                    }
                    ReleaseLogUtil.a("KITWEARRELEASE_KitWearBinder", "default else:", Integer.valueOf(i));
                    break;
            }
            return;
        }
        e(iBaseCommonCallback, jSONObject);
    }

    private void e(IBaseCommonCallback iBaseCommonCallback) {
        LogUtil.a("KitWearBinder", "getBatteryValue enter");
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "KitWearBinder");
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        if (deviceInfo == null) {
            try {
                iBaseCommonCallback.onResponse(-1, "");
                return;
            } catch (RemoteException unused) {
                LogUtil.e("KitWearBinder", "getBatteryValue Exception");
                return;
            }
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            return;
        }
        mlc.a().c(deviceIdentify, iBaseCommonCallback);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(8);
        deviceCommand.setmIdentify(deviceIdentify);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void c(final IBaseCommonCallback iBaseCommonCallback, JSONObject jSONObject) {
        if (!k(iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "no device connected.");
            return;
        }
        LinkedList<mvh> linkedList = new LinkedList<>();
        try {
            if (jSONObject == null) {
                LogUtil.j("KitWearBinder", "startDataDictionary jsonObject valid");
                return;
            }
            LogUtil.a("KitWearBinder", "startDataDictionary jsonString", jSONObject.toString());
            JSONArray jSONArray = jSONObject.getJSONArray("digitTypeIds");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                int i2 = jSONArray.getInt(i);
                mvh mvhVar = new mvh();
                mvhVar.c(i2);
                linkedList.add(mvhVar);
            }
            if (linkedList.size() == 0) {
                try {
                    iBaseCommonCallback.onResponse(-1, "");
                    return;
                } catch (RemoteException unused) {
                    LogUtil.e("KitWearBinder", "startDataDictionary has error remote exception");
                    return;
                }
            }
            mvo.b().d(linkedList, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.17
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    ReleaseLogUtil.d("KITWEARRELEASE_KitWearBinder", "startToSyncByHealthKit result: ", Integer.valueOf(i3));
                    try {
                        iBaseCommonCallback.onResponse(i3, "");
                    } catch (RemoteException e) {
                        ReleaseLogUtil.a("KITWEARRELEASE_KitWearBinder", "startToSyncByHealthKit RemoteException: ", e.getMessage());
                    }
                }
            });
        } catch (JSONException unused2) {
            LogUtil.e("KitWearBinder", "checkJson startDataDictionary JSONException");
            try {
                iBaseCommonCallback.onResponse(-1, "");
            } catch (RemoteException unused3) {
                LogUtil.e("KitWearBinder", "startDataDictionary has error remote exception");
            }
        }
    }

    private void e(IBaseCommonCallback iBaseCommonCallback, JSONObject jSONObject) {
        if (!k(iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "no device connected.");
            return;
        }
        int iA = mzj.b().a();
        LogUtil.a("KitWearBinder", "querySyncStatus errorCode:", Integer.valueOf(iA));
        try {
            iBaseCommonCallback.onResponse(iA, "");
        } catch (RemoteException unused) {
            LogUtil.e("KitWearBinder", "querySyncStatus has error remote exception");
        }
    }

    private void i(IBaseCommonCallback iBaseCommonCallback) {
        if (!k(iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "getDeviceSn no device connected.");
            return;
        }
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "KitWearBinder");
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2) {
            try {
                jSONObject.put(HealthEngineRequestManager.PARAMS_DEVICE_SN, deviceInfo.getSecurityDeviceId());
                LogUtil.a("KitWearBinder", "getDeviceSn success");
            } catch (JSONException unused) {
                LogUtil.e("KitWearBinder", "getDeviceSn JSON exception");
            }
        }
        if (!TextUtils.isEmpty(jSONObject.toString())) {
            try {
                iBaseCommonCallback.onResponse(0, jSONObject.toString());
            } catch (RemoteException unused2) {
                LogUtil.e("KitWearBinder", "getDeviceSn remote exception");
            }
        } else {
            try {
                iBaseCommonCallback.onResponse(-1, "");
            } catch (RemoteException unused3) {
                LogUtil.e("KitWearBinder", "getDeviceSn has error remote exception");
            }
        }
    }

    private void f(final IBaseCommonCallback iBaseCommonCallback) {
        if (!k(iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "getSwitchStatus no device connected");
        } else {
            mxf.e(BaseApplication.getContext()).a(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.19
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    String str;
                    if (!(obj instanceof String)) {
                        str = "";
                    } else {
                        str = (String) obj;
                    }
                    try {
                        iBaseCommonCallback.onResponse(i, str);
                    } catch (RemoteException unused) {
                        LogUtil.e("KitWearBinder", "getSwitchStatus remoteException");
                    }
                }
            });
        }
    }

    private void g(final IBaseCommonCallback iBaseCommonCallback) {
        if (!k(iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "getEcgServiceIv no device connected");
        } else {
            LogUtil.a("KitWearBinder", "enter getEcgServiceIv");
            mxf.e(BaseApplication.getContext()).c(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.24
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    String str;
                    if (!(obj instanceof String)) {
                        str = "";
                    } else {
                        str = (String) obj;
                        LogUtil.a("KitWearBinder", "getEcgServiceIv errorCode: ", Integer.valueOf(i), "data: ", str);
                    }
                    try {
                        iBaseCommonCallback.onResponse(i, str);
                    } catch (RemoteException unused) {
                        LogUtil.e("KitWearBinder", "getSwitchStatus remoteException");
                    }
                }
            });
        }
    }

    private void d(final IBaseCommonCallback iBaseCommonCallback) {
        muj.c().b(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.23
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        LogUtil.a("KitWearBinder", "getAppMarketList code: ", Integer.valueOf(i), "data: ", str);
                        iBaseCommonCallback.onResponse(i, str);
                        return;
                    }
                    iBaseCommonCallback.onResponse(i, "");
                } catch (RemoteException unused) {
                    LogUtil.e("KitWearBinder", "getAppMarketList remote exception");
                }
            }
        });
    }

    private boolean e(IBaseCommonCallback iBaseCommonCallback, int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        try {
            d();
            iBaseCommonCallback.onResponse(500000, "");
            return true;
        } catch (RemoteException unused) {
            LogUtil.e("KitWearBinder", "handleTag openOrClose exception");
            return false;
        }
    }

    private boolean a(IBaseCommonCallback iBaseCommonCallback, int i) {
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return false;
        }
        try {
            d();
            iBaseCommonCallback.onResponse(500000, "");
            return true;
        } catch (RemoteException unused) {
            LogUtil.e("KitWearBinder", "handleTag openOrClose exception");
            return false;
        }
    }

    private void d() {
        LogUtil.j("05", 1, "KitWearBinder", "writeErrorSwitchParamLog openOrClose is invalid");
    }

    private void e(final IBaseCommonCallback iBaseCommonCallback, int i, int i2) {
        mxf.e(BaseApplication.getContext()).d(i, i2, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.25
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                try {
                    iBaseCommonCallback.onResponse(i3, "");
                } catch (RemoteException unused) {
                    LogUtil.e("KitWearBinder", "setAtrialSingleMeasure setAtrialSingleMeasure exception");
                }
            }
        });
    }

    private void d(final IBaseCommonCallback iBaseCommonCallback, int i) {
        mxf.e(BaseApplication.getContext()).e(i, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.21
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                try {
                    iBaseCommonCallback.onResponse(i2, "");
                } catch (RemoteException unused) {
                    LogUtil.e("KitWearBinder", "IWearAIDL setAtrialAutoMeasureStatus exception");
                }
            }
        });
    }

    private void a(String str, IBaseCommonCallback iBaseCommonCallback) {
        if (!k(iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "no device connected.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int[] iArr = {jSONObject.optInt("startTime"), jSONObject.optInt("endTime")};
            int iOptInt = jSONObject.optInt("fileType");
            boolean zOptBoolean = jSONObject.optBoolean("isNeedVerify", false);
            String strOptString = jSONObject.optString(ContentResource.FILE_NAME, null);
            LogUtil.a("KitWearBinder", "isNeedVerify: ", Boolean.valueOf(zOptBoolean));
            mhp mhpVar = new mhp();
            mhpVar.a(strOptString);
            mhpVar.c(iOptInt);
            mhpVar.c(iArr);
            mhpVar.e(zOptBoolean);
            mhpVar.d(null);
            mrj.e().c(mhpVar, iBaseCommonCallback);
        } catch (JSONException unused) {
            LogUtil.e("KitWearBinder", "getFileInfo exception");
        }
    }

    private void a(final IBaseCommonCallback iBaseCommonCallback, JSONObject jSONObject) {
        if (!k(iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "setEcgAuthSwitch no device connected.");
        } else {
            mxf.e(BaseApplication.getContext()).b(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    String str;
                    if (!(obj instanceof String)) {
                        str = "";
                    } else {
                        str = (String) obj;
                    }
                    try {
                        iBaseCommonCallback.onResponse(i, str);
                    } catch (RemoteException unused) {
                        LogUtil.e("KitWearBinder", "IWearAIDL setEcgAuthSwitch exception");
                    }
                }
            }, jSONObject);
        }
    }

    private void d(final IBaseCommonCallback iBaseCommonCallback, JSONObject jSONObject) {
        if (!k(iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "setEcgAuthSwitch no device connected.");
        } else {
            mxf.e(BaseApplication.getContext()).a(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    String str;
                    if (!(obj instanceof String)) {
                        str = "";
                    } else {
                        str = (String) obj;
                    }
                    try {
                        iBaseCommonCallback.onResponse(i, str);
                    } catch (RemoteException unused) {
                        LogUtil.e("KitWearBinder", "IWearAIDL setForbiddenSwitch exception");
                    }
                }
            }, jSONObject);
        }
    }

    private void j(final IBaseCommonCallback iBaseCommonCallback) {
        if (!k(iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "setEcgAuthSwitch no device connected.");
        } else {
            mxf.e(BaseApplication.getContext()).b(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    String str;
                    if (!(obj instanceof String)) {
                        str = "";
                    } else {
                        str = (String) obj;
                    }
                    try {
                        iBaseCommonCallback.onResponse(i, str);
                    } catch (RemoteException unused) {
                        LogUtil.e("KitWearBinder", "IWearAIDL getEcgAuth exception");
                    }
                }
            });
        }
    }

    private void n(IBaseCommonCallback iBaseCommonCallback) {
        if (!k(iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "no device connected.");
        } else {
            LogUtil.a("KitWearBinder", "enter KitCoreSleepManager startCoreSleep");
            mld.d().c(iBaseCommonCallback);
        }
    }

    private void d(String str) {
        mwt.c().b(str);
    }

    private void b() {
        mwt.c().a();
    }

    private boolean k(IBaseCommonCallback iBaseCommonCallback) {
        DeviceInfo next;
        Iterator<DeviceInfo> it = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "KitWearBinder").iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getDeviceConnectState() == 2 && !eel.d(next.getProductType())) {
                break;
            }
        }
        if (next == null || next.getDeviceConnectState() != 2) {
            LogUtil.j("KitWearBinder", "getFileInfo get device info error");
            try {
                iBaseCommonCallback.onResponse(300004, null);
            } catch (RemoteException unused) {
                LogUtil.e("KitWearBinder", "getFileInfo no device remote exception");
            }
            return false;
        }
        if (!lre.b(next.getDeviceIdentify()) && !mkb.q(next.getDeviceIdentify())) {
            return true;
        }
        LogUtil.j("KitWearBinder", "getFileInfo get device is Otaing");
        try {
            iBaseCommonCallback.onResponse(22000, null);
        } catch (RemoteException unused2) {
            LogUtil.e("KitWearBinder", "getFileInfo device is Otaing remote exception");
        }
        return false;
    }

    private void b(final IBaseCommonCallback iBaseCommonCallback) {
        mxf.e(BaseApplication.getContext()).e(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                try {
                    iBaseCommonCallback.onResponse(i, "");
                } catch (RemoteException unused) {
                    LogUtil.e("KitWearBinder", "IWearAIDL clearAtrialData exception");
                }
            }
        });
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void registerSingleAtrialCallback(final IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        if (iBaseCommonCallback == null) {
            ReleaseLogUtil.e("KITWEARRELEASE_KitWearBinder", "IWearAIDL registerSingleAtrialCallback callback is null");
        } else {
            mxf.e(BaseApplication.getContext()).d(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (obj == null) {
                        ReleaseLogUtil.e("KITWEARRELEASE_KitWearBinder", "IWearAIDL registerSingleAtrialCallback objectData is null");
                        return;
                    }
                    try {
                        LogUtil.d("05", 1, "KitWearBinder", "registerSingleAtrialCallback error code is ", Integer.valueOf(i), "data: ", obj);
                        if (obj instanceof String) {
                            iBaseCommonCallback.onResponse(i, (String) obj);
                            ReleaseLogUtil.d("KITWEARRELEASE_KitWearBinder", "registerSingleAtrialCallback error code is ", Integer.valueOf(i), "objectData is String");
                        } else {
                            iBaseCommonCallback.onResponse(i, "");
                            ReleaseLogUtil.d("KITWEARRELEASE_KitWearBinder", "registerSingleAtrialCallback error code is ", Integer.valueOf(i));
                        }
                    } catch (RemoteException unused) {
                        LogUtil.e("KitWearBinder", "IWearAIDL registerSingleAtrialCallback exception");
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void unRegisterSingleAtrialCallback(final IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        if (iBaseCommonCallback == null) {
            LogUtil.j("KitWearBinder", "IWearAIDL unRegisterSingleAtrialCallback callback is null");
        } else {
            mxf.e(BaseApplication.getContext()).f(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.6
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    try {
                        if (i == 0) {
                            LogUtil.a("05", 1, "KitWearBinder", "unRegisterSingleAtrialCallback error code is ", Integer.valueOf(i));
                            iBaseCommonCallback.onResponse(i, "");
                        } else {
                            iBaseCommonCallback.onResponse(-1, "");
                        }
                    } catch (RemoteException unused) {
                        LogUtil.e("KitWearBinder", "IWearAIDL unRegisterSingleAtrialCallback exception");
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void writeToWear(String str, String str2, byte[] bArr, String str3, IBaseCommonCallback iBaseCommonCallback) {
        if (iBaseCommonCallback == null) {
            LogUtil.j("KitWearBinder", "writeToWear callback is null");
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                a();
                if (!"huaweiOnlineMusic".equals(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        jSONObject.putOpt("package", str);
                        str2 = jSONObject.toString();
                    } catch (JSONException unused) {
                        LogUtil.e("KitWearBinder", "writeToWear, JSONException");
                        iBaseCommonCallback.onResponse(1, "writeToWear json error");
                        return;
                    }
                }
                a(str2, bArr, str3, iBaseCommonCallback);
                return;
            }
            iBaseCommonCallback.onResponse(2, "inputDescriptionString is empty");
        } catch (RemoteException unused2) {
            LogUtil.e("KitWearBinder", "writeToWear RemoteException");
        }
    }

    private void a() {
        if (this.e == null) {
            startSyncMusicService();
            try {
                Thread.sleep(300L);
            } catch (InterruptedException unused) {
                LogUtil.e("KitWearBinder", "startSyncMusicService InterruptedException");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(String str, byte[] bArr, String str2, IBaseCommonCallback iBaseCommonCallback) {
        try {
            String strOptString = new JSONObject(str).optString(ParsedFieldTag.ACTION_TYPE);
            byte b2 = 0;
            LogUtil.a("KitWearBinder", "actionType: ", strOptString, " sizeAndFinished: ", str2);
            switch (strOptString.hashCode()) {
                case -1149503253:
                    if (!strOptString.equals("deleteAudio")) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case -1016530986:
                    if (!strOptString.equals("accountNotify")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case -771961760:
                    if (!strOptString.equals("sendBatchInfo")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 1957230553:
                    if (!strOptString.equals("sendSongFile")) {
                        b2 = -1;
                    }
                    break;
                case 2036285271:
                    if (!strOptString.equals("cancleTransfer")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                c(str, bArr, str2, iBaseCommonCallback);
                return;
            }
            if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4) {
                c(str, iBaseCommonCallback);
            } else {
                iBaseCommonCallback.onResponse(500001, "");
            }
        } catch (RemoteException unused) {
            LogUtil.e("KitWearBinder", "endToWear RemoteException");
        } catch (JSONException unused2) {
            LogUtil.e("KitWearBinder", "hwMusicOperate JSONException");
            try {
                iBaseCommonCallback.onResponse(1, "JSON ERROR");
            } catch (RemoteException unused3) {
                LogUtil.e("KitWearBinder", "endToWear onResponse RemoteException");
            }
        }
    }

    private boolean a(byte[] bArr, IBaseCommonCallback iBaseCommonCallback) {
        LogUtil.a("KitWearBinder", "isDataEmpty enter");
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        try {
            iBaseCommonCallback.onResponse(2, "");
            return true;
        } catch (RemoteException unused) {
            LogUtil.e("KitWearBinder", "isDataEmpty RemoteException");
            return true;
        }
    }

    private void c(String str, byte[] bArr, String str2, IBaseCommonCallback iBaseCommonCallback) {
        LogUtil.a("KitWearBinder", "saveOneMusicInfo enter");
        if (a(bArr, iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "saveOneMusicInfo failed, data is empty");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            try {
                iBaseCommonCallback.onResponse(2, "sizeAndFinished is null");
                return;
            } catch (RemoteException unused) {
                LogUtil.e("KitWearBinder", "sizeAndFinished RemoteException");
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            boolean zOptBoolean = jSONObject.optBoolean("is_finished");
            int iOptInt = jSONObject.optInt("size");
            String strOptString = new JSONObject(str).optString("musicId");
            if (zOptBoolean) {
                a(bArr, strOptString);
                int iD = KitWearBinderUtil.d(strOptString);
                LogUtil.a("KitWearBinder", "saveOneMusicInfo finished, musicSize: ", Integer.valueOf(iD));
                if (iD == iOptInt) {
                    if (!h(iBaseCommonCallback)) {
                        ReleaseLogUtil.d("KITWEARRELEASE_KitWearBinder", "Interrupt send music");
                        e();
                        return;
                    } else {
                        LogUtil.a("KitWearBinder", "saveOneMusicInfo succeed");
                        c(str, iBaseCommonCallback);
                        return;
                    }
                }
                LogUtil.j("KitWearBinder", "saveOneMusicInfo failed! Delete temp file");
                e(strOptString);
                iBaseCommonCallback.onResponse(1, "musicSize != size");
                return;
            }
            a(bArr, strOptString);
        } catch (RemoteException unused2) {
            LogUtil.e("KitWearBinder", "saveOneMusicInfo RemoteException");
        } catch (JSONException unused3) {
            LogUtil.e("KitWearBinder", "saveOneMusicInfo exception");
            try {
                iBaseCommonCallback.onResponse(1, "JSON ERROR");
            } catch (RemoteException unused4) {
                LogUtil.e("KitWearBinder", "endToWear onResponse RemoteException");
            }
        }
    }

    private boolean h(IBaseCommonCallback iBaseCommonCallback) throws RemoteException {
        DeviceInfo deviceInfoC = KitWearBinderUtil.c("saveOneMusicInfo");
        if (deviceInfoC == null) {
            ReleaseLogUtil.e("KITWEARRELEASE_KitWearBinder", "hasStoragePermission deviceInfo is null, continue sending");
            return true;
        }
        if (!KitWearBinderUtil.a(deviceInfoC)) {
            ReleaseLogUtil.d("KITWEARRELEASE_KitWearBinder", "hasStoragePermission not supported, continue sending");
            return true;
        }
        int i = AnonymousClass18.f17439c[KitWearBinderUtil.b(deviceInfoC).ordinal()];
        if (i == 1) {
            iBaseCommonCallback.onResponse(1025, "device storage permission denied");
            return false;
        }
        if (i != 2) {
            return true;
        }
        iBaseCommonCallback.onResponse(1, "get device storage permission status failed");
        return false;
    }

    /* JADX INFO: renamed from: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder$18, reason: invalid class name */
    static /* synthetic */ class AnonymousClass18 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f17439c;

        static {
            int[] iArr = new int[KitWearBinderUtil.DevicePermissionResult.values().length];
            f17439c = iArr;
            try {
                iArr[KitWearBinderUtil.DevicePermissionResult.DENIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17439c[KitWearBinderUtil.DevicePermissionResult.OTHER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void e() {
        c("{\"actionType\":\"cancleTransfer\"}", new IBaseCommonCallback.Stub() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.7
            @Override // com.huawei.health.IBaseCommonCallback
            public void onResponse(int i, String str) throws RemoteException {
                ReleaseLogUtil.d("KITWEARRELEASE_KitWearBinder", "cancelTransfer result: ", Integer.valueOf(i), ", reason: ", str);
            }
        });
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("KitWearBinder", "deleteTempMusicFile, musicFile is empty");
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            LogUtil.a("KitWearBinder", "deleteTempMusicFile: ", str, "isSuccess: ", Boolean.valueOf(BaseApplication.getContext().deleteFile(str)));
            return;
        }
        try {
            if (file.delete()) {
                LogUtil.a("KitWearBinder", "deleteTempMusicFile: ", str);
            } else {
                LogUtil.j("KitWearBinder", "delete fail: ", str);
            }
        } catch (SecurityException unused) {
            LogUtil.e("KitWearBinder", "SecurityException");
        }
    }

    private void a(byte[] bArr, String str) {
        LogUtil.a("KitWearBinder", "writeDataToFile proceeding");
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            fileOutputStreamOpenFileOutput = BaseApplication.getContext().openFileOutput(str, 32768);
            fileOutputStreamOpenFileOutput.write(bArr);
            fileOutputStreamOpenFileOutput.flush();
        } catch (IOException unused) {
            LogUtil.e("KitWearBinder", "saveOneMusicInfo IOException");
        } finally {
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException unused2) {
                    LogUtil.e("KitWearBinder", "proceeding close error IOException");
                }
            }
        }
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void readFromWear(String str, String str2, IBaseCommonCallback iBaseCommonCallback) {
        if (iBaseCommonCallback == null) {
            LogUtil.j("KitWearBinder", "readFromWear callback is null");
            return;
        }
        LogUtil.a("KitWearBinder", "readFromWear enter,inputType: ", str, ",fileDescriptionString: ", str2);
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                a();
                if (!"huaweiOnlineMusic".equals(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        jSONObject.putOpt("package", str);
                        str2 = jSONObject.toString();
                    } catch (JSONException unused) {
                        LogUtil.e("KitWearBinder", "readFromWear, JSONException");
                        iBaseCommonCallback.onResponse(1, "readFromWear json error");
                        return;
                    }
                }
                c(str2, iBaseCommonCallback);
                return;
            }
            iBaseCommonCallback.onResponse(1, "inputType or fileDescriptionString is empty");
        } catch (RemoteException unused2) {
            LogUtil.e("KitWearBinder", "readFromWear RemoteException");
        }
    }

    private void c(final String str, final IBaseCommonCallback iBaseCommonCallback) {
        LogUtil.a("KitWearBinder", "sendCommandsToDevice enter");
        HwMusicMgrCallback hwMusicMgrCallback = this.e;
        try {
            if (hwMusicMgrCallback == null) {
                iBaseCommonCallback.onResponse(1, "not support music");
                LogUtil.j("KitWearBinder", "sendCommandsToDevice, mMusicMgrCallback is null");
            } else {
                hwMusicMgrCallback.executeCommand(str, new IBaseCallback.Stub() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.8
                    @Override // com.huawei.hwservicesmgr.IBaseCallback
                    public void onResponse(int i, String str2) throws RemoteException {
                        LogUtil.a("KitWearBinder", "enter errorCode: ", Integer.valueOf(i));
                        iBaseCommonCallback.onResponse(i, str2);
                        KitWearBinder.this.d(i, str);
                    }
                });
            }
        } catch (RemoteException unused) {
            LogUtil.e("KitWearBinder", "RemoteException");
            startSyncMusicService();
            HwMusicMgrCallback hwMusicMgrCallback2 = this.e;
            if (hwMusicMgrCallback2 != null) {
                try {
                    hwMusicMgrCallback2.executeCommand(str, new IBaseCallback.Stub() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.9
                        @Override // com.huawei.hwservicesmgr.IBaseCallback
                        public void onResponse(int i, String str2) throws RemoteException {
                            LogUtil.a("KitWearBinder", "enter errCode: ", Integer.valueOf(i), "str: ", str2);
                            iBaseCommonCallback.onResponse(i, str2);
                        }
                    });
                } catch (RemoteException unused2) {
                    LogUtil.e("KitWearBinder", "RemoteException after reStartService");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str) {
        if (i == 0) {
            Iterator<String> it = b(str).iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }
    }

    private List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if ("sendBatchInfo".equals(jSONObject.getString(ParsedFieldTag.ACTION_TYPE))) {
                    JSONArray jSONArray = jSONObject.getJSONArray("inputDescription");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2 == null) {
                            LogUtil.j("KitWearBinder", "getMusicIdByFileDescription item is null");
                        } else {
                            String strOptString = jSONObject2.optString("musicId");
                            if (TextUtils.isEmpty(strOptString)) {
                                LogUtil.j("KitWearBinder", "getMusicIdByFileDescription musicId is null");
                            } else {
                                arrayList.add(strOptString);
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                LogUtil.e("KitWearBinder", "getMusicIdByFileDescription JSONException: " + e.getMessage());
            }
        }
        return arrayList;
    }

    public void registerMusicMgrCallback(HwMusicMgrCallback hwMusicMgrCallback) {
        if (hwMusicMgrCallback == null) {
            LogUtil.j("KitWearBinder", "registMuiscMgrCallback callback is null");
        } else {
            LogUtil.a("KitWearBinder", "enter registMuiscMgrCallback");
            this.e = hwMusicMgrCallback;
        }
    }

    public void unRegisterMusicMgrCallback() {
        LogUtil.a("KitWearBinder", "enter unRegisterMusicMgrCallback");
        this.e = null;
    }

    public void startSyncMusicService() {
        LogUtil.a("KitWearBinder", "startSyncMusicService enter");
        Intent intent = new Intent();
        intent.setClass(BaseApplication.getContext(), SyncMusicService.class);
        intent.setAction("StartServiceFromHealthKit");
        try {
            BaseApplication.getContext().startService(intent);
        } catch (IllegalStateException unused) {
            LogUtil.e("startSyncMusicService, IllegalStateException", new Object[0]);
        }
    }

    private void c(final IBaseCommonCallback iBaseCommonCallback, int i) {
        if (b(iBaseCommonCallback, i)) {
            d();
        } else {
            mxp.d().a(i, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.12
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    try {
                        iBaseCommonCallback.onResponse(i2, "");
                    } catch (RemoteException unused) {
                        LogUtil.e("KitWearBinder", "IWearAIDL setSleepBreatheSwitch exception");
                    }
                }
            });
        }
    }

    private boolean b(IBaseCommonCallback iBaseCommonCallback, int i) {
        if (i == 1 || i == 2 || i == 0) {
            return false;
        }
        try {
            iBaseCommonCallback.onResponse(500000, "");
            return true;
        } catch (RemoteException unused) {
            LogUtil.e("KitWearBinder", "handleBreatheErrorParam openOrClose exception");
            return false;
        }
    }

    private void a(final IBaseCommonCallback iBaseCommonCallback) {
        mxp.d().d(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.13
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                try {
                    iBaseCommonCallback.onResponse(i, "");
                } catch (RemoteException unused) {
                    LogUtil.e("KitWearBinder", "IWearAIDL clearSleepBreatheData exception");
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    @Override // com.huawei.health.IKitWearAIDL
    public void pushMsgToWearable(HiAppInfo hiAppInfo, String str, String str2, IBaseCommonCallback iBaseCommonCallback) {
        byte b2;
        try {
            if (iBaseCommonCallback == null) {
                LogUtil.j("KitWearBinder", "pushMsgToWearable：pushCallback is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                int iHashCode = str.hashCode();
                if (iHashCode != -2113461736) {
                    if (iHashCode == 1294020898 && str.equals("INTERACTIVE_REMIND")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("hicarRemind")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    LogUtil.a("KitWearBinder", "the inputType type is: ", str);
                    mlb.e().a(str2, iBaseCommonCallback);
                    iBaseCommonCallback.onResponse(100000, "success");
                    return;
                } else if (b2 != 1) {
                    LogUtil.j("KitWearBinder", "unsupported inputType is: ", str);
                    iBaseCommonCallback.onResponse(100001, VastAttribute.ERROR);
                    return;
                } else {
                    mlg.a().b(hiAppInfo, str2, iBaseCommonCallback);
                    return;
                }
            }
            iBaseCommonCallback.onResponse(255, "inputType or message is empty");
        } catch (RemoteException unused) {
            LogUtil.e("KitWearBinder", "pushMsgToWearable RemoteException");
        }
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void getSwitch(String str, IBaseCommonCallback iBaseCommonCallback) {
        if (iBaseCommonCallback == null) {
            LogUtil.e("KitWearBinder", "kit callback error, about DaemonService callback is null. please check aidl callback");
            return;
        }
        if (!k(iBaseCommonCallback)) {
            LogUtil.j("KitWearBinder", "no device connected getSwitch.");
            return;
        }
        try {
            if (str.hashCode() == -761173970 && str.equals("scientificSleep")) {
                c(iBaseCommonCallback);
                return;
            }
            iBaseCommonCallback.onResponse(2, "-1");
        } catch (RemoteException unused) {
            LogUtil.e("KitWearBinder", "getSwitch RemoteException");
        }
    }

    private void c(final IBaseCommonCallback iBaseCommonCallback) {
        mhs.a().getSwitchSetting("core_sleep_button", new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.14
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                try {
                    if ("0".equals(obj)) {
                        iBaseCommonCallback.onResponse(0, "0");
                    } else if ("1".equals(obj)) {
                        iBaseCommonCallback.onResponse(0, "1");
                    } else {
                        iBaseCommonCallback.onResponse(0, "-1");
                    }
                } catch (RemoteException unused) {
                    LogUtil.e("KitWearBinder", "getCoreSleepSwitch remote exception");
                }
            }
        });
    }

    private void l(final IBaseCommonCallback iBaseCommonCallback) {
        mlb.e().d(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.11
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                try {
                    LogUtil.a("KitWearBinder", "queryWearStatus error code is ", Integer.valueOf(i));
                    if (obj instanceof String) {
                        iBaseCommonCallback.onResponse(i, (String) obj);
                    } else {
                        iBaseCommonCallback.onResponse(i, "");
                    }
                } catch (RemoteException unused) {
                    LogUtil.e("KitWearBinder", "IWearAIDL queryWearStatus exception");
                }
            }
        });
    }

    public static void handleDataReceive(byte[] bArr) {
        try {
            IBaseCommonCallback iBaseCommonCallback = f17427c;
            if (iBaseCommonCallback != null) {
                iBaseCommonCallback.onResponse(800, eeq.e(bArr));
            }
        } catch (RemoteException unused) {
            LogUtil.e("KitWearBinder", "handleDataReceive remote exception");
        }
    }

    public static void handleConnectStateReceive(String str) {
        try {
            IBaseCommonCallback iBaseCommonCallback = f17427c;
            if (iBaseCommonCallback != null) {
                iBaseCommonCallback.onResponse(801, str);
            }
        } catch (RemoteException unused) {
            LogUtil.e("KitWearBinder", "handleDataReceive remote exception");
        }
    }

    private String c() {
        ArrayList arrayList = new ArrayList(10);
        Iterator<DeviceInfo> it = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "KitWearBinder").iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next()));
        }
        return new Gson().toJson(arrayList);
    }

    private HeartDeviceInfo b(DeviceInfo deviceInfo) {
        HeartDeviceInfo heartDeviceInfo = new HeartDeviceInfo();
        if (deviceInfo == null) {
            return heartDeviceInfo;
        }
        HeartDeviceInfo heartDeviceInfoA = a(deviceInfo);
        if (TextUtils.isEmpty(deviceInfo.getUdidFromDevice())) {
            heartDeviceInfoA.setPhdDeviceUdid(deviceInfo.getDeviceUdid());
        } else {
            heartDeviceInfoA.setPhdDeviceUdid(deviceInfo.getUdidFromDevice());
        }
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c(deviceInfo.getSecurityUuid() + "#ANDROID21");
        if (!TextUtils.isEmpty(strC)) {
            LogUtil.a("KitWearBinder", "enter getHeartStudyDeviceList, wiseDeviceId not empty");
            heartDeviceInfoA.setmDeviceId(strC);
        } else {
            String strC2 = KeyValDbManager.d(BaseApplication.getContext()).c(deviceInfo.getDeviceUdid());
            if (!TextUtils.isEmpty(strC2)) {
                LogUtil.a("KitWearBinder", "enter getHeartStudyDeviceList, getDeviceUdid not empty");
                heartDeviceInfoA.setmDeviceId(strC2);
            } else {
                LogUtil.j("KitWearBinder", "enter getHeartStudyDeviceList, getDeviceUdid is empty");
            }
        }
        heartDeviceInfoA.setIsSupportGetEcgServiceIv(eey.d(deviceInfo, 45));
        heartDeviceInfoA.setDeviceInfo(new Gson().toJson(deviceInfo));
        return heartDeviceInfoA;
    }

    private HeartDeviceInfo a(DeviceInfo deviceInfo) {
        String json;
        String strC;
        HeartDeviceInfo heartDeviceInfo = new HeartDeviceInfo();
        heartDeviceInfo.setDeviceName(deviceInfo.getDeviceName());
        heartDeviceInfo.setProductType(deviceInfo.getProductType());
        DeviceCapability deviceCapabilityC = c(deviceInfo);
        if (deviceCapabilityC == null) {
            json = "";
        } else {
            json = new Gson().toJson(deviceCapabilityC, DeviceCapability.class);
        }
        heartDeviceInfo.setDeviceCapability(json);
        heartDeviceInfo.setDeviceConnectState(deviceInfo.getDeviceConnectState());
        heartDeviceInfo.setSoftVersion(deviceInfo.getSoftVersion());
        heartDeviceInfo.setDeviceModel(deviceInfo.getDeviceModel());
        heartDeviceInfo.setCertModel(deviceInfo.getCertModel());
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        if (!deviceIdentify.equals(securityDeviceId)) {
            strC = nio.c(deviceIdentify + securityDeviceId);
        } else {
            strC = nio.c(deviceIdentify);
        }
        heartDeviceInfo.setUuid(strC);
        return heartDeviceInfo;
    }

    private DeviceCapability c(DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceIdentify() == null) {
            return null;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "KitWearBinder");
        if (mapQueryDeviceCapability.isEmpty()) {
            return null;
        }
        return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void isSwitchOn(int i, IDetectCommonCallback iDetectCommonCallback) {
        mmr.e().c(i, iDetectCommonCallback);
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void getList(int i, IDetectCommonCallback iDetectCommonCallback) {
        mmr.e().e(i, iDetectCommonCallback);
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void isLatestVersion(int i, IDetectCommonCallback iDetectCommonCallback) {
        mmr.e().a(i, iDetectCommonCallback);
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void goIntoPage(String str, int i, IDetectCommonCallback iDetectCommonCallback) {
        mmr.e().a(str, i, iDetectCommonCallback);
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void bindDevice(String str, String str2, String str3, int i, IBaseCommonCallback iBaseCommonCallback) {
        MeasurableDevice measurableDeviceE;
        LogUtil.a("KitWearBinder", "enter bindDevice");
        if ("9bf158ba-49b0-46aa-9fdf-ed75da1569cf".equals(str)) {
            measurableDeviceE = new dmr();
        } else {
            measurableDeviceE = e(str2, str3, i);
        }
        if (measurableDeviceE == null) {
            try {
                iBaseCommonCallback.onResponse(2, "param invalid");
            } catch (RemoteException unused) {
                LogUtil.j("KitWearBinder", "bindDevice RemoteException");
            }
        } else {
            try {
                if (((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).bindDevice(str, measurableDeviceE, new IDeviceEventHandler() { // from class: com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder.16
                    @Override // com.huawei.health.device.callback.IDeviceEventHandler
                    public void onDeviceFound(HealthDevice healthDevice) {
                        LogUtil.a("KitWearBinder", "onDeviceFound");
                    }

                    @Override // com.huawei.health.device.callback.IDeviceEventHandler
                    public void onScanFailed(int i2) {
                        LogUtil.a("KitWearBinder", "onScanFailed code: ", Integer.valueOf(i2));
                    }

                    @Override // com.huawei.health.device.callback.IDeviceEventHandler
                    public void onStateChanged(int i2) {
                        LogUtil.a("KitWearBinder", "onStateChanged code: ", Integer.valueOf(i2));
                    }
                })) {
                    iBaseCommonCallback.onResponse(0, "bindDevice Success");
                } else {
                    iBaseCommonCallback.onResponse(4, "bindDevice Fail");
                }
            } catch (RemoteException unused2) {
                LogUtil.e("KitWearBinder", "bindDevice RemoteException");
            }
        }
    }

    private MeasurableDevice e(String str, String str2, int i) {
        MeasurableDevice measurableDeviceA;
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
        if (i == 1) {
            measurableDeviceA = ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).fromBluetoothDevice(remoteDevice);
        } else {
            measurableDeviceA = i == 2 ? dmu.a(remoteDevice) : null;
        }
        if (measurableDeviceA != null) {
            measurableDeviceA.setDeviceName(str2);
        }
        return measurableDeviceA;
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void captureLog(String str, IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.d("KITWEARRELEASE_KitWearBinder", "captureLog");
        if (iBaseCommonCallback == null) {
            ReleaseLogUtil.e("KITWEARRELEASE_KitWearBinder", "captureLog, ", "callback is null");
        } else if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("KITWEARRELEASE_KitWearBinder", "captureLog, ", "deviceUuid is empty");
            muy.c(iBaseCommonCallback, 1, "deviceUuid is empty");
        } else {
            mve.a().d(str, iBaseCommonCallback);
        }
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void uploadLog(int i, String str, List<String> list, IBaseCommonCallback iBaseCommonCallback) {
        ReleaseLogUtil.d("KITWEARRELEASE_KitWearBinder", "uploadLog uploadType: ", Integer.valueOf(i));
        if (iBaseCommonCallback == null) {
            ReleaseLogUtil.e("KITWEARRELEASE_KitWearBinder", "uploadLog, ", "callback is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("KITWEARRELEASE_KitWearBinder", "uploadLog, ", "deviceUuid is empty");
            muy.c(iBaseCommonCallback, 1, "deviceUuid is empty");
            return;
        }
        if (list == null || list.size() == 0) {
            ReleaseLogUtil.e("KITWEARRELEASE_KitWearBinder", "uploadLog, ", "list is empty");
            muy.c(iBaseCommonCallback, 1, "list is empty");
            return;
        }
        LogUtil.a("KitWearBinder", "uploadLog uploadFileList.get(0): ", list.get(0), ";uploadType: ", Integer.valueOf(i));
        boolean zE = mjh.e(com.huawei.haf.application.BaseApplication.b());
        if (i == 3 && !zE) {
            String str2 = SharedPreferenceManager.b("detect_wifi_mmkv_model_id", "detect_wifi_upload_log", "") + list.get(0) + "#";
            SharedPreferenceManager.c("detect_wifi_mmkv_model_id", "detect_wifi_upload_log", str2);
            LogUtil.a("KitWearBinder", "uploadLog uploadFileList: ", str2);
            ReleaseLogUtil.e("KITWEARRELEASE_KitWearBinder", "uploadLog upload type is wifi uploadType: ", Integer.valueOf(i));
            return;
        }
        mve.a().d(str, list.get(0), iBaseCommonCallback);
    }

    @Override // com.huawei.health.IKitWearAIDL
    public void removeLog(List<String> list, IBaseCommonCallback iBaseCommonCallback) {
        if (iBaseCommonCallback == null) {
            LogUtil.j("KitWearBinder", "callback is null");
        } else if (list == null || list.size() == 0) {
            muy.c(iBaseCommonCallback, 1, "list is empty");
        } else {
            mve.a().a(list.get(0), iBaseCommonCallback);
        }
    }
}
