package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.iei;
import defpackage.ien;
import defpackage.lmf;
import defpackage.qpn;
import defpackage.qre;
import defpackage.xfz;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MyFitnessCourseActivity extends BaseStateActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FitnessCourseBehaviorFragment f9128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f9129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FitnessCourseBehaviorFragment f9130c;
    private FitnessCourseBehaviorFragment d;
    private qpn g;
    private int j;
    private HealthSubTabWidget k;
    private HealthViewPager l;
    private String o;
    private List<FitnessCourseBehaviorFragment> h = new ArrayList(3);
    private boolean i = false;
    private int e = 0;
    private int f = 0;
    private FitnessCourseBehaviorFragment.DeleteModeListener m = new FitnessCourseBehaviorFragment.DeleteModeListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.MyFitnessCourseActivity.3
        @Override // com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessCourseBehaviorFragment.DeleteModeListener
        public void deleteItem(int i) {
            LogUtil.a("Suggestion_MyFitnessCourseActivity", "mShowListener deleteItem fragmentType = ", Integer.valueOf(i), " isCustomType(fragmentType) =", Integer.valueOf(MyFitnessCourseActivity.this.e(i)));
            MyFitnessCourseActivity myFitnessCourseActivity = MyFitnessCourseActivity.this;
            myFitnessCourseActivity.b(myFitnessCourseActivity.e(i));
        }
    };

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(-1);
        getWindow().setFlags(16777216, 16777216);
        clearBackgroundDrawable();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.sug_fitness_activity_course_my);
        this.k = (HealthSubTabWidget) findViewById(R.id.sug_my_fitness_detail_tab);
        this.l = (HealthViewPager) findViewById(R.id.sug_my_fitness_detail_vp);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.sug_my_fitness_course_title);
        this.f9129b = customTitleBar;
        customTitleBar.setRightButtonVisibility(8);
        this.f9129b.setRightButtonClickable(true);
        cancelAdaptRingRegion();
        Intent intent = getIntent();
        this.o = qre.f(R.string.sug_my_fitness_class);
        if (intent != null) {
            if (intent.hasExtra("titleName")) {
                String stringExtra = intent.getStringExtra("titleName");
                this.o = stringExtra;
                this.f9129b.setTitleText(stringExtra);
            }
            this.e = intent.getIntExtra("courseCategoryKey", 0);
            int intExtra = intent.getIntExtra("intent_behavior_key", 0);
            this.f = intExtra;
            a(intExtra);
        }
        FitnessCourseBehaviorFragment fitnessCourseBehaviorFragmentC = FitnessCourseBehaviorFragment.c(1, this.e);
        this.f9128a = fitnessCourseBehaviorFragmentC;
        fitnessCourseBehaviorFragmentC.a(this.m);
        FitnessCourseBehaviorFragment fitnessCourseBehaviorFragmentC2 = FitnessCourseBehaviorFragment.c(0, this.e);
        this.d = fitnessCourseBehaviorFragmentC2;
        fitnessCourseBehaviorFragmentC2.a(this.m);
        int i = this.e;
        FitnessCourseBehaviorFragment fitnessCourseBehaviorFragmentC3 = FitnessCourseBehaviorFragment.c(i == 258 ? 3 : 2, i);
        this.f9130c = fitnessCourseBehaviorFragmentC3;
        fitnessCourseBehaviorFragmentC3.a(this.m);
        this.h.add(this.d);
        this.h.add(this.f9128a);
        if (c()) {
            this.h.add(this.f9130c);
        } else {
            LogUtil.a("Suggestion_MyFitnessCourseActivity", "isOversea purchase");
        }
        h();
        this.l.setOffscreenPageLimit(this.k.getSubTabCount());
        this.f9129b.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.MyFitnessCourseActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MyFitnessCourseActivity.this.i();
            }
        });
        d();
    }

    private boolean c() {
        return !Utils.o() || this.e == 258;
    }

    private void h() {
        String string;
        this.g = new qpn(this, this.l, this.k);
        xfz xfzVarB = this.k.b(ien.b(this.e) ? getString(R.string.IDS_course_used) : getString(R.string.IDS_FitnessAdvice_load_ok));
        xfz xfzVarB2 = this.k.b(getString(R.string.IDS_FitnessAdvice_collected_ok));
        this.g.b(xfzVarB, this.d, this.f == 0);
        this.g.b(xfzVarB2, this.f9128a, this.f == 1);
        if (c()) {
            HealthSubTabWidget healthSubTabWidget = this.k;
            if (this.e == 258) {
                string = getString(R.string.IDS_start_track_target_custom);
            } else {
                string = getString(R.string.IDS_FitnessAdvice_purchase_ok);
            }
            xfz xfzVarB3 = healthSubTabWidget.b(string);
            qpn qpnVar = this.g;
            FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment = this.f9130c;
            int i = this.f;
            qpnVar.b(xfzVarB3, fitnessCourseBehaviorFragment, i == 3 || i == 2);
            return;
        }
        LogUtil.a("Suggestion_MyFitnessCourseActivity", "setSubTabTitle isOversea mCourseCategory", Integer.valueOf(this.e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        FitnessCourseBehaviorFragment fitnessCourseBehaviorFragmentE = e();
        if (fitnessCourseBehaviorFragmentE == null) {
            return;
        }
        int iE = e(fitnessCourseBehaviorFragmentE.d());
        boolean zF = fitnessCourseBehaviorFragmentE.f();
        if (iE == this.j) {
            boolean z = !zF;
            this.i = z;
            e(z);
            LogUtil.a("Suggestion_MyFitnessCourseActivity", "setDeleteModeTitle(mSelectedSubTabPosition) mSelectedSubTabPosition = ", Integer.valueOf(this.j));
            b(this.j);
        }
        a(fitnessCourseBehaviorFragmentE.d());
    }

    private void d() {
        this.l.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.MyFitnessCourseActivity.2
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                FitnessCourseBehaviorFragment fitnessCourseBehaviorFragmentE = MyFitnessCourseActivity.this.e();
                if (fitnessCourseBehaviorFragmentE == null) {
                    return;
                }
                int iD = fitnessCourseBehaviorFragmentE.d();
                if (i == 2 && iD == 2) {
                    LogUtil.a("Suggestion_MyFitnessCourseActivity", "ViewPager Purchase reflash");
                    fitnessCourseBehaviorFragmentE.c();
                }
                LogUtil.a("Suggestion_MyFitnessCourseActivity", "mShowListener : setDeleteModeTitle(position) position = ", Integer.valueOf(i));
                MyFitnessCourseActivity.this.b(i);
                MyFitnessCourseActivity.this.a(iD);
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        LogUtil.a("Suggestion_MyFitnessCourseActivity", "initViewController()");
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        LogUtil.a("Suggestion_MyFitnessCourseActivity", "initData()");
    }

    private void e(boolean z) {
        if (e() != null) {
            e().e(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        final FitnessCourseBehaviorFragment fitnessCourseBehaviorFragmentE = e();
        if (fitnessCourseBehaviorFragmentE == null) {
            return;
        }
        int iE = e(fitnessCourseBehaviorFragmentE.d());
        boolean zF = fitnessCourseBehaviorFragmentE.f();
        LogUtil.a("Suggestion_MyFitnessCourseActivity", "setDeleteModeTitle :", "fragmentType = ", Integer.valueOf(i), " currentFragmentType = ", Integer.valueOf(iE), " isDeleteModel = ", Boolean.valueOf(zF));
        if (i == iE) {
            boolean zC = c(i, fitnessCourseBehaviorFragmentE, fitnessCourseBehaviorFragmentE.i());
            LogUtil.a("Suggestion_MyFitnessCourseActivity", "setDeleteModeTitle isRecord = ", Boolean.valueOf(zC));
            if (!zC) {
                this.f9129b.setLeftButtonDrawable(a(), qre.f(R.string.accessibility_go_back));
                this.f9129b.setTitleText(this.o);
                this.f9129b.setRightButtonVisibility(8);
            } else if (zF) {
                int iA = fitnessCourseBehaviorFragmentE.a();
                this.f9129b.setTitleText(qre.e(com.huawei.ui.commonui.R.plurals.IDS_hw_weight_delete_check_measure_data, iA, Integer.valueOf(iA)));
                this.f9129b.setLeftButtonDrawable(ContextCompat.getDrawable(BaseApplication.b(), com.huawei.ui.commonui.R.drawable.hwappbarpattern_selector_public_cancel), qre.f(R.string.accessibility_close));
                this.f9129b.setRightButtonVisibility(8);
            } else if (iE == 2 && this.e != 258) {
                this.f9129b.setLeftButtonDrawable(a(), qre.f(R.string.accessibility_go_back));
                this.f9129b.setTitleText(this.o);
                this.f9129b.setRightButtonVisibility(8);
            } else {
                this.f9129b.setLeftButtonDrawable(a(), qre.f(R.string.accessibility_go_back));
                this.f9129b.setTitleText(this.o);
                this.f9129b.setRightButtonVisibility(0);
                this.f9129b.setRightButtonDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.drawable.ic_public_delete), qre.f(R.string.IDS_contact_delete));
            }
        }
        this.f9129b.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.MyFitnessCourseActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MyFitnessCourseActivity.this.a(fitnessCourseBehaviorFragmentE, i);
            }
        });
    }

    private boolean c(int i, FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment, boolean z) {
        return (ien.b(this.e) && (i == 0 || i == 1)) ? fitnessCourseBehaviorFragment.h() : z;
    }

    private Drawable a() {
        Context contextB = BaseApplication.b();
        if (LanguageUtil.ba(contextB)) {
            return ContextCompat.getDrawable(contextB, R.drawable.health_navbar_rtl_back_selector);
        }
        return ContextCompat.getDrawable(contextB, R.drawable.health_navbar_back_selector);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(int i) {
        if (this.e == 258 && i == 3) {
            return 2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FitnessCourseBehaviorFragment e() {
        int selectedSubTabPostion = this.k.getSelectedSubTabPostion();
        this.j = selectedSubTabPostion;
        Fragment item = this.g.getItem(selectedSubTabPostion);
        if (item instanceof FitnessCourseBehaviorFragment) {
            return (FitnessCourseBehaviorFragment) item;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(FitnessCourseBehaviorFragment fitnessCourseBehaviorFragment, int i) {
        if (fitnessCourseBehaviorFragment == null) {
            return;
        }
        boolean zC = c(i, fitnessCourseBehaviorFragment, fitnessCourseBehaviorFragment.i());
        boolean zF = fitnessCourseBehaviorFragment.f();
        LogUtil.d("Suggestion_MyFitnessCourseActivity", "dataIsEmpty =", Boolean.valueOf(zC), "isDeleteMode = ", Boolean.valueOf(this.i));
        if (zF) {
            b();
        } else {
            finish();
        }
    }

    private void b() {
        this.i = false;
        this.f9129b.setLeftButtonDrawable(a(), qre.f(R.string.accessibility_go_back));
        this.f9129b.setTitleText(this.o);
        this.f9129b.setRightButtonVisibility(0);
        this.f9129b.setRightButtonDrawable(ContextCompat.getDrawable(BaseApplication.b(), R.drawable.ic_public_delete), qre.f(R.string.IDS_contact_delete));
        e(this.i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FitnessCourseBehaviorFragment fitnessCourseBehaviorFragmentE = e();
        if (fitnessCourseBehaviorFragmentE == null) {
            finish();
        } else if (fitnessCourseBehaviorFragmentE.f()) {
            b();
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        String strValue;
        if (getIntent() == null) {
            LogUtil.e("Suggestion_MyFitnessCourseActivity", "doBiEvent intent is null.");
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        if (i == -1) {
            map.put("type", "2");
            strValue = AnalyticsValue.EVENT_CLICK_FITNESS_COURSE_MORE.value();
        } else if (this.e == 5) {
            map.put("tabType", Integer.valueOf(i + 1));
            strValue = AnalyticsValue.INT_PLAN_2030104.value();
        } else {
            map.put("page", Integer.valueOf(i));
            strValue = AnalyticsValue.HEALTH_FITNESS_MY_COURSE_1130030.value();
            map.put("from", Integer.valueOf(iei.b(this.e)));
        }
        lmf.d().c(BaseApplication.b(), strValue, map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
