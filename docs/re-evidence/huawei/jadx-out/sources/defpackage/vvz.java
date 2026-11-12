package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.view.View;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BluetoothSwitchStateUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class vvz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NoTitleCustomAlertDialog f51644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothSwitchStateUtil f51645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51646c;
    private ServiceItemActivity d;
    private final BtSwitchStateCallback e = new BtSwitchStateCallback() { // from class: vvz.2
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
        public void onBtSwitchStateCallback(int i) {
            if (vvz.this.f51645b != null) {
                vvz.this.f51645b.d(vvz.this.e);
                LogUtil.a("DeleteDeviceDialogUtils", "onBtSwitchStateCallback bluetoothSwitchState:", Integer.valueOf(i));
                if (i == 3) {
                    vvz.this.a();
                    return;
                }
                return;
            }
            LogUtil.j("DeleteDeviceDialogUtils", "mBluetoothSwitchStateUtil is null");
        }
    };
    private NoTitleCustomAlertDialog h;
    private String i;
    private NoTitleCustomAlertDialog j;

    public vvz(String str, String str2, ServiceItemActivity serviceItemActivity) {
        this.f51646c = str;
        this.d = serviceItemActivity;
        this.i = str2;
        this.f51645b = new BluetoothSwitchStateUtil(this.d);
    }

    public void e() {
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.d).a(this.d.getResources().getString(R.string.IDS_device_bluetooth_open_request)).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: vwb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51650a.d(view);
                }
            }).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: vvy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.b(view);
                }
            }).c();
            this.f51644a = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.f51644a.show();
            return;
        }
        a();
    }

    /* synthetic */ void d(View view) {
        LogUtil.a("DeleteDeviceDialogUtils", "checkBluetoothStatus, open bluetooth");
        BluetoothSwitchStateUtil bluetoothSwitchStateUtil = this.f51645b;
        if (bluetoothSwitchStateUtil == null) {
            return;
        }
        bluetoothSwitchStateUtil.e(this.e);
    }

    /* synthetic */ void b(View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f51644a;
        if (noTitleCustomAlertDialog == null) {
            return;
        }
        noTitleCustomAlertDialog.dismiss();
        this.f51644a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("DeleteDeviceDialogUtils", "Enter deleteDevice");
        if (lwg.d().e(this.f51646c)) {
            d();
        } else {
            b();
        }
    }

    private void d() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.d).a(this.d.getResources().getString(R.string.IDS_device_ota_later_note)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: vwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("DeleteDeviceDialogUtils", "showTipDialog click");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void b() {
        mhs.a().getSwitchSetting("intelligent_home_linkage", this.f51646c, new IBaseResponseCallback() { // from class: vvz.3
            /* JADX WARN: Code duplicated, block: B:11:0x002d  */
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                String str;
                boolean z = false;
                if (i == 0 && (obj instanceof String)) {
                    String str2 = (String) obj;
                    if (str2.contains(Constants.PARAM_SERVER_SPLIT)) {
                        String[] strArrSplit = str2.split(Constants.PARAM_SERVER_SPLIT);
                        LogUtil.a("DeleteDeviceDialogUtils", "getIntelligentStatus splits length is ", Integer.valueOf(strArrSplit.length));
                        if (strArrSplit.length == 5) {
                            str = strArrSplit[0];
                            z = true;
                        } else {
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                } else {
                    str = "";
                }
                LogUtil.a("DeleteDeviceDialogUtils", "getIntelligentStatus isEnable = ", Boolean.valueOf(z));
                vvz.this.e(z, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final boolean z, final String str) {
        this.d.runOnUiThread(new Runnable() { // from class: vvz.4
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("DeleteDeviceDialogUtils", "updateIntelligentStatus enter");
                if (z) {
                    vvz.this.d(str);
                } else {
                    vvz.this.f();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final String str) {
        LogUtil.a("DeleteDeviceDialogUtils", "enter showUnbindIntelligentDialog");
        if (this.j == null) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.d).a(String.format(Locale.ENGLISH, this.d.getString(R.string.IDS_delete_device_to_intelligent), this.i, this.d.getString(R.string.IDS_app_name_health_1), this.d.getString(R.string.IDS_device_intelligent_home))).c(R.string.IDS_unbind_device_wear_home_unpair, new View.OnClickListener() { // from class: vwe
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.a(str, view);
                }
            }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: vwg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f51652b.g(view);
                }
            }).c();
            this.j = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            this.j.show();
        }
    }

    /* synthetic */ void a(String str, View view) {
        LogUtil.d("DeleteDeviceDialogUtils", "showUnbindIntelligentDialog ok click");
        c(str);
        this.j.dismiss();
        this.j = null;
    }

    /* synthetic */ void g(View view) {
        LogUtil.d("DeleteDeviceDialogUtils", "showUnbindIntelligentDialog cancel click");
        this.j.dismiss();
        this.j = null;
    }

    private void c(String str) {
        lwg.d().a(str);
        this.d.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.a("DeleteDeviceDialogUtils", "enter showUnbindDialog");
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.d).a(String.format(Locale.ROOT, this.d.getResources().getString(R.string.IDS_delete_device_tips), this.i, this.d.getString(R.string.IDS_app_name_health_1))).c(R.string.IDS_unbind_device_wear_home_unpair, new View.OnClickListener() { // from class: vvx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: vwa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("DeleteDeviceDialogUtils", "showUnbindDialog cancel click");
            }
        }).c();
        this.h = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.h.show();
    }

    /* synthetic */ void c(View view) {
        LogUtil.a("DeleteDeviceDialogUtils", "showUnbindDialog ok click");
        c((String) null);
    }

    public void c() {
        BluetoothSwitchStateUtil bluetoothSwitchStateUtil = this.f51645b;
        if (bluetoothSwitchStateUtil != null) {
            bluetoothSwitchStateUtil.a();
        }
    }
}
