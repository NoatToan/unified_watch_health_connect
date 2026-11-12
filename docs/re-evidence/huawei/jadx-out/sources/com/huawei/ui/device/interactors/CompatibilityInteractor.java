package com.huawei.ui.device.interactors;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.datatypes.HealthSupportModel;
import com.huawei.hwcommonmodel.datatypes.HuaweiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.adddevice.AddDeviceIntroActivity;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import defpackage.eem;
import defpackage.fic;
import defpackage.fks;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.lvi;
import defpackage.mga;
import defpackage.rcv;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class CompatibilityInteractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ThreadPoolManager f24922a = ThreadPoolManager.b(3, 3, "CompatibilityInteractor");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Gson f24924c = new Gson();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomAlertDialog f24923b = null;
    private CustomAlertDialog d = null;

    public enum WearDeviceState {
        NO_BIND_DEVICE,
        EXIST_TYPE
    }

    public boolean a(Context context) {
        return CommonUtil.al(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WearDeviceState e(List<DeviceInfo> list) {
        LogUtil.a("CompatibilityInteractor", "Enter getWearDeviceState");
        WearDeviceState wearDeviceState = WearDeviceState.NO_BIND_DEVICE;
        if (list == null) {
            LogUtil.a("CompatibilityInteractor", "deviceInfoList is null");
            return WearDeviceState.NO_BIND_DEVICE;
        }
        LogUtil.a("CompatibilityInteractor", "deviceInfoList size:", Integer.valueOf(list.size()));
        if (list.size() > 0) {
            for (DeviceInfo deviceInfo : list) {
                LogUtil.a("CompatibilityInteractor", "deviceInfoList deviceInfo:", Integer.valueOf(deviceInfo.getProductType()));
                if (fic.e().a(a()).contains(Integer.valueOf(fic.e().c(deviceInfo.getProductType())))) {
                    wearDeviceState = WearDeviceState.EXIST_TYPE;
                }
            }
        }
        LogUtil.a("CompatibilityInteractor", "getWearDeviceState wearDeviceState:", wearDeviceState);
        return wearDeviceState;
    }

    public void e(final BaseHandler baseHandler, final long j, final long j2, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("CompatibilityInteractor", "getDeviceListFromWear time:", Long.valueOf(j), " currentTime:", Long.valueOf(j2));
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = iBaseResponseCallback;
        baseHandler.sendMessageDelayed(messageObtain, 500L);
        fks.d().b(new IBaseResponseCallback() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("CompatibilityInteractor", "getDeviceListFromWear onResponse errorCode:", Integer.valueOf(i));
                baseHandler.removeMessages(100, iBaseResponseCallback);
                if (Math.abs(System.currentTimeMillis() - j2) > j) {
                    LogUtil.a("CompatibilityInteractor", "getDeviceListFromWear outTime:", Long.valueOf(Math.abs(System.currentTimeMillis() - j2)));
                } else {
                    iBaseResponseCallback.a(i, obj);
                }
            }
        });
    }

    public void a(BaseHandler baseHandler, int i, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.d("CompatibilityInteractor", "isHuaweiWearBinded productId:", Integer.valueOf(i), " healthType:" + mga.e(i));
        WearDeviceState wearDeviceState = WearDeviceState.NO_BIND_DEVICE;
        List<DeviceInfo> listG = fks.d().g();
        if (listG != null && !a(BaseApplication.getContext())) {
            iBaseResponseCallback.a(0, e(listG));
        } else {
            e(baseHandler, 700L, System.currentTimeMillis(), new IBaseResponseCallback() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    String str = (String) obj;
                    LogUtil.a("CompatibilityInteractor", "isHuaweiWearBinded onResponse errorCode:", Integer.valueOf(i2), "  objData:", str);
                    CompatibilityInteractor.this.b("getDeviceList");
                    WearDeviceState wearDeviceStateE = WearDeviceState.NO_BIND_DEVICE;
                    if (i2 == 0 && obj != null) {
                        Gson gson = new Gson();
                        if (!(obj instanceof String)) {
                            str = null;
                        }
                        if (str != null) {
                            wearDeviceStateE = CompatibilityInteractor.this.e((List<DeviceInfo>) gson.fromJson(str, new TypeToken<List<DeviceInfo>>() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.2.1
                            }.getType()));
                        }
                    }
                    iBaseResponseCallback.a(0, wearDeviceStateE);
                    LogUtil.a("CompatibilityInteractor", "isHuaweiWearBinded wearDeviceState:", wearDeviceStateE);
                }
            });
        }
    }

    public void c() {
        lsy.a(new Runnable() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.6
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("CompatibilityInteractor", "Enter sendDeviceListChangeBroadcast()");
                eem.a(rcv.a(BaseApplication.getContext()).i(), "CompatibilityInteractor");
            }
        });
    }

    public boolean b() {
        return BTDeviceMgrUtil.c().h() == 3;
    }

    private boolean e() {
        boolean zA = !CommonUtil.bg() ? true : a(CommonUtil.p());
        LogUtil.a("CompatibilityInteractor", "isNeedNote:", Boolean.valueOf(zA));
        return zA;
    }

    private boolean a(String str) {
        boolean z = (str == null || str.length() == 0 || str.compareTo("8.0.0") <= 0) ? false : true;
        LogUtil.a("CompatibilityInteractor", "isLargerThen8_0_0 version:", str, " res:", Boolean.valueOf(z));
        return z;
    }

    public void d(Context context, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("CompatibilityInteractor", "Enter checkCompatibility");
        if (!CommonUtil.ck()) {
            LogUtil.a("CompatibilityInteractor", "not support ,return");
            iBaseResponseCallback.a(0, true);
            return;
        }
        c();
        if (context == null) {
            LogUtil.a("CompatibilityInteractor", "activityContext is null ,return");
            iBaseResponseCallback.a(0, true);
            return;
        }
        if (!e()) {
            LogUtil.a("CompatibilityInteractor", "not huawei or emui version low");
            iBaseResponseCallback.a(0, true);
            return;
        }
        d();
        if (!(context instanceof Activity)) {
            LogUtil.a("CompatibilityInteractor", "activityContext is not activity,return");
            iBaseResponseCallback.a(0, true);
        } else if (!b()) {
            LogUtil.a("CompatibilityInteractor", "system bluetooth is off,return");
            iBaseResponseCallback.a(0, true);
        } else {
            if (b(context, iBaseResponseCallback)) {
                return;
            }
            if (a(context)) {
                c(context, iBaseResponseCallback);
            } else {
                a(context, iBaseResponseCallback);
            }
        }
    }

    private boolean b(Context context, IBaseResponseCallback iBaseResponseCallback) {
        if (Math.abs(System.currentTimeMillis() - CommonUtil.m(BaseApplication.getContext(), SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "THE_WEAR_HOMEFRAGMENT_SHOW_MIGRATE_TIME"))) < 259200000) {
            LogUtil.a("CompatibilityInteractor", "time doesn't match,return");
            iBaseResponseCallback.a(0, true);
            return true;
        }
        List<DeviceInfo> listI = rcv.a(context.getApplicationContext()).i();
        if (listI != null && !listI.isEmpty()) {
            LogUtil.a("CompatibilityInteractor", "exist bind device,return");
            iBaseResponseCallback.a(0, true);
            return true;
        }
        if ("true".equalsIgnoreCase(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "wear_join_notice_to_migrate"))) {
            return false;
        }
        LogUtil.a("CompatibilityInteractor", "cloud switch is close,return");
        iBaseResponseCallback.a(0, true);
        return true;
    }

    private void a(final Context context, final IBaseResponseCallback iBaseResponseCallback) {
        f24922a.execute(new Runnable() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.7
            @Override // java.lang.Runnable
            public void run() {
                List<DeviceInfo> listG = fks.d().g();
                if (listG != null && !listG.isEmpty()) {
                    if (CompatibilityInteractor.this.a(listG)) {
                        DeviceInfo deviceInfoD = CompatibilityInteractor.this.d(listG);
                        if (deviceInfoD != null) {
                            iBaseResponseCallback.a(0, false);
                            CompatibilityInteractor.this.d(context, deviceInfoD, false);
                            return;
                        } else {
                            iBaseResponseCallback.a(0, true);
                            return;
                        }
                    }
                    iBaseResponseCallback.a(0, true);
                    return;
                }
                iBaseResponseCallback.a(0, true);
                LogUtil.a("CompatibilityInteractor", "no device 2");
            }
        });
    }

    private void c(final Context context, final IBaseResponseCallback iBaseResponseCallback) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f24922a.execute(new Runnable() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.9
            @Override // java.lang.Runnable
            public void run() {
                if (CommonUtil.ck()) {
                    eem.a(rcv.a(BaseApplication.getContext()).i(), "CompatibilityInteractor");
                }
                fks.d().b(new IBaseResponseCallback() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.9.2
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a("CompatibilityInteractor", "getDeviceListFromWear onResponse errorCode:", Integer.valueOf(i));
                        if (Math.abs(System.currentTimeMillis() - jCurrentTimeMillis) > 500) {
                            LogUtil.a("CompatibilityInteractor", "getDeviceListFromWear outtime:", Long.valueOf(Math.abs(System.currentTimeMillis() - jCurrentTimeMillis)));
                            iBaseResponseCallback.a(0, true);
                            return;
                        }
                        if (i != 0 || obj == null) {
                            return;
                        }
                        List<DeviceInfo> list = (List) new Gson().fromJson((String) obj, new TypeToken<List<DeviceInfo>>() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor$5$1$1
                        }.getType());
                        if (list == null || list.isEmpty()) {
                            LogUtil.a("CompatibilityInteractor", "no device");
                            iBaseResponseCallback.a(0, true);
                        } else if (CompatibilityInteractor.this.a(list)) {
                            DeviceInfo deviceInfoD = CompatibilityInteractor.this.d(list);
                            if (deviceInfoD == null) {
                                iBaseResponseCallback.a(0, true);
                            } else {
                                iBaseResponseCallback.a(0, false);
                                CompatibilityInteractor.this.d(context, deviceInfoD, true);
                            }
                        }
                    }
                });
            }
        });
    }

    public void d(Context context, DeviceInfo deviceInfo, boolean z) {
        LogUtil.a("CompatibilityInteractor", "Enter showDialogToMigrate:", " isNewVersion:", Boolean.valueOf(z));
        StorageParams storageParams = new StorageParams();
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "THE_WEAR_HOMEFRAGMENT_SHOW_MIGRATE_TIME", System.currentTimeMillis() + "", storageParams);
        e(context, deviceInfo, z);
    }

    public void b(final Context context, final DeviceInfo deviceInfo, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.e("CompatibilityInteractor", "Enter showDialogToMigrateLowVersion");
        ((Activity) context).runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.11
            @Override // java.lang.Runnable
            public void run() {
                CompatibilityInteractor.this.c(context, deviceInfo, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Context context, final DeviceInfo deviceInfo, final IBaseResponseCallback iBaseResponseCallback) {
        int i = R.string.IDS_compatibility_note_open;
        int i2 = R.string.IDS_settings_button_cancal;
        CustomAlertDialog.Builder builderD = new CustomAlertDialog.Builder(context).d(R.string.IDS_service_area_notice_title);
        builderD.d(i, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.13
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i3) {
                CompatibilityInteractor.this.d(deviceInfo, context, iBaseResponseCallback);
            }
        });
        builderD.a(i2, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.15
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i3) {
                LogUtil.a("CompatibilityInteractor", "showDialogToMigrateLowVersion setNegativeButton onclick");
                if (CompatibilityInteractor.this.d != null) {
                    CompatibilityInteractor.this.d.dismiss();
                    CompatibilityInteractor.this.d = null;
                }
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(0, "CANCLE");
                }
            }
        });
        List<DeviceInfo> listG = fks.d().g();
        if (listG == null) {
            LogUtil.a("CompatibilityInteractor", "showDialogToMigrate deviceInfoList is null");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, "CANCLE");
                return;
            }
            return;
        }
        builderD.a(e(context, listG));
        if (this.d == null) {
            CustomAlertDialog customAlertDialogB = builderD.b();
            this.d = customAlertDialogB;
            customAlertDialogB.setCanceledOnTouchOutside(false);
            this.d.show();
        }
    }

    private View e(Context context, List<DeviceInfo> list) {
        String string = context.getResources().getString(R.string.IDS_compatibility_note_unbind_new);
        String string2 = context.getResources().getString(R.string.IDS_app_name);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(String.format(Locale.ENGLISH, string, string2));
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null && a(deviceInfo.getProductType())) {
                stringBuffer.append(System.lineSeparator());
                stringBuffer.append(deviceInfo.getDeviceName());
            }
        }
        stringBuffer.append(System.lineSeparator());
        stringBuffer.append(String.format(Locale.ENGLISH, context.getResources().getString(R.string.IDS_compatibility_note_close_huawei_wear), string2));
        stringBuffer.append(System.lineSeparator());
        stringBuffer.append(System.lineSeparator());
        stringBuffer.append(String.format(Locale.ENGLISH, context.getResources().getString(R.string.IDS_compatibility_note_open_huawei_wear), string2));
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.dialog_migrate_low_version, (ViewGroup) null);
        HealthCheckBox healthCheckBox = viewInflate.findViewById(R.id.compatibility_remind) instanceof HealthCheckBox ? (HealthCheckBox) viewInflate.findViewById(R.id.compatibility_remind) : null;
        if (healthCheckBox != null) {
            healthCheckBox.setVisibility(8);
        }
        ((HealthTextView) viewInflate.findViewById(R.id.compatibility_content)).setText(stringBuffer.toString());
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo, Context context, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("CompatibilityInteractor", "showDialogToMigrate setPositiveButton onclick");
        if (deviceInfo != null) {
            String strD = rcv.a(BaseApplication.getContext()).d(fic.e().c(deviceInfo.getProductType()));
            LogUtil.a("CompatibilityInteractor", "productName:", strD);
            boolean zEquals = "PORSCHE DESIGN".equals(strD);
            Intent intent = new Intent();
            intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, fic.e().c(deviceInfo.getProductType()));
            intent.putExtra("dname", strD);
            intent.putExtra("isPorc", zEquals);
            intent.putExtra("isFromWear", true);
            intent.setClass(context, AddDeviceIntroActivity.class);
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("CompatibilityInteractor", "posiviteButtonClick startActivity has ActivityNotFoundException");
            }
        }
        CommonUtil.aj(BaseApplication.getContext());
        CustomAlertDialog customAlertDialog = this.d;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
            this.d = null;
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, "SURE");
        }
    }

    public void e(final Context context, final DeviceInfo deviceInfo, final boolean z) {
        LogUtil.e("CompatibilityInteractor", "Enter showDialogToMigrate");
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.14
                @Override // java.lang.Runnable
                public void run() {
                    CompatibilityInteractor.this.c(context, z, deviceInfo);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Context context, final boolean z, final DeviceInfo deviceInfo) {
        int i = R.string.IDS_device_start_paring_title;
        int i2 = R.string.IDS_device_auto_scan_cancel_button;
        CustomAlertDialog.Builder builderD = new CustomAlertDialog.Builder(context).d(R.string.IDS_service_area_notice_title);
        builderD.d(i, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i3) {
                CompatibilityInteractor.this.c(z, deviceInfo, context);
            }
        });
        builderD.a(i2, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i3) {
                LogUtil.a("CompatibilityInteractor", "showDialogToMigrate setNegativeButton onclick");
                if (CompatibilityInteractor.this.f24923b != null) {
                    CompatibilityInteractor.this.f24923b.dismiss();
                    CompatibilityInteractor.this.f24923b = null;
                }
            }
        });
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.dialog_migrate_low_version, (ViewGroup) null);
        HealthCheckBox healthCheckBox = (HealthCheckBox) viewInflate.findViewById(R.id.compatibility_remind);
        ((HealthTextView) viewInflate.findViewById(R.id.compatibility_content)).setText(String.format(Locale.ENGLISH, context.getResources().getString(R.string.IDS_compatibility_note_mig_to_health_new), context.getResources().getString(R.string.IDS_app_name_health), deviceInfo.getDeviceName()));
        healthCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompatibilityInteractor.this.a(z2);
            }
        });
        builderD.a(viewInflate);
        if (this.f24923b == null) {
            CustomAlertDialog customAlertDialogB = builderD.b();
            this.f24923b = customAlertDialogB;
            customAlertDialogB.setCanceledOnTouchOutside(false);
            this.f24923b.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        StorageParams storageParams = new StorageParams();
        LogUtil.a("CompatibilityInteractor", "showDialogToMigrate isChecked:", Boolean.valueOf(z));
        if (!z) {
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "wear_join_not_notice_any_more", "true", storageParams);
        } else {
            LogUtil.a("CompatibilityInteractor", "showDialogToMigrate setNegativeButton onclick");
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "wear_join_not_notice_any_more", "false", storageParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z, DeviceInfo deviceInfo, Context context) {
        LogUtil.a("CompatibilityInteractor", "showDialogToMigrate setPositiveButton onclick");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010048.value(), new HashMap(16), 0);
        if (z) {
            Intent intent = new Intent();
            int iC = fic.e().c(deviceInfo.getProductType());
            intent.putExtra("pairGuideProductType", iC);
            intent.putExtra("pairGuideProductName", deviceInfo.getDeviceName());
            if (iC == 10 || iC == 3) {
                intent.putExtra("pairGuideFromScanList", false);
            } else {
                intent.putExtra("pairGuideFromScanList", true);
            }
            intent.putExtra("pairGuideSelectName", deviceInfo.getDeviceName());
            intent.putExtra("pairGuideSelectAddress", deviceInfo.getDeviceIdentify());
            intent.setClass(context, DevicePairGuideActivity.class);
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("CompatibilityInteractor", "uploadClick startActivity has ActivityNotFoundException");
            }
            CustomAlertDialog customAlertDialog = this.f24923b;
            if (customAlertDialog != null) {
                customAlertDialog.dismiss();
                this.f24923b = null;
                return;
            }
            return;
        }
        b(context, deviceInfo, null);
    }

    public DeviceInfo d(List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo.getDeviceActiveState() == 1) {
                LogUtil.a("CompatibilityInteractor", "getAchievedDevice:");
                return deviceInfo;
            }
        }
        deviceInfo = null;
        LogUtil.a("CompatibilityInteractor", "getAchievedDevice:");
        return deviceInfo;
    }

    public boolean a(List<DeviceInfo> list) {
        boolean z = false;
        for (DeviceInfo deviceInfo : list) {
            LogUtil.a("CompatibilityInteractor", "isAchievedDeviceSupportedInHealth():", deviceInfo.toString());
            if (deviceInfo.getDeviceActiveState() != 1 || !a(deviceInfo.getProductType())) {
                break;
            }
            if (fic.e().c(deviceInfo.getProductType()) != 10) {
                z = true;
                break;
            }
            LogUtil.a("CompatibilityInteractor", "isAchievedDeviceSupportedInHealth is leo:");
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), deviceInfo.getUuid());
            LogUtil.a("CompatibilityInteractor", "isAchievedDeviceSupportedInHealth:", deviceInfo.getUuid(), " result:", strE);
            if ("true".equals(strE)) {
                z = true;
            }
        }
        LogUtil.a("CompatibilityInteractor", "isAchievedDeviceSupportedInHealth:", Boolean.valueOf(z));
        return z;
    }

    private void d() {
        LogUtil.a("CompatibilityInteractor", "Enter getLeoStatus");
        if (a(BaseApplication.getContext())) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.4
                @Override // java.lang.Runnable
                public void run() {
                    List<DeviceInfo> listG;
                    if (!CompatibilityInteractor.this.a(BaseApplication.getContext()) || (listG = fks.d().g()) == null || listG.isEmpty()) {
                        return;
                    }
                    for (DeviceInfo deviceInfo : listG) {
                        if (fic.e().c(deviceInfo.getProductType()) == 10) {
                            LogUtil.a("CompatibilityInteractor", "getLeoStatus uuid:", deviceInfo.getUuid());
                            final String uuid = deviceInfo.getUuid();
                            fks.d().e(uuid, new IBaseResponseCallback() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.4.2
                                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                                /* JADX INFO: renamed from: onResponse */
                                public void a(int i, Object obj) {
                                    LogUtil.a("CompatibilityInteractor", "not getLeoStatus ,errorCode ", Integer.valueOf(i), " objData", obj, " name:", uuid);
                                    if (i != 0 || obj == null) {
                                        return;
                                    }
                                    SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), uuid, "" + obj, new StorageParams(0));
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    public boolean b(List<DeviceInfo> list) {
        boolean z = false;
        for (DeviceInfo deviceInfo : list) {
            if (a(deviceInfo.getProductType())) {
                if (fic.e().c(deviceInfo.getProductType()) == 10) {
                    String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), deviceInfo.getUuid());
                    LogUtil.a("CompatibilityInteractor", "isDeviceSupportedInHealth:", deviceInfo.getUuid(), " result:", strE);
                    if ("true".equals(strE)) {
                    }
                }
                z = true;
            }
        }
        LogUtil.a("CompatibilityInteractor", "isDeviceSupportedInHealth:", Boolean.valueOf(z));
        return z;
    }

    public boolean c(List<DeviceInfo> list) {
        Iterator<DeviceInfo> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (a(it.next().getProductType())) {
                z = true;
            }
        }
        LogUtil.a("CompatibilityInteractor", "isDeviceSupportedInHealthForLeo:", Boolean.valueOf(z));
        return z;
    }

    public boolean a(int i) {
        boolean zH = lvi.h(fic.e().c(i));
        LogUtil.a("CompatibilityInteractor", "isProductedSuppopted healthproduct:", Integer.valueOf(i), " isSupport:", Boolean.valueOf(zH), " wearType:", Integer.valueOf(fic.e().c(i)));
        return zH;
    }

    public static boolean c(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.huawei.bone", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.d("CompatibilityInteractor", "checkHealth packageInfo == NULL");
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public void d(int i, HealthSupportModel healthSupportModel) {
        if (healthSupportModel != null && a(BaseApplication.getContext())) {
            final StorageParams storageParams = new StorageParams();
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "wear_join_supported_device", this.f24924c.toJson(healthSupportModel), storageParams);
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "wear_join_send_supported_falg", "false", storageParams);
            HealthSupportModel healthSupportModelC = eem.c();
            HuaweiHealthData huaweiHealthData = new HuaweiHealthData();
            huaweiHealthData.setCommandType(i);
            huaweiHealthData.setData(this.f24924c.toJson(healthSupportModelC));
            fks.d().a(this.f24924c.toJson(huaweiHealthData), new IBaseResponseCallback() { // from class: com.huawei.ui.device.interactors.CompatibilityInteractor.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.a("CompatibilityInteractor", "sendHealthDataTohealth onResponse:", Integer.valueOf(i2));
                    SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "wear_join_send_supported_falg", "true", storageParams);
                }
            });
            return;
        }
        StorageParams storageParams2 = new StorageParams();
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "wear_join_send_supported_falg", "true", storageParams2);
        if (healthSupportModel != null) {
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "wear_join_supported_device", this.f24924c.toJson(healthSupportModel), storageParams2);
        }
    }

    public String a() {
        HealthSupportModel healthSupportModelC = eem.c();
        ArrayList arrayList = new ArrayList(16);
        if (healthSupportModelC.isSupportLeo()) {
            arrayList.add(10);
        }
        if (healthSupportModelC.isSupportMetis()) {
            arrayList.add(8);
        }
        if (healthSupportModelC.isSupportA2()) {
            arrayList.add(12);
        }
        if (healthSupportModelC.isSupportNyx()) {
            arrayList.add(13);
        }
        if (healthSupportModelC.isSupportB3Lite()) {
            arrayList.add(14);
        }
        if (healthSupportModelC.isSupportB3()) {
            arrayList.add(7);
        }
        if (healthSupportModelC.isSupportR1()) {
            arrayList.add(11);
        }
        if (healthSupportModelC.isSupportEris()) {
            arrayList.add(15);
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        if (arrayList.size() > 1) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i < arrayList.size() - 1) {
                    stringBuffer.append(arrayList.get(i) + ",");
                } else {
                    stringBuffer.append(arrayList.get(i));
                }
            }
        } else if (1 == arrayList.size()) {
            stringBuffer.append(arrayList.get(0));
        } else {
            LogUtil.a("CompatibilityInteractor", "productTypeLis other size");
        }
        String string = stringBuffer.toString();
        LogUtil.a("CompatibilityInteractor", "getSupportTypeList:", string);
        return string;
    }

    public void b(String str) {
        fks.d().a(str);
    }
}
