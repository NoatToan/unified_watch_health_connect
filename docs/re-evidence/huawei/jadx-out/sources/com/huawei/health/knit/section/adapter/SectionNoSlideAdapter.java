package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fqb;
import defpackage.fts;
import defpackage.lsx;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qrs;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionNoSlideAdapter extends RecyclerView.Adapter<SectionNoSlideViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<OnClickSectionListener> f7396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Drawable> f7397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f7398c;
    private List<String> d;
    private List<String> e;
    private List<String> f;
    private Context g;
    private List<String> h;
    private List<String> i;
    private OnClickSectionListener j;
    private List<String> l;
    private List<Integer> m;

    public SectionNoSlideAdapter(Context context, fqb fqbVar) {
        this.g = context;
        e(fqbVar);
    }

    public void d(fqb fqbVar) {
        e(fqbVar);
        notifyDataSetChanged();
    }

    private void e(fqb fqbVar) {
        this.e = fqbVar.a();
        this.h = fqbVar.j();
        this.d = fqbVar.b();
        this.j = fqbVar.g();
        this.m = fqbVar.l();
        this.l = fqbVar.f();
        this.f = fqbVar.h();
        this.f7397b = fqbVar.e();
        this.i = fqbVar.i();
        this.f7398c = fqbVar.c();
        this.f7396a = fqbVar.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SectionNoSlideViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SectionNoSlideViewHolder(LayoutInflater.from(this.g).inflate(R.layout.layout_no_slide_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SectionNoSlideViewHolder sectionNoSlideViewHolder, int i) {
        b(sectionNoSlideViewHolder, i);
    }

    private void b(SectionNoSlideViewHolder sectionNoSlideViewHolder, int i) {
        if (i == 0) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) sectionNoSlideViewHolder.itemView.getLayoutParams();
            layoutParams.leftMargin = qrs.d(this.g, 12.0f);
            layoutParams.rightMargin = qrs.d(this.g, 6.0f);
            sectionNoSlideViewHolder.itemView.setLayoutParams(layoutParams);
        } else if (i == getItemCount() - 1) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) sectionNoSlideViewHolder.itemView.getLayoutParams();
            layoutParams2.rightMargin = qrs.d(this.g, 12.0f);
            layoutParams2.leftMargin = qrs.d(this.g, 6.0f);
            sectionNoSlideViewHolder.itemView.setLayoutParams(layoutParams2);
        } else {
            RecyclerView.LayoutParams layoutParams3 = (RecyclerView.LayoutParams) sectionNoSlideViewHolder.itemView.getLayoutParams();
            layoutParams3.rightMargin = qrs.d(this.g, 6.0f);
            layoutParams3.leftMargin = qrs.d(this.g, 6.0f);
            sectionNoSlideViewHolder.itemView.setLayoutParams(layoutParams3);
        }
        d(sectionNoSlideViewHolder, i);
        g(sectionNoSlideViewHolder, i);
        e(sectionNoSlideViewHolder, i);
        c(sectionNoSlideViewHolder, i);
    }

    private void d(SectionNoSlideViewHolder sectionNoSlideViewHolder, int i) {
        if (!fts.d(this.e, i) || sectionNoSlideViewHolder.h == null) {
            return;
        }
        Object obj = this.e.get(i);
        Object objD = sectionNoSlideViewHolder.d();
        if (obj instanceof String) {
            String str = (String) obj;
            String str2 = objD instanceof String ? (String) objD : "";
            if (str.length() <= 0 || str.equals(str2)) {
                return;
            }
            qqf.e(sectionNoSlideViewHolder.h, str, qqf.d, 0, R.drawable.section_blank_1008);
            sectionNoSlideViewHolder.c(str);
            return;
        }
        if (obj instanceof Integer) {
            int iIntValue = objD instanceof Integer ? ((Integer) objD).intValue() : 0;
            Integer num = (Integer) obj;
            int iIntValue2 = num.intValue();
            if (iIntValue != iIntValue2) {
                sectionNoSlideViewHolder.h.setImageResource(iIntValue2);
                sectionNoSlideViewHolder.c(num);
                return;
            }
            return;
        }
        qqf.a(R.drawable.section_blank_1008, sectionNoSlideViewHolder.h, qqf.d);
    }

    private void g(SectionNoSlideViewHolder sectionNoSlideViewHolder, int i) {
        if (!fts.d(this.h, i) || sectionNoSlideViewHolder.j == null) {
            return;
        }
        sectionNoSlideViewHolder.j.setText(this.h.get(i));
    }

    private void e(SectionNoSlideViewHolder sectionNoSlideViewHolder, final int i) {
        if (!fts.d(this.d, i) || sectionNoSlideViewHolder.f7404b == null) {
            return;
        }
        sectionNoSlideViewHolder.f7404b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionNoSlideAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SectionNoSlideAdapter.this.d.get(i) == null) {
                    return;
                }
                String str = (String) SectionNoSlideAdapter.this.d.get(i);
                if (str.startsWith("huaweischeme://")) {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
                    intent.setPackage(SectionNoSlideAdapter.this.g.getPackageName());
                    lsx.c(intent, SectionNoSlideAdapter.this.g);
                } else {
                    MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
                    if (marketRouterApi != null) {
                        marketRouterApi.router(str);
                    }
                }
            }
        });
    }

    private void c(SectionNoSlideViewHolder sectionNoSlideViewHolder, final int i) {
        if (sectionNoSlideViewHolder.f != null && fts.d(this.l, i)) {
            sectionNoSlideViewHolder.f.setText(this.l.get(i));
        }
        if (sectionNoSlideViewHolder.e != null && fts.d(this.f7398c, i)) {
            sectionNoSlideViewHolder.e.setText(this.f7398c.get(i));
        }
        if (sectionNoSlideViewHolder.g != null && fts.d(this.f, i)) {
            sectionNoSlideViewHolder.g.setText(this.f.get(i));
            sectionNoSlideViewHolder.g.setTypeface(Typeface.createFromAsset(this.g.getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf"));
        }
        if (sectionNoSlideViewHolder.o != null && fts.d(this.i, i)) {
            sectionNoSlideViewHolder.o.setText(this.i.get(i));
        }
        if (sectionNoSlideViewHolder.i != null && fts.d(this.f7397b, i)) {
            sectionNoSlideViewHolder.i.setBackground(this.f7397b.get(i));
        }
        if (qqs.e(this.g)) {
            sectionNoSlideViewHolder.i.setAlpha(0.86f);
        }
        if (sectionNoSlideViewHolder.f7403a != null && fts.d(this.f7396a, i)) {
            sectionNoSlideViewHolder.f7403a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionNoSlideAdapter.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ((OnClickSectionListener) SectionNoSlideAdapter.this.f7396a.get(i)).onClick(i, "BOTTOM_TEXT_CLICK_EVENT");
                }
            });
        }
        if (sectionNoSlideViewHolder.i == null || !fts.d(this.f7396a, i)) {
            return;
        }
        sectionNoSlideViewHolder.i.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionNoSlideAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((OnClickSectionListener) SectionNoSlideAdapter.this.f7396a.get(i)).onClick(i, "RIGHT_TOP_IMAGE");
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.l.size();
    }

    public class SectionNoSlideViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RelativeLayout f7403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RelativeLayout f7404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f7405c;
        private HealthTextView e;
        private HealthTextView f;
        private HealthTextView g;
        private HealthImageView h;
        private FrameLayout i;
        private TextView j;
        private HealthTextView o;

        public SectionNoSlideViewHolder(View view) {
            super(view);
            this.f7404b = (RelativeLayout) view.findViewById(R.id.item_coupon_view);
            this.h = (HealthImageView) view.findViewById(R.id.item_main_image);
            this.j = (TextView) view.findViewById(R.id.item_main_title);
            this.i = (FrameLayout) view.findViewById(R.id.item_coupon_background);
            this.g = (HealthTextView) view.findViewById(R.id.text_price_number);
            this.o = (HealthTextView) view.findViewById(R.id.text_unit);
            this.f = (HealthTextView) view.findViewById(R.id.item_coupon_name);
            this.e = (HealthTextView) view.findViewById(R.id.item_coupon_action);
            this.f7403a = (RelativeLayout) view.findViewById(R.id.item_coupon_action_rl);
        }

        public Object d() {
            return this.f7405c;
        }

        public void c(Object obj) {
            this.f7405c = obj;
        }
    }
}
