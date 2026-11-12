package com.huawei.health.marketing.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.datatype.CrossedCardOneCardContent;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.views.holders.DietAnalysisSeriesViewHolder;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.njy;
import defpackage.qji;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.util.LogUtil;
import java.util.Collection;

/* JADX INFO: loaded from: classes29.dex */
public class DietAnalysisSeriesSidingAdapter extends BaseSeriesSidingAdapter<CrossedCardOneCardContent> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f8317c = BaseApplication.getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_16dp);
    private ResourceBriefInfo e;

    public DietAnalysisSeriesSidingAdapter(Context context, int i, String str, ResourceBriefInfo resourceBriefInfo) {
        super(context, i, resourceBriefInfo, str);
        this.e = resourceBriefInfo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DietAnalysisSeriesViewHolder(LayoutInflater.from(this.mContext).inflate(R.layout.diet_analysis_series_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (njy.e((Collection<?>) this.mList, i)) {
            LogUtil.c(this.TAG, "position is error");
            return;
        }
        if (!(viewHolder instanceof DietAnalysisSeriesViewHolder)) {
            LogUtil.c(this.TAG, "holder error");
            return;
        }
        DietAnalysisSeriesViewHolder dietAnalysisSeriesViewHolder = (DietAnalysisSeriesViewHolder) viewHolder;
        CrossedCardOneCardContent crossedCardOneCardContent = (CrossedCardOneCardContent) this.mList.get(i);
        qsp.b(dietAnalysisSeriesViewHolder.e(), crossedCardOneCardContent.isThemeVisibility() ? crossedCardOneCardContent.getTheme() : "", true);
        dietAnalysisSeriesViewHolder.e().setTextColor(this.mContext.getResources().getColor(getTitleColorId()));
        qsp.b(dietAnalysisSeriesViewHolder.a(), crossedCardOneCardContent.isSubThemeVisibility() ? crossedCardOneCardContent.getSubTheme() : "", true);
        setBackground(crossedCardOneCardContent.getBackgroundPicture(), crossedCardOneCardContent.getBackgroundColor(), crossedCardOneCardContent.getDarkBackgroundPicture(), crossedCardOneCardContent.getDarkBackgroundColor(), dietAnalysisSeriesViewHolder.c());
        String picture = crossedCardOneCardContent.getPicture();
        if (!TextUtils.isEmpty(picture)) {
            qqf.e(dietAnalysisSeriesViewHolder.d(), picture, f8317c, 0, R.drawable.section_blank_1008);
        } else {
            qqf.a(R.drawable.section_blank_1008, dietAnalysisSeriesViewHolder.d(), f8317c);
        }
        if (this.mContext instanceof BaseActivity) {
            qsp.b(dietAnalysisSeriesViewHolder.b(), qji.b(super.getViewClickListener(b(crossedCardOneCardContent.getLinkValue(), this.e.getResourceName(), this.e.getResourceId(), i + 1), crossedCardOneCardContent.getTheme(), i), (BaseActivity) this.mContext, true, ""));
        }
        setRecyclerViewItemLayout(viewHolder, i);
        setBiEventListener(crossedCardOneCardContent.getTheme(), "", null, 0, dietAnalysisSeriesViewHolder.d());
    }

    private String b(String str, String str2, String str3, int i) {
        return str + "&resourceName=" + str2 + "&resourceId=" + str3 + "&pullOrder=" + i;
    }

    @Override // com.huawei.health.marketing.views.BaseSeriesSidingAdapter
    protected int getItemWidth() {
        if (getItemCount() > 1) {
            return qre.b(R.dimen.health_common_268dp);
        }
        return -1;
    }

    @Override // com.huawei.health.marketing.views.BaseSeriesSidingAdapter
    protected String getLogTag() {
        return "DietAnalysisSeriesSidingAdapter";
    }

    @Override // com.huawei.health.marketing.views.BaseSeriesSidingAdapter
    protected int getTitleColorId() {
        return R.color.textColorPrimary;
    }
}
