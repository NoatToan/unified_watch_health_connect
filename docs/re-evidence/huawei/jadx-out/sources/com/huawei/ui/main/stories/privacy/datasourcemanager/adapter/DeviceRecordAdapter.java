package com.huawei.ui.main.stories.privacy.datasourcemanager.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
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
import com.huawei.ui.main.stories.privacy.datasourcemanager.listener.DataSourceItemClickListener;
import defpackage.njy;
import defpackage.qqz;
import defpackage.vdo;
import defpackage.vzp;
import defpackage.wgr;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DeviceRecordAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSourceItemClickListener f28645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f28646c;
    private final int d;
    private int e;
    private Drawable f;
    private List<vzp> g = new ArrayList(10);
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private int k;
    private int l;
    private LayoutInflater m;

    public DeviceRecordAdapter(Context context, DataSourceItemClickListener dataSourceItemClickListener) {
        this.m = LayoutInflater.from(context);
        this.f28646c = context;
        this.f28645b = dataSourceItemClickListener;
        this.h = this.f28646c.getResources().getDrawable(R.drawable.privacy_card_view_bg_round_top);
        this.i = this.f28646c.getResources().getDrawable(R.drawable.privacy_card_view_bg_round);
        this.j = this.f28646c.getResources().getDrawable(R.drawable.privacy_card_view_bg_round_bottom);
        this.f = this.f28646c.getResources().getDrawable(R.color.colorWearHomeBg);
        Resources resources = this.f28646c.getResources();
        this.f28644a = resources.getDimensionPixelSize(R.dimen.hw_show_size_8_dp);
        this.d = resources.getDimensionPixelSize(R.dimen.hw_show_public_margin_4dp);
    }

    public void c(List<vzp> list) {
        if (list == null) {
            return;
        }
        this.g = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new c(this.m.inflate(R.layout.activity_manager_data_source_item_divider, viewGroup, false));
        }
        if (i == 3) {
            return new a(this.m.inflate(R.layout.item_device_record_content, viewGroup, false));
        }
        if (i == 2) {
            return new d(this.m.inflate(R.layout.activity_manager_data_source_item_title, viewGroup, false));
        }
        LogUtil.a("DeviceRecordAdapter", "onCreateViewHolder error type");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        vzp vzpVar = i < this.g.size() ? this.g.get(i) : null;
        if (vzpVar == null) {
            LogUtil.a("DeviceRecordAdapter", "onBindViewHolder model is null");
            return;
        }
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            b(i, vzpVar, aVar);
            if (vzpVar.i()) {
                b(aVar, i);
            }
            if (vzpVar.h()) {
                e(aVar, i);
            }
            if (vzpVar.g()) {
                d(aVar, i);
                return;
            }
            return;
        }
        if (viewHolder instanceof d) {
            d dVar = (d) viewHolder;
            dVar.f28651a.setText(vzpVar.c());
            if (vzpVar.g()) {
                dVar.f28651a.setVisibility(8);
                return;
            }
            return;
        }
        if (!(viewHolder instanceof c)) {
            LogUtil.a("DeviceRecordAdapter", "onBindViewHolder Holder is null");
        } else {
            ((c) viewHolder).f28650b.setBackgroundColor(this.f28646c.getResources().getColor(R.color.health_chart_extend_background_color));
        }
    }

    private void b(final int i, vzp vzpVar, a aVar) {
        aVar.e.setText(vzpVar.d());
        aVar.f28647a.setBackgroundResource(vzpVar.a());
        if (LanguageUtil.ba(this.f28646c)) {
            aVar.f28649c.setBackgroundResource(R.drawable.common_ui_arrow_left);
            int iA = vzpVar.a();
            if (iA == R.mipmap.ic_motion_record || iA == R.mipmap.ic_mydata_step) {
                aVar.f28647a.setBackground(qqz.e(this.f28646c, iA));
            }
        }
        aVar.d.setOnClickListener(new View.OnClickListener() { // from class: vzl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51745a.b(i, view);
            }
        });
    }

    public /* synthetic */ void b(int i, View view) {
        if (this.f28645b == null) {
            LogUtil.e("DeviceRecordAdapter", "mDataSourceItemClickListener is null");
        } else if (!vdo.e()) {
            this.f28645b.onItemClickListener(i);
        } else {
            LogUtil.a("DeviceRecordAdapter", "click fast");
        }
    }

    private void d(a aVar, int i) {
        int i2 = this.l;
        if (i2 == 1) {
            aVar.d.setBackground(this.i);
            aVar.f28648b.setVisibility(8);
            ConstraintLayout constraintLayout = aVar.d;
            int i3 = this.f28644a;
            int i4 = this.d;
            constraintLayout.setPadding(i3, i4, i3, i4);
            return;
        }
        if (i2 <= 1) {
            LogUtil.a("DeviceRecordAdapter", "mActivityStatisticsSize size is 0");
            return;
        }
        if (i == 1) {
            aVar.f28648b.setVisibility(0);
            aVar.d.setBackground(this.h);
            ConstraintLayout constraintLayout2 = aVar.d;
            int i5 = this.f28644a;
            constraintLayout2.setPadding(i5, this.d, i5, 0);
            return;
        }
        if (i2 == i) {
            aVar.f28648b.setVisibility(8);
            aVar.d.setBackground(this.j);
            ConstraintLayout constraintLayout3 = aVar.d;
            int i6 = this.f28644a;
            constraintLayout3.setPadding(i6, 0, i6, this.d);
            return;
        }
        aVar.f28648b.setVisibility(0);
        ConstraintLayout constraintLayout4 = aVar.d;
        int i7 = this.f28644a;
        constraintLayout4.setPadding(i7, 0, i7, 0);
        aVar.d.setBackground(this.f);
    }

    private void e(a aVar, int i) {
        int i2 = this.k;
        if (i2 == 1) {
            aVar.d.setBackground(this.i);
            aVar.f28648b.setVisibility(8);
            ConstraintLayout constraintLayout = aVar.d;
            int i3 = this.f28644a;
            int i4 = this.d;
            constraintLayout.setPadding(i3, i4, i3, i4);
            return;
        }
        if (i2 > 1) {
            if (wgr.c(i, this.e)) {
                aVar.d.setBackground(this.h);
                aVar.f28648b.setVisibility(0);
                ConstraintLayout constraintLayout2 = aVar.d;
                int i5 = this.f28644a;
                constraintLayout2.setPadding(i5, this.d, i5, 0);
                return;
            }
            if (wgr.b(i, this.e, this.k)) {
                aVar.f28648b.setVisibility(8);
                aVar.d.setBackground(this.j);
                ConstraintLayout constraintLayout3 = aVar.d;
                int i6 = this.f28644a;
                constraintLayout3.setPadding(i6, 0, i6, this.d);
                return;
            }
            aVar.f28648b.setVisibility(0);
            aVar.d.setBackground(this.f);
            ConstraintLayout constraintLayout4 = aVar.d;
            int i7 = this.f28644a;
            constraintLayout4.setPadding(i7, 0, i7, 0);
            return;
        }
        LogUtil.a("DeviceRecordAdapter", "mHealthStateSize size is 0");
    }

    private void b(a aVar, int i) {
        int i2 = this.e;
        if (i2 == 1) {
            aVar.d.setBackground(this.i);
            aVar.f28648b.setVisibility(8);
            ConstraintLayout constraintLayout = aVar.d;
            int i3 = this.f28644a;
            int i4 = this.d;
            constraintLayout.setPadding(i3, i4, i3, i4);
            return;
        }
        if (i2 <= 1) {
            LogUtil.a("DeviceRecordAdapter", "mActivityStatisticsSize size is 0");
            return;
        }
        if (i == 1) {
            aVar.f28648b.setVisibility(0);
            aVar.d.setBackground(this.h);
            ConstraintLayout constraintLayout2 = aVar.d;
            int i5 = this.f28644a;
            constraintLayout2.setPadding(i5, this.d, i5, 0);
            return;
        }
        if (i2 == i) {
            aVar.f28648b.setVisibility(8);
            aVar.d.setBackground(this.j);
            ConstraintLayout constraintLayout3 = aVar.d;
            int i6 = this.f28644a;
            constraintLayout3.setPadding(i6, 0, i6, this.d);
            return;
        }
        aVar.d.setBackground(this.f);
        aVar.f28648b.setVisibility(0);
        ConstraintLayout constraintLayout4 = aVar.d;
        int i7 = this.f28644a;
        constraintLayout4.setPadding(i7, 0, i7, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<vzp> list = this.g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.g, i)) {
            return 0;
        }
        return this.g.get(i).b();
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f28647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthDivider f28648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f28649c;
        ConstraintLayout d;
        HealthTextView e;

        a(View view) {
            super(view);
            this.d = (ConstraintLayout) view.findViewById(R.id.item_content_cl);
            this.f28647a = (ImageView) view.findViewById(R.id.content_icon);
            this.e = (HealthTextView) view.findViewById(R.id.content_name);
            this.f28649c = (ImageView) view.findViewById(R.id.record_arrow);
            this.f28648b = (HealthDivider) view.findViewById(R.id.data_line);
        }
    }

    static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f28651a;

        d(View view) {
            super(view);
            this.f28651a = (HealthTextView) view.findViewById(R.id.item_title);
        }
    }

    static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f28650b;

        c(View view) {
            super(view);
            this.f28650b = view.findViewById(R.id.health_divider_line);
        }
    }

    public void c(int i) {
        this.l = i;
    }

    public void b(int i) {
        this.e = i;
    }

    public void a(int i) {
        this.k = i;
    }
}
