package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.CoachBar;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.qqf;
import health.compact.a.LogAnonymous;

/* JADX INFO: loaded from: classes9.dex */
public class CoachesIntroducesViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f9440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f9441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f9442c;
    private HealthSubHeader d;
    private HealthTextView e;

    public CoachesIntroducesViewHolder(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sug_fitness_item_cocaher_introduct, viewGroup, false));
        this.f9442c = (ImageView) this.itemView.findViewById(R.id.item_avatar_iv);
        this.e = (HealthTextView) this.itemView.findViewById(R.id.item_name_tv);
        this.f9441b = (HealthTextView) this.itemView.findViewById(R.id.item_certified_info_tv);
        this.f9440a = (HealthTextView) this.itemView.findViewById(R.id.item_info_tv);
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.itemView.findViewById(R.id.item_sub_header);
        this.d = healthSubHeader;
        healthSubHeader.setMoreText("");
        this.d.setMoreLayoutVisibility(4);
    }

    public void c(CoachBar coachBar) {
        if (coachBar == null || TextUtils.isEmpty(coachBar.getName())) {
            this.itemView.setVisibility(8);
            return;
        }
        this.itemView.setVisibility(0);
        this.d.setHeadTitleText(TextUtils.isEmpty(coachBar.getName()) ? "" : coachBar.getName());
        if (!TextUtils.isEmpty(coachBar.getImage())) {
            this.f9442c.setVisibility(0);
            try {
                qqf.e(Uri.parse(coachBar.getImage()), this.f9442c);
            } catch (SecurityException e) {
                LogUtil.j("Suggestion_CoachesIntroducesViewHolder", "url error = ", LogAnonymous.b(e));
            }
        } else {
            this.f9442c.setVisibility(8);
        }
        d(this.e, coachBar.getImageName());
        d(this.f9441b, coachBar.getImageDesc());
        d(this.f9440a, coachBar.getDetailInformation());
    }

    private void d(HealthTextView healthTextView, String str) {
        if (TextUtils.isEmpty(str)) {
            healthTextView.setVisibility(8);
        } else {
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
        }
    }
}
