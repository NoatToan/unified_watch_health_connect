package com.huawei.hwdevice.phoneprocess.mgr.hwdevicestatusmgr;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import defpackage.edc;
import defpackage.eec;
import defpackage.eee;
import defpackage.eeq;
import defpackage.lsb;
import defpackage.peh;
import defpackage.qre;
import defpackage.xgx;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public class HwDeviceStatusPushManager implements DataReceiveCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashSet<Integer> f17488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashSet<Integer> f17489c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f17490a;
    private volatile int e;

    static {
        HashSet<Integer> hashSet = new HashSet<>();
        f17489c = hashSet;
        HashSet<Integer> hashSet2 = new HashSet<>();
        f17488b = hashSet2;
        hashSet.add(60000);
        hashSet.add(60022);
        hashSet.add(60008);
        hashSet2.add(30002);
    }

    private HwDeviceStatusPushManager() {
        this.f17490a = SharedPreferenceManager.c(String.valueOf(10008), "last_wear_status_key", 0);
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final HwDeviceStatusPushManager f17494b = new HwDeviceStatusPushManager();
    }

    public static HwDeviceStatusPushManager b() {
        return d.f17494b;
    }

    public void d() {
        edc.e().registerDeviceSampleListener("hw.unitdevice.supportPhoneRemind", this);
    }

    public void a() {
        edc.e().unRegisterDeviceSampleListener("hw.unitdevice.supportPhoneRemind");
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (deviceInfo == null) {
            LogUtil.j("HwDeviceStatusPushManager", "onDataReceived deviceInfo is null");
            return;
        }
        LogUtil.a("HwDeviceStatusPushManager", "message = ", eecVar.toString());
        if (!(eecVar instanceof eee)) {
            LogUtil.j("HwDeviceStatusPushManager", "onDataReceived sampleBase not instanceof SampleEvent");
            return;
        }
        eee eeeVar = (eee) eecVar;
        if (c(eeeVar)) {
            LogUtil.a("HwDeviceStatusPushManager", "onDataReceived EventData = ", eeeVar.c());
            a(deviceInfo, eeq.d(eeq.e(eeeVar.c())));
        }
    }

    private void a(DeviceInfo deviceInfo, String str) {
        b bVar = (b) peh.b(str, b.class);
        LogUtil.a("HwDeviceStatusPushManager", "dataProcessing: ", bVar);
        if (bVar == null) {
            ReleaseLogUtil.a("R_HwDeviceStatusPushManager", "deviceStatusBean is null");
            return;
        }
        int iE = bVar.e();
        if (iE == DeviceStatusEnum.EVENT_WEAR_STATUS.getValue()) {
            d(deviceInfo, bVar);
            return;
        }
        if (iE == DeviceStatusEnum.EVENT_LOW_BATTERY.getValue()) {
            b(deviceInfo, bVar);
            return;
        }
        if (iE == DeviceStatusEnum.EVENT_FULL_BATTERY.getValue()) {
            c(deviceInfo, bVar);
        } else if (iE != DeviceStatusEnum.EVENT_CHARGE_STATUS.getValue()) {
            ReleaseLogUtil.e("R_HwDeviceStatusPushManager", "notifyProcessing eventType is invalid ", Integer.valueOf(iE));
        } else {
            d(bVar.a());
        }
    }

    private boolean c(eee eeeVar) {
        if (!"hw.watch.supportPhoneRemind".equals(eeeVar.getSrcPkgName())) {
            LogUtil.j("HwDeviceStatusPushManager", "wearPkgName not match.");
            return false;
        }
        if (eeeVar.getCommandId() != 2) {
            LogUtil.j("HwDeviceStatusPushManager", "command not match.");
            return false;
        }
        if (eeeVar.d() != 800100030) {
            LogUtil.j("HwDeviceStatusPushManager", "eventId not match.");
            return false;
        }
        byte[] bArrC = eeeVar.c();
        if (bArrC != null && bArrC.length != 0) {
            return true;
        }
        LogUtil.j("HwDeviceStatusPushManager", "sampleEvent data is empty.");
        return false;
    }

    public void d(DeviceInfo deviceInfo, int i) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_HwDeviceStatusPushManager", "showWearNotify deviceInfo is null");
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 3) {
            LogUtil.j("HwDeviceStatusPushManager", "ConnectState ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
            return;
        }
        String deviceRelation = xgx.d().getDeviceRelation(deviceInfo.getDeviceIdentify());
        if (!"main_relationship".equals(deviceRelation)) {
            LogUtil.j("HwDeviceStatusPushManager", "showWearNotify not main deviceName = ", deviceInfo.getDeviceName(), "deviceRelation = ", deviceRelation);
            return;
        }
        if (this.f17490a != 1) {
            LogUtil.j("HwDeviceStatusPushManager", "mWearStatus is ", Integer.valueOf(this.f17490a));
            return;
        }
        int iC = HwDeviceStatusNotificationUtil.c(deviceInfo.getProductType());
        LogUtil.a("HwDeviceStatusPushManager", "showRemoveNotify dC=", Integer.valueOf(iC), ",errCode=", Integer.valueOf(i), ",bluetoothTp=", Integer.valueOf(deviceInfo.getDeviceBluetoothType()));
        if (b(deviceInfo, i)) {
            b(iC);
            SharedPreferenceManager.c(String.valueOf(10008), "last_remove_notify_show_time_key", System.currentTimeMillis());
        }
    }

    private boolean b(DeviceInfo deviceInfo, int i) {
        return ((deviceInfo.getDeviceBluetoothType() == 2 && f17489c.contains(Integer.valueOf(i))) || (deviceInfo.getDeviceBluetoothType() == 1 && f17488b.contains(Integer.valueOf(i)))) && System.currentTimeMillis() - SharedPreferenceManager.d(String.valueOf(10008), "last_remove_notify_show_time_key", 0L) > AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL;
    }

    private void d(DeviceInfo deviceInfo, b bVar) {
        if (bVar.h() == DeviceStatusEnum.WEAR_WORN.getValue()) {
            ReleaseLogUtil.e("R_HwDeviceStatusPushManager", "showRemoveNotify cancel notify ", bVar);
            c(20251120);
        } else if (bVar.a() == DeviceStatusEnum.CHARGE_CHARGING.getValue() || bVar.d() == DeviceStatusEnum.NOT_DISTURB_MODE_ON.getValue() || bVar.c() == DeviceStatusEnum.SLEEP_MODE_ON.getValue()) {
            ReleaseLogUtil.e("R_HwDeviceStatusPushManager", "showRemoveNotify break by ", bVar);
        } else if (HwDeviceStatusNotificationUtil.c() || HwDeviceStatusNotificationUtil.e()) {
            ReleaseLogUtil.e("R_HwDeviceStatusPushManager", "showRemoveNotify isNightBreak or isNoonBreak ", Long.valueOf(System.currentTimeMillis()));
        } else {
            b(HwDeviceStatusNotificationUtil.c(deviceInfo.getProductType()));
        }
    }

    private void b(int i) {
        String strF;
        if (i == 1) {
            strF = qre.f(R.string.IDS_device_remove_remind_title_band);
        } else {
            strF = qre.f(R.string.IDS_device_remove_remind_title_watch);
        }
        HwDeviceStatusNotificationUtil.e(a(strF, qre.f(R.string.IDS_device_remove_remind_content), "M20251120", "huaweischeme://healthapp/home/main"), 20251120);
    }

    private void b(DeviceInfo deviceInfo, b bVar) {
        if (bVar.d() == DeviceStatusEnum.NOT_DISTURB_MODE_ON.getValue() || bVar.c() == DeviceStatusEnum.SLEEP_MODE_ON.getValue()) {
            ReleaseLogUtil.e("R_HwDeviceStatusPushManager", "showLowBatteryNotify break by ", bVar);
            return;
        }
        if (bVar.h() == DeviceStatusEnum.WEAR_WORN.getValue() && bVar.g() == DeviceStatusEnum.SLEEP_SLEEPING.getValue()) {
            ReleaseLogUtil.e("R_HwDeviceStatusPushManager", "showLowBatteryNotify user is sleeping", bVar);
            return;
        }
        if (bVar.h() == DeviceStatusEnum.WEAR_NOT_WORN.getValue() && (HwDeviceStatusNotificationUtil.c() || HwDeviceStatusNotificationUtil.e())) {
            ReleaseLogUtil.e("R_HwDeviceStatusPushManager", "showLowBatteryNotify isNightBreak or isNoonBreak ", Long.valueOf(System.currentTimeMillis()));
            return;
        }
        HwDeviceStatusNotificationUtil.e(a(qre.f(R.string.IDS_device_low_battery_remind_title), qre.a(R.string.IDS_device_low_battery_remind_content_new, deviceInfo.getDeviceName(), UnitUtil.e(bVar.b(), 2, 0)), "M20251121", "huaweischeme://healthapp/home/device"), 20251121);
    }

    private void c(DeviceInfo deviceInfo, b bVar) {
        if (bVar.d() == DeviceStatusEnum.NOT_DISTURB_MODE_ON.getValue() || bVar.c() == DeviceStatusEnum.SLEEP_MODE_ON.getValue()) {
            ReleaseLogUtil.e("R_HwDeviceStatusPushManager", "showFullBatteryNotify break by ", bVar);
        } else if (HwDeviceStatusNotificationUtil.c() || HwDeviceStatusNotificationUtil.e()) {
            ReleaseLogUtil.e("R_HwDeviceStatusPushManager", "showFullBatteryNotify isNightBreak or isNoonBreak ", Long.valueOf(System.currentTimeMillis()));
        } else {
            HwDeviceStatusNotificationUtil.e(a(qre.f(R.string.IDS_device_full_battery_remind_title), qre.a(R.string.IDS_device_full_battery_remind_content_new, deviceInfo.getDeviceName()), "M20251122", "huaweischeme://healthapp/home/device"), 20251122);
        }
    }

    public void c(int i) {
        LogUtil.j("HwDeviceStatusPushManager", "cancelNotify ", Integer.valueOf(i));
        lsb.d().e(i);
    }

    private MessageObject a(String str, String str2, String str3, String str4) {
        MessageObject messageObject = new MessageObject();
        messageObject.setMsgId(str3);
        messageObject.setCreateTime(System.currentTimeMillis());
        messageObject.setWeight(1);
        messageObject.setDetailUri(str4);
        messageObject.setMsgTitle(str);
        messageObject.setMsgContent(str2);
        return messageObject;
    }

    public void d(int i, DeviceInfo deviceInfo) {
        String deviceRelation = xgx.d().getDeviceRelation(deviceInfo.getDeviceIdentify());
        if (!"main_relationship".equals(deviceRelation)) {
            LogUtil.j("HwDeviceStatusPushManager", "setWearStatus not main deviceName = ", deviceInfo.getDeviceName(), "deviceRelation = ", deviceRelation);
            return;
        }
        if (this.f17490a != i && i == 1) {
            LogUtil.a("HwDeviceStatusPushManager", "setWearStatus last remove notify show time key 0");
            SharedPreferenceManager.c(String.valueOf(10008), "last_remove_notify_show_time_key", 0L);
        }
        if (i == 2) {
            c(20251120);
        }
        this.f17490a = i;
        SharedPreferenceManager.d(String.valueOf(10008), "last_wear_status_key", this.f17490a);
    }

    public void d(int i) {
        if (i == DeviceStatusEnum.CHARGE_CHARGING.getValue()) {
            c(20251121);
        }
        if (i == DeviceStatusEnum.CHARGE_STOP_CHARGING.getValue()) {
            c(20251122);
        }
        this.e = i;
    }

    enum DeviceStatusEnum {
        EVENT_WEAR_STATUS(1),
        EVENT_LOW_BATTERY(2),
        EVENT_FULL_BATTERY(3),
        EVENT_CHARGE_STATUS(4),
        WEAR_NOT_WORN(0),
        WEAR_WORN(1),
        CHARGE_CHARGING(1),
        CHARGE_NOT_CHARGING(2),
        CHARGE_STOP_CHARGING(3),
        SLEEP_SLEEPING(0),
        SLEEP_WAKING(1),
        NOT_DISTURB_MODE_OFF(0),
        NOT_DISTURB_MODE_ON(1),
        SLEEP_MODE_OFF(0),
        SLEEP_MODE_ON(1);

        private final int value;

        DeviceStatusEnum(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("eventType")
        private int f17491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("doNotDisturbMode")
        private int f17492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("sleepMode")
        private int f17493c;

        @SerializedName("chargeStatus")
        private int d;

        @SerializedName("batteryValue")
        private int e;

        @SerializedName(KnitHealthDetailActivity.KEY_SLEEP_STATUS)
        private int g;

        @SerializedName("wearStatus")
        private int h;

        private b() {
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.f17493c;
        }

        public int d() {
            return this.f17492b;
        }

        public int g() {
            return this.g;
        }

        public int a() {
            return this.d;
        }

        public int h() {
            return this.h;
        }

        public int e() {
            return this.f17491a;
        }

        public String toString() {
            return "DeviceStatusBean{eTp=" + this.f17491a + ",wSt=" + this.h + ",cSt=" + this.d + ",sSt=" + this.g + ",dDMd=" + this.f17492b + ",sMd=" + this.f17493c + ",bVal=" + this.e + '}';
        }
    }
}
