package com.huawei.health.suggestion.ui.run.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btx;
import defpackage.ibn;
import defpackage.ien;
import defpackage.ifp;
import defpackage.njy;
import defpackage.pdu;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class AiPlanCourseDetailAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Plan f9932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9934c;
    private long d;
    private List<pdu> e;
    private int i;

    static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f9937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f9938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f9939c;
        ImageView d;
        ImageView e;
        HealthButton i;

        e(View view) {
            super(view);
            this.e = (ImageView) view.findViewById(R.id.plan_course_item_background);
            this.f9939c = (HealthTextView) view.findViewById(R.id.course_name);
            this.f9938b = (HealthTextView) view.findViewById(R.id.course_duration);
            this.i = (HealthButton) view.findViewById(R.id.start_training_button);
            this.f9937a = view.findViewById(R.id.course_item_interval);
            this.d = (ImageView) view.findViewById(R.id.course_lock);
        }
    }

    static class a extends RecyclerView.ViewHolder {
        a(View view) {
            super(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("Suggestion_AiPlanCourseDetailAdapter", "onCreateViewHolder viewType:", Integer.valueOf(i));
        if (i == 2) {
            return new e(LayoutInflater.from(this.f9934c).inflate(R.layout.ai_plan_course_card_view, viewGroup, false));
        }
        return new a(new View(this.f9934c));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.b(this.e)) {
            LogUtil.a("Suggestion_AiPlanCourseDetailAdapter", "getItemCount not empty:", Integer.valueOf(this.e.size()));
            return this.e.size();
        }
        LogUtil.a("Suggestion_AiPlanCourseDetailAdapter", "getItemCount empty:", 0);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.a("Suggestion_AiPlanCourseDetailAdapter", "onBindViewHolder position:", Integer.valueOf(i));
        if (njy.e(this.e) || njy.e(this.e, i) || this.e.get(i) == null) {
            LogUtil.e("Suggestion_AiPlanCourseDetailAdapter", "onBindViewHolder mCourseDataModelList empty");
            return;
        }
        pdu pduVar = this.e.get(i);
        boolean zA = pduVar.a();
        if (viewHolder instanceof e) {
            e eVar = (e) viewHolder;
            int i2 = this.i;
            if (i2 == 0) {
                eVar.d.setVisibility(8);
                eVar.i.setVisibility(0);
                eVar.i.setBackground(this.f9934c.getResources().getDrawable(R.drawable.sug_plan_detail_clock_button));
                if (zA) {
                    eVar.i.setText(R.string.IDS_sug_reco_trained);
                } else {
                    eVar.i.setText(R.string.sug_home_overdueplan);
                }
            } else if (i2 == 1) {
                eVar.d.setVisibility(8);
                eVar.i.setVisibility(0);
                if (zA) {
                    eVar.i.setText(R.string.IDS_sug_reco_trained);
                    eVar.i.setBackground(this.f9934c.getResources().getDrawable(R.drawable.sug_plan_detail_clock_button));
                } else {
                    eVar.i.setText(R.string.IDS_fitness_plancard_start);
                    eVar.i.setBackground(this.f9934c.getResources().getDrawable(R.drawable.sug_myplan_button));
                }
            } else {
                eVar.d.setVisibility(0);
                eVar.i.setVisibility(8);
            }
            a(eVar, pduVar, i);
            ViewGroup.LayoutParams layoutParams = eVar.f9937a.getLayoutParams();
            if (i == this.e.size() - 1 && !this.f9933b) {
                eVar.f9937a.setVisibility(8);
            } else {
                eVar.f9937a.setVisibility(0);
            }
            eVar.f9937a.setLayoutParams(layoutParams);
        }
    }

    private void a(e eVar, pdu pduVar, final int i) {
        final FitWorkout fitWorkoutB = pduVar.b();
        if (fitWorkoutB != null) {
            String strAcquireName = fitWorkoutB.acquireName();
            long jAcquireDuration = fitWorkoutB.acquireDuration();
            if (this.i == 3) {
                eVar.f9939c.setTextColor(this.f9934c.getResources().getColor(com.huawei.ui.commonui.R.color.textColorTertiary));
                eVar.f9938b.setTextColor(this.f9934c.getResources().getColor(com.huawei.ui.commonui.R.color.textColorTertiary));
                eVar.i.setOnClickListener(null);
            } else {
                eVar.f9939c.setTextColor(this.f9934c.getResources().getColor(com.huawei.ui.commonui.R.color.textColorPrimary));
                eVar.f9938b.setTextColor(this.f9934c.getResources().getColor(com.huawei.ui.commonui.R.color.textColorPrimary));
                eVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.AiPlanCourseDetailAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (ibn.e(fitWorkoutB)) {
                            ien.b(AiPlanCourseDetailAdapter.this.f9934c, fitWorkoutB, AiPlanCourseDetailAdapter.this.f9932a, AiPlanCourseDetailAdapter.this.d, i + 1);
                            return;
                        }
                        Context context = AiPlanCourseDetailAdapter.this.f9934c;
                        FitWorkout fitWorkout = fitWorkoutB;
                        Plan plan = AiPlanCourseDetailAdapter.this.f9932a;
                        int i2 = i;
                        ien.b(context, fitWorkout, plan, i2 + 1, AiPlanCourseDetailAdapter.this.d);
                    }
                });
            }
            eVar.f9939c.setText(strAcquireName);
            eVar.f9938b.setText(ifp.d(btx.c(), R.string.sug_fitness_min, ifp.d(jAcquireDuration)));
            eVar.e.setBackgroundResource(R.drawable.ic_pic_course_fitness_background);
            this.d = this.e.get(0).c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return njy.b(this.e) ? 2 : 1;
    }
}
