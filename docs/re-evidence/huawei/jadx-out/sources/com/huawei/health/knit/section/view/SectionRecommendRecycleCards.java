package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.health.knit.section.adapter.SectionRecommendRecyclesAdapter;
import com.huawei.health.marketing.datatype.RecommendCardBean;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.dkf;
import defpackage.njy;
import defpackage.qqw;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionRecommendRecycleCards extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f7892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSubHeader f7893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SectionRecommendRecyclesAdapter f7894c;
    private View d;
    private List<RecommendCardBean> e;

    public SectionRecommendRecycleCards(Context context) {
        super(context);
        this.e = Arrays.asList(new RecommendCardBean[3]);
    }

    public SectionRecommendRecycleCards(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = Arrays.asList(new RecommendCardBean[3]);
    }

    public SectionRecommendRecycleCards(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = Arrays.asList(new RecommendCardBean[3]);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionRecommendRecycleCards", "onCreateView");
        e(context);
        return this.d;
    }

    private void e(Context context) {
        if (this.d == null) {
            LogUtil.j("SectionRecommendRecycleCards", "initView mainView is null, start to inflate");
            this.d = LayoutInflater.from(context).inflate(R.layout.section_recycle_recommend_card_layout, (ViewGroup) this, false);
        }
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.d.findViewById(R.id.section_member_type_header);
        this.f7893b = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(context, R.color.common_transparent));
        this.f7893b.setHeadTitleText(getResources().getString(R.string.IDS_vip_exclusive_plan));
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.d.findViewById(R.id.section_recommended_cards_recyclerview);
        this.f7892a = healthRecycleView;
        dkf.d(healthRecycleView);
        this.f7892a.b(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 1);
        gridLayoutManager.setOrientation(0);
        gridLayoutManager.setReverseLayout(LanguageUtil.ba(BaseApplication.getContext()));
        this.f7892a.setLayoutManager(gridLayoutManager);
        SectionRecommendRecyclesAdapter sectionRecommendRecyclesAdapter = new SectionRecommendRecyclesAdapter(context);
        this.f7894c = sectionRecommendRecyclesAdapter;
        this.f7892a.setAdapter(sectionRecommendRecyclesAdapter);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionRecommendRecycleCards";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionRecommendRecycleCards", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionRecommendRecycleCards", "no need to bind");
            return;
        }
        Hashtable<Integer, RecommendCardBean> hashtable = new Hashtable<>((Map<? extends Integer, ? extends RecommendCardBean>) qqw.a(map, "TOP_CARD_BEAN", (Class<Hashtable>) Hashtable.class, new Hashtable()));
        List<RecommendCardBean> listD = d(hashtable);
        this.f7894c.d(d(hashtable));
        if (!listD.isEmpty()) {
            RecommendCardBean recommendCardBean = listD.get(0);
            if (!TextUtils.isEmpty(recommendCardBean.getSceneShowArticles())) {
                LogUtil.a("SectionRecommendRecycleCards", "first one is ", recommendCardBean.getCardId(), "SceneShowArticles is", recommendCardBean.getSceneShowArticles());
                this.f7893b.setHeadTitleText(recommendCardBean.getSceneShowArticles());
                return;
            } else {
                ReleaseLogUtil.c("R_" + getTag(), "Articles null");
                this.f7893b.setHeadTitleText(getResources().getString(R.string.IDS_vip_exclusive_plan));
                return;
            }
        }
        this.f7893b.setHeadTitleText(getResources().getString(R.string.IDS_vip_exclusive_plan));
    }

    private List<RecommendCardBean> d(Hashtable<Integer, RecommendCardBean> hashtable) {
        if (hashtable.size() == 0) {
            LogUtil.a("SectionRecommendRecycleCards", "getNotNullCardBeanList recommendCardBeanList size 0");
            return this.e;
        }
        for (Integer num : hashtable.keySet()) {
            int iIntValue = num.intValue();
            if (njy.c(this.e, iIntValue)) {
                this.e.set(iIntValue, hashtable.get(num));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (RecommendCardBean recommendCardBean : this.e) {
            if (recommendCardBean != null) {
                arrayList.add(recommendCardBean);
                LogUtil.a("SectionRecommendRecycleCards", "bean info ", recommendCardBean.getCardId());
            }
        }
        d(arrayList);
        return arrayList;
    }

    private void d(List<RecommendCardBean> list) {
        Collections.sort(list, new Comparator<RecommendCardBean>() { // from class: com.huawei.health.knit.section.view.SectionRecommendRecycleCards.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(RecommendCardBean recommendCardBean, RecommendCardBean recommendCardBean2) {
                for (int i = 0; i < 3; i++) {
                    if (!recommendCardBean.getLabelWeights().get(i).equals(recommendCardBean2.getLabelWeights().get(i))) {
                        return recommendCardBean2.getLabelWeights().get(i).intValue() - recommendCardBean.getLabelWeights().get(i).intValue();
                    }
                }
                LogUtil.a("SectionRecommendRecycleCards", "other things");
                return 0;
            }
        });
    }
}
