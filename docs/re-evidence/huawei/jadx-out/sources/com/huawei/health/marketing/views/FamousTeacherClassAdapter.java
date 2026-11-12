package com.huawei.health.marketing.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.FamousTeacherSeriesRecTemplate;
import com.huawei.health.marketing.datatype.templates.SingleFamousTeacherContent;
import com.huawei.health.marketing.datatype.templates.SingleFamousTeacherStandardContent;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fxk;
import defpackage.fya;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes29.dex */
public class FamousTeacherClassAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResourceBriefInfo f8324c;
    private long d;
    private Set<SingleFamousTeacherContent> e = new HashSet();
    private List<SingleFamousTeacherContent> g;
    private FamousTeacherSeriesRecTemplate h;
    private SingleFamousTeacherStandardContent i;

    public FamousTeacherClassAdapter(Context context, int i, ResourceBriefInfo resourceBriefInfo, List<SingleFamousTeacherContent> list, FamousTeacherSeriesRecTemplate famousTeacherSeriesRecTemplate) {
        this.g = new ArrayList();
        this.f8323b = 0;
        this.f8322a = context;
        this.g = list;
        this.f8324c = resourceBriefInfo;
        this.f8323b = i;
        this.h = famousTeacherSeriesRecTemplate;
    }

    public void a(SingleFamousTeacherStandardContent singleFamousTeacherStandardContent) {
        this.i = singleFamousTeacherStandardContent;
        this.g = singleFamousTeacherStandardContent.getSubContents();
        this.d = System.currentTimeMillis();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f8322a).inflate(R.layout.item_famous_teacher_class, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (njy.e(this.g, i)) {
            LogUtil.j("FamousTeacherClassAdapter", "mSingleArticleContent isOutOfBounds");
            return;
        }
        SingleFamousTeacherContent singleFamousTeacherContent = this.g.get(i);
        LogUtil.a("FamousTeacherClassAdapter", "singleFamousTeacherContent:", singleFamousTeacherContent.toString());
        qqf.c(singleFamousTeacherContent.getPicture(), viewHolder.f8327a, (int) BaseApplication.b().getResources().getDimension(com.huawei.ui.commonui.R.dimen.defaultCornerRadiusM));
        fya.e(viewHolder.e, singleFamousTeacherContent.getTheme(), singleFamousTeacherContent.isThemeVisibility());
        fya.e(viewHolder.f8329c, singleFamousTeacherContent.getDescription(), singleFamousTeacherContent.isDescriptionVisibility());
        viewHolder.f8328b.setOnClickListener(new AnonymousClass1(singleFamousTeacherContent, i));
        qsp.a(viewHolder.f8328b, new d(this, viewHolder.f8328b, singleFamousTeacherContent, i));
    }

    /* JADX INFO: renamed from: com.huawei.health.marketing.views.FamousTeacherClassAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8326c;
        final /* synthetic */ SingleFamousTeacherContent d;

        AnonymousClass1(SingleFamousTeacherContent singleFamousTeacherContent, int i) {
            this.d = singleFamousTeacherContent;
            this.f8326c = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qrs.e(view) || TextUtils.isEmpty(this.d.getLinkValue())) {
                LogUtil.j("FamousTeacherClassAdapter", "click too fast or url is empty");
                return;
            }
            final String linkValue = this.d.getLinkValue();
            if (!fxk.b(linkValue)) {
                FamousTeacherClassAdapter.this.a(linkValue, this.d, this.f8326c);
                return;
            }
            LoginInit loginInit = LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
            final SingleFamousTeacherContent singleFamousTeacherContent = this.d;
            final int i = this.f8326c;
            loginInit.browsingToLogin(new IBaseResponseCallback() { // from class: fzg
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.e.a(linkValue, singleFamousTeacherContent, i, i2, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }

        public /* synthetic */ void a(String str, SingleFamousTeacherContent singleFamousTeacherContent, int i, int i2, Object obj) {
            if (i2 == 0) {
                FamousTeacherClassAdapter.this.a(str, singleFamousTeacherContent, i);
            } else {
                LogUtil.j("FamousTeacherClassAdapter", "onClick errorCode = ", Integer.valueOf(i2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, SingleFamousTeacherContent singleFamousTeacherContent, int i) {
        LogUtil.a("FamousTeacherClassAdapter", "more linkValue: ", str);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            String strB = b(str, this.f8324c.getResourceName() + " " + this.i.getTheme(), this.f8324c.getResourceId(), i + 1, this.f8323b);
            LogUtil.a("FamousTeacherClassAdapter", "jumping to detail page, url: ", strB);
            marketRouterApi.router(strB);
        }
        c(2, singleFamousTeacherContent, i);
    }

    private String b(String str, String str2, String str3, int i, int i2) {
        return str + "&resourceName=" + str2 + "&resourceId=" + str3 + "&pullOrder=" + i + "&pullfrom=" + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.g.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, SingleFamousTeacherContent singleFamousTeacherContent, int i2) {
        String str = this.f8324c.getResourceName() + " " + this.i.getTheme();
        HashMap map = new HashMap(10);
        map.put("resourceName", str);
        map.put("event", Integer.valueOf(i));
        map.put("itemCardName", singleFamousTeacherContent.getTheme());
        if (i == 2) {
            map.put("durationTime", Integer.valueOf((int) (System.currentTimeMillis() - this.d)));
            this.d = System.currentTimeMillis();
        }
        map.put("pullOrder", Integer.valueOf(i2 + 1));
        if (!TextUtils.isEmpty(singleFamousTeacherContent.getDynamicDataId())) {
            map.put("itemId", singleFamousTeacherContent.getDynamicDataId());
        }
        FamousTeacherSeriesRecTemplate famousTeacherSeriesRecTemplate = this.h;
        if (famousTeacherSeriesRecTemplate != null) {
            map.put("moreEntryName", famousTeacherSeriesRecTemplate.getMoreMenuTitle());
        }
        LogUtil.a("FamousTeacherClassAdapter", "marketing biEvent: mPositionId: ", Integer.valueOf(this.f8323b), ", biMap: ", map.toString());
        MarketingBiUtils.a(i, this.f8323b, this.f8324c, map);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthImageView f8327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinearLayout f8328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f8329c;
        private HealthTextView e;

        ViewHolder(View view) {
            super(view);
            this.f8327a = (HealthImageView) view.findViewById(R.id.class_picture);
            this.e = (HealthTextView) view.findViewById(R.id.tv_class_name);
            this.f8329c = (HealthTextView) view.findViewById(R.id.tv_class_describe);
            this.f8328b = (LinearLayout) view.findViewById(R.id.item_class_layout);
        }
    }

    static class d implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<FamousTeacherClassAdapter> f8330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<View> f8331c;
        private final int d;
        private final SingleFamousTeacherContent e;

        public d(FamousTeacherClassAdapter famousTeacherClassAdapter, View view, SingleFamousTeacherContent singleFamousTeacherContent, int i) {
            this.f8330b = new WeakReference<>(famousTeacherClassAdapter);
            this.f8331c = new WeakReference<>(view);
            this.e = singleFamousTeacherContent;
            this.d = i;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            FamousTeacherClassAdapter famousTeacherClassAdapter = this.f8330b.get();
            View view = this.f8331c.get();
            if (famousTeacherClassAdapter == null || view == null) {
                return;
            }
            if (famousTeacherClassAdapter.e.contains(this.e)) {
                qsp.c(view, this);
            } else if (MarketingBiUtils.c(view)) {
                famousTeacherClassAdapter.c(1, this.e, this.d);
                famousTeacherClassAdapter.e.add(this.e);
                qsp.c(view, this);
            }
        }
    }
}
