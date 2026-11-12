package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessSeriesCourseActivity;
import com.huawei.health.suggestion.ui.fitness.adapter.FitnessSeriesCourseViewAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.idy;
import defpackage.njy;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessSeriesCourseViewFragmentHolder extends AbsFitnessViewHolder<List<Topic>> implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FitnessSeriesCourseViewAdapter f9498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f9499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRecycleView f9500c;
    private HealthSubHeader d;

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void init(List<Topic> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_FitnessSeriesCourseViewFragmentHolder", "init view holder topic data is null");
            return;
        }
        b(list);
        FitnessSeriesCourseViewAdapter fitnessSeriesCourseViewAdapter = new FitnessSeriesCourseViewAdapter(list);
        this.f9498a = fitnessSeriesCourseViewAdapter;
        this.f9500c.setAdapter(fitnessSeriesCourseViewAdapter);
        this.f9500c.setHasFixedSize(true);
        this.f9500c.setNestedScrollingEnabled(false);
        setRecyclerViewLayout(this.itemView.getContext(), this.f9500c);
        a(list);
        this.d.setMoreViewClickListener(this);
    }

    private void a(List<Topic> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_FitnessSeriesCourseViewFragmentHolder", "setDataAndRefresh(),topics is empty");
        } else {
            this.f9498a.c(list);
        }
    }

    private void b(List<Topic> list) {
        if (njy.b(list)) {
            this.f9499b.setVisibility(0);
        } else {
            this.f9499b.setVisibility(8);
            LogUtil.j("Suggestion_FitnessSeriesCourseViewFragmentHolder", "setGroupVisibility(),topics is empty");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isFastClick()) {
            LogUtil.j("Suggestion_FitnessSeriesCourseViewFragmentHolder", "FitnessSeriesCourseViewFragmentHolder is fast click");
            return;
        }
        Intent intent = new Intent(view.getContext(), (Class<?>) FitnessSeriesCourseActivity.class);
        intent.addFlags(268435456);
        try {
            view.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Suggestion_FitnessSeriesCourseViewFragmentHolder", "onClick ActivityNotFoundException.");
        }
        e();
    }

    private void e() {
        HashMap map = new HashMap(2);
        map.put("entrance", this.itemView.getContext().getString(R.string.sug_series_courses));
        map.put("position", 1);
        idy.b("1130015", map);
    }
}
