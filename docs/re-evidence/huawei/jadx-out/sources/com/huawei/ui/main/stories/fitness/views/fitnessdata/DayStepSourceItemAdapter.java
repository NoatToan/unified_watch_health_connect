package com.huawei.ui.main.stories.fitness.views.fitnessdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.main.R;
import defpackage.uic;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DayStepSourceItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnDayStepSourceItemClickListener f27279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<uic> f27280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f27281c;

    public interface OnDayStepSourceItemClickListener {
        void onItemClick(int i);
    }

    public DayStepSourceItemAdapter(Context context, List<uic> list) {
        this.f27281c = context;
        this.f27280b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new StepSourceViewHolder(LayoutInflater.from(this.f27281c).inflate(R.layout.day_step_source_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        if (viewHolder == null) {
            LogUtil.j("SCUI_DayStepSourceItemAdapter", "onBindViewHolder holder is null");
            return;
        }
        if (!(viewHolder instanceof StepSourceViewHolder)) {
            LogUtil.j("SCUI_DayStepSourceItemAdapter", "onBindViewHolder holder is not instanceof StepSourceViewHolder");
            return;
        }
        StepSourceViewHolder stepSourceViewHolder = (StepSourceViewHolder) viewHolder;
        stepSourceViewHolder.f27284b.setText(this.f27280b.get(i).d());
        stepSourceViewHolder.d.setText(this.f27280b.get(i).b());
        if (i == this.f27280b.size() - 1) {
            stepSourceViewHolder.f27283a.setVisibility(8);
        } else {
            stepSourceViewHolder.f27283a.setVisibility(0);
        }
        if (LanguageUtil.ba(this.f27281c)) {
            stepSourceViewHolder.e.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            stepSourceViewHolder.e.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
        stepSourceViewHolder.f27285c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.fitnessdata.DayStepSourceItemAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DayStepSourceItemAdapter.this.f27279a != null) {
                    DayStepSourceItemAdapter.this.f27279a.onItemClick(i);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<uic> list = this.f27280b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class StepSourceViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthDivider f27283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f27284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConstraintLayout f27285c;
        private HealthTextView d;
        private HealthImageView e;

        public StepSourceViewHolder(View view) {
            super(view);
            this.f27285c = (ConstraintLayout) view.findViewById(R.id.cl_step_source_item_container);
            this.f27284b = (HealthTextView) view.findViewById(R.id.htv_step_count);
            this.d = (HealthTextView) view.findViewById(R.id.htv_time_range);
            this.e = (HealthImageView) view.findViewById(R.id.hiv_guide_arrow);
            this.f27283a = (HealthDivider) view.findViewById(R.id.hd_step_source_divider);
        }
    }

    public void d(OnDayStepSourceItemClickListener onDayStepSourceItemClickListener) {
        this.f27279a = onDayStepSourceItemClickListener;
    }
}
