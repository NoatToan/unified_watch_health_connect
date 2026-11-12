package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.lsl;
import defpackage.qqw;
import defpackage.qsp;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionSleepBreatheBanner extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f7929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f7930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f7931c;
    private ImageView d;
    protected HealthTextView e;
    private HealthTextView i;
    private View j;

    @Override // com.huawei.health.knit.section.view.BaseSection
    public boolean isSupportShare() {
        return false;
    }

    public SectionSleepBreatheBanner(Context context) {
        this(context, null);
    }

    public SectionSleepBreatheBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionSleepBreatheBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        try {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.sleep_breathe_banner_layout, (ViewGroup) this, false);
            this.d = (ImageView) viewInflate.findViewById(R.id.icon);
            this.e = (HealthTextView) viewInflate.findViewById(R.id.title_text);
            this.f7931c = (HealthTextView) viewInflate.findViewById(R.id.primary_tip);
            this.j = viewInflate.findViewById(R.id.time_arrow_area);
            this.i = (HealthTextView) viewInflate.findViewById(R.id.time_text);
            this.f7929a = (LinearLayout) viewInflate.findViewById(R.id.card_line_chart_container);
            this.f7930b = (ImageView) viewInflate.findViewById(R.id.center_arrow);
            return viewInflate;
        } catch (NullPointerException e) {
            ReleaseLogUtil.a("SectionSleepBreatheBanner", "Exception msg = ", ExceptionUtils.c(e));
            return new View(context);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.j("SectionSleepBreatheBanner", "no need to bind");
            return;
        }
        if (this.f7929a == null) {
            LogUtil.j("SectionSleepBreatheBanner", "mChartContainer is null");
            return;
        }
        qsp.b(this.e, qqw.d((Map) map, "TITLE", ""));
        qsp.a(this.d, qqw.c(map, "LEFT_ICON_IMAGE", (Drawable) null));
        qsp.b(this.f7931c, qqw.d((Map) map, "SUBTITLE", ""));
        long jE = qqw.e((Map) map, "BAR_CHART_DATE_TEXT", 0L);
        LogUtil.a("SectionSleepBreatheBanner", "bindParamsToView dataTime:", Long.valueOf(jE));
        if (jE == 0) {
            qsp.c(this.f7931c, BaseApplication.b().getResources().getDimension(R.dimen.textSizeBody2), 0);
            qsp.c(this.j, 8);
            qsp.c((View) this.f7930b, 0);
            qsp.c((View) this.f7929a, 8);
        } else {
            qsp.c(this.f7931c, BaseApplication.b().getResources().getDimension(R.dimen.textSizeBody1), 0);
            qsp.c(this.j, 0);
            qsp.c((View) this.f7930b, 8);
            qsp.c((View) this.f7929a, 0);
            qsp.b(this.i, UnitUtil.a(new Date(c(jE)), 24));
            this.f7929a.removeAllViews();
            Object objB = qqw.b(map, "SECTION_CHART", null);
            if (objB instanceof View) {
                this.f7929a.addView((View) objB);
            }
        }
        Object objB2 = qqw.b(map, "CLICK_EVENT_LISTENER", null);
        if (objB2 instanceof View.OnClickListener) {
            getView().setOnClickListener((View.OnClickListener) objB2);
        }
    }

    private long c(long j) {
        return j >= lsl.a(j, 20, 0) ? lsl.w(j) : j;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionSleepBreatheBanner";
    }
}
