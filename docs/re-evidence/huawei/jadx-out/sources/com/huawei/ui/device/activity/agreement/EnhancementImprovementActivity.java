package com.huawei.ui.device.activity.agreement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.lvb;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qug;
import defpackage.quh;
import defpackage.rbf;
import defpackage.rbg;
import defpackage.rbq;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class EnhancementImprovementActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<rbg> f24211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeclarationAdapter f24212c;
    private String[] d;
    private String e;
    private String f;
    private List<rbg> g;
    private List<rbq> h;
    private String j;
    private String m;
    private boolean n = false;
    private boolean k = true;
    private boolean o = false;
    private Handler l = new e(this);
    private int s = -1;
    private BroadcastReceiver i = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.agreement.EnhancementImprovementActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                return;
            }
            LogUtil.a("EnhancementImprovement", "onReceive mDevicePairReceiver:", intent.getAction());
            if ("broadcast_receiver_user_setting".equals(intent.getAction())) {
                LogUtil.a("EnhancementImprovement", "onReceive broadcast_receiver_user_setting");
                EnhancementImprovementActivity.this.l.removeMessages(1);
                EnhancementImprovementActivity.this.finish();
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                DeviceInfo deviceInfoC = qug.c(EnhancementImprovementActivity.this.j, intent);
                if (deviceInfoC != null) {
                    if (TextUtils.isEmpty(EnhancementImprovementActivity.this.j) || !EnhancementImprovementActivity.this.j.equals(deviceInfoC.getDeviceIdentify())) {
                        LogUtil.j("EnhancementImprovement", "This broadcast is not sent by the current device");
                        return;
                    } else {
                        if (deviceInfoC.getDeviceConnectState() == 2) {
                            LogUtil.a("EnhancementImprovement", "onReceive connected");
                            EnhancementImprovementActivity.this.finish();
                            return;
                        }
                        return;
                    }
                }
                LogUtil.j("EnhancementImprovement", "get deviceInfo is error");
                return;
            }
            LogUtil.a("EnhancementImprovement", "onReceive else branch");
        }
    };

    static class e extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<EnhancementImprovementActivity> f24216b;

        e(EnhancementImprovementActivity enhancementImprovementActivity) {
            this.f24216b = new WeakReference<>(enhancementImprovementActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            EnhancementImprovementActivity enhancementImprovementActivity = this.f24216b.get();
            if (enhancementImprovementActivity == null) {
                LogUtil.j("EnhancementImprovement", "handleMessage activity is null");
            } else if (message.what == 1) {
                qug.d(enhancementImprovementActivity.f, 2, 3);
                enhancementImprovementActivity.g();
                LogUtil.a("EnhancementImprovement", "handleMessage pair time out");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("EnhancementImprovement", "EnhancementImprovementActivity onCreate()");
        this.f24210a = this;
        d();
        c();
        IntentFilter intentFilter = new IntentFilter("broadcast_receiver_user_setting");
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        BroadcastManagerUtil.c(this.f24210a, this.i, intentFilter, LocalBroadcast.f36595c, null);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.i;
        if (broadcastReceiver != null) {
            BroadcastManagerUtil.d(this.f24210a, broadcastReceiver);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Handler handler = this.l;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, 60000L);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        Handler handler = this.l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void d() {
        if (getIntent() == null) {
            LogUtil.j("EnhancementImprovement", "initData intent is null");
            return;
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("declarationBeans");
        if (serializableExtra instanceof List) {
            List list = (List) serializableExtra;
            this.f24211b = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj instanceof rbg) {
                    this.f24211b.add((rbg) obj);
                }
            }
        }
        this.j = getIntent().getStringExtra("pairGuideSelectAddress");
        this.e = getIntent().getStringExtra("device_country_code");
        this.m = getIntent().getStringExtra("device_emui_version");
        this.f = getIntent().getStringExtra("device_name");
        this.s = getIntent().getIntExtra("device_version_type", -1);
        b();
    }

    private void j() {
        List<rbg> list = this.g;
        if (list == null || list.isEmpty()) {
            LogUtil.j("EnhancementImprovement", "setCheckedStatus mDeclarationBeans is empty");
            return;
        }
        Iterator<rbg> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().a(this.n);
        }
    }

    private void b() {
        LogUtil.a("EnhancementImprovement", "enhanceSize:", Integer.valueOf(qug.e().length));
        String[] strArrE = qug.e();
        this.d = strArrE;
        int length = strArrE.length + 1;
        this.h = new ArrayList(length);
        this.g = new ArrayList(length);
        List<String> listA = a();
        b(listA);
        Iterator<String> it = listA.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    private List<String> a() {
        ArrayList arrayList = new ArrayList(this.d.length);
        Collections.addAll(arrayList, this.d);
        return arrayList;
    }

    private void b(List<String> list) {
        Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "EnhancementImprovement");
        if (mapD == null) {
            LogUtil.j("EnhancementImprovement", "filter deviceCapabilityMap is null");
            return;
        }
        DeviceCapability deviceCapability = mapD.get(this.j);
        if (deviceCapability != null) {
            int smartWatchVersionTypeValue = deviceCapability.getSmartWatchVersionTypeValue();
            if (smartWatchVersionTypeValue == 0 || smartWatchVersionTypeValue == 1) {
                this.n = false;
                LogUtil.a("EnhancementImprovement", "in china");
                return;
            } else {
                if (smartWatchVersionTypeValue == 2 || smartWatchVersionTypeValue == 3) {
                    list.remove("smart_capabilities");
                    LogUtil.a("EnhancementImprovement", "in abroad");
                    this.n = false;
                    return;
                }
                LogUtil.a("EnhancementImprovement", "in default");
                return;
            }
        }
        LogUtil.a("EnhancementImprovement", "deviceCapability is null");
    }

    private void c(String str) {
        rbq rbqVarA = qug.a(str, this.m);
        if (!TextUtils.isEmpty(rbqVarA.a())) {
            this.h.add(rbqVarA);
        } else {
            LogUtil.j("EnhancementImprovement", "addDeclarationList declaration getFeatureId is empty");
        }
    }

    private void c() {
        setContentView(R.layout.activity_enhancement_improvement);
        View viewA = qsp.a(this, R.id.statusbar);
        RelativeLayout.LayoutParams layoutParamsU = qrs.u(this.f24210a);
        if (viewA != null) {
            viewA.setLayoutParams(layoutParamsU);
        }
        View viewA2 = qsp.a(this, R.id.agreement_declaration_text_view_back);
        if (viewA2 != null) {
            viewA2.setOnClickListener(this);
        }
        View viewA3 = qsp.a(this, R.id.agreement_declaration_text_view_next);
        if (viewA3 != null) {
            viewA3.setOnClickListener(this);
        }
        this.g = new rbf().e(this.h);
        j();
        a(this.g);
        this.f24212c = new DeclarationAdapter(this, this.g, this.s);
        ListView listView = (ListView) qsp.a(this, R.id.list_view_content);
        if (listView != null) {
            listView.setAdapter((ListAdapter) this.f24212c);
        }
    }

    private void a(List<rbg> list) {
        rbg rbgVar = new rbg();
        rbgVar.a(0);
        rbgVar.h(this.f24210a.getResources().getString(R.string.IDS_startup_enhanced_services_and_experience));
        list.add(0, rbgVar);
    }

    private void f() {
        ArrayList arrayList = new ArrayList(this.g.size() + this.f24211b.size());
        arrayList.addAll(this.f24211b);
        arrayList.addAll(this.g);
        LogUtil.a("EnhancementImprovement", "next:", Integer.valueOf(arrayList.size()));
        quh.d(this.j, arrayList);
        HealthTextView healthTextView = (HealthTextView) qsp.a(this, R.id.agreement_declaration_text_view_next);
        if (healthTextView != null) {
            healthTextView.setTextColor(this.f24210a.getResources().getColor(R.color.colorSecondary));
            healthTextView.setEnabled(false);
        }
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(this, R.id.agreement_declaration_text_view_back);
        if (healthTextView2 != null) {
            healthTextView2.setTextColor(this.f24210a.getResources().getColor(R.color.colorSecondary));
            healthTextView2.setEnabled(false);
        }
        this.k = false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.agreement_declaration_text_view_back) {
            if (!this.k) {
                LogUtil.j("EnhancementImprovement", "waiting can not back");
                return;
            } else {
                finish();
                return;
            }
        }
        if (view.getId() == R.id.agreement_declaration_text_view_next) {
            if (qrs.r()) {
                LogUtil.a("EnhancementImprovement", "onClick() isFastClick");
                return;
            }
            if (e()) {
                f();
                return;
            } else if (this.o) {
                f();
                return;
            } else {
                h();
                return;
            }
        }
        LogUtil.a("EnhancementImprovement", "onClick() the else branch");
    }

    private boolean e() {
        while (true) {
            boolean z = true;
            for (rbg rbgVar : this.g) {
                if (!TextUtils.isEmpty(rbgVar.c())) {
                    if (!z || !rbgVar.i()) {
                        z = false;
                    }
                }
            }
            return z;
        }
    }

    private void h() {
        View viewInflate = View.inflate(this.f24210a, R.layout.dialog_layout_single_choice, null);
        HealthCheckBox healthCheckBox = (HealthCheckBox) viewInflate.findViewById(R.id.cbx_single_choice);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        healthCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.agreement.EnhancementImprovementActivity.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Iterator it = EnhancementImprovementActivity.this.g.iterator();
                while (it.hasNext()) {
                    ((rbg) it.next()).a(z);
                }
                EnhancementImprovementActivity.this.f24212c.notifyDataSetChanged();
            }
        });
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f24210a);
        builder.d(viewInflate).a(this.f24210a.getString(R.string.IDS_dialog_checkbox_confirm).toUpperCase(), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.agreement.EnhancementImprovementActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c(this.f24210a.getString(R.string.IDS_dialog_checkbox_cancel).toUpperCase(), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.agreement.EnhancementImprovementActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.d().show();
        this.o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("EnhancementImprovement", "enter notify Pair Fail");
        Intent intent = new Intent();
        intent.setAction("broadcast_receiver_user_setting");
        intent.putExtra("error_code", -1);
        intent.putExtra("pairGuideSelectAddress", this.j);
        BroadcastManagerUtil.a(this.f24210a, intent, LocalBroadcast.f36595c, true);
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            LogUtil.j("EnhancementImprovement", "dispatchTouchEvent event is null");
            return false;
        }
        if (motionEvent.getAction() == 2) {
            this.l.removeMessages(1);
            this.l.sendEmptyMessageDelayed(1, 60000L);
            LogUtil.a("EnhancementImprovement", "timeout is reset");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            LogUtil.j("EnhancementImprovement", "onKeyDown event is null");
            return false;
        }
        if (keyEvent.getKeyCode() != 4 || this.k) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
