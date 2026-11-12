package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.ui.commonui.subheader.HealthSubHeader;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessSubTitleViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSubHeader f9502a;

    public FitnessSubTitleViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sug_fitness_item_subtitle, viewGroup, false));
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.itemView.findViewById(R.id.item_sub_header);
        this.f9502a = healthSubHeader;
        healthSubHeader.setMoreText("");
        this.f9502a.setMoreLayoutVisibility(4);
        this.f9502a.setSubHeaderBackgroundColor(ContextCompat.getColor(this.itemView.getContext(), com.huawei.health.servicesui.R.color.common_transparent));
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f9502a.setVisibility(8);
        } else {
            this.f9502a.setVisibility(0);
            this.f9502a.setHeadTitleText(str);
        }
    }
}
