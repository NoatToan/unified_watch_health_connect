package com.huawei.health.device.manager;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.plugindevice.R;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import defpackage.ddq;
import defpackage.dms;
import defpackage.drw;
import defpackage.dry;
import defpackage.dsa;
import defpackage.dso;
import defpackage.dxw;
import defpackage.elh;
import defpackage.elo;
import defpackage.emq;
import defpackage.eni;
import defpackage.eqt;
import defpackage.era;
import defpackage.erh;
import defpackage.etn;
import defpackage.lmf;
import defpackage.lsb;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes27.dex */
public class DeviceMonitorReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f6318b = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6319a;
    private String e;
    private dsa d = new dsa(MessageConstant.BLOOD_PRESSURE_TYPE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6320c = false;

    public static void d(boolean z) {
        f6318b = z;
    }

    public static boolean e() {
        return f6318b;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        ReleaseLogUtil.d("R_Plugin_DeviceMonitorReceiver", "onReceive action ", action, ", this = ", this);
        a(action);
        if (!e()) {
            ReleaseLogUtil.e("R_Plugin_DeviceMonitorReceiver", "onReceive backgroundMeasureChannel blocked");
            return;
        }
        String stringExtra = intent.getStringExtra("productId");
        String stringExtra2 = intent.getStringExtra("uniqueId");
        if (TextUtils.isEmpty(stringExtra)) {
            ReleaseLogUtil.e("R_Plugin_DeviceMonitorReceiver", "onReceive productId is empty");
            return;
        }
        if (TextUtils.isEmpty(stringExtra2)) {
            ReleaseLogUtil.e("R_Plugin_DeviceMonitorReceiver", "onReceive uniqueId is empty");
            return;
        }
        String stringExtra3 = intent.getStringExtra("kind");
        if (!TextUtils.isEmpty(stringExtra3) && !etn.i(stringExtra3)) {
            ReleaseLogUtil.e("R_Plugin_DeviceMonitorReceiver", "onReceive kind is invalid");
            return;
        }
        this.f6319a = stringExtra;
        this.e = stringExtra2;
        if ("com.huawei.health.action.DEVICE_DISCONNECTED".equals(action)) {
            LogUtil.a("Plugin_DeviceMonitorReceiver", "onReceive action is Disconnect");
            drw.e().e(this.f6319a, this.e);
        }
        if ("com.huawei.health.action.DEVICE_CONNECTED".equals(action) && eqt.c().c(this.f6319a)) {
            eqt.c().e(this.f6319a, this.e);
        } else {
            d(context, stringExtra, stringExtra2, stringExtra3, intent);
        }
    }

    private void a(String str) {
        if (str != null) {
            if ("com.huawei.health.action.DEVICE_OCCUPIED".equals(str)) {
                LogUtil.a("Plugin_DeviceMonitorReceiver", "onReceive action occupied");
                d(false);
                this.f6320c = false;
            } else {
                if ("com.huawei.health.action.DEVICE_AVAILABLE".equals(str)) {
                    LogUtil.a("Plugin_DeviceMonitorReceiver", "onReceive action available");
                    d(true);
                    if (this.f6320c) {
                        return;
                    }
                    this.f6320c = true;
                    return;
                }
                LogUtil.a("Plugin_DeviceMonitorReceiver", "onReceive other action = ", str);
            }
        }
    }

    private void d(Context context, String str, String str2, String str3, Intent intent) {
        if (intent.getBooleanExtra("autotest", false)) {
            d(context, intent, new b(context, str3), str3);
        }
        if ("825c82bd-84fe-44a0-9884-6a764bd73183".equals(str)) {
            LogUtil.a("Plugin_DeviceMonitorReceiver", "onReceive product is Omuron bloodPressure");
            c(context, intent);
        } else {
            drw.e().a(str, str2, new b(context, str3));
        }
    }

    private void d(Context context, Intent intent, IHealthDeviceCallback iHealthDeviceCallback, String str) {
        if ("825c82bd-84fe-44a0-9884-6a764bd73183".equals(intent.getStringExtra("productId"))) {
            b(context, intent, str);
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("healthdata");
        if (bundleExtra == null) {
            LogUtil.j("Plugin_DeviceMonitorReceiver", "refactorDeviceAutoTestData: healthdata bundle is null");
            return;
        }
        String string = bundleExtra.getString("product_bluetoothname");
        String string2 = bundleExtra.getString("product_mac");
        dms dmsVar = new dms(string, string2, string2);
        HealthDevice.HealthDeviceKind healthDeviceKindA = etn.a(str);
        if (healthDeviceKindA == HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR) {
            a(bundleExtra, iHealthDeviceCallback, dmsVar);
            return;
        }
        if (healthDeviceKindA == HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE) {
            iHealthDeviceCallback.onDataChanged(dmsVar, d(bundleExtra));
        } else if (healthDeviceKindA != HealthDevice.HealthDeviceKind.HDK_WEIGHT) {
            LogUtil.a("Plugin_DeviceMonitorReceiver", "refactorDeviceAutoTestData other kind = ", healthDeviceKindA);
        } else {
            c(bundleExtra, iHealthDeviceCallback, dmsVar);
        }
    }

    private void c(Bundle bundle, IHealthDeviceCallback iHealthDeviceCallback, dms dmsVar) {
        float f;
        if (bundle == null) {
            LogUtil.j("Plugin_DeviceMonitorReceiver", "refactorDeviceAutoTestData: healthdata bundle is null");
            return;
        }
        dso dsoVar = new dso();
        try {
            f = Float.parseFloat(bundle.getString("weight"));
        } catch (NumberFormatException e) {
            LogUtil.e("Plugin_DeviceMonitorReceiver", "refactorDeviceAutoTestData e=", e.getMessage());
            f = 0.0f;
        }
        dsoVar.setWeight(f);
        dsoVar.setBodyFatRat(20.0f);
        dsoVar.setStartTime(new Date().getTime());
        dsoVar.setEndTime(new Date().getTime());
        iHealthDeviceCallback.onDataChanged(dmsVar, dsoVar);
    }

    private void a(Bundle bundle, IHealthDeviceCallback iHealthDeviceCallback, dms dmsVar) {
        float f;
        if (bundle == null) {
            LogUtil.j("Plugin_DeviceMonitorReceiver", "refactorDeviceAutoTestData: healthdata bundle is null");
            return;
        }
        emq emqVar = new emq();
        try {
            f = Float.parseFloat(bundle.getString("bloodsugar"));
        } catch (NumberFormatException e) {
            LogUtil.e("Plugin_DeviceMonitorReceiver", "refactorDeviceAutoTestData e=", e.getMessage());
            f = 0.0f;
        }
        emqVar.setBloodSugar(f);
        emqVar.setStartTime(new Date().getTime());
        emqVar.setEndTime(emqVar.getStartTime());
        emqVar.setSequenceNumber(0);
        List<HealthData> arrayList = new ArrayList<>();
        arrayList.add(emqVar);
        iHealthDeviceCallback.onDataChanged(dmsVar, arrayList);
    }

    private void b(final Context context, Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra("healthdata");
        if (bundleExtra == null) {
            LogUtil.j("Plugin_DeviceMonitorReceiver", "autoTestForOmuron: healthdata bundle is null");
            return;
        }
        String string = bundleExtra.getString("product_mac");
        final int iB = b(etn.a(str));
        dry dryVar = new dry(string, iB);
        eni eniVarD = d(bundleExtra);
        ArrayList arrayList = new ArrayList();
        arrayList.add(eniVarD);
        c(dryVar, arrayList, new IBaseResponseCallback() { // from class: drr
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f32267b.e(iB, context, i, obj);
            }
        });
    }

    public /* synthetic */ void e(int i, Context context, int i2, Object obj) {
        LogUtil.a("Plugin_DeviceMonitorReceiver", "autoTestForOmuron onResponse errCode = ", Integer.valueOf(i2));
        if (i2 == 0) {
            d(i);
            e(context, "com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, String str) {
        if (context != null) {
            Intent intent = new Intent("data_put_to_engine_success");
            intent.putExtra("data_kind", str);
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
    }

    private eni d(Bundle bundle) {
        int i;
        int i2;
        eni eniVar = new eni();
        eniVar.setStartTime(new Date().getTime());
        eniVar.setEndTime(new Date().getTime());
        int i3 = 0;
        if (bundle != null) {
            try {
                String string = bundle.getString("low");
                String string2 = bundle.getString("high");
                String string3 = bundle.getString("heart");
                i = Integer.parseInt(string);
                try {
                    i2 = Integer.parseInt(string2);
                    try {
                        i3 = Integer.parseInt(string3);
                    } catch (NumberFormatException e) {
                        e = e;
                        LogUtil.e("Plugin_DeviceMonitorReceiver", "getHeartRateAndBloodPressure e=", e.getMessage());
                    } catch (Exception unused) {
                        LogUtil.e("Plugin_DeviceMonitorReceiver", "getHeartRateAndBloodPressure Exception");
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                    i2 = 0;
                } catch (Exception unused2) {
                    i2 = 0;
                }
            } catch (NumberFormatException e3) {
                e = e3;
                i = 0;
                i2 = 0;
            } catch (Exception unused3) {
                i = 0;
                i2 = 0;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        eniVar.setSystolic((short) i2);
        eniVar.setDiastolic((short) i);
        eniVar.setHeartRate((short) i3);
        return eniVar;
    }

    private void c(Context context, Intent intent) {
        ArrayList<Bundle> parcelableArrayListExtra = intent.getParcelableArrayListExtra("bloodPressureDataList");
        if (parcelableArrayListExtra == null) {
            ReleaseLogUtil.e("R_Plugin_DeviceMonitorReceiver", "refactorBloodPressureData arrayList is null");
            return;
        }
        String stringExtra = intent.getStringExtra("address");
        ArrayList arrayList = new ArrayList();
        int iC = c(arrayList, parcelableArrayListExtra, stringExtra);
        if (iC <= 0) {
            ReleaseLogUtil.e("R_Plugin_DeviceMonitorReceiver", "refactorBloodPressureData no valid data");
        } else {
            c(context, intent, iC, stringExtra, arrayList);
            e(c(), KakaConstants.TASK_MEASURE_TODAY_BLOOD_PRESSURE, arrayList.get(0));
        }
    }

    private int c(List<HealthData> list, ArrayList<Bundle> arrayList, String str) {
        long jA = this.d.a(dxw.d(), str);
        LogUtil.d("Plugin_DeviceMonitorReceiver", "newest timeStamp is ", Long.valueOf(jA));
        int i = 0;
        short s = 0;
        long j = 0;
        short s2 = 0;
        short s3 = 0;
        for (Bundle bundle : arrayList) {
            if (bundle != null) {
                try {
                    s2 = bundle.getShort(BleConstants.BLOODPRESSURE_SYSTOLIC);
                    s3 = bundle.getShort(BleConstants.BLOODPRESSURE_DIASTOLIC);
                    s = bundle.getShort(IndoorEquipManagerApi.KEY_HEART_RATE);
                    j = bundle.getLong("time");
                } catch (Exception unused) {
                    LogUtil.e("Plugin_DeviceMonitorReceiver", "refactorBloodPressureData Exception");
                }
                LogUtil.d("Plugin_DeviceMonitorReceiver", "current time is ", Long.valueOf(j));
                if (j > jA) {
                    this.d.d(dxw.d(), str, j);
                    i++;
                    eni eniVar = new eni();
                    eniVar.setStartTime(j);
                    eniVar.setEndTime(j);
                    eniVar.setSystolic(s2);
                    eniVar.setDiastolic(s3);
                    eniVar.setHeartRate(s);
                    list.add(eniVar);
                    a(etn.c(this.f6319a, c()), str, AnalyticsValue.HEALTH_PLUGIN_DEVICE_OMRON_MEASURE_SUCCEED_2060016, eniVar);
                }
            }
        }
        return i;
    }

    private void c(final Context context, Intent intent, int i, String str, List<HealthData> list) {
        LogUtil.d("Plugin_DeviceMonitorReceiver", "writeDataToHiHealth the number of data is ", Integer.valueOf(i));
        final int iB = b(etn.a(intent.getStringExtra("kind")));
        c(new dry(str, iB), list, new IBaseResponseCallback() { // from class: drq
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.e.d(iB, context, i2, obj);
            }
        });
    }

    public /* synthetic */ void d(int i, Context context, int i2, Object obj) {
        LogUtil.a("Plugin_DeviceMonitorReceiver", "writeDataToHiHealth onResponse errCode = ", Integer.valueOf(i2));
        if (i2 == 0) {
            d(i);
            e(context, "com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str) {
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), str);
        intent.setFlags(67108864);
        intent.putExtra("refreshCard", true);
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        builderC.setContentTitle(dxw.d().getResources().getString(R.string.IDS_device_weight_measure));
        builderC.setContentText(String.format(Locale.ENGLISH, dxw.d().getResources().getString(R.string.IDS_device_recive), String.valueOf(i)));
        builderC.setAutoCancel(true);
        builderC.setContentIntent(PendingIntent.getActivity(dxw.d(), 0, intent, 201326592));
        Notification notificationBuild = builderC.build();
        notificationBuild.flags |= 16;
        lsb.d().c(20181114, notificationBuild);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HealthData> list, String str, String str2) {
        if (!CommonUtil.bg() && !NotificationManagerCompat.from(BaseApplication.getContext()).areNotificationsEnabled()) {
            LogUtil.j("Plugin_DeviceMonitorReceiver", "setNotification permission is not enabled.");
            return;
        }
        if (njy.e(list)) {
            return;
        }
        if (!(list.get(0) instanceof emq)) {
            LogUtil.e("Plugin_DeviceMonitorReceiver", "Not sugar blood data");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), str);
        intent.setFlags(67108864);
        intent.putExtra("refreshCard", true);
        intent.putExtra("product_name", str2);
        intent.putExtra("entrance", "jump_from_blood_sugar_notify");
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        emq emqVar = (emq) list.get(0);
        long startTime = emqVar.getStartTime();
        long endTime = emqVar.getEndTime();
        if (list.size() > 1) {
            String quantityString = dxw.d().getResources().getQuantityString(R.plurals.IDS_device_recive_blood_sugar_multiple, list.size(), Integer.valueOf(list.size()));
            builderC.setContentText(quantityString).setStyle(new Notification.BigTextStyle().bigText(quantityString));
            for (HealthData healthData : list) {
                startTime = Math.min(healthData.getStartTime(), startTime);
                endTime = Math.max(healthData.getEndTime(), endTime);
            }
        } else {
            String strE = e(startTime, String.valueOf(emqVar.getBloodSugar()));
            builderC.setContentText(strE).setStyle(new Notification.BigTextStyle().bigText(strE));
        }
        builderC.setContentTitle(dxw.d().getResources().getString(R.string.IDS_device_recive_blood_sugar_title));
        intent.putExtra("start_time", startTime);
        intent.putExtra("end_time", endTime);
        if (list.size() > 1) {
            intent.putExtra("blood_sugar_data_list", GsonUtil.contentValueToJson(list));
        }
        builderC.setAutoCancel(true);
        builderC.setContentIntent(PendingIntent.getActivity(dxw.d(), 0, intent, 201326592));
        Notification notificationBuild = builderC.build();
        notificationBuild.flags |= 16;
        lsb.d().c(20181114, notificationBuild);
    }

    private String e(long j, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.ENGLISH);
        String str2 = simpleDateFormat.format(new Date(j));
        String strSubstring = str2.substring(0, 10);
        String strSubstring2 = str2.substring(11);
        String strSubstring3 = simpleDateFormat.format(new Date(System.currentTimeMillis())).substring(0, 10);
        if (strSubstring3.equals(strSubstring)) {
            return String.format(Locale.ENGLISH, dxw.d().getResources().getString(R.string.IDS_device_recive_blood_sugar_single_today), strSubstring2, str);
        }
        if (strSubstring.regionMatches(0, strSubstring3, 0, 4)) {
            return String.format(Locale.ENGLISH, dxw.d().getResources().getString(R.string.IDS_device_recive_blood_sugar_single), strSubstring.substring(5), strSubstring2, str);
        }
        return String.format(Locale.ENGLISH, dxw.d().getResources().getString(R.string.IDS_device_recive_blood_sugar_single), strSubstring, strSubstring2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(HealthDevice.HealthDeviceKind healthDeviceKind) {
        if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE) {
            return 10002;
        }
        if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR) {
            return 10001;
        }
        if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_WEIGHT) {
            return 10006;
        }
        return healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_HEART_RATE ? 50001 : -1;
    }

    public class b implements IHealthDeviceCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6322b;
        private Context d;

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onFailed(HealthDevice healthDevice, int i) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onStatusChanged(HealthDevice healthDevice, int i) {
        }

        b(Context context, String str) {
            HealthDevice.HealthDeviceKind healthDeviceKindValueOf;
            this.d = context;
            if (str == null) {
                healthDeviceKindValueOf = HealthDevice.HealthDeviceKind.HDK_UNKNOWN;
            } else {
                try {
                    healthDeviceKindValueOf = HealthDevice.HealthDeviceKind.valueOf(str);
                } catch (IllegalArgumentException unused) {
                    healthDeviceKindValueOf = HealthDevice.HealthDeviceKind.HDK_UNKNOWN;
                }
            }
            this.f6322b = DeviceMonitorReceiver.this.b(healthDeviceKindValueOf);
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
            LogUtil.a("Plugin_DeviceMonitorReceiver", "BackgroundDataReceiverCallback onDataChanged ");
            if (DeviceMonitorReceiver.this.b(healthDevice, healthData)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (healthData instanceof eni) {
                dry dryVar = new dry(healthDevice.getUniqueId(), this.f6322b);
                arrayList.add(healthData);
                DeviceMonitorReceiver.this.c(dryVar, arrayList, new IBaseResponseCallback() { // from class: drt
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f32272a.b(i, obj);
                    }
                });
                String strC = DeviceMonitorReceiver.this.c();
                DeviceMonitorReceiver deviceMonitorReceiver = DeviceMonitorReceiver.this;
                deviceMonitorReceiver.a(etn.c(deviceMonitorReceiver.f6319a, DeviceMonitorReceiver.this.c()), healthDevice.getAddress(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_OMRON_MEASURE_SUCCEED_2060016, healthData);
                DeviceMonitorReceiver.this.e(strC, KakaConstants.TASK_MEASURE_TODAY_BLOOD_PRESSURE, healthData);
                return;
            }
            if (healthData instanceof dso) {
                dry dryVar2 = new dry(healthDevice.getUniqueId(), this.f6322b);
                arrayList.add(healthData);
                DeviceMonitorReceiver.this.c(dryVar2, arrayList, new IBaseResponseCallback() { // from class: drz
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f32290a.c(i, obj);
                    }
                });
                String strC2 = DeviceMonitorReceiver.this.c();
                DeviceMonitorReceiver deviceMonitorReceiver2 = DeviceMonitorReceiver.this;
                deviceMonitorReceiver2.a(etn.c(deviceMonitorReceiver2.f6319a, DeviceMonitorReceiver.this.c()), healthDevice.getAddress(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_YUYUE_MEASURE_SUCCEED_2060016, healthData);
                DeviceMonitorReceiver.this.e(strC2, KakaConstants.TASK_ENTER_TODAY_WEIGHT, healthData);
                return;
            }
            LogUtil.a("Plugin_DeviceMonitorReceiver", "BackgroundDataReceiverCallback onDataChanged other dataType");
        }

        public /* synthetic */ void b(int i, Object obj) {
            LogUtil.a("Plugin_DeviceMonitorReceiver", "DeviceMonitorReceiver onDataChanged onResponse errCode = ", Integer.valueOf(i));
            if (i == 0) {
                DeviceMonitorReceiver.this.d(this.f6322b);
                DeviceMonitorReceiver.this.e(this.d, "com.huawei.ui.main.stories.health.activity.healthdata.KnitBloodPressureActivity");
            }
        }

        public /* synthetic */ void c(int i, Object obj) {
            LogUtil.a("Plugin_DeviceMonitorReceiver", "BackgroundDataReceiverCallback onDataChanged onResponse errCode = ", Integer.valueOf(i));
            if (i == 0) {
                DeviceMonitorReceiver.this.d(this.f6322b);
                DeviceMonitorReceiver.this.e(this.d, "com.huawei.ui.main.stories.health.activity.healthdata.WeightActivity");
                DeviceMonitorReceiver.this.d(1, "com.huawei.ui.main.stories.health.activity.healthdata.WeightActivity");
            }
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, final List<HealthData> list) {
            LogUtil.d("Plugin_DeviceMonitorReceiver", "BackgroundDataReceiverCallback onDataChanged");
            if (healthDevice == null) {
                LogUtil.j("Plugin_DeviceMonitorReceiver", "BackgroundDataReceiverCallback onDataChanged device is null");
                return;
            }
            if (njy.e(list)) {
                LogUtil.j("Plugin_DeviceMonitorReceiver", "BackgroundDataReceiverCallback onDataChanged data is null or empty");
                return;
            }
            LogUtil.a("Plugin_DeviceMonitorReceiver", "BackgroundDataReceiverCallback dataList size is ", Integer.valueOf(list.size()));
            if (list.get(0) instanceof emq) {
                LogUtil.d("Plugin_DeviceMonitorReceiver", "BackgroundDataReceiverCallback onDataChanged data is bloodSugar");
                final String strC = DeviceMonitorReceiver.this.c();
                DeviceMonitorReceiver deviceMonitorReceiver = DeviceMonitorReceiver.this;
                deviceMonitorReceiver.c(etn.c(deviceMonitorReceiver.f6319a, strC), healthDevice.getAddress(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_JOHNSON_MEASURE_SUCCEED_2060015, list);
                DeviceMonitorReceiver.this.e(strC, KakaConstants.TASK_MEASURE_TODAY_BLOOD_SUGAR, list.get(0));
                DeviceMonitorReceiver.this.c(new dry(healthDevice.getUniqueId(), this.f6322b), list, new IBaseResponseCallback() { // from class: drx
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f32289c.c(strC, list, i, obj);
                    }
                });
            }
        }

        public /* synthetic */ void c(String str, List list, int i, Object obj) {
            LogUtil.a("Plugin_DeviceMonitorReceiver", "BackgroundDataReceiverCallback onDataChanged onResponse errCode = ", Integer.valueOf(i));
            if (i == 0) {
                DeviceMonitorReceiver.this.d(this.f6322b);
                String strA = elo.a(DeviceMonitorReceiver.this.f6319a, str);
                DeviceMonitorReceiver.this.e(this.d, "com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarDeviceMeasureActivity");
                DeviceMonitorReceiver.this.a((List<HealthData>) list, "com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarDeviceMeasureActivity", strA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(HealthDevice healthDevice, HealthData healthData) {
        if (healthDevice == null) {
            LogUtil.j("Plugin_DeviceMonitorReceiver", "isParamInvalided device is null");
            return true;
        }
        if (healthData == null) {
            LogUtil.j("Plugin_DeviceMonitorReceiver", "isParamInvalided data is null");
            return true;
        }
        if (e()) {
            return false;
        }
        LogUtil.a("Plugin_DeviceMonitorReceiver", "isParamInvalided receiver setNotification block");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, int i, HealthData healthData) {
        HashMap map = new HashMap(16);
        map.put("device_name", str);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, ResourceManager.c().d(this.f6319a).m().name());
        map.put("measure_time", new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(Long.valueOf(healthData.getEndTime())));
        ddq.d().setEvent(BaseApplication.getContext(), String.valueOf(i), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, AnalyticsValue analyticsValue, List<HealthData> list) {
        Iterator<HealthData> it = list.iterator();
        while (it.hasNext()) {
            a(str, str2, analyticsValue, it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, AnalyticsValue analyticsValue, HealthData healthData) {
        HashMap map = new HashMap(16);
        map.put("macAddress", erh.d(str2));
        map.put("device_name", str);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, ResourceManager.c().d(this.f6319a).m().name());
        map.put("measure_time", new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(Long.valueOf(healthData.getEndTime())));
        map.put("prodId", era.b(this.f6319a));
        lmf.d().c(dxw.d(), analyticsValue.value(), map, 0);
        lmf.d().b(dxw.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        elh elhVarD = ResourceManager.c().d(this.f6319a);
        if (elhVarD != null) {
            return elhVarD.l().d();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(dry dryVar, List<HealthData> list, IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList();
        for (HealthData healthData : list) {
            if (b(healthData)) {
                arrayList.add(dryVar.d(healthData));
            }
        }
        dryVar.d(arrayList, iBaseResponseCallback);
    }

    private boolean b(HealthData healthData) {
        if (healthData == null) {
            return false;
        }
        return !(healthData instanceof emq) || ((double) Math.abs(((emq) healthData).getBloodSugar())) >= 1.0E-6d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("Plugin_DeviceMonitorReceiver", "syncCloudAfterInsert: type = ", Integer.valueOf(i));
        int iC = c(i);
        if (iC != -1) {
            HiSyncOption hiSyncOption = new HiSyncOption();
            hiSyncOption.setSyncModel(2);
            hiSyncOption.setSyncAction(0);
            hiSyncOption.setSyncDataType(iC);
            hiSyncOption.setSyncMethod(2);
            hiSyncOption.setSyncScope(1);
            HiHealthNativeApi.a(dxw.d()).synCloud(hiSyncOption, null);
        }
    }

    private int c(int i) {
        if (i == 10001) {
            return 4;
        }
        if (i == 10002) {
            return 5;
        }
        if (i != 10006) {
            return -1;
        }
        return HiSyncType.HiSyncDataType.f12263a;
    }
}
