package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.dialog.CustomDeviceSelectDialog;
import com.huawei.health.device.ui.dialog.DeviceCheckAdapter;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseActivity;
import com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dmp;
import defpackage.dru;
import defpackage.eqr;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class CourseEquipmentConnectActivity extends BaseActivity implements View.OnClickListener, JumpConnectHelper.JumpActivityHandleInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomDeviceSelectDialog f9055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9056b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f9057c;
    private HealthDevice.HealthDeviceKind d;
    private ArrayList<ContentValues> e;
    private HealthButton h;
    private int i;
    private IndoorEquipManagerApi j;

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initViewController() {
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initData() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Suggestion_CourseEquipmentConnectActivity", "getIntent is null");
            return;
        }
        this.f9056b = intent.getIntExtra("KEY_INTENT_EQUIPMENT_TYPE", 0);
        this.i = intent.getIntExtra("KEY_INTENT_COURSE_ENTRANCE", 0);
        JumpConnectHelper.c().d().e("Suggestion_CourseEquipmentConnectActivity", new WeakReference<>(this));
        this.j = (IndoorEquipManagerApi) Services.b("PluginLinkIndoorEquip", IndoorEquipManagerApi.class);
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initLayout() {
        setContentView(R.layout.activity_fitness_device_connect);
        this.h = (HealthButton) findViewById(R.id.btn_start_connect_paired);
        findViewById(R.id.btn_start_connect_paired).setOnClickListener(this);
        findViewById(R.id.btn_start_connect_new).setOnClickListener(this);
        this.f9057c = (HealthTextView) findViewById(R.id.connect_tips);
        if (qrs.ah(getApplicationContext())) {
            this.f9057c.setText(getResources().getText(R.string.IDS_course_pad_connect_content_tip));
        } else {
            this.f9057c.setText(getResources().getText(R.string.IDS_course_device_connect_content_tip));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c();
    }

    private void c() {
        int i = this.f9056b;
        if (i == 1) {
            this.e = dmp.d().c(HealthDevice.HealthDeviceKind.HDK_TREADMILL);
            this.d = HealthDevice.HealthDeviceKind.HDK_TREADMILL;
        } else if (i == 2) {
            this.e = dmp.d().c(HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE);
            this.d = HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE;
        } else {
            this.d = null;
            LogUtil.j("Suggestion_CourseEquipmentConnectActivity", "getBondedDevices() courseEquipmentTyp:", Integer.valueOf(i));
        }
        if (njy.b(this.e)) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.c(500)) {
            LogUtil.j("Suggestion_CourseEquipmentConnectActivity", "view click too fast.");
            return;
        }
        if (view.getId() == R.id.btn_start_connect_paired) {
            if (this.e.size() == 1) {
                d(this.e.get(0));
                return;
            } else {
                e();
                return;
            }
        }
        if (view.getId() == R.id.btn_start_connect_new) {
            JumpConnectHelper.c().g();
        } else {
            LogUtil.a("Suggestion_CourseEquipmentConnectActivity", "click button");
        }
    }

    private void d(ContentValues contentValues) {
        if (contentValues == null) {
            ReleaseLogUtil.a("Suggestion_CourseEquipmentConnectActivity", "startIndoorEquipment bondedDevice null.");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this, "com.huawei.indoorequip.activity.IndoorEquipConnectedActivity");
        intent.putExtra("PAYLOAD_FROM_NFC", eqr.a().c(contentValues));
        intent.putExtra("KEY_INTENT_COURSE_ENTRANCE", this.i);
        intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", eqr.a().a(this.f9056b));
        String asString = contentValues.getAsString("uniqueId");
        if (this.j.isDeviceBtConnected() && !TextUtils.isEmpty(asString) && asString.equals(this.j.getCurrentMacAddress())) {
            intent.putExtra(WorkoutRecord.Extend.COURSE_TARGET_TYPE, 6);
        }
        startActivity(intent);
    }

    private void b(int i) {
        String string;
        if (i == 1) {
            string = getApplicationContext().getResources().getString(R.string.IDS_course_treadmill_nonmatch_content);
        } else if (i != 2) {
            LogUtil.j("Suggestion_CourseEquipmentConnectActivity", "Course equipmentType", Integer.valueOf(i));
            string = "";
        } else {
            string = getApplicationContext().getResources().getString(R.string.IDS_course_bicycle_nonmatch_content);
        }
        if (TextUtils.isEmpty(string)) {
            LogUtil.a("Suggestion_CourseEquipmentConnectActivity", "showTipDialog content is null");
            return;
        }
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this).d(R.string.IDS_course_device_nonmatch_dialog_title).e(string).a(R.string.IDS_course_device_nonmatch_dialog_ok, new DialogInterface.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CourseEquipmentConnectActivity.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                CourseEquipmentConnectActivity.this.finish();
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper.JumpActivityHandleInterface
    public void showEquipmentMatchTip(int i) {
        if (i != 0) {
            b(i);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.JumpConnectHelper.JumpActivityHandleInterface
    public void startLongCoachAfter() {
        finish();
    }

    private void e() {
        if (this.d == null) {
            LogUtil.j("Suggestion_CourseEquipmentConnectActivity", "showDeviceSelectDialog mCurrentDeviceKind is null");
            return;
        }
        CustomDeviceSelectDialog customDeviceSelectDialogB = new CustomDeviceSelectDialog.Builder(this).d(R.string.IDS_plugin_device_select).d(this.d).e(R.string.IDS_main_time_line_start_workout, new DeviceCheckAdapter.OnItemClickListener() { // from class: hfg
            @Override // com.huawei.health.device.ui.dialog.DeviceCheckAdapter.OnItemClickListener
            public final void onItemClick(dru druVar) {
                this.f36702b.c(druVar);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.CourseEquipmentConnectActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (CourseEquipmentConnectActivity.this.f9055a != null) {
                    CourseEquipmentConnectActivity.this.f9055a.dismiss();
                    CourseEquipmentConnectActivity.this.f9055a = null;
                } else {
                    LogUtil.j("Suggestion_CourseEquipmentConnectActivity", "showDeviceSelectDialog setNegativeButton mUnbindDialog is null");
                }
            }
        }).b();
        this.f9055a = customDeviceSelectDialogB;
        customDeviceSelectDialogB.setCancelable(false);
        this.f9055a.show();
    }

    public /* synthetic */ void c(dru druVar) {
        CustomDeviceSelectDialog customDeviceSelectDialog = this.f9055a;
        if (customDeviceSelectDialog != null) {
            customDeviceSelectDialog.dismiss();
            this.f9055a = null;
            d(druVar.d());
            return;
        }
        LogUtil.j("Suggestion_CourseEquipmentConnectActivity", "showDeviceSelectDialog setPositiveButton mUnbindDialog is null");
    }

    private void d() {
        LogUtil.a("Suggestion_CourseEquipmentConnectActivity", "release()");
        JumpConnectHelper.c().d().d("Suggestion_CourseEquipmentConnectActivity");
        JumpConnectHelper.c().j();
    }

    @Override // android.app.Activity
    public void finish() {
        LogUtil.a("Suggestion_CourseEquipmentConnectActivity", "finish()");
        super.finish();
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
