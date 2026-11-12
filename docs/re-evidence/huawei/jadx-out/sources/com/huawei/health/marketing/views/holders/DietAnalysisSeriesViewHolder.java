package com.huawei.health.marketing.views.holders;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;

/* JADX INFO: loaded from: classes29.dex */
public class DietAnalysisSeriesViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f8478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthImageView f8479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f8480c;
    private HealthTextView d;
    private FrameLayout e;
    private HealthTextView j;

    public DietAnalysisSeriesViewHolder(View view) {
        super(view);
        this.e = (FrameLayout) view.findViewById(R.id.course_item_tahiti);
        this.f8480c = (ImageView) view.findViewById(R.id.course_item_tahiti_background);
        this.j = (HealthTextView) view.findViewById(R.id.series_course_tahiti_title);
        this.d = (HealthTextView) view.findViewById(R.id.series_course_tahiti_subtitle);
        this.f8478a = (ImageView) view.findViewById(R.id.card_view_image);
        this.f8479b = (HealthImageView) view.findViewById(R.id.content_background);
    }

    public FrameLayout b() {
        return this.e;
    }

    public ImageView c() {
        return this.f8480c;
    }

    public HealthTextView e() {
        return this.j;
    }

    public HealthTextView a() {
        return this.d;
    }

    public HealthImageView d() {
        return this.f8479b;
    }
}
