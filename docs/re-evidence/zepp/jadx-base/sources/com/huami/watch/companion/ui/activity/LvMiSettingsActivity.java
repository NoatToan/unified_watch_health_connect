package com.huami.watch.companion.ui.activity;

import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.watch.companion.R;
import com.huami.watch.companion.cloud.api.NoticeSettingApi;
import com.huami.watch.companion.config.LvMiConfig;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Box;
import com.xmlywind.sdk.common.mta.PointCategory;

/* JADX INFO: loaded from: classes16.dex */
public class LvMiSettingsActivity extends AppCompatActivity implements View.OnClickListener {
    private Switch a;
    private DialogFragment b;

    private void dismissLoadDialog() {
        DialogFragment dialogFragment = this.b;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Context context, String str, boolean z, Boolean bool) {
        dismissLoadDialog();
        if (!bool.booleanValue()) {
            Toast.makeText(context, getString(R.string.failed_str, new Object[]{str}), 0).show();
        } else {
            Toast.makeText(context, getString(R.string.success_str, new Object[]{str}), 0).show();
            Analytics.event(this, AnalyticsEvents.EVENT_STATUS_LVMI_ALARM_SWITCH, z ? 1 : 0);
        }
    }

    private void g(final Context context, final boolean z) {
        final String string = z ? getString(R.string.device_tip_bt_open) : getString(R.string.close_str);
        showLoadDialog(getString(R.string.ing_str, new Object[]{string}));
        NoticeSettingApi.setNoticeEnable(context, z, new NoticeSettingApi.NoticeStatusListener() { // from class: xt4
            @Override // com.huami.watch.companion.cloud.api.NoticeSettingApi.NoticeStatusListener
            public final void onNoticeStatusChange(Object obj) {
                this.a.f(context, string, z, (Boolean) obj);
            }
        });
    }

    private void h() {
        AlertDialog.setTitle(getString(R.string.open_notice_no_author_title, new Object[]{getString(R.string.lvmi_str)})).setMessage(getString(R.string.lvmi_notice_no_author_msg)).setNeutralBtn(getString(R.string.btn_known)).show(getFragmentManager(), "Neutral");
    }

    private void initView() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(getString(R.string.lvmi_name));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: wt4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e(view);
            }
        });
        findViewById(R.id.setting_type).setOnClickListener(this);
        findViewById(R.id.layout_switch).setOnClickListener(this);
        Switch r0 = (Switch) findViewById(R.id.enable_lvmi_notice);
        this.a = r0;
        r0.setOnClickListener(this);
        boolean z = false;
        if (LvMiConfig.isAlreadyAuthor() && Box.get().getBoolean(UserSettingsKeys.LVMI_NOTICE_KEY, false)) {
            z = true;
        }
        this.a.setChecked(z);
    }

    private void showLoadDialog(String str) {
        this.b = LoadingDialog.setMessage(str).setCancelable(false).show(getFragmentManager(), PointCategory.LOAD);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.setting_type) {
            startActivity(new Intent(this, (Class<?>) LvMiSupportNoticeListActivity.class));
            return;
        }
        if (id != R.id.layout_switch && id == R.id.enable_lvmi_notice) {
            if (LvMiConfig.isAlreadyAuthor()) {
                g(this, this.a.isChecked());
            } else {
                h();
                this.a.setChecked(false);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lv_mi_settings);
        initView();
    }
}
