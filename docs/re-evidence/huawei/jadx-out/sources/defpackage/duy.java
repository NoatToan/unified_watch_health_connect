package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.LanguageUtil;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class duy {
    private static final String e = File.separator + "WSP-BLE-LOG-FILE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32398a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<HagridDeviceManagerFragment> f32400c;
    private String f;
    private dnn h;
    private WeakReference<NoTitleCustomAlertDialog> d = new WeakReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32399b = false;
    private WspFileTransferCallback j = new WspFileTransferCallback() { // from class: duy.3
        @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
        public void onStart(int i) {
            LogUtil.a("DfxManager", "getLogFileFromDevice initItemList onStart fileListSize = ", Integer.valueOf(i));
            duy.this.f = null;
            duy.this.f32398a = i;
            duy.this.f32399b = true;
        }

        @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
        public void onSuccess(int i, int i2, String str) {
            LogUtil.a("DfxManager", "getLogFileFromDevice initItemList onSuccess, fileIndex = ", Integer.valueOf(i), " successCode = ", Integer.valueOf(i2));
            if (i + 1 >= duy.this.f32398a) {
                duy.this.f32399b = false;
                HagridDeviceManagerFragment hagridDeviceManagerFragment = (HagridDeviceManagerFragment) duy.this.f32400c.get();
                if (hagridDeviceManagerFragment == null || hagridDeviceManagerFragment.isDestory()) {
                    return;
                }
                hagridDeviceManagerFragment.updateItemView(null);
            }
        }

        @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
        public void onFailure(int i, String str) {
            LogUtil.j("DfxManager", "getLogFileFromDevice initItemList onFailure errorCode = ", Integer.valueOf(i));
            duy.this.f32399b = false;
            HagridDeviceManagerFragment hagridDeviceManagerFragment = (HagridDeviceManagerFragment) duy.this.f32400c.get();
            if (hagridDeviceManagerFragment != null && !hagridDeviceManagerFragment.isDestory()) {
                hagridDeviceManagerFragment.updateItemView(null);
            }
            qpx.a(BaseApplication.getContext(), R.string.IDS_hw_toast_log_upload_fail);
        }

        @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
        public void onProgress(int i, int i2, String str) {
            LogUtil.a("DfxManager", "getLogFileFromDevice initItemList onProgress progress = ", Integer.valueOf(i2), "fileIndex = ", Integer.valueOf(i));
            if (TextUtils.isEmpty(duy.this.f) || !duy.this.f.equals(str)) {
                duy.this.f = str;
            }
            StringBuilder sb = new StringBuilder(16);
            StringBuilder sb2 = new StringBuilder(16);
            if (i2 >= 100) {
                i2 = 100;
            }
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                sb2.append("%");
                sb2.append(i2);
            } else {
                sb2.append(i2);
                sb2.append("%");
            }
            int i3 = i + 1;
            if (duy.this.f32398a >= i3) {
                sb.append((CharSequence) sb2);
                sb.append(Constants.LEFT_BRACKET_ONLY);
                sb.append(i3);
                sb.append("/");
                sb.append(duy.this.f32398a);
                sb.append(Constants.RIGHT_BRACKET_ONLY);
                HagridDeviceManagerFragment hagridDeviceManagerFragment = (HagridDeviceManagerFragment) duy.this.f32400c.get();
                if (hagridDeviceManagerFragment == null || hagridDeviceManagerFragment.isDestory()) {
                    return;
                }
                hagridDeviceManagerFragment.updateItemView(sb.toString());
            }
        }

        @Override // com.huawei.health.device.kit.devicelogmgr.ble.WspFileTransferCallback
        public String getFilePath() {
            try {
                return BaseApplication.getContext().getFilesDir().getCanonicalPath() + duy.e;
            } catch (IOException unused) {
                LogUtil.j("DfxManager", "createFileWithByte IOException");
                return "";
            }
        }
    };

    public static duy e() {
        return d.d;
    }

    public void d(boolean z) {
        this.f32399b = z;
    }

    public void c(Activity activity, String str, String str2, HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        this.f32400c = new WeakReference<>(hagridDeviceManagerFragment);
        dnn dnnVar = new dnn(activity, str, str2);
        this.h = dnnVar;
        dnnVar.c(this.j);
    }

    public void d(dti dtiVar, eby ebyVar, Activity activity) {
        HashMap map = new HashMap(0);
        map.put("click", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_UPLOAD_DEVICE_LOG_2060056.value(), map, 0);
        if (qrs.r()) {
            LogUtil.j("DfxManager", "GET_DEVICE_LOG click too fast.");
            return;
        }
        boolean z = this.f32399b;
        if (z) {
            LogUtil.j("DfxManager", "device log mBleLogUploading: ", Boolean.valueOf(z));
            qpx.e(BaseApplication.getContext(), R.string.IDS_hw_show_log_upload_progress);
        } else if (!e(dtiVar) && ebyVar == null) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_plugin_device_weight_device_not_connect);
        } else if (a()) {
            LogUtil.a("DfxManager", "log upload status: ", Boolean.valueOf(a()));
            this.h.a();
        } else {
            e(activity, new View.OnClickListener() { // from class: dvd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32408a.a(view);
                }
            });
        }
    }

    /* synthetic */ void a(View view) {
        a(true);
        this.h.a();
        LogUtil.a("DfxManager", "BetaUploadDialog on click positive");
    }

    private boolean e(dti dtiVar) {
        if (dtiVar != null) {
            return dtiVar.c();
        }
        return false;
    }

    private void e(Activity activity, View.OnClickListener onClickListener) {
        if (activity == null) {
            LogUtil.a("DfxManager", "showBetaUploadDialog activity is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.d.get();
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            LogUtil.a("DfxManager", "show showBetaUploadDialog");
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
            builder.b(R.string.IDS_device_rope_beta_upload_prompt_1);
            builder.a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: dve
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("DfxManager", "BetaUploadDialog on click negative");
                }
            });
            builder.c(R.string.IDS_settings_button_ok, onClickListener);
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
            this.d = new WeakReference<>(noTitleCustomAlertDialogC);
            return;
        }
        LogUtil.j("DfxManager", "showBetaUploadDialog already show");
    }

    private boolean a() {
        return new DeviceCloudSharePreferencesManager(dxw.d()).d("user_agree_data_key");
    }

    private void a(boolean z) {
        LogUtil.a("DfxManager", "save log upload status", Boolean.valueOf(z));
        new DeviceCloudSharePreferencesManager(dxw.d()).c("user_agree_data_key", z);
    }

    public void d() {
        HashMap map = new HashMap(0);
        map.put("click", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_UPLOAD_DEVICE_BETA_LOG_2060057.value(), map, 0);
        c();
    }

    private void c() {
        Activity activity = BaseApplication.getActivity();
        if (a()) {
            this.h.b();
        } else {
            e(activity, new View.OnClickListener() { // from class: dvc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32407a.c(view);
                }
            });
        }
    }

    /* synthetic */ void c(View view) {
        a(true);
        this.h.b();
        LogUtil.a("DfxManager", "betaFeedback on click positive");
    }

    static class d {
        private static final duy d = new duy();
    }
}
