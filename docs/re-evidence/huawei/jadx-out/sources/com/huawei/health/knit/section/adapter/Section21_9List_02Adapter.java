package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.knit.section.view.BaseBiItemView;
import com.huawei.health.search.SearchResultItemView;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.ezi;
import defpackage.foy;
import defpackage.fts;
import defpackage.njy;
import defpackage.qsp;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Section21_9List_02Adapter extends RecyclerView.Adapter<d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnClickSectionListener f7274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7275c;
    private String d;
    private List<foy> e;
    private int i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7273a = -1;

    public Section21_9List_02Adapter(Context context, List<foy> list) {
        this.f7275c = context;
        this.e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new d(new SearchResultItemView(this.f7275c, R.layout.section21_9list_02_item));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(d dVar, int i) {
        if (njy.e(this.e, i)) {
            LogUtil.a("Section21_9List_02Adapter", "onBindViewHolder position out of bound");
            return;
        }
        fts.a(this.f7275c, dVar.e, i, getItemCount());
        foy foyVar = this.e.get(i);
        if (!TextUtils.isEmpty(foyVar.a())) {
            fts.b(dVar.f7277b, foyVar.a());
        } else {
            fts.a(dVar.f7277b);
        }
        if (dVar.itemView instanceof BaseBiItemView) {
            ((BaseBiItemView) dVar.itemView).a(foyVar.b());
        }
        qsp.b(dVar.f7278c, ezi.e(foyVar.c(), this.d));
        qsp.a(dVar.d, foyVar.e(), true);
        fts.d(dVar.f7276a, this.f7274b, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f7273a == -1) {
            int i = this.i;
            List<foy> list = this.e;
            this.f7273a = Math.min(i, list != null ? list.size() : 0);
        }
        return this.f7273a;
    }

    public void a(int i) {
        this.i = i;
    }

    public void c(OnClickSectionListener onClickSectionListener) {
        this.f7274b = onClickSectionListener;
    }

    public void b(String str) {
        this.d = str;
    }

    static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RelativeLayout f7276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthImageView f7277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f7278c;
        private HealthTextView d;
        private HealthDivider e;

        d(View view) {
            super(view);
            this.f7276a = (RelativeLayout) view.findViewById(R.id.section21_9list_02_item_content);
            this.f7277b = (HealthImageView) view.findViewById(R.id.section21_9list_02_item_left_image);
            this.f7278c = (HealthTextView) view.findViewById(R.id.section21_9list_02_item_title);
            this.e = (HealthDivider) view.findViewById(R.id.section21_9list_02_item_divider);
            this.d = (HealthTextView) view.findViewById(R.id.section21_9list_02_item_special_tag);
        }
    }
}
