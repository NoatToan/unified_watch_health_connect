package com.huawei.phoneservice.websurvey.ui;

import android.content.res.Configuration;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.util.s;
import com.huawei.phoneservice.websurvey.R;
import com.huawei.phoneservice.websurvey.widget.NpsNoticeView;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class SurveyWebActivity extends NpsBaseWebActivity {
    @Override // com.huawei.phoneservice.websurvey.ui.NpsBaseWebActivity
    protected void r() {
        super.r();
        this.f.addJavascriptInterface(this.e, "hicareJsInterface");
    }

    @Override // com.huawei.phoneservice.websurvey.ui.AbstractBaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.phoneservice.websurvey.ui.NpsBaseWebActivity
    protected void init() {
        super.init();
    }

    @Override // com.huawei.phoneservice.websurvey.ui.NpsBaseWebActivity, com.huawei.phoneservice.websurvey.ui.AbstractBaseActivity
    protected void h() {
        this.e = new com.huawei.phoneservice.websurvey.jsInterface.b(new WeakReference(this));
        super.h();
    }

    @Override // com.huawei.phoneservice.websurvey.ui.AbstractBaseActivity
    protected void f() {
        this.d = new SafeIntent(getIntent()).getStringExtra("url");
        if (!com.huawei.phoneservice.faq.base.util.d.c(this)) {
            this.g.d(FaqConstants.FaqErrorCode.INTERNET_ERROR);
            return;
        }
        this.g.e(NpsNoticeView.b.PROGRESS);
        this.g.setVisibility(0);
        this.f.setVisibility(4);
        if (!s.c(this.d)) {
            this.g.d(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR);
            return;
        }
        String str = this.d;
        if (str == null || !str.equals(this.f.getUrl())) {
            this.f.loadUrl(this.d);
        } else {
            this.f.reload();
        }
    }

    @Override // com.huawei.phoneservice.websurvey.ui.AbstractBaseActivity
    protected int d() {
        return R.layout.survey_sdk_activity_common_web_layout;
    }

    @Override // com.huawei.phoneservice.websurvey.ui.NpsBaseWebActivity
    public void a(String str) {
        this.f21986c = TextUtils.isEmpty(str);
    }

    @Override // com.huawei.phoneservice.websurvey.ui.NpsBaseWebActivity
    public void a(int i) {
        if (i > 10) {
            this.f.setVisibility(0);
        }
    }
}
