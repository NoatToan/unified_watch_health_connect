package com.huawei.ui.main.stories.me.views.privacy;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.flowlayout.HealthFlowLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.me.views.builder.LabelBuilder;
import com.huawei.ui.main.stories.me.views.builder.PrivacyClickableSpan;
import defpackage.inr;
import defpackage.iny;
import defpackage.inz;
import defpackage.qle;
import defpackage.qpx;
import defpackage.vwd;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class MyLikeMgrActivity extends BaseActivity implements LabelBuilder.LabelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f28557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f28558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f28559c;
    private HealthTextView e;
    private RelativeLayout f;
    private HealthTextView g;
    private HealthSubHeader j;
    private HealthFlowLayout l;
    private HealthFlowLayout o;
    private int h = 1;
    private final List<inz> k = Collections.synchronizedList(new ArrayList());
    private final e d = new e(this);
    private final List<inz> i = Collections.synchronizedList(new ArrayList());

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_like_manager);
        clearBackgroundDrawable();
        this.f28559c = this;
        d();
        vwd.c(0, "m0", "", new String[]{"main_page"}, new String[]{""});
    }

    private void d() {
        this.f28558b = (CustomTitleBar) findViewById(R.id.privacy_my_like_titlebar);
        this.g = (HealthTextView) findViewById(R.id.htv_privacy_issues);
        this.e = (HealthTextView) findViewById(R.id.htv_dial_market_guidance);
        this.o = (HealthFlowLayout) findViewById(R.id.selected_flow_layout);
        this.l = (HealthFlowLayout) findViewById(R.id.unselected_flow_layout);
        this.f28557a = (HealthButton) findViewById(R.id.hb_like_save);
        this.f = (RelativeLayout) findViewById(R.id.rel_loading);
        ((HealthSubHeader) findViewById(R.id.label_title)).setSubHeaderBackgroundColor(ContextCompat.getColor(this, R.color.transparent));
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.sub_title_my_like);
        this.j = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(this, R.color.transparent));
        ((HealthSubHeader) findViewById(R.id.sub_title_recommended)).setSubHeaderBackgroundColor(ContextCompat.getColor(this, R.color.transparent));
        LabelBuilder labelBuilder = new LabelBuilder(this, R.drawable.ic_public_cancel_3, this);
        LabelBuilder labelBuilder2 = new LabelBuilder(this, 0, this);
        this.o.setTextViewBuilder(labelBuilder);
        this.l.setTextViewBuilder(labelBuilder2);
        PrivacyClickableSpan privacyClickableSpan = new PrivacyClickableSpan(this, 0);
        privacyClickableSpan.c(new PrivacyClickableSpan.PrivacyClickable() { // from class: vxf
            @Override // com.huawei.ui.main.stories.me.views.builder.PrivacyClickableSpan.PrivacyClickable
            public final void onClick(int i) {
                vwd.c(1, "related_notes", "privacy_page", new String[]{"main_page"}, new String[]{""});
            }
        });
        String string = getString(R.string.IDS_hwh_personal_recommend_privacy_issues_start);
        String string2 = getString(R.string.IDS_hwh_personal_recommend_privacy_issues_middle);
        String string3 = getString(R.string.IDS_hwh_personal_recommend_privacy_issues_end);
        String string4 = getString(R.string.IDS_hwh_personal_recommend_privacy_issues, new Object[]{string, string2, string3});
        SpannableString spannableString = new SpannableString(string4);
        spannableString.setSpan(privacyClickableSpan, string.length(), string4.length() - string3.length(), 33);
        this.g.setMovementMethod(LinkMovementMethod.getInstance());
        this.g.setText(spannableString);
        a();
        b();
        e();
    }

    private void a() {
        if (Utils.o()) {
            this.e.setVisibility(8);
            return;
        }
        this.e.setVisibility(0);
        PrivacyClickableSpan privacyClickableSpan = new PrivacyClickableSpan(this, 3);
        privacyClickableSpan.c(new PrivacyClickableSpan.PrivacyClickable() { // from class: vxb
            @Override // com.huawei.ui.main.stories.me.views.builder.PrivacyClickableSpan.PrivacyClickable
            public final void onClick(int i) {
                vwd.c(1, "related_notes", "theme_interest_settings", new String[]{"main_page"}, new String[]{""});
            }
        });
        String string = getString(R.string.IDS_watch_face_recommendation_middle);
        String string2 = getString(R.string.IDS_watch_face_recommendation_content, new Object[]{string});
        SpannableString spannableString = new SpannableString(string2);
        int iIndexOf = string2.indexOf(string);
        int iIndexOf2 = string2.indexOf(string);
        int length = string.length();
        if (iIndexOf != -1) {
            spannableString.setSpan(privacyClickableSpan, iIndexOf, iIndexOf2 + length, 33);
        }
        this.e.setMovementMethod(LinkMovementMethod.getInstance());
        this.e.setText(spannableString);
    }

    private void e() {
        this.f28558b.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: vxd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        this.f28557a.setOnClickListener(new View.OnClickListener() { // from class: vxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51673a.b(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        c();
    }

    public /* synthetic */ void b(View view) {
        this.f.setVisibility(0);
        iny.c(this.i, new ResultCallback<CloudCommonReponse>() { // from class: com.huawei.ui.main.stories.me.views.privacy.MyLikeMgrActivity.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                LogUtil.a("MyLikeManagerActivity", "saveUserLabelConfig onSuccess ", HiJsonUtil.d(cloudCommonReponse));
                MyLikeMgrActivity.this.d.sendEmptyMessage(cloudCommonReponse.getResultCode().intValue());
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                MyLikeMgrActivity.this.d.sendEmptyMessage(9999);
                LogUtil.d("MyLikeManagerActivity", "saveUserLabelConfig onFailure ", th.getMessage());
            }
        });
        vwd.c(1, "save_button_click", "", new String[]{"main_page"}, new String[]{""});
    }

    private void c() {
        if (this.f28557a.getVisibility() == 0) {
            h();
        } else {
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        c();
    }

    private void b() {
        this.f.setVisibility(0);
        iny.a(this.h, new ResultCallback<inr>() { // from class: com.huawei.ui.main.stories.me.views.privacy.MyLikeMgrActivity.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(inr inrVar) {
                LogUtil.a("MyLikeManagerActivity", "queryUserLabelConfig onSuccess ", HiJsonUtil.d(inrVar));
                if (inrVar.getResultCode().intValue() == 0) {
                    MyLikeMgrActivity.this.k.addAll(inrVar.e());
                }
                MyLikeMgrActivity.this.d.sendEmptyMessage(inrVar.getResultCode().intValue());
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                MyLikeMgrActivity.this.d.sendEmptyMessage(9999);
                LogUtil.d("MyLikeManagerActivity", "queryUserLabelConfig onFailure ", th.getMessage());
            }
        });
    }

    private void h() {
        LogUtil.a("MyLikeManagerActivity", "showSaveDialog enter");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f28559c);
        builder.a(getString(R.string.IDS_hwh_personal_recommend_are_you_exit)).a(getString(R.string.IDS_hw_common_ui_dialog_confirm).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: vxk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51674c.c(view);
            }
        }).d(getString(R.string.IDS_hw_show_cancel), new View.OnClickListener() { // from class: vxg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("MyLikeManagerActivity", "it is negative");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setWindowGravityParams(17);
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void c(View view) {
        finish();
    }

    @Override // com.huawei.ui.main.stories.me.views.builder.LabelBuilder.LabelListener
    public void onItemClick(inz inzVar, int i) {
        inz inzVar2 = new inz(inzVar.b(), inzVar.d(), inzVar.a(), i);
        if (this.i.contains(inzVar2)) {
            this.i.remove(inzVar2);
        } else {
            this.i.add(inzVar2);
        }
        inzVar.a(i);
        LogUtil.e("MyLikeManagerActivity", HiJsonUtil.d(this.i));
        j();
        if (this.i.isEmpty()) {
            this.f28557a.setVisibility(8);
        } else {
            this.f28557a.setVisibility(0);
        }
    }

    static class e extends BaseHandler<MyLikeMgrActivity> {
        e(MyLikeMgrActivity myLikeMgrActivity) {
            super(myLikeMgrActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MyLikeMgrActivity myLikeMgrActivity, Message message) {
            myLikeMgrActivity.f.setVisibility(8);
            LogUtil.a("MyLikeManagerActivity", "SETTING_USER_LABEL_SUCCESS");
            int i = message.what;
            if (i == 0) {
                myLikeMgrActivity.j();
                myLikeMgrActivity.f28557a.setVisibility(8);
            } else if (i == 1002 || i == 1004) {
                LoginInit.tryLoginWhenTokenInvalid();
            } else {
                qpx.b(myLikeMgrActivity, myLikeMgrActivity.getString(R.string.IDS_hwh_home_group_server_exception));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ArrayList<qle> arrayList = new ArrayList<>();
        ArrayList<qle> arrayList2 = new ArrayList<>();
        for (inz inzVar : this.k) {
            if (inzVar.c() == 0) {
                arrayList.add(inzVar);
            } else {
                arrayList2.add(inzVar);
            }
        }
        if (arrayList.isEmpty()) {
            this.j.setHeadTitleText(getString(R.string.IDS_hwh_personal_recommend_my_like_not_select));
        } else {
            this.j.setHeadTitleText(getString(R.string.IDS_hwh_personal_recommend_my_like));
        }
        this.o.d(arrayList, false);
        this.l.d(arrayList2, false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.d.removeCallbacksAndMessages(null);
        vwd.c(-1, "m0", "", new String[]{"main_page"}, new String[]{""});
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
