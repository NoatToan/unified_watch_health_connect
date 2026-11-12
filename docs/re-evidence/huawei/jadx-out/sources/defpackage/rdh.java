package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapP2pMessage;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSampleCallback;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapSendCallback;
import com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap;
import com.huawei.maps.offlinedata.health.sample.SampleBase;
import com.huawei.maps.offlinedata.health.sample.SampleConfig;
import com.huawei.maps.offlinedata.health.sample.SampleConfigInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class rdh implements IWearEngine4OfflineMap {
    @Override // com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap
    public Map<Integer, Boolean> queryDeviceCapability(List<Integer> list) {
        if (CollectionUtils.a(list)) {
            return null;
        }
        HashMap map = new HashMap();
        for (Integer num : list) {
            DeviceInfo deviceInfoD = mgg.d("DEVMGR_OfflineMapAdapterImpl");
            if (deviceInfoD == null) {
                LogUtil.e("DEVMGR_OfflineMapAdapterImpl", "queryDeviceCapability deviceInfo is null ", num);
                map.put(num, false);
            } else {
                boolean zD = eey.d(deviceInfoD, num.intValue());
                ReleaseLogUtil.c("DEVMGR_OfflineMapAdapterImpl", "queryDeviceCapability index ", num, " isSupport ", Boolean.valueOf(zD));
                map.put(num, Boolean.valueOf(zD));
            }
        }
        return map;
    }

    @Override // com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap
    public void sendMsgToDevice(OfflineMapP2pMessage offlineMapP2pMessage) {
        rdo.b().d(offlineMapP2pMessage);
    }

    @Override // com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap
    public void sendMsgToDevice(OfflineMapP2pMessage offlineMapP2pMessage, int i, IOfflineMapSendCallback iOfflineMapSendCallback) {
        rdo.b().e(offlineMapP2pMessage, iOfflineMapSendCallback, i);
    }

    @Override // com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap
    public void sendPingToDevice(IOfflineMapPingCallback iOfflineMapPingCallback, String str) {
        rdo.b().c(iOfflineMapPingCallback, str);
    }

    @Override // com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap
    public void sendCancelCommand(String str, int i, IOfflineMapSendCallback iOfflineMapSendCallback) {
        rdo.b().d(str, iOfflineMapSendCallback, i);
    }

    @Override // com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap
    public boolean isSmartWatchApMode() {
        return mga.a();
    }

    @Override // com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap
    public boolean isSmartWatchMcuMode() {
        return mga.h();
    }

    @Override // com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap
    public void sendSampleConfigCommand(String str, String str2, SampleConfig sampleConfig) {
        DeviceInfo deviceInfoD = mgg.d("DEVMGR_OfflineMapAdapterImpl");
        if (deviceInfoD == null) {
            LogUtil.e("DEVMGR_OfflineMapAdapterImpl", "sendSampleConfigCommand err deviceInfo is null");
        } else {
            edc.e().sendSampleConfigCommand(deviceInfoD, d(sampleConfig), "DEVMGR_OfflineMapAdapterImpl");
        }
    }

    private eef d(SampleConfig sampleConfig) {
        eef eefVar = new eef();
        List<SampleConfigInfo> configInfoList = sampleConfig.getConfigInfoList();
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.a(configInfoList)) {
            for (SampleConfigInfo sampleConfigInfo : configInfoList) {
                eeg eegVar = new eeg();
                eegVar.c(sampleConfigInfo.getType());
                eegVar.b(sampleConfigInfo.getConfigId());
                eegVar.b(sampleConfigInfo.getConfigAction());
                eegVar.d(sampleConfigInfo.getByteConfigData());
                eegVar.c(sampleConfigInfo.getConfigModifyTime());
                eegVar.c(sampleConfigInfo.getSupportCapability());
                arrayList.add(eegVar);
            }
            eefVar.setConfigInfoList(arrayList);
        }
        eefVar.setWearPkgName(sampleConfig.getWearPkgName());
        eefVar.setSrcPkgName(sampleConfig.getSrcPkgName());
        eefVar.setCommandId(sampleConfig.getCommandId());
        return eefVar;
    }

    @Override // com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap
    public void registerDeviceSampleListener(String str, final IOfflineMapSampleCallback iOfflineMapSampleCallback) {
        edc.e().registerDeviceSampleListener(str, new DataReceiveCallback() { // from class: rdg
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public final void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                this.f47178c.d(iOfflineMapSampleCallback, i, deviceInfo, eecVar);
            }
        });
    }

    /* synthetic */ void d(IOfflineMapSampleCallback iOfflineMapSampleCallback, int i, DeviceInfo deviceInfo, eec eecVar) {
        if (iOfflineMapSampleCallback != null) {
            iOfflineMapSampleCallback.onSampleResult(i, a(eecVar));
        }
    }

    @Override // com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap
    public void unregisterDeviceSampleListener(String str, IOfflineMapSampleCallback iOfflineMapSampleCallback) {
        edc.e().unRegisterDeviceSampleListener(str);
    }

    @Override // com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap
    public String getDeviceInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        List<DeviceInfo> listD = lvl.d();
        if (njy.e(listD)) {
            return "";
        }
        for (DeviceInfo deviceInfo : listD) {
            if (str.equals(deviceInfo.getDeviceUdid())) {
                LogUtil.b("DEVMGR_OfflineMapAdapterImpl", "obtain DeviceInfo");
                JSONObject jSONObject = new JSONObject();
                try {
                    if (deviceInfo.getDeviceConnectState() == 2) {
                        jSONObject.put("status", 2);
                    } else {
                        jSONObject.put("status", 3);
                    }
                    jSONObject.put("deviceId", str);
                    return jSONObject.toString();
                } catch (JSONException unused) {
                    LogUtil.e("DEVMGR_OfflineMapAdapterImpl", "JSONObject Exception");
                }
            }
        }
        return "";
    }

    private SampleBase a(eec eecVar) {
        SampleConfig sampleConfig = new SampleConfig();
        sampleConfig.setCommandId(eecVar.getCommandId());
        sampleConfig.setSrcPkgName(eecVar.getSrcPkgName());
        sampleConfig.setWearPkgName(eecVar.getWearPkgName());
        if (eecVar instanceof eef) {
            List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
            if (!CollectionUtils.a(configInfoList)) {
                ArrayList arrayList = new ArrayList();
                for (eeg eegVar : configInfoList) {
                    SampleConfigInfo sampleConfigInfo = new SampleConfigInfo();
                    sampleConfigInfo.setType(eegVar.i());
                    sampleConfigInfo.setConfigId(eegVar.c());
                    sampleConfigInfo.setConfigAction(eegVar.d());
                    sampleConfigInfo.setByteConfigData(eegVar.e());
                    sampleConfigInfo.setConfigModifyTime(eegVar.b());
                    sampleConfigInfo.setSupportCapability(eegVar.a());
                    arrayList.add(sampleConfigInfo);
                }
                sampleConfig.setConfigInfoList(arrayList);
            }
        }
        return sampleConfig;
    }
}
