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
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fqb;
import defpackage.fts;
import defpackage.fxk;
import defpackage.lsx;
import defpackage.njy;
import defpackage.qqf;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionSideSlipAdapter extends RecyclerView.Adapter<SectionSideSlipViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f7438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<OnClickSectionListener> f7439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Drawable> f7440c;
    private Context d;
    private List<String> e;
    private List<String> f;
    private List<String> g;
    private List<String> h;
    private List<String> i;
    private OnClickSectionListener j;
    private List<String> k;
    private List<Integer> l;

    public SectionSideSlipAdapter(Context context, fqb fqbVar) {
        this.d = context;
        e(fqbVar);
    }

    public void c(fqb fqbVar) {
        e(fqbVar);
        notifyDataSetChanged();
    }

    private void e(fqb fqbVar) {
        this.g = fqbVar.a();
        this.h = fqbVar.j();
        this.f7438a = fqbVar.b();
        this.j = fqbVar.g();
        this.l = fqbVar.l();
        this.k = fqbVar.f();
        this.i = fqbVar.h();
        this.f7440c = fqbVar.e();
        this.f = fqbVar.i();
        this.e = fqbVar.c();
        this.f7439b = fqbVar.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SectionSideSlipViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 101) {
            i2 = R.layout.section_member_coupon;
        } else {
            i2 = R.layout.section_side_slip_item;
        }
        return new SectionSideSlipViewHolder(LayoutInflater.from(this.d).inflate(i2, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SectionSideSlipViewHolder sectionSideSlipViewHolder, int i) {
        c(sectionSideSlipViewHolder, i);
    }

    private void c(SectionSideSlipViewHolder sectionSideSlipViewHolder, final int i) {
        RecyclerView.LayoutParams layoutParamsB = b(sectionSideSlipViewHolder, i);
        if (layoutParamsB == null) {
            LogUtil.e("params is invalid!", new Object[0]);
            return;
        }
        if (sectionSideSlipViewHolder.f7445c != null) {
            sectionSideSlipViewHolder.f7445c.setLayoutParams(layoutParamsB);
            sectionSideSlipViewHolder.f7445c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionSideSlipAdapter.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (SectionSideSlipAdapter.this.j != null) {
                        SectionSideSlipAdapter.this.j.onClick(i);
                    }
                }
            });
        }
        d(sectionSideSlipViewHolder, i);
        h(sectionSideSlipViewHolder, i);
        a(sectionSideSlipViewHolder, i);
        f(sectionSideSlipViewHolder, i);
    }

    private void f(SectionSideSlipViewHolder sectionSideSlipViewHolder, int i) {
        if (sectionSideSlipViewHolder.j != null && fts.d(this.k, i)) {
            sectionSideSlipViewHolder.j.setText(this.k.get(i));
        }
        if (sectionSideSlipViewHolder.f7443a != null && fts.d(this.e, i)) {
            sectionSideSlipViewHolder.f7443a.setText(this.e.get(i));
        }
        if (sectionSideSlipViewHolder.g != null && fts.d(this.i, i)) {
            sectionSideSlipViewHolder.g.setText(this.i.get(i));
            sectionSideSlipViewHolder.g.setTypeface(Typeface.createFromAsset(this.d.getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf"));
        }
        if (sectionSideSlipViewHolder.l != null && fts.d(this.f, i)) {
            sectionSideSlipViewHolder.l.setText(this.f.get(i));
        }
        if (sectionSideSlipViewHolder.h != null && fts.d(this.f7440c, i)) {
            sectionSideSlipViewHolder.h.setBackground(this.f7440c.get(i));
        }
        if (sectionSideSlipViewHolder.d == null || !fts.d(this.f7439b, i)) {
            return;
        }
        sectionSideSlipViewHolder.d.setClickable(true);
        sectionSideSlipViewHolder.d.setOnClickListener(this.f7439b.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (!njy.c(this.l, i) || this.l.get(i) == null) ? i : this.l.get(i).intValue();
    }

    private void a(SectionSideSlipViewHolder sectionSideSlipViewHolder, final int i) {
        if (!fts.d(this.f7438a, i) || sectionSideSlipViewHolder.f7445c == null) {
            return;
        }
        sectionSideSlipViewHolder.f7445c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionSideSlipAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SectionSideSlipAdapter.this.f7438a.get(i) == null) {
                    return;
                }
                String str = (String) SectionSideSlipAdapter.this.f7438a.get(i);
                if (str.startsWith("huaweischeme://")) {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
                    intent.setPackage(SectionSideSlipAdapter.this.d.getPackageName());
                    lsx.c(intent, SectionSideSlipAdapter.this.d);
                } else {
                    MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
                    if (marketRouterApi != null) {
                        marketRouterApi.router(str);
                    }
                }
            }
        });
    }

    private void h(SectionSideSlipViewHolder sectionSideSlipViewHolder, int i) {
        if (!fts.d(this.h, i) || sectionSideSlipViewHolder.i == null) {
            return;
        }
        sectionSideSlipViewHolder.i.setText(this.h.get(i));
    }

    private void d(SectionSideSlipViewHolder sectionSideSlipViewHolder, int i) {
        if (!fts.d(this.g, i) || sectionSideSlipViewHolder.f == null) {
            return;
        }
        Object obj = this.g.get(i);
        Object objA = sectionSideSlipViewHolder.a();
        if (obj instanceof String) {
            String str = (String) obj;
            String str2 = objA instanceof String ? (String) objA : "";
            if (str.length() <= 0 || str.equals(str2)) {
                return;
            }
            qqf.e(sectionSideSlipViewHolder.f, str, qqf.d, 0, R.drawable.section_blank_1008);
            sectionSideSlipViewHolder.c(str);
            return;
        }
        if (obj instanceof Integer) {
            int iIntValue = objA instanceof Integer ? ((Integer) objA).intValue() : 0;
            Integer num = (Integer) obj;
            int iIntValue2 = num.intValue();
            if (iIntValue != iIntValue2) {
                sectionSideSlipViewHolder.f.setImageResource(iIntValue2);
                sectionSideSlipViewHolder.c(num);
                return;
            }
            return;
        }
        qqf.a(R.drawable.section_blank_1008, sectionSideSlipViewHolder.f, qqf.d);
    }

    protected RecyclerView.LayoutParams b(SectionSideSlipViewHolder sectionSideSlipViewHolder, int i) {
        ViewGroup.LayoutParams layoutParams = sectionSideSlipViewHolder.f7445c.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.e("layoutParams error", new Object[0]);
            return null;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        layoutParams2.width = fxk.c(this.d, 22, getItemCount());
        layoutParams2.height = -2;
        return layoutParams2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.l != null) {
            return Math.min(3, this.k.size());
        }
        return fts.e(this.g, this.h, this.f7438a, this.k);
    }

    public class SectionSideSlipViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f7443a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RelativeLayout f7445c;
        private RelativeLayout d;
        private Object e;
        private HealthImageView f;
        private HealthTextView g;
        private FrameLayout h;
        private TextView i;
        private HealthTextView j;
        private HealthTextView l;

        public SectionSideSlipViewHolder(View view) {
            super(view);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.item_side_slip);
            this.f7445c = relativeLayout;
            if (relativeLayout == null) {
                this.f7445c = (RelativeLayout) view.findViewById(R.id.item_coupon_view);
            }
            this.f = (HealthImageView) view.findViewById(R.id.item_main_image);
            this.i = (TextView) view.findViewById(R.id.item_main_title);
            this.h = (FrameLayout) view.findViewById(R.id.item_coupon_background);
            this.g = (HealthTextView) view.findViewById(R.id.text_price_number);
            this.l = (HealthTextView) view.findViewById(R.id.text_unit);
            this.j = (HealthTextView) view.findViewById(R.id.item_coupon_name);
            this.f7443a = (HealthTextView) view.findViewById(R.id.item_coupon_action);
            this.d = (RelativeLayout) view.findViewById(R.id.item_coupon_action_rl);
        }

        public Object a() {
            return this.e;
        }

        public void c(Object obj) {
            this.e = obj;
        }
    }
}
