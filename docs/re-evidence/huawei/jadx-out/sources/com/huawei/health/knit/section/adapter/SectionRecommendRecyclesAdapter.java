package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.marketing.datatype.RecommendCardBean;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fcn;
import defpackage.fxk;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qsp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class SectionRecommendRecyclesAdapter extends RecyclerView.Adapter<SectionRecommendRecyclesHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<RecommendCardBean> f7414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7415c;
    private Set<String> d = new HashSet();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public SectionRecommendRecyclesAdapter(Context context) {
        LogUtil.a("SectionRecommendRecyclesAdapter", "SectionRecommendRecyclesAdapter");
        this.f7415c = context;
    }

    public void d(List<RecommendCardBean> list) {
        if (njy.e(list)) {
            return;
        }
        this.f7414b = list;
        LogUtil.a("SectionRecommendRecyclesAdapter", "mCardBeanList ", list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SectionRecommendRecyclesHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("SectionRecommendRecyclesAdapter", "onBindViewHolder");
        return new SectionRecommendRecyclesHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_recycle_recommend_card_layout_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(SectionRecommendRecyclesHolder sectionRecommendRecyclesHolder, int i) {
        LogUtil.a("SectionRecommendRecyclesAdapter", "onBindViewHolder position ", Integer.valueOf(i));
        if (!njy.c(this.f7414b, i)) {
            LogUtil.a("SectionRecommendRecyclesAdapter", "onBindViewHolder error, position not inBounds");
            return;
        }
        b(sectionRecommendRecyclesHolder, i);
        RecommendCardBean recommendCardBean = this.f7414b.get(i);
        a(sectionRecommendRecyclesHolder, recommendCardBean);
        d(sectionRecommendRecyclesHolder, recommendCardBean);
        e(sectionRecommendRecyclesHolder, recommendCardBean);
        c(sectionRecommendRecyclesHolder, i, recommendCardBean);
        b(sectionRecommendRecyclesHolder, recommendCardBean);
    }

    private void b(SectionRecommendRecyclesHolder sectionRecommendRecyclesHolder, int i) {
        int iB = qqp.b(this.f7415c);
        int iB2 = qqp.b(this.f7415c);
        ViewGroup.LayoutParams layoutParams = sectionRecommendRecyclesHolder.itemView.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.e("layoutParams error", new Object[0]);
            return;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(iB);
        if (i != getItemCount() - 1) {
            iB2 = 0;
        }
        layoutParams2.setMarginEnd(iB2);
        sectionRecommendRecyclesHolder.itemView.setLayoutParams(layoutParams2);
    }

    private void e(final SectionRecommendRecyclesHolder sectionRecommendRecyclesHolder, RecommendCardBean recommendCardBean) {
        if (recommendCardBean.getButtonColor() != null) {
            final GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(qqf.d);
            gradientDrawable.setColor(recommendCardBean.getButtonColor().intValue());
            sectionRecommendRecyclesHolder.d.setBackground(gradientDrawable);
            final GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(qqf.d);
            gradientDrawable2.setColor(ColorUtils.blendARGB(recommendCardBean.getButtonColor().intValue(), BaseApplication.b().getColor(R.color.emui_clickeffic_default_color), 0.1f));
            sectionRecommendRecyclesHolder.d.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.health.knit.section.adapter.SectionRecommendRecyclesAdapter.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        sectionRecommendRecyclesHolder.d.setBackground(gradientDrawable2);
                    }
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    sectionRecommendRecyclesHolder.d.setBackground(gradientDrawable);
                    return false;
                }
            });
        }
    }

    private void a(SectionRecommendRecyclesHolder sectionRecommendRecyclesHolder, RecommendCardBean recommendCardBean) {
        if (sectionRecommendRecyclesHolder == null || recommendCardBean == null) {
            LogUtil.e("SectionRecommendRecyclesAdapter", "recommendCardBean or holder is null");
            return;
        }
        if (recommendCardBean.getTitleColor() != null) {
            sectionRecommendRecyclesHolder.h.setTextColor(recommendCardBean.getTitleColor().intValue());
        }
        LogUtil.a("SectionRecommendRecyclesAdapter", "bind text title = ", recommendCardBean.getTitle());
        qsp.a(sectionRecommendRecyclesHolder.h, qsp.c(recommendCardBean.getTitle()), true);
        qsp.a(sectionRecommendRecyclesHolder.g, recommendCardBean.getSubtitle(), true);
        qsp.a(sectionRecommendRecyclesHolder.i, recommendCardBean.getSubtitleDataLine(), true);
        qsp.a(sectionRecommendRecyclesHolder.d, recommendCardBean.getButtonText(), true);
    }

    private void d(SectionRecommendRecyclesHolder sectionRecommendRecyclesHolder, RecommendCardBean recommendCardBean) {
        if (sectionRecommendRecyclesHolder == null || recommendCardBean == null) {
            LogUtil.e("SectionRecommendRecyclesAdapter", "recommendCardBean or holder is null");
            return;
        }
        LogUtil.a("SectionRecommendRecyclesAdapter", "recommendCardBean CardId is ", recommendCardBean.getCardId());
        if (recommendCardBean.getBackGround() != null) {
            sectionRecommendRecyclesHolder.f7421a.setImageBitmap(recommendCardBean.getBackGround());
        }
    }

    private void c(SectionRecommendRecyclesHolder sectionRecommendRecyclesHolder, final int i, final RecommendCardBean recommendCardBean) {
        if (recommendCardBean == null || sectionRecommendRecyclesHolder == null) {
            LogUtil.e("SectionRecommendRecyclesAdapter", "recommendCardBean is null");
        } else {
            qsp.b(sectionRecommendRecyclesHolder.d, new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionRecommendRecyclesAdapter.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (recommendCardBean.getClickSectionListener() != null) {
                        recommendCardBean.getClickSectionListener().onClick(i);
                    }
                }
            });
            qsp.b(sectionRecommendRecyclesHolder.itemView, new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.SectionRecommendRecyclesAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (recommendCardBean.getClickSectionListener() != null) {
                        recommendCardBean.getClickSectionListener().onClick(i);
                    }
                }
            });
        }
    }

    private void b(SectionRecommendRecyclesHolder sectionRecommendRecyclesHolder, RecommendCardBean recommendCardBean) {
        if (sectionRecommendRecyclesHolder.itemView == null) {
            return;
        }
        LogUtil.a("SectionRecommendRecyclesAdapter", "bindViewTreeObserver");
        sectionRecommendRecyclesHolder.e = recommendCardBean;
        ViewTreeVisibilityListener.c(sectionRecommendRecyclesHolder.itemView, new ViewTreeVisibilityListener(sectionRecommendRecyclesHolder.itemView, sectionRecommendRecyclesHolder), 200L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f7414b)) {
            return 0;
        }
        return this.f7414b.size();
    }

    public class SectionRecommendRecyclesHolder extends RecyclerView.ViewHolder implements ViewTreeVisibilityListener.ViewTreeListenee {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f7421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthCardView f7422b;
        private HealthButton d;
        private RecommendCardBean e;
        private HealthTextView g;
        private HealthTextView h;
        private HealthTextView i;

        public SectionRecommendRecyclesHolder(View view) {
            super(view);
            this.f7422b = (HealthCardView) view.findViewById(R.id.section_recommend_card_view);
            this.f7421a = (ImageView) view.findViewById(R.id.recommend_card_background);
            this.h = (HealthTextView) view.findViewById(R.id.card_title);
            this.g = (HealthTextView) view.findViewById(R.id.card_subtitle);
            this.i = (HealthTextView) view.findViewById(R.id.card_subtitle_data_part);
            this.d = (HealthButton) view.findViewById(R.id.start_button);
        }

        @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
        public void checkVisibilityAndSetBiEvent() {
            RecommendCardBean recommendCardBean;
            if (!ViewTreeVisibilityListener.c(this.itemView) || !fxk.c(this.itemView) || hasSetBiEvent() || (recommendCardBean = this.e) == null) {
                return;
            }
            LogUtil.a("SectionRecommendRecyclesAdapter", "visible to user: ", recommendCardBean.getCardId());
            biEvent();
            SectionRecommendRecyclesAdapter.this.d.add(this.e.getCardId());
        }

        @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
        public boolean hasSetBiEvent() {
            return this.e != null && SectionRecommendRecyclesAdapter.this.d.contains(this.e.getCardId());
        }

        @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
        public void biEvent() {
            if (this.e == null) {
                return;
            }
            fcn.b(BaseApplication.b(), 0, this.e);
        }
    }
}
