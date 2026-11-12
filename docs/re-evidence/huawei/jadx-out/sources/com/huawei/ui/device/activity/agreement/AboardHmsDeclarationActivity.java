package com.huawei.ui.device.activity.agreement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.device.R;
import defpackage.lvb;
import defpackage.qsp;
import defpackage.qug;
import defpackage.rbf;
import defpackage.rbg;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class AboardHmsDeclarationActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeclarationAdapter f24175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24176c;
    private String d;
    private List<rbg> e;
    private String f;
    private String g;
    private rbg k;
    private rbg l;
    private rbg n;
    private int m = -1;
    private Handler i = new b(this);
    private BroadcastReceiver h = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.agreement.AboardHmsDeclarationActivity.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                return;
            }
            if ("broadcast_receiver_user_setting".equals(intent.getAction())) {
                LogUtil.a("AboardHmsDeclarationActivity", "onReceive broadcast_receiver_user_setting");
                AboardHmsDeclarationActivity.this.i.removeMessages(1);
                AboardHmsDeclarationActivity.this.finish();
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                if (!(parcelableExtra instanceof DeviceInfo)) {
                    LogUtil.j("AboardHmsDeclarationActivity", "the intent type is not DeviceInfo");
                    return;
                }
                DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                if (TextUtils.isEmpty(AboardHmsDeclarationActivity.this.d) || !AboardHmsDeclarationActivity.this.d.equals(deviceInfo.getDeviceIdentify())) {
                    LogUtil.j("AboardHmsDeclarationActivity", "This broadcast is not sent by the current device");
                    return;
                } else {
                    if (deviceInfo.getDeviceConnectState() == 2) {
                        LogUtil.a("AboardHmsDeclarationActivity", "onReceive connected");
                        AboardHmsDeclarationActivity.this.finish();
                        return;
                    }
                    return;
                }
            }
            LogUtil.a("AboardHmsDeclarationActivity", "onReceive else branch");
        }
    };
    private EventBus.ICallback j = new EventBus.ICallback() { // from class: com.huawei.ui.device.activity.agreement.AboardHmsDeclarationActivity.1
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            if (dVar == null) {
                LogUtil.j("AboardHmsDeclarationActivity", "event is null");
                return;
            }
            Bundle bundleB = dVar.b();
            if (bundleB == null) {
                LogUtil.j("AboardHmsDeclarationActivity", "bundle is null");
                return;
            }
            if ("device_pair_aboard_switch_status".equals(dVar.e())) {
                int i = bundleB.getInt("hms_auto_update", -1);
                if (i != -1) {
                    boolean z = i == 1;
                    AboardHmsDeclarationActivity.this.k.a(z);
                    AboardHmsDeclarationActivity.this.l.a(z);
                    AboardHmsDeclarationActivity.this.f24175b.notifyDataSetChanged();
                }
                LogUtil.a("AboardHmsDeclarationActivity", "action", dVar.e());
            }
        }
    };

    static class b extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<AboardHmsDeclarationActivity> f24178c;

        b(AboardHmsDeclarationActivity aboardHmsDeclarationActivity) {
            this.f24178c = new WeakReference<>(aboardHmsDeclarationActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            AboardHmsDeclarationActivity aboardHmsDeclarationActivity = this.f24178c.get();
            if (aboardHmsDeclarationActivity == null) {
                LogUtil.j("AboardHmsDeclarationActivity", "activity is null");
            } else if (message.what == 1) {
                qug.d(aboardHmsDeclarationActivity.g, 2, 6);
                aboardHmsDeclarationActivity.j();
                LogUtil.a("AboardHmsDeclarationActivity", "handleMessage pair time out");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("AboardHmsDeclarationActivity", "AboardHmsDeclarationActivity onCreate() ");
        this.f24174a = this;
        h();
        f();
        IntentFilter intentFilter = new IntentFilter("broadcast_receiver_user_setting");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(this.f24174a, this.h, intentFilter, LocalBroadcast.f36595c, null);
        EventBus.b(this.j, 1, "device_pair_aboard_switch_status");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Handler handler = this.i;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, 60000L);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.h;
        if (broadcastReceiver != null) {
            BroadcastManagerUtil.d(this.f24174a, broadcastReceiver);
        }
        EventBus.ICallback iCallback = this.j;
        if (iCallback != null) {
            EventBus.a(iCallback, "device_pair_aboard_switch_status");
        }
    }

    private void h() {
        if (getIntent() == null) {
            LogUtil.j("AboardHmsDeclarationActivity", "initData intent is null");
            finish();
            return;
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("declarationBeans");
        if (serializableExtra instanceof List) {
            List list = (List) serializableExtra;
            this.e = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj instanceof rbg) {
                    this.e.add((rbg) obj);
                }
            }
        }
        this.d = getIntent().getStringExtra("pairGuideSelectAddress");
        this.f24176c = getIntent().getStringExtra("device_country_code");
        this.f = getIntent().getStringExtra("device_emui_version");
        this.g = getIntent().getStringExtra("device_name");
        this.m = getIntent().getIntExtra("device_version_type", -1);
        i();
    }

    private void i() {
        this.n = e("hms_statement_head");
        rbg rbgVarE = e("hms_statement_body");
        this.k = rbgVarE;
        rbgVarE.b("huawei_mobile_service_statement");
        this.l = e("hms_auto_update");
        Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "AboardHmsDeclarationActivity");
        if (mapD == null) {
            LogUtil.j("AboardHmsDeclarationActivity", "filter deviceCapabilityMap is null");
            return;
        }
        DeviceCapability deviceCapability = mapD.get(this.d);
        if (deviceCapability != null) {
            this.k.a(deviceCapability.isHmsAutoUpdate());
            this.l.a(deviceCapability.isHmsAutoUpdateWifi());
            LogUtil.a("AboardHmsDeclarationActivity", Boolean.valueOf(deviceCapability.isHmsAutoUpdate()), Boolean.valueOf(deviceCapability.isHmsAutoUpdateWifi()));
            return;
        }
        LogUtil.a("AboardHmsDeclarationActivity", "deviceCapability is null");
    }

    private rbg e(String str) {
        return new rbf().e(qug.a(str, this.f));
    }

    private void f() {
        setContentView(R.layout.activity_aboard_hms_declaration);
        View viewA = qsp.a(this, R.id.aboard_declaration_text_view_back);
        if (viewA != null) {
            viewA.setOnClickListener(this);
        }
        View viewA2 = qsp.a(this, R.id.aboard_declaration_text_view_next);
        if (viewA2 != null) {
            viewA2.setOnClickListener(this);
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.n);
        arrayList.add(this.k);
        c(arrayList);
        ListView listView = (ListView) qsp.a(this, R.id.list_view_content);
        DeclarationAdapter declarationAdapter = new DeclarationAdapter(this, arrayList, this.m);
        this.f24175b = declarationAdapter;
        if (listView != null) {
            listView.setAdapter((ListAdapter) declarationAdapter);
        }
    }

    private void c(List<rbg> list) {
        rbg rbgVar = new rbg();
        rbgVar.a(0);
        rbgVar.h(this.f24174a.getResources().getString(R.string.IDS_startup_aboard_title));
        list.add(0, rbgVar);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.aboard_declaration_text_view_back) {
            finish();
        } else if (view.getId() == R.id.aboard_declaration_text_view_next) {
            g();
        } else {
            LogUtil.a("AboardHmsDeclarationActivity", "onClick() the else branch");
        }
    }

    private void g() {
        ArrayList arrayList = new ArrayList(this.e.size() + 3);
        arrayList.addAll(this.e);
        arrayList.add(this.k);
        arrayList.add(this.l);
        Intent intent = new Intent(this.f24174a, (Class<?>) EnhancementImprovementActivity.class);
        intent.putExtra("declarationBeans", arrayList);
        intent.putExtra("pairGuideSelectAddress", this.d);
        intent.putExtra("device_country_code", this.f24176c);
        intent.putExtra("device_emui_version", this.f);
        intent.putExtra("device_version_type", this.m);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("AboardHmsDeclarationActivity", "enter notify Pair Fail");
        Intent intent = new Intent();
        intent.setAction("broadcast_receiver_user_setting");
        intent.putExtra("error_code", -1);
        intent.putExtra("pairGuideSelectAddress", this.d);
        BroadcastManagerUtil.a(this.f24174a, intent, LocalBroadcast.f36595c, true);
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            LogUtil.j("AboardHmsDeclarationActivity", "dispatchTouchEvent event is null");
            return false;
        }
        if (motionEvent.getAction() == 2) {
            this.i.removeMessages(1);
            this.i.sendEmptyMessageDelayed(1, 60000L);
            LogUtil.a("AboardHmsDeclarationActivity", "timeout is reset");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public rbg a() {
        return this.l;
    }

    public String d() {
        return this.d;
    }

    public String c() {
        return this.f24176c;
    }

    public String e() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
