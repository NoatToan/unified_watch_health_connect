package com.huawei.ui.main.stories.fitness.activity.active;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.knit.model.KnitSubPageConfig;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.PopMenuManager;
import com.huawei.ui.main.stories.template.data.IPopMenuItemClick;
import defpackage.iov;
import defpackage.lmf;
import defpackage.qho;
import defpackage.qre;
import defpackage.ujq;
import defpackage.wpo;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class KnitActiveHoursActivity extends KnitHealthDetailActivity {
    private final Context d = BaseApplication.b();
    private PopMenuManager e;

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configExtraView(LinearLayout linearLayout) {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configToolBar(HealthToolBar healthToolBar) {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public int getPageType() {
        return 34;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public Fragment onCreateEmptyFragment(KnitSubPageConfig knitSubPageConfig) {
        return null;
    }

    public static void e(Context context) {
        a(context, System.currentTimeMillis());
    }

    public static void a(Context context, long j) {
        LogUtil.a("SCUI_KnitActiveHoursActivity", "start activity ", context, " timeMillis ", Long.valueOf(j));
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) KnitActiveHoursActivity.class);
        intent.putExtra("default_time_millis", j);
        iov.d(context, intent);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b();
    }

    private void b() {
        String strE = e();
        LogUtil.a("SCUI_KnitActiveHoursActivity", "fromType = ", strE);
        if (TextUtils.isEmpty(strE) || !"1".equals(strE)) {
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", "1");
        map.put("from", 3);
        map.put("event", 1);
        lmf.d().c(this.d, AnalyticsValue.HEALTH_HOME_ACTIVE_HOUR_1040092.value(), map, 0);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public String getLogTag() {
        return "SCUI_KnitActiveHoursActivity";
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public DataInfos getSubPageDataInfos(int i) {
        if (i == 0) {
            return DataInfos.ActiveHoursDayDetail;
        }
        if (i == 1) {
            return DataInfos.ActiveHoursWeekDetail;
        }
        if (i == 2) {
            return DataInfos.ActiveHoursMonthDetail;
        }
        if (i == 3) {
            return DataInfos.ActiveHoursYearDetail;
        }
        return DataInfos.NoDataPlaceHolder;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public int configSubTabStyle() {
        return R.layout.knit_sub_tab_widget_active_hours;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configTitleBar(final CustomTitleBar customTitleBar) {
        customTitleBar.setTitleText(qho.e(R.string.IDS_three_circle_card_activity_hours));
        customTitleBar.setRightButtonDrawable(ContextCompat.getDrawable(this, R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        customTitleBar.setRightButtonClickable(true);
        customTitleBar.setRightButtonVisibility(0);
        this.e = new PopMenuManager() { // from class: com.huawei.ui.main.stories.fitness.activity.active.KnitActiveHoursActivity.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.ui.main.stories.template.PopMenuManager
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public CustomTitleBar getTitleBar() {
                return customTitleBar;
            }

            @Override // com.huawei.ui.main.stories.template.IMenuItemManager
            public List<wpo> getMenuItemList() {
                return KnitActiveHoursActivity.this.a();
            }
        };
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: ttb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        this.e.showPopMenu();
        d("0");
    }

    public static void d(String str) {
        ujq.e(str, 2, 1);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public boolean getExtra(Bundle bundle) {
        if (bundle == null) {
            ReleaseLogUtil.d("SCUI_KnitActiveHoursActivity", "getExtra bundle is null");
            return true;
        }
        Intent intent = getIntent();
        if (intent == null) {
            ReleaseLogUtil.d("SCUI_KnitActiveHoursActivity", "getExtra intent is null bundle ", bundle);
            bundle.putLong("default_time_millis", System.currentTimeMillis());
        } else {
            bundle.putLong("default_time_millis", intent.getLongExtra("default_time_millis", System.currentTimeMillis()));
            if ("1".equals(e())) {
                bundle.putInt("from", 2);
            } else {
                bundle.putInt("from", 1);
            }
        }
        return true;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        hideEmptyFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<wpo> a() {
        wpo wpoVar = new wpo(getResources().getString(R.string.IDS_temperature_warning_set), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.active.KnitActiveHoursActivity.2
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                LogUtil.a("SCUI_KnitActiveHoursActivity", "onItemClick set alert");
                KnitActiveHoursActivity.d("1");
                ActiveHoursSetAlertActivity.c(KnitActiveHoursActivity.this);
            }
        });
        ArrayList<wpo> arrayList = new ArrayList<>(1);
        arrayList.add(wpoVar);
        return arrayList;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void onKnitPageSelected(int i) {
        super.onKnitPageSelected(i);
        a(i);
    }

    private void a(int i) {
        String str;
        if (i == 1) {
            str = "week";
        } else if (i == 2) {
            str = "month";
        } else if (i != 3) {
            return;
        } else {
            str = "year";
        }
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("type", str);
        lmf.d().c(this.d, AnalyticsValue.SWITCH_TO_THE_ACTIVE_HOUR_PAGE_1040093.value(), map, 0);
    }

    private String e() {
        Uri uriB = AppRouterUtils.b(getIntent());
        if (uriB == null) {
            LogUtil.d("SCUI_KnitActiveHoursActivity", "mSchemeData == null");
            return "";
        }
        return uriB.getQueryParameter(ArkUIXConstants.FROM_TYPE);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        PopMenuManager popMenuManager = this.e;
        if (popMenuManager != null) {
            popMenuManager.dismissPopMenu();
            this.e = null;
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
