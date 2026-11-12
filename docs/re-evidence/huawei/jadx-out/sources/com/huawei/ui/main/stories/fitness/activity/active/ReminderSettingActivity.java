package com.huawei.ui.main.stories.fitness.activity.active;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.fitnessdatatype.ActivityReminder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.active.ReminderSettingActivity;
import defpackage.lxp;
import defpackage.lyv;
import defpackage.mgb;
import defpackage.mgg;
import defpackage.mgi;
import defpackage.mhs;
import defpackage.qhp;
import defpackage.qpx;
import defpackage.qqt;
import defpackage.qre;
import defpackage.qst;
import defpackage.ujq;
import defpackage.ujr;
import defpackage.wvl;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class ReminderSettingActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f26512b;
    private DeviceInfo e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<c> f26513c = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f26511a = new b(this);
    private String d = "";

    public interface SwitchButtonListener {
        void onSwitchClick(c cVar);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_reminder_setting);
        b();
        d();
        a();
    }

    private void d() {
        Intent intent;
        if (qst.c() && (intent = getIntent()) != null) {
            String stringExtra = intent.getStringExtra("device_id");
            this.d = stringExtra;
            if (!TextUtils.isEmpty(stringExtra)) {
                this.e = mgg.b(this.d, "SCUI_ReminderSettingActivity");
            } else {
                DeviceInfo deviceInfoC = mgg.c("SCUI_ReminderSettingActivity");
                this.e = deviceInfoC;
                if (deviceInfoC != null) {
                    this.d = deviceInfoC.getDeviceIdentify();
                }
            }
            LogUtil.a("SCUI_ReminderSettingActivity", "initExtraData: ", CommonUtil.n(this.d));
        }
    }

    private void a() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("900200004");
        arrayList.add("900200010");
        arrayList.add("900200011");
        arrayList.add("900200021");
        qhp.c(arrayList, new e());
    }

    private void b() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.switch_recycle);
        d dVar = new d(new SwitchButtonListener() { // from class: ttg
            @Override // com.huawei.ui.main.stories.fitness.activity.active.ReminderSettingActivity.SwitchButtonListener
            public final void onSwitchClick(ReminderSettingActivity.c cVar) {
                this.f49632a.e(cVar);
            }
        });
        this.f26512b = dVar;
        healthRecycleView.setAdapter(dVar);
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this));
        this.f26513c.add(new c("900200004"));
        if (!Utils.o() || wvl.a()) {
            this.f26513c.add(new c("900200010"));
            this.f26513c.add(new c("900200011"));
        }
        if (ujr.a()) {
            this.f26513c.add(new c("900200021"));
        }
        this.f26512b.a(this.f26513c);
    }

    public /* synthetic */ void e(c cVar) {
        String strD = cVar.d();
        boolean zE = cVar.e();
        LogUtil.a("SCUI_ReminderSettingActivity", "RemindSwitchAdapter onClick", strD, "statue ", Boolean.valueOf(zE));
        if ("900200021".equals(strD) && !zE) {
            c(cVar);
        } else {
            c(strD, zE);
        }
    }

    private void c(final c cVar) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
        builder.a(R.string.IDS_active_task_dialog_close_title).b(R.string.IDS_active_task_dialog_close_text).a(R.string.IDS_active_task_dialog_close_button, new View.OnClickListener() { // from class: ttf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.ReminderSettingActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                cVar.b(true);
                ReminderSettingActivity.this.f26512b.a(ReminderSettingActivity.this.f26513c);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void e(View view) {
        c("900200021", false);
    }

    private void c(String str, boolean z) {
        LogUtil.a("SCUI_ReminderSettingActivity", "changeSwitchAndSend, configId is ", str, ", switchStatus is ", Boolean.valueOf(z));
        if (qst.c() && "900200004".equals(str) && c()) {
            c(z);
        }
        qhp.b(str, z);
    }

    public boolean c() {
        DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
        if (deviceFeatureSupportApi == null) {
            LogUtil.j("SCUI_ReminderSettingActivity", "featureSupportApi  is null");
            return false;
        }
        DeviceInfo deviceInfo = this.e;
        if (deviceInfo == null) {
            LogUtil.j("SCUI_ReminderSettingActivity", "isActivityReminder mDeviceInfo is null");
            return false;
        }
        return deviceFeatureSupportApi.isActivityReminder(deviceInfo);
    }

    public void d(boolean z) {
        if (!qst.c()) {
            LogUtil.j("SCUI_ReminderSettingActivity", "old NewDeviceUi");
            return;
        }
        if (!c()) {
            LogUtil.j("SCUI_ReminderSettingActivity", "not support ActivityReminder");
        } else if (mgb.d(this.d) == 2) {
            b(z);
        } else {
            a(z);
        }
    }

    private void a(final boolean z) {
        mhs.a().getSwitchSetting("custom.activity_reminder", new IBaseResponseCallback() { // from class: tte
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f49631b.a(z, i, obj);
            }
        });
    }

    public /* synthetic */ void a(boolean z, int i, Object obj) {
        ReleaseLogUtil.d("R_SCUI_ReminderSettingActivity", "getSwitchSetting errorCode:", Integer.valueOf(i));
        boolean z2 = true;
        if (i == 0 && (obj instanceof String)) {
            try {
                String strReplaceAll = (String) obj;
                if (strReplaceAll.contains(k.g)) {
                    LogUtil.a("SCUI_ReminderSettingActivity", "showReminderItem info contains enable");
                    strReplaceAll = strReplaceAll.replaceAll(k.g, "isEnable");
                }
                boolean zIsEnabled = ((ActivityReminder) new Gson().fromJson(strReplaceAll, ActivityReminder.class)).isEnabled();
                try {
                    ReleaseLogUtil.d("R_SCUI_ReminderSettingActivity", "showReminderItem isEnable ", Boolean.valueOf(zIsEnabled));
                    z2 = zIsEnabled;
                } catch (JsonSyntaxException unused) {
                    z2 = zIsEnabled;
                    LogUtil.e("SCUI_ReminderSettingActivity", "showReminderItem JsonSyntaxException");
                }
            } catch (JsonSyntaxException unused2) {
            }
        }
        if (Objects.equals(Boolean.valueOf(z), Boolean.valueOf(z2))) {
            LogUtil.j("SCUI_ReminderSettingActivity", "newstatus equal isStatusEnable");
        } else {
            LogUtil.a("SCUI_ReminderSettingActivity", " support FAMILY_PAIR_MODE");
            c(z);
        }
    }

    private void b(boolean z) {
        String strE = SharedPreferenceManager.e(this, String.valueOf(10008), "custom.activity_reminder");
        if (Objects.equals(Boolean.valueOf(z), Boolean.valueOf(TextUtils.isEmpty(strE) ? true : Boolean.parseBoolean(strE)))) {
            LogUtil.j("SCUI_ReminderSettingActivity", "newstatus equal ischeck");
        } else {
            c(z);
        }
    }

    private void c(boolean z) {
        ReleaseLogUtil.d("R_SCUI_ReminderSettingActivity", "setActivityReminder isChecked", Boolean.valueOf(z));
        if (mgb.d(this.d) == 2) {
            LogUtil.a("SCUI_ReminderSettingActivity", "is family mode");
            SharedPreferenceManager.e(this, String.valueOf(10008), "custom.activity_reminder", Boolean.toString(z), null);
        } else {
            mhs.a().setSwitchSetting("custom.activity_reminder", e(z), new IBaseResponseCallback() { // from class: ttc
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.d.e(i, obj);
                }
            });
        }
        ActivityReminder activityReminder = new ActivityReminder();
        activityReminder.setEnabled(z);
        byte[] bArrC = lxp.c(activityReminder);
        if (mgg.d("SCUI_ReminderSettingActivity") != null) {
            LogUtil.a("03", 1, "SCUI_ReminderSettingActivity", "sendSetSwitchSettingCmd enter", activityReminder);
            mhs.a().sendSetSwitchSettingCmd(bArrC, "", 7, 7);
        } else {
            LogUtil.j("SCUI_ReminderSettingActivity", "sendSetSwitchSettingCmd getConnectDeviceInfo is null");
        }
        if (mgi.d("SCUI_ReminderSettingActivity") != null) {
            LogUtil.a("03", 1, "SCUI_ReminderSettingActivity", "sendSetSwitchSettingCmd Aw70 enter", activityReminder);
            mhs.a().sendSetSwitchSettingCmd(bArrC, lyv.a(), 7, 7);
        } else {
            LogUtil.j("SCUI_ReminderSettingActivity", "sendSetSwitchSettingCmd HwGetAw70DeviceInfoUtil.getConnectDeviceInfo is null");
        }
    }

    public /* synthetic */ void e(int i, Object obj) {
        ReleaseLogUtil.d("R_SCUI_ReminderSettingActivity", "setActivityReminder errorCode is ", Integer.valueOf(i));
        if (i != 0) {
            runOnUiThread(new Runnable() { // from class: ttd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49630a.e();
                }
            });
        }
    }

    public /* synthetic */ void e() {
        qpx.b(this, R.string.IDS_music_management_operation_failed);
    }

    private String e(boolean z) {
        ActivityReminder activityReminder = new ActivityReminder();
        activityReminder.setEnabled(z);
        return qqt.b(activityReminder);
    }

    static class b extends BaseHandler<ReminderSettingActivity> {
        b(ReminderSettingActivity reminderSettingActivity) {
            super(reminderSettingActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ReminderSettingActivity reminderSettingActivity, Message message) {
            if (message.what != 101) {
                ReleaseLogUtil.e("R_SCUI_ReminderSettingActivity", "message is ", Integer.valueOf(message.what));
                return;
            }
            Object obj = message.obj;
            if (obj instanceof HashMap) {
                HashMap map = (HashMap) obj;
                for (c cVar : reminderSettingActivity.f26513c) {
                    String str = (String) map.get(cVar.d());
                    if (!TextUtils.isEmpty(str)) {
                        cVar.b("1".equals(str));
                        if ("900200004".equals(cVar.d())) {
                            reminderSettingActivity.d("1".equals(str));
                        }
                    }
                }
                reminderSettingActivity.f26512b.a(reminderSettingActivity.f26513c);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        for (c cVar : this.f26513c) {
            ujq.a(1, cVar.d(), cVar.e());
        }
        b bVar = this.f26511a;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages(null);
            this.f26511a = null;
        }
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<ReminderSettingActivity> f26518c;

        private e(ReminderSettingActivity reminderSettingActivity) {
            this.f26518c = new WeakReference<>(reminderSettingActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("SCUI_ReminderSettingActivity", "onResponse: ", obj == null ? null : obj.toString());
            ReminderSettingActivity reminderSettingActivity = this.f26518c.get();
            if (reminderSettingActivity == null) {
                LogUtil.j("SCUI_ReminderSettingActivity", "onResponse: activity is null");
                return;
            }
            if (!(obj instanceof HashMap)) {
                LogUtil.j("SCUI_ReminderSettingActivity", "onResponse: objData is not instanceof HashMap");
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            messageObtain.obj = (HashMap) obj;
            reminderSettingActivity.f26511a.sendMessage(messageObtain);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f26515b = true;
        private final String d;

        c(String str) {
            this.d = str;
        }

        public String d() {
            return this.d;
        }

        public boolean e() {
            return this.f26515b;
        }

        public void b(boolean z) {
            this.f26515b = z;
        }
    }

    public static class d extends BaseRecyclerAdapter<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SwitchButtonListener f26516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<c> f26517c;

        d(SwitchButtonListener switchButtonListener) {
            super(new ArrayList(), R.layout.reminder_setting_item);
            this.f26517c = new ArrayList();
            this.f26516b = switchButtonListener;
        }

        @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void convert(RecyclerHolder recyclerHolder, int i, final c cVar) {
            if (recyclerHolder == null || cVar == null) {
                ReleaseLogUtil.e("R_SCUI_ReminderSettingActivity", "convert holder ", recyclerHolder, " itemData ", cVar, " position ", Integer.valueOf(i));
                return;
            }
            SwitchType switchType = SwitchType.getSwitchType(cVar.d());
            if (switchType == null) {
                ReleaseLogUtil.a("R_SCUI_ReminderSettingActivity", "type is null ");
                return;
            }
            if (i == this.f26517c.size() - 1) {
                recyclerHolder.d(R.id.switch_divider).setVisibility(8);
            } else {
                recyclerHolder.d(R.id.switch_divider).setVisibility(0);
            }
            HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.reminder_switch_title);
            HealthTextView healthTextView2 = (HealthTextView) recyclerHolder.d(R.id.reminder_switch_description);
            final HealthSwitchButton healthSwitchButton = (HealthSwitchButton) recyclerHolder.d(R.id.reminder_switch_btn);
            healthTextView.setText(switchType.getTitle());
            healthTextView2.setText(switchType.getDescription());
            healthSwitchButton.setChecked(cVar.e());
            healthSwitchButton.setOnClickListener(new View.OnClickListener() { // from class: ttk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49639a.c(cVar, healthSwitchButton, view);
                }
            });
        }

        public /* synthetic */ void c(c cVar, HealthSwitchButton healthSwitchButton, View view) {
            cVar.b(healthSwitchButton.isChecked());
            SwitchButtonListener switchButtonListener = this.f26516b;
            if (switchButtonListener != null) {
                switchButtonListener.onSwitchClick(cVar);
            }
        }

        public void a(List<c> list) {
            this.f26517c = list;
            refreshDataChange(list);
        }
    }

    enum SwitchType {
        MOTION_REMIND(R.string.IDS_settings_moving_remind, R.string.IDS_stood_up_remind_description),
        GUIDE_REMIND(R.string.IDS_progress_remind, R.string.IDS_progress_remind_description),
        ACHIEVE_REMIND(R.string.IDS_achieve_remind, R.string.IDS_achieve_remind_description),
        TASK_REMIND(R.string.IDS_active_task_switch, R.string.IDS_active_task_switch_description),
        MOTION_REMIND_WHEEL(R.string.IDS_setting_wheel_remind_body, R.string.IDS_wheel_remind_description);

        private final int mDescriptionId;
        private final int mTitleId;

        SwitchType(int i, int i2) {
            this.mTitleId = i;
            this.mDescriptionId = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getTitle() {
            return qre.f(this.mTitleId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getDescription() {
            if (MOTION_REMIND.equals(this) || MOTION_REMIND_WHEEL.equals(this)) {
                return qre.a(this.mDescriptionId, UnitUtil.e(1.0d, 1, 0));
            }
            return qre.f(this.mDescriptionId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:21:0x003a  */
        public static SwitchType getSwitchType(String str) {
            byte b2;
            str.hashCode();
            switch (str) {
                case "900200004":
                    b2 = 0;
                    break;
                case "900200010":
                    b2 = 1;
                    break;
                case "900200011":
                    b2 = 2;
                    break;
                case "900200021":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                if (WheelChairStateManager.a().d()) {
                    return MOTION_REMIND_WHEEL;
                }
                return MOTION_REMIND;
            }
            if (b2 == 1) {
                return GUIDE_REMIND;
            }
            if (b2 == 2) {
                return ACHIEVE_REMIND;
            }
            if (b2 != 3) {
                return null;
            }
            return TASK_REMIND;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
