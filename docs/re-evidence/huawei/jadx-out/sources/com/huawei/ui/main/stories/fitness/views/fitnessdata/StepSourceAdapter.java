package com.huawei.ui.main.stories.fitness.views.fitnessdata;

import android.content.Context;
import android.text.TextUtils;
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
import defpackage.uih;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class StepSourceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f27286a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnStepSourceItemClickListener f27287c;
    private List<uih> d;

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnStepSourceItemClickListener {
        void onItemClick(int i);
    }

    public StepSourceAdapter(Context context, List<uih> list) {
        this.f27286a = context;
        this.d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new StepSourceViewHolder(LayoutInflater.from(this.f27286a).inflate(R.layout.step_source_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        if (viewHolder == null) {
            LogUtil.j("SCUI_StepSourceAdapter", "onBindViewHolder holder is null");
            return;
        }
        if (!(viewHolder instanceof StepSourceViewHolder)) {
            LogUtil.j("SCUI_StepSourceAdapter", "onBindViewHolder holder is not instanceof StepSourceViewHolder");
            return;
        }
        StepSourceViewHolder stepSourceViewHolder = (StepSourceViewHolder) viewHolder;
        stepSourceViewHolder.f27289a.setBackgroundResource(this.d.get(i).a());
        stepSourceViewHolder.f27291c.setText(this.d.get(i).c());
        String strB = this.d.get(i).b();
        if (TextUtils.isEmpty(strB) || !this.d.get(i).e()) {
            stepSourceViewHolder.d.setVisibility(8);
        } else {
            stepSourceViewHolder.d.setVisibility(0);
            if (LanguageUtil.ba(this.f27286a)) {
                stepSourceViewHolder.d.setBackgroundResource(R.drawable.common_ui_arrow_left);
            } else {
                stepSourceViewHolder.d.setBackgroundResource(R.drawable.common_ui_arrow_right);
            }
        }
        if (TextUtils.isEmpty(strB)) {
            stepSourceViewHolder.j.setText(this.f27286a.getString(R.string.IDS_hwh_privacy_no_details));
        } else {
            stepSourceViewHolder.j.setText(strB);
        }
        if (this.d.get(i).h()) {
            stepSourceViewHolder.e.setVisibility(0);
        } else {
            stepSourceViewHolder.e.setVisibility(8);
        }
        if (i == this.d.size() - 1) {
            stepSourceViewHolder.f27290b.setVisibility(8);
        } else {
            stepSourceViewHolder.f27290b.setVisibility(0);
        }
        stepSourceViewHolder.g.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.fitnessdata.StepSourceAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (StepSourceAdapter.this.f27287c != null) {
                    StepSourceAdapter.this.f27287c.onItemClick(i);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<uih> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class StepSourceViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthImageView f27289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthDivider f27290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f27291c;
        private HealthImageView d;
        private HealthTextView e;
        private ConstraintLayout g;
        private HealthTextView j;

        public StepSourceViewHolder(View view) {
            super(view);
            this.g = (ConstraintLayout) view.findViewById(R.id.cl_step_source_item_container);
            this.f27289a = (HealthImageView) view.findViewById(R.id.hiv_device_icon);
            this.f27291c = (HealthTextView) view.findViewById(R.id.htv_device_name);
            this.e = (HealthTextView) view.findViewById(R.id.htv_current_device);
            this.j = (HealthTextView) view.findViewById(R.id.htv_step_count);
            this.d = (HealthImageView) view.findViewById(R.id.hiv_guide_arrow);
            this.f27290b = (HealthDivider) view.findViewById(R.id.hd_step_source_divider);
        }
    }

    public void d(OnStepSourceItemClickListener onStepSourceItemClickListener) {
        this.f27287c = onStepSourceItemClickListener;
    }
}
