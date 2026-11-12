package com.huawei.health.marketing.views.holders;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;

/* JADX INFO: loaded from: classes29.dex */
public class CourseSeriesViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f8475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f8476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f8477c;
    private ImageView d;
    private ImageView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthRecycleView j;

    public CourseSeriesViewHolder(View view) {
        super(view);
        this.f8477c = (FrameLayout) view.findViewById(R.id.course_item_tahiti);
        this.e = (ImageView) view.findViewById(R.id.course_item_tahiti_background);
        this.f = (HealthTextView) view.findViewById(R.id.series_course_tahiti_title);
        this.g = (HealthTextView) view.findViewById(R.id.series_course_tahiti_subtitle);
        this.d = (ImageView) view.findViewById(R.id.card_view_image);
        this.j = (HealthRecycleView) view.findViewById(R.id.course_item_recyclerview);
        this.f8475a = (HealthButton) view.findViewById(R.id.bt_show_more);
        this.f8476b = view.findViewById(R.id.bottom_divider);
    }

    public FrameLayout e() {
        return this.f8477c;
    }

    public ImageView a() {
        return this.e;
    }

    public HealthTextView h() {
        return this.f;
    }

    public HealthTextView i() {
        return this.g;
    }

    public ImageView c() {
        return this.d;
    }

    public HealthRecycleView f() {
        return this.j;
    }

    public HealthButton d() {
        return this.f8475a;
    }

    public View b() {
        return this.f8476b;
    }
}
