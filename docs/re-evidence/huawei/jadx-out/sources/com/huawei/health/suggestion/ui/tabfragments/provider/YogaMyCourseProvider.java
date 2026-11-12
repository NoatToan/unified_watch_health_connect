package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.android.airsharing.api.PlayInfo;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.MyFitnessCourseActivity;
import com.huawei.health.suggestion.ui.fitness.activity.SportAllCourseActivity;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessMyCourseProvider;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.btx;
import defpackage.gzx;
import defpackage.ibu;
import defpackage.iec;
import defpackage.iet;
import defpackage.lmf;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pea;
import defpackage.ped;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class YogaMyCourseProvider extends FitnessMyCourseProvider {
    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 137;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 23;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 137;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        b(context, (HashMap<String, Object>) map, (List<ibu>) obj);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessMyCourseProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return LoginInit.getInstance(context).getIsLogined();
    }

    public void b(Context context, HashMap<String, Object> map, List<ibu> list) {
        e(context, map, list);
    }

    private void e(Context context, HashMap<String, Object> map, List<ibu> list) {
        map.put("PAGE_TYPE", Integer.valueOf(getPageType()));
        map.put("TITLE", getSubViewTitle());
        int iMin = Math.min(list.size(), 6);
        List<ibu> listSubList = list.subList(0, iMin);
        if (list.size() == 0) {
            map.put("IS_LOAD_DEFAULT_VIEW", true);
            map.put("NO_DATA_NAME", BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_advice_run_no_running_courses));
            map.put("NO_DATA_CONTENT", BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_advice_run_not_trained_courses));
            map.put("NO_DATA_BUTTON", BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_advice_run_choose_running_courses));
        } else {
            map.put("IS_LOAD_DEFAULT_VIEW", false);
            a(listSubList, map, iMin);
        }
        c(context, map, listSubList);
    }

    private void c(final Context context, Map<String, Object> map, final List<ibu> list) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.YogaMyCourseProvider.2
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if (qrs.r()) {
                    LogUtil.a("Track_Provider_Track_YogaMyCourseProvider", "CLICK_EVENT_LISTENER onClick isFastClick");
                } else if ("MORE_CLICK_EVENT".equals(str)) {
                    YogaMyCourseProvider.this.a(context);
                } else if ("NO_DATA_BUTTON_CLICK_EVENT".equals(str)) {
                    YogaMyCourseProvider.this.d(context);
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.e(list, i)) {
                    LogUtil.e("Track_Provider_Track_YogaMyCourseProvider", "list is empty or out of bounds.", Integer.valueOf(i));
                    return;
                }
                ibu ibuVar = (ibu) list.get(i);
                if (ibuVar != null) {
                    YogaMyCourseProvider.this.e(ibuVar.c(), context);
                } else {
                    LogUtil.e("Track_Provider_Track_YogaMyCourseProvider", "courseBean is null");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(FitWorkout fitWorkout, Context context) {
        MarketingBiUtils.c(getPageType(), getSubViewTitle(), 2);
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        pcdVar.a("2");
        pea.a(context, fitWorkout, pcdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SportAllCourseActivity.class);
        intent.putExtra("COURSE_CATEGORY_KEY", getCourseCategory());
        intent.putExtra("SKIP_ALL_COURSE_KEY", "FITNESS_COURSE");
        HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(getType()));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.EVENT_CLICK_FITNESS_COURSE_MORE.value(), map, 0);
        a(context, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) MyFitnessCourseActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("titleName", getSubViewTitle());
        intent.putExtra("courseCategoryKey", getCourseCategory());
        MarketingBiUtils.c(getPageType(), getSubViewTitle(), 1);
        a(context, intent);
    }

    private void a(Context context, Intent intent) {
        if (context == null || intent == null) {
            LogUtil.j("Track_Provider_Track_YogaMyCourseProvider", "startActivity context or intent is null.");
            return;
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Track_Provider_Track_YogaMyCourseProvider", "startActivity ActivityNotFoundException.");
        }
    }

    private void a(List<ibu> list, Map<String, Object> map, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int i2 = 0;
        for (ibu ibuVar : list) {
            if (i2 >= i) {
                break;
            }
            arrayList.add(ibuVar.f());
            arrayList2.add(ibuVar.i());
            arrayList3.add(iec.c(ibuVar.b()));
            arrayList4.add(gzx.c(btx.c(), R.string.sug_fitness_min, ped.m(ibuVar.a())));
            arrayList5.add(iet.b(ibuVar.h()));
            arrayList6.add(getTagData(ibuVar.d()));
            i2++;
        }
        map.put("IMAGE", arrayList);
        map.put("NAME", arrayList2);
        map.put(PlayInfo.KEY_DURATION, arrayList4);
        map.put("DIFFICULTY", arrayList3);
        map.put("INTERVALS", arrayList5);
        map.put("ITEM_TAG", arrayList6);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessMyCourseProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Track_Provider_Track_YogaMyCourseProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return BaseApplication.getContext().getResources().getString(R.string.sug_my_yoga_class);
    }
}
