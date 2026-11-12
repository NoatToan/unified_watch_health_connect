package com.huawei.ui.device.activity.autoscandevice;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.datatype.GoogleDeviceCache;
import com.huawei.devicepair.model.StartPairOption;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import defpackage.cjk;
import defpackage.coi;
import defpackage.cqp;
import defpackage.eds;
import defpackage.lmf;
import defpackage.lof;
import defpackage.lsg;
import defpackage.ltd;
import defpackage.lvi;
import defpackage.lzi;
import defpackage.njy;
import defpackage.qql;
import defpackage.qtv;
import defpackage.rcv;
import defpackage.rcw;
import defpackage.rdp;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class BtAutoScanActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f24245a = {"android.permission.READ_PHONE_STATE"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthCheckBox f24247c;
    private CustomAlertDialog.Builder d;
    private CustomAlertDialog e;
    private GalleryAdapter f;
    private rcv h;
    private String j;
    private HealthRecycleView k;
    private int m;
    private GuideInteractors o;
    private int l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<BluetoothDevice> f24246b = new ArrayList<>(16);
    private HashMap<String, Integer> n = new HashMap<>(0);
    private int t = 0;
    private String g = null;
    private String i = null;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("BtAutoScanActivity", "onCreate");
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        onWindowAttributesChanged(attributes);
        this.h = rcv.a(this);
        this.o = new GuideInteractors(getApplicationContext());
        d();
        overridePendingTransition(R.anim.push_activity_in, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        LogUtil.a("BtAutoScanActivity", "initViewTahiti");
    }

    private void d() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("BtAutoScanActivity", "initView intent is null.");
            return;
        }
        this.l = intent.getIntExtra(TtmlNode.TAG_STYLE, 0);
        if (intent.getSerializableExtra("DEVICE_SCAN_LIST") instanceof ArrayList) {
            this.f24246b = (ArrayList) intent.getSerializableExtra("DEVICE_SCAN_LIST");
        }
        try {
            this.f24246b = intent.getParcelableArrayListExtra("bluetooth_list");
        } catch (ArrayIndexOutOfBoundsException e) {
            LogUtil.e("BtAutoScanActivity", "initView ArrayIndexOutOfBoundsException is ", e.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            LogUtil.e("BtAutoScanActivity", "initView IndexOutOfBoundsException message is ", e2.getMessage());
        }
        if (intent.getSerializableExtra("device_rssi_map") instanceof HashMap) {
            this.n = (HashMap) intent.getSerializableExtra("device_rssi_map");
        }
        LogUtil.a("BtAutoScanActivity", "style: ", Integer.valueOf(this.l), " content: ", Integer.valueOf(intent.getIntExtra(TtmlNode.TAG_STYLE, 0)));
        if (this.l != 1) {
            LogUtil.j("BtAutoScanActivity", "initView default");
        } else {
            e();
        }
        setFinishOnTouchOutside(false);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = defaultDisplay.getWidth();
        getWindow().setAttributes(attributes);
    }

    private void e() {
        LogUtil.a("BtAutoScanActivity", "mBtDeviceList is ", this.f24246b);
        LayoutInflater layoutInflater = getSystemService("layout_inflater") instanceof LayoutInflater ? (LayoutInflater) getSystemService("layout_inflater") : null;
        if (layoutInflater != null) {
            View viewInflate = layoutInflater.inflate(R.layout.dialog_auto_listview, (ViewGroup) null);
            this.d = new CustomAlertDialog.Builder(this);
            if (viewInflate == null) {
                LogUtil.j("BtAutoScanActivity", "initDeviceListDialog view is null.");
                return;
            }
            this.k = (HealthRecycleView) viewInflate.findViewById(R.id.device_list);
            this.f24247c = (HealthCheckBox) viewInflate.findViewById(R.id.agree_checkbox);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setOrientation(0);
            this.k.setLayoutManager(linearLayoutManager);
            this.k.b(false);
            this.k.e(false);
            this.f24247c.setChecked(this.o.d());
            GalleryAdapter galleryAdapter = new GalleryAdapter(BaseApplication.getContext(), this.f24246b);
            this.f = galleryAdapter;
            this.k.setAdapter(galleryAdapter);
            this.f.b(new GalleryAdapter.OnItemClickListener() { // from class: com.huawei.ui.device.activity.autoscandevice.BtAutoScanActivity.3
                @Override // com.huawei.ui.device.activity.autoscandevice.GalleryAdapter.OnItemClickListener
                public void onClick(int i) {
                    BtAutoScanActivity.this.t = i;
                }
            });
            this.f24247c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.autoscandevice.BtAutoScanActivity.1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        BtAutoScanActivity.this.o.d(true);
                    } else {
                        BtAutoScanActivity.this.o.d(false);
                    }
                }
            });
            d(viewInflate);
        }
    }

    private void d(View view) {
        this.d.a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.autoscandevice.BtAutoScanActivity.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                BtAutoScanActivity.this.finish();
                BtAutoScanActivity.this.overridePendingTransition(0, R.anim.push_activity_out);
            }
        });
        this.d.d(R.string.IDS_blite_guide_title, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.autoscandevice.BtAutoScanActivity.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (BtAutoScanActivity.this.t < BtAutoScanActivity.this.f24246b.size()) {
                    rcw.b(BaseApplication.getContext()).g(((BluetoothDevice) BtAutoScanActivity.this.f24246b.get(BtAutoScanActivity.this.t)).getAddress());
                    LogUtil.a("BtAutoScanActivity", "start Pair mSelectPosition is ", Integer.valueOf(BtAutoScanActivity.this.t));
                    BtAutoScanActivity btAutoScanActivity = BtAutoScanActivity.this;
                    btAutoScanActivity.d(btAutoScanActivity.t);
                }
            }
        });
        this.d.a(view);
        CustomAlertDialog customAlertDialogB = this.d.b();
        this.e = customAlertDialogB;
        if (customAlertDialogB != null) {
            customAlertDialogB.setCancelable(false);
            this.e.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (i < 0 || this.f24246b.size() <= 0) {
            return;
        }
        try {
            this.g = this.f24246b.get(i).getAddress();
            String name = this.f24246b.get(i).getName();
            this.i = name;
            if (name == null) {
                LogUtil.j("BtAutoScanActivity", "startConnectDevice mDeviceName is null.");
                finish();
                return;
            }
            if (!NotificationContentProviderUtil.b()) {
                LogUtil.a("BtAutoScanActivity", "CommonConstants.NOTIFICATION_INITIALIZE");
                if (lzi.a().d()) {
                    NotificationContentProviderUtil.c(1);
                } else {
                    NotificationContentProviderUtil.c(0);
                }
            }
            this.m = rcv.b(this.i);
            String strD = this.h.d(rcv.b(this.i));
            this.j = strD;
            b(this.m, strD, i);
        } catch (SecurityException e) {
            LogUtil.e("BtAutoScanActivity", "startConnectDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void b(int i, String str, int i2) {
        LogUtil.a("BtAutoScanActivity", "preEnterDevicePairActivity deviceType: ", Integer.valueOf(i), "deviceName: ", str);
        if (!d(i, str, i2)) {
            LogUtil.j("BtAutoScanActivity", "preEnterDevicePairActivity permission has not.");
        } else {
            e(i, str, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str, int i2) {
        int iIntValue;
        LogUtil.a("BtAutoScanActivity", "enterDevicePairGuide deviceType: ", Integer.valueOf(i), "deviceName: ", str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010049.value(), new HashMap(16), 0);
        try {
            if (lvi.i(i)) {
                GoogleDeviceCache.QrBleCache qrBleCache = new GoogleDeviceCache.QrBleCache();
                if (i2 >= 0 && i2 < this.f24246b.size()) {
                    BluetoothDevice bluetoothDevice = this.f24246b.get(i2);
                    HashMap<String, Integer> map = this.n;
                    if (map != null) {
                        LogUtil.a("BtAutoScanActivity", "enterDevicePairGuide mRssiMap:", map);
                        iIntValue = this.n.get(bluetoothDevice.getName()).intValue();
                    } else {
                        iIntValue = -1;
                    }
                    qrBleCache.setBluetoothDevice(bluetoothDevice);
                    qrBleCache.setRssi(iIntValue);
                    qrBleCache.setTime(System.currentTimeMillis());
                    GoogleDeviceCache.getInstance().saveCache(qrBleCache);
                    if (qql.e()) {
                        qql.a(this);
                        return;
                    } else {
                        qql.b(this, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.autoscandevice.BtAutoScanActivity.2
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                LogUtil.a("BtAutoScanActivity", "uninstallShowDialog negative.");
                            }
                        }, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.autoscandevice.BtAutoScanActivity.6
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                LogUtil.a("BtAutoScanActivity", "uninstallShowDialog positive");
                            }
                        });
                        return;
                    }
                }
                return;
            }
            b();
        } catch (SecurityException e) {
            LogUtil.e("BtAutoScanActivity", "enterDevicePairGuide SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void b() {
        if (rdp.a(this, 2) && this.m != 75) {
            coi.b().e(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.g));
            rdp.d(this.g, this, 2, new View.OnClickListener() { // from class: quj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f46875b.b(view);
                }
            });
            return;
        }
        a(this.m, this.j);
    }

    public /* synthetic */ void b(View view) {
        a(this.m, this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        LogUtil.a("BtAutoScanActivity", "jumpToPairPage mDeviceName: ", this.i);
        List<eds> deviceInfoByBluetooth = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceInfoByBluetooth(this.i);
        if (njy.e(deviceInfoByBluetooth) || deviceInfoByBluetooth.get(0) == null) {
            LogUtil.j("BtAutoScanActivity", "jumpToPairPage infoBeanList is empty");
            finish();
        } else {
            c(deviceInfoByBluetooth, i, str);
        }
    }

    private void c(List<eds> list, int i, String str) {
        List<String> listAa = list.get(0).aa();
        String strS = list.get(0).s();
        if (cjk.d().isSupportH5Pair(this.i)) {
            cjk.d().startPair(this, StartPairOption.builder().c(this.g).d(listAa).d(this.i).a("wear_watch").e(false).a());
            finish();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) DevicePairGuideActivity.class);
        if (listAa instanceof ArrayList) {
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) listAa);
        }
        intent.putExtra("kind_id", strS);
        intent.putExtra("pairGuideProductType", i);
        intent.putExtra("pairGuideProductName", str);
        intent.putExtra("pairGuideFromScanList", true);
        intent.putExtra("pairGuideSelectName", this.i);
        intent.putExtra("pairGuideSelectAddress", this.g);
        intent.putExtra("isHeartRateDevice", 0);
        intent.putExtra("DOWNLOAD_RESOURCE", true);
        intent.putExtra("pairGuideDeviceMode", WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007);
        startActivityForResult(intent, 1);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int iB;
        LogUtil.a("BtAutoScanActivity", "onActivityResult requestCode ", Integer.valueOf(i), " resultCode: ", Integer.valueOf(i2));
        super.onActivityResult(i, i2, intent);
        String str = this.i;
        if (str != null) {
            iB = rcv.b(str);
            LogUtil.a("BtAutoScanActivity", "mDeviceName is ", this.i, " deviceType is ", Integer.valueOf(iB));
        } else {
            iB = -1;
        }
        if (i == 1) {
            if (i2 == 2) {
                setResult(2);
                if (intent != null) {
                    qtv.e(intent, this, qtv.c(i2, true, iB, true));
                }
            }
            finish();
        }
        if (i == 608) {
            ReleaseLogUtil.d("R_BtAutoScanActivity", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            cqp.a(100112, this.i, String.valueOf(i2), String.valueOf(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007));
            if (i2 == -1) {
                if (!TextUtils.isEmpty(this.g)) {
                    BluetoothAdapter.getDefaultAdapter();
                    if (BluetoothAdapter.checkBluetoothAddress(this.g)) {
                        SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                        rdp.d("BtAutoScanActivity", this.g, intent);
                        SharedPreferenceManager.a("HEARTBEAT_INFO", "companion_device_manager_flag", true);
                        a(this.m, this.j);
                        return;
                    }
                }
                ReleaseLogUtil.d("R_BtAutoScanActivity", "startObservingDevicePresence mDeviceMacAddress: " + this.g + ", is null or invalid.");
                return;
            }
            rdp.e(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.autoscandevice.BtAutoScanActivity.9
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    if (i3 == -1) {
                        rdp.a(BtAutoScanActivity.this.g, BtAutoScanActivity.this, 2);
                        return;
                    }
                    cqp.a(100112, BtAutoScanActivity.this.i, String.valueOf(608), String.valueOf(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007));
                    BtAutoScanActivity btAutoScanActivity = BtAutoScanActivity.this;
                    btAutoScanActivity.a(btAutoScanActivity.m, BtAutoScanActivity.this.j);
                }
            }, this);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.l == 1) {
            lof.d(this).e();
        }
        super.onDestroy();
        CommonUtil.d(BaseApplication.getContext());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        overridePendingTransition(0, R.anim.push_activity_out);
        super.onBackPressed();
    }

    private boolean d(int i, String str, int i2) {
        Context context = BaseApplication.getContext();
        String[] strArr = f24245a;
        if (lsg.d(context, strArr)) {
            return true;
        }
        e(strArr, i, str, i2);
        return false;
    }

    private void e(String[] strArr, final int i, final String str, final int i2) {
        boolean zD = lsg.d(BaseApplication.getContext(), strArr);
        LogUtil.a("BtAutoScanActivity", "requestPermissions() hasPermissionNeeded is ", Boolean.valueOf(zD));
        if (!zD) {
            lsg.d(this, strArr, new PermissionsResultAction() { // from class: com.huawei.ui.device.activity.autoscandevice.BtAutoScanActivity.10
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("BtAutoScanActivity", "requestPermissions() permission onGranted()");
                    BtAutoScanActivity.this.e(i, str, i2);
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str2) {
                    LogUtil.a("BtAutoScanActivity", "requestPermissions() permission onDenied()");
                }
            }, 1000);
        } else {
            LogUtil.a("BtAutoScanActivity", "requestPermissions() permission if (!hasPermissionNeeded) else.");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        LogUtil.a("BtAutoScanActivity", "requestCode: ", Integer.valueOf(i));
        ltd.e().e(strArr, iArr);
        c(i, strArr, iArr);
    }

    private void c(int i, String[] strArr, int[] iArr) {
        if (i == 1000) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (f24245a[0].equals(strArr[i2]) && iArr[i2] != 0) {
                    LogUtil.a("BtAutoScanActivity", "telephone permision reject");
                } else {
                    LogUtil.a("BtAutoScanActivity", "no show dialog");
                }
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
