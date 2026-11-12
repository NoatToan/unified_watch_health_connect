package com.huawei.phoneservice.feedback.ui;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.util.ModuleConfigUtils;
import com.huawei.phoneservice.faq.base.util.SdkListener;
import com.huawei.phoneservice.faq.base.util.SdkListenerPoxy;
import com.huawei.phoneservice.faq.base.util.d;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.i;
import com.huawei.phoneservice.faq.base.util.k;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.feedback.R;
import com.huawei.phoneservice.feedback.utils.SdkFeedbackProblemManager;
import com.huawei.phoneservice.feedback.widget.FeedbackNoticeView;
import com.huawei.phoneservice.feedbackcommon.entity.ProblemInfo;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes13.dex */
public class FeedbackDisabledActivity extends FeedBaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21728b;
    private FeedbackNoticeView e;
    private ProblemInfo f;
    private SdkListenerPoxy g;
    private int h;
    private boolean l;
    private Bundle m;
    private boolean i = false;
    private boolean j = true;
    private boolean o = false;

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.l) {
            g.a("FeedbackDisabledActivity", "ONKEYDOWN IS DEEPLINK RELEASE");
            i.d().release();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedBaseActivity, com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.g != null) {
            i.d().setSdkListener(this.g.getSdkListener());
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!q.b(view) && view.getId() == R.id.feedback_disabled_noticeView) {
            if (this.e.getFaqErrorCode() == FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR || this.e.getFaqErrorCode() == FaqConstants.FaqErrorCode.INTERNET_ERROR) {
                this.f21728b = true;
            }
            l();
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    public void onBackPressed(View view) {
        super.onBackPressed(view);
        if (this.l) {
            g.a("FeedbackDisabledActivity", "ONBACKPRESSED IS DEEPLINK RELEASE");
            i.d().release();
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void n() {
        this.e = (FeedbackNoticeView) findViewById(R.id.feedback_disabled_noticeView);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void m() {
        this.e.setOnClickListener(this);
        this.g = new c(i.d().getSdkListener());
        i.d().setSdkListener(this.g);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void l() {
        setTitle(R.string.faq_sdk_feedback);
        SafeIntent safeIntent = new SafeIntent(getIntent());
        this.f = safeIntent.hasExtra("problem_info") ? (ProblemInfo) safeIntent.getParcelableExtra("problem_info") : null;
        this.h = safeIntent.getIntExtra("REQUEST_CODE", -1);
        this.m = safeIntent.getExtras();
        String string = new SafeBundle(this.m).getString("country");
        if (!k.b(string) && string != null) {
            this.o = !string.equals(i.d().getSdk("country"));
        }
        if (!d.c(this)) {
            this.e.e(FaqConstants.FaqErrorCode.INTERNET_ERROR);
            return;
        }
        this.l = "Y".equals(i.d().getSdk(FaqConstants.FAQ_IS_DEEPLICK));
        if (this.o) {
            c();
            return;
        }
        if (i.d().initIsDone()) {
            int sdkInitCode = i.a().getSdkInitCode();
            if (this.f21728b) {
                if (sdkInitCode == 5) {
                    this.e.b(FeedbackNoticeView.c.PROGRESS);
                    i.a().getServiceUrl();
                } else if (sdkInitCode == 6) {
                    this.e.b(FeedbackNoticeView.c.PROGRESS);
                    i.a().getModuleList();
                }
                this.i = true;
            }
            if (this.i) {
                return;
            }
            c(sdkInitCode);
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int j() {
        return R.layout.feedback_sdk_activity_feedback_disabled;
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.j) {
            setResult(2);
        }
        super.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.e.e(FaqConstants.FaqErrorCode.DIFFERENT_SITE);
        this.e.setCallback(new a());
    }

    private void b() {
        if (!this.l) {
            SdkFeedbackProblemManager.getManager().gotoFeedback(this, this.f, this.h);
        } else if (this.o) {
            c();
        } else {
            SdkFeedbackProblemManager.getManager().gotoFeedbackByDeepLink(this, this.m);
        }
        this.j = false;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public void c(int i) {
        int i2;
        Resources resources;
        int i3;
        String string = getResources().getString(R.string.feedback_sdk_no_feedback_module);
        int i4 = R.drawable.ic_icon_deploy_disable;
        if (i == -1) {
            this.e.b(FeedbackNoticeView.c.PROGRESS);
            return;
        }
        if (i != 0) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    i3 = R.drawable.ic_icon_initialize_disable;
                    resources = getResources();
                    i2 = R.string.feedback_sdk_init_failed;
                } else if (i == 5 || i == 6) {
                    this.e.e(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR);
                }
                if (i != 5 || i == 6) {
                }
                this.e.e(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR);
                this.e.c(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR, i4);
                this.e.a(FaqConstants.FaqErrorCode.EMPTY_DATA_ERROR, getResources().getDimensionPixelOffset(R.dimen.feedback_sdk_loading_empty_icon_size));
                this.e.setShouldHideContactUsButton(true);
                this.e.getNoticeTextView().setText(string);
                return;
            }
            String string2 = resources.getString(i2);
            i4 = i3;
            string = string2;
            if (i != 5) {
            }
        }
        if (ModuleConfigUtils.newFeedbackEnabled()) {
            b();
            return;
        }
        i4 = R.drawable.ic_icon_deploy_disable;
        Resources resources2 = getResources();
        i2 = R.string.feedback_sdk_no_feedback_module;
        int i5 = i4;
        resources = resources2;
        i3 = i5;
        String string3 = resources.getString(i2);
        i4 = i3;
        string = string3;
        if (i != 5) {
        }
    }

    class c extends SdkListenerPoxy {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f21730a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f21731c;
            final /* synthetic */ String e;

            @Override // java.lang.Runnable
            public void run() {
                int i;
                g.a("FeedbackDisabledActivity", "result: " + this.f21730a + " code: " + this.f21731c + " msg: " + this.e);
                if (this.f21730a != 0 || (i = this.f21731c) != 0) {
                    if (FeedbackDisabledActivity.this.l && FeedbackDisabledActivity.this.o) {
                        FeedbackDisabledActivity.this.c();
                        return;
                    } else {
                        FeedbackDisabledActivity.this.c(this.f21731c);
                        return;
                    }
                }
                FeedbackDisabledActivity.this.c(i);
            }

            a(int i, int i2, String str) {
                this.f21730a = i;
                this.f21731c = i2;
                this.e = str;
            }
        }

        @Override // com.huawei.phoneservice.faq.base.util.SdkListenerPoxy
        public void onSdkInitImpl(int i, int i2, String str) {
            FeedbackDisabledActivity.this.runOnUiThread(new a(i, i2, str));
        }

        c(SdkListener sdkListener) {
            super(sdkListener);
        }
    }

    class a implements FeedbackNoticeView.b {
        @Override // com.huawei.phoneservice.feedback.widget.FeedbackNoticeView.b
        public void a() {
            if (FeedbackDisabledActivity.this.l) {
                g.a("FeedbackDisabledActivity", "ONBACKPRESSED IS DEEPLINK RELEASE");
                i.d().release();
            }
            FeedbackDisabledActivity.this.finish();
        }

        a() {
        }
    }
}
