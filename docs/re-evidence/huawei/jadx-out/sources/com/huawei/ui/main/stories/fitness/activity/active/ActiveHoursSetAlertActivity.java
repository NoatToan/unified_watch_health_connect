package com.huawei.ui.main.stories.fitness.activity.active;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.MotionEvent;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.iov;
import defpackage.qhp;
import defpackage.qre;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class ActiveHoursSetAlertActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f26501c;
    private LinearLayout d;
    private HealthTextView e;
    private HealthSwitchButton h;
    private CustomTitleBar j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26500b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f26499a = new b(this);

    public static void c(Context context) {
        iov.d(context, new Intent(context, (Class<?>) ActiveHoursSetAlertActivity.class));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_active_hours_set_alert);
        b();
        c();
        a();
    }

    private void b() {
        this.j = (CustomTitleBar) findViewById(R.id.ctb_set_alert_title);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_moving_remind);
        this.d = linearLayout;
        this.e = (HealthTextView) linearLayout.findViewById(R.id.reminder_switch_title);
        this.f26501c = (HealthTextView) this.d.findViewById(R.id.reminder_switch_description);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) this.d.findViewById(R.id.reminder_switch_btn);
        this.h = healthSwitchButton;
        healthSwitchButton.setChecked(true);
    }

    private void c() {
        this.j.setTitleText(getString(R.string.IDS_temperature_warning_set));
        this.j.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.common_transparent));
        this.e.setText(e());
        this.f26501c.setText(d());
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900200004");
        qhp.c(arrayList, new a());
    }

    private String e() {
        if (WheelChairStateManager.a().d()) {
            return qre.f(R.string.IDS_setting_wheel_remind_body);
        }
        return qre.f(R.string.IDS_settings_moving_remind);
    }

    private String d() {
        String strE = UnitUtil.e(1.0d, 1, 0);
        if (WheelChairStateManager.a().d()) {
            return qre.a(R.string.IDS_wheel_remind_description, strE);
        }
        return qre.a(R.string.IDS_stood_up_remind_description, strE);
    }

    private void a() {
        this.h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.ActiveHoursSetAlertActivity$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.d.b(compoundButton, z);
            }
        });
    }

    /* synthetic */ void b(CompoundButton compoundButton, boolean z) {
        if (!this.f26500b) {
            LogUtil.d("SCUI_ActiveHoursSetAlertActivity", "onCheckedChangeListener, mIsClickScreen is false");
        } else {
            LogUtil.a("SCUI_ActiveHoursSetAlertActivity", "initListener mStandToggle isChecked is ", Boolean.valueOf(z));
            qhp.b("900200004", z);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f26500b = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        KnitActiveHoursActivity.d("3");
        b bVar = this.f26499a;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages(null);
            this.f26499a = null;
        }
    }

    static class b extends BaseHandler<ActiveHoursSetAlertActivity> {
        b(ActiveHoursSetAlertActivity activeHoursSetAlertActivity) {
            super(activeHoursSetAlertActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ActiveHoursSetAlertActivity activeHoursSetAlertActivity, Message message) {
            if (message.what == 101) {
                Object obj = message.obj;
                if (obj instanceof HashMap) {
                    activeHoursSetAlertActivity.a((HashMap) obj);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashMap<String, String> map) {
        if (map == null) {
            com.huawei.hwlogsmodel.LogUtil.a("SCUI_ActiveHoursSetAlertActivity", "setSwitchButton, switchStatusMap is null");
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.a("SCUI_ActiveHoursSetAlertActivity", "setSwitchButton, switchStatusMap is ", map);
        if (map.containsKey("900200004")) {
            this.h.setChecked("1".equals(map.get("900200004")));
        }
    }

    static class a implements IBaseResponseCallback {
        private final WeakReference<ActiveHoursSetAlertActivity> d;

        private a(ActiveHoursSetAlertActivity activeHoursSetAlertActivity) {
            this.d = new WeakReference<>(activeHoursSetAlertActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            com.huawei.hwlogsmodel.LogUtil.a("SCUI_ActiveHoursSetAlertActivity", "onResponse: ", obj == null ? null : obj.toString());
            ActiveHoursSetAlertActivity activeHoursSetAlertActivity = this.d.get();
            if (activeHoursSetAlertActivity == null) {
                com.huawei.hwlogsmodel.LogUtil.j("SCUI_ActiveHoursSetAlertActivity", "onResponse: activity is null");
                return;
            }
            if (!(obj instanceof HashMap)) {
                com.huawei.hwlogsmodel.LogUtil.j("SCUI_ActiveHoursSetAlertActivity", "onResponse: objData is not instanceof HashMap");
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            messageObtain.obj = (HashMap) obj;
            activeHoursSetAlertActivity.f26499a.sendMessage(messageObtain);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
