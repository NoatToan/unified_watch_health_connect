package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.Product;
import com.huawei.trade.datatype.SubscriptionPromotion;
import com.huawei.trade.datatype.SubscriptionPromotionSimpleTemplate;
import com.huawei.trade.datatype.TimeLimitedPromotion;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fca;
import defpackage.fcn;
import defpackage.njy;
import defpackage.qhu;
import defpackage.qqf;
import defpackage.qqt;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class SectionMemberTypeAdapter extends RecyclerView.Adapter<SectionMemberTypeViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnClickSectionListener f7385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7386c;
    private int e;
    private List<Product> j;
    private int i = 0;
    private boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<String> f7384a = new HashSet();

    public void b(boolean z) {
        this.d = z;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SectionMemberTypeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SectionMemberTypeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_member_type_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SectionMemberTypeViewHolder sectionMemberTypeViewHolder, int i) {
        if (njy.e(this.j, i)) {
            return;
        }
        Product product = this.j.get(i);
        LogUtil.a("SectionMemberTypeAdapter", "onBindViewHolder position: ", Integer.valueOf(i), " products: ", product);
        qsp.a(sectionMemberTypeViewHolder.l, product.getProductName(), true);
        qsp.b(sectionMemberTypeViewHolder.f7390c, qhu.d(product.getCurrency()));
        qsp.b(sectionMemberTypeViewHolder.f7389b, fca.c(product.getMicroPrice(), "#.##"));
        boolean zE = e(sectionMemberTypeViewHolder.e, product);
        String strD = d(product);
        LogUtil.a("SectionMemberTypeAdapter", "isShowGiveaway: ", Boolean.valueOf(zE));
        if (zE && TextUtils.isEmpty(strD) && !this.d) {
            strD = b(product);
        }
        qsp.a(sectionMemberTypeViewHolder.g, strD, true);
        if (this.d) {
            sectionMemberTypeViewHolder.g.setTextColor(qre.e(R.color.color_vip_fallback_subtitle_title));
        } else {
            sectionMemberTypeViewHolder.g.setTextColor(qre.e(R.color.color_member_fallback_subtitle_title));
        }
        if (sectionMemberTypeViewHolder.i != null) {
            if (TextUtils.isEmpty(strD)) {
                sectionMemberTypeViewHolder.i.setVisibility(4);
                qsp.c((View) sectionMemberTypeViewHolder.e, 8);
            } else {
                sectionMemberTypeViewHolder.i.setVisibility(0);
                c(this.d, sectionMemberTypeViewHolder);
                if (zE) {
                    qsp.c((View) sectionMemberTypeViewHolder.e, 0);
                } else {
                    qsp.c((View) sectionMemberTypeViewHolder.e, 8);
                }
            }
        } else if (!zE) {
            qsp.c((View) sectionMemberTypeViewHolder.e, 8);
        }
        sectionMemberTypeViewHolder.j.getPaint().setFlags(17);
        String strC = c(product);
        sectionMemberTypeViewHolder.j.setText(strC);
        sectionMemberTypeViewHolder.j.setVisibility(TextUtils.isEmpty(strC) ? 8 : 0);
        if (this.f7386c) {
            sectionMemberTypeViewHolder.f.setOrientation(1);
            ((ViewGroup.MarginLayoutParams) sectionMemberTypeViewHolder.j.getLayoutParams()).setMarginStart(0);
        }
        c(sectionMemberTypeViewHolder, i);
        d(sectionMemberTypeViewHolder, i);
        a(sectionMemberTypeViewHolder, product);
        sectionMemberTypeViewHolder.d.setMinimumHeight(this.e);
    }

    public void c(boolean z, SectionMemberTypeViewHolder sectionMemberTypeViewHolder) {
        int i;
        if (sectionMemberTypeViewHolder.i == null) {
            return;
        }
        Context context = sectionMemberTypeViewHolder.i.getContext();
        boolean zBa = LanguageUtil.ba(BaseApplication.b());
        if (z) {
            if (zBa) {
                i = R.drawable.section_member_type_item_promo_exclusive_bg_rlt;
            } else {
                i = R.drawable.section_member_type_item_promo_exclusive_bg;
            }
        } else if (zBa) {
            i = R.drawable.section_member_type_item_promo_bg_rtl;
        } else {
            i = R.drawable.section_member_type_item_promo_bg;
        }
        sectionMemberTypeViewHolder.i.setBackground(ContextCompat.getDrawable(context, i));
    }

    private boolean e(HealthImageView healthImageView, Product product) {
        if (product == null) {
            return false;
        }
        List<Product> giveaways = product.getGiveaways();
        if (njy.e(giveaways)) {
            return false;
        }
        String productUrl = "";
        for (Product product2 : giveaways) {
            if (product2.isShowGiveawayPicFlag()) {
                productUrl = product2.getProductUrl();
            }
            if (!TextUtils.isEmpty(productUrl)) {
                break;
            }
        }
        if (TextUtils.isEmpty(productUrl)) {
            return false;
        }
        qqf.b(productUrl, healthImageView, (int) BaseApplication.b().getResources().getDimension(R.dimen.defaultCornerRadiusXS));
        healthImageView.setVisibility(0);
        return true;
    }

    private String c(Product product) {
        if (product == null) {
            LogUtil.a("SectionMemberTypeAdapter", "getOriPrice product is null");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(qhu.d(product.getCurrency()));
        long nowTime = product.getNowTime();
        if (product.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG) {
            SubscriptionPromotion subscriptionPromotion = product.getSubscriptionPromotion();
            if (subscriptionPromotion == null) {
                LogUtil.a("SectionMemberTypeAdapter", "getOriPrice subpromotion is null");
                return "";
            }
            try {
                if (nowTime < Long.parseLong(subscriptionPromotion.getStartTime()) || nowTime > Long.parseLong(subscriptionPromotion.getEndTime())) {
                    LogUtil.a("SectionMemberTypeAdapter", "expired subscription");
                    return "";
                }
                stringBuffer.append(fca.c(subscriptionPromotion.getMicroOriginalPrice(), "#.##"));
            } catch (NumberFormatException unused) {
                LogUtil.j("SectionMemberTypeAdapter", "getPromotionInfo NumberFormatException");
                return "";
            }
        }
        if (product.getPurchasePolicy() == Product.REPEAT_PURCHASE_FLAG) {
            TimeLimitedPromotion promotion = product.getPromotion();
            if (promotion == null) {
                LogUtil.j("SectionMemberTypeAdapter", "getRepeatPurchasePromotion promotion is null");
                return "";
            }
            if (nowTime > promotion.getPromotionEndTime()) {
                LogUtil.a("SectionMemberTypeAdapter", "expired promotion");
                return "";
            }
            stringBuffer.append(fca.c(promotion.getMicroOriginPrice(), "#.##"));
        }
        return stringBuffer.toString();
    }

    private String d(Product product) {
        if (product == null) {
            LogUtil.a("SectionMemberTypeAdapter", "getPromotionInfo product is null");
            return "";
        }
        if (this.d) {
            return product.getPromotionDesc();
        }
        if (product.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG) {
            return e(product);
        }
        return a(product);
    }

    private String e(Product product) {
        if (product == null) {
            LogUtil.a("SectionMemberTypeAdapter", "getSubcriptionPromotionDesc product is null");
            return "";
        }
        SubscriptionPromotion subscriptionPromotion = product.getSubscriptionPromotion();
        if (subscriptionPromotion == null || !subscriptionPromotion.isDescriptionVisibility()) {
            LogUtil.j("SectionMemberTypeAdapter", "getSubcriptionPromotionDesc promotion is null");
            return "";
        }
        long nowTime = product.getNowTime();
        try {
            if (nowTime < Long.parseLong(subscriptionPromotion.getStartTime()) || nowTime > Long.parseLong(subscriptionPromotion.getEndTime())) {
                LogUtil.a("SectionMemberTypeAdapter", "expired subscription");
                return "";
            }
            if (subscriptionPromotion.getContentType() != 1) {
                LogUtil.a("SectionMemberTypeAdapter", "unsupported subscription promotion content type");
                return "";
            }
            SubscriptionPromotionSimpleTemplate subscriptionPromotionSimpleTemplate = (SubscriptionPromotionSimpleTemplate) qqt.e(subscriptionPromotion.getContent(), SubscriptionPromotionSimpleTemplate.class);
            return subscriptionPromotionSimpleTemplate != null ? subscriptionPromotionSimpleTemplate.getContent() : "";
        } catch (NumberFormatException unused) {
            LogUtil.j("SectionMemberTypeAdapter", "getPromotionInfo NumberFormatException");
            return "";
        }
    }

    private String a(Product product) {
        if (product == null) {
            LogUtil.a("SectionMemberTypeAdapter", "getRepeatPurchasePromotion product is null");
            return "";
        }
        TimeLimitedPromotion promotion = product.getPromotion();
        if (promotion == null || !product.isPromotionDescVisibility()) {
            LogUtil.j("SectionMemberTypeAdapter", "getRepeatPurchasePromotion promotion is null");
            return "";
        }
        if (product.getNowTime() > promotion.getPromotionEndTime()) {
            LogUtil.a("SectionMemberTypeAdapter", "expired promotion");
            return "";
        }
        return product.getPromotionDesc();
    }

    private void a(SectionMemberTypeViewHolder sectionMemberTypeViewHolder, Product product) {
        if (sectionMemberTypeViewHolder.d == null) {
            return;
        }
        LogUtil.a("SectionMemberTypeAdapter", "bindViewTreeObserver");
        sectionMemberTypeViewHolder.h = product;
        ViewTreeVisibilityListener.c(sectionMemberTypeViewHolder.d, new ViewTreeVisibilityListener(sectionMemberTypeViewHolder.d, sectionMemberTypeViewHolder), 500L);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    private String b(Product product) {
        byte b2;
        long j;
        if (product == null) {
            LogUtil.a("SectionMemberTypeAdapter", "getSubTitle product is null");
            return "";
        }
        if (product.getPurchasePolicy() == Product.SUBSCRIPTION_PURCHASE_FLAG) {
            return h(product);
        }
        if (product.getPurchasePolicy() != Product.REPEAT_PURCHASE_FLAG) {
            return "";
        }
        if (product.isTitleVisibility()) {
            return product.getTitle();
        }
        BigDecimal bigDecimal = new BigDecimal(product.getMicroPrice());
        String duration = product.getDuration();
        duration.hashCode();
        int iHashCode = duration.hashCode();
        if (iHashCode != 78476) {
            if (iHashCode != 78488) {
                if (iHashCode == 78538 && duration.equals(Product.SEASON_DURATION_FLAG)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (duration.equals(Product.YEAR_DURATION_FLAG)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (duration.equals(Product.MONTH_DURATION_FLAG)) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            j = 30000000;
        } else if (b2 == 1) {
            j = 365000000;
        } else {
            if (b2 != 2) {
                return "";
            }
            j = 90000000;
        }
        String str = new DecimalFormat("#.##").format(bigDecimal.divide(new BigDecimal(String.valueOf(j)), 2, RoundingMode.HALF_UP));
        if (b()) {
            return BaseApplication.b().getString(R.string.IDS_vip_average_day_cost, str);
        }
        return qhu.c(product.getCurrency(), str, R.string.IDS_vip_average_day_cost);
    }

    private String h(Product product) {
        if (product != null && product.isTitleVisibility()) {
            return TextUtils.isEmpty(product.getTitle()) ? "" : product.getTitle();
        }
        LogUtil.a("SectionMemberTypeAdapter", "getSubTitle product is null");
        return "";
    }

    private void c(SectionMemberTypeViewHolder sectionMemberTypeViewHolder, int i) {
        if (i == this.i) {
            qsp.e(sectionMemberTypeViewHolder.d, R.drawable.section_member_type_item_bg_selected);
        } else {
            qsp.e(sectionMemberTypeViewHolder.d, R.drawable.section_member_type_item_bg);
        }
    }

    private void d(SectionMemberTypeViewHolder sectionMemberTypeViewHolder, final int i) {
        qsp.b(sectionMemberTypeViewHolder.d, new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionMemberTypeAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SectionMemberTypeAdapter.this.f7385b != null) {
                    SectionMemberTypeAdapter.this.f7385b.onClick(i);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.j)) {
            return 0;
        }
        return this.j.size();
    }

    public void e(List<Product> list) {
        this.j = list;
        a(list);
    }

    private void a(List<Product> list) {
        this.e = qre.b(R.dimen.health_common_92dp);
        this.f7386c = false;
        for (Product product : list) {
            String strD = qhu.d(product.getCurrency());
            String strC = fca.c(product.getMicroPrice(), "#.##");
            String strC2 = c(product);
            if ((TextUtils.isEmpty(strD) ? 0 : strD.length()) + (TextUtils.isEmpty(strC) ? 0 : strC.length()) + (TextUtils.isEmpty(strC2) ? 0 : strC2.length()) > 14 && !TextUtils.isEmpty(strC2)) {
                this.f7386c = true;
                this.e = qre.b(R.dimen.health_common_103dp);
                return;
            }
        }
    }

    public void d(int i) {
        this.i = i;
    }

    public void c(OnClickSectionListener onClickSectionListener) {
        this.f7385b = onClickSectionListener;
    }

    private boolean b() {
        return LanguageUtil.l(BaseApplication.b()) || LanguageUtil.bs(BaseApplication.b()) || LanguageUtil.bo(BaseApplication.b());
    }

    public class SectionMemberTypeViewHolder extends RecyclerView.ViewHolder implements ViewTreeVisibilityListener.ViewTreeListenee {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f7389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthTextView f7390c;
        private final View d;
        private final HealthImageView e;
        private final LinearLayout f;
        private final HealthTextView g;
        private Product h;
        private final LinearLayout i;
        private final HealthTextView j;
        private final HealthTextView l;
        private final View m;

        public SectionMemberTypeViewHolder(View view) {
            super(view);
            this.d = view;
            this.m = view.findViewById(R.id.section_member_type_root_layout);
            this.g = (HealthTextView) view.findViewById(R.id.section_member_type_promo);
            this.l = (HealthTextView) view.findViewById(R.id.section_member_type_item_title);
            this.i = (LinearLayout) view.findViewById(R.id.section_member_type_promo_container);
            this.f = (LinearLayout) view.findViewById(R.id.section_member_type_price_layout);
            this.f7390c = (HealthTextView) view.findViewById(R.id.section_member_type_item_currency);
            this.f7389b = (HealthTextView) view.findViewById(R.id.section_member_type_item_amount);
            this.j = (HealthTextView) view.findViewById(R.id.section_member_type_item_ori_price);
            this.e = (HealthImageView) view.findViewById(R.id.member_type_item_giveaway_icon);
        }

        @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
        public void checkVisibilityAndSetBiEvent() {
            Product product;
            if (!ViewTreeVisibilityListener.c(this.d) || hasSetBiEvent() || (product = this.h) == null) {
                return;
            }
            LogUtil.a("SectionMemberTypeAdapter", "visible to user: ", product.getProductName());
            biEvent();
            SectionMemberTypeAdapter.this.f7384a.add(this.h.getProductId());
        }

        @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
        public boolean hasSetBiEvent() {
            return this.h != null && SectionMemberTypeAdapter.this.f7384a.contains(this.h.getProductId());
        }

        @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
        public void biEvent() {
            if (this.h == null) {
                return;
            }
            fcn.b(BaseApplication.b(), this.h);
        }
    }
}
