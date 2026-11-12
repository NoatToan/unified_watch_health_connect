package com.huami.core.device.wifi_settings.ui;

import android.content.DialogInterface;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.core.device.wifi_settings.R;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.ui.BaseWifiActivity;
import com.huami.core.device.wifi_settings.wifiscan.WifiHelper;
import com.huami.core.device.wifi_settings.wifiscan.WifiUtil;
import com.huami.core.device.wifi_settings.wifiscan.listener.ScanResultListener;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DB\u0007¢\u0006\u0004\bB\u0010CJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J/\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00032\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0016J\u0012\u0010\u001d\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\u0012\u0010\"\u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0011J\u0006\u0010#\u001a\u00020\u0003J\b\u0010$\u001a\u00020\u0003H\u0014J\b\u0010%\u001a\u00020\u000eH&J\b\u0010&\u001a\u00020\u000eH&J\b\u0010'\u001a\u00020\u000eH&J\b\u0010(\u001a\u00020\u001eH&J\b\u0010)\u001a\u00020\u0003H&J\b\u0010*\u001a\u00020\u0003H&R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\"\u00109\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006E"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/BaseWifiActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/huami/core/device/wifi_settings/wifiscan/listener/ScanResultListener;", "", com.google.android.exoplayer2.text.ttml.b.r, GoogleApiAvailabilityLight.b, "o", "t", DTransferConstants.SEARCH_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStartScan", "onWifiSwitchDisable", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "list", "resultSuc", "Landroid/net/wifi/WifiInfo;", "info", "connectedWifiCallback", "", "isShowLoadDialog", "filter5G", "msg", "showLoadDialog", "hideLoadDialog", "onDestroy", "initLayout", "maskViewId", "statusContainerId", "scanWifiEnable", "initView", "initData", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "x", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/core/device/wifi_settings/wifiscan/WifiHelper;", "y", "Lcom/huami/core/device/wifi_settings/wifiscan/WifiHelper;", "mWifiHelper", "z", LogUtil.I, "getMSource", "()I", "setMSource", "(I)V", "mSource", "Lcom/huami/core/device/wifi_settings/ui/WifiDeviceStatusFragment;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/core/device/wifi_settings/ui/WifiDeviceStatusFragment;", "statusFragment", "Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment;", "B", "Lcom/huami/core/device/wifi_settings/ui/CenterDialogFragment;", "mWifiDisableDialog", "<init>", "()V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseWifiActivity extends BaseTitleActivity implements ScanResultListener {

    @NotNull
    public static final String KEY_SOURCE = "source";
    public static final int PERMISSIONS_REQUEST_CODE_ACCESS_COARSE_LOCATION = 101;

    @NotNull
    public static final String TAG = "BaseWifiActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private WifiDeviceStatusFragment statusFragment;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    private CenterDialogFragment mWifiDisableDialog;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private WifiHelper mWifiHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private int mSource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ WifiInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WifiInfo wifiInfo) {
            super(0);
            this.a = wifiInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("connectedWifiCallback:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onRequestPermissionsResult...";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onStartScan...";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startScanWifi...";
        }
    }

    private final void n() {
        if (Build.VERSION.SDK_INT < 23 || checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            t();
        } else {
            requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 101);
        }
    }

    private final void o() {
        WifiDeviceStatusFragment onDeviceStatusChangeListener = WifiDeviceStatusFragment.INSTANCE.newInstance(this.mSource).setOnDeviceStatusChangeListener(new WifiDeviceStatusFragment.OnDeviceStatusChangeListener() { // from class: com.huami.core.device.wifi_settings.ui.BaseWifiActivity$initStatusFragment$1
            @Override // com.huami.core.device.wifi_settings.ui.WifiDeviceStatusFragment.OnDeviceStatusChangeListener
            public void onDeviceStatusChange(boolean enable) {
                BaseWifiActivity baseWifiActivity = this.a;
                baseWifiActivity.findViewById(baseWifiActivity.maskViewId()).setVisibility(enable ? 8 : 0);
            }
        });
        this.statusFragment = onDeviceStatusChangeListener;
        if (onDeviceStatusChangeListener == null) {
            return;
        }
        onDeviceStatusChangeListener.show(R.id.device_status, getSupportFragmentManager());
    }

    private final void p() {
        BaseWifiActivityKt.setUnifyTitleStyle$default(this, "", null, 2, null);
    }

    private final void q() {
        if (this.mWifiDisableDialog == null) {
            this.mWifiDisableDialog = CenterDialogFragment.setNegativeButton$default(CenterDialogFragment.setPositiveButton$default(CenterDialogFragment.Companion.newInstance$default(CenterDialogFragment.INSTANCE, 0, 1, null).setMessage(getString(R.string.wifi_switch_disable_msg)), getString(R.string.wifi_set_switch_open), null, new DialogInterface.OnClickListener() { // from class: ms
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BaseWifiActivity.r(this.a, dialogInterface, i);
                }
            }, 2, null), getString(R.string.wifi_cancel), null, new DialogInterface.OnClickListener() { // from class: ls
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BaseWifiActivity.s(this.a, dialogInterface, i);
                }
            }, 2, null).setCancel(false);
        }
        CenterDialogFragment centerDialogFragment = this.mWifiDisableDialog;
        if (centerDialogFragment == null || centerDialogFragment.isShowing()) {
            return;
        }
        centerDialogFragment.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(BaseWifiActivity baseWifiActivity, DialogInterface dialogInterface, int i) {
        WifiUtil.INSTANCE.openWifi(baseWifiActivity);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(BaseWifiActivity baseWifiActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        baseWifiActivity.finish();
    }

    public static /* synthetic */ void showLoadDialog$default(BaseWifiActivity baseWifiActivity, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoadDialog");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        baseWifiActivity.showLoadDialog(str);
    }

    private final void t() {
        HMLog.debug(TAG, d.a);
        WifiHelper wifiHelper = this.mWifiHelper;
        if (wifiHelper == null) {
            wifiHelper = null;
        }
        wifiHelper.startScan();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.core.device.wifi_settings.wifiscan.listener.ScanResultListener
    public void connectedWifiCallback(@Nullable WifiInfo info) {
        HMLog.debug(TAG, new a(info));
    }

    public boolean filter5G() {
        return true;
    }

    public final int getMSource() {
        return this.mSource;
    }

    public final void hideLoadDialog() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    public abstract void initData();

    public abstract int initLayout();

    public abstract void initView();

    public boolean isShowLoadDialog() {
        return true;
    }

    public abstract int maskViewId();

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        if (getIntent() != null) {
            setMSource(getIntent().getIntExtra("source", 0));
        }
        p();
        initView();
        if (getWifiScanEnable()) {
            this.mWifiHelper = new WifiHelper(this, filter5G(), this);
            n();
        }
        initData();
        o();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (getWifiScanEnable()) {
            WifiHelper wifiHelper = this.mWifiHelper;
            if (wifiHelper == null) {
                wifiHelper = null;
            }
            wifiHelper.destroy();
        }
        hideLoadDialog();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 101) {
            HMLog.debug(TAG, b.a);
            t();
        }
    }

    @Override // com.huami.core.device.wifi_settings.wifiscan.listener.ScanResultListener
    public void onStartScan() {
        HMLog.debug(TAG, c.a);
        if (isShowLoadDialog()) {
            showLoadDialog$default(this, null, 1, null);
        }
    }

    @Override // com.huami.core.device.wifi_settings.wifiscan.listener.ScanResultListener
    public void onWifiSwitchDisable() {
        q();
    }

    @Override // com.huami.core.device.wifi_settings.wifiscan.listener.ScanResultListener
    public void resultSuc(@Nullable List<WifiBean> list) {
        if (isShowLoadDialog()) {
            hideLoadDialog();
        }
    }

    /* JADX INFO: renamed from: scanWifiEnable */
    public abstract boolean getWifiScanEnable();

    public final void setMSource(int i) {
        this.mSource = i;
    }

    public final void showLoadDialog(@Nullable String msg) {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2;
        boolean z = false;
        if (this.mLoadingDialog == null) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this);
            this.mLoadingDialog = loadingDialogShowDialog;
            if (loadingDialogShowDialog != null) {
                loadingDialogShowDialog.setCancelable(false);
            }
        }
        if (!TextUtils.isEmpty(msg) && (loadingDialog2 = this.mLoadingDialog) != null) {
            loadingDialog2.setMessage(msg);
        }
        LoadingDialog loadingDialog3 = this.mLoadingDialog;
        if (loadingDialog3 != null && !loadingDialog3.isShowing()) {
            z = true;
        }
        if (!z || (loadingDialog = this.mLoadingDialog) == null) {
            return;
        }
        loadingDialog.show();
    }

    public abstract int statusContainerId();
}
