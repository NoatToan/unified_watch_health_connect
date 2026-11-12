package defpackage;

import android.text.TextUtils;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwdevice.phoneprocess.mgr.common.DeviceConfigInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import health.compact.a.HEXUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public class mmi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41917a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile mmi f41918c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private mmp f41919b;
    private String d;
    private final Map<String, eef> e = new ConcurrentHashMap();
    private final List<String> j = new ArrayList();
    private List<Integer> i = new ArrayList();

    private mmi(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_HwCommonManager", "HwCommonManager deviceInfo == null");
            return;
        }
        ReleaseLogUtil.d("R_HwCommonManager", "HwCommonManager");
        this.d = deviceInfo.getDeviceIdentify();
        d();
        c(deviceInfo);
        a();
        a(deviceInfo);
        b(deviceInfo);
    }

    private void b(DeviceInfo deviceInfo) {
        Iterator<Map.Entry<String, eef>> it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            eef value = it.next().getValue();
            if (value != null) {
                for (eeg eegVar : value.getConfigInfoList()) {
                    if (b(eegVar)) {
                        b(value, eegVar, deviceInfo, false);
                    }
                }
            }
        }
    }

    private boolean b(eeg eegVar) {
        for (DeviceConfigInfo deviceConfigInfo : DeviceConfigInfo.values()) {
            if (eegVar.a() == deviceConfigInfo.getSupportCapability()) {
                return deviceConfigInfo.isUseInitSend();
            }
        }
        return true;
    }

    private void a() {
        this.f41919b = new mmp.e().e(new mmh()).a("900200037", new mmg()).a("900200036", new mml()).a("900300060", new mmc()).d();
    }

    private void a(DeviceInfo deviceInfo) {
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(103, new e(this, deviceInfo));
    }

    static final class e implements HiSubscribeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<mmi> f41923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final DeviceInfo f41924c;

        e(mmi mmiVar, DeviceInfo deviceInfo) {
            this.f41923b = new WeakReference<>(mmiVar);
            this.f41924c = deviceInfo;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            ReleaseLogUtil.d("R_HwCommonManager", "SampleConfigData onResult");
            mmi mmiVar = this.f41923b.get();
            if (mmiVar == null) {
                ReleaseLogUtil.e("R_HwCommonManager", "SampleConfigData onResult manager == null");
            } else if (njy.b(list)) {
                if (mmiVar.i == null) {
                    mmiVar.i = new ArrayList();
                }
                mmiVar.i.addAll(list);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, final String str, HiHealthData hiHealthData, long j) {
            mmi mmiVar = this.f41923b.get();
            LogUtil.a("HwCommonManager", "changeKey:", str);
            if (mmiVar != null) {
                if (mmiVar.e.containsKey(str)) {
                    eef eefVar = (eef) mmiVar.e.get(str);
                    if (eefVar == null) {
                        ReleaseLogUtil.d("R_HwCommonManager", "sendSampleConfigData sampleConfig == null");
                        return;
                    }
                    List list = (List) eefVar.getConfigInfoList().stream().filter(new Predicate() { // from class: mmj
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return String.valueOf(((eeg) obj).c()).equals(str);
                        }
                    }).collect(Collectors.toList());
                    if (njy.e(list)) {
                        ReleaseLogUtil.d("R_HwCommonManager", "sendSampleConfigData sampleConfigInfoList isEmpty");
                        return;
                    }
                    eeg eegVar = (eeg) list.get(0);
                    if (eegVar != null) {
                        mmiVar.b(eefVar, eegVar, this.f41924c, mmi.a(eegVar));
                        return;
                    } else {
                        ReleaseLogUtil.d("R_HwCommonManager", "sendSampleConfigData sampleConfigInfo == null");
                        return;
                    }
                }
                LogUtil.a("HwCommonManager", "mConfigMap not containsKey");
                return;
            }
            ReleaseLogUtil.e("R_HwCommonManager", "SampleConfigData onChange manager == null");
        }
    }

    public static boolean a(eeg eegVar) {
        for (DeviceConfigInfo deviceConfigInfo : DeviceConfigInfo.values()) {
            LogUtil.a("HwCommonManager", "isDataChangeUseDefaultSend, for", deviceConfigInfo.toString());
            if (eegVar.a() == deviceConfigInfo.getSupportCapability()) {
                return deviceConfigInfo.isDataChangeUseDefaultSend();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final eef eefVar, final eeg eegVar, final DeviceInfo deviceInfo, final boolean z) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: mmk
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(deviceInfo, eefVar, eegVar, z);
            }
        });
    }

    /* synthetic */ void d(final DeviceInfo deviceInfo, final eef eefVar, eeg eegVar, final boolean z) {
        if (a(deviceInfo, eefVar)) {
            final String strValueOf = String.valueOf(eegVar.c());
            if (!eegVar.g()) {
                LogUtil.a("R_HwCommonManager", "sendSampleConfigData no isSupportUpload changeKey:", strValueOf);
                return;
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(strValueOf);
            qhq.b(eegVar.i(), arrayList, new HiDataReadResultListener() { // from class: mmi.5
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    ReleaseLogUtil.d("R_HwCommonManager", npt.d("onResult errorCode: ", Integer.valueOf(i), ", data: ", obj));
                    mmi.this.b(obj, z, deviceInfo, eefVar, strValueOf);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj, boolean z, DeviceInfo deviceInfo, eef eefVar, String str) {
        if (this.f41919b == null) {
            a();
        }
        if (z) {
            this.f41919b.b("-1").send(deviceInfo, obj, eefVar.getSrcPkgName(), eefVar.getWearPkgName());
        } else {
            this.f41919b.b(str).send(deviceInfo, obj, eefVar.getSrcPkgName(), eefVar.getWearPkgName());
        }
    }

    public static mmi d(DeviceInfo deviceInfo) {
        mmi mmiVar;
        synchronized (f41917a) {
            if (f41918c == null) {
                LogUtil.a("HwCommonManager", "getInstance()");
                f41918c = new mmi(deviceInfo);
            } else if (!e(deviceInfo)) {
                if (f41918c != null) {
                    d(f41918c.d);
                }
                if (f41918c == null) {
                    LogUtil.a("HwCommonManager", "getInstance()");
                    f41918c = new mmi(deviceInfo);
                }
            }
            mmiVar = f41918c;
        }
        return mmiVar;
    }

    private static boolean e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_HwCommonManager", "isSameDevice deviceInfo == null");
            return false;
        }
        return TextUtils.equals(deviceInfo.getDeviceIdentify(), f41918c.d);
    }

    private void d() {
        this.e.put("900200035", b(DeviceConfigInfo.GolfDevice, "900200035", "9002"));
        this.e.put("900200036", b(DeviceConfigInfo.FtpDevice, "900200036", "9002"));
        this.e.put("900200037", b(DeviceConfigInfo.FtpDevice, "900200037", "9002"));
        this.e.put("900300060", b(DeviceConfigInfo.BloodPressureRemindDevice, "900300060", MatterDataContans.TYPE_HEALTH));
        this.e.put("900500039", b(DeviceConfigInfo.WHEEL_CHAIR_DEVICE, "900500039", "9005"));
        this.e.put("900200041", b(DeviceConfigInfo.GOLF_AUTO_DOWNLOAD, "900200041", "9002"));
        this.e.put("900300066", b(DeviceConfigInfo.DRINK_UNIT, "900300066", MatterDataContans.TYPE_HEALTH));
    }

    private eef b(DeviceConfigInfo deviceConfigInfo, String str, String str2) {
        eef eefVar = new eef();
        eefVar.setWearPkgName(deviceConfigInfo.getWearPkgName());
        eefVar.setSrcPkgName(deviceConfigInfo.getSrcPkgName());
        eeg eegVar = new eeg();
        try {
            eegVar.b(Long.parseLong(str));
            eegVar.c(deviceConfigInfo.getSupportCapability());
            eegVar.d(deviceConfigInfo.getChannelCapability());
            eegVar.c(str2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(eegVar);
            eefVar.setConfigInfoList(arrayList);
            return eefVar;
        } catch (NumberFormatException e2) {
            ReleaseLogUtil.d("R_HwCommonManager", "getSampleConfig exception ", LogAnonymous.b(e2));
            return eefVar;
        }
    }

    public void c(DeviceInfo deviceInfo) {
        HashMap map = new HashMap();
        synchronized (f41917a) {
            Iterator<Map.Entry<String, eef>> it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                eef value = it.next().getValue();
                if (value != null && d(value)) {
                    String srcPkgName = value.getSrcPkgName();
                    if (map.containsKey(srcPkgName)) {
                        List<eeg> configInfoList = ((eef) map.get(srcPkgName)).getConfigInfoList();
                        configInfoList.addAll(value.getConfigInfoList());
                        value.setConfigInfoList(configInfoList);
                    }
                    map.put(srcPkgName, value);
                }
            }
        }
        for (final Map.Entry entry : map.entrySet()) {
            eef eefVar = (eef) entry.getValue();
            if (eefVar != null) {
                if (!a(deviceInfo, eefVar)) {
                    LogUtil.a("HwCommonManager", "registerSampleMap notSupportCapability");
                } else {
                    this.j.add((String) entry.getKey());
                    edc.e().registerDeviceSampleListener((String) entry.getKey(), new DataReceiveCallback() { // from class: mmn
                        @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
                        public final void onDataReceived(int i, DeviceInfo deviceInfo2, eec eecVar) {
                            this.e.b(entry, i, deviceInfo2, eecVar);
                        }
                    });
                }
            }
        }
    }

    /* synthetic */ void b(Map.Entry entry, int i, DeviceInfo deviceInfo, eec eecVar) {
        if (i != 100000) {
            ReleaseLogUtil.d("R_HwCommonManager", "receive device event.", Integer.valueOf(i));
        } else if (!(eecVar instanceof eef) || !eecVar.getWearPkgName().equals(entry.getKey())) {
            ReleaseLogUtil.d("R_HwCommonManager", "diet receive unrecognized message = ", eecVar);
        } else {
            LogUtil.a("HwCommonManager", "message instanceof SampleConfig.", eecVar.toString());
            c((eef) eecVar, ((eef) entry.getValue()).getConfigInfoList());
        }
    }

    private static boolean d(eef eefVar) {
        eeg eegVar;
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        if (!njy.b(configInfoList) || (eegVar = configInfoList.get(0)) == null) {
            return false;
        }
        return eegVar.j();
    }

    private boolean a(DeviceInfo deviceInfo, eef eefVar) {
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        if (njy.e(configInfoList)) {
            return true;
        }
        Iterator<eeg> it = configInfoList.iterator();
        while (it.hasNext()) {
            int iA = it.next().a();
            if (iA == 0) {
                return true;
            }
            if (iA == 276) {
                DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
                if (deviceFeatureSupportApi != null && deviceFeatureSupportApi.isSupportWheelchair(deviceInfo)) {
                    return true;
                }
            } else if (cqd.c(deviceInfo, iA)) {
                return true;
            }
        }
        return false;
    }

    private void c(eef eefVar, List<eeg> list) {
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        if (njy.e(configInfoList)) {
            ReleaseLogUtil.d("R_HwCommonManager", "infoList empty");
            return;
        }
        final HashMap map = new HashMap();
        list.forEach(new Consumer() { // from class: mme
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                eeg eegVar = (eeg) obj;
                map.put(Long.toString(eegVar.c()), eegVar.i());
            }
        });
        for (eeg eegVar : configInfoList) {
            String string = Long.toString(eegVar.c());
            if (!map.containsKey(string)) {
                LogUtil.a("R_HwCommonManager", "processJsonConfigData configId = ", string, " is not register");
            } else {
                long jLongValue = eegVar.b().longValue();
                final String strB = HEXUtils.b(HEXUtils.a(eegVar.e()));
                qhq.d((String) map.get(string), string, strB, new HiDataOperateListener() { // from class: mmm
                    @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                    public final void onResult(int i, Object obj) {
                        mmi.a(strB, i, obj);
                    }
                }, jLongValue);
            }
        }
    }

    static /* synthetic */ void a(String str, int i, Object obj) {
        String str2 = "onDataReceived setSampleConfig errorCode:" + i + ", object: " + obj + " configData = " + str;
        if (i == 0) {
            LogUtil.a("HwCommonManager", str2);
        } else {
            ReleaseLogUtil.d("HwCommonManager", str2);
        }
    }

    public static void d(String str) {
        ReleaseLogUtil.d("R_HwCommonManager", "releaseMgr");
        synchronized (f41917a) {
            if (f41918c == null) {
                ReleaseLogUtil.d("R_HwCommonManager", "sInstance is null");
                return;
            }
            if (!f41918c.d.equals(str)) {
                ReleaseLogUtil.d("R_HwCommonManager", "releaseMgr mDeviceIdentify is not equals");
                return;
            }
            mmp mmpVar = f41918c.f41919b;
            if (mmpVar != null) {
                mmpVar.a();
            }
            f41918c.b();
            f41918c.e.clear();
            if (f41918c.j.isEmpty()) {
                ReleaseLogUtil.d("R_HwCommonManager", "mRegisterList.isEmpty()");
                f41918c = null;
                return;
            }
            Iterator<String> it = f41918c.j.iterator();
            while (it.hasNext()) {
                edc.e().unRegisterDeviceSampleListener(it.next());
            }
            f41918c.j.clear();
            f41918c = null;
        }
    }

    private void b() {
        if (njy.b(this.i)) {
            ReleaseLogUtil.d("HwCommonManager", "unregisterSubscribeListener");
            HiHealthManager.d(BaseApplication.b()).unSubscribeHiHealthData(this.i, new HiUnSubscribeListener() { // from class: mmi.2
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public void onResult(boolean z) {
                    LogUtil.a("HwCommonManager", "unregisterSubscribeListener isSuccess = ", Boolean.valueOf(z));
                }
            });
        }
    }
}
