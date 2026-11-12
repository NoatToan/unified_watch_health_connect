package defpackage;

import android.content.ContentValues;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.gson.reflect.TypeToken;
import com.huawei.callback.BindPhoneServiceCallback;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import com.huawei.hwservicesmgr.LinkageDeviceCommandListener;
import com.huawei.linkage.sportlinkage.AppLinkageApi;
import com.huawei.linkage.sportlinkage.DataListener;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class fie {
    private static final Map<Integer, Integer> e = new HashMap<Integer, Integer>() { // from class: fie.1
        {
            put(7, Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE));
            put(3, 259);
            put(1, 258);
            put(5, 264);
            put(2, 257);
            put(15, 281);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<DataListener> f34112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IBaseCallback.Stub f34113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    LinkageDeviceCommandListener.Stub f34114c;
    private AppLinkageApi d;

    private fie() {
        this.f34114c = new LinkageDeviceCommandListener.Stub() { // from class: fie.5
            @Override // com.huawei.hwservicesmgr.LinkageDeviceCommandListener
            public void startLinkage(int i, int i2) throws RemoteException {
                ReleaseLogUtil.d("R_LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener startLinkage");
                if (fie.this.d == null) {
                    ReleaseLogUtil.d("R_LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener mAppLinkageApi ", fie.this.d);
                    return;
                }
                fie.this.d.startLinkage(fie.this.d(i), i2);
                fkt.d(true);
                fie.this.b(i, i2);
            }

            @Override // com.huawei.hwservicesmgr.LinkageDeviceCommandListener
            public void resumeLinkage(int i, int i2) {
                ReleaseLogUtil.d("R_LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener resumeLinkage");
                fie.this.d.resumeLinkage(fie.this.d(i), i2);
            }

            @Override // com.huawei.hwservicesmgr.LinkageDeviceCommandListener
            public void stopLinkage() {
                ReleaseLogUtil.d("R_LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener stop");
                fie.this.d.stopLinkage();
                fkt.d(false);
            }

            @Override // com.huawei.hwservicesmgr.LinkageDeviceCommandListener
            public void start(int i) {
                ReleaseLogUtil.d("R_LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener start");
                int iD = fie.this.d(i);
                fik.b();
                fie.this.d.start(iD);
            }

            @Override // com.huawei.hwservicesmgr.LinkageDeviceCommandListener
            public void pause() {
                ReleaseLogUtil.d("R_LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener pause");
                fie.this.d.pause();
            }

            @Override // com.huawei.hwservicesmgr.LinkageDeviceCommandListener
            public void resume() {
                ReleaseLogUtil.d("R_LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener resume");
                fie.this.d.resume();
            }

            @Override // com.huawei.hwservicesmgr.LinkageDeviceCommandListener
            public void stop() {
                ReleaseLogUtil.d("R_LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener stop");
                fie.this.d.stop();
                fkt.d(false);
            }
        };
        this.f34113b = new IBaseCallback.Stub() { // from class: fie.3
            @Override // com.huawei.hwservicesmgr.IBaseCallback
            public void onResponse(int i, String str) throws RemoteException {
                ReleaseLogUtil.d("R_LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener code is", Integer.valueOf(i));
                LogUtil.a("LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener dataJson is ", str);
                if (i != 0) {
                    return;
                }
                HashMap map = (HashMap) HiJsonUtil.d(str, new TypeToken<HashMap<Integer, Double>>() { // from class: com.huawei.health.hwhealthlinkage.linkage.ReverseLinkagePlatform$2$1
                }.getType());
                oax oaxVar = new oax();
                if (map.isEmpty()) {
                    ReleaseLogUtil.e("R_LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener convertLinkageData isEmpty");
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    Double d = (Double) entry.getValue();
                    LogUtil.a("LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener parse dicId=", num, ", dicValue =", d);
                    if (oau.f44016c.contains(num)) {
                        fik.a(num.intValue()).handle(d.doubleValue(), oaxVar);
                    }
                }
                LogUtil.a("LINKAGE_ReverseLinkagePlatform", "mLinkageDeviceDataListener linkageData = ", oaxVar.toString(), "mDataListenerSet : ", Integer.valueOf(fie.this.f34112a.size()));
                Iterator it = new HashSet(fie.this.f34112a).iterator();
                while (it.hasNext()) {
                    ((DataListener) it.next()).onResponse(oaxVar);
                }
            }
        };
        this.f34112a = new HashSet();
        this.d = null;
    }

    public static fie c() {
        return b.e;
    }

    public void a(AppLinkageApi appLinkageApi) {
        LogUtil.a("LINKAGE_ReverseLinkagePlatform", "initReverseLinkage");
        this.d = appLinkageApi;
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            try {
                ReleaseLogUtil.d("R_LINKAGE_ReverseLinkagePlatform", "initReverseLinkage register mDeviceCommandListenerAidl: ", this.f34114c, " mLinkageDeviceDataListener:", this.f34113b);
                iWearPhoneServiceAIDLC.registerLinkageDeviceCommandListener(this.f34114c);
                iWearPhoneServiceAIDLC.registerLinkageDeviceDataListener(this.f34113b);
                return;
            } catch (RemoteException e2) {
                ReleaseLogUtil.a("R_LINKAGE_ReverseLinkagePlatform", "initReverseLinkage JSONException: ", ExceptionUtils.c(e2));
                return;
            }
        }
        LogUtil.j("LINKAGE_ReverseLinkagePlatform", "initReverseLinkage binder == null");
        lug.e(BaseApplication.getContext());
    }

    public void d(final ContentValues contentValues) {
        if (contentValues == null) {
            ReleaseLogUtil.e("R_LINKAGE_ReverseLinkagePlatform", "handleRemoteException content null");
        } else {
            if (lug.c() == null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                lug.e(BaseApplication.getContext());
                lug.e(new BindPhoneServiceCallback() { // from class: fie.4
                    @Override // com.huawei.callback.BindPhoneServiceCallback
                    public void onBind() {
                        ReleaseLogUtil.e("R_LINKAGE_ReverseLinkagePlatform", "handleRemoteException bindPhoneService delay: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        lug.d(this);
                        fie.this.a(contentValues);
                    }
                });
                return;
            }
            a(contentValues);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ContentValues contentValues) {
        Integer asInteger = contentValues.getAsInteger("workoutTypeKey");
        int iIntValue = asInteger.intValue();
        Integer asInteger2 = contentValues.getAsInteger("currentSportStatusKey");
        int iIntValue2 = asInteger2.intValue();
        Integer asInteger3 = contentValues.getAsInteger("linkageOperationKey");
        int iIntValue3 = asInteger3.intValue();
        ReleaseLogUtil.d("R_LINKAGE_ReverseLinkagePlatform", "handleRemoteException workoutType: ", asInteger, ", currentSportStatus: ", asInteger2, ", linkageOperation: ", asInteger3);
        if (this.d == null) {
            ReleaseLogUtil.e("R_LINKAGE_ReverseLinkagePlatform", "handleRemoteException mAppLinkageApi null");
            return;
        }
        int iD = d(iIntValue);
        if (iIntValue3 == 100) {
            this.d.startLinkage(iD, iIntValue2);
            return;
        }
        if (iIntValue3 == 101) {
            this.d.resumeLinkage(iD, iIntValue2);
        } else if (iIntValue3 != 201) {
            ReleaseLogUtil.e("R_LINKAGE_ReverseLinkagePlatform", "handleLinkageAction mDeviceCommandListener == null");
        } else {
            this.d.start(iD);
        }
    }

    public void d(DataListener dataListener) {
        this.f34112a.add(dataListener);
    }

    public void e(DataListener dataListener) {
        this.f34112a.remove(dataListener);
    }

    public void j() {
        this.f34112a.clear();
    }

    public void c(int i, String str) {
        LogUtil.a("LINKAGE_ReverseLinkagePlatform", "replyDevice linkageOperationType=", Integer.valueOf(i), " replyCode=", str);
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            ReleaseLogUtil.e("R_LINKAGE_ReverseLinkagePlatform", "replyDevice binder null");
            String strD = DfxUtils.d(Thread.currentThread(), null);
            if (CommonUtil.ap()) {
                xjt.v("replyDevice binder null, stackTraceInfo: " + strD);
            }
            lug.e(BaseApplication.getContext());
            return;
        }
        try {
            iWearPhoneServiceAIDLC.notifyPhoneService("reverseLinkageReply", ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "LINKAGE_ReverseLinkagePlatform"), i, str);
        } catch (RemoteException e2) {
            xjt.v("replyDevice RemoteException: " + ExceptionUtils.c(e2));
            ReleaseLogUtil.a("R_LINKAGE_ReverseLinkagePlatform", "replyDevice RemoteException: ", ExceptionUtils.c(e2));
        }
    }

    public void d(JSONObject jSONObject, DeviceInfo deviceInfo) {
        eeh eehVar = new eeh();
        eehVar.d(50004L);
        eehVar.c(ndu.e(System.currentTimeMillis()));
        eehVar.a(ndu.e(System.currentTimeMillis()));
        eehVar.setSrcPkgName("hw.sport.linkage.app");
        eehVar.setWearPkgName("hw.sport.linkage.device");
        eehVar.e(e(jSONObject));
        LogUtil.a("LINKAGE_ReverseLinkagePlatform", "samplePoint = ", eehVar);
        edc.e().sendSamplePointCommand(deviceInfo, eehVar, "LINKAGE_ReverseLinkagePlatform");
    }

    private List<eed> e(JSONObject jSONObject) {
        Integer num;
        ArrayList arrayList = new ArrayList(10);
        for (String str : fkq.f34140c) {
            if (jSONObject.has(str) && (num = fkq.e.get(str)) != null) {
                arrayList.add(fik.a(num.intValue()).packageSamplePointInfo(jSONObject, str, num.intValue()));
            }
        }
        return arrayList;
    }

    public void a() {
        a(202);
    }

    public void d() {
        a(203);
    }

    public void e() {
        a(204);
    }

    public void b() {
        a(102);
    }

    private void a(int i) {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            ReleaseLogUtil.e("R_LINKAGE_ReverseLinkagePlatform", "sendCommandToDevice binder null");
            xjt.v("sendCommandToDevice binder null, stackTraceInfo: " + DfxUtils.d(Thread.currentThread(), null));
            lug.e(BaseApplication.getContext());
            return;
        }
        try {
            iWearPhoneServiceAIDLC.notifyPhoneService("reverseLinkage", ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "LINKAGE_ReverseLinkagePlatform"), i, null);
        } catch (RemoteException e2) {
            xjt.v("sendCommandToDevice RemoteException: " + ExceptionUtils.c(e2));
            ReleaseLogUtil.a("R_LINKAGE_ReverseLinkagePlatform", "sendCommandToDevice RemoteException: ", ExceptionUtils.c(e2));
        }
    }

    static class b {
        private static final fie e = new fie();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(int i) {
        Integer num = e.get(Integer.valueOf(i));
        if (num == null) {
            ReleaseLogUtil.e("R_LINKAGE_ReverseLinkagePlatform", "workoutTypeToSportType not mapping, workoutType:", Integer.valueOf(i));
            return i;
        }
        LogUtil.a("LINKAGE_ReverseLinkagePlatform", "workoutTypeToSportType workoutType: ", Integer.valueOf(i), ", sportType", num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("action", "reportReverseLinkage");
        linkedHashMap.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE, String.valueOf(i));
        linkedHashMap.put("currentSportStatus", String.valueOf(i2));
        OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_DEVICE_SPORT_REVERSE_LINKAGE.value(), linkedHashMap);
    }
}
