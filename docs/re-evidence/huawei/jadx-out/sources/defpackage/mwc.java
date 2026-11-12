package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.vip.api.EquityApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mwc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42549a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mwc f42550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DataReceiveCallback f42551c = new DataReceiveCallback() { // from class: mwc.1
        @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
        public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
            ReleaseLogUtil.d("R_HwSyncHealthGlanceManager", "receive device event errorCode is： ", Integer.valueOf(i));
            if (eecVar instanceof eee) {
                eee eeeVar = (eee) eecVar;
                LogUtil.a("HwSyncHealthGlanceManager", "message instanceof SampleEvent is: ", eeeVar.toString());
                mwc.this.d(myk.a("HwSyncHealthGlanceManager"), eeeVar);
                return;
            }
            ReleaseLogUtil.d("R_HwSyncHealthGlanceManager", "health glance flag receive unrecognized message.");
        }
    };

    public static mwc d() {
        mwc mwcVar;
        synchronized (f42549a) {
            if (f42550b == null) {
                LogUtil.a("HwSyncHealthGlanceManager", "getInstance()");
                f42550b = new mwc();
            }
            mwcVar = f42550b;
        }
        return mwcVar;
    }

    private mwc() {
        ReleaseLogUtil.d("R_HwSyncHealthGlanceManager", "HwSyncHealthGlanceManager");
        b();
        a();
    }

    public void b() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.healthGlanceMgr", this.f42551c);
    }

    public void a() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.benefit", this.f42551c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo, eee eeeVar) {
        long jD = eeeVar.d();
        LogUtil.a("HwSyncHealthGlanceManager", "onDataReceived eventId : ", Long.valueOf(jD));
        if (jD == 80030006) {
            iou.d(deviceInfo);
        } else if (jD == 80030009) {
            b(deviceInfo);
        } else {
            LogUtil.j("HwSyncHealthGlanceManager", "no invalid event id");
        }
    }

    private void b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_HwSyncHealthGlanceManager", "getBenefit deviceInfo is null");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(2);
        c cVar = new c();
        e(countDownLatch, cVar);
        c cVar2 = new c();
        a(countDownLatch, cVar2);
        try {
            LogUtil.a("HwSyncHealthGlanceManager", "getBenefitAndDoctorInfo result：", Boolean.valueOf(countDownLatch.await(10000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e("HwSyncHealthGlanceManager", "getBenefitAndDoctorInfo InterruptedException");
        }
        ReleaseLogUtil.d("R_HwSyncHealthGlanceManager", "sendBenefitTagCommand onSuccess isSuccess = ", Boolean.valueOf(b(deviceInfo, cVar.a(), cVar2.a(), (cVar.b() && cVar2.b()) ? 0 : 101)));
    }

    private void e(final CountDownLatch countDownLatch, final c cVar) {
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j("HwSyncHealthGlanceManager", "handleReviewStatus payApi is null");
            countDownLatch.countDown();
        } else {
            payApi.queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: mwa
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    mwc.a(countDownLatch, cVar, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void a(CountDownLatch countDownLatch, c cVar, int i, Object obj) {
        if (i != 0) {
            LogUtil.j("HwSyncHealthGlanceManager", "queryBenefitInfo fail");
            countDownLatch.countDown();
            return;
        }
        if (!(obj instanceof RepeatResourceBenefitInfo)) {
            LogUtil.j("HwSyncHealthGlanceManager", "queryBenefitInfo fail ：objectData is not RepeatResourceBenefitInfo");
            cVar.d(0);
            cVar.b(true);
            countDownLatch.countDown();
            return;
        }
        LogUtil.a("HwSyncHealthGlanceManager", "queryBenefitInfo objectData = ", HiJsonUtil.d(obj));
        RepeatResourceBenefitInfo repeatResourceBenefitInfo = (RepeatResourceBenefitInfo) obj;
        long nowTime = repeatResourceBenefitInfo.getNowTime() != 0 ? repeatResourceBenefitInfo.getNowTime() : System.currentTimeMillis();
        LogUtil.a("HwSyncHealthGlanceManager", "queryBenefitInfo currentTime = ", Long.valueOf(nowTime));
        if (repeatResourceBenefitInfo.getExpireTime().longValue() == 0) {
            cVar.d(0);
        } else if (repeatResourceBenefitInfo.getExpireTime().longValue() >= nowTime) {
            cVar.d(1);
        } else {
            cVar.d(2);
        }
        cVar.b(true);
        countDownLatch.countDown();
    }

    public static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f42555c;
        public boolean e;

        public int a() {
            return this.f42555c;
        }

        public void d(int i) {
            this.f42555c = i;
        }

        public boolean b() {
            return this.e;
        }

        public void b(boolean z) {
            this.e = z;
        }
    }

    private void a(final CountDownLatch countDownLatch, final c cVar) {
        EquityApi equityApi = (EquityApi) Services.d("Main", EquityApi.class);
        if (equityApi == null) {
            LogUtil.j("HwSyncHealthGlanceManager", "handleReviewStatus equityApi is null");
            countDownLatch.countDown();
        } else {
            equityApi.getDoctorBasicInfo(new DataCallback() { // from class: mwc.3
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.d("R_HwSyncHealthGlanceManager", "getDoctorBasicInfo onFailure errorCode is: ", Integer.valueOf(i));
                    if (i == 23008) {
                        cVar.b(true);
                        cVar.d(0);
                    }
                    countDownLatch.countDown();
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.a("HwSyncHealthGlanceManager", "getDoctorBasicInfo data = " + jSONObject.toString());
                    if (jSONObject.optInt("resultCode") != 0) {
                        countDownLatch.countDown();
                        return;
                    }
                    if (TextUtils.isEmpty(jSONObject.optString("doctorId")) || "0".equals(jSONObject.optString("doctorId"))) {
                        LogUtil.a("HwSyncHealthGlanceManager", "getDoctorBasicInfo data empty");
                        cVar.b(true);
                        cVar.d(0);
                        countDownLatch.countDown();
                        return;
                    }
                    cVar.b(true);
                    cVar.d(1);
                    countDownLatch.countDown();
                }
            });
        }
    }

    private static boolean b(DeviceInfo deviceInfo, int i, int i2, int i3) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.benefit");
        eeeVar.setWearPkgName("hw.watch.health.bp.benefit");
        eeeVar.setCommandId(2);
        eeeVar.a(80030009L);
        eeeVar.a(0);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("resultCode", Integer.valueOf(i3));
        jsonObject.addProperty("isHasBenefit", Integer.valueOf(i));
        jsonObject.addProperty("isHasSignDoctor", Integer.valueOf(i2));
        String string = jsonObject.toString();
        eeeVar.e(eeq.c(eeq.a(string)));
        ReleaseLogUtil.d("R_HwSyncHealthGlanceManager", "sendBenefitTagCommand object: ", string, "sendBenefitTagCommand sampleEvent: ", eeeVar.toString());
        return edc.e().sendSampleEventCommand(deviceInfo, eeeVar, "HwSyncHealthGlanceManager");
    }

    public static void e() {
        ReleaseLogUtil.d("R_HwSyncHealthGlanceManager", "releaseMgr");
        synchronized (f42549a) {
            if (f42550b == null) {
                ReleaseLogUtil.d("R_HwSyncHealthGlanceManager", "sInstance is null");
                return;
            }
            edc.e().unRegisterDeviceSampleListener("hw.unitedevice.healthGlanceMgr");
            edc.e().unRegisterDeviceSampleListener("hw.unitedevice.benefit");
            f42550b = null;
        }
    }
}
