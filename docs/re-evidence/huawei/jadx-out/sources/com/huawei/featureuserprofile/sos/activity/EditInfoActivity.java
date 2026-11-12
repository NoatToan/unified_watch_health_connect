package com.huawei.featureuserprofile.sos.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.me.UserInfoExplainActivity;
import com.huawei.featureuserprofile.sos.fragment.EditEmergencyInfoFragment;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.cxz;
import defpackage.qre;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class EditInfoActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f5668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NoTitleCustomAlertDialog f5669c;
    private ArrayList<String> d = new ArrayList<>(16);
    private CustomTitleBar e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        setContentView(R.layout.edit_activity_layout);
        this.f5668b = this;
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e(this.f5669c);
    }

    private void e(NoTitleCustomAlertDialog noTitleCustomAlertDialog) {
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            return;
        }
        noTitleCustomAlertDialog.dismiss();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void loadApplicationTheme() {
        if (getTheme() == null) {
            LogUtil.j("EditInfoActivity", "loadApplicationTheme theme is null");
            return;
        }
        int identifier = getResources().getIdentifier("HealthTheme", TtmlNode.TAG_STYLE, getPackageName());
        if (identifier == 0) {
            LogUtil.a("EditInfoActivity", "styleId is DEFAULT_THEME_ID");
        } else {
            LogUtil.a("EditInfoActivity", "styleId is ", Integer.valueOf(identifier));
            setTheme(identifier);
        }
    }

    private void d() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.edit_info_title_bar);
        this.e = customTitleBar;
        customTitleBar.setRightButtonVisibility(0);
        this.e.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        this.e.setLeftButtonVisibility(0);
        this.e.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.activity.EditInfoActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EditInfoActivity.this.finish();
            }
        });
        a();
    }

    private void a() {
        this.d.add(BaseApplication.getContext().getString(R.string.IDS_clear_all));
        this.d.add(qre.f(R.string.IDS_fitness_core_sleep_explain_title));
        this.e.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.activity.EditInfoActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                new PopViewList(EditInfoActivity.this.f5668b, EditInfoActivity.this.e, EditInfoActivity.this.d).b(new PopViewList.PopViewClickListener() { // from class: com.huawei.featureuserprofile.sos.activity.EditInfoActivity.2.5
                    @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
                    public void setOnClick(int i) {
                        if (i == 0) {
                            EditInfoActivity.this.c();
                        } else if (i == 1) {
                            EditInfoActivity.this.startActivity(new Intent(EditInfoActivity.this, (Class<?>) UserInfoExplainActivity.class).putExtra("key_jump_from", 1));
                        } else {
                            LogUtil.j("EditInfoActivity", "position not match");
                        }
                    }
                });
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Window window;
        if (cxz.a(this) && (window = getWindow()) != null) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 5890);
        }
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("EditInfoActivity", "showClearAllDialog ", "enter");
        if (this.f5669c == null) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f5668b);
            builder.b(R.string.IDS_clear_all_message).c(R.string.IDS_clear, new View.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.activity.EditInfoActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    EditInfoActivity.this.b();
                }
            }).a(R.string.IDS_emergency_cancel, new View.OnClickListener() { // from class: com.huawei.featureuserprofile.sos.activity.EditInfoActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("EditInfoActivity", "Canceling the deletion of all information");
                }
            });
            this.f5669c = builder.c();
        }
        this.f5669c.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        EmergencyInfoManager.a().c();
        EditEmergencyInfoFragment editEmergencyInfoFragment = (EditEmergencyInfoFragment) getFragmentManager().findFragmentById(R.id.editinfofragment);
        if (editEmergencyInfoFragment != null) {
            editEmergencyInfoFragment.d();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
