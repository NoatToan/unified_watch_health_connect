package com.huawei.ui.main.stories.fitness.activity.active;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.knit.model.KnitSubPageConfig;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.threecircle.ThreeCircleConfigUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.active.KnitActiveRecordActivity;
import com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordCalendarProvider;
import com.huawei.ui.main.stories.fitness.activity.active.view.GoalSettingDialog;
import com.huawei.ui.main.stories.template.PopMenuManager;
import com.huawei.ui.main.stories.template.data.IPopMenuItemClick;
import defpackage.fsj;
import defpackage.njy;
import defpackage.otv;
import defpackage.qdm;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import defpackage.tti;
import defpackage.ujq;
import defpackage.wpo;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class KnitActiveRecordActivity extends KnitHealthDetailActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GoalSettingDialog f26509c;

    public static /* synthetic */ void d(DialogInterface dialogInterface) {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configToolBar(HealthToolBar healthToolBar) {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public int getPageType() {
        return 37;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public DataInfos getSubPageDataInfos(int i) {
        return null;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public Fragment onCreateEmptyFragment(KnitSubPageConfig knitSubPageConfig) {
        return null;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public String getLogTag() {
        return "SCUI_KnitActiveRecordActivity";
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configTitleBar(final CustomTitleBar customTitleBar) {
        customTitleBar.setTitleText(getString(R.string.IDS_privacy_activity_records));
        customTitleBar.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        customTitleBar.setRightButtonClickable(true);
        customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.colorSubBackground));
        customTitleBar.setRightButtonVisibility(0);
        final PopMenuManager popMenuManager = new PopMenuManager() { // from class: com.huawei.ui.main.stories.fitness.activity.active.KnitActiveRecordActivity.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.ui.main.stories.template.PopMenuManager
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomTitleBar getTitleBar() {
                return customTitleBar;
            }

            @Override // com.huawei.ui.main.stories.template.IMenuItemManager
            public List<wpo> getMenuItemList() {
                ujq.e("0", 1, -1);
                ujq.e(1, 0);
                return KnitActiveRecordActivity.this.e();
            }
        };
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: tsz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                popMenuManager.showPopMenu();
            }
        });
        if (LanguageUtil.ba(this)) {
            customTitleBar.setRightSoftkeyBackground(getResources().getDrawable(R.drawable.ic_health_nav_share_black_rt), qre.f(R.string.accessibility_share));
        } else {
            customTitleBar.setRightSoftkeyBackground(getResources().getDrawable(R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        }
        customTitleBar.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.KnitActiveRecordActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    return;
                }
                KnitActiveRecordActivity.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (getSingleFragment() == null || getSingleFragment().getAdapter() == null) {
            LogUtil.d("SCUI_KnitActiveRecordActivity", "mSingleFragment or adapter is null");
            return;
        }
        List<SectionBean> listE = getSingleFragment().getAdapter().e();
        if (njy.e(listE)) {
            LogUtil.d("SCUI_KnitActiveRecordActivity", "sectionList is null or empty");
            return;
        }
        for (int i = 0; i < listE.size(); i++) {
            SectionBean sectionBean = listE.get(i);
            if (sectionBean.c() instanceof ActiveRecordCalendarProvider) {
                Object objD = sectionBean.d();
                if (objD instanceof fsj) {
                    fsj fsjVar = (fsj) objD;
                    ReleaseLogUtil.d("SCUI_KnitActiveRecordActivity", "share activeRecordData is ", fsjVar.e());
                    new tti(fsjVar).c(0);
                    return;
                }
            }
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configExtraView(LinearLayout linearLayout) {
        if (qrs.c((Activity) this) || Utils.o() || !LanguageUtil.f(this)) {
            return;
        }
        if (!SharedPreferenceManager.b("HiHealthService", "pullAllStatus", false)) {
            ReleaseLogUtil.d("SCUI_KnitActiveRecordActivity", "is syncing...");
            return;
        }
        if (ThreeCircleConfigUtil.e()) {
            LogUtil.a("SCUI_KnitActiveRecordActivity", "configExtraView hasShow true");
            return;
        }
        GoalSettingDialog goalSettingDialog = new GoalSettingDialog(this);
        this.f26509c = goalSettingDialog;
        goalSettingDialog.setCancelable(false);
        this.f26509c.show();
        this.f26509c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: tta
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                KnitActiveRecordActivity.d(dialogInterface);
            }
        });
        ThreeCircleConfigUtil.c();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        GoalSettingDialog goalSettingDialog = this.f26509c;
        if (goalSettingDialog != null) {
            goalSettingDialog.dismiss();
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public boolean getExtra(Bundle bundle) {
        Intent intent = getIntent();
        if (intent == null) {
            return true;
        }
        int intExtra = intent.getIntExtra("current_total_step", 0);
        int intExtra2 = intent.getIntExtra("current_total_intensity", 0);
        int intExtra3 = intent.getIntExtra("current_total_active", 0);
        int intExtra4 = intent.getIntExtra("current_total_distance", 0);
        int intExtra5 = intent.getIntExtra("current_total_calorie", 0);
        int intExtra6 = intent.getIntExtra("current_total_floor", 0);
        int intExtra7 = intent.getIntExtra("cur_step_goal", 10000);
        int intExtra8 = intent.getIntExtra("cur_intensity_goal", 25);
        int intExtra9 = intent.getIntExtra("cur_active_goal", 12);
        int intExtra10 = intent.getIntExtra("cur_calorie_goal", 270000);
        boolean booleanExtra = intent.getBooleanExtra("is_open_calendar", false);
        bundle.putInt("card_id", intent.getIntExtra("card_id", 0));
        bundle.putInt("current_total_step", intExtra);
        bundle.putInt("current_total_intensity", intExtra2);
        bundle.putInt("current_total_active", intExtra3);
        bundle.putInt("current_total_distance", intExtra4);
        bundle.putInt("current_total_calorie", intExtra5);
        bundle.putInt("current_total_floor", intExtra6);
        bundle.putInt("cur_step_goal", intExtra7);
        bundle.putInt("cur_calorie_goal", intExtra10);
        bundle.putInt("cur_intensity_goal", intExtra8);
        bundle.putInt("cur_active_goal", intExtra9);
        bundle.putBoolean("is_open_calendar", booleanExtra);
        Pair<Long, String> pairH = qdm.h();
        if (pairH == null || !qdm.a((String) pairH.second, "activityRings")) {
            return true;
        }
        bundle.putString(BasePageResTrigger.KET_H5_OBSERVER_KEY, "health-trend.01");
        bundle.putInt(BasePageResTrigger.KET_H5_OBSERVER_HASH_CODE, 1002);
        return true;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        hideEmptyFragment();
        ReleaseLogUtil.d("SCUI_KnitActiveRecordActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ThreeCircleConfigUtil.a(false);
        ReleaseLogUtil.d("SCUI_KnitActiveRecordActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        qrs.c(this, bundle);
        super.onCreate(bundle);
        setDetailBackGround(ContextCompat.getColor(this, R.color.colorSubBackground));
        otv.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<wpo> e() {
        wpo wpoVar = new wpo(getResources().getString(R.string.IDS_setting_active_target), new IPopMenuItemClick() { // from class: tsy
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public final void onItemClick() {
                this.f49626a.a();
            }
        });
        wpo wpoVar2 = new wpo(getResources().getString(R.string.IDS_reminder_setting), new IPopMenuItemClick() { // from class: tsx
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public final void onItemClick() {
                this.f49625c.c();
            }
        });
        ArrayList<wpo> arrayList = new ArrayList<>(2);
        arrayList.add(wpoVar);
        arrayList.add(wpoVar2);
        return arrayList;
    }

    public /* synthetic */ void a() {
        LogUtil.a("SCUI_KnitActiveRecordActivity", "onItemClick set alert");
        ActiveTargetActivity.b(this, 1);
    }

    public /* synthetic */ void c() {
        LogUtil.a("SCUI_KnitActiveRecordActivity", "onItemClick reminder setting");
        ujq.e("1", 1, -1);
        startActivity(new Intent(this, (Class<?>) ReminderSettingActivity.class));
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        qpx.d();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
