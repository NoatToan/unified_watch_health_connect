package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.flowlayout.HealthFlowLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.njy;
import defpackage.qle;
import defpackage.qqf;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Section21_9List_01Adapter extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7266b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7267c = -1;
    private List<GlobalSearchContent> d;
    private OnClickSectionListener e;

    public Section21_9List_01Adapter(Context context, List<GlobalSearchContent> list) {
        this.f7265a = context;
        this.d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(LayoutInflater.from(this.f7265a).inflate(R.layout.section21_9list_01_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, final int i) {
        if (njy.e(this.d, i)) {
            LogUtil.a("Section21_9List_01Adapter", "onBindViewHolder position out of bound");
            return;
        }
        GlobalSearchContent globalSearchContent = this.d.get(i);
        if (globalSearchContent == null) {
            LogUtil.e("Section21_9List_01Adapter", "onBindViewHolder content is null");
            return;
        }
        d(eVar, globalSearchContent);
        qsp.a(eVar.i, globalSearchContent.getName(), true);
        qsp.a(eVar.g, globalSearchContent.getPromotionInfo(), true);
        c(eVar, globalSearchContent);
        b(eVar, globalSearchContent);
        i(eVar, globalSearchContent);
        qsp.b(eVar.d, new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.Section21_9List_01Adapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Section21_9List_01Adapter.this.e.onClick(i);
            }
        });
    }

    private void d(e eVar, GlobalSearchContent globalSearchContent) {
        String productImageUrl = globalSearchContent.getProductImageUrl();
        if (TextUtils.isEmpty(productImageUrl)) {
            return;
        }
        qqf.b(productImageUrl, eVar.f7272c);
    }

    private void c(e eVar, GlobalSearchContent globalSearchContent) {
        int priceMode = globalSearchContent.getPriceMode();
        String promoPriceAccurate = globalSearchContent.getPromoPriceAccurate();
        if (priceMode == 2) {
            e(eVar);
        } else if (!TextUtils.isEmpty(promoPriceAccurate)) {
            a(eVar, globalSearchContent);
        } else {
            e(eVar, globalSearchContent);
        }
    }

    private void e(e eVar) {
        qsp.c((View) eVar.e, 8);
        qsp.c((View) eVar.j, 8);
        qsp.c((View) eVar.h, 0);
        qsp.b(eVar.h, this.f7265a.getResources().getString(R.string.IDS_merchandise_no_price));
    }

    private void a(e eVar, GlobalSearchContent globalSearchContent) {
        String strT = CommonUtil.t(globalSearchContent.getPriceAccurate());
        if (TextUtils.isEmpty(strT)) {
            qsp.c((View) eVar.j, 8);
        } else {
            qsp.c((View) eVar.j, 0);
            qsp.a(eVar.j, "¥" + strT, true);
        }
        String strT2 = CommonUtil.t(globalSearchContent.getPromoPriceAccurate());
        if (TextUtils.isEmpty(strT2)) {
            qsp.c((View) eVar.e, 8);
            qsp.c((View) eVar.h, 8);
        } else {
            qsp.c((View) eVar.e, 0);
            qsp.c((View) eVar.h, 0);
            qsp.b(eVar.h, strT2);
        }
    }

    private void e(e eVar, GlobalSearchContent globalSearchContent) {
        qsp.c((View) eVar.j, 8);
        String strT = CommonUtil.t(globalSearchContent.getPriceAccurate());
        if (TextUtils.isEmpty(strT)) {
            qsp.c((View) eVar.e, 8);
            qsp.c((View) eVar.h, 8);
        } else {
            qsp.c((View) eVar.e, 0);
            qsp.c((View) eVar.h, 0);
            qsp.a(eVar.h, strT, true);
        }
    }

    private void b(e eVar, GlobalSearchContent globalSearchContent) {
        if (eVar.f == null) {
            LogUtil.e("Section21_9List_01Adapter", "onBindViewHolder holder's promoLabels is null");
            return;
        }
        List<String> promoLabels = globalSearchContent.getPromoLabels();
        if (njy.e(promoLabels)) {
            LogUtil.a("Section21_9List_01Adapter", "onBindViewHolder product's promoLabels is empty");
            eVar.f.setVisibility(8);
            return;
        }
        ArrayList<qle> arrayList = new ArrayList<>();
        for (int i = 0; i < promoLabels.size(); i++) {
            String str = promoLabels.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(new qle(i, str, 1));
            }
        }
        eVar.f.setVisibility(0);
        eVar.f.d(arrayList, false);
    }

    private void i(e eVar, GlobalSearchContent globalSearchContent) {
        if (globalSearchContent.getRateCount() <= 0) {
            qsp.c((View) eVar.l, 0);
            qsp.c((View) eVar.f7270a, 8);
            qsp.b(eVar.l, this.f7265a.getString(R.string.IDS_merchandise_no_reviews));
            return;
        }
        qsp.c((View) eVar.l, 0);
        qsp.b(eVar.l, String.valueOf(globalSearchContent.getRateCount()) + this.f7265a.getResources().getString(R.string.IDS_merchandise_review));
        if (TextUtils.isEmpty(globalSearchContent.getGoodRate())) {
            qsp.c((View) eVar.f7270a, 8);
            return;
        }
        qsp.c((View) eVar.f7270a, 0);
        qsp.b(eVar.f7270a, globalSearchContent.getGoodRate() + "%" + this.f7265a.getResources().getString(R.string.IDS_merchandise_good_rate));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f7267c == -1) {
            int i = this.f7266b;
            List<GlobalSearchContent> list = this.d;
            this.f7267c = Math.min(i, list != null ? list.size() : 0);
        }
        return this.f7267c;
    }

    public void e(int i) {
        this.f7266b = i;
    }

    public void a(OnClickSectionListener onClickSectionListener) {
        this.e = onClickSectionListener;
    }

    class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f7270a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthImageView f7272c;
        private RelativeLayout d;
        private HealthTextView e;
        private HealthFlowLayout f;
        private HealthTextView g;
        private HealthTextView h;
        private HealthTextView i;
        private HealthTextView j;
        private HealthTextView l;

        e(View view) {
            super(view);
            this.d = (RelativeLayout) view.findViewById(R.id.section21_9list_01_recycle_item);
            this.f7272c = (HealthImageView) view.findViewById(R.id.section21_9list_01_item_picture);
            this.i = (HealthTextView) view.findViewById(R.id.merchandise_name);
            this.g = (HealthTextView) view.findViewById(R.id.merchandise_promotion_info);
            this.e = (HealthTextView) view.findViewById(R.id.merchandise_currency_unit);
            this.h = (HealthTextView) view.findViewById(R.id.merchandise_price);
            this.j = (HealthTextView) view.findViewById(R.id.merchandise_original_price);
            this.f = (HealthFlowLayout) view.findViewById(R.id.merchandise_promo_labels);
            this.l = (HealthTextView) view.findViewById(R.id.merchandise_rate_count);
            this.f7270a = (HealthTextView) view.findViewById(R.id.merchandise_good_rate);
            HealthTextView healthTextView = this.j;
            healthTextView.setPaintFlags(healthTextView.getPaintFlags() | 16);
            this.f.setTagHeight(Section21_9List_01Adapter.this.f7265a.getResources().getDimensionPixelSize(R.dimen.health_common_16dp));
            this.f.setChildViewPadding(Section21_9List_01Adapter.this.f7265a.getResources().getDimensionPixelSize(R.dimen.health_common_8dp));
            this.f.setVerticalSpacing(Section21_9List_01Adapter.this.f7265a.getResources().getDimensionPixelSize(R.dimen.health_common_2dp));
            this.f.setTextViewSpacing(Section21_9List_01Adapter.this.f7265a.getResources().getDimensionPixelSize(R.dimen.health_common_2dp));
            this.f.setTextViewBuilder(new ProductPromoTagTextViewBuilder(Section21_9List_01Adapter.this.f7265a));
        }
    }
}
