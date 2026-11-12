package com.huawei.health.marketing.views.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes29.dex */
public class ThreeGridSeriesViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f8498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f8499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f8500c;
    private ImageView d;
    private HealthTextView e;
    private RelativeLayout f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthCardView i;
    private ImageView j;

    public ThreeGridSeriesViewHolder(View view) {
        super(view);
        this.i = (HealthCardView) view.findViewById(R.id.three_grid_tahiti);
        this.j = (ImageView) view.findViewById(R.id.three_grid_background);
        this.f = (RelativeLayout) view.findViewById(R.id.three_grid_rl);
        this.h = (HealthTextView) view.findViewById(R.id.three_grid_title);
        this.g = (HealthTextView) view.findViewById(R.id.three_grid_subtitle);
        this.f8499b = (ImageView) view.findViewById(R.id.card_view_image);
        this.d = (ImageView) view.findViewById(R.id.item_image_1);
        this.f8500c = (ImageView) view.findViewById(R.id.item_image_2);
        this.f8498a = (ImageView) view.findViewById(R.id.item_image_3);
        this.e = (HealthTextView) view.findViewById(R.id.text_tip);
    }

    public ImageView e() {
        return this.j;
    }

    public HealthTextView g() {
        return this.h;
    }

    public HealthTextView i() {
        return this.g;
    }

    public HealthTextView c() {
        return this.e;
    }

    public ImageView b() {
        return this.d;
    }

    public ImageView d() {
        return this.f8500c;
    }

    public ImageView a() {
        return this.f8498a;
    }
}
