package com.huawei.health.marketing.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.CourseNoticeStandardTemplate;
import com.huawei.health.marketing.datatype.templates.SingleCourseNoticeContent;
import com.huawei.health.marketing.datatype.templates.SingleCourseNoticeStandardContent;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.fya;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes29.dex */
public class CoursePreviewAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResourceBriefInfo f8307c;
    private List<SingleCourseNoticeStandardContent> e;
    private int f;
    private CourseNoticeStandardTemplate g;
    private long h;
    private Set<SingleCourseNoticeContent> d = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<SingleCourseNoticeContent> f8305a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8306b = BaseApplication.b();

    public CoursePreviewAdapter(CourseNoticeStandardTemplate courseNoticeStandardTemplate, int i, ResourceBriefInfo resourceBriefInfo) {
        this.f = 0;
        this.g = courseNoticeStandardTemplate;
        this.e = courseNoticeStandardTemplate.getGridContents();
        this.f8307c = resourceBriefInfo;
        this.f = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f8306b).inflate(R.layout.item_course_preview_time, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (njy.e(this.e, i)) {
            LogUtil.j("CoursePreviewAdapter", "mCourseContents isOutOfBounds");
            return;
        }
        SingleCourseNoticeStandardContent singleCourseNoticeStandardContent = this.e.get(i);
        viewHolder.f8308a.setText(singleCourseNoticeStandardContent.getTheme());
        e(viewHolder, singleCourseNoticeStandardContent, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.e)) {
            return 0;
        }
        return this.e.size();
    }

    private void e(ViewHolder viewHolder, SingleCourseNoticeStandardContent singleCourseNoticeStandardContent, int i) {
        if (singleCourseNoticeStandardContent == null) {
            LogUtil.j("CoursePreviewAdapter", "addCourseItem courseContent is null");
            return;
        }
        List<SingleCourseNoticeContent> subContents = singleCourseNoticeStandardContent.getSubContents();
        if (njy.e(subContents)) {
            LogUtil.j("CoursePreviewAdapter", "addCourseItem contentItemLists is empty");
            return;
        }
        LogUtil.a("CoursePreviewAdapter", "addCourseItem contentItemLists size = ", Integer.valueOf(subContents.size()));
        int i2 = 0;
        while (i2 < subContents.size()) {
            SingleCourseNoticeContent singleCourseNoticeContent = subContents.get(i2);
            if (singleCourseNoticeContent == null) {
                LogUtil.j("CoursePreviewAdapter", "addCourseItem courseNoticeContent is null");
            } else if (this.f8305a.contains(singleCourseNoticeContent)) {
                LogUtil.j("CoursePreviewAdapter", "addCourseItem courseNoticeContent is added");
            } else {
                this.f8305a.add(singleCourseNoticeContent);
                viewHolder.e.addView(d(singleCourseNoticeContent, i2, i == this.e.size() - 1 && i2 == subContents.size() - 1, singleCourseNoticeStandardContent.getTheme()));
            }
            i2++;
        }
    }

    private View d(final SingleCourseNoticeContent singleCourseNoticeContent, final int i, boolean z, final String str) {
        final View viewInflate = LayoutInflater.from(this.f8306b).inflate(R.layout.item_course_preview_course, (ViewGroup) null);
        HealthCardView healthCardView = (HealthCardView) viewInflate.findViewById(R.id.course_preview_layout);
        HealthImageView healthImageView = (HealthImageView) viewInflate.findViewById(R.id.course_preview_img);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.course_preview_corner);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.course_preview_theme);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.course_preview_sub_theme);
        qqf.b(singleCourseNoticeContent.getPicture(), healthImageView);
        if (singleCourseNoticeContent.isThemeVisibility() && !TextUtils.isEmpty(singleCourseNoticeContent.getTheme())) {
            healthTextView2.setText(singleCourseNoticeContent.getTheme());
            healthTextView2.setVisibility(0);
        } else {
            healthTextView2.setVisibility(8);
        }
        healthTextView3.setText(singleCourseNoticeContent.getSubTheme());
        a(healthTextView, singleCourseNoticeContent);
        ViewGroup.LayoutParams layoutParams = healthCardView.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (!z) {
                layoutParams2.setMarginEnd(BaseApplication.b().getResources().getDimensionPixelOffset(R.dimen.health_common_12dp));
            }
        }
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: fyz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34771a.a(viewInflate, singleCourseNoticeContent, i, str, view);
            }
        });
        qsp.a(viewInflate, new b(this, viewInflate, singleCourseNoticeContent, i, str));
        return viewInflate;
    }

    public /* synthetic */ void a(View view, SingleCourseNoticeContent singleCourseNoticeContent, int i, String str, View view2) {
        if (qrs.e(view) || TextUtils.isEmpty(singleCourseNoticeContent.getLinkValue())) {
            LogUtil.j("CoursePreviewAdapter", "click too fast or url is empty");
        } else {
            a(singleCourseNoticeContent, i, str);
        }
    }

    public static void a(HealthTextView healthTextView, SingleCourseNoticeContent singleCourseNoticeContent) {
        if (singleCourseNoticeContent == null) {
            LogUtil.j("CoursePreviewAdapter", "content = null");
            return;
        }
        if (!b(healthTextView, singleCourseNoticeContent)) {
            LogUtil.j("CoursePreviewAdapter", "setCornerShow can not show");
            return;
        }
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fya.a(12.0f), fya.a(12.0f)});
            gradientDrawable.setColor(Color.parseColor(singleCourseNoticeContent.getCornerColor()));
            healthTextView.setBackground(gradientDrawable);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("CoursePreviewAdapter", "IllegalArgumentException");
        }
        healthTextView.setGravity(17);
        healthTextView.setText(singleCourseNoticeContent.getCorner());
        healthTextView.setVisibility(0);
    }

    private static boolean b(HealthTextView healthTextView, SingleCourseNoticeContent singleCourseNoticeContent) {
        if (healthTextView == null) {
            LogUtil.j("CoursePreviewAdapter", "textView is null");
            return false;
        }
        if (singleCourseNoticeContent.getCornerVisibility() && !TextUtils.isEmpty(singleCourseNoticeContent.getCorner()) && !TextUtils.isEmpty(singleCourseNoticeContent.getCornerColor())) {
            return true;
        }
        healthTextView.setVisibility(8);
        return false;
    }

    private void a(final SingleCourseNoticeContent singleCourseNoticeContent, final int i, final String str) {
        if (!fxk.b(singleCourseNoticeContent.getLinkValue())) {
            b(singleCourseNoticeContent, i, str);
        } else {
            LoginInit.getInstance(BaseApplication.b()).browsingToLogin(new IBaseResponseCallback() { // from class: fza
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f34775c.c(singleCourseNoticeContent, i, str, i2, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    public /* synthetic */ void c(SingleCourseNoticeContent singleCourseNoticeContent, int i, String str, int i2, Object obj) {
        if (i2 == 0) {
            b(singleCourseNoticeContent, i, str);
        } else {
            LogUtil.j("CoursePreviewAdapter", "onClick errorCode = ", Integer.valueOf(i2));
        }
    }

    private void b(SingleCourseNoticeContent singleCourseNoticeContent, int i, String str) {
        String linkValue = singleCourseNoticeContent.getLinkValue();
        LogUtil.a("CoursePreviewAdapter", "goToDetail linkValue:", linkValue);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(fxl.d(linkValue, this.f8307c, this.f, 1));
        }
        b(2, singleCourseNoticeContent, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, SingleCourseNoticeContent singleCourseNoticeContent, int i2, String str) {
        String str2 = this.g.getName() + " " + str;
        HashMap map = new HashMap(10);
        map.put("resourceName", str2);
        map.put("event", Integer.valueOf(i));
        map.put("itemCardName", singleCourseNoticeContent.getTheme());
        if (i == 2) {
            map.put("durationTime", Integer.valueOf((int) (System.currentTimeMillis() - this.h)));
            this.h = System.currentTimeMillis();
        }
        map.put("pullOrder", Integer.valueOf(i2 + 1));
        map.put("moreEntryName", this.g.getMoreMenuTitle());
        LogUtil.a("CoursePreviewAdapter", "marketing biEvent: mPositionId: ", Integer.valueOf(this.f), ", biMap: ", map.toString());
        MarketingBiUtils.a(i, this.f, this.f8307c, map);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TextView f8308a;
        private LinearLayout e;

        ViewHolder(View view) {
            super(view);
            this.f8308a = (TextView) view.findViewById(R.id.course_preview_time_title);
            this.e = (LinearLayout) view.findViewById(R.id.course_preview_container);
        }
    }

    static class b implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<CoursePreviewAdapter> f8310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SingleCourseNoticeContent f8311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f8312c;
        private final WeakReference<View> d;
        private final String e;

        public b(CoursePreviewAdapter coursePreviewAdapter, View view, SingleCourseNoticeContent singleCourseNoticeContent, int i, String str) {
            this.f8310a = new WeakReference<>(coursePreviewAdapter);
            this.d = new WeakReference<>(view);
            this.f8311b = singleCourseNoticeContent;
            this.f8312c = i;
            this.e = str;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            CoursePreviewAdapter coursePreviewAdapter = this.f8310a.get();
            View view = this.d.get();
            if (coursePreviewAdapter == null || view == null || coursePreviewAdapter.d.contains(this.f8311b)) {
                qsp.c(view, this);
            } else if (MarketingBiUtils.c(view)) {
                coursePreviewAdapter.b(1, this.f8311b, this.f8312c, this.e);
                coursePreviewAdapter.h = System.currentTimeMillis();
                coursePreviewAdapter.d.add(this.f8311b);
                qsp.c(view, this);
            }
        }
    }
}
