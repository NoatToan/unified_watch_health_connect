package com.huawei.ui.main.stories.devicecapacity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.wearengine.auth.AuthInfo;
import com.huawei.wearengine.auth.HiAppInfo;
import com.huawei.wearengine.repository.AppInfoRepositoryImpl;
import com.huawei.wearengine.repository.AuthInfoRepositoryImpl;
import com.huawei.wearengine.repository.api.AppInfoRepository;
import com.huawei.wearengine.repository.api.AuthInfoRepository;
import com.huawei.wearengine.scope.ScopeInfo;
import com.huawei.wearengine.scope.ScopeInfoResponse;
import com.huawei.wearengine.scope.ScopeManager;
import com.huawei.wearengine.scope.ScopeServerRequest;
import com.huawei.wearengine.utills.WearEngineReflectUtil;
import defpackage.qpx;
import defpackage.trv;
import defpackage.ykx;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class DeviceCapacityThirdPartyListActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AuthInfoRepository f26415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f26416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f26417c;
    private List<HiAppInfo> d;
    private AppInfoRepository e;
    private ThirdPartAppAdapter g;
    private LinearLayout h;
    private HealthRecycleView i;
    private volatile boolean j = true;
    private final String[][] f = {new String[]{"com.huawei.hiwear.devicemanager", "device_manager"}, new String[]{"com.huawei.hiwear.notification", "notify"}, new String[]{"com.huawei.hiwear.sensors", "sensor"}, new String[]{"com.huawei.hiwear.motionsensor", "motion_sensor"}, new String[]{"com.huawei.hiwear.wearuserstatus", "wear_user_status"}, new String[]{"com.huawei.hiwear.devicesn", PluginPayAdapter.KEY_DEVICE_INFO_SN}};

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.wear_engine_third_part_auth_app_list_layout);
        d();
        b();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.d("DeviceCapacityThirdPartyListActivity", "requestCode = " + i);
        if (i != 1001) {
            return;
        }
        this.j = true;
    }

    private void d() {
        this.f26416b = (LinearLayout) findViewById(R.id.wear_engine_third_party_have_app_layout_id);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.wear_engine_third_part_auth_app_recycler_view_id);
        this.i = healthRecycleView;
        healthRecycleView.b(false);
        this.i.e(false);
        this.h = (LinearLayout) findViewById(R.id.wear_engine_third_party_not_have_app_layout_id);
    }

    private void b() {
        this.f26417c = this;
        this.d = new ArrayList();
        HandlerCenter.a().d(new Runnable() { // from class: trs
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a();
            }
        }, "WearEngine_DeviceCapacityThirdPartyListActivity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.e = new AppInfoRepositoryImpl(this.f26417c);
        this.f26415a = new AuthInfoRepositoryImpl(this.f26417c);
        try {
            List<HiAppInfo> allHiAppInfo = this.e.getAllHiAppInfo();
            if (ykx.b().isEmpty() && allHiAppInfo != null) {
                LogUtil.j("DeviceCapacityThirdPartyListActivity", "hiWearDevices is null and appInfoList is not null");
                allHiAppInfo.clear();
            }
            c(WearEngineReflectUtil.getUserId(this.f26417c), allHiAppInfo);
            HandlerExecutor.c(new Runnable() { // from class: trr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49592c.e();
                }
            });
        } catch (Exception e) {
            LogUtil.e("DeviceCapacityThirdPartyListActivity", "handleAppInfo Exception:", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HiAppInfo hiAppInfo) {
        try {
            if (hiAppInfo == null) {
                LogUtil.j("DeviceCapacityThirdPartyListActivity", "handleAuthInfo appInfo == null");
                this.j = true;
                return;
            }
            Intent intent = new Intent();
            intent.setClassName(this.f26417c.getPackageName(), "com.huawei.ui.main.stories.devicecapacity.AuthActivity");
            intent.setPackage(this.f26417c.getPackageName());
            LogUtil.d("DeviceCapacityThirdPartyListActivity", "handleAuthInfo appInfo is: ", hiAppInfo.toString());
            String[] strArrB = b(hiAppInfo);
            if (strArrB != null && strArrB.length != 0) {
                intent.putExtra("third_party_package_name", hiAppInfo.getPackageName());
                intent.putExtra(MapKeyNames.APP_INFO, hiAppInfo);
                intent.putExtra("permissionTypes", strArrB);
                intent.putExtra("come_from", "health_app");
                startActivityForResult(intent, 1001);
                return;
            }
            LogUtil.j("DeviceCapacityThirdPartyListActivity", "handleAuthInfo permissionTypes is empty");
            this.j = true;
        } catch (Exception e) {
            LogUtil.e("DeviceCapacityThirdPartyListActivity", "handleAuthInfo Exception:", e);
            this.j = true;
        }
    }

    private void c(String str, List<HiAppInfo> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            LogUtil.e("DeviceCapacityThirdPartyListActivity", "handleAppInfoList appinfoList is null");
            return;
        }
        for (HiAppInfo hiAppInfo : list) {
            if (c(hiAppInfo) && e(str, hiAppInfo)) {
                String strB = trv.b(this.f26417c, hiAppInfo.getPackageName());
                if (!TextUtils.isEmpty(strB)) {
                    LogUtil.d("DeviceCapacityThirdPartyListActivity", "handleAppInfoList appInfo is :", hiAppInfo.toString());
                    hiAppInfo.setAppName(strB);
                    this.d.add(hiAppInfo);
                }
            } else if (!c(hiAppInfo)) {
                this.e.deleteAppInfo(hiAppInfo.getKey());
                this.f26415a.deleteAuth(hiAppInfo.getAppUid(), hiAppInfo.getUserId(), hiAppInfo.getAppId());
            } else {
                LogUtil.d("DeviceCapacityThirdPartyListActivity", "handleAppInfoList appInfo invalid");
            }
        }
    }

    private boolean c(HiAppInfo hiAppInfo) {
        if (hiAppInfo == null) {
            return false;
        }
        String[] packagesForUid = this.f26417c.getPackageManager().getPackagesForUid(hiAppInfo.getAppUid());
        return packagesForUid != null && Arrays.asList(packagesForUid).contains(hiAppInfo.getPackageName()) && trv.a(this.f26417c, hiAppInfo.getPackageName()) == hiAppInfo.getAppId();
    }

    private boolean e(String str, HiAppInfo hiAppInfo) {
        return (hiAppInfo == null || TextUtils.isEmpty(str) || !str.equals(hiAppInfo.getUserId())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        List<HiAppInfo> list = this.d;
        if (list == null || list.isEmpty()) {
            LogUtil.j("DeviceCapacityThirdPartyListActivity", "addThirdPartyAppsInView list null");
            this.f26416b.setVisibility(8);
            this.h.setVisibility(0);
            return;
        }
        this.f26416b.setVisibility(0);
        this.h.setVisibility(8);
        this.i.setLayoutManager(new LinearLayoutManager(this));
        this.g = new ThirdPartAppAdapter(this.d, this.f26417c);
        LogUtil.d("DeviceCapacityThirdPartyListActivity", "addThirdPartyAppsInView mAppInfoList size = " + this.d.size());
        this.g.d(new AnonymousClass5());
        this.i.setAdapter(this.g);
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.devicecapacity.DeviceCapacityThirdPartyListActivity$5, reason: invalid class name */
    public class AnonymousClass5 implements ThirdPartAppAdapter.ItemClickListener {
        AnonymousClass5() {
        }

        @Override // com.huawei.ui.main.stories.devicecapacity.ThirdPartAppAdapter.ItemClickListener
        public void onItemClick(View view, int i) {
            LogUtil.d("DeviceCapacityThirdPartyListActivity", "appInfo onItemClick position = " + i);
            if (i < 0 || i >= DeviceCapacityThirdPartyListActivity.this.d.size()) {
                return;
            }
            if (DeviceCapacityThirdPartyListActivity.this.j) {
                final HiAppInfo hiAppInfo = (HiAppInfo) DeviceCapacityThirdPartyListActivity.this.d.get(i);
                LogUtil.d("DeviceCapacityThirdPartyListActivity", "ItemClick sendMessage");
                HandlerCenter.a().d(new Runnable() { // from class: trx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49597c.c(hiAppInfo);
                    }
                }, "WearEngine_DeviceCapacityThirdPartyListActivity");
            }
            DeviceCapacityThirdPartyListActivity.this.j = false;
        }

        public /* synthetic */ void c(HiAppInfo hiAppInfo) {
            DeviceCapacityThirdPartyListActivity.this.e(hiAppInfo);
        }
    }

    private String[] b(HiAppInfo hiAppInfo) {
        if (hiAppInfo == null) {
            return new String[0];
        }
        AuthInfoRepositoryImpl authInfoRepositoryImpl = new AuthInfoRepositoryImpl(this.f26417c);
        this.f26415a = authInfoRepositoryImpl;
        List<AuthInfo> auth = authInfoRepositoryImpl.getAuth(hiAppInfo.getAppUid(), hiAppInfo.getUserId(), hiAppInfo.getAppId());
        if (auth == null || auth.isEmpty()) {
            if (!CommonUtil.ab(this.f26417c.getApplicationContext())) {
                LogUtil.a("DeviceCapacityThirdPartyListActivity", "getPermissionTypes no network!");
                qpx.e(this.f26417c.getApplicationContext(), R.string.IDS_connect_network);
                return new String[0];
            }
            LogUtil.d("DeviceCapacityThirdPartyListActivity", "getPermissionTypes authInfoList is null");
            return e(hiAppInfo.getAppId());
        }
        ArrayList arrayList = new ArrayList(auth.size());
        for (AuthInfo authInfo : auth) {
            LogUtil.d("DeviceCapacityThirdPartyListActivity", "getPermissionTypes AuthInfo is :", hiAppInfo.toString());
            arrayList.add(authInfo.getPermission());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private String[] e(int i) {
        if (i == 0) {
            return new String[0];
        }
        String strValueOf = String.valueOf(i);
        String url = new ScopeServerRequest(strValueOf).getUrl(WearEngineReflectUtil.getGrsUrl(this.f26417c));
        ScopeManager scopeManager = new ScopeManager(this.f26417c);
        scopeManager.setScopeServerUrl(strValueOf, url);
        ScopeInfoResponse scope = scopeManager.getScope(strValueOf, "wearEngine");
        if (scope == null) {
            return new String[0];
        }
        LogUtil.d("DeviceCapacityThirdPartyListActivity", "getPermissionByScope scopeInfoResponse is :", scope.toString());
        return d(scope);
    }

    private String[] d(ScopeInfoResponse scopeInfoResponse) {
        if (scopeInfoResponse == null) {
            return new String[0];
        }
        List<ScopeInfo> scopes = scopeInfoResponse.getScopes();
        if (scopes == null || scopes.isEmpty()) {
            LogUtil.e("DeviceCapacityThirdPartyListActivity", "getPermissionByScopeInfoResponse scopeInfoList is null");
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (ScopeInfo scopeInfo : scopes) {
            LogUtil.d("DeviceCapacityThirdPartyListActivity", "getPermissionByScopeInfoResponse scopeInfo is :", scopeInfo.toString());
            List<String> permissions = scopeInfo.getPermissions();
            if (permissions != null && !permissions.isEmpty()) {
                b(arrayList, permissions);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private void b(List<String> list, List<String> list2) {
        for (String[] strArr : this.f) {
            if (strArr != null && strArr.length >= 2 && list2.contains(strArr[0])) {
                list.add(strArr[1]);
                return;
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
