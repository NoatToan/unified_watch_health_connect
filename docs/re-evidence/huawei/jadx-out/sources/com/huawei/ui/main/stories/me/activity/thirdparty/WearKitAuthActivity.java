package com.huawei.ui.main.stories.me.activity.thirdparty;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.WearKitPermission;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.main.R;
import defpackage.njy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class WearKitAuthActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSwitchButton f28497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HiAppInfo f28498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthSwitchButton f28499c;
    private HealthSwitchButton d;
    private HealthSwitchButton g;
    private CompoundButton.OnCheckedChangeListener i;
    private List<HealthSwitchButton> j;
    private boolean h = false;
    private Handler e = new a(this);

    static class a extends Handler {
        private final WeakReference<WearKitAuthActivity> e;

        a(WearKitAuthActivity wearKitAuthActivity) {
            this.e = new WeakReference<>(wearKitAuthActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            WearKitAuthActivity wearKitAuthActivity = this.e.get();
            if (wearKitAuthActivity == null) {
                return;
            }
            LogUtil.a("WearKitAuthActivity", "mHandler msg.what = ", Integer.valueOf(message.what));
            if (message.what == 1000) {
                for (WearKitPermission wearKitPermission : (List) message.obj) {
                    if (wearKitPermission != null) {
                        boolean z = wearKitPermission.getAllow() == 1;
                        int scopeId = wearKitPermission.getScopeId();
                        if (scopeId == 1) {
                            wearKitAuthActivity.d.setChecked(z);
                        } else if (scopeId == 2) {
                            wearKitAuthActivity.f28497a.setChecked(z);
                        } else if (scopeId == 3) {
                            wearKitAuthActivity.g.setChecked(z);
                        }
                    }
                }
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wear_kit_auth);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        try {
            this.f28498b = (HiAppInfo) intent.getParcelableExtra(MapKeyNames.APP_INFO);
            this.h = intent.getBooleanExtra("logo", false);
        } catch (Exception e) {
            LogUtil.e("WearKitAuthActivity", "Exception: ", e.getClass().getSimpleName());
            this.f28498b = null;
        }
        if (this.f28498b == null) {
            LogUtil.j("WearKitAuthActivity", "mHiAppInfo == null");
            finish();
        } else {
            a();
        }
    }

    private void a() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hw_wear_kit_logo);
        if (this.h) {
            linearLayout.setVisibility(0);
        }
        g();
        c();
        this.i = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.WearKitAuthActivity.2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                WearKitAuthActivity.this.d.setChecked(z);
                WearKitAuthActivity.this.f28497a.setChecked(z);
                WearKitAuthActivity.this.g.setChecked(z);
            }
        };
        j();
        d();
    }

    private void g() {
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.hw_wear_kit_device_list_allow);
        String str = String.format(Locale.ENGLISH, getResources().getString(R.string.IDS_hw_wear_kit_auth), this.f28498b.getAppName());
        LogUtil.d("WearKitAuthActivity", "text = ", str);
        healthSubHeader.setHeadTitleText(str);
    }

    private void c() {
        this.f28499c = (HealthSwitchButton) findViewById(R.id.hw_wear_kit_switch_all);
        this.d = (HealthSwitchButton) findViewById(R.id.hw_wear_kit_device_list);
        this.f28497a = (HealthSwitchButton) findViewById(R.id.hw_wear_kit_info_switch);
        this.g = (HealthSwitchButton) findViewById(R.id.hw_wear_kit_message_switch);
        b();
    }

    private void b() {
        ArrayList arrayList = new ArrayList(10);
        this.j = arrayList;
        arrayList.add(this.d);
        this.j.add(this.f28497a);
        this.j.add(this.g);
    }

    private void j() {
        this.f28499c.setOnCheckedChangeListener(this.i);
        d(this.d, 1);
        d(this.f28497a, 2);
        d(this.g, 3);
    }

    private void d(HealthSwitchButton healthSwitchButton, final int i) {
        healthSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.WearKitAuthActivity.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                WearKitAuthActivity wearKitAuthActivity = WearKitAuthActivity.this;
                wearKitAuthActivity.e(wearKitAuthActivity.f28498b, i, z);
                WearKitAuthActivity.this.d(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (!z && this.f28499c.isChecked()) {
            this.f28499c.setOnCheckedChangeListener(null);
            this.f28499c.setChecked(false);
            this.f28499c.setOnCheckedChangeListener(this.i);
        }
        if (z && !this.f28499c.isChecked() && e()) {
            this.f28499c.setChecked(true);
        }
    }

    private boolean e() {
        Iterator<HealthSwitchButton> it = this.j.iterator();
        while (it.hasNext()) {
            if (!it.next().isChecked()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HiAppInfo hiAppInfo, int i, boolean z) {
        if (hiAppInfo == null) {
            LogUtil.j("WearKitAuthActivity", "changeAuth hiAppInfo null");
        } else {
            HiHealthNativeApi.a(this).updateWearKitPermission(hiAppInfo.getAppId(), i, z, new HiDataOperateListener() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.WearKitAuthActivity.3
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i2, Object obj) {
                    if (i2 == 0) {
                        LogUtil.a("WearKitAuthActivity", "changeAuth success");
                    } else {
                        LogUtil.j("WearKitAuthActivity", "changeAuth fail");
                    }
                }
            });
        }
    }

    private void d() {
        HiHealthNativeApi.a(this).queryWearKitPermission(this.f28498b.getAppId(), new HiDataOperateListener() { // from class: com.huawei.ui.main.stories.me.activity.thirdparty.WearKitAuthActivity.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                if (!(obj instanceof List)) {
                    LogUtil.j("WearKitAuthActivity", "checkStatus obj not list");
                    return;
                }
                List list = (List) obj;
                if (njy.e(list)) {
                    LogUtil.j("WearKitAuthActivity", "checkStatus list empty");
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 1000;
                messageObtain.obj = list;
                WearKitAuthActivity.this.e.sendMessage(messageObtain);
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
