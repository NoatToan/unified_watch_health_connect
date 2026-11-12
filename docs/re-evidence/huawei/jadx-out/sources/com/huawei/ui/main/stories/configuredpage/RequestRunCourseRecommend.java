package com.huawei.ui.main.stories.configuredpage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.health.suggestion.model.RunRecommendWorkout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.main.stories.configuredpage.RequestRunCourseRecommend;
import defpackage.ien;
import defpackage.njy;
import defpackage.tqz;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class RequestRunCourseRecommend {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26372a;
    private FragmentManager d;
    private List<RunRecommendWorkout> f = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<RunRecommendWorkout> f26373b = new ArrayList();
    private List<FitWorkout> h = new ArrayList();
    private List<FitWorkout> j = new ArrayList();
    private CountDownLatch e = new CountDownLatch(5);
    private State g = State.ACTIVE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f26374c = new Handler(Looper.getMainLooper()) { // from class: com.huawei.ui.main.stories.configuredpage.RequestRunCourseRecommend.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                ReleaseLogUtil.a("Suggest_RequestRunCourseRecommend", "msg is null!");
                return;
            }
            super.handleMessage(message);
            if (message.what == 101) {
                ReleaseLogUtil.d("Suggest_RequestRunCourseRecommend", "add recommend data.");
                ArrayList<FitWorkout> arrayListD = RequestRunCourseRecommend.this.d();
                LogUtil.a("Suggest_RequestRunCourseRecommend", "MSG_ADD_RECOMMEND_DATA mContainerId: ", Integer.valueOf(RequestRunCourseRecommend.this.f26372a));
                if (RequestRunCourseRecommend.this.e()) {
                    tqz.d().d(RequestRunCourseRecommend.this.f26372a, RequestRunCourseRecommend.this.d, arrayListD);
                }
            }
        }
    };

    public enum State {
        ACTIVE,
        INACTIVE
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            ReleaseLogUtil.d("Suggest_RequestRunCourseRecommend", "mCountDownLatch count = ", Long.valueOf(this.e.getCount()));
            if (this.e.getCount() <= 0) {
                this.f26374c.sendEmptyMessage(101);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.configuredpage.RequestRunCourseRecommend$1, reason: invalid class name */
    class AnonymousClass1 extends DataCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RequestRunCourseRecommend f26375b;

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("Suggest_RequestRunCourseRecommend", "getRecommedCourseByCloud error.", Integer.valueOf(i));
            this.f26375b.b();
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onSuccess(JSONObject jSONObject) {
            ReleaseLogUtil.d("Suggest_RequestRunCourseRecommend", "getRecommedCourseByCloud success.");
            this.f26375b.b();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("runRecoWorkoutList");
            if (jSONArrayOptJSONArray != null) {
                this.f26375b.f26373b = (List) new Gson().fromJson(CommonUtil.ac(jSONArrayOptJSONArray.toString()), new TypeToken<List<RunRecommendWorkout>>() { // from class: com.huawei.ui.main.stories.configuredpage.RequestRunCourseRecommend$3$1
                }.getType());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<FitWorkout> d() {
        Map<String, FitWorkout> mapE = e(this.h);
        if (ien.e(BaseApplication.getContext())) {
            return c(mapE, a(this.f26373b, this.f), this.j);
        }
        return c(mapE, a(this.f26373b, b(mapE)), this.j);
    }

    private ArrayList<FitWorkout> c(Map<String, FitWorkout> map, List<RunRecommendWorkout> list, List<FitWorkout> list2) {
        FitWorkout fitWorkout;
        ArrayList<FitWorkout> arrayList = new ArrayList<>(list.size());
        if (!njy.e(list)) {
            d(list, list2);
            Collections.sort(list, new Comparator() { // from class: trc
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return RequestRunCourseRecommend.c((RunRecommendWorkout) obj, (RunRecommendWorkout) obj2);
                }
            });
            for (RunRecommendWorkout runRecommendWorkout : list) {
                if (runRecommendWorkout != null && (fitWorkout = map.get(runRecommendWorkout.getWorkoutId())) != null) {
                    arrayList.add(fitWorkout);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ int c(RunRecommendWorkout runRecommendWorkout, RunRecommendWorkout runRecommendWorkout2) {
        return runRecommendWorkout2.getWeight() - runRecommendWorkout.getWeight();
    }

    private void d(List<RunRecommendWorkout> list, List<FitWorkout> list2) {
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

    private List<RunRecommendWorkout> a(List<RunRecommendWorkout> list, List<RunRecommendWorkout> list2) {
        ArrayList arrayList = new ArrayList(6);
        arrayList.addAll(list);
        for (RunRecommendWorkout runRecommendWorkout : list2) {
            if (runRecommendWorkout != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        RunRecommendWorkout runRecommendWorkout2 = (RunRecommendWorkout) it.next();
                        if (runRecommendWorkout2 != null && runRecommendWorkout2.getWorkoutId().equals(runRecommendWorkout.getWorkoutId())) {
                            runRecommendWorkout2.setWeight(runRecommendWorkout2.getWeight() + 100);
                            break;
                        }
                    } else {
                        arrayList.add(runRecommendWorkout);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private List<RunRecommendWorkout> b(Map<String, FitWorkout> map) {
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

    private Map<String, FitWorkout> e(List<FitWorkout> list) {
        HashMap map = new HashMap(list.size());
        for (FitWorkout fitWorkout : list) {
            if (fitWorkout != null && map.get(fitWorkout.acquireId()) == null) {
                map.put(fitWorkout.acquireId(), fitWorkout);
            }
        }
        return map;
    }

    public boolean e() {
        return this.g == State.ACTIVE;
    }
}
