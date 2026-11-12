package com.huawei.phoneservice.feedback.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.phoneservice.faq.base.util.ModuleConfigUtils;
import com.huawei.phoneservice.faq.base.util.q;
import com.huawei.phoneservice.feedback.R;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes13.dex */
public class FeedbackSubmitSuccessActivity extends FeedBaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f21736b;
    private Button e;
    private String h;
    private boolean j = false;

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!q.b(view) && R.id.btn_submit == view.getId()) {
            Intent intent = new Intent(this, (Class<?>) FeedDetailsActivity.class);
            intent.putExtra("questionId", this.h);
            intent.putExtra("COME_FROM", this.j);
            startActivity(intent);
        }
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void n() {
        this.e = (Button) findViewById(R.id.btn_submit);
        this.f21736b = (TextView) findViewById(R.id.tv_sr_number);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void m() {
        this.e.setOnClickListener(this);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected void l() {
        SafeIntent safeIntent = new SafeIntent(getIntent());
        boolean booleanExtra = safeIntent.getBooleanExtra("COME_FROM", false);
        this.j = booleanExtra;
        setTitle(booleanExtra ? R.string.feedback_sdk_question : R.string.faq_sdk_feedback);
        String stringExtra = safeIntent.getStringExtra("problemId");
        this.h = stringExtra;
        this.f21736b.setText(stringExtra);
        this.e.setVisibility(ModuleConfigUtils.feedbackHistoryEnabled() ? 0 : 8);
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int[] k() {
        return new int[]{R.id.rl_submit};
    }

    @Override // com.huawei.phoneservice.feedback.ui.FeedbackAbstractBaseActivity
    protected int j() {
        return R.layout.feedback_sdk_activity_submit_success;
    }
}
