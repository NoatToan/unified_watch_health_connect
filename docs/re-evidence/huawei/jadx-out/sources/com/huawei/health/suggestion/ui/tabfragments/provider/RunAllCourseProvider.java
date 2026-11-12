package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.android.airsharing.api.PlayInfo;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.basefitnessadvice.model.WorkoutListBean;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.RunCourseRecommendCallback;
import com.huawei.health.suggestion.model.RunRecommendWorkout;
import com.huawei.health.suggestion.ui.tabfragments.provider.RunAllCourseProvider;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider;
import com.huawei.health.suggestion.util.ClickEventUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.dkf;
import defpackage.hcu;
import defpackage.iec;
import defpackage.ien;
import defpackage.ifp;
import defpackage.njy;
import defpackage.pea;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class RunAllCourseProvider extends FitnessEntranceProvider<List<FitWorkout>> {
    private SectionBean j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10103b = true;
    private List<RunRecommendWorkout> d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<RunRecommendWorkout> f10104c = new ArrayList();
    private List<FitWorkout> i = new ArrayList();
    private List<FitWorkout> f = new ArrayList();
    private List<FitWorkout> e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f10102a = new CountDownLatch(4);

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 258;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 4;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ReleaseLogUtil.d("Track_Provider_Track_RunAllCourseProvider", "refresh recommend data.");
        this.f10103b = this.e.size() != 0;
        this.j.c(this.e);
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        if (!this.f10103b) {
            return false;
        }
        if (Utils.j()) {
            return true;
        }
        return Utils.o() && Utils.h();
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        this.j = sectionBean;
        e();
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<FitWorkout> list) {
        b(map, list);
    }

    private void b(HashMap<String, Object> map, List<FitWorkout> list) {
        if (ien.e(BaseApplication.getContext())) {
            map.put("TITLE", BaseApplication.getContext().getString(R.string.IDS_fitness_advice_run_recommended_running_courses));
            map.put("SUBTITLE", BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_advice_run_all_running_courses));
            map.remove("RIGHT_ARRAY");
        } else {
            map.put("TITLE", BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_advice_run_all_running_courses));
            map.put("RIGHT_ARRAY", true);
            map.remove("SUBTITLE");
        }
        c(list, map);
        d(list, map);
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
                arrayList2.add(fitWorkout.acquireName());
                arrayList3.add(ifp.d(BaseApplication.getContext(), com.huawei.health.basefitnessadvice.R.string.sug_fitness_min, ifp.d(fitWorkout.acquireDuration())));
                arrayList4.add(ifp.d(BaseApplication.getContext(), com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, ifp.a(ifp.b(fitWorkout.acquireCalorie() * fD))));
                arrayList5.add(iec.c(fitWorkout.acquireDifficulty()));
                if (qrs.ac()) {
                    arrayList6.add("");
                } else {
                    arrayList6.add(ifp.c(com.huawei.health.basefitnessadvice.R.plurals.sug_fitness_personjoin, fitWorkout.acquireUsers(), UnitUtil.e(fitWorkout.acquireUsers(), 1, 0)));
                    arrayList7.add(ien.a(fitWorkout, (ImageView) null));
                }
                fD = fD;
            }
        }
        map.put("BACKGROUND_IMAGE", arrayList);
        map.put("NAME", arrayList2);
        map.put(PlayInfo.KEY_DURATION, arrayList3);
        map.put("CALORIES", arrayList4);
        map.put("DIFFICULTY", arrayList5);
        map.put("TRAIN_NUMBER", arrayList6);
        map.put("NEW_IMAGE", arrayList7);
    }

    private void d(final List<FitWorkout> list, Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunAllCourseProvider.2
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
                    HashMap map2 = new HashMap();
                    map2.put("courseCategory", Integer.valueOf(RunAllCourseProvider.this.getCourseCategory()));
                    ClickEventUtils.c(ClickEventUtils.ClickEventType.ALL_RUN_COURSE, map2);
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.e(list, i)) {
                    LogUtil.e("Track_Provider_Track_RunAllCourseProvider", "position is out of bounds");
                    return;
                }
                FitWorkout fitWorkout = (FitWorkout) list.get(i);
                if (fitWorkout == null) {
                    LogUtil.e("Track_Provider_Track_RunAllCourseProvider", "fitworkout is null");
                } else {
                    ClickEventUtils.c(ClickEventUtils.ClickEventType.RUN_COURSE, dkf.d(4, "5", RunAllCourseProvider.this.getCourseCategory(), fitWorkout));
                }
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Track_Provider_Track_RunAllCourseProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return "";
    }

    public void e() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: icq
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a();
            }
        });
    }

    public /* synthetic */ void a() {
        c();
        j();
        g();
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        CountDownLatch countDownLatch = this.f10102a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            ReleaseLogUtil.d("Track_Provider_Track_RunAllCourseProvider", "mCountDownLatch count = ", Long.valueOf(this.f10102a.getCount()));
            if (this.f10102a.getCount() <= 0) {
                b();
            }
        }
    }

    private void c() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Track_Provider_Track_RunAllCourseProvider", "getCloudRecommendCourse : courseApi is null.");
        } else {
            courseApi.getRecommendCourseByCloud(new DataCallback() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunAllCourseProvider.5
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Track_Provider_Track_RunAllCourseProvider", "getRecommedCourseByCloud error.", Integer.valueOf(i));
                    RunAllCourseProvider.this.d();
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    ReleaseLogUtil.d("Track_Provider_Track_RunAllCourseProvider", "getRecommedCourseByCloud success.");
                    RunAllCourseProvider.this.d();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("runRecoWorkoutList");
                    if (jSONArrayOptJSONArray != null) {
                        RunAllCourseProvider.this.f10104c = (List) new Gson().fromJson(CommonUtil.ac(jSONArrayOptJSONArray.toString()), new TypeToken<List<RunRecommendWorkout>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunAllCourseProvider.2.1
                        }.getType());
                    }
                }
            });
        }
    }

    private void g() {
        if (ien.e() == 204) {
            c(204);
        } else {
            e(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Track_Provider_Track_RunAllCourseProvider", "getTopicId : courseApi is null.", Integer.valueOf(i));
        } else {
            ReleaseLogUtil.d("Track_Provider_Track_RunAllCourseProvider", "getFitnessCourseTopicList()  pageNum:", Integer.valueOf(i));
            courseApi.getCourseTopicList(i, new d(this, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Track_Provider_Track_RunAllCourseProvider", "getRunCourseByTopicId : courseApi is null.");
        } else {
            courseApi.getCoursesByTopicId(0, i, new UiCallback<List<Workout>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunAllCourseProvider.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str) {
                    ReleaseLogUtil.a("Track_Provider_Track_RunAllCourseProvider", str, "Failed, errorCode:", Integer.valueOf(i2));
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<Workout> list) {
                    if (njy.e(list)) {
                        ReleaseLogUtil.e("Track_Provider_Track_RunAllCourseProvider", "workouts is Empty");
                        return;
                    }
                    ReleaseLogUtil.d("Track_Provider_Track_RunAllCourseProvider", "workouts num:", Integer.valueOf(list.size()));
                    RunAllCourseProvider.this.i = pea.b(list);
                    RunAllCourseProvider.this.d();
                }
            });
        }
    }

    private void j() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Track_Provider_Track_RunAllCourseProvider", "getCourseRecommedIndexList courseApi == null");
        } else {
            courseApi.getCourseRecommendIndexList(new RunCourseRecommendCallback() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunAllCourseProvider.4
                @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
                public void onSuccess(String str) {
                }

                @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
                public void onSuccess(List<String> list) {
                    if (!njy.e(list)) {
                        RunAllCourseProvider.this.d.clear();
                        for (String str : list) {
                            RunRecommendWorkout runRecommendWorkout = new RunRecommendWorkout();
                            runRecommendWorkout.setWeight(1);
                            runRecommendWorkout.setWorkoutId(str);
                            if (!RunAllCourseProvider.this.d.contains(runRecommendWorkout)) {
                                RunAllCourseProvider.this.d.add(runRecommendWorkout);
                            }
                        }
                        ReleaseLogUtil.d("Track_Provider_Track_RunAllCourseProvider", "courseId size", Integer.valueOf(RunAllCourseProvider.this.d.size()));
                        RunAllCourseProvider.this.d();
                        return;
                    }
                    ReleaseLogUtil.e("Track_Provider_Track_RunAllCourseProvider", "CollectionUtils.isEmpty(courseId)");
                    RunAllCourseProvider.this.d();
                }

                @Override // com.huawei.health.suggestion.RunCourseRecommendCallback
                public void onFailure(int i, String str) {
                    RunAllCourseProvider.this.d();
                    ReleaseLogUtil.a("Track_Provider_Track_RunAllCourseProvider", "setRecommendData onFailure");
                }
            });
        }
    }

    private void h() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Track_Provider_Track_RunAllCourseProvider", "collect : courseApi is null.");
        } else {
            courseApi.getJoinedCourses(new WorkoutListBean(0, Integer.MAX_VALUE, (Integer[]) null, (Integer[]) null, (Integer[]) null, -1, (Integer[]) null, false), new UiCallback<List<Workout>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunAllCourseProvider.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Track_Provider_Track_RunAllCourseProvider", "getJoinedWorkouts error.", Integer.valueOf(i));
                    RunAllCourseProvider.this.d();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<Workout> list) {
                    ReleaseLogUtil.d("Track_Provider_Track_RunAllCourseProvider", "getJoinedWorkouts onSuccess");
                    if (njy.e(list)) {
                        ReleaseLogUtil.e("Track_Provider_Track_RunAllCourseProvider", "my running FitWorkout data == null");
                        RunAllCourseProvider.this.d();
                        return;
                    }
                    List<FitWorkout> listB = pea.b(list);
                    ArrayList arrayList = new ArrayList();
                    for (FitWorkout fitWorkout : listB) {
                        if (fitWorkout != null && fitWorkout.getIntervals() != -2) {
                            arrayList.add(fitWorkout);
                        }
                    }
                    RunAllCourseProvider.this.f = ien.b(arrayList, "RUNNING_COURSE");
                    ReleaseLogUtil.d("Track_Provider_Track_RunAllCourseProvider", "showTrainCourseData() mMyRunWorkouts.size = ", Integer.valueOf(RunAllCourseProvider.this.f.size()));
                    RunAllCourseProvider.this.d();
                }
            });
        }
    }

    private void d(List<String> list) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Track_Provider_Track_RunAllCourseProvider", "getCourseByIds : courseApi is null.");
        } else {
            courseApi.getCourseByIds(pea.c(list), false, new UiCallback<List<FitWorkout>>() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.RunAllCourseProvider.6
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Track_Provider_Track_RunAllCourseProvider", "getCourseByIds error.", Integer.valueOf(i));
                    RunAllCourseProvider.this.f();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitWorkout> list2) {
                    ReleaseLogUtil.d("Track_Provider_Track_RunAllCourseProvider", "getCourseByIds onSuccess");
                    RunAllCourseProvider.this.e = list2;
                    RunAllCourseProvider.this.f();
                }
            });
        }
    }

    private void b() {
        if (ien.e(BaseApplication.getContext())) {
            c(b(this.f10104c, this.d), this.f);
        } else {
            c(b(this.f10104c, c(a(this.i))), this.f);
        }
    }

    private void c(List<RunRecommendWorkout> list, List<FitWorkout> list2) {
        if (njy.e(list)) {
            return;
        }
        e(list, list2);
        Collections.sort(list, new Comparator() { // from class: ico
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return RunAllCourseProvider.a((RunRecommendWorkout) obj, (RunRecommendWorkout) obj2);
            }
        });
        ArrayList arrayList = new ArrayList(list.size());
        for (RunRecommendWorkout runRecommendWorkout : list) {
            if (runRecommendWorkout != null) {
                arrayList.add(runRecommendWorkout.getWorkoutId());
            }
        }
        d(arrayList);
    }

    public static /* synthetic */ int a(RunRecommendWorkout runRecommendWorkout, RunRecommendWorkout runRecommendWorkout2) {
        return runRecommendWorkout2.getWeight() - runRecommendWorkout.getWeight();
    }

    private void e(List<RunRecommendWorkout> list, List<FitWorkout> list2) {
        for (FitWorkout fitWorkout : list2) {
            if (fitWorkout != null) {
                for (RunRecommendWorkout runRecommendWorkout : list) {
                    if (runRecommendWorkout != null && runRecommendWorkout.getWorkoutId().equals(fitWorkout.acquireId())) {
                        runRecommendWorkout.setWeight(0);
                    }
                }
            }
        }
    }

    private List<RunRecommendWorkout> b(List<RunRecommendWorkout> list, List<RunRecommendWorkout> list2) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(new ArrayList(6));
        copyOnWriteArrayList.addAll(list);
        for (RunRecommendWorkout runRecommendWorkout : new ArrayList(list2)) {
            if (runRecommendWorkout != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        RunRecommendWorkout runRecommendWorkout2 = (RunRecommendWorkout) it.next();
                        if (runRecommendWorkout2 != null && runRecommendWorkout2.getWorkoutId().equals(runRecommendWorkout.getWorkoutId())) {
                            runRecommendWorkout2.setWeight(runRecommendWorkout2.getWeight() + 100);
                            break;
                        }
                    } else {
                        copyOnWriteArrayList.add(runRecommendWorkout);
                        break;
                    }
                }
            }
        }
        return new ArrayList(copyOnWriteArrayList);
    }

    private List<RunRecommendWorkout> c(Map<String, FitWorkout> map) {
        ArrayList arrayList = new ArrayList(3);
        for (FitWorkout fitWorkout : map.values()) {
            if (fitWorkout != null) {
                RunRecommendWorkout runRecommendWorkout = new RunRecommendWorkout();
                runRecommendWorkout.setWeight(1);
                runRecommendWorkout.setWorkoutId(fitWorkout.acquireId());
                arrayList.add(runRecommendWorkout);
                if (arrayList.size() == 3) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private Map<String, FitWorkout> a(List<FitWorkout> list) {
        HashMap map = new HashMap(list.size());
        for (FitWorkout fitWorkout : list) {
            if (fitWorkout != null && map.get(fitWorkout.acquireId()) == null) {
                map.put(fitWorkout.acquireId(), fitWorkout);
            }
        }
        return map;
    }

    public static class d extends UiCallback<List<Topic>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10111a;
        WeakReference<RunAllCourseProvider> e;

        d(RunAllCourseProvider runAllCourseProvider, int i) {
            this.e = new WeakReference<>(runAllCourseProvider);
            this.f10111a = i;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("Track_Provider_Track_RunAllCourseProvider", "getFitnessCourseTopicList()  errorCode:", Integer.valueOf(i), " pageNum:", Integer.valueOf(this.f10111a));
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final List<Topic> list) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: icr
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(list);
                }
            });
        }

        public /* synthetic */ void e(List list) {
            RunAllCourseProvider runAllCourseProvider = this.e.get();
            if (runAllCourseProvider == null) {
                ReleaseLogUtil.e("Track_Provider_Track_RunAllCourseProvider", "requestRunCourseRecommend is null");
                return;
            }
            if (njy.e(list)) {
                ReleaseLogUtil.e("Track_Provider_Track_RunAllCourseProvider", "initRunCourseTopic data null");
                return;
            }
            ReleaseLogUtil.d("Track_Provider_Track_RunAllCourseProvider", "topic num:", Integer.valueOf(list.size()), " pageNum:", Integer.valueOf(this.f10111a));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Topic topic = (Topic) it.next();
                if (topic != null && "SF006".equals(topic.acquireSerialNum())) {
                    runAllCourseProvider.c(topic.acquireId());
                    return;
                }
            }
            int i = this.f10111a + 1;
            this.f10111a = i;
            runAllCourseProvider.e(i);
        }
    }
}
