package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.polymericpage.activity.PolymericActivity;
import com.huawei.health.suggestion.ui.polymericpage.model.PolymericCustomer;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.hnp;
import defpackage.hom;
import defpackage.idy;
import defpackage.iei;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes2.dex */
public class SportAllCourseActivity extends PolymericActivity {
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getIntent() != null && getIntent().getBooleanExtra("moveTaskToBack", false)) {
            moveTaskToBack(true);
        }
        super.onBackPressed();
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.activity.PolymericActivity
    public PolymericCustomer createPolymericCustomer(Intent intent) {
        this.mPageType = "";
        if (intent != null) {
            this.mPageType = intent.getStringExtra("SKIP_ALL_COURSE_KEY");
        }
        if ("HEALTH_COURSE".equals(this.mPageType)) {
            return new hom();
        }
        return new hnp();
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.activity.PolymericActivity
    public void initNormalViewController() {
        super.initNormalViewController();
        if (c() == null) {
            LogUtil.a("Suggestion_AllRecommendActivity", "initNormalViewController, rightSoftDrawable is null.");
            this.mTitleBar.setRightSoftkeyVisibility(8);
        } else {
            this.mTitleBar.setRightSoftkeyVisibility(0);
            this.mTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.common_transparent));
            this.mTitleBar.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: hgw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f36731c.e(view);
                }
            });
        }
    }

    public /* synthetic */ void e(View view) {
        if (qrs.r()) {
            LogUtil.j("Suggestion_AllRecommendActivity", "isFastClick");
        } else {
            idy.c("1130034");
            a(TextUtils.equals(this.mPageType, "FITNESS_COURSE") ? "RUNNING_COURSE" : "FITNESS_COURSE");
        }
    }

    private Drawable c() {
        Drawable drawable = null;
        if (!"HEALTH_COURSE".equals(this.mPageType) && (getIntent() == null || !getIntent().getBooleanExtra("KEY_SUG_COURSE_ADD_STATUS", false))) {
            if (TextUtils.equals(this.mPageType, "FITNESS_COURSE") && !qrs.ah(this.mContext) && !Utils.o()) {
                Drawable drawableB = b(R.drawable.sug_fitness_run_plans);
                e(drawableB, R.string.IDS_fitness_advice_run_all_running_courses);
                drawable = drawableB;
            }
            if (TextUtils.equals(this.mPageType, "RUNNING_COURSE") && SportSupportUtil.b() && !Utils.o()) {
                Drawable drawableB2 = b(R.drawable.sug_fitness_workout_plans);
                e(drawableB2, R.string.IDS_FitnessAdvice_all_fitness_courses);
                return drawableB2;
            }
        }
        return drawable;
    }

    private void e(Drawable drawable, int i) {
        if (this.mTitleBar == null) {
            ReleaseLogUtil.d("Suggestion_AllRecommendActivity", "setRightSoftkeyBackground mTitleBar is null");
        } else {
            this.mTitleBar.setRightSoftkeyBackground(drawable, qre.f(i));
        }
    }

    private Drawable b(int i) {
        if (LanguageUtil.ba(this.mContext)) {
            return qqz.e(this.mContext, i);
        }
        return ContextCompat.getDrawable(this.mContext, i);
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.activity.PolymericActivity
    public void initTitleBarSearchController() {
        if (this.mTitleBar == null) {
            LogUtil.j("Suggestion_AllRecommendActivity", "initTitleBarSearchController, failed with null mTitleBar.");
            return;
        }
        this.mTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: hgp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        });
        Drawable rightButtonDrawable = getRightButtonDrawable();
        if (rightButtonDrawable == null) {
            LogUtil.a("Suggestion_AllRecommendActivity", "initTitleBarSearchController, rightButtonDrawable is null.");
            this.mTitleBar.setRightButtonVisibility(8);
        } else {
            this.mTitleBar.setRightButtonDrawable(rightButtonDrawable, qre.f(R.string.IDS_global_search_button));
            this.mTitleBar.setRightButtonVisibility(0);
            this.mTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: hgt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.a(view);
                }
            });
        }
    }

    public /* synthetic */ void d(View view) {
        if (getIntent() != null && getIntent().getBooleanExtra("moveTaskToBack", false)) {
            moveTaskToBack(true);
        }
        finish();
    }

    public /* synthetic */ void a(View view) {
        rightButtonClick();
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.activity.PolymericActivity
    public Drawable getRightButtonDrawable() {
        if ("HEALTH_COURSE".equals(this.mPageType)) {
            return null;
        }
        boolean zO = Utils.o();
        if (zO && TextUtils.equals(this.mPageType, "")) {
            return null;
        }
        if (!VersionControlUtil.isSupportOperationAccount()) {
            LogUtil.a("Suggestion_AllRecommendActivity", "is minor account，can not search");
            return null;
        }
        if (this.mPolymericCustomer != null && this.mPolymericCustomer.acquireFragmentParam() != null && (this.mPolymericCustomer.acquireFragmentParam().get("KEY_SUG_COURSE_ADD_STATUS") instanceof Boolean) && ((Boolean) this.mPolymericCustomer.acquireFragmentParam().get("KEY_SUG_COURSE_ADD_STATUS")).booleanValue()) {
            return null;
        }
        if (zO) {
            return d();
        }
        return b(R.drawable.search_bar_icon);
    }

    private Drawable d() {
        if (qrs.ah(this.mContext)) {
            return null;
        }
        if (getIntent() != null && getIntent().getBooleanExtra("KEY_SUG_COURSE_ADD_STATUS", false)) {
            return null;
        }
        if (TextUtils.equals(this.mPageType, "FITNESS_COURSE")) {
            return b(R.drawable.sug_fitness_run_plans);
        }
        if (SportSupportUtil.b()) {
            return b(R.drawable.sug_fitness_workout_plans);
        }
        return null;
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.activity.PolymericActivity
    public void rightButtonClick() {
        LogUtil.a("Suggestion_AllRecommendActivity", "rightButtonClick.");
        if (Utils.o() && TextUtils.equals(this.mPageType, "FITNESS_COURSE")) {
            idy.c("1130034");
            a("RUNNING_COURSE");
        } else if (Utils.o() && TextUtils.equals(this.mPageType, "RUNNING_COURSE") && SportSupportUtil.b()) {
            idy.c("1130035");
            a("FITNESS_COURSE");
        } else {
            super.rightButtonClick();
        }
    }

    private void a(String str) {
        int i;
        if ("RUNNING_COURSE".equals(str)) {
            idy.c("1130034");
            i = 6;
        } else {
            idy.c("1130035");
            i = 2;
        }
        int iB = idy.b(str);
        Intent intent = new Intent(this, (Class<?>) SportAllCourseActivity.class);
        intent.putExtra("SKIP_ALL_COURSE_KEY", str);
        startActivity(intent);
        iei.e(iB, i);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
