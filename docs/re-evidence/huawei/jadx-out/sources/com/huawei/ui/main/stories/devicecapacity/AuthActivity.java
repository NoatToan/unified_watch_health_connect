package com.huawei.ui.main.stories.devicecapacity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.wearengine.auth.AuthInfo;
import com.huawei.wearengine.auth.AuthListenerManagerProxy;
import com.huawei.wearengine.auth.HiAppInfo;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.repository.AuthInfoRepositoryImpl;
import com.huawei.wearengine.repository.api.AuthInfoRepository;
import com.huawei.wearengine.service.WearEngineExtendService;
import defpackage.trl;
import defpackage.tro;
import defpackage.trp;
import defpackage.trq;
import defpackage.trv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class AuthActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AuthAdapter f26392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HiAppInfo f26393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26394c;
    private int e;
    private tro g;
    private AuthListenerManagerProxy h;
    private AuthInfoRepository i;
    private CustomTitleBar k;
    private String l;
    private Context m;
    private HealthButton n;
    private Intent o;
    private boolean q;
    private HealthTextView r;
    private String s;
    private HealthRecycleView t;
    private List<AuthInfo> v;
    private String x;
    private List<trp> j = new ArrayList();
    private List<trl> d = new ArrayList();
    private List<Boolean> f = new ArrayList(6);
    private final Map<String, Integer> p = new HashMap(6);

    public interface AuthChangeListener {
        void updateAuth(boolean z);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("AuthActivity", "onCreate");
        setContentView(R.layout.wear_engine_third_part_auth_main_layout);
        this.m = this;
        if (getIntent() == null) {
            LogUtil.j("AuthActivity", "Intent == null!");
            finish();
            return;
        }
        LogUtil.d("AuthActivity", "Intent != null!");
        i();
        j();
        try {
            h();
        } catch (Exception unused) {
            LogUtil.e("AuthActivity", "initData Exception");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("AuthActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        HiAppInfo hiAppInfo = this.f26393b;
        if (hiAppInfo != null) {
            d(hiAppInfo.getPackageName());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        LogUtil.d("AuthActivity", "onBackPressed authListenerOnCancel come from:" + this.l);
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if ("third_party_app".equals(this.l)) {
            LogUtil.d("AuthActivity", "authListenerOnCancel come from:" + this.l);
            try {
                AuthListenerManagerProxy authListenerManagerProxy = this.h;
                if (authListenerManagerProxy != null) {
                    authListenerManagerProxy.authListenerOnCancel(this.f26393b.getPackageName());
                }
            } catch (Exception unused) {
                LogUtil.e("AuthActivity", "authListenerOnCancel Exception");
            }
        }
        setResult(-1, new Intent());
        finish();
    }

    private void i() {
        this.h = new AuthListenerManagerProxy(this.m.getApplicationContext());
        this.g = new tro();
        this.i = new AuthInfoRepositoryImpl(this.m);
        this.o = getIntent();
    }

    private void j() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.wear_engine_third_part_auth_main_recycler_view_id);
        this.t = healthRecycleView;
        if (healthRecycleView != null) {
            healthRecycleView.setLayoutManager(new LinearLayoutManager(this.m));
        }
        this.k = (CustomTitleBar) findViewById(R.id.wear_engine_third_part_auth_title_layout);
        this.r = (HealthTextView) findViewById(R.id.wear_engine_third_part_auth_setting_describe_text_view_id);
        CustomTitleBar customTitleBar = this.k;
        if (customTitleBar != null) {
            customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.devicecapacity.AuthActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AuthActivity.this.e();
                }
            });
        }
        HealthButton healthButton = (HealthButton) findViewById(R.id.wear_engine_auth_confirm_id);
        this.n = healthButton;
        if (healthButton != null) {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.devicecapacity.AuthActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AuthActivity.this.c();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Permission[] permissionArrB = b(this.g.c());
        if ("third_party_app".equals(this.l)) {
            d(permissionArrB);
        } else {
            finish();
        }
    }

    private void d(final Permission[] permissionArr) {
        LogUtil.a("AuthActivity", "execute callAuthListenerOnOk");
        HandlerCenter.a().d(new Runnable() { // from class: trm
            @Override // java.lang.Runnable
            public final void run() {
                this.f49586a.a(permissionArr);
            }
        }, "WearEngine_AuthActivity");
    }

    public /* synthetic */ void a(Permission[] permissionArr) {
        a(c(permissionArr));
    }

    private ArrayList<String> c(Permission[] permissionArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Permission permission : permissionArr) {
            if (permission != null) {
                arrayList.add(permission.getName());
            }
        }
        return arrayList;
    }

    private Permission[] b(Map<String, AuthInfo> map) {
        if (map == null) {
            return new Permission[0];
        }
        ArrayList arrayList = new ArrayList();
        for (AuthInfo authInfo : map.values()) {
            LogUtil.d("AuthActivity", "storyAuthInfo save authInfo:" + authInfo.toString());
            c(authInfo);
            e(arrayList, authInfo);
        }
        List<AuthInfo> list = this.v;
        if (list == null || list.isEmpty()) {
            LogUtil.a("AuthActivity", "storyAuthInfo storedAuthList is null");
            return (Permission[]) arrayList.toArray(new Permission[arrayList.size()]);
        }
        for (AuthInfo authInfo2 : this.v) {
            LogUtil.d("AuthActivity", "storyAuthInfo authInfo:" + authInfo2.toString());
            e(arrayList, authInfo2);
        }
        LogUtil.a("AuthActivity", "storyAuthInfo permissions size:" + arrayList.size());
        return (Permission[]) arrayList.toArray(new Permission[arrayList.size()]);
    }

    private void e(List<Permission> list, AuthInfo authInfo) {
        if (list == null || authInfo == null || authInfo.getOpenStatus() == 0) {
            return;
        }
        list.add(trq.a(authInfo.getPermission()));
    }

    private void c(final AuthInfo authInfo) {
        if (authInfo == null) {
            return;
        }
        LogUtil.d("AuthActivity", "buildUpdateAuthMessage sendMessage");
        HandlerCenter.a().d(new Runnable() { // from class: trj
            @Override // java.lang.Runnable
            public final void run() {
                this.f49582c.a(authInfo);
            }
        }, "WearEngine_AuthActivity");
    }

    private void h() {
        LogUtil.d("AuthActivity", "initData entry");
        f();
        if (this.o.hasExtra("permissionTypes")) {
            LogUtil.d("AuthActivity", "initData hasExtra permissionTypes");
            try {
                String[] stringArrayExtra = this.o.getStringArrayExtra("permissionTypes");
                if (stringArrayExtra == null) {
                    LogUtil.e("AuthActivity", "getStringArrayExtra permissionTypes == null");
                    return;
                }
                HiAppInfo hiAppInfo = (HiAppInfo) this.o.getParcelableExtra(MapKeyNames.APP_INFO);
                if (hiAppInfo == null) {
                    LogUtil.e("AuthActivity", "getParcelableExtra hiAppInfo == null");
                    return;
                }
                LogUtil.d("AuthActivity", "hiAppInfo = " + hiAppInfo.toString());
                String stringExtra = this.o.getStringExtra("come_from");
                this.l = stringExtra;
                if (stringExtra == null) {
                    LogUtil.e("AuthActivity", "can not get come from!");
                    return;
                }
                if ("health_app".equals(stringExtra)) {
                    this.r.setVisibility(8);
                    this.k.setTitleText(this.m.getString(R.string.IDS_wear_engine_third_part_auth_title));
                } else {
                    this.k.setTitleText(this.m.getString(R.string.IDS_wear_engine_auth_title));
                }
                LogUtil.d("AuthActivity", "come from:" + this.l);
                this.f26393b = hiAppInfo;
                this.e = hiAppInfo.getAppId();
                this.x = hiAppInfo.getUserId();
                this.f26394c = hiAppInfo.getAppUid();
                String packageName = hiAppInfo.getPackageName();
                this.s = packageName;
                int iD = trv.d(this.m, packageName);
                this.q = iD <= 5;
                LogUtil.a("AuthActivity", "mIsOldClientLevel:" + this.q + ",clientApiLevel:" + iD);
                b(hiAppInfo);
                b(stringArrayExtra);
            } catch (BadParcelableException unused) {
                LogUtil.e("AuthActivity", " mIntent getStringArray error");
            }
        }
    }

    private void f() {
        this.p.put("device_manager", 1);
        this.p.put("notify", 2);
        this.p.put("wear_user_status", 3);
        this.p.put("sensor", 4);
        this.p.put("motion_sensor", 5);
        this.p.put(PluginPayAdapter.KEY_DEVICE_INFO_SN, 6);
    }

    private void b(HiAppInfo hiAppInfo) {
        byte[] byteDraw = hiAppInfo.getByteDraw();
        if (byteDraw != null) {
            trl trlVar = new trl();
            trlVar.a(0);
            trlVar.a(trv.b(byteDraw));
            this.d.add(trlVar);
        }
    }

    private List<String> a(List<AuthInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.size() == 0) {
            LogUtil.j("AuthActivity", "getStrListFromAuthList authInfoList is invalid");
            return arrayList;
        }
        for (AuthInfo authInfo : list) {
            if (authInfo.getOpenStatus() != 0) {
                arrayList.add(authInfo.getPermission());
            }
        }
        return arrayList;
    }

    private void d(String str) {
        LogUtil.a("AuthActivity", "startWearEngineService");
        Intent intent = new Intent(getBaseContext(), (Class<?>) WearEngineExtendService.class);
        intent.setAction("com.huawei.bone.action.DELETE_AUTH_CACHE");
        intent.putExtra("third_party_package_name", str);
        startService(intent);
    }

    private void b(final String[] strArr) {
        if (strArr == null) {
            return;
        }
        LogUtil.d("AuthActivity", "initData buildPermissionData sendMessage");
        HandlerCenter.a().d(new Runnable() { // from class: tri
            @Override // java.lang.Runnable
            public final void run() {
                this.f49581b.c(strArr);
            }
        }, "WearEngine_AuthActivity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(AuthInfo authInfo) {
        if (authInfo == null) {
            LogUtil.j("AuthActivity", "handleUpdateAuth authInfo == null!");
        } else {
            this.i.updateAuth(authInfo);
        }
    }

    private void a(ArrayList<String> arrayList) {
        Permission[] permissionArrC;
        LogUtil.d("AuthActivity", "callAuthListenerOnOk handleMessage CALL_ON_OK");
        if (arrayList == null) {
            permissionArrC = new Permission[0];
        } else {
            permissionArrC = c(arrayList);
        }
        try {
            LogUtil.d("AuthActivity", "authListenerOnOk PackageName:" + this.f26393b.getPackageName());
            LogUtil.d("AuthActivity", "procName:" + this.m.getPackageManager().getNameForUid(Binder.getCallingUid()));
            AuthListenerManagerProxy authListenerManagerProxy = this.h;
            if (authListenerManagerProxy != null) {
                authListenerManagerProxy.authListenerOnOk(this.f26393b.getPackageName(), permissionArrC);
            }
        } catch (Exception unused) {
            LogUtil.e("AuthActivity", "onOk RemoteException");
        }
        finish();
    }

    private Permission[] c(ArrayList<String> arrayList) {
        if (arrayList.size() <= 0) {
            return new Permission[0];
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(trq.a(arrayList.get(i)));
        }
        return (Permission[]) arrayList2.toArray(new Permission[arrayList2.size()]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(String[] strArr) {
        try {
            if (strArr == null) {
                LogUtil.j("AuthActivity", "buildPermissionData permissionTypes == null");
                return;
            }
            LogUtil.d("AuthActivity", "buildPermissionData permissionTypes");
            this.v = this.i.getAuth(this.f26394c, this.x, this.e);
            a(strArr);
            a();
            HandlerExecutor.c(new Runnable() { // from class: trk
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b();
                }
            });
        } catch (Exception unused) {
            LogUtil.e("AuthActivity", "buildPermissionData Exception:");
        }
    }

    public /* synthetic */ void b() {
        LogUtil.a("AuthActivity", "handleMessage UPDATE_UI");
        d();
    }

    private void a(String[] strArr) {
        this.j.clear();
        int i = 0;
        if ("third_party_app".equals(this.l)) {
            List<AuthInfo> list = this.v;
            if (list == null || list.isEmpty()) {
                LogUtil.d("AuthActivity", "mergePermission storedAuthList isEmpty, permissionType");
                int length = strArr.length;
                while (i < length) {
                    e(strArr[i]);
                    i++;
                }
                return;
            }
            List<String> listA = a(this.v);
            int length2 = strArr.length;
            while (i < length2) {
                String str = strArr[i];
                if (!listA.contains(str)) {
                    LogUtil.d("AuthActivity", "mergePermission storedAuthList not containsKey permissionType = " + str);
                    e(str);
                }
                i++;
            }
        } else {
            List<AuthInfo> list2 = this.v;
            if (list2 == null || list2.isEmpty()) {
                LogUtil.e("AuthActivity", "mergePermission storedAuthList is null");
                return;
            }
            for (AuthInfo authInfo : this.v) {
                this.j.add(new trp(this.m, authInfo.getPermission(), authInfo.getOpenStatus() != 0));
            }
        }
        Collections.sort(this.j, new Comparator() { // from class: trn
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return this.e.e((trp) obj, (trp) obj2);
            }
        });
    }

    public /* synthetic */ int e(trp trpVar, trp trpVar2) {
        if (this.p.containsKey(trpVar.b()) && this.p.containsKey(trpVar2.b())) {
            return this.p.get(trpVar.b()).compareTo(this.p.get(trpVar2.b()));
        }
        return 0;
    }

    private void e(String str) {
        this.j.add(new trp(this.m, str, false));
    }

    private void a() {
        if (this.j.isEmpty()) {
            return;
        }
        trl trlVar = new trl();
        trlVar.a(1);
        trlVar.c(d(this.j));
        this.d.add(trlVar);
        trl trlVar2 = new trl();
        trlVar2.a(2);
        trlVar2.e(this.j);
        this.d.add(trlVar2);
    }

    private boolean d(List<trp> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<trp> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().d()) {
                return false;
            }
        }
        return true;
    }

    private void d() {
        LogUtil.d("AuthActivity", "buildListView");
        try {
            g();
            AuthAdapter authAdapter = new AuthAdapter(this.m);
            this.f26392a = authAdapter;
            authAdapter.d(this.g);
            this.f26392a.c(this.l);
            this.f26392a.c(this.f26393b);
            this.f26392a.e(this.d);
            this.f26392a.d(this.s);
            this.f26392a.c(this.f);
            this.f26392a.b(this.q);
            this.f26392a.b(new AuthChangeListener() { // from class: com.huawei.ui.main.stories.devicecapacity.AuthActivity.2
                @Override // com.huawei.ui.main.stories.devicecapacity.AuthActivity.AuthChangeListener
                public void updateAuth(boolean z) {
                    AuthActivity.this.n.setEnabled(z);
                }
            });
            this.t.setAdapter(this.f26392a);
        } catch (Exception unused) {
            LogUtil.e("AuthActivity", "buildListView Exception");
        }
    }

    private void g() {
        Iterator<trp> it = this.j.iterator();
        while (it.hasNext()) {
            this.f.add(Boolean.valueOf(it.next().d()));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
