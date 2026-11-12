package com.huawei.health.marketing.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.SingleArticleContent;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class SingleArticleAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<SingleArticleContent> f8403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResourceBriefInfo f8405c;
    private int d;
    private long e;

    public SingleArticleAdapter(Context context, List<SingleArticleContent> list, int i, ResourceBriefInfo resourceBriefInfo) {
        new ArrayList();
        this.f8404b = context;
        this.f8403a = list;
        this.d = i;
        this.f8405c = resourceBriefInfo;
    }

    public void b(List<SingleArticleContent> list) {
        this.f8403a = list;
        LogUtil.a("SingleArticleAdapter", "mSingleArticleContent size:", Integer.valueOf(list.size()));
        this.e = System.currentTimeMillis();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f8404b).inflate(R.layout.item_single_article, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        if (njy.e(this.f8403a, i)) {
            LogUtil.j("SingleArticleAdapter", "mSingleArticleContent isOutOfBounds");
            return;
        }
        final SingleArticleContent singleArticleContent = this.f8403a.get(i);
        b(viewHolder, singleArticleContent);
        viewHolder.f8409c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.marketing.views.SingleArticleAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.e(view) && !TextUtils.isEmpty(singleArticleContent.getLinkValue())) {
                    SingleArticleAdapter.this.a(singleArticleContent.getLinkValue());
                    SingleArticleAdapter.this.d(2, singleArticleContent, i);
                } else {
                    LogUtil.j("SingleArticleAdapter", "click too fast or url is empty");
                }
            }
        });
        d(1, singleArticleContent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        LogUtil.a("SingleArticleAdapter", "goToDetail linkValue: ", str);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(str);
        }
    }

    private void b(ViewHolder viewHolder, SingleArticleContent singleArticleContent) {
        qqf.a(singleArticleContent.getPicture(), viewHolder.f8408b, (int) BaseApplication.b().getResources().getDimension(com.huawei.ui.commonui.R.dimen.defaultCornerRadiusM));
        viewHolder.d.setText(singleArticleContent.getDescription());
        viewHolder.e.setText(singleArticleContent.getTheme());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8403a.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, SingleArticleContent singleArticleContent, int i2) {
        HashMap map = new HashMap(10);
        map.put("resourcePositionId", Integer.valueOf(this.d));
        map.put("resourceId", this.f8405c.getResourceId());
        map.put("resourceName", this.f8405c.getResourceName());
        map.put("event", Integer.valueOf(i));
        map.put("itemCardName", singleArticleContent.getTheme());
        map.put("smartRecommend", Boolean.valueOf(this.f8405c.getSmartRecommend()));
        map.put("algId", "");
        if (i == 2) {
            map.put("durationTime", Integer.valueOf((int) (System.currentTimeMillis() - this.e)));
            this.e = System.currentTimeMillis();
        }
        map.put("pullOrder", Integer.valueOf(i2 + 1));
        int i3 = this.d;
        LogUtil.a("SingleArticleAdapter", "marketing biEvent: mPositionId: ", Integer.valueOf(i3), ", biMap: ", map.toString());
        lmf.d().c(this.f8404b, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f8408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LinearLayout f8409c;
        private HealthTextView d;
        private HealthTextView e;

        ViewHolder(View view) {
            super(view);
            this.e = (HealthTextView) view.findViewById(R.id.item_title_text);
            this.d = (HealthTextView) view.findViewById(R.id.item_describe_text);
            this.f8408b = (ImageView) view.findViewById(R.id.item_article_image);
            this.f8409c = (LinearLayout) view.findViewById(R.id.item_article_layout);
        }
    }
}
