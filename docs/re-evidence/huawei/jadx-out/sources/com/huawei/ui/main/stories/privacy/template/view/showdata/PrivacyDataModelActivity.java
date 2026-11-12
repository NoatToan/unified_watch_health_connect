package com.huawei.ui.main.stories.privacy.template.view.showdata;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.contract.PrivacyActivityContract;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.SourceInfoBean;
import com.huawei.ui.main.stories.privacy.template.view.PrivacyDataDetailMvpActivity;
import com.huawei.ui.main.stories.template.BaseView;
import defpackage.qrs;
import defpackage.why;
import defpackage.wig;
import defpackage.wij;
import defpackage.wpd;
import defpackage.wqp;

/* JADX INFO: loaded from: classes3.dex */
public class PrivacyDataModelActivity extends PrivacyDataDetailMvpActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f28730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PrivacyDayDataFragment f28731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PrivacyDoubleGroupDataFragment f28732c;
    private PrivacyGroupDataFragment d;
    private long e;
    private SourceInfoBean f;
    private PageModelArgs g;
    private Uri h;
    private CustomTitleBar i;
    private String j;
    private why m;
    private String o;

    @Override // com.huawei.ui.main.stories.template.BaseView
    public Context getViewContext() {
        return this;
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpActivity
    public void initViews() {
    }

    public static void b(Context context, PageModelArgs pageModelArgs) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) PrivacyDataModelActivity.class);
        intent.putExtra("extra_page_model_args", pageModelArgs);
        context.startActivity(intent);
    }

    public static void e(Context context, PageModelArgs pageModelArgs, Parcelable parcelable) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) PrivacyDataModelActivity.class);
        intent.putExtra("extra_page_model_args", pageModelArgs);
        intent.putExtra("extra_source_info", parcelable);
        context.startActivity(intent);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.contract.PrivacyActivityContract.PrivacyActivityView
    public CustomTitleBar getCustomTitleBar() {
        return this.f28730a;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.contract.PrivacyActivityContract.PrivacyActivityView
    public void setTitle(String str) {
        this.f28730a.setTitleText(str);
        this.o = str;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.contract.PrivacyActivityContract.PrivacyActivityView
    public String getTitleBarContent() {
        return this.o;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.contract.PrivacyActivityContract.PrivacyActivityView
    public CustomTitleBar getSpinnerCustomTitleBar() {
        return this.i;
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpActivity
    public int getLayoutId() {
        return R.layout.privacy_activity_data_all;
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpActivity
    public void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            this.h = AppRouterUtils.b(intent);
            PageModelArgs pageModelArgsD = d();
            this.g = pageModelArgsD;
            if (pageModelArgsD == null) {
                this.g = (PageModelArgs) intent.getParcelableExtra("extra_page_model_args");
                this.f = (SourceInfoBean) intent.getParcelableExtra("extra_source_info");
            }
            PageModelArgs pageModelArgs = this.g;
            if (pageModelArgs == null) {
                LogUtil.a("PrivacyDataModelActivity", "initData mPageModelArgs is null");
                return;
            }
            this.j = pageModelArgs.getServiceId();
            this.e = this.g.getTimestamp();
            c();
            a();
        }
    }

    private PageModelArgs d() {
        Uri uri = this.h;
        if (uri == null) {
            LogUtil.j("PrivacyDataModelActivity", "getPageModelByDeeplink mSchemeData is null.");
            return null;
        }
        String queryParameter = uri.getQueryParameter(CommonUtil.PAGE_TYPE);
        if (TextUtils.isEmpty(queryParameter)) {
            LogUtil.j("PrivacyDataModelActivity", "getPageModelByDeeplink pageType empty.");
            return null;
        }
        if (!qrs.d(queryParameter)) {
            LogUtil.j("PrivacyDataModelActivity", "getPageModelByDeeplink pageType type error.");
            return null;
        }
        PageModelArgs pageModelArgs = new PageModelArgs(Integer.parseInt(queryParameter), "PrivacyDataConstructor", 3, 1);
        pageModelArgs.setClassType(0);
        return pageModelArgs;
    }

    private void c() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.privacy_detail_title_bar);
        this.f28730a = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.health_chart_extend_background_color));
        CustomTitleBar customTitleBar2 = (CustomTitleBar) findViewById(R.id.privacy_spinner_title_bar);
        this.i = customTitleBar2;
        customTitleBar2.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.health_chart_extend_background_color));
        boolean zG = wig.g(this.g);
        this.f28730a.setAppBarVisible(!zG);
        this.i.setAppBarVisible(zG);
        cancelLayoutById(this.f28730a, this.i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.main.stories.template.health.HealthMvpActivity
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PrivacyActivityContract.PrivacyActivityPresenter onCreatePresenter() {
        return (PrivacyActivityContract.PrivacyActivityPresenter) wij.d(this.m.e(), this);
    }

    private void a() {
        wpd.c().a(R.raw.privacydata, new Consumer() { // from class: com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f28733b.e((why) obj);
            }
        });
    }

    /* synthetic */ void e(why whyVar) {
        if (whyVar != null) {
            this.m = whyVar;
            b(whyVar);
        } else {
            LogUtil.e("PrivacyDataModelActivity", "initConfig baseTemplateConfig is null");
        }
    }

    private void b(final why whyVar) {
        if (whyVar.e() != null) {
            createPresenter(this.m.e(), this);
            runOnUiThread(new Runnable() { // from class: wjb
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a(whyVar);
                }
            });
        }
    }

    public /* synthetic */ void a(why whyVar) {
        if (getPresenter() != null && whyVar.b() != null) {
            getPresenter().initPage(this.g.getModuleType(), this.j, this.e);
        } else {
            LogUtil.e("PrivacyDataModelActivity", "getPresenter = null or config = null");
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.template.contract.PrivacyActivityContract.PrivacyActivityView
    public void showAllDataView() {
        if (this.d == null) {
            this.d = PrivacyGroupDataFragment.a(this.m.d(), this.g, this.f);
            wqp.b(getSupportFragmentManager(), this.d, R.id.privacy_all_data_container);
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.template.contract.PrivacyActivityContract.PrivacyActivityView
    public void showSegmentDataView() {
        if (this.f28731b == null) {
            this.f28731b = PrivacyDayDataFragment.c(this.m.c(), this.g, this.f);
            wqp.b(getSupportFragmentManager(), this.f28731b, R.id.privacy_all_data_container);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        PrivacyDoubleGroupDataFragment privacyDoubleGroupDataFragment = this.f28732c;
        if (privacyDoubleGroupDataFragment != null) {
            privacyDoubleGroupDataFragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.huawei.ui.main.stories.privacy.template.contract.PrivacyActivityContract.PrivacyActivityView
    public void showDoubleGroupDataView() {
        if (this.f28732c == null) {
            this.f28732c = PrivacyDoubleGroupDataFragment.d(this.m.a(), this.g, this.f);
            wqp.b(getSupportFragmentManager(), this.f28732c, R.id.privacy_all_data_container);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [P extends com.huawei.ui.main.stories.template.BasePresenter, com.huawei.ui.main.stories.template.BasePresenter] */
    @Override // com.huawei.ui.main.stories.template.health.HealthMvpActivity
    public void createPresenter(String str, BaseView baseView) {
        if (this.mPresenter == 0) {
            this.mPresenter = wij.d(str, baseView);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        PrivacyGroupDataFragment privacyGroupDataFragment = this.d;
        if (privacyGroupDataFragment == null || !privacyGroupDataFragment.onBackPressed()) {
            PrivacyDoubleGroupDataFragment privacyDoubleGroupDataFragment = this.f28732c;
            if (privacyDoubleGroupDataFragment == null || !privacyDoubleGroupDataFragment.onBackPressed()) {
                PrivacyDayDataFragment privacyDayDataFragment = this.f28731b;
                if (privacyDayDataFragment == null || !privacyDayDataFragment.onBackPressed()) {
                    super.onBackPressed();
                }
            }
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        wpd.c().d();
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
