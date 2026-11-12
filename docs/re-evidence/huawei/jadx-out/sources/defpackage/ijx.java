package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.threeCircle.remind.model.OnRemindHandle;
import com.huawei.health.threeCircle.remind.model.ThreeCircleRemindData;
import com.huawei.health.threeCircle.remind.receiver.SportRemindReceiver;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ijx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f37727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResponseCallback<ThreeCircleRemindData> f37728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ikr f37729c;
    private DeviceInfo d;
    private Map<String, Integer> e;
    private ConcurrentHashMap<String, OnRemindHandle> i;

    /* synthetic */ void e(int i, ThreeCircleRemindData threeCircleRemindData) {
        if (threeCircleRemindData == null) {
            ReleaseLogUtil.a("R_TC_SprtRmdDistCtr", "ThreeCircleRemindData is null.");
            return;
        }
        if ("TodayAchievement".equals(threeCircleRemindData.getRemindType()) || "OverGoal".equals(threeCircleRemindData.getRemindType())) {
            if ("0".equals(ikx.a("900200011"))) {
                LogUtil.j("TC_SprtRmdDistCtr", "switch is close.", threeCircleRemindData.getRemindType(), threeCircleRemindData.getSubRemindType());
                return;
            }
        } else if ("0".equals(ikx.a("900200010"))) {
            ReleaseLogUtil.e("R_TC_SprtRmdDistCtr", "switch is close.", threeCircleRemindData.getRemindType(), threeCircleRemindData.getSubRemindType());
            return;
        }
        ReleaseLogUtil.d("R_TC_SprtRmdDistCtr", "response remind data:", threeCircleRemindData.toString());
        if (ika.c()) {
            ReleaseLogUtil.d("R_TC_SprtRmdDistCtr", "send broad cast.");
            if (threeCircleRemindData.getDeviceEventData() == null) {
                ReleaseLogUtil.d("R_TC_SprtRmdDistCtr", "no device event data.");
                return;
            }
            DeviceInfo deviceInfo = this.d;
            if (deviceInfo == null) {
                ReleaseLogUtil.d("R_TC_SprtRmdDistCtr", "no device connected.");
                return;
            } else {
                e(deviceInfo, threeCircleRemindData);
                return;
            }
        }
        if (Utils.o()) {
            return;
        }
        ReleaseLogUtil.d("R_TC_SprtRmdDistCtr", "show notification.");
        ikc.c(threeCircleRemindData);
    }

    private ijx() {
        this.f37728b = new ResponseCallback() { // from class: ijy
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.e(i, (ThreeCircleRemindData) obj);
            }
        };
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final ijx f37730a = new ijx();
    }

    public static final ijx a() {
        return b.f37730a;
    }

    public void e() {
        ReleaseLogUtil.d("R_TC_SprtRmdDistCtr", "registerDeviceStatusReceiver");
        if (this.f37727a == null) {
            this.f37727a = new BroadcastReceiver() { // from class: ijx.5
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    LogUtil.a("TC_SprtRmdDistCtr", "mDeviceConnectStatusReceiver onReceive");
                    if (intent == null) {
                        LogUtil.e("TC_SprtRmdDistCtr", "mDeviceConnectStatusReceiver intent is null");
                        return;
                    }
                    if (!"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                        ReleaseLogUtil.e("R_TC_SprtRmdDistCtr", "registerDeviceStatusReceiver action is not ACTION_CONNECTION_STATE_CHANGED");
                        return;
                    }
                    Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                    if (!(parcelableExtra instanceof DeviceInfo)) {
                        ReleaseLogUtil.e("R_TC_SprtRmdDistCtr", "registerDeviceStatusReceiver object is not DeviceInfo");
                    } else {
                        ijx.this.a((DeviceInfo) parcelableExtra);
                    }
                }
            };
        }
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(BaseApplication.b(), this.f37727a, intentFilter, LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            boolean zC = ika.c(deviceInfo);
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            ReleaseLogUtil.d("R_TC_SprtRmdDistCtr", "mConnectStateChangedReceiver() status: ", Integer.valueOf(deviceConnectState), deviceInfo.getDeviceName(), " isSupportCompleteThreeCircle:", Boolean.valueOf(zC));
            if (zC) {
                if (deviceInfo.getDeviceConnectState() == 2) {
                    this.d = deviceInfo;
                    c(deviceInfo);
                }
                if (deviceInfo.getDeviceConnectState() == 3) {
                    this.d = null;
                    e(deviceInfo);
                }
            }
        }
    }

    private void e(DeviceInfo deviceInfo, ThreeCircleRemindData threeCircleRemindData) {
        if (threeCircleRemindData == null) {
            LogUtil.e("TC_SprtRmdDistCtr", "remindData == null.");
        } else if (threeCircleRemindData.getDeviceEventData() == null) {
            LogUtil.e("TC_SprtRmdDistCtr", "DeviceEventData == null.");
        } else {
            ika.c(deviceInfo, threeCircleRemindData.getDeviceEventData());
        }
    }

    private void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            ReleaseLogUtil.a("R_TC_SprtRmdDistCtr", "device info null or not connected.");
            return;
        }
        ReleaseLogUtil.d("R_TC_SprtRmdDistCtr", "onDeviceConnected:", deviceInfo.getDeviceName());
        ika.b(deviceInfo);
        edc.e().registerDeviceSampleListener("hw.sport.threecircle", new DataReceiveCallback() { // from class: ijv
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public final void onDataReceived(int i, DeviceInfo deviceInfo2, eec eecVar) {
                this.f37725b.a(i, deviceInfo2, eecVar);
            }
        });
    }

    /* synthetic */ void a(int i, DeviceInfo deviceInfo, eec eecVar) {
        ReleaseLogUtil.d("R_TC_SprtRmdDistCtr", "receive device event.", Integer.valueOf(i));
        if (!(eecVar instanceof eee)) {
            LogUtil.e("TC_SprtRmdDistCtr", "message not instanceof SampleEvent.");
        } else {
            e(ika.d((eee) eecVar), true);
        }
    }

    private void e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_TC_SprtRmdDistCtr", "onDeviceDisconnected: deviceInfo is null");
        } else {
            ReleaseLogUtil.d("R_TC_SprtRmdDistCtr", "onDeviceDisconnected:", deviceInfo.getDeviceName());
            edc.e().unRegisterDeviceSampleListener("hw.sport.threecircle");
        }
    }

    private void e(String str, boolean z) {
        OnRemindHandle onRemindHandleB = b(str);
        if (onRemindHandleB == null) {
            return;
        }
        if (this.f37729c == null) {
            this.f37729c = new ikr();
        }
        onRemindHandleB.onTrigger(i(), new ikp(this.f37729c, str, z, this.f37728b));
    }

    public void c(String str) {
        e(str, false);
    }

    public void b(String str, Bundle bundle) {
        OnRemindHandle onRemindHandleB = b(str);
        if (onRemindHandleB == null) {
            return;
        }
        if (this.f37729c == null) {
            this.f37729c = new ikr();
        }
        onRemindHandleB.onTrigger(bundle, i(), new ikp(this.f37729c, str, this.f37728b));
    }

    public void d() {
        String[] strArr = {"LagEncourage", "YesterdaySummary", "ActiveWeek", "PerfectMonth"};
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            OnRemindHandle onRemindHandleB = b(str);
            if (onRemindHandleB != null && onRemindHandleB.isActiveTrigger()) {
                ReleaseLogUtil.d("R_TC_SprtRmdDistCtr", "tryActiveTriggerRemind:", str);
                onRemindHandleB.onTrigger(i(), new ikp(this.f37729c, str, false, this.f37728b));
            }
        }
    }

    public void c() {
        e(101010, SharedPerferenceUtils.v(BaseApplication.b()), "TodayAchievement");
        e(101011, SharedPerferenceUtils.z(BaseApplication.b()), "YesterdaySummary");
        d("WeekSummary");
        d("ActiveWeek");
        d("PerfectMonth");
        d("MonthSummary");
    }

    private void e(int i, int i2, String str) {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        if (i2 == -1 || (iA != i2 && i2 != 0)) {
            xjk.d(i, new Intent(BaseApplication.b(), (Class<?>) SportRemindReceiver.class), 335544320);
        }
        if (iA == i2 && i2 != 0) {
            LogUtil.a("TC_SprtRmdDistCtr", "remind already");
        } else {
            d(str);
            ReleaseLogUtil.d("TC_SprtRmdDistCtr", "setEventRemind RemindAlarm", Integer.valueOf(iA), "remindDay:", Integer.valueOf(i2));
        }
    }

    public void d(String str) {
        OnRemindHandle onRemindHandleB = b(str);
        if (onRemindHandleB == null) {
            return;
        }
        onRemindHandleB.registerAlarm();
    }

    public void b() {
        ConcurrentHashMap<String, OnRemindHandle> concurrentHashMap = this.i;
        if (concurrentHashMap != null) {
            for (OnRemindHandle onRemindHandle : concurrentHashMap.values()) {
                if (onRemindHandle != null) {
                    onRemindHandle.destroy();
                }
            }
        }
        ikr ikrVar = this.f37729c;
        if (ikrVar != null) {
            ikrVar.e();
            this.f37729c = null;
        }
        if (this.f37727a != null) {
            BaseApplication.b().unregisterReceiver(this.f37727a);
            this.f37727a = null;
        }
    }

    private OnRemindHandle b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.i == null) {
            this.i = new ConcurrentHashMap<>();
        }
        OnRemindHandle onRemindHandle = this.i.get(str);
        if (onRemindHandle != null) {
            return onRemindHandle;
        }
        if ("TodayAchievement".equals(str) || "LagEncourage".equals(str) || "OverGoal".equals(str)) {
            ikg ikgVar = new ikg();
            this.i.put("TodayAchievement", ikgVar);
            this.i.put("LagEncourage", ikgVar);
            this.i.put("OverGoal", ikgVar);
            return ikgVar;
        }
        return a(str);
    }

    private OnRemindHandle a(String str) {
        if ("YesterdaySummary".equals(str)) {
            ikk ikkVar = new ikk();
            this.i.put("YesterdaySummary", ikkVar);
            return ikkVar;
        }
        if ("WeekSummary".equals(str)) {
            ikm ikmVar = new ikm();
            this.i.put("WeekSummary", ikmVar);
            return ikmVar;
        }
        if ("ActiveWeek".equals(str) || "PerfectWeek".equals(str)) {
            iko ikoVar = new iko();
            this.i.put("ActiveWeek", ikoVar);
            return ikoVar;
        }
        if ("PerfectMonth".equals(str)) {
            ike ikeVar = new ike();
            this.i.put("PerfectMonth", ikeVar);
            return ikeVar;
        }
        if ("MonthSummary".equals(str)) {
            ikd ikdVar = new ikd();
            this.i.put("MonthSummary", ikdVar);
            return ikdVar;
        }
        ReleaseLogUtil.e("R_TC_SprtRmdDistCtr", "not support this remind type.", str);
        return null;
    }

    private Map<String, Integer> i() {
        Map<String, Integer> map = this.e;
        if (map == null || map.size() == 0) {
            HashMap map2 = new HashMap();
            this.e = map2;
            map2.put("OverGoal", 1000);
            this.e.put("TodayAchievement", 900);
            this.e.put("MonthSummary", 800);
            this.e.put("WeekSummary", 700);
            this.e.put("PerfectMonth", 600);
            this.e.put("PerfectWeek", 500);
            this.e.put("ActiveWeek", 400);
            this.e.put("YesterdaySummary", 300);
            this.e.put("LagEncourage", 200);
        }
        return this.e;
    }
}
