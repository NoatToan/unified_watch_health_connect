package com.huawei.health.marketing.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleCourseRecommendListContent;
import com.huawei.health.marketing.datatype.SingleCourseRecommendListStandardContent;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fxl;
import defpackage.fxm;
import defpackage.gat;
import defpackage.njy;
import defpackage.qji;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class CourseItemSidingAdapter extends RecyclerView.Adapter<CourseItemViewHolder> {
    private static final int d = BaseApplication.getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<SingleCourseRecommendListContent> f8294b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fxm f8295c;
    private Context e;
    private int f;
    private SingleCourseRecommendListStandardContent g;
    private String h;
    private String i;
    private ResourceBriefInfo j;

    public CourseItemSidingAdapter(Context context, SingleCourseRecommendListStandardContent singleCourseRecommendListStandardContent, int i, fxm fxmVar, ResourceBriefInfo resourceBriefInfo) {
        this.e = context;
        this.f = i;
        if (resourceBriefInfo != null) {
            this.h = resourceBriefInfo.getResourceId();
        }
        this.j = resourceBriefInfo;
        this.f8295c = fxmVar;
        if (singleCourseRecommendListStandardContent == null) {
            return;
        }
        this.g = singleCourseRecommendListStandardContent;
        this.i = singleCourseRecommendListStandardContent.getTheme();
        this.f8294b.clear();
        List<SingleCourseRecommendListContent> subContents = singleCourseRecommendListStandardContent.getSubContents();
        if (njy.e(subContents)) {
            LogUtil.e("CourseItemSidingAdapter", "subContents is null");
        } else {
            this.f8294b.addAll(subContents);
        }
    }

    public void c(boolean z) {
        this.f8293a = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public CourseItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new CourseItemViewHolder(LayoutInflater.from(this.e).inflate(R.layout.course_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(CourseItemViewHolder courseItemViewHolder, int i) {
        if (njy.e(this.f8294b, i)) {
            LogUtil.e("CourseItemSidingAdapter", "position error");
            return;
        }
        SingleCourseRecommendListContent singleCourseRecommendListContent = this.f8294b.get(i);
        qsp.b(courseItemViewHolder.j, qji.d(new b(this, singleCourseRecommendListContent, i, this.h), this.e, true, ""));
        ViewGroup.LayoutParams layoutParams = courseItemViewHolder.f8296a.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = courseItemViewHolder.i.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams2 : null;
        if (this.f8293a) {
            layoutParams.width = qre.b(R.dimen.health_common_100dp);
            if (layoutParams3 != null) {
                layoutParams3.setMarginStart(qre.b(R.dimen.health_common_125dp));
            }
            if (qrs.af(this.e) && (i == getItemCount() - 1 || i == getItemCount() - 2)) {
                qsp.c((View) courseItemViewHolder.i, 8);
            }
        } else {
            layoutParams.width = qre.b(R.dimen.health_common_56dp);
            if (layoutParams3 != null) {
                layoutParams3.setMarginStart(qre.b(R.dimen.health_common_80dp));
            }
        }
        if (i == getItemCount() - 1) {
            qsp.c((View) courseItemViewHolder.i, 8);
        }
        layoutParams.height = qre.b(R.dimen.health_common_56dp);
        courseItemViewHolder.f8296a.setLayoutParams(layoutParams);
        String picture = singleCourseRecommendListContent.getPicture();
        if (!TextUtils.isEmpty(picture)) {
            qqf.e(courseItemViewHolder.f8296a, picture, d, 0, R.drawable.section_blank_1008);
        } else {
            qqf.a(R.drawable.section_blank_1008, courseItemViewHolder.f8296a, d);
        }
        qsp.b(courseItemViewHolder.f8298c, singleCourseRecommendListContent.getTheme());
        qsp.b(courseItemViewHolder.e, singleCourseRecommendListContent.getSubTheme());
        if (!TextUtils.isEmpty(singleCourseRecommendListContent.getLabel())) {
            courseItemViewHolder.f8297b.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.sleep_pressure_membership_color));
            courseItemViewHolder.f8297b.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.sleep_course_membership_tag_background));
            int iD = qrs.d(BaseApplication.getContext(), 4.0f);
            int iD2 = qrs.d(BaseApplication.getContext(), 1.0f);
            courseItemViewHolder.f8297b.setPadding(iD, iD2, iD, iD2);
            courseItemViewHolder.f8297b.setText(singleCourseRecommendListContent.getLabel());
            courseItemViewHolder.f8297b.setVisibility(0);
        } else {
            courseItemViewHolder.f8297b.setVisibility(8);
        }
        if (e(singleCourseRecommendListContent)) {
            e(courseItemViewHolder, singleCourseRecommendListContent, i);
            d(courseItemViewHolder, false);
        } else {
            courseItemViewHolder.h.setVisibility(8);
        }
        c(courseItemViewHolder.itemView, this.g, singleCourseRecommendListContent, i);
    }

    private void c(View view, SingleCourseRecommendListStandardContent singleCourseRecommendListStandardContent, SingleCourseRecommendListContent singleCourseRecommendListContent, int i) {
        if (view == null || this.f8295c.e(singleCourseRecommendListStandardContent.getTheme(), singleCourseRecommendListContent.getItemId(), view)) {
            return;
        }
        qsp.a(view, (ViewTreeObserver.OnGlobalLayoutListener) new e(this, view, singleCourseRecommendListStandardContent, singleCourseRecommendListContent, i));
        qsp.a(view, (ViewTreeObserver.OnScrollChangedListener) new e(this, view, singleCourseRecommendListStandardContent, singleCourseRecommendListContent, i));
    }

    private void e(CourseItemViewHolder courseItemViewHolder, SingleCourseRecommendListContent singleCourseRecommendListContent, int i) {
        courseItemViewHolder.h.setVisibility(0);
        SingleGridContent singleGridContent = new SingleGridContent(new SingleGridContent.Builder().setDynamicDataId(singleCourseRecommendListContent.getAuditionLink() + i));
        singleGridContent.setVip(1);
        singleGridContent.setAuditionLink(singleCourseRecommendListContent.getAuditionLink());
        singleGridContent.setAuditionDetailUrl(singleCourseRecommendListContent.getPicture());
        singleGridContent.setTheme(singleCourseRecommendListContent.getTheme());
        HashMap map = new HashMap(16);
        map.put(WebViewHelp.BI_KEY_PULL_FROM, String.valueOf(this.f));
        map.put("resourceId", this.h);
        map.put("resourceName", singleCourseRecommendListContent.getTheme());
        map.put("pullOrder", String.valueOf(i + 1));
        gat.b(courseItemViewHolder.itemView, courseItemViewHolder.h, singleGridContent, map);
    }

    private void d(CourseItemViewHolder courseItemViewHolder, boolean z) {
        if (courseItemViewHolder == null || courseItemViewHolder.h == null) {
            return;
        }
        if (z) {
            courseItemViewHolder.h.setImageDrawable(this.e.getResources().getDrawable(R.drawable.hiad_linked_video_pause));
        } else {
            courseItemViewHolder.h.setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_player_playback));
        }
    }

    private boolean e(SingleCourseRecommendListContent singleCourseRecommendListContent) {
        return singleCourseRecommendListContent.isAuditionFlag() && !TextUtils.isEmpty(singleCourseRecommendListContent.getAuditionLink());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8294b.size();
    }

    static class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<CourseItemSidingAdapter> f8299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f8301c;
        private SingleCourseRecommendListContent d;

        public b(CourseItemSidingAdapter courseItemSidingAdapter, SingleCourseRecommendListContent singleCourseRecommendListContent, int i, String str) {
            this.f8299a = new WeakReference<>(courseItemSidingAdapter);
            this.d = singleCourseRecommendListContent;
            this.f8300b = i;
            this.f8301c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CourseItemSidingAdapter courseItemSidingAdapter = this.f8299a.get();
            if (courseItemSidingAdapter == null) {
                return;
            }
            SingleCourseRecommendListContent singleCourseRecommendListContent = this.d;
            if (singleCourseRecommendListContent == null || TextUtils.isEmpty(singleCourseRecommendListContent.getLinkValue()) || qrs.r()) {
                LogUtil.j("CourseItemSidingAdapter", "linkValue is empty ");
                return;
            }
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class);
            String strD = fxl.d(this.d.getLinkValue(), courseItemSidingAdapter.j.getCategory());
            LogUtil.a("CourseItemSidingAdapter", "addShopInfoUrl: ", strD);
            marketRouterApi.router(fxl.c(strD, courseItemSidingAdapter.f, this.f8300b + 1, this.d, courseItemSidingAdapter.j));
            courseItemSidingAdapter.f8295c.d(2, courseItemSidingAdapter.g, this.d, this.f8300b);
        }
    }

    public static class CourseItemViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthImageView f8296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f8297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f8298c;
        private LinearLayout d;
        private HealthTextView e;
        private ImageView h;
        private HealthDivider i;
        private ConstraintLayout j;

        public CourseItemViewHolder(View view) {
            super(view);
            this.j = (ConstraintLayout) view.findViewById(R.id.inner_recyclerview_item);
            this.f8296a = (HealthImageView) view.findViewById(R.id.section_inner_image);
            this.f8298c = (HealthTextView) view.findViewById(R.id.section_inner_title);
            this.f8297b = (HealthTextView) view.findViewById(R.id.section_item_left_text);
            this.h = (ImageView) view.findViewById(R.id.section_play_image);
            this.e = (HealthTextView) view.findViewById(R.id.section_item_right_text);
            this.i = (HealthDivider) view.findViewById(R.id.recyclerview_divider);
            this.d = (LinearLayout) view.findViewById(R.id.section1_1card_inner_item_ll);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<View> f8302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SingleCourseRecommendListContent f8304c;
        private final WeakReference<CourseItemSidingAdapter> d;
        private final SingleCourseRecommendListStandardContent e;

        public e(CourseItemSidingAdapter courseItemSidingAdapter, View view, SingleCourseRecommendListStandardContent singleCourseRecommendListStandardContent, SingleCourseRecommendListContent singleCourseRecommendListContent, int i) {
            this.d = new WeakReference<>(courseItemSidingAdapter);
            this.f8302a = new WeakReference<>(view);
            this.e = singleCourseRecommendListStandardContent;
            this.f8304c = singleCourseRecommendListContent;
            this.f8303b = i;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            CourseItemSidingAdapter courseItemSidingAdapter = this.d.get();
            View view = this.f8302a.get();
            if (view == null || courseItemSidingAdapter == null) {
                return;
            }
            if (!courseItemSidingAdapter.f8295c.e(this.e.getTheme(), this.f8304c.getTheme(), view)) {
                courseItemSidingAdapter.f8295c.b(view, this.e, this.f8304c, this.f8303b);
            } else {
                qsp.b(view, this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            CourseItemSidingAdapter courseItemSidingAdapter = this.d.get();
            View view = this.f8302a.get();
            if (view == null || courseItemSidingAdapter == null) {
                return;
            }
            if (!courseItemSidingAdapter.f8295c.e(this.e.getTheme(), this.f8304c.getTheme(), view)) {
                courseItemSidingAdapter.f8295c.b(view, this.e, this.f8304c, this.f8303b);
            } else {
                qsp.c(view, this);
            }
        }
    }
}
