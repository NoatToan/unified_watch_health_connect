package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SeriesSummaryAdapter extends RecyclerView.Adapter<SummaryViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SeriesCourseListActivity f27739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Drawable> f27741c = new HashMap();
    private List<String> d = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    public SeriesSummaryAdapter(Context context) {
        this.f27740b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SummaryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SummaryViewHolder(LayoutInflater.from(this.f27740b).inflate(R.layout.series_summary_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SummaryViewHolder summaryViewHolder, int i) {
        if (summaryViewHolder.d == null) {
            LogUtil.a("SeriesSummaryAdapter", "holder.imageContainer == null");
            return;
        }
        summaryViewHolder.d.removeAllViews();
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            Drawable drawable = this.f27741c.get(this.d.get(i2));
            if (drawable != null) {
                ImageView imageView = new ImageView(this.f27739a);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setAdjustViewBounds(true);
                imageView.setImageDrawable(drawable);
                summaryViewHolder.d.addView(imageView, -1, -2);
            }
        }
    }

    public void e(Map<String, Drawable> map, SeriesCourseListActivity seriesCourseListActivity, List<String> list) {
        this.f27739a = seriesCourseListActivity;
        this.f27741c.clear();
        this.f27741c.putAll(map);
        this.d.addAll(list);
        notifyDataSetChanged();
    }

    public static class SummaryViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout d;

        public SummaryViewHolder(View view) {
            super(view);
            this.d = (LinearLayout) view.findViewById(R.id.img_container);
        }
    }
}
