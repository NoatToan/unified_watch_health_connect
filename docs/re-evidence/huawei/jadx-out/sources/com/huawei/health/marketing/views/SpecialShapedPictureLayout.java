package com.huawei.health.marketing.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes29.dex */
public class SpecialShapedPictureLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GridTemplate f8410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResourceBriefInfo f8411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8412c;
    private Context d;
    private HealthImageView e;

    public SpecialShapedPictureLayout(Context context) {
        super(context);
        this.f8412c = 0;
        this.d = BaseApplication.getContext();
    }

    public void d(int i, ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate) {
        LogUtil.a("SpecialShapedPictureLayout", "initData");
        if (!(baseTemplate instanceof GridTemplate)) {
            LogUtil.e("SpecialShapedPictureLayout", "template error");
            return;
        }
        this.f8411b = resourceBriefInfo;
        this.f8412c = i;
        this.f8410a = (GridTemplate) baseTemplate;
        LogUtil.a("SpecialShapedPictureLayout", "template:", baseTemplate.toString());
        if (njy.e(this.f8410a.getGridContents())) {
            LogUtil.j("SpecialShapedPictureLayout", "initData mTemplate is empty, GONE");
            setVisibility(8);
        } else {
            e();
        }
    }

    private void e() {
        this.e = (HealthImageView) LayoutInflater.from(this.d).inflate(R.layout.layout_special_shaped_picture, this).findViewById(R.id.background_image);
        final SingleGridContent singleGridContent = this.f8410a.getGridContents().get(0);
        if (singleGridContent == null) {
            LogUtil.j("SpecialShapedPictureLayout", "initView gridContent is empty, GONE");
            setVisibility(8);
        } else {
            qqf.b(singleGridContent.getPicture(), this.e);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: fzw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34800b.d(singleGridContent, view);
                }
            });
            qsp.a(this.e, new ViewTreeObserver.OnScrollChangedListener() { // from class: com.huawei.health.marketing.views.SpecialShapedPictureLayout.4
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    if (MarketingBiUtils.c(SpecialShapedPictureLayout.this.e)) {
                        MarketingBiUtils.a(1, SpecialShapedPictureLayout.this.f8412c, SpecialShapedPictureLayout.this.f8411b, null);
                        qsp.c(SpecialShapedPictureLayout.this.e, this);
                    }
                }
            });
        }
    }

    public /* synthetic */ void d(final SingleGridContent singleGridContent, View view) {
        if (TextUtils.isEmpty(singleGridContent.getLinkValue())) {
            LogUtil.j("SpecialShapedPictureLayout", "click linkValue is empty");
            return;
        }
        if (qrs.e(view)) {
            LogUtil.j("SpecialShapedPictureLayout", "click too fast");
        } else if (!fxk.b(singleGridContent.getLinkValue())) {
            a(singleGridContent.getLinkValue());
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: fzx
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.d.d(singleGridContent, i, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    public /* synthetic */ void d(SingleGridContent singleGridContent, int i, Object obj) {
        if (i == 0) {
            a(singleGridContent.getLinkValue());
        } else {
            LogUtil.j("SpecialShapedPictureLayout", "onClick errorCode = ", Integer.valueOf(i));
        }
    }

    private void a(String str) {
        MarketingBiUtils.a(2, this.f8412c, this.f8411b, null);
        ((MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class)).router(fxl.d(str, this.f8411b, this.f8412c, 1));
    }
}
