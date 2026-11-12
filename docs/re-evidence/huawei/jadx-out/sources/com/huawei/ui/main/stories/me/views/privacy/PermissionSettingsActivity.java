package com.huawei.ui.main.stories.me.views.privacy;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.keepalive.KeepAliveActivity;
import com.huawei.ui.main.stories.me.views.privacy.PermissionSettingsActivity;
import defpackage.iov;
import defpackage.lsg;
import defpackage.ltd;
import defpackage.mir;
import defpackage.nzz;
import defpackage.qpx;
import defpackage.qri;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.wmt;
import defpackage.wuu;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class PermissionSettingsActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f28566a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PermissionGroupManager f28567c;
    private boolean d = false;
    private LinearLayout e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_permission_settings);
        LogUtil.a("PermissionSettingsActivity", "onCreate");
        if (Build.VERSION.SDK_INT < 30) {
            ReleaseLogUtil.e("R_PermissionSettingsActivity", "Android version", Integer.valueOf(Build.VERSION.SDK_INT), " is too low to support permission settings");
            qpx.e(BaseApplication.b(), com.huawei.indoorequip.R.string.ie_tips_emui_too_low);
            finish();
        } else {
            e();
            d();
            wuu.d(this.f28567c.a());
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("PermissionSettingsActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f28567c.d();
        h();
    }

    private void h() {
        this.e.removeAllViews();
        for (PermissionGroup permissionGroup : this.f28567c.a()) {
            e(permissionGroup);
            permissionGroup.b("PermissionSettingsActivity");
        }
    }

    private void e() {
        ((CustomTitleBar) qsp.a(this, R.id.permission_settings_titlebar)).setLeftButtonOnClickListener(new View.OnClickListener() { // from class: vxt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51684a.b(view);
            }
        });
        this.e = (LinearLayout) qsp.a(this, R.id.permission_list_container);
        this.f28566a = (TextView) qsp.a(this, R.id.tv_permission_tip);
        b();
        LogUtil.a("PermissionSettingsActivity", "initView end");
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a("PermissionSettingsActivity", "titlebar left button clicked");
        finish();
    }

    private void b() {
        String string = getString(R.string.IDS_placeholders_hwh_privacy_statement);
        SpannableString spannableString = new SpannableString(getString(R.string.IDS_hwh_permission_settings_tip, new Object[]{string}));
        qri.a(spannableString, string, new wmt(this, "HealthPrivacy", false, new BaseResponseCallback() { // from class: vxo
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f51677b.d(i, obj);
            }
        }));
        this.f28566a.setText(spannableString);
        this.f28566a.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public /* synthetic */ void d(int i, Object obj) {
        wuu.b(this.f28567c.a());
    }

    private void d() {
        PermissionGroupManager permissionGroupManager = new PermissionGroupManager(this);
        this.f28567c = permissionGroupManager;
        permissionGroupManager.b();
        List<PermissionGroup> listA = this.f28567c.a();
        for (PermissionGroup permissionGroup : listA) {
            e(permissionGroup);
            permissionGroup.b("PermissionSettingsActivity");
        }
        LogUtil.a("PermissionSettingsActivity", "initData end, group count: ", Integer.valueOf(listA.size()));
    }

    private void e(final PermissionGroup permissionGroup) {
        int i;
        int i2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        if (qrs.u()) {
            i = R.layout.activity_permission_settings_card_item_large;
        } else {
            i = R.layout.activity_permission_settings_card_item;
        }
        View viewInflate = layoutInflaterFrom.inflate(i, (ViewGroup) this.e, false);
        View viewFindViewById = viewInflate.findViewById(R.id.permission_item_layout);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_permission_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_permission_desc);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_permission_status);
        textView.setText(permissionGroup.d());
        textView2.setText(permissionGroup.b());
        if (permissionGroup.g()) {
            textView3.setText(R.string.IDS_go_setting);
        } else {
            int i3 = AnonymousClass1.f28568a[permissionGroup.i().ordinal()];
            if (i3 == 1) {
                i2 = R.string.IDS_hwh_permission_authorized;
            } else if (i3 == 2) {
                i2 = R.string.IDS_hwh_permission_partially_authorized;
            } else {
                i2 = R.string.IDS_hwh_permission_not_granted;
            }
            textView3.setText(i2);
        }
        final String strE = permissionGroup.e();
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: vxp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51678b.b(strE, permissionGroup, view);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) getResources().getDimension(R.dimen.health_common_8dp);
        viewInflate.setLayoutParams(layoutParams);
        this.e.addView(viewInflate);
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.me.views.privacy.PermissionSettingsActivity$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28568a;

        static {
            int[] iArr = new int[PermissionGroup.PermissionStatus.values().length];
            f28568a = iArr;
            try {
                iArr[PermissionGroup.PermissionStatus.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28568a[PermissionGroup.PermissionStatus.PARTIAL_GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28568a[PermissionGroup.PermissionStatus.NOT_GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public /* synthetic */ void b(String str, PermissionGroup permissionGroup, View view) {
        ReleaseLogUtil.d("R_PermissionSettingsActivity", "permission click, groupId: ", str, ", status: ", permissionGroup.i());
        b(permissionGroup);
    }

    private void b(PermissionGroup permissionGroup) {
        wuu.b(permissionGroup, this.f28567c.a());
        if (permissionGroup.g()) {
            LogUtil.a("PermissionSettingsActivity", "click keepalive item");
            a();
            return;
        }
        String strE = permissionGroup.e();
        if ("NOTIFICATIONS_ACCESS".equals(strE)) {
            LogUtil.a("PermissionSettingsActivity", "handle notification permission click, status: ", permissionGroup.i());
            d(permissionGroup);
        } else if ("android.permission-group.LOCATION".equals(strE)) {
            LogUtil.a("PermissionSettingsActivity", "handle location permission click");
            a(permissionGroup);
        } else {
            c(permissionGroup);
        }
    }

    private void c(PermissionGroup permissionGroup) {
        List<String> listC = permissionGroup.c();
        if (listC == null || listC.isEmpty()) {
            ReleaseLogUtil.e("R_PermissionSettingsActivity", "click group with no permissions, groupId: ", permissionGroup.e());
            return;
        }
        String strE = permissionGroup.e();
        if (permissionGroup.i() == PermissionGroup.PermissionStatus.GRANTED) {
            ReleaseLogUtil.d("R_PermissionSettingsActivity", "permission already authorized, open app settings, groupId: ", strE);
            g(permissionGroup);
        } else {
            a((String[]) listC.toArray(new String[0]), permissionGroup);
        }
    }

    private void d(PermissionGroup permissionGroup) {
        boolean zE = e(permissionGroup.i() == PermissionGroup.PermissionStatus.NOT_GRANTED);
        ReleaseLogUtil.d("R_PermissionSettingsActivity", "notification enable result: ", Boolean.valueOf(zE));
        if (zE) {
            this.e.postDelayed(new Runnable() { // from class: vxl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51675a.f();
                }
            }, 300L);
        } else {
            f();
            g(permissionGroup);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(String str) {
        return !shouldShowRequestPermissionRationale(str);
    }

    private boolean e(boolean z) {
        ContentResolver contentResolverC = c();
        if (contentResolverC != null) {
            return mir.d(contentResolverC, z, "PermissionSettingsActivity");
        }
        return false;
    }

    private ContentResolver c() {
        return mir.b(this, "PermissionSettingsActivity");
    }

    private void a(PermissionGroup permissionGroup) {
        if (permissionGroup.i() == PermissionGroup.PermissionStatus.GRANTED) {
            ReleaseLogUtil.d("R_PermissionSettingsActivity", "location permission authorized or denied forever, open app settings");
            g(permissionGroup);
        } else {
            d(PermissionUtil.PermissionType.LOCATION, permissionGroup);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final PermissionUtil.PermissionType permissionType, final PermissionGroup permissionGroup) {
        ReleaseLogUtil.d("R_PermissionSettingsActivity", "requestLoactionPermission, type: ", permissionType);
        PermissionUtil.d(this, permissionType, new CustomPermissionAction(this) { // from class: com.huawei.ui.main.stories.me.views.privacy.PermissionSettingsActivity.3
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                ReleaseLogUtil.d("R_PermissionSettingsActivity", "location permission granted, type: ", permissionType);
                PermissionSettingsActivity.this.f();
                if (PermissionUtil.PermissionType.LOCATION == permissionType) {
                    PermissionSettingsActivity.this.d(PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND, permissionGroup);
                }
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                ReleaseLogUtil.d("R_PermissionSettingsActivity", "location permission denied, type: ", permissionType, ", permission: ", str);
                PermissionSettingsActivity.this.f();
                if (PermissionUtil.PermissionType.LOCATION == permissionType && PermissionSettingsActivity.this.d(str)) {
                    PermissionSettingsActivity.this.g(permissionGroup);
                }
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType2) {
                ReleaseLogUtil.d("R_PermissionSettingsActivity", "location permission forever denied, type: ", permissionType2);
                PermissionSettingsActivity.this.f();
                PermissionSettingsActivity.this.g(permissionGroup);
            }
        });
    }

    private void a(String[] strArr, final PermissionGroup permissionGroup) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(this, str) == -1) {
                arrayList.add(str);
            }
        }
        LogUtil.a("PermissionSettingsActivity", "requestPermissionsWithRationale, groupId: ", permissionGroup.e(), ", all permissions: ", Arrays.toString(strArr), ", can request: ", arrayList);
        if (arrayList.isEmpty()) {
            ReleaseLogUtil.e("R_PermissionSettingsActivity", "groupId: ", permissionGroup.e(), ", all permissions granted, open setting");
            g(permissionGroup);
        } else {
            lsg.a(this, (String[]) arrayList.toArray(new String[0]), new PermissionsResultAction() { // from class: com.huawei.ui.main.stories.me.views.privacy.PermissionSettingsActivity.2
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    ReleaseLogUtil.d("R_PermissionSettingsActivity", "permission granted, groupId: ", permissionGroup.e());
                    PermissionSettingsActivity.this.f();
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str2) {
                    ReleaseLogUtil.d("R_PermissionSettingsActivity", "permissions denied, groupId: ", permissionGroup.e(), ", permission: ", str2);
                    PermissionSettingsActivity.this.f();
                    if (PermissionSettingsActivity.this.d(str2)) {
                        PermissionSettingsActivity.this.g(permissionGroup);
                    }
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    ReleaseLogUtil.d("R_PermissionSettingsActivity", "permission forever denied, groupId: ", permissionGroup.e());
                    PermissionSettingsActivity.this.f();
                    PermissionSettingsActivity.this.g(permissionGroup);
                }
            });
        }
    }

    private void a() {
        Context contextB = BaseApplication.b();
        final int iN = CommonUtil.n(contextB, LoginInit.getInstance(contextB).getAccountInfo(1009));
        if (iN == 1) {
            GRSManager.c(contextB).d("domainKlgMapDtlUrl", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.me.views.privacy.PermissionSettingsActivity.4
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str) {
                    PermissionSettingsActivity.e(PermissionSettingsActivity.this, iN, str);
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    ReleaseLogUtil.e("R_PermissionSettingsActivity", "gotoKeepAlive, cn is fail");
                }
            });
        } else {
            GRSManager.c(contextB).d("helpCustomerUrl", new GrsQueryCallback() { // from class: com.huawei.ui.main.stories.me.views.privacy.PermissionSettingsActivity.5
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str) {
                    PermissionSettingsActivity.e(PermissionSettingsActivity.this, iN, str);
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    ReleaseLogUtil.e("R_PermissionSettingsActivity", "gotoKeepAlive, oversea is fail");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context, int i, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("R_PermissionSettingsActivity", "getKeepAliveUrl, urlMain is empty");
            return;
        }
        if (i == 1) {
            if (LanguageUtil.f(BaseApplication.b())) {
                str2 = str + nzz.a("11073");
            } else {
                str2 = str + String.format(Locale.ENGLISH, "/hwtips/protection_setup/%s/protection.html?cid=%s", "en-US", "11073");
            }
            LogUtil.d("PermissionSettingsActivity", "keepAliveUrl cn: ", str2);
            d(context, str2);
            return;
        }
        String str3 = str + String.format(Locale.ENGLISH, "/handbook/SingleJumppage/protection_setup/en-US/index.html?lang=%s", CommonUtil.z());
        LogUtil.d("PermissionSettingsActivity", "keepAliveUrl oversea: ", str3);
        d(context, str3);
    }

    private static void d(final Context context, final String str) {
        if (context == null) {
            context = BaseApplication.b();
        }
        ReleaseLogUtil.d("R_PermissionSettingsActivity", "go to KeepAliveActivity");
        HandlerExecutor.b(new Runnable() { // from class: vxq
            @Override // java.lang.Runnable
            public final void run() {
                PermissionSettingsActivity.e(str, context);
            }
        });
    }

    public static /* synthetic */ void e(String str, Context context) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.putExtra("keepAliveUrl", str);
        intent.setClass(context, KeepAliveActivity.class);
        iov.d(context, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(PermissionGroup permissionGroup) {
        String strE = permissionGroup.e();
        LogUtil.a("PermissionSettingsActivity", "openAppSettings, groupId: ", strE, ", wentToSystemSetting: ", Boolean.valueOf(this.d));
        if ("NOTIFICATIONS_ACCESS".equals(strE)) {
            if (this.d || permissionGroup.i() == PermissionGroup.PermissionStatus.GRANTED) {
                i();
                g();
                return;
            } else {
                b(true);
                return;
            }
        }
        if (this.d || permissionGroup.i() == PermissionGroup.PermissionStatus.GRANTED) {
            i();
            j();
        } else {
            b(false);
        }
    }

    private void i() {
        qpx.e(BaseApplication.b(), R.string.IDS_hwh_permission_apply_toast);
    }

    private void b(final boolean z) {
        LogUtil.a("PermissionSettingsActivity", "showGoSettingsDialog");
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(com.huawei.ui.commonui.R.string.IDS_hwh_home_other_permissions_title).b(R.string.IDS_hwh_permission_apply_content).e(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: vxn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("PermissionSettingsActivity", "go settings dialog cancelled");
            }
        }).a(com.huawei.ui.commonui.R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: vxm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51676a.a(z, view);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void a(boolean z, View view) {
        LogUtil.a("PermissionSettingsActivity", "go settings dialog confirmed");
        this.d = true;
        if (z) {
            g();
        } else {
            j();
        }
    }

    private void j() {
        ReleaseLogUtil.d("R_PermissionSettingsActivity", "goToSystemSettings");
        qrs.al(this);
    }

    private void g() {
        ReleaseLogUtil.d("R_PermissionSettingsActivity", "openNotificationSettings");
        Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        intent.addFlags(268435456);
        iov.d(this, intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        LogUtil.a("PermissionSettingsActivity", "onRequestPermissionsResult, requestCode: ", Integer.valueOf(i));
        ltd.e().e(strArr, iArr);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
