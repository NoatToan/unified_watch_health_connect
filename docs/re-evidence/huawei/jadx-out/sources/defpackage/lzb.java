package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lzb extends HwBaseManager implements BluetoothDataReceiveCallback {
    private static lzb d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f41179c;
    private lvb g;
    private IBaseResponseCallback h;
    private Context j;
    private static final byte[] e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<IBaseResponseCallback> f41177a = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<IBaseResponseCallback> f41178b = new ArrayList(10);

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public boolean onDataMigrate() {
        return true;
    }

    private lzb(Context context) {
        super(context);
        this.h = new IBaseResponseCallback() { // from class: lzb.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HwLinkLossAlarmManager", "autoSendCommend response: ", obj);
            }
        };
        this.f41179c = new BroadcastReceiver() { // from class: lzb.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Parcelable parcelableExtra;
                if (intent == null) {
                    LogUtil.j("HwLinkLossAlarmManager", "connectStateChangedReceiver intent is null");
                    return;
                }
                LogUtil.a("HwLinkLossAlarmManager", "connectStateChangedReceiver action = ", intent.getAction());
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    try {
                        parcelableExtra = intent.getParcelableExtra("deviceinfo");
                    } catch (BadParcelableException unused) {
                        LogUtil.e("HwLinkLossAlarmManager", "fuzzy test exception, no care this.");
                        parcelableExtra = null;
                    }
                    if (!(parcelableExtra instanceof DeviceInfo)) {
                        LogUtil.a("HwLinkLossAlarmManager", "device info is wrong, please check.");
                        return;
                    }
                    DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                    if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2) {
                        lzb.this.c();
                    } else {
                        LogUtil.j("HwLinkLossAlarmManager", "connectStateChangedReceiver deviceInfo is null or connection status is broken");
                    }
                }
            }
        };
        this.j = context;
        lvb lvbVarE = lvb.e();
        this.g = lvbVarE;
        if (lvbVarE != null) {
            BroadcastManagerUtil.c(context, this.f41179c, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
            this.g.d(11, this);
            c();
            return;
        }
        LogUtil.e("HwLinkLossAlarmManager", "HwLinkLossAlarmManager() hwDeviceConfigManager is null");
    }

    public static lzb b() {
        lzb lzbVar;
        synchronized (e) {
            if (d == null) {
                d = new lzb(BaseApplication.getContext());
            }
            lzbVar = d;
        }
        return lzbVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 11;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        try {
            e();
            this.j.unregisterReceiver(this.f41179c);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HwLinkLossAlarmManager", "connectStateChangedReceiver is not registered");
        }
        LogUtil.a("HwLinkLossAlarmManager", "onDestroy()");
    }

    private static void e() {
        synchronized (e) {
            d = null;
        }
        synchronized (h()) {
            f41178b.clear();
        }
        synchronized (a()) {
            f41177a.clear();
        }
    }

    public void b(String str, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwLinkLossAlarmManager", "setBTLostRemindEnable: ", Boolean.valueOf(z));
        c(str, z, iBaseResponseCallback);
        a(str, z);
    }

    public void c(String str, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwLinkLossAlarmManager", "sendBtLostRemindEnable: ", Boolean.valueOf(z));
        mhs.a().sendSetSwitchSettingCmd(z, str, 11, 3, null);
        synchronized (h()) {
            f41178b.add(iBaseResponseCallback);
        }
    }

    private void a(String str, boolean z) {
        LogUtil.a("HwLinkLossAlarmManager", "saveBtLostRemindEnableToSharedPreference() : isChecked = ", Boolean.valueOf(z));
        DeviceInfo deviceInfoB = mgg.b(str, "HwLinkLossAlarmManager");
        if (deviceInfoB != null) {
            boolean zA = a(deviceInfoB, "bt_lost_remind", z);
            if (!zA) {
                mhs.a().setSwitchSetting("bt_lost_remind", z ? "1" : "0", null);
                return;
            } else {
                LogUtil.a("HwLinkLossAlarmManager", "saveBtLostRemindEnableToSharedPreference() : isFamilyMode = ", Boolean.valueOf(zA));
                return;
            }
        }
        LogUtil.e("HwLinkLossAlarmManager", "saveBtLostRemindEnableToSharedPreference() : deviceInfo is null");
    }

    private boolean a(DeviceInfo deviceInfo, String str, boolean z) {
        if (!lxc.a(deviceInfo.getDeviceIdentify())) {
            return false;
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), str, Boolean.toString(z), null);
        return true;
    }

    private void b(byte[] bArr) {
        int i;
        LogUtil.a("HwLinkLossAlarmManager", "getResult(): ", eeq.e(bArr));
        if (bArr.length < 2) {
            LogUtil.e("HwLinkLossAlarmManager", "getResult(): data error");
            return;
        }
        byte b2 = bArr[1];
        if (b2 == 2) {
            int iE = e(bArr);
            i = iE == 100000 ? 0 : -1;
            synchronized (a()) {
                if (f41177a.size() != 0) {
                    f41177a.get(0).a(i, Integer.valueOf(iE));
                    f41177a.remove(0);
                }
            }
            return;
        }
        if (b2 == 3) {
            int iE2 = e(bArr);
            i = iE2 == 100000 ? 0 : -1;
            synchronized (h()) {
                if (f41178b.size() != 0) {
                    f41178b.get(0).a(i, Integer.valueOf(iE2));
                    f41178b.remove(0);
                }
            }
            return;
        }
        LogUtil.j("HwLinkLossAlarmManager", "Command does not match ");
    }

    private int e(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("HwLinkLossAlarmManager", "messageHex is empty.");
            return -1;
        }
        if (strE.length() <= 8) {
            return -1;
        }
        return CommonUtil.v(strE.substring(8, strE.length()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("HwLinkLossAlarmManager", "autoSendCommend() enter.");
        ThreadPoolManager.c().execute(new Runnable() { // from class: lyz
            @Override // java.lang.Runnable
            public final void run() {
                this.f41172c.d();
            }
        });
    }

    /* synthetic */ void d() {
        List<DeviceInfo> listE = mgg.e("HwLinkLossAlarmManager");
        if (listE == null) {
            LogUtil.j("HwLinkLossAlarmManager", "autoSendCommend devices is null");
            return;
        }
        for (final DeviceInfo deviceInfo : listE) {
            if (!d(deviceInfo, "bt_lost_remind")) {
                mhs.a().getSwitchSetting("bt_lost_remind", new IBaseResponseCallback() { // from class: lyx
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.e.c(deviceInfo, i, obj);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* synthetic */ void c(DeviceInfo deviceInfo, int i, Object obj) {
        boolean z;
        if (!mgq.b()) {
            LogUtil.j("HwLinkLossAlarmManager", "no login return.");
            return;
        }
        LogUtil.a("HwLinkLossAlarmManager", "login success.");
        if (i == 0) {
            if (!(obj instanceof String)) {
                LogUtil.j("HwLinkLossAlarmManager", "autoSendCommend info is null");
                return;
            }
            z = CommonUtil.n(this.j, (String) obj) == 1;
        }
        e(deviceInfo, z);
    }

    private boolean d(DeviceInfo deviceInfo, String str) {
        if (!lxc.a(deviceInfo.getDeviceIdentify())) {
            return false;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), str);
        e(deviceInfo, TextUtils.isEmpty(strE) ? false : Boolean.parseBoolean(strE));
        return true;
    }

    private void e(DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.j("HwLinkLossAlarmManager", "autoSendCommend DeviceInfo error");
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA == null || !deviceCapabilityA.isBluetoothOffAlert()) {
            return;
        }
        LogUtil.a("HwLinkLossAlarmManager", "autoSendCommend() flag = ", Boolean.valueOf(z));
        c(deviceInfo.getDeviceIdentify(), z, this.h);
    }

    private static Object a() {
        List<IBaseResponseCallback> list;
        synchronized (lzb.class) {
            list = f41177a;
        }
        return list;
    }

    private static Object h() {
        List<IBaseResponseCallback> list;
        synchronized (lzb.class) {
            list = f41178b;
        }
        return list;
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr != null) {
            b(bArr);
        }
    }
}
