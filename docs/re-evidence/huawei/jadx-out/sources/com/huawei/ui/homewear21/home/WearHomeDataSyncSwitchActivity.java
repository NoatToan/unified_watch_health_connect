package com.huawei.ui.homewear21.home;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.WearHomeDataSyncSwitchActivity;
import com.huawei.ui.homewear21.home.adapter.WearHomeDataSyncAdapter;
import com.huawei.ui.homewear21.home.datasync.DataSyncSwitchContract;
import com.huawei.ui.homewear21.home.listener.WearHomeListener;
import defpackage.iov;
import defpackage.lsg;
import defpackage.ltd;
import defpackage.lug;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rdp;
import defpackage.tgg;
import defpackage.tom;
import defpackage.ton;
import defpackage.top;
import defpackage.tqp;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeDataSyncSwitchActivity extends BaseActivity implements WearHomeListener, DataSyncSwitchContract.View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WearHomeDataSyncAdapter f26220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f26221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26222c;
    private DataSyncSwitchContract.Presenter g;
    private String h;
    private LinearLayout i;
    private View j;
    private HealthRecycleView m;
    private String o;
    private List<tom> d = new ArrayList(0);
    private boolean f = false;
    private final BroadcastReceiver e = new BroadcastReceiver() { // from class: com.huawei.ui.homewear21.home.WearHomeDataSyncSwitchActivity.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("WearHomeDataSyncSwitchActivity", "mBroadcastReceiver intent is null");
                return;
            }
            try {
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                if (parcelableExtra instanceof DeviceInfo) {
                    WearHomeDataSyncSwitchActivity.this.e((DeviceInfo) parcelableExtra);
                } else {
                    LogUtil.j("WearHomeDataSyncSwitchActivity", "mBroadcastReceiver parcelable not instanceof DeviceInfo");
                }
            } catch (ClassCastException unused) {
                LogUtil.e("WearHomeDataSyncSwitchActivity", "mBroadcastReceiver ClassCastException");
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.wear_home_other_sitting_layout);
        this.f26221b = this;
        e();
        c();
        Intent intent = getIntent();
        if (intent != null) {
            this.h = intent.getStringExtra("device_id");
            this.o = intent.getStringExtra("SHOW_ONLY");
        }
        new ton(this);
        if (mgg.d("WearHomeDataSyncSwitchActivity") == null) {
            LogUtil.j("WearHomeDataSyncSwitchActivity", "init phoneService and get connect main device");
            this.f = true;
            this.f26222c = 0;
            HandlerExecutor.c(new tgg(this), 1000L);
        } else {
            this.g.startQueryData(this.o);
        }
        tqp.c(this.f26221b, this.e, "com.huawei.bone.action.CONNECTION_STATE_CHANGED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int i;
        this.f26222c++;
        if (isFinishing() || isDestroyed()) {
            LogUtil.a("WearHomeDataSyncSwitchActivity", "checkPhoneServiceBinder end, activity is finished");
            return;
        }
        if ((lug.c() == null || mgg.d("WearHomeDataSyncSwitchActivity") == null) && (i = this.f26222c) < 5) {
            LogUtil.j("WearHomeDataSyncSwitchActivity", "getting main device, check times: ", Integer.valueOf(i));
            HandlerExecutor.c(new tgg(this), 1000L);
            return;
        }
        this.f = false;
        if (this.d.isEmpty()) {
            LogUtil.a("WearHomeDataSyncSwitchActivity", "phone service binds success, startQueryData");
            this.g.startQueryData(this.o);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        tqp.d(this.f26221b, this.e);
        this.g.onDestroy();
    }

    @Override // com.huawei.ui.homewear21.home.datasync.BaseView
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void setPresenter(DataSyncSwitchContract.Presenter presenter) {
        this.g = presenter;
    }

    @Override // com.huawei.ui.homewear21.home.datasync.DataSyncSwitchContract.View
    public void refreshList(List<tom> list) {
        this.d.clear();
        this.d.addAll(list);
        if (this.d.isEmpty()) {
            d();
        } else {
            this.f26220a.notifyDataSetChanged();
            a();
        }
    }

    private void e() {
        this.m = (HealthRecycleView) qsp.a(this, R.id.recyclerView);
        this.j = qsp.a(this, R.id.wear_home_loading);
        this.i = (LinearLayout) qsp.a(this, R.id.wear_home_empty_layout);
        ((CustomTitleBar) qsp.a(this, R.id.wear_home_sitting_bar)).setTitleText(getString(R.string.IDS_settings_data_sync_app_management));
        this.f26220a = new WearHomeDataSyncAdapter(this, this.d);
        this.m.setLayoutManager(new LinearLayoutManager(this.f26221b));
        this.m.setAdapter(this.f26220a);
        this.m.setLayerType(2, null);
        this.m.setItemAnimator(new DefaultItemAnimator());
        this.m.b(false);
        this.m.e(false);
        this.f26220a.c(this);
    }

    @Override // com.huawei.ui.homewear21.home.listener.WearHomeListener
    public void onItemClick(int i) {
        tom tomVar = this.d.get(i);
        LogUtil.a("WearHomeDataSyncSwitchActivity", "onItemClick appName:", tomVar.a(), " PkgName:", tomVar.e(), " isChecked:", Boolean.valueOf(tomVar.c()), " isShowSwitch:", Boolean.valueOf(tomVar.b()));
        if (tomVar.a().equals(getString(R.string.IDS_settings_camera))) {
            iov.d(this, new Intent(this, (Class<?>) WearHomeCameraSettingActivity.class));
            return;
        }
        if ("COM.HUAWEI.HEALTH.CALENDAR".equals(tomVar.e())) {
            Intent intent = new Intent(this, (Class<?>) WearHomeCalendarSettingActivity.class);
            intent.putExtra("device_id", this.h);
            iov.d(this, intent);
        } else if (tomVar.b()) {
            if (top.a(tomVar.e())) {
                e(tomVar);
            }
        } else {
            try {
                Intent intent2 = new Intent("com.huawei.intent.action.APP_DATA_SYNC_SWITCH");
                intent2.addCategory("android.intent.category.DEFAULT");
                intent2.setPackage(tomVar.e());
                qrs.c(intent2, tomVar.e(), this, tomVar.a());
            } catch (SecurityException unused) {
                LogUtil.e("WearHomeDataSyncSwitchActivity", "onItemClick SecurityException");
            }
        }
    }

    private void e(final tom tomVar) {
        if (!tomVar.c()) {
            LogUtil.a("WearHomeDataSyncSwitchActivity", "clickContactsSwitch switch close");
            e(false);
        } else {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(R.string.IDS_service_area_notice_title).b(R.string.IDS_management_dialog_content).a(R.string.IDS_apphelp_pwindows_continue_button, new View.OnClickListener() { // from class: tgc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.a(tomVar, view);
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tgb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49090a.d(tomVar, view);
                }
            }).b();
            customTextAlertDialogB.setCanceledOnTouchOutside(false);
            customTextAlertDialogB.setCancelable(false);
            customTextAlertDialogB.show();
        }
    }

    public /* synthetic */ void a(tom tomVar, View view) {
        LogUtil.a("WearHomeDataSyncSwitchActivity", "showContactDialog ok click");
        c(tomVar);
    }

    public /* synthetic */ void d(tom tomVar, View view) {
        LogUtil.a("WearHomeDataSyncSwitchActivity", "showContactDialog cancel click");
        tomVar.b(false);
        this.f26220a.notifyDataSetChanged();
    }

    private void c(final tom tomVar) {
        if (ltd.e().e(this, "android.permission.READ_CONTACTS")) {
            e(true);
            return;
        }
        LogUtil.a("WearHomeDataSyncSwitchActivity", "clickContactsSwitch READ_CONTACTS permission false");
        if (!ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.READ_CONTACTS")) {
            LogUtil.a("WearHomeDataSyncSwitchActivity", "clickContactsSwitch READ_CONTACTS permission false and rationale");
            d(this.f26221b, tomVar);
        } else {
            lsg.a(this, new String[]{"android.permission.READ_CONTACTS"}, new PermissionsResultAction() { // from class: com.huawei.ui.homewear21.home.WearHomeDataSyncSwitchActivity.1
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("WearHomeDataSyncSwitchActivity", "clickContactsSwitch permission onGranted");
                    WearHomeDataSyncSwitchActivity.this.e(true);
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    LogUtil.a("WearHomeDataSyncSwitchActivity", "clickContactsSwitch permission onDenied");
                    tomVar.b(false);
                    WearHomeDataSyncSwitchActivity.this.f26220a.notifyDataSetChanged();
                }
            });
        }
    }

    private void d(Context context, final tom tomVar) {
        if (!(context instanceof Activity)) {
            LogUtil.a("WearHomeDataSyncSwitchActivity", "showPermissionDialogNoPrompt context not instanceof Activity");
            return;
        }
        final Activity activity = (Activity) context;
        if (activity.isFinishing()) {
            LogUtil.j("WearHomeDataSyncSwitchActivity", "showPermissionDialogNoPrompt activity is finishing");
        } else {
            new CustomTextAlertDialog.Builder(context).a(R.string.IDS_hwh_home_other_permissions_title).a(getResources().getString(R.string.IDS_hw_permission_guide_contact)).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tgf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49096c.b(tomVar, view);
                }
            }).a(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: tgj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WearHomeDataSyncSwitchActivity.b(activity, view);
                }
            }).b().show();
        }
    }

    public /* synthetic */ void b(tom tomVar, View view) {
        LogUtil.j("WearHomeDataSyncSwitchActivity", "showPermissionDialogNoPrompt onClick cancal");
        tomVar.b(false);
        this.f26220a.notifyDataSetChanged();
    }

    public static /* synthetic */ void b(Activity activity, View view) {
        LogUtil.j("WearHomeDataSyncSwitchActivity", "showPermissionDialogNoPrompt onClick go setting");
        rdp.c(activity, 10001);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10001) {
            return;
        }
        LogUtil.j("WearHomeDataSyncSwitchActivity", "onActivityResult");
        for (tom tomVar : this.d) {
            if (top.a(tomVar.e())) {
                boolean zE = ltd.e().e(this, "android.permission.READ_CONTACTS");
                if (zE) {
                    e(true);
                }
                tomVar.b(zE);
                this.f26220a.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        LogUtil.a("WearHomeDataSyncSwitchActivity", "setAndSendSwitchStatus isChecked: ", Boolean.valueOf(z));
        String str = z ? "1" : "0";
        mhs.a().setSwitchSetting("contacts_data_sync_switch", str, null);
        mhs.a().sendSetSwitchSettingCmd(1, str, null);
        ReleaseLogUtil.d("R_WearHomeDataSyncSwitchActivity", "setAndSendSwitchStatus setSwitchSetting/sendSetSwitchSettingCmd isChecked: ", Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo) {
        String str;
        if (deviceInfo == null || (str = this.h) == null) {
            LogUtil.j("WearHomeDataSyncSwitchActivity", "connectedChanged deviceInfo or mDeviceMac is null");
            return;
        }
        LogUtil.a("WearHomeDataSyncSwitchActivity", "connectedChanged, mDeviceMac: ", CommonUtil.n(str), ", deviceInfo.getDeviceIdentify(): ", CommonUtil.n(deviceInfo.getDeviceIdentify()), ", mIsGettingMainDevice: ", Boolean.valueOf(this.f));
        if (!this.h.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
            LogUtil.j("WearHomeDataSyncSwitchActivity", "connectedChanged deviceConnectionChange return");
        } else {
            if (this.f || deviceInfo.getDeviceConnectState() == 2) {
                return;
            }
            finish();
        }
    }

    private void c() {
        this.j.setVisibility(0);
        this.m.setVisibility(8);
        this.i.setVisibility(8);
    }

    private void a() {
        this.j.setVisibility(8);
        this.m.setVisibility(0);
        this.i.setVisibility(8);
    }

    private void d() {
        this.j.setVisibility(8);
        this.m.setVisibility(8);
        this.i.setVisibility(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
