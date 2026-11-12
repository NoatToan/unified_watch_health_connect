package com.huawei.ui.main.stories.me.activity.thirdparty;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.RopeCloudAuthManager;
import com.huawei.hms.hihealth.HuaweiHiHealth;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.me.activity.thirdparty.adapter.ThirdPartAccountAuthAdapter;
import com.huawei.up.utils.Utils;
import defpackage.ecu;
import defpackage.edc;
import defpackage.eee;
import defpackage.eeq;
import defpackage.eey;
import defpackage.fwp;
import defpackage.qpx;
import defpackage.qrk;
import defpackage.qsp;
import defpackage.vvq;
import defpackage.wjo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class HealthKitThirdPartyAccountAuthActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f28479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private wjo f28480c;
    private String d;
    private String e;
    private Set<Integer> g;
    private CustomTitleBar h;
    private HealthButton k;
    private String l;
    private Intent m;
    private RelativeLayout n;
    private String o;
    private String p;
    private HealthRecycleView r;
    private ThirdPartAccountAuthAdapter t;
    private List<vvq> i = new ArrayList(10);
    private List<Boolean> f = new ArrayList(10);
    private HashMap<String, String> s = new HashMap<>();
    private Handler j = new Handler() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAccountAuthActivity.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                return;
            }
            if (message.what == 0) {
                HealthKitThirdPartyAccountAuthActivity.this.b();
                return;
            }
            if (message.what == 1) {
                HealthKitThirdPartyAccountAuthActivity.this.l();
                HealthKitThirdPartyAccountAuthActivity.this.finish();
            } else if (message.what == 2) {
                HealthKitThirdPartyAccountAuthActivity.this.c();
            } else {
                LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "handle message.what");
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_third_party_account_auth);
        if (getIntent() == null) {
            finish();
            return;
        }
        this.m = getIntent();
        e();
        n();
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAccountAuthActivity.4
            @Override // java.lang.Runnable
            public void run() {
                HealthKitThirdPartyAccountAuthActivity.this.p = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015);
                HealthKitThirdPartyAccountAuthActivity.this.f28480c = new wjo(BaseApplication.getContext(), HealthKitThirdPartyAccountAuthActivity.this.p);
                HealthKitThirdPartyAccountAuthActivity.this.h();
                LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "get userAT: ", HealthKitThirdPartyAccountAuthActivity.this.p);
            }
        });
        g();
        d();
    }

    private void d() {
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAccountAuthActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean zD;
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                for (vvq vvqVar : HealthKitThirdPartyAccountAuthActivity.this.i) {
                    if (!vvqVar.d()) {
                        String strA = vvqVar.a();
                        HealthKitThirdPartyAccountAuthActivity healthKitThirdPartyAccountAuthActivity = HealthKitThirdPartyAccountAuthActivity.this;
                        String strD = healthKitThirdPartyAccountAuthActivity.d((HashMap<String, String>) healthKitThirdPartyAccountAuthActivity.s, strA);
                        if (!Utils.isEmpty(strD)) {
                            arrayList.add(strD);
                            sb.append(strD);
                            sb.append(" ");
                            LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "Click confirm button at ", strD, " ", strA);
                        }
                    }
                }
                if (Utils.isEmpty(HealthKitThirdPartyAccountAuthActivity.this.p)) {
                    LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "accessToken is null.", HealthKitThirdPartyAccountAuthActivity.this.f28478a);
                    HealthKitThirdPartyAccountAuthActivity.this.finish();
                }
                if (HealthKitThirdPartyAccountAuthActivity.this.f28480c == null) {
                    LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "cloudAuthUtil is null.", HealthKitThirdPartyAccountAuthActivity.this.f28478a);
                    HealthKitThirdPartyAccountAuthActivity.this.finish();
                }
                if (arrayList.size() == HealthKitThirdPartyAccountAuthActivity.this.s.size()) {
                    zD = HealthKitThirdPartyAccountAuthActivity.this.f28480c.d(HealthKitThirdPartyAccountAuthActivity.this.p, ProfileRequestConstants.DELETE_TYPE, HealthKitThirdPartyAccountAuthActivity.this.f28480c.e(HealthKitThirdPartyAccountAuthActivity.this.f28478a));
                    LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "Cancle all authorization.", HealthKitThirdPartyAccountAuthActivity.this.f28478a);
                } else {
                    boolean zA = HealthKitThirdPartyAccountAuthActivity.this.f28480c.a(HealthKitThirdPartyAccountAuthActivity.this.p, ProfileRequestConstants.DELETE_TYPE, HealthKitThirdPartyAccountAuthActivity.this.f28480c.a(HealthKitThirdPartyAccountAuthActivity.this.f28478a, sb.toString().trim()));
                    LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "Cancle partial authorization.", sb.toString().trim());
                    zD = zA;
                }
                if (zD) {
                    HealthKitThirdPartyAccountAuthActivity.this.j();
                }
                HuaweiHiHealth.clearCache();
                Intent intent = new Intent();
                intent.putExtra("activity", "auth");
                HealthKitThirdPartyAccountAuthActivity.this.setResult(-1, intent);
                if (arrayList.size() > 0) {
                    RopeCloudAuthManager.a(HealthKitThirdPartyAccountAuthActivity.this.f28478a);
                }
                HealthKitThirdPartyAccountAuthActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "sendEventToDevice");
        if (CollectionUtils.a(this.g)) {
            LogUtil.j("HealthKitThirdPartyAccountAuthActivity", "DeviceTypes is empty");
            return;
        }
        if (!this.g.contains(14)) {
            LogUtil.j("HealthKitThirdPartyAccountAuthActivity", "DeviceTypes is err");
            return;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "HealthKitThirdPartyAccountAuthActivity");
        if (!eey.d(deviceInfo, 311)) {
            LogUtil.j("HealthKitThirdPartyAccountAuthActivity", "Device Capability err");
            return;
        }
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.healthservicekit");
        eeeVar.setWearPkgName("hw.wearable.healthservicekit");
        eeeVar.setCommandId(2);
        eeeVar.a(800400017L);
        eeeVar.a(0);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packageName", this.o);
        } catch (JSONException unused) {
            LogUtil.j("HealthKitThirdPartyAccountAuthActivity", "JSONException");
        }
        eeeVar.e(eeq.c(eeq.a(jSONObject.toString())));
        edc.e().sendSampleEventCommand(deviceInfo, eeeVar, "HealthKitThirdPartyAccountAuthActivity");
    }

    private void e() {
        this.f28479b = (LinearLayout) qsp.a(this, R.id.auth_layout);
        this.n = (RelativeLayout) qsp.a(this, R.id.list_load_progress);
        this.h = (CustomTitleBar) qsp.a(this, R.id.tb_third_party_account_auth);
        this.r = (HealthRecycleView) qsp.a(this, R.id.rv_third_part_account_auth);
        this.k = (HealthButton) qsp.a(this, R.id.hw_show_confirm);
    }

    private void g() {
        this.r.setLayoutManager(new LinearLayoutManager(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            if (this.m.hasExtra("app_id")) {
                this.f28478a = this.m.getStringExtra("app_id");
            }
            Uri uriB = AppRouterUtils.b(this.m);
            if (uriB != null) {
                this.f28478a = uriB.getQueryParameter("app_id");
            }
            String str = this.f28478a;
            if (str != null) {
                LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "initData(): mAppId = ", str);
                fwp fwpVarA = a(this.f28478a);
                if (fwpVarA == null) {
                    this.j.sendEmptyMessage(1);
                    LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "scopeLangItem is null.");
                } else {
                    this.d = fwpVarA.b();
                    this.o = fwpVarA.a();
                    Set<Integer> setE = fwpVarA.e();
                    this.g = setE;
                    LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "mDeviceTypes:", setE);
                    this.e = qrk.b(Long.parseLong(fwpVarA.d()) * 1000);
                    this.l = fwpVarA.c();
                    f();
                }
                this.j.sendEmptyMessage(2);
            }
        } catch (NumberFormatException unused) {
            LogUtil.d("HealthKitThirdPartyAccountAuthActivity", "Exception in initData");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        qpx.e(getBaseContext(), R.string.IDS_hwh_ali_sport_net_error);
    }

    private fwp a(String str) {
        String strD = this.f28480c.d(String.valueOf(str), this.f28480c.a());
        LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "Get scopeLangItemUrl in ThirdPartServiceActivity: ", strD);
        fwp fwpVarC = this.f28480c.c(this.p, "GET", strD);
        if (fwpVarC != null && fwpVarC.j() != null) {
            LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "scopeLangItem get successfully.");
            this.s.putAll(fwpVarC.j());
        }
        return fwpVarC;
    }

    private void i() {
        Iterator<vvq> it = this.i.iterator();
        while (it.hasNext()) {
            this.f.add(Boolean.valueOf(it.next().g()));
        }
    }

    private void f() {
        a();
        this.j.sendEmptyMessage(0);
    }

    private void a() {
        this.i.add(new vvq(0, this.e, this.l, true, 2));
        this.i.add(new vvq(3, getString(R.string.IDS_hw_show_main_health_page_healthdata_bloodpresure_select), true, false, 2));
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        for (Map.Entry<String, String> entry : this.s.entrySet()) {
            if (e(entry.getKey()) == 0) {
                arrayList.add(entry);
            } else if (e(entry.getKey()) == 1) {
                arrayList2.add(entry);
            } else {
                LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "Invaild permission.");
            }
        }
        e(arrayList, 0);
        e(arrayList2, 1);
    }

    public int e(String str) {
        if (str == null || str.length() < 8) {
            return 2;
        }
        return (str.substring(str.length() + (-4)).equals("read") || str.substring(str.length() - 8).equals("readonly")) ? 0 : 1;
    }

    private void e(List<Map.Entry<String, String>> list, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            Map.Entry<String, String> entry = list.get(i2);
            boolean z = true;
            this.i.add(new vvq(1, entry.getValue(), true, i2 == 0, i));
            if (i2 != 0) {
                z = false;
            }
            LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "Constants: ", Integer.valueOf(i), " isFirst: ", Boolean.valueOf(z), " ScopeUrl: ", entry.getKey(), " desc: ", entry.getValue());
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        i();
        this.f28479b.setVisibility(0);
        this.h.setTitleText(this.d);
        ThirdPartAccountAuthAdapter thirdPartAccountAuthAdapter = new ThirdPartAccountAuthAdapter(this.i, this.d, this.f);
        this.t = thirdPartAccountAuthAdapter;
        thirdPartAccountAuthAdapter.d(new ThirdPartAccountAuthAdapter.CheckButtonClickListener() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAccountAuthActivity.2
            @Override // com.huawei.ui.main.stories.me.activity.thirdparty.adapter.ThirdPartAccountAuthAdapter.CheckButtonClickListener
            public void onCheckButtonClick(int i, boolean z, List<vvq> list) {
                HealthKitThirdPartyAccountAuthActivity.this.i = list;
                if (z) {
                    HealthKitThirdPartyAccountAuthActivity.this.k.setEnabled(true);
                } else {
                    HealthKitThirdPartyAccountAuthActivity.this.k.setEnabled(false);
                }
            }
        });
        this.r.setAdapter(this.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(HashMap<String, String> map, String str) {
        String str2 = null;
        if (map == null) {
            return null;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().equals(str)) {
                str2 = key;
            }
        }
        return str2;
    }

    private void n() {
        RelativeLayout relativeLayout;
        if (isFinishing() || (relativeLayout = this.n) == null) {
            return;
        }
        relativeLayout.setVisibility(0);
        LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "mLoadingDialog.show()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        RelativeLayout relativeLayout = this.n;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
            LogUtil.a("HealthKitThirdPartyAccountAuthActivity", "destroy mLoadingDialog");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
