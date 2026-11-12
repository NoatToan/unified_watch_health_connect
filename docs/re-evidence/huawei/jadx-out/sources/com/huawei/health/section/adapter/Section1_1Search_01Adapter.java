package com.huawei.health.section.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.media3.common.C;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.search.SearchResultItemView;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fts;
import defpackage.gvn;
import defpackage.njy;
import defpackage.qrs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class Section1_1Search_01Adapter extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8719a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8720c = -1;
    private int d = Integer.MAX_VALUE;
    private gvn e;

    public Section1_1Search_01Adapter(Context context, gvn gvnVar) {
        this.f8719a = context;
        this.e = gvnVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(new SearchResultItemView(this.f8719a, R.layout.section1_1search_01_item));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i) {
        fts.a(this.f8719a, cVar.e, i, getItemCount());
        d(cVar, i);
    }

    private void d(c cVar, int i) {
        fts.c(cVar.itemView, this.e.c(), i);
        fts.a(cVar.f8721a, this.e.a(), i);
        fts.c(cVar.k, this.e.k(), null, i, false);
        fts.c(cVar.f, this.e.j(), null, i, false);
        fts.c(cVar.m, this.e.n(), this.e.d(), i, true);
        cVar.m.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        cVar.m.getPaint().setStrokeWidth(0.5f);
        fts.c(cVar.n, this.e.m(), this.e.d(), i, true);
        fts.c(cVar.j, this.e.i(), this.e.d(), i, true);
        fts.c(cVar.f8723c, this.e.e(), this.e.d(), i, true);
        fts.c(cVar.i, this.e.h(), this.e.d(), i, false);
        a(cVar, i);
        if (njy.e(this.e.b()) || this.e.b().get(i) == null) {
            cVar.f8722b.setVisibility(8);
        } else {
            fts.b(cVar.f8722b, this.e.b().get(i));
            cVar.f8722b.setVisibility(0);
        }
        fts.d(cVar.f, this.e.f(), i);
        fts.d(cVar.h, this.e.f(), i);
    }

    private void a(c cVar, int i) {
        if (njy.e(this.e.g())) {
            ReleaseLogUtil.e("Section1_1Search_01Adapter", "addLabelToLayout mRecyclerViewData.getLabelList() is null");
            return;
        }
        if (i < 0 || i >= this.e.g().size()) {
            ReleaseLogUtil.e("Section1_1Search_01Adapter", "IndexOutOfBoundsException");
            return;
        }
        for (String str : this.e.g().get(i).split("  ")) {
            if (!TextUtils.isEmpty(str)) {
                HealthTextView healthTextView = new HealthTextView(this.f8719a);
                healthTextView.setTypeface(Typeface.create(C.SANS_SERIF_NAME, 0));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.setMargins(0, 0, qrs.d(this.f8719a, 8.0f), 0);
                healthTextView.setLayoutParams(layoutParams);
                healthTextView.setPadding(qrs.d(this.f8719a, 4.0f), qrs.d(this.f8719a, 1.0f), qrs.d(this.f8719a, 4.0f), qrs.d(this.f8719a, 1.0f));
                healthTextView.setBackgroundResource(R.drawable.common_search_labels_bg_shape);
                healthTextView.setIncludeFontPadding(false);
                healthTextView.setGravity(17);
                healthTextView.setTextColor(this.f8719a.getColor(R.color.textColorSecondary));
                healthTextView.setTextSize(1, 10.0f);
                healthTextView.setSingleLine(true);
                healthTextView.setEllipsize(TextUtils.TruncateAt.END);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(str);
                fts.c(healthTextView, arrayList, this.e.d(), 0, true);
                cVar.g.addView(healthTextView);
            }
        }
        cVar.g.setVisibility(cVar.g.getChildCount() <= 0 ? 8 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f8720c == -1) {
            int iE = fts.e(this.e.a(), this.e.n(), this.e.m());
            this.f8720c = iE;
            this.f8720c = Math.min(iE, this.d);
        }
        return this.f8720c;
    }

    public void b(int i) {
        this.d = i;
    }

    class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthImageView f8721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthImageView f8722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f8723c;
        private LinearLayout e;
        private HealthButton f;
        private LinearLayout g;
        private RelativeLayout h;
        private HealthTextView i;
        private HealthTextView j;
        private HealthTextView k;
        private HealthTextView m;
        private HealthTextView n;

        c(View view) {
            super(view);
            this.h = (RelativeLayout) view.findViewById(R.id.recycle_item);
            this.f8721a = (HealthImageView) view.findViewById(R.id.item_picture);
            this.m = (HealthTextView) view.findViewById(R.id.item_title);
            this.k = (HealthTextView) view.findViewById(R.id.item_special_tag);
            this.f = (HealthButton) view.findViewById(R.id.item_right_btn);
            this.n = (HealthTextView) view.findViewById(R.id.item_subtitle);
            this.e = (LinearLayout) view.findViewById(R.id.item_divider);
            this.j = (HealthTextView) view.findViewById(R.id.item_parent_title);
            this.i = (HealthTextView) view.findViewById(R.id.item_join_number);
            this.f8723c = (HealthTextView) view.findViewById(R.id.item_description);
            this.g = (LinearLayout) view.findViewById(R.id.item_labels_layout);
            this.f8722b = (HealthImageView) view.findViewById(R.id.item_audio_tag);
        }
    }
}
