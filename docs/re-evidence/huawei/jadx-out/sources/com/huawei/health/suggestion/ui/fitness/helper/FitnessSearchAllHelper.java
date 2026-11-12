package com.huawei.health.suggestion.ui.fitness.helper;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.ui.SearchViewInterface;
import com.huawei.health.suggestion.ui.fragment.FitSearchFragmentFlowLayout;
import com.huawei.health.suggestion.ui.fragment.FitSearchFragmentRecyclerView;
import com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar;
import com.huawei.health.suggestion.ui.fragment.SearchRecyclerViewFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import defpackage.idy;
import defpackage.iei;
import defpackage.ien;
import defpackage.ies;
import defpackage.njy;
import defpackage.pea;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessSearchAllHelper implements FitnessSearchFragmentBar.OnQueryTextListener, FitSearchFragmentRecyclerView.LoadMoreListener, SearchRecyclerViewFragment.LoadMoreListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f9304a;
    private int j;
    private SearchViewInterface n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9305b = 0;
    private boolean m = false;
    private boolean f = false;
    private boolean h = true;
    private boolean l = false;
    private String d = null;
    private String e = null;
    private int g = 0;
    private Handler i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9306c = "";

    /* JADX WARN: Multi-variable type inference failed */
    public FitnessSearchAllHelper(Activity activity, int i) {
        this.f9304a = new WeakReference<>(activity);
        this.j = i;
        if (activity instanceof SearchViewInterface) {
            this.n = (SearchViewInterface) activity;
        }
    }

    @Override // com.huawei.health.suggestion.ui.fragment.FitSearchFragmentRecyclerView.LoadMoreListener
    public void loadMore() {
        LogUtil.a("Suggestion_FitSearchAllHelper", "loadMore()");
        b();
    }

    private void b() {
        synchronized (this) {
            e(this.d, 0);
        }
    }

    @Override // com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        LogUtil.a("Suggestion_FitSearchAllHelper", "onQueryTextSubmit query= ", str);
        e(str, 1);
        return false;
    }

    @Override // com.huawei.health.suggestion.ui.fragment.FitnessSearchFragmentBar.OnQueryTextListener
    public boolean onQueryTextChange(String str) {
        LogUtil.a("Suggestion_FitSearchAllHelper", "onQueryTextChange newText= ", str);
        e(str, 2);
        return false;
    }

    public void b(String str) {
        this.f9306c = str;
    }

    private void e(String str, int i) {
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                this.m = true;
                this.d = null;
                this.e = null;
                this.g = 0;
                LogUtil.a("Suggestion_FitSearchAllHelper", "postSearch TextUtils.isEmpty(query)");
                return;
            }
            this.m = false;
            if (this.f) {
                this.e = str;
                this.g = i;
                LogUtil.a("Suggestion_FitSearchAllHelper", "(mIsLoad = true)");
                return;
            }
            if (str.equals(this.d)) {
                if (!this.h) {
                    LogUtil.a("Suggestion_FitSearchAllHelper", "mHasMoreData = true");
                    a();
                    return;
                } else if (i != 0) {
                    LogUtil.a("Suggestion_FitSearchAllHelper", "type != QUERY_TEXT_LOAD_MORE");
                    this.n.hideLoadView();
                    return;
                } else {
                    this.f9305b++;
                    this.n.showLoadMore();
                }
            } else {
                this.h = true;
                this.l = false;
                this.f9305b = 0;
                this.d = str;
                this.n.clear();
            }
            this.f = true;
            d(this.f9305b * 10, str);
        }
    }

    private void a() {
        this.n.hideLoadMore();
        this.n.hideLoadView();
        if (this.l) {
            LogUtil.a("Suggestion_FitSearchAllHelper", "setViewControl() showSearchNoShow");
            this.n.showSearchNoShow();
        }
    }

    private void d(final int i, final String str) {
        String str2;
        LogUtil.a("Suggestion_FitSearchAllHelper", "postSearch query = ", str);
        int i2 = this.j;
        if (i2 == 1) {
            str2 = "RUNNING_COURSE";
        } else if (i2 == 2) {
            str2 = "FITNESS_COURSE";
        } else {
            str2 = "";
        }
        String str3 = str2;
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_FitSearchAllHelper", "querySearchRecords : courseApi is null.");
        } else {
            courseApi.searchCourseList(i, 10, str, str3, new UiCallback<List<Workout>>() { // from class: com.huawei.health.suggestion.ui.fitness.helper.FitnessSearchAllHelper.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i3, String str4) {
                    LogUtil.e("Suggestion_FitSearchAllHelper", "postSearch onFailure query= ", str, ", errorCode=", Integer.valueOf(i3), ", errorInfo=", str4);
                    FitnessSearchAllHelper.this.e((List<FitWorkout>) null, str);
                    FitnessSearchAllHelper.this.d((List<FitWorkout>) null, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<Workout> list) {
                    LogUtil.a("Suggestion_FitSearchAllHelper", "postSearch onSuccess query= ", str, ", pageStart=", Integer.valueOf(i), ", data=", Integer.valueOf(njy.b(list) ? list.size() : 0));
                    FitnessSearchAllHelper.this.e(pea.b(list), str);
                    FitnessSearchAllHelper.this.d(pea.b(list), str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<FitWorkout> list, String str) {
        iei.d(idy.b(this.f9306c), str, njy.b(list) ? list.size() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final List<FitWorkout> list, final String str) {
        synchronized (this) {
            this.i.post(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.helper.FitnessSearchAllHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    FitnessSearchAllHelper.this.c(list, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<FitWorkout> list, String str) {
        synchronized (this) {
            LogUtil.a("Suggestion_FitSearchAllHelper", "addDataInner query= ", str, ",mCurrentText=", this.d);
            Activity activity = this.f9304a.get();
            if (activity == null) {
                LogUtil.j("Suggestion_FitSearchAllHelper", "addDataInner activity is null");
                return;
            }
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                this.n.hideLoadView();
                if (this.f9305b == 0 && njy.e(list)) {
                    LogUtil.a("Suggestion_FitSearchAllHelper", "addDataInner show No data");
                    this.n.showSearchNoShow();
                    this.l = true;
                }
                if (njy.e(list) || list.size() < 10) {
                    this.h = false;
                }
                this.f = false;
                if (this.m) {
                    LogUtil.a("Suggestion_FitSearchAllHelper", "mIsNullText = true");
                    return;
                }
                if (str.equals(this.d)) {
                    int i = this.j;
                    if (i == 1) {
                        list = ien.b(list, "RUNNING_COURSE");
                    } else if (i == 2) {
                        list = ien.b(list, "FITNESS_COURSE");
                    } else if (njy.e(list)) {
                        list = Collections.EMPTY_LIST;
                    }
                    this.n.addData(list);
                }
                if (!TextUtils.isEmpty(this.e)) {
                    String str2 = this.e;
                    int i2 = this.g;
                    this.e = null;
                    this.g = 0;
                    if (!str2.equals(this.d)) {
                        e(str2, i2);
                    }
                }
                return;
            }
            LogUtil.j("Suggestion_FitSearchAllHelper", "addDataInner activity.isFinishing() || activity.isDestroyed()");
        }
    }

    public static class SearchAllFowAdapter implements FitSearchFragmentFlowLayout.FowAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9309c;
        private LinkedList<String> d = new LinkedList<>();
        private Context e;

        public SearchAllFowAdapter(Context context) {
            this.e = context.getApplicationContext();
            a();
        }

        public SearchAllFowAdapter(Context context, int i) {
            this.e = context.getApplicationContext();
            this.f9309c = i;
            a();
        }

        @Override // com.huawei.health.suggestion.ui.fragment.FitSearchFragmentFlowLayout.FowAdapter
        public LinkedList<String> getShowData() {
            return d();
        }

        private LinkedList<String> d() {
            LinkedList<String> linkedList;
            synchronized (this) {
                linkedList = this.d;
            }
            return linkedList;
        }

        @Override // com.huawei.health.suggestion.ui.fragment.FitSearchFragmentFlowLayout.FowAdapter
        public void saveShowData(String str) {
            d(str);
        }

        private void a() {
            String string;
            synchronized (this) {
                SharedPreferences sharedPreferences = this.e.getApplicationContext().getSharedPreferences("com.huawei.health.suggestion.ui.fragment.SearchAllFowAdapter", 0);
                int i = this.f9309c;
                if (i == 1) {
                    string = sharedPreferences.getString("flow_layout_run_key", null);
                } else if (i == 2) {
                    string = sharedPreferences.getString("flow_layout_fitness_key", null);
                } else {
                    string = sharedPreferences.getString("flow_layout_key", null);
                }
                c(string);
            }
        }

        private void c(String str) {
            if (str != null) {
                Iterator it = ies.c(str, String[].class).iterator();
                while (it.hasNext()) {
                    this.d.add((String) it.next());
                }
            }
        }

        private void d(String str) {
            synchronized (this) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                Iterator<String> it = this.d.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next())) {
                        it.remove();
                        break;
                    }
                }
                this.d.add(0, str);
                ArrayList arrayList = new ArrayList(10);
                Iterator<String> it2 = this.d.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                SharedPreferences sharedPreferences = this.e.getApplicationContext().getSharedPreferences("com.huawei.health.suggestion.ui.fragment.SearchAllFowAdapter", 0);
                if (sharedPreferences == null) {
                    LogUtil.j("Suggestion_FitSearchAllHelper", "saveFlowLayoutValue SharedPreferences can not null");
                    return;
                }
                int i = this.f9309c;
                if (i == 1) {
                    sharedPreferences.edit().putString("flow_layout_run_key", ies.c(arrayList)).commit();
                } else if (i == 2) {
                    sharedPreferences.edit().putString("flow_layout_fitness_key", ies.c(arrayList)).commit();
                } else {
                    sharedPreferences.edit().putString("flow_layout_key", ies.c(arrayList)).commit();
                }
            }
        }
    }
}
