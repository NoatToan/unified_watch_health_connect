package com.huawei.ui.device.activity.pairing;

import android.R;
import android.app.AppOpsManager;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.phoneprocess.mgr.connectmgr.DeviceDialogMessage;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IBluetoothDialogAidlCallback;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.lmq;
import defpackage.lon;
import defpackage.ltd;
import defpackage.lug;
import defpackage.lvi;
import defpackage.qpx;
import defpackage.qyz;
import defpackage.rcv;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class BtDialogActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NoTitleCustomAlertDialog f24584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomViewDialog f24585b;
    private CustomViewDialog.Builder d;
    private DeviceListAdapter j;
    private boolean k;
    private HealthTextView m;
    private HealthProgressBar n;
    private ListView o;
    private String p;
    private qyz r;
    private c h = null;
    private int g = 0;
    private int i = 0;
    private Handler f = new e(this);
    private Context e = null;
    private boolean l = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f24586c = new a(this);

    static class a extends BroadcastReceiver {
        WeakReference<BtDialogActivity> d;

        a(BtDialogActivity btDialogActivity) {
            this.d = new WeakReference<>(btDialogActivity);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BtDialogActivity btDialogActivity = this.d.get();
            if (btDialogActivity == null) {
                LogUtil.j("BtDialogActivity", "onReceive activity is null.");
                return;
            }
            if (intent == null) {
                LogUtil.j("BtDialogActivity", "onReceive intent is null.");
                return;
            }
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter == null) {
                    LogUtil.j("BtDialogActivity", "onReceive mAdapter is null.");
                    return;
                }
                int state = defaultAdapter.getState();
                LogUtil.a("BtDialogActivity", "onReceive btSwitchState: ", Integer.valueOf(state));
                if (state == 12) {
                    btDialogActivity.z();
                    if (btDialogActivity.f24586c != null) {
                        try {
                            LogUtil.a("BtDialogActivity", "onReceive unregisterReceiver.");
                            context.unregisterReceiver(btDialogActivity.f24586c);
                            return;
                        } catch (IllegalArgumentException unused) {
                            LogUtil.e("BtDialogActivity", "onReceive unregisterReceiver IllegalArgumentException.");
                            return;
                        }
                    }
                    return;
                }
                LogUtil.j("BtDialogActivity", "onReceive btSwitchState default.");
            }
        }
    }

    static class c extends IBluetoothDialogAidlCallback.Stub {
        private final WeakReference<BtDialogActivity> e;

        private c(BtDialogActivity btDialogActivity) {
            this.e = new WeakReference<>(btDialogActivity);
        }

        @Override // com.huawei.hwservicesmgr.IBluetoothDialogAidlCallback
        public void onSetList(List<BluetoothDeviceNode> list, boolean z, int i) {
            LogUtil.a("BtDialogActivity", "enter onSetList.");
            BtDialogActivity btDialogActivity = this.e.get();
            if (btDialogActivity == null || btDialogActivity.j == null || btDialogActivity.f == null) {
                LogUtil.j("BtDialogActivity", "onSetList activity is null.");
                return;
            }
            if (!z) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 8;
                messageObtain.obj = list;
                messageObtain.arg1 = 0;
                btDialogActivity.f.sendMessage(messageObtain);
                return;
            }
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 8;
            messageObtain2.obj = list;
            messageObtain2.arg1 = 1;
            messageObtain2.arg2 = i;
            btDialogActivity.f.sendMessage(messageObtain2);
        }

        @Override // com.huawei.hwservicesmgr.IBluetoothDialogAidlCallback
        public void onScanFinished() {
            LogUtil.a("BtDialogActivity", "enter onScanFinished.");
            BtDialogActivity btDialogActivity = this.e.get();
            if (btDialogActivity != null && btDialogActivity.f != null) {
                btDialogActivity.f.sendEmptyMessage(10);
            } else {
                LogUtil.j("BtDialogActivity", "onScanFinished activity is null.");
            }
        }

        @Override // com.huawei.hwservicesmgr.IBluetoothDialogAidlCallback
        public void onSetNameFilter(List list) {
            LogUtil.a("BtDialogActivity", "enter onSetNameFilter.");
            BtDialogActivity btDialogActivity = this.e.get();
            if (btDialogActivity == null || btDialogActivity.j == null || list == null) {
                LogUtil.j("BtDialogActivity", "onSetNameFilter activity is null.");
            } else {
                LogUtil.a("BtDialogActivity", "onSetNameFilter nameFilter: ", list.toString());
                btDialogActivity.j.d(list);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "onCreate");
        this.e = BaseApplication.getContext();
        this.r = new qyz();
        this.h = new c();
        Window window = getWindow();
        window.setGravity(80);
        window.clearFlags(2);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        n();
    }

    private void n() {
        if (DevicePairGuideUtil.b() != null) {
            t();
        } else {
            ThreadPoolManager.c().a("BtDialogActivity", new Runnable() { // from class: com.huawei.ui.device.activity.pairing.BtDialogActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("BtDialogActivity", "SCALE_SHARE_HARMONY_TIPS getValue.");
                    String strD = lon.c().d("scale_share_harmony_tips");
                    DevicePairGuideUtil.e(strD);
                    LogUtil.a("BtDialogActivity", "SCALE_SHARE_HARMONY_TIPS: ", strD);
                    BtDialogActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.pairing.BtDialogActivity.2.3
                        @Override // java.lang.Runnable
                        public void run() {
                            BtDialogActivity.this.t();
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "initView intent is null.");
            return;
        }
        int intExtra = intent.getIntExtra(TtmlNode.TAG_STYLE, 0);
        this.g = intExtra;
        LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "initView style: ", Integer.valueOf(intExtra), ";content: ", Integer.valueOf(intent.getIntExtra("content", 0)));
        this.p = intent.getStringExtra("hichain_late_intent_key");
        int i = this.g;
        if (i == 1) {
            this.i = intent.getIntExtra("content", 0);
            p();
        } else if (i == 3) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                LogUtil.j("BtDialogActivity", "initView mAdapter is null.");
            } else {
                LogUtil.a("BtDialogActivity", "initView mAdapter is not null.");
                if (!defaultAdapter.isEnabled()) {
                    LogUtil.a("BtDialogActivity", "initView mAdapter closed.");
                    BroadcastManagerUtil.a(this.e, this.f24586c, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                }
            }
            a(intent.getIntExtra(DeviceCategoryFragment.DEVICE_TYPE, -1));
        } else {
            LogUtil.j("BtDialogActivity", "initView mDialogStyle is unknown.");
        }
        setFinishOnTouchOutside(false);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = defaultDisplay.getWidth();
        getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("BtDialogActivity", "confirmButtonFunction mDialogContent: ", Integer.valueOf(this.i));
        switch (this.i) {
            case 1:
                startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1);
                break;
            case 2:
                startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1);
                break;
            case 3:
                e(true);
                finish();
                break;
            case 4:
                f();
                this.r.d(true);
                finish();
                break;
            case 5:
                a(false);
                finish();
                break;
            case 6:
                LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "confirmButtonFunction go to application set.");
                startActivityForResult(new Intent("android.settings.SETTINGS"), 2);
                break;
            case 7:
                a(this.p);
                break;
            default:
                LogUtil.j("BtDialogActivity", "confirmButtonFunction mDialogContent is unknown.");
                break;
        }
    }

    private void a(String str) {
        int iIndexOf;
        LogUtil.a("BtDialogActivity", 0, "BtDialogActivity", "Enter unbindDevice.");
        if (str == null) {
            LogUtil.j("BtDialogActivity", "unbindDevice bindMacAddress is empty.");
            return;
        }
        List<DeviceInfo> listI = rcv.a(this.e).i();
        if (listI == null || listI.size() == 0) {
            LogUtil.j("BtDialogActivity", "unbindDevice list is empty.");
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
            LogUtil.j("BtDialogActivity", "unbindDevice index is invalid.");
            return;
        }
        listI.remove(iIndexOf);
        LogUtil.a("BtDialogActivity", "unbindDevice deleteDevice.");
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(str);
        rcv.a(this.e).b((List<String>) arrayList, true);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null) {
                LogUtil.j("BtDialogActivity", "enableBluetoothSwitch adapter is null.");
            } else {
                if (defaultAdapter.isEnabled()) {
                    return;
                }
                LogUtil.a("BtDialogActivity", "enableBluetoothSwitch bluetooth switch is close.");
                LogUtil.a("BtDialogActivity", "enableBluetoothSwitch bluetooth switch isEnable: ", Boolean.valueOf(defaultAdapter.enable()));
            }
        } catch (SecurityException e2) {
            LogUtil.e("BtDialogActivity", "enableBluetoothSwitch SecurityException:", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        switch (this.i) {
            case 1:
            case 3:
                e(false);
                finish();
                break;
            case 2:
                l();
                break;
            case 4:
                a(false);
                finish();
                break;
            case 5:
                l();
                break;
            case 6:
                l();
                break;
            default:
                LogUtil.j("BtDialogActivity", "cancelButtonFunction mDialogContent is unknown.");
                break;
        }
    }

    private void p() {
        String string = getString(R.string.ok);
        String string2 = getString(R.string.cancel);
        int i = this.i;
        if (i == 1 || i == 2) {
            string = getString(com.huawei.ui.commonui.R.string.IDS_common_enable_button);
        } else if (i == 4) {
            string2 = getString(com.huawei.ui.commonui.R.string.IDS_btsdk_confirm_repair);
            string = getString(com.huawei.ui.commonui.R.string.IDS_btsdk_confirm_connect);
        } else if (i == 5) {
            string = getString(com.huawei.ui.commonui.R.string.IDS_btsdk_confirm_connect);
        } else if (i == 6) {
            string = getString(com.huawei.ui.commonui.R.string.IDS_settings_button_ok);
        } else if (i == 7) {
            string = getString(com.huawei.ui.commonui.R.string.IDS_kn_lost_ok);
            string2 = null;
        } else {
            LogUtil.j("BtDialogActivity", "initConfirmDialog mDialogContent is unknown.");
        }
        String strQ = q();
        i();
        e(string, string2, strQ);
    }

    private String q() {
        switch (this.i) {
            case 1:
                if ("on".equals(DevicePairGuideUtil.b())) {
                    return getString(com.huawei.ui.commonui.R.string.IDS_btsdk_turn_on_location_BT_harmony);
                }
                return getString(com.huawei.ui.commonui.R.string.IDS_btsdk_turn_on_location_BT);
            case 2:
                if ("on".equals(DevicePairGuideUtil.b())) {
                    return getString(com.huawei.ui.commonui.R.string.IDS_btsdk_turn_on_location_harmony);
                }
                return getString(com.huawei.ui.commonui.R.string.IDS_btsdk_turn_on_location);
            case 3:
                return getString(com.huawei.ui.commonui.R.string.IDS_btsdk_turn_on_BT);
            case 4:
                return String.format(Locale.ENGLISH, getResources().getString(com.huawei.ui.commonui.R.string.IDS_btsdk_confirm_connected_content), m());
            case 5:
                String strO = o();
                return String.format(Locale.ENGLISH, getResources().getString(com.huawei.ui.commonui.R.string.IDS_btsdk_confirm_reconnect_content), strO, strO);
            case 6:
                return getString(com.huawei.ui.commonui.R.string.IDS_btsdk_get_loacation_permiassion_health);
            case 7:
                return getString(com.huawei.ui.commonui.R.string.IDS_kn_lost_content);
            default:
                LogUtil.j("BtDialogActivity", "getTipText mDialogContent is unknown.");
                return "";
        }
    }

    private void e(String str, String str2, String str3) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(str3).a(str, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.BtDialogActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BtDialogActivity.this.j();
            }
        }).d(str2, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.BtDialogActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BtDialogActivity.this.a();
            }
        }).c();
        this.f24584a = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        this.f24584a.setCancelable(false);
        this.f24584a.show();
    }

    private void a(int i) {
        LayoutInflater layoutInflater = this.e.getSystemService("layout_inflater") instanceof LayoutInflater ? (LayoutInflater) this.e.getSystemService("layout_inflater") : null;
        if (layoutInflater != null) {
            View viewInflate = layoutInflater.inflate(com.huawei.hwbtsdk.R.layout.dialog_listview, (ViewGroup) null);
            this.d = new CustomViewDialog.Builder(this);
            if (viewInflate != null) {
                this.o = (ListView) viewInflate.findViewById(com.huawei.hwbtsdk.R.id.device_list);
                this.m = (HealthTextView) viewInflate.findViewById(com.huawei.hwbtsdk.R.id.title_listview_tv);
                this.j = new DeviceListAdapter(BaseApplication.getContext());
                HealthProgressBar healthProgressBar = (HealthProgressBar) viewInflate.findViewById(com.huawei.ui.commonui.R.id.dialog_listview_loading);
                this.n = healthProgressBar;
                healthProgressBar.setLayerType(1, null);
                this.n.setVisibility(0);
                this.o.setAdapter((ListAdapter) this.j);
                d(this.h);
                this.o.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.device.activity.pairing.BtDialogActivity.3
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                        BtDialogActivity.this.b(view, j);
                    }
                });
                this.d.c(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.BtDialogActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        BtDialogActivity.this.l();
                        BtDialogActivity.this.d();
                    }
                });
                this.d.b(viewInflate, 0, 0);
                this.d.b(false);
            }
            if (e(i)) {
                CustomViewDialog customViewDialogD = this.d.d();
                this.f24585b = customViewDialogD;
                if (customViewDialogD != null) {
                    customViewDialogD.setCancelable(false);
                    this.f24585b.show();
                }
                z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, long j) {
        int iA = this.r.a();
        LogUtil.a("BtDialogActivity", "connectUserClickDevice userSelectProduct :", Integer.valueOf(iA));
        if (iA == 11) {
            b(j, iA, -1);
            return;
        }
        DeviceListAdapter.e eVar = view.getTag() instanceof DeviceListAdapter.e ? (DeviceListAdapter.e) view.getTag() : null;
        if (eVar != null) {
            String string = eVar.f24600c.getText().toString();
            int iC = lvi.c(string);
            LogUtil.a("BtDialogActivity", "connectUserClickDevice currentPairDeviceProductType :", Integer.valueOf(iC));
            String upperCase = string.toUpperCase(Locale.ENGLISH);
            if ((upperCase.contains("HUAWEI") || upperCase.contains("HONOR") || upperCase.contains("PORSCHE")) && ((iC == -1 || !lvi.d(iC, string)) && !CommonUtil.ca())) {
                w();
            } else {
                this.r.b(string);
                b(j, iA, iC);
            }
        }
    }

    private void b(long j, int i, int i2) {
        LogUtil.a("BtDialogActivity", "Enter startConnectClickDevice.");
        if (i != i2 && i2 != -1) {
            this.r.a(i2);
        }
        if (this.j.getCount() - 1 == j) {
            qpx.b(BaseApplication.getContext(), com.huawei.ui.commonui.R.string.IDS_device_mgr_device_pair_guide_tips);
        } else {
            this.r.e(j, i, i2);
        }
        l();
        d();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "onActivityResult requestCode: ", Integer.valueOf(i), " ,resultCode: ", Integer.valueOf(i2));
        if (i == 1) {
            if (v() || CommonUtil.bg()) {
                finish();
                LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "onActivityResult showDeviceList 3");
                e(true);
            } else {
                finish();
                e(false);
            }
        } else if (i != 2) {
            LogUtil.j("BtDialogActivity", "onActivityResult requestCode is other.");
        } else if (checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0 || checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            LogUtil.j("BtDialogActivity", "onActivityResult no permission.");
            finish();
        } else {
            finish();
            LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "onActivityResult showDeviceList 4");
            a(true);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("BtDialogActivity", "Enter onDestroy.");
        this.f.removeCallbacksAndMessages(null);
        CustomViewDialog customViewDialog = this.f24585b;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            this.f24585b.dismiss();
        }
        CommonUtil.d(BaseApplication.getContext());
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f24584a;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.f24584a.dismiss();
        }
        if (this.f24586c != null) {
            try {
                LogUtil.a("BtDialogActivity", "onDestroy onReceive unregisterReceiver");
                unregisterReceiver(this.f24586c);
            } catch (IllegalArgumentException unused) {
                LogUtil.e("BtDialogActivity", "onDestroy unregisterReceiver occur IllegalArgumentException.");
            }
        }
        if (this.h != null) {
            this.h = null;
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.i == 3) {
            e(false);
            finish();
        } else {
            l();
        }
        if (this.g == 3) {
            LogUtil.a("BtDialogActivity", "onBackPressed back cancel.");
            b();
        }
    }

    class e extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<BtDialogActivity> f24592c;

        e(BtDialogActivity btDialogActivity) {
            this.f24592c = new WeakReference<>(btDialogActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            BtDialogActivity btDialogActivity = this.f24592c.get();
            if (btDialogActivity == null) {
                LogUtil.j("BtDialogActivity", "handleMessage activity is null.");
            }
            if (message == null) {
                LogUtil.j("BtDialogActivity", "handleMessage msg is null.");
                return;
            }
            LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "handleMessage receive msg : ", Integer.valueOf(message.what));
            switch (message.what) {
                case 8:
                    if (message.arg1 == 0 && (message.obj instanceof List)) {
                        BtDialogActivity.this.j.a((List<BluetoothDeviceNode>) message.obj);
                    } else if (message.arg1 == 1 && (message.obj instanceof List)) {
                        BtDialogActivity.this.j.e((List) message.obj, message.arg2);
                    } else {
                        LogUtil.a("BtDialogActivity", "handleMessage set list branch");
                    }
                    break;
                case 9:
                    BtDialogActivity.k();
                    break;
                case 10:
                    if (!btDialogActivity.isFinishing()) {
                        btDialogActivity.n.setVisibility(8);
                        if (btDialogActivity.m != null) {
                            btDialogActivity.m.setText(com.huawei.ui.commonui.R.string.IDS_device_mgr_device_scan_completed_title);
                        }
                    }
                    break;
                default:
                    LogUtil.j("BtDialogActivity", "MyHandler handleMessage is error.");
                    break;
            }
        }
    }

    private boolean e(int i) {
        this.k = true;
        if (i != 2 && i != 1 && i != 5) {
            return false;
        }
        if (!r()) {
            if (i == 1 && CommonUtil.bg() && !PermissionUtil.a()) {
                return true;
            }
            s();
        }
        return this.k;
    }

    private void s() {
        e();
        this.l = true;
        this.k = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (isFinishing()) {
            return;
        }
        PermissionUtil.d(this, PermissionUtil.PermissionType.LOCATION, new CustomPermissionAction(this) { // from class: com.huawei.ui.device.activity.pairing.BtDialogActivity.8
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("BtDialogActivity", "applyLocationPermission onGranted permission allowed.");
                BtDialogActivity.this.k = true;
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                super.onDenied(str);
                BtDialogActivity.this.e();
                BtDialogActivity.this.k = false;
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                if (!BtDialogActivity.this.isFinishing()) {
                    super.onForeverDenied(permissionType, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.BtDialogActivity.8.4
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            BtDialogActivity.this.finish();
                        }
                    }, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.BtDialogActivity.8.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            BtDialogActivity.this.finish();
                        }
                    });
                }
                BtDialogActivity.this.k = false;
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || strArr == null) {
            LogUtil.j(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "grant result grantResults or permissions is null");
            return;
        }
        ltd.e().e(strArr, iArr);
        if (i != 1) {
            if (i == 20192) {
                if (r() && this.l) {
                    LogUtil.a("BtDialogActivity", "The location permission already exists and can continue scan.");
                    g();
                    return;
                } else {
                    finish();
                    return;
                }
            }
            LogUtil.j("BtDialogActivity", "onRequestPermissionsResult error.");
            return;
        }
        if (iArr.length > 0) {
            boolean z = iArr[0] == 0;
            LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "grant result: ", Boolean.valueOf(z));
            if (z) {
                u();
                return;
            } else {
                finish();
                y();
                return;
            }
        }
        LogUtil.j(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "grantResults is null or length is incorrect.");
    }

    private void g() {
        LogUtil.a("BtDialogActivity", "Enter continueScanDevices.");
        this.l = false;
        CustomViewDialog customViewDialogD = this.d.d();
        this.f24585b = customViewDialogD;
        if (customViewDialogD != null) {
            customViewDialogD.setCancelable(false);
            this.f24585b.show();
        }
        z();
    }

    private void u() {
        CustomViewDialog.Builder builder;
        if (x()) {
            CustomViewDialog customViewDialog = this.f24585b;
            if (customViewDialog == null) {
                LogUtil.j("BtDialogActivity", "setLocationEnable mCustomViewDialog is null");
            } else {
                LogUtil.a("BtDialogActivity", "setLocationEnable mCustomViewDialog isShowing: ", Boolean.valueOf(customViewDialog.isShowing()));
            }
            if (this.f24585b == null && (builder = this.d) != null) {
                this.f24585b = builder.d();
            }
            CustomViewDialog customViewDialog2 = this.f24585b;
            if (customViewDialog2 != null && !customViewDialog2.isShowing()) {
                this.f24585b.setCancelable(false);
                this.f24585b.show();
            }
            z();
            return;
        }
        finish();
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        h();
        finish();
    }

    private boolean x() {
        int iCheckOp = ((AppOpsManager) getSystemService("appops")).checkOp("android:coarse_location", Process.myUid(), getPackageName());
        LogUtil.a("BtDialogActivity", "isLocationEnable checkOp: ", Integer.valueOf(iCheckOp));
        boolean z = iCheckOp == 0;
        LogUtil.a("BtDialogActivity", "isLocationEnable res:", Boolean.valueOf(z), "0：allowed other：no permission.");
        return z;
    }

    private boolean r() {
        return PermissionUtil.b(this.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
    }

    private boolean v() {
        boolean zIsProviderEnabled;
        boolean zIsProviderEnabled2;
        LocationManager locationManager = getSystemService("location") instanceof LocationManager ? (LocationManager) getSystemService("location") : null;
        if (locationManager != null) {
            zIsProviderEnabled2 = locationManager.isProviderEnabled(GeocodeSearch.GPS);
            LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "isGpsLocationEnable isGpsEnable: ", Boolean.valueOf(zIsProviderEnabled2));
            if (lmq.e() || lmq.c()) {
                return zIsProviderEnabled2;
            }
            zIsProviderEnabled = locationManager.isProviderEnabled("network");
            LogUtil.a(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtDialogActivity", "isGpsLocationEnable isNetWorkEnable: ", Boolean.valueOf(zIsProviderEnabled));
        } else {
            zIsProviderEnabled = true;
            zIsProviderEnabled2 = true;
        }
        return zIsProviderEnabled2 || zIsProviderEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("BtDialogActivity", "Enter cancelScanDevice.");
        b();
    }

    private void i() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f24584a;
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            return;
        }
        this.f24584a.dismiss();
    }

    private void b() {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.j("BtDialogActivity", "cancelBluetoothDeviceDiscovery binder is null.");
            return;
        }
        try {
            DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
            deviceDialogMessage.setMethod(10003);
            deviceDialogMessage.setIsStatusFlag(false);
            deviceDialogMessage.setSelectId(0L);
            deviceDialogMessage.setDeviceName(null);
            iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
        } catch (RemoteException unused) {
            LogUtil.e("BtDialogActivity", "cancelBluetoothDeviceDiscovery RemoteException.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.j("BtDialogActivity", "startScanDevices binder is null.");
            return;
        }
        try {
            DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
            deviceDialogMessage.setMethod(10004);
            deviceDialogMessage.setIsStatusFlag(false);
            deviceDialogMessage.setSelectId(0L);
            deviceDialogMessage.setDeviceName(null);
            iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
        } catch (RemoteException unused) {
            LogUtil.e("BtDialogActivity", "startScanDevices RemoteException.");
        }
    }

    private void e(boolean z) {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.j("BtDialogActivity", "dialogEnableBluetoothSwitch binder is null.");
            return;
        }
        try {
            DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
            deviceDialogMessage.setMethod(10006);
            deviceDialogMessage.setIsStatusFlag(z);
            deviceDialogMessage.setSelectId(0L);
            deviceDialogMessage.setDeviceName(null);
            iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
        } catch (RemoteException unused) {
            LogUtil.e("BtDialogActivity", "dialogEnableBluetoothSwitch RemoteException");
        }
    }

    private void f() {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.j("BtDialogActivity", "connectHfpConnectedDevice binder is null.");
            return;
        }
        try {
            DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
            deviceDialogMessage.setMethod(10001);
            deviceDialogMessage.setIsStatusFlag(false);
            deviceDialogMessage.setSelectId(0L);
            deviceDialogMessage.setDeviceName(null);
            iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
        } catch (RemoteException unused) {
            LogUtil.e("BtDialogActivity", "connectHfpConnectedDevice RemoteException.");
        }
    }

    private void a(boolean z) {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.j("BtDialogActivity", "showDeviceList binder is null.");
            return;
        }
        try {
            DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
            deviceDialogMessage.setMethod(10002);
            deviceDialogMessage.setIsStatusFlag(z);
            deviceDialogMessage.setSelectId(0L);
            deviceDialogMessage.setDeviceName(null);
            iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
        } catch (RemoteException unused) {
            LogUtil.e("BtDialogActivity", "showDeviceList RemoteException.");
        }
    }

    private String m() {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.j("BtDialogActivity", "getHfpConnectedDeviceName binder is null.");
            return "";
        }
        try {
            DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
            deviceDialogMessage.setMethod(10007);
            deviceDialogMessage.setIsStatusFlag(false);
            deviceDialogMessage.setSelectId(0L);
            deviceDialogMessage.setDeviceName(null);
            return iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
        } catch (RemoteException unused) {
            LogUtil.e("BtDialogActivity", "getHfpConnectedDeviceName RemoteException.");
            return "";
        }
    }

    private String o() {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.j("BtDialogActivity", "getAddDeviceName binder is null.");
            return "";
        }
        try {
            DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
            deviceDialogMessage.setMethod(10008);
            deviceDialogMessage.setIsStatusFlag(false);
            deviceDialogMessage.setSelectId(0L);
            deviceDialogMessage.setDeviceName(null);
            return iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
        } catch (RemoteException unused) {
            LogUtil.e("BtDialogActivity", "getAddDeviceName RemoteException.");
            return "";
        }
    }

    private void y() {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.j("BtDialogActivity", "showPermissionDialog binder is null.");
            return;
        }
        try {
            DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
            deviceDialogMessage.setMethod(10015);
            deviceDialogMessage.setIsStatusFlag(false);
            deviceDialogMessage.setSelectId(0L);
            deviceDialogMessage.setDeviceName(null);
            iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
        } catch (RemoteException unused) {
            LogUtil.e("BtDialogActivity", "showPermissionDialog RemoteException.");
        }
    }

    private void h() {
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.j("BtDialogActivity", "dialogEnableScan binder is null.");
            return;
        }
        try {
            DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
            deviceDialogMessage.setMethod(10016);
            deviceDialogMessage.setIsStatusFlag(false);
            deviceDialogMessage.setSelectId(0L);
            deviceDialogMessage.setDeviceName(null);
            iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
        } catch (RemoteException unused) {
            LogUtil.e("BtDialogActivity", "dialogEnableScan RemoteException.");
        }
    }

    private void d(c cVar) {
        if (cVar instanceof IBluetoothDialogAidlCallback) {
            IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
            if (iWearPhoneServiceAIDLC == null) {
                LogUtil.j("BtDialogActivity", "registerCallback binder is null.");
                return;
            }
            try {
                DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
                deviceDialogMessage.setMethod(PrebakedEffectId.RT_DRAWING_ARROW);
                deviceDialogMessage.setIsStatusFlag(false);
                deviceDialogMessage.setSelectId(0L);
                deviceDialogMessage.setDeviceName(null);
                iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, cVar);
            } catch (RemoteException unused) {
                LogUtil.e("BtDialogActivity", "registerCallback RemoteException.");
            }
        }
    }

    private void w() {
        CustomViewDialog customViewDialog = this.f24585b;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            this.f24585b.dismiss();
        }
        if (isFinishing() || isDestroyed()) {
            LogUtil.j("BtDialogActivity", "showNoSupportDevicePairDialog activity is destroy.");
            return;
        }
        View viewInflate = View.inflate(this, com.huawei.ui.commonui.R.layout.commonui_no_support_device_pair_dialog, null);
        ((HealthTextView) viewInflate.findViewById(com.huawei.ui.commonui.R.id.dialog_message_title)).setText(getResources().getString(com.huawei.ui.commonui.R.string.IDS_common_failed_content));
        ((HealthTextView) viewInflate.findViewById(com.huawei.ui.commonui.R.id.dialog_message_one)).setText(BaseApplication.getContext().getString(com.huawei.ui.commonui.R.string.IDS_common_failed_content_one, 1));
        ((HealthTextView) viewInflate.findViewById(com.huawei.ui.commonui.R.id.dialog_message_two)).setText(BaseApplication.getContext().getString(com.huawei.ui.commonui.R.string.IDS_common_failed_content_two, 2));
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(this).a(getResources().getString(com.huawei.ui.commonui.R.string.IDS_watchface_note)).d(viewInflate).a(getResources().getString(com.huawei.ui.commonui.R.string.IDS_common_notification_know_tips), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.BtDialogActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BtDialogActivity.this.finish();
            }
        }).d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
