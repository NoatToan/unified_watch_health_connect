package com.huawei.health.section.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.search.SearchResultItemView;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fts;
import defpackage.fxk;
import defpackage.gvo;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class Section16_9List_01Adapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8714a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8715c = -1;
    private gvo e;

    public Section16_9List_01Adapter(Context context, gvo gvoVar) {
        this.f8714a = context;
        this.e = gvoVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 6) {
            i2 = R.layout.item_marketing_one_grid_big;
        } else if (i == 1008) {
            i2 = R.layout.item_activity_search_grid;
        } else if (i == 100) {
            i2 = R.layout.section_sport_plan;
        } else if (i == 101) {
            i2 = R.layout.section_member_coupon;
        } else {
            i2 = R.layout.item_marketing_grid_small;
        }
        return new a(new SearchResultItemView(this.f8714a, i2), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        if (aVar.f8717b != null && aVar.f8718c != null) {
            b(aVar);
        }
        fts.c(aVar.itemView, this.e.a(), i);
        fts.a(aVar.f8717b, this.e.e(), i);
        fts.c(aVar.i, this.e.l(), this.e.b(), i, true);
        fts.c(aVar.f8716a, this.e.c(), this.e.b(), i, true);
        fts.c(aVar.e, this.e.f(), null, i, false);
        fts.c(aVar.g, this.e.j(), null, i, false);
        fts.c(aVar.f, this.e.i(), null, i, false);
        fts.d(aVar.f, this.e.g(), i);
        fts.d(aVar.h, this.e.h(), i);
    }

    private void b(a aVar) {
        int i = aVar.j;
        if (i == 6) {
            d(aVar);
        } else if (i == 15 || i == 1008) {
            a(aVar);
        }
    }

    private void d(a aVar) {
        int iC = fxk.c(this.f8714a, 6, getItemCount());
        int i = (iC * 9) / 16;
        ViewGroup.LayoutParams layoutParams = aVar.f8717b.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.width = iC;
            layoutParams2.height = i;
            aVar.f8717b.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = aVar.f8718c.getLayoutParams();
        if (layoutParams3 instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.height = i;
            layoutParams4.width = iC;
            aVar.f8718c.setLayoutParams(layoutParams4);
        }
    }

    private void a(a aVar) {
        int iC = fxk.c(this.f8714a, 15, getItemCount());
        int i = (iC * 9) / 21;
        ViewGroup.LayoutParams layoutParams = aVar.f8717b.getLayoutParams();
        layoutParams.width = iC;
        layoutParams.height = i;
        aVar.f8717b.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = aVar.f8718c.getLayoutParams();
        layoutParams2.height = i;
        layoutParams2.width = iC;
        aVar.f8718c.setLayoutParams(layoutParams2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f8715c == -1) {
            int iE = fts.e(this.e.l(), this.e.c(), this.e.e(), this.e.f(), this.e.f(), this.e.j(), this.e.i(), this.e.g());
            this.f8715c = iE;
            this.f8715c = Math.min(iE, this.e.d());
        }
        return this.f8715c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        List<Integer> listK = this.e.k();
        if (!njy.c(listK, i) || listK.get(i) == null) {
            return 15;
        }
        return listK.get(i).intValue();
    }

    class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f8716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthImageView f8717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RelativeLayout f8718c;
        private HealthTextView e;
        private HealthTextView f;
        private HealthTextView g;
        private ViewGroup h;
        private HealthTextView i;
        private int j;

        a(View view, int i) {
            super(view);
            this.j = i;
            if (i == 6) {
                d();
            } else if (i == 100) {
                e();
            } else {
                a();
            }
        }

        private void d() {
            this.h = (ViewGroup) this.itemView.findViewById(R.id.item_one_grid_big_root_layout);
            this.f8718c = (RelativeLayout) this.itemView.findViewById(R.id.item_one_grid_big_image_layout);
            this.f8717b = (HealthImageView) this.itemView.findViewById(R.id.item_one_grid_big_image);
            this.i = (HealthTextView) this.itemView.findViewById(R.id.item_one_grid_big_title);
            this.f8716a = (HealthTextView) this.itemView.findViewById(R.id.item_one_grid_big_description);
            this.e = (HealthTextView) this.itemView.findViewById(R.id.item_one_grid_big_attribute_text);
            this.g = (HealthTextView) this.itemView.findViewById(R.id.item_one_grid_big_join_num);
            this.f = (HealthTextView) this.itemView.findViewById(R.id.item_one_grid_big_status);
        }

        private void a() {
            this.h = (ViewGroup) this.itemView.findViewById(R.id.item_one_grid_small_root_layout);
            this.f8718c = (RelativeLayout) this.itemView.findViewById(R.id.item_one_grid_small_root_layout);
            this.f8717b = (HealthImageView) this.itemView.findViewById(R.id.item_one_grid_small_image);
            this.i = (HealthTextView) this.itemView.findViewById(R.id.item_one_grid_small_title);
            this.f8716a = (HealthTextView) this.itemView.findViewById(R.id.item_one_grid_small_description);
            this.g = (HealthTextView) this.itemView.findViewById(R.id.item_one_grid_small_join_num);
            this.f = (HealthTextView) this.itemView.findViewById(R.id.item_one_grid_small_status);
        }

        private void e() {
            this.h = (ViewGroup) this.itemView.findViewById(R.id.section_plan_item);
            this.f8717b = (HealthImageView) this.itemView.findViewById(R.id.section_plan_bg);
            this.i = (HealthTextView) this.itemView.findViewById(R.id.section_plan_name);
            this.f8716a = (HealthTextView) this.itemView.findViewById(R.id.section_plan_description);
            this.f = (HealthTextView) this.itemView.findViewById(R.id.section_plan_corner);
            this.f8718c = null;
            this.e = null;
            this.g = null;
        }
    }
}
