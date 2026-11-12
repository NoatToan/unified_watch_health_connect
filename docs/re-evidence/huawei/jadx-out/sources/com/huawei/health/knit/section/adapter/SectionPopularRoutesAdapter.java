package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fpy;
import defpackage.fts;
import defpackage.qqf;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionPopularRoutesAdapter extends RecyclerView.Adapter<e> {
    private static final int d = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Double> f7406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f7407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f7408c;
    private Context e;
    private OnClickSectionListener g;
    private List<Long> j;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public SectionPopularRoutesAdapter(Context context, fpy fpyVar) {
        this.e = context;
        b(fpyVar);
    }

    public void a(fpy fpyVar) {
        b(fpyVar);
        notifyDataSetChanged();
    }

    private void b(fpy fpyVar) {
        this.f7408c = fpyVar.c();
        this.f7407b = fpyVar.b();
        this.f7406a = fpyVar.d();
        this.j = fpyVar.a();
        this.g = fpyVar.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(LayoutInflater.from(this.e).inflate(R.layout.section_popular_routes_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, int i) {
        e(eVar, i);
    }

    private void e(e eVar, final int i) {
        RecyclerView.LayoutParams layoutParamsB = b(eVar, i);
        if (layoutParamsB == null) {
            LogUtil.e("params is invalid!", new Object[0]);
            return;
        }
        if (eVar.f != null) {
            eVar.f.setLayoutParams(layoutParamsB);
            eVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionPopularRoutesAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (SectionPopularRoutesAdapter.this.g != null) {
                        LogUtil.a("SectionPopularRoutesAdapter", "ITEM IS CLICK!");
                        SectionPopularRoutesAdapter.this.g.onClick(i);
                    }
                }
            });
        }
        a(eVar, i);
        c(eVar, i);
    }

    protected RecyclerView.LayoutParams b(e eVar, int i) {
        ViewGroup.LayoutParams layoutParams = eVar.f.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.e("layoutParams error", new Object[0]);
            return null;
        }
        int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        int dimensionPixelSize3 = this.e.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        if (getItemCount() > 1) {
            layoutParams2.width = this.e.getResources().getDimensionPixelSize(R.dimen.health_common_260dp);
            if (i == 0) {
                layoutParams2.setMarginStart(dimensionPixelSize);
                return layoutParams2;
            }
            if (i == getItemCount() - 1) {
                layoutParams2.setMarginStart(dimensionPixelSize3);
                layoutParams2.setMarginEnd(dimensionPixelSize2);
                return layoutParams2;
            }
            layoutParams2.setMarginStart(dimensionPixelSize3);
            return layoutParams2;
        }
        layoutParams2.width = -1;
        layoutParams2.setMarginStart(dimensionPixelSize3);
        layoutParams2.setMarginEnd(dimensionPixelSize2);
        return layoutParams2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return fts.e(this.f7407b, this.f7408c, this.f7406a, this.j);
    }

    class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TextView f7411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f7412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LinearLayout f7413c;
        private LinearLayout d;
        private RelativeLayout f;
        private TextView g;
        private TextView i;

        public e(View view) {
            super(view);
            this.f = (RelativeLayout) view.findViewById(R.id.recycle_item_layout);
            this.f7412b = (ImageView) view.findViewById(R.id.item_picture);
            this.i = (TextView) view.findViewById(R.id.item_title);
            this.f7411a = (TextView) view.findViewById(R.id.item_durationl_first);
            this.g = (TextView) view.findViewById(R.id.item_duration_second);
            this.d = (LinearLayout) view.findViewById(R.id.date_line_layout);
            this.f7413c = (LinearLayout) view.findViewById(R.id.flag_line_layout);
            this.d.setVisibility(8);
            this.f7413c.setVisibility(8);
        }

        public void c(String str, int i) {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("http")) {
                    qqf.c(str, this.f7412b, i);
                    return;
                } else {
                    qqf.c(str, this.f7412b);
                    return;
                }
            }
            LogUtil.j("SectionPopularRoutesAdapter", "setImageUrl imageUrl isEmpty");
        }
    }

    private void a(e eVar, int i) {
        if (!fts.d(this.f7407b, i) || eVar.f7412b == null) {
            return;
        }
        eVar.c(this.f7407b.get(i), d);
    }

    private void c(e eVar, int i) {
        if (fts.d(this.f7408c, i) && eVar.i != null) {
            eVar.i.setText(this.f7408c.get(i));
        }
        if (fts.d(this.f7406a, i) && eVar.f7411a != null) {
            eVar.f7411a.setText(b(R.string.IDS_hw_show_sport_kms_string, R.string.IDS_hw_show_sport_kms_string_en, this.f7406a.get(i).doubleValue()));
        }
        if (!fts.d(this.j, i) || eVar.g == null) {
            return;
        }
        eVar.g.setText(this.e.getResources().getQuantityString(R.plurals.IDS_hw_show_sport_prople_string, UnitUtil.e(this.j.get(i).longValue())));
    }

    private String b(int i, int i2, double d2) {
        boolean zF = UnitUtil.f();
        double d3 = d2 / 1000.0d;
        double dE = UnitUtil.e(d3, 3);
        if (zF) {
            d3 = dE;
        }
        if (zF) {
            i = i2;
        }
        return this.e.getResources().getString(i, UnitUtil.e(d3, 1, 2));
    }
}
