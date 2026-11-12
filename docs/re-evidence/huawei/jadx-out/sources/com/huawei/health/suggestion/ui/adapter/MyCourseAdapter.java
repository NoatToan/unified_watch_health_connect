package com.huawei.health.suggestion.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.module.FitnessTopicDeleteModel;
import com.huawei.health.suggestion.ui.fitness.viewholder.LoadMoreViewHolder;
import com.huawei.health.suggestion.ui.viewholder.CourseItemHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.hjs;
import defpackage.njy;
import defpackage.pea;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MyCourseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9021c;
    private FitnessTopicDeleteModel e;
    private String f;
    private OnItemClickListener h;
    private boolean j;
    private List<Object> d = new ArrayList(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9019a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9020b = 1;
    private CourseItemHolder.ClickItemCount i = new CourseItemHolder.ClickItemCount() { // from class: com.huawei.health.suggestion.ui.adapter.MyCourseAdapter.4
        @Override // com.huawei.health.suggestion.ui.viewholder.CourseItemHolder.ClickItemCount
        public void onClickCheckBoxItem() {
            LogUtil.a("Suggestion_MyFitnessCourseAdapter", "onClickCheckBoxItem item ");
            if (MyCourseAdapter.this.h != null) {
                MyCourseAdapter.this.h.onItemClick();
            }
        }
    };

    public interface OnItemClickListener {
        void onItemClick();
    }

    public MyCourseAdapter(HealthRecycleView healthRecycleView) {
        this.f9021c = healthRecycleView.getContext();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("Suggestion_MyFitnessCourseAdapter", "onCreateViewHolder(ViewGroup parent, int viewType)");
        if (i == 1) {
            return new LoadMoreViewHolder(LayoutInflater.from(this.f9021c).inflate(R.layout.sug_his_loading_more, viewGroup, false));
        }
        return new CourseItemHolder(LayoutInflater.from(this.f9021c).inflate(R.layout.sug_my_course_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.a("Suggestion_MyFitnessCourseAdapter", "onBindViewHolder(HealthRecycleView.ViewHolder holder, int position)");
        if (!(viewHolder instanceof CourseItemHolder) || njy.e(this.d, i)) {
            LogUtil.e("Suggestion_MyFitnessCourseAdapter", "onBindViewHolder error!");
            return;
        }
        CourseItemHolder courseItemHolder = (CourseItemHolder) viewHolder;
        if (getItemViewType(i) == 0) {
            FitnessTopicDeleteModel fitnessTopicDeleteModel = this.e;
            if (fitnessTopicDeleteModel != null) {
                fitnessTopicDeleteModel.savePosition(i);
            }
            if (i == 0) {
                courseItemHolder.a(0);
            } else {
                Context context = this.f9021c;
                if (context != null && qrs.af(context) && i == 1) {
                    courseItemHolder.a(0);
                } else {
                    courseItemHolder.a(8);
                }
            }
            if (i == this.d.size() - 1) {
                courseItemHolder.e(8);
            } else {
                Context context2 = this.f9021c;
                if (context2 != null && qrs.af(context2) && i == this.d.size() - 2) {
                    courseItemHolder.e(8);
                } else {
                    courseItemHolder.e(0);
                }
            }
            if (this.d.get(i) instanceof Workout) {
                courseItemHolder.d(this.e, this.f, this.j, this.d.get(i));
            } else {
                courseItemHolder.b(this.e, this.d.get(i));
            }
            courseItemHolder.c(this.i);
            courseItemHolder.b(this.f9020b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f9019a && this.d.size() >= 50) {
            return this.d.size() + 1;
        }
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (this.f9019a && this.d.size() >= 50 && i == getItemCount() - 1) ? 1 : 0;
    }

    public void b(boolean z) {
        this.f9019a = z;
        notifyDataSetChanged();
    }

    public boolean a() {
        return this.f9019a;
    }

    public void d(int i) {
        this.f9020b = i;
    }

    public void a(FitnessTopicDeleteModel fitnessTopicDeleteModel, boolean z, List<Object> list) {
        this.d.clear();
        b(fitnessTopicDeleteModel, z, list);
    }

    public void e(boolean z, List<FitWorkout> list) {
        this.d.clear();
        if (list == null) {
            LogUtil.j("Suggestion_MyFitnessCourseAdapter", "fitWorkouts null or size =0");
            return;
        }
        if (list.size() < 50) {
            this.f9019a = false;
        }
        int size = this.d.size();
        this.j = z;
        this.d.addAll(list);
        int iMax = Math.max(1, getItemCount() - size);
        if (size == 0) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeChanged(size, iMax);
        }
    }

    public void b(FitnessTopicDeleteModel fitnessTopicDeleteModel, boolean z, List<Object> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_MyFitnessCourseAdapter", "fitWorkouts null or size =0");
            return;
        }
        LogUtil.j("Suggestion_MyFitnessCourseAdapter", Integer.valueOf(list.hashCode()));
        if (fitnessTopicDeleteModel != null) {
            this.e = fitnessTopicDeleteModel;
        }
        this.j = z;
        this.d.addAll(list);
        this.d = a(this.d);
        e();
        notifyDataSetChanged();
    }

    private void e() {
        if (this.f9020b == 3 && njy.b((Object) this.d, Workout.class)) {
            List<FitWorkout> listB = pea.b((List<Workout>) njy.b((List) this.d, Workout.class));
            hjs.b().b(listB);
            this.d = njy.b((List) pea.f(listB), Object.class);
        }
    }

    private List<Object> a(List<Object> list) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.j("Suggestion_MyFitnessCourseAdapter", "removeWorkout() workouts is null");
            return arrayList;
        }
        for (Object obj : list) {
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public List<Object> b() {
        return this.d;
    }

    public void a(FitnessTopicDeleteModel fitnessTopicDeleteModel, boolean z) {
        if (fitnessTopicDeleteModel != null) {
            this.e = fitnessTopicDeleteModel;
        }
        this.j = z;
        notifyItemRangeChanged(0, getItemCount(), true);
    }

    public void d(OnItemClickListener onItemClickListener) {
        this.h = onItemClickListener;
    }

    public void b(String str) {
        this.f = str;
    }
}
