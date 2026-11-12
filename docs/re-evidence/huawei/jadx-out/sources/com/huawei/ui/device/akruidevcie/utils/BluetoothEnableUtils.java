package com.huawei.ui.device.akruidevcie.utils;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.pairing.DevicePairGuideUtil;
import com.huawei.ui.device.akruidevcie.utils.BluetoothEnableUtils;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import defpackage.lon;
import defpackage.rct;

/* JADX INFO: loaded from: classes16.dex */
public class BluetoothEnableUtils {

    public interface IsSupportLocation {
        boolean get();
    }

    public static void d(SimpleChain.Emitter emitter, final Activity activity, final IsSupportLocation isSupportLocation) {
        if (activity == null) {
            emitter.onError("checkBluetoothEnable context == null");
        } else {
            SimpleChain.b("checkBluetoothEnable").e(new SimpleChain.INext() { // from class: rat
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
                public final void onNext(SimpleChain.Emitter emitter2, Object[] objArr) {
                    BluetoothEnableUtils.c(emitter2, activity, isSupportLocation);
                }
            }).e(new SimpleChain.INext() { // from class: rav
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
                public final void onNext(SimpleChain.Emitter emitter2, Object[] objArr) {
                    BluetoothEnableUtils.a(emitter2, activity);
                }
            }).d(emitter, new Object[0]);
        }
    }

