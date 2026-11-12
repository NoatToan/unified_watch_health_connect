package com.huawei.ui.main.stories.health.pressure.provider;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.ifp;
import defpackage.lsx;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pea;
import defpackage.qrs;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class YogaBreathProvider extends BaseKnitDataProvider<List<FitWorkout>> {
    private Context e;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        c(context, (HashMap<String, Object>) map, (List<FitWorkout>) obj);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void e(Context context, SectionBean sectionBean) {
        LogUtil.e(getLogTag(), "loadData");
        this.e = context;
        ThreadPoolManager.c().execute(new e(this, sectionBean));
    }

    public void c(Context context, HashMap<String, Object> map, List<FitWorkout> list) {
        c(list, map);
        c(context, list, map);
    }

    private void c(List<FitWorkout> list, Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (FitWorkout fitWorkout : list) {
            if (fitWorkout != null) {
                arrayList.add(fitWorkout.acquirePicture());
                arrayList2.add(pea.e(fitWorkout.acquirePriceTagBeanList()));
                arrayList3.add(fitWorkout.acquireName());
                arrayList4.add(ifp.c(R.plurals.sug_fitness_personjoin, fitWorkout.acquireUsers(), UnitUtil.e(fitWorkout.acquireUsers(), 1, 0)));
            }
        }
        map.put("BACKGROUND_IMAGE", arrayList);
        map.put("CORNER_VIEW", arrayList2);
        map.put("NAME", arrayList3);
        map.put("TRAIN_NUMBER", arrayList4);
    }

    private void c(final Context context, final List<FitWorkout> list, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.pressure.provider.YogaBreathProvider.1
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
                    YogaBreathProvider.this.d();
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.e(list, i)) {
                    LogUtil.e("YogaBreathProvider", "position is out of bounds");
                    return;
                }
                FitWorkout fitWorkout = (FitWorkout) list.get(i);
                if (fitWorkout != null) {
                    YogaBreathProvider.this.e(context, fitWorkout);
                } else {
                    LogUtil.e("YogaBreathProvider", "fitworkout is null");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (qrs.r()) {
            LogUtil.j("YogaBreathProvider", "fast click");
            return;
        }
        LogUtil.a("YogaBreathProvider", "subtitle is clicked");
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/fitnesspage?skip_type=course_details&id=" + Integer.toString(2104)));
        intent.setPackage(this.e.getPackageName());
        lsx.c(intent, this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            return;
        }
        if (qrs.r()) {
            LogUtil.j("YogaBreathProvider", "fast click");
            return;
        }
        LogUtil.a("YogaBreathProvider", "jump to course detail");
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        pcdVar.a(fitWorkout.acquireName());
        pea.a(context, fitWorkout, pcdVar);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "YogaBreathProvider";
    }

    static class e implements Runnable {
        WeakReference<SectionBean> d;
        WeakReference<YogaBreathProvider> e;

        public e(YogaBreathProvider yogaBreathProvider, SectionBean sectionBean) {
            this.e = new WeakReference<>(yogaBreathProvider);
            this.d = new WeakReference<>(sectionBean);
        }

        @Override // java.lang.Runnable
        public void run() {
            final YogaBreathProvider yogaBreathProvider = this.e.get();
            final SectionBean sectionBean = this.d.get();
            if (yogaBreathProvider == null || sectionBean == null) {
                return;
            }
            LogUtil.a(yogaBreathProvider.getLogTag(), "GetRecWorkoutRunnable start");
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi == null) {
                LogUtil.j(yogaBreathProvider.getLogTag(), "getCourseRecord : courseApi is null.");
            } else {
                courseApi.getCoursesByTopicId(0, 2104, new UiCallback<List<Workout>>() { // from class: com.huawei.ui.main.stories.health.pressure.provider.YogaBreathProvider.e.5
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.j(yogaBreathProvider.getLogTag(), "getRecWorkoutByCourseType onfalure errorCode:", Integer.valueOf(i), " errorInfo:", str);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(List<Workout> list) {
                        if (njy.e(list)) {
                            LogUtil.e(yogaBreathProvider.getLogTag(), "getRecWorkoutByCourseType onSuccess with null");
                            return;
                        }
                        LogUtil.a(yogaBreathProvider.getLogTag(), "getRecommendCoursesByRules onSuccess List<FitWorkout> size:", Integer.valueOf(list.size()));
                        List<FitWorkout> listB = pea.b(list);
                        LogUtil.a("YogaBreathProvider", "fitWorkouts size: ", Integer.valueOf(listB.size()));
                        sectionBean.c(listB);
                    }
                });
            }
        }
    }
}
