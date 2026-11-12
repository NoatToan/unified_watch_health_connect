package com.huawei.sim.esim.view;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.multisimservice.model.MultiSimDeviceInfo;
import com.huawei.sim.R;
import com.huawei.sim.esim.qrcode.QrCodeActivity;
import com.huawei.sim.multisim.MultiSimConfigActivity;
import com.huawei.sim.multisim.activity.EsimAccountManageActivity;
import com.huawei.sim.multisim.activity.EsimOverseaEsActivity;
import com.huawei.sim.multisim.activity.MultiSimAuthActivity;
import com.huawei.sim.multisim.activity.MultiSimInstallGuideActivity;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.lrx;
import defpackage.lsd;
import defpackage.npz;
import defpackage.pvf;
import defpackage.pxe;
import defpackage.pxh;
import defpackage.pxi;
import defpackage.pxk;
import defpackage.xjt;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Utils;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class BaseOpenSimCardActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f22978a;
    protected String h;
    protected int i;
    private NoTitleCustomAlertDialog l;
    private Context m;
    private CustomTextAlertDialog o;
    protected CommonDialog21 g = null;
    protected String f = null;
    protected String j = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f22979b = new Handler();
    protected IBaseResponseCallback e = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.BaseOpenSimCardActivity.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("BaseOpenSimCardActivity", "mBaseResponseCallback the errCode:", Integer.valueOf(i));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected IBaseResponseCallback f22980c = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.BaseOpenSimCardActivity.5
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(final int i, final Object obj) {
            LogUtil.a("BaseOpenSimCardActivity", "mAuthResponseCallback the error:", Integer.valueOf(i));
            BaseOpenSimCardActivity.this.f22979b.post(new Runnable() { // from class: com.huawei.sim.esim.view.BaseOpenSimCardActivity.5.4
                /* JADX WARN: Code duplicated, block: B:17:0x0072  */
                /* JADX WARN: Code duplicated, block: B:20:0x007f  */
                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    boolean z2;
                    if (i == 0) {
                        String json = null;
                        try {
                            if (obj instanceof lsd) {
                                json = new Gson().toJson(((lsd) obj).b(), lrx.class);
                                if (((lsd) obj).a() != 1) {
                                    z = true;
                                }
                                Intent intent = new Intent(BaseOpenSimCardActivity.this, (Class<?>) EsimProfileActivity.class);
                                intent.putExtra("eSim_profile", json);
                                LogUtil.a("BaseOpenSimCardActivity", "the data:", json);
                                z2 = !new pvf().d(BaseOpenSimCardActivity.this.f) || z;
                                intent.putExtra("confirm_status", z2);
                                intent.putExtra("esim_new_original_key", 1);
                                if (!z2) {
                                    pxi.c("true", "enabled_entry", String.valueOf(i), "etisalat", "online_other", "one_number_multisim");
                                }
                                BaseOpenSimCardActivity.this.startActivity(intent);
                                BaseOpenSimCardActivity.this.finish();
                                return;
                            }
                            json = new Gson().toJson(obj, lrx.class);
                        } catch (JsonIOException unused) {
                            LogUtil.e("BaseOpenSimCardActivity", "mAuthResponseCallback objData JsonIOException");
                        }
                        z = false;
                        Intent intent2 = new Intent(BaseOpenSimCardActivity.this, (Class<?>) EsimProfileActivity.class);
                        intent2.putExtra("eSim_profile", json);
                        LogUtil.a("BaseOpenSimCardActivity", "the data:", json);
                        if (new pvf().d(BaseOpenSimCardActivity.this.f)) {
                        }
                        intent2.putExtra("confirm_status", z2);
                        intent2.putExtra("esim_new_original_key", 1);
                        if (!z2) {
                            pxi.c("true", "enabled_entry", String.valueOf(i), "etisalat", "online_other", "one_number_multisim");
                        }
                        BaseOpenSimCardActivity.this.startActivity(intent2);
                        BaseOpenSimCardActivity.this.finish();
                        return;
                    }
                    Object obj2 = obj;
                    BaseOpenSimCardActivity.this.e(i, obj2 instanceof Integer ? ((Integer) obj2).intValue() : -1);
                    xjt.q("mAuthResponseCallback failed errorCode: " + i);
                    pxi.c("false", "enabled_entry", String.valueOf(i), "etisalat", "online_other", "one_number_multisim");
                }
            });
        }
    };
    protected IBaseResponseCallback d = new IBaseResponseCallback() { // from class: com.huawei.sim.esim.view.BaseOpenSimCardActivity.3
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.d("BaseOpenSimCardActivity", "errCode:", Integer.valueOf(i));
        }
    };
    private final BroadcastReceiver n = new BroadcastReceiver() { // from class: com.huawei.sim.esim.view.BaseOpenSimCardActivity.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("BaseOpenSimCardActivity", "mNetBlueBroadcastReceiver intent is null or action is null");
                return;
            }
            LogUtil.a("BaseOpenSimCardActivity", "mNetBlueBroadcastReceiver action = ", intent.getAction());
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) && !pxk.c(intent)) {
                    LogUtil.j("BaseOpenSimCardActivity", "mNetBlueBroadcastReceiver is device not support current function");
                    xjt.q("mNetBlueBroadcastReceiver is device not support current function");
                } else {
                    Message messageObtainMessage = BaseOpenSimCardActivity.this.f22979b.obtainMessage(10001);
                    messageObtainMessage.obj = intent.getAction();
                    BaseOpenSimCardActivity.this.f22979b.sendMessage(messageObtainMessage);
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        LogUtil.a("BaseOpenSimCardActivity", "the errorCode:", Integer.valueOf(i));
        if (i2 == -2) {
            Intent intent = new Intent(this, (Class<?>) EsimProfileBtFailActivity.class);
            intent.putExtra("confirm_status", new pvf().d(this.f));
            intent.putExtra("esim_new_original_key", 1);
            startActivity(intent);
            finish();
            return;
        }
        c(i);
    }

    private void c(int i) {
        Intent intent = new Intent(this, (Class<?>) EsimProfileAuthenticationFail.class);
        intent.putExtra("mata_report", i);
        intent.putExtra("esim_new_original_key", 1);
        startActivity(intent);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m = this;
        npz.b().b(this.d);
        f();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        npz.b().a(this.d);
        h();
        Handler handler = this.f22979b;
        if (handler != null) {
            handler.removeMessages(10001);
        }
    }

    protected void e(int i) {
        LogUtil.a("BaseOpenSimCardActivity", "showLoadingDialog()");
        if (isFinishing()) {
            return;
        }
        CommonDialog21 commonDialog21 = this.g;
        if (commonDialog21 == null) {
            new CommonDialog21(this, R.style.common_dialog21);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this);
            this.g = commonDialog21B;
            commonDialog21B.b(getResources().getString(i));
            this.g.setCancelable(false);
            this.g.c();
            LogUtil.a("BaseOpenSimCardActivity", "mLoadingUserInformationDialog.show()");
            return;
        }
        commonDialog21.b(getResources().getString(i));
        this.g.c();
        LogUtil.a("BaseOpenSimCardActivity", "mLoadingUserInformationDialog.show()");
    }

    protected void e() {
        npz.b().b(this.d);
        e(R.string.IDS_plugin_loading_sim_profile);
        npz.b().e(this.f, this.e, this.f22980c);
    }

    protected void a() {
        PermissionUtil.d(this.m, PermissionUtil.PermissionType.CAMERA, new CustomPermissionAction(this.m) { // from class: com.huawei.sim.esim.view.BaseOpenSimCardActivity.4
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("BaseOpenSimCardActivity", "enterQrCodePage() onGranted");
                BaseOpenSimCardActivity.this.d();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("BaseOpenSimCardActivity", "enterQrCodePage() onDenied");
                BaseOpenSimCardActivity.this.d();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.a("BaseOpenSimCardActivity", "enterQrCodePage() onForeverDenied");
                BaseOpenSimCardActivity.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            Intent intent = new Intent(this.m, (Class<?>) QrCodeActivity.class);
            intent.putExtra("esim_new_original_key", 1);
            this.m.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("BaseOpenSimCardActivity", "enterQrCodePage ActivityNotFoundException");
        }
    }

    protected void e(MultiSimDeviceInfo multiSimDeviceInfo) {
        try {
            Intent intent = new Intent(this.m, (Class<?>) EsimStandaloneNumGuideActivity.class);
            intent.putExtra("multi_sim_device_info", multiSimDeviceInfo);
            this.m.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("BaseOpenSimCardActivity", "startInstallGuideActivity ActivityNotFoundException");
        }
    }

    protected void a(String str, int i) {
        if (i == 1 && pxk.d(str)) {
            b(str, i);
            return;
        }
        String strD = pxk.d(str, i);
        boolean zE = pxk.e(this.m, strD);
        if (Utils.b(this.m, strD) && zE) {
            c(str, i);
        } else {
            b(str, i);
        }
    }

    private void b(String str, int i) {
        try {
            Intent intent = new Intent(this.m, (Class<?>) MultiSimInstallGuideActivity.class);
            intent.putExtra("simImsi", str);
            intent.putExtra("cardType", i);
            this.m.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("BaseOpenSimCardActivity", "startInstallGuideActivity ActivityNotFoundException");
        }
    }

    private void c(final String str, final int i) {
        if (this.l == null) {
            String str2 = String.format(Locale.ENGLISH, this.m.getString(R.string.IDS_plugin_multi_esim_jump_operator_tips), pxk.b(this.m, str, i));
            String str3 = str2 + "\n\n" + this.m.getResources().getString(R.string.IDS_plugin_multi_esim_disable_screenshots);
            SpannableString spannableString = new SpannableString(str3);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.m.getResources().getColor(R.color.textColorPrimary));
            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) (this.m.getResources().getDimension(R.dimen.hwdialogpattern_text_size_auto_minsize) / this.m.getResources().getDisplayMetrics().scaledDensity), true);
            spannableString.setSpan(foregroundColorSpan, 0, str2.length(), 33);
            spannableString.setSpan(absoluteSizeSpan, 0, str2.length(), 33);
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(this.m.getResources().getColor(R.color.textColorSecondary));
            AbsoluteSizeSpan absoluteSizeSpan2 = new AbsoluteSizeSpan(14, true);
            spannableString.setSpan(foregroundColorSpan2, str2.length() + 1, str3.length(), 33);
            spannableString.setSpan(absoluteSizeSpan2, str2.length() + 1, str3.length(), 33);
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.m).b(spannableString).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.sim.esim.view.BaseOpenSimCardActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    BaseOpenSimCardActivity.this.j();
                    BaseOpenSimCardActivity.this.d(str, i);
                }
            }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.sim.esim.view.BaseOpenSimCardActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    BaseOpenSimCardActivity.this.j();
                }
            }).c();
            this.l = noTitleCustomAlertDialogC;
            noTitleCustomAlertDialogC.setCancelable(false);
            if (this.l.isShowing()) {
                return;
            }
            this.l.show();
            return;
        }
        LogUtil.j("BaseOpenSimCardActivity", "showJumpOperatorDialog is error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, int i) {
        try {
            Intent intent = new Intent(this.m, (Class<?>) MultiSimAuthActivity.class);
            intent.putExtra("simImsi", str);
            intent.putExtra("cardType", i);
            this.m.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("BaseOpenSimCardActivity", "startMultiSimAuthActivity ActivityNotFoundException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.l.dismiss();
        this.l = null;
    }

    protected void c(final String str, final String str2, final boolean z) {
        if (this.o == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.m).a(R.string.IDS_plugin_multi_sim_note).b(R.string.IDS_plugin_multi_esim_note_content).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.sim.esim.view.BaseOpenSimCardActivity.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    BaseOpenSimCardActivity.this.b();
                    BaseOpenSimCardActivity.this.b(str, str2, z);
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.sim.esim.view.BaseOpenSimCardActivity.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    BaseOpenSimCardActivity.this.b();
                }
            }).b();
            this.o = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            if (this.o.isShowing()) {
                return;
            }
            this.o.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.o.dismiss();
        this.o = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, boolean z) {
        if (i()) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setComponent(new ComponentName("com.huawei.hwmultisim", "com.huawei.hwmultisim.views.IntroduceActivity"));
            startActivity(intent);
            return;
        }
        a(str, str2, z);
    }

    private boolean i() {
        try {
            this.m.getPackageManager().getPackageInfo("com.huawei.hwmultisim", 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.a("BaseOpenSimCardActivity", "no multisim apk");
            return false;
        }
    }

    private void a(String str, String str2, boolean z) {
        Intent intent;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            LogUtil.j("BaseOpenSimCardActivity", "imsi or openMethod is null");
            return;
        }
        try {
            if (pxk.g(str)) {
                intent = new Intent(this.m, (Class<?>) EsimOverseaEsActivity.class);
                intent.putExtra("esim_auth_method", this.f22978a);
                intent.putExtra("esim_is_one_open_method", z);
            } else {
                intent = new Intent(this.m, (Class<?>) MultiSimConfigActivity.class);
            }
            intent.putExtra("simImsi", str2);
            intent.putExtra("MultiSimSlotId", this.i);
            this.m.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("BaseOpenSimCardActivity", "startMultiSimMenu ActivityNotFoundException");
        }
    }

    private void f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        BroadcastManagerUtil.c(this, this.n, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void h() {
        try {
            LogUtil.a("BaseOpenSimCardActivity", "unregisterNetBlueBroadcast");
            unregisterReceiver(this.n);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("BaseOpenSimCardActivity", "unregisterNetBlueBroadcast IllegalArgumentException");
        }
    }

    protected void c() {
        try {
            Intent intent = new Intent(this.m, (Class<?>) EsimAccountManageActivity.class);
            intent.putExtra("esim_auth_method", this.f22978a);
            intent.putExtra("simImsi", this.j);
            intent.putExtra("MultiSimSlotId", this.i);
            this.m.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("BaseOpenSimCardActivity", "startEsimAccountManageActivity ActivityNotFoundException");
        }
    }

    protected void a(Map<String, Object> map) {
        LogUtil.a("BaseOpenSimCardActivity", "setEsimAccountManageParam");
        if (map == null) {
            LogUtil.j("BaseOpenSimCardActivity", "setEsimAccountManageParam simCardInfo is null");
            return;
        }
        pxe pxeVarA = pxh.a(map);
        if (map.containsKey("slotId")) {
            Object obj = map.get("slotId");
            if (obj instanceof Integer) {
                this.i = ((Integer) obj).intValue();
            }
        }
        if (map.containsKey("imsi")) {
            Object obj2 = map.get("imsi");
            if (obj2 instanceof String) {
                this.j = (String) obj2;
            }
        }
        if (pxeVarA != null) {
            this.h = pxeVarA.a();
            if (pxk.h(this.j) && CommonUtil.bg()) {
                this.f22978a = 2;
            } else if (pxk.h(this.j) && !CommonUtil.bg()) {
                this.f22978a = 1;
            } else {
                this.f22978a = pxeVarA.b();
            }
        }
        LogUtil.a("BaseOpenSimCardActivity", "mAuthMethod = ", Integer.valueOf(this.f22978a));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
