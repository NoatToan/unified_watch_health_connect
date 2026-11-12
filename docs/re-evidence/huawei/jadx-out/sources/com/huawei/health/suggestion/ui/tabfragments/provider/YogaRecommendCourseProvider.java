package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.android.airsharing.api.PlayInfo;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessRecommendCourseProvider;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fua;
import defpackage.hcu;
import defpackage.ibs;
import defpackage.idy;
import defpackage.iec;
import defpackage.ifp;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pda;
import defpackage.pea;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class YogaRecommendCourseProvider extends FitnessRecommendCourseProvider<List<FitWorkout>> {
    protected void e() {
    }

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

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessRecommendCourseProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return false;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<FitWorkout> list) {
        a(context, map, list);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessRecommendCourseProvider, com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        if (!fua.i()) {
            super.loadData(context, sectionBean);
            return;
        }
        LogUtil.e(getLogTag(), "loadData RecommendCourse");
        if (super.isNeedUpdate()) {
            JSONObject jSONObjectJ = sectionBean.j();
            if (jSONObjectJ == null) {
                LogUtil.a(getLogTag(), "data is null");
                super.loadData(context, sectionBean);
                return;
            }
            LogUtil.a(getLogTag(), jSONObjectJ.toString());
            List<FitWorkout> listA = pda.a(jSONObjectJ);
            if (njy.e(listA)) {
                LogUtil.a(getLogTag(), "parse recommend data is null");
                return;
            }
            ibs.d(listA, getCourseCategory());
            List<Workout> listF = pea.f(listA);
            if (njy.e(listF)) {
                LogUtil.e(getLogTag(), "getRecWorkoutByCourseType onSuccess with null");
            } else {
                sectionBean.c(pea.b(listF));
                this.mIsLoad = true;
            }
        }
    }

    private void a(Context context, HashMap<String, Object> map, List<FitWorkout> list) {
        map.put("TITLE", BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_advice_run_recommended_running_courses));
        map.put("SUBTITLE", getSubViewTitle());
        c(list, map);
        d(context, list, map);
    }

    private void d(final Context context, final List<FitWorkout> list, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.YogaRecommendCourseProvider.3
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
                if ("ALL_CLICK_EVENT".equals(str)) {
                    YogaRecommendCourseProvider.this.e();
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.e(list, i)) {
                    LogUtil.e("Track_Provider_Fitness_YogaRecommendCourseProvider", "position is out of bounds");
                    return;
                }
                FitWorkout fitWorkout = (FitWorkout) list.get(i);
                if (fitWorkout != null) {
                    YogaRecommendCourseProvider.this.e(fitWorkout, context);
                } else {
                    LogUtil.e("Track_Provider_Fitness_YogaRecommendCourseProvider", "fitworkout is null");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(FitWorkout fitWorkout, Context context) {
        HashMap map = new HashMap(4);
        map.put("entrance", "5");
        map.put("position", 0);
        map.put("type", Integer.valueOf(getCourseCategory()));
        map.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, TextUtils.isEmpty(fitWorkout.acquireId()) ? "" : fitWorkout.acquireId());
        idy.b("1130015", map);
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        pcdVar.a(fitWorkout.acquireName());
        pea.a(context, fitWorkout, pcdVar);
    }

    private void c(List<FitWorkout> list, Map<String, Object> map) {
        float fD = hcu.b().d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (FitWorkout fitWorkout : list) {
            if (fitWorkout != null) {
                arrayList.add(fitWorkout.acquirePicture());
                arrayList2.add(pea.e(fitWorkout.acquirePriceTagBeanList()));
                arrayList3.add(fitWorkout.acquireName());
                arrayList4.add(ifp.d(BaseApplication.getContext(), com.huawei.health.basefitnessadvice.R.string.sug_fitness_min, ifp.d(fitWorkout.acquireDuration())));
                arrayList5.add(fitWorkout.isLongExplainVideoCourse() ? "" : ifp.d(BaseApplication.getContext(), com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, ifp.a(ifp.b(fitWorkout.acquireCalorie() * fD))));
                arrayList6.add(fitWorkout.isLongExplainVideoCourse() ? "" : iec.c(fitWorkout.acquireDifficulty()));
                arrayList7.add(ifp.c(com.huawei.health.basefitnessadvice.R.plurals.sug_fitness_personjoin, fitWorkout.acquireUsers(), UnitUtil.e(fitWorkout.acquireUsers(), 1, 0)));
            }
        }
        map.put("BACKGROUND_IMAGE", arrayList);
        map.put("CORNER_VIEW", arrayList2);
        map.put("NAME", arrayList3);
        map.put(PlayInfo.KEY_DURATION, arrayList4);
        map.put("CALORIES", arrayList5);
        map.put("DIFFICULTY", arrayList6);
        map.put("TRAIN_NUMBER", arrayList7);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Track_Provider_Fitness_YogaRecommendCourseProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return "";
    }
}
