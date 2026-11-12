package defpackage;

import android.content.Context;
import android.os.Parcelable;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.IRealTimeDataCallback;
import com.huawei.hihealth.model.EventTypeInfo;
import com.huawei.hihealth.model.MetaData;
import com.huawei.hihealth.model.SportStatusInfo;
import com.huawei.hihealth.model.Subscriber;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.hihealthkit.model.DataObservableNoCallback;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lec extends DataObservableNoCallback<Subscriber> {
    private static Context sContext;
    private static volatile lec sInstance;
    private DeviceInfo mConnectDeviceInfo;
    private final DataReceiveCallback statusChangeReceiver = new DataReceiveCallback() { // from class: leb
        @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
        public final void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
            this.f$0.m1962x63492917(i, deviceInfo, eecVar);
        }
    };
    private static final String SWITCH_OPEN = eeq.d(1);
    private static final String SWITCH_CLOSE = eeq.d(0);

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-hihealthservice-hihealthkit-model-StatusChangeObservable, reason: not valid java name */
    /* synthetic */ void m1962x63492917(int i, DeviceInfo deviceInfo, eec eecVar) {
        ReleaseLogUtil.c("StatusChangeObservable", "receive device event:", Integer.valueOf(i));
        if (!(eecVar instanceof eee)) {
            ReleaseLogUtil.d("StatusChangeObservable", "message not instanceof SampleEvent.");
        } else {
            notifyDataChanged(eecVar);
        }
    }

    public static lec getInstance(Context context) {
        lec lecVar;
        synchronized (lec.class) {
            if (sInstance == null) {
                sInstance = new lec();
                sContext = context;
            }
            lecVar = sInstance;
        }
        return lecVar;
    }

    public static boolean hasObservableInit() {
        return (sInstance == null || sInstance.eventInfos.isEmpty()) ? false : true;
    }

    @Override // com.huawei.hihealthservice.hihealthkit.model.DataObservableNoCallback
    public boolean registerObserver(Parcelable parcelable, Subscriber subscriber) {
        if (!(parcelable instanceof SportStatusInfo)) {
            return false;
        }
        boolean zRegisterObserver = super.registerObserver(parcelable, subscriber);
        if (zRegisterObserver && this.eventInfos.get(parcelable) != null) {
            ReleaseLogUtil.c("HiH_StatusChangeObservable", "register sport status event to device!");
            lbm.c(sContext).a(getRealTimeDataCallback((EventTypeInfo) parcelable));
        }
        return zRegisterObserver;
    }

    @Override // com.huawei.hihealthservice.hihealthkit.model.DataObservableNoCallback
    public void notifyDataChanged(Object obj) {
        LogUtil.b("StatusChangeObservable", "enter notifyDataChanged");
        eee eeeVar = (eee) obj;
        if (isSampleEventValid(eeeVar)) {
            List<MetaData> sampleEventData = parseSampleEventData(eeeVar.c());
            String name = (eeeVar.d() == 800400002 ? SportStatusInfo.Type.SPORT_START : SportStatusInfo.Type.SPORT_END).getName();
            LogUtil.b("StatusChangeObservable", "notifyDataChanged subType:", name);
            for (EventTypeInfo eventTypeInfo : this.eventInfos.keySet()) {
                if (eventTypeInfo.getSubType().equals(name)) {
                    ley.d(sContext, eventTypeInfo, (Set<Subscriber>) this.eventInfos.get(eventTypeInfo), sampleEventData);
                }
            }
        }
    }

    public boolean unregisterObserver(EventTypeInfo eventTypeInfo, Subscriber subscriber) {
        if (!super.unregisterObserver((Parcelable) eventTypeInfo, subscriber)) {
            return false;
        }
        if (isEmpty()) {
            clearObserver();
            edc.e().unRegisterDeviceSampleListener("hw.health.healthkit");
        }
        if (!njy.e((Collection<?>) this.eventInfos.get(eventTypeInfo))) {
            return true;
        }
        unRegisterDeviceSampleListener(eventTypeInfo);
        return true;
    }

    public void notifyConnectionStateChange(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() == 2) {
            ReleaseLogUtil.c("HiH_StatusChangeObservable", "connected device has changed!");
            if (!isSupportSportStatus(deviceInfo)) {
                return;
            }
            this.mConnectDeviceInfo = deviceInfo;
            Iterator<EventTypeInfo> it = this.eventInfos.keySet().iterator();
            while (it.hasNext()) {
                registerDeviceSampleListener(deviceInfo, it.next());
            }
        }
        if (deviceInfo.getDeviceConnectState() == 3) {
            this.mConnectDeviceInfo = null;
            edc.e().unRegisterDeviceSampleListener("hw.health.healthkit");
        }
    }

    private boolean isSampleEventValid(eee eeeVar) {
        if (eeeVar.getCommandId() != 2) {
            ReleaseLogUtil.d("HiH_StatusChangeObservable", "onDataReceived, message commandId: ", Integer.valueOf(eeeVar.getCommandId()));
            return false;
        }
        if (eeeVar.d() != 800400002 && eeeVar.d() != 800400003) {
            ReleaseLogUtil.d("HiH_StatusChangeObservable", "sampleEvent EventId is:", Long.valueOf(eeeVar.d()));
            return false;
        }
        byte[] bArrC = eeeVar.c();
        if (bArrC != null && bArrC.length != 0) {
            return true;
        }
        ReleaseLogUtil.d("HiH_StatusChangeObservable", "sampleEvent data is empty.");
        return false;
    }

    private eeg getSampleConfigData(int i, String str) {
        eeg eegVar = new eeg();
        eegVar.b(900400004L);
        eegVar.b(1);
        eegVar.d(buildSingleHexData(i, str));
        return eegVar;
    }

    private eef getSampleConfigHeader() {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.health.healthkit");
        eefVar.setWearPkgName("in.huawei.fitness");
        eefVar.setCommandId(2);
        return eefVar;
    }

    private byte[] buildSingleHexData(int i, String str) {
        return eeq.c(eeq.d(i) + eeq.b(str.length() / 2) + str);
    }

    private IRealTimeDataCallback getRealTimeDataCallback(final EventTypeInfo eventTypeInfo) {
        return new IRealTimeDataCallback.Stub() { // from class: lec.2
            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onResult(int i) {
                LogUtil.b("StatusChangeObservable", "getDeviceList result is: ", Integer.valueOf(i));
            }

            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onChange(int i, String str) {
                LogUtil.b("StatusChangeObservable", "getDeviceList errCode:", Integer.valueOf(i));
                if (i == 0) {
                    DeviceInfo connectedDeviceInfo = lec.this.parseConnectedDeviceInfo(str);
                    if (connectedDeviceInfo != null) {
                        if (lec.this.isSupportSportStatus(connectedDeviceInfo)) {
                            lec.this.mConnectDeviceInfo = connectedDeviceInfo;
                            lec.this.registerDeviceSampleListener(connectedDeviceInfo, eventTypeInfo);
                            return;
                        } else {
                            ReleaseLogUtil.d("HiH_StatusChangeObservable", "sport not supported.");
                            return;
                        }
                    }
                    ReleaseLogUtil.d("HiH_StatusChangeObservable", "There is no connected device.");
                    return;
                }
                LogUtil.d("HiH_StatusChangeObservable", "getDeviceList errCode is not success, code: ", Integer.valueOf(i));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DeviceInfo parseConnectedDeviceInfo(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getJSONObject(i).getString("deviceInfo");
                if (new JSONObject(string).getInt("mDeviceConnectState") == 2) {
                    return (DeviceInfo) HiJsonUtil.d(string, DeviceInfo.class);
                }
            }
            return null;
        } catch (JSONException e) {
            ReleaseLogUtil.b("HiH_StatusChangeObservable", "parseConnectedDeviceInfo JSONException: ", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerDeviceSampleListener(DeviceInfo deviceInfo, EventTypeInfo eventTypeInfo) {
        eeg sampleConfigData;
        edc.e().registerDeviceSampleListener("hw.health.healthkit", this.statusChangeReceiver);
        eef sampleConfigHeader = getSampleConfigHeader();
        if (Objects.equals(eventTypeInfo.getSubType(), SportStatusInfo.Type.SPORT_START.getName())) {
            sampleConfigData = getSampleConfigData(1, SWITCH_OPEN);
        } else {
            sampleConfigData = getSampleConfigData(2, SWITCH_OPEN);
        }
        sampleConfigHeader.getConfigInfoList().add(sampleConfigData);
        if (edc.e().sendSampleConfigCommand(deviceInfo, sampleConfigHeader, "StatusChangeObservable")) {
            return;
        }
        ReleaseLogUtil.c("HiH_StatusChangeObservable", "sendSampleConfigCommand result is false.");
        edc.e().unRegisterDeviceSampleListener("hw.health.healthkit");
    }

    private void unRegisterDeviceSampleListener(EventTypeInfo eventTypeInfo) {
        eeg sampleConfigData;
        if (this.mConnectDeviceInfo == null) {
            ReleaseLogUtil.c("HiH_StatusChangeObservable", "do unRegister but there is no connected device now.");
            return;
        }
        eef sampleConfigHeader = getSampleConfigHeader();
        if (Objects.equals(eventTypeInfo.getSubType(), SportStatusInfo.Type.SPORT_START.getName())) {
            sampleConfigData = getSampleConfigData(1, SWITCH_CLOSE);
        } else {
            sampleConfigData = getSampleConfigData(2, SWITCH_CLOSE);
        }
        sampleConfigHeader.getConfigInfoList().add(sampleConfigData);
        edc.e().sendSampleConfigCommand(this.mConnectDeviceInfo, sampleConfigHeader, "StatusChangeObservable");
    }

    private List<MetaData> parseSampleEventData(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.b("StatusChangeObservable", "eventData byte size:", Integer.valueOf(bArr.length), ",data:", strE);
        ArrayList arrayList = new ArrayList();
        long jD = 0;
        int iA = 0;
        try {
            List<eew> listE = new eet().b(strE).e();
            if (listE != null && listE.size() != 0 && listE.size() == 2) {
                jD = cpb.d(listE.get(0).b());
                iA = cpb.a(listE.get(1).b());
                LogUtil.b("HiH_StatusChangeObservable", "timeStamp:", Long.valueOf(jD), " workoutType:", Integer.valueOf(iA));
                arrayList.add(new MetaData("timeStamp", String.valueOf(jD)));
                arrayList.add(new MetaData(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE, String.valueOf(iA)));
                return arrayList;
            }
            ReleaseLogUtil.d("HiH_StatusChangeObservable", "event data tlvList is wrong");
            return arrayList;
        } catch (eeu e) {
            ReleaseLogUtil.b("HiH_StatusChangeObservable", "parseEventData tlvException: ", ExceptionUtils.c(e));
        } catch (NumberFormatException e2) {
            ReleaseLogUtil.b("HiH_StatusChangeObservable", "parseEventData numberFormatException: ", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSupportSportStatus(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, MachineControlPointResponse.OP_CODE_EXTENSION_SET_DYNAMIC_ENERGY);
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        ReleaseLogUtil.c("HiH_StatusChangeObservable", "device connect status:", Integer.valueOf(deviceConnectState), ",deviceName:", deviceInfo.getDeviceName(), ",isSupportSportStatus:", Boolean.valueOf(zD));
        return zD;
    }
}
