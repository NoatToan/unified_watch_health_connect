package com.huawei.health.marketing.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.datatype.ColumRecommendInfo;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleCourseRecommendListStandardContent;
import com.huawei.health.marketing.views.CourseSeriesSidingAdapter;
import com.huawei.health.marketing.views.holders.CourseSeriesViewHolder;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.fxk;
import defpackage.njy;
import defpackage.qji;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.util.LogUtil;
import java.util.Collection;

/* JADX INFO: loaded from: classes29.dex */
public class CourseSeriesSidingAdapter extends BaseSeriesSidingAdapter<SingleCourseRecommendListStandardContent> {
    public CourseSeriesSidingAdapter(Context context, int i, ResourceBriefInfo resourceBriefInfo, String str) {
        super(context, i, resourceBriefInfo, str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new CourseSeriesViewHolder(LayoutInflater.from(this.mContext).inflate(R.layout.course_series_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (njy.e((Collection<?>) this.mList, i)) {
            LogUtil.c(this.TAG, "position is error");
            return;
        }
        if (!(viewHolder instanceof CourseSeriesViewHolder)) {
            LogUtil.c(this.TAG, "holder error");
            return;
        }
        final CourseSeriesViewHolder courseSeriesViewHolder = (CourseSeriesViewHolder) viewHolder;
        final SingleCourseRecommendListStandardContent singleCourseRecommendListStandardContent = (SingleCourseRecommendListStandardContent) this.mList.get(i);
        qsp.b(courseSeriesViewHolder.h(), singleCourseRecommendListStandardContent.isThemeVisibility() ? singleCourseRecommendListStandardContent.getTheme() : "", true);
        courseSeriesViewHolder.h().setTextColor(this.mContext.getResources().getColor(getTitleColorId()));
        courseSeriesViewHolder.h().post(new Runnable() { // from class: fzc
            @Override // java.lang.Runnable
            public final void run() {
                CourseSeriesSidingAdapter.b(courseSeriesViewHolder, singleCourseRecommendListStandardContent);
            }
        });
        setBackground(singleCourseRecommendListStandardContent.getBackground(), singleCourseRecommendListStandardContent.getBackgroundColor(), singleCourseRecommendListStandardContent.getDarkBackground(), singleCourseRecommendListStandardContent.getDarkBackgroundColor(), courseSeriesViewHolder.a());
        setBackground(singleCourseRecommendListStandardContent.getListBackground(), singleCourseRecommendListStandardContent.getListBackgroundColor(), singleCourseRecommendListStandardContent.getDarkListBackground(), singleCourseRecommendListStandardContent.getDarkListBackgroundColor(), courseSeriesViewHolder.c());
        qsp.a(courseSeriesViewHolder.d(), singleCourseRecommendListStandardContent.getButtonDescription(), true);
        if (courseSeriesViewHolder.d() != null && courseSeriesViewHolder.d().getVisibility() == 8) {
            qsp.c(courseSeriesViewHolder.b(), 0);
        } else {
            qsp.c(courseSeriesViewHolder.b(), 8);
        }
        qsp.b(courseSeriesViewHolder.d(), qji.d(getViewClickListener(singleCourseRecommendListStandardContent.getButtonLink(), true, (ColumRecommendInfo) singleCourseRecommendListStandardContent), this.mContext, true, ""));
        qsp.b(courseSeriesViewHolder.e(), qji.d(getViewClickListener(singleCourseRecommendListStandardContent.getLink(), false, (ColumRecommendInfo) singleCourseRecommendListStandardContent), this.mContext, true, ""));
        e(singleCourseRecommendListStandardContent, courseSeriesViewHolder);
        setRecyclerViewItemLayout(viewHolder, i);
        setBiEventListener(this.mResourceBriefInfo.getResourceName(), singleCourseRecommendListStandardContent.getTheme(), singleCourseRecommendListStandardContent, i, viewHolder.itemView);
    }

    public static /* synthetic */ void b(CourseSeriesViewHolder courseSeriesViewHolder, SingleCourseRecommendListStandardContent singleCourseRecommendListStandardContent) {
        if (courseSeriesViewHolder.h().getLineCount() >= 2) {
            qsp.c((View) courseSeriesViewHolder.i(), 8);
        } else {
            qsp.b(courseSeriesViewHolder.i(), singleCourseRecommendListStandardContent.isSubThemeVisibility() ? singleCourseRecommendListStandardContent.getSubTheme() : "", true);
        }
    }

    private void e(SingleCourseRecommendListStandardContent singleCourseRecommendListStandardContent, CourseSeriesViewHolder courseSeriesViewHolder) {
        CourseItemSidingAdapter courseItemSidingAdapter = new CourseItemSidingAdapter(this.mContext, singleCourseRecommendListStandardContent, this.mPositionId, getMarketingBiUtil(), this.mResourceBriefInfo);
        HealthRecycleView healthRecycleViewF = courseSeriesViewHolder.f();
        if (healthRecycleViewF == null) {
            LogUtil.c(this.TAG, "recycle is null");
            return;
        }
        healthRecycleViewF.b(false);
        healthRecycleViewF.e(false);
        if (getItemCount() == 1 && qrs.af(this.mContext)) {
            healthRecycleViewF.setLayoutManager(new GridLayoutManager(this.mContext, 2));
        } else {
            healthRecycleViewF.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        }
        courseItemSidingAdapter.c(getItemCount() == 1);
        healthRecycleViewF.setAdapter(courseItemSidingAdapter);
    }

    @Override // com.huawei.health.marketing.views.BaseSeriesSidingAdapter
    protected int getItemWidth() {
        if (getItemCount() == 1) {
            return fxk.b(this.mContext);
        }
        return qre.b(R.dimen.health_common_268dp);
    }

    @Override // com.huawei.health.marketing.views.BaseSeriesSidingAdapter
    protected String getLogTag() {
        return "CourseSeriesSidingAdapter";
    }

    @Override // com.huawei.health.marketing.views.BaseSeriesSidingAdapter
    protected int getTitleColorId() {
        return R.color.series_siding_template_course_title;
    }
}
