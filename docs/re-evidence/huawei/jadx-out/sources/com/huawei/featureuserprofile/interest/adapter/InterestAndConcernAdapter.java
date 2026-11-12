package com.huawei.featureuserprofile.interest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.featureuserprofile.R;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.lrd;
import defpackage.qre;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class InterestAndConcernAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnCheckBoxClickListener f5570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f5571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f5572c;
    private List<Boolean> d;
    private List<String> e;

    public interface OnCheckBoxClickListener {
        void onCheckBoxClick(boolean z, int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public InterestAndConcernAdapter(Context context, List<String> list, List<String> list2, List<Boolean> list3) {
        this.f5572c = context;
        this.f5571b = list;
        this.e = list2;
        this.d = list3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f5572c).inflate(R.layout.adapter_interstadnconcern_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final ViewHolder viewHolder, final int i) {
        viewHolder.f5576c.setText(this.e.get(i));
        viewHolder.j.setChecked(this.d.get(i).booleanValue());
        viewHolder.j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.featureuserprofile.interest.adapter.InterestAndConcernAdapter$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.d.e(i, compoundButton, z);
            }
        });
        a(this.d.get(i).booleanValue(), viewHolder, i);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.featureuserprofile.interest.adapter.InterestAndConcernAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (lrd.d() && InterestAndConcernAdapter.this.f5570a != null) {
                    boolean zBooleanValue = ((Boolean) InterestAndConcernAdapter.this.d.get(i)).booleanValue();
                    boolean z = !zBooleanValue;
                    viewHolder.j.setChecked(z);
                    InterestAndConcernAdapter.this.f5570a.onCheckBoxClick(z, i);
                    InterestAndConcernAdapter.this.a(z, viewHolder, i);
                    if (!zBooleanValue) {
                        lrd.c(viewHolder.itemView.findViewById(R.id.interest_preference_item_linear), qre.a(R.string.accessibility_selected, InterestAndConcernAdapter.this.e.get(i)));
                    } else {
                        lrd.c(viewHolder.itemView.findViewById(R.id.interest_preference_item_linear), qre.a(R.string.accessibility_unselected, InterestAndConcernAdapter.this.e.get(i)));
                    }
                }
            }
        });
        if (i == 0 || i == this.f5571b.size()) {
            if (i == 0) {
                viewHolder.h.setVisibility(0);
                viewHolder.h.setSubHeaderBackgroundColor(this.f5572c.getResources().getColor(R.color.colorSubBackground));
            }
            viewHolder.f5574a.setBackgroundResource(R.drawable.list_item_background_top_normal);
        }
        if (i == this.f5571b.size()) {
            viewHolder.d.setVisibility(0);
            viewHolder.d.setSubHeaderBackgroundColor(this.f5572c.getResources().getColor(R.color.colorSubBackground));
        }
        if (i == this.f5571b.size() - 1 || i == this.e.size() - 1) {
            if (i == this.e.size() - 1) {
                viewHolder.f5575b.setVisibility(0);
            }
            viewHolder.f5574a.setBackgroundResource(R.drawable.list_item_background_bottom_normal);
            viewHolder.e.setVisibility(8);
        }
    }

    /* synthetic */ void e(int i, CompoundButton compoundButton, boolean z) {
        OnCheckBoxClickListener onCheckBoxClickListener = this.f5570a;
        if (onCheckBoxClickListener != null) {
            onCheckBoxClickListener.onCheckBoxClick(z, i);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        LinearLayout f5574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        LinearLayout f5575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f5576c;
        HealthSubHeader d;
        HealthDivider e;
        HealthSubHeader h;
        HealthCheckBox j;

        public ViewHolder(View view) {
            super(view);
            this.f5574a = (LinearLayout) view.findViewById(R.id.interest_preference_item_linear);
            this.f5576c = (HealthTextView) view.findViewById(R.id.interest_preference_item_healthtextview);
            this.j = (HealthCheckBox) view.findViewById(R.id.interest_user_info_interest_item_checkbox);
            this.d = (HealthSubHeader) view.findViewById(R.id.interest_health_concerns_item_healthsubheader);
            this.h = (HealthSubHeader) view.findViewById(R.id.interest_sport_interest_item_healthsunheader);
            this.f5575b = (LinearLayout) view.findViewById(R.id.interest_prompt_text_item_linear);
            this.e = (HealthDivider) view.findViewById(R.id.interest_item_healthdivider);
        }
    }

    public void e(OnCheckBoxClickListener onCheckBoxClickListener) {
        this.f5570a = onCheckBoxClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, ViewHolder viewHolder, int i) {
        if (z) {
            lrd.a(viewHolder.itemView.findViewById(R.id.interest_preference_item_linear), this.e.get(i), true, CheckBox.class);
        } else {
            lrd.a(viewHolder.itemView.findViewById(R.id.interest_preference_item_linear), qre.a(R.string.accessibility_unselected, this.e.get(i)), false, CheckBox.class);
        }
    }
}
