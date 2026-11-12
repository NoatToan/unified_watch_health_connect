package com.huawei.watchface.mvp.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.skinner.base.SkinBaseFragmentActivity;
import com.huawei.uikit.phone.hwtextview.widget.HwTextView;
import com.huawei.watchface.R;
import com.huawei.watchface.e4;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.j0;
import com.huawei.watchface.mvp.ui.widget.HwToolbar;
import com.huawei.watchface.u4;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.LanguageUtils;
import defpackage.orf;

/* JADX INFO: loaded from: classes45.dex */
public class PrivacyStatementActivity extends SkinBaseFragmentActivity {
    public static final String ACTION_WATCHFACE_SERVICE_DISABLE = "com.huawei.bone.action.WATCHFACE_SERVICE_DISABLE";
    private static final String AGREEMENT_KEY = "Agreement_key";
    private static final String FROM_WHERE = "from";
    private static final String PRIVACY_URL = "privacyurl";
    private static final String TAG = "PrivacyStatementActivity";
    private static final String TERMS_URL = "termsurl";
    private ImageView mCancleServiceImg;
    private RelativeLayout mCancleServiceLayout;
    private Context mContext;
    private ImageView mPrivacyStatementImg;
    private RelativeLayout mPrivacyStatementLayout;
    private ImageView mUserAgreementImg;
    private RelativeLayout mUserAgreementLayout;
    private String mWhereFrom = "";

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PrivacyStatementActivity.this.showCancelDialog();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(PrivacyStatementActivity.this.mContext, (Class<?>) WatchfaceUrlActivity.class);
            intent.putExtra(PrivacyStatementActivity.AGREEMENT_KEY, PrivacyStatementActivity.TERMS_URL);
            intent.addFlags(268435456);
            orf.a(PrivacyStatementActivity.this.mContext, intent);
        }
    }

    private void initToolbar() {
        HwLog.i(TAG, "initToolbar() enter.");
        HwTextView hwTextView = (HwTextView) ((HwToolbar) LayoutInflater.from(this).inflate(R.layout.watchface_activity_common_toolbar, (ViewGroup) null).findViewById(R.id.tl_common_toolbar)).findViewById(R.id.tv_common_toolbar_title);
        if (this.mContext != null) {
            hwTextView.setText(DensityUtil.getStringById(R.string.IDS_hw_watchface_secret_privacy_statement));
        }
    }

    private void initView() {
        initToolbar();
        this.mCancleServiceLayout = (RelativeLayout) u4.a(this, R.id.rl_cancel_service);
        this.mCancleServiceImg = (ImageView) u4.a(this, R.id.im_cancel_service_right);
        this.mUserAgreementLayout = (RelativeLayout) u4.a(this, R.id.rl_user_agreement);
        this.mUserAgreementImg = (ImageView) u4.a(this, R.id.im_user_agreement_right);
        this.mPrivacyStatementLayout = (RelativeLayout) u4.a(this, R.id.rl_privacy_statement);
        this.mPrivacyStatementImg = (ImageView) u4.a(this, R.id.im_privacy_statement_right);
        if (LanguageUtils.a(this.mContext)) {
            this.mCancleServiceImg.setImageResource(R.drawable.watchface_common_ui_arrow_left);
            this.mUserAgreementImg.setImageResource(R.drawable.watchface_common_ui_arrow_left);
            this.mPrivacyStatementImg.setImageResource(R.drawable.watchface_common_ui_arrow_left);
        } else {
            this.mCancleServiceImg.setImageResource(R.drawable.watchface_common_ui_arrow_right);
            this.mUserAgreementImg.setImageResource(R.drawable.watchface_common_ui_arrow_right);
            this.mPrivacyStatementImg.setImageResource(R.drawable.watchface_common_ui_arrow_right);
        }
        this.mCancleServiceLayout.setOnClickListener(new a());
        this.mUserAgreementLayout.setOnClickListener(new b());
        this.mPrivacyStatementLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.activity.PrivacyStatementActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$initView$0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        Intent intent = new Intent(this.mContext, (Class<?>) WatchfaceUrlActivity.class);
        intent.putExtra(AGREEMENT_KEY, PRIVACY_URL);
        intent.addFlags(268435456);
        orf.a(this.mContext, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCancelDialog$1(View view) {
        e4.a("watch_face_privacy_is_agree", false, "goal_steps_perference");
        Intent intent = new Intent();
        intent.setAction(ACTION_WATCHFACE_SERVICE_DISABLE);
        CommonUtils.a(intent);
        setResult(-1);
        finish();
    }

    static /* synthetic */ void lambda$showCancelDialog$2(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCancelDialog() {
        j0.a aVar = new j0.a(this.mContext);
        aVar.b(DensityUtil.getStringById(R.string.IDS_hw_watchface_secret_cancle_service)).a(DensityUtil.getStringById(R.string.IDS_hw_watchface_secret_cancle_service_dialog_content)).b(R.string.IDS_hw_watchface_secret_revoke, new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.activity.PrivacyStatementActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$showCancelDialog$1(view);
            }
        }).a(R.string.cancel, new View.OnClickListener() { // from class: com.huawei.watchface.mvp.ui.activity.PrivacyStatementActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyStatementActivity.lambda$showCancelDialog$2(view);
            }
        });
        aVar.a().show();
    }

    @Override // com.huawei.skinner.base.SkinBaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.watchface_activity_privacy_statement);
        this.mContext = this;
        Environment.setApplication(getApplication());
        if (getIntent() != null) {
            try {
                this.mWhereFrom = getIntent().getStringExtra("from");
            } catch (Exception unused) {
                HwLog.e(TAG, "getStringExtra FROM_WHERE Exception");
            }
            HwLog.i(TAG, "mWhereFrom = " + this.mWhereFrom);
        }
        initView();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
