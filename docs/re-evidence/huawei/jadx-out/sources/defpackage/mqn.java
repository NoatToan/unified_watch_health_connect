package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.constant.ResultCodeMessage;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DictionaryCommonInfo;
import com.huawei.health.devicemgr.business.entity.Result;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwbloodglucose.MacaTimeManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataJsApi;
import com.huawei.ui.commonui.R;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes11.dex */
public class mqn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mqn f42187c;
    private Runnable g;
    private static final Object d = new Object();
    private static final List<Integer> e = Arrays.asList(80030010, Integer.valueOf(MatterDataContans.EVENT_ID_BLOODGLUCOSE_MONITOR_CONTROL), 80030012);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f42185a = {500035, 500036, 500037, 500038, 500039, 500040, 500041};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f42186b = {500035, 500043};
    private Handler h = new Handler(Looper.getMainLooper());
    private int f = 0;
    private String i = "";
    private final List<Integer> k = Arrays.asList(0, Integer.valueOf(R.string.IDS_maca_urgent_low_blood_sugar_reminder), Integer.valueOf(R.string.IDS_maca_impend_hypoglycemia), Integer.valueOf(R.string.IDS_maca_hypoglycemia), Integer.valueOf(R.string.IDS_maca_high_blood_sugar), Integer.valueOf(R.string.IDS_maca_rapid_increase_blood_sugar), Integer.valueOf(R.string.IDS_maca_rapid_decrease_blood_sugar));
    private final List<Integer> l = Arrays.asList(0, Integer.valueOf(R.string.IDS_maca_wear_confirm), Integer.valueOf(R.string.IDS_maca_temperature_high), Integer.valueOf(R.string.IDS_maca_temperature_low), Integer.valueOf(R.string.IDS_maca_temp_device_error), Integer.valueOf(R.string.IDS_maca_change_device), Integer.valueOf(R.string.IDS_maca_change_device), Integer.valueOf(R.string.IDS_maca_wear_error));
    private final List<Integer> m = Arrays.asList(0, Integer.valueOf(R.string.IDS_maca_device_fall_1), Integer.valueOf(R.string.IDS_maca_temperature_device), Integer.valueOf(R.string.IDS_maca_temperature_device), Integer.valueOf(R.string.IDS_maca_no_blood_sugar_data), Integer.valueOf(R.string.IDS_maca_no_blood_sugar_data_1), Integer.valueOf(R.string.IDS_maca_device_died), Integer.valueOf(R.string.IDS_maca_device_fall));
    private final List<Integer> n = Arrays.asList(0, Integer.valueOf(R.string.IDS_maca_content_1_mmol), Integer.valueOf(R.plurals.IDS_maca_content_2_mmol), Integer.valueOf(R.string.IDS_maca_content_3_mmol), Integer.valueOf(R.string.IDS_maca_content_4_mmol));
    private final List<Integer> o = Arrays.asList(0, Integer.valueOf(R.string.IDS_maca_content_1_mg), Integer.valueOf(R.plurals.IDS_maca_content_2_mg), Integer.valueOf(R.string.IDS_maca_content_3_mg), Integer.valueOf(R.string.IDS_maca_content_4_mg));
    private final DataReceiveCallback j = new DataReceiveCallback() { // from class: mqr
        @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
        public final void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
            this.f42195a.e(i, deviceInfo, eecVar);
        }
    };

    static /* synthetic */ void b(int i, Object obj) {
    }

    static /* synthetic */ int b(mqn mqnVar, int i) {
        int i2 = mqnVar.f + i;
        mqnVar.f = i2;
        return i2;
    }

    public DataReceiveCallback c() {
        return this.j;
    }

    /* synthetic */ void e(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (deviceInfo == null) {
            LogUtil.e("BloodGlucoseDeviceManager", "blood device info is null code is " + i);
            return;
        }
        if (eecVar == null) {
            LogUtil.e("BloodGlucoseDeviceManager", "blood device dictionary message is null code is " + i);
            return;
        }
        LogUtil.a("BloodGlucoseDeviceManager", "received device is " + deviceInfo.getDeviceName() + " error code is " + i);
        if (eecVar.getCommandId() != 2) {
            LogUtil.j("BloodGlucoseDeviceManager", "current command is not matter command");
        } else if (!(eecVar instanceof eee)) {
            LogUtil.j("BloodGlucoseDeviceManager", "message is not event object");
        } else {
            c(deviceInfo, (eee) eecVar);
        }
    }

    public static mqn d() {
        mqn mqnVar;
        synchronized (d) {
            if (f42187c == null) {
                LogUtil.a("BloodGlucoseDeviceManager", "create new instance");
                f42187c = new mqn();
            }
            mqnVar = f42187c;
        }
        return mqnVar;
    }

    public mqn() {
        BroadcastManagerUtil.c(BaseApplication.getContext(), new BroadcastReceiver() { // from class: mqn.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (context == null || intent == null) {
                    LogUtil.j("BloodGlucoseDeviceManager", "CommonFileRequestManager context or intent is null");
                    return;
                }
                if (!"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    LogUtil.j("BloodGlucoseDeviceManager", "CommonFileRequestManager receiver not connect change");
                    return;
                }
                DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                if (deviceInfo == null) {
                    LogUtil.j("BloodGlucoseDeviceManager", "mConnectStateChangedReceiver deviceInfo null");
                    return;
                }
                if (deviceInfo.getProductType() == 275 || deviceInfo.getProductType() == 96) {
                    LogUtil.a("BloodGlucoseDeviceManager", "mConnectStateChangedReceiver() status:", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                    int deviceConnectState = deviceInfo.getDeviceConnectState();
                    if (deviceConnectState == 2) {
                        mqn.this.b(deviceInfo);
                        mqn.this.i = "";
                        return;
                    } else {
                        if (deviceConnectState != 3) {
                            return;
                        }
                        mqn.this.i = deviceInfo.getDeviceIdentify();
                        mqn.this.g(deviceInfo);
                        return;
                    }
                }
                LogUtil.j("BloodGlucoseDeviceManager", "current device not maca");
            }
        }, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    public void a(DictionaryCommonInfo dictionaryCommonInfo, int[] iArr) {
        for (int i : iArr) {
            mvh mvhVar = new mvh();
            mvhVar.c(i);
            mvhVar.b(dictionaryCommonInfo.getSrcPkgName());
            mvhVar.c(dictionaryCommonInfo.getDestPkgName());
            mzb.e().a(dictionaryCommonInfo.getDeviceInfo(), mvhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(final DeviceInfo deviceInfo) {
        this.f = 0;
        Runnable runnable = new Runnable() { // from class: mqn.1
            @Override // java.lang.Runnable
            public void run() {
                int i;
                if (!Objects.equals(mqn.this.i, deviceInfo.getDeviceIdentify())) {
                    LogUtil.j("BloodGlucoseDeviceManager", "no need to report disconnect");
                    return;
                }
                String strE = SharedPreferenceManager.e(com.huawei.haf.application.BaseApplication.b(), String.valueOf(10008), nio.e(deviceInfo.getDeviceIdentify()) + "DEVICE_CONNECT");
                String strE2 = SharedPreferenceManager.e(com.huawei.haf.application.BaseApplication.b(), String.valueOf(10008), nio.e(deviceInfo.getDeviceIdentify()) + "DEVICE_CONNECT_TH");
                boolean z = TextUtils.isEmpty(strE) || strE.equals("1");
                try {
                    i = (int) Double.parseDouble(strE2);
                } catch (NumberFormatException unused) {
                    LogUtil.j("BloodGlucoseDeviceManager", "parse th failed " + strE2);
                    i = 60;
                }
                LogUtil.a("BloodGlucoseDeviceManager", "current disconnect state " + z + " , " + i);
                if (z) {
                    mqp.b(com.huawei.haf.application.BaseApplication.b().getResources().getString(R.string.IDS_hw_maca_health_wear_connect_device_disconnect), com.huawei.haf.application.BaseApplication.b().getResources().getString(R.string.IDS_maca_disconnected_info, 10), deviceInfo, 10, 2);
                }
                mqn.b(mqn.this, i);
                if (mqn.this.f < 240) {
                    mqn.this.h.postDelayed(this, ((long) i) * 60000);
                } else {
                    mqn.this.b();
                }
            }
        };
        this.g = runnable;
        this.h.postDelayed(runnable, 180000L);
        LogUtil.a("BloodGlucoseDeviceManager", "handle disconnected success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final DeviceInfo deviceInfo) {
        LogUtil.a("BloodGlucoseDeviceManager", "begin handle device connected " + deviceInfo);
        c(deviceInfo);
        final mzh mzhVar = new mzh();
        mzhVar.e(deviceInfo.getDeviceIdentify());
        mzhVar.e(-1);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        new Thread(new Runnable() { // from class: mqq
            @Override // java.lang.Runnable
            public final void run() {
                new mzm(deviceInfo, mzhVar, jCurrentTimeMillis).startTask(new IBaseResponseCallback() { // from class: mql
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        mqn.b(i, obj);
                    }
                });
            }
        }).start();
        Runnable runnable = this.g;
        if (runnable != null) {
            this.h.removeCallbacks(runnable);
            b();
        }
    }

    private void c(DeviceInfo deviceInfo, eee eeeVar) {
        int iD = (int) eeeVar.d();
        LogUtil.a("BloodGlucoseDeviceManager", "handle device id " + iD);
        if (e.contains(Integer.valueOf(iD))) {
            switch (iD) {
                case 80030010:
                    d(deviceInfo, eeeVar);
                    break;
                case MatterDataContans.EVENT_ID_BLOODGLUCOSE_MONITOR_CONTROL /* 80030011 */:
                    b(deviceInfo, eeeVar);
                    break;
                case 80030012:
                    e(deviceInfo, eeeVar);
                    break;
            }
            return;
        }
        LogUtil.j("BloodGlucoseDeviceManager", iD + " not matter event");
    }

    private void e(DeviceInfo deviceInfo, eee eeeVar) {
        try {
            ees eesVarB = new eet().b(cph.d(eeeVar.c()));
            if (eesVarB == null) {
                LogUtil.e("BloodGlucoseDeviceManager", "tlv parse failed. father is null");
                return;
            }
            if (eesVarB.e() == null) {
                LogUtil.e("BloodGlucoseDeviceManager", "tlv parse failed. list is null");
                return;
            }
            int iA = 0;
            int iA2 = 0;
            int iD = 0;
            boolean z = false;
            for (eew eewVar : eesVarB.e()) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 2) {
                    iA = cpb.a(eewVar.b());
                } else if (iV == 8) {
                    iA2 = cpb.a(eewVar.b());
                    z = true;
                } else if (iV != 9) {
                    LogUtil.j("BloodGlucoseDeviceManager", "parse device info tag: ", Integer.valueOf(iV));
                } else {
                    iD = (int) (cpb.d(eewVar.b()) / 60000);
                }
            }
            MacaTimeManager.d().c(deviceInfo.getDeviceIdentify(), iA, iA2, iD);
            if (z) {
                Intent intent = new Intent();
                intent.setAction("com.huawei.bone.action.REMAINING_TIME");
                intent.putExtra("DEVICE_MAC", deviceInfo.getDeviceIdentify());
                BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
            }
        } catch (eeu e2) {
            LogUtil.e("BloodGlucoseDeviceManager", "parse tlv failed message is " + e2.getMessage());
        }
    }

    private void b(DeviceInfo deviceInfo, eee eeeVar) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), nio.e(deviceInfo.getDeviceIdentify()) + "DEVICE_ERROR");
        boolean z = TextUtils.isEmpty(strE) || strE.equals("1");
        ReleaseLogUtil.d("BloodGlucoseDeviceManager", "device error report switch: " + z);
        try {
            ees eesVarB = new eet().b(cph.d(eeeVar.c()));
            if (eesVarB == null) {
                LogUtil.e("BloodGlucoseDeviceManager", "tlv parse failed. father is null");
                return;
            }
            if (eesVarB.e() == null) {
                LogUtil.e("BloodGlucoseDeviceManager", "tlv parse failed. list is null");
                return;
            }
            for (eew eewVar : eesVarB.e()) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 2) {
                    a(new DictionaryCommonInfo(MatterDataJsApi.APP_PACKAGE_NAME, MatterDataJsApi.MATTER_PACKAGE_NAME, deviceInfo), f42186b);
                } else if (iV != 3) {
                    continue;
                } else {
                    if (!z) {
                        return;
                    }
                    int iV2 = CommonUtil.v(eewVar.b());
                    if (iV2 >= 1 && iV2 < this.l.size()) {
                        mqp.b(com.huawei.haf.application.BaseApplication.b().getResources().getString(this.l.get(iV2).intValue()), com.huawei.haf.application.BaseApplication.b().getResources().getString(this.m.get(iV2).intValue()), deviceInfo, iV2 + 1000, 2);
                    }
                }
            }
        } catch (eeu e2) {
            LogUtil.e("BloodGlucoseDeviceManager", "parse tlv failed message is " + e2.getMessage());
        }
    }

    private void d(DeviceInfo deviceInfo, eee eeeVar) {
        String string;
        DictionaryCommonInfo dictionaryCommonInfo = new DictionaryCommonInfo(MatterDataJsApi.APP_PACKAGE_NAME, MatterDataJsApi.MATTER_PACKAGE_NAME, deviceInfo);
        int[] iArr = f42185a;
        a(dictionaryCommonInfo, new int[]{iArr[0]});
        try {
            cql.c cVarA = new cql().a(eeeVar.c(), 0);
            String string2 = null;
            byte[] bArrA = cVarA.a((byte) 1, null);
            if (bArrA != null) {
                cph.a(bArrA, false);
            }
            cVarA.d((byte) 2, -1);
            int iD = cVarA.d((byte) 3, -1);
            byte[] bArrA2 = cVarA.a((byte) 4, null);
            double dA = bArrA2 != null ? cph.a(bArrA2, false) : 0.0d;
            if (iD < 1 || iD >= this.k.size()) {
                string = null;
            } else {
                string = com.huawei.haf.application.BaseApplication.b().getResources().getString(this.k.get(iD).intValue());
                a(dictionaryCommonInfo, new int[]{iArr[iD]});
            }
            double dRound = Math.round(dA * 10.0d) / 10.0d;
            int i = (int) dRound;
            LogUtil.a("zrr", Integer.valueOf(i));
            boolean zA = a();
            List<Integer> list = zA ? this.n : this.o;
            switch (iD) {
                case 1:
                case 3:
                case 4:
                    string2 = com.huawei.haf.application.BaseApplication.b().getResources().getString(list.get(iD).intValue(), d(zA, dRound));
                    break;
                case 2:
                    string2 = com.huawei.haf.application.BaseApplication.b().getResources().getQuantityString(list.get(iD).intValue(), i, Integer.toString(i), d(zA, 3.9d));
                    break;
                case 5:
                    string2 = com.huawei.haf.application.BaseApplication.b().getResources().getString(R.string.IDS_maca_content_5);
                    break;
                case 6:
                    string2 = com.huawei.haf.application.BaseApplication.b().getResources().getString(R.string.IDS_maca_content_6);
                    break;
            }
            if (string == null) {
                return;
            }
            mqp.b(string, string2, deviceInfo, iD, 1);
        } catch (Exception e2) {
            LogUtil.e("BloodGlucoseDeviceManager", "parse event failed " + e2.getMessage());
        }
    }

    private boolean a() {
        final boolean[] zArr = {true};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(MatterDataContans.CONFIG_ID_UNIT_TYPE);
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: mqn.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                health.compact.a.LogUtil.b("BloodGlucoseDeviceManager", "onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (!njy.e(list) && njy.b(obj, HiSampleConfig.class)) {
                        String strA = ffv.a(((HiSampleConfig) list.get(0)).getConfigData(), MatterDataContans.KEY_UNIT_TYPE);
                        zArr[0] = Objects.equals(strA, "0");
                        health.compact.a.LogUtil.b("BloodGlucoseDeviceManager", "unit: ", strA, ", isMmol : ", Boolean.valueOf(zArr[0]));
                    }
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                health.compact.a.LogUtil.b("BloodGlucoseDeviceManager", "onResultIntent errorCode: ", Integer.valueOf(i2), ", data: ", obj);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            LogUtil.j("BloodGlucoseDeviceManager", "countDown interrupt");
        }
        return zArr[0];
    }

    public String d(boolean z, double d2) {
        if (z) {
            return Double.toString(d2);
        }
        return Integer.toString((int) Math.round(d2 * 18.0d));
    }

    public void c(DeviceInfo deviceInfo) {
        byte[] bArrE = new cqj().c(2).c(8).c(9).e();
        eee eeeVar = new eee();
        eeeVar.e(bArrE);
        eeeVar.a(80030012L);
        eeeVar.a(0);
        eeeVar.setSrcPkgName(MatterDataJsApi.APP_PACKAGE_NAME);
        eeeVar.setWearPkgName(MatterDataJsApi.MATTER_PACKAGE_NAME);
        edc.e().sendSampleEventCommand(deviceInfo, eeeVar, "BloodGlucoseDeviceManager");
    }

    public Result e(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.e("BloodGlucoseDeviceManager", "current device is not connected state " + deviceInfo.getDeviceConnectState());
            return Result.error(ResultCodeMessage.GET_TIME_ERROR_CODE.value(), "connect state is disconnect");
        }
        long jD = MacaTimeManager.d().d(deviceInfo.getDeviceIdentify());
        LogUtil.a("BloodGlucoseDeviceManager", "get remain time is " + jD);
        return Result.success(Long.toString(jD));
    }

    public Result d(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.e("BloodGlucoseDeviceManager", "current device is not connected state " + deviceInfo.getDeviceConnectState());
            return Result.error(ResultCodeMessage.GET_TIME_ERROR_CODE.value(), "connect state is disconnect");
        }
        long jE = MacaTimeManager.d().e(deviceInfo.getDeviceIdentify());
        LogUtil.a("BloodGlucoseDeviceManager", "get warmup time is " + jE);
        return Result.success(Long.toString(jE));
    }

    public Result a(DeviceInfo deviceInfo) {
        long jA = ((long) MacaTimeManager.d().a(deviceInfo.getDeviceIdentify())) * 60000;
        LogUtil.a("BloodGlucoseDeviceManager", "get activation time is " + jA);
        return Result.success(Long.toString(jA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f = 0;
        this.g = null;
    }
}