    public static void c(final SimpleChain.Emitter emitter, final Activity activity, final IsSupportLocation isSupportLocation) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            HandlerExecutor.b(new Runnable() { // from class: ran
                @Override // java.lang.Runnable
                public final void run() {
                    BluetoothEnableUtils.c(emitter, activity, isSupportLocation);
                }
            });
            return;
        }
        if (Build.VERSION.SDK_INT > 30) {
            e(emitter, activity);
        } else if (isSupportLocation.get()) {
            c(emitter, activity);
        } else {
            emitter.onSuccess(new Object[0]);
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.akruidevcie.utils.BluetoothEnableUtils$4, reason: invalid class name */
    public class AnonymousClass4 extends BluetoothPermisionUtils.NearbyPermissionAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SimpleChain.Emitter f24900b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Context context, SimpleChain.Emitter emitter) {
            super(context);
            this.f24900b = emitter;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a("BluetoothEnableUtils", "nearby permission granted");
            this.f24900b.onSuccess(new Object[0]);
        }

        @Override // com.huawei.ui.device.utlis.BluetoothPermisionUtils.NearbyPermissionAction, com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            this.f24900b.onError("request PermissionType.SCAN Error");
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType, View.OnClickListener onClickListener, final View.OnClickListener onClickListener2) {
            final SimpleChain.Emitter emitter = this.f24900b;
            super.onForeverDenied(permissionType, onClickListener, new View.OnClickListener() { // from class: raw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BluetoothEnableUtils.AnonymousClass4.e(onClickListener2, emitter, view);
                }
            });
        }

        public static /* synthetic */ void e(View.OnClickListener onClickListener, SimpleChain.Emitter emitter, View view) {
            onClickListener.onClick(view);
            emitter.onError("request PermissionType.SCAN onForeverDenied");
        }
    }

    private static void e(SimpleChain.Emitter emitter, Activity activity) {
        PermissionUtil.d(activity, PermissionUtil.PermissionType.SCAN, new AnonymousClass4(activity, emitter));
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.akruidevcie.utils.BluetoothEnableUtils$1, reason: invalid class name */
    public class AnonymousClass1 extends CustomPermissionAction {
        final /* synthetic */ SimpleChain.Emitter d;
        final /* synthetic */ Activity e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Activity activity, SimpleChain.Emitter emitter) {
            super(context);
            this.e = activity;
            this.d = emitter;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a("BluetoothEnableUtils", "location permission ok.");
            if (!rct.e(this.e)) {
                BluetoothEnableUtils.c(this.e);
                this.d.onError("not isGpsLocationEnable");
            } else {
                this.d.onSuccess(new Object[0]);
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            this.d.onError("request PermissionType.LOCATION Error");
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType, View.OnClickListener onClickListener, final View.OnClickListener onClickListener2) {
            final SimpleChain.Emitter emitter = this.d;
            super.onForeverDenied(permissionType, onClickListener, new View.OnClickListener() { // from class: rbb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BluetoothEnableUtils.AnonymousClass1.d(onClickListener2, emitter, view);
                }
            });
        }

        public static /* synthetic */ void d(View.OnClickListener onClickListener, SimpleChain.Emitter emitter, View view) {
            onClickListener.onClick(view);
            emitter.onError("request PermissionType.LOCATION onForeverDenied");
        }
    }

    private static void c(SimpleChain.Emitter emitter, Activity activity) {
        PermissionUtil.d(activity, PermissionUtil.PermissionType.LOCATION, new AnonymousClass1(activity, activity, emitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final SimpleChain.Emitter emitter, Activity activity) {
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("BluetoothEnableUtils", "reConnect blue state: ", Integer.valueOf(BluetoothAdapter.getDefaultAdapter().getState()));
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).a(activity.getResources().getString(R.string.IDS_device_bluetooth_open_request)).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: rau
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BluetoothEnableUtils.b(emitter, view);
                }
            }).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: ras
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BluetoothEnableUtils.a(emitter, view);
                }
            }).c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
            return;
        }
        emitter.onSuccess(new Object[0]);
    }

    public static /* synthetic */ void b(final SimpleChain.Emitter emitter, View view) {
        LogUtil.a("BluetoothEnableUtils", "user choose open BT");
        BTDeviceMgrUtil.c().c(new BtSwitchStateCallback() { // from class: com.huawei.ui.device.akruidevcie.utils.BluetoothEnableUtils.5
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
            public void onBtSwitchStateCallback(int i) {
                LogUtil.a("BluetoothEnableUtils", "reconnect bluetoothSwitchState :", Integer.valueOf(i));
                if (i == 3) {
                    BTDeviceMgrUtil.c().e(this);
                    emitter.onSuccess(new Object[0]);
                }
            }
        });
    }

    public static /* synthetic */ void a(SimpleChain.Emitter emitter, View view) {
        LogUtil.a("BluetoothEnableUtils", "checkBluetoothEnable click NegativeButton");
        emitter.onError("checkBluetoothEnable click NegativeButton");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final Activity activity) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.device.akruidevcie.utils.BluetoothEnableUtils.2
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("BluetoothEnableUtils", "getHarmonyStatus getValue");
                String strD = lon.c().d("scale_share_harmony_tips");
                DevicePairGuideUtil.e(strD);
                LogUtil.a("BluetoothEnableUtils", "getHarmonyStatus scale_share_harmony_tips: ", strD);
                Activity activity2 = activity;
                if (activity2 == null) {
                    return;
                }
                activity2.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.akruidevcie.utils.BluetoothEnableUtils.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        String string;
                        if ("on".equals(DevicePairGuideUtil.b())) {
                            string = BaseApplication.getContext().getString(R.string.IDS_btsdk_turn_on_location_harmony);
                        } else {
                            string = BaseApplication.getContext().getString(R.string.IDS_btsdk_turn_on_location);
                        }
                        BluetoothEnableUtils.c(activity, string);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final Context context, String str) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(str).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: com.huawei.ui.device.akruidevcie.utils.BluetoothEnableUtils.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("BluetoothEnableUtils", "user choose open gps");
                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                Context context2 = context;
                if (context2 instanceof Activity) {
                    ((Activity) context2).startActivityForResult(intent, 0);
                }
            }
        }).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: com.huawei.ui.device.akruidevcie.utils.BluetoothEnableUtils.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("BluetoothEnableUtils", "user choose cancel");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }
}
