package com.huawei.ui.device.activity.pairing;

import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBluetoothDialogAidlCallback;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.device.R;
import defpackage.lon;
import defpackage.ltd;
import defpackage.lvi;
import defpackage.qpx;
import defpackage.qyz;
import defpackage.qzd;
import defpackage.rcv;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class HwBtDialogActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BTDeviceMgrUtil f24636a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomViewDialog.Builder f24638c;
    private DialogAidlCallback d;
    private Context e;
    private CustomViewDialog f;
    private DeviceListAdapter g;
    private NoTitleCustomAlertDialog i;
    private String j;
    private qzd k;
    private int m;
    private int n;
    private TextView o;
    private ListView p;
    private HealthProgressBar r;
    private qyz s;
    private DeviceParameter h = null;
    private Handler l = new c(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f24637b = new a(this);

    class a extends BroadcastReceiver {
        WeakReference<HwBtDialogActivity> e;

        a(HwBtDialogActivity hwBtDialogActivity) {
            this.e = new WeakReference<>(hwBtDialogActivity);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            HwBtDialogActivity hwBtDialogActivity = this.e.get();
            if (hwBtDialogActivity == null) {
                LogUtil.j("HwBtDialogActivity", "bluetooth switch onReceive activity is null.");
                return;
            }
            if (intent == null) {
                LogUtil.j("HwBtDialogActivity", "bluetooth switch onReceive intent is null.");
                return;
            }
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter == null) {
                    LogUtil.j("HwBtDialogActivity", "bluetooth switch onReceive mAdapter is null.");
                    return;
                }
                int state = defaultAdapter.getState();
                LogUtil.a("HwBtDialogActivity", "bluetooth switch onReceive btSwitchState: ", Integer.valueOf(state));
                if (state == 12) {
                    HwBtDialogActivity.this.k.i();
                    if (hwBtDialogActivity.f24637b != null) {
                        try {
                            LogUtil.a("HwBtDialogActivity", "bluetooth switch onReceive unregisterReceiver.");
                            context.unregisterReceiver(hwBtDialogActivity.f24637b);
                            return;
                        } catch (IllegalArgumentException unused) {
                            LogUtil.e("HwBtDialogActivity", "bluetooth switch unregisterReceiver IllegalArgumentException.");
                            return;
                        }
                    }
                    return;
                }
                LogUtil.j("HwBtDialogActivity", "onReceive btSwitchState default.");
            }
        }
    }

    public static class DialogAidlCallback extends IBluetoothDialogAidlCallback.Stub {
        private final WeakReference<HwBtDialogActivity> d;

        private DialogAidlCallback(HwBtDialogActivity hwBtDialogActivity) {
            this.d = new WeakReference<>(hwBtDialogActivity);
        }

        @Override // com.huawei.hwservicesmgr.IBluetoothDialogAidlCallback
        public void onSetList(List<BluetoothDeviceNode> list, boolean z, int i) {
            LogUtil.a("HwBtDialogActivity", "Enter onSetList.");
            HwBtDialogActivity hwBtDialogActivity = this.d.get();
            if (hwBtDialogActivity == null || hwBtDialogActivity.g == null || hwBtDialogActivity.l == null) {
                LogUtil.j("HwBtDialogActivity", "onSetList activity is null.");
                return;
            }
            if (!z) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 8;
                messageObtain.obj = list;
                messageObtain.arg1 = 0;
                hwBtDialogActivity.l.sendMessage(messageObtain);
                return;
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 8;
            messageObtain2.obj = list;
            messageObtain2.arg1 = 1;
            messageObtain2.arg2 = i;
            hwBtDialogActivity.l.sendMessage(messageObtain2);
        }

        @Override // com.huawei.hwservicesmgr.IBluetoothDialogAidlCallback
        public void onScanFinished() {
            LogUtil.a("HwBtDialogActivity", "Enter onScanFinished.");
            HwBtDialogActivity hwBtDialogActivity = this.d.get();
            if (hwBtDialogActivity != null && hwBtDialogActivity.l != null) {
                hwBtDialogActivity.l.sendEmptyMessage(10);
            } else {
                LogUtil.j("HwBtDialogActivity", "onScanFinished activity is null.");
            }
        }

        @Override // com.huawei.hwservicesmgr.IBluetoothDialogAidlCallback
        public void onSetNameFilter(List list) {
            LogUtil.a("HwBtDialogActivity", "Enter onSetNameFilter.");
            HwBtDialogActivity hwBtDialogActivity = this.d.get();
            if (hwBtDialogActivity == null || hwBtDialogActivity.g == null || list == null) {
                LogUtil.j("HwBtDialogActivity", "onSetNameFilter activity is null.");
            } else {
                LogUtil.a("HwBtDialogActivity", "onSetNameFilter nameFilter: ", list.toString());
                hwBtDialogActivity.g.d(list);
            }
        }
    }

    class c extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<HwBtDialogActivity> f24642b;

        c(HwBtDialogActivity hwBtDialogActivity) {
            this.f24642b = new WeakReference<>(hwBtDialogActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            HwBtDialogActivity hwBtDialogActivity = this.f24642b.get();
            if (hwBtDialogActivity == null) {
                LogUtil.j("HwBtDialogActivity", "handleMessage activity is null.");
                return;
            }
            if (message == null) {
                LogUtil.j("HwBtDialogActivity", "handleMessage msg is null.");
                return;
            }
            LogUtil.a("HwBtDialogActivity", "handleMessage receive msg: ", Integer.valueOf(message.what));
            int i = message.what;
            if (i != 8) {
                if (i != 10) {
                    LogUtil.j("HwBtDialogActivity", "MyHandler handleMessage is error.");
                    return;
                } else {
                    if (hwBtDialogActivity.isFinishing()) {
                        return;
                    }
                    hwBtDialogActivity.r.setVisibility(8);
                    if (hwBtDialogActivity.o != null) {
                        hwBtDialogActivity.o.setText(R.string.IDS_device_mgr_device_scan_completed_title);
                        return;
                    }
                    return;
                }
            }
            ArrayList arrayList = new ArrayList(16);
            if (message.arg1 == 0 && (message.obj instanceof List)) {
                arrayList.addAll((List) message.obj);
                HwBtDialogActivity.this.g.a(arrayList);
            } else if (message.arg1 != 1 || !(message.obj instanceof List)) {
                LogUtil.j("HwBtDialogActivity", "enter set list branch");
            } else {
                arrayList.addAll((List) message.obj);
                HwBtDialogActivity.this.g.e(arrayList, message.arg2);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("HwBtDialogActivity", "onCreate");
        this.e = BaseApplication.getContext();
        this.s = new qyz();
        BTDeviceMgrUtil bTDeviceMgrUtilC = BTDeviceMgrUtil.c();
        this.f24636a = bTDeviceMgrUtilC;
        bTDeviceMgrUtilC.b(this.e);
        this.d = new DialogAidlCallback();
        qzd qzdVarC = qzd.c(this.e);
        this.k = qzdVarC;
        qzdVarC.c(this.f24636a);
        this.k.d(this.d);
        Window window = getWindow();
        window.setGravity(80);
        window.clearFlags(2);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        g();
    }

    private void g() {
        if (DevicePairGuideUtil.b() != null) {
            l();
        } else {
            ThreadPoolManager.c().a("HwBtDialogActivity", new Runnable() { // from class: com.huawei.ui.device.activity.pairing.HwBtDialogActivity.4
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("HwBtDialogActivity", "SCALE_SHARE_HARMONY_TIPS getValue");
                    String strD = lon.c().d("scale_share_harmony_tips");
                    DevicePairGuideUtil.e(strD);
                    LogUtil.a("HwBtDialogActivity", "SCALE_SHARE_HARMONY_TIPS: ", strD);
                    HwBtDialogActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.pairing.HwBtDialogActivity.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            HwBtDialogActivity.this.l();
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("HwBtDialogActivity", "initView intent is null.");
            return;
        }
        this.m = intent.getIntExtra(TtmlNode.TAG_STYLE, 0);
        if (intent.getParcelableExtra("device_parameter") instanceof DeviceParameter) {
            this.h = (DeviceParameter) intent.getParcelableExtra("device_parameter");
        }
        this.j = intent.getStringExtra("hichain_late_intent_key");
        LogUtil.a("HwBtDialogActivity", "initView style:", Integer.valueOf(this.m), ";content:", Integer.valueOf(intent.getIntExtra("content", 0)));
        this.k.c(this.h);
        int i = this.m;
        if (i == 1) {
            this.n = intent.getIntExtra("content", 0);
            h();
        } else if (i == 3) {
            c();
            j();
        }
        setFinishOnTouchOutside(false);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = defaultDisplay.getWidth();
        getWindow().setAttributes(attributes);
    }

    private void c() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            LogUtil.j("HwBtDialogActivity", "initView mAdapter is null.");
            return;
        }
        LogUtil.a("HwBtDialogActivity", "initView mAdapter is not null.");
        if (defaultAdapter.isEnabled()) {
            return;
        }
        LogUtil.a("HwBtDialogActivity", "initView mAdapter closed.");
        BroadcastManagerUtil.a(this.e, this.f24637b, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    private void h() {
        String string = getString(android.R.string.ok);
        String string2 = getString(android.R.string.cancel);
        int i = this.n;
        if (i == 1 || i == 2) {
            string = getString(R.string.IDS_common_enable_button);
        } else if (i == 4) {
            string2 = getString(R.string.IDS_btsdk_confirm_repair);
            string = getString(R.string.IDS_btsdk_confirm_connect);
        } else if (i == 5) {
            string = getString(R.string.IDS_btsdk_confirm_connect);
        } else if (i == 6) {
            string = getString(R.string.IDS_settings_button_ok);
        } else if (i == 7) {
            string = getString(R.string.IDS_kn_lost_ok);
            string2 = null;
        } else {
            LogUtil.j("HwBtDialogActivity", "initConfirmDialog mDialogContent is unknown.");
        }
        String strF = f();
        a();
        e(string, string2, strF);
    }

    private String f() {
        int i = this.n;
        if (i == 1) {
            if ("on".equals(DevicePairGuideUtil.b())) {
                return getString(R.string.IDS_btsdk_turn_on_location_BT_harmony);
            }
            return getString(R.string.IDS_btsdk_turn_on_location_BT);
        }
        if (i == 2) {
            if ("on".equals(DevicePairGuideUtil.b())) {
                return getString(R.string.IDS_btsdk_turn_on_location_harmony);
            }
            return getString(R.string.IDS_btsdk_turn_on_location);
        }
        if (i == 3) {
            return getString(R.string.IDS_btsdk_turn_on_BT);
        }
        if (i == 4) {
            return String.format(Locale.ROOT, getResources().getString(R.string.IDS_btsdk_confirm_connected_content), qzd.c(this.e).c());
        }
        if (i == 6) {
            return getString(R.string.IDS_btsdk_get_loacation_permiassion_health);
        }
        if (i == 7) {
            return getString(R.string.IDS_kn_lost_content);
        }
        LogUtil.j("HwBtDialogActivity", "getTipText mDialogContent is unknown.");
        return "";
    }

    private void a() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.i;
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            return;
        }
        this.i.dismiss();
    }

    private void e(String str, String str2, String str3) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(str3).a(str, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.HwBtDialogActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HwBtDialogActivity.this.d();
            }
        }).d(str2, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.HwBtDialogActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HwBtDialogActivity.this.b();
            }
        }).c();
        this.i = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        this.i.setCancelable(false);
        this.i.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("HwBtDialogActivity", "Enter confirmButtonFunction mDialogContent: ", Integer.valueOf(this.n));
        int i = this.n;
        if (i == 1 || i == 2) {
            startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1);
            return;
        }
        if (i == 3) {
            qzd.c(this.e).d(true);
            finish();
            return;
        }
        if (i == 4) {
            qzd.c(this.e).b();
            this.s.d(true);
            finish();
        } else if (i == 6) {
            LogUtil.a("HwBtDialogActivity", "confirmButtonFunction go to application set");
            startActivityForResult(new Intent("android.settings.SETTINGS"), 2);
        } else if (i == 7) {
            d(this.j);
        } else {
            LogUtil.j("HwBtDialogActivity", "confirmButtonFunction mDialogContent is unknown.");
        }
    }

    private void d(String str) {
        int iIndexOf;
        LogUtil.a("HwBtDialogActivity", "Enter unbindDevice.");
        if (str == null) {
            LogUtil.j("HwBtDialogActivity", "unbindDevice deviceIdentify is null.");
            return;
        }
        List<DeviceInfo> listI = rcv.a(this.e).i();
        if (listI == null || listI.size() == 0) {
            LogUtil.j("HwBtDialogActivity", "unbindDevice list is empty.");
            return;
        }
        Iterator<DeviceInfo> it = listI.iterator();
        while (true) {
            if (!it.hasNext()) {
                iIndexOf = -1;
                break;
            }
            DeviceInfo next = it.next();
            if (next.getDeviceIdentify().equals(str)) {
                iIndexOf = listI.indexOf(next);
                break;
            }
        }
        if (iIndexOf == -1) {
            LogUtil.j("HwBtDialogActivity", "unbindDevice index is invalid.");
            return;
        }
        listI.remove(iIndexOf);
        LogUtil.a("HwBtDialogActivity", "deleteDevice");
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(str);
        rcv.a(this.e).b((List<String>) arrayList, true);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int i = this.n;
        if (i != 1) {
            if (i == 2) {
                i();
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    c(false);
                    finish();
                    return;
                } else if (i == 6) {
                    i();
                    return;
                } else {
                    LogUtil.j("HwBtDialogActivity", "cancelButtonFunction mDialogContent is unknown.");
                    return;
                }
            }
        }
        qzd.c(this.e).d(false);
        finish();
    }

    private void c(boolean z) {
        if (this.h == null) {
            LogUtil.j("HwBtDialogActivity", "showDeviceList mDeviceParameter is null.");
            return;
        }
        LogUtil.a("HwBtDialogActivity", "showDeviceList isBrTip: ", Boolean.valueOf(z));
        if (this.h.getBluetoothType() == 1 && z && this.f24636a.d(this.h.getNameFilter())) {
            LogUtil.a("HwBtDialogActivity", "showDeviceList has wanted BR device.");
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.pairing.HwBtDialogActivity"));
                intent.setFlags(268435456);
                Bundle bundle = new Bundle();
                bundle.putInt(TtmlNode.TAG_STYLE, 1);
                bundle.putInt("content", 4);
                bundle.putParcelable("device_parameter", this.h);
                intent.putExtras(bundle);
                this.e.startActivity(intent);
                return;
            } catch (ActivityNotFoundException e) {
                LogUtil.e("HwBtDialogActivity", "ActivityNotFoundException e:", e.getMessage());
                return;
            }
        }
        LogUtil.a("HwBtDialogActivity", "Clear device scan list.");
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.pairing.HwBtDialogActivity"));
        intent2.setFlags(268435456);
        Bundle bundle2 = new Bundle();
        bundle2.putInt(TtmlNode.TAG_STYLE, 3);
        bundle2.putParcelable("device_parameter", this.h);
        intent2.putExtras(bundle2);
        try {
            this.e.startActivity(intent2);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("HwBtDialogActivity", "start ActivityNotFoundException.");
        } catch (SecurityException unused2) {
            LogUtil.e("HwBtDialogActivity", "start BtDialogActivitySecurityException.");
        }
    }

    private void j() {
        View viewInflate = this.e.getSystemService("layout_inflater") instanceof LayoutInflater ? ((LayoutInflater) this.e.getSystemService("layout_inflater")).inflate(R.layout.dialog_listview, (ViewGroup) null) : null;
        this.f24638c = new CustomViewDialog.Builder(this);
        if (viewInflate != null) {
            this.p = (ListView) viewInflate.findViewById(R.id.device_list);
            this.o = (TextView) viewInflate.findViewById(R.id.title_listview_tv);
            this.g = new DeviceListAdapter(BaseApplication.getContext());
            HealthProgressBar healthProgressBar = (HealthProgressBar) viewInflate.findViewById(R.id.dialog_listview_loading);
            this.r = healthProgressBar;
            healthProgressBar.setLayerType(1, null);
            this.r.setVisibility(0);
            this.p.setAdapter((ListAdapter) this.g);
            this.p.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.device.activity.pairing.HwBtDialogActivity.5
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    HwBtDialogActivity.this.e(view, j);
                }
            });
            this.f24638c.c(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.HwBtDialogActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    HwBtDialogActivity.this.i();
                    HwBtDialogActivity.this.f24636a.d();
                }
            });
            this.f24638c.b(viewInflate, 0, 0);
            this.f24638c.b(false);
        }
        if (this.k.e(this)) {
            CustomViewDialog customViewDialogD = this.f24638c.d();
            this.f = customViewDialogD;
            if (customViewDialogD != null) {
                customViewDialogD.setCancelable(false);
                this.f.show();
            }
            this.k.i();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || strArr == null) {
            LogUtil.j("HwBtDialogActivity", "grant result grantResults or permissions is null.");
            return;
        }
        ltd.e().e(strArr, iArr);
        if (i != 1) {
            if (i != 20192) {
                LogUtil.j("HwBtDialogActivity", "onRequestPermissionsResult error.");
                return;
            } else if (this.k.e() && this.k.j()) {
                LogUtil.a("HwBtDialogActivity", "The location permission already exists and can continue scan.");
                e();
                return;
            } else {
                finish();
                return;
            }
        }
        if (iArr.length <= 0) {
            LogUtil.j("HwBtDialogActivity", "grantResults is null or length is incorrect.");
            return;
        }
        boolean z = iArr[0] == 0;
        LogUtil.a("HwBtDialogActivity", "grant isLocationEnable: ", Boolean.valueOf(z));
        if (z) {
            n();
        } else {
            finish();
            m();
        }
    }

    private void m() {
        LogUtil.a("HwBtDialogActivity", "Enter showPermissionDialog.");
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.pairing.HwBtDialogActivity"));
            intent.setFlags(268435456);
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_STYLE, 1);
            bundle.putInt("content", 6);
            bundle.putParcelable("device_parameter", this.h);
            intent.putExtras(bundle);
            this.e.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("HwBtDialogActivity", "ActivityNotFoundException e:", e.getMessage());
        }
    }

    private void e() {
        LogUtil.a("HwBtDialogActivity", "Enter continueScanDevices.");
        this.k.a(false);
        CustomViewDialog customViewDialogD = this.f24638c.d();
        this.f = customViewDialogD;
        if (customViewDialogD != null) {
            customViewDialogD.setCancelable(false);
            this.f.show();
        }
        this.k.i();
    }

    private void n() {
        CustomViewDialog.Builder builder;
        if (this.k.f()) {
            CustomViewDialog customViewDialog = this.f;
            if (customViewDialog == null) {
                LogUtil.j("HwBtDialogActivity", "setLocationEnable mCustomViewDialog is null");
            } else {
                LogUtil.a("HwBtDialogActivity", "setLocationEnable mCustomViewDialog isShowing: ", Boolean.valueOf(customViewDialog.isShowing()));
            }
            if (this.f == null && (builder = this.f24638c) != null) {
                this.f = builder.d();
            }
            CustomViewDialog customViewDialog2 = this.f;
            if (customViewDialog2 != null && !customViewDialog2.isShowing()) {
                this.f.setCancelable(false);
                this.f.show();
            }
            this.k.i();
            return;
        }
        finish();
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.k.a();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(View view, long j) {
        int iA = this.s.a();
        LogUtil.a("HwBtDialogActivity", "connectUserClickDevice userSelectProduct: ", Integer.valueOf(iA));
        if (iA == 11) {
            c(j, iA, -1);
            return;
        }
        String str = null;
        DeviceListAdapter.e eVar = view.getTag() instanceof DeviceListAdapter.e ? (DeviceListAdapter.e) view.getTag() : null;
        if (eVar != null && (eVar.f24600c.getText() instanceof String)) {
            str = (String) eVar.f24600c.getText();
        }
        int iC = lvi.c(str);
        LogUtil.a("HwBtDialogActivity", "connectUserClickDevice currentPairDeviceProductType: ", Integer.valueOf(iC));
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            if ((upperCase.contains("HUAWEI") || upperCase.contains("HONOR") || upperCase.contains("PORSCHE")) && ((iC == -1 || !lvi.d(iC, str)) && !CommonUtil.ca())) {
                o();
                return;
            }
        }
        this.s.b(str);
        c(j, iA, iC);
    }

    private void o() {
        CustomViewDialog customViewDialog = this.f;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            this.f.dismiss();
        }
        if (isFinishing() || isDestroyed()) {
            LogUtil.j("HwBtDialogActivity", "showNoSupportDevicePairDialog activity is destroy.");
            return;
        }
        View viewInflate = View.inflate(this, R.layout.commonui_no_support_device_pair_dialog, null);
        ((TextView) viewInflate.findViewById(R.id.dialog_message_title)).setText(getResources().getString(R.string.IDS_common_failed_content));
        ((TextView) viewInflate.findViewById(R.id.dialog_message_one)).setText(BaseApplication.getContext().getString(R.string.IDS_common_failed_content_one, 1));
        ((TextView) viewInflate.findViewById(R.id.dialog_message_two)).setText(BaseApplication.getContext().getString(R.string.IDS_common_failed_content_two, 2));
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this).a(getResources().getString(R.string.IDS_watchface_note)).d(viewInflate).a(getResources().getString(R.string.IDS_common_notification_know_tips), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.HwBtDialogActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HwBtDialogActivity.this.finish();
            }
        }).d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
    }

    private void c(long j, int i, int i2) {
        LogUtil.a("HwBtDialogActivity", "Enter startConnectClickDevice.");
        if (i != i2 && i2 != -1) {
            this.s.a(i2);
        }
        if (this.g.getCount() - 1 == j) {
            qpx.b(BaseApplication.getContext(), R.string.IDS_device_mgr_device_pair_guide_tips);
        } else {
            this.s.e(j, i, i2);
        }
        i();
        this.f24636a.d();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("HwBtDialogActivity", "BT_GPS onActivityResult requestCode:", Integer.valueOf(i), "resultCode:", Integer.valueOf(i2));
        if (i == 1) {
            LogUtil.a("HwBtDialogActivity", "BT_GPS showDeviceList 3");
            if (this.k.g()) {
                finish();
                LogUtil.a("HwBtDialogActivity", "BT_GPS open");
                qzd.c(this.e).d("");
                return;
            } else {
                finish();
                this.k.d(false);
                return;
            }
        }
        if (i == 2) {
            if (checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 && checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                finish();
                LogUtil.a("HwBtDialogActivity", "BT_GPS showDeviceList 4");
                c(true);
                return;
            } else {
                LogUtil.j("HwBtDialogActivity", "no permission.");
                finish();
                return;
            }
        }
        LogUtil.j("HwBtDialogActivity", "requestCode is other.");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("HwBtDialogActivity", "onDestroy");
        this.l.removeCallbacksAndMessages(null);
        CustomViewDialog customViewDialog = this.f;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            this.f.dismiss();
        }
        CommonUtil.d(BaseApplication.getContext());
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.i;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.i.dismiss();
        }
        if (this.f24637b != null) {
            try {
                LogUtil.a("HwBtDialogActivity", "onReceive unregisterReceiver.");
                unregisterReceiver(this.f24637b);
            } catch (IllegalArgumentException unused) {
                LogUtil.e("HwBtDialogActivity", "unregisterReceiver occur IllegalArgumentException.");
            }
        }
        if (this.d != null) {
            this.d = null;
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.n == 3) {
            qzd.c(this.e).d(false);
            finish();
        } else {
            i();
        }
        if (this.m == 3) {
            LogUtil.a("HwBtDialogActivity", "back cancel.");
            this.f24636a.d();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
