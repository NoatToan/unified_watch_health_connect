package com.huawei.healthcloud.plugintrack.offlinemap.ui.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.offlinemap.manager.service.OfflineMapService;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.view.OfflineCitiesFragment;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.view.OfflineDownManagerFragment;
import com.huawei.healthcloud.plugintrack.offlinemap.ui.view.OfflineMapCityList;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.iyb;
import defpackage.jcc;
import defpackage.lsg;
import defpackage.ltd;
import defpackage.qpn;
import defpackage.qrs;
import defpackage.xfz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class OfflineMapTabActivity extends BaseUiActivity implements ActivityCompat.OnRequestPermissionsResultCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10532b;
    private jcc d;
    private List<Fragment> g;
    private CustomTitleBar h;
    private a i;
    private qpn j;
    private HealthViewPager l;
    private HealthSubTabWidget o;
    private BroadcastReceiver e = new d(this);
    private boolean f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OfflineCitiesFragment f10531a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OfflineDownManagerFragment f10533c = null;

    static class a extends BaseHandler<OfflineMapTabActivity> {
        a(OfflineMapTabActivity offlineMapTabActivity) {
            super(offlineMapTabActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(OfflineMapTabActivity offlineMapTabActivity, Message message) {
            if (offlineMapTabActivity == null || message == null) {
                return;
            }
            int i = message.what;
            if (i != 100) {
                if (i == 201) {
                    offlineMapTabActivity.finish();
                    return;
                } else {
                    if (i != 202) {
                        return;
                    }
                    offlineMapTabActivity.d();
                    return;
                }
            }
            offlineMapTabActivity.b();
            Object obj = message.obj;
            if (!(obj instanceof Intent)) {
                LogUtil.e("OfflineMapTabActivity", "DownLoadHandler obj is not intent");
            } else {
                offlineMapTabActivity.c((OfflineMapCityList) ((Intent) obj).getParcelableExtra("TAG_ALL_CITY_LIST_SA"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.d.e();
    }

    @Override // com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.BaseUiActivity
    protected int getLayoutId() {
        return R.layout.track_offlinemap_main_tab_layout;
    }

    @Override // com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.BaseUiActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("OfflineMapTabActivity", "onCreate()");
        this.f10532b = this;
        this.d = jcc.e(this);
        c();
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.offline_titlebar);
        this.h = customTitleBar;
        customTitleBar.setTitleText(this.f10532b.getString(R.string.IDS_motiontrack_offlinemap_title));
        this.f10533c = new OfflineDownManagerFragment();
        this.f10531a = new OfflineCitiesFragment();
        ArrayList arrayList = new ArrayList(2);
        this.g = arrayList;
        arrayList.add(this.f10533c);
        this.g.add(this.f10531a);
        this.l = (HealthViewPager) findViewById(R.id.viewPager);
        h();
        this.o = (HealthSubTabWidget) findViewById(R.id.offline_subtab);
        this.j = new qpn(this, this.l, this.o);
        xfz xfzVarB = this.o.b(getResources().getString(R.string.IDS_motiontrack_offlinemap_manage_down));
        xfz xfzVarB2 = this.o.b(getResources().getString(R.string.IDS_motiontrack_offlinemap_city_list));
        this.j.b(xfzVarB, this.f10533c, true);
        this.j.b(xfzVarB2, this.f10531a, false);
        this.i = new a(this);
        if (!PermissionUtil.a()) {
            e();
        } else {
            this.i.sendEmptyMessage(202);
        }
    }

    private void e() {
        PermissionUtil.d(this.f10532b, PermissionUtil.PermissionType.STORAGE_NETWORK_WIFI, new CustomPermissionAction(this.f10532b) { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.OfflineMapTabActivity.2
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                OfflineMapTabActivity.this.i.sendEmptyMessage(202);
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.j("OfflineMapTabActivity", "permission forever denied, show the guide window");
                qrs.b(OfflineMapTabActivity.this.f10532b, permissionType, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.OfflineMapTabActivity.2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        OfflineMapTabActivity.this.i.sendEmptyMessage(201);
                    }
                }, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.OfflineMapTabActivity.2.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        OfflineMapTabActivity.this.i.sendEmptyMessage(201);
                    }
                });
            }
        });
    }

    private void h() {
        this.l.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.OfflineMapTabActivity.1
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (i != 0 || OfflineMapTabActivity.this.f10531a == null) {
                    return;
                }
                LogUtil.a("OfflineMapTabActivity", "onPageChange mCitiesFragment not null ");
                OfflineMapTabActivity.this.f10531a.d();
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            super.onSaveInstanceState(bundle);
            bundle.putParcelable("android:support:fragments", null);
        }
    }

    private void c() {
        this.d.a();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (strArr == null) {
            return;
        }
        LogUtil.a("OfflineMapTabActivity", "Activity-onRequestPermissionsResult() PermissionsManager.notifyPermissionsChange()");
        ltd.e().e(strArr, iArr);
        if (lsg.d(this.f10532b, strArr)) {
            LogUtil.a("OfflineMapTabActivity", "onRequestPermissionsResult :enter if");
            this.i.sendEmptyMessage(202);
        } else {
            LogUtil.a("OfflineMapTabActivity", "onRequestPermissionsResult :enter else");
            this.i.sendEmptyMessage(201);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        a();
        j();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        LogUtil.a("OfflineMapTabActivity", "onStart()");
        super.onStart();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initSystemBar();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        LogUtil.a("OfflineMapTabActivity", "onRestart");
        super.onRestart();
    }

    private void j() {
        LogUtil.a("OfflineMapTabActivity", "startOfflineMapService");
        this.i.postDelayed(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.offlinemap.ui.activity.OfflineMapTabActivity.4
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("OfflineMapTabActivity", "startOfflineMapService run");
                Intent intent = new Intent(OfflineMapTabActivity.this.getApplicationContext(), (Class<?>) OfflineMapService.class);
                intent.setAction("ACTION_OFFLINE_MAP_ACTIVTY_START_AS");
                OfflineMapTabActivity.this.startService(intent);
            }
        }, 200L);
    }

    private void a() {
        LogUtil.a("OfflineMapTabActivity", "registerBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ACTION_MAP_ONDOWNLOAD_SA");
        intentFilter.addAction("ACTION_REFRESH_ACTIVITY_SA");
        intentFilter.addAction("ACTION_INIT_ACTIVITY_SA");
        intentFilter.addAction("ACTION_MAP_ONREMOVE_SA");
        intentFilter.addAction("ACTION_MAP_LOAD_WAIT_SUCCESS_SA");
        iyb.d(this, this.e, intentFilter);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("OfflineMapTabActivity", "onDestroy()");
        super.onDestroy();
        g();
        b();
        this.d.c();
        iyb.a(this, this.e);
    }

    private void g() {
        LogUtil.a("OfflineMapTabActivity", "stopService()");
        iyb.e(getApplicationContext(), new Intent("ACTION_ACITITY_DESTROY_AS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(OfflineMapCityList offlineMapCityList) {
        if (offlineMapCityList == null) {
            LogUtil.e("OfflineMapTabActivity", "updateFragment() mList null");
            return;
        }
        LogUtil.a("OfflineMapTabActivity", "updateFragment()");
        OfflineDownManagerFragment offlineDownManagerFragment = this.f10533c;
        if (offlineDownManagerFragment != null && this.f10531a != null) {
            offlineDownManagerFragment.b(offlineMapCityList.getLoadingCityList(), offlineMapCityList.getDownCityList());
            this.f10531a.e(offlineMapCityList.getProvinceList(), offlineMapCityList.getCityMap());
            LogUtil.a("OfflineMapTabActivity", "updateFragment() fragment not null finish");
            return;
        }
        if (this.g.size() == 0) {
            LogUtil.a("OfflineMapTabActivity", "updateFragment fragmentList.size() == 0");
            return;
        }
        for (Fragment fragment : this.g) {
            if (fragment instanceof OfflineCitiesFragment) {
                OfflineCitiesFragment offlineCitiesFragment = (OfflineCitiesFragment) fragment;
                this.f10531a = offlineCitiesFragment;
                offlineCitiesFragment.e(offlineMapCityList.getProvinceList(), offlineMapCityList.getCityMap());
            } else if (!(fragment instanceof OfflineDownManagerFragment)) {
                LogUtil.e("OfflineMapTabActivity", "fragment is not normal fragment");
            } else {
                OfflineDownManagerFragment offlineDownManagerFragment2 = (OfflineDownManagerFragment) fragment;
                this.f10533c = offlineDownManagerFragment2;
                offlineDownManagerFragment2.b(offlineMapCityList.getLoadingCityList(), offlineMapCityList.getDownCityList());
            }
        }
    }

    static class d extends BroadcastReceiver {
        private final WeakReference<OfflineMapTabActivity> e;

        d(OfflineMapTabActivity offlineMapTabActivity) {
            this.e = new WeakReference<>(offlineMapTabActivity);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("OfflineMapTabActivity", "MyBroadcastReceiver onReceive() intent null");
                return;
            }
            OfflineMapTabActivity offlineMapTabActivity = this.e.get();
            if (offlineMapTabActivity == null) {
                LogUtil.e("OfflineMapTabActivity", "MyBroadcastReceiver onReceive() activity null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("OfflineMapTabActivity", "MyBroadcastReceiver onReceive() action :", action);
            if (!"ACTION_MAP_ONDOWNLOAD_SA".equals(action) || !offlineMapTabActivity.f) {
                if (!"ACTION_REFRESH_ACTIVITY_SA".equals(action)) {
                    if (!"ACTION_INIT_ACTIVITY_SA".equals(action)) {
                        if (!"ACTION_MAP_ONREMOVE_SA".equals(action)) {
                            if (!"ACTION_MAP_LOAD_WAIT_SUCCESS_SA".equals(action)) {
                                LogUtil.e("OfflineMapTabActivity", "OfflineMapService action is", action);
                                return;
                            } else {
                                offlineMapTabActivity.i.sendMessage(offlineMapTabActivity.i.obtainMessage(100, 0, 0, intent));
                                return;
                            }
                        }
                        offlineMapTabActivity.i.sendMessage(offlineMapTabActivity.i.obtainMessage(100, 0, 0, intent));
                        return;
                    }
                    offlineMapTabActivity.f = true;
                    offlineMapTabActivity.i.sendMessage(offlineMapTabActivity.i.obtainMessage(100, 0, 0, intent));
                    return;
                }
                offlineMapTabActivity.i.sendMessage(offlineMapTabActivity.i.obtainMessage(100, 0, 0, intent));
                return;
            }
            offlineMapTabActivity.i.sendMessage(offlineMapTabActivity.i.obtainMessage(100, 0, 0, intent));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
