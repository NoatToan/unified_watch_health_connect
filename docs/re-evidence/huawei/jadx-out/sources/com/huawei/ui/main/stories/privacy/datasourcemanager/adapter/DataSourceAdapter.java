package com.huawei.ui.main.stories.privacy.datasourcemanager.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.datasourcemanager.bean.SourceInfo;
import com.huawei.ui.main.stories.privacy.datasourcemanager.listener.DataSourceItemClickListener;
import defpackage.njy;
import defpackage.qqf;
import defpackage.vdo;
import defpackage.wgr;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DataSourceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28638c;
    private final int d;
    private Context e;
    private Drawable f;
    private Drawable g;
    private DataSourceItemClickListener h;
    private int i;
    private List<SourceInfo> j = new ArrayList(10);
    private Drawable l;
    private LayoutInflater m;

    public DataSourceAdapter(Context context, DataSourceItemClickListener dataSourceItemClickListener) {
        this.m = LayoutInflater.from(context);
        this.e = context;
        this.h = dataSourceItemClickListener;
        this.l = this.e.getResources().getDrawable(R.drawable.privacy_card_view_bg_round_top);
        this.g = this.e.getResources().getDrawable(R.drawable.privacy_card_view_bg_round);
        this.f = this.e.getResources().getDrawable(R.drawable.privacy_card_view_bg_round_bottom);
        this.f28638c = this.e.getColor(R.color.colorWearHomeBg);
        Resources resources = this.e.getResources();
        this.d = resources.getDimensionPixelSize(R.dimen.hw_show_size_8_dp);
        this.f28637b = resources.getDimensionPixelSize(R.dimen.hw_show_public_margin_4dp);
    }

    public void b(List<SourceInfo> list) {
        if (list == null) {
            return;
        }
        if (njy.b(this.j)) {
            this.j.clear();
        }
        this.j = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new a(this.m.inflate(R.layout.activity_manager_data_source_item_divider, viewGroup, false));
        }
        if (i == 3) {
            return new c(this.m.inflate(R.layout.activity_manager_data_source_item, viewGroup, false));
        }
        if (i == 2) {
            return new d(this.m.inflate(R.layout.activity_manager_data_source_item_title, viewGroup, false));
        }
        LogUtil.a("DataSourceAdapter", "onCreateViewHolder error type");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SourceInfo sourceInfo = i < this.j.size() ? this.j.get(i) : null;
        if (sourceInfo == null) {
            LogUtil.j("DataSourceAdapter", "onBindViewHolder model is null");
            return;
        }
        if (viewHolder instanceof c) {
            e((c) viewHolder, i, sourceInfo);
            return;
        }
        if (viewHolder instanceof d) {
            d dVar = (d) viewHolder;
            dVar.f28643b.setText(sourceInfo.getTitle());
            if (sourceInfo.isHealthKit()) {
                dVar.f28643b.setVisibility(8);
                return;
            }
            return;
        }
        if (!(viewHolder instanceof a)) {
            LogUtil.a("DataSourceAdapter", "onBindViewHolder Holder is null");
        } else {
            ((a) viewHolder).f28639c.setBackgroundColor(this.e.getResources().getColor(R.color.health_chart_extend_background_color));
        }
    }

    private void e(c cVar, final int i, SourceInfo sourceInfo) {
        cVar.f28640a.setText(sourceInfo.getDeviceName());
        if (!TextUtils.isEmpty(sourceInfo.getDeviceIcon())) {
            cVar.e.setVisibility(0);
            qqf.e(sourceInfo.getDeviceIcon(), cVar.e);
        } else {
            cVar.e.setVisibility(8);
        }
        if (LanguageUtil.ba(this.e)) {
            cVar.f28641b.setBackgroundResource(R.drawable.common_ui_arrow_left);
        }
        cVar.d.setOnClickListener(new View.OnClickListener() { // from class: vzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(i, view);
            }
        });
        int sourceType = sourceInfo.getSourceType();
        if (sourceType == 2) {
            b(cVar, i);
        }
        if (sourceType == 1) {
            c(cVar, i);
        }
        if (sourceType == 3) {
            a(cVar);
        }
    }

    public /* synthetic */ void c(int i, View view) {
        if (this.h == null) {
            LogUtil.e("DataSourceAdapter", "mDataSourceItemClickListener is null");
        } else if (!vdo.e()) {
            this.h.onItemClickListener(i);
        } else {
            LogUtil.a("DataSourceAdapter", "click fast");
        }
    }

    private void a(c cVar) {
        cVar.d.setBackground(this.g);
        cVar.f28642c.setVisibility(8);
        ConstraintLayout constraintLayout = cVar.d;
        int i = this.d;
        int i2 = this.f28637b;
        constraintLayout.setPadding(i, i2, i, i2);
    }

    private void b(c cVar, int i) {
        int i2 = this.i;
        if (i2 == 1) {
            cVar.d.setBackground(this.g);
            cVar.f28642c.setVisibility(8);
            ConstraintLayout constraintLayout = cVar.d;
            int i3 = this.d;
            int i4 = this.f28637b;
            constraintLayout.setPadding(i3, i4, i3, i4);
            return;
        }
        if (i2 > 1) {
            if (wgr.c(i, this.f28636a)) {
                cVar.f28642c.setVisibility(0);
                cVar.d.setBackground(this.l);
                ConstraintLayout constraintLayout2 = cVar.d;
                int i5 = this.d;
                constraintLayout2.setPadding(i5, this.f28637b, i5, 0);
                return;
            }
            if (wgr.b(i, this.f28636a, this.i)) {
                cVar.f28642c.setVisibility(8);
                cVar.d.setBackground(this.f);
                ConstraintLayout constraintLayout3 = cVar.d;
                int i6 = this.d;
                constraintLayout3.setPadding(i6, 0, i6, this.f28637b);
                return;
            }
            ConstraintLayout constraintLayout4 = cVar.d;
            int i7 = this.d;
            constraintLayout4.setPadding(i7, 0, i7, 0);
            cVar.f28642c.setVisibility(0);
            cVar.d.setBackgroundColor(this.f28638c);
            return;
        }
        LogUtil.a("DataSourceAdapter", "mDeviceSize size is 0");
    }

    private void c(c cVar, int i) {
        int i2 = this.f28636a;
        if (i2 == 1) {
            cVar.d.setBackground(this.g);
            cVar.f28642c.setVisibility(8);
            ConstraintLayout constraintLayout = cVar.d;
            int i3 = this.d;
            int i4 = this.f28637b;
            constraintLayout.setPadding(i3, i4, i3, i4);
            return;
        }
        if (i2 <= 1) {
            LogUtil.a("DataSourceAdapter", "mActivityStatisticsSize size is 0");
            return;
        }
        if (i == 1) {
            cVar.f28642c.setVisibility(0);
            cVar.d.setBackground(this.l);
            ConstraintLayout constraintLayout2 = cVar.d;
            int i5 = this.d;
            constraintLayout2.setPadding(i5, this.f28637b, i5, 0);
            return;
        }
        if (i2 == i) {
            cVar.f28642c.setVisibility(8);
            cVar.d.setBackground(this.f);
            ConstraintLayout constraintLayout3 = cVar.d;
            int i6 = this.d;
            constraintLayout3.setPadding(i6, 0, i6, this.f28637b);
            return;
        }
        ConstraintLayout constraintLayout4 = cVar.d;
        int i7 = this.d;
        constraintLayout4.setPadding(i7, 0, i7, 0);
        cVar.d.setBackgroundColor(this.f28638c);
    }

    public void e(int i) {
        this.i = i;
    }

    public void d(int i) {
        this.f28636a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<SourceInfo> list = this.j;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.j, i)) {
            return 0;
        }
        return this.j.get(i).getmItemType();
    }

    static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f28640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ImageView f28641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthDivider f28642c;
        ConstraintLayout d;
        ImageView e;

        c(View view) {
            super(view);
            this.d = (ConstraintLayout) view.findViewById(R.id.item_content_rl);
            this.e = (ImageView) view.findViewById(R.id.content_icon);
            this.f28640a = (HealthTextView) view.findViewById(R.id.content_name);
            this.f28641b = (ImageView) view.findViewById(R.id.list_content_arrow_right);
            this.f28642c = (HealthDivider) view.findViewById(R.id.data_line);
        }
    }

    static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f28643b;

        d(View view) {
            super(view);
            this.f28643b = (HealthTextView) view.findViewById(R.id.item_title);
        }
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f28639c;

        a(View view) {
            super(view);
            this.f28639c = view.findViewById(R.id.health_divider_line);
        }
    }
}
